import main.*;

import java.util.*;

import javax.microedition.lcdui.*;

import java.io.*;

public final class ce extends kj implements cm
{
    private jn c;
    private static ce d;
    public kk a;
    public static boolean reqEffImg = false;
    public static boolean doGetClan = false;
    public static boolean doGetItem = false;
    public static boolean getTileMap = false;
    public static boolean getDataMap = false;
	public static boolean doGetDataItem = false;
    
    public ce() {
        this.c = new jn();
    }
    
    public static ce a() {
        if (ce.d == null) {
            ce.d = new ce();
        }
        return ce.d;
    }
    
    public final void b() {
        System.out.println("onConnectionFail");
        main.a.b(kf.Y);
    }
    
    public final void c() {
        System.out.println("onDisconnected");
        main.a.h();
        GameMidlet.e = 8;
        if (main.a.r != es.a) {
            main.a.b(kf.aO, (ii)new du());
        }
        else {
            main.a.b(kf.aO);
        }
        main.a.t = null;
        ei.a = null;
        hc.d = null;
        q.a.a();
        if (((gy)im.d()).ac.b != null) {
            ((gy)im.d()).ac.b.a();
        }
        gb.a();
    }
    
    public final void a(final jr jr) {
        try {
            switch (jr.a) {
                case -62: {
                    System.out.println("CHANGE_PASS");
                    es.b().c.a(jr.b().readUTF());
                    es.b().g();
                    break;
                }
                case -12: {
                    es.b().a(jr.b().readUTF(), jr.b().readUTF());
                    break;
                }
                case -25: {
                    final byte byte1 = jr.b().readByte();
                    String utf = null;
                    String utf2 = null;
                    String utf3 = null;
                    if (byte1 == 2) {
                        utf2 = jr.b().readUTF();
                        utf3 = jr.b().readUTF();
                    }
                    else {
                        utf = jr.b().readUTF();
                    }
                    ea.b().a(byte1, utf, utf2, utf3);
                    break;
                }
                case -7: {
                    this.c.a(jr.b().readUTF(), jr.b().readUTF());
                    break;
                }
                case -9: {
                    main.a.b(jr.b().readUTF());
                    break;
                }
                case -8: {
                    main.a.a(jr.b().readUTF());
                    break;
                }
                case -10: {
                    final String utf4 = jr.b().readUTF();
                    boolean boolean1 = false;
                    if (jr.b().available() > 0) {
                        boolean1 = jr.b().readBoolean();
                    }
                    this.c.a(utf4, boolean1);
                    break;
                }
                case -23: {
                    final Vector vector = new Vector();
                    while (jr.b().available() > 0) {
                        final gu gu;
                        (gu = new gu()).a = jr.b().readUTF();
                        gu.c = jr.b().readUTF();
                        jr.b().readUTF();
                        gu.b = jr.b().readUTF();
                        vector.addElement(gu);
                    }
                    jd.b().a((Vector)vector);
                    jd.b().a(main.a.r);
                    main.a.h();
                    break;
                }
                case -21: {
                    final hn hn;
                    ((gx)(hn = new hn())).w = jr.b().readInt();
                    ((gx)hn).x = jr.b().readUTF();
                    ae.b().a(hn, jr.b().readUTF());
                    break;
                }
                case -19: {
                    final hn hn2;
                    ((gx)(hn2 = new hn())).w = jr.b().readInt();
                    ((gx)hn2).x = jr.b().readUTF();
                    final boolean boolean2 = jr.b().readBoolean();
                    final String utf5 = jr.b().readUTF();
                    ae.b();
                    ae.a(boolean2, utf5);
                    break;
                }
                case -35: {
                    final boolean boolean3 = jr.b().readBoolean();
                    ic.b();
                    ic.b(boolean3);
                    break;
                }
                case -36: {
                    final int int1 = jr.b().readInt();
                    final short short1 = jr.b().readShort();
                    ae.b();
                    ae.b(int1, (int)short1);
                    break;
                }
                case -6: {
                    final int int2 = jr.b().readInt();
                    final String utf6 = jr.b().readUTF();
                    final String utf7 = jr.b().readUTF();
                    if (main.a.r != hc.b()) {
                        ++hj.as;
                    }
                    hc.b().a(int2, utf6, utf7);
                    break;
                }
                case -22: {
                    final int int3 = jr.b().readInt();
                    final kp kp;
                    (kp = new kp()).g = jr.b().readByte();
                    kp.f = jr.b().readByte();
                    kp.a = jr.b().readByte();
                    kp.b = jr.b().readByte();
                    kp.e = jr.b().readByte();
                    kp.c = jr.b().readByte();
                    kp.d = jr.b().readByte();
                    hn hn3 = null;
                    final int int4 = jr.b().readInt();
                    String utf8 = "";
                    String utf9 = "";
                    short short2 = 0;
                    byte byte2 = 0;
                    byte byte3 = 0;
                    short short3 = -1;
                    String utf10 = "";
                    if (int4 != -1) {
                        ((gx)(hn3 = new hn())).w = int4;
                        hn3.a(jr.b().readUTF());
                        for (byte byte4 = jr.b().readByte(), b = 0; b < byte4; ++b) {
                            hn3.a(new hx(jr.b().readShort()));
                        }
                        utf8 = jr.b().readUTF();
                        short2 = jr.b().readShort();
                        byte2 = jr.b().readByte();
                        byte3 = jr.b().readByte();
                        utf9 = jr.b().readUTF();
                        if ((short3 = jr.b().readShort()) != -1) {
                            utf10 = jr.b().readUTF();
                        }
                    }
                    if (jr.b().available() > 0) {
                        final hn i = GameMidlet.i;
                        final kp j = GameMidlet.j;
                        final kp kp2 = kp;
                        final short short4 = jr.b().readShort();
                        kp2.g = short4;
                        j.g = short4;
                        i.v = short4;
                    }
                    ae.b().a(int3, kp, hn3, utf8, short2, byte2, byte3, utf9, short3, utf10);
                    break;
                }
                case 34: {
                    if (jr.b().readInt() != -1) {
                        final String utf11 = jr.b().readUTF();
                        final int int5 = jr.b().readInt();
                        jr.b().readShort();
                        final int int6 = jr.b().readInt();
                        final int int7 = jr.b().readInt();
                        final int int8 = jr.b().readInt();
                        final int int9 = jr.b().readInt();
                        final int int10 = jr.b().readInt();
                        final hn hn4;
                        (hn4 = new hn()).d(int6);
                        main.a.b(String.valueOf(kf.aA) + utf11 + ". " + kf.ao + int5 + "$. Level: " + hn4.v + "+" + hn4.r + "%. " + kf.aP + ": " + int7 + ". " + kf.aQ + ": " + int8 + ". " + kf.aR + ": " + int9 + ". " + kf.aS + ": " + int10);
                    }
                    break;
                }
                case -42: {
                    final Vector vector2 = new Vector();
                    final byte byte5 = jr.b().readByte();
                    for (byte b2 = 0; b2 < byte5; ++b2) {
                        final hd hd = new hd(this);
                        jr.b().readShort();
                        hd.b = jr.b().readUTF();
                        hd.c = jr.b().readUTF();
                        hd.d = jr.b().readUTF();
                        hd.e = jr.b().readUTF();
                        hd.f = jr.b().readUTF();
                        hd.g = new Vector();
                        for (byte byte6 = jr.b().readByte(), b3 = 0; b3 < byte6; ++b3) {
                            final dr dr;
                            (dr = new dr()).c = jr.b().readByte();
                            dr.a = jr.b().readByte();
                            dr.b = jr.b().readByte();
                            hd.g.addElement(dr);
                        }
                        vector2.addElement(hd);
                    }
                    for (byte b4 = 0; b4 < byte5; ++b4) {
                    	hd localhd = (hd)vector2.elementAt(b4);
                    	localhd.a = jr.b().readByte();
                    }
                    fx.a((Vector)vector2);
                    break;
                }
                case -33: {
                    final int int11 = jr.b().readInt();
                    final byte byte7 = jr.b().readByte();
                    if (int11 != 0 && byte7 != 1 && byte7 == 2 && byte7 == 5) {
                        GameMidlet.i.b(GameMidlet.i.a[3] + int11);
                        main.a.a(String.valueOf(int11) + "xeng", ((js)GameMidlet.i).aw, ((js)GameMidlet.i).ax, -1, 0, -1);
                    }
                    GameMidlet.i.a(jr.b().readInt(), jr.b().readInt(), jr.b().readInt());
                    break;
                }
                case -1: {
                    jn.a(jr.b().readByte());
                    break;
                }
                case -47: {
                    final Vector vector3 = new Vector();
                    for (short short5 = jr.b().readShort(), n = 0; n < short5; ++n) {
                        final hx hx;
                        (hx = new hx()).a = jr.b().readShort();
                        hx.b = jr.b().readByte();
                        hx.c = jr.b().readUTF();
                        vector3.addElement(hx);
                    }
                    ae.b().a((Vector)vector3);
                    break;
                }
                case -48: {
                    final int int12 = jr.b().readInt();
                    final short short6 = jr.b().readShort();
                    ae.b();
                    ae.a(int12, short6);
                    break;
                }
                case -49: {
                    final byte byte8 = jr.b().readByte();
                    System.out.println("OPEN_SHOP: " + byte8);
                    final String utf12 = jr.b().readUTF();
                    short[] array = null;
                    final short short7;
                    if ((short7 = jr.b().readShort()) > 0) {
                        array = new short[short7];
                        for (short n2 = 0; n2 < short7; ++n2) {
                            array[n2] = jr.b().readShort();
                        }
                    }
                    ae.b().a((byte)0, (int)byte8, utf12, array, -1, (String[])null);
                    break;
                }
                case -50: {
                    q.a.a(jr.b().readUTF(), jr.b().readByte());
                    break;
                }
                case -51: {
                    final byte byte9 = jr.b().readByte();
                    final byte[] array2 = new byte[jr.b().available()];
                    jr.b().read(array2);
                    q.a.a(array2, byte9);
                    break;
                }
                case -52: {
                    final String utf13 = jr.b().readUTF();
                    jr.b().readInt();
                    es.b().a(utf13);
                    break;
                }
                case -90:
                case -53: {
                    this.c.a((byte)(byte)((jr.a != -53) ? 1 : 0), jr.b().readByte(), jr.b().readUTF());
                    break;
                }
                case -54: {
                    final String utf14 = jr.b().readUTF();
                    final String utf15 = jr.b().readUTF();
                    final String utf16 = jr.b().readUTF();
                    main.a.h();
                    main.a.a(utf14, (ii)new bm(this, utf15, utf16));
                    break;
                }
                case 50: {
                    if (this.a != kz.a && this.a != eo.a && this.a != df.a) {
                        break;
                    }
                    final byte byte10 = jr.b().readByte();
                    final byte byte11 = jr.b().readByte();
                    ModHandler.getArea = byte11;
                    short short8 = 0;
                    short short9 = 0;
                    Vector b5 = new Vector();
                    if (byte11 != -1 && byte11 != -2) {
                        short8 = jr.b().readShort();
                        short9 = jr.b().readShort();
                        b5 = b(jr);
                    }
                    final short short10 = jr.b().readShort();
                    Vector f = null;
                    Vector e = null;
                    if (short10 > 0) {
                        f = f(jr);
                        e = e(jr);
                    }
                    if (GameMidlet.e == 9) {
                        for (int k = 0; k < b5.size(); ++k) {
                        	hn hnx = (hn)b5.elementAt(k);
                            hnx.aa = jr.b().readShort();
                        }
                    }
                    ae.b().a(byte10, byte11, short8, short9, (Vector)b5, f, e);
                    if (ir.a == 21) {
                        main.a.J = 0;
                        df.a();
                        iy.a().c(0);
                        main.a.i();
                        break;
                    }
                    ModHandler.NPC();
                    break;
                }
                case -58: {
                    final byte byte12 = jr.b().readByte();
                    final Hashtable hashtable = new Hashtable();
                    for (byte b6 = 0; b6 < byte12; ++b6) {
                        final short short11 = jr.b().readShort();
                        final byte[] array3 = new byte[jr.b().readShort()];
                        jr.b().read(array3);
                        hashtable.put(new StringBuffer().append(short11).toString(), aw.a(array3));
                    }
                    final String utf17 = jr.b().readUTF();
                    final String utf18 = jr.b().readUTF();
                    System.err.println("CUSTOM_TAB: " + utf17);
                    System.err.println("CUSTOM_TAB111: " + utf18);
                    byte byte13 = -1;
                    if (jr.b().available() > 0) {
                        byte13 = jr.b().readByte();
                    }
                    jb.a = null;
                    jb.b().a((Hashtable)hashtable, utf17, utf18, byte13);
                    ((ha)jb.b()).a();
                    break;
                }
                case -59: {
                    if (main.a.v == main.a.s) {
                        main.a.v = null;
                    }
                    if (main.a.v != null) {
                        break;
                    }
                    final int int13 = jr.b().readInt();
                    final byte byte14 = jr.b().readByte();
                    final byte byte15;
                    final String[] array4 = new String[byte15 = jr.b().readByte()];
                    final short[] array5 = new short[byte15];
                    for (byte b7 = 0; b7 < byte15; ++b7) {
                        array4[b7] = jr.b().readUTF();
                    }
                    if (jr.b().available() > 0) {
                        for (byte b8 = 0; b8 < byte15; ++b8) {
                            array5[b8] = jr.b().readShort();
                        }
                    }
                    String utf19 = null;
                    String utf20 = null;
                    boolean[] array6 = null;
                    if (jr.b().available() > 0) {
                        utf19 = jr.b().readUTF();
                        utf20 = jr.b().readUTF();
                        array6 = new boolean[byte15];
                        for (byte b9 = 0; b9 < byte15; ++b9) {
                            array6[b9] = jr.b().readBoolean();
                        }
                    }
                    this.c.a(int13, byte14, array4, utf19, utf20, array6);
                    break;
                }
                case -60: {
                    final int int14 = jr.b().readInt();
                    final byte byte16 = jr.b().readByte();
                    final String utf21 = jr.b().readUTF();
                    final byte byte17 = jr.b().readByte();
                    byte[] array7 = null;
                    if (jr.b().available() > 0) {
                        array7 = new byte[jr.b().readShort()];
                        jr.b().read(array7);
                    }
                    main.a.u.a(utf21, (ii)new bo(this, int14, byte16), (int)byte17);
                    if (array7 != null) {
                        main.a.u.a(Image.createImage(array7, 0, array7.length));
                    }
                    break;
                }
                case -63: {
                    ir.a(jr.b().readByte());
                    break;
                }
                case -64: {
                    final int int15 = jr.b().readInt();
                    final short short12 = jr.b().readShort();
                    final byte byte18 = jr.b().readByte();
                    final Vector vector4 = new Vector();
                    for (byte b10 = 0; b10 < byte18; ++b10) {
                        final jh jh;
                        (jh = new jh()).b = jr.b().readByte();
                        switch (jh.b) {
                            case 1: {
                                jh.a = jr.b().readShort();
                                final byte byte19;
                                if ((byte19 = jr.b().readByte()) == -1) {
                                    jh.h = "(" + kf.cQ + ")";
                                    break;
                                }
                                jh.h = "(" + byte19 + " " + kf.cM + ")";
                                break;
                            }
                            case 2: {
                                jh.c = jr.b().readInt();
                                break;
                            }
                            case 3: {
                                jh.f = jr.b().readInt();
                                break;
                            }
                            case 4: {
                                jh.g = jr.b().readInt();
                                break;
                            }
                        }
                        vector4.addElement(jh);
                    }
                    hw.b().a(int15, (int)short12, (Vector)vector4);
                    break;
                }
                case -70: {
                    final int int16 = jr.b().readInt();
                    final byte b11 = (byte)(100 - jr.b().readByte());
                    ae.b();
                    ae.b(int16, b11);
                    break;
                }
                case -80: {
                    final short short13 = jr.b().readShort();
                    final byte[] array8 = new byte[jr.b().readShort()];
                    jr.b().read(array8);
                    if (doGetClan)
                    {
                      DataSave.doSaveClan(array8, short13 + ".png");
                    }
                    fx.h.put(new StringBuffer().append(short13).toString(), new f(aw.a(array8)));
                    if (!doGetClan)
                    {
                    	System.out.println("GET_IMAGE>>" + short13);
                    }
                    break;
                }
                case -81: {
                    final String utf22 = jr.b().readUTF();
                    int n3 = 0;
                    for (int l = 0; l < utf22.length(); ++l) {
                        if (utf22.charAt(l) == '-') {
                            ++n3;
                        }
                    }
                    final byte[] array9 = new byte[jr.b().available()];
                    jr.b().read(array9);
                    if (n3 == 2 || utf22.equals(cy.h)) {
                        cy.i.put(utf22, array9);
                        cy.b().a(utf22);
                        System.out.println(utf22);
                        DataSave.doDataSave(array9, "ListFriend.dat");
                        break;
                    }
                    cy.b().a(array9, utf22);
                    System.out.println(utf22);
                    DataSave.doDataSave(array9, "ListData.dat");
                    main.a.h();
                    break;
                }
                case -82: {
                    final int int17 = jr.b().readInt();
                    final short short14 = jr.b().readShort();
                    ae.b();
                    ae.b(int17, short14);
                    break;
                }
                case -83: {
                    final byte byte20 = jr.b().readByte();
                    final Vector vector5 = new Vector();
                    for (byte b12 = 0; b12 < byte20; ++b12) {
                        final bc bc;
                        (bc = new bc()).e = jr.b().readShort();
                        bc.a = jr.b().readUTF();
                        bc.d = jr.b().readShort();
                        vector5.addElement(bc);
                    }
                    ae.b().b((Vector)vector5);
                    break;
                }
                case -77: {
                    final int int18 = jr.b().readInt();
                    final byte byte21 = jr.b().readByte();
                    final String utf23 = jr.b().readUTF();
                    final byte byte22;
                    final String[] array10 = new String[byte22 = jr.b().readByte()];
                    for (byte b13 = 0; b13 < byte22; ++b13) {
                        array10[b13] = jr.b().readUTF();
                    }
                    if (dp.a != main.a.r) {
                        ae.b().a(int18, (int)byte21, utf23, array10);
                    }
                    break;
                }
                case -78: {
                    final byte byte23 = jr.b().readByte();
                    final int int19 = jr.b().readInt();
                    final byte byte24 = jr.b().readByte();
                    final String utf24 = jr.b().readUTF();
                    final short short15;
                    if ((short15 = jr.b().readShort()) > 0) {
                        final short[] array11 = new short[short15];
                        final String[] array12 = new String[short15];
                        String[] array13 = null;
                        if (byte23 == 1) {
                            array13 = new String[short15];
                        }
                        for (short n4 = 0; n4 < short15; ++n4) {
                            array11[n4] = jr.b().readShort();
                            array12[n4] = jr.b().readUTF();
                            if (byte23 == 1) {
                                array13[n4] = jr.b().readUTF();
                            }
                        }
                        ae.b().a(byte23, (int)byte24, utf24, array11, int19, array12);
                    }
                    break;
                }
                case 89: {
                    final byte byte25 = jr.b().readByte();
                    System.out.println("DROP_PART: " + byte25 + "    " + jr.b().available());
                    if (byte25 == 0) {
                        final byte byte26 = jr.b().readByte();
                        final short short16 = jr.b().readShort();
                        final int int20 = jr.b().readInt();
                        final int int21 = jr.b().readInt();
                        System.out.println("aaaaaa: " + byte26 + "   " + short16 + "   " + int20 + "   " + int21);
                        final short short17 = jr.b().readShort();
                        final short short18 = jr.b().readShort();
                        ae.b();
                        ae.a(byte26, int21, short16, int20, short17, short18);
                        break;
                    }
                    final int int22 = jr.b().readInt();
                    final int int23 = jr.b().readInt();
                    ae.b();
                    ae.c(int22, int23);
                    break;
                }
                case -84: {
                    final byte byte27 = jr.b().readByte();
                    final short byte28 = jr.b().readByte();
                    System.out.println("ReqEffObj: " + byte28);
                    if (byte28 == 5 || byte28 == 2) {
                        break;
                    }
                    if (byte27 != 0) {
                        final al al;
                        (al = new al()).e = byte28;
                        final byte[] array14 = new byte[jr.b().readShort()];
                        jr.b().read(array14);
                        if (reqEffImg) {
                        	DataSave.doSaveEffObjImg(array14, byte28 +".png");
                        }
                        al.c = aw.a(array14);
                        final byte byte29 = jr.b().readByte();
                        al.b = new ke[byte29];
                        for (byte b14 = 0; b14 < byte29; ++b14) {
                            al.b[b14] = new ke();
                            al.b[b14].a = jr.b().readByte();
                            al.b[b14].c = jr.b().readByte();
                            al.b[b14].d = jr.b().readByte();
                            al.b[b14].e = jr.b().readByte();
                            al.b[b14].f = jr.b().readByte();
                        }
                        final byte byte30 = jr.b().readByte();
                        al.d = new jf[byte30];
                        for (byte b15 = 0; b15 < byte30; ++b15) {
                            al.d[b15] = new jf(this);
                            final byte byte31 = jr.b().readByte();
                            al.d[b15].b = new short[byte31];
                            al.d[b15].c = new short[byte31];
                            al.d[b15].a = new byte[byte31];
                            for (byte b16 = 0; b16 < byte31; ++b16) {
                                al.d[b15].b[b16] = jr.b().readByte();
                                al.d[b15].c[b16] = jr.b().readByte();
                                al.d[b15].a[b16] = jr.b().readByte();
                            }
                        }
                        final byte byte32 = jr.b().readByte();
                        al.a = new byte[byte32];
                        for (byte b17 = 0; b17 < byte32; ++b17) {
                            al.a[b17] = jr.b().readByte();
                        }
                        fx.k.addElement(al);
                        break;
                    }
                    if (fx.d((short)byte28) == null) {
                        iy.a().c((short)byte28);
                    }
                    final lc lc;
                    (lc = new lc()).a = byte28;
                    lc.k = jr.b().readByte();
                    final lc lc2 = lc;
                    final lc lc3 = lc;
                    final byte byte33 = jr.b().readByte();
                    lc3.g = byte33;
                    lc2.c = byte33;
                    if (lc.k == 4) {
                        final short short19 = jr.b().readShort();
                        final byte byte34 = jr.b().readByte();
                        if (main.a.B.size() > 0) {
                            for (int n5 = 0; n5 < main.a.B.size(); ++n5) {
                                if (((gz)main.a.B.elementAt(n5)).c == byte28) {
                                    break;
                                }
                            }
                        }
                        final gz gz;
                        ((ba)(gz = (gz)new ba(2, (int)short19))).a = byte34;
                        gz.c = byte28;
                        gz.c();
                        break;
                    }
                    lc.b = jr.b().readShort();
                    lc.l = jr.b().readByte();
                    if (lc.l == 1) {
                        lc.d = jr.b().readShort();
                    }
                    else if (lc.l == 2) {
                        final byte byte35 = jr.b().readByte();
                        lc.m = new short[byte35];
                        lc.n = new short[byte35];
                        for (byte b18 = 0; b18 < byte35; ++b18) {
                            lc.m[b18] = jr.b().readShort();
                            lc.n[b18] = jr.b().readShort();
                        }
                    }
                    if (lc.k == 0) {
                        lc.j = jr.b().readInt();
                    }
                    else {
                        lc.e = jr.b().readShort();
                        lc.f = jr.b().readShort();
                    }
                    ae.b();
                    ae.a(lc);
                    break;
                }
                case -85: {
                    final int int24 = jr.b().readInt();
                    final byte byte36 = jr.b().readByte();
                    final Vector vector6 = new Vector();
                    for (byte b19 = 0; b19 < byte36; ++b19) {
                        final bd bd = new bd(this);
                        jr.b().readByte();
                        bd.a = jr.b().readShort();
                        bd.b = jr.b().readShort();
                        vector6.addElement(bd);
                    }
                    ae.b();
                    ae.a(int24, (Vector)vector6);
                break;
                }
                case -24: {
                    final short short20;
                    if ((short20 = jr.b().readShort()) != -1) {
                        jr.b().readInt();
                        jr.b().readByte();
                    }
                    final String utf25 = jr.b().readUTF();
                    final int int25 = jr.b().readInt();
                    final int int26 = jr.b().readInt();
                    final int int27 = jr.b().readInt();
                    ae.b();
                    ae.a(short20, utf25, int25, int26, int27);
                    break;
                }
                case -87: {
                    final short short21 = jr.b().readShort();
                    final Vector vector7 = new Vector();
                    for (short n6 = 0; n6 < short21; ++n6) {
                        final hx hx2;
                        (hx2 = new hx()).a = jr.b().readShort();
                        hx2.b = jr.b().readByte();
                        hx2.c = jr.b().readUTF();
                        vector7.addElement(hx2);
                    }
                    final int int28 = jr.b().readInt();
                    final byte byte37 = jr.b().readByte();
                    final short short22 = jr.b().readShort();
                    final Vector vector8 = new Vector();
                    for (short n7 = 0; n7 < short22; ++n7) {
                        final hx hx3;
                        (hx3 = new hx()).a = jr.b().readShort();
                        hx3.b = jr.b().readByte();
                        hx3.c = jr.b().readUTF();
                        vector8.addElement(hx3);
                    }
                    ei.b().a((Vector)vector7, (Vector)vector8, int28, byte37);
                    break;
                }
                case -88: {
                    ei.b();
                    ei.g();
                    break;
                }
                case -89: {
                    ei.b().a(jr.b().readBoolean(), jr.b().readUTF());
                    break;
                }
                case -92: {
                    jr.b().readByte();
                    jr.b().read(new byte[jr.b().readInt()]);
                    final int int29 = jr.b().readInt();
                    jr.b().readByte();
                    final byte[] array15 = new byte[int29];
                    for (int n8 = 0; n8 < int29; ++n8) {
                        array15[n8] = jr.b().readByte();
                    }
                    final byte byte38 = jr.b().readByte();
                    final Vector vector9 = new Vector();
                    for (byte b20 = 0; b20 < byte38; ++b20) {
                        final kb kb = new kb();
                        jr.b().readByte();
                        kb.d = jr.b().readShort();
                        kb.c = jr.b().readUTF();
                        kb.a = jr.b().readByte();
                        kb.b = jr.b().readByte();
                        vector9.addElement(kb);
                    }
                    ea.j = false;
                    ea.b().a();
                    ir.a = -1;
                    ir.D = -108;
                    ir.E = -1;
                    break;
                }
                case -93: {
                    final byte byte39 = jr.b().readByte();
                    final byte byte40 = jr.b().readByte();
                    jr.b().readShort();
                    final byte byte41 = jr.b().readByte();
                    final byte[] array16 = new byte[jr.b().readShort()];
                    jr.b().read(array16);
                    if (getDataMap)
                    {
                      DataSave.doSaveDataMap(array16, "idMap_"+byte39+"_idTile_"+byte40+"_wMap_"+byte41 + ".data");
                    }
                    short[] array17 = null;
                    final byte byte42;
                    if ((byte42 = jr.b().readByte()) > 0) {
                        array17 = new short[byte42];
                        for (byte b21 = 0; b21 < byte42; ++b21) {
                            array17[b21] = jr.b().readShort();
                        }
                    }
                    final short short23 = jr.b().readShort();
                    Image a = null;
                    if (short23 > 0) {
                        final byte[] array18 = new byte[short23];
                        jr.b().read(array18);
                        if (getDataMap)
                        {
                          DataSave.doSaveDataMap(array18, "idBG_"+short23+ ".png");
                        }
                        a = aw.a(array18);
                    }
                    final short short24 = jr.b().readShort();
                    Vector f2 = null;
                    Vector e2 = null;
                    if (short24 > 0) {
                        f2 = f(jr);
                        e2 = e(jr);
                    }
                    ae.b();
                    ae.a(array16, byte39, byte40, byte41, a, array17, f2, e2);
                    break;
                }
                case -94: {
                    final byte byte43 = jr.b().readByte();
                    final byte[] array19 = new byte[jr.b().available()];
                    jr.b().read(array19);
                    if (getTileMap)
                    {
                      DataSave.doSaveTile(array19, byte43 + ".png");
                    }
                    main.a.x.a(byte43, array19);
                    break;
                }
                case -96: {
                    main.a.h();
                    ae.b().n();
                    la.b().a();
                    la.b().b = 0;
                    break;
                }
                case -97: {
                    final byte[] array20 = new byte[jr.b().available()];
                    jr.b().read(array20);
                    if (doGetDataItem)
                    {
                    	DataSave.readAvatarPart(array20, true);
                    }
                    Vector vec = fx.a(array20, true);
                    ld ld = (ld) vec.elementAt(0);
                    fx.j.put(new StringBuffer().append(ld.g).toString(), ld);
                    for (int n9 = 0; n9 < ir.m.size(); ++n9) {
                        final js js;
                        if ((js = (js) ir.m.elementAt(n9)).az == 0) {
                            ((hn)js).h();
                        }
                    }
                    break;
                }
                case -98: {
                    final short short25 = jr.b().readShort();
                    final byte[] array21 = new byte[jr.b().readShort()];
                    jr.b().read(array21);
                    if (doGetItem)
                    {
                      DataSave.doSaveItem(array21, short25 + ".png");
                    }
                    fx.i.put(new StringBuffer().append(short25).toString(), new f(aw.a(array21)));
                    break;
                }
                case -38: {
                    final short short26 = jr.b().readShort();
                    int int30 = 0;
                    if (short26 != -1) {
                        int30 = jr.b().readInt();
                    }
                    GameMidlet.i.a(jr.b().readInt(), jr.b().readInt(), jr.b().readInt());
                    ae.b();
                    ae.a(short26, int30);
                    break;
                }
                case -99: {
                    final byte byte44 = jr.b().readByte();
                    final byte byte45 = jr.b().readByte();
                    final Vector vector10 = new Vector();
                    for (byte b22 = 0; b22 < byte45; ++b22) {
                        final hn hn5;
                        ((gx)(hn5 = new hn())).w = jr.b().readInt();
                        hn5.a(jr.b().readUTF());
                        for (byte byte46 = jr.b().readByte(), b23 = 0; b23 < byte46; ++b23) {
                            hn5.a(new hx(jr.b().readShort()));
                        }
                        ((js)hn5).aw = jr.b().readShort();
                        ((js)hn5).ax = jr.b().readShort();
                        hn5.ac = jr.b().readByte();
                        hn5.W = (byte)(100 - jr.b().readByte());
                        hn5.X = jr.b().readShort();
                        final byte byte47 = jr.b().readByte();
                        hn5.ar = new String[byte47];
                        for (byte b24 = 0; b24 < byte47; ++b24) {
                            hn5.ar[b24] = jr.b().readUTF();
                        }
                        vector10.addElement(hn5);
                    }
                    final short short27 = jr.b().readShort();
                    Vector f3 = null;
                    Vector e3 = null;
                    if (short27 > 0) {
                        f3 = f(jr);
                        e3 = e(jr);
                    }
                    ae.b().a(byte44, (Vector)vector10, f3, e3);
                    break;
                }
                case -17: {
                    GameMidlet.f = jr.b().readByte();
                    GameMidlet.g = jr.b().readUTF();
                    fx.c();
                    break;
                }
                case -101: {
                    final byte byte48 = jr.b().readByte();
                    final short short28 = jr.b().readShort();
                    if (byte48 != 1) {
                        for (int n10 = 0; n10 < ae.o.size(); ++n10) {
                            if (((bc)ae.o.elementAt(n10)).e == short28) {
                                ae.o.removeElementAt(n10);
                                break;
                            }
                        }
                        break;
                    }
                    final bc bc2;
                    (bc2 = new bc()).e = short28;
                    bc2.a = jr.b().readUTF();
                    bc2.d = jr.b().readShort();
                    ((cc)bc2).f = jr.b().readByte();
                    ae.o.addElement(bc2);
                    if (main.a.r == dp.b()) {
                        dp.b().d();
                    }
                    if (ir.p != null) {
                        cd.b().e();
                        break;
                    }
                    cd.b().f();
                    break;
                }
                case -103: {
                    final hn g = ir.g(jr.b().readInt());
                    if (jr.b().readByte() == 0) {
                        g.X = jr.b().readShort();
                        break;
                    }
                    g.aa = jr.b().readShort();
                    break;
                }
                case -102: {
                    final int int31 = jr.b().readInt();
                    final int int32 = jr.b().readInt();
                    hn hn6;
                    if (jy.b) {
                        hn6 = kx.h(int31);
                    }
                    else {
                        hn6 = ir.g(int31);
                    }
                    if (hn6 != null) {
                        hn6.a[3] = int32;
                    }
                    break;
                }
                case -105: {
                    final byte byte49 = jr.b().readByte();
                    final Vector vector11 = new Vector();
                    for (byte b25 = 0; b25 < byte49; ++b25) {
                        vector11.addElement(new bu(this, jr.b().readUTF(), (ii)new br(this, (int)b25), jr.b().readShort()));
                    }
                    main.a.h();
                    go.b();
                    go.a((Vector)vector11);
                    break;
                }
                case -107: {
                    final byte byte50 = jr.b().readByte();
                    String s = null;
                    String[] array22 = null;
                    String[] array23 = null;
                    String[] array24 = null;
                    short[] array25 = null;
                    short[] array26 = null;
                    short[] array27 = null;
                    int[] array28 = null;
                    if (byte50 == 0) {
                        s = jr.b().readUTF();
                        final int short29;
                        array22 = new String[short29 = jr.b().readShort()];
                        array25 = new short[short29];
                        array23 = new String[short29];
                        array24 = new String[short29];
                        array26 = new short[short29];
                        array27 = new short[short29];
                        for (int n11 = 0; n11 < short29; ++n11) {
                            array26[n11] = jr.b().readShort();
                            array25[n11] = jr.b().readShort();
                            array27[n11] = jr.b().readShort();
                            array22[n11] = jr.b().readUTF();
                            array23[n11] = jr.b().readUTF();
                            array24[n11] = jr.b().readUTF();
                        }
                    }
                    else if (byte50 == 1) {
                        s = jr.b().readUTF();
                        final int short30;
                        array26 = new short[short30 = jr.b().readShort()];
                        array22 = new String[short30];
                        array25 = new short[short30];
                        array28 = new int[short30];
                        array24 = new String[short30];
                        array27 = new short[short30];
                        array23 = new String[short30];
                        for (int n12 = 0; n12 < short30; ++n12) {
                            array26[n12] = jr.b().readShort();
                            array22[n12] = jr.b().readUTF();
                            array23[n12] = jr.b().readUTF();
                            array25[n12] = jr.b().readShort();
                            array27[n12] = jr.b().readShort();
                            array28[n12] = jr.b().readInt();
                            array24[n12] = jr.b().readUTF();
                        }
                    }
                    ei.b().a(byte50, s, array22, array25, array26, array23, array24, array28, array27);
                    break;
                }
                case -74: {
                    final kq kq;
                    (kq = new kq()).b = jr.b().readShort();
                    ((js)kq).aw = 24 * jr.b().readByte();
                    ((js)kq).ax = 24 * jr.b().readByte();
                    ei.b().a(kq);
                    break;
                }
                case 122: {
                    jr.b().readByte();
                    ir.a(jr.b().readByte(), jr.b().readByte(), (int)jr.b().readShort(), (int)jr.b().readShort());
                    break;
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        if (this.a != null) {
            this.a.a(jr);
            return;
        }
        try {
            System.out.println("cmd: " + jr.a);
            switch (jr.a) {
                case -5: {
                    jn.a(jr.b().readUTF());
                    break;
                }
                case -4: {
                    es.b().g();
                    ((gx)(GameMidlet.i = new hn())).w = jr.b().readInt();
                    final byte byte51 = jr.b().readByte();
                    GameMidlet.i.e = new Vector();
                    for (byte b26 = 0; b26 < byte51; ++b26) {
                        final hx hx4;
                        (hx4 = new hx()).a = jr.b().readShort();
                        GameMidlet.i.a(hx4);
                    }
                    GameMidlet.i.d = jr.b().readByte();
                    GameMidlet.j.g = jr.b().readByte();
                    GameMidlet.j.f = jr.b().readByte();
                    GameMidlet.i.a(jr.b().readInt());
                    GameMidlet.j.a = jr.b().readByte();
                    GameMidlet.j.b = jr.b().readByte();
                    GameMidlet.j.e = jr.b().readByte();
                    GameMidlet.j.c = jr.b().readByte();
                    GameMidlet.j.d = jr.b().readByte();
                    GameMidlet.i.a[2] = jr.b().readInt();
                    GameMidlet.i.ac = jr.b().readByte();
                    for (int n13 = 0; n13 < GameMidlet.i.e.size(); ++n13) {
                        final hx hx5;
                        (hx5 = (hx) GameMidlet.i.e.elementAt(n13)).b = jr.b().readByte();
                        hx5.c = jr.b().readUTF();
                    }
                    GameMidlet.i.X = jr.b().readShort();
                    ae.n = new Vector();
                    for (byte byte52 = jr.b().readByte(), b27 = 0; b27 < byte52; ++b27) {
                        final bc bc3;
                        (bc3 = new bc()).a = jr.b().readUTF();
                        bc3.d = jr.b().readShort();
                        ae.n.addElement(bc3);
                    }
                    ae.o = new Vector();
                    final byte byte53 = jr.b().readByte();
                    for (byte b28 = 0; b28 < byte53; ++b28) {
                        final bc bc4;
                        (bc4 = new bc()).e = jr.b().readShort();
                        bc4.a = jr.b().readUTF();
                        bc4.d = jr.b().readShort();
                        ae.o.addElement(bc4);
                    }
                    ae.b().y = jr.b().readBoolean();
                    if (jr.b().available() > 0) {
                        for (byte b29 = 0; b29 < byte53; ++b29) {
                            ((cc)ae.o.elementAt(b29)).f = jr.b().readByte();
                        }
                    }
                    if (jr.b().available() > 0) {
                        main.a.W = jr.b().readByte();
                    }
                    final hn m = GameMidlet.i;
                    final kp j2 = GameMidlet.j;
                    final short short31 = jr.b().readShort();
                    j2.g = short31;
                    m.v = short31;
                    if (main.a.W == 1 || main.a.W == 2) {
                        kf.ek = kf.el;
                    }
                    GameMidlet.i.aa = jr.b().readShort();
                    if (jr.b().available() > 0) {
                        ae.u = jr.b().readBoolean();
                    }
                    if (ae.u) {
                        GameMidlet.i.a[3] = jr.b().readInt();
                    }
                    ae.q = new Vector();
                    for (byte byte54 = jr.b().readByte(), b30 = 0; b30 < byte54; ++b30) {
                        final km km;
                        (km = new km()).a = jr.b().readShort();
                        km.c = jr.b().readUTF();
                        km.b = jr.b().readShort();
                        km.d = jr.b().readInt();
                        km.e = jr.b().readByte();
                        ae.q.addElement(km);
                    }
                    GameMidlet.i.c(jr.b().readInt());
                    GameMidlet.i.b = jr.b().readInt();
                    jr.b().readByte();
                    final String utf26 = jr.b().readUTF();
                    GameMidlet.i.a(utf26);
                    System.out.println("money: " + GameMidlet.i.a[2] + "    " + utf26);
                    jn.a();
                    System.out.println("2222222222222222222");
                    break;
                }
            }
        }
        catch (Exception ex2) {
            ex2.printStackTrace();
        }
    }
    
    public static Vector b(jr paramjr)
    {
      Vector localVector = new Vector();
      try
      {
        int i = paramjr.b().readByte();
        hn localhn;
        for (int j = 0; j < i; j++)
        {
          (localhn = new hn()).w = paramjr.b().readInt();
          localhn.a(paramjr.b().readUTF());
          int m = paramjr.b().readByte();
          for (int i1 = 0; i1 < m; i1++)
          {
            short s = paramjr.b().readShort();
            localhn.a(new hx(s));
          }
          localhn.aw = paramjr.b().readShort();
          localhn.ax = paramjr.b().readShort();
          localhn.ac = paramjr.b().readByte();
          localVector.addElement(localhn);
        }
        for (int j = 0; j < i; j++) {
          (localhn = (hn)localVector.elementAt(j)).K = paramjr.b().readByte();
        }
        for (int j = 0; j < i; j++) {
          (localhn = (hn)localVector.elementAt(j)).W = ((byte)(100 - paramjr.b().readByte()));
        }
        for (int j = 0; j < i; j++) {
          (localhn = (hn)localVector.elementAt(j)).X = paramjr.b().readShort();
        }
        byte j = paramjr.b().readByte();
        for (int k = 0; k < j; k++)
        {
          hm localhm;
          (localhm = new hm()).e = paramjr.b().readByte();
          localhm.a = paramjr.b().readShort();
          localhm.d = paramjr.b().readInt();
          localhm.aw = paramjr.b().readShort();
          localhm.ax = paramjr.b().readShort();
          localVector.addElement(localhm);
        }
        ir.o = null;
        byte k = 0;
        if (paramjr.b().available() > 0) {
          k = paramjr.b().readByte();
        }
        if (k > 0)
        {
          ir.o = new Vector();
          for (int n = 0; n < k; n++)
          {
            dr localdr;
            (localdr = new dr()).c = paramjr.b().readShort();
            localdr.a = paramjr.b().readShort();
            localdr.b = paramjr.b().readShort();
            localdr.d = paramjr.b().readByte();
            ir.o.addElement(localdr);
          }
        }
      }
      catch (IOException localIOException2)
      {
        IOException localIOException1;
        (localIOException1 = localIOException2).printStackTrace();
      }
      return localVector;
    }
    
    private static Vector e(jr paramjr)
    {
      try
      {
        int i = paramjr.b().readByte();
        System.out.println("readMapItemaaaa: " + i);
        Vector localVector = new Vector();
        for (int j = 0; j < i; j++)
        {
          kq localkq;
          (localkq = new kq()).f = paramjr.b().readByte();
          localkq.b = paramjr.b().readByte();
          localkq.aw = paramjr.b().readByte();
          localkq.ax = paramjr.b().readByte();
          localkq.d = true;
          localVector.addElement(localkq);
        }
        return localVector;
      }
      catch (Exception localException2)
      {
        localException2.printStackTrace();
      }
      return null;
    }
    
    private static Vector f(jr paramjr)
    {
      try
      {
        int i = paramjr.b().readByte();
        Vector localObject = new Vector();
        System.out.println("size item: " + i);
        for (int j = 0; j < i; j++)
        {
          ag localag;
          (localag = new ag()).a = paramjr.b().readByte();
          localag.b = paramjr.b().readShort();
          localag.c = paramjr.b().readByte();
          localag.e = paramjr.b().readShort();
          localag.f = paramjr.b().readShort();
          int k = paramjr.b().readByte();
          localag.j = new Vector();
          for (int m = 0; m < k; m++)
          {
            dr localdr;
            (localdr = new dr()).a = paramjr.b().readByte();
            localdr.b = paramjr.b().readByte();
            localag.j.addElement(localdr);
          }
          ((Vector)localObject).addElement(localag);
        }
        return (Vector)localObject;
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
      }
      return null;
    }
    
    public static void c(jr paramjr)
    {
    	try {
    		int i = paramjr.b().readInt();
    		int j = paramjr.b().readShort();
    		int k = paramjr.b().readShort();
    		int m = paramjr.b().readByte();
    		short s = 0;
    		if (paramjr.b().available() > 0) {
    			s = paramjr.b().readShort();
    		}
    		ae.b();
    		ae.a(i, j, k, m, s);
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
    
    public static void d(jr paramjr)
    {
	try {
		int i = paramjr.b().readInt();
	    String msg = paramjr.b().readUTF();
	    ae.b();
	    ae.a(i, msg);
	} catch (IOException e) {
		e.printStackTrace();
	}
    }
}
