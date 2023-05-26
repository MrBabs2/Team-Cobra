package com.google.android.gms.internal.ads;

public final class zzvi {

    /* renamed from: a */
    final long f22838a;

    /* renamed from: b */
    final String f22839b;

    /* renamed from: c */
    final int f22840c;

    zzvi(long j, String str, int i) {
        this.f22838a = j;
        this.f22839b = str;
        this.f22840c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzvi)) {
            zzvi zzvi = (zzvi) obj;
            if (zzvi.f22838a == this.f22838a && zzvi.f22840c == this.f22840c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f22838a;
    }
}
