package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzqt implements zznw {

    /* renamed from: a */
    private final zzrt f22541a;

    /* renamed from: b */
    private final int f22542b;

    /* renamed from: c */
    private final j30 f22543c = new j30();

    /* renamed from: d */
    private final zzqs f22544d = new zzqs();

    /* renamed from: e */
    private final zzst f22545e = new zzst(32);

    /* renamed from: f */
    private final AtomicInteger f22546f = new AtomicInteger();

    /* renamed from: g */
    private k30 f22547g;

    /* renamed from: h */
    private k30 f22548h;

    /* renamed from: i */
    private zzlh f22549i;

    /* renamed from: j */
    private zzlh f22550j;

    /* renamed from: k */
    private long f22551k;

    /* renamed from: l */
    private int f22552l;

    /* renamed from: m */
    private zzqv f22553m;

    public zzqt(zzrt zzrt) {
        this.f22541a = zzrt;
        this.f22542b = zzrt.mo29698a();
        int i = this.f22542b;
        this.f22552l = i;
        k30 k30 = new k30(0, i);
        this.f22547g = k30;
        this.f22548h = k30;
    }

    /* renamed from: g */
    private final void m25086g() {
        this.f22543c.mo26117b();
        k30 k30 = this.f22547g;
        if (k30.f15813c) {
            k30 k302 = this.f22548h;
            int i = (k302.f15813c ? 1 : 0) + (((int) (k302.f15811a - k30.f15811a)) / this.f22542b);
            zzrs[] zzrsArr = new zzrs[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzrsArr[i2] = k30.f15814d;
                k30 = k30.mo26161a();
            }
            this.f22541a.mo29700a(zzrsArr);
        }
        k30 k303 = new k30(0, this.f22542b);
        this.f22547g = k303;
        this.f22548h = k303;
        this.f22551k = 0;
        this.f22552l = this.f22542b;
        this.f22541a.mo29701b();
    }

    /* renamed from: h */
    private final boolean m25087h() {
        return this.f22546f.compareAndSet(0, 1);
    }

    /* renamed from: i */
    private final void m25088i() {
        if (!this.f22546f.compareAndSet(1, 0)) {
            m25086g();
        }
    }

    /* renamed from: a */
    public final void mo29640a(boolean z) {
        int andSet = this.f22546f.getAndSet(z ? 0 : 2);
        m25086g();
        this.f22543c.mo26118c();
        if (andSet == 2) {
            this.f22549i = null;
        }
    }

    /* renamed from: b */
    public final long mo29642b() {
        return this.f22543c.mo26112a();
    }

    /* renamed from: c */
    public final int mo29643c() {
        return this.f22543c.mo26119d();
    }

    /* renamed from: d */
    public final boolean mo29644d() {
        return this.f22543c.mo26120e();
    }

    /* renamed from: e */
    public final zzlh mo29645e() {
        return this.f22543c.mo26121f();
    }

    /* renamed from: f */
    public final void mo29646f() {
        long g = this.f22543c.mo26122g();
        if (g != -1) {
            m25084a(g);
        }
    }

    /* renamed from: a */
    public final void mo29638a() {
        if (this.f22546f.getAndSet(2) == 0) {
            m25086g();
        }
    }

    /* renamed from: a */
    public final boolean mo29641a(long j, boolean z) {
        long a = this.f22543c.mo26113a(j, z);
        if (a == -1) {
            return false;
        }
        m25084a(a);
        return true;
    }

    /* renamed from: a */
    public final int mo29637a(zzlj zzlj, zznd zznd, boolean z, boolean z2, long j) {
        int i;
        zznd zznd2 = zznd;
        int a = this.f22543c.mo26111a(zzlj, zznd, z, z2, this.f22549i, this.f22544d);
        if (a == -5) {
            this.f22549i = zzlj.f22205a;
            return -5;
        } else if (a == -4) {
            if (!zznd.mo29544c()) {
                if (zznd2.f22334d < j) {
                    zznd2.mo29542b(Integer.MIN_VALUE);
                }
                if (zznd.mo29553e()) {
                    zzqs zzqs = this.f22544d;
                    long j2 = zzqs.f22538b;
                    this.f22545e.mo29723a(1);
                    m25085a(j2, this.f22545e.f22660a, 1);
                    long j3 = j2 + 1;
                    byte b = this.f22545e.f22660a[0];
                    boolean z3 = (b & 128) != 0;
                    byte b2 = b & Byte.MAX_VALUE;
                    zzmz zzmz = zznd2.f22332b;
                    if (zzmz.f22312a == null) {
                        zzmz.f22312a = new byte[16];
                    }
                    m25085a(j3, zznd2.f22332b.f22312a, (int) b2);
                    long j4 = j3 + ((long) b2);
                    if (z3) {
                        this.f22545e.mo29723a(2);
                        m25085a(j4, this.f22545e.f22660a, 2);
                        j4 += 2;
                        i = this.f22545e.mo29736h();
                    } else {
                        i = 1;
                    }
                    int[] iArr = zznd2.f22332b.f22315d;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zznd2.f22332b.f22316e;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i2 = i * 6;
                        this.f22545e.mo29723a(i2);
                        m25085a(j4, this.f22545e.f22660a, i2);
                        j4 += (long) i2;
                        this.f22545e.mo29727b(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr2[i3] = this.f22545e.mo29736h();
                            iArr4[i3] = this.f22545e.mo29740l();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzqs.f22537a - ((int) (j4 - zzqs.f22538b));
                    }
                    zznx zznx = zzqs.f22540d;
                    zzmz zzmz2 = zznd2.f22332b;
                    zzmz2.mo29548a(i, iArr2, iArr4, zznx.f22360b, zzmz2.f22312a, zznx.f22359a);
                    long j5 = zzqs.f22538b;
                    int i4 = (int) (j4 - j5);
                    zzqs.f22538b = j5 + ((long) i4);
                    zzqs.f22537a -= i4;
                }
                zznd2.mo29552d(this.f22544d.f22537a);
                zzqs zzqs2 = this.f22544d;
                long j6 = zzqs2.f22538b;
                ByteBuffer byteBuffer = zznd2.f22333c;
                int i5 = zzqs2.f22537a;
                m25084a(j6);
                while (i5 > 0) {
                    int i6 = (int) (j6 - this.f22547g.f15811a);
                    int min = Math.min(i5, this.f22542b - i6);
                    zzrs zzrs = this.f22547g.f15814d;
                    byteBuffer.put(zzrs.f22604a, zzrs.mo29697a(i6), min);
                    j6 += (long) min;
                    i5 -= min;
                    if (j6 == this.f22547g.f15812b) {
                        this.f22541a.mo29699a(zzrs);
                        this.f22547g = this.f22547g.mo26161a();
                    }
                }
                m25084a(this.f22544d.f22539c);
            }
            return -4;
        } else if (a == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private final void m25085a(long j, byte[] bArr, int i) {
        m25084a(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.f22547g.f15811a);
            int min = Math.min(i - i2, this.f22542b - i3);
            zzrs zzrs = this.f22547g.f15814d;
            System.arraycopy(zzrs.f22604a, zzrs.mo29697a(i3), bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.f22547g.f15812b) {
                this.f22541a.mo29699a(zzrs);
                this.f22547g = this.f22547g.mo26161a();
            }
        }
    }

    /* renamed from: a */
    private final void m25084a(long j) {
        while (true) {
            k30 k30 = this.f22547g;
            if (j >= k30.f15812b) {
                this.f22541a.mo29699a(k30.f15814d);
                this.f22547g = this.f22547g.mo26161a();
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo29639a(zzqv zzqv) {
        this.f22553m = zzqv;
    }

    /* renamed from: a */
    public final void mo29591a(zzlh zzlh) {
        zzlh zzlh2 = zzlh == null ? null : zzlh;
        boolean a = this.f22543c.mo26116a(zzlh2);
        this.f22550j = zzlh;
        zzqv zzqv = this.f22553m;
        if (zzqv != null && a) {
            zzqv.mo26865a(zzlh2);
        }
    }

    /* renamed from: a */
    public final int mo29589a(zzno zzno, int i, boolean z) throws IOException, InterruptedException {
        if (!m25087h()) {
            int b = zzno.mo29576b(i);
            if (b != -1) {
                return b;
            }
            throw new EOFException();
        }
        try {
            int a = m25083a(i);
            zzrs zzrs = this.f22548h.f15814d;
            int read = zzno.read(zzrs.f22604a, zzrs.mo29697a(this.f22552l), a);
            if (read != -1) {
                this.f22552l += read;
                this.f22551k += (long) read;
                return read;
            }
            throw new EOFException();
        } finally {
            m25088i();
        }
    }

    /* renamed from: a */
    public final void mo29592a(zzst zzst, int i) {
        if (!m25087h()) {
            zzst.mo29729c(i);
            return;
        }
        while (i > 0) {
            int a = m25083a(i);
            zzrs zzrs = this.f22548h.f15814d;
            zzst.mo29725a(zzrs.f22604a, zzrs.mo29697a(this.f22552l), a);
            this.f22552l += a;
            this.f22551k += (long) a;
            i -= a;
        }
        m25088i();
    }

    /* renamed from: a */
    public final void mo29590a(long j, int i, int i2, int i3, zznx zznx) {
        if (!m25087h()) {
            long j2 = j;
            this.f22543c.mo26114a(j);
            return;
        }
        long j3 = j;
        try {
            this.f22543c.mo26115a(j, i, this.f22551k - ((long) i2), i2, zznx);
        } finally {
            m25088i();
        }
    }

    /* renamed from: a */
    private final int m25083a(int i) {
        if (this.f22552l == this.f22542b) {
            this.f22552l = 0;
            k30 k30 = this.f22548h;
            if (k30.f15813c) {
                this.f22548h = k30.f15815e;
            }
            k30 k302 = this.f22548h;
            zzrs c = this.f22541a.mo29702c();
            k30 k303 = new k30(this.f22548h.f15812b, this.f22542b);
            k302.f15814d = c;
            k302.f15815e = k303;
            k302.f15813c = true;
        }
        return Math.min(i, this.f22542b - this.f22552l);
    }
}
