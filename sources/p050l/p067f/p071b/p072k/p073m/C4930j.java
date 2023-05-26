package p050l.p067f.p071b.p072k.p073m;

import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.C4911g;

/* renamed from: l.f.b.k.m.j */
/* compiled from: GuidelineReference */
class C4930j extends C4939p {
    public C4930j(C4907e eVar) {
        super(eVar);
        eVar.f8591d.mo17318c();
        eVar.f8593e.mo17318c();
        this.f8733f = ((C4911g) eVar).mo17297S();
    }

    /* renamed from: a */
    private void m8640a(C4925f fVar) {
        this.f8735h.f8700k.add(fVar);
        fVar.f8701l.add(this.f8735h);
    }

    /* renamed from: b */
    public void mo17317b() {
        if (((C4911g) this.f8729b).mo17297S() == 1) {
            this.f8729b.mo17265u(this.f8735h.f8696g);
        } else {
            this.f8729b.mo17267v(this.f8735h.f8696g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17318c() {
        this.f8735h.mo17331a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo17320f() {
        return false;
    }

    /* renamed from: a */
    public void mo17316a(C4923d dVar) {
        C4925f fVar = this.f8735h;
        if (fVar.f8692c && !fVar.f8699j) {
            this.f8735h.mo17332a((int) ((((float) fVar.f8701l.get(0).f8696g) * ((C4911g) this.f8729b).mo17300V()) + 0.5f));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17315a() {
        C4911g gVar = (C4911g) this.f8729b;
        int T = gVar.mo17298T();
        int U = gVar.mo17299U();
        gVar.mo17300V();
        if (gVar.mo17297S() == 1) {
            if (T != -1) {
                this.f8735h.f8701l.add(this.f8729b.f8576R.f8591d.f8735h);
                this.f8729b.f8576R.f8591d.f8735h.f8700k.add(this.f8735h);
                this.f8735h.f8695f = T;
            } else if (U != -1) {
                this.f8735h.f8701l.add(this.f8729b.f8576R.f8591d.f8736i);
                this.f8729b.f8576R.f8591d.f8736i.f8700k.add(this.f8735h);
                this.f8735h.f8695f = -U;
            } else {
                C4925f fVar = this.f8735h;
                fVar.f8691b = true;
                fVar.f8701l.add(this.f8729b.f8576R.f8591d.f8736i);
                this.f8729b.f8576R.f8591d.f8736i.f8700k.add(this.f8735h);
            }
            m8640a(this.f8729b.f8591d.f8735h);
            m8640a(this.f8729b.f8591d.f8736i);
            return;
        }
        if (T != -1) {
            this.f8735h.f8701l.add(this.f8729b.f8576R.f8593e.f8735h);
            this.f8729b.f8576R.f8593e.f8735h.f8700k.add(this.f8735h);
            this.f8735h.f8695f = T;
        } else if (U != -1) {
            this.f8735h.f8701l.add(this.f8729b.f8576R.f8593e.f8736i);
            this.f8729b.f8576R.f8593e.f8736i.f8700k.add(this.f8735h);
            this.f8735h.f8695f = -U;
        } else {
            C4925f fVar2 = this.f8735h;
            fVar2.f8691b = true;
            fVar2.f8701l.add(this.f8729b.f8576R.f8593e.f8736i);
            this.f8729b.f8576R.f8593e.f8736i.f8700k.add(this.f8735h);
        }
        m8640a(this.f8729b.f8593e.f8735h);
        m8640a(this.f8729b.f8593e.f8736i);
    }
}
