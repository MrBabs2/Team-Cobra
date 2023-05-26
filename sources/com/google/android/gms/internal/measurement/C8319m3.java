package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.m3 */
final class C8319m3 {

    /* renamed from: a */
    final int f23294a;

    /* renamed from: b */
    final byte[] f23295b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8319m3)) {
            return false;
        }
        C8319m3 m3Var = (C8319m3) obj;
        return this.f23294a == m3Var.f23294a && Arrays.equals(this.f23295b, m3Var.f23295b);
    }

    public final int hashCode() {
        return ((this.f23294a + 527) * 31) + Arrays.hashCode(this.f23295b);
    }
}
