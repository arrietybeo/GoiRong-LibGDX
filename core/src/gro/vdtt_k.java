package gro;

public abstract class vdtt_k extends vdtt_x {
   public vdtt_w a;
   public boolean b;
   public boolean c;
   public boolean d;
   public vdtt_bk e;
   protected int f;
   protected int g;
   protected int h;
   protected int i;
   protected int j;
   protected int k;

   public final int a() {
      return this.a.cx + this.cx;
   }

   public final int b() {
      return this.a.cy + this.cy;
   }

   public final void a(Graphics var1) {
      this.a(var1, this.f, this.g);
      var1.d(this.h, this.i, this.j, this.k);
      var1.a(this.a(), this.b());
   }

   public final void a(Graphics var1, vdtt_hp var2) {
      try {
         this.f = var1.e;
         this.g = var1.f;
         this.h = var1.k();
         this.i = var1.l();
         this.j = var1.h;
         this.k = var1.i;
         int var3 = var2.width;
         int var4 = var2.height;
         if (var3 > this.j) {
            var3 = this.j;
         }

         if (var4 > this.k) {
            var4 = this.k;
         }

         var2.a(var1, this.a(), this.b(), var3, var4);
      } catch (Exception var5) {
      }

   }

   public void c() {
   }

   public void a(boolean var1) {
      this.c = var1;
   }

   public void b(boolean var1) {
      this.d = var1;
   }
}
