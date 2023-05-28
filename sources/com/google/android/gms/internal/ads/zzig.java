package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;

public final class zzig implements zzhn, zzif, zzka {

    /* renamed from: A */
    private int f22010A;

    /* renamed from: B */
    private long f22011B;

    /* renamed from: C */
    private boolean f22012C;

    /* renamed from: D */
    private int f22013D;

    /* renamed from: E */
    private int f22014E;

    /* renamed from: a */
    private final zzid f22015a;

    /* renamed from: b */
    private final zzjr f22016b;

    /* renamed from: c */
    private final int f22017c;

    /* renamed from: d */
    private final SparseArray<C7972sz> f22018d;

    /* renamed from: e */
    private final int f22019e;

    /* renamed from: f */
    private final boolean f22020f;

    /* renamed from: g */
    private final Uri f22021g;

    /* renamed from: h */
    private final zzjp f22022h;

    /* renamed from: i */
    private volatile boolean f22023i;

    /* renamed from: j */
    private volatile zzio f22024j;

    /* renamed from: k */
    private volatile zzhw f22025k;

    /* renamed from: l */
    private boolean f22026l;

    /* renamed from: m */
    private int f22027m;

    /* renamed from: n */
    private zzho[] f22028n;

    /* renamed from: o */
    private long f22029o;

    /* renamed from: p */
    private boolean[] f22030p;

    /* renamed from: q */
    private boolean[] f22031q;

    /* renamed from: r */
    private boolean[] f22032r;

    /* renamed from: s */
    private int f22033s;

    /* renamed from: t */
    private long f22034t;

    /* renamed from: u */
    private long f22035u;

    /* renamed from: v */
    private long f22036v;

    /* renamed from: w */
    private long f22037w;

    /* renamed from: x */
    private zzjz f22038x;

    /* renamed from: y */
    private C7935rz f22039y;

    /* renamed from: z */
    private IOException f22040z;

    public zzig(Uri uri, zzjp zzjp, zzid zzid, int i, int i2) {
        this(uri, zzjp, zzid, 2, i2, -1);
    }

    /* renamed from: f */
    private final void m24572f() {
        if (!this.f22012C && !this.f22038x.mo29408a()) {
            boolean z = true;
            if (this.f22040z != null) {
                if (this.f22039y == null) {
                    z = false;
                }
                zzkh.m24659b(z);
                if (SystemClock.elapsedRealtime() - this.f22011B >= Math.min((((long) this.f22010A) - 1) * 1000, 5000)) {
                    this.f22040z = null;
                    if (!this.f22026l) {
                        for (int i = 0; i < this.f22018d.size(); i++) {
                            this.f22018d.valueAt(i).mo29373a();
                        }
                        this.f22039y = m24574h();
                    } else {
                        this.f22024j.mo29367b();
                    }
                    this.f22014E = this.f22013D;
                    this.f22038x.mo29407a((zzkc) this.f22039y, (zzka) this);
                    return;
                }
                return;
            }
            this.f22037w = 0;
            if (!this.f22026l) {
                this.f22039y = m24574h();
            } else {
                zzkh.m24659b(m24576j());
                long j = this.f22029o;
                if (j == -1 || this.f22036v < j) {
                    this.f22039y = new C7935rz(this.f22021g, this.f22022h, this.f22015a, this.f22016b, this.f22017c, this.f22024j.mo29366a(this.f22036v));
                    this.f22036v = -1;
                } else {
                    this.f22012C = true;
                    this.f22036v = -1;
                    return;
                }
            }
            this.f22014E = this.f22013D;
            this.f22038x.mo29407a((zzkc) this.f22039y, (zzka) this);
        }
    }

    /* renamed from: g */
    private final void m24573g() throws IOException {
        if (this.f22040z != null) {
            int i = this.f22019e;
            if (i == -1) {
                if (this.f22024j != null) {
                    this.f22024j.mo29367b();
                }
                i = 3;
            }
            if (this.f22010A > i) {
                throw this.f22040z;
            }
        }
    }

    /* renamed from: h */
    private final C7935rz m24574h() {
        return new C7935rz(this.f22021g, this.f22022h, this.f22015a, this.f22016b, this.f22017c, 0);
    }

