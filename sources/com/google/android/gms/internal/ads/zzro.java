package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzro {

    /* renamed from: a */
    public final int f22596a;

    /* renamed from: b */
    private final zzrm[] f22597b;

    /* renamed from: c */
    private int f22598c;

    public zzro(zzrm... zzrmArr) {
        this.f22597b = zzrmArr;
        this.f22596a = zzrmArr.length;
    }

    /* renamed from: a */
    public final zzrm mo29690a(int i) {
        return this.f22597b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzro.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f22597b, ((zzro) obj).f22597b);
    }

    public final int hashCode() {
        if (this.f22598c == 0) {
            this.f22598c = Arrays.hashCode(this.f22597b) + 527;
        }
        return this.f22598c;
    }

    /* renamed from: a */
    public final zzrm[] mo29691a() {
        return (zzrm[]) this.f22597b.clone();
    }
}
