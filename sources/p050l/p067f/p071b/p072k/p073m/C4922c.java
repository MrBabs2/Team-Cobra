package p050l.p067f.p071b.p072k.p073m;

import java.util.ArrayList;
import java.util.Iterator;
import p050l.p067f.p071b.p072k.C4904d;
import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.C4910f;

/* renamed from: l.f.b.k.m.c */
/* compiled from: ChainRun */
public class C4922c extends C4939p {

    /* renamed from: k */
    ArrayList<C4939p> f8680k = new ArrayList<>();

    /* renamed from: l */
    private int f8681l;

    public C4922c(C4907e eVar, int i) {
        super(eVar);
        this.f8733f = i;
        m8598g();
    }

    /* renamed from: g */
    private void m8598g() {
        C4907e eVar;
        C4907e eVar2 = this.f8729b;
        C4907e e = eVar2.mo17231e(this.f8733f);
        while (true) {
            C4907e eVar3 = e;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            e = eVar2.mo17231e(this.f8733f);
        }
        this.f8729b = eVar;
        this.f8680k.add(eVar.mo17234f(this.f8733f));
        C4907e d = eVar.mo17225d(this.f8733f);
        while (d != null) {
            this.f8680k.add(d.mo17234f(this.f8733f));
            d = d.mo17225d(this.f8733f);
        }
        Iterator<C4939p> it = this.f8680k.iterator();
        while (it.hasNext()) {
            C4939p next = it.next();
            int i = this.f8733f;
            if (i == 0) {
                next.f8729b.f8587b = this;
            } else if (i == 1) {
                next.f8729b.f8589c = this;
            }
        }
        if ((this.f8733f == 0 && ((C4910f) this.f8729b.mo17266v()).mo17285a0()) && this.f8680k.size() > 1) {
            ArrayList<C4939p> arrayList = this.f8680k;
            this.f8729b = arrayList.get(arrayList.size() - 1).f8729b;
        }
        this.f8681l = this.f8733f == 0 ? this.f8729b.mo17248m() : this.f8729b.mo17270y();
    }

    /* renamed from: h */
    private C4907e m8599h() {
        for (int i = 0; i < this.f8680k.size(); i++) {
            C4939p pVar = this.f8680k.get(i);
            if (pVar.f8729b.mo17179B() != 8) {
                return pVar.f8729b;
            }
        }
        return null;
    }

