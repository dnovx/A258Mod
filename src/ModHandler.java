import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;

import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.ContentConnection;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.InputConnection;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.rms.RecordStore;

import main.GameMidlet;
import main.a;

public class ModHandler implements ii, Runnable {
	
	int Command;
	public static byte Res = 0;
	public static Vector npc = new Vector();
	public static byte getArea;
	private static String posInfo;
	public static boolean kickHit;
	private static String cookie = null;
	int LEFT = 0;
	int RIGHT = 1;
	int CENTER = 2;
	private byte Thread;
	private String key = "null";
	private static RecordStore rs = null;
	
	public ModHandler(int i) {
		this.Command = i;
	}
	
	public ModHandler(byte b) {
		this.Thread = b;
	}
	

	public static void doOpen(Graphics paramGraphics) {
		// TODO Auto-generated method stub
		if (main.a.r  == ae.b()) {
			ae.b().H = new by(kf.c, new ModHandler(0));
			ae.b().ac = new by(kf.c, new ModHandler(0));
			showStatus(paramGraphics);
		} /*else if (main.a.r == ea.b()) {

		}*/
	}

	private static void showStatus(Graphics paramGraphics) {
		// TODO Auto-generated method stub
		if(DataSave.showStat) {
			main.a.L.a(paramGraphics, "Running: " + DataSave.Progress +"/"+ DataSave.Limit, main.a.af.a / 2,  40, 2);
		}else if(ae.h!= null) {
			main.a.L.a(paramGraphics, String.valueOf(ae.h.w), a.af.a, a.n / 8 * 7 , a.af.c);
		}
//		main.a.L.a(paramGraphics, "#", 15, a.af.b + 50, a.af.c);
//		main.a.L.a(paramGraphics, "$", 15, a.af.b + 60, a.af.c);
//		main.a.L.a(paramGraphics, jr.in, 35, a.af.b + 60, a.af.c);
//		main.a.L.a(paramGraphics, jr.out, 35, a.af.b + 50, a.af.c);
	}
	
//	public static void showIDPlayer(Graphics g, int i, int i2) {
//		if(ae.h!= null) {
//			main.a.L.a(g, "ID Player: " + ae.h.w, i,  i2 + 50, 2);
//		}
//	}

