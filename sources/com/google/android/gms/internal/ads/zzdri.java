package com.google.android.gms.internal.ads;

public enum zzdri {
    DOUBLE(zzdrn.DOUBLE, 1),
    FLOAT(zzdrn.FLOAT, 5),
    INT64(zzdrn.LONG, 0),
    UINT64(zzdrn.LONG, 0),
    INT32(zzdrn.INT, 0),
    FIXED64(zzdrn.LONG, 1),
    FIXED32(zzdrn.INT, 5),
    BOOL(zzdrn.BOOLEAN, 0),
    STRING(zzdrn.STRING, 2),
    GROUP(zzdrn.MESSAGE, 3),
    MESSAGE(zzdrn.MESSAGE, 2),
    BYTES(zzdrn.BYTE_STRING, 2),
    UINT32(zzdrn.INT, 0),
    ENUM(zzdrn.ENUM, 0),
    SFIXED32(zzdrn.INT, 5),
    SFIXED64(zzdrn.LONG, 1),
    SINT32(zzdrn.INT, 0),
    SINT64(zzdrn.LONG, 0);
    

    /* renamed from: f */
    private final zzdrn f21633f;

    /* renamed from: g */
    private final int f21634g;

    private zzdri(zzdrn zzdrn, int i) {
        this.f21633f = zzdrn;
        this.f21634g = i;
    }

    /* renamed from: a */
    public final zzdrn mo29187a() {
        return this.f21633f;
    }

    /* renamed from: d */
    public final int mo29188d() {
        return this.f21634g;
    }
}
