/**
 * @author Jakub Augustýn <kubik.augustyn@post.cz>
 * @copyright Jakub Augustýn <kubik.augustyn@post.cz>
 * @home https://jakub-augustyn.web.app/
 */

import {copyToClipboardButton, createElement, downloadCanvasButton, toggleButton} from "../utils.js";

const fileNameToMapID = new Map([
    ["w0.bin", "angkor"],
    ["w1.bin", "bavaria"],
    ["w2.bin", "siberia"],
])
const mapIDToBlocksFileName = new Map([
    ["angkor", "0.f"],
    ["bavaria", "1.f"],
    ["siberia", "2.f"],
])

class Stage {
    /**
     * @readonly
     * @type {number}
     */
    width
    /**
     * @readonly
     * @type {number}
     */
    height
    /**
     * @readonly
     * @type {Uint8Array}
     */
    backgroundLayer
    /**
     * @readonly
     * @type {Uint8Array}
     */
    playerLayer
    /**
     * @readonly
     * @type {Uint8Array}
     */
    foregroundLayer

    /**
     * @param width {number}
     * @param height {number}
     * @param backgroundLayer {Uint8Array}
     * @param playerLayer {Uint8Array}
     * @param foregroundLayer {Uint8Array}
     */
    constructor(width, height, backgroundLayer, playerLayer, foregroundLayer) {
        if (backgroundLayer.length !== width * height || playerLayer.length !== width * height || foregroundLayer.length !== width * height)
            throw new Error("Invalid layer length")

        this.width = width
        this.height = height
        this.backgroundLayer = backgroundLayer
        this.playerLayer = playerLayer
        this.foregroundLayer = foregroundLayer
    }

    /**
     * @param x {number}
     * @param y {number}
     * @return {{background: number, foreground: number, player: number}}
     */
    getBlock(x, y) {
        if (x < 0 || x >= this.width) throw new Error("Block X out of bounds")
        if (y < 0 || y >= this.height) throw new Error("Block Y out of bounds")
        const index = x + y * this.width

        return {
            background: this.backgroundLayer[index],
            player: this.playerLayer[index],
            foreground: this.foregroundLayer[index],
        }
    }

    /**
     * @param scale {number}
     * @return {HTMLCanvasElement}
     */
    renderNumbers(scale) {
        var canvas = document.createElement("canvas")
        var s = scale // Scale
        var bs = 24 * s // Block size
        canvas.width = bs * this.width
        canvas.height = bs * this.height
        var ctx = canvas.getContext("2d")

        for (let y = 0; y < this.height; y++) {
            for (let x = 0; x < this.width; x++) {
                const block = this.getBlock(x, y)
                var bx = x * bs // Block X
                var by = y * bs // Block Y
                ctx.fillStyle = "white"

                if (block.player === 255)
                    ctx.fillStyle = (block.foreground >= 80 && block.foreground <= 146) ?
                        "#0F0" :
                        "green"
                else if (block.player === 10)
                    ctx.fillStyle = "lightgreen"
                else if (block.player === 0)
                    ctx.fillStyle = "gray"
                else if (block.player === 1)
                    ctx.fillStyle = "#F0F"
                else if (block.player >= 80 && block.player <= 146)
                    ctx.fillStyle = "yellow"

                ctx.fillRect(bx, by, bs, bs)
                ctx.rect(bx, by, bs, bs)

                ctx.fillStyle = "black"
                ctx.font = `${6 * s}px Arial`
                ctx.textBaseline = "top"
                ctx.fillText(block.background.toString().padStart(3, ""), bx + s, by + s, bs)
                ctx.fillText(block.player.toString().padStart(3, ""), bx + s, by + 9 * s, bs)
                ctx.fillText(block.foreground.toString().padStart(3, ""), bx + s, by + 17 * s, bs)
            }
        }
        ctx.strokeStyle = "black"
        ctx.stroke()

        return canvas
    }

