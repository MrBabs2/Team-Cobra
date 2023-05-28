package com.google.android.gms.internal.ads;

public final class zzkm {

    /* renamed from: a */
    public byte[] f22150a;

    /* renamed from: b */
    private int f22151b;

    /* renamed from: c */
    private int f22152c;

    public zzkm() {
    }

    /* renamed from: a */
    public final void mo29419a(byte[] bArr, int i) {
        this.f22150a = bArr;
        this.f22152c = i;
        this.f22151b = 0;
    }

    /* renamed from: b */
    public final int mo29421b() {
        return this.f22152c;
    }

    /* renamed from: c */
    public final int mo29423c() {
        byte[] bArr = this.f22150a;
        int i = this.f22151b;
        int i2 = i + 1;
        this.f22151b = i2;
        int i3 = i2 + 1;
        this.f22151b = i3;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        this.f22151b = i4;
        byte b2 = b | ((bArr[i3] & 255) << 8);
        this.f22151b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    /* renamed from: d */
    public final long mo29424d() {
        byte[] bArr = this.f22150a;
        int i = this.f22151b;
        int i2 = i + 1;
        this.f22151b = i2;
        int i3 = i2 + 1;
        this.f22151b = i3;
        int i4 = i3 + 1;
        this.f22151b = i4;
        int i5 = i4 + 1;
        this.f22151b = i5;
        int i6 = i5 + 1;
        this.f22151b = i6;
        int i7 = i6 + 1;
        this.f22151b = i7;
        int i8 = i7 + 1;
        this.f22151b = i8;
        this.f22151b = i8 + 1;
        return (((long) bArr[i8]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8);
    }

    /* renamed from: e */
    public final int mo29425e() {
        byte[] bArr = this.f22150a;
        int i = this.f22151b;
        this.f22151b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: f */
    public final int mo29426f() {
        byte[] bArr = this.f22150a;
        int i = this.f22151b;
        int i2 = i + 1;
        this.f22151b = i2;
        this.f22151b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: g */
    public final long mo29427g() {
        byte[] bArr = this.f22150a;
        int i = this.f22151b;
        int i2 = i + 1;
        this.f22151b = i2;
        int i3 = i2 + 1;
        this.f22151b = i3;
        int i4 = i3 + 1;
        this.f22151b = i4;
        this.f22151b = i4 + 1;
        return (((long) bArr[i4]) & 255) | ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8);
    }

    /* renamed from: h */
    public final int mo29428h() {
        byte[] bArr = this.f22150a;
        int i = this.f22151b;
        int i2 = i + 1;
        this.f22151b = i2;
        int i3 = i2 + 1;
        this.f22151b = i3;
        byte b = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f22151b = i3 + 2;
        return b;
    }

    /* renamed from: i */
    public final int mo29429i() {
        int c = mo29423c();
        if (c >= 0) {
            return c;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(c);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: j */
    public final long mo29430j() {
        long d = mo29424d();
        if (d >= 0) {
            return d;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(d);
        throw new IllegalStateException(sb.toString());
    }

    public zzkm(int i) {
        byte[] bArr = new byte[i];
        this.f22150a = bArr;
        this.f22152c = bArr.length;
    }

    /* renamed from: b */
    public final void mo29422b(int i) {
        mo29418a(this.f22151b + i);
    }

    /* renamed from: a */
    public final int mo29417a() {
        return this.f22151b;
    }

    public zzkm(byte[] bArr) {
        this.f22150a = bArr;
        this.f22152c = bArr.length;
    }

    /* renamed from: a */
    public final void mo29418a(int i) {
        zzkh.m24657a(i >= 0 && i <= this.f22152c);
        this.f22151b = i;
    }

    /* renamed from: a */
    public final void mo29420a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f22150a, this.f22151b, bArr, i, i2);
        this.f22151b += i2;
    }
}
