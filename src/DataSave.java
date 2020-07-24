import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;

public class DataSave implements Runnable{
	
	public static int Start;
	public static int Limit;
	public static int Progress = 0;
	public static boolean State = false;
	public static boolean isClan = false;
	public static boolean showStat = false;
	public static boolean isItem = false;
	public static boolean isDataItem = false;
	
	public DataSave(int start, int limit, boolean state) {
		Start  = start;
		Limit  = limit;
		State = state;
		if(isClan){
			ce.doGetClan = true;
		}
		else if(isItem){
			ce.doGetItem = true;
		}
		else if(isDataItem){
			ce.doGetDataItem = true;
		}
		new Thread(this).start();
	}
	
	public static void doDataSave(byte[] arr, String string) {
		// TODO Auto-generated method stub
		try
	    {
	      FileConnection localFileConnection = ModHandler.Res == 0? (FileConnection)Connector.open(ce.doGetDataItem ? "file:///e/DataItemServer/" + string : "file:///e/" + string, Connector.READ_WRITE) : (FileConnection)Connector.open("file:///e/" + string);
	      System.out.println("Saving>> " + string);
	      if (!localFileConnection.exists()) {
	        localFileConnection.create();	      
	      }
	      OutputStream out = localFileConnection.openOutputStream(localFileConnection.fileSize());
	      PrintStream printStream = new PrintStream(out);
	      printStream.print(new String(arr));
//	      out.close();
//	      localFileConnection.close();
//	      OutputStream localOutputStream = localFileConnection.openOutputStream();
//	      localOutputStream.write(arr);
//	      localOutputStream.flush();
//	      localOutputStream.close();
	    }
	    catch (IOException localIOException)
	    {
	      localIOException.printStackTrace();
	    }
	}

	public static void doSaveClan(byte[] arr, String string) {
		// TODO Auto-generated method stub
		try
	    {
	      FileConnection localFileConnection = ModHandler.Res == 0? (FileConnection)Connector.open("file:///e/clan/" + string) : (FileConnection)Connector.open("file:///e/clan/hd/" + string);
	      System.out.println("Saving>> " + string);
	      if (!localFileConnection.exists()) {
	        localFileConnection.create();
	      }
	      OutputStream localOutputStream = localFileConnection.openOutputStream();
	      localOutputStream.write(arr);
	      localOutputStream.flush();
	      localOutputStream.close();
	    }
	    catch (IOException localIOException)
	    {
	      localIOException.printStackTrace();
	    }
	}

	public void run() {
		// TODO Auto-generated method stub
		if (isClan) {
			showStat = true;
			for (Progress = Start; Progress < Limit; Progress++)
				{
					iy.a().b((short)Progress);
						if (!State) {
							break;
						}
						try
						{
							Thread.sleep(10L);
						}
						catch (InterruptedException localInterruptedException) {}
				}
			//ce.doGetClan = false;
			isClan = false;
			showStat = false;
			main.a.b("Saving Clan Success...");
		}
		else if (isItem) {
			showStat = true;
			for (Progress = Start; Progress < Limit; Progress++)
				{
					cx.a().c((short)Progress);
						if (!State) {
							break;
						}
						try
						{
							Thread.sleep(10L);
						}
						catch (InterruptedException localInterruptedException) {}
				}
			//ce.doGetItem = false;
			isItem = false;
			showStat = false;
			main.a.b("Saving Item Success...");
		}
		else if (isDataItem) {
			showStat = true;
			for (Progress = Start; Progress < Limit; Progress++)
				{
					cx.a().b((short)Progress);
						if (!State) {
							break;
						}
						try
						{
							Thread.sleep(10L);
						}
						catch (InterruptedException localInterruptedException) {}
				}
			//ce.doGetDataItem = false;
			isDataItem = false;
			showStat = false;
			main.a.b("Saving Data Item Success...");
		}
	}

	public static void doSaveItem(byte[] arr, String string) {
		// TODO Auto-generated method stub
		try
	    {
		  FileConnection localFileConnection = ModHandler.Res == 0? (FileConnection)Connector.open("file:///e/item/" + string) : (FileConnection)Connector.open("file:///e/item/hd/" + string);
		  System.out.println("Saving>> " + string);
	      if (!localFileConnection.exists()) {
	        localFileConnection.create();
	      }
	      OutputStream localOutputStream = localFileConnection.openOutputStream();
	      localOutputStream.write(arr);
	      localOutputStream.flush();
	      localOutputStream.close();
	    }
	    catch (IOException localIOException)
	    {
	      localIOException.printStackTrace();
	    }
	}
	
	public static void doSaveTile(byte[] arr, String string) {
		// TODO Auto-generated method stub
		try
	    {
		  FileConnection localFileConnection = ModHandler.Res == 0? (FileConnection)Connector.open("file:///e/tile/" + string) : (FileConnection)Connector.open("file:///e/tile/hd/" + string);
		  System.out.println("Saving>> " + string);
	      if (!localFileConnection.exists()) {
	        localFileConnection.create();
	      }
	      OutputStream localOutputStream = localFileConnection.openOutputStream();
	      localOutputStream.write(arr);
	      localOutputStream.flush();
	      localOutputStream.close();
	    }
	    catch (IOException localIOException)
	    {
	      localIOException.printStackTrace();
	    }
	}
	
	public static void doSaveDataMap(byte[] arr, String string) {
		// TODO Auto-generated method stub
		try
	    {
		  FileConnection localFileConnection = ModHandler.Res == 0? (FileConnection)Connector.open("file:///e/dataMap/" + string) : (FileConnection)Connector.open("file:///e/dataMap/hd/" + string);
		  System.out.println("Saving>> " + string);
	      if (!localFileConnection.exists()) {
	        localFileConnection.create();
	      }
	      OutputStream localOutputStream = localFileConnection.openOutputStream();
	      localOutputStream.write(arr);
	      localOutputStream.flush();
	      localOutputStream.close();
	    }
	    catch (IOException localIOException)
	    {
	      localIOException.printStackTrace();
	    }
	}
	
