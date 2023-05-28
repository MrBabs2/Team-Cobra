package com.bumptech.glide.p162p;

/* renamed from: com.bumptech.glide.p.k */
/* compiled from: ThumbnailRequestCoordinator */
public class C6278k implements C6269e, C6268d {

    /* renamed from: f */
    private final C6269e f11513f;

    /* renamed from: g */
    private C6268d f11514g;

    /* renamed from: h */
    private C6268d f11515h;

    /* renamed from: i */
    private boolean f11516i;

    C6278k() {
        this((C6269e) null);
    }

    /* renamed from: h */
    private boolean m12884h() {
        C6269e eVar = this.f11513f;
        return eVar == null || eVar.mo20691f(this);
    }

    /* renamed from: i */
    private boolean m12885i() {
        C6269e eVar = this.f11513f;
        return eVar == null || eVar.mo20684c(this);
    }

    /* renamed from: j */
    private boolean m12886j() {
        C6269e eVar = this.f11513f;
        return eVar == null || eVar.mo20687d(this);
    }

    /* renamed from: k */
    private boolean m12887k() {
        C6269e eVar = this.f11513f;
        return eVar != null && eVar.mo20683c();
    }

    /* renamed from: a */
    public void mo20711a(C6268d dVar, C6268d dVar2) {
        this.f11514g = dVar;
        this.f11515h = dVar2;
    }

    /* renamed from: b */
    public void mo20681b() {
        this.f11516i = true;
        if (!this.f11514g.mo20692g() && !this.f11515h.isRunning()) {
            this.f11515h.mo20681b();
        }
        if (this.f11516i && !this.f11514g.isRunning()) {
            this.f11514g.mo20681b();
        }
    }

    /* renamed from: c */
    public boolean mo20684c(C6268d dVar) {
        return m12885i() && dVar.equals(this.f11514g) && !mo20683c();
    }

    public void clear() {
        this.f11516i = false;
        this.f11515h.clear();
        this.f11514g.clear();
    }

    /* renamed from: d */
    public boolean mo20687d(C6268d dVar) {
        return m12886j() && (dVar.equals(this.f11514g) || !this.f11514g.mo20686d());
    }

    /* renamed from: e */
    public void mo20688e(C6268d dVar) {
        if (!dVar.equals(this.f11515h)) {
            C6269e eVar = this.f11513f;
            if (eVar != null) {
                eVar.mo20688e(this);
            }
            if (!this.f11515h.mo20692g()) {
                this.f11515h.clear();
            }
        }
    }

    /* renamed from: f */
    public boolean mo20691f(C6268d dVar) {
        return m12884h() && dVar.equals(this.f11514g);
    }

    /* renamed from: g */
    public boolean mo20692g() {
        return this.f11514g.mo20692g() || this.f11515h.mo20692g();
    }

    public boolean isRunning() {
        return this.f11514g.isRunning();
    }

    public C6278k(C6269e eVar) {
        this.f11513f = eVar;
    }

    /* renamed from: c */
    public boolean mo20683c() {
        return m12887k() || mo20686d();
    }

    /* renamed from: d */
    public boolean mo20686d() {
        return this.f11514g.mo20686d() || this.f11515h.mo20686d();
    }

    /* renamed from: f */
    public boolean mo20690f() {
        return this.f11514g.mo20690f();
    }

    /* renamed from: a */
    public void mo20679a(C6268d dVar) {
        C6269e eVar;
        if (dVar.equals(this.f11514g) && (eVar = this.f11513f) != null) {
            eVar.mo20679a(this);
        }
    }

    /* renamed from: a */
    public void mo20678a() {
        this.f11514g.mo20678a();
        this.f11515h.mo20678a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo20682b(com.bumptech.glide.p162p.C6268d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.p162p.C6278k
            r1 = 0
            if (r0 == 0) goto L_0x0028
            com.bumptech.glide.p.k r4 = (com.bumptech.glide.p162p.C6278k) r4
            com.bumptech.glide.p.d r0 = r3.f11514g
            if (r0 != 0) goto L_0x0010
            com.bumptech.glide.p.d r0 = r4.f11514g
            if (r0 != 0) goto L_0x0028
            goto L_0x0018
        L_0x0010:
            com.bumptech.glide.p.d r2 = r4.f11514g
            boolean r0 = r0.mo20682b(r2)
            if (r0 == 0) goto L_0x0028
        L_0x0018:
            com.bumptech.glide.p.d r0 = r3.f11515h
            com.bumptech.glide.p.d r4 = r4.f11515h
            if (r0 != 0) goto L_0x0021
            if (r4 != 0) goto L_0x0028
            goto L_0x0027
        L_0x0021:
            boolean r4 = r0.mo20682b(r4)
            if (r4 == 0) goto L_0x0028
        L_0x0027:
            r1 = 1
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p162p.C6278k.mo20682b(com.bumptech.glide.p.d):boolean");
    }

    /* renamed from: e */
    public boolean mo20689e() {
        return this.f11514g.mo20689e();
    }
}
