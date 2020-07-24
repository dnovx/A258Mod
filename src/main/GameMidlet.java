package main;

import aw;
import ce;
import fx;
import hn;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.io.Connector;
import javax.microedition.io.ContentConnection;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.InputConnection;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import jv;
import kp;
import kt;
import ModHandler;

public class GameMidlet
  extends MIDlet
{
  public static String[][][] a = { { { "Indonesia", "Gaul City" }, { "Avatar City", "Aries" }, { "Vietnam I", "Hoan My", "Dieu Ky"},  { "CityNo100", "TP1", "TP2", "TP3", "TP4" } }, { { "International Server", "Aries City" } } };
  public static String[][][] b = { { { "124.81.71.183" }, { "52.221.247.71" }, { "112.213.85.102",  "112.213.85.101" }, { "sv1.cityno.xyz", "sv2.cityno.xyz", "sv3.cityno.xyz","sv4.cityno.xyz" }},  { { "54.179.92.248" } } };	 
  public static int[][][] c = { { { 19128 }, { 19128 }, { 19128, 19128 }, { 19128, 19128, 19128, 19128 } },  { { 19128 } } };
  public static final String[][] d = { { "http://cityno.xyz/sv.txt", "http://cityno.xyz/sv.txt" }, { "http://teamobi.com/srvips/avatarinterd2.txt", "http://trochoididong.us/srvips/avatarinter_C.txt" } };
  public static int e = 8;
  public static byte f = -1;
  public static String g;
  private static a o;
  public static GameMidlet h;
  public static hn i;
  public static kp j;
  public static Vector k;
  private static Display p;
  public static int l;
  public static String m;
  public static String n;
  
  public GameMidlet() {
      h = this;
      InputStream resourceAsStream = getClass().getResourceAsStream("/provider.txt");
      StringBuffer stringBuffer = new StringBuffer();
      while (true) {
          try {
              int read = resourceAsStream.read();
              if (read == -1) {
                  break;
              }
              stringBuffer.append((char) read);
          } catch (Throwable e) {
              e.printStackTrace();
          }
      }
      f = Byte.parseByte(stringBuffer.toString());
      if (f == (byte) -1) {
          fx.d();
      }
      resourceAsStream = aw.c("/agent.txt");
      stringBuffer = new StringBuffer();
      while (true) {
          try {
              int read = resourceAsStream.read();
              if (read == -1) {
                  break;
              }
              stringBuffer.append((char) read);
          } catch (Exception e2) {
          }
      }
      g = stringBuffer.toString();
      a aVar = new a();
      o = aVar;
      aVar.d();
      i = new hn();
      j = new kp();
      jv.b().a();
      o.sizeChanged(0, 0);
      o.b();
      Display.getDisplay(this).setCurrent(o);
      kt.a().a(ce.a());
      String b = aw.b("avatar");
      if (b == null || !b.equals("2.5.8")) {
          fx.a();
      }
  }

  
  public void destroyApp(boolean paramBoolean)
  {
    h.notifyDestroyed();
  }
  
  public static void a(){
      h.destroyApp(true);
  }

  
  protected void pauseApp() {}
  
  protected void startApp()
  {
    (p = Display.getDisplay(this)).setCurrent(o);
  }
  
  public static void a(String str, String str2) {
      new Thread(new b(str2, str)).start();
  }

  
  public static String a(String str) {
      try {
          HttpConnection httpConnection = (HttpConnection) Connector.open(str);
          httpConnection.setRequestMethod("GET");
          httpConnection.setRequestProperty("Content-Type", "//textMiniMap plain");
          httpConnection.setRequestProperty("Connection", "close");
          if (httpConnection.getResponseCode() != 200) {
              return null;
          }
          String str2 = "";
          InputStream openInputStream = httpConnection.openInputStream();
          int length = (int) httpConnection.getLength();
          if (length == -1) {
              return str2;
          }
          byte[] bArr = new byte[length];
          openInputStream.read(bArr);
          return new String(bArr);
      } catch (IOException e) {
          return null;
      }
  }

  
  public static void b(String str) {
      try {
          h.platformRequest(str);
          h.notifyDestroyed();
      } catch (ConnectionNotFoundException e) {
          e.printStackTrace();
      }
  }

}
