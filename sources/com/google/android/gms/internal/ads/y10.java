package com.google.android.gms.internal.ads;

import java.io.IOException;

final class y10 {

    /* renamed from: a */
    private final zzst f17260a = new zzst(8);

    /* renamed from: b */
    private int f17261b;

    /* renamed from: b */
    private final long m18483b(zzno zzno) throws IOException, InterruptedException {
        int i = 0;
        zzno.mo29574a(this.f17260a.f22660a, 0, 1);
        byte b = this.f17260a.f22660a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        zzno.mo29574a(this.f17260a.f22660a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f17260a.f22660a[i] & 255) + (i4 << 8);
        }
        this.f17261b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: a */
    public final boolean mo26793a(zzno zzno) throws IOException, InterruptedException {
        zzno zzno2 = zzno;
        long b = zzno.mo29577b();
        long j = 1024;
        if (b != -1 && b <= 1024) {
            j = b;
        }
        int i = (int) j;
        zzno2.mo29574a(this.f17260a.f22660a, 0, 4);
        this.f17261b = 4;
        for (long j2 = this.f17260a.mo29738j(); j2 != 440786851; j2 = ((j2 << 8) & -256) | ((long) (this.f17260a.f22660a[0] & 255))) {
            int i2 = this.f17261b + 1;
            this.f17261b = i2;
            if (i2 == i) {
                return false;
            }
            zzno2.mo29574a(this.f17260a.f22660a, 0, 1);
        }
        long b2 = m18483b(zzno);
        long j3 = (long) this.f17261b;
        if (b2 != Long.MIN_VALUE && (b == -1 || j3 + b2 < b)) {
            while (true) {
                int i3 = this.f17261b;
                long j4 = j3 + b2;
                if (((long) i3) < j4) {
                    if (m18483b(zzno) == Long.MIN_VALUE) {
                        return false;
                    }
                    long b3 = m18483b(zzno);
                    if (b3 < 0 || b3 > 2147483647L) {
                        return false;
                    }
                    if (b3 != 0) {
                        zzno2.mo29578c((int) b3);
                        this.f17261b = (int) (((long) this.f17261b) + b3);
                    }
                } else if (((long) i3) == j4) {
                    return true;
                }
            }
        }
        return false;
    }
}
