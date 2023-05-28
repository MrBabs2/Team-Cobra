package p050l.p067f.p071b.p072k.p073m;

import java.util.ArrayList;
import p050l.p067f.p071b.p072k.C4904d;
import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.C4911g;
import p050l.p067f.p071b.p072k.C4914i;

/* renamed from: l.f.b.k.m.i */
/* compiled from: Grouping */
public class C4929i {
    /* renamed from: a */
    public static boolean m8638a(C4907e.C4909b bVar, C4907e.C4909b bVar2, C4907e.C4909b bVar3, C4907e.C4909b bVar4) {
        return (bVar3 == C4907e.C4909b.FIXED || bVar3 == C4907e.C4909b.WRAP_CONTENT || (bVar3 == C4907e.C4909b.MATCH_PARENT && bVar != C4907e.C4909b.WRAP_CONTENT)) || (bVar4 == C4907e.C4909b.FIXED || bVar4 == C4907e.C4909b.WRAP_CONTENT || (bVar4 == C4907e.C4909b.MATCH_PARENT && bVar2 != C4907e.C4909b.WRAP_CONTENT));
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x038a A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m8639a(p050l.p067f.p071b.p072k.C4910f r16, p050l.p067f.p071b.p072k.p073m.C4919b.C4921b r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = r16.mo17145R()
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x000c:
            if (r4 >= r2) goto L_0x002e
            java.lang.Object r5 = r1.get(r4)
            l.f.b.k.e r5 = (p050l.p067f.p071b.p072k.C4907e) r5
            l.f.b.k.e$b r6 = r16.mo17250n()
            l.f.b.k.e$b r7 = r16.mo17271z()
            l.f.b.k.e$b r8 = r5.mo17250n()
            l.f.b.k.e$b r5 = r5.mo17271z()
            boolean r5 = m8638a((p050l.p067f.p071b.p072k.C4907e.C4909b) r6, (p050l.p067f.p071b.p072k.C4907e.C4909b) r7, (p050l.p067f.p071b.p072k.C4907e.C4909b) r8, (p050l.p067f.p071b.p072k.C4907e.C4909b) r5)
            if (r5 != 0) goto L_0x002b
            return r3
        L_0x002b:
            int r4 = r4 + 1
            goto L_0x000c
        L_0x002e:
            l.f.b.e r4 = r0.f8646u0
            if (r4 == 0) goto L_0x0039
            long r5 = r4.f8442A
            r7 = 1
            long r5 = r5 + r7
            r4.f8442A = r5
        L_0x0039:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0040:
            r12 = 1
            if (r5 >= r2) goto L_0x0119
            java.lang.Object r13 = r1.get(r5)
            l.f.b.k.e r13 = (p050l.p067f.p071b.p072k.C4907e) r13
            l.f.b.k.e$b r14 = r16.mo17250n()
            l.f.b.k.e$b r15 = r16.mo17271z()
            l.f.b.k.e$b r3 = r13.mo17250n()
            l.f.b.k.e$b r4 = r13.mo17271z()
            boolean r3 = m8638a((p050l.p067f.p071b.p072k.C4907e.C4909b) r14, (p050l.p067f.p071b.p072k.C4907e.C4909b) r15, (p050l.p067f.p071b.p072k.C4907e.C4909b) r3, (p050l.p067f.p071b.p072k.C4907e.C4909b) r4)
            if (r3 != 0) goto L_0x0069
            l.f.b.k.m.b$a r3 = r0.f8641J0
            int r4 = p050l.p067f.p071b.p072k.p073m.C4919b.C4920a.f8667k
            r14 = r17
            p050l.p067f.p071b.p072k.C4910f.m8523a(r13, r14, r3, r4)
            goto L_0x006b
        L_0x0069:
            r14 = r17
        L_0x006b:
            boolean r3 = r13 instanceof p050l.p067f.p071b.p072k.C4911g
            if (r3 == 0) goto L_0x0092
            r4 = r13
            l.f.b.k.g r4 = (p050l.p067f.p071b.p072k.C4911g) r4
            int r15 = r4.mo17297S()
            if (r15 != 0) goto L_0x0082
            if (r8 != 0) goto L_0x007f
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x007f:
            r8.add(r4)
        L_0x0082:
            int r15 = r4.mo17297S()
            if (r15 != r12) goto L_0x0092
            if (r6 != 0) goto L_0x008f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x008f:
            r6.add(r4)
        L_0x0092:
            boolean r4 = r13 instanceof p050l.p067f.p071b.p072k.C4914i
            if (r4 == 0) goto L_0x00d5
            boolean r4 = r13 instanceof p050l.p067f.p071b.p072k.C4901a
            if (r4 == 0) goto L_0x00be
            r4 = r13
            l.f.b.k.a r4 = (p050l.p067f.p071b.p072k.C4901a) r4
            int r15 = r4.mo17149V()
            if (r15 != 0) goto L_0x00ad
            if (r7 != 0) goto L_0x00aa
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00aa:
            r7.add(r4)
        L_0x00ad:
            int r15 = r4.mo17149V()
            if (r15 != r12) goto L_0x00d5
            if (r9 != 0) goto L_0x00ba
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00ba:
            r9.add(r4)
            goto L_0x00d5
        L_0x00be:
            r4 = r13
            l.f.b.k.i r4 = (p050l.p067f.p071b.p072k.C4914i) r4
            if (r7 != 0) goto L_0x00c8
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00c8:
            r7.add(r4)
            if (r9 != 0) goto L_0x00d2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00d2:
            r9.add(r4)
        L_0x00d5:
            l.f.b.k.d r4 = r13.f8564F
            l.f.b.k.d r4 = r4.f8543f
            if (r4 != 0) goto L_0x00f1
            l.f.b.k.d r4 = r13.f8566H
            l.f.b.k.d r4 = r4.f8543f
            if (r4 != 0) goto L_0x00f1
            if (r3 != 0) goto L_0x00f1
            boolean r4 = r13 instanceof p050l.p067f.p071b.p072k.C4901a
            if (r4 != 0) goto L_0x00f1
            if (r10 != 0) goto L_0x00ee
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x00ee:
            r10.add(r13)
        L_0x00f1:
            l.f.b.k.d r4 = r13.f8565G
            l.f.b.k.d r4 = r4.f8543f
            if (r4 != 0) goto L_0x0114
            l.f.b.k.d r4 = r13.f8567I
            l.f.b.k.d r4 = r4.f8543f
            if (r4 != 0) goto L_0x0114
            l.f.b.k.d r4 = r13.f8568J
            l.f.b.k.d r4 = r4.f8543f
            if (r4 != 0) goto L_0x0114
            if (r3 != 0) goto L_0x0114
            boolean r3 = r13 instanceof p050l.p067f.p071b.p072k.C4901a
            if (r3 != 0) goto L_0x0114
            if (r11 != 0) goto L_0x0111
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r11 = r3
        L_0x0111:
            r11.add(r13)
        L_0x0114:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x0040
        L_0x0119:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L_0x0136
            java.util.Iterator r4 = r6.iterator()
        L_0x0124:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0136
            java.lang.Object r5 = r4.next()
            l.f.b.k.g r5 = (p050l.p067f.p071b.p072k.C4911g) r5
            r6 = 0
            r13 = 0
            m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r6, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r13)
            goto L_0x0124
        L_0x0136:
            r6 = 0
            r13 = 0
            if (r7 == 0) goto L_0x0157
            java.util.Iterator r4 = r7.iterator()
        L_0x013e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0157
            java.lang.Object r5 = r4.next()
            l.f.b.k.i r5 = (p050l.p067f.p071b.p072k.C4914i) r5
            l.f.b.k.m.o r7 = m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r6, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r13)
            r5.mo17308a(r3, r6, r7)
            r7.mo17345a((java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3)
            r6 = 0
            r13 = 0
            goto L_0x013e
        L_0x0157:
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.LEFT
            l.f.b.k.d r4 = r0.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r4)
            java.util.HashSet r5 = r4.mo17158a()
            if (r5 == 0) goto L_0x017f
            java.util.HashSet r4 = r4.mo17158a()
            java.util.Iterator r4 = r4.iterator()
        L_0x016b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x017f
            java.lang.Object r5 = r4.next()
            l.f.b.k.d r5 = (p050l.p067f.p071b.p072k.C4904d) r5
            l.f.b.k.e r5 = r5.f8541d
            r6 = 0
            r7 = 0
            m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r6, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r7)
            goto L_0x016b
        L_0x017f:
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.RIGHT
            l.f.b.k.d r4 = r0.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r4)
            java.util.HashSet r5 = r4.mo17158a()
            if (r5 == 0) goto L_0x01a7
            java.util.HashSet r4 = r4.mo17158a()
            java.util.Iterator r4 = r4.iterator()
        L_0x0193:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a7
            java.lang.Object r5 = r4.next()
            l.f.b.k.d r5 = (p050l.p067f.p071b.p072k.C4904d) r5
            l.f.b.k.e r5 = r5.f8541d
            r6 = 0
            r7 = 0
            m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r6, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r7)
            goto L_0x0193
        L_0x01a7:
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.CENTER
            l.f.b.k.d r4 = r0.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r4)
            java.util.HashSet r5 = r4.mo17158a()
            if (r5 == 0) goto L_0x01cf
            java.util.HashSet r4 = r4.mo17158a()
            java.util.Iterator r4 = r4.iterator()
        L_0x01bb:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01cf
            java.lang.Object r5 = r4.next()
            l.f.b.k.d r5 = (p050l.p067f.p071b.p072k.C4904d) r5
            l.f.b.k.e r5 = r5.f8541d
            r6 = 0
            r7 = 0
            m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r6, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r7)
            goto L_0x01bb
        L_0x01cf:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L_0x01e7
            java.util.Iterator r4 = r10.iterator()
        L_0x01d7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e7
            java.lang.Object r5 = r4.next()
            l.f.b.k.e r5 = (p050l.p067f.p071b.p072k.C4907e) r5
            m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r6, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r7)
            goto L_0x01d7
        L_0x01e7:
            if (r8 == 0) goto L_0x01fd
            java.util.Iterator r4 = r8.iterator()
        L_0x01ed:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01fd
            java.lang.Object r5 = r4.next()
            l.f.b.k.g r5 = (p050l.p067f.p071b.p072k.C4911g) r5
            m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r12, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r7)
            goto L_0x01ed
        L_0x01fd:
            if (r9 == 0) goto L_0x021b
            java.util.Iterator r4 = r9.iterator()
        L_0x0203:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x021b
            java.lang.Object r5 = r4.next()
            l.f.b.k.i r5 = (p050l.p067f.p071b.p072k.C4914i) r5
            l.f.b.k.m.o r6 = m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r12, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r7)
            r5.mo17308a(r3, r12, r6)
            r6.mo17345a((java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3)
            r7 = 0
            goto L_0x0203
        L_0x021b:
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.TOP
            l.f.b.k.d r4 = r0.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r4)
            java.util.HashSet r5 = r4.mo17158a()
            if (r5 == 0) goto L_0x0242
            java.util.HashSet r4 = r4.mo17158a()
            java.util.Iterator r4 = r4.iterator()
        L_0x022f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0242
            java.lang.Object r5 = r4.next()
            l.f.b.k.d r5 = (p050l.p067f.p071b.p072k.C4904d) r5
            l.f.b.k.e r5 = r5.f8541d
            r6 = 0
            m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r12, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r6)
            goto L_0x022f
        L_0x0242:
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.BASELINE
            l.f.b.k.d r4 = r0.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r4)
            java.util.HashSet r5 = r4.mo17158a()
            if (r5 == 0) goto L_0x0269
            java.util.HashSet r4 = r4.mo17158a()
            java.util.Iterator r4 = r4.iterator()
        L_0x0256:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0269
            java.lang.Object r5 = r4.next()
            l.f.b.k.d r5 = (p050l.p067f.p071b.p072k.C4904d) r5
            l.f.b.k.e r5 = r5.f8541d
            r6 = 0
            m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r12, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r6)
            goto L_0x0256
        L_0x0269:
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.BOTTOM
            l.f.b.k.d r4 = r0.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r4)
            java.util.HashSet r5 = r4.mo17158a()
            if (r5 == 0) goto L_0x0290
            java.util.HashSet r4 = r4.mo17158a()
            java.util.Iterator r4 = r4.iterator()
        L_0x027d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0290
            java.lang.Object r5 = r4.next()
            l.f.b.k.d r5 = (p050l.p067f.p071b.p072k.C4904d) r5
            l.f.b.k.e r5 = r5.f8541d
            r6 = 0
            m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r12, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r6)
            goto L_0x027d
        L_0x0290:
            l.f.b.k.d$b r4 = p050l.p067f.p071b.p072k.C4904d.C4906b.CENTER
            l.f.b.k.d r4 = r0.mo17194a((p050l.p067f.p071b.p072k.C4904d.C4906b) r4)
            java.util.HashSet r5 = r4.mo17158a()
            if (r5 == 0) goto L_0x02b7
            java.util.HashSet r4 = r4.mo17158a()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02b7
            java.lang.Object r5 = r4.next()
            l.f.b.k.d r5 = (p050l.p067f.p071b.p072k.C4904d) r5
            l.f.b.k.e r5 = r5.f8541d
            r13 = 0
            m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r12, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r13)
            goto L_0x02a4
        L_0x02b7:
            r13 = 0
            if (r11 == 0) goto L_0x02ce
            java.util.Iterator r4 = r11.iterator()
        L_0x02be:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02ce
            java.lang.Object r5 = r4.next()
            l.f.b.k.e r5 = (p050l.p067f.p071b.p072k.C4907e) r5
            m8637a((p050l.p067f.p071b.p072k.C4907e) r5, (int) r12, (java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (p050l.p067f.p071b.p072k.p073m.C4937o) r13)
            goto L_0x02be
        L_0x02ce:
            r4 = 0
        L_0x02cf:
            if (r4 >= r2) goto L_0x02fb
            java.lang.Object r5 = r1.get(r4)
            l.f.b.k.e r5 = (p050l.p067f.p071b.p072k.C4907e) r5
            boolean r6 = r5.mo17190O()
            if (r6 == 0) goto L_0x02f8
            int r6 = r5.f8610m0
            l.f.b.k.m.o r6 = m8636a((java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (int) r6)
            int r5 = r5.f8612n0
            l.f.b.k.m.o r5 = m8636a((java.util.ArrayList<p050l.p067f.p071b.p072k.p073m.C4937o>) r3, (int) r5)
            if (r6 == 0) goto L_0x02f8
            if (r5 == 0) goto L_0x02f8
            r7 = 0
            r6.mo17344a((int) r7, (p050l.p067f.p071b.p072k.p073m.C4937o) r5)
            r7 = 2
            r5.mo17343a((int) r7)
            r3.remove(r6)
        L_0x02f8:
            int r4 = r4 + 1
            goto L_0x02cf
        L_0x02fb:
            int r1 = r3.size()
            if (r1 > r12) goto L_0x0303
            r1 = 0
            return r1
        L_0x0303:
            l.f.b.k.e$b r1 = r16.mo17250n()
            l.f.b.k.e$b r2 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r1 != r2) goto L_0x0343
            java.util.Iterator r1 = r3.iterator()
            r2 = r13
            r6 = 0
        L_0x0311:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0335
            java.lang.Object r4 = r1.next()
            l.f.b.k.m.o r4 = (p050l.p067f.p071b.p072k.p073m.C4937o) r4
            int r5 = r4.mo17348b()
            if (r5 != r12) goto L_0x0324
            goto L_0x0311
        L_0x0324:
            r5 = 0
            r4.mo17346a((boolean) r5)
            l.f.b.d r7 = r16.mo17275W()
            int r7 = r4.mo17342a((p050l.p067f.p071b.C4889d) r7, (int) r5)
            if (r7 <= r6) goto L_0x0311
            r2 = r4
            r6 = r7
            goto L_0x0311
        L_0x0335:
            if (r2 == 0) goto L_0x0343
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r0.mo17205a((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
            r0.mo17263t(r6)
            r2.mo17346a((boolean) r12)
            goto L_0x0344
        L_0x0343:
            r2 = r13
        L_0x0344:
            l.f.b.k.e$b r1 = r16.mo17271z()
            l.f.b.k.e$b r4 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r1 != r4) goto L_0x0386
            java.util.Iterator r1 = r3.iterator()
            r3 = r13
            r6 = 0
        L_0x0352:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0376
            java.lang.Object r4 = r1.next()
            l.f.b.k.m.o r4 = (p050l.p067f.p071b.p072k.p073m.C4937o) r4
            int r5 = r4.mo17348b()
            if (r5 != 0) goto L_0x0365
            goto L_0x0352
        L_0x0365:
            r5 = 0
            r4.mo17346a((boolean) r5)
            l.f.b.d r7 = r16.mo17275W()
            int r7 = r4.mo17342a((p050l.p067f.p071b.C4889d) r7, (int) r12)
            if (r7 <= r6) goto L_0x0352
            r3 = r4
            r6 = r7
            goto L_0x0352
        L_0x0376:
            r5 = 0
            if (r3 == 0) goto L_0x0387
            l.f.b.k.e$b r1 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r0.mo17217b((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
            r0.mo17247l(r6)
            r3.mo17346a((boolean) r12)
            r4 = r3
            goto L_0x0388
        L_0x0386:
            r5 = 0
        L_0x0387:
            r4 = r13
        L_0x0388:
            if (r2 != 0) goto L_0x038f
            if (r4 == 0) goto L_0x038d
            goto L_0x038f
        L_0x038d:
            r3 = 0
            goto L_0x0390
        L_0x038f:
            r3 = 1
        L_0x0390:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.p073m.C4929i.m8639a(l.f.b.k.f, l.f.b.k.m.b$b):boolean");
    }

    /* renamed from: a */
    private static C4937o m8636a(ArrayList<C4937o> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4937o oVar = arrayList.get(i2);
            if (i == oVar.f8724b) {
                return oVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C4937o m8637a(C4907e eVar, int i, ArrayList<C4937o> arrayList, C4937o oVar) {
        int i2;
        int w;
        if (i == 0) {
            i2 = eVar.f8610m0;
        } else {
            i2 = eVar.f8612n0;
        }
        int i3 = 0;
        if (i2 != -1 && (oVar == null || i2 != oVar.f8724b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                C4937o oVar2 = arrayList.get(i4);
                if (oVar2.mo17341a() == i2) {
                    if (oVar != null) {
                        oVar.mo17344a(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof C4914i) && (w = ((C4914i) eVar).mo17295w(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    C4937o oVar3 = arrayList.get(i5);
                    if (oVar3.mo17341a() == w) {
                        oVar = oVar3;
                        break;
                    }
                    i5++;
                }
            }
            if (oVar == null) {
                oVar = new C4937o(i);
            }
            arrayList.add(oVar);
        }
        if (oVar.mo17347a(eVar)) {
            if (eVar instanceof C4911g) {
                C4911g gVar = (C4911g) eVar;
                C4904d R = gVar.mo17145R();
                if (gVar.mo17297S() == 0) {
                    i3 = 1;
                }
                R.mo17160a(i3, arrayList, oVar);
            }
            if (i == 0) {
                eVar.f8610m0 = oVar.mo17341a();
                eVar.f8564F.mo17160a(i, arrayList, oVar);
                eVar.f8566H.mo17160a(i, arrayList, oVar);
            } else {
                eVar.f8612n0 = oVar.mo17341a();
                eVar.f8565G.mo17160a(i, arrayList, oVar);
                eVar.f8568J.mo17160a(i, arrayList, oVar);
                eVar.f8567I.mo17160a(i, arrayList, oVar);
            }
            eVar.f8571M.mo17160a(i, arrayList, oVar);
        }
        return oVar;
    }
}