    /* renamed from: i */
    private C4907e m8600i() {
        for (int size = this.f8680k.size() - 1; size >= 0; size--) {
            C4939p pVar = this.f8680k.get(size);
            if (pVar.f8729b.mo17179B() != 8) {
                return pVar.f8729b;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x019e, code lost:
        if (r7 != r9) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01c6, code lost:
        if (r7 != r9) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
        if (r2.f8732e.f8699j != false) goto L_0x00d1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17316a(p050l.p067f.p071b.p072k.p073m.C4923d r23) {
        /*
            r22 = this;
            r0 = r22
            l.f.b.k.m.f r1 = r0.f8735h
            boolean r1 = r1.f8699j
            if (r1 == 0) goto L_0x042a
            l.f.b.k.m.f r1 = r0.f8736i
            boolean r1 = r1.f8699j
            if (r1 != 0) goto L_0x0010
            goto L_0x042a
        L_0x0010:
            l.f.b.k.e r1 = r0.f8729b
            l.f.b.k.e r1 = r1.mo17266v()
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1 instanceof p050l.p067f.p071b.p072k.C4910f
            if (r3 == 0) goto L_0x0023
            l.f.b.k.f r1 = (p050l.p067f.p071b.p072k.C4910f) r1
            boolean r1 = r1.mo17285a0()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            l.f.b.k.m.f r3 = r0.f8736i
            int r3 = r3.f8696g
            l.f.b.k.m.f r4 = r0.f8735h
            int r4 = r4.f8696g
            int r3 = r3 - r4
            java.util.ArrayList<l.f.b.k.m.p> r4 = r0.f8680k
            int r4 = r4.size()
            r5 = 0
        L_0x0034:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004c
            java.util.ArrayList<l.f.b.k.m.p> r8 = r0.f8680k
            java.lang.Object r8 = r8.get(r5)
            l.f.b.k.m.p r8 = (p050l.p067f.p071b.p072k.p073m.C4939p) r8
            l.f.b.k.e r8 = r8.f8729b
            int r8 = r8.mo17179B()
            if (r8 != r7) goto L_0x004d
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004c:
            r5 = -1
        L_0x004d:
            int r8 = r4 + -1
            r9 = r8
        L_0x0050:
            if (r9 < 0) goto L_0x0066
            java.util.ArrayList<l.f.b.k.m.p> r10 = r0.f8680k
            java.lang.Object r10 = r10.get(r9)
            l.f.b.k.m.p r10 = (p050l.p067f.p071b.p072k.p073m.C4939p) r10
            l.f.b.k.e r10 = r10.f8729b
            int r10 = r10.mo17179B()
            if (r10 != r7) goto L_0x0065
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0065:
            r6 = r9
        L_0x0066:
            r9 = 0
        L_0x0067:
            r11 = 2
            r12 = 1
            if (r9 >= r11) goto L_0x0106
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0072:
            if (r13 >= r4) goto L_0x00f8
            java.util.ArrayList<l.f.b.k.m.p> r2 = r0.f8680k
            java.lang.Object r2 = r2.get(r13)
            l.f.b.k.m.p r2 = (p050l.p067f.p071b.p072k.p073m.C4939p) r2
            l.f.b.k.e r11 = r2.f8729b
            int r11 = r11.mo17179B()
            if (r11 != r7) goto L_0x0086
            goto L_0x00f1
        L_0x0086:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0091
            if (r13 < r5) goto L_0x0091
            l.f.b.k.m.f r11 = r2.f8735h
            int r11 = r11.f8695f
            int r14 = r14 + r11
        L_0x0091:
            l.f.b.k.m.g r11 = r2.f8732e
            int r11 = r11.f8696g
            l.f.b.k.e$b r7 = r2.f8731d
            l.f.b.k.e$b r10 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r7 == r10) goto L_0x009d
            r7 = 1
            goto L_0x009e
        L_0x009d:
            r7 = 0
        L_0x009e:
            if (r7 == 0) goto L_0x00be
            int r10 = r0.f8733f
            if (r10 != 0) goto L_0x00af
            l.f.b.k.e r10 = r2.f8729b
            l.f.b.k.m.l r10 = r10.f8591d
            l.f.b.k.m.g r10 = r10.f8732e
            boolean r10 = r10.f8699j
            if (r10 != 0) goto L_0x00af
            return
        L_0x00af:
            int r10 = r0.f8733f
            if (r10 != r12) goto L_0x00d2
            l.f.b.k.e r10 = r2.f8729b
            l.f.b.k.m.n r10 = r10.f8593e
            l.f.b.k.m.g r10 = r10.f8732e
            boolean r10 = r10.f8699j
            if (r10 != 0) goto L_0x00d2
            return
        L_0x00be:
            int r10 = r2.f8728a
            if (r10 != r12) goto L_0x00cb
            if (r9 != 0) goto L_0x00cb
            l.f.b.k.m.g r7 = r2.f8732e
            int r11 = r7.f8711m
            int r15 = r15 + 1
            goto L_0x00d1
        L_0x00cb:
            l.f.b.k.m.g r10 = r2.f8732e
            boolean r10 = r10.f8699j
            if (r10 == 0) goto L_0x00d2
        L_0x00d1:
            r7 = 1
        L_0x00d2:
            if (r7 != 0) goto L_0x00e6
            int r15 = r15 + 1
            l.f.b.k.e r7 = r2.f8729b
            float[] r7 = r7.f8604j0
            int r10 = r0.f8733f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00e7
            float r17 = r17 + r7
            goto L_0x00e7
        L_0x00e6:
            int r14 = r14 + r11
        L_0x00e7:
            if (r13 >= r8) goto L_0x00f1
            if (r13 >= r6) goto L_0x00f1
            l.f.b.k.m.f r2 = r2.f8736i
            int r2 = r2.f8695f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00f1:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0072
        L_0x00f8:
            if (r14 < r3) goto L_0x0103
            if (r15 != 0) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0067
        L_0x0103:
            r2 = r16
            goto L_0x010b
        L_0x0106:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x010b:
            l.f.b.k.m.f r7 = r0.f8735h
            int r7 = r7.f8696g
            if (r1 == 0) goto L_0x0115
            l.f.b.k.m.f r7 = r0.f8736i
            int r7 = r7.f8696g
        L_0x0115:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x012c
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x0125
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x012c
        L_0x0125:
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x012c:
            if (r15 <= 0) goto L_0x0231
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r13 = 0
            r16 = 0
        L_0x0139:
            if (r13 >= r4) goto L_0x01e6
            java.util.ArrayList<l.f.b.k.m.p> r12 = r0.f8680k
            java.lang.Object r12 = r12.get(r13)
            l.f.b.k.m.p r12 = (p050l.p067f.p071b.p072k.p073m.C4939p) r12
            l.f.b.k.e r9 = r12.f8729b
            int r9 = r9.mo17179B()
            r18 = r11
            r11 = 8
            if (r9 != r11) goto L_0x0151
            goto L_0x01d1
        L_0x0151:
            l.f.b.k.e$b r9 = r12.f8731d
            l.f.b.k.e$b r11 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r9 != r11) goto L_0x01d1
            l.f.b.k.m.g r9 = r12.f8732e
            boolean r9 = r9.f8699j
            if (r9 != 0) goto L_0x01d1
            r9 = 0
            int r11 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0173
            l.f.b.k.e r11 = r12.f8729b
            float[] r11 = r11.f8604j0
            int r9 = r0.f8733f
            r9 = r11[r9]
            float r9 = r9 * r10
            float r9 = r9 / r17
            r11 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 + r11
            int r9 = (int) r9
            goto L_0x0175
        L_0x0173:
            r9 = r18
        L_0x0175:
            int r11 = r0.f8733f
            if (r11 != 0) goto L_0x01a1
            l.f.b.k.e r11 = r12.f8729b
            r19 = r10
            int r10 = r11.f8616r
            int r11 = r11.f8615q
            r20 = r14
            int r14 = r12.f8728a
            r21 = r7
            r7 = 1
            if (r14 != r7) goto L_0x0193
            l.f.b.k.m.g r7 = r12.f8732e
            int r7 = r7.f8711m
            int r7 = java.lang.Math.min(r9, r7)
            goto L_0x0194
        L_0x0193:
            r7 = r9
        L_0x0194:
            int r7 = java.lang.Math.max(r11, r7)
            if (r10 <= 0) goto L_0x019e
            int r7 = java.lang.Math.min(r10, r7)
        L_0x019e:
            if (r7 == r9) goto L_0x01cb
            goto L_0x01c8
        L_0x01a1:
            r21 = r7
            r19 = r10
            r20 = r14
            l.f.b.k.e r7 = r12.f8729b
            int r10 = r7.f8619u
            int r7 = r7.f8618t
            int r11 = r12.f8728a
            r14 = 1
            if (r11 != r14) goto L_0x01bb
            l.f.b.k.m.g r11 = r12.f8732e
            int r11 = r11.f8711m
            int r11 = java.lang.Math.min(r9, r11)
            goto L_0x01bc
        L_0x01bb:
            r11 = r9
        L_0x01bc:
            int r7 = java.lang.Math.max(r7, r11)
            if (r10 <= 0) goto L_0x01c6
            int r7 = java.lang.Math.min(r10, r7)
        L_0x01c6:
            if (r7 == r9) goto L_0x01cb
        L_0x01c8:
            int r16 = r16 + 1
            r9 = r7
        L_0x01cb:
            l.f.b.k.m.g r7 = r12.f8732e
            r7.mo17332a(r9)
            goto L_0x01d7
        L_0x01d1:
            r21 = r7
            r19 = r10
            r20 = r14
        L_0x01d7:
            int r13 = r13 + 1
            r11 = r18
            r10 = r19
            r14 = r20
            r7 = r21
            r9 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            goto L_0x0139
        L_0x01e6:
            r21 = r7
            r20 = r14
            if (r16 <= 0) goto L_0x0222
            int r15 = r15 - r16
            r7 = 0
            r9 = 0
        L_0x01f0:
            if (r7 >= r4) goto L_0x0220
            java.util.ArrayList<l.f.b.k.m.p> r10 = r0.f8680k
            java.lang.Object r10 = r10.get(r7)
            l.f.b.k.m.p r10 = (p050l.p067f.p071b.p072k.p073m.C4939p) r10
            l.f.b.k.e r11 = r10.f8729b
            int r11 = r11.mo17179B()
            r12 = 8
            if (r11 != r12) goto L_0x0205
            goto L_0x021d
        L_0x0205:
            if (r7 <= 0) goto L_0x020e
            if (r7 < r5) goto L_0x020e
            l.f.b.k.m.f r11 = r10.f8735h
            int r11 = r11.f8695f
            int r9 = r9 + r11
        L_0x020e:
            l.f.b.k.m.g r11 = r10.f8732e
            int r11 = r11.f8696g
            int r9 = r9 + r11
            if (r7 >= r8) goto L_0x021d
            if (r7 >= r6) goto L_0x021d
            l.f.b.k.m.f r10 = r10.f8736i
            int r10 = r10.f8695f
            int r10 = -r10
            int r9 = r9 + r10
        L_0x021d:
            int r7 = r7 + 1
            goto L_0x01f0
        L_0x0220:
            r14 = r9
            goto L_0x0224
        L_0x0222:
            r14 = r20
        L_0x0224:
            int r7 = r0.f8681l
            r9 = 2
            if (r7 != r9) goto L_0x022f
            if (r16 != 0) goto L_0x022f
            r7 = 0
            r0.f8681l = r7
            goto L_0x0237
        L_0x022f:
            r7 = 0
            goto L_0x0237
        L_0x0231:
            r21 = r7
            r20 = r14
            r7 = 0
            r9 = 2
        L_0x0237:
            if (r14 <= r3) goto L_0x023b
            r0.f8681l = r9
        L_0x023b:
            if (r2 <= 0) goto L_0x0243
            if (r15 != 0) goto L_0x0243
            if (r5 != r6) goto L_0x0243
            r0.f8681l = r9
        L_0x0243:
            int r9 = r0.f8681l
            r10 = 1
            if (r9 != r10) goto L_0x02e4
            if (r2 <= r10) goto L_0x024e
            int r3 = r3 - r14
            int r2 = r2 - r10
            int r3 = r3 / r2
            goto L_0x0255
        L_0x024e:
            if (r2 != r10) goto L_0x0254
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L_0x0255
        L_0x0254:
            r3 = 0
        L_0x0255:
            if (r15 <= 0) goto L_0x0258
            r3 = 0
        L_0x0258:
            r7 = r21
            r2 = 0
        L_0x025b:
            if (r2 >= r4) goto L_0x042a
            if (r1 == 0) goto L_0x0264
            int r9 = r2 + 1
            int r9 = r4 - r9
            goto L_0x0265
        L_0x0264:
            r9 = r2
        L_0x0265:
            java.util.ArrayList<l.f.b.k.m.p> r10 = r0.f8680k
            java.lang.Object r9 = r10.get(r9)
            l.f.b.k.m.p r9 = (p050l.p067f.p071b.p072k.p073m.C4939p) r9
            l.f.b.k.e r10 = r9.f8729b
            int r10 = r10.mo17179B()
            r11 = 8
            if (r10 != r11) goto L_0x0282
            l.f.b.k.m.f r10 = r9.f8735h
            r10.mo17332a((int) r7)
            l.f.b.k.m.f r9 = r9.f8736i
            r9.mo17332a((int) r7)
            goto L_0x02e0
        L_0x0282:
            if (r2 <= 0) goto L_0x0289
            if (r1 == 0) goto L_0x0288
            int r7 = r7 - r3
            goto L_0x0289
        L_0x0288:
            int r7 = r7 + r3
        L_0x0289:
            if (r2 <= 0) goto L_0x029a
            if (r2 < r5) goto L_0x029a
            if (r1 == 0) goto L_0x0295
            l.f.b.k.m.f r10 = r9.f8735h
            int r10 = r10.f8695f
            int r7 = r7 - r10
            goto L_0x029a
        L_0x0295:
            l.f.b.k.m.f r10 = r9.f8735h
            int r10 = r10.f8695f
            int r7 = r7 + r10
        L_0x029a:
            if (r1 == 0) goto L_0x02a2
            l.f.b.k.m.f r10 = r9.f8736i
            r10.mo17332a((int) r7)
            goto L_0x02a7
        L_0x02a2:
            l.f.b.k.m.f r10 = r9.f8735h
            r10.mo17332a((int) r7)
        L_0x02a7:
            l.f.b.k.m.g r10 = r9.f8732e
            int r11 = r10.f8696g
            l.f.b.k.e$b r12 = r9.f8731d
            l.f.b.k.e$b r13 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x02b8
            int r12 = r9.f8728a
            r13 = 1
            if (r12 != r13) goto L_0x02b8
            int r11 = r10.f8711m
        L_0x02b8:
            if (r1 == 0) goto L_0x02bc
            int r7 = r7 - r11
            goto L_0x02bd
        L_0x02bc:
            int r7 = r7 + r11
        L_0x02bd:
            if (r1 == 0) goto L_0x02c5
            l.f.b.k.m.f r10 = r9.f8735h
            r10.mo17332a((int) r7)
            goto L_0x02ca
        L_0x02c5:
            l.f.b.k.m.f r10 = r9.f8736i
            r10.mo17332a((int) r7)
        L_0x02ca:
            r10 = 1
            r9.f8734g = r10
            if (r2 >= r8) goto L_0x02e0
            if (r2 >= r6) goto L_0x02e0
            if (r1 == 0) goto L_0x02da
            l.f.b.k.m.f r9 = r9.f8736i
            int r9 = r9.f8695f
            int r9 = -r9
            int r7 = r7 - r9
            goto L_0x02e0
        L_0x02da:
            l.f.b.k.m.f r9 = r9.f8736i
            int r9 = r9.f8695f
            int r9 = -r9
            int r7 = r7 + r9
        L_0x02e0:
            int r2 = r2 + 1
            goto L_0x025b
        L_0x02e4:
            if (r9 != 0) goto L_0x0378
            int r3 = r3 - r14
            r9 = 1
            int r2 = r2 + r9
            int r3 = r3 / r2
            if (r15 <= 0) goto L_0x02ed
            r3 = 0
        L_0x02ed:
            r7 = r21
            r2 = 0
        L_0x02f0:
            if (r2 >= r4) goto L_0x042a
            if (r1 == 0) goto L_0x02f9
            int r9 = r2 + 1
            int r9 = r4 - r9
            goto L_0x02fa
        L_0x02f9:
            r9 = r2
        L_0x02fa:
            java.util.ArrayList<l.f.b.k.m.p> r10 = r0.f8680k
            java.lang.Object r9 = r10.get(r9)
            l.f.b.k.m.p r9 = (p050l.p067f.p071b.p072k.p073m.C4939p) r9
            l.f.b.k.e r10 = r9.f8729b
            int r10 = r10.mo17179B()
            r11 = 8
            if (r10 != r11) goto L_0x0317
            l.f.b.k.m.f r10 = r9.f8735h
            r10.mo17332a((int) r7)
            l.f.b.k.m.f r9 = r9.f8736i
            r9.mo17332a((int) r7)
            goto L_0x0374
        L_0x0317:
            if (r1 == 0) goto L_0x031b
            int r7 = r7 - r3
            goto L_0x031c
        L_0x031b:
            int r7 = r7 + r3
        L_0x031c:
            if (r2 <= 0) goto L_0x032d
            if (r2 < r5) goto L_0x032d
            if (r1 == 0) goto L_0x0328
            l.f.b.k.m.f r10 = r9.f8735h
            int r10 = r10.f8695f
            int r7 = r7 - r10
            goto L_0x032d
        L_0x0328:
            l.f.b.k.m.f r10 = r9.f8735h
            int r10 = r10.f8695f
            int r7 = r7 + r10
        L_0x032d:
            if (r1 == 0) goto L_0x0335
            l.f.b.k.m.f r10 = r9.f8736i
            r10.mo17332a((int) r7)
            goto L_0x033a
        L_0x0335:
            l.f.b.k.m.f r10 = r9.f8735h
            r10.mo17332a((int) r7)
        L_0x033a:
            l.f.b.k.m.g r10 = r9.f8732e
            int r11 = r10.f8696g
            l.f.b.k.e$b r12 = r9.f8731d
            l.f.b.k.e$b r13 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x034f
            int r12 = r9.f8728a
            r13 = 1
            if (r12 != r13) goto L_0x034f
            int r10 = r10.f8711m
            int r11 = java.lang.Math.min(r11, r10)
        L_0x034f:
            if (r1 == 0) goto L_0x0353
            int r7 = r7 - r11
            goto L_0x0354
        L_0x0353:
            int r7 = r7 + r11
        L_0x0354:
            if (r1 == 0) goto L_0x035c
            l.f.b.k.m.f r10 = r9.f8735h
            r10.mo17332a((int) r7)
            goto L_0x0361
        L_0x035c:
            l.f.b.k.m.f r10 = r9.f8736i
            r10.mo17332a((int) r7)
        L_0x0361:
            if (r2 >= r8) goto L_0x0374
            if (r2 >= r6) goto L_0x0374
            if (r1 == 0) goto L_0x036e
            l.f.b.k.m.f r9 = r9.f8736i
            int r9 = r9.f8695f
            int r9 = -r9
            int r7 = r7 - r9
            goto L_0x0374
        L_0x036e:
            l.f.b.k.m.f r9 = r9.f8736i
            int r9 = r9.f8695f
            int r9 = -r9
            int r7 = r7 + r9
        L_0x0374:
            int r2 = r2 + 1
            goto L_0x02f0
        L_0x0378:
            r2 = 2
            if (r9 != r2) goto L_0x042a
            int r2 = r0.f8733f
            if (r2 != 0) goto L_0x0386
            l.f.b.k.e r2 = r0.f8729b
            float r2 = r2.mo17246l()
            goto L_0x038c
        L_0x0386:
            l.f.b.k.e r2 = r0.f8729b
            float r2 = r2.mo17269x()
        L_0x038c:
            if (r1 == 0) goto L_0x0392
            r9 = 1065353216(0x3f800000, float:1.0)
            float r2 = r9 - r2
        L_0x0392:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x039e
            if (r15 <= 0) goto L_0x039f
        L_0x039e:
            r2 = 0
        L_0x039f:
            if (r1 == 0) goto L_0x03a4
            int r2 = r21 - r2
            goto L_0x03a6
        L_0x03a4:
            int r2 = r21 + r2
        L_0x03a6:
            r3 = r2
            r2 = 0
        L_0x03a8:
            if (r2 >= r4) goto L_0x042a
            if (r1 == 0) goto L_0x03b1
            int r7 = r2 + 1
            int r7 = r4 - r7
            goto L_0x03b2
        L_0x03b1:
            r7 = r2
        L_0x03b2:
            java.util.ArrayList<l.f.b.k.m.p> r9 = r0.f8680k
            java.lang.Object r7 = r9.get(r7)
            l.f.b.k.m.p r7 = (p050l.p067f.p071b.p072k.p073m.C4939p) r7
            l.f.b.k.e r9 = r7.f8729b
            int r9 = r9.mo17179B()
            r10 = 8
            if (r9 != r10) goto L_0x03d0
            l.f.b.k.m.f r9 = r7.f8735h
            r9.mo17332a((int) r3)
            l.f.b.k.m.f r7 = r7.f8736i
            r7.mo17332a((int) r3)
            r13 = 1
            goto L_0x0426
        L_0x03d0:
            if (r2 <= 0) goto L_0x03e1
            if (r2 < r5) goto L_0x03e1
            if (r1 == 0) goto L_0x03dc
            l.f.b.k.m.f r9 = r7.f8735h
            int r9 = r9.f8695f
            int r3 = r3 - r9
            goto L_0x03e1
        L_0x03dc:
            l.f.b.k.m.f r9 = r7.f8735h
            int r9 = r9.f8695f
            int r3 = r3 + r9
        L_0x03e1:
            if (r1 == 0) goto L_0x03e9
            l.f.b.k.m.f r9 = r7.f8736i
            r9.mo17332a((int) r3)
            goto L_0x03ee
        L_0x03e9:
            l.f.b.k.m.f r9 = r7.f8735h
            r9.mo17332a((int) r3)
        L_0x03ee:
            l.f.b.k.m.g r9 = r7.f8732e
            int r11 = r9.f8696g
            l.f.b.k.e$b r12 = r7.f8731d
            l.f.b.k.e$b r13 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r12 != r13) goto L_0x0400
            int r12 = r7.f8728a
            r13 = 1
            if (r12 != r13) goto L_0x0401
            int r11 = r9.f8711m
            goto L_0x0401
        L_0x0400:
            r13 = 1
        L_0x0401:
            if (r1 == 0) goto L_0x0405
            int r3 = r3 - r11
            goto L_0x0406
        L_0x0405:
            int r3 = r3 + r11
        L_0x0406:
            if (r1 == 0) goto L_0x040e
            l.f.b.k.m.f r9 = r7.f8735h
            r9.mo17332a((int) r3)
            goto L_0x0413
        L_0x040e:
            l.f.b.k.m.f r9 = r7.f8736i
            r9.mo17332a((int) r3)
        L_0x0413:
            if (r2 >= r8) goto L_0x0426
            if (r2 >= r6) goto L_0x0426
            if (r1 == 0) goto L_0x0420
            l.f.b.k.m.f r7 = r7.f8736i
            int r7 = r7.f8695f
            int r7 = -r7
            int r3 = r3 - r7
            goto L_0x0426
        L_0x0420:
            l.f.b.k.m.f r7 = r7.f8736i
            int r7 = r7.f8695f
            int r7 = -r7
            int r3 = r3 + r7
        L_0x0426:
            int r2 = r2 + 1
            goto L_0x03a8
        L_0x042a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.p073m.C4922c.mo17316a(l.f.b.k.m.d):void");
    }

    /* renamed from: b */
    public void mo17317b() {
        for (int i = 0; i < this.f8680k.size(); i++) {
            this.f8680k.get(i).mo17317b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17318c() {
        this.f8730c = null;
        Iterator<C4939p> it = this.f8680k.iterator();
        while (it.hasNext()) {
            it.next().mo17318c();
        }
    }

    /* renamed from: d */
    public long mo17319d() {
        int size = this.f8680k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C4939p pVar = this.f8680k.get(i);
            j = j + ((long) pVar.f8735h.f8695f) + pVar.mo17319d() + ((long) pVar.f8736i.f8695f);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo17320f() {
        int size = this.f8680k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f8680k.get(i).mo17320f()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f8733f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator<C4939p> it = this.f8680k.iterator();
        while (it.hasNext()) {
            sb2 = ((sb2 + "<") + it.next()) + "> ";
        }
        return sb2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17315a() {
        Iterator<C4939p> it = this.f8680k.iterator();
        while (it.hasNext()) {
            it.next().mo17315a();
        }
        int size = this.f8680k.size();
        if (size >= 1) {
            C4907e eVar = this.f8680k.get(0).f8729b;
            C4907e eVar2 = this.f8680k.get(size - 1).f8729b;
            if (this.f8733f == 0) {
                C4904d dVar = eVar.f8564F;
                C4904d dVar2 = eVar2.f8566H;
                C4925f a = mo17352a(dVar, 0);
                int c = dVar.mo17165c();
                C4907e h = m8599h();
                if (h != null) {
                    c = h.f8564F.mo17165c();
                }
                if (a != null) {
                    mo17354a(this.f8735h, a, c);
                }
                C4925f a2 = mo17352a(dVar2, 0);
                int c2 = dVar2.mo17165c();
                C4907e i = m8600i();
                if (i != null) {
                    c2 = i.f8566H.mo17165c();
                }
                if (a2 != null) {
                    mo17354a(this.f8736i, a2, -c2);
                }
            } else {
                C4904d dVar3 = eVar.f8565G;
                C4904d dVar4 = eVar2.f8567I;
                C4925f a3 = mo17352a(dVar3, 1);
                int c3 = dVar3.mo17165c();
                C4907e h2 = m8599h();
                if (h2 != null) {
                    c3 = h2.f8565G.mo17165c();
                }
                if (a3 != null) {
                    mo17354a(this.f8735h, a3, c3);
                }
                C4925f a4 = mo17352a(dVar4, 1);
                int c4 = dVar4.mo17165c();
                C4907e i2 = m8600i();
                if (i2 != null) {
                    c4 = i2.f8567I.mo17165c();
                }
                if (a4 != null) {
                    mo17354a(this.f8736i, a4, -c4);
                }
            }
            this.f8735h.f8690a = this;
            this.f8736i.f8690a = this;
        }
    }
}