    /**
     * @param scale {number}
     * @param blocksFileChunks {FileChunk[]|null}
     * @param cm {FileChunk[]|null}
     * @param gen0 {FileChunk[]|null}
     * @param gen1 {FileChunk[]|null}
     * @param gen2 {FileChunk[]|null}
     * @param gen3 {FileChunk[]|null}
     * @param gen4 {FileChunk[]|null}
     * @param mmv {FileChunk[]|null}
     * @param b0 {FileChunk[]|null}
     * @param worldIndex {0|1|2}
     * @param config {TParseConfig|null}
     * @returns {HTMLCanvasElement}
     */
    async render(scale, blocksFileChunks, {cm, gen0, gen1, gen2, gen3, gen4, mmv, b0}, worldIndex, config = null) {
        const canvas = document.createElement("canvas")
        const engine = new CanvasEngine2D({
            canvas: canvas,
            appName: "diamondRush-browser-all_files_new-utils-renderCanvasEngine2DImage",
            imageW: this.width * 24,
            imageH: this.height * 24,
            backgroundColor: CanvasEngine2DVariables.COLORS.BLACK,
            scale
        })
        config = config || {
            stages_render_background: true,
            stages_render_player: true,
            stages_render_foreground: true,
            stages_render_special: true,
            stages_render_chest_contents: true,
            stages_render_unknown: true,
            stages_render_pot_fan_air: true
        }

        /**
         * Gets a module from a file's chunk.
         * @param file {FileChunk[]|null}
         * @param chunkI {number}
         * @param moduleI {number}
         * @param paletteI {number}
         * @return {Promise<CanvasEngine2DImageData|null>}
         */
        async function getModule(file, chunkI, moduleI, paletteI) {
            if (file === null) return null
            const sprite = (await file[chunkI].parse()).data.sprite
            return sprite.modules[moduleI].getParsedData(paletteI)
        }

        /**
         * Gets a frame from a file's chunk.
         * @param file {FileChunk[]|null}
         * @param chunkI {number}
         * @param frameI {number}
         * @param paletteI {number}
         * @return {Promise<CanvasEngine2DImageData|null>}
         */
        async function getFrame(file, chunkI, frameI, paletteI) {
            if (file === null) return null
            const sprite = (await file[chunkI].parse()).data.sprite
            return sprite.frames[frameI].getParsedData(paletteI)
        }

        const backgroundTile = await getModule(blocksFileChunks, 3, 0, 0)

        const boulderTile = await getModule(blocksFileChunks, 0, 0, 0)

        const leafTile = await getModule(blocksFileChunks, 1, 0, 0)

        const wallTilesSprite = (await blocksFileChunks[2].parse()).data.sprite
        // playerLayerNumber : index
        // 81: 1
        // 90: 10
        // 94: 14
        // 104: 24
        // 110: 30
        // 111: 31
        // 113: 33
        const wallTiles = Object.fromEntries(
            new Array(wallTilesSprite.frames.length)
                .fill(0)
                .map((_, index) =>
                    [80 + index, wallTilesSprite.frames[index].getParsedData(0)]
                )
        )

        const checkpointTile = await getFrame(cm, 6, 0, 0)

        const gemVioletTile = await getFrame(cm, 2, 0, 0),
            gemRedTile = await getFrame(cm, 2, 0, 1)

        const snakeNormalDownTile = worldIndex === 0 ?
            await getFrame(gen1, 5, 6, 0) :
            worldIndex === 1 ?
                await getFrame(gen1, 7, 0, 0) :
                await getFrame(gen1, 5, 6, 2)
        const snakeRedDownTile = worldIndex === 0 ?
            await getFrame(gen1, 5, 6, 1) :
            await getFrame(gen1, 7, 0, 1)
        const snakeNormalRightTile = worldIndex === 0 ?
            await getFrame(gen1, 5, 15, 0) :
            worldIndex === 1 ?
                await getFrame(gen1, 7, 0, 0) :
                await getFrame(gen1, 5, 15, 2)
        const snakeRedRightTile = worldIndex === 0 ?
            await getFrame(gen1, 5, 15, 1) :
            await getFrame(gen1, 7, 0, 1)

        const fireSpitterLeftTile = await getFrame(gen0, 9, 0, 0),
            fireSpitterRightTile = await getFrame(gen0, 9, 1, 0)

        const beansTile = await getModule(gen0, 7, 0, worldIndex === 2 ? 1 : 0)

        const pressurePlateTile = await getModule(gen2, 9, 0, 0)

        const mysticMalletTile = await getModule(gen1, 9, 0, 0),
            grippingHookTile = await getModule(gen1, 9, 1, 0),
            freezeMalletTile = await getModule(gen1, 9, 2, 0)

        const exitLeftTile = await getModule(cm, 0, 1, 0),
            exitRightTile = await getModule(cm, 0, 0, 0)

        const magicPadlockTile = await getFrame(cm, 5, 0, 0)

        const doorHeadTile = await getFrame(cm, 1, 0, worldIndex),
            doorBottomTile = await getFrame(cm, 1, 3, worldIndex)

        const decoration2x2 = worldIndex === 0 ?
            [
                [await getFrame(gen0, 4, 0, 0), await getFrame(gen0, 4, 2, 0)],
                [await getFrame(gen0, 4, 4, 0), await getFrame(gen0, 4, 6, 0)]
            ] :
            worldIndex === 1 ?
                [
                    [await getFrame(gen2, 1, 4, 0), await getFrame(gen2, 1, 6, 0)],
                    [await getFrame(gen2, 1, 0, 0), await getFrame(gen2, 1, 2, 0)]
                ] :
                [
                    [magicPadlockTile, magicPadlockTile],
                    [magicPadlockTile, magicPadlockTile]
                ]

        const chestRedTile = await getFrame(gen2, 2, 0, 0)
        const chestBrownTile = await getFrame(gen3, 3, 0, 0)

        const goldKeyTile = await getModule(gen0, 2, 0, 0),
            silverKeyTile = await getModule(gen0, 2, 0, 1)

        const oneUpTile = await getModule(cm, 4, 0, 0),
            revivePotionTile = await getModule(cm, 4, 1, 0)

        const goldKeyholeTile = await getFrame(gen2, 8, 0, 0),
            silverKeyholeTile = await getFrame(gen2, 8, 0, 1)

        const fireballTile = await getModule(gen1, 4, 0, 0)

        const fireCrystalTile = await getFrame(mmv, 3, 0, 0)
        const silverDiamondTile = await getFrame(mmv, 2, 0, 0)
        const iceCrystalTile = await getFrame(mmv, 1, 0, 0)

        const greatAnacondaHeadTile = await getFrame(b0, 0, 6, 0)
        const greatAnacondaBlockUpTile = await getFrame(b0, 1, 0, 0),
            greatAnacondaBlockDownTile = await getFrame(b0, 1, 1, 0)

        const compassTile = await getModule(gen3, 1, 0, 0)

        const spikeTileTopHead = await getFrame(gen1, 1, 0, 0),
            spikeTileTopStick = await getFrame(gen1, 1, 1, 0),
            spikeTileBottomHead = await getFrame(gen1, 1, 3, 0),
            spikeTileBottomStick = await getFrame(gen1, 1, 2, 0)

        const knightRight = await getFrame(gen1, 3, 0, 0),
            knightLeft = await getFrame(gen1, 3, 1, 0)

        const spikeBall = await getModule(gen1, 2, 2, 0)

        const trapdoorRed = await getFrame(gen2, 4, 4, 0),
            trapdoorBlue = await getFrame(gen2, 4, 0, 1),
            trapdoorSwitch = await getFrame(gen3, 9, 0, 0)

        const torchUnlit = await getFrame(gen0, 8, 0, 0),
            torchLit = await getFrame(gen0, 8, 1, 0)

        const bomb = await getFrame(gen0, 5, 0, 0),
            bombCloth = await getModule(gen2, 5, 0, 0)

        const sewer = await getFrame(gen0, 6, 0, 0)

        const icicle = await getFrame(gen3, 4, 0, 0),
            icicleBroken = await getFrame(gen3, 4, 3, 0)

        const turtleDownTile = await getFrame(gen4, 1, 5, 0),
            turtleUpTile = await getFrame(gen4, 1, 1, 0)

        const monkeyTile = await getFrame(gen3, 5, 1, 0)

        const waspTile = await getFrame(gen3, 7, 12, 0)

        const fanPot = await getFrame(gen2, 3, 0, 0),
            fanPotAir = await getFrame(gen2, 3, 5, 0)

        const iceLaserShooterLeft = await getFrame(gen3, 2, 0, 0),
            iceLaserShooterRight = await getFrame(gen3, 2, 1, 0)

        // For anyone who has to read through this massive code: I'M VERY SORRY
        // I know I shouldn't copy-paste the text rendering code
        // I know it's big/too long
        // Again, I'm sorry

        const mapHasSpawnPoint = this.playerLayer.includes(79)
        for (let y = 0; y < this.height; y++) {
            const blockY = y * 24
            for (let x = 0; x < this.width; x++) {
                const block = this.getBlock(x, y)
                const blockX = x * 24
                let dX1 = 0, dY1 = 0, dX2 = 0, dY2 = 0, dX3 = 0, dY3 = 0

                let backgroundData, playerData, foregroundData
                let unknown = false

                switch (block.background) {
                    case 99:
                    case 255:
                        backgroundData = backgroundTile
                        break
                    default:
                        unknown = true
                }
                switch (block.player) {
                    case 0:
                        playerData = boulderTile
                        break
                    case 1:
                        playerData = gemVioletTile
                        break
                    case 8:
                        playerData = bomb
                        break
                    case 10:
                        playerData = leafTile
                        break
                    case 11:
                        playerData = fireballTile
                        break
                    case 18:
                        playerData = trapdoorSwitch
                        break
                    case 22:
                        playerData = fireSpitterRightTile
                        break
                    case 23:
                        playerData = fireSpitterLeftTile
                        break
                    case 30:
                        playerData = beansTile
                        break
                    case 34:
                        playerData = trapdoorBlue
                        break
                    case 35:
                        playerData = trapdoorRed
                        break
                    case 37:
                        playerData = bombCloth
                        break
                    case 44:
                        playerData = icicle
                        break
                    case 45:
                        playerData = monkeyTile
                        dX2 = Math.floor(-(playerData.width - 24) / 2)
                        dY2 = Math.floor(-(playerData.height - 24) / 2)
                        break
                    case 46:
                        playerData = waspTile
                        dX2 = Math.floor(-(playerData.width - 24) / 2)
                        dY2 = Math.floor(-(playerData.height - 24) / 2)
                        break
                    case 47:
                        playerData = fanPot
                        if (config.stages_render_pot_fan_air)
                            for (let i = 1; i < 10; i++) {
                                if (y - i < 0) break
                                const block = this.getBlock(x, y - i)
                                if (wallTiles.hasOwnProperty(block.player)) break
                                if ([10, 18, 22, 23, 30, 34, 35, 37, 44, 79].includes(block.player)) break
                                engine.addElement(
                                    engine.createImage("background", fanPotAir),
                                    blockX + 2, blockY - 24 * i, 0
                                )
                            }
                        break
                    case 79:
                        // Special case: spawn point
                        backgroundData = backgroundTile
                        if (block.foreground !== 4) config.stages_render_special && engine.addElement(
                            engine.createText("foreground", "SPP", "#F00", "13px monospace"),
                            blockX + 1, blockY + 16, 2
                        )
                        config.stages_render_special && engine.addElement(engine.createImage("foreground", doorHeadTile), blockX - 48, blockY - 24, 2)
                        config.stages_render_special && engine.addElement(engine.createImage("foreground", doorBottomTile), blockX - 48, blockY, 2)
                        break
                    case 255:
                        break
                    default:
                        if (wallTiles.hasOwnProperty(block.player))
                            playerData = wallTiles[block.player]
                        else unknown = true
                }
                switch (block.foreground) {
                    case 20:
                        foregroundData = decoration2x2[0][0]
                        break
                    case 21:
                        foregroundData = decoration2x2[0][1]
                        break
                    case 22:
                        foregroundData = decoration2x2[1][0]
                        break
                    case 23:
                        foregroundData = decoration2x2[1][1]
                        break
                    case 34:
                        playerData = icicleBroken
                        break
                    case 255:
                        break
                    default:
                        if (wallTiles.hasOwnProperty(block.foreground)) {
                            foregroundData = wallTiles[block.foreground]
                            if (worldIndex === 0 && block.foreground === 117) {
                                dX3 = 9
                                dY3 = 2
                            }
                            else if (worldIndex === 0 && block.foreground === 118)
                                dY3 = 1
                            else if (worldIndex === 1 && block.foreground === 117) {
                                dY3 = 4
                            }
                            else if (worldIndex === 1 && block.foreground === 120) {
                                dX3 = 2
                                dY3 = 4
                            }
                            else if (worldIndex === 1 && (block.foreground === 139 || block.foreground === 140)) {
                                dX3 = 1
                            }
                            else if (worldIndex === 1 && block.foreground === 121) {
                                dX3 = 2
                            }
                            else if (worldIndex === 1 && block.foreground === 122) {
                                dY3 = 2
                            }
                        }
                        else unknown = true
                }

                if (!config.stages_render_special) {
                    // NOOP
                }
                else if (block.foreground === 4) {
                    // Special case: checkpoint
                    const checkpointIndex = block.background
                    // console.log("Checkpoint", checkpointIndex, block)
                    backgroundData = backgroundTile ///???
                    playerData = checkpointTile

                    if (checkpointIndex === 0 && !mapHasSpawnPoint) {
                        engine.addElement(engine.createImage("foreground", doorHeadTile), blockX - 48, blockY - 24, 2)
                        engine.addElement(engine.createImage("foreground", doorBottomTile), blockX - 48, blockY, 2)
                    }
                    engine.addElement(
                        engine.createText("foreground", checkpointIndex.toString(), "#ff0000", "13px monospace"),
                        blockX + 8, blockY + 16, 2
                    )
                }
                else if (block.player === 43 && block.background === 0) {
                    // Special case: the great anaconda
                    backgroundData = backgroundTile ///???
                    playerData = null
                    engine.addElement(
                        engine.createImage("foreground+1", greatAnacondaHeadTile),
                        blockX - Math.floor((greatAnacondaHeadTile.width - 24) / 2), blockY - Math.floor((greatAnacondaHeadTile.height - 24) / 2), 3
                    )
                    engine.addElement(
                        engine.createImage("player", greatAnacondaBlockDownTile),
                        blockX + 24 * 9, blockY - 24 * 3, 1
                    )
                    engine.addElement(
                        engine.createImage("player", greatAnacondaBlockDownTile),
                        blockX + 24 * 12, blockY - 24 * 3, 1
                    )
                    engine.addElement(
                        engine.createImage("player", greatAnacondaBlockDownTile),
                        blockX + 24 * 15, blockY - 24 * 3, 1
                    )
                    engine.addElement(
                        engine.createImage("player", greatAnacondaBlockUpTile),
                        blockX + 24 * 9, blockY - 24 * 9, 1
                    )
                    engine.addElement(
                        engine.createImage("player", greatAnacondaBlockUpTile),
                        blockX + 24 * 12, blockY - 24 * 9, 1
                    )
                    engine.addElement(
                        engine.createImage("player", greatAnacondaBlockUpTile),
                        blockX + 24 * 15, blockY - 24 * 9, 1
                    )
                }
                else if (block.player === 19 || block.player === 43) {
                    // Special case: snake || red snake
                    // FIXME Show the real snake orientation, not just vertical/horizontal
                    const vertical = block.background === 1 || block.background === 3
                    const isRed = block.player === 43
                    // console.log("Snake:", vertical, isRed, block)
                    backgroundData = backgroundTile ///???
                    if (vertical)
                        playerData = isRed ? snakeRedDownTile : snakeNormalDownTile
                    else
                        playerData = isRed ? snakeRedRightTile : snakeNormalRightTile
                    dX2 = Math.floor(-(playerData.width - 24) / 2)
                    dY2 = Math.floor(-(playerData.height - 24) / 2)
                    if (worldIndex !== 1 && vertical)
                        dY2 *= 2 // * 2 because of the long snake's tail
                    if (worldIndex === 1) engine.addElement(
                        engine.createText("foreground", vertical ? "V" : "H", isRed ? "#FF0" : "#F00", "13px monospace"),
                        blockX + 8, blockY + 16, 2
                    )
                }
                else if (block.foreground === 6) {
                    // Special case: pressure plate
                    const doorIndex = block.background
                    // console.log("Pressure plate:", doorID, block)
                    backgroundData = backgroundTile ///???
                    playerData = pressurePlateTile
                    dY2 = 12
                    engine.addElement(
                        engine.createText("foreground", doorIndex.toString(), "#F00", "13px monospace"),
                        blockX + (doorIndex < 10 ? 8 : 1), blockY + 11, 2
                    )
                }
                else if (block.foreground === 2) {
                    // Special case: hint
                    const hintID = block.background
                    backgroundData = backgroundTile ///???
                    playerData = hintID === 0 ?
                        mysticMalletTile :
                        hintID === 1 ?
                            grippingHookTile :
                            hintID === 2 ? // ???
                                freezeMalletTile :
                                (console.error("Unknown hint ID:", hintID), null)
                }
                else if (block.foreground === 5 || block.foreground === 28) {
                    // Special case: exit || secret exit
                    const isSecret = block.foreground === 28
                    const exitDirectionRight = block.background === 2
                    backgroundData = backgroundTile ///???
                    playerData = exitDirectionRight ?
                        exitRightTile :
                        exitLeftTile
                    if (isSecret) engine.addElement(
                        engine.createText("foreground", "SECRET", "#0FF", "10px monospace"),
                        blockX + 24, blockY + 14, 2
                    )
                }
                else if (block.player === 12) {
                    // Special case: magic padlock
                    const purpleGemCount = block.background
                    backgroundData = backgroundTile ///???
                    playerData = magicPadlockTile
                    engine.addElement(
                        engine.createText("foreground", purpleGemCount.toString(), "#F00", "13px monospace"),
                        blockX + 2, blockY + 20, 2
                    )
                }
                else if (block.foreground === 33 || block.foreground === 14) {
                    // Special case: chest || red chest
                    const contents = block.player
                    const isRed = block.foreground === 14
                    backgroundData = backgroundTile
                    foregroundData = isRed ? chestRedTile : chestBrownTile
                    dY3 = 2
                    // console.warn("Chest:", contents)

                    if (config.stages_render_chest_contents) {
                        if (contents === 2)
                            engine.addElement(
                                engine.createImage("foreground+1", gemRedTile),
                                blockX, blockY - 6, 3
                            )
                        else if (contents === 4 || contents === 5)
                            engine.addElement(
                                engine.createImage("foreground+1", contents === 4 ? goldKeyTile : silverKeyTile),
                                blockX + 1, blockY - 3, 3
                            )
                        else if (contents === 6) {
                            engine.addElement(
                                engine.createImage("foreground+1", oneUpTile),
                                blockX, blockY - 6, 3
                            )
                        }
                        else if (contents === 7 || contents === 41) {
                            const gemVioletAmount = contents === 7 ?
                                10 :
                                block.background
                            engine.addElement(
                                engine.createImage("foreground+1", gemVioletTile),
                                blockX, blockY - 6, 3
                            )
                            engine.addElement(
                                engine.createText("foreground+1", gemVioletAmount.toString(), "#0FF", "13px monospace"),
                                blockX + 5, blockY + 10, 3
                            )
                        }
                        else if (contents === 24)
                            engine.addElement(
                                engine.createImage("foreground+1", mysticMalletTile),
                                blockX, blockY - 6, 3
                            )
                        else if (contents === 26)
                            engine.addElement(
                                engine.createImage("foreground+1", freezeMalletTile),
                                blockX, blockY - 6, 3
                            )
                        else if (contents === 27)
                            engine.addElement(
                                engine.createImage("foreground+1", grippingHookTile),
                                blockX, blockY - 3, 3
                            )
                        else if (contents === 51)
                            engine.addElement(
                                engine.createImage("foreground+1", silverDiamondTile),
                                blockX - 2, blockY - 8, 3
                            )
                        else if (contents === 52)
                            engine.addElement(
                                engine.createImage("foreground+1", iceCrystalTile),
                                blockX - 2, blockY - 8, 3
                            )
                        else if (contents === 53)
                            engine.addElement(
                                engine.createImage("foreground+1", fireCrystalTile),
                                blockX - 2, blockY - 8, 3
                            )
                        else if (contents === 42)
                            engine.addElement(
                                engine.createImage("foreground+1", compassTile),
                                blockX, blockY - 8, 3
                            )
                        else {
                            engine.addElement(
                                engine.createText("foreground+1", "???", "#F00", "13px monospace"),
                                blockX + 1, blockY + 20, 3
                            )
                            console.log("Unknown chest contents:", contents, isRed ? "red" : "normal", block)
                        }
                    }
                }
                else if (/*block.player === 31 && */(block.foreground === 8 || block.foreground === 9)) {
                    // Special case: keyhole
                    const doorIndex = block.background
                    const isGold = block.foreground === 9
                    backgroundData = backgroundTile ///???
                    playerData = isGold ? goldKeyholeTile : silverKeyholeTile
                    engine.addElement(
                        engine.createText("foreground", doorIndex.toString(), "#F00", "13px monospace"),
                        blockX + (doorIndex < 10 ? 8 : 1), blockY + 16, 2
                    )
                }
                else if (block.foreground === 17) {
                    // Special case: defeat everyone label
                    const defeatEveryoneIndex = block.background
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "DEL", "#FFF", "13px monospace"),
                        blockX + 2, blockY + 11, 2
                    )
                    engine.addElement(
                        engine.createText("foreground", defeatEveryoneIndex.toString(), "#FFF", "13px monospace"),
                        blockX + (defeatEveryoneIndex < 10 ? 8 : 1), blockY + 21, 2
                    )
                }
                else if (block.foreground === 26) {
                    // Special case: defeat everyone trigger
                    const defeatEveryoneIndex = block.background
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "DET", "#FFF", "13px monospace"),
                        blockX + 2, blockY + 11, 2
                    )
                    engine.addElement(
                        engine.createText("foreground", defeatEveryoneIndex.toString(), "#FFF", "13px monospace"),
                        blockX + (defeatEveryoneIndex < 10 ? 8 : 1), blockY + 21, 2
                    )
                }
                else if (block.background === 30 && block.foreground === 0) {
                    // Special case: text #89 and #90
                    // const unknown = block.foreground
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "TX1", "#FFF", "13px monospace"),
                        blockX + 2, blockY + 16, 2
                    )
                    /*engine.addElement(
                        engine.createText("foreground", unknown.toString(), "#FFF", "13px monospace"),
                        blockX + (unknown < 10 ? 8 : 1), blockY + 21, 2
                    )*/
                }
                else if (block.foreground === 7) {
                    // Special case: door bottom
                    const doorIndex = block.background
                    backgroundData = backgroundTile ///???
                    playerData = doorBottomTile
                    engine.addElement(
                        engine.createText("foreground", doorIndex.toString(), "#F00", "13px monospace"),
                        blockX + (doorIndex < 10 ? 8 : 1), blockY + 16, 2
                    )
                    y > 0 && ![8, 9].includes(this.getBlock(x, y - 1).foreground) && engine.addElement(engine.createImage("foreground", doorHeadTile), blockX, blockY - 24, 2)
                }
                else if (block.foreground === 1) {
                    // Special case: shake up and down animation
                    engine.addElement(
                        engine.createText("foreground", "SHK", "#F00", "13px monospace"),
                        blockX + 1, blockY + 16, 2
                    )
                }
                else if (block.background === 3 && block.foreground === 0) {
                    // Special case: fire statues fall animation
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "FSF", "#F00", "13px monospace"),
                        blockX + 1, blockY + 16, 2
                    )
                }
                else if (block.player === 79) {
                    // Special case: spawn point
                    // Moved to the switch above
                }
                else if (block.background === 33 && block.foreground === 0) {
                    // Special case: text #106 and #107
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "TX2", "#FFF", "13px monospace"),
                        blockX + 2, blockY + 16, 2
                    )
                }
                else if (block.background === 29 && block.foreground === 0) {
                    // Special case: text #84 and #85 and #86
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "TX3", "#FFF", "13px monospace"),
                        blockX + 2, blockY + 16, 2
                    )
                }
                else if (block.background === 10 && block.foreground === 0) {
                    // Special case: text #80
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "TX4", "#FFF", "13px monospace"),
                        blockX + 2, blockY + 16, 2
                    )
                }
                else if (block.background === 13 && block.foreground === 0) {
                    // Special case: text #81 and #92 and #103 and #113
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "TX5", "#FFF", "13px monospace"),
                        blockX + 2, blockY + 16, 2
                    )
                }
                else if (block.background === 16 && block.foreground === 0) {
                    // Special case: text #114 and #115 and #116 and #117
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "TX6", "#FFF", "13px monospace"),
                        blockX + 2, blockY + 16, 2
                    )
                }
                else if (block.background === 28 && block.foreground === 0) {
                    // Special case: text #118 and #82 and #83 and #117
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "TX7", "#FFF", "13px monospace"),
                        blockX + 2, blockY + 16, 2
                    )
                }
                else if (block.background === 34 && block.foreground === 0) {
                    // Special case: text #108 and #109 and #110
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "TX8", "#FFF", "13px monospace"),
                        blockX + 2, blockY + 16, 2
                    )
                }
                else if (block.background === 35 && block.foreground === 0) {
                    // Special case: text #111 and #112 and #110
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "TX9", "#FFF", "13px monospace"),
                        blockX + 2, blockY + 16, 2
                    )
                }
                else if (block.player === 28) {
                    // Special case: spike
                    const isFacingDown = [3, 33].includes(block.background)
                    backgroundData = backgroundTile
                    playerData = isFacingDown ? spikeTileTopStick : spikeTileBottomStick
                    dX2 = 5
                    engine.addElement(
                        engine.createImage("player", isFacingDown ? spikeTileTopHead : spikeTileBottomHead),
                        blockX + 2, blockY + 24 * (isFacingDown ? 1 : -1), 2
                    )
                    engine.addElement(
                        engine.createText("foreground", block.background.toString(), "#0FF", "13px monospace"),
                        blockX + (block.background < 10 ? 8 : 1), blockY + 16, 2
                    )
                }
                else if (block.player === 16 && (block.background === 2 || block.background === 4)) {
                    // Special case: knight
                    const isFacingLeft = block.background === 4
                    backgroundData = backgroundTile
                    playerData = isFacingLeft ? knightLeft : knightRight
                    dY2 = -24
                    if (isFacingLeft)
                        dX2 = -4
                    else
                        dX2 = -6
                }
                else if (block.player === 14 && (block.background === 2 || block.background === 4 || block.background === 255)) {
                    // Special case: spike ball
                    const isFacingLeft = block.background === 4
                    backgroundData = backgroundTile
                    playerData = spikeBall
                    engine.addElement(
                        engine.createText("foreground", isFacingLeft ? "L" : "R", "#FF0", "13px monospace"),
                        blockX + 8, blockY + 16, 2
                    )
                }
                else if ((block.background === 4 || block.background === 6 || block.background === 19) && block.foreground === 0) {
                    // Special case: scene overview animation (bavaria stage 4, X20 Y16) || (bavaria stage 9, X30 Y10) || (bavaria secret stage 3, X6 Y47)
                    backgroundData = backgroundTile
                    engine.addElement(
                        engine.createText("foreground", "SOA", "#F00", "13px monospace"),
                        blockX + 1, blockY + 16, 2
                    )
                }
                else if (block.player === 36 && (block.background === 0 || block.background === 255)) {
                    // Special case: torch
                    const unlit = [0, 255].includes(block.background)
                    backgroundData = backgroundTile
                    playerData = unlit ? torchUnlit : torchLit
                    dY2 = unlit ? -10 : -22
                }
                else if (block.player === 38) {
                    // Special case: sewer
                    const waterBlocks = block.background
                    backgroundData = backgroundTile
                    playerData = sewer
                    engine.addElement(
                        engine.createText("foreground", waterBlocks.toString(), "#0FF", "13px monospace"),
                        blockX + (waterBlocks < 10 ? 8 : 1), blockY + 16, 2
                    )
                }
                else if (block.player === 33) {
                    // Special case: fireball stopper
                    playerData = null
                    engine.addElement(
                        engine.createText("foreground", "NFB", "#0FF", "13px monospace"),
                        blockX + 1, blockY + 16, 2
                    )
                }
                else if (block.player === 31) {
                    // Special case: player stopper
                    playerData = null
                    engine.addElement(
                        engine.createText("foreground", "NPB", "#0FF", "13px monospace"),
                        blockX + 1, blockY + 16, 2
                    )
                }
                else if (block.player === 49) {
                    // Special case: turtle
                    const direction = block.background
                    // console.log("Turtle:", vertical, block)
                    backgroundData = backgroundTile ///???
                    if (direction === 1)
                        playerData = turtleDownTile ///???
                    else if (direction === 3)
                        playerData = turtleUpTile ///???
                    else playerData = turtleUpTile
                    dX2 = Math.floor(-(playerData.width - 24) / 2)
                    dY2 = Math.floor(-(playerData.height - 24) / 2)
                    if (direction === 2 || direction === 4) engine.addElement(
                        engine.createText("foreground", direction === 2 ? "L" : "R", "#FF0", "13px monospace"),
                        blockX + 8, blockY + 16, 2
                    )
                }
                else if (block.player === 45) {
                    // Special case: monkey
                    // Moved to switch block.player
                }
                else if (block.player === 48 && (block.background === 2 || block.background === 4 || block.background === 255)) {
                    // Special case: ice laser shooter
                    const isFacingLeft = block.background === 4
                    backgroundData = backgroundTile
                    playerData = isFacingLeft ? iceLaserShooterLeft : iceLaserShooterRight
                    dY2 = -23
                }
                else if (unknown) {
                    console.warn("Unknown block layer configuration:", x, y, block)
                    config.stages_render_unknown && engine.addElement(
                        engine.createText("foreground", "???", "#F00", "13px monospace"),
                        blockX + 1, blockY + 16, 2
                    )
                }

                // if (!backgroundData && !playerData && !foregroundData)
                //     console.warn("Unknown block layer configuration:", x, y, block)

                if (backgroundData && config.stages_render_background)
                    engine.addElement(engine.createImage("background", backgroundData), blockX + dX1, blockY + dY1, 0)
                if (playerData && config.stages_render_player)
                    engine.addElement(engine.createImage("player", playerData), blockX + dX2, blockY + dY2, 1)
                if (foregroundData && config.stages_render_foreground)
                    engine.addElement(engine.createImage("foreground", foregroundData), blockX + dX3, blockY + dY3, 2)
            }
        }

        engine.render()
        return canvas
    }
}

