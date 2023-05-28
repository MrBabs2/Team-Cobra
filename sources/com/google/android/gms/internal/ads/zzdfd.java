package com.google.android.gms.internal.ads;

public enum zzdfd implements zzdoe {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f21386f;

    static {
        new C7669ks();
    }

    private zzdfd(int i) {
        this.f21386f = i;
    }

    /* renamed from: a */
    public static zzdfd m23439a(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i == 1) {
            return UNCOMPRESSED;
        }
        if (i == 2) {
            return COMPRESSED;
        }
        if (i != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }

    /* renamed from: c */
    public final int mo28259c() {
        if (this != UNRECOGNIZED) {
            return this.f21386f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
