import main.*;

import java.io.*;

import javax.microedition.rms.RecordStore;

public final class cx extends kj
{
    private static cx a;

    public static cx a() {
        if (cx.a == null) {
            cx.a = new cx();
        }
        return cx.a;
    }

    public final void a(byte b, String s) {
        if (s == null) {
            s = "";
        }
        super.e((byte)(-55));
        try {
            super.b.c().writeByte(b);
            super.b.c().writeUTF(s);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        this.k();
    }

    public final void b() {
        super.e((byte)(-1));
        this.o(GameMidlet.e);
        this.k();
        super.e((byte)(-17));
        try {
            super.b.c().writeByte(GameMidlet.f);
            super.b.c().writeInt((int)(Runtime.getRuntime().totalMemory() / 1024L));
            String property;
            if ((property = System.getProperty("microedition.platform")) == null) {
                property = "null";
            }
            super.b.c().writeUTF(property);
            super.b.c().writeInt(d());
            super.b.c().writeInt(main.a.m);
            super.b.c().writeInt(main.a.n);
            super.b.c().writeBoolean(main.a.H);


            // RESOURCE TYPE: 0: SD, 1: HD
            //super.b.c().writeByte(gy.Y - 1);
            super.b.c().writeByte(ModHandler.Res); // <------ Edit integer value to change resource type
            // --------------------------

            super.b.c().writeUTF("2.5.8");
            System.out.println("setProviderAndClientType: " + dp.i + "    " + ea.i + "    " + ae.j);
            super.b.c().writeUTF(dp.i);
            super.b.c().writeUTF(ea.i);
            super.b.c().writeUTF(ae.j);
        }
        catch (IOException ex2) {}
        this.k();
        super.e((byte)(-79));
        try {
            super.b.c().writeUTF(GameMidlet.g);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        this.k();
    }

    private static int d() {
        long var0 = 0L;
        RecordStore var2 = null;

        try {
            var0 = (long)((var2 = RecordStore.openRecordStore("textrms", true)).getSizeAvailable() + var2.getSize());
        } catch (Exception var9) {
            ;
        } finally {
            try {
                if(var2 != null) {
                    var2.closeRecordStore();
                }

                RecordStore.deleteRecordStore("textrms");
            } catch (Exception var8) {
                ;
            }

        }

        if(var0 > 0L) {
            var0 /= 1024L;
        }

        return (int)var0;
    }


    public final void a(int n) {
        super.e((byte)34);
        this.n(n);
        this.k();
    }

    public final void a(String s, String s2, String s3) {
        super.e((byte)(-2));
        try {
            System.out.println("loginaaaaaaaaaaaaaa: " + s + "    " + s2);
            super.b.c().writeUTF(s);
            super.b.c().writeUTF(s2);
            super.b.c().writeUTF(s3);
            System.out.println("Login ver: " + s3);
            super.b.c().writeUTF(Base64.encode(s + "_" + s3));
        }
        catch (IOException ex) {}
        this.k();
    }

    public final void b(int n) {
        super.e((byte)61);
        this.o(n);
        this.k();
    }

    public final void a(int n, String s) {
        super.e((byte)(-6));
        try {
            super.b.c().writeInt(n);
            super.b.c().writeUTF(s);
        }
        catch (IOException ex) {}
        this.k();
    }

    public final void c() {
        super.e((byte)(-35));
        try {
            super.b.c().writeByte(GameMidlet.i.d);
            int size = GameMidlet.i.e.size();
            super.b.c().writeByte(size);
            for (int i = 0; i < size; ++i) {
                super.b.c().writeShort(((hx)GameMidlet.i.e.elementAt(i)).a);
            }
        }
        catch (IOException ex) {}
        this.k();
    }

    public final void a(int n, int n2) {
        super.e((byte)(-36));
        try {
            super.b.c().writeShort(n);
            super.b.c().writeByte(n2);
        }
        catch (IOException ex) {}
        this.k();
    }

    public final void c(int n) {
        super.e((byte)(-47));
        this.n(n);
        this.k();
    }

    public final void a(short n, byte b) {
        super.e((byte)(-48));
        super.b = new jr((byte)(-48));
        try {
            super.b.c().writeShort(n);
            super.b.c().writeByte(b);
        }
        catch (IOException ex) {}
        this.k();
    }

    public final void d(int n) {
        super.e((byte)(-1));
        this.o(n);
        this.k();
    }

    public final void a(byte b) {
        super.e((byte)(-51));
        this.o((int)b);
        this.k();
    }

    public final void e(int n) {
        super.e((byte)(-49));
        System.out.println("requestShop: " + n);
        this.o(n);
        this.k();
    }

    public final void f(int n) {
        super.e((byte)(-52));
        this.n(n);
        this.k();
    }

    public final void g(int n) {
        super.e((byte)(-53));
        this.o(n);
        this.k();
    }

    public final void a(int n, byte b, int n2) {
        super.e((byte)(-59));
        try {
            super.b.c().writeInt(n);
            super.b.c().writeByte(b);
            super.b.c().writeByte(n2);
        }
        catch (IOException ex) {}
        this.k();
    }

    public final void a(int n, byte b, String s) {
        super.e((byte)(-60));
        try {
            super.b.c().writeInt(n);
            super.b.c().writeByte(b);
            super.b.c().writeUTF(s);
        }
        catch (IOException ex) {}
        this.k();
    }

    public final void h(int n) {
        System.out.println("doCommunicate: " + n);
        super.e((byte)(-61));
        this.n(n);
        this.k();
    }

    public final void b(String s, String s2, String s3) {
        super.e((byte)(-56));
        try {
            super.b.c().writeUTF(s);
            super.b.c().writeUTF(s2);
            super.b.c().writeUTF(s3);
        }
        catch (IOException ex) {}
        this.k();
    }

    public final void a(String s, String s2) {
        super.e((byte)(-62));
        try {
            super.b.c().writeUTF(s);
            super.b.c().writeUTF(s2);
        }
        catch (IOException ex) {}
        this.k();
    }

    public final void a(short n, int n2) {
        super.e((byte)(-64));
        try {
            super.b.c().writeShort(n);
            super.b.c().writeShort(n2);
        }
        catch (Exception ex) {}
        this.k();
    }

    public final void b(int n, String s) {
        super.e((byte)(-72));
        try {
            super.b.c().writeInt(n);
            super.b.c().writeUTF(s);
        }
        catch (Exception ex) {}
        this.k();
    }

    public final void a(int n, byte b, int n2, byte b2) {
        super.e((byte)(-81));
        try {
            super.b.c().writeInt(n);
            super.b.c().writeByte(b);
            super.b.c().writeShort(n2);
            super.b.c().writeByte(b2);
        }
        catch (Exception ex) {}
        this.k();
    }

    public final void b(int n, int n2) {
        System.out.println("doRequestCmdRotate: " + n);
        super.e((byte)(-83));
        try {
            super.b.c().writeShort(n);
            super.b.c().writeInt(n2);
        }
        catch (IOException ex) {}
        this.k();
    }

    public final void b(byte b) {
        super.e((byte)(-58));
        this.o((int)b);
        this.k();
    }

    public final void a(String s, byte b) {
        super.e((byte)(-88));
        try {
            super.b.c().writeByte(0);
            super.b.c().writeUTF(s);
        }
        catch (Exception ex) {}
        this.k();
    }

    public final void b(String s, String s2) {
        super.e((byte)(-88));
        try {
            super.b.c().writeByte(1);
            super.b.c().writeUTF(s);
            super.b.c().writeUTF(s2);
        }
        catch (Exception ex) {}
        this.k();
    }

    public final void i(int n) {
        super.e((byte)(-90));
        this.o(n);
        this.k();
    }

    public final void a(int n, int n2, short n3) {
        super.e((byte)(-89));
        try {
            super.b.c().writeByte(n);
            super.b.c().writeShort(n2);
            super.b.c().writeShort(n3);
        }
        catch (Exception ex) {}
        this.k();
    }

    public final void c(byte b) {
        super.e((byte)(-92));
        if (b != -1) {
            this.o((int)b);
        }
        this.k();
    }

    public final void d(byte b) {
        super.e((byte)(-94));
        this.o((int)b);
        this.k();
    }

    public final void a(short n) {
        super.e((byte)(-95));
        try {
            super.b.c().writeByte(ae.A);
            super.b.c().writeByte(0);
            super.b.c().writeShort(n);
        }
        catch (Exception ex) {}
        this.k();
    }

    public final void b(short n) {
        super.e((byte)(-97));
        this.p((int)n);
        this.k();
    }

    public final void c(short n) {
        super.e((byte)(-98));
        this.p((int)n);
        this.k();
    }

    public final void j(int n) {
        main.a.i();
        super.e((byte)(-99));
        this.o(n);
        this.k();
    }

    public final void c(int n, int n2) {
        main.a.i();
        super.e((byte)5);
        this.o(n);
        this.n(n2);
        this.k();
    }

    public final void k(int n) {
        super.e((byte)2);
        this.o(n);
        this.k();
    }

    public final void l(int n) {
        super.e((byte)(-102));
        this.n(n);
        this.k();
    }

    public final void m(int n) {
        super.e((byte)(-106));
        this.o(n);
        this.k();
    }

    public final void a(byte b, short n) {
        super.e((byte)(-107));
        try {
            super.b.c().writeByte(b);
            super.b.c().writeShort(n);
            this.k();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public final void c(String s, String s2, String s3) {
        System.out.println("doRegisterByEmail: " + s + "   " + s2 + "   " + s3);
        super.e((byte)(-25));
        try {
            this.c(s);
            this.c(s2);
            this.c(s3);
            this.o(0);
            this.k();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
