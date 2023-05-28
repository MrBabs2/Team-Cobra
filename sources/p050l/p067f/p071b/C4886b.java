package p050l.p067f.p071b;

import java.util.ArrayList;
import p050l.p067f.p071b.C4889d;
import p050l.p067f.p071b.C4898i;

/* renamed from: l.f.b.b */
/* compiled from: ArrayRow */
public class C4886b implements C4889d.C4890a {

    /* renamed from: a */
    C4898i f8406a = null;

    /* renamed from: b */
    float f8407b = 0.0f;

    /* renamed from: c */
    boolean f8408c;

    /* renamed from: d */
    ArrayList<C4898i> f8409d = new ArrayList<>();

    /* renamed from: e */
    public C4887a f8410e;

    /* renamed from: f */
    boolean f8411f = false;

    /* renamed from: l.f.b.b$a */
    /* compiled from: ArrayRow */
    public interface C4887a {
        /* renamed from: a */
        float mo17056a(C4886b bVar, boolean z);

        /* renamed from: a */
        float mo17057a(C4898i iVar);

        /* renamed from: a */
        float mo17058a(C4898i iVar, boolean z);

        /* renamed from: a */
        int mo17059a();

        /* renamed from: a */
        C4898i mo17060a(int i);

        /* renamed from: a */
        void mo17061a(float f);

        /* renamed from: a */
        void mo17062a(C4898i iVar, float f);

        /* renamed from: a */
        void mo17063a(C4898i iVar, float f, boolean z);

        /* renamed from: b */
        float mo17064b(int i);

        /* renamed from: b */
        void mo17065b();

        /* renamed from: b */
        boolean mo17066b(C4898i iVar);

        void clear();
    }

    public C4886b() {
    }

