package com.google.android.gms.internal.ads;

public final class zzkl {
    /* renamed from: a */
    public static String m24666a(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid mime type: ".concat(valueOf) : new String("Invalid mime type: "));
    }

    /* renamed from: b */
    public static boolean m24667b(String str) {
        return m24666a(str).equals("audio");
    }

    /* renamed from: c */
    public static boolean m24668c(String str) {
        return "audio/ac3".equals(str) || "audio/eac3".equals(str);
    }
}
