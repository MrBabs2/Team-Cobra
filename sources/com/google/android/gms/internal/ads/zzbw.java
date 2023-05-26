package com.google.android.gms.internal.ads;

public enum zzbw implements zzdoe {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3);
    

    /* renamed from: f */
    private final int f19534f;

    static {
        new C7730mf();
    }

    private zzbw(int i) {
        this.f19534f = i;
    }

    /* renamed from: a */
    public static zzbw m21968a(int i) {
        if (i == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i == 1) {
            return BITSLICER;
        }
        if (i == 2) {
            return TINK_HYBRID;
        }
        if (i != 3) {
            return null;
        }
        return UNENCRYPTED;
    }

    /* renamed from: c */
    public final int mo28259c() {
        return this.f19534f;
    }

    /* renamed from: a */
    public static zzdog m21969a() {
        return C7915rf.f16754a;
    }
}
