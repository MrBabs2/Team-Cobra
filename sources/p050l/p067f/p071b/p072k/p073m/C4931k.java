package p050l.p067f.p071b.p072k.p073m;

import p050l.p067f.p071b.p072k.C4901a;
import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.p073m.C4925f;

/* renamed from: l.f.b.k.m.k */
/* compiled from: HelperReferences */
class C4931k extends C4939p {
    public C4931k(C4907e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    private void m8646a(C4925f fVar) {
        this.f8735h.f8700k.add(fVar);
        fVar.f8701l.add(this.f8735h);
    }

    /* renamed from: b */
    public void mo17317b() {
        C4907e eVar = this.f8729b;
        if (eVar instanceof C4901a) {
            int T = ((C4901a) eVar).mo17147T();
            if (T == 0 || T == 1) {
                this.f8729b.mo17265u(this.f8735h.f8696g);
            } else {
                this.f8729b.mo17267v(this.f8735h.f8696g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17318c() {
        this.f8730c = null;
        this.f8735h.mo17331a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo17320f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17315a() {
        C4907e eVar = this.f8729b;
        if (eVar instanceof C4901a) {
            this.f8735h.f8691b = true;
            C4901a aVar = (C4901a) eVar;
            int T = aVar.mo17147T();
            boolean S = aVar.mo17146S();
            int i = 0;
            if (T == 0) {
                this.f8735h.f8694e = C4925f.C4926a.LEFT;
                while (i < aVar.f8660q0) {
                    C4907e eVar2 = aVar.f8659p0[i];
                    if (S || eVar2.mo17179B() != 8) {
                        C4925f fVar = eVar2.f8591d.f8735h;
                        fVar.f8700k.add(this.f8735h);
                        this.f8735h.f8701l.add(fVar);
                    }
                    i++;
                }
                m8646a(this.f8729b.f8591d.f8735h);
                m8646a(this.f8729b.f8591d.f8736i);
            } else if (T == 1) {
                this.f8735h.f8694e = C4925f.C4926a.RIGHT;
                while (i < aVar.f8660q0) {
                    C4907e eVar3 = aVar.f8659p0[i];
                    if (S || eVar3.mo17179B() != 8) {
                        C4925f fVar2 = eVar3.f8591d.f8736i;
                        fVar2.f8700k.add(this.f8735h);
                        this.f8735h.f8701l.add(fVar2);
                    }
                    i++;
                }
                m8646a(this.f8729b.f8591d.f8735h);
                m8646a(this.f8729b.f8591d.f8736i);
            } else if (T == 2) {
                this.f8735h.f8694e = C4925f.C4926a.TOP;
                while (i < aVar.f8660q0) {
                    C4907e eVar4 = aVar.f8659p0[i];
                    if (S || eVar4.mo17179B() != 8) {
                        C4925f fVar3 = eVar4.f8593e.f8735h;
                        fVar3.f8700k.add(this.f8735h);
                        this.f8735h.f8701l.add(fVar3);
                    }
                    i++;
                }
                m8646a(this.f8729b.f8593e.f8735h);
                m8646a(this.f8729b.f8593e.f8736i);
            } else if (T == 3) {
                this.f8735h.f8694e = C4925f.C4926a.BOTTOM;
                while (i < aVar.f8660q0) {
                    C4907e eVar5 = aVar.f8659p0[i];
                    if (S || eVar5.mo17179B() != 8) {
                        C4925f fVar4 = eVar5.f8593e.f8736i;
                        fVar4.f8700k.add(this.f8735h);
                        this.f8735h.f8701l.add(fVar4);
                    }
                    i++;
                }
                m8646a(this.f8729b.f8593e.f8735h);
                m8646a(this.f8729b.f8593e.f8736i);
            }
        }
    }

    /* renamed from: a */
    public void mo17316a(C4923d dVar) {
        C4901a aVar = (C4901a) this.f8729b;
        int T = aVar.mo17147T();
        int i = 0;
        int i2 = -1;
        for (C4925f fVar : this.f8735h.f8701l) {
            int i3 = fVar.f8696g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (T == 0 || T == 2) {
            this.f8735h.mo17332a(i2 + aVar.mo17148U());
        } else {
            this.f8735h.mo17332a(i + aVar.mo17148U());
        }
    }
}
