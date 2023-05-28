package com.google.android.gms.internal.ads;

import java.io.IOException;

final class i00 {

    /* renamed from: d */
    private static final int[] f15551d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f15552a = new byte[8];

    /* renamed from: b */
    private int f15553b;

    /* renamed from: c */
    private int f15554c;

    /* renamed from: a */
    public final void mo26063a() {
        this.f15553b = 0;
        this.f15554c = 0;
    }

    /* renamed from: b */
    public final int mo26064b() {
        return this.f15554c;
    }

    /* renamed from: a */
    public final long mo26062a(zzie zzie, boolean z, boolean z2) throws IOException, InterruptedException {
        if (this.f15553b == 0) {
            if (!zzie.mo29369a(this.f15552a, 0, 1, z)) {
                return -1;
            }
            byte b = this.f15552a[0] & 255;
            this.f15554c = -1;
            int i = 0;
            while (true) {
                int[] iArr = f15551d;
                if (i >= iArr.length) {
                    break;
                } else if ((iArr[i] & b) != 0) {
                    this.f15554c = i + 1;
                    break;
                } else {
                    i++;
                }
            }
            if (this.f15554c != -1) {
                this.f15553b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        zzie.readFully(this.f15552a, 1, this.f15554c - 1);
        if (z2) {
            byte[] bArr = this.f15552a;
            bArr[0] = (byte) (bArr[0] & (f15551d[this.f15554c - 1] ^ -1));
        }
        long j = 0;
        for (int i2 = 0; i2 < this.f15554c; i2++) {
            j = (j << 8) | ((long) (this.f15552a[i2] & 255));
        }
        this.f15553b = 0;
        return j;
    }
}
