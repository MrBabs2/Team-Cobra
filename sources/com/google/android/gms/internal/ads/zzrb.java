package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzrb {

    /* renamed from: d */
    public static final zzrb f22574d = new zzrb(new zzra[0]);

    /* renamed from: a */
    public final int f22575a;

    /* renamed from: b */
    private final zzra[] f22576b;

    /* renamed from: c */
    private int f22577c;

    public zzrb(zzra... zzraArr) {
        this.f22576b = zzraArr;
        this.f22575a = zzraArr.length;
    }

    /* renamed from: a */
    public final zzra mo29675a(int i) {
        return this.f22576b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzrb.class == obj.getClass()) {
            zzrb zzrb = (zzrb) obj;
            return this.f22575a == zzrb.f22575a && Arrays.equals(this.f22576b, zzrb.f22576b);
        }
    }

    public final int hashCode() {
        if (this.f22577c == 0) {
            this.f22577c = Arrays.hashCode(this.f22576b);
        }
        return this.f22577c;
    }

    /* renamed from: a */
    public final int mo29674a(zzra zzra) {
        for (int i = 0; i < this.f22575a; i++) {
            if (this.f22576b[i] == zzra) {
                return i;
            }
        }
        return -1;
    }
}
