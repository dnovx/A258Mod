import main.*;

import java.util.*;

import javax.microedition.lcdui.*;

import java.io.*;

import javax.microedition.midlet.*;

public final class es extends hj
{
    public static es a;
    public dx b;
    public dx c;
    public dx d;
    public dx e;
    private int z;
    private int A;
    private int B;
    private by C;
    by f;
    private by D;
    by g;
    private boolean E;
    by h;
    public boolean i;
    private String F;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public long r;
    public static int s;
    public static String t;
    public static boolean u;
    public static boolean v;
    public static boolean w;
    private String[] G;
    public int x;
    public int y;
    private byte H;
    private String I;
    private String J;
    private boolean K;
    public static String isIndoServer = "999";
    
    static {
        es.s = 0;
        es.u = false;
    }
    
    public static es b() {
        if (es.a == null) {
            es.a = new es();
        }
        return es.a;
    }
    
    public final void d() {
        main.a.b(kf.P, 54);
    }
    
    public final void a() {
        this.c();
        super.a();
        main.a.h();
        if (main.a.H) {
            this.H = -1;
        }
        es.v = true;
        ((gy)this).ad = this.g;
        if (this.I.equals("") && this.b.f().equals("")) {
            this.G = new String[] { "Chơi mới", "Đổi tài khoản" };
            return;
        }
        this.G = new String[] { "Chơi tiếp" + (this.b.f().equals("") ? "" : (", " + this.b.f())), "Chơi mới", "Đổi tài khoản" };
    }
    
