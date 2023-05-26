package p050l.p067f.p071b.p072k.p073m;

import p050l.p067f.p071b.p072k.C4904d;
import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.C4913h;
import p050l.p067f.p071b.p072k.p073m.C4925f;
import p050l.p067f.p071b.p072k.p073m.C4939p;

/* renamed from: l.f.b.k.m.n */
/* compiled from: VerticalWidgetRun */
public class C4935n extends C4939p {

    /* renamed from: k */
    public C4925f f8719k;

    /* renamed from: l */
    C4927g f8720l = null;

    /* renamed from: l.f.b.k.m.n$a */
    /* compiled from: VerticalWidgetRun */
    static /* synthetic */ class C4936a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8721a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                l.f.b.k.m.p$b[] r0 = p050l.p067f.p071b.p072k.p073m.C4939p.C4941b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8721a = r0
                l.f.b.k.m.p$b r1 = p050l.p067f.p071b.p072k.p073m.C4939p.C4941b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8721a     // Catch:{ NoSuchFieldError -> 0x001d }
                l.f.b.k.m.p$b r1 = p050l.p067f.p071b.p072k.p073m.C4939p.C4941b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8721a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l.f.b.k.m.p$b r1 = p050l.p067f.p071b.p072k.p073m.C4939p.C4941b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.p073m.C4935n.C4936a.<clinit>():void");
        }
    }

    public C4935n(C4907e eVar) {
        super(eVar);
        C4925f fVar = new C4925f(this);
        this.f8719k = fVar;
        this.f8735h.f8694e = C4925f.C4926a.TOP;
        this.f8736i.f8694e = C4925f.C4926a.BOTTOM;
        fVar.f8694e = C4925f.C4926a.BASELINE;
        this.f8733f = 1;
    }

    /* renamed from: a */
    public void mo17316a(C4923d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        int i2 = C4936a.f8721a[this.f8737j.ordinal()];
        if (i2 == 1) {
            mo17357c(dVar);
        } else if (i2 == 2) {
            mo17356b(dVar);
        } else if (i2 == 3) {
            C4907e eVar = this.f8729b;
            mo17353a(dVar, eVar.f8565G, eVar.f8567I, 1);
            return;
        }
        C4927g gVar = this.f8732e;
        if (gVar.f8692c && !gVar.f8699j && this.f8731d == C4907e.C4909b.MATCH_CONSTRAINT) {
            C4907e eVar2 = this.f8729b;
            int i3 = eVar2.f8613o;
            if (i3 == 2) {
                C4907e v = eVar2.mo17266v();
                if (v != null) {
                    C4927g gVar2 = v.f8593e.f8732e;
                    if (gVar2.f8699j) {
                        float f4 = this.f8729b.f8620v;
                        this.f8732e.mo17332a((int) ((((float) gVar2.f8696g) * f4) + 0.5f));
                    }
                }
            } else if (i3 == 3 && eVar2.f8591d.f8732e.f8699j) {
                int j = eVar2.mo17242j();
                if (j == -1) {
                    C4907e eVar3 = this.f8729b;
                    f3 = (float) eVar3.f8591d.f8732e.f8696g;
                    f2 = eVar3.mo17240i();
                } else if (j == 0) {
                    C4907e eVar4 = this.f8729b;
                    f = ((float) eVar4.f8591d.f8732e.f8696g) * eVar4.mo17240i();
                    i = (int) (f + 0.5f);
                    this.f8732e.mo17332a(i);
                } else if (j != 1) {
                    i = 0;
                    this.f8732e.mo17332a(i);
                } else {
                    C4907e eVar5 = this.f8729b;
                    f3 = (float) eVar5.f8591d.f8732e.f8696g;
                    f2 = eVar5.mo17240i();
                }
                f = f3 / f2;
                i = (int) (f + 0.5f);
                this.f8732e.mo17332a(i);
            }
        }
        C4925f fVar = this.f8735h;
        if (fVar.f8692c) {
            C4925f fVar2 = this.f8736i;
            if (fVar2.f8692c) {
                if (!fVar.f8699j || !fVar2.f8699j || !this.f8732e.f8699j) {
                    if (!this.f8732e.f8699j && this.f8731d == C4907e.C4909b.MATCH_CONSTRAINT) {
                        C4907e eVar6 = this.f8729b;
                        if (eVar6.f8611n == 0 && !eVar6.mo17187J()) {
                            int i4 = this.f8735h.f8701l.get(0).f8696g;
                            C4925f fVar3 = this.f8735h;
                            int i5 = i4 + fVar3.f8695f;
                            int i6 = this.f8736i.f8701l.get(0).f8696g + this.f8736i.f8695f;
                            fVar3.mo17332a(i5);
                            this.f8736i.mo17332a(i6);
                            this.f8732e.mo17332a(i6 - i5);
                            return;
                        }
                    }
                    if (!this.f8732e.f8699j && this.f8731d == C4907e.C4909b.MATCH_CONSTRAINT && this.f8728a == 1 && this.f8735h.f8701l.size() > 0 && this.f8736i.f8701l.size() > 0) {
                        int i7 = (this.f8736i.f8701l.get(0).f8696g + this.f8736i.f8695f) - (this.f8735h.f8701l.get(0).f8696g + this.f8735h.f8695f);
                        C4927g gVar3 = this.f8732e;
                        int i8 = gVar3.f8711m;
                        if (i7 < i8) {
                            gVar3.mo17332a(i7);
                        } else {
                            gVar3.mo17332a(i8);
                        }
                    }
                    if (this.f8732e.f8699j && this.f8735h.f8701l.size() > 0 && this.f8736i.f8701l.size() > 0) {
                        C4925f fVar4 = this.f8735h.f8701l.get(0);
                        C4925f fVar5 = this.f8736i.f8701l.get(0);
                        int i9 = fVar4.f8696g + this.f8735h.f8695f;
                        int i10 = fVar5.f8696g + this.f8736i.f8695f;
                        float x = this.f8729b.mo17269x();
                        if (fVar4 == fVar5) {
                            i9 = fVar4.f8696g;
                            i10 = fVar5.f8696g;
                            x = 0.5f;
                        }
                        this.f8735h.mo17332a((int) (((float) i9) + 0.5f + (((float) ((i10 - i9) - this.f8732e.f8696g)) * x)));
                        this.f8736i.mo17332a(this.f8735h.f8696g + this.f8732e.f8696g);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo17317b() {
        C4925f fVar = this.f8735h;
        if (fVar.f8699j) {
            this.f8729b.mo17267v(fVar.f8696g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17318c() {
        this.f8730c = null;
        this.f8735h.mo17331a();
        this.f8736i.mo17331a();
        this.f8719k.mo17331a();
        this.f8732e.mo17331a();
        this.f8734g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo17320f() {
        if (this.f8731d != C4907e.C4909b.MATCH_CONSTRAINT || this.f8729b.f8613o == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo17339g() {
        this.f8734g = false;
        this.f8735h.mo17331a();
        this.f8735h.f8699j = false;
        this.f8736i.mo17331a();
        this.f8736i.f8699j = false;
        this.f8719k.mo17331a();
        this.f8719k.f8699j = false;
        this.f8732e.f8699j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f8729b.mo17238h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17315a() {
        C4907e v;
        C4907e v2;
        C4907e eVar = this.f8729b;
        if (eVar.f8585a) {
            this.f8732e.mo17332a(eVar.mo17244k());
        }
        if (!this.f8732e.f8699j) {
            this.f8731d = this.f8729b.mo17271z();
            if (this.f8729b.mo17183F()) {
                this.f8720l = new C4918a(this);
            }
            C4907e.C4909b bVar = this.f8731d;
            if (bVar != C4907e.C4909b.MATCH_CONSTRAINT) {
                if (bVar == C4907e.C4909b.MATCH_PARENT && (v2 = this.f8729b.mo17266v()) != null && v2.mo17271z() == C4907e.C4909b.FIXED) {
                    int k = (v2.mo17244k() - this.f8729b.f8565G.mo17165c()) - this.f8729b.f8567I.mo17165c();
                    mo17354a(this.f8735h, v2.f8593e.f8735h, this.f8729b.f8565G.mo17165c());
                    mo17354a(this.f8736i, v2.f8593e.f8736i, -this.f8729b.f8567I.mo17165c());
                    this.f8732e.mo17332a(k);
                    return;
                } else if (this.f8731d == C4907e.C4909b.FIXED) {
                    this.f8732e.mo17332a(this.f8729b.mo17244k());
                }
            }
        } else if (this.f8731d == C4907e.C4909b.MATCH_PARENT && (v = this.f8729b.mo17266v()) != null && v.mo17271z() == C4907e.C4909b.FIXED) {
            mo17354a(this.f8735h, v.f8593e.f8735h, this.f8729b.f8565G.mo17165c());
            mo17354a(this.f8736i, v.f8593e.f8736i, -this.f8729b.f8567I.mo17165c());
            return;
        }
        if (this.f8732e.f8699j) {
            C4907e eVar2 = this.f8729b;
            if (eVar2.f8585a) {
                C4904d[] dVarArr = eVar2.f8572N;
                if (dVarArr[2].f8543f == null || dVarArr[3].f8543f == null) {
                    C4907e eVar3 = this.f8729b;
                    C4904d[] dVarArr2 = eVar3.f8572N;
                    if (dVarArr2[2].f8543f != null) {
                        C4925f a = mo17351a(dVarArr2[2]);
                        if (a != null) {
                            mo17354a(this.f8735h, a, this.f8729b.f8572N[2].mo17165c());
                            mo17354a(this.f8736i, this.f8735h, this.f8732e.f8696g);
                            if (this.f8729b.mo17183F()) {
                                mo17354a(this.f8719k, this.f8735h, this.f8729b.mo17230e());
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (dVarArr2[3].f8543f != null) {
                        C4925f a2 = mo17351a(dVarArr2[3]);
                        if (a2 != null) {
                            mo17354a(this.f8736i, a2, -this.f8729b.f8572N[3].mo17165c());
                            mo17354a(this.f8735h, this.f8736i, -this.f8732e.f8696g);
                        }
                        if (this.f8729b.mo17183F()) {
                            mo17354a(this.f8719k, this.f8735h, this.f8729b.mo17230e());
                            return;
                        }
                        return;
                    } else if (dVarArr2[4].f8543f != null) {
                        C4925f a3 = mo17351a(dVarArr2[4]);
                        if (a3 != null) {
                            mo17354a(this.f8719k, a3, 0);
                            mo17354a(this.f8735h, this.f8719k, -this.f8729b.mo17230e());
                            mo17354a(this.f8736i, this.f8735h, this.f8732e.f8696g);
                            return;
                        }
                        return;
                    } else if (!(eVar3 instanceof C4913h) && eVar3.mo17266v() != null && this.f8729b.mo17194a(C4904d.C4906b.CENTER).f8543f == null) {
                        mo17354a(this.f8735h, this.f8729b.mo17266v().f8593e.f8735h, this.f8729b.mo17182E());
                        mo17354a(this.f8736i, this.f8735h, this.f8732e.f8696g);
                        if (this.f8729b.mo17183F()) {
                            mo17354a(this.f8719k, this.f8735h, this.f8729b.mo17230e());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    if (eVar2.mo17187J()) {
                        this.f8735h.f8695f = this.f8729b.f8572N[2].mo17165c();
                        this.f8736i.f8695f = -this.f8729b.f8572N[3].mo17165c();
                    } else {
                        C4925f a4 = mo17351a(this.f8729b.f8572N[2]);
                        if (a4 != null) {
                            mo17354a(this.f8735h, a4, this.f8729b.f8572N[2].mo17165c());
                        }
                        C4925f a5 = mo17351a(this.f8729b.f8572N[3]);
                        if (a5 != null) {
                            mo17354a(this.f8736i, a5, -this.f8729b.f8572N[3].mo17165c());
                        }
                        this.f8735h.f8691b = true;
                        this.f8736i.f8691b = true;
                    }
                    if (this.f8729b.mo17183F()) {
                        mo17354a(this.f8719k, this.f8735h, this.f8729b.mo17230e());
                        return;
                    }
                    return;
                }
            }
        }
        if (this.f8732e.f8699j || this.f8731d != C4907e.C4909b.MATCH_CONSTRAINT) {
            this.f8732e.mo17333b(this);
        } else {
            C4907e eVar4 = this.f8729b;
            int i = eVar4.f8613o;
            if (i == 2) {
                C4907e v3 = eVar4.mo17266v();
                if (v3 != null) {
                    C4927g gVar = v3.f8593e.f8732e;
                    this.f8732e.f8701l.add(gVar);
                    gVar.f8700k.add(this.f8732e);
                    C4927g gVar2 = this.f8732e;
                    gVar2.f8691b = true;
                    gVar2.f8700k.add(this.f8735h);
                    this.f8732e.f8700k.add(this.f8736i);
                }
            } else if (i == 3 && !eVar4.mo17187J()) {
                C4907e eVar5 = this.f8729b;
                if (eVar5.f8611n != 3) {
                    C4927g gVar3 = eVar5.f8591d.f8732e;
                    this.f8732e.f8701l.add(gVar3);
                    gVar3.f8700k.add(this.f8732e);
                    C4927g gVar4 = this.f8732e;
                    gVar4.f8691b = true;
                    gVar4.f8700k.add(this.f8735h);
                    this.f8732e.f8700k.add(this.f8736i);
                }
            }
        }
        C4907e eVar6 = this.f8729b;
        C4904d[] dVarArr3 = eVar6.f8572N;
        if (dVarArr3[2].f8543f == null || dVarArr3[3].f8543f == null) {
            C4907e eVar7 = this.f8729b;
            C4904d[] dVarArr4 = eVar7.f8572N;
            if (dVarArr4[2].f8543f != null) {
                C4925f a6 = mo17351a(dVarArr4[2]);
                if (a6 != null) {
                    mo17354a(this.f8735h, a6, this.f8729b.f8572N[2].mo17165c());
                    mo17355a(this.f8736i, this.f8735h, 1, this.f8732e);
                    if (this.f8729b.mo17183F()) {
                        mo17355a(this.f8719k, this.f8735h, 1, this.f8720l);
                    }
                    if (this.f8731d == C4907e.C4909b.MATCH_CONSTRAINT && this.f8729b.mo17240i() > 0.0f) {
                        C4932l lVar = this.f8729b.f8591d;
                        if (lVar.f8731d == C4907e.C4909b.MATCH_CONSTRAINT) {
                            lVar.f8732e.f8700k.add(this.f8732e);
                            this.f8732e.f8701l.add(this.f8729b.f8591d.f8732e);
                            this.f8732e.f8690a = this;
                        }
                    }
                }
            } else if (dVarArr4[3].f8543f != null) {
                C4925f a7 = mo17351a(dVarArr4[3]);
                if (a7 != null) {
                    mo17354a(this.f8736i, a7, -this.f8729b.f8572N[3].mo17165c());
                    mo17355a(this.f8735h, this.f8736i, -1, this.f8732e);
                    if (this.f8729b.mo17183F()) {
                        mo17355a(this.f8719k, this.f8735h, 1, this.f8720l);
                    }
                }
            } else if (dVarArr4[4].f8543f != null) {
                C4925f a8 = mo17351a(dVarArr4[4]);
                if (a8 != null) {
                    mo17354a(this.f8719k, a8, 0);
                    mo17355a(this.f8735h, this.f8719k, -1, this.f8720l);
                    mo17355a(this.f8736i, this.f8735h, 1, this.f8732e);
                }
            } else if (!(eVar7 instanceof C4913h) && eVar7.mo17266v() != null) {
                mo17354a(this.f8735h, this.f8729b.mo17266v().f8593e.f8735h, this.f8729b.mo17182E());
                mo17355a(this.f8736i, this.f8735h, 1, this.f8732e);
                if (this.f8729b.mo17183F()) {
                    mo17355a(this.f8719k, this.f8735h, 1, this.f8720l);
                }
                if (this.f8731d == C4907e.C4909b.MATCH_CONSTRAINT && this.f8729b.mo17240i() > 0.0f) {
                    C4932l lVar2 = this.f8729b.f8591d;
                    if (lVar2.f8731d == C4907e.C4909b.MATCH_CONSTRAINT) {
                        lVar2.f8732e.f8700k.add(this.f8732e);
                        this.f8732e.f8701l.add(this.f8729b.f8591d.f8732e);
                        this.f8732e.f8690a = this;
                    }
                }
            }
        } else {
            if (eVar6.mo17187J()) {
                this.f8735h.f8695f = this.f8729b.f8572N[2].mo17165c();
                this.f8736i.f8695f = -this.f8729b.f8572N[3].mo17165c();
            } else {
                C4925f a9 = mo17351a(this.f8729b.f8572N[2]);
                C4925f a10 = mo17351a(this.f8729b.f8572N[3]);
                a9.mo17333b(this);
                a10.mo17333b(this);
                this.f8737j = C4939p.C4941b.CENTER;
            }
            if (this.f8729b.mo17183F()) {
                mo17355a(this.f8719k, this.f8735h, 1, this.f8720l);
            }
        }
        if (this.f8732e.f8701l.size() == 0) {
            this.f8732e.f8692c = true;
        }
    }
}
