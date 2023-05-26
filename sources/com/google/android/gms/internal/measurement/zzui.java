package com.google.android.gms.internal.measurement;

public enum zzui {
    DOUBLE(0, C8257a1.SCALAR, zzux.DOUBLE),
    FLOAT(1, C8257a1.SCALAR, zzux.FLOAT),
    INT64(2, C8257a1.SCALAR, zzux.LONG),
    UINT64(3, C8257a1.SCALAR, zzux.LONG),
    INT32(4, C8257a1.SCALAR, zzux.INT),
    FIXED64(5, C8257a1.SCALAR, zzux.LONG),
    FIXED32(6, C8257a1.SCALAR, zzux.INT),
    BOOL(7, C8257a1.SCALAR, zzux.BOOLEAN),
    STRING(8, C8257a1.SCALAR, zzux.STRING),
    MESSAGE(9, C8257a1.SCALAR, zzux.MESSAGE),
    BYTES(10, C8257a1.SCALAR, zzux.BYTE_STRING),
    UINT32(11, C8257a1.SCALAR, zzux.INT),
    ENUM(12, C8257a1.SCALAR, zzux.ENUM),
    SFIXED32(13, C8257a1.SCALAR, zzux.INT),
    SFIXED64(14, C8257a1.SCALAR, zzux.LONG),
    SINT32(15, C8257a1.SCALAR, zzux.INT),
    SINT64(16, C8257a1.SCALAR, zzux.LONG),
    GROUP(17, C8257a1.SCALAR, zzux.MESSAGE),
    DOUBLE_LIST(18, C8257a1.VECTOR, zzux.DOUBLE),
    FLOAT_LIST(19, C8257a1.VECTOR, zzux.FLOAT),
    INT64_LIST(20, C8257a1.VECTOR, zzux.LONG),
    UINT64_LIST(21, C8257a1.VECTOR, zzux.LONG),
    INT32_LIST(22, C8257a1.VECTOR, zzux.INT),
    FIXED64_LIST(23, C8257a1.VECTOR, zzux.LONG),
    FIXED32_LIST(24, C8257a1.VECTOR, zzux.INT),
    BOOL_LIST(25, C8257a1.VECTOR, zzux.BOOLEAN),
    STRING_LIST(26, C8257a1.VECTOR, zzux.STRING),
    MESSAGE_LIST(27, C8257a1.VECTOR, zzux.MESSAGE),
    BYTES_LIST(28, C8257a1.VECTOR, zzux.BYTE_STRING),
    UINT32_LIST(29, C8257a1.VECTOR, zzux.INT),
    ENUM_LIST(30, C8257a1.VECTOR, zzux.ENUM),
    SFIXED32_LIST(31, C8257a1.VECTOR, zzux.INT),
    SFIXED64_LIST(32, C8257a1.VECTOR, zzux.LONG),
    SINT32_LIST(33, C8257a1.VECTOR, zzux.INT),
    SINT64_LIST(34, C8257a1.VECTOR, zzux.LONG),
    DOUBLE_LIST_PACKED(35, C8257a1.PACKED_VECTOR, zzux.DOUBLE),
    FLOAT_LIST_PACKED(36, C8257a1.PACKED_VECTOR, zzux.FLOAT),
    INT64_LIST_PACKED(37, C8257a1.PACKED_VECTOR, zzux.LONG),
    UINT64_LIST_PACKED(38, C8257a1.PACKED_VECTOR, zzux.LONG),
    INT32_LIST_PACKED(39, C8257a1.PACKED_VECTOR, zzux.INT),
    FIXED64_LIST_PACKED(40, C8257a1.PACKED_VECTOR, zzux.LONG),
    FIXED32_LIST_PACKED(41, C8257a1.PACKED_VECTOR, zzux.INT),
    BOOL_LIST_PACKED(42, C8257a1.PACKED_VECTOR, zzux.BOOLEAN),
    UINT32_LIST_PACKED(43, C8257a1.PACKED_VECTOR, zzux.INT),
    ENUM_LIST_PACKED(44, C8257a1.PACKED_VECTOR, zzux.ENUM),
    SFIXED32_LIST_PACKED(45, C8257a1.PACKED_VECTOR, zzux.INT),
    SFIXED64_LIST_PACKED(46, C8257a1.PACKED_VECTOR, zzux.LONG),
    SINT32_LIST_PACKED(47, C8257a1.PACKED_VECTOR, zzux.INT),
    SINT64_LIST_PACKED(48, C8257a1.PACKED_VECTOR, zzux.LONG),
    GROUP_LIST(49, C8257a1.VECTOR, zzux.MESSAGE),
    MAP(50, C8257a1.MAP, zzux.VOID);
    

    /* renamed from: f0 */
    private static final zzui[] f23473f0 = null;

    /* renamed from: f */
    private final int f23495f;

    static {
        int i;
        zzui[] values = values();
        f23473f0 = new zzui[values.length];
        for (zzui zzui : values) {
            f23473f0[zzui.f23495f] = zzui;
        }
    }

    private zzui(int i, C8257a1 a1Var, zzux zzux) {
        int i2;
        this.f23495f = i;
        int i3 = C8373z0.f23401a[a1Var.ordinal()];
        if (i3 == 1) {
            zzux.mo30439a();
        } else if (i3 == 2) {
            zzux.mo30439a();
        }
        if (a1Var == C8257a1.SCALAR && (i2 = C8373z0.f23402b[zzux.ordinal()]) != 1 && i2 != 2) {
        }
    }

    /* renamed from: a */
    public final int mo30422a() {
        return this.f23495f;
    }
}