    public final void e() {
        this.r = System.currentTimeMillis();
        c c = new c();
        c.b(kf.aw);
        try {
            if (GameMidlet.f == 6) {
                hj.am = Image.createImage("/lgyeah.png");
            }
            else {
            	System.out.println("W: " + main.a.m);
            	System.out.println("H: " + main.a.n);
            	String logo;
            	if (main.a.m > 400) {
            		logo = "/lBig.png";
            		System.out.println("Logo Big!!");
            	} else {
            		logo = "/l.png";
            		System.out.println("Logo Small!");
            	}
                hj.am = Image.createImage(String.valueOf(kf.a()) + logo);
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        c.a();
        this.A = -50;
        main.a.x.e(26);
        final hn i = GameMidlet.i;
        final hn j = GameMidlet.i;
        final int n = ir.e * 24 / 2 + 30;
        ((gx)j).C = n;
        ((js)i).aw = n;
        do2 a = do2.a();
        do2 a2 = do2.a();
        int n2 = 200;
        a2.c = n2;
        a.a = n2;
        this.b.a(true);
        this.c.a(false);
        this.z = 0;
        this.b.a(true);
    }
    
    public final void c() {
        this.h = new by(kf.c, 0);
        this.D = new by(kf.dt, 3);
        this.f = new by(kf.O, 1);
        this.C = new by(kf.bA, 2);
        this.g = new by(kf.O, 104);
        ((gy)this).ac = this.h;
    }
    
    public es() {
        this.E = true;
        this.i = false;
        this.F = "19006610";
        this.r = 0L;
        this.G = new String[] { "Chơi mới", "Chơi tiếp", "Đổi tài khoản" };
        this.I = "";
        this.J = "";
        this.b = new dx();
        this.c = new dx();
        this.d = new dx();
        this.e = new dx();
        this.f();
        this.b.a(true);
        this.b.d(0);
        this.c.d(2);
        this.d.d(2);
        this.e.d(0);
        this.e.q = "Tùy chọn";
        this.z = 0;
        aw aw = new aw();
        if (aw.b(aw.b) == null) {
            fx.b();
        }
    }
    
    public final void f() {
        if (main.a.n > 200) {
            this.B = main.a.p - 80;
        }
        else {
            this.B = main.a.p - 65;
        }
        this.A = -50;
        this.p = main.a.m - 30;
        if (this.p < 70) {
            this.p = 70;
        }
        if (this.p > 99) {
            this.p = 99;
        }
        this.q = (main.a.m - this.p >> 1) + 29;
        if (main.a.m <= 128) {
            this.p = 80;
            this.q = (main.a.m - this.p >> 1) + 20;
        }
        this.q -= (gy.Y - 1) * 40;
        main.a.S.a(this);
        this.B = this.k / 2;
        this.A = this.B;
        do2.a().h = (gx)GameMidlet.i;
        do2.a().d();
    }
    
    public final void d(final int n, final int n2) {
        switch (n) {
            case 0: {
                this.i = true;
                main.a.S.a(this);
                break;
            }
            case 1: {
                this.i = false;
                main.a.S.a(this);
                break;
            }
            case 2: {
                main.a.b(kf.P, 54);
                break;
            }
            case 3: {
                main.a.b(kf.du, 55, (gy)null);
                break;
            }
            case 4: {
                main.a.u.a(kf.bC, 100, 3);
                break;
            }
            case 5: {
                dm.b().a();
                break;
            }
            case 6: {
                GameMidlet.b("http://wap.teamobi.com/faqs.php?provider=" + GameMidlet.f);
                break;
            }
            case 7: {
                GameMidlet.b("http://wap.teamobi.com?info=checkupdate&game=8&version=2.5.8&provider=" + GameMidlet.f + "&agent=" + GameMidlet.g);
                break;
            }
            case 8: {
                if (!this.F.equals("")) {
                    GameMidlet.b("tel:" + this.F);
                    return;
                }
                if (!kt.a().c) {
                    main.a.c(kf.M);
                    main.a.c();
                }
                else {
                    main.a.i();
                }
                cx.a().a((byte)5, (String)null);
                break;
            }
            case 9: {
                main.a.b(String.valueOf(kf.bH) + kf.bG);
                fx.a();
                break;
            }
            case 10: {
            	about();
            }
        }
    }
    
    public void about() {
    	String content1 = "Hãy để tôi giới thiệu về CityNo" + ".µ0,17,0µ\nĘę2Version:\nę21.0.4";
		Hashtable localHashtable = new Hashtable();
		try {
			Image img = Image.createImage(kf.a() + "/l.png");
			localHashtable.put("0", img);
		}catch(IOException e){
			e.printStackTrace();
		}
		jb.a = null;
        jb.b().a(localHashtable, "Giới thiệu", content1, (byte)-1);
        jb.b().a();
    }
    
    
    private void j() {
        if (!this.E) {
            this.E = true;
            this.C.a = kf.bJ;
            return;
        }
        this.E = false;
        this.C.a = kf.bA;
    }
    
    public final void a(final int n, final int n2) {
        switch (n) {
            case 0: {
                final Vector vector = new Vector();
                final by by = new by(kf.x, 2);
                vector.addElement(new by(kf.bB, 4));
                vector.addElement(new by(kf.ab, 5));
                if (dm.b().b[4] == 0) {
                    vector.addElement(new by(kf.bD, 6));
                }
                vector.addElement(new by(kf.bE, 7));
                if (dm.b().b[4] == 0) {
                    vector.addElement(new by(kf.bF, 8));
                }
                vector.addElement(new by(kf.bG, 9));
                vector.addElement(new by("Giới thiệu", 10));
                vector.addElement(by);
                le.a().a((Vector)vector, 0);
                break;
            }
            case 1: {
                es.v = true;
                ((gy)this).ac = this.h;
                ((gy)this).ad = this.g;
                this.H = 0;
                this.G = new String[] { "Chơi tiếp" + (this.b.f().equals("") ? "" : (", " + this.b.f())), "Chơi mới", "Đổi tài khoản" };
                break;
            }
            case 2: {
                this.j();
                break;
            }
            case 3: {
                if (this.b.f().equals("")) {
                    main.a.b(kf.eo[0]);
                    break;
                }
                if (this.c.f().equals("")) {
                    main.a.b(kf.eo[1]);
                    break;
                }
                if (this.d.f().equals("")) {
                    main.a.b(kf.eo[2]);
                    break;
                }
                if (!this.c.f().equals(this.d.f())) {
                    main.a.b(kf.eo[3]);
                    break;
                }
                main.a.h();
                this.r = System.currentTimeMillis();
                if (!this.e.f().equals("")) {
                    main.a.b("Bạn nên điền chính xác số di động hoặc email. Khi quên mật khẩu, bạn sẽ dùng nó để lấy lại. Bạn có chắc chắn đã điền số di động / email đúng chưa?", 102);
                    break;
                }
                n();
                break;
            }
            case 50: {
                main.a.b(kf.bI);
                break;
            }
            case 51: {
                this.m();
                break;
            }
            case 52: {}
            case 53: {
                GameMidlet.b("http://teamobi.com/dieukhoan.htm");
                break;
            }
            case 54: {
                GameMidlet.a();
                break;
            }
            case 55: {
                es.u = false;
                this.g();
                fx.b("avatarSV");
                GameMidlet.a();
                break;
            }
            case 100: {
                final String a;
                if ((a = main.a.u.a()).equals("")) {
                    return;
                }
                ((ii)new n(this, a)).a();
                break;
            }
            case 101: {
                this.m();
                break;
            }
            case 102: {
                n();
                break;
            }
            case 103: {}
            case 104: {
                this.o();
                break;
            }
        }
    }
    
    private void m() {
        main.a.i();
        main.a.c();
        cx.a().c(this.b.f().toLowerCase(), this.c.f().toLowerCase(), this.e.f());
        this.i = false;
        ((gy)this).ad = this.f;
        main.a.S.a(this);
    }
    
    private static void n() {
        final Vector vector;
        (vector = new Vector()).addElement(new by(kf.e, 51));
        vector.addElement(new by(kf.bK, 52));
        vector.addElement(new by(kf.bL, 53));
        main.a.a(kf.bM, (Vector)vector);
    }
    
    public final void k() {
        if ((System.currentTimeMillis() - this.r) / 1000L > 300L) {
            ((MIDlet)GameMidlet.h).notifyDestroyed();
        }
        if (!es.v && this == main.a.r && main.a.t == null && !es.v) {
            this.b.e();
            this.c.e();
            if (this.i) {
                this.d.e();
                this.e.e();
            }
            if (this.b.d()) {
                ((gy)this).ae = this.b.a();
            }
            else if (this.c.d()) {
                ((gy)this).ae = this.c.a();
            }
            else if (this.d.d()) {
                ((gy)this).ae = this.d.a();
            }
        }
        else {
            ((gy)this).ae = null;
        }
        if (this.B != this.A) {
            this.A += this.B - this.A >> 1;
        }
        if (this.i) {
            ((gy)this).ad = this.D;
        }
        else if (this.z == 2) {
            ((gy)this).ae = this.C;
        }
        main.a.x.b();
    }
    
    public final void d(final int n) {
        if (this.b.d()) {
            this.b.b(n);
        }
        else if (this.c.d()) {
            this.c.b(n);
        }
        else if (this.d.d()) {
            this.d.b(n);
        }
        else if (this.e.d()) {
            this.e.b(n);
        }
        super.d(n);
    }
    
    public final void a(final Graphics graphics) {
        this.b(graphics);
        super.a(graphics);
        main.a.a(graphics);
    }
    
    public final void b(final Graphics graphics) {
        main.a.x.b(graphics);
        main.a.x.d(graphics);
        main.a.c(graphics);
        if (es.v) {
            main.a.S.a(graphics, this.j, this.k, this.l, this.m, 0);
            graphics.translate(this.j, this.k + this.y);
            if (this.H != -1) {
                main.a.S.c(graphics, 5 * gy.Y, this.H * this.x, this.l - 10 * gy.Y, this.x);
            }
            for (int i = 0; i < this.G.length; ++i) {
                main.a.K.a(graphics, this.G[i], this.l / 2, i * this.x + this.x / 2 - main.a.K.a() / 2, 2);
            }
        }
        else if (main.a.v == null && this == main.a.r) {
            main.a.S.a(graphics, this.j, this.k, this.l, this.m, 0);
            graphics.setClip(this.j + 4, this.k + 4, this.l - 8, this.m - 8);
            if (!this.F.equals("") && dm.b().b[4] == 0) {
                main.a.S.a(graphics, "Hotline: " + this.F, this.j + this.l - 8, this.k + this.m - gy.ah - 4, 1);
            }
            this.b.a(graphics);
            graphics.setClip(this.j + 4, this.k + 4, this.l - 8, this.m - 8);
            final int a;
            int n;
            if ((a = main.a.K.a(String.valueOf(kf.bN) + ":")) < this.b.a - this.j) {
                n = (this.b.a - this.j - a) / 2 + gy.Z;
            }
            else {
                n = this.b.a - a - 5;
            }
            main.a.S.a(graphics, kf.bN, this.j + n, this.b.b + this.b.d / 2 - gy.ah / 2, 0);
            main.a.S.a(graphics, String.valueOf(kf.bO) + ":", this.j + n, this.c.b + this.b.d / 2 - gy.ah / 2, 0);
            if (!this.i) {
                main.a.S.a(graphics, this.n, this.o, this.z, this.E);
            }
            else {
                main.a.S.a(graphics, kf.cE, this.j + n, this.d.b + this.b.d / 2 - gy.ah, 0);
                main.a.S.a(graphics, String.valueOf(kf.bO) + ":", this.j + n, this.d.b + this.b.d / 2, 0);
                main.a.S.a(graphics, "Số di động", this.j + n, this.e.b + this.b.d / 2 - gy.ah, 0);
                main.a.S.a(graphics, "hoặc email:", this.j + n, this.e.b + this.b.d / 2, 0);
                this.d.a(graphics);
                this.e.a(graphics);
            }
            this.c.a(graphics);
        }
        main.a.c(graphics);
        graphics.drawImage(hj.am, main.a.o, this.A, 3);
    }
    
    public final void l() {
        if (es.v) {
            if (main.a.a(2)) {
                --this.H;
                if (this.H < 0) {
                    this.H = (byte)(this.G.length - 1);
                }
            }
            else if (main.a.a(8)) {
                ++this.H;
                if (this.H >= this.G.length) {
                    this.H = 0;
                }
            }
            if (main.a.g) {
                for (int i = 0; i < this.G.length; ++i) {
                    if (main.a.b(this.j, this.k + this.y + i * this.x, this.l, this.x)) {
                        this.H = (byte)i;
                        main.a.g = false;
                        this.K = true;
                        break;
                    }
                }
            }
            if (this.K) {
                if (main.a.e && !main.a.b(this.j, this.k + this.y + this.H * this.x, this.l, this.x)) {
                    this.H = -1;
                }
                if (main.a.f) {
                    main.a.f = false;
                    this.K = false;
                    if (this.H != -1) {
                        this.o();
                    }
                }
            }
            super.l();
            return;
        }
        if (main.a.f && main.a.a(0, 0, main.a.m, main.a.n) && main.a.a(this.n - 10, this.o, 70, hj.al * gy.Y + 10)) {
            this.j();
        }
        if (main.a.b[2]) {
            if (this.z > 0) {
                --this.z;
            }
            else if (this.i) {
                this.z = 3;
            }
            else {
                this.z = 2;
            }
        }
        if (main.a.b[8]) {
            if (this.z < (this.i ? 3 : 2)) {
                ++this.z;
            }
            else {
                this.z = 0;
            }
        }
        if (main.a.b[2] || main.a.b[8]) {
            main.a.e();
            if (this.z == 0) {
                this.b.a(true);
                this.c.a(false);
                this.d.a(false);
                this.e.a(false);
            }
            else if (this.z == 1) {
                this.b.a(false);
                this.c.a(true);
                this.d.a(false);
                this.e.a(false);
            }
            else if (this.z == 2) {
                this.b.a(false);
                this.c.a(false);
                ((gy)this).ae = null;
                if (this.i) {
                    this.d.a(true);
                    this.e.a(false);
                }
            }
            else {
                this.b.a(false);
                this.c.a(false);
                this.d.a(false);
                this.e.a(true);
            }
        }
        super.l();
    }
    
    private void o() {
        System.out.println("clickNewGame: " + es.w + "    " + this.H);
        Label_0239: {
            switch (this.H) {
                case 0: {
                    if (this.G.length == 2) {
                        ((ii)new jk(this)).a();
                        return;
                    }
                    if (es.w) {
                        ez.b().a();
                        return;
                    }
                    final String trim = this.b.f().toLowerCase().trim();
                    final String f = this.c.f();
                    if (!trim.equals("")) {
                        if (f.equals("")) {
                            this.z = 1;
                            this.b.a(false);
                            this.c.a(true);
                            break;
                        }
                        ez.b().a();
                    }
                break;
                }
                case 1: {
                    if (this.G.length == 2) {
                        break Label_0239;
                    }
                    final jk jk = new jk(this);
                    if (!this.I.equals("") && this.b.f().equals("")) {
                        main.a.a("Tài khoản của bạn chưa được đăng kí liên kết với một tài khoản Team. Bạn sẽ mất tài khoản đang chơi nếu tiếp tục. Bạn có muốn tiếp tục ?", (ii)jk);
                        return;
                    }
                    ((ii)jk).a();
                    break;
                }
                case 2: {
                    this.p();
                    break;
                }
            }
        }
    }
    
    private void p() {
        final dg dg = new dg(this);
        if (!this.I.equals("") && this.b.f().equals("")) {
            main.a.a("Tài khoản của bạn chưa được đăng kí liên kết với một tài khoản Team. Bạn sẽ mất tài khoản đang chơi nếu tiếp tục. Bạn có muốn tiếp tục ?", (ii)dg);
            return;
        }
        ((ii)dg).a();
    }
    
    public final void g() {
        System.out.println("saveLogin");
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeUTF("2.5.8");
            dataOutputStream.writeByte(super.ar);
            dataOutputStream.writeUTF(this.F);
            dataOutputStream.writeUTF(this.I);
            dataOutputStream.writeUTF(this.J);
            if (this.E) {
                dataOutputStream.writeUTF(b().b.f());
                dataOutputStream.writeUTF(b().c.f());
            }
            dataOutputStream.writeInt(es.s);
            dataOutputStream.writeBoolean(es.u);
            dataOutputStream.writeBoolean(es.w);
            aw aw = new aw();
            aw.a("avlogin", byteArrayOutputStream.toByteArray());
            dataOutputStream.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public final void h() {
        final DataInputStream a;
        if ((a = fx.a("avlogin")) == null) {
            return;
        }
        String utf = "";
        try {
            utf = a.readUTF();
            super.ar = a.readByte();
            this.F = a.readUTF();
            this.I = a.readUTF();
            this.J = a.readUTF();
            if (this.E) {
                this.b.a(a.readUTF());
                this.c.a(a.readUTF());
            }
            es.s = a.readInt();
            es.u = a.readBoolean();
            es.w = a.readBoolean();
            a.close();
        }
        catch (Exception ex) {
            fx.b("avlogin");
        }
        if (!es.u) {
            fx.b("avatarSV");
        }
        if (!"2.5.8".equals(utf)) {
            fx.a();
        }
    }
    
    public final void a(final String f) {
        this.F = f;
    }
    
    public final void i() {
        main.a.c();
        cx.a().f(b().F.hashCode());
        System.out.println("login: " + es.v + "    " + this.H);
        if (es.v && ((this.H == 0 && this.G.length == 2) || (this.H == 1 && this.G.length == 3))) {
            final cx a = cx.a();
            System.out.println("doLoginNewGame");
            ((kj)a).e((byte)(-12));
            ((kj)a).k();
            return;
        }
        if (this.b.f().equals("")) {
            cx.a().a(this.I, this.J, "2.5.8");
            es.w = true;
            return;
        }
        es.w = false;
        this.I = "";
        this.J = "";
        if (isIndoServer.equals("socket://124.81.71.183:19128")) {
        	cx.a().a(this.b.f().toLowerCase(), this.c.f(), "2.5.0");
        	return;
        }
        cx.a().a(this.b.f().toLowerCase(), this.c.f(), "2.5.8");
    }
    
    public final void a(final String i, final String j) {
        System.out.println("onLoginNewGame: " + i + "   " + j);
        this.I = i;
        this.J = j;
        this.b.a("");
        this.c.a("");
        es.w = true;
        es.v = false;
        this.i();
    }
}
