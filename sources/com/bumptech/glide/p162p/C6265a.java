package com.bumptech.glide.p162p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5902b;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.C6023g;
import com.bumptech.glide.load.C6024h;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6030l;
import com.bumptech.glide.load.engine.C5963j;
import com.bumptech.glide.load.p152o.p153c.C6151g;
import com.bumptech.glide.load.p152o.p153c.C6152h;
import com.bumptech.glide.load.p152o.p153c.C6159k;
import com.bumptech.glide.load.p152o.p153c.C6167l;
import com.bumptech.glide.load.p152o.p153c.C6174p;
import com.bumptech.glide.load.p152o.p157g.C6220i;
import com.bumptech.glide.p162p.C6265a;
import com.bumptech.glide.p165q.C6300b;
import com.bumptech.glide.p166r.C6305b;
import com.bumptech.glide.p166r.C6315j;
import com.bumptech.glide.p166r.C6316k;
import com.google.android.gms.ads.AdRequest;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import p015cm.aptoide.p016pt.file.CacheHelper;

/* renamed from: com.bumptech.glide.p.a */
/* compiled from: BaseRequestOptions */
public abstract class C6265a<T extends C6265a<T>> implements Cloneable {

    /* renamed from: A */
    private boolean f11436A;

    /* renamed from: B */
    private boolean f11437B;

    /* renamed from: C */
    private boolean f11438C;

    /* renamed from: D */
    private boolean f11439D = true;

    /* renamed from: E */
    private boolean f11440E;

    /* renamed from: f */
    private int f11441f;

    /* renamed from: g */
    private float f11442g = 1.0f;

    /* renamed from: h */
    private C5963j f11443h = C5963j.f10941d;

    /* renamed from: i */
    private C5878g f11444i = C5878g.NORMAL;

    /* renamed from: j */
    private Drawable f11445j;

    /* renamed from: k */
    private int f11446k;

    /* renamed from: l */
    private Drawable f11447l;

    /* renamed from: m */
    private int f11448m;

    /* renamed from: n */
    private boolean f11449n = true;

    /* renamed from: o */
    private int f11450o = -1;

    /* renamed from: p */
    private int f11451p = -1;

    /* renamed from: q */
    private C6022f f11452q = C6300b.m12947a();

    /* renamed from: r */
    private boolean f11453r;

    /* renamed from: s */
    private boolean f11454s = true;

    /* renamed from: t */
    private Drawable f11455t;

    /* renamed from: u */
    private int f11456u;

    /* renamed from: v */
    private C6027i f11457v = new C6027i();

    /* renamed from: w */
    private Map<Class<?>, C6030l<?>> f11458w = new C6305b();

    /* renamed from: x */
    private Class<?> f11459x = Object.class;

    /* renamed from: y */
    private boolean f11460y;

    /* renamed from: z */
    private Resources.Theme f11461z;

    /* renamed from: O */
    private T mo19981O() {
        return this;
    }

