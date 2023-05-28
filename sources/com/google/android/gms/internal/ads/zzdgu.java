package com.google.android.gms.internal.ads;

public enum zzdgu implements zzdoe {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f21415f;

    static {
        new C8224zs();
    }

    private zzdgu(int i) {
        this.f21415f = i;
    }

    /* renamed from: a */
    public static zzdgu m23553a(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    /* renamed from: c */
    public final int mo28259c() {
        if (this != UNRECOGNIZED) {
            return this.f21415f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
