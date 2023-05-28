package p050l.p067f.p071b.p072k;

import p050l.p067f.p071b.C4889d;
import p050l.p067f.p071b.C4898i;
import p050l.p067f.p071b.p072k.C4904d;
import p050l.p067f.p071b.p072k.C4907e;

/* renamed from: l.f.b.k.g */
/* compiled from: Guideline */
public class C4911g extends C4907e {

    /* renamed from: p0 */
    protected float f8652p0 = -1.0f;

    /* renamed from: q0 */
    protected int f8653q0 = -1;

    /* renamed from: r0 */
    protected int f8654r0 = -1;

    /* renamed from: s0 */
    private C4904d f8655s0 = this.f8565G;

    /* renamed from: t0 */
    private int f8656t0;

    /* renamed from: u0 */
    private boolean f8657u0;

    /* renamed from: l.f.b.k.g$a */
    /* compiled from: Guideline */
    static /* synthetic */ class C4912a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8658a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                l.f.b.k.d$b[] r0 = p050l.p067f.p071b.p072k.C4904d.C4906b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8658a = r0
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8658a     // Catch:{ NoSuchFieldError -> 0x001d }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8658a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8658a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8658a     // Catch:{ NoSuchFieldError -> 0x003e }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8658a     // Catch:{ NoSuchFieldError -> 0x0049 }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f8658a     // Catch:{ NoSuchFieldError -> 0x0054 }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f8658a     // Catch:{ NoSuchFieldError -> 0x0060 }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f8658a     // Catch:{ NoSuchFieldError -> 0x006c }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.C4911g.C4912a.<clinit>():void");
        }
    }

    public C4911g() {
        this.f8656t0 = 0;
        this.f8573O.clear();
        this.f8573O.add(this.f8655s0);
        int length = this.f8572N.length;
        for (int i = 0; i < length; i++) {
            this.f8572N[i] = this.f8655s0;
        }
    }

    /* renamed from: M */
    public boolean mo17143M() {
        return this.f8657u0;
    }

    /* renamed from: N */
    public boolean mo17144N() {
        return this.f8657u0;
    }

    /* renamed from: R */
    public C4904d mo17145R() {
        return this.f8655s0;
    }

    /* renamed from: S */
    public int mo17297S() {
        return this.f8656t0;
    }

    /* renamed from: T */
    public int mo17298T() {
        return this.f8653q0;
    }

    /* renamed from: U */
    public int mo17299U() {
        return this.f8654r0;
    }

    /* renamed from: V */
    public float mo17300V() {
        return this.f8652p0;
    }

    /* renamed from: a */
    public C4904d mo17194a(C4904d.C4906b bVar) {
        switch (C4912a.f8658a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f8656t0 == 1) {
                    return this.f8655s0;
                }
                break;
            case 3:
            case 4:
                if (this.f8656t0 == 0) {
                    return this.f8655s0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }

    /* renamed from: b */
    public void mo17216b(C4889d dVar, boolean z) {
        if (mo17266v() != null) {
            int b = dVar.mo17113b((Object) this.f8655s0);
            if (this.f8656t0 == 1) {
                mo17265u(b);
                mo17267v(0);
                mo17247l(mo17266v().mo17244k());
                mo17263t(0);
                return;
            }
            mo17265u(0);
            mo17267v(b);
            mo17263t(mo17266v().mo17180C());
            mo17247l(0);
        }
    }

    /* renamed from: c */
    public boolean mo17152c() {
        return true;
    }

    /* renamed from: e */
    public void mo17301e(float f) {
        if (f > -1.0f) {
            this.f8652p0 = f;
            this.f8653q0 = -1;
            this.f8654r0 = -1;
        }
    }

    /* renamed from: w */
    public void mo17295w(int i) {
        this.f8655s0.mo17159a(i);
        this.f8657u0 = true;
    }

    /* renamed from: x */
    public void mo17302x(int i) {
        if (i > -1) {
            this.f8652p0 = -1.0f;
            this.f8653q0 = i;
            this.f8654r0 = -1;
        }
    }

    /* renamed from: y */
    public void mo17303y(int i) {
        if (i > -1) {
            this.f8652p0 = -1.0f;
            this.f8653q0 = -1;
            this.f8654r0 = i;
        }
    }

    /* renamed from: z */
    public void mo17304z(int i) {
        if (this.f8656t0 != i) {
            this.f8656t0 = i;
            this.f8573O.clear();
            if (this.f8656t0 == 1) {
                this.f8655s0 = this.f8564F;
            } else {
                this.f8655s0 = this.f8565G;
            }
            this.f8573O.add(this.f8655s0);
            int length = this.f8572N.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f8572N[i2] = this.f8655s0;
            }
        }
    }

    /* renamed from: a */
    public void mo17151a(C4889d dVar, boolean z) {
        C4910f fVar = (C4910f) mo17266v();
        if (fVar != null) {
            C4904d a = fVar.mo17194a(C4904d.C4906b.LEFT);
            C4904d a2 = fVar.mo17194a(C4904d.C4906b.RIGHT);
            C4907e eVar = this.f8576R;
            boolean z2 = true;
            boolean z3 = eVar != null && eVar.f8575Q[0] == C4907e.C4909b.WRAP_CONTENT;
            if (this.f8656t0 == 0) {
                a = fVar.mo17194a(C4904d.C4906b.TOP);
                a2 = fVar.mo17194a(C4904d.C4906b.BOTTOM);
                C4907e eVar2 = this.f8576R;
                if (eVar2 == null || eVar2.f8575Q[1] != C4907e.C4909b.WRAP_CONTENT) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.f8657u0 && this.f8655s0.mo17173k()) {
                C4898i a3 = dVar.mo17104a((Object) this.f8655s0);
                dVar.mo17108a(a3, this.f8655s0.mo17164b());
                if (this.f8653q0 != -1) {
                    if (z3) {
                        dVar.mo17115b(dVar.mo17104a((Object) a2), a3, 0, 5);
                    }
                } else if (this.f8654r0 != -1 && z3) {
                    C4898i a4 = dVar.mo17104a((Object) a2);
                    dVar.mo17115b(a3, dVar.mo17104a((Object) a), 0, 5);
                    dVar.mo17115b(a4, a3, 0, 5);
                }
                this.f8657u0 = false;
            } else if (this.f8653q0 != -1) {
                C4898i a5 = dVar.mo17104a((Object) this.f8655s0);
                dVar.mo17101a(a5, dVar.mo17104a((Object) a), this.f8653q0, 8);
                if (z3) {
                    dVar.mo17115b(dVar.mo17104a((Object) a2), a5, 0, 5);
                }
            } else if (this.f8654r0 != -1) {
                C4898i a6 = dVar.mo17104a((Object) this.f8655s0);
                C4898i a7 = dVar.mo17104a((Object) a2);
                dVar.mo17101a(a6, a7, -this.f8654r0, 8);
                if (z3) {
                    dVar.mo17115b(a6, dVar.mo17104a((Object) a), 0, 5);
                    dVar.mo17115b(a7, a6, 0, 5);
                }
            } else if (this.f8652p0 != -1.0f) {
                dVar.mo17105a(C4889d.m8309a(dVar, dVar.mo17104a((Object) this.f8655s0), dVar.mo17104a((Object) a2), this.f8652p0));
            }
        }
    }
}
