package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

final class z20 implements zznp, zzqj, zzqv, zzsf<e30> {

    /* renamed from: A */
    private boolean f17513A;

    /* renamed from: B */
    private int f17514B;

    /* renamed from: C */
    private zzrb f17515C;

    /* renamed from: D */
    private long f17516D;

    /* renamed from: E */
    private boolean[] f17517E;

    /* renamed from: F */
    private boolean[] f17518F;

    /* renamed from: G */
    private boolean f17519G;

    /* renamed from: H */
    private long f17520H;

    /* renamed from: I */
    private long f17521I;

    /* renamed from: J */
    private long f17522J;

    /* renamed from: K */
    private int f17523K;

    /* renamed from: L */
    private boolean f17524L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f17525M;

    /* renamed from: f */
    private final Uri f17526f;

    /* renamed from: g */
    private final zzrv f17527g;

    /* renamed from: h */
    private final int f17528h;

    /* renamed from: i */
    private final Handler f17529i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final zzqi f17530j;

    /* renamed from: k */
    private final zzqm f17531k;

    /* renamed from: l */
    private final zzrt f17532l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final String f17533m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final long f17534n;

    /* renamed from: o */
    private final zzse f17535o = new zzse("Loader:ExtractorMediaPeriod");

    /* renamed from: p */
    private final f30 f17536p;

    /* renamed from: q */
    private final zzsm f17537q;

    /* renamed from: r */
    private final Runnable f17538r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Runnable f17539s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Handler f17540t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final SparseArray<zzqt> f17541u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public zzqk f17542v;

    /* renamed from: w */
    private zznu f17543w;

    /* renamed from: x */
    private boolean f17544x;

    /* renamed from: y */
    private boolean f17545y;

    /* renamed from: z */
    private boolean f17546z;

