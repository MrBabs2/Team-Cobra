package com.google.zxing.p197g;

import java.util.Arrays;

/* renamed from: com.google.zxing.g.b */
/* compiled from: BitMatrix */
public final class C8825b implements Cloneable {

    /* renamed from: f */
    private final int f25054f;

    /* renamed from: g */
    private final int f25055g;

    /* renamed from: h */
    private final int f25056h;

    /* renamed from: i */
    private final int[] f25057i;

    public C8825b(int i) {
        this(i, i);
    }

    /* renamed from: a */
    public boolean mo32598a(int i, int i2) {
        return ((this.f25057i[(i2 * this.f25056h) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: b */
    public void mo32600b(int i, int i2) {
        int i3 = (i2 * this.f25056h) + (i / 32);
        int[] iArr = this.f25057i;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* renamed from: c */
    public int mo32601c() {
        return this.f25055g;
    }

    /* renamed from: e */
    public int mo32603e() {
        return this.f25054f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8825b)) {
            return false;
        }
        C8825b bVar = (C8825b) obj;
        if (this.f25054f == bVar.f25054f && this.f25055g == bVar.f25055g && this.f25056h == bVar.f25056h && Arrays.equals(this.f25057i, bVar.f25057i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f25054f;
        return (((((((i * 31) + i) * 31) + this.f25055g) * 31) + this.f25056h) * 31) + Arrays.hashCode(this.f25057i);
    }

    public String toString() {
        return mo32596a("X ", "  ");
    }

    public C8825b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f25054f = i;
        this.f25055g = i2;
        int i3 = (i + 31) / 32;
        this.f25056h = i3;
        this.f25057i = new int[(i3 * i2)];
    }

    public C8825b clone() {
        return new C8825b(this.f25054f, this.f25055g, this.f25056h, (int[]) this.f25057i.clone());
    }

    /* renamed from: a */
    public void mo32597a(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f25055g || i5 > this.f25054f) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f25056h * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f25057i;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    /* renamed from: b */
    public void mo32599b() {
        int length = this.f25057i.length;
        for (int i = 0; i < length; i++) {
            this.f25057i[i] = 0;
        }
    }

    private C8825b(int i, int i2, int i3, int[] iArr) {
        this.f25054f = i;
        this.f25055g = i2;
        this.f25056h = i3;
        this.f25057i = iArr;
    }

    /* renamed from: a */
    public String mo32596a(String str, String str2) {
        return m28811a(str, str2, "\n");
    }

    /* renamed from: a */
    private String m28811a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f25055g * (this.f25054f + 1));
        for (int i = 0; i < this.f25055g; i++) {
            for (int i2 = 0; i2 < this.f25054f; i2++) {
                sb.append(mo32598a(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }
}
