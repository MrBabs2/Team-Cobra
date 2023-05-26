package com.google.android.gms.internal.ads;

public enum zzdgj implements zzdoe {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f21400f;

    static {
        new C8002ts();
    }

    private zzdgj(int i) {
        this.f21400f = i;
    }

    /* renamed from: a */
    public static zzdgj m23505a(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    /* renamed from: c */
    public final int mo28259c() {
        if (this != UNRECOGNIZED) {
            return this.f21400f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
