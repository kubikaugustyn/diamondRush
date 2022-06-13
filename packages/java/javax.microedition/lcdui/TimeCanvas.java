package javax.microedition.lcdui;

import java.util.Calendar;
import java.util.Date;

class TimeCanvas extends Canvas {
  Calendar cal = Calendar.getInstance();

  private int minutes;

  private int hours;

  private int selected;

  public Date getTime() {
    this.cal.set(11, this.hours);
    this.cal.set(12, this.minutes);
    return this.cal.getTime();
  }

  public void setTime(Date time) {
    this.cal.setTime(time);
    this.hours = this.cal.get(11);
    this.minutes = this.cal.get(12);
    repaint();
  }

  public void paint(Graphics g) {
    int colorR, colorT, w = getWidth();
    int h = getHeight();
    g.setColor(16777215);
    g.fillRect(0, 0, w, h);
    Font font = Font.getFont(32, 1, 0);
    String hoursStr = Integer.toString(this.hours);
    if (this.hours < 10)
      hoursStr = "0" + hoursStr;
    String minutesStr = Integer.toString(this.minutes);
    if (this.minutes < 10)
      minutesStr = "0" + minutesStr;
    String delimiterStr = " : ";
    int y = h - font.getHeight() >>> 1;
    int hoursW = font.stringWidth(hoursStr);
    int minutesW = font.stringWidth(minutesStr);
    int delimiterW = font.stringWidth(delimiterStr);
    int stringWidth = hoursW + minutesW + delimiterW;
    int offset = w - stringWidth >>> 1;
    int hOff = offset;
    int dOff = offset + hoursW;
    int mOff = dOff + delimiterW;
    g.setColor(0);
    g.setFont(font);
    g.drawString(delimiterStr, dOff, y, 20);
    if (this.selected == 0) {
      colorR = 0;
      colorT = 16777215;
    } else {
      colorR = 16777215;
      colorT = 0;
    }
    g.setColor(colorR);
    g.fillRect(hOff, y, hoursW, font.getHeight());
    g.setColor(colorT);
    g.drawString(hoursStr, hOff, y, 20);
    if (this.selected == 1) {
      colorR = 0;
      colorT = 16777215;
    } else {
      colorR = 16777215;
      colorT = 0;
    }
    g.setColor(colorR);
    g.fillRect(mOff, y, minutesW, font.getHeight());
    g.setColor(colorT);
    g.drawString(minutesStr, mOff, y, 20);
  }

  public synchronized void keyPressed(int keycode) {
    int k = getGameAction(keycode);
    if (k == 2 && this.selected > 0) {
      this.selected--;
      repaint();
    } else if (k == 5 && this.selected < 1) {
      this.selected++;
      repaint();
    } else if (k == 1) {
      switch (this.selected) {
        case 0:
          this.hours++;
          if (this.hours > 23)
            this.hours = 0;
          break;
        case 1:
          this.minutes++;
          if (this.minutes > 59)
            this.minutes = 0;
          break;
      }
      repaint();
    } else if (k == 6) {
      switch (this.selected) {
        case 0:
          this.hours--;
          if (this.hours < 0)
            this.hours = 23;
          break;
        case 1:
          this.minutes--;
          if (this.minutes < 0)
            this.minutes = 59;
          break;
      }
      repaint();
    }
  }
}