	public static void doSaveEffObjImg(byte[] arr, String string) {
		// TODO Auto-generated method stub
		try
	    {
		  FileConnection localFileConnection = ModHandler.Res == 0? (FileConnection)Connector.open("file:///e/EffectObj/" + string) : (FileConnection)Connector.open("file:///e/EffectObj/hd/" + string);
		  System.out.println("Saving>> " + string);
	      if (!localFileConnection.exists()) {
	        localFileConnection.create();
	      }
	      OutputStream localOutputStream = localFileConnection.openOutputStream();
	      localOutputStream.write(arr);
	      localOutputStream.flush();
	      localOutputStream.close();
	    }
	    catch (IOException localIOException)
	    {
	      localIOException.printStackTrace();
	    }
	}
	
	public static void readAvatarPart(byte[] array, boolean isSimple)
	{
	  try {
		ByteArrayInputStream bArr = new ByteArrayInputStream(array);
		DataInputStream dataInputStream = new DataInputStream(bArr);
		short num = 1;
		if (!isSimple)
		{
			num = dataInputStream.readShort();
		}
		//MyVector myVector = new MyVector();
		for (int i = 0; i < (int)num; i++)
		{
			short idpart = dataInputStream.readShort();
			int num2 = dataInputStream.readInt();
			int num3 = (int)dataInputStream.readShort();
			short num4 = dataInputStream.readShort();
			if (num4 == -2)
			{
				//PartSmall partSmall = new PartSmall();
				short IDPart = idpart;
				int Coin = num2;
				int Gold = num3;
				int PartFollow = num4;
				String Name = dataInputStream.readUTF();
				byte Sell = dataInputStream.readByte();
				short IDIcon = dataInputStream.readShort();
				//myVector.addElement(partSmall);
				byte[] PartSmall = ("ID: " + IDPart +"|Name: "+Name+"|Coin: " + Coin +"|Gold: "+Gold+"|Follow: " + PartFollow + "|Sell: "+ Sell + "|IDIcon: " + IDIcon+ "\n").getBytes("UTF-16");
				//String PartSmallUTF8 = new String(PartSmall, "UTF-8");
				DataSave.doDataSave(PartSmall, "PartSmall.data");
			}
			else if (num4 == -1)
			{
				//APartInfo apartInfo = new APartInfo();
				short IDPart = idpart;
				int Coin = num2;
				int Gold = num3;
				int PartFollow = num4;
				String Name = dataInputStream.readUTF();
				byte Sell = dataInputStream.readByte();
				byte zOrder = dataInputStream.readByte();
				byte Gender = dataInputStream.readByte();
				byte Level = dataInputStream.readByte();
				short IDIcon = dataInputStream.readShort();
				short[] imgID = new short[15];
				byte[] dx = new byte[15];
				byte[] dy = new byte[15];
				for (int j = 0; j < 15; j++)
				{
					imgID[j] = dataInputStream.readShort();
					dx[j] = dataInputStream.readByte();
					dy[j] = dataInputStream.readByte();
				}
				//myVector.addElement(apartInfo);
				byte[] APartInfo = ("ID: " + IDPart +"|Name: "+Name+"|Coin: " + Coin +"|Gold: "+Gold+"|Follow: " + PartFollow + "|Sell: "+ Sell +"|zOrder: "+zOrder+"|Gender: "+Gender+"|Level: "+Level + "|IDIcon: " + IDIcon+ "\n").getBytes("UTF-16");
				//String APartInfoUTF8 = new String(APartInfo, "UTF-8");
				DataSave.doDataSave(APartInfo, "AvatarPartInfo.data");
			}
			else
			{
				//PartFollow partFollow = new PartFollow();
				int IDPart = idpart;
				int	Coin = num2;
				int Gold = num3;
				int PartFollow = num4;
				short Color = dataInputStream.readShort();
				//myVector.addElement(partFollow);
				byte[] PartFllw = ("ID: " + IDPart +"|Coin: " + Coin +"|Gold: "+Gold+"|Follow: " + PartFollow + "|Color: "+Color+ "\n").getBytes("UTF-16");
				//String PartFollowUTF8 = new String(PartFllw, "UTF-8");
				DataSave.doDataSave(PartFllw, "PartFollow.data");
			}
		}
	  }catch(IOException e){
		  
	  }
	}
	
	public static void readItemDataInfo(byte[] arr)
	{
		try {
			ByteArrayInputStream bArr = new ByteArrayInputStream(arr);
			DataInputStream dataInputStream = new DataInputStream(bArr);
			short num = dataInputStream.readShort();
			//AvatarData.listItemInfo = new MyVector();
			for (int i = 0; i < (int)num; i++)
			{
			//Item item = new Item();
				short ID = dataInputStream.readShort();
				String name = dataInputStream.readUTF();
				String des = dataInputStream.readUTF();
				int Coin = dataInputStream.readInt();
				byte ShopType = dataInputStream.readByte();
				short IDIcon = dataInputStream.readShort();
				//AvatarData.listItemInfo.addElement(item);
				byte[] ItemInfo = ("ID: " + ID +"|Name: " + name +"|Coin: "+Coin+"|ShopType: " + ShopType + "|IDIcon: "+IDIcon+"|Desc: " + des + "\n").getBytes("UTF-16");
				DataSave.doDataSave(ItemInfo, "FoodItem.data");
			}
		}catch(IOException e){
		
		}
	}
}


