package com.google.android.gms.internal.ads;

import java.io.IOException;

final class z10 {

    /* renamed from: d */
    private static final long[] f17507d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f17508a = new byte[8];

    /* renamed from: b */
    private int f17509b;

    /* renamed from: c */
    private int f17510c;

    /* renamed from: a */
    public final void mo26860a() {
        this.f17509b = 0;
        this.f17510c = 0;
    }

    /* renamed from: b */
    public final int mo26861b() {
        return this.f17510c;
    }

    /* renamed from: a */
    public final long mo26859a(zzno zzno, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f17509b == 0) {
            if (!zzno.mo29575a(this.f17508a, 0, 1, z)) {
                return -1;
            }
            int a = m18582a(this.f17508a[0] & 255);
            this.f17510c = a;
            if (a != -1) {
                this.f17509b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f17510c;
        if (i2 > i) {
            this.f17509b = 0;
            return -2;
        }
        if (i2 != 1) {
            zzno.readFully(this.f17508a, 1, i2 - 1);
        }
        this.f17509b = 0;
        return m18583a(this.f17508a, this.f17510c, z2);
    }

    /* renamed from: a */
    public static int m18582a(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f17507d;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    /* renamed from: a */
    public static long m18583a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f17507d[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
