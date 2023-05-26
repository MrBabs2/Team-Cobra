package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.core.widget.a */
/* compiled from: AutoScrollHelper */
public abstract class C0426a implements View.OnTouchListener {

    /* renamed from: w */
    private static final int f1860w = ViewConfiguration.getTapTimeout();

    /* renamed from: f */
    final C0427a f1861f = new C0427a();

    /* renamed from: g */
    private final Interpolator f1862g = new AccelerateInterpolator();

    /* renamed from: h */
    final View f1863h;

    /* renamed from: i */
    private Runnable f1864i;

    /* renamed from: j */
    private float[] f1865j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f1866k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l */
    private int f1867l;

    /* renamed from: m */
    private int f1868m;

    /* renamed from: n */
    private float[] f1869n = {0.0f, 0.0f};

    /* renamed from: o */
    private float[] f1870o = {0.0f, 0.0f};

    /* renamed from: p */
    private float[] f1871p = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: q */
    private boolean f1872q;

    /* renamed from: r */
    boolean f1873r;

    /* renamed from: s */
    boolean f1874s;

    /* renamed from: t */
    boolean f1875t;

    /* renamed from: u */
    private boolean f1876u;

    /* renamed from: v */
    private boolean f1877v;

    /* renamed from: androidx.core.widget.a$a */
    /* compiled from: AutoScrollHelper */
    private static class C0427a {

        /* renamed from: a */
        private int f1878a;

        /* renamed from: b */
        private int f1879b;

        /* renamed from: c */
        private float f1880c;

        /* renamed from: d */
        private float f1881d;

        /* renamed from: e */
        private long f1882e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f1883f = 0;

        /* renamed from: g */
        private int f1884g = 0;

        /* renamed from: h */
        private int f1885h = 0;

        /* renamed from: i */
        private long f1886i = -1;

        /* renamed from: j */
        private float f1887j;

        /* renamed from: k */
        private int f1888k;

        C0427a() {
        }

        /* renamed from: a */
        private float m2114a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo2466a(int i) {
            this.f1879b = i;
        }

        /* renamed from: b */
        public void mo2468b(int i) {
            this.f1878a = i;
        }

        /* renamed from: c */
        public int mo2469c() {
            return this.f1885h;
        }

        /* renamed from: d */
        public int mo2470d() {
            float f = this.f1880c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public int mo2471e() {
            float f = this.f1881d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public boolean mo2472f() {
            return this.f1886i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1886i + ((long) this.f1888k);
        }

        /* renamed from: g */
        public void mo2473g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1888k = C0426a.m2095a((int) (currentAnimationTimeMillis - this.f1882e), 0, this.f1879b);
            this.f1887j = m2115a(currentAnimationTimeMillis);
            this.f1886i = currentAnimationTimeMillis;
        }

        /* renamed from: h */
        public void mo2474h() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1882e = currentAnimationTimeMillis;
            this.f1886i = -1;
            this.f1883f = currentAnimationTimeMillis;
            this.f1887j = 0.5f;
            this.f1884g = 0;
            this.f1885h = 0;
        }

