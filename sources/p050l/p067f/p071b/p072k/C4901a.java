package p050l.p067f.p071b.p072k;

import p050l.p067f.p071b.C4889d;
import p050l.p067f.p071b.C4898i;
import p050l.p067f.p071b.p072k.C4904d;
import p050l.p067f.p071b.p072k.C4907e;

/* renamed from: l.f.b.k.a */
/* compiled from: Barrier */
public class C4901a extends C4914i {

    /* renamed from: r0 */
    private int f8514r0 = 0;

    /* renamed from: s0 */
    private boolean f8515s0 = true;

    /* renamed from: t0 */
    private int f8516t0 = 0;

    /* renamed from: u0 */
    boolean f8517u0 = false;

    /* renamed from: M */
    public boolean mo17143M() {
        return this.f8517u0;
    }

    /* renamed from: N */
    public boolean mo17144N() {
        return this.f8517u0;
    }

    /* renamed from: R */
    public boolean mo17145R() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f8660q0;
            if (i4 >= i) {
                break;
            }
            C4907e eVar = this.f8659p0[i4];
            if ((this.f8515s0 || eVar.mo17152c()) && ((((i2 = this.f8514r0) == 0 || i2 == 1) && !eVar.mo17143M()) || (((i3 = this.f8514r0) == 2 || i3 == 3) && !eVar.mo17144N()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f8660q0; i6++) {
            C4907e eVar2 = this.f8659p0[i6];
            if (this.f8515s0 || eVar2.mo17152c()) {
                if (!z2) {
                    int i7 = this.f8514r0;
                    if (i7 == 0) {
                        i5 = eVar2.mo17194a(C4904d.C4906b.LEFT).mo17164b();
                    } else if (i7 == 1) {
                        i5 = eVar2.mo17194a(C4904d.C4906b.RIGHT).mo17164b();
                    } else if (i7 == 2) {
                        i5 = eVar2.mo17194a(C4904d.C4906b.TOP).mo17164b();
                    } else if (i7 == 3) {
                        i5 = eVar2.mo17194a(C4904d.C4906b.BOTTOM).mo17164b();
                    }
                    z2 = true;
                }
                int i8 = this.f8514r0;
                if (i8 == 0) {
                    i5 = Math.min(i5, eVar2.mo17194a(C4904d.C4906b.LEFT).mo17164b());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, eVar2.mo17194a(C4904d.C4906b.RIGHT).mo17164b());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, eVar2.mo17194a(C4904d.C4906b.TOP).mo17164b());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, eVar2.mo17194a(C4904d.C4906b.BOTTOM).mo17164b());
                }
            }
        }
        int i9 = i5 + this.f8516t0;
        int i10 = this.f8514r0;
        if (i10 == 0 || i10 == 1) {
            mo17196a(i9, i9);
        } else {
            mo17213b(i9, i9);
        }
        this.f8517u0 = true;
        return true;
    }

    /* renamed from: S */
    public boolean mo17146S() {
        return this.f8515s0;
    }

    /* renamed from: T */
    public int mo17147T() {
        return this.f8514r0;
    }

    /* renamed from: U */
    public int mo17148U() {
        return this.f8516t0;
    }

    /* renamed from: V */
    public int mo17149V() {
        int i = this.f8514r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo17150W() {
        for (int i = 0; i < this.f8660q0; i++) {
            C4907e eVar = this.f8659p0[i];
            int i2 = this.f8514r0;
            if (i2 == 0 || i2 == 1) {
                eVar.mo17199a(0, true);
            } else if (i2 == 2 || i2 == 3) {
                eVar.mo17199a(1, true);
            }
        }
    }

    /* renamed from: a */
    public void mo17151a(C4889d dVar, boolean z) {
        C4904d[] dVarArr;
        boolean z2;
        int i;
        int i2;
        C4904d[] dVarArr2 = this.f8572N;
        dVarArr2[0] = this.f8564F;
        dVarArr2[2] = this.f8565G;
        dVarArr2[1] = this.f8566H;
        dVarArr2[3] = this.f8567I;
        int i3 = 0;
        while (true) {
            dVarArr = this.f8572N;
            if (i3 >= dVarArr.length) {
                break;
            }
            dVarArr[i3].f8546i = dVar.mo17104a((Object) dVarArr[i3]);
            i3++;
        }
        int i4 = this.f8514r0;
        if (i4 >= 0 && i4 < 4) {
            C4904d dVar2 = dVarArr[i4];
            if (!this.f8517u0) {
                mo17145R();
            }
            if (this.f8517u0) {
                this.f8517u0 = false;
                int i5 = this.f8514r0;
                if (i5 == 0 || i5 == 1) {
                    dVar.mo17108a(this.f8564F.f8546i, this.f8581W);
                    dVar.mo17108a(this.f8566H.f8546i, this.f8581W);
                } else if (i5 == 2 || i5 == 3) {
                    dVar.mo17108a(this.f8565G.f8546i, this.f8582X);
                    dVar.mo17108a(this.f8567I.f8546i, this.f8582X);
                }
            } else {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.f8660q0) {
                        z2 = false;
                        break;
                    }
                    C4907e eVar = this.f8659p0[i6];
                    if ((this.f8515s0 || eVar.mo17152c()) && ((((i = this.f8514r0) == 0 || i == 1) && eVar.mo17250n() == C4907e.C4909b.MATCH_CONSTRAINT && eVar.f8564F.f8543f != null && eVar.f8566H.f8543f != null) || (((i2 = this.f8514r0) == 2 || i2 == 3) && eVar.mo17271z() == C4907e.C4909b.MATCH_CONSTRAINT && eVar.f8565G.f8543f != null && eVar.f8567I.f8543f != null))) {
                        z2 = true;
                    } else {
                        i6++;
                    }
                }
                z2 = true;
                boolean z3 = this.f8564F.mo17171i() || this.f8566H.mo17171i();
                boolean z4 = this.f8565G.mo17171i() || this.f8567I.mo17171i();
                boolean z5 = !z2 && ((this.f8514r0 == 0 && z3) || ((this.f8514r0 == 2 && z4) || ((this.f8514r0 == 1 && z3) || (this.f8514r0 == 3 && z4))));
                int i7 = 5;
                if (!z5) {
                    i7 = 4;
                }
                for (int i8 = 0; i8 < this.f8660q0; i8++) {
                    C4907e eVar2 = this.f8659p0[i8];
                    if (this.f8515s0 || eVar2.mo17152c()) {
                        C4898i a = dVar.mo17104a((Object) eVar2.f8572N[this.f8514r0]);
                        C4904d[] dVarArr3 = eVar2.f8572N;
                        int i9 = this.f8514r0;
                        dVarArr3[i9].f8546i = a;
                        int i10 = (dVarArr3[i9].f8543f == null || dVarArr3[i9].f8543f.f8541d != this) ? 0 : dVarArr3[i9].f8544g + 0;
                        int i11 = this.f8514r0;
                        if (i11 == 0 || i11 == 2) {
                            dVar.mo17116b(dVar2.f8546i, a, this.f8516t0 - i10, z2);
                        } else {
                            dVar.mo17110a(dVar2.f8546i, a, this.f8516t0 + i10, z2);
                        }
                        dVar.mo17101a(dVar2.f8546i, a, this.f8516t0 + i10, i7);
                    }
                }
                int i12 = this.f8514r0;
                if (i12 == 0) {
                    dVar.mo17101a(this.f8566H.f8546i, this.f8564F.f8546i, 0, 8);
                    dVar.mo17101a(this.f8564F.f8546i, this.f8576R.f8566H.f8546i, 0, 4);
                    dVar.mo17101a(this.f8564F.f8546i, this.f8576R.f8564F.f8546i, 0, 0);
                } else if (i12 == 1) {
                    dVar.mo17101a(this.f8564F.f8546i, this.f8566H.f8546i, 0, 8);
                    dVar.mo17101a(this.f8564F.f8546i, this.f8576R.f8564F.f8546i, 0, 4);
                    dVar.mo17101a(this.f8564F.f8546i, this.f8576R.f8566H.f8546i, 0, 0);
                } else if (i12 == 2) {
                    dVar.mo17101a(this.f8567I.f8546i, this.f8565G.f8546i, 0, 8);
                    dVar.mo17101a(this.f8565G.f8546i, this.f8576R.f8567I.f8546i, 0, 4);
                    dVar.mo17101a(this.f8565G.f8546i, this.f8576R.f8565G.f8546i, 0, 0);
                } else if (i12 == 3) {
                    dVar.mo17101a(this.f8565G.f8546i, this.f8567I.f8546i, 0, 8);
                    dVar.mo17101a(this.f8565G.f8546i, this.f8576R.f8565G.f8546i, 0, 4);
                    dVar.mo17101a(this.f8565G.f8546i, this.f8576R.f8567I.f8546i, 0, 0);
                }
            }
        }
    }

    /* renamed from: c */
    public boolean mo17152c() {
        return true;
    }

    /* renamed from: e */
    public void mo17153e(boolean z) {
        this.f8515s0 = z;
    }

    public String toString() {
        String str = "[Barrier] " + mo17238h() + " {";
        for (int i = 0; i < this.f8660q0; i++) {
            C4907e eVar = this.f8659p0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + eVar.mo17238h();
        }
        return str + "}";
    }

    /* renamed from: x */
    public void mo17155x(int i) {
        this.f8514r0 = i;
    }

    /* renamed from: y */
    public void mo17156y(int i) {
        this.f8516t0 = i;
    }
}
