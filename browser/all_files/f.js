var __author__ = "kubik.augustyn@post.cz"

class Graphics {
    drawRegion(...args) {
        console.log("Draw region", ...args)
    }

    // drawImage(img, x, y, anchor)
    drawImage(img, x, y, anchor) {
        console.log("Draw image", ...arguments)
        var image = img.toCanvasEngine2DImage()
        console.log(image)
        return image
    }
}

class RGBAImage {
    rgb
    width
    height
    processAlpha

    toCanvasEngine2DImage(id = "RGBAImage", engine) {
        var data = new Array(this.rgb.length * 4)
        for (var [i, val] of Object.entries(this.rgb)) {
            // val - 0xAARRGGBB
            var rI = i * 4
            data[rI] = (val >> 16) & 0xFF
            data[rI + 1] = (val >> 8) & 0xFF
            data[rI + 2] = val & 0xFF
            data[rI + 3] = (val >> 24) & 0xFF
        }
        var image = engine ? engine.createImage(id) : CanvasEngine2D.prototype.createImage(id)
        if (engine) engine.parseRGBAImageData(image, this.width, this.height, data, [])
        else CanvasEngine2D.prototype.parseRGBAImageData(image, this.width, this.height, data, [])
        return image
    }

    // createRGBImage(int[] rgb, int width, int height, boolean processAlpha)
    static createRGBImage(rgb, width, height, processAlpha) {
        // console.log("Create RGB image", rgb, width, height, processAlpha)
        var img = new RGBAImage()
        img.rgb = rgb
        img.width = width
        img.height = height
        img.processAlpha = processAlpha
        return img
    }
}

class f {
    static #aInt1D = new Array(4096); // int[4096]
    #fByte1D;
    #gByte1D;
    #bShort1D;
    aByte1D;
    #hByte1D;
    bByte1D;
    aShort1D;
    cByte1D;
    /**
     * Palette
     * @type {number[][]}
     */
    #aInt2D;
    #bInt;
    aInt;
    #aBoolean;
    #aShort;
    /**
     * Texture data
     * @type {number[]}
     */
    dByte1D;
    #cShort1D;
    aImage2D;
    static eByte1D;

    systemArrayCopy(src, srcPos, dest, destPos, length) {
        for (var i = 0; i < length; i++) {
            dest[destPos + i] = src[srcPos + i]
        }
    }

