package com.google.android.gms.internal.ads;

public final class zzh implements zzac {

    /* renamed from: a */
    private int f21926a;

    /* renamed from: b */
    private int f21927b;

    /* renamed from: c */
    private final int f21928c;

    /* renamed from: d */
    private final float f21929d;

    public zzh() {
        this(2500, 1, 1.0f);
    }

    /* renamed from: D */
    public final int mo27140D() {
        return this.f21926a;
    }

    /* renamed from: a */
    public final void mo27141a(zzaf zzaf) throws zzaf {
        boolean z = true;
        int i = this.f21927b + 1;
        this.f21927b = i;
        int i2 = this.f21926a;
        this.f21926a = i2 + ((int) (((float) i2) * this.f21929d));
        if (i > this.f21928c) {
            z = false;
        }
        if (!z) {
            throw zzaf;
        }
    }

    /* renamed from: g */
    public final int mo27142g() {
        return this.f21927b;
    }

    private zzh(int i, int i2, float f) {
        this.f21926a = 2500;
        this.f21928c = 1;
        this.f21929d = 1.0f;
    }
}
