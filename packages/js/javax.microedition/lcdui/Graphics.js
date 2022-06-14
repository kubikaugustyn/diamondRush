// package javax.microedition.lcdui;

javax.microedition.lcdui.Graphics = class Graphics {// public class Graphics {
    constructor() {
        this.SOLID = 0// 	public static final int SOLID = 0;
        this.DOTTED = 1// 	public static final int DOTTED = 1;
        this.LEFT = 4// 	public static final int LEFT = 4;
        this.RIGHT = 8// 	public static final int RIGHT = 8;
        this.TOP = 16// 	public static final int TOP = 16;
        this.BASELINE = 64// 	public static final int BASELINE = 64;
        this.BOTTOM = 32// 	public static final int BOTTOM = 32;
        this.HCENTER = 1// 	public static final int HCENTER = 1;
        this.VCENTER = 2// 	public static final int VCENTER = 2;
        this.strokeStyle = this.SOLID// 	int strokeStyle = SOLID;
        this.translateX = 0// 	int translateX = 0;
        this.translateY = 0// 	int translateY = 0;
    }

    clipRect(x, y, width, height) {// public void clipRect(int x, int y, int width, int height) {
        this.implementationError()// 	implementationError();
    }// }

    drawArc(x, y, width, height, startAngle, arcAngle) {// public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        this.implementationError()//     implementationError();
    }// }

    drawChar(character, x, y, anchor) {// public void drawChar(char character, int x, int y, int anchor) {
        var carr = new JavaCharArr(1)// 	char[] carr = new char[1];
        carr.setItem(0, character)// 	carr[0] = character;
        this.drawString(new JavaString(carr), x, y, anchor)// 	drawString(new String(carr), x, y, anchor);
    }// }

    drawChars(data, offset, length, x, y, anchor) {// public void drawChars(char[] data, int offset, int length, int x, int y, int anchor) {
        this.drawString(new JavaString(data, offset, length), x, y, anchor)//     drawString(new String(data, offset, length), x, y, anchor);
    }// }

    drawImage(img, x, y, anchor) {// public void drawImage(Image img, int x, int y, int anchor) {
        this.implementationError()// 	implementationError();
    }// }

    drawLine(x1, y1, x2, y2) {// public void drawLine(int x1, int y1, int x2, int y2) {
        this.implementationError()// 	implementationError();
    }// }

    drawRect(x, y, width, height) {// public void drawRect(int x, int y, int width, int height) {
        this.implementationError()// 	implementationError();
    }// }

    drawRoundRect(x, y, width, height, arcWidth, arcHeight) {// public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        this.implementationError()//     implementationError();
    }// }

    drawString(str, x, y, anchor) {// public void drawString(String str, int x, int y, int anchor) {
        this.implementationError()// 	implementationError();
    }// }

    drawSubstring(str, offset, len, x, y, anchor) {// public void drawSubstring(String str, int offset, int len, int x, int y, int anchor) {
        this.drawString(str.slice(offset, offset + len), x, y, anchor)//     drawString(str.substring(offset, offset + len), x, y, anchor);
    }// }

    fillArc(x, y, width, height, startAngle, arcAngle) {// public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        this.implementationError()//     implementationError();
    }// }

    fillRect(x, y, width, height) {// public void fillRect(int x, int y, int width, int height) {
        this.implementationError()// 	implementationError();
    }// }

    fillRoundRect(x, y, width, height, arcWidth, arcHeight) {// public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        this.implementationError()//     implementationError();
    }// }

    getBlueComponent() {// public int getBlueComponent() {
        return this.getColor() & 255// 	return getColor() & 255;
    }// }

    getClipHeight() {// public int getClipHeight() {
        this.implementationError()// 	implementationError();
        //
        return -1// 	return -1;
    }// }

    getClipWidth() {// public int getClipWidth() {
        this.implementationError()// 	implementationError();
        //
        return -1// 	return -1;
    }// }

    getClipX() {// public int getClipX() {
        this.implementationError()// 	implementationError();
        //
        return -1// 	return -1;
    }// }

    getClipY() {// public int getClipY() {
        this.implementationError()// 	implementationError();
        //
        return -1// 	return -1;
    }// }

    getColor() {// public int getColor() {
        this.implementationError()// 	implementationError();
        //
        return -1// 	return -1;
    }// }

    getFont() {// public Font getFont() {
        this.implementationError()// 	implementationError();
        //
        return null// 	return null;
    }// }

    getGrayScale() {// public int getGrayScale() {
        return (this.getRedComponent() + this.getGreenComponent() + this.getBlueComponent()) / 3// 	return (getRedComponent() + getGreenComponent() + getBlueComponent()) / 3;
    }// }

    getGreenComponent() {// public int getGreenComponent() {
        return (this.getColor() >> 8) & 255// 	return (getColor() >> 8) & 255;
    }// }

    getRedComponent() {// public int getRedComponent() {
        return (this.getColor() >> 16) & 255// 	return (getColor() >> 16) & 255;
    }// }

    getStrokeStyle() {// public int getStrokeStyle() {
        return this.strokeStyle// 	return strokeStyle;
    }// }

    getTranslateX() {// public int getTranslateX() {
        return this.translateX// 	return translateX;
    }// }

    getTranslateY() {// public int getTranslateY() {
        return this.translateY// 	return translateY;
    }// }

    setClip(x, y, width, height) {// public void setClip(int x, int y, int width, int height) {
        this.implementationError()// 	implementationError();
    }// }

    setColor(...args) {// public void setColor(int RGB) {
        if (args.length === 1) this.implementationError()// 	implementationError();
        // }

        else if (args.length === 3) {// public void setColor(int red, int green, int blue) {
            var rgb = args[2]// 	int rgb = blue; // 0XRRGGBB
            rgb += args[1] << 8// 	rgb += green << 8;
            rgb += args[0] << 16// 	rgb += red << 16;
            this.setColor(rgb)// 	setColor(rgb);
        }
    }// }

    setFont(font) {// public void setFont(Font font) {
        this.implementationError()// 	implementationError();
    }// }

    setGrayScale(grey) {// public void setGrayScale(int grey) {
        if (grey < 0 || grey > 255) {// 	if (grey < 0 || grey > 255) {
            throw new IllegalArgumentException()// 		throw new IllegalArgumentException();
        }// 	}
        this.setColor(grey, grey, grey)// 	setColor(grey, grey, grey);
    }// }

    setStrokeStyle(style) {// public void setStrokeStyle(int style) {
        if (style !== this.SOLID && style !== this.DOTTED) {// 	if (style != SOLID && style != DOTTED) {
            throw new IllegalArgumentException()// 		throw new IllegalArgumentException();
        }// 	}
        this.strokeStyle = style// 	strokeStyle = style;
    }// }

    translate(x, y) {// public void translate(int x, int y) {
        this.translateX += x// 	translateX += x;
        this.translateY += y// 	translateY += y;
    }// }

    // MIDP2

    drawRegion(src, x_src, y_src, width, height, tranform, x_dst, y_dst, anchor) {// public void drawRegion(Image src, int x_src, int y_src, int width,
        // 		int height, int transform, int x_dst, int y_dst, int anchor) {
        this.implementationError()// 	implementationError();
    }// }

    drawRGB(rgbData, offset, scanlength, x, y, width, height, processAlpha) {// public void drawRGB(int[] rgbData, int offset, int scanlength, int x,
        // 		int y, int width, int height, boolean processAlpha) {
        this.implementationError()// 	implementationError();
    }// }

    fillTriangle(x1, y1, x2, y2, x3, y3) {// public void fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.implementationError()// 	implementationError();
    }// }

    copyArea(x_src, y_src, width, height, x_dest, y_dest, anchor) {// public void copyArea(int x_src, int y_src, int width, int height,
        // 		int x_dest, int y_dest, int anchor) {
        this.implementationError()// 	implementationError();
    }// }

    getDisplayColor(color) {// public int getDisplayColor(int color) {
        this.implementationError()// 	implementationError();
        //
        return -1// 	return -1;
    }// }

    implementationError() {// private void implementationError() {
        try {// 	try {
            throw new RuntimeException("Must be implemented in DisplayGraphics")// 		throw new RuntimeException("Must be implemented in DisplayGraphics");
        } catch (ex) {// 	} catch (RuntimeException ex) {
            console.error("Stack trace", ex)// 		ex.printStackTrace();
        }// 	}
    }// }

}// }
