import javax.microedition.lcdui.Graphics;
import main.a;

public class by
{
  public String a;
  public ii b;
  public byte c;
  public gy d;
  public short e = -1;
  
  public by(String paramString, ii paramii)
  {
    this.a = paramString;
    this.b = paramii;
  }
  
  public by(String paramString, int paramInt)
  {
    this.a = paramString;
    this.c = ((byte)paramInt);
  }
  
  public by(String paramString, int paramInt, gy paramgy)
  {
    this.a = paramString;
    this.c = ((byte)paramInt);
    this.d = paramgy;
  }
  
  public by(String paramString, int paramInt1, int paramInt2)
  {
    this.a = paramString;
    this.c = ((byte)paramInt1);
    this.e = ((byte)paramInt2);
  }
  
  public final void b()
  {
    if (this.b != null)
    {
      this.b.a();
      return;
    }
    if (this.d != null)
    {
      this.d.a(this.c);
      return;
    }
    if (im.c)
    {
      im.d().a(this.c, this.e);
      return;
    }
    main.a.r.a(this.c, this.e);
  }
  
  public void a() {}
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    main.a.L.a(paramGraphics, this.a, paramInt1, paramInt2, 2);
//    MenuStart.showIDPlayer(paramGraphics, paramInt1, paramInt2);
  }
}
