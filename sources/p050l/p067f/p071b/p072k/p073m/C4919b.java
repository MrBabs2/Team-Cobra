package p050l.p067f.p071b.p072k.p073m;

import java.util.ArrayList;
import p050l.p067f.p071b.C4889d;
import p050l.p067f.p071b.C4892e;
import p050l.p067f.p071b.p072k.C4904d;
import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.C4910f;
import p050l.p067f.p071b.p072k.C4911g;
import p050l.p067f.p071b.p072k.C4913h;
import p050l.p067f.p071b.p072k.C4915j;
import p050l.p067f.p071b.p072k.C4916k;

/* renamed from: l.f.b.k.m.b */
/* compiled from: BasicMeasure */
public class C4919b {

    /* renamed from: a */
    private final ArrayList<C4907e> f8664a = new ArrayList<>();

    /* renamed from: b */
    private C4920a f8665b = new C4920a();

    /* renamed from: c */
    private C4910f f8666c;

    /* renamed from: l.f.b.k.m.b$a */
    /* compiled from: BasicMeasure */
    public static class C4920a {

        /* renamed from: k */
        public static int f8667k = 0;

        /* renamed from: l */
        public static int f8668l = 1;

        /* renamed from: m */
        public static int f8669m = 2;

        /* renamed from: a */
        public C4907e.C4909b f8670a;

        /* renamed from: b */
        public C4907e.C4909b f8671b;

        /* renamed from: c */
        public int f8672c;

        /* renamed from: d */
        public int f8673d;

        /* renamed from: e */
        public int f8674e;

        /* renamed from: f */
        public int f8675f;

        /* renamed from: g */
        public int f8676g;

        /* renamed from: h */
        public boolean f8677h;

        /* renamed from: i */
        public boolean f8678i;

        /* renamed from: j */
        public int f8679j;
    }

    /* renamed from: l.f.b.k.m.b$b */
    /* compiled from: BasicMeasure */
    public interface C4921b {
        /* renamed from: a */
        void mo2015a();

        /* renamed from: a */
        void mo2017a(C4907e eVar, C4920a aVar);
    }

