import main.GameMidlet;
import main.a;

final class gf
  implements ii
{
  private final hx a;
  private final int b;
  private final int c;
  private final int d;
  
  gf(ae paramae, hx paramhx, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramhx;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public final void a()
  {
    ld localld = fx.a(this.a.a);
    if ((this.b == GameMidlet.i.w) /*&& ((fx.c((int)localld.j))*/ || (this.c != 0)) {
      main.a.a(kf.es[this.c], new gd(this, this.c, this.d, this.a));
    }
  }
}