/**
 * @param chunk {FileChunk}
 * @return {Promise<TParsedDataData>}
 */
export async function parse(chunk) {
    const mapID = fileNameToMapID.get(chunk.file.fileName) || "angkor"

    const dataView = new DataView(chunk.data)
    let ptr = 0

    if (dataView.getUint8(ptr++) !== 0x01)
        throw new Error(`File magic mismatch, got 0x${dataView.getUint8(ptr - 1)}, but expected 0x01`)

    const stageCount = dataView.getUint8(ptr++)
    /** @type {Stage[]} */
    const stages = new Array(stageCount)
    for (let i = 0; i < stageCount; i++) {
        const width = dataView.getUint16(ptr, true)
        ptr += 2
        const height = dataView.getUint16(ptr, true)
        ptr += 2

        const playerLayer = new Uint8Array(dataView.buffer.slice(ptr, ptr + width * height))
        ptr += width * height
        const backgroundLayer = new Uint8Array(dataView.buffer.slice(ptr, ptr + width * height))
        ptr += width * height
        const foregroundLayer = new Uint8Array(dataView.buffer.slice(ptr, ptr + width * height))
        ptr += width * height

        stages[i] = new Stage(width, height, backgroundLayer, playerLayer, foregroundLayer)
    }

    console.log("Stages:", stages)

    return {stages, mapID}
}

