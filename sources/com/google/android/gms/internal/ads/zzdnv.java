package com.google.android.gms.internal.ads;

public enum zzdnv {
    DOUBLE(0, C7373cv.SCALAR, zzdom.DOUBLE),
    FLOAT(1, C7373cv.SCALAR, zzdom.FLOAT),
    INT64(2, C7373cv.SCALAR, zzdom.LONG),
    UINT64(3, C7373cv.SCALAR, zzdom.LONG),
    INT32(4, C7373cv.SCALAR, zzdom.INT),
    FIXED64(5, C7373cv.SCALAR, zzdom.LONG),
    FIXED32(6, C7373cv.SCALAR, zzdom.INT),
    BOOL(7, C7373cv.SCALAR, zzdom.BOOLEAN),
    STRING(8, C7373cv.SCALAR, zzdom.STRING),
    MESSAGE(9, C7373cv.SCALAR, zzdom.MESSAGE),
    BYTES(10, C7373cv.SCALAR, zzdom.BYTE_STRING),
    UINT32(11, C7373cv.SCALAR, zzdom.INT),
    ENUM(12, C7373cv.SCALAR, zzdom.ENUM),
    SFIXED32(13, C7373cv.SCALAR, zzdom.INT),
    SFIXED64(14, C7373cv.SCALAR, zzdom.LONG),
    SINT32(15, C7373cv.SCALAR, zzdom.INT),
    SINT64(16, C7373cv.SCALAR, zzdom.LONG),
    GROUP(17, C7373cv.SCALAR, zzdom.MESSAGE),
    DOUBLE_LIST(18, C7373cv.VECTOR, zzdom.DOUBLE),
    FLOAT_LIST(19, C7373cv.VECTOR, zzdom.FLOAT),
    INT64_LIST(20, C7373cv.VECTOR, zzdom.LONG),
    UINT64_LIST(21, C7373cv.VECTOR, zzdom.LONG),
    INT32_LIST(22, C7373cv.VECTOR, zzdom.INT),
    FIXED64_LIST(23, C7373cv.VECTOR, zzdom.LONG),
    FIXED32_LIST(24, C7373cv.VECTOR, zzdom.INT),
    BOOL_LIST(25, C7373cv.VECTOR, zzdom.BOOLEAN),
    STRING_LIST(26, C7373cv.VECTOR, zzdom.STRING),
    MESSAGE_LIST(27, C7373cv.VECTOR, zzdom.MESSAGE),
    BYTES_LIST(28, C7373cv.VECTOR, zzdom.BYTE_STRING),
    UINT32_LIST(29, C7373cv.VECTOR, zzdom.INT),
    ENUM_LIST(30, C7373cv.VECTOR, zzdom.ENUM),
    SFIXED32_LIST(31, C7373cv.VECTOR, zzdom.INT),
    SFIXED64_LIST(32, C7373cv.VECTOR, zzdom.LONG),
    SINT32_LIST(33, C7373cv.VECTOR, zzdom.INT),
    SINT64_LIST(34, C7373cv.VECTOR, zzdom.LONG),
    DOUBLE_LIST_PACKED(35, C7373cv.PACKED_VECTOR, zzdom.DOUBLE),
    FLOAT_LIST_PACKED(36, C7373cv.PACKED_VECTOR, zzdom.FLOAT),
    INT64_LIST_PACKED(37, C7373cv.PACKED_VECTOR, zzdom.LONG),
    UINT64_LIST_PACKED(38, C7373cv.PACKED_VECTOR, zzdom.LONG),
    INT32_LIST_PACKED(39, C7373cv.PACKED_VECTOR, zzdom.INT),
    FIXED64_LIST_PACKED(40, C7373cv.PACKED_VECTOR, zzdom.LONG),
    FIXED32_LIST_PACKED(41, C7373cv.PACKED_VECTOR, zzdom.INT),
    BOOL_LIST_PACKED(42, C7373cv.PACKED_VECTOR, zzdom.BOOLEAN),
    UINT32_LIST_PACKED(43, C7373cv.PACKED_VECTOR, zzdom.INT),
    ENUM_LIST_PACKED(44, C7373cv.PACKED_VECTOR, zzdom.ENUM),
    SFIXED32_LIST_PACKED(45, C7373cv.PACKED_VECTOR, zzdom.INT),
    SFIXED64_LIST_PACKED(46, C7373cv.PACKED_VECTOR, zzdom.LONG),
    SINT32_LIST_PACKED(47, C7373cv.PACKED_VECTOR, zzdom.INT),
    SINT64_LIST_PACKED(48, C7373cv.PACKED_VECTOR, zzdom.LONG),
    GROUP_LIST(49, C7373cv.VECTOR, zzdom.MESSAGE),
    MAP(50, C7373cv.MAP, zzdom.VOID);
    

    /* renamed from: f0 */
    private static final zzdnv[] f21548f0 = null;

    /* renamed from: f */
    private final int f21570f;

    static {
        int i;
        zzdnv[] values = values();
        f21548f0 = new zzdnv[values.length];
        for (zzdnv zzdnv : values) {
            f21548f0[zzdnv.f21570f] = zzdnv;
        }
    }

    private zzdnv(int i, C7373cv cvVar, zzdom zzdom) {
        int i2;
        this.f21570f = i;
        int i3 = C7336bv.f14663a[cvVar.ordinal()];
        if (i3 == 1) {
            zzdom.mo29145a();
        } else if (i3 == 2) {
            zzdom.mo29145a();
        }
        if (cvVar == C7373cv.SCALAR && (i2 = C7336bv.f14664b[zzdom.ordinal()]) != 1 && i2 != 2) {
        }
    }

    /* renamed from: a */
    public final int mo29127a() {
        return this.f21570f;
    }
}
