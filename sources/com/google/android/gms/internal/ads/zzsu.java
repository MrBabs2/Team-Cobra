package com.google.android.gms.internal.ads;

public final class zzsu {

    /* renamed from: a */
    private byte[] f22663a;

    /* renamed from: b */
    private int f22664b;

    /* renamed from: c */
    private int f22665c;

    /* renamed from: d */
    private int f22666d = 0;

    public zzsu(byte[] bArr, int i, int i2) {
        this.f22663a = bArr;
        this.f22665c = i;
        this.f22664b = i2;
        m25264e();
    }

    /* renamed from: d */
    private final int m25263d() {
        int i = 0;
        int i2 = 0;
        while (!mo29746a()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo29745a(i2);
        }
        return i3 + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.f22666d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        r2 = r3.f22664b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m25264e() {
        /*
            r3 = this;
            int r0 = r3.f22665c
            if (r0 < 0) goto L_0x0016
            int r1 = r3.f22666d
            if (r1 < 0) goto L_0x0016
            r2 = 8
            if (r1 >= r2) goto L_0x0016
            int r2 = r3.f22664b
            if (r0 < r2) goto L_0x0014
            if (r0 != r2) goto L_0x0016
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            com.google.android.gms.internal.ads.zzsk.m25218b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsu.m25264e():void");
    }

    /* renamed from: a */
    public final boolean mo29746a() {
        return mo29745a(1) == 1;
    }

    /* renamed from: b */
    public final void mo29748b(int i) {
        int i2 = this.f22665c;
        int i3 = (i / 8) + i2;
        this.f22665c = i3;
        int i4 = this.f22666d + (i % 8);
        this.f22666d = i4;
        if (i4 > 7) {
            this.f22665c = i3 + 1;
            this.f22666d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f22665c) {
                m25264e();
                return;
            } else if (m25262c(i2)) {
                this.f22665c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: c */
    public final int mo29749c() {
        int d = m25263d();
        return (d % 2 == 0 ? -1 : 1) * ((d + 1) / 2);
    }

    /* renamed from: a */
    public final int mo29745a(int i) {
        byte b;
        byte b2;
        if (i == 0) {
            return 0;
        }
        int i2 = i / 8;
        byte b3 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = m25262c(this.f22665c + 1) ? this.f22665c + 2 : this.f22665c + 1;
            int i5 = this.f22666d;
            if (i5 != 0) {
                byte[] bArr = this.f22663a;
                b2 = ((bArr[i4] & 255) >>> (8 - i5)) | ((bArr[this.f22665c] & 255) << i5);
            } else {
                b2 = this.f22663a[this.f22665c];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.f22665c = i4;
        }
        if (i > 0) {
            int i6 = this.f22666d + i;
            byte b4 = (byte) (255 >> (8 - i));
            int i7 = m25262c(this.f22665c + 1) ? this.f22665c + 2 : this.f22665c + 1;
            if (i6 > 8) {
                byte[] bArr2 = this.f22663a;
                b = (b4 & (((255 & bArr2[i7]) >> (16 - i6)) | ((bArr2[this.f22665c] & 255) << (i6 - 8)))) | b3;
                this.f22665c = i7;
            } else {
                b = (b4 & ((255 & this.f22663a[this.f22665c]) >> (8 - i6))) | b3;
                if (i6 == 8) {
                    this.f22665c = i7;
                }
            }
            b3 = b;
            this.f22666d = i6 % 8;
        }
        m25264e();
        return b3;
    }

    /* renamed from: c */
    private final boolean m25262c(int i) {
        if (2 > i || i >= this.f22664b) {
            return false;
        }
        byte[] bArr = this.f22663a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
    }

    /* renamed from: b */
    public final int mo29747b() {
        return m25263d();
    }
}
