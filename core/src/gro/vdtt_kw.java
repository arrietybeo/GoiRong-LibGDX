package gro;

import java.util.Vector;

public final class vdtt_kw extends vdtt_ap {
   private vdtt_bz a;

   public vdtt_kw(MainScreen var1) {
      this.e = 2;
      this.H = var1;
      this.J = false;
      this.a(220, 125);
      this.a = new vdtt_bz(85, 40, 100, "", this, 0, 2, 0);
      byte var2 = 12;
      this.a.l = var2;
      this.a(this.a);
      this.a(Caption.bi, 100);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.ge + Utlis.c(Char.gI().bac) + Caption.fh, 30, 28, 0, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.gf, 30, 50, 0, -1, -16777216);
   }

   public final void a_() {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(new vdtt_hi(0, 0, 0, this.width, this.height, this.I, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);

      try {
         switch(var1.b) {
         case 100:
            vdtt_kw var4 = this;

            try {
               Message var5;
               (var5 = Message.c((byte)-95)).writeInt(var4.a.h());
               var5.send();
               break;
            } catch (Exception var6) {
               DataCenter.gI().currentScreen.c(Caption.gg, -1);
            }
         default:
            return;
         }
      } catch (Exception var7) {
      }

   }
}