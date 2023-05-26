package com.bumptech.glide.p162p;

/* renamed from: com.bumptech.glide.p.b */
/* compiled from: ErrorRequestCoordinator */
public final class C6266b implements C6269e, C6268d {

    /* renamed from: f */
    private final C6269e f11462f;

    /* renamed from: g */
    private C6268d f11463g;

    /* renamed from: h */
    private C6268d f11464h;

    public C6266b(C6269e eVar) {
        this.f11462f = eVar;
    }

    /* renamed from: h */
    private boolean m12810h() {
        C6269e eVar = this.f11462f;
        return eVar == null || eVar.mo20691f(this);
    }

    /* renamed from: i */
    private boolean m12811i() {
        C6269e eVar = this.f11462f;
        return eVar == null || eVar.mo20684c(this);
    }

    /* renamed from: j */
    private boolean m12812j() {
        C6269e eVar = this.f11462f;
        return eVar == null || eVar.mo20687d(this);
    }

    /* renamed from: k */
    private boolean m12813k() {
        C6269e eVar = this.f11462f;
        return eVar != null && eVar.mo20683c();
    }

    /* renamed from: a */
    public void mo20680a(C6268d dVar, C6268d dVar2) {
        this.f11463g = dVar;
        this.f11464h = dVar2;
    }

    /* renamed from: b */
    public void mo20681b() {
        if (!this.f11463g.isRunning()) {
            this.f11463g.mo20681b();
        }
    }

    /* renamed from: c */
    public boolean mo20684c(C6268d dVar) {
        return m12811i() && m12809g(dVar);
    }

    public void clear() {
        this.f11463g.clear();
        if (this.f11464h.isRunning()) {
            this.f11464h.clear();
        }
    }

    /* renamed from: d */
    public boolean mo20686d() {
        return (this.f11463g.mo20689e() ? this.f11464h : this.f11463g).mo20686d();
    }

    /* renamed from: e */
    public boolean mo20689e() {
        return this.f11463g.mo20689e() && this.f11464h.mo20689e();
    }

    /* renamed from: f */
    public boolean mo20690f() {
        return (this.f11463g.mo20689e() ? this.f11464h : this.f11463g).mo20690f();
    }

    /* renamed from: g */
    public boolean mo20692g() {
        return (this.f11463g.mo20689e() ? this.f11464h : this.f11463g).mo20692g();
    }

    public boolean isRunning() {
        return (this.f11463g.mo20689e() ? this.f11464h : this.f11463g).isRunning();
    }

    /* renamed from: g */
    private boolean m12809g(C6268d dVar) {
        return dVar.equals(this.f11463g) || (this.f11463g.mo20689e() && dVar.equals(this.f11464h));
    }

    /* renamed from: c */
    public boolean mo20683c() {
        return m12813k() || mo20686d();
    }

    /* renamed from: d */
    public boolean mo20687d(C6268d dVar) {
        return m12812j() && m12809g(dVar);
    }

    /* renamed from: e */
    public void mo20688e(C6268d dVar) {
        C6269e eVar = this.f11462f;
        if (eVar != null) {
            eVar.mo20688e(this);
        }
    }

    /* renamed from: f */
    public boolean mo20691f(C6268d dVar) {
        return m12810h() && m12809g(dVar);
    }

    /* renamed from: a */
    public void mo20678a() {
        this.f11463g.mo20678a();
        this.f11464h.mo20678a();
    }

    /* renamed from: b */
    public boolean mo20682b(C6268d dVar) {
        if (!(dVar instanceof C6266b)) {
            return false;
        }
        C6266b bVar = (C6266b) dVar;
        if (!this.f11463g.mo20682b(bVar.f11463g) || !this.f11464h.mo20682b(bVar.f11464h)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo20679a(C6268d dVar) {
        if (dVar.equals(this.f11464h)) {
            C6269e eVar = this.f11462f;
            if (eVar != null) {
                eVar.mo20679a(this);
            }
        } else if (!this.f11464h.isRunning()) {
            this.f11464h.mo20681b();
        }
    }
}
