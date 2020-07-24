import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.a;
import ae;

public abstract class hj
  extends gy
{
  public static int al = 20;
  public static Image am;
  public static Image an;
  public static Image ao;
  public static Image ap;
  public static Image aq;
  public int ar = 0;
  public static int as = 0;
  public static int at = 20;
  public static int au;
  public static int av;
  public static final int[] aw = { 4802889, 3092271 };
  public static final int[] ax = { 14400144, 12689526 };
  public static ae x;
  private long dey = System.currentTimeMillis();
  
  public void a(int paramInt, boolean paramBoolean)
  {
    this.ar = paramInt;
  }
  
  public void a(boolean paramBoolean)
  {
    this.aj = paramBoolean;
  }
  
  public void a()
  {
    a.e();
    a.r = this;
    a.a.setFullScreenMode(true);
  }
  
  public void a(Graphics paramGraphics)
  {
    if ((a.t == null) && (a.v == null) && (a.A == null) && (!im.c)) {
      super.a(paramGraphics);
    } else {
      a.c(paramGraphics);
    }
    if (!kt.a().b()) {
      a.M.a(paramGraphics, "2.5.8", a.af.a, a.af.b, a.af.c);
    } else if ((a.r == ez.a) || (a.r == ea.a)/* || (a.r  == x.a*/) {
      a.M.a(paramGraphics, kt.a().k, a.af.a, a.af.b/* + 12*/, a.af.c);
    }
    ModHandler.doOpen(paramGraphics);
    if (System.currentTimeMillis() - this.dey > min(10)) {
        this.dey = System.currentTimeMillis();
        main.a.a("Chơi quá 180 phút một ngày sẽ ảnh hưởng xấu đến sức khỏe.");
      }
    a.S.a(paramGraphics);
  }
  
  public void b(Graphics paramGraphics) {}
  
  public abstract void k();
  
  public void d(int paramInt) {}
  
  public void d() {}
  
  public static void z()
  {
    int i = a.n + a.T;
    if (an == null) {
      an = Image.createImage(a.m, i);
    }
    Graphics localGraphics1;
    Graphics localGraphics2 = localGraphics1 = an.getGraphics();
    if (a.r == ek.a)
    {
      ek.a.c(localGraphics1);
      return;
    }
    if ((a.r == kd.a) || (a.r == kg.a))
    {
      int j;
      if (a.m < i) {
        j = i / 10;
      } else {
        j = a.m / 10;
      }
      for (int k = 0; k < j; k++)
      {
        localGraphics1.setColor(6629892);
        localGraphics1.drawRect(a.o - k * j - 1, i / 2 - k * j, k * j << 1, k * j << 1);
        localGraphics1.setColor(13399567);
        localGraphics1.drawRect(a.o - k * j, i / 2 - k * j + 1, k * j << 1, k * j << 1);
      }
    }
  }
  
  public static long min(int i)
  {
	return i * 60000L;  
  }
}