    /* renamed from: i */
    private final void m24575i() {
        for (int i = 0; i < this.f22018d.size(); i++) {
            this.f22018d.valueAt(i).mo29373a();
        }
        this.f22039y = null;
        this.f22040z = null;
        this.f22010A = 0;
    }

    /* renamed from: j */
    private final boolean m24576j() {
        return this.f22036v != -1;
    }

    /* renamed from: a */
    public final int mo29296a(int i, long j, zzhk zzhk, zzhm zzhm, boolean z) throws IOException {
        this.f22034t = j;
        boolean[] zArr = this.f22031q;
        int i2 = 0;
        if (zArr[i]) {
            zArr[i] = false;
            return -5;
        } else if (z || m24576j()) {
            m24573g();
            return -2;
        } else {
            C7972sz valueAt = this.f22018d.valueAt(i);
            if (this.f22030p[i]) {
                zzhk.f21959a = valueAt.mo29381d();
                zzhk.f21960b = this.f22025k;
                this.f22030p[i] = false;
                return -4;
            } else if (valueAt.mo29377a(zzhm)) {
                boolean z2 = this.f22020f && zzhm.f21965e < this.f22035u;
                int i3 = zzhm.f21964d;
                if (z2) {
                    i2 = 134217728;
                }
                zzhm.f21964d = i3 | i2;
                zzhm.f21965e += this.f22037w;
                return -3;
            } else if (this.f22012C) {
                return -1;
            } else {
                m24573g();
                return -2;
            }
        }
    }

    /* renamed from: b */
    public final boolean mo29301b(long j) throws IOException {
        boolean z;
        if (this.f22026l) {
            return true;
        }
        if (this.f22038x == null) {
            this.f22038x = new zzjz("Loader:ExtractorSampleSource");
        }
        m24571e();
        if (this.f22024j != null && this.f22023i) {
            int i = 0;
            while (true) {
                if (i >= this.f22018d.size()) {
                    z = true;
                    break;
                } else if (!this.f22018d.valueAt(i).mo29380c()) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                int size = this.f22018d.size();
                this.f22032r = new boolean[size];
                this.f22031q = new boolean[size];
                this.f22030p = new boolean[size];
                this.f22028n = new zzho[size];
                this.f22029o = -1;
                for (int i2 = 0; i2 < size; i2++) {
                    zzhj d = this.f22018d.valueAt(i2).mo29381d();
                    this.f22028n[i2] = new zzho(d.f21946a, d.f21948c);
                    long j2 = d.f21948c;
                    if (j2 != -1 && j2 > this.f22029o) {
                        this.f22029o = j2;
                    }
                }
                this.f22026l = true;
                return true;
            }
        }
        m24573g();
        return false;
    }

    /* renamed from: c */
    public final void mo29302c(int i) {
        zzkh.m24659b(this.f22026l);
        zzkh.m24659b(this.f22032r[i]);
        int i2 = this.f22027m - 1;
        this.f22027m = i2;
        this.f22032r[i] = false;
        this.f22031q[i] = false;
        if (i2 != 0) {
            return;
        }
        if (this.f22038x.mo29408a()) {
            this.f22038x.mo29410c();
            return;
        }
        m24575i();
        this.f22016b.mo29406b(0);
    }

    /* renamed from: d */
    public final int mo29304d() {
        return this.f22018d.size();
    }

    /* renamed from: e */
    public final void mo29305e(int i, long j) {
        zzkh.m24659b(this.f22026l);
        zzkh.m24659b(!this.f22032r[i]);
        int i2 = this.f22027m + 1;
        this.f22027m = i2;
        this.f22032r[i] = true;
        this.f22030p[i] = true;
        if (i2 == 1) {
            mo29298a(j);
        }
    }

    private zzig(Uri uri, zzjp zzjp, zzid zzid, int i, int i2, int i3) {
        this.f22021g = uri;
        this.f22022h = zzjp;
        this.f22015a = zzid;
        this.f22033s = 2;
        this.f22017c = i2;
        this.f22019e = -1;
        this.f22018d = new SparseArray<>();
        this.f22016b = new zzjr(262144);
        this.f22036v = -1;
        this.f22020f = true;
        zzid.mo29385a(this);
    }

