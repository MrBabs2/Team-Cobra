package com.bumptech.glide.load.engine.p147z;

import android.graphics.Bitmap;
import com.bumptech.glide.p166r.C6316k;

/* renamed from: com.bumptech.glide.load.engine.z.c */
/* compiled from: AttributeStrategy */
class C6000c implements C6016l {

    /* renamed from: a */
    private final C6002b f11052a = new C6002b();

    /* renamed from: b */
    private final C6007h<C6001a, Bitmap> f11053b = new C6007h<>();

    /* renamed from: com.bumptech.glide.load.engine.z.c$b */
    /* compiled from: AttributeStrategy */
    static class C6002b extends C6003d<C6001a> {
        C6002b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C6001a mo20277a(int i, int i2, Bitmap.Config config) {
            C6001a aVar = (C6001a) mo20279b();
            aVar.mo20272a(i, i2, config);
            return aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C6001a m11968a() {
            return new C6001a(this);
        }
    }

    C6000c() {
    }

    /* renamed from: d */
    private static String m11958d(Bitmap bitmap) {
        return m11957c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public void mo20265a(Bitmap bitmap) {
        this.f11053b.mo20288a(this.f11052a.mo20277a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: b */
    public String mo20267b(int i, int i2, Bitmap.Config config) {
        return m11957c(i, i2, config);
    }

    /* renamed from: c */
    public String mo20268c(Bitmap bitmap) {
        return m11958d(bitmap);
    }

    public Bitmap removeLast() {
        return this.f11053b.mo20286a();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f11053b;
    }

    /* renamed from: c */
    static String m11957c(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: b */
    public int mo20266b(Bitmap bitmap) {
        return C6316k.m12988a(bitmap);
    }

    /* renamed from: com.bumptech.glide.load.engine.z.c$a */
    /* compiled from: AttributeStrategy */
    static class C6001a implements C6017m {

        /* renamed from: a */
        private final C6002b f11054a;

        /* renamed from: b */
        private int f11055b;

        /* renamed from: c */
        private int f11056c;

        /* renamed from: d */
        private Bitmap.Config f11057d;

        public C6001a(C6002b bVar) {
            this.f11054a = bVar;
        }

        /* renamed from: a */
        public void mo20272a(int i, int i2, Bitmap.Config config) {
            this.f11055b = i;
            this.f11056c = i2;
            this.f11057d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6001a)) {
                return false;
            }
            C6001a aVar = (C6001a) obj;
            if (this.f11055b == aVar.f11055b && this.f11056c == aVar.f11056c && this.f11057d == aVar.f11057d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f11055b * 31) + this.f11056c) * 31;
            Bitmap.Config config = this.f11057d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C6000c.m11957c(this.f11055b, this.f11056c, this.f11057d);
        }

        /* renamed from: a */
        public void mo20271a() {
            this.f11054a.mo20278a(this);
        }
    }

    /* renamed from: a */
    public Bitmap mo20264a(int i, int i2, Bitmap.Config config) {
        return this.f11053b.mo20287a(this.f11052a.mo20277a(i, i2, config));
    }
}
