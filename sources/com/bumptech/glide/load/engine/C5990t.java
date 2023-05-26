package com.bumptech.glide.load.engine;

import com.bumptech.glide.p166r.C6315j;
import com.bumptech.glide.p166r.p167l.C6318a;
import com.bumptech.glide.p166r.p167l.C6327c;
import p050l.p075h.p083k.C5005e;

/* renamed from: com.bumptech.glide.load.engine.t */
/* compiled from: LockedResource */
final class C5990t<Z> implements C5992u<Z>, C6318a.C6324f {

    /* renamed from: j */
    private static final C5005e<C5990t<?>> f11019j = C6318a.m13006a(20, new C5991a());

    /* renamed from: f */
    private final C6327c f11020f = C6327c.m13024b();

    /* renamed from: g */
    private C5992u<Z> f11021g;

    /* renamed from: h */
    private boolean f11022h;

    /* renamed from: i */
    private boolean f11023i;

    /* renamed from: com.bumptech.glide.load.engine.t$a */
    /* compiled from: LockedResource */
    class C5991a implements C6318a.C6322d<C5990t<?>> {
        C5991a() {
        }

        /* renamed from: a */
        public C5990t<?> m11932a() {
            return new C5990t<>();
        }
    }

    C5990t() {
    }

    /* renamed from: a */
    private void m11923a(C5992u<Z> uVar) {
        this.f11023i = false;
        this.f11022h = true;
        this.f11021g = uVar;
    }

    /* renamed from: b */
    static <Z> C5990t<Z> m11924b(C5992u<Z> uVar) {
        C5990t<Z> a = f11019j.mo17456a();
        C6315j.m12978a(a);
        C5990t<Z> tVar = a;
        tVar.m11923a(uVar);
        return tVar;
    }

    /* renamed from: e */
    private void m11925e() {
        this.f11021g = null;
        f11019j.mo17457a(this);
    }

    /* renamed from: c */
    public int mo20238c() {
        return this.f11021g.mo20238c();
    }

    /* renamed from: d */
    public Class<Z> mo20239d() {
        return this.f11021g.mo20239d();
    }

    public Z get() {
        return this.f11021g.get();
    }

    /* renamed from: i */
    public C6327c mo20121i() {
        return this.f11020f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo20251b() {
        this.f11020f.mo20774a();
        if (this.f11022h) {
            this.f11022h = false;
            if (this.f11023i) {
                mo20235a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    /* renamed from: a */
    public synchronized void mo20235a() {
        this.f11020f.mo20774a();
        this.f11023i = true;
        if (!this.f11022h) {
            this.f11021g.mo20235a();
            m11925e();
        }
    }
}
