import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

import main.GameMidlet;
import main.a;

public class ModHandler implements ii {
	
	int Command;
	public static byte Res = 0;
	public static Vector npc = new Vector();
	public static byte getArea;
	private static String posInfo;
	int LEFT = 0;
	int RIGHT = 1;
	int CENTER = 2;
	
	public ModHandler(int i) {
		this.Command = i;
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
				vector2.addElement(new by("Show Position Info", new ModHandler(25)));
				vector2.addElement(new by("Change Resolution", new ModHandler(6)));
				vector2.addElement(DataSave.isClan ? new by("Stop Logo Image", new ModHandler(4)) : new by("Save Logo Image", new ModHandler(5)));
				vector2.addElement(DataSave.isItem ? new by("Stop Item Image", new ModHandler(12)) : new by("Save Item Image", new ModHandler(10)));
				vector2.addElement(DataSave.isDataItem ? new by("Stop Data Item", new ModHandler(22)) : new by("Save Data Item", new ModHandler(20)));
				vector2.addElement(new by("Request Map Image", new ModHandler(14)));
				vector2.addElement(new by("Request Map Data", new ModHandler(16)));
				vector2.addElement(ce.reqEffImg ? new by("Request EffectObjImg: true", new ModHandler(19)) : new by("Request EffectObjImg: false", new ModHandler(18)));
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
			}
		}catch(Exception e){
			
		}
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
}