    /* renamed from: a */
    public C4886b mo17073a(C4898i iVar, C4898i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f8407b = (float) i;
        }
        if (!z) {
            this.f8410e.mo17062a(iVar, -1.0f);
            this.f8410e.mo17062a(iVar2, 1.0f);
        } else {
            this.f8410e.mo17062a(iVar, 1.0f);
            this.f8410e.mo17062a(iVar2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo17089b() {
        C4898i iVar = this.f8406a;
        return iVar != null && (iVar.f8488j == C4898i.C4899a.UNRESTRICTED || this.f8407b >= 0.0f);
    }

    /* renamed from: c */
    public void mo17093c() {
        this.f8406a = null;
        this.f8410e.clear();
        this.f8407b = 0.0f;
        this.f8411f = false;
    }

    public void clear() {
        this.f8410e.clear();
        this.f8406a = null;
        this.f8407b = 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d2  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo17096d() {
        /*
            r9 = this;
            l.f.b.i r0 = r9.f8406a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            l.f.b.i r1 = r9.f8406a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f8407b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f8407b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            l.f.b.b$a r5 = r9.f8410e
            int r5 = r5.mo17059a()
        L_0x005d:
            if (r2 >= r5) goto L_0x00ee
            l.f.b.b$a r6 = r9.f8410e
            l.f.b.i r6 = r6.mo17060a((int) r2)
            if (r6 != 0) goto L_0x0069
            goto L_0x00ea
        L_0x0069:
            l.f.b.b$a r7 = r9.f8410e
            float r7 = r7.mo17064b((int) r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00ea
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0093
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x0093:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00bc
        L_0x00a9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ba:
            float r7 = r7 * r8
        L_0x00bc:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e9
        L_0x00d2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e9:
            r1 = 1
        L_0x00ea:
            int r2 = r2 + 1
            goto L_0x005d
        L_0x00ee:
            if (r1 != 0) goto L_0x0101
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0101:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.C4886b.mo17096d():java.lang.String");
    }

    public C4898i getKey() {
        return this.f8406a;
    }

    public boolean isEmpty() {
        return this.f8406a == null && this.f8407b == 0.0f && this.f8410e.mo17059a() == 0;
    }

    public String toString() {
        return mo17096d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo17090b(C4898i iVar) {
        return this.f8410e.mo17066b(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C4886b mo17084b(C4898i iVar, int i) {
        this.f8406a = iVar;
        float f = (float) i;
        iVar.f8484f = f;
        this.f8407b = f;
        this.f8411f = true;
        return this;
    }

    /* renamed from: c */
    public C4886b mo17091c(C4898i iVar, int i) {
        if (i < 0) {
            this.f8407b = (float) (i * -1);
            this.f8410e.mo17062a(iVar, 1.0f);
        } else {
            this.f8407b = (float) i;
            this.f8410e.mo17062a(iVar, -1.0f);
        }
        return this;
    }

    public C4886b(C4888c cVar) {
        this.f8410e = new C4885a(this, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4886b mo17071a(C4898i iVar, int i) {
        this.f8410e.mo17062a(iVar, (float) i);
        return this;
    }

    /* renamed from: a */
    public C4886b mo17075a(C4898i iVar, C4898i iVar2, C4898i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f8407b = (float) i;
        }
        if (!z) {
            this.f8410e.mo17062a(iVar, -1.0f);
            this.f8410e.mo17062a(iVar2, 1.0f);
            this.f8410e.mo17062a(iVar3, 1.0f);
        } else {
            this.f8410e.mo17062a(iVar, 1.0f);
            this.f8410e.mo17062a(iVar2, -1.0f);
            this.f8410e.mo17062a(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C4886b mo17085b(C4898i iVar, C4898i iVar2, C4898i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f8407b = (float) i;
        }
        if (!z) {
            this.f8410e.mo17062a(iVar, -1.0f);
            this.f8410e.mo17062a(iVar2, 1.0f);
            this.f8410e.mo17062a(iVar3, -1.0f);
        } else {
            this.f8410e.mo17062a(iVar, 1.0f);
            this.f8410e.mo17062a(iVar2, -1.0f);
            this.f8410e.mo17062a(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: c */
    public C4898i mo17092c(C4898i iVar) {
        return m8267a((boolean[]) null, iVar);
    }

    /* renamed from: c */
    public void mo17094c(C4889d dVar) {
        if (dVar.f8431g.length != 0) {
            boolean z = false;
            while (!z) {
                int a = this.f8410e.mo17059a();
                for (int i = 0; i < a; i++) {
                    C4898i a2 = this.f8410e.mo17060a(i);
                    if (a2.f8482d != -1 || a2.f8485g || a2.f8492n) {
                        this.f8409d.add(a2);
                    }
                }
                int size = this.f8409d.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        C4898i iVar = this.f8409d.get(i2);
                        if (iVar.f8485g) {
                            mo17081a(dVar, iVar, true);
                        } else if (iVar.f8492n) {
                            mo17088b(dVar, iVar, true);
                        } else {
                            mo17080a(dVar, dVar.f8431g[iVar.f8482d], true);
                        }
                    }
                    this.f8409d.clear();
                } else {
                    z = true;
                }
            }
            if (C4889d.f8418t && this.f8406a != null && this.f8410e.mo17059a() == 0) {
                this.f8411f = true;
                dVar.f8425a = true;
            }
        }
    }

    /* renamed from: a */
    public C4886b mo17069a(float f, float f2, float f3, C4898i iVar, C4898i iVar2, C4898i iVar3, C4898i iVar4) {
        this.f8407b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f8410e.mo17062a(iVar, 1.0f);
            this.f8410e.mo17062a(iVar2, -1.0f);
            this.f8410e.mo17062a(iVar4, 1.0f);
            this.f8410e.mo17062a(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f8410e.mo17062a(iVar, 1.0f);
            this.f8410e.mo17062a(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f8410e.mo17062a(iVar3, 1.0f);
            this.f8410e.mo17062a(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f8410e.mo17062a(iVar, 1.0f);
            this.f8410e.mo17062a(iVar2, -1.0f);
            this.f8410e.mo17062a(iVar4, f4);
            this.f8410e.mo17062a(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: b */
    public C4886b mo17086b(C4898i iVar, C4898i iVar2, C4898i iVar3, C4898i iVar4, float f) {
        this.f8410e.mo17062a(iVar3, 0.5f);
        this.f8410e.mo17062a(iVar4, 0.5f);
        this.f8410e.mo17062a(iVar, -0.5f);
        this.f8410e.mo17062a(iVar2, -0.5f);
        this.f8407b = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo17097d(C4898i iVar) {
        C4898i iVar2 = this.f8406a;
        if (iVar2 != null) {
            this.f8410e.mo17062a(iVar2, -1.0f);
            this.f8406a.f8482d = -1;
            this.f8406a = null;
        }
        float a = this.f8410e.mo17058a(iVar, true) * -1.0f;
        this.f8406a = iVar;
        if (a != 1.0f) {
            this.f8407b /= a;
            this.f8410e.mo17061a(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C4898i mo17087b(C4889d dVar) {
        boolean a;
        boolean a2;
        int a3 = this.f8410e.mo17059a();
        C4898i iVar = null;
        C4898i iVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < a3; i++) {
            float b = this.f8410e.mo17064b(i);
            C4898i a4 = this.f8410e.mo17060a(i);
            if (a4.f8488j == C4898i.C4899a.UNRESTRICTED) {
                if (iVar == null) {
                    a2 = m8268a(a4, dVar);
                } else if (f > b) {
                    a2 = m8268a(a4, dVar);
                } else if (!z && m8268a(a4, dVar)) {
                    f = b;
                    iVar = a4;
                    z = true;
                }
                z = a2;
                f = b;
                iVar = a4;
            } else if (iVar == null && b < 0.0f) {
                if (iVar2 == null) {
                    a = m8268a(a4, dVar);
                } else if (f2 > b) {
                    a = m8268a(a4, dVar);
                } else if (!z2 && m8268a(a4, dVar)) {
                    f2 = b;
                    iVar2 = a4;
                    z2 = true;
                }
                z2 = a;
                f2 = b;
                iVar2 = a4;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4886b mo17074a(C4898i iVar, C4898i iVar2, int i, float f, C4898i iVar3, C4898i iVar4, int i2) {
        if (iVar2 == iVar3) {
            this.f8410e.mo17062a(iVar, 1.0f);
            this.f8410e.mo17062a(iVar4, 1.0f);
            this.f8410e.mo17062a(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f8410e.mo17062a(iVar, 1.0f);
            this.f8410e.mo17062a(iVar2, -1.0f);
            this.f8410e.mo17062a(iVar3, -1.0f);
            this.f8410e.mo17062a(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f8407b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f8410e.mo17062a(iVar, -1.0f);
            this.f8410e.mo17062a(iVar2, 1.0f);
            this.f8407b = (float) i;
        } else if (f >= 1.0f) {
            this.f8410e.mo17062a(iVar4, -1.0f);
            this.f8410e.mo17062a(iVar3, 1.0f);
            this.f8407b = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            this.f8410e.mo17062a(iVar, f2 * 1.0f);
            this.f8410e.mo17062a(iVar2, f2 * -1.0f);
            this.f8410e.mo17062a(iVar3, -1.0f * f);
            this.f8410e.mo17062a(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f8407b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* renamed from: b */
    public void mo17088b(C4889d dVar, C4898i iVar, boolean z) {
        if (iVar.f8492n) {
            float a = this.f8410e.mo17057a(iVar);
            this.f8407b += iVar.f8494p * a;
            this.f8410e.mo17058a(iVar, z);
            if (z) {
                iVar.mo17139b(this);
            }
            this.f8410e.mo17063a(dVar.f8438n.f8415d[iVar.f8493o], a, z);
            if (C4889d.f8418t && iVar != null && this.f8410e.mo17059a() == 0) {
                this.f8411f = true;
                dVar.f8425a = true;
            }
        }
    }

    /* renamed from: a */
    public C4886b mo17070a(C4889d dVar, int i) {
        this.f8410e.mo17062a(dVar.mo17103a(i, "ep"), 1.0f);
        this.f8410e.mo17062a(dVar.mo17103a(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4886b mo17072a(C4898i iVar, C4898i iVar2, float f) {
        this.f8410e.mo17062a(iVar, -1.0f);
        this.f8410e.mo17062a(iVar2, f);
        return this;
    }

    /* renamed from: a */
    public C4886b mo17076a(C4898i iVar, C4898i iVar2, C4898i iVar3, C4898i iVar4, float f) {
        this.f8410e.mo17062a(iVar, -1.0f);
        this.f8410e.mo17062a(iVar2, 1.0f);
        this.f8410e.mo17062a(iVar3, f);
        this.f8410e.mo17062a(iVar4, -f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17078a() {
        float f = this.f8407b;
        if (f < 0.0f) {
            this.f8407b = f * -1.0f;
            this.f8410e.mo17065b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo17083a(C4889d dVar) {
        boolean z;
        C4898i b = mo17087b(dVar);
        if (b == null) {
            z = true;
        } else {
            mo17097d(b);
            z = false;
        }
        if (this.f8410e.mo17059a() == 0) {
            this.f8411f = true;
        }
        return z;
    }

    /* renamed from: a */
    private boolean m8268a(C4898i iVar, C4889d dVar) {
        return iVar.f8491m <= 1;
    }

    /* renamed from: a */
    public void mo17080a(C4889d dVar, C4886b bVar, boolean z) {
        this.f8407b += bVar.f8407b * this.f8410e.mo17056a(bVar, z);
        if (z) {
            bVar.f8406a.mo17139b(this);
        }
        if (C4889d.f8418t && this.f8406a != null && this.f8410e.mo17059a() == 0) {
            this.f8411f = true;
            dVar.f8425a = true;
        }
    }

    /* renamed from: a */
    public void mo17081a(C4889d dVar, C4898i iVar, boolean z) {
        if (iVar.f8485g) {
            this.f8407b += iVar.f8484f * this.f8410e.mo17057a(iVar);
            this.f8410e.mo17058a(iVar, z);
            if (z) {
                iVar.mo17139b(this);
            }
            if (C4889d.f8418t && iVar != null && this.f8410e.mo17059a() == 0) {
                this.f8411f = true;
                dVar.f8425a = true;
            }
        }
    }

    /* renamed from: a */
    private C4898i m8267a(boolean[] zArr, C4898i iVar) {
        C4898i.C4899a aVar;
        int a = this.f8410e.mo17059a();
        C4898i iVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < a; i++) {
            float b = this.f8410e.mo17064b(i);
            if (b < 0.0f) {
                C4898i a2 = this.f8410e.mo17060a(i);
                if ((zArr == null || !zArr[a2.f8481c]) && a2 != iVar && (((aVar = a2.f8488j) == C4898i.C4899a.SLACK || aVar == C4898i.C4899a.ERROR) && b < f)) {
                    f = b;
                    iVar2 = a2;
                }
            }
        }
        return iVar2;
    }

    /* renamed from: a */
    public C4898i mo17077a(C4889d dVar, boolean[] zArr) {
        return m8267a(zArr, (C4898i) null);
    }

    /* renamed from: a */
    public void mo17079a(C4889d.C4890a aVar) {
        if (aVar instanceof C4886b) {
            C4886b bVar = (C4886b) aVar;
            this.f8406a = null;
            this.f8410e.clear();
            for (int i = 0; i < bVar.f8410e.mo17059a(); i++) {
                this.f8410e.mo17063a(bVar.f8410e.mo17060a(i), bVar.f8410e.mo17064b(i), true);
            }
        }
    }

    /* renamed from: a */
    public void mo17082a(C4898i iVar) {
        int i = iVar.f8483e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f8410e.mo17062a(iVar, f);
    }
}