    /* renamed from: P */
    private T m12751P() {
        if (!this.f11460y) {
            mo19981O();
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: b */
    private static boolean mo19993b(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: A */
    public final boolean mo20624A() {
        return this.f11440E;
    }

    /* renamed from: B */
    public final boolean mo20625B() {
        return this.f11437B;
    }

    /* renamed from: C */
    public final boolean mo20626C() {
        return this.f11449n;
    }

    /* renamed from: E */
    public final boolean mo20627E() {
        return m12753b(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public boolean mo20628F() {
        return this.f11439D;
    }

    /* renamed from: G */
    public final boolean mo20629G() {
        return this.f11454s;
    }

    /* renamed from: H */
    public final boolean mo20630H() {
        return this.f11453r;
    }

    /* renamed from: I */
    public final boolean mo20631I() {
        return m12753b((int) RecyclerView.C0638l.FLAG_MOVED);
    }

    /* renamed from: J */
    public final boolean mo20632J() {
        return C6316k.m12999b(this.f11451p, this.f11450o);
    }

    /* renamed from: K */
    public T mo20633K() {
        this.f11460y = true;
        mo19981O();
        return this;
    }

    /* renamed from: L */
    public T mo20634L() {
        return mo20649a(C6159k.f11262b, (C6030l<Bitmap>) new C6151g());
    }

    /* renamed from: M */
    public T mo20635M() {
        return m12755c(C6159k.f11263c, new C6152h());
    }

    /* renamed from: N */
    public T mo20636N() {
        return m12755c(C6159k.f11261a, new C6174p());
    }

    /* renamed from: a */
    public T mo20637a(float f) {
        if (this.f11436A) {
            return clone().mo20637a(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f11442g = f;
        this.f11441f |= 2;
        m12751P();
        return this;
    }

    /* renamed from: b */
    public T mo20656b(boolean z) {
        if (this.f11436A) {
            return clone().mo20656b(z);
        }
        this.f11440E = z;
        this.f11441f |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
        m12751P();
        return this;
    }

    /* renamed from: c */
    public T mo20657c() {
        return mo20655b(C6159k.f11262b, (C6030l<Bitmap>) new C6151g());
    }

    /* renamed from: e */
    public T mo20658e() {
        return mo20645a(C6167l.f11272h, false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6265a)) {
            return false;
        }
        C6265a aVar = (C6265a) obj;
        if (Float.compare(aVar.f11442g, this.f11442g) == 0 && this.f11446k == aVar.f11446k && C6316k.m13000b((Object) this.f11445j, (Object) aVar.f11445j) && this.f11448m == aVar.f11448m && C6316k.m13000b((Object) this.f11447l, (Object) aVar.f11447l) && this.f11456u == aVar.f11456u && C6316k.m13000b((Object) this.f11455t, (Object) aVar.f11455t) && this.f11449n == aVar.f11449n && this.f11450o == aVar.f11450o && this.f11451p == aVar.f11451p && this.f11453r == aVar.f11453r && this.f11454s == aVar.f11454s && this.f11437B == aVar.f11437B && this.f11438C == aVar.f11438C && this.f11443h.equals(aVar.f11443h) && this.f11444i == aVar.f11444i && this.f11457v.equals(aVar.f11457v) && this.f11458w.equals(aVar.f11458w) && this.f11459x.equals(aVar.f11459x) && C6316k.m13000b((Object) this.f11452q, (Object) aVar.f11452q) && C6316k.m13000b((Object) this.f11461z, (Object) aVar.f11461z)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C5963j mo20660f() {
        return this.f11443h;
    }

    /* renamed from: g */
    public final int mo20661g() {
        return this.f11446k;
    }

    /* renamed from: h */
    public final Drawable mo20662h() {
        return this.f11445j;
    }

    public int hashCode() {
        return C6316k.m12989a((Object) this.f11461z, C6316k.m12989a((Object) this.f11452q, C6316k.m12989a((Object) this.f11459x, C6316k.m12989a((Object) this.f11458w, C6316k.m12989a((Object) this.f11457v, C6316k.m12989a((Object) this.f11444i, C6316k.m12989a((Object) this.f11443h, C6316k.m12990a(this.f11438C, C6316k.m12990a(this.f11437B, C6316k.m12990a(this.f11454s, C6316k.m12990a(this.f11453r, C6316k.m12985a(this.f11451p, C6316k.m12985a(this.f11450o, C6316k.m12990a(this.f11449n, C6316k.m12989a((Object) this.f11455t, C6316k.m12985a(this.f11456u, C6316k.m12989a((Object) this.f11447l, C6316k.m12985a(this.f11448m, C6316k.m12989a((Object) this.f11445j, C6316k.m12985a(this.f11446k, C6316k.m12983a(this.f11442g)))))))))))))))))))));
    }

    /* renamed from: i */
    public final Drawable mo20664i() {
        return this.f11455t;
    }

    /* renamed from: j */
    public final int mo20665j() {
        return this.f11456u;
    }

    /* renamed from: k */
    public final boolean mo20666k() {
        return this.f11438C;
    }

    /* renamed from: l */
    public final C6027i mo20667l() {
        return this.f11457v;
    }

    /* renamed from: m */
    public final int mo20668m() {
        return this.f11450o;
    }

    /* renamed from: n */
    public final int mo20669n() {
        return this.f11451p;
    }

    /* renamed from: q */
    public final Drawable mo20670q() {
        return this.f11447l;
    }

    /* renamed from: r */
    public final int mo20671r() {
        return this.f11448m;
    }

    /* renamed from: s */
    public final C5878g mo20672s() {
        return this.f11444i;
    }

    /* renamed from: u */
    public final Class<?> mo20673u() {
        return this.f11459x;
    }

    /* renamed from: w */
    public final C6022f mo20674w() {
        return this.f11452q;
    }

    /* renamed from: x */
    public final float mo20675x() {
        return this.f11442g;
    }

    /* renamed from: y */
    public final Resources.Theme mo20676y() {
        return this.f11461z;
    }

    /* renamed from: z */
    public final Map<Class<?>, C6030l<?>> mo20677z() {
        return this.f11458w;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.l, com.bumptech.glide.load.l<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T m12755c(com.bumptech.glide.load.p152o.p153c.C6159k r2, com.bumptech.glide.load.C6030l<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 0
            com.bumptech.glide.p.a r2 = r1.m12752a((com.bumptech.glide.load.p152o.p153c.C6159k) r2, (com.bumptech.glide.load.C6030l<android.graphics.Bitmap>) r3, (boolean) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6265a.m12755c(com.bumptech.glide.load.o.c.k, com.bumptech.glide.load.l):com.bumptech.glide.p.a");
    }

    public T clone() {
        try {
            T t = (C6265a) super.clone();
            C6027i iVar = new C6027i();
            t.f11457v = iVar;
            iVar.mo20317a(this.f11457v);
            C6305b bVar = new C6305b();
            t.f11458w = bVar;
            bVar.putAll(this.f11458w);
            t.f11460y = false;
            t.f11436A = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.l, com.bumptech.glide.load.l<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo20655b(com.bumptech.glide.load.p152o.p153c.C6159k r2, com.bumptech.glide.load.C6030l<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f11436A
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.p.a r0 = r1.clone()
            com.bumptech.glide.p.a r2 = r0.mo20655b((com.bumptech.glide.load.p152o.p153c.C6159k) r2, (com.bumptech.glide.load.C6030l<android.graphics.Bitmap>) r3)
            return r2
        L_0x000d:
            r1.mo20648a((com.bumptech.glide.load.p152o.p153c.C6159k) r2)
            com.bumptech.glide.p.a r2 = r1.mo20646a((com.bumptech.glide.load.C6030l<android.graphics.Bitmap>) r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6265a.mo20655b(com.bumptech.glide.load.o.c.k, com.bumptech.glide.load.l):com.bumptech.glide.p.a");
    }

    /* renamed from: a */
    public T mo20643a(C5963j jVar) {
        if (this.f11436A) {
            return clone().mo20643a(jVar);
        }
        C6315j.m12978a(jVar);
        this.f11443h = jVar;
        this.f11441f |= 4;
        m12751P();
        return this;
    }

    /* renamed from: b */
    public T mo20654b() {
        if (!this.f11460y || this.f11436A) {
            this.f11436A = true;
            mo20633K();
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* renamed from: a */
    public T mo20641a(C5878g gVar) {
        if (this.f11436A) {
            return clone().mo20641a(gVar);
        }
        C6315j.m12978a(gVar);
        this.f11444i = gVar;
        this.f11441f |= 8;
        m12751P();
        return this;
    }

    /* renamed from: b */
    private boolean m12753b(int i) {
        return mo19993b(this.f11441f, i);
    }

    /* renamed from: a */
    public T mo20640a(Drawable drawable) {
        if (this.f11436A) {
            return clone().mo20640a(drawable);
        }
        this.f11447l = drawable;
        int i = this.f11441f | 64;
        this.f11441f = i;
        this.f11448m = 0;
        this.f11441f = i & -129;
        m12751P();
        return this;
    }

    /* renamed from: a */
    public T mo20638a(int i) {
        if (this.f11436A) {
            return clone().mo20638a(i);
        }
        this.f11448m = i;
        int i2 = this.f11441f | 128;
        this.f11441f = i2;
        this.f11447l = null;
        this.f11441f = i2 & -65;
        m12751P();
        return this;
    }

    /* renamed from: a */
    public T mo20652a(boolean z) {
        if (this.f11436A) {
            return clone().mo20652a(true);
        }
        this.f11449n = !z;
        this.f11441f |= 256;
        m12751P();
        return this;
    }

    /* renamed from: a */
    public T mo20639a(int i, int i2) {
        if (this.f11436A) {
            return clone().mo20639a(i, i2);
        }
        this.f11451p = i;
        this.f11450o = i2;
        this.f11441f |= AdRequest.MAX_CONTENT_URL_LENGTH;
        m12751P();
        return this;
    }

    /* renamed from: a */
    public T mo20644a(C6022f fVar) {
        if (this.f11436A) {
            return clone().mo20644a(fVar);
        }
        C6315j.m12978a(fVar);
        this.f11452q = fVar;
        this.f11441f |= 1024;
        m12751P();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.h<Y>, java.lang.Object, com.bumptech.glide.load.h] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo20645a(com.bumptech.glide.load.C6024h<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f11436A
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.p.a r0 = r1.clone()
            com.bumptech.glide.p.a r2 = r0.mo20645a(r2, r3)
            return r2
        L_0x000d:
            com.bumptech.glide.p166r.C6315j.m12978a(r2)
            com.bumptech.glide.p166r.C6315j.m12978a(r3)
            com.bumptech.glide.load.i r0 = r1.f11457v
            r0.mo20315a(r2, r3)
            r1.m12751P()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6265a.mo20645a(com.bumptech.glide.load.h, java.lang.Object):com.bumptech.glide.p.a");
    }

    /* renamed from: a */
    public T mo20650a(Class<?> cls) {
        if (this.f11436A) {
            return clone().mo20650a(cls);
        }
        C6315j.m12978a(cls);
        this.f11459x = cls;
        this.f11441f |= RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT;
        m12751P();
        return this;
    }

    /* renamed from: a */
    public T mo20642a(C5902b bVar) {
        C6315j.m12978a(bVar);
        return mo20645a(C6167l.f11270f, bVar).mo20645a(C6220i.f11369a, bVar);
    }

    /* renamed from: a */
    public T mo20648a(C6159k kVar) {
        C6024h hVar = C6159k.f11266f;
        C6315j.m12978a(kVar);
        return mo20645a(hVar, kVar);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.l, com.bumptech.glide.load.l<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo20649a(com.bumptech.glide.load.p152o.p153c.C6159k r2, com.bumptech.glide.load.C6030l<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f11436A
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.p.a r0 = r1.clone()
            com.bumptech.glide.p.a r2 = r0.mo20649a((com.bumptech.glide.load.p152o.p153c.C6159k) r2, (com.bumptech.glide.load.C6030l<android.graphics.Bitmap>) r3)
            return r2
        L_0x000d:
            r1.mo20648a((com.bumptech.glide.load.p152o.p153c.C6159k) r2)
            r2 = 0
            com.bumptech.glide.p.a r2 = r1.mo20647a((com.bumptech.glide.load.C6030l<android.graphics.Bitmap>) r3, (boolean) r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6265a.mo20649a(com.bumptech.glide.load.o.c.k, com.bumptech.glide.load.l):com.bumptech.glide.p.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.l, com.bumptech.glide.load.l<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T m12752a(com.bumptech.glide.load.p152o.p153c.C6159k r1, com.bumptech.glide.load.C6030l<android.graphics.Bitmap> r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0007
            com.bumptech.glide.p.a r1 = r0.mo20655b((com.bumptech.glide.load.p152o.p153c.C6159k) r1, (com.bumptech.glide.load.C6030l<android.graphics.Bitmap>) r2)
            goto L_0x000b
        L_0x0007:
            com.bumptech.glide.p.a r1 = r0.mo20649a((com.bumptech.glide.load.p152o.p153c.C6159k) r1, (com.bumptech.glide.load.C6030l<android.graphics.Bitmap>) r2)
        L_0x000b:
            r2 = 1
            r1.f11439D = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6265a.m12752a(com.bumptech.glide.load.o.c.k, com.bumptech.glide.load.l, boolean):com.bumptech.glide.p.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.l, com.bumptech.glide.load.l<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo20646a(com.bumptech.glide.load.C6030l<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            com.bumptech.glide.p.a r2 = r1.mo20647a((com.bumptech.glide.load.C6030l<android.graphics.Bitmap>) r2, (boolean) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6265a.mo20646a(com.bumptech.glide.load.l):com.bumptech.glide.p.a");
    }

    @Deprecated
    /* renamed from: a */
    public T mo20653a(C6030l<Bitmap>... lVarArr) {
        return mo20647a((C6030l<Bitmap>) new C6023g(lVarArr), true);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.l, com.bumptech.glide.load.l<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo20647a(com.bumptech.glide.load.C6030l<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f11436A
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.p.a r0 = r2.clone()
            com.bumptech.glide.p.a r3 = r0.mo20647a((com.bumptech.glide.load.C6030l<android.graphics.Bitmap>) r3, (boolean) r4)
            return r3
        L_0x000d:
            com.bumptech.glide.load.o.c.n r0 = new com.bumptech.glide.load.o.c.n
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.mo20651a(r1, r3, (boolean) r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.mo20651a(r1, r0, (boolean) r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r0.mo20462a()
            r2.mo20651a(r1, r0, (boolean) r4)
            java.lang.Class<com.bumptech.glide.load.o.g.c> r0 = com.bumptech.glide.load.p152o.p157g.C6209c.class
            com.bumptech.glide.load.o.g.f r1 = new com.bumptech.glide.load.o.g.f
            r1.<init>(r3)
            r2.mo20651a(r0, r1, (boolean) r4)
            r2.m12751P()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6265a.mo20647a(com.bumptech.glide.load.l, boolean):com.bumptech.glide.p.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.l, com.bumptech.glide.load.l<Y>, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T mo20651a(java.lang.Class<Y> r2, com.bumptech.glide.load.C6030l<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f11436A
            if (r0 == 0) goto L_0x000d
            com.bumptech.glide.p.a r0 = r1.clone()
            com.bumptech.glide.p.a r2 = r0.mo20651a(r2, r3, (boolean) r4)
            return r2
        L_0x000d:
            com.bumptech.glide.p166r.C6315j.m12978a(r2)
            com.bumptech.glide.p166r.C6315j.m12978a(r3)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.l<?>> r0 = r1.f11458w
            r0.put(r2, r3)
            int r2 = r1.f11441f
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.f11441f = r2
            r3 = 1
            r1.f11454s = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.f11441f = r2
            r0 = 0
            r1.f11439D = r0
            if (r4 == 0) goto L_0x0032
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.f11441f = r2
            r1.f11453r = r3
        L_0x0032:
            r1.m12751P()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6265a.mo20651a(java.lang.Class, com.bumptech.glide.load.l, boolean):com.bumptech.glide.p.a");
    }

    /* renamed from: a */
    public T mo19984a(C6265a<?> aVar) {
        if (this.f11436A) {
            return clone().mo19984a(aVar);
        }
        if (mo19993b(aVar.f11441f, 2)) {
            this.f11442g = aVar.f11442g;
        }
        if (mo19993b(aVar.f11441f, 262144)) {
            this.f11437B = aVar.f11437B;
        }
        if (mo19993b(aVar.f11441f, (int) CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES)) {
            this.f11440E = aVar.f11440E;
        }
        if (mo19993b(aVar.f11441f, 4)) {
            this.f11443h = aVar.f11443h;
        }
        if (mo19993b(aVar.f11441f, 8)) {
            this.f11444i = aVar.f11444i;
        }
        if (mo19993b(aVar.f11441f, 16)) {
            this.f11445j = aVar.f11445j;
            this.f11446k = 0;
            this.f11441f &= -33;
        }
        if (mo19993b(aVar.f11441f, 32)) {
            this.f11446k = aVar.f11446k;
            this.f11445j = null;
            this.f11441f &= -17;
        }
        if (mo19993b(aVar.f11441f, 64)) {
            this.f11447l = aVar.f11447l;
            this.f11448m = 0;
            this.f11441f &= -129;
        }
        if (mo19993b(aVar.f11441f, 128)) {
            this.f11448m = aVar.f11448m;
            this.f11447l = null;
            this.f11441f &= -65;
        }
        if (mo19993b(aVar.f11441f, 256)) {
            this.f11449n = aVar.f11449n;
        }
        if (mo19993b(aVar.f11441f, (int) AdRequest.MAX_CONTENT_URL_LENGTH)) {
            this.f11451p = aVar.f11451p;
            this.f11450o = aVar.f11450o;
        }
        if (mo19993b(aVar.f11441f, 1024)) {
            this.f11452q = aVar.f11452q;
        }
        if (mo19993b(aVar.f11441f, (int) RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            this.f11459x = aVar.f11459x;
        }
        if (mo19993b(aVar.f11441f, 8192)) {
            this.f11455t = aVar.f11455t;
            this.f11456u = 0;
            this.f11441f &= -16385;
        }
        if (mo19993b(aVar.f11441f, (int) Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f11456u = aVar.f11456u;
            this.f11455t = null;
            this.f11441f &= -8193;
        }
        if (mo19993b(aVar.f11441f, 32768)) {
            this.f11461z = aVar.f11461z;
        }
        if (mo19993b(aVar.f11441f, 65536)) {
            this.f11454s = aVar.f11454s;
        }
        if (mo19993b(aVar.f11441f, 131072)) {
            this.f11453r = aVar.f11453r;
        }
        if (mo19993b(aVar.f11441f, (int) RecyclerView.C0638l.FLAG_MOVED)) {
            this.f11458w.putAll(aVar.f11458w);
            this.f11439D = aVar.f11439D;
        }
        if (mo19993b(aVar.f11441f, 524288)) {
            this.f11438C = aVar.f11438C;
        }
        if (!this.f11454s) {
            this.f11458w.clear();
            int i = this.f11441f & -2049;
            this.f11441f = i;
            this.f11453r = false;
            this.f11441f = i & -131073;
            this.f11439D = true;
        }
        this.f11441f |= aVar.f11441f;
        this.f11457v.mo20317a(aVar.f11457v);
        m12751P();
        return this;
    }
}