	public void a() {
		// TODO Auto-generated method stub
		try {
			switch (this.Command){
			case 0:
				short[] arr = {2, 10430, 3, 10360};
				for (int i = 0; i < arr.length; i++) {
					int randomIndexToSwap = aw.e(arr.length);
					short temp = arr[randomIndexToSwap];
					arr[randomIndexToSwap] = arr[i];
					arr[i] = temp;
				}
				Vector vector = new Vector();
				vector.addElement(new by("Chức năng          ", new ModHandler(13)));
				vector.addElement(new by("Tools          ", new ModHandler(2)));
				vector.addElement(new by("About          ", new ModHandler(17)));
				vector.addElement(new by("Logout          ", new ModHandler(24)));
				vector.addElement(new by(kf.x, new ModHandler(1)));
				le Le;
			    (Le =le.a()).a(vector, this.LEFT);
			       	if ((le.h = arr) != null) {
			        	Le.c += Le.e;
			        }
				break;
			case 1:
				ae.b().e();
				break;
			case 2:
				Vector vector2 = new Vector();
				vector2.addElement(new by("Do Use Item", new ModHandler(33)));
				vector2.addElement(jr.showOut ? new by("Print Byte Out (ON)", new ModHandler(31)) : new by("Print Byte Out (OFF)", new ModHandler(32)));
				vector2.addElement(jr.showIn ? new by("Print Byte In (ON)", new ModHandler(29)) : new by("Print Byte In (OFF)", new ModHandler(30)));
				vector2.addElement(new by("List Item", new ModHandler(34)));
				vector2.addElement(kickHit ? new by("Kick Hit (ON)", new ModHandler(26)) : new by("Kick Hit (OFF)", new ModHandler(27)));
				vector2.addElement(new by("Show Position Info", new ModHandler(25)));
				vector2.addElement(new by("Change Resolution", new ModHandler(6)));
				vector2.addElement(DataSave.isClan ? new by("Stop Logo Image", new ModHandler(4)) : new by("Save Logo Image", new ModHandler(5)));
				vector2.addElement(DataSave.isItem ? new by("Stop Item Image", new ModHandler(12)) : new by("Save Item Image", new ModHandler(10)));
				vector2.addElement(DataSave.isDataItem ? new by("Stop Data Item", new ModHandler(22)) : new by("Save Data Item", new ModHandler(20)));
				vector2.addElement(new by("Request Map Image", new ModHandler(14)));
				vector2.addElement(new by("Request Map Data", new ModHandler(16)));
				vector2.addElement(ce.reqEffImg ? new by("Request EffectObjImg (ON)", new ModHandler(19)) : new by("Request EffectObjImg (OFF)", new ModHandler(18)));
				le.a().a(vector2, this.LEFT);
				break;
			case 3:
				if(read().equals("")) {
					return;
				}
				try {
					String[] stringArray = main.a.K.a(read(), ".");
					int s = Integer.parseInt(stringArray[0]);
					int l = Integer.parseInt(stringArray[1]);
					DataSave.isClan = true;
					new DataSave(s, l, true);
					main.a.b("Saving Logo started!");
				}catch(Exception e) {
					main.a.b(e.getMessage());
				}
				break;
			case 4:
				DataSave.isClan = false;
				new DataSave(0, 0, false);
				main.a.b("Saving Logo stopped");
				break;
			case 5:
				main.a.u.a("Usage: start.limit", new ModHandler(3), 0);
				break;
			case 6:
				Vector vector3 = new Vector();
				vector3.addElement(Res == 0 ? new by("Turn On HD", new ModHandler(8)) : new by("Turn On Normal", new ModHandler(7)));
				le.a().a(vector3, this.LEFT);
				break;
			case 7:
				Res = 0;
				main.a.a("Resolution changed\nPlease re-login!", new ModHandler(9));
				break;
			case 8:
				Res = 1;
				main.a.a("Resolution changed\nPlease re-login!", new ModHandler(9));
				break;
			case 9:
				ae.w();
				break;
			case 10:
				main.a.u.a("Usage: start.limit", new ModHandler(11), 0);
				break;
			case 11:
				if(read().equals("")) {
					return;
				}
				try {
					String[] stringArray = main.a.K.a(read(), ".");
					int s = Integer.parseInt(stringArray[0]);
					int l = Integer.parseInt(stringArray[1]);
					DataSave.isItem = true;
					new DataSave(s, l, true);
					main.a.b("Saving Item started!");
				}catch(Exception e) {
					main.a.b(e.getMessage());
				}
				break;
			case 12:
				DataSave.isItem = false;
				new DataSave(0, 0, false);
				main.a.b("Saving Item stopped");
				break;
			case 13:
				cx.a().h(0);
				break;
			case 14:
				//main.a.u.a("Byte Map Request", new MenuStart(15), 0);
				main.a.b("Request Tile Map is On");
				ce.getTileMap = true;
				break;
			case 15:
				if(read().equals("")) {
					return;
				}
				try {
					byte tileMap = Byte.parseByte(read());
					cx.a().d(tileMap);
					main.a.b("Getting Image..");
					ce.getTileMap = true;
				}catch(Exception e) {
					main.a.b(e.getMessage());
				}
				break;
			case 16:
				main.a.b("Getting Data");
				ce.getDataMap = true;
				break;
			case 17:
				String content1 = "ę2Welcome, "+GameMidlet.i.x+ "\nę2Xin chào, "+GameMidlet.i.x+ ".µ0,17,0µ\nĘę2Version:\nę21.0.4";
				String content2 = "";
				Hashtable localHashtable = new Hashtable();
				try {
					Image img = Image.createImage(kf.a() + "/l.png");
					localHashtable.put("0", img);
				}catch(IOException e){
					e.printStackTrace();
				}
				jb.a = null;
		        jb.b().a(localHashtable, "About", content1, (byte)-1);
		        jb.b().a();
				break;
			case 18:
				main.a.b("Request EffObjImg On");
				ce.reqEffImg = true;
				break;
			case 19:
				main.a.b("Request EffObjImg Off");
				ce.reqEffImg = false;
				break;
			case 20:
				main.a.u.a("Usage: start.limit", new ModHandler(21), 0);
				break;
			case 21:
				if(read().equals("")) {
					return;
				}
				try {
					String[] stringArray = main.a.K.a(read(), ".");
					int s = Integer.parseInt(stringArray[0]);
					int l = Integer.parseInt(stringArray[1]);
					DataSave.isDataItem = true;
					new DataSave(s, l, true);
					main.a.b("Saving Data Item started!");
				}catch(Exception e) {
					main.a.b(e.getMessage());
				}
				break;
			case 22:
				DataSave.isItem = false;
				new DataSave(0, 0, false);
				main.a.b("Saving Item stopped");
				break;
			case 23:
		        cw localcw = new cw("Giới thiệu", 0, null, null, false);
		        localcw.a = true;
		        hc.b().b(localcw);
		        localcw.a("Mod Avatar này được tạo để lấy một số dữ liệu Avatar\n\n\n\n\n\nTrân trọng\nCityNo.XYZ\n2020");
				//hc.b().a(999, "Modifers", "Hello bos");
		        break;
			case 24:
				ae.w();
				break;
			case 25:
				if (ae.h == null) {
					posInfo = "ę2Coordinates\nę0X: " + GameMidlet.i.aw + "\nę0Y: " + GameMidlet.i.ax + "\n";
					setTab(new Hashtable(), posInfo.substring(2, 15), posInfo);
				}
				String str = "ę2Coordinates\nę0X: " + GameMidlet.i.aw + "\nę0Y: " + GameMidlet.i.ax + "\n\n\n" +"0ID: " + "ę0" +ae.h.w + "\nĘę0X: " + ae.h.aw + "\nĘę0Y: " + ae.h.ax;
				setTab(new Hashtable(), "Position Info", str);
				break;
			case 26:
				if (kickHit) {
					kickHit = false;
				}
				main.a.b("Kick Player Hit Me is Off");
				break;
			case 27:
				kickHit = true;
				main.a.b("Kick Player Hit Me");
				break;
			case 28:
			    if (a.r == cd.a) {
			        return;
			    }
			    //dp.b().m = true;
				dp.b().a(new String[] { "Item From Data", "Item From Server" }, new Vector[] { getItemFromData(), getItemFromServer() }, (Vector) null);
				if (a.r != dp.b()) {
			        dp.b().a();
			    }
				break;
			case 29:
				jr.showIn = false;
				main.a.b("Print Byte in (OFF)");
				break;
			case 30:
				jr.showIn = true;
				main.a.b("Print Byte in (ON)");
				break;
			case 31:
				jr.showOut = false;
				main.a.b("Print Byte out (OFF)");
				break;
			case 32:
				jr.showOut = true;
				main.a.b("Print Byte out (ON)");
				break;
			case 33:
				try {
				 dx[] arrayOfdx = new dx[2];
				 for (int i = 0; i < arrayOfdx.length; i++) {
					 arrayOfdx[i] = new dx();
					 arrayOfdx[i].d(1);
				 }
				 arrayOfdx[0].a(true);
		         String[][] listTf = {{"Enter the", "Item ID"}, {"Enter the", "Type Chest"}};
		         by command = new by(kf.cy, new ch_(arrayOfdx));
		         hi.b().a(arrayOfdx, "Do Using Item", listTf, command);
		         hi.b().a();
				}catch(Exception e){
					e.printStackTrace();
				}
				break;
			case 34:
				main.a.d("Please wait");
				load((byte)0);
				break;
			case 35:
				load((byte)1);
			}
		}catch(Exception e){
			
		}
	}
	
