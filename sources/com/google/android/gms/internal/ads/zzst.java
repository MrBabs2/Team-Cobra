package com.google.android.gms.internal.ads;

public final class zzst {

    /* renamed from: a */
    public byte[] f22660a;

    /* renamed from: b */
    private int f22661b;

    /* renamed from: c */
    private int f22662c;

    public zzst() {
    }

    /* renamed from: a */
    public final void mo29723a(int i) {
        mo29724a(mo29722a() < i ? new byte[i] : this.f22660a, i);
    }

    /* renamed from: b */
    public final int mo29726b() {
        return this.f22661b;
    }

    /* renamed from: c */
    public final int mo29728c() {
        return this.f22662c;
    }

    /* renamed from: d */
    public final void mo29731d(int i) {
        zzsk.m25216a(i >= 0 && i <= this.f22660a.length);
        this.f22662c = i;
    }

    /* renamed from: e */
    public final long mo29732e() {
        byte[] bArr = this.f22660a;
        int i = this.f22661b;
        int i2 = i + 1;
        this.f22661b = i2;
        int i3 = i2 + 1;
        this.f22661b = i3;
        int i4 = i3 + 1;
        this.f22661b = i4;
        int i5 = i4 + 1;
        this.f22661b = i5;
        int i6 = i5 + 1;
        this.f22661b = i6;
        int i7 = i6 + 1;
        this.f22661b = i7;
        int i8 = i7 + 1;
        this.f22661b = i8;
        this.f22661b = i8 + 1;
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8);
    }

    /* renamed from: f */
    public final short mo29734f() {
        byte[] bArr = this.f22660a;
        int i = this.f22661b;
        int i2 = i + 1;
        this.f22661b = i2;
        this.f22661b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: g */
    public final int mo29735g() {
        byte[] bArr = this.f22660a;
        int i = this.f22661b;
        this.f22661b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: h */
    public final int mo29736h() {
        byte[] bArr = this.f22660a;
        int i = this.f22661b;
        int i2 = i + 1;
        this.f22661b = i2;
        this.f22661b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: i */
    public final void mo29737i() {
        this.f22661b = 0;
        this.f22662c = 0;
    }

    /* renamed from: j */
    public final long mo29738j() {
        byte[] bArr = this.f22660a;
        int i = this.f22661b;
        int i2 = i + 1;
        this.f22661b = i2;
        int i3 = i2 + 1;
        this.f22661b = i3;
        int i4 = i3 + 1;
        this.f22661b = i4;
        this.f22661b = i4 + 1;
        return (((long) bArr[i4]) & 255) | ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8);
    }

    /* renamed from: k */
    public final int mo29739k() {
        byte[] bArr = this.f22660a;
        int i = this.f22661b;
        int i2 = i + 1;
        this.f22661b = i2;
        int i3 = i2 + 1;
        this.f22661b = i3;
        byte b = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f22661b = i3 + 2;
        return b;
    }

    /* renamed from: l */
    public final int mo29740l() {
        int d = mo29730d();
        if (d >= 0) {
            return d;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(d);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: m */
    public final long mo29741m() {
        long e = mo29732e();
        if (e >= 0) {
            return e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: n */
    public final int mo29742n() {
        return this.f22662c - this.f22661b;
    }

    /* renamed from: o */
    public final int mo29743o() {
        byte[] bArr = this.f22660a;
        int i = this.f22661b;
        int i2 = i + 1;
        this.f22661b = i2;
        this.f22661b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: p */
    public final long mo29744p() {
        byte[] bArr = this.f22660a;
        int i = this.f22661b;
        int i2 = i + 1;
        this.f22661b = i2;
        int i3 = i2 + 1;
        this.f22661b = i3;
        int i4 = i3 + 1;
        this.f22661b = i4;
        this.f22661b = i4 + 1;
        return ((((long) bArr[i4]) & 255) << 24) | (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16);
    }

    public zzst(int i) {
        this.f22660a = new byte[i];
        this.f22662c = i;
    }

    /* renamed from: a */
    public final void mo29724a(byte[] bArr, int i) {
        this.f22660a = bArr;
        this.f22662c = i;
        this.f22661b = 0;
    }

    /* renamed from: b */
    public final void mo29727b(int i) {
        zzsk.m25216a(i >= 0 && i <= this.f22662c);
        this.f22661b = i;
    }

    /* renamed from: c */
    public final void mo29729c(int i) {
        mo29727b(this.f22661b + i);
    }

    /* renamed from: e */
    public final String mo29733e(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.f22661b + i) - 1;
        String str = new String(this.f22660a, this.f22661b, (i2 >= this.f22662c || this.f22660a[i2] != 0) ? i : i - 1);
        this.f22661b += i;
        return str;
    }

    /* renamed from: d */
    public final int mo29730d() {
        byte[] bArr = this.f22660a;
        int i = this.f22661b;
        int i2 = i + 1;
        this.f22661b = i2;
        int i3 = i2 + 1;
        this.f22661b = i3;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        this.f22661b = i4;
        byte b2 = b | ((bArr[i3] & 255) << 8);
        this.f22661b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    public zzst(byte[] bArr) {
        this.f22660a = bArr;
        this.f22662c = bArr.length;
    }

    /* renamed from: a */
    public final int mo29722a() {
        byte[] bArr = this.f22660a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: a */
    public final void mo29725a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f22660a, this.f22661b, bArr, i, i2);
        this.f22661b += i2;
    }
}
