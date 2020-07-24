import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import main.a;

public final class jv
  extends hj
{
  public static jv a;
  private static int b = 20;
  private static Image c;
  private static Image NoCity;
  
  static
  {
    try
    {
    	aw aw = new aw();
      //c = Image.createImage(kf.a() + "/lg.png");
    	InputStream is = "".getClass().getResourceAsStream("/nocity");
    	DataInputStream dis = new DataInputStream(is);
    	byte[] bArr = new byte[dis.available()];
    	dis.readFully(bArr);
    	NoCity = aw.a(unsigned(bArr));
    }
    catch (IOException localIOException1)
    {
      localIOException1.printStackTrace();
    }
  }
  
  public static jv b()
  {
    if (a == null) {
      return a = new jv();
    }
    return a;
  }
  
  public final void a()
  {
    jy.b = false;
    b = 0;
    if (jy.c != 0) {
      c = hj.am;
    }
    super.a();
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    case 50: 
      b(0);
      return;
    case 51: 
      b(1);
    }
  }
  
  public final void k()
  {
    if (b > 50)
    {
      if (jy.c != 0)
      {
        if (jy.c == 2)
        {
          ae ae = new ae();
          ae.b().a();
          c = null;
          jy.c = 0;
          main.a.S.g();
        }
      }
      else if (b == 51)
      {
    	//main.a.a("Chơi quá 180 phút một ngày sẽ ảnh hưởng xấu đến sức khỏe.");
        es.b().h();
        dm.b().f();
        if (!es.u)
        {
          es.u = true;
          fx.b("avatarSV");
          fx.f();
          b(0);
        }
        else
        {
          fx.f();
          es.b().e();
          if (ez.b() != main.a.r) {
            es.b().a();
          }
          c = null;
        }
      }
    }
    else if ((jy.c != 0) && (b == 0))
    {
      ae ae = new ae();
      ae.b().a();
      c = null;
      jy.c = 0;
      main.a.S.g();
    }
    b += 1;
  }
  
  private static void b(int paramInt)
  {
    main.a.i();
    dm.b().b[4] = paramInt;
    dm.b().b(0);
    es.b().e();
    es.b().a();
    c = null;
  }
  
  private static byte[] unsigned(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      for (int i = 0; i < paramArrayOfByte.length; i++) {
        paramArrayOfByte[i] = ((byte)(paramArrayOfByte[i] ^ 0xFFFFFFFF));
      }
    }
    return paramArrayOfByte;
  }
  
  public final void a(Graphics paramGraphics)
  {
	//System.out.println("b? " + b);
    je.a(0, 0, main.a.a.getWidth(), main.a.a.getHeight(), 0, paramGraphics);
    /*if ((b > 1) && (c != null)) {
      paramGraphics.drawImage(c, main.a.m >> 1, main.a.n >> 1, 3);
    }*/
    if (NoCity != null)
    {
      if (b < 10)
      {
        paramGraphics.drawRegion(NoCity, 0, b / 4 * 54, NoCity.getWidth(), 54, 0, main.a.m >> 1, main.a.n >> 1, 3);
        return;
      }
      if (b < 40)
      {
        paramGraphics.drawRegion(NoCity, 0, 216, NoCity.getWidth(), 54, 0, main.a.m >> 1, main.a.n >> 1, 3);
        return;
      }
      if (b < 50) {
        paramGraphics.drawRegion(NoCity, 0, (50 - b) / 4 * 54, NoCity.getWidth(), 54, 0, main.a.m >> 1, main.a.n >> 1, 3);
      }
    }
    main.a.a(paramGraphics);
  }
}
