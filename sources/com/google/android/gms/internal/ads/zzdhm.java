package com.google.android.gms.internal.ads;

public enum zzdhm implements zzdoe {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f21427f;

    static {
        new C7592it();
    }

    private zzdhm(int i) {
        this.f21427f = i;
    }

    /* renamed from: a */
    public static zzdhm m23662a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    /* renamed from: c */
    public final int mo28259c() {
        if (this != UNRECOGNIZED) {
            return this.f21427f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