        /* renamed from: a */
        private float m2115a(long j) {
            if (j < this.f1882e) {
                return 0.0f;
            }
            long j2 = this.f1886i;
            if (j2 < 0 || j < j2) {
                return C0426a.m2092a(((float) (j - this.f1882e)) / ((float) this.f1878a), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f1887j;
            return (1.0f - f) + (f * C0426a.m2092a(((float) j3) / ((float) this.f1888k), 0.0f, 1.0f));
        }

        /* renamed from: b */
        public int mo2467b() {
            return this.f1884g;
        }

        /* renamed from: a */
        public void mo2464a() {
            if (this.f1883f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m2114a(m2115a(currentAnimationTimeMillis));
                this.f1883f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f1883f)) * a;
                this.f1884g = (int) (this.f1880c * f);
                this.f1885h = (int) (f * this.f1881d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        public void mo2465a(float f, float f2) {
            this.f1880c = f;
            this.f1881d = f2;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    /* compiled from: AutoScrollHelper */
    private class C0428b implements Runnable {
        C0428b() {
        }

        public void run() {
            C0426a aVar = C0426a.this;
            if (aVar.f1875t) {
                if (aVar.f1873r) {
                    aVar.f1873r = false;
                    aVar.f1861f.mo2474h();
                }
                C0427a aVar2 = C0426a.this.f1861f;
                if (aVar2.mo2472f() || !C0426a.this.mo2454b()) {
                    C0426a.this.f1875t = false;
                    return;
                }
                C0426a aVar3 = C0426a.this;
                if (aVar3.f1874s) {
                    aVar3.f1874s = false;
                    aVar3.mo2450a();
                }
                aVar2.mo2464a();
                C0426a.this.mo2451a(aVar2.mo2467b(), aVar2.mo2469c());
                C5071v.m9162a(C0426a.this.f1863h, (Runnable) this);
            }
        }
    }

    public C0426a(View view) {
        this.f1863h = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo2453b(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo2456c(f3, f3);
        mo2459d(1);
        mo2448a(Float.MAX_VALUE, Float.MAX_VALUE);
        mo2458d(0.2f, 0.2f);
        mo2460e(1.0f, 1.0f);
        mo2457c(f1860w);
        mo2462f(500);
        mo2461e(500);
    }

    /* renamed from: a */
    static float m2092a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    static int m2095a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public C0426a mo2449a(boolean z) {
        if (this.f1876u && !z) {
            m2096c();
        }
        this.f1876u = z;
        return this;
    }

    /* renamed from: a */
    public abstract void mo2451a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo2452a(int i);

    /* renamed from: b */
    public C0426a mo2453b(float f, float f2) {
        float[] fArr = this.f1871p;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public abstract boolean mo2455b(int i);

    /* renamed from: c */
    public C0426a mo2456c(float f, float f2) {
        float[] fArr = this.f1870o;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: d */
    public C0426a mo2459d(int i) {
        this.f1867l = i;
        return this;
    }

    /* renamed from: e */
    public C0426a mo2460e(float f, float f2) {
        float[] fArr = this.f1869n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: f */
    public C0426a mo2462f(int i) {
        this.f1861f.mo2468b(i);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1876u
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m2096c()
            goto L_0x0058
        L_0x001a:
            r5.f1874s = r2
            r5.f1872q = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1863h
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m2094a((int) r1, (float) r0, (float) r3, (float) r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1863h
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m2094a((int) r2, (float) r7, (float) r6, (float) r3)
            androidx.core.widget.a$a r7 = r5.f1861f
            r7.mo2465a(r0, r6)
            boolean r6 = r5.f1875t
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo2454b()
            if (r6 == 0) goto L_0x0058
            r5.m2097d()
        L_0x0058:
            boolean r6 = r5.f1877v
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f1875t
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0426a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: f */
    private float m2098f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1867l;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                return (!this.f1875t || this.f1867l != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: d */
    public C0426a mo2458d(float f, float f2) {
        float[] fArr = this.f1865j;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2454b() {
        C0427a aVar = this.f1861f;
        int e = aVar.mo2471e();
        int d = aVar.mo2470d();
        return (e != 0 && mo2455b(e)) || (d != 0 && mo2452a(d));
    }

    /* renamed from: c */
    public C0426a mo2457c(int i) {
        this.f1868m = i;
        return this;
    }

    /* renamed from: e */
    public C0426a mo2461e(int i) {
        this.f1861f.mo2466a(i);
        return this;
    }

    /* renamed from: c */
    private void m2096c() {
        if (this.f1873r) {
            this.f1875t = false;
        } else {
            this.f1861f.mo2473g();
        }
    }

    /* renamed from: d */
    private void m2097d() {
        int i;
        if (this.f1864i == null) {
            this.f1864i = new C0428b();
        }
        this.f1875t = true;
        this.f1873r = true;
        if (this.f1872q || (i = this.f1868m) <= 0) {
            this.f1864i.run();
        } else {
            C5071v.m9163a(this.f1863h, this.f1864i, (long) i);
        }
        this.f1872q = true;
    }

    /* renamed from: a */
    public C0426a mo2448a(float f, float f2) {
        float[] fArr = this.f1866k;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: a */
    private float m2094a(int i, float f, float f2, float f3) {
        float a = m2093a(this.f1865j[i], f2, this.f1866k[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f1869n[i];
        float f5 = this.f1870o[i];
        float f6 = this.f1871p[i];
        float f7 = f4 * f3;
        if (a > 0.0f) {
            return m2092a(a * f7, f5, f6);
        }
        return -m2092a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    private float m2093a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m2092a(f * f2, 0.0f, f3);
        float f6 = m2098f(f2 - f4, a) - m2098f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f1862g.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f1862g.getInterpolation(f6);
        }
        return m2092a(f5, -1.0f, 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2450a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1863h.onTouchEvent(obtain);
        obtain.recycle();
    }
}