    public C4919b(C4910f fVar) {
        this.f8666c = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
        if (r8 != r10) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
        if (r5.f8579U <= 0.0f) goto L_0x009e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8593b(p050l.p067f.p071b.p072k.C4910f r13) {
        /*
            r12 = this;
            java.util.ArrayList<l.f.b.k.e> r0 = r13.f8663p0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.mo17295w(r1)
            l.f.b.k.m.b$b r2 = r13.mo17273U()
            r3 = 0
            r4 = 0
        L_0x0012:
            if (r4 >= r0) goto L_0x00b6
            java.util.ArrayList<l.f.b.k.e> r5 = r13.f8663p0
            java.lang.Object r5 = r5.get(r4)
            l.f.b.k.e r5 = (p050l.p067f.p071b.p072k.C4907e) r5
            boolean r6 = r5 instanceof p050l.p067f.p071b.p072k.C4911g
            if (r6 == 0) goto L_0x0022
            goto L_0x00b2
        L_0x0022:
            boolean r6 = r5 instanceof p050l.p067f.p071b.p072k.C4901a
            if (r6 == 0) goto L_0x0028
            goto L_0x00b2
        L_0x0028:
            boolean r6 = r5.mo17188K()
            if (r6 == 0) goto L_0x0030
            goto L_0x00b2
        L_0x0030:
            if (r1 == 0) goto L_0x0048
            l.f.b.k.m.l r6 = r5.f8591d
            if (r6 == 0) goto L_0x0048
            l.f.b.k.m.n r7 = r5.f8593e
            if (r7 == 0) goto L_0x0048
            l.f.b.k.m.g r6 = r6.f8732e
            boolean r6 = r6.f8699j
            if (r6 == 0) goto L_0x0048
            l.f.b.k.m.g r6 = r7.f8732e
            boolean r6 = r6.f8699j
            if (r6 == 0) goto L_0x0048
            goto L_0x00b2
        L_0x0048:
            l.f.b.k.e$b r6 = r5.mo17211b((int) r3)
            r7 = 1
            l.f.b.k.e$b r8 = r5.mo17211b((int) r7)
            l.f.b.k.e$b r9 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r6 != r9) goto L_0x0061
            int r10 = r5.f8611n
            if (r10 == r7) goto L_0x0061
            if (r8 != r9) goto L_0x0061
            int r9 = r5.f8613o
            if (r9 == r7) goto L_0x0061
            r9 = 1
            goto L_0x0062
        L_0x0061:
            r9 = 0
        L_0x0062:
            if (r9 != 0) goto L_0x009e
            boolean r10 = r13.mo17295w(r7)
            if (r10 == 0) goto L_0x009e
            boolean r10 = r5 instanceof p050l.p067f.p071b.p072k.C4916k
            if (r10 != 0) goto L_0x009e
            l.f.b.k.e$b r10 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r6 != r10) goto L_0x007f
            int r11 = r5.f8611n
            if (r11 != 0) goto L_0x007f
            if (r8 == r10) goto L_0x007f
            boolean r10 = r5.mo17185H()
            if (r10 != 0) goto L_0x007f
            r9 = 1
        L_0x007f:
            l.f.b.k.e$b r10 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r8 != r10) goto L_0x0090
            int r11 = r5.f8613o
            if (r11 != 0) goto L_0x0090
            if (r6 == r10) goto L_0x0090
            boolean r10 = r5.mo17185H()
            if (r10 != 0) goto L_0x0090
            r9 = 1
        L_0x0090:
            l.f.b.k.e$b r10 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r6 == r10) goto L_0x0096
            if (r8 != r10) goto L_0x009e
        L_0x0096:
            float r6 = r5.f8579U
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r7 = r9
        L_0x009f:
            if (r7 == 0) goto L_0x00a2
            goto L_0x00b2
        L_0x00a2:
            int r6 = p050l.p067f.p071b.p072k.p073m.C4919b.C4920a.f8667k
            r12.m8592a(r2, r5, r6)
            l.f.b.e r5 = r13.f8646u0
            if (r5 == 0) goto L_0x00b2
            long r6 = r5.f8443a
            r8 = 1
            long r6 = r6 + r8
            r5.f8443a = r6
        L_0x00b2:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x00b6:
            r2.mo2015a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.p073m.C4919b.m8593b(l.f.b.k.f):void");
    }

    /* renamed from: a */
    public void mo17314a(C4910f fVar) {
        this.f8664a.clear();
        int size = fVar.f8663p0.size();
        for (int i = 0; i < size; i++) {
            C4907e eVar = fVar.f8663p0.get(i);
            if (eVar.mo17250n() == C4907e.C4909b.MATCH_CONSTRAINT || eVar.mo17271z() == C4907e.C4909b.MATCH_CONSTRAINT) {
                this.f8664a.add(eVar);
            }
        }
        fVar.mo17276X();
    }

    /* renamed from: a */
    private void m8591a(C4910f fVar, String str, int i, int i2) {
        int u = fVar.mo17264u();
        int t = fVar.mo17262t();
        fVar.mo17257q(0);
        fVar.mo17255p(0);
        fVar.mo17263t(i);
        fVar.mo17247l(i2);
        fVar.mo17257q(u);
        fVar.mo17255p(t);
        this.f8666c.mo17272S();
    }

    /* renamed from: a */
    public long mo17313a(C4910f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        int i11;
        boolean z2;
        boolean z3;
        int i12;
        boolean z4;
        C4921b bVar;
        int i13;
        int i14;
        int i15;
        boolean z5;
        C4892e eVar;
        C4910f fVar2 = fVar;
        int i16 = i;
        int i17 = i4;
        int i18 = i6;
        C4921b U = fVar.mo17273U();
        int size = fVar2.f8663p0.size();
        int C = fVar.mo17180C();
        int k = fVar.mo17244k();
        boolean a = C4915j.m8580a(i16, 128);
        boolean z6 = a || C4915j.m8580a(i16, 64);
        if (z6) {
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    break;
                }
                C4907e eVar2 = fVar2.f8663p0.get(i19);
                boolean z7 = (eVar2.mo17250n() == C4907e.C4909b.MATCH_CONSTRAINT) && (eVar2.mo17271z() == C4907e.C4909b.MATCH_CONSTRAINT) && eVar2.mo17240i() > 0.0f;
                if ((!eVar2.mo17185H() || !z7) && ((!eVar2.mo17187J() || !z7) && !(eVar2 instanceof C4916k) && !eVar2.mo17185H() && !eVar2.mo17187J())) {
                    i19++;
                }
            }
            z6 = false;
        }
        if (z6 && (eVar = C4889d.f8422x) != null) {
            eVar.f8445c++;
        }
        boolean z8 = z6 & ((i17 == 1073741824 && i18 == 1073741824) || a);
        if (z8) {
            int min = Math.min(fVar.mo17260s(), i5);
            int min2 = Math.min(fVar.mo17258r(), i7);
            if (i17 == 1073741824 && fVar.mo17180C() != min) {
                fVar2.mo17263t(min);
                fVar.mo17276X();
            }
            if (i18 == 1073741824 && fVar.mo17244k() != min2) {
                fVar2.mo17247l(min2);
                fVar.mo17276X();
            }
            if (i17 == 1073741824 && i18 == 1073741824) {
                z = fVar2.mo17292e(a);
                i10 = 2;
            } else {
                boolean f = fVar2.mo17293f(a);
                if (i17 == 1073741824) {
                    f &= fVar2.mo17284a(a, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i18 == 1073741824) {
                    z = fVar2.mo17284a(a, 1) & f;
                    i10++;
                } else {
                    z = f;
                }
            }
            if (z) {
                fVar2.mo17209a(i17 == 1073741824, i18 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0;
        }
        int V = fVar.mo17274V();
        if (size > 0) {
            m8593b(fVar);
        }
        mo17314a(fVar);
        int size2 = this.f8664a.size();
        if (size > 0) {
            m8591a(fVar2, "First pass", C, k);
        }
        if (size2 > 0) {
            boolean z9 = fVar.mo17250n() == C4907e.C4909b.WRAP_CONTENT;
            boolean z10 = fVar.mo17271z() == C4907e.C4909b.WRAP_CONTENT;
            int max = Math.max(fVar.mo17180C(), this.f8666c.mo17264u());
            int max2 = Math.max(fVar.mo17244k(), this.f8666c.mo17262t());
            int i20 = 0;
            boolean z11 = false;
            while (i20 < size2) {
                C4907e eVar3 = this.f8664a.get(i20);
                if (!(eVar3 instanceof C4916k)) {
                    i13 = V;
                    i15 = C;
                    i14 = k;
                } else {
                    int C2 = eVar3.mo17180C();
                    i13 = V;
                    int k2 = eVar3.mo17244k();
                    i15 = C;
                    boolean a2 = m8592a(U, eVar3, C4920a.f8668l) | z11;
                    C4892e eVar4 = fVar2.f8646u0;
                    boolean z12 = a2;
                    i14 = k;
                    if (eVar4 != null) {
                        eVar4.f8444b++;
                    }
                    int C3 = eVar3.mo17180C();
                    int k3 = eVar3.mo17244k();
                    if (C3 != C2) {
                        eVar3.mo17263t(C3);
                        if (z9 && eVar3.mo17268w() > max) {
                            max = Math.max(max, eVar3.mo17268w() + eVar3.mo17194a(C4904d.C4906b.RIGHT).mo17165c());
                        }
                        z5 = true;
                    } else {
                        z5 = z12;
                    }
                    if (k3 != k2) {
                        eVar3.mo17247l(k3);
                        if (z10 && eVar3.mo17233f() > max2) {
                            max2 = Math.max(max2, eVar3.mo17233f() + eVar3.mo17194a(C4904d.C4906b.BOTTOM).mo17165c());
                        }
                        z5 = true;
                    }
                    z11 = z5 | ((C4916k) eVar3).mo17309S();
                }
                i20++;
                V = i13;
                C = i15;
                k = i14;
            }
            int i21 = V;
            int i22 = C;
            int i23 = k;
            int i24 = 0;
            int i25 = 2;
            while (i24 < i25) {
                int i26 = 0;
                while (i26 < size2) {
                    C4907e eVar5 = this.f8664a.get(i26);
                    if ((!(eVar5 instanceof C4913h) || (eVar5 instanceof C4916k)) && !(eVar5 instanceof C4911g) && eVar5.mo17179B() != 8 && ((!z8 || !eVar5.f8591d.f8732e.f8699j || !eVar5.f8593e.f8732e.f8699j) && !(eVar5 instanceof C4916k))) {
                        int C4 = eVar5.mo17180C();
                        int k4 = eVar5.mo17244k();
                        int e = eVar5.mo17230e();
                        int i27 = C4920a.f8668l;
                        z4 = z8;
                        if (i24 == 1) {
                            i27 = C4920a.f8669m;
                        }
                        boolean a3 = m8592a(U, eVar5, i27) | z11;
                        C4892e eVar6 = fVar2.f8646u0;
                        i12 = size2;
                        bVar = U;
                        if (eVar6 != null) {
                            eVar6.f8444b++;
                        }
                        int C5 = eVar5.mo17180C();
                        int k5 = eVar5.mo17244k();
                        if (C5 != C4) {
                            eVar5.mo17263t(C5);
                            if (z9 && eVar5.mo17268w() > max) {
                                max = Math.max(max, eVar5.mo17268w() + eVar5.mo17194a(C4904d.C4906b.RIGHT).mo17165c());
                            }
                            a3 = true;
                        }
                        if (k5 != k4) {
                            eVar5.mo17247l(k5);
                            if (z10 && eVar5.mo17233f() > max2) {
                                max2 = Math.max(max2, eVar5.mo17233f() + eVar5.mo17194a(C4904d.C4906b.BOTTOM).mo17165c());
                            }
                            a3 = true;
                        }
                        z11 = (!eVar5.mo17183F() || e == eVar5.mo17230e()) ? a3 : true;
                    } else {
                        z4 = z8;
                        i12 = size2;
                        bVar = U;
                    }
                    i26++;
                    size2 = i12;
                    U = bVar;
                    z8 = z4;
                }
                boolean z13 = z8;
                int i28 = size2;
                C4921b bVar2 = U;
                if (!z11) {
                    break;
                }
                m8591a(fVar2, "intermediate pass", i22, i23);
                i24++;
                U = bVar2;
                z8 = z13;
                i25 = 2;
                z11 = false;
                size2 = i28;
            }
            int i29 = i22;
            int i30 = i23;
            if (z11) {
                m8591a(fVar2, "2nd pass", i29, i30);
                if (fVar.mo17180C() < max) {
                    fVar2.mo17263t(max);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fVar.mo17244k() < max2) {
                    fVar2.mo17247l(max2);
                    z3 = true;
                } else {
                    z3 = z2;
                }
                if (z3) {
                    m8591a(fVar2, "3rd pass", i29, i30);
                }
            }
            i11 = i21;
        } else {
            i11 = V;
        }
        fVar2.mo17296x(i11);
        return 0;
    }

    /* renamed from: a */
    private boolean m8592a(C4921b bVar, C4907e eVar, int i) {
        this.f8665b.f8670a = eVar.mo17250n();
        this.f8665b.f8671b = eVar.mo17271z();
        this.f8665b.f8672c = eVar.mo17180C();
        this.f8665b.f8673d = eVar.mo17244k();
        C4920a aVar = this.f8665b;
        aVar.f8678i = false;
        aVar.f8679j = i;
        boolean z = aVar.f8670a == C4907e.C4909b.MATCH_CONSTRAINT;
        boolean z2 = this.f8665b.f8671b == C4907e.C4909b.MATCH_CONSTRAINT;
        boolean z3 = z && eVar.f8579U > 0.0f;
        boolean z4 = z2 && eVar.f8579U > 0.0f;
        if (z3 && eVar.f8614p[0] == 4) {
            this.f8665b.f8670a = C4907e.C4909b.FIXED;
        }
        if (z4 && eVar.f8614p[1] == 4) {
            this.f8665b.f8671b = C4907e.C4909b.FIXED;
        }
        bVar.mo2017a(eVar, this.f8665b);
        eVar.mo17263t(this.f8665b.f8674e);
        eVar.mo17247l(this.f8665b.f8675f);
        eVar.mo17208a(this.f8665b.f8677h);
        eVar.mo17239h(this.f8665b.f8676g);
        C4920a aVar2 = this.f8665b;
        aVar2.f8679j = C4920a.f8667k;
        return aVar2.f8678i;
    }
}
