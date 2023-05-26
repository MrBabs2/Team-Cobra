package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzkk {

    /* renamed from: a */
    private int f22148a;

    /* renamed from: b */
    private long[] f22149b;

    public zzkk() {
        this(32);
    }

    /* renamed from: a */
    public final void mo29416a(long j) {
        int i = this.f22148a;
        long[] jArr = this.f22149b;
        if (i == jArr.length) {
            this.f22149b = Arrays.copyOf(jArr, i << 1);
        }
        long[] jArr2 = this.f22149b;
        int i2 = this.f22148a;
        this.f22148a = i2 + 1;
        jArr2[i2] = j;
    }

    private zzkk(int i) {
        this.f22149b = new long[32];
    }

    /* renamed from: a */
    public final long mo29415a(int i) {
        if (i >= 0 && i < this.f22148a) {
            return this.f22149b[i];
        }
        int i2 = this.f22148a;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Invalid size ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public final int mo29414a() {
        return this.f22148a;
    }
}
