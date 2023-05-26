package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.p166r.C6315j;

/* renamed from: com.bumptech.glide.load.engine.p */
/* compiled from: EngineResource */
class C5985p<Z> implements C5992u<Z> {

    /* renamed from: f */
    private final boolean f11007f;

    /* renamed from: g */
    private final boolean f11008g;

    /* renamed from: h */
    private final C5992u<Z> f11009h;

    /* renamed from: i */
    private C5986a f11010i;

    /* renamed from: j */
    private C6022f f11011j;

    /* renamed from: k */
    private int f11012k;

    /* renamed from: l */
    private boolean f11013l;

    /* renamed from: com.bumptech.glide.load.engine.p$a */
    /* compiled from: EngineResource */
    interface C5986a {
        /* renamed from: a */
        void mo20203a(C6022f fVar, C5985p<?> pVar);
    }

    C5985p(C5992u<Z> uVar, boolean z, boolean z2) {
        C6315j.m12978a(uVar);
        this.f11009h = uVar;
        this.f11007f = z;
        this.f11008g = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo20236a(C6022f fVar, C5986a aVar) {
        this.f11011j = fVar;
        this.f11010i = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo20237b() {
        if (!this.f11013l) {
            this.f11012k++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: c */
    public int mo20238c() {
        return this.f11009h.mo20238c();
    }

    /* renamed from: d */
    public Class<Z> mo20239d() {
        return this.f11009h.mo20239d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5992u<Z> mo20240e() {
        return this.f11009h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo20241f() {
        return this.f11007f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo20242g() {
        synchronized (this.f11010i) {
            synchronized (this) {
                if (this.f11012k > 0) {
                    int i = this.f11012k - 1;
                    this.f11012k = i;
                    if (i == 0) {
                        this.f11010i.mo20203a(this.f11011j, this);
                    }
                } else {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
            }
        }
    }

    public Z get() {
        return this.f11009h.get();
    }

    public synchronized String toString() {
        return "EngineResource{isCacheable=" + this.f11007f + ", listener=" + this.f11010i + ", key=" + this.f11011j + ", acquired=" + this.f11012k + ", isRecycled=" + this.f11013l + ", resource=" + this.f11009h + '}';
    }

    /* renamed from: a */
    public synchronized void mo20235a() {
        if (this.f11012k > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f11013l) {
            this.f11013l = true;
            if (this.f11008g) {
                this.f11009h.mo20235a();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }
}
