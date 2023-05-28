package com.google.android.gms.internal.ads;

public final class zzsp {
    /* renamed from: a */
    private static String m25233a(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid mime type: ".concat(valueOf) : new String("Invalid mime type: "));
    }

    /* renamed from: b */
    public static boolean m25234b(String str) {
        return "audio".equals(m25233a(str));
    }

    /* renamed from: c */
    public static boolean m25235c(String str) {
        return "video".equals(m25233a(str));
    }
}
