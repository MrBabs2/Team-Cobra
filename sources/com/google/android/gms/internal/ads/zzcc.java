package com.google.android.gms.internal.ads;

public enum zzcc implements zzdoe {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);
    

    /* renamed from: f */
    private final int f19929f;

    static {
        new C7954sh();
    }

    private zzcc(int i) {
        this.f19929f = i;
    }

    /* renamed from: a */
    public static zzcc m22329a(int i) {
        if (i == 0) {
            return UNKNOWN_PROTO;
        }
        if (i == 1) {
            return AFMA_SIGNALS;
        }
        if (i == 2) {
            return UNITY_SIGNALS;
        }
        if (i != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
    }

    /* renamed from: c */
    public final int mo28259c() {
        return this.f19929f;
    }

    /* renamed from: a */
    public static zzdog m22330a() {
        return C7434ei.f15153a;
    }
}