    public z20(Uri uri, zzrv zzrv, zznn[] zznnArr, int i, Handler handler, zzqi zzqi, zzqm zzqm, zzrt zzrt, String str, int i2) {
        this.f17526f = uri;
        this.f17527g = zzrv;
        this.f17528h = i;
        this.f17529i = handler;
        this.f17530j = zzqi;
        this.f17531k = zzqm;
        this.f17532l = zzrt;
        this.f17533m = str;
        this.f17534n = (long) i2;
        this.f17536p = new f30(zznnArr, this);
        this.f17537q = new zzsm();
        this.f17538r = new a30(this);
        this.f17539s = new b30(this);
        this.f17540t = new Handler();
        this.f17522J = -9223372036854775807L;
        this.f17541u = new SparseArray<>();
        this.f17520H = -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        r0 = r9.f17543w;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m18598i() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.e30 r6 = new com.google.android.gms.internal.ads.e30
            android.net.Uri r2 = r9.f17526f
            com.google.android.gms.internal.ads.zzrv r3 = r9.f17527g
            com.google.android.gms.internal.ads.f30 r4 = r9.f17536p
            com.google.android.gms.internal.ads.zzsm r5 = r9.f17537q
            r0 = r6
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r9.f17545y
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0040
            boolean r0 = r9.m18599j()
            com.google.android.gms.internal.ads.zzsk.m25218b(r0)
            long r3 = r9.f17516D
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            long r7 = r9.f17522J
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0031
            r0 = 1
            r9.f17524L = r0
            r9.f17522J = r1
            return
        L_0x0031:
            com.google.android.gms.internal.ads.zznu r0 = r9.f17543w
            long r3 = r9.f17522J
            long r3 = r0.mo29569a(r3)
            long r7 = r9.f17522J
            r6.mo25855a(r3, r7)
            r9.f17522J = r1
        L_0x0040:
            int r0 = r9.m18601l()
            r9.f17523K = r0
            int r0 = r9.f17528h
            r3 = -1
            if (r0 != r3) goto L_0x0067
            boolean r0 = r9.f17545y
            if (r0 == 0) goto L_0x0066
            long r3 = r9.f17520H
            r7 = -1
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0066
            com.google.android.gms.internal.ads.zznu r0 = r9.f17543w
            if (r0 == 0) goto L_0x0064
            long r3 = r0.mo29571c()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r0 = 6
            goto L_0x0067
        L_0x0066:
            r0 = 3
        L_0x0067:
            com.google.android.gms.internal.ads.zzse r1 = r9.f17535o
            r1.mo29710a(r6, r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z20.m18598i():void");
    }

    /* renamed from: j */
    private final boolean m18599j() {
        return this.f17522J != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: k */
    public final void m18600k() {
        /*
            r8 = this;
            boolean r0 = r8.f17525M
            if (r0 != 0) goto L_0x009d
            boolean r0 = r8.f17545y
            if (r0 != 0) goto L_0x009d
            com.google.android.gms.internal.ads.zznu r0 = r8.f17543w
            if (r0 == 0) goto L_0x009d
            boolean r0 = r8.f17544x
            if (r0 != 0) goto L_0x0012
            goto L_0x009d
        L_0x0012:
            android.util.SparseArray<com.google.android.gms.internal.ads.zzqt> r0 = r8.f17541u
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x002e
            android.util.SparseArray<com.google.android.gms.internal.ads.zzqt> r3 = r8.f17541u
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.zzqt r3 = (com.google.android.gms.internal.ads.zzqt) r3
            com.google.android.gms.internal.ads.zzlh r3 = r3.mo29645e()
            if (r3 != 0) goto L_0x002b
            return
        L_0x002b:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002e:
            com.google.android.gms.internal.ads.zzsm r2 = r8.f17537q
            r2.mo29717c()
            com.google.android.gms.internal.ads.zzra[] r2 = new com.google.android.gms.internal.ads.zzra[r0]
            boolean[] r3 = new boolean[r0]
            r8.f17518F = r3
            boolean[] r3 = new boolean[r0]
            r8.f17517E = r3
            com.google.android.gms.internal.ads.zznu r3 = r8.f17543w
            long r3 = r3.mo29571c()
            r8.f17516D = r3
            r3 = 0
        L_0x0046:
            r4 = 1
            if (r3 >= r0) goto L_0x007c
            android.util.SparseArray<com.google.android.gms.internal.ads.zzqt> r5 = r8.f17541u
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.zzqt r5 = (com.google.android.gms.internal.ads.zzqt) r5
            com.google.android.gms.internal.ads.zzlh r5 = r5.mo29645e()
            com.google.android.gms.internal.ads.zzra r6 = new com.google.android.gms.internal.ads.zzra
            com.google.android.gms.internal.ads.zzlh[] r7 = new com.google.android.gms.internal.ads.zzlh[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.f22189k
            boolean r6 = com.google.android.gms.internal.ads.zzsp.m25235c(r5)
            if (r6 != 0) goto L_0x0070
            boolean r5 = com.google.android.gms.internal.ads.zzsp.m25234b(r5)
            if (r5 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            boolean[] r5 = r8.f17518F
            r5[r3] = r4
            boolean r5 = r8.f17519G
            r4 = r4 | r5
            r8.f17519G = r4
            int r3 = r3 + 1
            goto L_0x0046
        L_0x007c:
            com.google.android.gms.internal.ads.zzrb r0 = new com.google.android.gms.internal.ads.zzrb
            r0.<init>(r2)
            r8.f17515C = r0
            r8.f17545y = r4
            com.google.android.gms.internal.ads.zzqm r0 = r8.f17531k
            com.google.android.gms.internal.ads.zzqz r1 = new com.google.android.gms.internal.ads.zzqz
            long r2 = r8.f17516D
            com.google.android.gms.internal.ads.zznu r4 = r8.f17543w
            boolean r4 = r4.mo29570b()
            r1.<init>(r2, r4)
            r2 = 0
            r0.mo26072a(r1, r2)
            com.google.android.gms.internal.ads.zzqk r0 = r8.f17542v
            r0.mo26001a(r8)
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z20.m18600k():void");
    }

    /* renamed from: l */
    private final int m18601l() {
        int size = this.f17541u.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f17541u.valueAt(i2).mo29643c();
        }
        return i;
    }

    /* renamed from: m */
    private final long m18602m() {
        int size = this.f17541u.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.f17541u.valueAt(i).mo29642b());
        }
        return j;
    }

