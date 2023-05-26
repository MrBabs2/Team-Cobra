package com.google.android.gms.internal.ads;

public enum zzwx implements zzdoe {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: f */
    private final int f22957f;

    static {
        new o50();
    }

    private zzwx(int i) {
        this.f22957f = i;
    }

    /* renamed from: a */
    public static zzwx m25616a(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    /* renamed from: c */
    public final int mo28259c() {
        return this.f22957f;
    }

    /* renamed from: a */
    public static zzdog m25615a() {
        return p50.f16560a;
    }
}
