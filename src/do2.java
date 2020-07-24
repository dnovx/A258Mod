public final class do2
{
  private static do2 i;
  public int a;
  public int b;
  public int c;
  public int d;
  private int j;
  private int k;
  public long e;
  private int l;
  private int m;
  private int n;
  private int o;
  private static int p;
  private static int q;
  public static boolean f = false;
  public static boolean g;
  public gx h;
  
  public static do2 a()
  {
    if (i == null) {
      i = new do2();
    }
    return i;
  }
  
  public static void a(int paramInt)
  {
    p = paramInt;
  }
  
  public final void b(int paramInt)
  {
    if (this.h == null) {
      return;
    }
    g = false;
    q = ir.i * gy.Y;
    p = main.a.m / 10;
    if (this.h.aw * gy.Y > main.a.o)
    {
      if (this.h.aw * gy.Y < ir.e * q - main.a.o - q)
      {
        this.c = (this.h.aw * gy.Y - main.a.o);
      }
      else
      {
        this.c = (ir.e * q - main.a.m);
        if (this.c >= 0) {}
      }
    }
    else {
      this.c = 0;
    }
    if (main.a.m > ir.e * q) {
      this.c = (-(main.a.m - ir.e * q) / 2);
    }
    if ((main.a.n > ir.f * q) && ((paramInt - 1 == 57) || (paramInt - 1 == 58) || (paramInt - 1 == 59) || (paramInt - 1 == 108))) {
      this.d = (-(main.a.n - ir.f * q) / 2);
    } else {
      this.d = (ir.f * q - main.a.n);
    }
    this.j = (ir.e * q - main.a.m);
    this.k = (ir.f * q - main.a.n);
    this.a = this.c;
    if (this.a < 0) {
      this.a = 0;
    }
    if (this.a > this.j) {
      this.a = this.j;
    }
    if (this.b > this.k) {
      this.b = this.k;
    }
    if (this.d > this.k) {
      this.d = this.k;
    }
  }
  
  public final void b()
  {
    this.a = this.c;
    this.b = this.d;
  }
  
  public final void c()
  {
    if (!f)
    {
      if (this.a != this.c)
      {
        this.l = (this.c - this.a << 1);
        this.m += this.l;
        this.a += (this.m >> 4);
        this.m &= 0xF;
        if (this.a < 0) {
          this.a = 0;
        }
        if (this.a > this.j) {
          this.a = this.j;
        }
      }
    }
    else
    {
      if (this.a < 0) {
        this.a = 0;
      }
      if (this.a > ir.e * ir.i * gy.Y - main.a.m) {
        this.a = (ir.e * ir.i * gy.Y - main.a.m);
      }
    }
    if (this.b != this.d)
    {
      this.n = (this.d - this.b << 1);
      this.o += this.n;
      this.b += (this.o >> 4);
      this.o &= 0xF;
      if (this.b > this.k) {
        this.b = this.k;
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.e = 0L;
    this.c = (paramInt1 - main.a.o);
    this.d = (paramInt2 - main.a.p);
    if (this.c < 0) {
      this.c = 0;
    }
    if (this.c > ir.e * q - main.a.m) {
      this.c = (ir.e * q - main.a.m);
    }
    if (this.d > ir.f * q - main.a.n) {
      this.d = (ir.f * q - main.a.n);
    }
    e();
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    this.a = (this.c = 0);
    this.b = (this.d = 0);
  }
  
  public final void d()
  {
    c();
    if ((System.currentTimeMillis() / 100L - this.e < 20L) || (g)) {
      return;
    }
    int i1;
    if (this.h.K == 0) {
      i1 = this.h.aw * gy.Y + p;
    } else {
      i1 = this.h.aw * gy.Y - p;
    }
    this.c = (i1 - main.a.o);
    this.d = ((this.h.ax + this.h.N) * gy.Y - (main.a.n - (main.a.p - q)));
    if (this.h.K == gx.J)
    {
      if (this.h.aw * gy.Y < main.a.o) {
        this.c = 0;
      }
    }
    else if (this.h.aw * gy.Y > ir.e * q - main.a.o) {
      this.c = (ir.e * q - main.a.m);
    }
    e();
  }
  
  private void e()
  {
    if ((ir.a >= 0) && (ir.a < ir.h.length) && (ir.h[ir.a] == -1) && (ir.b == null) && (main.a.n > ir.f * q)) {
      this.b = (this.d = -(main.a.n - ir.f * q) / 2);
    }
    if (main.a.m > ir.e * q) {
      this.a = (this.c = -(main.a.m - ir.e * q) / 2);
    }
  }
}
