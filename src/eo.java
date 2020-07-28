import java.io.IOException;

import main.*;

public final class eo extends kj implements kk
{
    public static eo a;
    
    public static void a() {
        if (eo.a == null) {
            eo.a = new eo();
        }
        ce.a().a = (kk)eo.a;
    }
    
    public final void a(final jr jr) {
        try {
            switch (jr.a) {
                case 51: {
                    ae.b().a(b(jr));
                    break;
                }
                case 54: {
                    ce.c(jr);
                    break;
                }
                case 55: {
                    ce.d(jr);
                    break;
                }
                case 53: {
                    final int int1 = jr.b().readInt();
                    ae.b();
                    ae.c(int1);
                    System.out.println("PlayerOut: " + int1);
                    break;
                }
                case 57: {
                    final int int2 = jr.b().readInt();
                    final byte byte1 = jr.b().readByte();
                    ae.b();
                    ae.a(int2, byte1);
                    break;
                }
                case 58: {
                    final int int3 = jr.b().readInt();
                    final int int4 = jr.b().readInt();
                    final short short1 = jr.b().readShort();
                    String utf = "";
                    if (short1 == -1) {
                        utf = jr.b().readUTF();
                    }
                    final int int5 = jr.b().readInt();
                    jr.b().readByte();
                    System.out.println("AVATAR_GIFT_GIVING: " + jr.b().available());
                    ae.b().a(int3, int4, (int)short1, utf, int5, jr.b().readInt(), jr.b().readInt(), jr.b().readInt());
                    break;
                }
                case 59: {
                    final int int6 = jr.b().readInt();
                    final int int7 = jr.b().readInt();
                    final short short2 = jr.b().readShort();
                    System.out.println("idFrom: "+int6+"_idTo: "+ int7 + "_idGift: " + short2);
                    	if(ModHandler.kickHit){
                    		if(int7 == 5993 && short2 == 100) {
                    			cx.a().b(int6, "dmwkick");
                    			iy.a().a(104);
                    			break;
                    		}
                    	}
                    String utf2 = "";
                    int short3 = 0;
                    if (short2 == -1) {
                        utf2 = jr.b().readUTF();
                    }
                    else {
                        short3 = jr.b().readShort();
                    }
                    ae.b().a(int6, int7, (int)short2, utf2, short3);
                    break;
                }
                case 60: {
                    final byte byte2;
                    final int[] array = new int[byte2 = jr.b().readByte()];
                    for (byte b = 0; b < byte2; ++b) {
                        array[b] = jr.b().readByte();
                    }
                    ae.b().a(array);
                    main.a.h();
                    break;
                }
                case 78: {}
                case 82: {
                    kv.b().b(jr.b().readInt());
                    break;
                }
                case 84: {
                    kv.b().c(jr.b().readInt(), (int)jr.b().readShort());
                    break;
                }
                case 85: {
                    kv.b().e(jr.b().readInt());
                    break;
                }
                case 91: {
                    final int int8 = jr.b().readInt();
                    final short short4 = jr.b().readShort();
                    final short short5 = jr.b().readShort();
                    final byte byte3;
                    final byte[][] array2 = new byte[byte3 = jr.b().readByte()][];
                    for (byte b2 = 0; b2 < byte3; ++b2) {
                        array2[b2] = new byte[jr.b().readShort()];
                        jr.b().read(array2[b2]);
                    }
                    kv.b().a(int8, (int)short4, short5, array2);
                    break;
                }
                case 86: {
                    final boolean boolean1 = jr.b().readBoolean();
                    String utf3 = "";
                    if (!boolean1) {
                        utf3 = jr.b().readUTF();
                    }
                    kv.b().a(boolean1, utf3);
                    break;
                }
                case 87: {
                    final int int9 = jr.b().readInt();
                    final byte byte4 = jr.b().readByte();
                    kv.b();
                    kv.e(int9, (int)byte4);
                    break;
                }
                case 88: {
                    kv.b().a(jr.b().readInt(), jr.b().readByte(), jr.b().readByte(), jr.b().readInt(), jr.b().readShort());
                    break;
                }
                case -68: {
                    ae.b().a(jr.b().readByte(), jr.b().readInt());
                    break;
                }
                case -69: {
                    main.a.b(kf.dl, (ii)new ka(this));
                    break;
                }
                case 92: {
                    if (ae.s = jr.b().readBoolean()) {
                        GameMidlet.i.Z = jr.b().readShort();
                        return;
                    }
                    break;
                }
                case 93: {
                    ae.b().e(jr.b().readInt(), jr.b().readInt());
                    break;
                }
                default: {}
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    public static hn b(jr paramjr)
    {
      hn localhn = new hn();
      try {
  		  localhn.w = paramjr.b().readInt();
		  localhn.a(paramjr.b().readUTF());
		  int i = paramjr.b().readByte();
		  for (int j = 0; j < i; j++) {
		    localhn.a(new hx(paramjr.b().readShort()));
		  }
		  localhn.aw = (localhn.C = paramjr.b().readShort());
		  localhn.ax = (localhn.D = paramjr.b().readShort());
		  localhn.ac = paramjr.b().readByte();
		  localhn.W = ((byte)(100 - paramjr.b().readByte()));
		  localhn.X = paramjr.b().readShort();
		  localhn.aa = paramjr.b().readShort();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      return localhn;
    }
}
