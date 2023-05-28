package com.google.android.gms.internal.ads;

public enum zzbm implements zzdoe {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);
    

    /* renamed from: f */
    private final int f19152f;

    static {
        new C8134xc();
    }

    private zzbm(int i) {
        this.f19152f = i;
    }

    /* renamed from: a */
    public static zzbm m21344a(int i) {
        if (i == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
    }

    /* renamed from: c */
    public final int mo28259c() {
        return this.f19152f;
    }

    /* renamed from: a */
    public static zzdog m21345a() {
        return C7355cd.f14750a;
    }
}