	private void checkCaptcha() {
		readCookie();
		if(read().equals("")) {
			a.s.a("Fill the captcha!", new by("OK", new ModHandler(34)), null);
			return;
		}
		key = read();
		try {
			String result = doCookieConnection("c?k=" + key);
			System.out.println(result);
			if(result.startsWith("B")) {
				new ModHandler(28).a();
				//a.v = null;
			}
			else {
				a.s.a(result, new by("OK", new ModHandler(34)), null);
			}
		}catch(Exception e){
				e.printStackTrace();
			}
	}
		
	private void getCaptchaData() {
		openRecord();
		try {
			byte[] png = connectCookie("captcha");
			a.u.a("Enter the captcha", new ModHandler(35), 0);
			if (png.length != -1) {
				a.u.a(Image.createImage(png, 0, png.length));
				closeRecord();
			}
		}catch(Exception e){
				e.printStackTrace();
			}
		}
	
	public static byte[] connectCookie(String str) {
		//System.out.println(str);
	    try
	    {
	      HttpConnection http = null;
	      (http = (HttpConnection)Connector.open("http://novx.xyz/" + str)).setRequestMethod(HttpConnection.GET);;
	      http.setRequestProperty("Connection", "keep-alive");
	      if (http.getResponseCode() == HttpConnection.HTTP_OK)
	      {
		    String server_cookie = http.getHeaderField("set-cookie");
		    if(rs == null){
		    	System.out.println("write cookie: "+ server_cookie);
		    	writeRecord(server_cookie);
		    	cookie = server_cookie;
		    }
		    System.out.println("set cookie: "+ server_cookie);
		    setRecord(server_cookie);
		    cookie = server_cookie;
	    	InputStream is = http.openInputStream();
	    	DataInputStream dis = new DataInputStream(is);
	        int length = (int)http.getLength();
	        byte[] arr = null;
	        if (length != -1)
	        {
	          arr = new byte[length];
	          dis.readFully(arr);
	        }
	        dis.close();
	        return arr;
	      }
	      a.b("Connection Failed");
	    }
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	    return null;
	}

