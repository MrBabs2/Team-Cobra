package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzdod {

    /* renamed from: a */
    static final Charset f21586a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f21587b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f21587b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f21587b;
        zzdnd.m23782a(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    public static int m24031a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m24032a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static <T> T m24034a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    static boolean m24037a(zzdpk zzdpk) {
        return false;
    }

    /* renamed from: b */
    public static boolean m24038b(byte[] bArr) {
        return C7711lx.m17528a(bArr);
    }

    /* renamed from: c */
    public static String m24039c(byte[] bArr) {
        return new String(bArr, f21586a);
    }

    /* renamed from: a */
    static <T> T m24036a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static int m24033a(byte[] bArr) {
        int length = bArr.length;
        int a = m24030a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static int m24030a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: a */
    static Object m24035a(Object obj, Object obj2) {
        return ((zzdpk) obj).mo29129b().mo29067a((zzdpk) obj2).mo29137D();
    }
}
