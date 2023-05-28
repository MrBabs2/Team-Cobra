package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzdtd {

    /* renamed from: j */
    public static final zzdtd f21740j = new zzdtd(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k */
    private static final zzdtd f21741k = new zzdtd(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l */
    private static final zzdtd f21742l = new zzdtd(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m */
    private static final zzdtd f21743m = new zzdtd(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a */
    private final double f21744a;

    /* renamed from: b */
    private final double f21745b;

    /* renamed from: c */
    private final double f21746c;

    /* renamed from: d */
    private final double f21747d;

    /* renamed from: e */
    private final double f21748e;

    /* renamed from: f */
    private final double f21749f;

    /* renamed from: g */
    private final double f21750g;

    /* renamed from: h */
    private final double f21751h;

    /* renamed from: i */
    private final double f21752i;

    private zzdtd(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f21744a = d5;
        this.f21745b = d6;
        this.f21746c = d7;
        this.f21747d = d;
        this.f21748e = d2;
        this.f21749f = d3;
        this.f21750g = d4;
        this.f21751h = d8;
        this.f21752i = d9;
    }

    /* renamed from: a */
    public static zzdtd m24223a(ByteBuffer byteBuffer) {
        double d = zzbc.m20577d(byteBuffer);
        double d2 = zzbc.m20577d(byteBuffer);
        double e = zzbc.m20578e(byteBuffer);
        return new zzdtd(d, d2, zzbc.m20577d(byteBuffer), zzbc.m20577d(byteBuffer), e, zzbc.m20578e(byteBuffer), zzbc.m20578e(byteBuffer), zzbc.m20577d(byteBuffer), zzbc.m20577d(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdtd.class != obj.getClass()) {
            return false;
        }
        zzdtd zzdtd = (zzdtd) obj;
        return Double.compare(zzdtd.f21747d, this.f21747d) == 0 && Double.compare(zzdtd.f21748e, this.f21748e) == 0 && Double.compare(zzdtd.f21749f, this.f21749f) == 0 && Double.compare(zzdtd.f21750g, this.f21750g) == 0 && Double.compare(zzdtd.f21751h, this.f21751h) == 0 && Double.compare(zzdtd.f21752i, this.f21752i) == 0 && Double.compare(zzdtd.f21744a, this.f21744a) == 0 && Double.compare(zzdtd.f21745b, this.f21745b) == 0 && Double.compare(zzdtd.f21746c, this.f21746c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f21744a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f21745b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f21746c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f21747d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f21748e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f21749f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f21750g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f21751h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f21752i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f21740j)) {
            return "Rotate 0°";
        }
        if (equals(f21741k)) {
            return "Rotate 90°";
        }
        if (equals(f21742l)) {
            return "Rotate 180°";
        }
        if (equals(f21743m)) {
            return "Rotate 270°";
        }
        double d = this.f21744a;
        double d2 = this.f21745b;
        double d3 = this.f21746c;
        double d4 = this.f21747d;
        double d5 = this.f21748e;
        double d6 = this.f21749f;
        double d7 = this.f21750g;
        double d8 = this.f21751h;
        double d9 = this.f21752i;
        double d10 = d7;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d10);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
