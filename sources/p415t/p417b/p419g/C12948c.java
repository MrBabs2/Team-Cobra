package p415t.p417b.p419g;

import java.util.HashMap;
import java.util.Map;

/* renamed from: t.b.g.c */
/* compiled from: MessageFormatter */
public final class C12948c {
    /* renamed from: a */
    public static final C12946a m41833a(String str, Object obj, Object obj2) {
        return m41834a(str, new Object[]{obj, obj2});
    }

    /* renamed from: b */
    private static Object[] m41849b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    /* renamed from: a */
    static final Throwable m41832a(Object[] objArr) {
        if (!(objArr == null || objArr.length == 0)) {
            Throwable th = objArr[objArr.length - 1];
            if (th instanceof Throwable) {
                return th;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final C12946a m41834a(String str, Object[] objArr) {
        Throwable a = m41832a(objArr);
        if (a != null) {
            objArr = m41849b(objArr);
        }
        return m41835a(str, objArr, a);
    }

    /* renamed from: b */
    static final boolean m41848b(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    /* renamed from: a */
    public static final C12946a m41835a(String str, Object[] objArr, Throwable th) {
        int i;
        if (str == null) {
            return new C12946a((String) null, objArr, th);
        }
        if (objArr == null) {
            return new C12946a(str);
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int indexOf = str.indexOf("{}", i3);
            if (indexOf != -1) {
                if (!m41848b(str, indexOf)) {
                    sb.append(str, i3, indexOf);
                    m41837a(sb, objArr[i2], (Map<Object[], Object>) new HashMap());
                } else if (!m41847a(str, indexOf)) {
                    i2--;
                    sb.append(str, i3, indexOf - 1);
                    sb.append('{');
                    i = indexOf + 1;
                    i3 = i;
                    i2++;
                } else {
                    sb.append(str, i3, indexOf - 1);
                    m41837a(sb, objArr[i2], (Map<Object[], Object>) new HashMap());
                }
                i = indexOf + 2;
                i3 = i;
                i2++;
            } else if (i3 == 0) {
                return new C12946a(str, objArr, th);
            } else {
                sb.append(str, i3, str.length());
                return new C12946a(sb.toString(), objArr, th);
            }
        }
        sb.append(str, i3, str.length());
        return new C12946a(sb.toString(), objArr, th);
    }

    /* renamed from: a */
    static final boolean m41847a(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    /* renamed from: a */
    private static void m41837a(StringBuilder sb, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb.append("null");
        } else if (!obj.getClass().isArray()) {
            m41836a(sb, obj);
        } else if (obj instanceof boolean[]) {
            m41846a(sb, (boolean[]) obj);
        } else if (obj instanceof byte[]) {
            m41838a(sb, (byte[]) obj);
        } else if (obj instanceof char[]) {
            m41839a(sb, (char[]) obj);
        } else if (obj instanceof short[]) {
            m41845a(sb, (short[]) obj);
        } else if (obj instanceof int[]) {
            m41842a(sb, (int[]) obj);
        } else if (obj instanceof long[]) {
            m41843a(sb, (long[]) obj);
        } else if (obj instanceof float[]) {
            m41841a(sb, (float[]) obj);
        } else if (obj instanceof double[]) {
            m41840a(sb, (double[]) obj);
        } else {
            m41844a(sb, (Object[]) obj, map);
        }
    }

    /* renamed from: a */
    private static void m41836a(StringBuilder sb, Object obj) {
        try {
            sb.append(obj.toString());
        } catch (Throwable th) {
            C12955j.m41901a("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th);
            sb.append("[FAILED toString()]");
        }
    }

    /* renamed from: a */
    private static void m41844a(StringBuilder sb, Object[] objArr, Map<Object[], Object> map) {
        sb.append('[');
        if (!map.containsKey(objArr)) {
            map.put(objArr, (Object) null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                m41837a(sb, objArr[i], map);
                if (i != length - 1) {
                    sb.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            sb.append("...");
        }
        sb.append(']');
    }

    /* renamed from: a */
    private static void m41846a(StringBuilder sb, boolean[] zArr) {
        sb.append('[');
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(zArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: a */
    private static void m41838a(StringBuilder sb, byte[] bArr) {
        sb.append('[');
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(bArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: a */
    private static void m41839a(StringBuilder sb, char[] cArr) {
        sb.append('[');
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(cArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: a */
    private static void m41845a(StringBuilder sb, short[] sArr) {
        sb.append('[');
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(sArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: a */
    private static void m41842a(StringBuilder sb, int[] iArr) {
        sb.append('[');
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(iArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: a */
    private static void m41843a(StringBuilder sb, long[] jArr) {
        sb.append('[');
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(jArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: a */
    private static void m41841a(StringBuilder sb, float[] fArr) {
        sb.append('[');
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(fArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: a */
    private static void m41840a(StringBuilder sb, double[] dArr) {
        sb.append('[');
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(dArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }
}