/**
 * @param chunk {FileChunk}
 * @param parsed {TParsedDataData}
 * @param config {TParseConfig}
 * @return {Promise<HTMLElement>}
 */
export async function render(chunk, parsed, config) {
    /** @type {Stage[]} */
    const stages = parsed.stages
    /** @type {string} */
    const mapID = parsed.mapID
    /** @type {0|1|2} */
    const worldIndex = mapID === "angkor" ? 0 : (mapID === "bavaria" ? 1 : 2)

    /** @type {FileChunk[]|null} */
    const blocksFileChunks = await config.parseOtherFile(mapIDToBlocksFileName.get(mapID))
    /** @type {FileChunk[]|null} */
    const cm = await config.parseOtherFile("cm.f"),
        gen0 = await config.parseOtherFile("gen0.f"),
        gen1 = await config.parseOtherFile("gen1.f"),
        gen2 = await config.parseOtherFile("gen2.f"),
        gen3 = await config.parseOtherFile("gen3.f"),
        gen4 = (mapID === "siberia" ? await config.parseOtherFile("gen4.f") : null),
        mmv = await config.parseOtherFile("mmv.f"),
        b0 = (mapID === "angkor" ? await config.parseOtherFile("b0.f") : null)

    const stageDivs = []
    for (let i = 0; i < stages.length; i++) {
        const stage = stages[i]

        const numbersCanvas = stage.renderNumbers(config.render_scale)
        const numbersDiv = createElement("div", [
            numbersCanvas,
            createElement("br"),
            downloadCanvasButton(numbersCanvas, `${mapID}-stage-${i}-numbers.png`)
        ])

        const fullRenderCanvas = blocksFileChunks ?
            await stage.render(config.render_scale, blocksFileChunks, {
                cm,
                gen0,
                gen1,
                gen2,
                gen3,
                gen4,
                mmv,
                b0
            }, worldIndex, config) :
            null
        const fullRenderDiv = fullRenderCanvas && createElement("div", [
            fullRenderCanvas,
            createElement("br"),
            downloadCanvasButton(fullRenderCanvas, `${mapID}-stage-${i}-full-render.png`)
        ])

        stageDivs.push(createElement("div", [
            createElement("h2", `Stage ${i + 1}`),
            toggleButton(numbersDiv, false, "Show numbers", "Hide numbers"),
            createElement("br"),
            numbersDiv,
            fullRenderDiv
        ], {"class": "stage"}))
    }

    return createElement("div", stageDivs, {"class": "stages"})
}
