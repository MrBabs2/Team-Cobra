package p050l.p067f.p071b.p072k.p073m;

import p050l.p067f.p071b.p072k.C4904d;
import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.C4913h;
import p050l.p067f.p071b.p072k.p073m.C4925f;
import p050l.p067f.p071b.p072k.p073m.C4939p;

/* renamed from: l.f.b.k.m.l */
/* compiled from: HorizontalWidgetRun */
public class C4932l extends C4939p {

    /* renamed from: k */
    private static int[] f8713k = new int[2];

    /* renamed from: l.f.b.k.m.l$a */
    /* compiled from: HorizontalWidgetRun */
    static /* synthetic */ class C4933a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8714a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                l.f.b.k.m.p$b[] r0 = p050l.p067f.p071b.p072k.p073m.C4939p.C4941b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8714a = r0
                l.f.b.k.m.p$b r1 = p050l.p067f.p071b.p072k.p073m.C4939p.C4941b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8714a     // Catch:{ NoSuchFieldError -> 0x001d }
                l.f.b.k.m.p$b r1 = p050l.p067f.p071b.p072k.p073m.C4939p.C4941b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8714a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l.f.b.k.m.p$b r1 = p050l.p067f.p071b.p072k.p073m.C4939p.C4941b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.p073m.C4932l.C4933a.<clinit>():void");
        }
    }

    public C4932l(C4907e eVar) {
        super(eVar);
        this.f8735h.f8694e = C4925f.C4926a.LEFT;
        this.f8736i.f8694e = C4925f.C4926a.RIGHT;
        this.f8733f = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17315a() {
        C4907e v;
        C4907e v2;
        C4907e eVar = this.f8729b;
        if (eVar.f8585a) {
            this.f8732e.mo17332a(eVar.mo17180C());
        }
        if (!this.f8732e.f8699j) {
            C4907e.C4909b n = this.f8729b.mo17250n();
            this.f8731d = n;
            if (n != C4907e.C4909b.MATCH_CONSTRAINT) {
                if (n == C4907e.C4909b.MATCH_PARENT && (((v2 = this.f8729b.mo17266v()) != null && v2.mo17250n() == C4907e.C4909b.FIXED) || v2.mo17250n() == C4907e.C4909b.MATCH_PARENT)) {
                    int C = (v2.mo17180C() - this.f8729b.f8564F.mo17165c()) - this.f8729b.f8566H.mo17165c();
                    mo17354a(this.f8735h, v2.f8591d.f8735h, this.f8729b.f8564F.mo17165c());
                    mo17354a(this.f8736i, v2.f8591d.f8736i, -this.f8729b.f8566H.mo17165c());
                    this.f8732e.mo17332a(C);
                    return;
                } else if (this.f8731d == C4907e.C4909b.FIXED) {
                    this.f8732e.mo17332a(this.f8729b.mo17180C());
                }
            }
        } else if (this.f8731d == C4907e.C4909b.MATCH_PARENT && (((v = this.f8729b.mo17266v()) != null && v.mo17250n() == C4907e.C4909b.FIXED) || v.mo17250n() == C4907e.C4909b.MATCH_PARENT)) {
            mo17354a(this.f8735h, v.f8591d.f8735h, this.f8729b.f8564F.mo17165c());
            mo17354a(this.f8736i, v.f8591d.f8736i, -this.f8729b.f8566H.mo17165c());
            return;
        }
        if (this.f8732e.f8699j) {
            C4907e eVar2 = this.f8729b;
            if (eVar2.f8585a) {
                C4904d[] dVarArr = eVar2.f8572N;
                if (dVarArr[0].f8543f == null || dVarArr[1].f8543f == null) {
                    C4907e eVar3 = this.f8729b;
                    C4904d[] dVarArr2 = eVar3.f8572N;
                    if (dVarArr2[0].f8543f != null) {
                        C4925f a = mo17351a(dVarArr2[0]);
                        if (a != null) {
                            mo17354a(this.f8735h, a, this.f8729b.f8572N[0].mo17165c());
                            mo17354a(this.f8736i, this.f8735h, this.f8732e.f8696g);
                            return;
                        }
                        return;
                    } else if (dVarArr2[1].f8543f != null) {
                        C4925f a2 = mo17351a(dVarArr2[1]);
                        if (a2 != null) {
                            mo17354a(this.f8736i, a2, -this.f8729b.f8572N[1].mo17165c());
                            mo17354a(this.f8735h, this.f8736i, -this.f8732e.f8696g);
                            return;
                        }
                        return;
                    } else if (!(eVar3 instanceof C4913h) && eVar3.mo17266v() != null && this.f8729b.mo17194a(C4904d.C4906b.CENTER).f8543f == null) {
                        mo17354a(this.f8735h, this.f8729b.mo17266v().f8591d.f8735h, this.f8729b.mo17181D());
                        mo17354a(this.f8736i, this.f8735h, this.f8732e.f8696g);
                        return;
                    } else {
                        return;
                    }
                } else if (eVar2.mo17185H()) {
                    this.f8735h.f8695f = this.f8729b.f8572N[0].mo17165c();
                    this.f8736i.f8695f = -this.f8729b.f8572N[1].mo17165c();
                    return;
                } else {
                    C4925f a3 = mo17351a(this.f8729b.f8572N[0]);
                    if (a3 != null) {
                        mo17354a(this.f8735h, a3, this.f8729b.f8572N[0].mo17165c());
                    }
                    C4925f a4 = mo17351a(this.f8729b.f8572N[1]);
                    if (a4 != null) {
                        mo17354a(this.f8736i, a4, -this.f8729b.f8572N[1].mo17165c());
                    }
                    this.f8735h.f8691b = true;
                    this.f8736i.f8691b = true;
                    return;
                }
            }
        }
        if (this.f8731d == C4907e.C4909b.MATCH_CONSTRAINT) {
            C4907e eVar4 = this.f8729b;
            int i = eVar4.f8611n;
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
            } else if (i == 3) {
                if (eVar4.f8613o == 3) {
                    this.f8735h.f8690a = this;
                    this.f8736i.f8690a = this;
                    C4935n nVar = eVar4.f8593e;
                    nVar.f8735h.f8690a = this;
                    nVar.f8736i.f8690a = this;
                    this.f8732e.f8690a = this;
                    if (eVar4.mo17187J()) {
                        this.f8732e.f8701l.add(this.f8729b.f8593e.f8732e);
                        this.f8729b.f8593e.f8732e.f8700k.add(this.f8732e);
                        C4935n nVar2 = this.f8729b.f8593e;
                        nVar2.f8732e.f8690a = this;
                        this.f8732e.f8701l.add(nVar2.f8735h);
                        this.f8732e.f8701l.add(this.f8729b.f8593e.f8736i);
                        this.f8729b.f8593e.f8735h.f8700k.add(this.f8732e);
                        this.f8729b.f8593e.f8736i.f8700k.add(this.f8732e);
                    } else if (this.f8729b.mo17185H()) {
                        this.f8729b.f8593e.f8732e.f8701l.add(this.f8732e);
                        this.f8732e.f8700k.add(this.f8729b.f8593e.f8732e);
                    } else {
                        this.f8729b.f8593e.f8732e.f8701l.add(this.f8732e);
                    }
                } else {
                    C4927g gVar3 = eVar4.f8593e.f8732e;
                    this.f8732e.f8701l.add(gVar3);
                    gVar3.f8700k.add(this.f8732e);
                    this.f8729b.f8593e.f8735h.f8700k.add(this.f8732e);
                    this.f8729b.f8593e.f8736i.f8700k.add(this.f8732e);
                    C4927g gVar4 = this.f8732e;
                    gVar4.f8691b = true;
                    gVar4.f8700k.add(this.f8735h);
                    this.f8732e.f8700k.add(this.f8736i);
                    this.f8735h.f8701l.add(this.f8732e);
                    this.f8736i.f8701l.add(this.f8732e);
                }
            }
        }
        C4907e eVar5 = this.f8729b;
        C4904d[] dVarArr3 = eVar5.f8572N;
        if (dVarArr3[0].f8543f == null || dVarArr3[1].f8543f == null) {
            C4907e eVar6 = this.f8729b;
            C4904d[] dVarArr4 = eVar6.f8572N;
            if (dVarArr4[0].f8543f != null) {
                C4925f a5 = mo17351a(dVarArr4[0]);
                if (a5 != null) {
                    mo17354a(this.f8735h, a5, this.f8729b.f8572N[0].mo17165c());
                    mo17355a(this.f8736i, this.f8735h, 1, this.f8732e);
                }
            } else if (dVarArr4[1].f8543f != null) {
                C4925f a6 = mo17351a(dVarArr4[1]);
                if (a6 != null) {
                    mo17354a(this.f8736i, a6, -this.f8729b.f8572N[1].mo17165c());
                    mo17355a(this.f8735h, this.f8736i, -1, this.f8732e);
                }
            } else if (!(eVar6 instanceof C4913h) && eVar6.mo17266v() != null) {
                mo17354a(this.f8735h, this.f8729b.mo17266v().f8591d.f8735h, this.f8729b.mo17181D());
                mo17355a(this.f8736i, this.f8735h, 1, this.f8732e);
            }
        } else if (eVar5.mo17185H()) {
            this.f8735h.f8695f = this.f8729b.f8572N[0].mo17165c();
            this.f8736i.f8695f = -this.f8729b.f8572N[1].mo17165c();
        } else {
            C4925f a7 = mo17351a(this.f8729b.f8572N[0]);
            C4925f a8 = mo17351a(this.f8729b.f8572N[1]);
            a7.mo17333b(this);
            a8.mo17333b(this);
            this.f8737j = C4939p.C4941b.CENTER;
        }
    }

    /* renamed from: b */
    public void mo17317b() {
        C4925f fVar = this.f8735h;
        if (fVar.f8699j) {
            this.f8729b.mo17265u(fVar.f8696g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17318c() {
        this.f8730c = null;
        this.f8735h.mo17331a();
        this.f8736i.mo17331a();
        this.f8732e.mo17331a();
        this.f8734g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo17320f() {
        if (this.f8731d != C4907e.C4909b.MATCH_CONSTRAINT || this.f8729b.f8611n == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo17335g() {
        this.f8734g = false;
        this.f8735h.mo17331a();
        this.f8735h.f8699j = false;
        this.f8736i.mo17331a();
        this.f8736i.f8699j = false;
        this.f8732e.f8699j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f8729b.mo17238h();
    }

    /* renamed from: a */
    private void m8652a(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02c6, code lost:
        if (r14 != 1) goto L_0x032e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17316a(p050l.p067f.p071b.p072k.p073m.C4923d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = p050l.p067f.p071b.p072k.p073m.C4932l.C4933a.f8714a
            l.f.b.k.m.p$b r1 = r8.f8737j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            l.f.b.k.e r0 = r8.f8729b
            l.f.b.k.d r1 = r0.f8564F
            l.f.b.k.d r0 = r0.f8566H
            r3 = r17
            r8.mo17353a((p050l.p067f.p071b.p072k.p073m.C4923d) r3, (p050l.p067f.p071b.p072k.C4904d) r1, (p050l.p067f.p071b.p072k.C4904d) r0, (int) r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo17356b(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo17357c(r17)
        L_0x002e:
            l.f.b.k.m.g r0 = r8.f8732e
            boolean r0 = r0.f8699j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x032e
            l.f.b.k.e$b r0 = r8.f8731d
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x032e
            l.f.b.k.e r0 = r8.f8729b
            int r3 = r0.f8611n
            if (r3 == r1) goto L_0x0310
            if (r3 == r2) goto L_0x0046
            goto L_0x032e
        L_0x0046:
            int r1 = r0.f8613o
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.mo17242j()
            if (r0 == r3) goto L_0x0077
            if (r0 == 0) goto L_0x0068
            if (r0 == r9) goto L_0x005a
            r0 = 0
            goto L_0x0088
        L_0x005a:
            l.f.b.k.e r0 = r8.f8729b
            l.f.b.k.m.n r1 = r0.f8593e
            l.f.b.k.m.g r1 = r1.f8732e
            int r1 = r1.f8696g
            float r1 = (float) r1
            float r0 = r0.mo17240i()
            goto L_0x0084
        L_0x0068:
            l.f.b.k.e r0 = r8.f8729b
            l.f.b.k.m.n r1 = r0.f8593e
            l.f.b.k.m.g r1 = r1.f8732e
            int r1 = r1.f8696g
            float r1 = (float) r1
            float r0 = r0.mo17240i()
            float r1 = r1 / r0
            goto L_0x0086
        L_0x0077:
            l.f.b.k.e r0 = r8.f8729b
            l.f.b.k.m.n r1 = r0.f8593e
            l.f.b.k.m.g r1 = r1.f8732e
            int r1 = r1.f8696g
            float r1 = (float) r1
            float r0 = r0.mo17240i()
        L_0x0084:
            float r1 = r1 * r0
        L_0x0086:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0088:
            l.f.b.k.m.g r1 = r8.f8732e
            r1.mo17332a(r0)
            goto L_0x032e
        L_0x008f:
            l.f.b.k.e r0 = r8.f8729b
            l.f.b.k.m.n r1 = r0.f8593e
            l.f.b.k.m.f r12 = r1.f8735h
            l.f.b.k.m.f r13 = r1.f8736i
            l.f.b.k.d r0 = r0.f8564F
            l.f.b.k.d r0 = r0.f8543f
            if (r0 == 0) goto L_0x009f
            r0 = 1
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            l.f.b.k.e r1 = r8.f8729b
            l.f.b.k.d r1 = r1.f8565G
            l.f.b.k.d r1 = r1.f8543f
            if (r1 == 0) goto L_0x00aa
            r1 = 1
            goto L_0x00ab
        L_0x00aa:
            r1 = 0
        L_0x00ab:
            l.f.b.k.e r2 = r8.f8729b
            l.f.b.k.d r2 = r2.f8566H
            l.f.b.k.d r2 = r2.f8543f
            if (r2 == 0) goto L_0x00b5
            r2 = 1
            goto L_0x00b6
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            l.f.b.k.e r4 = r8.f8729b
            l.f.b.k.d r4 = r4.f8567I
            l.f.b.k.d r4 = r4.f8543f
            if (r4 == 0) goto L_0x00c0
            r4 = 1
            goto L_0x00c1
        L_0x00c0:
            r4 = 0
        L_0x00c1:
            l.f.b.k.e r5 = r8.f8729b
            int r14 = r5.mo17242j()
            if (r0 == 0) goto L_0x020a
            if (r1 == 0) goto L_0x020a
            if (r2 == 0) goto L_0x020a
            if (r4 == 0) goto L_0x020a
            l.f.b.k.e r0 = r8.f8729b
            float r15 = r0.mo17240i()
            boolean r0 = r12.f8699j
            if (r0 == 0) goto L_0x0138
            boolean r0 = r13.f8699j
            if (r0 == 0) goto L_0x0138
            l.f.b.k.m.f r0 = r8.f8735h
            boolean r1 = r0.f8692c
            if (r1 == 0) goto L_0x0137
            l.f.b.k.m.f r1 = r8.f8736i
            boolean r1 = r1.f8692c
            if (r1 != 0) goto L_0x00ea
            goto L_0x0137
        L_0x00ea:
            java.util.List<l.f.b.k.m.f> r0 = r0.f8701l
            java.lang.Object r0 = r0.get(r10)
            l.f.b.k.m.f r0 = (p050l.p067f.p071b.p072k.p073m.C4925f) r0
            int r0 = r0.f8696g
            l.f.b.k.m.f r1 = r8.f8735h
            int r1 = r1.f8695f
            int r2 = r0 + r1
            l.f.b.k.m.f r0 = r8.f8736i
            java.util.List<l.f.b.k.m.f> r0 = r0.f8701l
            java.lang.Object r0 = r0.get(r10)
            l.f.b.k.m.f r0 = (p050l.p067f.p071b.p072k.p073m.C4925f) r0
            int r0 = r0.f8696g
            l.f.b.k.m.f r1 = r8.f8736i
            int r1 = r1.f8695f
            int r3 = r0 - r1
            int r0 = r12.f8696g
            int r1 = r12.f8695f
            int r4 = r0 + r1
            int r0 = r13.f8696g
            int r1 = r13.f8695f
            int r5 = r0 - r1
            int[] r1 = f8713k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m8652a(r1, r2, r3, r4, r5, r6, r7)
            l.f.b.k.m.g r0 = r8.f8732e
            int[] r1 = f8713k
            r1 = r1[r10]
            r0.mo17332a(r1)
            l.f.b.k.e r0 = r8.f8729b
            l.f.b.k.m.n r0 = r0.f8593e
            l.f.b.k.m.g r0 = r0.f8732e
            int[] r1 = f8713k
            r1 = r1[r9]
            r0.mo17332a(r1)
        L_0x0137:
            return
        L_0x0138:
            l.f.b.k.m.f r0 = r8.f8735h
            boolean r1 = r0.f8699j
            if (r1 == 0) goto L_0x0195
            l.f.b.k.m.f r1 = r8.f8736i
            boolean r2 = r1.f8699j
            if (r2 == 0) goto L_0x0195
            boolean r2 = r12.f8692c
            if (r2 == 0) goto L_0x0194
            boolean r2 = r13.f8692c
            if (r2 != 0) goto L_0x014d
            goto L_0x0194
        L_0x014d:
            int r2 = r0.f8696g
            int r0 = r0.f8695f
            int r2 = r2 + r0
            int r0 = r1.f8696g
            int r1 = r1.f8695f
            int r3 = r0 - r1
            java.util.List<l.f.b.k.m.f> r0 = r12.f8701l
            java.lang.Object r0 = r0.get(r10)
            l.f.b.k.m.f r0 = (p050l.p067f.p071b.p072k.p073m.C4925f) r0
            int r0 = r0.f8696g
            int r1 = r12.f8695f
            int r4 = r0 + r1
            java.util.List<l.f.b.k.m.f> r0 = r13.f8701l
            java.lang.Object r0 = r0.get(r10)
            l.f.b.k.m.f r0 = (p050l.p067f.p071b.p072k.p073m.C4925f) r0
            int r0 = r0.f8696g
            int r1 = r13.f8695f
            int r5 = r0 - r1
            int[] r1 = f8713k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m8652a(r1, r2, r3, r4, r5, r6, r7)
            l.f.b.k.m.g r0 = r8.f8732e
            int[] r1 = f8713k
            r1 = r1[r10]
            r0.mo17332a(r1)
            l.f.b.k.e r0 = r8.f8729b
            l.f.b.k.m.n r0 = r0.f8593e
            l.f.b.k.m.g r0 = r0.f8732e
            int[] r1 = f8713k
            r1 = r1[r9]
            r0.mo17332a(r1)
            goto L_0x0195
        L_0x0194:
            return
        L_0x0195:
            l.f.b.k.m.f r0 = r8.f8735h
            boolean r1 = r0.f8692c
            if (r1 == 0) goto L_0x0209
            l.f.b.k.m.f r1 = r8.f8736i
            boolean r1 = r1.f8692c
            if (r1 == 0) goto L_0x0209
            boolean r1 = r12.f8692c
            if (r1 == 0) goto L_0x0209
            boolean r1 = r13.f8692c
            if (r1 != 0) goto L_0x01aa
            goto L_0x0209
        L_0x01aa:
            java.util.List<l.f.b.k.m.f> r0 = r0.f8701l
            java.lang.Object r0 = r0.get(r10)
            l.f.b.k.m.f r0 = (p050l.p067f.p071b.p072k.p073m.C4925f) r0
            int r0 = r0.f8696g
            l.f.b.k.m.f r1 = r8.f8735h
            int r1 = r1.f8695f
            int r2 = r0 + r1
            l.f.b.k.m.f r0 = r8.f8736i
            java.util.List<l.f.b.k.m.f> r0 = r0.f8701l
            java.lang.Object r0 = r0.get(r10)
            l.f.b.k.m.f r0 = (p050l.p067f.p071b.p072k.p073m.C4925f) r0
            int r0 = r0.f8696g
            l.f.b.k.m.f r1 = r8.f8736i
            int r1 = r1.f8695f
            int r3 = r0 - r1
            java.util.List<l.f.b.k.m.f> r0 = r12.f8701l
            java.lang.Object r0 = r0.get(r10)
            l.f.b.k.m.f r0 = (p050l.p067f.p071b.p072k.p073m.C4925f) r0
            int r0 = r0.f8696g
            int r1 = r12.f8695f
            int r4 = r0 + r1
            java.util.List<l.f.b.k.m.f> r0 = r13.f8701l
            java.lang.Object r0 = r0.get(r10)
            l.f.b.k.m.f r0 = (p050l.p067f.p071b.p072k.p073m.C4925f) r0
            int r0 = r0.f8696g
            int r1 = r13.f8695f
            int r5 = r0 - r1
            int[] r1 = f8713k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m8652a(r1, r2, r3, r4, r5, r6, r7)
            l.f.b.k.m.g r0 = r8.f8732e
            int[] r1 = f8713k
            r1 = r1[r10]
            r0.mo17332a(r1)
            l.f.b.k.e r0 = r8.f8729b
            l.f.b.k.m.n r0 = r0.f8593e
            l.f.b.k.m.g r0 = r0.f8732e
            int[] r1 = f8713k
            r1 = r1[r9]
            r0.mo17332a(r1)
            goto L_0x032e
        L_0x0209:
            return
        L_0x020a:
            if (r0 == 0) goto L_0x0295
            if (r2 == 0) goto L_0x0295
            l.f.b.k.m.f r0 = r8.f8735h
            boolean r0 = r0.f8692c
            if (r0 == 0) goto L_0x0294
            l.f.b.k.m.f r0 = r8.f8736i
            boolean r0 = r0.f8692c
            if (r0 != 0) goto L_0x021c
            goto L_0x0294
        L_0x021c:
            l.f.b.k.e r0 = r8.f8729b
            float r0 = r0.mo17240i()
            l.f.b.k.m.f r1 = r8.f8735h
            java.util.List<l.f.b.k.m.f> r1 = r1.f8701l
            java.lang.Object r1 = r1.get(r10)
            l.f.b.k.m.f r1 = (p050l.p067f.p071b.p072k.p073m.C4925f) r1
            int r1 = r1.f8696g
            l.f.b.k.m.f r2 = r8.f8735h
            int r2 = r2.f8695f
            int r1 = r1 + r2
            l.f.b.k.m.f r2 = r8.f8736i
            java.util.List<l.f.b.k.m.f> r2 = r2.f8701l
            java.lang.Object r2 = r2.get(r10)
            l.f.b.k.m.f r2 = (p050l.p067f.p071b.p072k.p073m.C4925f) r2
            int r2 = r2.f8696g
            l.f.b.k.m.f r4 = r8.f8736i
            int r4 = r4.f8695f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0270
            if (r14 == 0) goto L_0x0270
            if (r14 == r9) goto L_0x024c
            goto L_0x032e
        L_0x024c:
            int r2 = r2 - r1
            int r1 = r8.mo17350a((int) r2, (int) r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo17350a((int) r2, (int) r9)
            if (r2 == r3) goto L_0x0260
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0260:
            l.f.b.k.m.g r0 = r8.f8732e
            r0.mo17332a(r1)
            l.f.b.k.e r0 = r8.f8729b
            l.f.b.k.m.n r0 = r0.f8593e
            l.f.b.k.m.g r0 = r0.f8732e
            r0.mo17332a(r3)
            goto L_0x032e
        L_0x0270:
            int r2 = r2 - r1
            int r1 = r8.mo17350a((int) r2, (int) r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo17350a((int) r2, (int) r9)
            if (r2 == r3) goto L_0x0284
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0284:
            l.f.b.k.m.g r0 = r8.f8732e
            r0.mo17332a(r1)
            l.f.b.k.e r0 = r8.f8729b
            l.f.b.k.m.n r0 = r0.f8593e
            l.f.b.k.m.g r0 = r0.f8732e
            r0.mo17332a(r3)
            goto L_0x032e
        L_0x0294:
            return
        L_0x0295:
            if (r1 == 0) goto L_0x032e
            if (r4 == 0) goto L_0x032e
            boolean r0 = r12.f8692c
            if (r0 == 0) goto L_0x030f
            boolean r0 = r13.f8692c
            if (r0 != 0) goto L_0x02a2
            goto L_0x030f
        L_0x02a2:
            l.f.b.k.e r0 = r8.f8729b
            float r0 = r0.mo17240i()
            java.util.List<l.f.b.k.m.f> r1 = r12.f8701l
            java.lang.Object r1 = r1.get(r10)
            l.f.b.k.m.f r1 = (p050l.p067f.p071b.p072k.p073m.C4925f) r1
            int r1 = r1.f8696g
            int r2 = r12.f8695f
            int r1 = r1 + r2
            java.util.List<l.f.b.k.m.f> r2 = r13.f8701l
            java.lang.Object r2 = r2.get(r10)
            l.f.b.k.m.f r2 = (p050l.p067f.p071b.p072k.p073m.C4925f) r2
            int r2 = r2.f8696g
            int r4 = r13.f8695f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02ec
            if (r14 == 0) goto L_0x02c9
            if (r14 == r9) goto L_0x02ec
            goto L_0x032e
        L_0x02c9:
            int r2 = r2 - r1
            int r1 = r8.mo17350a((int) r2, (int) r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo17350a((int) r2, (int) r10)
            if (r2 == r3) goto L_0x02dd
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02dd:
            l.f.b.k.m.g r0 = r8.f8732e
            r0.mo17332a(r3)
            l.f.b.k.e r0 = r8.f8729b
            l.f.b.k.m.n r0 = r0.f8593e
            l.f.b.k.m.g r0 = r0.f8732e
            r0.mo17332a(r1)
            goto L_0x032e
        L_0x02ec:
            int r2 = r2 - r1
            int r1 = r8.mo17350a((int) r2, (int) r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo17350a((int) r2, (int) r10)
            if (r2 == r3) goto L_0x0300
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0300:
            l.f.b.k.m.g r0 = r8.f8732e
            r0.mo17332a(r3)
            l.f.b.k.e r0 = r8.f8729b
            l.f.b.k.m.n r0 = r0.f8593e
            l.f.b.k.m.g r0 = r0.f8732e
            r0.mo17332a(r1)
            goto L_0x032e
        L_0x030f:
            return
        L_0x0310:
            l.f.b.k.e r0 = r0.mo17266v()
            if (r0 == 0) goto L_0x032e
            l.f.b.k.m.l r0 = r0.f8591d
            l.f.b.k.m.g r0 = r0.f8732e
            boolean r1 = r0.f8699j
            if (r1 == 0) goto L_0x032e
            l.f.b.k.e r1 = r8.f8729b
            float r1 = r1.f8617s
            int r0 = r0.f8696g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            l.f.b.k.m.g r1 = r8.f8732e
            r1.mo17332a(r0)
        L_0x032e:
            l.f.b.k.m.f r0 = r8.f8735h
            boolean r1 = r0.f8692c
            if (r1 == 0) goto L_0x0450
            l.f.b.k.m.f r1 = r8.f8736i
            boolean r2 = r1.f8692c
            if (r2 != 0) goto L_0x033c
            goto L_0x0450
        L_0x033c:
            boolean r0 = r0.f8699j
            if (r0 == 0) goto L_0x034b
            boolean r0 = r1.f8699j
            if (r0 == 0) goto L_0x034b
            l.f.b.k.m.g r0 = r8.f8732e
            boolean r0 = r0.f8699j
            if (r0 == 0) goto L_0x034b
            return
        L_0x034b:
            l.f.b.k.m.g r0 = r8.f8732e
            boolean r0 = r0.f8699j
            if (r0 != 0) goto L_0x0395
            l.f.b.k.e$b r0 = r8.f8731d
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0395
            l.f.b.k.e r0 = r8.f8729b
            int r1 = r0.f8611n
            if (r1 != 0) goto L_0x0395
            boolean r0 = r0.mo17185H()
            if (r0 != 0) goto L_0x0395
            l.f.b.k.m.f r0 = r8.f8735h
            java.util.List<l.f.b.k.m.f> r0 = r0.f8701l
            java.lang.Object r0 = r0.get(r10)
            l.f.b.k.m.f r0 = (p050l.p067f.p071b.p072k.p073m.C4925f) r0
            l.f.b.k.m.f r1 = r8.f8736i
            java.util.List<l.f.b.k.m.f> r1 = r1.f8701l
            java.lang.Object r1 = r1.get(r10)
            l.f.b.k.m.f r1 = (p050l.p067f.p071b.p072k.p073m.C4925f) r1
            int r0 = r0.f8696g
            l.f.b.k.m.f r2 = r8.f8735h
            int r3 = r2.f8695f
            int r0 = r0 + r3
            int r1 = r1.f8696g
            l.f.b.k.m.f r3 = r8.f8736i
            int r3 = r3.f8695f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo17332a((int) r0)
            l.f.b.k.m.f r0 = r8.f8736i
            r0.mo17332a((int) r1)
            l.f.b.k.m.g r0 = r8.f8732e
            r0.mo17332a(r3)
            return
        L_0x0395:
            l.f.b.k.m.g r0 = r8.f8732e
            boolean r0 = r0.f8699j
            if (r0 != 0) goto L_0x03f9
            l.f.b.k.e$b r0 = r8.f8731d
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03f9
            int r0 = r8.f8728a
            if (r0 != r9) goto L_0x03f9
            l.f.b.k.m.f r0 = r8.f8735h
            java.util.List<l.f.b.k.m.f> r0 = r0.f8701l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03f9
            l.f.b.k.m.f r0 = r8.f8736i
            java.util.List<l.f.b.k.m.f> r0 = r0.f8701l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03f9
            l.f.b.k.m.f r0 = r8.f8735h
            java.util.List<l.f.b.k.m.f> r0 = r0.f8701l
            java.lang.Object r0 = r0.get(r10)
            l.f.b.k.m.f r0 = (p050l.p067f.p071b.p072k.p073m.C4925f) r0
            l.f.b.k.m.f r1 = r8.f8736i
            java.util.List<l.f.b.k.m.f> r1 = r1.f8701l
            java.lang.Object r1 = r1.get(r10)
            l.f.b.k.m.f r1 = (p050l.p067f.p071b.p072k.p073m.C4925f) r1
            int r0 = r0.f8696g
            l.f.b.k.m.f r2 = r8.f8735h
            int r2 = r2.f8695f
            int r0 = r0 + r2
            int r1 = r1.f8696g
            l.f.b.k.m.f r2 = r8.f8736i
            int r2 = r2.f8695f
            int r1 = r1 + r2
            int r1 = r1 - r0
            l.f.b.k.m.g r0 = r8.f8732e
            int r0 = r0.f8711m
            int r0 = java.lang.Math.min(r1, r0)
            l.f.b.k.e r1 = r8.f8729b
            int r2 = r1.f8616r
            int r1 = r1.f8615q
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03f4
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03f4:
            l.f.b.k.m.g r1 = r8.f8732e
            r1.mo17332a(r0)
        L_0x03f9:
            l.f.b.k.m.g r0 = r8.f8732e
            boolean r0 = r0.f8699j
            if (r0 != 0) goto L_0x0400
            return
        L_0x0400:
            l.f.b.k.m.f r0 = r8.f8735h
            java.util.List<l.f.b.k.m.f> r0 = r0.f8701l
            java.lang.Object r0 = r0.get(r10)
            l.f.b.k.m.f r0 = (p050l.p067f.p071b.p072k.p073m.C4925f) r0
            l.f.b.k.m.f r1 = r8.f8736i
            java.util.List<l.f.b.k.m.f> r1 = r1.f8701l
            java.lang.Object r1 = r1.get(r10)
            l.f.b.k.m.f r1 = (p050l.p067f.p071b.p072k.p073m.C4925f) r1
            int r2 = r0.f8696g
            l.f.b.k.m.f r3 = r8.f8735h
            int r3 = r3.f8695f
            int r2 = r2 + r3
            int r3 = r1.f8696g
            l.f.b.k.m.f r4 = r8.f8736i
            int r4 = r4.f8695f
            int r3 = r3 + r4
            l.f.b.k.e r4 = r8.f8729b
            float r4 = r4.mo17246l()
            if (r0 != r1) goto L_0x0430
            int r2 = r0.f8696g
            int r3 = r1.f8696g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x0430:
            int r3 = r3 - r2
            l.f.b.k.m.g r0 = r8.f8732e
            int r0 = r0.f8696g
            int r3 = r3 - r0
            l.f.b.k.m.f r0 = r8.f8735h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo17332a((int) r1)
            l.f.b.k.m.f r0 = r8.f8736i
            l.f.b.k.m.f r1 = r8.f8735h
            int r1 = r1.f8696g
            l.f.b.k.m.g r2 = r8.f8732e
            int r2 = r2.f8696g
            int r1 = r1 + r2
            r0.mo17332a((int) r1)
        L_0x0450:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.p073m.C4932l.mo17316a(l.f.b.k.m.d):void");
    }
}
