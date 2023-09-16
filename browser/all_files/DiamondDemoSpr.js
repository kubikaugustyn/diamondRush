var __author__ = "kubik.augustyn@post.cz"

class c {
    static aLong// private static long aLong;
    static aClassString// private static String aClassString;
    static bClassString// private static String bClassString;
    static aClassfArr// public static f[] aClassfArr;
    aByteArrArr// public byte[][] aByteArrArr;
    aInt// private int aInt;
    bLong// private long bLong;
    aByteArr// public byte[] aByteArr;
    bInt// private int bInt;
    bBoolean// private boolean bBoolean;
    cInt// private int cInt;
    dInt// private int dInt;
    eInt// private int eInt;
    fInt// private int fInt;
    gInt// private int gInt;
    aBoolean// public boolean aBoolean;
    static aClassi// private static i aClassi;
    aShortArr// private short[] aShortArr;
    hInt// private int hInt;

    // public c(final i aClassi)
    constructor(aClassi) {
        this.aByteArrArr = null;
        this.aInt = 0;
        this.aByteArr = null;
        this.bBoolean = false;
        this.cInt = 0;
        this.dInt = 0;
        this.eInt = 0;
        this.fInt = 0;
        this.gInt = -1;
        this.aBoolean = false;
        this.aShortArr = new Array(16)//new short[16];
        c.aClassi = aClassi;
    }