	public static String doCookieConnection(String paramString)
	  {
		System.out.println(paramString);
	    try
	    {
	      HttpConnection con = (HttpConnection)Connector.open("http://novx.xyz/" + paramString);
	      con.setRequestMethod("GET");
	      if(cookie != null){
	    	  con.setRequestProperty("cookie", cookie);
	      }
	      System.out.println("Client cookie: " + cookie);
	      con.setRequestProperty("Connection", "close");
	      if (con.getResponseCode() == 200)
	      {
	        String str = "";
	        int length;
	        InputStream localInputStream = con.openInputStream();
	        if ((length = (int)con.getLength()) != -1)
	        {
	          byte[] arr = new byte[length];
	          localInputStream.read(arr);
	          str = new String(arr);
	        }
	        return str;
	      }
	    }
	    catch (IOException localIOException)
	    {
	      return null;
	    }
	    return null;
	  }

	  
	public static void openRecord(){
	  try{
		  rs = RecordStore.openRecordStore("cookies", true);
	  }catch(Exception e){}
	}
	
	public static void closeRecord(){
	  try{
		  rs.closeRecordStore();
	  }catch(Exception e){}
	}
	
	public static void writeRecord(String str) {
		byte[] rec = str.getBytes();
		try{
		  rs.addRecord(rec, 0, rec.length);
		}catch(Exception e){}
	}
	
	public static void setRecord(String str) {
		byte[] rec = str.getBytes();
		try {
			rs.setRecord(1, rec, 0, rec.length);
		}catch(Exception e){
			
		}
	}
	
	public static void readCookie(){
		try{
			byte[] recData = new byte[25]; 
			int len;
			if(rs.getNumRecords() > 0){
				if (rs.getRecordSize(1) > recData.length){
					recData = new byte[rs.getRecordSize(1)];
				}
				len = rs.getRecord(1, recData, 0);
				cookie = new String(recData);
			}
	  } catch(Exception e){}
	}

