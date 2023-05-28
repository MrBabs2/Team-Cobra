package p050l.p067f.p071b;

import java.util.Arrays;
import java.util.HashMap;
import p050l.p067f.p071b.C4898i;
import p050l.p067f.p071b.p072k.C4904d;
import p050l.p067f.p071b.p072k.C4907e;

/* renamed from: l.f.b.d */
/* compiled from: LinearSystem */
public class C4889d {

    /* renamed from: r */
    public static boolean f8416r = false;

    /* renamed from: s */
    public static boolean f8417s = true;

    /* renamed from: t */
    public static boolean f8418t = true;

    /* renamed from: u */
    public static boolean f8419u = true;

    /* renamed from: v */
    public static boolean f8420v = false;

    /* renamed from: w */
    private static int f8421w = 1000;

    /* renamed from: x */
    public static C4892e f8422x;

    /* renamed from: y */
    public static long f8423y;

    /* renamed from: z */
    public static long f8424z;

    /* renamed from: a */
    public boolean f8425a;

    /* renamed from: b */
    int f8426b;

    /* renamed from: c */
    private HashMap<String, C4898i> f8427c;

    /* renamed from: d */
    private C4890a f8428d;

    /* renamed from: e */
    private int f8429e;

    /* renamed from: f */
    private int f8430f;

    /* renamed from: g */
    C4886b[] f8431g;

    /* renamed from: h */
    public boolean f8432h;

    /* renamed from: i */
    public boolean f8433i;

    /* renamed from: j */
    private boolean[] f8434j;

    /* renamed from: k */
    int f8435k;

    /* renamed from: l */
    int f8436l;

    /* renamed from: m */
    private int f8437m;

    /* renamed from: n */
    final C4888c f8438n;

    /* renamed from: o */
    private C4898i[] f8439o;

    /* renamed from: p */
    private int f8440p;

    /* renamed from: q */
    private C4890a f8441q;

    /* renamed from: l.f.b.d$a */
    /* compiled from: LinearSystem */
    interface C4890a {
        /* renamed from: a */
        C4898i mo17077a(C4889d dVar, boolean[] zArr);

        /* renamed from: a */
        void mo17079a(C4890a aVar);

        /* renamed from: a */
        void mo17082a(C4898i iVar);

        void clear();

        C4898i getKey();

        boolean isEmpty();
    }

    /* renamed from: l.f.b.d$b */
    /* compiled from: LinearSystem */
    class C4891b extends C4886b {
        public C4891b(C4889d dVar, C4888c cVar) {
            this.f8410e = new C4900j(this, cVar);
        }
    }

    public C4889d() {
        this.f8425a = false;
        this.f8426b = 0;
        this.f8427c = null;
        this.f8429e = 32;
        this.f8430f = 32;
        this.f8431g = null;
        this.f8432h = false;
        this.f8433i = false;
        this.f8434j = new boolean[32];
        this.f8435k = 1;
        this.f8436l = 0;
        this.f8437m = 32;
        this.f8439o = new C4898i[f8421w];
        this.f8440p = 0;
        this.f8431g = new C4886b[32];
        m8316j();
        C4888c cVar = new C4888c();
        this.f8438n = cVar;
        this.f8428d = new C4895h(cVar);
        if (f8420v) {
            this.f8441q = new C4891b(this, this.f8438n);
        } else {
            this.f8441q = new C4886b(this.f8438n);
        }
    }

    /* renamed from: g */
    private void m8313g() {
        for (int i = 0; i < this.f8436l; i++) {
            C4886b bVar = this.f8431g[i];
            bVar.f8406a.f8484f = bVar.f8407b;
        }
    }

    /* renamed from: h */
    public static C4892e m8314h() {
        return f8422x;
    }

    /* renamed from: i */
    private void m8315i() {
        int i = this.f8429e * 2;
        this.f8429e = i;
        this.f8431g = (C4886b[]) Arrays.copyOf(this.f8431g, i);
        C4888c cVar = this.f8438n;
        cVar.f8415d = (C4898i[]) Arrays.copyOf(cVar.f8415d, this.f8429e);
        int i2 = this.f8429e;
        this.f8434j = new boolean[i2];
        this.f8430f = i2;
        this.f8437m = i2;
        C4892e eVar = f8422x;
        if (eVar != null) {
            eVar.f8446d++;
            eVar.f8457o = Math.max(eVar.f8457o, (long) i2);
            C4892e eVar2 = f8422x;
            eVar2.f8466x = eVar2.f8457o;
        }
    }

