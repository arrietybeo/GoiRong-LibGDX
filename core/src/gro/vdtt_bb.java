package gro;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Vector;

public final class vdtt_bb extends vdtt_k {
   public String l;
   private int I;
   public boolean m;
   private short J = 8;
   public boolean n;
   public boolean H;

   public vdtt_bb(int var1, int var2, String var3, vdtt_w var4, int var5) {
      this.l = var3;
      this.a = var4;
      this.I = var5;
      this.setXY(var1, var2);
      this.c(false);
   }

   public final void a(String var1) {
      this.l = var1;
      this.c(this.H);
   }

   private void c(boolean var1) {
      this.H = var1;
      if (this.a instanceof vdtt_bh) {
         if (var1) {
            this.setSize(20 + Graphics.a(5, this.l) / DataCenter.gI().r, 16);
         } else {
            this.setSize(20 + Graphics.a(0, this.l) / DataCenter.gI().r, 16);
         }
      } else if (var1) {
         this.setSize(20 + vdtt_dd.b(vdtt_dd.b, this.l), 16);
      } else {
         this.setSize(20 + vdtt_dd.b(vdtt_dd.d, this.l), 16);
      }

   }

   public final void a(boolean var1) {
      this.c = var1;
   }

   public final void b(boolean var1) {
      this.d = var1;
   }

   public final void a_() {
   }

   public final void b(Graphics var1) {
      if (!this.d) {
         short var2 = this.J;
         if (this.d()) {
            var1.e(30);
         } else if (this.c) {
            var1.p();
         }

         vdtt_cz.a(var1, var2, 0, 0, 0, 20);
         if (this.d()) {
            var1.h();
         } else if (this.c) {
            var1.r();
         }

         BitmapFont var3;
         if (this.H) {
            var3 = Graphics.a(5);
         } else {
            var3 = Graphics.a(0);
         }

         if (this.d()) {
            vdtt_dd.a((BitmapFont)var3, (Graphics)var1, this.l, 21, 8, 0, -1, -16777216);
         } else if (this.c) {
            vdtt_dd.a((BitmapFont)var3, (Graphics)var1, this.l, 20, 7, 0, -4868683, -16777216);
         } else {
            vdtt_dd.a((BitmapFont)var3, (Graphics)var1, this.l, 20, 7, 0, -1, -16777216);
         }

         if (this.m) {
            if (this.c) {
               var1.p();
            }

            vdtt_cz.a(var1, 9, 0, 2, 3, 20);
            if (this.c) {
               var1.r();
            }
         }
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (!this.c && !this.d) {
         this.m = !this.m;
         this.a.a(var1.b, this.m, this);
         vdtt_aa.gI().n();
      }

   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (!this.c && !this.d) {
         var1.addElement(new vdtt_hi(this.I, 0, 0, this.width, this.height, (vdtt_hp)null, this));
      }

      return var1;
   }

   private boolean d() {
      if (!this.c && !this.d) {
         return this.n ? true : this.e(0);
      } else {
         return false;
      }
   }
}
