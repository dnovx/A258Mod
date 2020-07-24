import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;
import main.GameMidlet;
import main.a;
import ae;

public final class ea extends hj {
   public static ea a;
   private ht p;
   public ht b;
   private byte[] q;
   private Vector r;
   private byte s;
   private byte t;
   private byte u = 16;
   public int c;
   public int d;
   private static Image v;
   private static Image w;
   public int e;
   private static int x;
   public static int f;
   private static int y;
   private static int z;
   private static int A;
   private static int B;
   public static int g;
   private static int C;
   private static int D;
   private static int E;
   public ii h;
   public static String i;
   private boolean F;
   public static boolean j = false;
   public static Image[] k = new Image[2];
   private static Vector G = new Vector();
   private static ht H;
   public by l;
   private by I;
   private int J;
   private int K;
   private int L;
   private int M;
   boolean m = false;
   private int N;
   private int O;
   private long P;
   private long Q;
   public static ii n;
   public static byte o;

   public static ea b() {
      return a == null?(a = new ea()):a;
   }

   public final void a() {
      super.a();
      if(!jn.a) {
         main.a.h();
      }

      if(ir.y != -1) {
         main.a.h();
      }

      super.ac = this.l;
      if(main.a.I) {
         (main.a.D = new bb()).a();
         super.ac = null;
      } else if(hj.as > 0 || o == 1) {
    	  hc.b().a(main.a.r);
      }

      if(main.a.J == 0) {
         main.a.J = 1;
      }

      main.a.B.removeAllElements();
      this.g();
      ae ae = new ae();
      ae.G = -1;
   }

