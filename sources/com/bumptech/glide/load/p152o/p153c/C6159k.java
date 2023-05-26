package com.bumptech.glide.load.p152o.p153c;

import com.bumptech.glide.load.C6024h;

/* renamed from: com.bumptech.glide.load.o.c.k */
/* compiled from: DownsampleStrategy */
public abstract class C6159k {

    /* renamed from: a */
    public static final C6159k f11261a = new C6164e();

    /* renamed from: b */
    public static final C6159k f11262b = new C6163d();

    /* renamed from: c */
    public static final C6159k f11263c = new C6162c();

    /* renamed from: d */
    public static final C6159k f11264d = new C6165f();

    /* renamed from: e */
    public static final C6159k f11265e;

    /* renamed from: f */
    public static final C6024h<C6159k> f11266f;

    /* renamed from: com.bumptech.glide.load.o.c.k$a */
    /* compiled from: DownsampleStrategy */
    private static class C6160a extends C6159k {
        C6160a() {
        }

        /* renamed from: a */
        public C6166g mo20454a(int i, int i2, int i3, int i4) {
            return C6166g.QUALITY;
        }

        /* renamed from: b */
        public float mo20455b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.k$b */
    /* compiled from: DownsampleStrategy */
    private static class C6161b extends C6159k {
        C6161b() {
        }

        /* renamed from: a */
        public C6166g mo20454a(int i, int i2, int i3, int i4) {
            return C6166g.MEMORY;
        }

        /* renamed from: b */
        public float mo20455b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.k$c */
    /* compiled from: DownsampleStrategy */
    private static class C6162c extends C6159k {
        C6162c() {
        }

        /* renamed from: a */
        public C6166g mo20454a(int i, int i2, int i3, int i4) {
            return C6166g.QUALITY;
        }

        /* renamed from: b */
        public float mo20455b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, C6159k.f11261a.mo20455b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.k$d */
    /* compiled from: DownsampleStrategy */
    private static class C6163d extends C6159k {
        C6163d() {
        }

        /* renamed from: a */
        public C6166g mo20454a(int i, int i2, int i3, int i4) {
            return C6166g.QUALITY;
        }

        /* renamed from: b */
        public float mo20455b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.k$e */
    /* compiled from: DownsampleStrategy */
    private static class C6164e extends C6159k {
        C6164e() {
        }

        /* renamed from: a */
        public C6166g mo20454a(int i, int i2, int i3, int i4) {
            return C6166g.QUALITY;
        }

        /* renamed from: b */
        public float mo20455b(int i, int i2, int i3, int i4) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.k$f */
    /* compiled from: DownsampleStrategy */
    private static class C6165f extends C6159k {
        C6165f() {
        }

        /* renamed from: a */
        public C6166g mo20454a(int i, int i2, int i3, int i4) {
            return C6166g.QUALITY;
        }

        /* renamed from: b */
        public float mo20455b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.c.k$g */
    /* compiled from: DownsampleStrategy */
    public enum C6166g {
        MEMORY,
        QUALITY
    }

    static {
        new C6160a();
        new C6161b();
        C6159k kVar = f11262b;
        f11265e = kVar;
        f11266f = C6024h.m12062a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", kVar);
    }

    /* renamed from: a */
    public abstract C6166g mo20454a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo20455b(int i, int i2, int i3, int i4);
}
