package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzra {

    /* renamed from: a */
    public final int f22571a;

    /* renamed from: b */
    private final zzlh[] f22572b;

    /* renamed from: c */
    private int f22573c;

    public zzra(zzlh... zzlhArr) {
        zzsk.m25218b(zzlhArr.length > 0);
        this.f22572b = zzlhArr;
        this.f22571a = zzlhArr.length;
    }

    /* renamed from: a */
    public final zzlh mo29671a(int i) {
        return this.f22572b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzra.class == obj.getClass()) {
            zzra zzra = (zzra) obj;
            return this.f22571a == zzra.f22571a && Arrays.equals(this.f22572b, zzra.f22572b);
        }
    }

    public final int hashCode() {
        if (this.f22573c == 0) {
            this.f22573c = Arrays.hashCode(this.f22572b) + 527;
        }
        return this.f22573c;
    }

    /* renamed from: a */
    public final int mo29670a(zzlh zzlh) {
        int i = 0;
        while (true) {
            zzlh[] zzlhArr = this.f22572b;
            if (i >= zzlhArr.length) {
                return -1;
            }
            if (zzlh == zzlhArr[i]) {
                return i;
            }
            i++;
        }
    }
}