   public ea() {
	  c c = new c();
      c.b(kf.aw);
      this.b = ht.a("up", 13 * gy.Y, 11 * gy.Y);
      c.a();
      c.b(kf.av);
      v = c.a("sIc");
      w = c.a("b_p");
      c.a();
      this.l = new by(kf.c, 0);
      super.ac = this.l;
   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case 0:
         if(main.a.D == null || !bb.d) {
            Vector var3 = new Vector();
            if(n != null) {
               var3.addElement(new by("Đăng ký", n));
            }

            if(main.a.Z == 0) {
            	ae ae = new ae();
               var3.addElement(ae.b().f);
            }

            var3.addElement(new by(kf.ab, 1));
            var3.addElement(new by(kf.cw, 2));
            if(!es.w) {
               var3.addElement(new by(kf.cx, 3));
            }

            var3.addElement(new by(kf.cF, 4));
            var3.addElement(new by(kf.cJ, 5));
            var3.addElement(new by(kf.x, 6));
            le.a().a(var3, 0);
         }

         return;
      case 1:
    	  ae ae = new ae();
         ae.b().a();
         H = null;
      default:
      }
   }

   public final void d(int var1, int var2) {
      switch(var1) {
      case 1:
         dm.b().a();
         return;
      case 2:
         cx.a().a((byte)6, "");
         return;
      case 3:
    	  ae ae = new ae();
         ae.b().u();
         return;
      case 4:
         Form var5 = new Form(kf.cG);
         TextField var6 = new TextField(kf.cH, "", 50, 3);
         var5.append(var6);
         var5.append(kf.cI);
         Command var3 = new Command(kf.z, 4, 1);
         var5.addCommand(var3);
         Command var4 = new Command(kf.d, 2, 1);
         var5.addCommand(var4);
         var5.setCommandListener(new fs(this, var3, var6));
         Display.getDisplay(GameMidlet.h).setCurrent(var5);
         return;
      case 5:
         cx.a().a((byte)3, "");
         return;
      case 6:
    	  ae aez = new ae();
         aez.b().v();
         return;
      case 7:
         bb.h();
         (main.a.D = new bb()).a();
         super.ac = null;
      default:
      }
   }

   public final void d() {
      if(!j && main.a.r != ez.a) {
    	  ae ae = new ae();
         ae.b().a();
         H = null;
      } else {
    	  ae ae = new ae();
         ae.b().v();
      }
   }

   public final void a(ht var1, byte[] var2, Vector var3, byte var4, int var5, by var6) {
      new ModHandler(23).a();
      fx.c(839);
      GameMidlet.i.L = false;
      this.u = (byte)var5;
      this.p = var1;
      this.q = var2;
      this.r = var3;
      this.s = 34;
      this.I = var6;
      if(main.a.Z == 0) {
         super.ad = var6;
      }

      this.t = (byte)(var2.length / this.s);
      super.ae = null;
      this.e();
      this.h = null;
      G.removeAllElements();

      for(int var7 = 0; var7 < 7; ++var7) {
    	  aw aw = new aw();
         G.addElement(new dr(var7 * this.s * this.u / 10 + 50, aw.e(10) * (this.t * this.u / 10) + 20, aw.e(2)));
      }

      B = g = f = x = this.e = 0;
      this.g();
      if(j) {
    	  c c = new c();
         c.b(kf.av);
         H = new ht(c.a("k"), 40 * gy.Y, 40 * gy.Y);
         c.a();
      }

   }

   public final void e() {
      this.c = (main.a.m - this.s * this.u) / 2;
      this.d = (main.a.q - main.a.T - this.t * this.u) / 2;
      if(this.c < 0) {
         this.c = 0;
      }

      if(this.d < 0) {
         this.d = 0;
      }

      A = this.s * this.u - main.a.m;
      E = this.t * this.u - main.a.q;
      if(A < 0) {
         f = 0;
         A = 0;
      }

      if(E < 0) {
         g = 0;
         E = 0;
      }

   }

   public final void k() {
      if(this.J != 0) {
         if(g < 0 || g > E) {
            this.J -= this.J / 4;
            g += this.J / 20;
            if(this.J / 10 <= 1) {
               this.J = 0;
            }
         }

         B = g += this.J / 10;
         this.J -= this.J / 10;
         if(this.J / 10 == 0) {
            this.J = 0;
         }
      }

      if(g < 0) {
         B = 0;
         this.J = 0;
      } else if(g > E) {
         B = E;
         this.J = 0;
      }

      if(this.K != 0) {
         if(f < 0 || f > A) {
            this.K -= this.K / 4;
            f += this.K / 20;
            if(this.K / 10 <= 1) {
               this.K = 0;
            }
         }

         f += this.K / 10;
         this.K -= this.K / 10;
         x = f;
         if(this.K / 10 == 0) {
            this.K = 0;
         }
      }

      if(f < 0) {
         x = 0;
         this.K = 0;
      } else if(f > A) {
         x = A;
         this.K = 0;
      }

      if(g != B) {
         D = B - g << 2;
         C += D;
         g += C >> 4;
         C &= 15;
      }

      if(f != x) {
         z = x - f << 2;
         y += z;
         f += y >> 4;
         y &= 15;
      }

      if(B < 0 || g < 0) {
         g = 0;
         B = 0;
      }

      if(B > E || g > E) {
         B = g = E;
      }

      if(x < 0 || f < 0) {
         f = 0;
         x = 0;
      }

      if(x > A || f > A) {
         x = f = A;
      }

      for(int var1 = 0; var1 < G.size(); ++var1) {
    	  dr localdr;
    	  aw aw = new aw();
          (localdr = (dr)G.elementAt(var1)).a -= localdr.c + (main.a.l % 5 == 1 ? 1 : 0);
          if (localdr.a < -this.c - 50)
          {
            localdr.a = (this.c + aw.e(4) * 50 + this.s * this.u);
            localdr.b = (aw.e(10) * (this.t * this.u / 10) + 10);
            localdr.c = aw.e(2);
          }
        }
      }

   public static void f() {
	   ae ae = new ae();
      go.l = "e";
      dp.i = "f";
      es.t = "a";
      ae.j = main.a.a(i, -2);
   }

   public final void l() {
      ++this.Q;
      if(main.a.D == null || !bb.d) {
         super.l();
      }

      this.m = false;
      if(main.a.a(0, 0, main.a.m, main.a.n)) {
         int var1 = main.a.k();
         int var2 = main.a.l();
         int var3;
         kb var4;
         if(main.a.D == null && main.a.g) {
            main.a.g = false;

            for(var3 = 0; var3 < this.r.size(); ++var3) {
               var4 = (kb)this.r.elementAt(var3);
               if(main.a.a(this.c + var4.a * this.u + this.u / 2 - 24 * gy.Y - f, this.d + var4.b * this.u - 56 * gy.Y - g, 48 * gy.Y, 56 * gy.Y)) {
                  this.e = var3;
                  return;
               }
            }
         }

         if(main.a.e) {
            if(main.a.l % 3 == 0) {
               this.N = main.a.i;
               this.O = main.a.h;
               this.P = this.Q;
            }

            this.J = 0;
            this.K = 0;
            if(!this.F) {
               this.F = true;
               this.L = f;
               this.M = g;
            }

            B = this.M + var2;
            x = this.L + var1;
            h();
            g = B;
            f = x;
         }

         if(main.a.f) {
            var3 = (int)(this.Q - this.P);
            int var5 = this.N - main.a.i;
            if(var3 < 10) {
               if(B >= 0 && B < E) {
                  this.J = var5 / var3 * 10;
               }

               var5 = this.O - main.a.h;
               if(x >= 0 && x < A) {
                  this.K = var5 / var3 * 10;
               }
            }

            this.P = -1L;
            this.F = false;
            aw aw = new aw();
            if(aw.f(var1) < 10 && aw.f(var2) < 10) {
               var4 = (kb)this.r.elementAt(this.e);
               if(main.a.a(this.c + var4.a * this.u + this.u / 2 - 24 * gy.Y - f, this.d + var4.b * this.u - 56 * gy.Y - g, 48 * gy.Y, 56 * gy.Y)) {
                  this.I.b();
                  return;
               }

               x = main.a.h + f - main.a.o;
               B = main.a.i + g - main.a.p;
               h();
            }
         }
      }

      if(this.h == null) {
         if(!main.a.a(2) && !main.a.a(4)) {
            if(main.a.a(8) || main.a.a(6)) {
               ++this.e;
               if(this.e >= this.r.size()) {
                  this.e = 0;
               }

               this.m = true;
            }
         } else {
            --this.e;
            if(this.e < 0) {
               this.e = this.r.size() - 1;
            }

            this.m = true;
         }
      } else if(main.a.D == null) {
         this.h.a();
      }

      if(this.m) {
         this.g();
      }

   }

   private void g() {
      kb var1;
      x = (var1 = (kb)this.r.elementAt(this.e)).a * this.u - main.a.m / 2;
      B = var1.b * this.u - main.a.q / 2;
      h();
   }

   private static void h() {
      if(B < 0) {
         B = 0;
      }

      if(B > E) {
         B = E;
      }

      if(x < 0) {
         x = 0;
      }

      if(x > A) {
         x = A;
      }

   }

   public final void a(Graphics var1) {
      this.b(var1);
      if(main.a.D == null || !bb.d) {
         super.a(var1);
      }
      main.a.a(var1);
   }

   public final void b(Graphics var1) {
      main.a.c(var1);
      var1.setColor(0);
      var1.fillRect(0, 0, main.a.m, main.a.q);
      var1.translate(this.c, this.d);
      var1.translate(-f, -g);

      int var2;
      int var4;
      for(var2 = 0; var2 < this.q.length; ++var2) {
         byte var3;
         var4 = (var3 = this.q[var2]) / this.p.c;
         this.p.b(var4, var3 % this.p.c, var2 % this.s * this.u, var2 / this.s * this.u, var1);
      }

      for(var2 = 0; var2 < this.r.size(); ++var2) {
         kb var9 = (kb)this.r.elementAt(var2);
         if(var2 == this.e) {
            var1.drawImage(w, var9.a * this.u + this.u / 2, var9.b * this.u, 33);
            if(j) {
               H.a(var2, var9.a * this.u + this.u / 2, var9.b * this.u - 12 * gy.Y, 0, 33, var1);
            } else {
               fx.a(var1, var9.d, var9.a * this.u + this.u / 2, var9.b * this.u - 12 * gy.Y, 33);
            }
         } else {
            var1.drawImage(v, var9.a * this.u + this.u / 2, var9.b * this.u - var9.e / 3, 33);
            ++var9.e;
            if(var9.e >= 9) {
               var9.e = 0;
            }
         }
      }

      Graphics var10 = var1;
      ea var8 = this;

      for(var4 = 0; var4 < var8.r.size(); ++var4) {
         kb var5;
         int var6 = (var5 = (kb)var8.r.elementAt(var4)).a * var8.u;
         int var7;
         if((var7 = var5.b * var8.u) < g + 50) {
            var7 = g + 50;
         }

         if(var7 > g + main.a.q - 20) {
            var7 = g + main.a.q - 20;
         }

         if(var6 < f + 20) {
            var6 = f + 20;
         }

         if(var6 > f + main.a.m - 47) {
            var6 = f + main.a.m - 47;
         }

         main.a.L.a(var10, var5.c, var6 + 10, var7 - (var4 == var8.e?70 * gy.Y:35 * gy.Y) - var5.e / 3, 2);
      }

      Graphics var11 = var1;

      for(var4 = 0; var4 < G.size(); ++var4) {
         dr var12;
         if((var12 = (dr)G.elementAt(var4)).a > f - 30 && var12.a < f + 30 + main.a.m && var12.b > g - 20 && var12.b < g + 20 + main.a.n) {
            var11.drawImage(k[var12.c], var12.a, var12.b, 3);
         }
      }

      main.a.c(var1);
   }

   public final void a(byte var1, String var2, String var3, String var4) {
      System.out.println("onRegisterByEmail: " + var3 + "   " + var4);
      if(var1 == 0) {
         n = new ct(this, var2);
      } else if(var1 == 1) {
         n = new ay(this, var2);
      } else {
         if(var1 == 2) {
            es.b().b.a(var3);
            es.b().c.a(var4);
            es.b().g();
            main.a.b("Đăng ký thành công.");
            n = null;
         }

      }
   }
}