    /**
     * @param array {Array<number>}
     * @param n {number}
     */
    aByte1DAndIntReturnVoid(array, n) {
        try {
            n += 6
            var n2 = 6
            n++
            var n3 = array[n2] & 0xFF // I think int&0xFF is some trash but whatever
            var n4 = 7
            n++
            var n5
            if ((n5 = (n3 + ((array[n4] & 0xFF) << 8))) > 0) {
                this.systemArrayCopy(array, 8, this.#fByte1D = new Array(n5 << 1), 0, this.#fByte1D.length)
                n = 8 + this.#fByte1D.length
            }
            var n6
            if ((n6 = ((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                this.systemArrayCopy(array, n, this.#hByte1D = new Array(n6 << 2), 0, this.#hByte1D.length);
                n += this.#hByte1D.length;
            }
            var n7
            if ((n7 = ((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                this.#gByte1D = new Array(n7);
                this.#bShort1D = new Array(n7);
                for (var n8 = 0; n8 < n7; ++n8) {
                    this.#gByte1D[n8] = array[n++];
                    ++n;
                    this.#bShort1D[n8] = ((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
                }
                var n9 = n7 << 2;
                this.aByte1D = new Array(n9);
                for (var i = 0; i < n9; ++i) {
                    this.aByte1D[i] = array[n++];
                }
            }
            var n10
            if ((n10 = ((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                this.systemArrayCopy(array, n, this.cByte1D = new Array(n10 * 5), 0, this.cByte1D.length);
                n += this.cByte1D.length;
            }
            var n11;
            if ((n11 = ((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8))) > 0) {
                this.bByte1D = new Array(n11);
                this.aShort1D = new Array(n11);
                for (var n12 = 0; n12 < n11; ++n12) {
                    this.bByte1D[n12] = array[n++];
                    ++n;
                    this.aShort1D[n12] = ((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
                }
            }
            if (n5 <= 0) {
                return;
            }
            var n13 = ((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
            this.#bInt = (array[n++] & 0xFF);
            var n14 = array[n++] & 0xFF;
            this.#aInt2D = new Array(16); // WARNING: 2D array
            for (var j = 0; j < this.#bInt; ++j) {
                this.#aInt2D[j] = new Array(n14);
                switch (n13) {
                    case -30584: {
                        for (var k = 0; k < n14; ++k) {
                            var n15;
                            if (((n15 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8) + ((array[n++] & 0xFF) << 16) + ((array[n++] & 0xFF) << 24)) & 0xFF000000) !== 0xFF000000) {
                                this.#aBoolean = true;
                            }
                            this.#aInt2D[j][k] = n15;
                        }
                        break;
                    }
                    case 17476: {
                        for (var l = 0; l < n14; ++l) {
                            var n16;
                            if (((n16 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8)) & 0xF000) !== 0xF000) {
                                this.#aBoolean = true;
                            }
                            this.#aInt2D[j][l] = ((n16 & 0xF000) << 16 | (n16 & 0xF000) << 12 | (n16 & 0xF00) << 12 | (n16 & 0xF00) << 8 | (n16 & 0xF0) << 8 | (n16 & 0xF0) << 4 | (n16 & 0xF) << 4 | (n16 & 0xF));
                        }
                        break;
                    }
                    case 21781: {
                        for (var n17 = 0; n17 < n14; ++n17) {
                            var n18 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8);
                            var n19 = -16777216;
                            if ((n18 & 0x8000) !== 0x8000) {
                                n19 = 0;
                                this.#aBoolean = true;
                            }
                            this.#aInt2D[j][n17] = (n19 | (n18 & 0x7C00) << 9 | (n18 & 0x3E0) << 6 | (n18 & 0x1F) << 3);
                        }
                        break;
                    }
                    case 25861: {
                        for (var n20 = 0; n20 < n14; ++n20) {
                            var n21 = (array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8);
                            var n22 = -16777216;
                            if (n21 === 63519) {
                                n22 = 0;
                                this.#aBoolean = true;
                            }
                            this.#aInt2D[j][n20] = (n22 | (n21 & 0xF800) << 8 | (n21 & 0x7E0) << 5 | (n21 & 0x1F) << 3);
                        }
                        break;
                    }
                }
            }
            this.#aShort = ((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
            if (n5 > 0) {
                this.#cShort1D = new Array(n5);
                var n23 = 0;
                var n24 = n;
                for (var n25 = 0; n25 < n5; ++n25) {
                    var n26 = ((array[n24++] & 0xFF) + ((array[n24++] & 0xFF) << 8));
                    this.#cShort1D[n25] = n23;
                    n24 += n26;
                    n23 += n26;
                }
                this.dByte1D = new Array(n23);
                console.log(this.dByte1D, n5, this.#cShort1D)
                for (var n27 = 0; n27 < n5; ++n27) {
                    var n28 = ((array[n++] & 0xFF) + ((array[n++] & 0xFF) << 8));
                    this.systemArrayCopy(array, n, this.dByte1D, this.#cShort1D[n27] & 0xFFFF, n28);
                    console.log(array.slice(n,n+n28), n, this.dByte1D.slice(), this.#cShort1D[n27] & 0xFFFF, n28)
                    n += n28;
                }
                console.log(this.dByte1D)
            }
        } catch (ex) {
            console.error(ex)
        }
    }

    /**
     * @param a {number}
     * @param a2 {number}
     * @param n {number}
     * @param i {number}
     */
    aIntAndIntAndIntAndIntReturnVoid(a, a2, n, i) {
        if (this.#fByte1D == null) {
            return;
        }
        if (n === -1) {
            n = (this.#fByte1D.length >> 1) - 1;
        }
        if (this.aImage2D == null) {
            this.aImage2D = new Array(this.#bInt);
        }
        if (this.aImage2D[a] == null) {
            this.aImage2D[a] = new Array(this.#fByte1D.length >> 1);
        }
        a2 = this.aInt;
        this.aInt = a;
        var n2, n3, n4, a3, b, n5, j;
        for (i = 0; i <= n; ++i) {
            n2 = i << 1;
            n3 = (this.#fByte1D[n2] & 0xFF);
            n4 = (this.#fByte1D[n2 + 1] & 0xFF);
            if (n3 > 0 && n4 > 0 && (a3 = this.aIntReturnInt1D(i)) != null) {
                b = false;
                for (n5 = n3 * n4, j = 0; j < n5; ++j) {
                    if ((a3[j] & 0xFF000000) !== 0xFF000000) {
                        b = true;
                        break;
                    }
                }
                this.aImage2D[a][i] = RGBAImage.createRGBImage(a3, n3, n4, b);
            }
        }
        this.aInt = a2;
    }

    /**
     * @param i {number}
     */
    aIntReturnVoid(i) {
        if (this.#fByte1D == null) {
            return;
        }
        if (this.aImage2D == null) {
            return;
        }
        if (this.aImage2D[0] == null) {
            return;
        }
        for (i = 0; i < this.aImage2D[0].length; ++i) {
            this.aImage2D[0][i] = null;
        }
        this.aImage2D[0] = null;
        --this.#bInt;
    }

    toStringReturnString() {
        var i = 0;
        for (var j = 0; j < this.#fByte1D.length / 2; ++j) {
            i += 2 * (this.#fByte1D[j * 2] & 0xFF) * (this.#fByte1D[j * 2 + 1] & 0xFF);
        }
        return "raw/full: " + this.dByte1D.length + "/" + i;
    }

    /**
     * @param n {number}
     * @param n2 {number}
     * @return {number}
     */
    aIntAndIntReturnInt(n, n2) {
        return this.cByte1D[(this.aShort1D[n] + n2) * 5 + 1] & 0xFF;
    }

    /**
     * @param n {number}
     * @return {number}
     */
    aIntReturnInt(n) {
        return this.bByte1D[n] & 0xFF;
    }

    /**
     * @param graphics {Graphics}
     * @param n {number}
     * @param n2 {number}
     * @param n3 {number}
     * @param n4 {number}
     * @param n5 {number}
     * @param n6 {number}
     * @param n7 {number}
     */
    aGraphicsAndIntAndIntAndIntAndIntAndIntAndIntAndIntReturnVoid(graphics, n, n2, n3, n4, n5, n6, n7) {
        n = (this.aShort1D[n] + n2) * 5;
        n2 = (this.#cShort1D[n] & 0xFF);
        if ((n5 & 0x20) !== 0x0) {
            n6 = (((n5 & 0x1) !== 0x0) ? (0 + this.#cShort1D[n + 2]) : (0 - this.#cShort1D[n + 2]));
            n7 = (((n5 & 0x2) !== 0x0) ? (0 + this.#cShort1D[n + 3]) : (0 - this.#cShort1D[n + 3]));
        }
        this.aGraphicsAndIntAndIntAndIntAndIntReturnVoid(graphics, n2, n3 - n6, n4 - n7, n5 ^ (this.#cShort1D[n + 4] & 0xF));
    }

    /**
     * @param graphics {Graphics}
     * @param n {number}
     * @param n2 {number}
     * @param n3 {number}
     * @param n4 {number}
     */
    aGraphicsAndIntAndIntAndIntAndIntReturnVoid(graphics, n, n2, n3, n4) {
        var n5 = this.#gByte1D[n] & 0xFF;
        for (var n6 = 0; n6 < n5; ++n6) {
            var n7 = this.#bShort1D[n] + n6 << 2;
            var n8 = this.#hByte1D[n7 + 3] & 0xFF;
            var n9 = this.#hByte1D[n7] & 0xFF;
            var n10 = ((n4 & 0x1) !== 0x0) ? (n2 - this.#hByte1D[n7 + 1]) : (n2 + this.#hByte1D[n7 + 1]);
            var n11 = ((n4 & 0x2) !== 0x0) ? (n3 - this.#hByte1D[n7 + 2]) : (n3 + this.#hByte1D[n7 + 2]);
            if ((n4 & 0x1) !== 0x0) {
                n10 -= (this.#fByte1D[n9 << 1] & 0xFF);
            }
            if ((n4 & 0x2) !== 0x0) {
                n11 -= (this.#fByte1D[(n9 << 1) + 1] & 0xFF);
            }
            this.bGraphicsAndIntAndIntAndIntAndIntReturnVoid(graphics, n9, n10, n11, n4 ^ (n8 & 0xF));
        }
    }

    /**
     * @param graphics {Graphics}
     * @param n {number}
     * @param n2 {number}
     * @param n3 {number}
     * @param n4 {number}
     */
    bGraphicsAndIntAndIntAndIntAndIntReturnVoid(graphics, n, n2, n3, n4) {
        var n5 = n << 1;
        var n6 = this.#fByte1D[n5] & 0xFF;
        var n7 = this.#fByte1D[n5 + 1] & 0xFF;
        if (n6 <= 0 || n7 <= 0) {
            return;
        }
        var rgbImage = null;
        if (this.aImage2D != null && this.aImage2D[this.aInt] != null) {
            rgbImage = this.aImage2D[this.aInt][n];
        }
        console.log(rgbImage)
        if (rgbImage == null) {
            var a;
            if ((a = this.aIntReturnInt1D(n)) == null) {
                return;
            }
            rgbImage = RGBAImage.createRGBImage(a, n6, n7, this.#aBoolean);
        }
        var width = rgbImage.getWidth();
        var height = rgbImage.getHeight();
        var graphics2;
        var image;
        var n8, n9, n10, n11, n12;
        if ((n4 & 0x1) !== 0x0) {
            if ((n4 & 0x2) !== 0x0) {
                graphics2 = graphics;
                image = rgbImage;
                n8 = 0;
                n9 = 0;
                n10 = width;
                n11 = height;
                n12 = 3;
            } else {
                graphics2 = graphics;
                image = rgbImage;
                n8 = 0;
                n9 = 0;
                n10 = width;
                n11 = height;
                n12 = 2;
            }
        } else if ((n4 & 0x2) !== 0x0) {
            graphics2 = graphics;
            image = rgbImage;
            n8 = 0;
            n9 = 0;
            n10 = width;
            n11 = height;
            n12 = 1;
        } else {
            graphics2 = graphics;
            image = rgbImage;
            n8 = 0;
            n9 = 0;
            n10 = width;
            n11 = height;
            n12 = 0;
        }
        graphics2.drawRegion(image, n8, n9, n10, n11, n12, n2, n3, 0);
    }

    aIntReturnInt1D(n) {
        console.log("Get image data at index", n, this.#aShort)
        if (this.dByte1D === null || this.#cShort1D === null) {
            console.log("Return", this.dByte1D, this.#cShort1D)
            return null;
        }
        var n2 = n << 1;
        var n3 = this.#fByte1D[n2] & 0xFF; // Read width
        var n4 = this.#fByte1D[n2 + 1] & 0xFF; // And height
        var a = new Array(4096)//f.#aInt1D; // For memory purposes (maximum 4096 pixels in image) - new textures are overwriting old ones!!!
        var array;
        if ((array = this.#aInt2D[this.aInt]) == null) {
            console.log("Return", array)
            return null;
        }
        var d = this.dByte1D; // The pixel data bytes
        n = (this.#cShort1D[n] & 0xFFFF); // Index inside d variable
        var i = 0; // Index inside a variable, the number[4096] in format 0xAARRGGBB
        var n5 = n3 * n4; // Total pixels
        if (this.#aShort === 10225) {
            while (i < n5) {
                var n6;
                if ((n6 = (d[n++] & 0xFF)) > 127) {
                    var n7 = array[d[n++] & 0xFF];
                    n6 -= 128;
                    while (n6-- > 0) {
                        a[i++] = n7;
                    }
                } else {
                    a[i++] = array[n6];
                }
            }
        } else if (this.#aShort === 5632) {
            while (i < n5) {
                a[i++] = array[d[n] >> 4 & 0xF]; // That's the texture encoding I found
                a[i++] = array[d[n] & 0xF]; // 2 pixels per byte, max 4-bit palette
                ++n;
            }
        } else if (this.#aShort === 1024) {
            while (i < n5) {
                a[i++] = array[d[n] >> 6 & 0x3];
                a[i++] = array[d[n] >> 4 & 0x3];
                a[i++] = array[d[n] >> 2 & 0x3];
                a[i++] = array[d[n] & 0x3];
                ++n;
            }
        } else if (this.#aShort === 512) {
            while (i < n5) {
                a[i++] = array[d[n] >> 7 & 0x1];
                a[i++] = array[d[n] >> 6 & 0x1];
                a[i++] = array[d[n] >> 5 & 0x1];
                a[i++] = array[d[n] >> 4 & 0x1];
                a[i++] = array[d[n] >> 3 & 0x1];
                a[i++] = array[d[n] >> 2 & 0x1];
                a[i++] = array[d[n] >> 1 & 0x1];
                a[i++] = array[d[n] & 0x1];
                ++n;
            }
        } else if (this.#aShort === 22018) {
            while (i < n5) {
                a[i++] = array[d[n++] & 0xFF];
            }
        } else if (this.#aShort === 22258) {
            while (i < n5) {
                var n8;
                if ((n8 = (d[n++] & 0xFF)) > 127) {
                    n8 -= 128;
                    while (n8-- > 0) {
                        a[i++] = array[d[n++] & 0xFF];
                    }
                } else {
                    var n9 = array[d[n++] & 0xFF];
                    while (n8-- > 0) {
                        a[i++] = n9;
                    }
                }
            }
        }
        return a;
    }

    aBooleanReturnVoid(b) {
        this.#fByte1D = null;
        this.#gByte1D = null;
        this.#bShort1D = null;
        this.aInt = null;
        this.#hByte1D = null;
        this.bByte1D = null;
        this.#aShort = null;
        this.cByte1D = null;
        if (this.aByte1D !== null) {
            for (var i = 0; i < this.aByte1D.length; ++i) {
                this.aByte1D[i] = null;
            }
            this.aByte1D = null;
        }
        this.dByte1D = null;
        this.#cShort1D = null;
        if (b && this.aImage2D !== null) {
            for (var j = 0; j < this.aImage2D.length; ++j) {
                if (this.aImage2D[j] != null) {
                    for (var k = 0; k < this.aImage2D[j].length; ++k) {
                        this.aImage2D[j][k] = null;
                    }
                }
            }
            this.aImage2D = null;
        }
    }

    /**
     * @return {number[]}
     */
    getFByte1D() {
        return this.#fByte1D
    }
}
