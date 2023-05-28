package com.google.android.gms.internal.ads;

public enum zzbz implements zzdoe {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: f */
    private final int f19746f;

    static {
        new C7620jg();
    }

    private zzbz(int i) {
        this.f19746f = i;
    }

    /* renamed from: a */
    public static zzbz m22155a(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i == 2) {
            return ENUM_FAILURE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    /* renamed from: c */
    public final int mo28259c() {
        return this.f19746f;
    }

    /* renamed from: a */
    public static zzdog m22156a() {
        return C7953sg.f16848a;
    }
}