    // public final void aVoid(final int n)
    aIntReturnVoid(n) {
        try {
            var demoFCh = DiamondChunks.parseChunks(demo)[0]
            console.log(demoFCh)
            var ptr = 0
            var array = new Array(4)//new byte[4]
            array[0] = demoFCh[ptr++]
            array[1] = demoFCh[ptr++]
            var b = false
            do {
                array[0] = demoFCh[ptr++]
                array[1] = demoFCh[ptr++]
                console.log(this.classIMethod_aInt(array, 0))
                if (this.classIMethod_aInt(array, 0) === n) {
                    array[0] = demoFCh[ptr++]
                    array[1] = demoFCh[ptr++]
                    var n2 = this.classIMethod_aInt(array, 0)
                    array = demoFCh.slice(ptr, ptr + 4)
                    ptr += 4
                    array = new Array(this.classIMethod_bInt(array, 0))
                    array = demoFCh.slice(ptr, ptr + array.length)
                    ptr += array.length
                    demoFCh = null // No longer able to use it!!!
                    ptr = 0//Don't forget to reset the pointer, because it's reused to read demoSpr.bin as well
                    b = true
                    var n3 = 0
                    var n4 = this.classIMethod_aInt(array, 0)
                    n3 += 2
                    if (n4 !== 0) {
                        var array2 = new Array(n4)
                        for (var n5 = 0; n5 < n4; n5++) {
                            array2[n5] = this.classIMethod_aInt(array, n3)
                            n3 += 2
                        }
                        // array2 is now basically a new short[n4]
                        for (var n6 = 1; n6 < n4; n6++) {
                            var n7 = array2[n6]
                            var n9, n10 // TOD0 maybe they should be 0?
                            var n8 = n9 = n6
                            while (true) {
                                n10 = n9
                                if (n8 <= 0 || array2[n10 - 1] <= n7) break
                                array2[n10] = array2[n10 - 1]
                                n8 = (n9 = n10 - 1)
                            }
                            array2[n10] = n7
                        }
                        // array2 is somehow shuffled?
                        var array3 = new Array(4)
                        array3[0] = demoSpr[ptr++]
                        array3[1] = demoSpr[ptr++]
                        var n11 = this.classIMethod_aInt(array3, 0)
                        console.warn("Nice")
                        if (c.aClassfArr == null) c.aClassfArr = new Array(n11)
                        for (var n12 = 0; n12 < n4; n12++) {
                            var n13 = array2[n12]
                            var iInteger = 0
                            while (iInteger === 0) {
                                array3[0] = demoSpr[ptr++]
                                array3[1] = demoSpr[ptr++]
                                if (n13 === this.classIMethod_aInt(array3, 0)) iInteger = 1
                                array3 = demoSpr.slice(ptr, ptr + 4)
                                ptr += 4
                                var b2 = this.classIMethod_bInt(array3, 0)
                                if (iInteger === 0 && c.aClassfArr[n13] !== null) ptr += b2
                                else {
                                    array3 = new Array(b2)
                                    array3 = demoSpr.slice(ptr, ptr + array3.length)
                                    ptr += array3.length;
                                    (c.aClassfArr[n13] = new f()).aByte1DAndIntReturnVoid(array3, 0)
                                    c.aClassfArr[n13].aIntAndIntAndIntAndIntReturnVoid(0, 0, -1, -1)
                                    c.aClassfArr[n13].dByteArr = null
                                }
                            }
                        }
                        ptr = 0 // Close demoSpr.bin
                    }
                    var aByteArrArr = new Array(n2)//new byte[n2][]
                    var n14 = 0
                    var array4 = null//byte[][]
                    var n15 = 0, n16 = 0
                    for (var n17 = 0; n17 < n2 || n16 !== 0; n17++) {
                        var array5//byte[][]
                        if (n16 === 0) array5 = aByteArrArr
                        else {
                            array5 = array4
                            n16--
                            n17--
                        }
                        var n18 = array[n3++] & 0xFF
                        var array6 = null//byte[]
                        Label_1801:
                        {
                            var array7 = null//byte[]
                            switch (n18) {
                                case 18:
                                    var n19 = array[n3++] & 0xFF
                                    var n20 = (array[n3++] & 0xFF) + ((array[n3++] & 0xFF) << 8) + ((array[n3++] & 0xFF) << 16)
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(8), 2, n19)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 3, n20)
                                    array6[7] = 0
                                    break Label_1801
                                case 16:
                                case 17:
                                    var n21 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n22 = array[n3++] & 0xFF
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(6), 2, n21)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 4, n22)
                                    array6[5] = 0
                                    break Label_1801
                                case 11:
                                    var n23 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n24 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(6), 2, n23)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 4, n24)
                                    break Label_1801
                                case 12:
                                    var n25 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n26 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(6), 2, n25)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 4, n26)
                                    break Label_1801
                                case 13:
                                    var n27 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n28 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n29 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(12), 2, n27)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 4, n28)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 6, n29)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 8, 10000)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 10, 10000)
                                    break Label_1801
                                case 14:
                                case 15:
                                    array7 = new Array(2)
                                    break
                                case 4:
                                    var n30 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n31 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n32 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n33 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n34 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n35 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n36 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(16), 2, n30)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 4, n31)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 6, n32)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 8, n33)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 10, n34)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 12, n35)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 14, n36)
                                    break Label_1801
                                case 7: // Lol, PyCharm didn't notice the duplicate branch
                                    array7 = new Array(2)
                                    break
                                case 1:
                                    var n37 = this.classIMethod_aInt(array, n3) * 24
                                    n3 += 2
                                    var n38 = this.classIMethod_aInt(array, n3) * 24
                                    n3 += 2
                                    var n39 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(12), 2, n37)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 4, n38)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 6, n39)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 8, 10000)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 10, 10000)
                                    break Label_1801
                                case 6:
                                    var b3 = this.classIMethod_bInt(array, n3)
                                    n3 += 4
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(6), 2, b3)
                                    break Label_1801
                                case 26:
                                    var n40 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n41 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var b4 = this.classIMethod_bInt(array, n3)
                                    n3 += 4
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(10), 2, n40)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 4, n41)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 6, b4)
                                    break Label_1801
                                case 25:
                                    var n42 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n43 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n44 = array[n3++] & 0xFF
                                    var n45 = array[n3++] & 0xFF
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(8), 2, n42)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 4, n43)
                                    array6[6] = n44
                                    array6[7] = n45
                                    break Label_1801
                                case 5:
                                    var n46 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n47 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n48 = array[n3++] & 0xFF
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(7), 2, n46)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 4, n47)
                                    array6[6] = n48
                                    break Label_1801
                                case 27:
                                    var n49 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(n49 + 8), 2, n49)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 4, 10000)
                                    array6[7] = (array6[6] = 0)
                                    f.prototype.systemArrayCopy(array, n3, array6, 8, n49)
                                    n3 += n49
                                    break Label_1801
                                case 2:
                                    var n50 = array[n3++] & 0xFF
                                    var n51 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n52 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(n52 + 11), 2, n52)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 4, 10000)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 6, n51)
                                    array6[8] = n50
                                    array6[10] = (array6[9] = 0)
                                    f.prototype.systemArrayCopy(array, n3, array6, 11, n52)
                                    n3 += n52
                                    break Label_1801
                                case 9:
                                    var n53 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n54 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    var n55 = this.classIMethod_aInt(array, n3)
                                    n3 += 2
                                    this.aByte1DAndIntAndShortReturnVoid(array6 = new Array(8), 2, n53)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 4, n54)
                                    this.aByte1DAndIntAndShortReturnVoid(array6, 6, n55)
                                    break Label_1801
                                case 10:
                                    (array6 = new Array(3))[2] = array[n3++] & 0xFF
                                    break Label_1801
                                case 0:
                                    array4 = new Array(n16 = array[n3++] & 0xFF)
                                    array7 = null
                                    break
                                default:
                                    throw "Oh no, something went wrong, non-implemented value: " + n18
                            }
                            array6 = array7
                        }
                        if (array6 !== null) {
                            array6[0] = n18
                            array6[1] = 0
                            if (array5 === array4) {
                                array5[n15] = array6
                                n15++
                            } else {
                                array5[n14] = array6
                                n14++
                            }
                        }
                        if (array5 === array4 && n16 === 0) {
                            var n56 = 0
                            for (var j = 0; j < array4.length; j++) {
                                n56 += array4[j].length
                            }
                            var array8 = new Array(2 + (array4.length << 2) + n56)//byte[]
                            array8[0] = 0
                            array8[1] = array4.length
                            var n57 = 2 + (array4.length << 2)
                            for (var k = 0; k < array4.length; k++) {
                                this.aByte1DAndIntAndIntReturnVoid(array8, 2 + (k << 2), array4[k].length)
                                f.prototype.systemArrayCopy(array4[k], 0, array8, n57, array4[k].length)
                                n57 += array4[k].length
                            }
                            aByteArrArr[n14] = array8
                            n15 = 0
                            array4 = null
                            n14++
                        }
                    }
                    this.aByteArrArr = aByteArrArr
                } else {
                    ptr += 2
                    array = demoFCh.slice(ptr, ptr + 4)
                    ptr += 4
                    ptr += this.classIMethod_bInt(array, 0)
                }
            } while (!b && ptr < demoFCh.length)
            if (!b) console.warn("Pointer out of bounds")
        } catch (ex) {
            console.log("DiamondDemoSpr crashed:")
            console.log(ex)
        }
    }

    // private static void aVoid(final byte[] array, final int n, final int n2)
    aByte1DAndIntAndIntReturnVoid(array, n, n2) {
        array[n] = n2 & 0xFF
        array[n + 1] = (n2 >> 8) & 0xFF
        array[n + 2] = (n2 >> 16) & 0xFF
        array[n + 3] = (n2 >>> 24) & 0xFF
    }

    // private static void aVoid(final byte[] array, final int n, final short n2)
    aByte1DAndIntAndShortReturnVoid(array, n, n2) {
        array[n] = n2 & 0xFF
        array[n + 1] = (n2 >> 8) & 0xFF
    }

    aGraphicsReturnVoid(graphics) {
        if (this.aBoolean) return
        switch ((this.aByteArr == null) ? -1 : this.aByteArr[0]) {
            case 25:
            case 26:
                if (this.aByteArrArr == null || this.aInt >= this.aByteArrArr.length) return
                break
            default:
                // Renders the black rectangles behind top and bottom UI in gameplay
                // graphics.setColor(0);
                // graphics.fillRect(0, 0, 240, 42);
                // graphics.fillRect(0, 278, 240, 42);
                // Renders the "Skip" animation text
                // i.textSize8.drawTextWithFlags(graphics, i.texts[65], 2, 320 - (i.textSize8.font.getHeight() - 10), 36);
                break
        }
        if (this.aByteArr[0] === 0) {
            var b = this.aByteArr[1];
            var n = 2 + (b << 2);
            for (var b2 = 0; b2 < b; ++b2) {
                var b3 = this.classIMethod_bInt(this.aByteArr, 2 + (b2 << 2));
                this.aGraphicsAndByte1DAndIntReturnVoid(graphics, this.aByteArr, n);
                n += b3;
            }
        } else this.aGraphicsAndByte1DAndIntReturnVoid(graphics, this.aByteArr, 0)
        if (this.bBoolean) {
            graphics.setColor(0);
            graphics.fillRect(this.cInt - 3, this.dInt - 3, 109, 45);
            c.aClassfArr[this.fInt].aGraphicsAndIntAndIntAndIntAndIntAndIntAndIntAndIntReturnVoid(graphics, 0, this.bInt % c.aClassfArr[this.fInt].aInt(0), this.cInt, this.dInt, 0, 0, 0);
            c.aClassfArr[0].aGraphicsAndIntAndIntAndIntAndIntReturnVoid(graphics, this.eInt, this.cInt, this.dInt, 0);
            if (this.gInt >= 0) {
                if (i.bBoolean && this.gInt === 2) {
                    this.gInt = 7;
                }
                if (i.bBoolean && this.gInt === 6) {
                    this.gInt = 8;
                }
                c.aClassfArr[1].aGraphicsAndIntAndIntAndIntAndIntReturnVoid(graphics, this.gInt, this.cInt + 90, this.dInt - 6, 0);
            }
        }
    }

    //private void aVoid(final Graphics graphics, final byte[] array, int n)
    aGraphicsAndByte1DAndIntReturnVoid(graphics, array, n) {
        if (array === null) return
        var b = array[n]
        switch (b) {
            case 18:
            case 12:
                throw "TODO"
            case 1:
                var bInt2 = this.bInt;
                var n3 = this.classIMethod_aInt(array, n + 2);
                var n4 = this.classIMethod_aInt(array, n + 4);
                var n5 = this.classIMethod_aInt(array, n + 6);
                var n6 = this.classIMethod_aInt(array, n + 8);
                var n7 = this.classIMethod_aInt(array, n + 10);
                if (n6 === 10000) {
                    n6 = c.aClassi.cInt;
                }
                if (n7 === 10000) {
                    n7 = c.aClassi.dInt;
                }
                if (bInt2 > n5) {
                    bInt2 = n5;
                }
                var n8 = (n3 - 108);
                var n9 = (n4 - 108);
                c.aClassi.cInt = (n8 * bInt2 + n6 * (n5 - bInt2)) / n5
                c.aClassi.dInt = (n9 * bInt2 + n7 * (n5 - bInt2)) / n5
                var n10 = c.aClassi.eInt * 24 - 240;
                var bInt3 = c.aClassi.fInt * 24 - 320 + 80;
                Label_0491:
                {
                    var i;
                    var cInt;
                    if (c.aClassi.cInt > n10) {
                        i = c.aClassi;
                        cInt = n10;
                    } else {
                        if (c.aClassi.cInt >= 0) {
                            break Label_0491;
                        }
                        i = c.aClassi;
                        cInt = 0;
                    }
                    i.cInt = cInt;
                }
                Label_0524:
                {
                    var j;
                    var dInt;
                    if (c.aClassi.dInt > bInt3) {
                        j = c.aClassi;
                        dInt = bInt3;
                    } else {
                        if (c.aClassi.dInt >= 0) {
                            break Label_0524;
                        }
                        j = c.aClassi;
                        dInt = 0;
                    }
                    j.dInt = dInt;
                }
                c.aClassi.aInt = c.aClassi.cInt;
                c.aClassi.bInt = c.aClassi.dInt;
                if (c.aClassi.aInt > n10) {
                    var aClassi = c.aClassi;
                    aClassi.aInt -= n10;
                }
                if (c.aClassi.bInt > bInt3) {
                    c.aClassi.bInt = bInt3;
                    return;
                }
                if (c.aClassi.bInt < 0) {
                    return;
                }
                break
            case 13:
            case 4:
            case 27:
            case 2:
                throw "TODO"
        }
    }

    //private void bVoid(final byte[] array, final int n)
    bByte1DAndIntReturnVoid(array, n) {
        if (array[n] !== 0) {
            array[n + 1] = 0;
            var array2 = null;
            var n2 = 0;
            var n3 = 0;
            switch (array[n]) {
                case 27: {
                    array[n + 6] = 0;
                    this.aByte1DAndIntAndShortReturnVoid(array, n + 4, -240);
                    array2 = array;
                    n2 = n;
                    n3 = 7;
                    break;
                }
                case 2: {
                    array[n + 9] = 0;
                    this.aByte1DAndIntAndShortReturnVoid(array, n + 4, -240);
                    array2 = array;
                    n2 = n;
                    n3 = 10;
                    break;
                }
                default: {
                    return;
                }
            }
            array2[n2 + n3] = 0;
            return;
        }
        var b = array[n + 1];
        var n4 = n + 2 + (b << 2);
        for (var b2 = 0; b2 < b; ++b2) {
            var b3 = this.classIMethod_bInt(array, n + 2 + (b2 << 2));
            this.bByte1DAndIntReturnVoid(array, n4);
            n4 += b3;
        }
    }

    //public final byte[] aByteArr()
    aReturnByte1D() {
        var aByteArrArr = this.aByteArrArr;
        for (var i = 0; i < aByteArrArr.length; ++i) {
            this.bByte1DAndIntReturnVoid(aByteArrArr[i], 0);
        }
        this.bBoolean = false;
        this.cInt = 0;
        this.dInt = 0;
        this.eInt = 0;
        this.fInt = 0;
        this.gInt = -1;
        this.aBoolean = false;
        this.aInt = 0;
        this.bLong = Date.now();
        return this.bReturnByte1D();
    }

    //public final byte[] bByteArr()
    bReturnByte1D() {
        this.bInt = 0;
        if (this.aByteArrArr == null || this.aInt >= this.aByteArrArr.length) this.aByteArr = null;
        else this.aByteArr = this.aByteArrArr[this.aInt++];
        return this.aByteArr;
    }

    static {
        c.aLong = 1000
        c.aClassString = "/demoSpr.bin"
        c.bClassString = "/demo.f"
        c.aClassfArr = null
        c.aClassi = null
    }

    // class i methods
    /*
    public static int aInt(final byte[] array, final int n) {
        return (array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8;
    }
     */
    /**
     * @param array {number[]}
     * @param n {number}
     * @returns {number}
     */
    classIMethod_aInt(array, n) {
        return (array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8;
    }

    /*
    public static int bInt(final byte[] array, final int n) {
        return (array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16 | (array[n + 3] & 0xFF) << 24;
    }
     */
    /**
     * @param array {number[]}
     * @param n {number}
     * @returns {number}
     */
    classIMethod_bInt(array, n) {
        return (array[n] & 0xFF) | (array[n + 1] & 0xFF) << 8 | (array[n + 2] & 0xFF) << 16 | (array[n + 3] & 0xFF) << 24;
    }
}

