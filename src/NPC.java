
public class NPC
  implements Runnable
{
  public byte Map;
  public byte Area;
  public int ID;
  public String Name;
  public short X;
  public short Y;
  public byte Star;
  public short Icon;
  public byte T;
  public short[] Item;
  public boolean Rand = false;
  public String[] Position;
  public String[] Chat;
  public int ChatSt = 0;
  
  public static void sleep(int paramInt)
  {
    try
    {
      Thread.sleep(1000 * paramInt);
    }
    catch (InterruptedException localInterruptedException) {}
  }
  
  public final void run()
  {
//    int i = zw.i;
//    int j = zw.j;
    int k = 0;
    int m = 0;
    while ((this.Map == ir.a)/* && (j == zw.j)*/)
    {
      sleep(3);
      hn localhn;
      if (((localhn = ir.g(this.ID)) != null) && (this.Chat != null))
      {
        ae.b();
        ae.a(localhn.w, this.Chat[this.ChatSt]);
        this.ChatSt += 1;
        if (this.ChatSt >= this.Chat.length) {
          this.ChatSt = 0;
        }
      }
      if ((localhn != null) && (this.Position != null)) {
        if (k == 0)
        {
          String[] arrayOfString;
          if (this.Rand)
          {
            ae.b();
            ae.a(localhn.w, (aw.e(Integer.parseInt((arrayOfString = main.a.K.a(this.Position[0], "."))[0])) + 1) * 24 + 12, (aw.e(Integer.parseInt(arrayOfString[1])) + 1) * 24 + 12, localhn.K == 0 ? gx.J : 0, (short) 0);
          }
          else
          {
            ae.b();
            ae.a(localhn.w, Integer.parseInt((arrayOfString = main.a.K.a(this.Position[m], "."))[0]), Integer.parseInt(arrayOfString[1]), localhn.K == 0 ? gx.J : 0, (short) 0);
            m = (byte)(m + 1);
            if (m >= this.Position.length) {
              m = 0;
            }
          }
          k = (byte)(k + 1);
        }
        else
        {
          k = 0;
        }
      }
    }
  }
}
