package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.google.android.gms.internal.ads.tz */
final class C8009tz {

    /* renamed from: a */
    private final zzjl f16921a;

    /* renamed from: b */
    private final int f16922b;

    /* renamed from: c */
    private final C8083vz f16923c = new C8083vz();

    /* renamed from: d */
    private final LinkedBlockingDeque<zzjk> f16924d = new LinkedBlockingDeque<>();

    /* renamed from: e */
    private final C8120wz f16925e = new C8120wz();

    /* renamed from: f */
    private final zzkm f16926f = new zzkm(32);

    /* renamed from: g */
    private long f16927g;

    /* renamed from: h */
    private long f16928h;

    /* renamed from: i */
    private zzjk f16929i;

    /* renamed from: j */
    private int f16930j = this.f16922b;

    public C8009tz(zzjl zzjl) {
        this.f16921a = zzjl;
        this.f16922b = zzjl.mo29401a();
    }

    /* renamed from: d */
    private final void m18254d() {
        if (this.f16930j == this.f16922b) {
            this.f16930j = 0;
            zzjk b = this.f16921a.mo29403b();
            this.f16929i = b;
            this.f16924d.add(b);
        }
    }

    /* renamed from: a */
    public final void mo26628a() {
        this.f16923c.mo26714a();
        while (!this.f16924d.isEmpty()) {
            this.f16921a.mo29402a(this.f16924d.remove());
        }
        this.f16927g = 0;
        this.f16928h = 0;
        this.f16929i = null;
        this.f16930j = this.f16922b;
    }

    /* renamed from: b */
    public final void mo26633b() {
        m18253b(this.f16923c.mo26717b());
    }

    /* renamed from: c */
    public final long mo26635c() {
        return this.f16928h;
    }

    /* renamed from: b */
    public final boolean mo26634b(zzhm zzhm) {
        int i;
        if (!this.f16923c.mo26716a(zzhm, this.f16925e)) {
            return false;
        }
        if (zzhm.mo29338a()) {
            C8120wz wzVar = this.f16925e;
            long j = wzVar.f17107a;
            m18252a(j, this.f16926f.f22150a, 1);
            long j2 = j + 1;
            byte b = this.f16926f.f22150a[0];
            boolean z = (b & 128) != 0;
            byte b2 = b & Byte.MAX_VALUE;
            zzgb zzgb = zzhm.f21961a;
            if (zzgb.f21870a == null) {
                zzgb.f21870a = new byte[16];
            }
            m18252a(j2, zzhm.f21961a.f21870a, b2);
            long j3 = j2 + ((long) b2);
            if (z) {
                m18252a(j3, this.f16926f.f22150a, 2);
                j3 += 2;
                this.f16926f.mo29418a(0);
                i = this.f16926f.mo29426f();
            } else {
                i = 1;
            }
            int[] iArr = zzhm.f21961a.f21873d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhm.f21961a.f21874e;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i2 = i * 6;
                zzkm zzkm = this.f16926f;
                if (zzkm.mo29421b() < i2) {
                    zzkm.mo29419a(new byte[i2], i2);
                }
                m18252a(j3, this.f16926f.f22150a, i2);
                j3 += (long) i2;
                this.f16926f.mo29418a(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr2[i3] = this.f16926f.mo29426f();
                    iArr4[i3] = this.f16926f.mo29429i();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzhm.f21963c - ((int) (j3 - wzVar.f17107a));
            }
            zzgb zzgb2 = zzhm.f21961a;
            zzgb2.mo29293a(i, iArr2, iArr4, wzVar.f17108b, zzgb2.f21870a, 1);
            long j4 = wzVar.f17107a;
            int i4 = (int) (j3 - j4);
            wzVar.f17107a = j4 + ((long) i4);
            zzhm.f21963c -= i4;
        }
        ByteBuffer byteBuffer = zzhm.f21962b;
        if (byteBuffer == null || byteBuffer.capacity() < zzhm.f21963c) {
            int i5 = zzhm.f21963c;
        }
        ByteBuffer byteBuffer2 = zzhm.f21962b;
        if (byteBuffer2 != null) {
            long j5 = this.f16925e.f17107a;
            int i6 = zzhm.f21963c;
            while (i6 > 0) {
                m18253b(j5);
                int i7 = (int) (j5 - this.f16927g);
                int min = Math.min(i6, this.f16922b - i7);
                byteBuffer2.put(this.f16924d.peek().f22097a, i7 + 0, min);
                j5 += (long) min;
                i6 -= min;
            }
        }
        m18253b(this.f16923c.mo26717b());
        return true;
    }

    /* renamed from: a */
    public final boolean mo26632a(zzhm zzhm) {
        return this.f16923c.mo26716a(zzhm, this.f16925e);
    }

    /* renamed from: a */
    public final boolean mo26631a(long j) {
        long a = this.f16923c.mo26713a(j);
        if (a == -1) {
            return false;
        }
        m18253b(a);
        return true;
    }

    /* renamed from: a */
    private final void m18252a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            m18253b(j);
            int i3 = (int) (j - this.f16927g);
            int min = Math.min(i - i2, this.f16922b - i3);
            System.arraycopy(this.f16924d.peek().f22097a, i3 + 0, bArr, i2, min);
            j += (long) min;
            i2 += min;
        }
    }

    /* renamed from: a */
    public final int mo26627a(zzie zzie, int i) throws IOException, InterruptedException {
        m18254d();
        int min = Math.min(i, this.f16922b - this.f16930j);
        zzie.readFully(this.f16929i.f22097a, this.f16930j + 0, min);
        this.f16930j += min;
        this.f16928h += (long) min;
        return min;
    }

    /* renamed from: a */
    public final void mo26630a(zzkm zzkm, int i) {
        int i2 = i;
        while (i2 > 0) {
            m18254d();
            int min = Math.min(i2, this.f16922b - this.f16930j);
            zzkm.mo29420a(this.f16929i.f22097a, this.f16930j + 0, min);
            this.f16930j += min;
            i2 -= min;
        }
        this.f16928h += (long) i;
    }

    /* renamed from: a */
    public final void mo26629a(long j, int i, long j2, int i2, byte[] bArr) {
        this.f16923c.mo26715a(j, i, j2, i2, bArr);
    }

    /* renamed from: b */
    private final void m18253b(long j) {
        int i = ((int) (j - this.f16927g)) / this.f16922b;
        for (int i2 = 0; i2 < i; i2++) {
            this.f16921a.mo29402a(this.f16924d.remove());
            this.f16927g += (long) this.f16922b;
        }
    }
}
