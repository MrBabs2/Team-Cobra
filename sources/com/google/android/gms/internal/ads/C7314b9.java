package com.google.android.gms.internal.ads;

import java.io.IOException;

@zzard
/* renamed from: com.google.android.gms.internal.ads.b9 */
final class C7314b9 implements zzjp {

    /* renamed from: a */
    private final zzjp f14562a;

    /* renamed from: b */
    private final long f14563b;

    /* renamed from: c */
    private final zzjp f14564c;

    /* renamed from: d */
    private long f14565d;

    C7314b9(zzjp zzjp, int i, zzjp zzjp2) {
        this.f14562a = zzjp;
        this.f14563b = (long) i;
        this.f14564c = zzjp2;
    }

    /* renamed from: a */
    public final long mo25635a(zzjq zzjq) throws IOException {
        zzjq zzjq2;
        zzjq zzjq3 = zzjq;
        long j = zzjq3.f22108c;
        long j2 = this.f14563b;
        zzjq zzjq4 = null;
        if (j >= j2) {
            zzjq2 = null;
        } else {
            long j3 = zzjq3.f22109d;
            zzjq2 = new zzjq(zzjq3.f22106a, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null);
        }
        long j4 = zzjq3.f22109d;
        if (j4 == -1 || zzjq3.f22108c + j4 > this.f14563b) {
            long max = Math.max(this.f14563b, zzjq3.f22108c);
            long j5 = zzjq3.f22109d;
            zzjq4 = new zzjq(zzjq3.f22106a, max, j5 != -1 ? Math.min(j5, (zzjq3.f22108c + j5) - this.f14563b) : -1, (String) null);
        }
        long j6 = 0;
        long a = zzjq2 != null ? this.f14562a.mo25635a(zzjq2) : 0;
        if (zzjq4 != null) {
            j6 = this.f14564c.mo25635a(zzjq4);
        }
        this.f14565d = zzjq3.f22108c;
        if (a == -1 || j6 == -1) {
            return -1;
        }
        return a + j6;
    }

    public final void close() throws IOException {
        this.f14562a.close();
        this.f14564c.close();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f14565d;
        long j2 = this.f14563b;
        if (j < j2) {
            i3 = this.f14562a.read(bArr, i, (int) Math.min((long) i2, j2 - j));
            this.f14565d += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.f14565d < this.f14563b) {
            return i3;
        }
        int read = this.f14564c.read(bArr, i + i3, i2 - i3);
        int i4 = i3 + read;
        this.f14565d += (long) read;
        return i4;
    }
}
