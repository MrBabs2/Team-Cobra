package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzsn {

    /* renamed from: a */
    private int f22649a;

    /* renamed from: b */
    private long[] f22650b;

    public zzsn() {
        this(32);
    }

    /* renamed from: a */
    public final void mo29720a(long j) {
        int i = this.f22649a;
        long[] jArr = this.f22650b;
        if (i == jArr.length) {
            this.f22650b = Arrays.copyOf(jArr, i << 1);
        }
        long[] jArr2 = this.f22650b;
        int i2 = this.f22649a;
        this.f22649a = i2 + 1;
        jArr2[i2] = j;
    }

    private zzsn(int i) {
        this.f22650b = new long[32];
    }

    /* renamed from: a */
    public final long mo29719a(int i) {
        if (i >= 0 && i < this.f22649a) {
            return this.f22650b[i];
        }
        int i2 = this.f22649a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public final int mo29718a() {
        return this.f22649a;
    }
}
