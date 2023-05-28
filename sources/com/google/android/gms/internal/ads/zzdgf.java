package com.google.android.gms.internal.ads;

public enum zzdgf implements zzdoe {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f21393f;

    static {
        new C7928rs();
    }

    private zzdgf(int i) {
        this.f21393f = i;
    }

    /* renamed from: a */
    public static zzdgf m23500a(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        if (i == 2) {
            return NIST_P256;
        }
        if (i == 3) {
            return NIST_P384;
        }
        if (i != 4) {
            return null;
        }
        return NIST_P521;
    }

    /* renamed from: c */
    public final int mo28259c() {
        if (this != UNRECOGNIZED) {
            return this.f21393f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
