package p050l.p067f.p071b.p072k.p073m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.C4910f;
import p050l.p067f.p071b.p072k.C4911g;
import p050l.p067f.p071b.p072k.C4914i;
import p050l.p067f.p071b.p072k.p073m.C4919b;

/* renamed from: l.f.b.k.m.e */
/* compiled from: DependencyGraph */
public class C4924e {

    /* renamed from: a */
    private C4910f f8682a;

    /* renamed from: b */
    private boolean f8683b = true;

    /* renamed from: c */
    private boolean f8684c = true;

    /* renamed from: d */
    private C4910f f8685d;

    /* renamed from: e */
    private ArrayList<C4939p> f8686e = new ArrayList<>();

    /* renamed from: f */
    private C4919b.C4921b f8687f;

    /* renamed from: g */
    private C4919b.C4920a f8688g;

    /* renamed from: h */
    ArrayList<C4934m> f8689h;

    public C4924e(C4910f fVar) {
        new ArrayList();
        this.f8687f = null;
        this.f8688g = new C4919b.C4920a();
        this.f8689h = new ArrayList<>();
        this.f8682a = fVar;
        this.f8685d = fVar;
    }

    /* renamed from: a */
    public void mo17324a(C4919b.C4921b bVar) {
        this.f8687f = bVar;
    }

    /* renamed from: b */
    public boolean mo17328b(boolean z) {
        if (this.f8683b) {
            Iterator<C4907e> it = this.f8682a.f8663p0.iterator();
            while (it.hasNext()) {
                C4907e next = it.next();
                next.mo17226d();
                next.f8585a = false;
                C4932l lVar = next.f8591d;
                lVar.f8732e.f8699j = false;
                lVar.f8734g = false;
                lVar.mo17335g();
                C4935n nVar = next.f8593e;
                nVar.f8732e.f8699j = false;
                nVar.f8734g = false;
                nVar.mo17339g();
            }
            this.f8682a.mo17226d();
            C4910f fVar = this.f8682a;
            fVar.f8585a = false;
            C4932l lVar2 = fVar.f8591d;
            lVar2.f8732e.f8699j = false;
            lVar2.f8734g = false;
            lVar2.mo17335g();
            C4935n nVar2 = this.f8682a.f8593e;
            nVar2.f8732e.f8699j = false;
            nVar2.f8734g = false;
            nVar2.mo17339g();
            mo17322a();
        }
        if (m8612a(this.f8685d)) {
            return false;
        }
        this.f8682a.mo17265u(0);
        this.f8682a.mo17267v(0);
        this.f8682a.f8591d.f8735h.mo17332a(0);
        this.f8682a.f8593e.f8735h.mo17332a(0);
        return true;
    }

    /* renamed from: c */
    public void mo17329c() {
        this.f8684c = true;
    }

    /* renamed from: d */
    public void mo17330d() {
        C4927g gVar;
        Iterator<C4907e> it = this.f8682a.f8663p0.iterator();
        while (it.hasNext()) {
            C4907e next = it.next();
            if (!next.f8585a) {
                C4907e.C4909b[] bVarArr = next.f8575Q;
                boolean z = false;
                C4907e.C4909b bVar = bVarArr[0];
                C4907e.C4909b bVar2 = bVarArr[1];
                int i = next.f8611n;
                int i2 = next.f8613o;
                boolean z2 = bVar == C4907e.C4909b.WRAP_CONTENT || (bVar == C4907e.C4909b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == C4907e.C4909b.WRAP_CONTENT || (bVar2 == C4907e.C4909b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C4927g gVar2 = next.f8591d.f8732e;
                boolean z3 = gVar2.f8699j;
                C4927g gVar3 = next.f8593e.f8732e;
                boolean z4 = gVar3.f8699j;
                if (z3 && z4) {
                    C4907e.C4909b bVar3 = C4907e.C4909b.FIXED;
                    m8609a(next, bVar3, gVar2.f8696g, bVar3, gVar3.f8696g);
                    next.f8585a = true;
                } else if (z3 && z) {
                    m8609a(next, C4907e.C4909b.FIXED, next.f8591d.f8732e.f8696g, C4907e.C4909b.WRAP_CONTENT, next.f8593e.f8732e.f8696g);
                    if (bVar2 == C4907e.C4909b.MATCH_CONSTRAINT) {
                        next.f8593e.f8732e.f8711m = next.mo17244k();
                    } else {
                        next.f8593e.f8732e.mo17332a(next.mo17244k());
                        next.f8585a = true;
                    }
                } else if (z4 && z2) {
                    m8609a(next, C4907e.C4909b.WRAP_CONTENT, next.f8591d.f8732e.f8696g, C4907e.C4909b.FIXED, next.f8593e.f8732e.f8696g);
                    if (bVar == C4907e.C4909b.MATCH_CONSTRAINT) {
                        next.f8591d.f8732e.f8711m = next.mo17180C();
                    } else {
                        next.f8591d.f8732e.mo17332a(next.mo17180C());
                        next.f8585a = true;
                    }
                }
                if (next.f8585a && (gVar = next.f8593e.f8720l) != null) {
                    gVar.mo17332a(next.mo17230e());
                }
            }
        }
    }

    /* renamed from: a */
    private int m8608a(C4910f fVar, int i) {
        int size = this.f8689h.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.f8689h.get(i2).mo17337a(fVar, i));
        }
        return (int) j;
    }

