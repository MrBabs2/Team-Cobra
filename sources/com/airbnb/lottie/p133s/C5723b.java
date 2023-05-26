package com.airbnb.lottie.p133s;

/* renamed from: com.airbnb.lottie.s.b */
/* compiled from: DocumentData */
public class C5723b {

    /* renamed from: a */
    public final String f10226a;

    /* renamed from: b */
    public final String f10227b;

    /* renamed from: c */
    public final double f10228c;

    /* renamed from: d */
    final int f10229d;

    /* renamed from: e */
    public final int f10230e;

    /* renamed from: f */
    final double f10231f;

    /* renamed from: g */
    public final double f10232g;

    /* renamed from: h */
    public final int f10233h;

    /* renamed from: i */
    public final int f10234i;

    /* renamed from: j */
    public final double f10235j;

    /* renamed from: k */
    public final boolean f10236k;

    public C5723b(String str, String str2, double d, int i, int i2, double d2, double d3, int i3, int i4, double d4, boolean z) {
        this.f10226a = str;
        this.f10227b = str2;
        this.f10228c = d;
        this.f10229d = i;
        this.f10230e = i2;
        this.f10231f = d2;
        this.f10232g = d3;
        this.f10233h = i3;
        this.f10234i = i4;
        this.f10235j = d4;
        this.f10236k = z;
    }

    public int hashCode() {
        double hashCode = (double) (((this.f10226a.hashCode() * 31) + this.f10227b.hashCode()) * 31);
        double d = this.f10228c;
        Double.isNaN(hashCode);
        int i = (((((int) (hashCode + d)) * 31) + this.f10229d) * 31) + this.f10230e;
        long doubleToLongBits = Double.doubleToLongBits(this.f10231f);
        return (((i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f10233h;
    }
}