    /* renamed from: j */
    private void m8316j() {
        int i = 0;
        if (f8420v) {
            while (i < this.f8436l) {
                C4886b bVar = this.f8431g[i];
                if (bVar != null) {
                    this.f8438n.f8412a.mo17124a(bVar);
                }
                this.f8431g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f8436l) {
            C4886b bVar2 = this.f8431g[i];
            if (bVar2 != null) {
                this.f8438n.f8413b.mo17124a(bVar2);
            }
            this.f8431g[i] = null;
            i++;
        }
    }

    /* renamed from: a */
    public C4898i mo17104a(Object obj) {
        C4898i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f8435k + 1 >= this.f8430f) {
            m8315i();
        }
        if (obj instanceof C4904d) {
            C4904d dVar = (C4904d) obj;
            iVar = dVar.mo17168f();
            if (iVar == null) {
                dVar.mo17161a(this.f8438n);
                iVar = dVar.mo17168f();
            }
            int i = iVar.f8481c;
            if (i == -1 || i > this.f8426b || this.f8438n.f8415d[i] == null) {
                if (iVar.f8481c != -1) {
                    iVar.mo17134a();
                }
                int i2 = this.f8426b + 1;
                this.f8426b = i2;
                this.f8435k++;
                iVar.f8481c = i2;
                iVar.f8488j = C4898i.C4899a.UNRESTRICTED;
                this.f8438n.f8415d[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: b */
    public C4886b mo17114b() {
        C4886b bVar;
        if (f8420v) {
            bVar = this.f8438n.f8412a.mo17122a();
            if (bVar == null) {
                bVar = new C4891b(this, this.f8438n);
                f8424z++;
            } else {
                bVar.mo17093c();
            }
        } else {
            bVar = this.f8438n.f8413b.mo17122a();
            if (bVar == null) {
                bVar = new C4886b(this.f8438n);
                f8423y++;
            } else {
                bVar.mo17093c();
            }
        }
        C4898i.m8359b();
        return bVar;
    }

    /* renamed from: c */
    public C4898i mo17117c() {
        C4892e eVar = f8422x;
        if (eVar != null) {
            eVar.f8455m++;
        }
        if (this.f8435k + 1 >= this.f8430f) {
            m8315i();
        }
        C4898i a = m8310a(C4898i.C4899a.SLACK, (String) null);
        int i = this.f8426b + 1;
        this.f8426b = i;
        this.f8435k++;
        a.f8481c = i;
        this.f8438n.f8415d[i] = a;
        return a;
    }

    /* renamed from: d */
    public C4888c mo17119d() {
        return this.f8438n;
    }

    /* renamed from: e */
    public void mo17120e() throws Exception {
        C4892e eVar = f8422x;
        if (eVar != null) {
            eVar.f8447e++;
        }
        if (this.f8428d.isEmpty()) {
            m8313g();
        } else if (this.f8432h || this.f8433i) {
            C4892e eVar2 = f8422x;
            if (eVar2 != null) {
                eVar2.f8459q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f8436l) {
                    z = true;
                    break;
                } else if (!this.f8431g[i].f8411f) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo17107a(this.f8428d);
                return;
            }
            C4892e eVar3 = f8422x;
            if (eVar3 != null) {
                eVar3.f8458p++;
            }
            m8313g();
        } else {
            mo17107a(this.f8428d);
        }
    }

    /* renamed from: f */
    public void mo17121f() {
        C4888c cVar;
        int i = 0;
        while (true) {
            cVar = this.f8438n;
            C4898i[] iVarArr = cVar.f8415d;
            if (i >= iVarArr.length) {
                break;
            }
            C4898i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo17134a();
            }
            i++;
        }
        cVar.f8414c.mo17123a(this.f8439o, this.f8440p);
        this.f8440p = 0;
        Arrays.fill(this.f8438n.f8415d, (Object) null);
        HashMap<String, C4898i> hashMap = this.f8427c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f8426b = 0;
        this.f8428d.clear();
        this.f8435k = 1;
        for (int i2 = 0; i2 < this.f8436l; i2++) {
            C4886b[] bVarArr = this.f8431g;
            if (bVarArr[i2] != null) {
                bVarArr[i2].f8408c = false;
            }
        }
        m8316j();
        this.f8436l = 0;
        if (f8420v) {
            this.f8441q = new C4891b(this, this.f8438n);
        } else {
            this.f8441q = new C4886b(this.f8438n);
        }
    }

    /* renamed from: c */
    public void mo17118c(C4898i iVar, C4898i iVar2, int i, int i2) {
        C4886b b = mo17114b();
        C4898i c = mo17117c();
        c.f8483e = 0;
        b.mo17085b(iVar, iVar2, c, i);
        if (i2 != 8) {
            mo17106a(b, (int) (b.f8410e.mo17057a(c) * -1.0f), i2);
        }
        mo17105a(b);
    }

    /* renamed from: b */
    public int mo17113b(Object obj) {
        C4898i f = ((C4904d) obj).mo17168f();
        if (f != null) {
            return (int) (f.f8484f + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    private final void m8312b(C4886b bVar) {
        int i;
        if (!f8418t || !bVar.f8411f) {
            C4886b[] bVarArr = this.f8431g;
            int i2 = this.f8436l;
            bVarArr[i2] = bVar;
            C4898i iVar = bVar.f8406a;
            iVar.f8482d = i2;
            this.f8436l = i2 + 1;
            iVar.mo17137a(this, bVar);
        } else {
            bVar.f8406a.mo17136a(this, bVar.f8407b);
        }
        if (f8418t && this.f8425a) {
            int i3 = 0;
            while (i3 < this.f8436l) {
                if (this.f8431g[i3] == null) {
                    System.out.println("WTF");
                }
                C4886b[] bVarArr2 = this.f8431g;
                if (bVarArr2[i3] != null && bVarArr2[i3].f8411f) {
                    C4886b bVar2 = bVarArr2[i3];
                    bVar2.f8406a.mo17136a(this, bVar2.f8407b);
                    if (f8420v) {
                        this.f8438n.f8412a.mo17124a(bVar2);
                    } else {
                        this.f8438n.f8413b.mo17124a(bVar2);
                    }
                    this.f8431g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f8436l;
                        if (i4 >= i) {
                            break;
                        }
                        C4886b[] bVarArr3 = this.f8431g;
                        int i6 = i4 - 1;
                        bVarArr3[i6] = bVarArr3[i4];
                        if (bVarArr3[i6].f8406a.f8482d == i4) {
                            bVarArr3[i6].f8406a.f8482d = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f8431g[i5] = null;
                    }
                    this.f8436l--;
                    i3--;
                }
                i3++;
            }
            this.f8425a = false;
        }
    }

    /* renamed from: a */
    public C4898i mo17102a() {
        C4892e eVar = f8422x;
        if (eVar != null) {
            eVar.f8456n++;
        }
        if (this.f8435k + 1 >= this.f8430f) {
            m8315i();
        }
        C4898i a = m8310a(C4898i.C4899a.SLACK, (String) null);
        int i = this.f8426b + 1;
        this.f8426b = i;
        this.f8435k++;
        a.f8481c = i;
        this.f8438n.f8415d[i] = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17106a(C4886b bVar, int i, int i2) {
        bVar.mo17071a(mo17103a(i2, (String) null), i);
    }

    /* renamed from: a */
    public C4898i mo17103a(int i, String str) {
        C4892e eVar = f8422x;
        if (eVar != null) {
            eVar.f8454l++;
        }
        if (this.f8435k + 1 >= this.f8430f) {
            m8315i();
        }
        C4898i a = m8310a(C4898i.C4899a.ERROR, str);
        int i2 = this.f8426b + 1;
        this.f8426b = i2;
        this.f8435k++;
        a.f8481c = i2;
        a.f8483e = i;
        this.f8438n.f8415d[i2] = a;
        this.f8428d.mo17082a(a);
        return a;
    }

    /* renamed from: a */
    private C4898i m8310a(C4898i.C4899a aVar, String str) {
        C4898i a = this.f8438n.f8414c.mo17122a();
        if (a == null) {
            a = new C4898i(aVar, str);
            a.mo17138a(aVar, str);
        } else {
            a.mo17134a();
            a.mo17138a(aVar, str);
        }
        int i = this.f8440p;
        int i2 = f8421w;
        if (i >= i2) {
            int i3 = i2 * 2;
            f8421w = i3;
            this.f8439o = (C4898i[]) Arrays.copyOf(this.f8439o, i3);
        }
        C4898i[] iVarArr = this.f8439o;
        int i4 = this.f8440p;
        this.f8440p = i4 + 1;
        iVarArr[i4] = a;
        return a;
    }

    /* renamed from: b */
    private int m8311b(C4890a aVar) throws Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f8436l) {
                z = false;
                break;
            }
            C4886b[] bVarArr = this.f8431g;
            if (bVarArr[i].f8406a.f8488j != C4898i.C4899a.UNRESTRICTED && bVarArr[i].f8407b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C4892e eVar = f8422x;
            if (eVar != null) {
                eVar.f8453k++;
            }
            i2++;
            float f = Float.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f8436l; i6++) {
                C4886b bVar = this.f8431g[i6];
                if (bVar.f8406a.f8488j != C4898i.C4899a.UNRESTRICTED && !bVar.f8411f && bVar.f8407b < 0.0f) {
                    int i7 = 9;
                    if (f8419u) {
                        int a = bVar.f8410e.mo17059a();
                        int i8 = 0;
                        while (i8 < a) {
                            C4898i a2 = bVar.f8410e.mo17060a(i8);
                            float a3 = bVar.f8410e.mo17057a(a2);
                            if (a3 > 0.0f) {
                                int i9 = 0;
                                while (i9 < i7) {
                                    float f2 = a2.f8486h[i9] / a3;
                                    if ((f2 < f && i9 == i5) || i9 > i5) {
                                        i4 = a2.f8481c;
                                        i5 = i9;
                                        i3 = i6;
                                        f = f2;
                                    }
                                    i9++;
                                    i7 = 9;
                                }
                            }
                            i8++;
                            i7 = 9;
                        }
                    } else {
                        for (int i10 = 1; i10 < this.f8435k; i10++) {
                            C4898i iVar = this.f8438n.f8415d[i10];
                            float a4 = bVar.f8410e.mo17057a(iVar);
                            if (a4 > 0.0f) {
                                for (int i11 = 0; i11 < 9; i11++) {
                                    float f3 = iVar.f8486h[i11] / a4;
                                    if ((f3 < f && i11 == i5) || i11 > i5) {
                                        i4 = i10;
                                        i5 = i11;
                                        i3 = i6;
                                        f = f3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i3 != -1) {
                C4886b bVar2 = this.f8431g[i3];
                bVar2.f8406a.f8482d = -1;
                C4892e eVar2 = f8422x;
                if (eVar2 != null) {
                    eVar2.f8452j++;
                }
                bVar2.mo17097d(this.f8438n.f8415d[i4]);
                C4898i iVar2 = bVar2.f8406a;
                iVar2.f8482d = i3;
                iVar2.mo17137a(this, bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f8435k / 2) {
                z2 = true;
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17107a(C4890a aVar) throws Exception {
        C4892e eVar = f8422x;
        if (eVar != null) {
            eVar.f8462t++;
            eVar.f8463u = Math.max(eVar.f8463u, (long) this.f8435k);
            C4892e eVar2 = f8422x;
            eVar2.f8464v = Math.max(eVar2.f8464v, (long) this.f8436l);
        }
        m8311b(aVar);
        m8308a(aVar, false);
        m8313g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17105a(p050l.p067f.p071b.C4886b r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            l.f.b.e r0 = f8422x
            r1 = 1
            if (r0 == 0) goto L_0x0017
            long r3 = r0.f8448f
            long r3 = r3 + r1
            r0.f8448f = r3
            boolean r3 = r8.f8411f
            if (r3 == 0) goto L_0x0017
            long r3 = r0.f8449g
            long r3 = r3 + r1
            r0.f8449g = r3
        L_0x0017:
            int r0 = r7.f8436l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f8437m
            if (r0 >= r4) goto L_0x0026
            int r0 = r7.f8435k
            int r0 = r0 + r3
            int r4 = r7.f8430f
            if (r0 < r4) goto L_0x0029
        L_0x0026:
            r7.m8315i()
        L_0x0029:
            r0 = 0
            boolean r4 = r8.f8411f
            if (r4 != 0) goto L_0x00a1
            r8.mo17094c((p050l.p067f.p071b.C4889d) r7)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x0038
            return
        L_0x0038:
            r8.mo17078a()
            boolean r4 = r8.mo17083a((p050l.p067f.p071b.C4889d) r7)
            if (r4 == 0) goto L_0x0098
            l.f.b.i r4 = r7.mo17102a()
            r8.f8406a = r4
            int r5 = r7.f8436l
            r7.m8312b((p050l.p067f.p071b.C4886b) r8)
            int r6 = r7.f8436l
            int r5 = r5 + r3
            if (r6 != r5) goto L_0x0098
            l.f.b.d$a r0 = r7.f8441q
            r0.mo17079a((p050l.p067f.p071b.C4889d.C4890a) r8)
            l.f.b.d$a r0 = r7.f8441q
            r7.m8308a((p050l.p067f.p071b.C4889d.C4890a) r0, (boolean) r3)
            int r0 = r4.f8482d
            r5 = -1
            if (r0 != r5) goto L_0x0099
            l.f.b.i r0 = r8.f8406a
            if (r0 != r4) goto L_0x0076
            l.f.b.i r0 = r8.mo17092c((p050l.p067f.p071b.C4898i) r4)
            if (r0 == 0) goto L_0x0076
            l.f.b.e r4 = f8422x
            if (r4 == 0) goto L_0x0073
            long r5 = r4.f8452j
            long r5 = r5 + r1
            r4.f8452j = r5
        L_0x0073:
            r8.mo17097d(r0)
        L_0x0076:
            boolean r0 = r8.f8411f
            if (r0 != 0) goto L_0x007f
            l.f.b.i r0 = r8.f8406a
            r0.mo17137a((p050l.p067f.p071b.C4889d) r7, (p050l.p067f.p071b.C4886b) r8)
        L_0x007f:
            boolean r0 = f8420v
            if (r0 == 0) goto L_0x008b
            l.f.b.c r0 = r7.f8438n
            l.f.b.f<l.f.b.b> r0 = r0.f8412a
            r0.mo17124a(r8)
            goto L_0x0092
        L_0x008b:
            l.f.b.c r0 = r7.f8438n
            l.f.b.f<l.f.b.b> r0 = r0.f8413b
            r0.mo17124a(r8)
        L_0x0092:
            int r0 = r7.f8436l
            int r0 = r0 - r3
            r7.f8436l = r0
            goto L_0x0099
        L_0x0098:
            r3 = 0
        L_0x0099:
            boolean r0 = r8.mo17089b()
            if (r0 != 0) goto L_0x00a0
            return
        L_0x00a0:
            r0 = r3
        L_0x00a1:
            if (r0 != 0) goto L_0x00a6
            r7.m8312b((p050l.p067f.p071b.C4886b) r8)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p067f.p071b.C4889d.mo17105a(l.f.b.b):void");
    }

    /* renamed from: b */
    public void mo17115b(C4898i iVar, C4898i iVar2, int i, int i2) {
        C4886b b = mo17114b();
        C4898i c = mo17117c();
        c.f8483e = 0;
        b.mo17075a(iVar, iVar2, c, i);
        if (i2 != 8) {
            mo17106a(b, (int) (b.f8410e.mo17057a(c) * -1.0f), i2);
        }
        mo17105a(b);
    }

    /* renamed from: b */
    public void mo17116b(C4898i iVar, C4898i iVar2, int i, boolean z) {
        C4886b b = mo17114b();
        C4898i c = mo17117c();
        c.f8483e = 0;
        b.mo17085b(iVar, iVar2, c, i);
        mo17105a(b);
    }

    /* renamed from: a */
    private final int m8308a(C4890a aVar, boolean z) {
        C4892e eVar = f8422x;
        if (eVar != null) {
            eVar.f8450h++;
        }
        for (int i = 0; i < this.f8435k; i++) {
            this.f8434j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C4892e eVar2 = f8422x;
            if (eVar2 != null) {
                eVar2.f8451i++;
            }
            i2++;
            if (i2 >= this.f8435k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f8434j[aVar.getKey().f8481c] = true;
            }
            C4898i a = aVar.mo17077a(this, this.f8434j);
            if (a != null) {
                boolean[] zArr = this.f8434j;
                int i3 = a.f8481c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f8436l; i5++) {
                    C4886b bVar = this.f8431g[i5];
                    if (bVar.f8406a.f8488j != C4898i.C4899a.UNRESTRICTED && !bVar.f8411f && bVar.mo17090b(a)) {
                        float a2 = bVar.f8410e.mo17057a(a);
                        if (a2 < 0.0f) {
                            float f2 = (-bVar.f8407b) / a2;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C4886b bVar2 = this.f8431g[i4];
                    bVar2.f8406a.f8482d = -1;
                    C4892e eVar3 = f8422x;
                    if (eVar3 != null) {
                        eVar3.f8452j++;
                    }
                    bVar2.mo17097d(a);
                    C4898i iVar = bVar2.f8406a;
                    iVar.f8482d = i4;
                    iVar.mo17137a(this, bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public void mo17110a(C4898i iVar, C4898i iVar2, int i, boolean z) {
        C4886b b = mo17114b();
        C4898i c = mo17117c();
        c.f8483e = 0;
        b.mo17075a(iVar, iVar2, c, i);
        mo17105a(b);
    }

    /* renamed from: a */
    public void mo17109a(C4898i iVar, C4898i iVar2, int i, float f, C4898i iVar3, C4898i iVar4, int i2, int i3) {
        int i4 = i3;
        C4886b b = mo17114b();
        b.mo17074a(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 8) {
            b.mo17070a(this, i4);
        }
        mo17105a(b);
    }

    /* renamed from: a */
    public void mo17111a(C4898i iVar, C4898i iVar2, C4898i iVar3, C4898i iVar4, float f, int i) {
        C4886b b = mo17114b();
        b.mo17076a(iVar, iVar2, iVar3, iVar4, f);
        if (i != 8) {
            b.mo17070a(this, i);
        }
        mo17105a(b);
    }

    /* renamed from: a */
    public C4886b mo17101a(C4898i iVar, C4898i iVar2, int i, int i2) {
        if (!f8417s || i2 != 8 || !iVar2.f8485g || iVar.f8482d != -1) {
            C4886b b = mo17114b();
            b.mo17073a(iVar, iVar2, i);
            if (i2 != 8) {
                b.mo17070a(this, i2);
            }
            mo17105a(b);
            return b;
        }
        iVar.mo17136a(this, iVar2.f8484f + ((float) i));
        return null;
    }

    /* renamed from: a */
    public void mo17108a(C4898i iVar, int i) {
        if (!f8417s || iVar.f8482d != -1) {
            int i2 = iVar.f8482d;
            if (i2 != -1) {
                C4886b bVar = this.f8431g[i2];
                if (bVar.f8411f) {
                    bVar.f8407b = (float) i;
                } else if (bVar.f8410e.mo17059a() == 0) {
                    bVar.f8411f = true;
                    bVar.f8407b = (float) i;
                } else {
                    C4886b b = mo17114b();
                    b.mo17091c(iVar, i);
                    mo17105a(b);
                }
            } else {
                C4886b b2 = mo17114b();
                b2.mo17084b(iVar, i);
                mo17105a(b2);
            }
        } else {
            float f = (float) i;
            iVar.mo17136a(this, f);
            for (int i3 = 0; i3 < this.f8426b + 1; i3++) {
                C4898i iVar2 = this.f8438n.f8415d[i3];
                if (iVar2 != null && iVar2.f8492n && iVar2.f8493o == iVar.f8481c) {
                    iVar2.mo17136a(this, iVar2.f8494p + f);
                }
            }
        }
    }

    /* renamed from: a */
    public static C4886b m8309a(C4889d dVar, C4898i iVar, C4898i iVar2, float f) {
        C4886b b = dVar.mo17114b();
        b.mo17072a(iVar, iVar2, f);
        return b;
    }

    /* renamed from: a */
    public void mo17112a(C4907e eVar, C4907e eVar2, float f, int i) {
        C4907e eVar3 = eVar;
        C4907e eVar4 = eVar2;
        C4898i a = mo17104a((Object) eVar3.mo17194a(C4904d.C4906b.LEFT));
        C4898i a2 = mo17104a((Object) eVar3.mo17194a(C4904d.C4906b.TOP));
        C4898i a3 = mo17104a((Object) eVar3.mo17194a(C4904d.C4906b.RIGHT));
        C4898i a4 = mo17104a((Object) eVar3.mo17194a(C4904d.C4906b.BOTTOM));
        C4898i a5 = mo17104a((Object) eVar4.mo17194a(C4904d.C4906b.LEFT));
        C4898i a6 = mo17104a((Object) eVar4.mo17194a(C4904d.C4906b.TOP));
        C4898i a7 = mo17104a((Object) eVar4.mo17194a(C4904d.C4906b.RIGHT));
        C4898i a8 = mo17104a((Object) eVar4.mo17194a(C4904d.C4906b.BOTTOM));
        C4886b b = mo17114b();
        double d = (double) f;
        double sin = Math.sin(d);
        C4898i iVar = a3;
        double d2 = (double) i;
        Double.isNaN(d2);
        b.mo17086b(a2, a4, a6, a8, (float) (sin * d2));
        mo17105a(b);
        C4886b b2 = mo17114b();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        b2.mo17086b(a, iVar, a5, a7, (float) (cos * d2));
        mo17105a(b2);
    }
}
