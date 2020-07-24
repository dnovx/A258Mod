import java.io.IOException;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ks extends cc {
    private Image a;
    private static Image imgDen;
    private static ht ImgFrame;
    private int stat1 = 0;
    private long stat2 = 0L;

    public ks(int i, int i2, int i3, int i4) {
        super(i, i2, i3, 0);
        c.b(kf.at);
        this.a = c.a(new StringBuffer().append(i).toString());
        if (this.a != null) {
            this.a.getWidth();
        }
        c.b(kf.av);
        imgDen = c.a("den");
        c.a();
        try
        {
          ImgFrame= new ht(Image.createImage("/normal/lamp.png"), 13 * js.ay, 50 * js.ay);
        }
        catch (IOException localIOException)
        {
          localIOException.printStackTrace();
        }
    }

    public final void a(Graphics graphics) {
        if (this.a == null) {
            this.g = fx.c((short) this.f).b;
            fx.a(graphics, this.f, this.aw * js.ay, this.ax * js.ay, 33);
        } else {
            graphics.drawImage(this.a, this.aw * js.ay, this.ax * js.ay, 33);
        }
        if (this.f == 845) {
        	if ((ir.j == 1)) {
        		if (System.currentTimeMillis() - this.stat2 > 800L)
        	      {
        	        this.stat2 = System.currentTimeMillis();
        	        if (this.stat1 == 0) {
        	          this.stat1 = 1;
        	        } else {
        	          this.stat1 = 0;
        	        }
        	      }
        	  ks.ImgFrame.a(this.stat1, (this.aw * js.ay), (this.ax * js.ay) - 32 * js.ay, 0, 17, graphics);
        	  graphics.drawImage(imgDen, (this.aw * js.ay) , (this.ax * js.ay) - 32 * js.ay, 3);
        	}
        } else if (this.f == 846) {
            main.a.N.a(graphics, new StringBuffer(String.valueOf(ae.c)).toString(), js.ay * this.aw, (this.ax * js.ay) - (js.ay * 30), 2);
        } else if (this.f == 1029 && go.V != (short) 0) {
            az b = go.b(gb.b(go.V).b);
            Object obj = "";
            int i = go.U / 3600;
            if (i > 0) {
                obj = new StringBuffer(String.valueOf(i)).append(":").toString();
            }
            int i2 = (go.U - (i * 3600)) / 60;
            if (i2 > 0 || i > 0) {
                obj = new StringBuffer(String.valueOf(obj)).append(i2).append(":").toString();
            }
            String toString = new StringBuffer(String.valueOf(obj)).append((go.U - (i * 3600)) - (i2 * 60)).toString();
            if (go.U == 0) {
                toString = "hoan thanh";
            }
            go.W = this.aw - ((main.a.Q.a(toString) / 2) / js.ay);
            go.X = (this.ax - (fx.c((short) this.f).c / js.ay)) - 10;
            gb.a(graphics, b.b, (this.aw * js.ay) - (main.a.Q.a(toString) / 2), ((this.ax * js.ay) - fx.c((short) this.f).c) - (js.ay * 10), 3);
            main.a.Q.a(graphics, toString, (js.ay * 10) + ((this.aw * js.ay) - (main.a.Q.a(toString) / 2)), ((((this.ax * js.ay) - fx.c((short) this.f).c) - (js.ay * 10)) - (gy.ai / 2)) + 2, 0);
        }
    }

    public final void b() {
    }
}