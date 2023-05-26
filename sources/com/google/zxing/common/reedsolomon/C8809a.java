package com.google.zxing.common.reedsolomon;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.zxing.common.reedsolomon.a */
/* compiled from: GenericGF */
public final class C8809a {

    /* renamed from: g */
    public static final C8809a f25017g = new C8809a(4201, RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT, 1);

    /* renamed from: h */
    public static final C8809a f25018h = new C8809a(1033, 1024, 1);

    /* renamed from: i */
    public static final C8809a f25019i = new C8809a(67, 64, 1);

    /* renamed from: j */
    public static final C8809a f25020j = new C8809a(19, 16, 1);

    /* renamed from: k */
    public static final C8809a f25021k = new C8809a(285, 256, 0);

    /* renamed from: l */
    public static final C8809a f25022l = new C8809a(301, 256, 1);

    /* renamed from: a */
    private final int[] f25023a;

    /* renamed from: b */
    private final int[] f25024b;

    /* renamed from: c */
    private final C8810b f25025c;

    /* renamed from: d */
    private final int f25026d;

    /* renamed from: e */
    private final int f25027e;

    /* renamed from: f */
    private final int f25028f;

    public C8809a(int i, int i2, int i3) {
        this.f25027e = i;
        this.f25026d = i2;
        this.f25028f = i3;
        this.f25023a = new int[i2];
        this.f25024b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f25023a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f25024b[this.f25023a[i6]] = i6;
        }
        this.f25025c = new C8810b(this, new int[]{0});
        new C8810b(this, new int[]{1});
    }

    /* renamed from: c */
    static int m28741c(int i, int i2) {
        return i ^ i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8810b mo32542a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f25025c;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C8810b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C8810b mo32545b() {
        return this.f25025c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo32546c(int i) {
        if (i != 0) {
            return this.f25024b[i];
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f25027e) + ',' + this.f25026d + ')';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo32543b(int i) {
        if (i != 0) {
            return this.f25023a[(this.f25026d - this.f25024b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo32544b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f25023a;
        int[] iArr2 = this.f25024b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f25026d - 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo32541a(int i) {
        return this.f25023a[i];
    }

    /* renamed from: a */
    public int mo32540a() {
        return this.f25028f;
    }
}
