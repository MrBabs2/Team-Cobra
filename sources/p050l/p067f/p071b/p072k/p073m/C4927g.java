package p050l.p067f.p071b.p072k.p073m;

import p050l.p067f.p071b.p072k.p073m.C4925f;

/* renamed from: l.f.b.k.m.g */
/* compiled from: DimensionDependency */
class C4927g extends C4925f {

    /* renamed from: m */
    public int f8711m;

    public C4927g(C4939p pVar) {
        super(pVar);
        if (pVar instanceof C4932l) {
            this.f8694e = C4925f.C4926a.HORIZONTAL_DIMENSION;
        } else {
            this.f8694e = C4925f.C4926a.VERTICAL_DIMENSION;
        }
    }

    /* renamed from: a */
    public void mo17332a(int i) {
        if (!this.f8699j) {
            this.f8699j = true;
            this.f8696g = i;
            for (C4923d next : this.f8700k) {
                next.mo17316a(next);
            }
        }
    }
}
