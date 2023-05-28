package p050l.p067f.p071b.p072k.p073m;

import java.util.ArrayList;
import p050l.p067f.p071b.p072k.C4901a;
import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.C4910f;
import p050l.p067f.p071b.p072k.C4911g;
import p050l.p067f.p071b.p072k.p073m.C4919b;

/* renamed from: l.f.b.k.m.h */
/* compiled from: Direct */
public class C4928h {

    /* renamed from: a */
    private static C4919b.C4920a f8712a = new C4919b.C4920a();

    /* renamed from: a */
    public static void m8632a(C4910f fVar, C4919b.C4921b bVar) {
        C4907e.C4909b n = fVar.mo17250n();
        C4907e.C4909b z = fVar.mo17271z();
        fVar.mo17192Q();
        ArrayList<C4907e> R = fVar.mo17145R();
        int size = R.size();
        for (int i = 0; i < size; i++) {
            R.get(i).mo17192Q();
        }
        boolean a0 = fVar.mo17285a0();
        if (n == C4907e.C4909b.FIXED) {
            fVar.mo17196a(0, fVar.mo17180C());
        } else {
            fVar.mo17243j(0);
        }
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C4907e eVar = R.get(i2);
            if (eVar instanceof C4911g) {
                C4911g gVar = (C4911g) eVar;
                if (gVar.mo17297S() == 1) {
                    if (gVar.mo17298T() != -1) {
                        gVar.mo17295w(gVar.mo17298T());
                    } else if (gVar.mo17299U() != -1 && fVar.mo17143M()) {
                        gVar.mo17295w(fVar.mo17180C() - gVar.mo17299U());
                    } else if (fVar.mo17143M()) {
                        gVar.mo17295w((int) ((gVar.mo17300V() * ((float) fVar.mo17180C())) + 0.5f));
                    }
                    z2 = true;
                }
            } else if ((eVar instanceof C4901a) && ((C4901a) eVar).mo17149V() == 0) {
                z3 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                C4907e eVar2 = R.get(i3);
                if (eVar2 instanceof C4911g) {
                    C4911g gVar2 = (C4911g) eVar2;
                    if (gVar2.mo17297S() == 1) {
                        m8631a((C4907e) gVar2, bVar, a0);
                    }
                }
            }
        }
        m8631a((C4907e) fVar, bVar, a0);
        if (z3) {
            for (int i4 = 0; i4 < size; i4++) {
                C4907e eVar3 = R.get(i4);
                if (eVar3 instanceof C4901a) {
                    C4901a aVar = (C4901a) eVar3;
                    if (aVar.mo17149V() == 0) {
                        m8627a(aVar, bVar, 0, a0);
                    }
                }
            }
        }
        if (z == C4907e.C4909b.FIXED) {
            fVar.mo17213b(0, fVar.mo17244k());
        } else {
            fVar.mo17245k(0);
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C4907e eVar4 = R.get(i5);
            if (eVar4 instanceof C4911g) {
                C4911g gVar3 = (C4911g) eVar4;
                if (gVar3.mo17297S() == 0) {
                    if (gVar3.mo17298T() != -1) {
                        gVar3.mo17295w(gVar3.mo17298T());
                    } else if (gVar3.mo17299U() != -1 && fVar.mo17144N()) {
                        gVar3.mo17295w(fVar.mo17244k() - gVar3.mo17299U());
                    } else if (fVar.mo17144N()) {
                        gVar3.mo17295w((int) ((gVar3.mo17300V() * ((float) fVar.mo17244k())) + 0.5f));
                    }
                    z4 = true;
                }
            } else if ((eVar4 instanceof C4901a) && ((C4901a) eVar4).mo17149V() == 1) {
                z5 = true;
            }
        }
        if (z4) {
            for (int i6 = 0; i6 < size; i6++) {
                C4907e eVar5 = R.get(i6);
                if (eVar5 instanceof C4911g) {
                    C4911g gVar4 = (C4911g) eVar5;
                    if (gVar4.mo17297S() == 0) {
                        m8628a((C4907e) gVar4, bVar);
                    }
                }
            }
        }
        m8628a((C4907e) fVar, bVar);
        if (z5) {
            for (int i7 = 0; i7 < size; i7++) {
                C4907e eVar6 = R.get(i7);
                if (eVar6 instanceof C4901a) {
                    C4901a aVar2 = (C4901a) eVar6;
                    if (aVar2.mo17149V() == 1) {
                        m8627a(aVar2, bVar, 1, a0);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C4907e eVar7 = R.get(i8);
            if (eVar7.mo17189L() && m8635a(eVar7)) {
                C4910f.m8523a(eVar7, bVar, f8712a, C4919b.C4920a.f8667k);
                m8631a(eVar7, bVar, a0);
                m8628a(eVar7, bVar);
            }
        }
    }

    /* renamed from: a */
    private static void m8627a(C4901a aVar, C4919b.C4921b bVar, int i, boolean z) {
        if (!aVar.mo17145R()) {
            return;
        }
        if (i == 0) {
            m8631a((C4907e) aVar, bVar, z);
        } else {
            m8628a((C4907e) aVar, bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r10 = r9.f8566H.f8543f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b8, code lost:
        r4 = r9.f8564F.f8543f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m8631a(p050l.p067f.p071b.p072k.C4907e r13, p050l.p067f.p071b.p072k.p073m.C4919b.C4921b r14, boolean r15) {
        /*
            boolean r0 = r13 instanceof p050l.p067f.p071b.p072k.C4910f
            if (r0 != 0) goto L_0x001a
            boolean r0 = r13.mo17189L()
            if (r0 == 0) goto L_0x001a
            boolean r0 = m8635a(r13)
            if (r0 == 0) goto L_0x001a
            l.f.b.k.m.b$a r0 = new l.f.b.k.m.b$a
            r0.<init>()
            int r1 = p050l.p067f.p071b.p072k.p073m.C4919b.C4920a.f8667k
            p050l.p067f.p071b.p072k.C4910f.m8523a(r13, r14, r0, r1)
        L_0x001a:
            l.f.b.k.d$b r0 = p050l.p067f.p071b.p072k.C4904d.C4906b.LEFT
            l.f.b.k.d r0 = r13.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r0)
            l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.RIGHT
            l.f.b.k.d r1 = r13.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r1)
            int r2 = r0.mo17164b()
            int r3 = r1.mo17164b()
            java.util.HashSet r4 = r0.mo17158a()
            r5 = 0
            r6 = 8
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0131
            boolean r4 = r0.mo17173k()
            if (r4 == 0) goto L_0x0131
            java.util.HashSet r0 = r0.mo17158a()
            java.util.Iterator r0 = r0.iterator()
        L_0x0047:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0131
            java.lang.Object r4 = r0.next()
            l.f.b.k.d r4 = (p050l.p067f.p071b.p072k.C4904d) r4
            l.f.b.k.e r9 = r4.f8541d
            boolean r10 = m8635a(r9)
            boolean r11 = r9.mo17189L()
            if (r11 == 0) goto L_0x006b
            if (r10 == 0) goto L_0x006b
            l.f.b.k.m.b$a r11 = new l.f.b.k.m.b$a
            r11.<init>()
            int r12 = p050l.p067f.p071b.p072k.p073m.C4919b.C4920a.f8667k
            p050l.p067f.p071b.p072k.C4910f.m8523a(r9, r14, r11, r12)
        L_0x006b:
            l.f.b.k.e$b r11 = r9.mo17250n()
            l.f.b.k.e$b r12 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x00d4
            if (r10 == 0) goto L_0x0076
            goto L_0x00d4
        L_0x0076:
            l.f.b.k.e$b r10 = r9.mo17250n()
            l.f.b.k.e$b r11 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x0047
            int r10 = r9.f8616r
            if (r10 < 0) goto L_0x0047
            int r10 = r9.f8615q
            if (r10 < 0) goto L_0x0047
            int r10 = r9.mo17179B()
            if (r10 == r6) goto L_0x0098
            int r10 = r9.f8611n
            if (r10 != 0) goto L_0x0047
            float r10 = r9.mo17240i()
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0047
        L_0x0098:
            boolean r10 = r9.mo17185H()
            if (r10 != 0) goto L_0x0047
            boolean r10 = r9.mo17188K()
            if (r10 != 0) goto L_0x0047
            l.f.b.k.d r10 = r9.f8564F
            if (r4 != r10) goto L_0x00b4
            l.f.b.k.d r10 = r9.f8566H
            l.f.b.k.d r10 = r10.f8543f
            if (r10 == 0) goto L_0x00b4
            boolean r10 = r10.mo17173k()
            if (r10 != 0) goto L_0x00c4
        L_0x00b4:
            l.f.b.k.d r10 = r9.f8566H
            if (r4 != r10) goto L_0x00c6
            l.f.b.k.d r4 = r9.f8564F
            l.f.b.k.d r4 = r4.f8543f
            if (r4 == 0) goto L_0x00c6
            boolean r4 = r4.mo17173k()
            if (r4 == 0) goto L_0x00c6
        L_0x00c4:
            r4 = 1
            goto L_0x00c7
        L_0x00c6:
            r4 = 0
        L_0x00c7:
            if (r4 == 0) goto L_0x0047
            boolean r4 = r9.mo17185H()
            if (r4 != 0) goto L_0x0047
            m8630a((p050l.p067f.p071b.p072k.C4907e) r13, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14, (p050l.p067f.p071b.p072k.C4907e) r9, (boolean) r15)
            goto L_0x0047
        L_0x00d4:
            boolean r10 = r9.mo17189L()
            if (r10 == 0) goto L_0x00dc
            goto L_0x0047
        L_0x00dc:
            l.f.b.k.d r10 = r9.f8564F
            if (r4 != r10) goto L_0x00f8
            l.f.b.k.d r11 = r9.f8566H
            l.f.b.k.d r11 = r11.f8543f
            if (r11 != 0) goto L_0x00f8
            int r4 = r10.mo17165c()
            int r4 = r4 + r2
            int r10 = r9.mo17180C()
            int r10 = r10 + r4
            r9.mo17196a((int) r4, (int) r10)
            m8631a((p050l.p067f.p071b.p072k.C4907e) r9, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14, (boolean) r15)
            goto L_0x0047
        L_0x00f8:
            l.f.b.k.d r10 = r9.f8566H
            if (r4 != r10) goto L_0x0116
            l.f.b.k.d r11 = r9.f8564F
            l.f.b.k.d r11 = r11.f8543f
            if (r11 != 0) goto L_0x0116
            int r4 = r10.mo17165c()
            int r4 = r2 - r4
            int r10 = r9.mo17180C()
            int r10 = r4 - r10
            r9.mo17196a((int) r10, (int) r4)
            m8631a((p050l.p067f.p071b.p072k.C4907e) r9, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14, (boolean) r15)
            goto L_0x0047
        L_0x0116:
            l.f.b.k.d r10 = r9.f8564F
            if (r4 != r10) goto L_0x0047
            l.f.b.k.d r4 = r9.f8566H
            l.f.b.k.d r4 = r4.f8543f
            if (r4 == 0) goto L_0x0047
            boolean r4 = r4.mo17173k()
            if (r4 == 0) goto L_0x0047
            boolean r4 = r9.mo17185H()
            if (r4 != 0) goto L_0x0047
            m8634a((p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14, (p050l.p067f.p071b.p072k.C4907e) r9, (boolean) r15)
            goto L_0x0047
        L_0x0131:
            boolean r0 = r13 instanceof p050l.p067f.p071b.p072k.C4911g
            if (r0 == 0) goto L_0x0136
            return
        L_0x0136:
            java.util.HashSet r0 = r1.mo17158a()
            if (r0 == 0) goto L_0x0226
            boolean r0 = r1.mo17173k()
            if (r0 == 0) goto L_0x0226
            java.util.HashSet r0 = r1.mo17158a()
            java.util.Iterator r0 = r0.iterator()
        L_0x014a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0226
            java.lang.Object r1 = r0.next()
            l.f.b.k.d r1 = (p050l.p067f.p071b.p072k.C4904d) r1
            l.f.b.k.e r2 = r1.f8541d
            boolean r4 = m8635a(r2)
            boolean r9 = r2.mo17189L()
            if (r9 == 0) goto L_0x016e
            if (r4 == 0) goto L_0x016e
            l.f.b.k.m.b$a r9 = new l.f.b.k.m.b$a
            r9.<init>()
            int r10 = p050l.p067f.p071b.p072k.p073m.C4919b.C4920a.f8667k
            p050l.p067f.p071b.p072k.C4910f.m8523a(r2, r14, r9, r10)
        L_0x016e:
            l.f.b.k.d r9 = r2.f8564F
            if (r1 != r9) goto L_0x017e
            l.f.b.k.d r9 = r2.f8566H
            l.f.b.k.d r9 = r9.f8543f
            if (r9 == 0) goto L_0x017e
            boolean r9 = r9.mo17173k()
            if (r9 != 0) goto L_0x018e
        L_0x017e:
            l.f.b.k.d r9 = r2.f8566H
            if (r1 != r9) goto L_0x0190
            l.f.b.k.d r9 = r2.f8564F
            l.f.b.k.d r9 = r9.f8543f
            if (r9 == 0) goto L_0x0190
            boolean r9 = r9.mo17173k()
            if (r9 == 0) goto L_0x0190
        L_0x018e:
            r9 = 1
            goto L_0x0191
        L_0x0190:
            r9 = 0
        L_0x0191:
            l.f.b.k.e$b r10 = r2.mo17250n()
            l.f.b.k.e$b r11 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x01d7
            if (r4 == 0) goto L_0x019c
            goto L_0x01d7
        L_0x019c:
            l.f.b.k.e$b r1 = r2.mo17250n()
            l.f.b.k.e$b r4 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r1 != r4) goto L_0x014a
            int r1 = r2.f8616r
            if (r1 < 0) goto L_0x014a
            int r1 = r2.f8615q
            if (r1 < 0) goto L_0x014a
            int r1 = r2.mo17179B()
            if (r1 == r6) goto L_0x01be
            int r1 = r2.f8611n
            if (r1 != 0) goto L_0x014a
            float r1 = r2.mo17240i()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x014a
        L_0x01be:
            boolean r1 = r2.mo17185H()
            if (r1 != 0) goto L_0x014a
            boolean r1 = r2.mo17188K()
            if (r1 != 0) goto L_0x014a
            if (r9 == 0) goto L_0x014a
            boolean r1 = r2.mo17185H()
            if (r1 != 0) goto L_0x014a
            m8630a((p050l.p067f.p071b.p072k.C4907e) r13, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14, (p050l.p067f.p071b.p072k.C4907e) r2, (boolean) r15)
            goto L_0x014a
        L_0x01d7:
            boolean r4 = r2.mo17189L()
            if (r4 == 0) goto L_0x01df
            goto L_0x014a
        L_0x01df:
            l.f.b.k.d r4 = r2.f8564F
            if (r1 != r4) goto L_0x01fb
            l.f.b.k.d r10 = r2.f8566H
            l.f.b.k.d r10 = r10.f8543f
            if (r10 != 0) goto L_0x01fb
            int r1 = r4.mo17165c()
            int r1 = r1 + r3
            int r4 = r2.mo17180C()
            int r4 = r4 + r1
            r2.mo17196a((int) r1, (int) r4)
            m8631a((p050l.p067f.p071b.p072k.C4907e) r2, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14, (boolean) r15)
            goto L_0x014a
        L_0x01fb:
            l.f.b.k.d r4 = r2.f8566H
            if (r1 != r4) goto L_0x0219
            l.f.b.k.d r1 = r2.f8564F
            l.f.b.k.d r1 = r1.f8543f
            if (r1 != 0) goto L_0x0219
            int r1 = r4.mo17165c()
            int r1 = r3 - r1
            int r4 = r2.mo17180C()
            int r4 = r1 - r4
            r2.mo17196a((int) r4, (int) r1)
            m8631a((p050l.p067f.p071b.p072k.C4907e) r2, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14, (boolean) r15)
            goto L_0x014a
        L_0x0219:
            if (r9 == 0) goto L_0x014a
            boolean r1 = r2.mo17185H()
            if (r1 != 0) goto L_0x014a
            m8634a((p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14, (p050l.p067f.p071b.p072k.C4907e) r2, (boolean) r15)
            goto L_0x014a
        L_0x0226:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.p073m.C4928h.m8631a(l.f.b.k.e, l.f.b.k.m.b$b, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r10 = r9.f8567I.f8543f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b8, code lost:
        r4 = r9.f8565G.f8543f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m8628a(p050l.p067f.p071b.p072k.C4907e r13, p050l.p067f.p071b.p072k.p073m.C4919b.C4921b r14) {
        /*
            boolean r0 = r13 instanceof p050l.p067f.p071b.p072k.C4910f
            if (r0 != 0) goto L_0x001a
            boolean r0 = r13.mo17189L()
            if (r0 == 0) goto L_0x001a
            boolean r0 = m8635a(r13)
            if (r0 == 0) goto L_0x001a
            l.f.b.k.m.b$a r0 = new l.f.b.k.m.b$a
            r0.<init>()
            int r1 = p050l.p067f.p071b.p072k.p073m.C4919b.C4920a.f8667k
            p050l.p067f.p071b.p072k.C4910f.m8523a(r13, r14, r0, r1)
        L_0x001a:
            l.f.b.k.d$b r0 = p050l.p067f.p071b.p072k.C4904d.C4906b.TOP
            l.f.b.k.d r0 = r13.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r0)
            l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.BOTTOM
            l.f.b.k.d r1 = r13.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r1)
            int r2 = r0.mo17164b()
            int r3 = r1.mo17164b()
            java.util.HashSet r4 = r0.mo17158a()
            r5 = 0
            r6 = 8
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0129
            boolean r4 = r0.mo17173k()
            if (r4 == 0) goto L_0x0129
            java.util.HashSet r0 = r0.mo17158a()
            java.util.Iterator r0 = r0.iterator()
        L_0x0047:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0129
            java.lang.Object r4 = r0.next()
            l.f.b.k.d r4 = (p050l.p067f.p071b.p072k.C4904d) r4
            l.f.b.k.e r9 = r4.f8541d
            boolean r10 = m8635a(r9)
            boolean r11 = r9.mo17189L()
            if (r11 == 0) goto L_0x006b
            if (r10 == 0) goto L_0x006b
            l.f.b.k.m.b$a r11 = new l.f.b.k.m.b$a
            r11.<init>()
            int r12 = p050l.p067f.p071b.p072k.p073m.C4919b.C4920a.f8667k
            p050l.p067f.p071b.p072k.C4910f.m8523a(r9, r14, r11, r12)
        L_0x006b:
            l.f.b.k.e$b r11 = r9.mo17271z()
            l.f.b.k.e$b r12 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x00d4
            if (r10 == 0) goto L_0x0076
            goto L_0x00d4
        L_0x0076:
            l.f.b.k.e$b r10 = r9.mo17271z()
            l.f.b.k.e$b r11 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x0047
            int r10 = r9.f8619u
            if (r10 < 0) goto L_0x0047
            int r10 = r9.f8618t
            if (r10 < 0) goto L_0x0047
            int r10 = r9.mo17179B()
            if (r10 == r6) goto L_0x0098
            int r10 = r9.f8613o
            if (r10 != 0) goto L_0x0047
            float r10 = r9.mo17240i()
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0047
        L_0x0098:
            boolean r10 = r9.mo17187J()
            if (r10 != 0) goto L_0x0047
            boolean r10 = r9.mo17188K()
            if (r10 != 0) goto L_0x0047
            l.f.b.k.d r10 = r9.f8565G
            if (r4 != r10) goto L_0x00b4
            l.f.b.k.d r10 = r9.f8567I
            l.f.b.k.d r10 = r10.f8543f
            if (r10 == 0) goto L_0x00b4
            boolean r10 = r10.mo17173k()
            if (r10 != 0) goto L_0x00c4
        L_0x00b4:
            l.f.b.k.d r10 = r9.f8567I
            if (r4 != r10) goto L_0x00c6
            l.f.b.k.d r4 = r9.f8565G
            l.f.b.k.d r4 = r4.f8543f
            if (r4 == 0) goto L_0x00c6
            boolean r4 = r4.mo17173k()
            if (r4 == 0) goto L_0x00c6
        L_0x00c4:
            r4 = 1
            goto L_0x00c7
        L_0x00c6:
            r4 = 0
        L_0x00c7:
            if (r4 == 0) goto L_0x0047
            boolean r4 = r9.mo17187J()
            if (r4 != 0) goto L_0x0047
            m8629a((p050l.p067f.p071b.p072k.C4907e) r13, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14, (p050l.p067f.p071b.p072k.C4907e) r9)
            goto L_0x0047
        L_0x00d4:
            boolean r10 = r9.mo17189L()
            if (r10 == 0) goto L_0x00dc
            goto L_0x0047
        L_0x00dc:
            l.f.b.k.d r10 = r9.f8565G
            if (r4 != r10) goto L_0x00f8
            l.f.b.k.d r11 = r9.f8567I
            l.f.b.k.d r11 = r11.f8543f
            if (r11 != 0) goto L_0x00f8
            int r4 = r10.mo17165c()
            int r4 = r4 + r2
            int r10 = r9.mo17244k()
            int r10 = r10 + r4
            r9.mo17213b((int) r4, (int) r10)
            m8628a((p050l.p067f.p071b.p072k.C4907e) r9, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14)
            goto L_0x0047
        L_0x00f8:
            l.f.b.k.d r10 = r9.f8567I
            if (r4 != r10) goto L_0x0114
            l.f.b.k.d r11 = r10.f8543f
            if (r11 != 0) goto L_0x0114
            int r4 = r10.mo17165c()
            int r4 = r2 - r4
            int r10 = r9.mo17244k()
            int r10 = r4 - r10
            r9.mo17213b((int) r10, (int) r4)
            m8628a((p050l.p067f.p071b.p072k.C4907e) r9, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14)
            goto L_0x0047
        L_0x0114:
            l.f.b.k.d r10 = r9.f8565G
            if (r4 != r10) goto L_0x0047
            l.f.b.k.d r4 = r9.f8567I
            l.f.b.k.d r4 = r4.f8543f
            if (r4 == 0) goto L_0x0047
            boolean r4 = r4.mo17173k()
            if (r4 == 0) goto L_0x0047
            m8633a((p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14, (p050l.p067f.p071b.p072k.C4907e) r9)
            goto L_0x0047
        L_0x0129:
            boolean r0 = r13 instanceof p050l.p067f.p071b.p072k.C4911g
            if (r0 == 0) goto L_0x012e
            return
        L_0x012e:
            java.util.HashSet r0 = r1.mo17158a()
            if (r0 == 0) goto L_0x021e
            boolean r0 = r1.mo17173k()
            if (r0 == 0) goto L_0x021e
            java.util.HashSet r0 = r1.mo17158a()
            java.util.Iterator r0 = r0.iterator()
        L_0x0142:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x021e
            java.lang.Object r1 = r0.next()
            l.f.b.k.d r1 = (p050l.p067f.p071b.p072k.C4904d) r1
            l.f.b.k.e r2 = r1.f8541d
            boolean r4 = m8635a(r2)
            boolean r9 = r2.mo17189L()
            if (r9 == 0) goto L_0x0166
            if (r4 == 0) goto L_0x0166
            l.f.b.k.m.b$a r9 = new l.f.b.k.m.b$a
            r9.<init>()
            int r10 = p050l.p067f.p071b.p072k.p073m.C4919b.C4920a.f8667k
            p050l.p067f.p071b.p072k.C4910f.m8523a(r2, r14, r9, r10)
        L_0x0166:
            l.f.b.k.d r9 = r2.f8565G
            if (r1 != r9) goto L_0x0176
            l.f.b.k.d r9 = r2.f8567I
            l.f.b.k.d r9 = r9.f8543f
            if (r9 == 0) goto L_0x0176
            boolean r9 = r9.mo17173k()
            if (r9 != 0) goto L_0x0186
        L_0x0176:
            l.f.b.k.d r9 = r2.f8567I
            if (r1 != r9) goto L_0x0188
            l.f.b.k.d r9 = r2.f8565G
            l.f.b.k.d r9 = r9.f8543f
            if (r9 == 0) goto L_0x0188
            boolean r9 = r9.mo17173k()
            if (r9 == 0) goto L_0x0188
        L_0x0186:
            r9 = 1
            goto L_0x0189
        L_0x0188:
            r9 = 0
        L_0x0189:
            l.f.b.k.e$b r10 = r2.mo17271z()
            l.f.b.k.e$b r11 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x01cf
            if (r4 == 0) goto L_0x0194
            goto L_0x01cf
        L_0x0194:
            l.f.b.k.e$b r1 = r2.mo17271z()
            l.f.b.k.e$b r4 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r1 != r4) goto L_0x0142
            int r1 = r2.f8619u
            if (r1 < 0) goto L_0x0142
            int r1 = r2.f8618t
            if (r1 < 0) goto L_0x0142
            int r1 = r2.mo17179B()
            if (r1 == r6) goto L_0x01b6
            int r1 = r2.f8613o
            if (r1 != 0) goto L_0x0142
            float r1 = r2.mo17240i()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0142
        L_0x01b6:
            boolean r1 = r2.mo17187J()
            if (r1 != 0) goto L_0x0142
            boolean r1 = r2.mo17188K()
            if (r1 != 0) goto L_0x0142
            if (r9 == 0) goto L_0x0142
            boolean r1 = r2.mo17187J()
            if (r1 != 0) goto L_0x0142
            m8629a((p050l.p067f.p071b.p072k.C4907e) r13, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14, (p050l.p067f.p071b.p072k.C4907e) r2)
            goto L_0x0142
        L_0x01cf:
            boolean r4 = r2.mo17189L()
            if (r4 == 0) goto L_0x01d7
            goto L_0x0142
        L_0x01d7:
            l.f.b.k.d r4 = r2.f8565G
            if (r1 != r4) goto L_0x01f3
            l.f.b.k.d r10 = r2.f8567I
            l.f.b.k.d r10 = r10.f8543f
            if (r10 != 0) goto L_0x01f3
            int r1 = r4.mo17165c()
            int r1 = r1 + r3
            int r4 = r2.mo17244k()
            int r4 = r4 + r1
            r2.mo17213b((int) r1, (int) r4)
            m8628a((p050l.p067f.p071b.p072k.C4907e) r2, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14)
            goto L_0x0142
        L_0x01f3:
            l.f.b.k.d r4 = r2.f8567I
            if (r1 != r4) goto L_0x0211
            l.f.b.k.d r1 = r2.f8565G
            l.f.b.k.d r1 = r1.f8543f
            if (r1 != 0) goto L_0x0211
            int r1 = r4.mo17165c()
            int r1 = r3 - r1
            int r4 = r2.mo17244k()
            int r4 = r1 - r4
            r2.mo17213b((int) r4, (int) r1)
            m8628a((p050l.p067f.p071b.p072k.C4907e) r2, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14)
            goto L_0x0142
        L_0x0211:
            if (r9 == 0) goto L_0x0142
            boolean r1 = r2.mo17187J()
            if (r1 != 0) goto L_0x0142
            m8633a((p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14, (p050l.p067f.p071b.p072k.C4907e) r2)
            goto L_0x0142
        L_0x021e:
            l.f.b.k.d$b r0 = p050l.p067f.p071b.p072k.C4904d.C4906b.BASELINE
            l.f.b.k.d r13 = r13.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r0)
            java.util.HashSet r0 = r13.mo17158a()
            if (r0 == 0) goto L_0x027c
            boolean r0 = r13.mo17173k()
            if (r0 == 0) goto L_0x027c
            int r0 = r13.mo17164b()
            java.util.HashSet r13 = r13.mo17158a()
            java.util.Iterator r13 = r13.iterator()
        L_0x023c:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x027c
            java.lang.Object r1 = r13.next()
            l.f.b.k.d r1 = (p050l.p067f.p071b.p072k.C4904d) r1
            l.f.b.k.e r2 = r1.f8541d
            boolean r3 = m8635a(r2)
            boolean r4 = r2.mo17189L()
            if (r4 == 0) goto L_0x0260
            if (r3 == 0) goto L_0x0260
            l.f.b.k.m.b$a r4 = new l.f.b.k.m.b$a
            r4.<init>()
            int r5 = p050l.p067f.p071b.p072k.p073m.C4919b.C4920a.f8667k
            p050l.p067f.p071b.p072k.C4910f.m8523a(r2, r14, r4, r5)
        L_0x0260:
            l.f.b.k.e$b r4 = r2.mo17271z()
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x026a
            if (r3 == 0) goto L_0x023c
        L_0x026a:
            boolean r3 = r2.mo17189L()
            if (r3 == 0) goto L_0x0271
            goto L_0x023c
        L_0x0271:
            l.f.b.k.d r3 = r2.f8568J
            if (r1 != r3) goto L_0x023c
            r2.mo17241i(r0)
            m8628a((p050l.p067f.p071b.p072k.C4907e) r2, (p050l.p067f.p071b.p072k.p073m.C4919b.C4921b) r14)     // Catch:{ all -> 0x027d }
            goto L_0x023c
        L_0x027c:
            return
        L_0x027d:
            r13 = move-exception
            goto L_0x0280
        L_0x027f:
            throw r13
        L_0x0280:
            goto L_0x027f
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.p073m.C4928h.m8628a(l.f.b.k.e, l.f.b.k.m.b$b):void");
    }

    /* renamed from: a */
    private static void m8634a(C4919b.C4921b bVar, C4907e eVar, boolean z) {
        float l = eVar.mo17246l();
        int b = eVar.f8564F.f8543f.mo17164b();
        int b2 = eVar.f8566H.f8543f.mo17164b();
        int c = eVar.f8564F.mo17165c() + b;
        int c2 = b2 - eVar.f8566H.mo17165c();
        if (b == b2) {
            l = 0.5f;
        } else {
            b = c;
            b2 = c2;
        }
        int C = eVar.mo17180C();
        int i = (b2 - b) - C;
        if (b > b2) {
            i = (b - b2) - C;
        }
        int i2 = ((int) ((l * ((float) i)) + 0.5f)) + b;
        int i3 = i2 + C;
        if (b > b2) {
            i3 = i2 - C;
        }
        eVar.mo17196a(i2, i3);
        m8631a(eVar, bVar, z);
    }

    /* renamed from: a */
    private static void m8633a(C4919b.C4921b bVar, C4907e eVar) {
        float x = eVar.mo17269x();
        int b = eVar.f8565G.f8543f.mo17164b();
        int b2 = eVar.f8567I.f8543f.mo17164b();
        int c = eVar.f8565G.mo17165c() + b;
        int c2 = b2 - eVar.f8567I.mo17165c();
        if (b == b2) {
            x = 0.5f;
        } else {
            b = c;
            b2 = c2;
        }
        int k = eVar.mo17244k();
        int i = (b2 - b) - k;
        if (b > b2) {
            i = (b - b2) - k;
        }
        int i2 = (int) ((x * ((float) i)) + 0.5f);
        int i3 = b + i2;
        int i4 = i3 + k;
        if (b > b2) {
            i3 = b - i2;
            i4 = i3 - k;
        }
        eVar.mo17213b(i3, i4);
        m8628a(eVar, bVar);
    }

    /* renamed from: a */
    private static void m8630a(C4907e eVar, C4919b.C4921b bVar, C4907e eVar2, boolean z) {
        int i;
        float l = eVar2.mo17246l();
        int b = eVar2.f8564F.f8543f.mo17164b() + eVar2.f8564F.mo17165c();
        int b2 = eVar2.f8566H.f8543f.mo17164b() - eVar2.f8566H.mo17165c();
        if (b2 >= b) {
            int C = eVar2.mo17180C();
            if (eVar2.mo17179B() != 8) {
                int i2 = eVar2.f8611n;
                if (i2 == 2) {
                    if (eVar instanceof C4910f) {
                        i = eVar.mo17180C();
                    } else {
                        i = eVar.mo17266v().mo17180C();
                    }
                    C = (int) (eVar2.mo17246l() * 0.5f * ((float) i));
                } else if (i2 == 0) {
                    C = b2 - b;
                }
                C = Math.max(eVar2.f8615q, C);
                int i3 = eVar2.f8616r;
                if (i3 > 0) {
                    C = Math.min(i3, C);
                }
            }
            int i4 = b + ((int) ((l * ((float) ((b2 - b) - C))) + 0.5f));
            eVar2.mo17196a(i4, C + i4);
            m8631a(eVar2, bVar, z);
        }
    }

    /* renamed from: a */
    private static void m8629a(C4907e eVar, C4919b.C4921b bVar, C4907e eVar2) {
        int i;
        float x = eVar2.mo17269x();
        int b = eVar2.f8565G.f8543f.mo17164b() + eVar2.f8565G.mo17165c();
        int b2 = eVar2.f8567I.f8543f.mo17164b() - eVar2.f8567I.mo17165c();
        if (b2 >= b) {
            int k = eVar2.mo17244k();
            if (eVar2.mo17179B() != 8) {
                int i2 = eVar2.f8613o;
                if (i2 == 2) {
                    if (eVar instanceof C4910f) {
                        i = eVar.mo17244k();
                    } else {
                        i = eVar.mo17266v().mo17244k();
                    }
                    k = (int) (x * 0.5f * ((float) i));
                } else if (i2 == 0) {
                    k = b2 - b;
                }
                k = Math.max(eVar2.f8618t, k);
                int i3 = eVar2.f8619u;
                if (i3 > 0) {
                    k = Math.min(i3, k);
                }
            }
            int i4 = b + ((int) ((x * ((float) ((b2 - b) - k))) + 0.5f));
            eVar2.mo17213b(i4, k + i4);
            m8628a(eVar2, bVar);
        }
    }

    /* renamed from: a */
    private static boolean m8635a(C4907e eVar) {
        C4907e.C4909b n = eVar.mo17250n();
        C4907e.C4909b z = eVar.mo17271z();
        C4910f fVar = eVar.mo17266v() != null ? (C4910f) eVar.mo17266v() : null;
        if (fVar != null) {
            C4907e.C4909b n2 = fVar.mo17250n();
            C4907e.C4909b bVar = C4907e.C4909b.FIXED;
        }
        if (fVar != null) {
            C4907e.C4909b z2 = fVar.mo17271z();
            C4907e.C4909b bVar2 = C4907e.C4909b.FIXED;
        }
        boolean z3 = n == C4907e.C4909b.FIXED || n == C4907e.C4909b.WRAP_CONTENT || (n == C4907e.C4909b.MATCH_CONSTRAINT && eVar.f8611n == 0 && eVar.f8579U == 0.0f && eVar.mo17237g(0)) || eVar.mo17143M();
        boolean z4 = z == C4907e.C4909b.FIXED || z == C4907e.C4909b.WRAP_CONTENT || (z == C4907e.C4909b.MATCH_CONSTRAINT && eVar.f8613o == 0 && eVar.f8579U == 0.0f && eVar.mo17237g(1)) || eVar.mo17144N();
        if (eVar.f8579U > 0.0f && (z3 || z4)) {
            return true;
        }
        if (!z3 || !z4) {
            return false;
        }
        return true;
    }
}
