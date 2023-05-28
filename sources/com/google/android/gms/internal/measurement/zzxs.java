package com.google.android.gms.internal.measurement;

public enum zzxs {
    DOUBLE(zzxx.DOUBLE, 1),
    FLOAT(zzxx.FLOAT, 5),
    INT64(zzxx.LONG, 0),
    UINT64(zzxx.LONG, 0),
    INT32(zzxx.INT, 0),
    FIXED64(zzxx.LONG, 1),
    FIXED32(zzxx.INT, 5),
    BOOL(zzxx.BOOLEAN, 0),
    STRING(zzxx.STRING, 2),
    GROUP(zzxx.MESSAGE, 3),
    MESSAGE(zzxx.MESSAGE, 2),
    BYTES(zzxx.BYTE_STRING, 2),
    UINT32(zzxx.INT, 0),
    ENUM(zzxx.ENUM, 0),
    SFIXED32(zzxx.INT, 5),
    SFIXED64(zzxx.LONG, 1),
    SINT32(zzxx.INT, 0),
    SINT64(zzxx.LONG, 0);
    

    /* renamed from: f */
    private final zzxx f23554f;

    /* renamed from: g */
    private final int f23555g;

    private zzxs(zzxx zzxx, int i) {
        this.f23554f = zzxx;
        this.f23555g = i;
    }

    /* renamed from: a */
    public final zzxx mo30478a() {
        return this.f23554f;
    }

    /* renamed from: d */
    public final int mo30479d() {
        return this.f23555g;
    }
}