	private Vector getItemFromData() {
		Vector vector = new Vector();
		hx var7;
		short[] item = new short[703];//{2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010};
		for (int i = 0; i< item.length; i++) {
			item[i] = (short)i;
			ld var8 = fx.a((var7 = new hx()).a = item[i]);
			//fz var6 = new fz_(this, "doAction", (ii) null, var7, 1, -1);
			fz_ var6 = new fz_("Get Item", new gf_(var7, -1), var7, i);
			vector.addElement(var6);
		}
		System.gc();
		return vector;
	}
		
	private Vector getItemFromServer() {
		Vector vector = new Vector();
		hx var7;
		//short[] item = new short[5050];//{2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010};
		for (int i = 0; i< 3054; i++) {
			//item[i] = (short)i;
			ld var8 = fx.a((var7 = new hx()).a = (short) (2000+i));
			//fz var6 = new fz_(this, "doAction", (ii) null, var7, 1, -1);
			fz_ var6 = new fz_("Get Item", new gf_(var7, -1), var7, i);
			vector.addElement(var6);
		}
		System.gc();
		return vector;
	}
	
	public static String read(){
		return main.a.u.a();
	}
	
    public static void NPC() {
    	for(int k = 0; k < npc.size(); k++) {
    		NPC localNPC = (NPC)npc.elementAt(k);
    		if (ir.a == localNPC.Map && (localNPC.Area == -1 || getArea == localNPC.Area)) {
    			new Thread(localNPC).start();
    		    hn localhn;
    		    (localhn = new hn()).w = localNPC.ID;
    		    localhn.a(localNPC.Name);
    		    for (int j = 0; j < localNPC.Item.length; j++) {
    		      localhn.a(new hx(localNPC.Item[j]));
    		    }
    		    localhn.aw = localhn.C = localNPC.X;
    		    localhn.ax = localhn.D = localNPC.Y;
    		    localhn.ac = localNPC.Star;
    		    localhn.X = localNPC.Icon;
    		    ir.b(localhn);
    		}
    	}
    }

    public static void setNPC(String str) {
        String[] arrayOfString1 = main.a.K.a(str, "\n");
        npc  = new Vector();
        for (int k = 0; k < arrayOfString1.length; k++)
        {
          String[] arrayOfString2 = main.a.K.a(arrayOfString1[k], "|");
          NPC localNPC;
          (localNPC = new NPC()).Map = ((byte)Integer.parseInt(arrayOfString2[0]));
          localNPC.Area = ((byte)Integer.parseInt(arrayOfString2[1]));
          localNPC.ID = ((int)Long.parseLong(arrayOfString2[2]));
          localNPC.Name = arrayOfString2[3];
          localNPC.X = ((short)Integer.parseInt(arrayOfString2[4]));
          localNPC.Y = ((short)Integer.parseInt(arrayOfString2[5]));
          localNPC.Rand = arrayOfString2[6].equals("1");
          localNPC.Position = (arrayOfString2[7].equals("-") ? null : main.a.K.a(arrayOfString2[7], "-"));
          String[] arrayOfString3 = main.a.K.a(arrayOfString2[8], ".");
          localNPC.Item = new short[arrayOfString3.length];
          for (int m = 0; m < arrayOfString3.length; m++) {
            localNPC.Item[m] = ((short)Integer.parseInt(arrayOfString3[m]));
          }
          localNPC.T = ((byte)Integer.parseInt(arrayOfString2[9]));
          localNPC.Star = Byte.parseByte(arrayOfString2[10]);	//star
          localNPC.Icon = Short.parseShort(arrayOfString2[11]);	//icon
          localNPC.Chat = main.a.K.a(arrayOfString2[12], "`");	//npc chat
          npc.addElement(localNPC);
        }
    }
    
    public static void setTab(Hashtable h, String title, String content) {
    	jb.a = null;
    	jb.b().a(h, title, content, (byte)-1);
    	jb.b().a();
    }
    
    public static void load(byte b) {
    	new Thread(new ModHandler(b)).start();
    }

	public void run() {
		switch(this.Thread){
		case 0:
			getCaptchaData();
			break;
		case 1:
			checkCaptcha();
			break;
		}
	System.gc();
	}
}