class DiamondDemoSpr extends DiamondFile {
    init() {
        this.fileType = "DemoSpr"
    }

    parse(dec, container) {
        //this.parseContent(dec, container)
        var otherFile = currentFileName === "demoSpr.bin" ? "demo.f" : "demoSpr.bin"
        console.log(currentFileName, "-->", otherFile)
        if (currentFileName === "demoSpr.bin") demoSpr = dec
        else demo = dec
        if (!(otherFile === "demoSpr.bin" ? demoSpr : demo)) {
            // Load the missing other file
            var inputs = new Array(...document.getElementsByName("file"))
            var input = inputs.find(a => a.value === otherFile)
            input.checked = true
            loadFile(new Event("submit"))
            return
        }
        // Now I'm sure I have both demo.f and demoSpr.bin
        var demoFCh = DiamondChunks.parseChunks(demo)[0]
        var ptr = 2
        var values = []
        while (ptr < demoFCh.length) {
            values.push(c.prototype.classIMethod_aInt(demoFCh, ptr))
            ptr += 8 + c.prototype.classIMethod_bInt(demoFCh, ptr + 4)
        }
        window.a = []
        for (var value of values) {
            c.aClassfArr = null
            var classI = {aInt: 0, bInt: 0, cInt: 0, dInt: 0}
            var classC = new c(classI)
            classC.aIntReturnVoid(value)
            // classC.bReturnByte1D()
            // classC.bBoolean = true
            // var graphics = new Graphics()
            // classC.aGraphicsReturnVoid(graphics)
            window.a.push(classC)

            container.innerHTML = "TODO - implement class c of Diamond Rush (which uses demoSpr.bin and demo.f)<br>"
            for (var texture of c.aClassfArr || []) {
                var images = []
                for (var i = 0; i < texture?.aImage2D?.length; i++) {
                    if (texture.aImage2D[i]) for (var j = 0; j < texture.aImage2D[i].length; j++) {
                        if (texture.aImage2D[i][j]) images.push(texture.aImage2D[i][j])
                    }
                }
                /**
                 * @type {RGBAImage}
                 */
                for (var image of images) {
                    var canvas = document.createElement("canvas")
                    var engine = new CanvasEngine2D({
                        canvas,
                        appName: "diamondRush-browser-all_files-demo_spr",
                        imageW: image.width,
                        imageH: image.height,
                        backgroundColor: [0, 255, 0, 255]
                    })
                    var img = image.toCanvasEngine2DImage("RGBAImage", engine)
                    engine.addElement(img, 0, 0, 0)
                    engine.render()
                    container.appendChild(canvas)
                    container.appendChild(document.createElement("br"))
                }
            }
        }
    }
}
