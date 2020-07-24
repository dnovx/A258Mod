import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class jr
{
  public byte a;
  private ByteArrayOutputStream b = null;
  private DataOutputStream c = null;
  private ByteArrayInputStream d = null;
  private DataInputStream e = null;
  public static boolean doGetClan = false;
  public static boolean doGetItem = false;
  public static boolean getTileMap = false;
  public static boolean getDataMap = false;
  
  public jr() {}
  
  public jr(byte paramByte)
  {
    this.a = paramByte;
    this.b = new ByteArrayOutputStream();
    this.c = new DataOutputStream(this.b);
    //System.out.println("Out>> " + this.a);
  }
  
  public jr(byte paramByte, byte[] paramArrayOfByte)
  {
    this.a = paramByte;
    this.d = new ByteArrayInputStream(paramArrayOfByte);
    this.e = new DataInputStream(this.d);
    //dataIn(this.a);
    //System.out.println("IN>> " + this.a);
  }
  
  public final void dataIn(int paramInt)
  {
    try
    {
      switch (paramInt)
      {
      case -80:
    	  if (doGetClan)
          {
            short itemID = this.e.readShort();
            int length = this.e.readShort();
            byte[] arr = new byte[length];
            this.e.read(arr);
            DataSave.doSaveClan(arr, itemID + ".png");
            this.a = -100;
          }
          return;
      case -93:
    	  if (getDataMap)
          {
    		 byte idMap = this.e.readByte();
    		 byte idTileImg = this.e.readByte();
    		 short unknown = this.e.readShort();
    		 byte wMap = this.e.readByte();
    		 int dataLength = (int)this.e.readShort();
			 byte[] map = new byte[dataLength];
			 this.e.read(map);
			 DataSave.doSaveDataMap(map, idMap+"_"+idTileImg+"_"+unknown+"_"+wMap + ".data");
			 this.a = -100;
			 getDataMap = false;
          }
          return;
      case -94:
    	  if (getTileMap)
          {
            byte tileID = this.e.readByte();
            int length = this.e.available();
            byte[] arr = new byte[length];
            this.e.read(arr);
            DataSave.doSaveTile(arr, tileID + ".png");
            this.a = -100;
            getTileMap = false;
          }
          return;
      case -98:
    	  if (doGetItem)
          {
            short itemID = this.e.readShort();
            int length = this.e.readShort();
            byte[] arr = new byte[length];
            this.e.read(arr);
            DataSave.doSaveItem(arr, itemID + ".png");
            this.a = -100;
          }
          return;
      }
    }catch(Exception e){
    	}
    }
  
  public final byte[] a()
  {
    return this.b.toByteArray();
  }
  
  public final DataInputStream b()
  {
    return this.e;
  }
  
  public final DataOutputStream c()
  {
    return this.c;
  }
  
  public final void d()
  {
    try
    {
      if (this.e != null) {
        this.e.close();
      }
      if (this.c != null)
      {
        this.c.close();
        return;
      }
    }
    catch (IOException localIOException) {}
  }
}