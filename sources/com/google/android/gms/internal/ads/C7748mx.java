package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mx */
final class C7748mx {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m17647a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static boolean m17648a(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m17653b(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m17654c(byte b) {
        return b < -16;
    }

    /* renamed from: d */
    private static boolean m17655d(byte b) {
        return b > -65;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m17646a(byte b, byte b2, char[] cArr, int i) throws zzdok {
        if (b < -62 || m17655d(b2)) {
            throw zzdok.m24054h();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m17645a(byte b, byte b2, byte b3, char[] cArr, int i) throws zzdok {
        if (m17655d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m17655d(b3)))) {
            throw zzdok.m24054h();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m17644a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzdok {
        if (m17655d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m17655d(b3) || m17655d(b4)) {
            throw zzdok.m24054h();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }
}