    /* renamed from: a */
    public boolean mo17325a(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f8683b || this.f8684c) {
            Iterator<C4907e> it = this.f8682a.f8663p0.iterator();
            while (it.hasNext()) {
                C4907e next = it.next();
                next.mo17226d();
                next.f8585a = false;
                next.f8591d.mo17335g();
                next.f8593e.mo17339g();
            }
            this.f8682a.mo17226d();
            C4910f fVar = this.f8682a;
            fVar.f8585a = false;
            fVar.f8591d.mo17335g();
            this.f8682a.f8593e.mo17339g();
            this.f8684c = false;
        }
        if (m8612a(this.f8685d)) {
            return false;
        }
        this.f8682a.mo17265u(0);
        this.f8682a.mo17267v(0);
        C4907e.C4909b b = this.f8682a.mo17211b(0);
        C4907e.C4909b b2 = this.f8682a.mo17211b(1);
        if (this.f8683b) {
            mo17322a();
        }
        int D = this.f8682a.mo17181D();
        int E = this.f8682a.mo17182E();
        this.f8682a.f8591d.f8735h.mo17332a(D);
        this.f8682a.f8593e.f8735h.mo17332a(E);
        mo17330d();
        C4907e.C4909b bVar = C4907e.C4909b.WRAP_CONTENT;
        if (b == bVar || b2 == bVar) {
            if (z4) {
                Iterator<C4939p> it2 = this.f8686e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!it2.next().mo17320f()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && b == C4907e.C4909b.WRAP_CONTENT) {
                this.f8682a.mo17205a(C4907e.C4909b.FIXED);
                C4910f fVar2 = this.f8682a;
                fVar2.mo17263t(m8608a(fVar2, 0));
                C4910f fVar3 = this.f8682a;
                fVar3.f8591d.f8732e.mo17332a(fVar3.mo17180C());
            }
            if (z4 && b2 == C4907e.C4909b.WRAP_CONTENT) {
                this.f8682a.mo17217b(C4907e.C4909b.FIXED);
                C4910f fVar4 = this.f8682a;
                fVar4.mo17247l(m8608a(fVar4, 1));
                C4910f fVar5 = this.f8682a;
                fVar5.f8593e.f8732e.mo17332a(fVar5.mo17244k());
            }
        }
        C4907e.C4909b[] bVarArr = this.f8682a.f8575Q;
        if (bVarArr[0] == C4907e.C4909b.FIXED || bVarArr[0] == C4907e.C4909b.MATCH_PARENT) {
            int C = this.f8682a.mo17180C() + D;
            this.f8682a.f8591d.f8736i.mo17332a(C);
            this.f8682a.f8591d.f8732e.mo17332a(C - D);
            mo17330d();
            C4907e.C4909b[] bVarArr2 = this.f8682a.f8575Q;
            if (bVarArr2[1] == C4907e.C4909b.FIXED || bVarArr2[1] == C4907e.C4909b.MATCH_PARENT) {
                int k = this.f8682a.mo17244k() + E;
                this.f8682a.f8593e.f8736i.mo17332a(k);
                this.f8682a.f8593e.f8732e.mo17332a(k - E);
            }
            mo17330d();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<C4939p> it3 = this.f8686e.iterator();
        while (it3.hasNext()) {
            C4939p next2 = it3.next();
            if (next2.f8729b != this.f8682a || next2.f8734g) {
                next2.mo17317b();
            }
        }
        Iterator<C4939p> it4 = this.f8686e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            C4939p next3 = it4.next();
            if ((z2 || next3.f8729b != this.f8682a) && (!next3.f8735h.f8699j || ((!next3.f8736i.f8699j && !(next3 instanceof C4930j)) || (!next3.f8732e.f8699j && !(next3 instanceof C4922c) && !(next3 instanceof C4930j))))) {
                z3 = false;
            }
        }
        z3 = false;
        this.f8682a.mo17205a(b);
        this.f8682a.mo17217b(b2);
        return z3;
    }

    /* renamed from: b */
    public void mo17327b() {
        this.f8683b = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0147 A[EDGE_INSN: B:77:0x0147->B:62:0x0147 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17326a(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            l.f.b.k.f r1 = r9.f8682a
            r2 = 0
            l.f.b.k.e$b r1 = r1.mo17211b((int) r2)
            l.f.b.k.f r3 = r9.f8682a
            l.f.b.k.e$b r3 = r3.mo17211b((int) r0)
            l.f.b.k.f r4 = r9.f8682a
            int r4 = r4.mo17181D()
            l.f.b.k.f r5 = r9.f8682a
            int r5 = r5.mo17182E()
            if (r10 == 0) goto L_0x0089
            l.f.b.k.e$b r6 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0089
        L_0x0023:
            java.util.ArrayList<l.f.b.k.m.p> r6 = r9.f8686e
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            l.f.b.k.m.p r7 = (p050l.p067f.p071b.p072k.p073m.C4939p) r7
            int r8 = r7.f8733f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo17320f()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0066
            if (r10 == 0) goto L_0x0089
            l.f.b.k.e$b r10 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0089
            l.f.b.k.f r10 = r9.f8682a
            l.f.b.k.e$b r6 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r10.mo17205a((p050l.p067f.p071b.p072k.C4907e.C4909b) r6)
            l.f.b.k.f r10 = r9.f8682a
            int r6 = r9.m8608a((p050l.p067f.p071b.p072k.C4910f) r10, (int) r2)
            r10.mo17263t(r6)
            l.f.b.k.f r10 = r9.f8682a
            l.f.b.k.m.l r6 = r10.f8591d
            l.f.b.k.m.g r6 = r6.f8732e
            int r10 = r10.mo17180C()
            r6.mo17332a(r10)
            goto L_0x0089
        L_0x0066:
            if (r10 == 0) goto L_0x0089
            l.f.b.k.e$b r10 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0089
            l.f.b.k.f r10 = r9.f8682a
            l.f.b.k.e$b r6 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r10.mo17217b((p050l.p067f.p071b.p072k.C4907e.C4909b) r6)
            l.f.b.k.f r10 = r9.f8682a
            int r6 = r9.m8608a((p050l.p067f.p071b.p072k.C4910f) r10, (int) r0)
            r10.mo17247l(r6)
            l.f.b.k.f r10 = r9.f8682a
            l.f.b.k.m.n r6 = r10.f8593e
            l.f.b.k.m.g r6 = r6.f8732e
            int r10 = r10.mo17244k()
            r6.mo17332a(r10)
        L_0x0089:
            if (r11 != 0) goto L_0x00b6
            l.f.b.k.f r10 = r9.f8682a
            l.f.b.k.e$b[] r10 = r10.f8575Q
            r5 = r10[r2]
            l.f.b.k.e$b r6 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            if (r5 == r6) goto L_0x009b
            r10 = r10[r2]
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_PARENT
            if (r10 != r5) goto L_0x00c7
        L_0x009b:
            l.f.b.k.f r10 = r9.f8682a
            int r10 = r10.mo17180C()
            int r10 = r10 + r4
            l.f.b.k.f r5 = r9.f8682a
            l.f.b.k.m.l r5 = r5.f8591d
            l.f.b.k.m.f r5 = r5.f8736i
            r5.mo17332a((int) r10)
            l.f.b.k.f r5 = r9.f8682a
            l.f.b.k.m.l r5 = r5.f8591d
            l.f.b.k.m.g r5 = r5.f8732e
            int r10 = r10 - r4
            r5.mo17332a(r10)
            goto L_0x00e3
        L_0x00b6:
            l.f.b.k.f r10 = r9.f8682a
            l.f.b.k.e$b[] r10 = r10.f8575Q
            r4 = r10[r0]
            l.f.b.k.e$b r6 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            if (r4 == r6) goto L_0x00c9
            r10 = r10[r0]
            l.f.b.k.e$b r4 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_PARENT
            if (r10 != r4) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r10 = 0
            goto L_0x00e4
        L_0x00c9:
            l.f.b.k.f r10 = r9.f8682a
            int r10 = r10.mo17244k()
            int r10 = r10 + r5
            l.f.b.k.f r4 = r9.f8682a
            l.f.b.k.m.n r4 = r4.f8593e
            l.f.b.k.m.f r4 = r4.f8736i
            r4.mo17332a((int) r10)
            l.f.b.k.f r4 = r9.f8682a
            l.f.b.k.m.n r4 = r4.f8593e
            l.f.b.k.m.g r4 = r4.f8732e
            int r10 = r10 - r5
            r4.mo17332a(r10)
        L_0x00e3:
            r10 = 1
        L_0x00e4:
            r9.mo17330d()
            java.util.ArrayList<l.f.b.k.m.p> r4 = r9.f8686e
            java.util.Iterator r4 = r4.iterator()
        L_0x00ed:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x010d
            java.lang.Object r5 = r4.next()
            l.f.b.k.m.p r5 = (p050l.p067f.p071b.p072k.p073m.C4939p) r5
            int r6 = r5.f8733f
            if (r6 == r11) goto L_0x00fe
            goto L_0x00ed
        L_0x00fe:
            l.f.b.k.e r6 = r5.f8729b
            l.f.b.k.f r7 = r9.f8682a
            if (r6 != r7) goto L_0x0109
            boolean r6 = r5.f8734g
            if (r6 != 0) goto L_0x0109
            goto L_0x00ed
        L_0x0109:
            r5.mo17317b()
            goto L_0x00ed
        L_0x010d:
            java.util.ArrayList<l.f.b.k.m.p> r4 = r9.f8686e
            java.util.Iterator r4 = r4.iterator()
        L_0x0113:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0147
            java.lang.Object r5 = r4.next()
            l.f.b.k.m.p r5 = (p050l.p067f.p071b.p072k.p073m.C4939p) r5
            int r6 = r5.f8733f
            if (r6 == r11) goto L_0x0124
            goto L_0x0113
        L_0x0124:
            if (r10 != 0) goto L_0x012d
            l.f.b.k.e r6 = r5.f8729b
            l.f.b.k.f r7 = r9.f8682a
            if (r6 != r7) goto L_0x012d
            goto L_0x0113
        L_0x012d:
            l.f.b.k.m.f r6 = r5.f8735h
            boolean r6 = r6.f8699j
            if (r6 != 0) goto L_0x0135
        L_0x0133:
            r0 = 0
            goto L_0x0147
        L_0x0135:
            l.f.b.k.m.f r6 = r5.f8736i
            boolean r6 = r6.f8699j
            if (r6 != 0) goto L_0x013c
            goto L_0x0133
        L_0x013c:
            boolean r6 = r5 instanceof p050l.p067f.p071b.p072k.p073m.C4922c
            if (r6 != 0) goto L_0x0113
            l.f.b.k.m.g r5 = r5.f8732e
            boolean r5 = r5.f8699j
            if (r5 != 0) goto L_0x0113
            goto L_0x0133
        L_0x0147:
            l.f.b.k.f r10 = r9.f8682a
            r10.mo17205a((p050l.p067f.p071b.p072k.C4907e.C4909b) r1)
            l.f.b.k.f r10 = r9.f8682a
            r10.mo17217b((p050l.p067f.p071b.p072k.C4907e.C4909b) r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.p073m.C4924e.mo17326a(boolean, int):boolean");
    }

    /* renamed from: a */
    private void m8609a(C4907e eVar, C4907e.C4909b bVar, int i, C4907e.C4909b bVar2, int i2) {
        C4919b.C4920a aVar = this.f8688g;
        aVar.f8670a = bVar;
        aVar.f8671b = bVar2;
        aVar.f8672c = i;
        aVar.f8673d = i2;
        this.f8687f.mo2017a(eVar, aVar);
        eVar.mo17263t(this.f8688g.f8674e);
        eVar.mo17247l(this.f8688g.f8675f);
        eVar.mo17208a(this.f8688g.f8677h);
        eVar.mo17239h(this.f8688g.f8676g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x029f, code lost:
        r2 = r14.f8575Q;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8612a(p050l.p067f.p071b.p072k.C4910f r14) {
        /*
            r13 = this;
            java.util.ArrayList<l.f.b.k.e> r0 = r14.f8663p0
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x035a
            java.lang.Object r1 = r0.next()
            l.f.b.k.e r1 = (p050l.p067f.p071b.p072k.C4907e) r1
            l.f.b.k.e$b[] r3 = r1.f8575Q
            r4 = r3[r2]
            r9 = 1
            r3 = r3[r9]
            int r5 = r1.mo17179B()
            r6 = 8
            if (r5 != r6) goto L_0x0025
            r1.f8585a = r9
            goto L_0x0006
        L_0x0025:
            float r5 = r1.f8617s
            r10 = 1065353216(0x3f800000, float:1.0)
            r6 = 2
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0034
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0034
            r1.f8611n = r6
        L_0x0034:
            float r5 = r1.f8620v
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L_0x0040
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r3 != r5) goto L_0x0040
            r1.f8613o = r6
        L_0x0040:
            float r5 = r1.mo17240i()
            r7 = 0
            r8 = 3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x007a
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0059
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r3 == r5) goto L_0x0056
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            if (r3 != r5) goto L_0x0059
        L_0x0056:
            r1.f8611n = r8
            goto L_0x007a
        L_0x0059:
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r3 != r5) goto L_0x0068
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r4 == r5) goto L_0x0065
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            if (r4 != r5) goto L_0x0068
        L_0x0065:
            r1.f8613o = r8
            goto L_0x007a
        L_0x0068:
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x007a
            if (r3 != r5) goto L_0x007a
            int r5 = r1.f8611n
            if (r5 != 0) goto L_0x0074
            r1.f8611n = r8
        L_0x0074:
            int r5 = r1.f8613o
            if (r5 != 0) goto L_0x007a
            r1.f8613o = r8
        L_0x007a:
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x0090
            int r5 = r1.f8611n
            if (r5 != r9) goto L_0x0090
            l.f.b.k.d r5 = r1.f8564F
            l.f.b.k.d r5 = r5.f8543f
            if (r5 == 0) goto L_0x008e
            l.f.b.k.d r5 = r1.f8566H
            l.f.b.k.d r5 = r5.f8543f
            if (r5 != 0) goto L_0x0090
        L_0x008e:
            l.f.b.k.e$b r4 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
        L_0x0090:
            r5 = r4
            l.f.b.k.e$b r4 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r3 != r4) goto L_0x00a7
            int r4 = r1.f8613o
            if (r4 != r9) goto L_0x00a7
            l.f.b.k.d r4 = r1.f8565G
            l.f.b.k.d r4 = r4.f8543f
            if (r4 == 0) goto L_0x00a5
            l.f.b.k.d r4 = r1.f8567I
            l.f.b.k.d r4 = r4.f8543f
            if (r4 != 0) goto L_0x00a7
        L_0x00a5:
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
        L_0x00a7:
            r7 = r3
            l.f.b.k.m.l r3 = r1.f8591d
            r3.f8731d = r5
            int r4 = r1.f8611n
            r3.f8728a = r4
            l.f.b.k.m.n r3 = r1.f8593e
            r3.f8731d = r7
            int r4 = r1.f8613o
            r3.f8728a = r4
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_PARENT
            if (r5 == r3) goto L_0x00c4
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            if (r5 == r3) goto L_0x00c4
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r5 != r3) goto L_0x00d2
        L_0x00c4:
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_PARENT
            if (r7 == r3) goto L_0x0303
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            if (r7 == r3) goto L_0x0303
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r7 != r3) goto L_0x00d2
            goto L_0x0303
        L_0x00d2:
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r5 != r3) goto L_0x01a6
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r7 == r3) goto L_0x00e0
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            if (r7 != r3) goto L_0x01a6
        L_0x00e0:
            int r3 = r1.f8611n
            if (r3 != r8) goto L_0x011e
            l.f.b.k.e$b r2 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r7 != r2) goto L_0x00f1
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r2
            r7 = r2
            r3.m8609a(r4, r5, r6, r7, r8)
        L_0x00f1:
            int r8 = r1.mo17244k()
            float r2 = (float) r8
            float r3 = r1.f8579U
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r6 = (int) r2
            l.f.b.k.e$b r7 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r3 = r13
            r4 = r1
            r5 = r7
            r3.m8609a(r4, r5, r6, r7, r8)
            l.f.b.k.m.l r2 = r1.f8591d
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17180C()
            r2.mo17332a(r3)
            l.f.b.k.m.n r2 = r1.f8593e
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17244k()
            r2.mo17332a(r3)
            r1.f8585a = r9
            goto L_0x0006
        L_0x011e:
            if (r3 != r9) goto L_0x0135
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r3.m8609a(r4, r5, r6, r7, r8)
            l.f.b.k.m.l r2 = r1.f8591d
            l.f.b.k.m.g r2 = r2.f8732e
            int r1 = r1.mo17180C()
            r2.f8711m = r1
            goto L_0x0006
        L_0x0135:
            if (r3 != r6) goto L_0x0175
            l.f.b.k.e$b[] r3 = r14.f8575Q
            r4 = r3[r2]
            l.f.b.k.e$b r12 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            if (r4 == r12) goto L_0x0145
            r3 = r3[r2]
            l.f.b.k.e$b r4 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_PARENT
            if (r3 != r4) goto L_0x01a6
        L_0x0145:
            float r2 = r1.f8617s
            int r3 = r14.mo17180C()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r6 = (int) r2
            int r8 = r1.mo17244k()
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r3 = r13
            r4 = r1
            r3.m8609a(r4, r5, r6, r7, r8)
            l.f.b.k.m.l r2 = r1.f8591d
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17180C()
            r2.mo17332a(r3)
            l.f.b.k.m.n r2 = r1.f8593e
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17244k()
            r2.mo17332a(r3)
            r1.f8585a = r9
            goto L_0x0006
        L_0x0175:
            l.f.b.k.d[] r3 = r1.f8572N
            r4 = r3[r2]
            l.f.b.k.d r4 = r4.f8543f
            if (r4 == 0) goto L_0x0183
            r3 = r3[r9]
            l.f.b.k.d r3 = r3.f8543f
            if (r3 != 0) goto L_0x01a6
        L_0x0183:
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r3.m8609a(r4, r5, r6, r7, r8)
            l.f.b.k.m.l r2 = r1.f8591d
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17180C()
            r2.mo17332a(r3)
            l.f.b.k.m.n r2 = r1.f8593e
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17244k()
            r2.mo17332a(r3)
            r1.f8585a = r9
            goto L_0x0006
        L_0x01a6:
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r7 != r3) goto L_0x0280
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r5 == r3) goto L_0x01b2
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            if (r5 != r3) goto L_0x0280
        L_0x01b2:
            int r3 = r1.f8613o
            if (r3 != r8) goto L_0x01f8
            l.f.b.k.e$b r7 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            if (r5 != r7) goto L_0x01c2
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r7
            r3.m8609a(r4, r5, r6, r7, r8)
        L_0x01c2:
            int r6 = r1.mo17180C()
            float r2 = r1.f8579U
            int r3 = r1.mo17242j()
            r4 = -1
            if (r3 != r4) goto L_0x01d1
            float r2 = r10 / r2
        L_0x01d1:
            float r3 = (float) r6
            float r3 = r3 * r2
            float r3 = r3 + r11
            int r8 = (int) r3
            l.f.b.k.e$b r7 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r3 = r13
            r4 = r1
            r5 = r7
            r3.m8609a(r4, r5, r6, r7, r8)
            l.f.b.k.m.l r2 = r1.f8591d
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17180C()
            r2.mo17332a(r3)
            l.f.b.k.m.n r2 = r1.f8593e
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17244k()
            r2.mo17332a(r3)
            r1.f8585a = r9
            goto L_0x0006
        L_0x01f8:
            if (r3 != r9) goto L_0x020f
            r6 = 0
            l.f.b.k.e$b r7 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            r8 = 0
            r3 = r13
            r4 = r1
            r3.m8609a(r4, r5, r6, r7, r8)
            l.f.b.k.m.n r2 = r1.f8593e
            l.f.b.k.m.g r2 = r2.f8732e
            int r1 = r1.mo17244k()
            r2.f8711m = r1
            goto L_0x0006
        L_0x020f:
            if (r3 != r6) goto L_0x024f
            l.f.b.k.e$b[] r3 = r14.f8575Q
            r4 = r3[r9]
            l.f.b.k.e$b r8 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            if (r4 == r8) goto L_0x021f
            r3 = r3[r9]
            l.f.b.k.e$b r4 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_PARENT
            if (r3 != r4) goto L_0x0280
        L_0x021f:
            float r2 = r1.f8620v
            int r6 = r1.mo17180C()
            int r3 = r14.mo17244k()
            float r3 = (float) r3
            float r2 = r2 * r3
            float r2 = r2 + r11
            int r8 = (int) r2
            l.f.b.k.e$b r7 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r3 = r13
            r4 = r1
            r3.m8609a(r4, r5, r6, r7, r8)
            l.f.b.k.m.l r2 = r1.f8591d
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17180C()
            r2.mo17332a(r3)
            l.f.b.k.m.n r2 = r1.f8593e
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17244k()
            r2.mo17332a(r3)
            r1.f8585a = r9
            goto L_0x0006
        L_0x024f:
            l.f.b.k.d[] r3 = r1.f8572N
            r4 = r3[r6]
            l.f.b.k.d r4 = r4.f8543f
            if (r4 == 0) goto L_0x025d
            r3 = r3[r8]
            l.f.b.k.d r3 = r3.f8543f
            if (r3 != 0) goto L_0x0280
        L_0x025d:
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r3.m8609a(r4, r5, r6, r7, r8)
            l.f.b.k.m.l r2 = r1.f8591d
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17180C()
            r2.mo17332a(r3)
            l.f.b.k.m.n r2 = r1.f8593e
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17244k()
            r2.mo17332a(r3)
            r1.f8585a = r9
            goto L_0x0006
        L_0x0280:
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_CONSTRAINT
            if (r5 != r3) goto L_0x0006
            if (r7 != r3) goto L_0x0006
            int r3 = r1.f8611n
            if (r3 == r9) goto L_0x02e3
            int r4 = r1.f8613o
            if (r4 != r9) goto L_0x028f
            goto L_0x02e3
        L_0x028f:
            if (r4 != r6) goto L_0x0006
            if (r3 != r6) goto L_0x0006
            l.f.b.k.e$b[] r3 = r14.f8575Q
            r4 = r3[r2]
            l.f.b.k.e$b r5 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            if (r4 == r5) goto L_0x029f
            r2 = r3[r2]
            if (r2 != r5) goto L_0x0006
        L_0x029f:
            l.f.b.k.e$b[] r2 = r14.f8575Q
            r3 = r2[r9]
            l.f.b.k.e$b r4 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            if (r3 == r4) goto L_0x02ab
            r2 = r2[r9]
            if (r2 != r4) goto L_0x0006
        L_0x02ab:
            float r2 = r1.f8617s
            float r3 = r1.f8620v
            int r4 = r14.mo17180C()
            float r4 = (float) r4
            float r2 = r2 * r4
            float r2 = r2 + r11
            int r6 = (int) r2
            int r2 = r14.mo17244k()
            float r2 = (float) r2
            float r3 = r3 * r2
            float r3 = r3 + r11
            int r8 = (int) r3
            l.f.b.k.e$b r7 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r3 = r13
            r4 = r1
            r5 = r7
            r3.m8609a(r4, r5, r6, r7, r8)
            l.f.b.k.m.l r2 = r1.f8591d
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17180C()
            r2.mo17332a(r3)
            l.f.b.k.m.n r2 = r1.f8593e
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17244k()
            r2.mo17332a(r3)
            r1.f8585a = r9
            goto L_0x0006
        L_0x02e3:
            l.f.b.k.e$b r7 = p050l.p067f.p071b.p072k.C4907e.C4909b.WRAP_CONTENT
            r6 = 0
            r8 = 0
            r3 = r13
            r4 = r1
            r5 = r7
            r3.m8609a(r4, r5, r6, r7, r8)
            l.f.b.k.m.l r2 = r1.f8591d
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17180C()
            r2.f8711m = r3
            l.f.b.k.m.n r2 = r1.f8593e
            l.f.b.k.m.g r2 = r2.f8732e
            int r1 = r1.mo17244k()
            r2.f8711m = r1
            goto L_0x0006
        L_0x0303:
            int r2 = r1.mo17180C()
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_PARENT
            if (r5 != r3) goto L_0x031e
            int r2 = r14.mo17180C()
            l.f.b.k.d r3 = r1.f8564F
            int r3 = r3.f8544g
            int r2 = r2 - r3
            l.f.b.k.d r3 = r1.f8566H
            int r3 = r3.f8544g
            int r2 = r2 - r3
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r6 = r2
            r5 = r3
            goto L_0x031f
        L_0x031e:
            r6 = r2
        L_0x031f:
            int r2 = r1.mo17244k()
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.MATCH_PARENT
            if (r7 != r3) goto L_0x033a
            int r2 = r14.mo17244k()
            l.f.b.k.d r3 = r1.f8565G
            int r3 = r3.f8544g
            int r2 = r2 - r3
            l.f.b.k.d r3 = r1.f8567I
            int r3 = r3.f8544g
            int r2 = r2 - r3
            l.f.b.k.e$b r3 = p050l.p067f.p071b.p072k.C4907e.C4909b.FIXED
            r8 = r2
            r7 = r3
            goto L_0x033b
        L_0x033a:
            r8 = r2
        L_0x033b:
            r3 = r13
            r4 = r1
            r3.m8609a(r4, r5, r6, r7, r8)
            l.f.b.k.m.l r2 = r1.f8591d
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17180C()
            r2.mo17332a(r3)
            l.f.b.k.m.n r2 = r1.f8593e
            l.f.b.k.m.g r2 = r2.f8732e
            int r3 = r1.mo17244k()
            r2.mo17332a(r3)
            r1.f8585a = r9
            goto L_0x0006
        L_0x035a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.p073m.C4924e.m8612a(l.f.b.k.f):boolean");
    }

    /* renamed from: a */
    public void mo17322a() {
        mo17323a(this.f8686e);
        this.f8689h.clear();
        C4934m.f8715d = 0;
        m8611a(this.f8682a.f8591d, 0, this.f8689h);
        m8611a(this.f8682a.f8593e, 1, this.f8689h);
        this.f8683b = false;
    }

    /* renamed from: a */
    public void mo17323a(ArrayList<C4939p> arrayList) {
        arrayList.clear();
        this.f8685d.f8591d.mo17318c();
        this.f8685d.f8593e.mo17318c();
        arrayList.add(this.f8685d.f8591d);
        arrayList.add(this.f8685d.f8593e);
        Iterator<C4907e> it = this.f8685d.f8663p0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C4907e next = it.next();
            if (next instanceof C4911g) {
                arrayList.add(new C4930j(next));
            } else {
                if (next.mo17185H()) {
                    if (next.f8587b == null) {
                        next.f8587b = new C4922c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f8587b);
                } else {
                    arrayList.add(next.f8591d);
                }
                if (next.mo17187J()) {
                    if (next.f8589c == null) {
                        next.f8589c = new C4922c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f8589c);
                } else {
                    arrayList.add(next.f8593e);
                }
                if (next instanceof C4914i) {
                    arrayList.add(new C4931k(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<C4939p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().mo17318c();
        }
        Iterator<C4939p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C4939p next2 = it3.next();
            if (next2.f8729b != this.f8685d) {
                next2.mo17315a();
            }
        }
    }

    /* renamed from: a */
    private void m8610a(C4925f fVar, int i, int i2, C4925f fVar2, ArrayList<C4934m> arrayList, C4934m mVar) {
        C4939p pVar = fVar.f8693d;
        if (pVar.f8730c == null) {
            C4910f fVar3 = this.f8682a;
            if (pVar != fVar3.f8591d && pVar != fVar3.f8593e) {
                if (mVar == null) {
                    mVar = new C4934m(pVar, i2);
                    arrayList.add(mVar);
                }
                pVar.f8730c = mVar;
                mVar.mo17338a(pVar);
                for (C4923d next : pVar.f8735h.f8700k) {
                    if (next instanceof C4925f) {
                        m8610a((C4925f) next, i, 0, fVar2, arrayList, mVar);
                    }
                }
                for (C4923d next2 : pVar.f8736i.f8700k) {
                    if (next2 instanceof C4925f) {
                        m8610a((C4925f) next2, i, 1, fVar2, arrayList, mVar);
                    }
                }
                if (i == 1 && (pVar instanceof C4935n)) {
                    for (C4923d next3 : ((C4935n) pVar).f8719k.f8700k) {
                        if (next3 instanceof C4925f) {
                            m8610a((C4925f) next3, i, 2, fVar2, arrayList, mVar);
                        }
                    }
                }
                for (C4925f next4 : pVar.f8735h.f8701l) {
                    if (next4 == fVar2) {
                        mVar.f8716a = true;
                    }
                    m8610a(next4, i, 0, fVar2, arrayList, mVar);
                }
                for (C4925f next5 : pVar.f8736i.f8701l) {
                    if (next5 == fVar2) {
                        mVar.f8716a = true;
                    }
                    m8610a(next5, i, 1, fVar2, arrayList, mVar);
                }
                if (i == 1 && (pVar instanceof C4935n)) {
                    for (C4925f a : ((C4935n) pVar).f8719k.f8701l) {
                        m8610a(a, i, 2, fVar2, arrayList, mVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m8611a(C4939p pVar, int i, ArrayList<C4934m> arrayList) {
        for (C4923d next : pVar.f8735h.f8700k) {
            if (next instanceof C4925f) {
                m8610a((C4925f) next, i, 0, pVar.f8736i, arrayList, (C4934m) null);
            } else if (next instanceof C4939p) {
                m8610a(((C4939p) next).f8735h, i, 0, pVar.f8736i, arrayList, (C4934m) null);
            }
        }
        for (C4923d next2 : pVar.f8736i.f8700k) {
            if (next2 instanceof C4925f) {
                m8610a((C4925f) next2, i, 1, pVar.f8735h, arrayList, (C4934m) null);
            } else if (next2 instanceof C4939p) {
                m8610a(((C4939p) next2).f8736i, i, 1, pVar.f8735h, arrayList, (C4934m) null);
            }
        }
        if (i == 1) {
            for (C4923d next3 : ((C4935n) pVar).f8719k.f8700k) {
                if (next3 instanceof C4925f) {
                    m8610a((C4925f) next3, i, 2, (C4925f) null, arrayList, (C4934m) null);
                }
            }
        }
    }
}
