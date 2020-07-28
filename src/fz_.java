import javax.microedition.lcdui.Graphics;

public final class fz_
  extends by
{
  private final hx a;
  private final int b;
  
  fz_(String paramStr, ii paramii, hx paramhx, int paramInt)
  {
    super(paramStr, paramii);
    this.a = paramhx;
    this.b = paramInt;
  }
  
  public final void a(Graphics g, int i1, int i2)
  {
	ld localld;
    (localld = fx.a(this.a.a)).a(g, i1 + dp.e / 2, i2 + dp.e / 2, 3);
    je.a(i1 + 3, i2 + dp.e - 3 * gy.Y, dp.e - 5, 2 * gy.Y, 18687, g);
    je.a(i1 + 3, i2 + dp.e - 3 * gy.Y, (this.a.a * (dp.e - 5) / 5054), 2 * gy.Y, 10351357, g);
  }
  
  public final void a()
  {
	if ((dp.n) && (this.b == dp.j))
	{
	hx localhx = new hx();
	ld localld = fx.a(this.a.a);
    dp.n();
   //dp.a(kf.cr + (100 - this.a.b) + "%");
   //dp.a("ID: " + this.a.a);
    String str = "";
    if (localld.j == 20) {
      str = kf.aC;
    } else if (localld.j == 10) {
      str = kf.aB;
    }
    dp.a(str += fx.a(localld));
    if (localld.f != -2)
    {
      int i;
      if (localld.f >= 0) {
        i = ((fa)fx.a(localld.f)).a;
      } else {
        i = ((fa)localld).a;
      }
      dp.a(kf.em[2] + ": " + i);
    }
	}
  }
}