    /* renamed from: a */
    public final void mo26002a(zzqk zzqk, long j) {
        this.f17542v = zzqk;
        this.f17537q.mo29716b();
        m18598i();
    }

    /* renamed from: b */
    public final long mo26005b() {
        long j;
        if (this.f17524L) {
            return Long.MIN_VALUE;
        }
        if (m18599j()) {
            return this.f17522J;
        }
        if (this.f17519G) {
            j = Long.MAX_VALUE;
            int size = this.f17541u.size();
            for (int i = 0; i < size; i++) {
                if (this.f17518F[i]) {
                    j = Math.min(j, this.f17541u.valueAt(i).mo29642b());
                }
            }
        } else {
            j = m18602m();
        }
        return j == Long.MIN_VALUE ? this.f17521I : j;
    }

    /* renamed from: c */
    public final void mo26871c() {
        this.f17544x = true;
        this.f17540t.post(this.f17538r);
    }

    /* renamed from: c */
    public final void mo26007c(long j) {
    }

    /* renamed from: d */
    public final long mo26008d() {
        if (!this.f17513A) {
            return -9223372036854775807L;
        }
        this.f17513A = false;
        return this.f17521I;
    }

    /* renamed from: e */
    public final void mo26009e() throws IOException {
        this.f17535o.mo29711a(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public final zzrb mo26010f() {
        return this.f17515C;
    }

    /* renamed from: g */
    public final void mo26872g() {
        this.f17535o.mo29712a((Runnable) new c30(this, this.f17536p));
        this.f17540t.removeCallbacksAndMessages((Object) null);
        this.f17525M = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo26873h() throws IOException {
        this.f17535o.mo29711a(Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final long mo26000a(zzrm[] zzrmArr, boolean[] zArr, zzqw[] zzqwArr, boolean[] zArr2, long j) {
        zzsk.m25218b(this.f17545y);
        for (int i = 0; i < zzrmArr.length; i++) {
            if (zzqwArr[i] != null && (zzrmArr[i] == null || !zArr[i])) {
                int a = zzqwArr[i].f15268a;
                zzsk.m25218b(this.f17517E[a]);
                this.f17514B--;
                this.f17517E[a] = false;
                this.f17541u.valueAt(a).mo29638a();
                zzqwArr[i] = null;
            }
        }
        boolean z = false;
        for (int i2 = 0; i2 < zzrmArr.length; i2++) {
            if (zzqwArr[i2] == null && zzrmArr[i2] != null) {
                zzrm zzrm = zzrmArr[i2];
                zzsk.m25218b(zzrm.length() == 1);
                zzsk.m25218b(zzrm.mo29678a(0) == 0);
                int a2 = this.f17515C.mo29674a(zzrm.mo29679a());
                zzsk.m25218b(!this.f17517E[a2]);
                this.f17514B++;
                this.f17517E[a2] = true;
                zzqwArr[i2] = new g30(this, a2);
                zArr2[i2] = true;
                z = true;
            }
        }
        if (!this.f17546z) {
            int size = this.f17541u.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!this.f17517E[i3]) {
                    this.f17541u.valueAt(i3).mo29638a();
                }
            }
        }
        if (this.f17514B == 0) {
            this.f17513A = false;
            if (this.f17535o.mo29713a()) {
                this.f17535o.mo29714b();
            }
        } else if (!this.f17546z ? j != 0 : z) {
            j = mo26006b(j);
            for (int i4 = 0; i4 < zzqwArr.length; i4++) {
                if (zzqwArr[i4] != null) {
                    zArr2[i4] = true;
                }
            }
        }
        this.f17546z = true;
        return j;
    }

    /* renamed from: b */
    public final long mo26006b(long j) {
        if (!this.f17543w.mo29570b()) {
            j = 0;
        }
        this.f17521I = j;
        int size = this.f17541u.size();
        boolean z = !m18599j();
        int i = 0;
        while (z && i < size) {
            if (this.f17517E[i]) {
                z = this.f17541u.valueAt(i).mo29641a(j, false);
            }
            i++;
        }
        if (!z) {
            this.f17522J = j;
            this.f17524L = false;
            if (this.f17535o.mo29713a()) {
                this.f17535o.mo29714b();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.f17541u.valueAt(i2).mo29640a(this.f17517E[i2]);
                }
            }
        }
        this.f17513A = false;
        return j;
    }

    /* renamed from: b */
    public final zznw mo26870b(int i, int i2) {
        zzqt zzqt = this.f17541u.get(i);
        if (zzqt != null) {
            return zzqt;
        }
        zzqt zzqt2 = new zzqt(this.f17532l);
        zzqt2.mo29639a((zzqv) this);
        this.f17541u.put(i, zzqt2);
        return zzqt2;
    }

    /* renamed from: a */
    public final boolean mo26004a(long j) {
        if (this.f17524L) {
            return false;
        }
        if (this.f17545y && this.f17514B == 0) {
            return false;
        }
        boolean b = this.f17537q.mo29716b();
        if (this.f17535o.mo29713a()) {
            return b;
        }
        m18598i();
        return true;
    }

    /* renamed from: a */
    public final long mo25999a() {
        if (this.f17514B == 0) {
            return Long.MIN_VALUE;
        }
        return mo26005b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo26869a(int i) {
        if (!this.f17524L) {
            return !m18599j() && this.f17541u.valueAt(i).mo29644d();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo26862a(int i, zzlj zzlj, zznd zznd, boolean z) {
        if (this.f17513A || m18599j()) {
            return -3;
        }
        return this.f17541u.valueAt(i).mo29637a(zzlj, zznd, z, this.f17524L, this.f17521I);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26864a(int i, long j) {
        zzqt valueAt = this.f17541u.valueAt(i);
        if (!this.f17524L || j <= valueAt.mo29642b()) {
            valueAt.mo29641a(j, true);
        } else {
            valueAt.mo29646f();
        }
    }

    /* renamed from: a */
    public final void mo26866a(zznu zznu) {
        this.f17543w = zznu;
        this.f17540t.post(this.f17538r);
    }

    /* renamed from: a */
    public final void mo26865a(zzlh zzlh) {
        this.f17540t.post(this.f17538r);
    }

    /* renamed from: a */
    private final void m18588a(e30 e30) {
        if (this.f17520H == -1) {
            this.f17520H = e30.f15063i;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ int mo26863a(zzsh zzsh, long j, long j2, IOException iOException) {
        zznu zznu;
        e30 e30 = (e30) zzsh;
        m18588a(e30);
        Handler handler = this.f17529i;
        if (!(handler == null || this.f17530j == null)) {
            handler.post(new d30(this, iOException));
        }
        if (iOException instanceof zzrc) {
            return 3;
        }
        boolean z = m18601l() > this.f17523K;
        if (this.f17520H == -1 && ((zznu = this.f17543w) == null || zznu.mo29571c() == -9223372036854775807L)) {
            this.f17521I = 0;
            this.f17513A = this.f17545y;
            int size = this.f17541u.size();
            for (int i = 0; i < size; i++) {
                this.f17541u.valueAt(i).mo29640a(!this.f17545y || this.f17517E[i]);
            }
            e30.mo25855a(0, 0);
        }
        this.f17523K = m18601l();
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo26868a(zzsh zzsh, long j, long j2, boolean z) {
        m18588a((e30) zzsh);
        if (!z && this.f17514B > 0) {
            int size = this.f17541u.size();
            for (int i = 0; i < size; i++) {
                this.f17541u.valueAt(i).mo29640a(this.f17517E[i]);
            }
            this.f17542v.mo26003a(this);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo26867a(zzsh zzsh, long j, long j2) {
        m18588a((e30) zzsh);
        this.f17524L = true;
        if (this.f17516D == -9223372036854775807L) {
            long m = m18602m();
            this.f17516D = m == Long.MIN_VALUE ? 0 : m + 10000;
            this.f17531k.mo26072a(new zzqz(this.f17516D, this.f17543w.mo29570b()), (Object) null);
        }
        this.f17542v.mo26003a(this);
    }
}
