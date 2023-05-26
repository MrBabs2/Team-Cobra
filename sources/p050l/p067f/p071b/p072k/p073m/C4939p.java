package p050l.p067f.p071b.p072k.p073m;

import p050l.p067f.p071b.p072k.C4904d;
import p050l.p067f.p071b.p072k.C4907e;

/* renamed from: l.f.b.k.m.p */
/* compiled from: WidgetRun */
public abstract class C4939p implements C4923d {

    /* renamed from: a */
    public int f8728a;

    /* renamed from: b */
    C4907e f8729b;

    /* renamed from: c */
    C4934m f8730c;

    /* renamed from: d */
    protected C4907e.C4909b f8731d;

    /* renamed from: e */
    C4927g f8732e = new C4927g(this);

    /* renamed from: f */
    public int f8733f = 0;

    /* renamed from: g */
    boolean f8734g = false;

    /* renamed from: h */
    public C4925f f8735h = new C4925f(this);

    /* renamed from: i */
    public C4925f f8736i = new C4925f(this);

    /* renamed from: j */
    protected C4941b f8737j = C4941b.NONE;

    /* renamed from: l.f.b.k.m.p$a */
    /* compiled from: WidgetRun */
    static /* synthetic */ class C4940a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8738a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                l.f.b.k.d$b[] r0 = p050l.p067f.p071b.p072k.C4904d.C4906b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8738a = r0
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8738a     // Catch:{ NoSuchFieldError -> 0x001d }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8738a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8738a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8738a     // Catch:{ NoSuchFieldError -> 0x003e }
                l.f.b.k.d$b r1 = p050l.p067f.p071b.p072k.C4904d.C4906b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.p072k.p073m.C4939p.C4940a.<clinit>():void");
        }
    }

    /* renamed from: l.f.b.k.m.p$b */
    /* compiled from: WidgetRun */
    enum C4941b {
        NONE,
        START,
        END,
        CENTER
    }

    public C4939p(C4907e eVar) {
        this.f8729b = eVar;
    }

    /* renamed from: b */
    private void m8679b(int i, int i2) {
        int i3;
        int i4 = this.f8728a;
        if (i4 == 0) {
            this.f8732e.mo17332a(mo17350a(i2, i));
        } else if (i4 == 1) {
            this.f8732e.mo17332a(Math.min(mo17350a(this.f8732e.f8711m, i), i2));
        } else if (i4 == 2) {
            C4907e v = this.f8729b.mo17266v();
            if (v != null) {
                C4939p pVar = i == 0 ? v.f8591d : v.f8593e;
                if (pVar.f8732e.f8699j) {
                    C4907e eVar = this.f8729b;
                    this.f8732e.mo17332a(mo17350a((int) ((((float) pVar.f8732e.f8696g) * (i == 0 ? eVar.f8617s : eVar.f8620v)) + 0.5f), i));
                }
            }
        } else if (i4 == 3) {
            C4907e eVar2 = this.f8729b;
            C4932l lVar = eVar2.f8591d;
            C4907e.C4909b bVar = lVar.f8731d;
            C4907e.C4909b bVar2 = C4907e.C4909b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && lVar.f8728a == 3) {
                C4935n nVar = eVar2.f8593e;
                if (nVar.f8731d == bVar2 && nVar.f8728a == 3) {
                    return;
                }
            }
            C4907e eVar3 = this.f8729b;
            C4939p pVar2 = i == 0 ? eVar3.f8593e : eVar3.f8591d;
            if (pVar2.f8732e.f8699j) {
                float i5 = this.f8729b.mo17240i();
                if (i == 1) {
                    i3 = (int) ((((float) pVar2.f8732e.f8696g) / i5) + 0.5f);
                } else {
                    i3 = (int) ((i5 * ((float) pVar2.f8732e.f8696g)) + 0.5f);
                }
                this.f8732e.mo17332a(i3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4925f mo17351a(C4904d dVar) {
        C4904d dVar2 = dVar.f8543f;
        if (dVar2 == null) {
            return null;
        }
        C4907e eVar = dVar2.f8541d;
        int i = C4940a.f8738a[dVar2.f8542e.ordinal()];
        if (i == 1) {
            return eVar.f8591d.f8735h;
        }
        if (i == 2) {
            return eVar.f8591d.f8736i;
        }
        if (i == 3) {
            return eVar.f8593e.f8735h;
        }
        if (i == 4) {
            return eVar.f8593e.f8719k;
        }
        if (i != 5) {
            return null;
        }
        return eVar.f8593e.f8736i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo17315a();

    /* renamed from: a */
    public void mo17316a(C4923d dVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo17317b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17356b(C4923d dVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo17318c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo17357c(C4923d dVar) {
    }

    /* renamed from: d */
    public long mo17319d() {
        C4927g gVar = this.f8732e;
        if (gVar.f8699j) {
            return (long) gVar.f8696g;
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo17358e() {
        return this.f8734g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract boolean mo17320f();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17353a(C4923d dVar, C4904d dVar2, C4904d dVar3, int i) {
        float f;
        C4925f a = mo17351a(dVar2);
        C4925f a2 = mo17351a(dVar3);
        if (a.f8699j && a2.f8699j) {
            int c = a.f8696g + dVar2.mo17165c();
            int c2 = a2.f8696g - dVar3.mo17165c();
            int i2 = c2 - c;
            if (!this.f8732e.f8699j && this.f8731d == C4907e.C4909b.MATCH_CONSTRAINT) {
                m8679b(i, i2);
            }
            C4927g gVar = this.f8732e;
            if (gVar.f8699j) {
                if (gVar.f8696g == i2) {
                    this.f8735h.mo17332a(c);
                    this.f8736i.mo17332a(c2);
                    return;
                }
                C4907e eVar = this.f8729b;
                if (i == 0) {
                    f = eVar.mo17246l();
                } else {
                    f = eVar.mo17269x();
                }
                if (a == a2) {
                    c = a.f8696g;
                    c2 = a2.f8696g;
                    f = 0.5f;
                }
                this.f8735h.mo17332a((int) (((float) c) + 0.5f + (((float) ((c2 - c) - this.f8732e.f8696g)) * f)));
                this.f8736i.mo17332a(this.f8735h.f8696g + this.f8732e.f8696g);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo17350a(int i, int i2) {
        int i3;
        if (i2 == 0) {
            C4907e eVar = this.f8729b;
            int i4 = eVar.f8616r;
            i3 = Math.max(eVar.f8615q, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            C4907e eVar2 = this.f8729b;
            int i5 = eVar2.f8619u;
            int max = Math.max(eVar2.f8618t, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4925f mo17352a(C4904d dVar, int i) {
        C4904d dVar2 = dVar.f8543f;
        if (dVar2 == null) {
            return null;
        }
        C4907e eVar = dVar2.f8541d;
        C4939p pVar = i == 0 ? eVar.f8591d : eVar.f8593e;
        int i2 = C4940a.f8738a[dVar.f8543f.f8542e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f8736i;
        }
        return pVar.f8735h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17354a(C4925f fVar, C4925f fVar2, int i) {
        fVar.f8701l.add(fVar2);
        fVar.f8695f = i;
        fVar2.f8700k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17355a(C4925f fVar, C4925f fVar2, int i, C4927g gVar) {
        fVar.f8701l.add(fVar2);
        fVar.f8701l.add(this.f8732e);
        fVar.f8697h = i;
        fVar.f8698i = gVar;
        fVar2.f8700k.add(fVar);
        gVar.f8700k.add(fVar);
    }
}
