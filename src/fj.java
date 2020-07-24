import javax.microedition.lcdui.Graphics;
import main.GameMidlet;
import main.a;

final class fj
  extends by
{
  private final hn f;
  private final gr g;
  private final bc h;
  
  fj(String paramString, ii paramii, hn paramhn, gr paramgr, bc parambc)
  {
    super(null, null);
    this.f = paramhn;
    this.g = paramgr;
    this.h = parambc;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    this.f.a(paramGraphics, dp.c / 2, 37 * gy.Y, true);
    if (this.g != null) {
      this.g.a(paramGraphics, dp.c / 2 + 15 * gy.Y, 37 * gy.Y, this.f.W);
    }
    paramInt1 = 40 * gy.Y;
    paramInt2 = 15 * gy.Y;
    main.a.N.a(paramGraphics, kf.aA + this.f.x, 0, paramInt1, 0);
    main.a.N.a(paramGraphics, "ID: " + this.f.w, 0, paramInt1 += paramInt2, 0);
    if ((GameMidlet.j.g > 0) || (GameMidlet.j.f > 0))
    {
      new StringBuffer(String.valueOf(kf.em[0]));
      if ((this.f.v > 0) || (this.f.r > 0)) {
        main.a.N.a(paramGraphics, kf.em[0] + this.f.v + " + " + (this.f.r > (byte)0 ? this.f.r + "%" : this.f.w == GameMidlet.i.w ? GameMidlet.j.f + "%" : this.f.r + "%"), 0, paramInt1 += paramInt2, 0);
      }
    }
    if ((this.f.u > 0) || (this.f.s > 0)) {
      main.a.N.a(paramGraphics, kf.em[1] + this.f.u + " + " + (this.f.s > (byte)0 ? this.f.s + "%" : ""), 0, paramInt1 += paramInt2, 0);
    }
    int i = 0;
    if (this.h.c > 125 * gy.Y)
    {
      this.h.a(100 * gy.Y);
      if (this.h.d >= 0) {
        i = this.h.d;
      }
    }
    main.a.N.a(paramGraphics, this.h.a, 0 - i, paramInt1 += paramInt2, 0);
    if (ae.u) {
      main.a.N.a(paramGraphics, kf.dE + this.f.a[3] + kf.l(), 0, paramInt1 + paramInt2, 0);
    }
  }
}
