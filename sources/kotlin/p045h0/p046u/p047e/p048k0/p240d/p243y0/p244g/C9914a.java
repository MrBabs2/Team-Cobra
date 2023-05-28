package kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g;

/* renamed from: kotlin.h0.u.e.k0.d.y0.g.a */
/* compiled from: BitEncoding */
public class C9914a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    /* renamed from: a */
    private static /* synthetic */ void m33131a(int i) {
        int i2 = i;
        String str = (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? 2 : 3)];
        if (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i2 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i2 == 3) {
            objArr[1] = "encode8to7";
        } else if (i2 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i2 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i2 == 10) {
            objArr[1] = "dropMarker";
        } else if (i2 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i2 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i2) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    private static void m33132a(byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i2] = (byte) ((bArr[i2] + i) & 127);
            }
            return;
        }
        m33131a(4);
        throw null;
    }

    /* renamed from: b */
    public static byte[] m33135b(String[] strArr) {
        if (strArr != null) {
            if (strArr.length > 0 && !strArr[0].isEmpty()) {
                char charAt = strArr[0].charAt(0);
                if (charAt == 0) {
                    byte[] a = C9929j.m33167a(m33136c(strArr));
                    if (a != null) {
                        return a;
                    }
                    m33131a(8);
                    throw null;
                } else if (charAt == 65535) {
                    strArr = m33136c(strArr);
                }
            }
            byte[] a2 = m33134a(strArr);
            m33132a(a2, 127);
            return m33133a(a2);
        }
        m33131a(7);
        throw null;
    }

    /* renamed from: c */
    private static String[] m33136c(String[] strArr) {
        if (strArr != null) {
            String[] strArr2 = (String[]) strArr.clone();
            strArr2[0] = strArr2[0].substring(1);
            if (strArr2 != null) {
                return strArr2;
            }
            m33131a(10);
            throw null;
        }
        m33131a(9);
        throw null;
    }

    /* renamed from: a */
    private static byte[] m33134a(String[] strArr) {
        if (strArr != null) {
            int i = 0;
            for (String length : strArr) {
                i += length.length();
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            for (String str : strArr) {
                int length2 = str.length();
                int i3 = 0;
                while (i3 < length2) {
                    bArr[i2] = (byte) str.charAt(i3);
                    i3++;
                    i2++;
                }
            }
            return bArr;
        }
        m33131a(11);
        throw null;
    }

    /* renamed from: a */
    private static byte[] m33133a(byte[] bArr) {
        if (bArr != null) {
            int length = (bArr.length * 7) / 8;
            byte[] bArr2 = new byte[length];
            int i = 0;
            byte b = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i++;
                int i3 = b + 1;
                bArr2[i2] = (byte) (((bArr[i] & 255) >>> b) + ((bArr[i] & ((1 << i3) - 1)) << (7 - b)));
                if (b == 6) {
                    i++;
                    b = 0;
                } else {
                    b = i3;
                }
            }
            return bArr2;
        }
        m33131a(13);
        throw null;
    }
}
