import main.GameMidlet;
import main.a;

final class gf_
  implements ii
{
  private final hx a;
  private final int b;
  
  gf_(hx paramhx, int paramInt1)
  {
    this.a = paramhx;
    this.b = paramInt1;
  }
  
  public final void a()
  {
    ld localld = fx.a(this.a.a);
    String content = "Do you want to get " + fx.a(localld) + " item?";
      main.a.a(content, new gd_(this, this.a));
  }
}
