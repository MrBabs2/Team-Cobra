package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzjo implements zzjp {

    /* renamed from: a */
    private final byte[] f22103a;

    /* renamed from: b */
    private int f22104b;

    /* renamed from: c */
    private int f22105c;

    public zzjo(byte[] bArr) {
        zzkh.m24656a(bArr);
        zzkh.m24657a(bArr.length > 0);
        this.f22103a = bArr;
    }

    /* renamed from: a */
    public final long mo25635a(zzjq zzjq) throws IOException {
        long j = zzjq.f22108c;
        this.f22104b = (int) j;
        long j2 = zzjq.f22109d;
        if (j2 == -1) {
            j2 = ((long) this.f22103a.length) - j;
        }
        int i = (int) j2;
        this.f22105c = i;
        if (i > 0 && this.f22104b + i <= this.f22103a.length) {
            return (long) i;
        }
        int i2 = this.f22104b;
        long j3 = zzjq.f22109d;
        int length = this.f22103a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i2);
        sb.append(", ");
        sb.append(j3);
        sb.append("], length: ");
        sb.append(length);
        throw new IOException(sb.toString());
    }

    public final void close() throws IOException {
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f22105c;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f22103a, this.f22104b, bArr, i, min);
        this.f22104b += min;
        this.f22105c -= min;
        return min;
    }
}