    /* renamed from: d */
    private final void m24570d(long j) {
        this.f22036v = j;
        this.f22012C = false;
        if (this.f22038x.mo29408a()) {
            this.f22038x.mo29410c();
            return;
        }
        m24575i();
        m24572f();
    }

    /* renamed from: e */
    private final boolean m24571e() throws IOException {
        boolean z;
        m24572f();
        boolean z2 = false;
        if (m24576j()) {
            return false;
        }
        if (this.f22026l) {
            int i = 0;
            while (true) {
                boolean[] zArr = this.f22032r;
                if (i < zArr.length) {
                    if (zArr[i] && !this.f22018d.valueAt(i).mo29378b()) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        if (!z2) {
            m24573g();
        }
        return z2;
    }

    /* renamed from: c */
    public final boolean mo29303c(long j) throws IOException {
        zzkh.m24659b(this.f22026l);
        zzkh.m24659b(this.f22027m > 0);
        this.f22034t = j;
        int i = 0;
        while (true) {
            boolean[] zArr = this.f22032r;
            if (i >= zArr.length) {
                break;
            }
            if (!zArr[i]) {
                this.f22018d.valueAt(i).mo29374a(j);
            }
            i++;
        }
        return this.f22012C || m24571e();
    }

    /* renamed from: a */
    public final void mo29298a(long j) {
        zzkh.m24659b(this.f22026l);
        int i = 0;
        zzkh.m24659b(this.f22027m > 0);
        this.f22024j.mo29367b();
        this.f22035u = j;
        if ((m24576j() ? this.f22036v : this.f22034t) != j) {
            this.f22034t = j;
            boolean z = !m24576j();
            int i2 = 0;
            while (z && i2 < this.f22018d.size()) {
                z &= this.f22018d.valueAt(i2).mo29379b(j);
                i2++;
            }
            if (!z) {
                m24570d(j);
            }
            while (true) {
                boolean[] zArr = this.f22031q;
                if (i < zArr.length) {
                    zArr[i] = true;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo29389c() {
        this.f22023i = true;
    }

    /* renamed from: b */
    public final zzho mo29300b(int i) {
        zzkh.m24659b(this.f22026l);
        return this.f22028n[i];
    }

    /* renamed from: b */
    public final long mo29299b() {
        if (this.f22012C) {
            return -3;
        }
        if (m24576j()) {
            return this.f22036v;
        }
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.f22018d.size(); i++) {
            j = Math.max(j, this.f22018d.valueAt(i).mo29382e());
        }
        return j == Long.MIN_VALUE ? this.f22034t : j;
    }

    /* renamed from: a */
    public final void mo29297a() {
        zzjz zzjz;
        zzkh.m24659b(this.f22033s > 0);
        int i = this.f22033s - 1;
        this.f22033s = i;
        if (i == 0 && (zzjz = this.f22038x) != null) {
            zzjz.mo29409b();
            this.f22038x = null;
        }
    }

    /* renamed from: b */
    public final void mo29392b(zzkc zzkc) {
        if (this.f22027m > 0) {
            m24570d(this.f22036v);
            return;
        }
        m24575i();
        this.f22016b.mo29406b(0);
    }

    /* renamed from: a */
    public final void mo29390a(zzkc zzkc) {
        this.f22012C = true;
    }

    /* renamed from: a */
    public final void mo29391a(zzkc zzkc, IOException iOException) {
        this.f22040z = iOException;
        int i = 1;
        if (this.f22013D <= this.f22014E) {
            i = 1 + this.f22010A;
        }
        this.f22010A = i;
        this.f22011B = SystemClock.elapsedRealtime();
        m24572f();
    }

    /* renamed from: a */
    public final zzip mo29386a(int i) {
        C7972sz szVar = this.f22018d.get(i);
        if (szVar != null) {
            return szVar;
        }
        C7972sz szVar2 = new C7972sz(this, this.f22016b);
        this.f22018d.put(i, szVar2);
        return szVar2;
    }

    /* renamed from: a */
    public final void mo29388a(zzio zzio) {
        this.f22024j = zzio;
    }

    /* renamed from: a */
    public final void mo29387a(zzhw zzhw) {
        this.f22025k = zzhw;
    }

    /* renamed from: a */
    static /* synthetic */ int m24569a(zzig zzig) {
        int i = zzig.f22013D;
        zzig.f22013D = i + 1;
        return i;
    }
}
