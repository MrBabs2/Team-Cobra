package com.google.android.gms.internal.ads;

public final class zzln {

    /* renamed from: d */
    public static final zzln f22206d = new zzln(1.0f, 1.0f);

    /* renamed from: a */
    public final float f22207a;

    /* renamed from: b */
    public final float f22208b;

    /* renamed from: c */
    private final int f22209c;

    public zzln(float f, float f2) {
        this.f22207a = f;
        this.f22208b = f2;
        this.f22209c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo29477a(long j) {
        return j * ((long) this.f22209c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzln.class == obj.getClass()) {
            zzln zzln = (zzln) obj;
            return this.f22207a == zzln.f22207a && this.f22208b == zzln.f22208b;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f22207a) + 527) * 31) + Float.floatToRawIntBits(this.f22208b);
    }
}
