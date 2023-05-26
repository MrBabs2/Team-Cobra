package com.google.android.gms.internal.ads;

public final class zzdmh {

    /* renamed from: a */
    private final byte[] f21485a = new byte[256];

    /* renamed from: b */
    private int f21486b;

    /* renamed from: c */
    private int f21487c;

    public zzdmh(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f21485a[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            byte[] bArr2 = this.f21485a;
            b = (b + bArr2[i2] + bArr[i2 % bArr.length]) & 255;
            byte b2 = bArr2[i2];
            bArr2[i2] = bArr2[b];
            bArr2[b] = b2;
        }
        this.f21486b = 0;
        this.f21487c = 0;
    }

    /* renamed from: a */
    public final void mo29061a(byte[] bArr) {
        int i = this.f21486b;
        int i2 = this.f21487c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.f21485a;
            i2 = (i2 + bArr2[i]) & 255;
            byte b = bArr2[i];
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + bArr2[i2]) & 255] ^ bArr[i3]);
        }
        this.f21486b = i;
        this.f21487c = i2;
    }
}
