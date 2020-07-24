import java.util.Vector;

public final class lf extends kj implements kk {
   private static lf a = new lf();

   public static void a() {
      ce.a().a = a;
   }

   public final void a(jr var1) {
      try {
         ah var10;
         byte[] var13;
         switch(var1.a) {
         case -41:
            var13 = new byte[var1.b().available()];
            var1.b().read(var13);
            fx.e(var13);
            return;
         case -40:
            var13 = new byte[var1.b().available()];
            var1.b().read(var13);
            fx.d(var13);
            return;
         case -37:
            var13 = new byte[var1.b().available()];
            var1.b().read(var13);
            DataSave.readItemDataInfo(var13);
            fx.b(var13);
            return;
         case -16:
            var13 = new byte[var1.b().available()];
            var1.b().read(var13);
            DataSave.readAvatarPart(var13, false);
            fx.a(var13);
            return;
         case -15:
            byte[] var16 = new byte[var1.b().available()];
            var1.b().read(var16);
            fx.c(var16);
            return;
         case -14:
            (var10 = new ah()).a = var1.b().readShort();
            var10.b = var1.b().readShort();
            int var12 = var1.b().readUnsignedShort();
            var10.d = new byte[var12];

            for(int var15 = 0; var15 < var12; ++var15) {
               var10.d[var15] = var1.b().readByte();
            }

            var10.c = -1;
            if(var1.b().available() >= 2) {
               var10.c = var1.b().readShort();
            }

            fx.a(var10);
            return;
         case -11:
            Vector var2 = new Vector();
            byte var3 = var1.b().readByte();

            for(int var4 = 0; var4 < var3; ++var4) {
               ah var5;
               (var5 = new ah()).a = var1.b().readShort();
               var5.b = var1.b().readShort();
               var2.addElement(var5);
            }

            short var17 = var1.b().readShort();
            short var18 = var1.b().readShort();
            short var14 = var1.b().readShort();
            short var6 = var1.b().readShort();
            short var7 = var1.b().readShort();
            byte var8 = var1.b().readByte();

            for(int var9 = 0; var9 < var8; ++var9) {
               (var10 = new ah()).a = var1.b().readShort();
               var10.b = var1.b().readShort();
               var2.addElement(var10);
            }

            var1.b().readInt();
            fx.a(var2, var17, var18, var14, var6, var7);
            return;
         default:
         }
      } catch (Exception var11) {
         var11.printStackTrace();
      }
   }
}
