package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

public final class zzbg extends zzdst {

    /* renamed from: o */
    private Date f18932o;

    /* renamed from: p */
    private Date f18933p;

    /* renamed from: q */
    private long f18934q;

    /* renamed from: r */
    private long f18935r;

    /* renamed from: s */
    private double f18936s = 1.0d;

    /* renamed from: t */
    private float f18937t = 1.0f;

    /* renamed from: u */
    private zzdtd f18938u = zzdtd.f21740j;

    /* renamed from: v */
    private long f18939v;

    public zzbg() {
        super("mvhd");
    }

    /* renamed from: a */
    public final void mo26104a(ByteBuffer byteBuffer) {
        mo29214b(byteBuffer);
        if (mo29213b() == 1) {
            this.f18932o = zzdsy.m24219a(zzbc.m20576c(byteBuffer));
            this.f18933p = zzdsy.m24219a(zzbc.m20576c(byteBuffer));
            this.f18934q = zzbc.m20574a(byteBuffer);
            this.f18935r = zzbc.m20576c(byteBuffer);
        } else {
            this.f18932o = zzdsy.m24219a(zzbc.m20574a(byteBuffer));
            this.f18933p = zzdsy.m24219a(zzbc.m20574a(byteBuffer));
            this.f18934q = zzbc.m20574a(byteBuffer);
            this.f18935r = zzbc.m20574a(byteBuffer);
        }
        this.f18936s = zzbc.m20577d(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f18937t = ((float) ((short) ((bArr[1] & 255) | ((short) (0 | ((bArr[0] << 8) & 65280)))))) / 256.0f;
        zzbc.m20575b(byteBuffer);
        zzbc.m20574a(byteBuffer);
        zzbc.m20574a(byteBuffer);
        this.f18938u = zzdtd.m24223a(byteBuffer);
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f18939v = zzbc.m20574a(byteBuffer);
    }

    /* renamed from: c */
    public final long mo28085c() {
        return this.f18935r;
    }

    /* renamed from: d */
    public final long mo28086d() {
        return this.f18934q;
    }

    public final String toString() {
        return "MovieHeaderBox[" + "creationTime=" + this.f18932o + ";" + "modificationTime=" + this.f18933p + ";" + "timescale=" + this.f18934q + ";" + "duration=" + this.f18935r + ";" + "rate=" + this.f18936s + ";" + "volume=" + this.f18937t + ";" + "matrix=" + this.f18938u + ";" + "nextTrackId=" + this.f18939v + "]";
    }
}
