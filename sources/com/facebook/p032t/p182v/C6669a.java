package com.facebook.p032t.p182v;

/* renamed from: com.facebook.t.v.a */
/* compiled from: MTensor */
public class C6669a {

    /* renamed from: a */
    private float[] f12428a;

    /* renamed from: b */
    private int[] f12429b;

    /* renamed from: c */
    private int f12430c;

    public C6669a(int[] iArr) {
        this.f12429b = iArr;
        int b = m14245b(iArr);
        this.f12430c = b;
        this.f12428a = new float[b];
    }

    /* renamed from: a */
    public float[] mo21433a() {
        return this.f12428a;
    }

    /* renamed from: b */
    public int mo21434b() {
        return this.f12429b.length;
    }

    /* renamed from: b */
    private static int m14245b(int[] iArr) {
        int i = 1;
        for (int i2 : iArr) {
            i *= i2;
        }
        return i;
    }

    /* renamed from: a */
    public int mo21431a(int i) {
        return this.f12429b[i];
    }

    /* renamed from: a */
    public void mo21432a(int[] iArr) {
        this.f12429b = iArr;
        int b = m14245b(iArr);
        float[] fArr = new float[b];
        System.arraycopy(this.f12428a, 0, fArr, 0, Math.min(this.f12430c, b));
        this.f12428a = fArr;
        this.f12430c = b;
    }
}
