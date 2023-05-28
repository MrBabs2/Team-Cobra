package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

public final class zzays {

    /* renamed from: a */
    public final String f18688a;

    /* renamed from: b */
    private final double f18689b;

    /* renamed from: c */
    private final double f18690c;

    /* renamed from: d */
    public final double f18691d;

    /* renamed from: e */
    public final int f18692e;

    public zzays(String str, double d, double d2, double d3, int i) {
        this.f18688a = str;
        this.f18690c = d;
        this.f18689b = d2;
        this.f18691d = d3;
        this.f18692e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzays)) {
            return false;
        }
        zzays zzays = (zzays) obj;
        if (Objects.m16031a(this.f18688a, zzays.f18688a) && this.f18689b == zzays.f18689b && this.f18690c == zzays.f18690c && this.f18692e == zzays.f18692e && Double.compare(this.f18691d, zzays.f18691d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.m16029a(this.f18688a, Double.valueOf(this.f18689b), Double.valueOf(this.f18690c), Double.valueOf(this.f18691d), Integer.valueOf(this.f18692e));
    }

    public final String toString() {
        Objects.ToStringHelper a = Objects.m16030a((Object) this);
        a.mo25372a("name", this.f18688a);
        a.mo25372a("minBound", Double.valueOf(this.f18690c));
        a.mo25372a("maxBound", Double.valueOf(this.f18689b));
        a.mo25372a("percent", Double.valueOf(this.f18691d));
        a.mo25372a("count", Integer.valueOf(this.f18692e));
        return a.toString();
    }
}
