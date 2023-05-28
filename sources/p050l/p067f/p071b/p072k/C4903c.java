package p050l.p067f.p071b.p072k;

import java.util.ArrayList;
import p050l.p067f.p071b.p072k.C4907e;

/* renamed from: l.f.b.k.c */
/* compiled from: ChainHead */
public class C4903c {

    /* renamed from: a */
    protected C4907e f8518a;

    /* renamed from: b */
    protected C4907e f8519b;

    /* renamed from: c */
    protected C4907e f8520c;

    /* renamed from: d */
    protected C4907e f8521d;

    /* renamed from: e */
    protected C4907e f8522e;

    /* renamed from: f */
    protected C4907e f8523f;

    /* renamed from: g */
    protected C4907e f8524g;

    /* renamed from: h */
    protected ArrayList<C4907e> f8525h;

    /* renamed from: i */
    protected int f8526i;

    /* renamed from: j */
    protected int f8527j;

    /* renamed from: k */
    protected float f8528k = 0.0f;

    /* renamed from: l */
    int f8529l;

    /* renamed from: m */
    int f8530m;

    /* renamed from: n */
    int f8531n;

    /* renamed from: o */
    private int f8532o;

    /* renamed from: p */
    private boolean f8533p = false;

    /* renamed from: q */
    protected boolean f8534q;

    /* renamed from: r */
    protected boolean f8535r;

    /* renamed from: s */
    protected boolean f8536s;

    /* renamed from: t */
    private boolean f8537t;

    public C4903c(C4907e eVar, int i, boolean z) {
        this.f8518a = eVar;
        this.f8532o = i;
        this.f8533p = z;
    }

    /* renamed from: a */
    private static boolean m8399a(C4907e eVar, int i) {
        if (eVar.mo17179B() != 8 && eVar.f8575Q[i] == C4907e.C4909b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.f8614p;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m8400b() {
        int i = this.f8532o * 2;
        C4907e eVar = this.f8518a;
        boolean z = false;
        C4907e eVar2 = eVar;
        boolean z2 = false;
        while (!z2) {
            this.f8526i++;
            C4907e[] eVarArr = eVar.f8608l0;
            int i2 = this.f8532o;
            C4907e eVar3 = null;
            eVarArr[i2] = null;
            eVar.f8606k0[i2] = null;
            if (eVar.mo17179B() != 8) {
                this.f8529l++;
                if (eVar.mo17211b(this.f8532o) != C4907e.C4909b.MATCH_CONSTRAINT) {
                    this.f8530m += eVar.mo17221c(this.f8532o);
                }
                int c = this.f8530m + eVar.f8572N[i].mo17165c();
                this.f8530m = c;
                int i3 = i + 1;
                this.f8530m = c + eVar.f8572N[i3].mo17165c();
                int c2 = this.f8531n + eVar.f8572N[i].mo17165c();
                this.f8531n = c2;
                this.f8531n = c2 + eVar.f8572N[i3].mo17165c();
                if (this.f8519b == null) {
                    this.f8519b = eVar;
                }
                this.f8521d = eVar;
                C4907e.C4909b[] bVarArr = eVar.f8575Q;
                int i4 = this.f8532o;
                if (bVarArr[i4] == C4907e.C4909b.MATCH_CONSTRAINT) {
                    int[] iArr = eVar.f8614p;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f8527j++;
                        float[] fArr = eVar.f8604j0;
                        int i5 = this.f8532o;
                        float f = fArr[i5];
                        if (f > 0.0f) {
                            this.f8528k += fArr[i5];
                        }
                        if (m8399a(eVar, this.f8532o)) {
                            if (f < 0.0f) {
                                this.f8534q = true;
                            } else {
                                this.f8535r = true;
                            }
                            if (this.f8525h == null) {
                                this.f8525h = new ArrayList<>();
                            }
                            this.f8525h.add(eVar);
                        }
                        if (this.f8523f == null) {
                            this.f8523f = eVar;
                        }
                        C4907e eVar4 = this.f8524g;
                        if (eVar4 != null) {
                            eVar4.f8606k0[this.f8532o] = eVar;
                        }
                        this.f8524g = eVar;
                    }
                    if (this.f8532o == 0) {
                        if (eVar.f8611n == 0 && eVar.f8615q == 0) {
                            int i6 = eVar.f8616r;
                        }
                    } else if (eVar.f8613o == 0 && eVar.f8618t == 0) {
                        int i7 = eVar.f8619u;
                    }
                    int i8 = (eVar.f8579U > 0.0f ? 1 : (eVar.f8579U == 0.0f ? 0 : -1));
                }
            }
            if (eVar2 != eVar) {
                eVar2.f8608l0[this.f8532o] = eVar;
            }
            C4904d dVar = eVar.f8572N[i + 1].f8543f;
            if (dVar != null) {
                C4907e eVar5 = dVar.f8541d;
                C4904d[] dVarArr = eVar5.f8572N;
                if (dVarArr[i].f8543f != null && dVarArr[i].f8543f.f8541d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z2 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        C4907e eVar6 = this.f8519b;
        if (eVar6 != null) {
            this.f8530m -= eVar6.f8572N[i].mo17165c();
        }
        C4907e eVar7 = this.f8521d;
        if (eVar7 != null) {
            this.f8530m -= eVar7.f8572N[i + 1].mo17165c();
        }
        this.f8520c = eVar;
        if (this.f8532o != 0 || !this.f8533p) {
            this.f8522e = this.f8518a;
        } else {
            this.f8522e = eVar;
        }
        if (this.f8535r && this.f8534q) {
            z = true;
        }
        this.f8536s = z;
    }

    /* renamed from: a */
    public void mo17157a() {
        if (!this.f8537t) {
            m8400b();
        }
        this.f8537t = true;
    }
}
