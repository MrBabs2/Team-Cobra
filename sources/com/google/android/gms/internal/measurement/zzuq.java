package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzuq {

    /* renamed from: a */
    static final Charset f23509a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f23510b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f23510b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = f23510b;
        zztq.m26533a(bArr2, 0, bArr2.length, false);
    }

    /* renamed from: a */
    public static int m26674a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m26675a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    static <T> T m26677a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: a */
    static boolean m26680a(zzvv zzvv) {
        return false;
    }

    /* renamed from: b */
    public static boolean m26681b(byte[] bArr) {
        return C8259a3.m25881a(bArr);
    }

    /* renamed from: c */
    public static String m26682c(byte[] bArr) {
        return new String(bArr, f23509a);
    }

    /* renamed from: a */
    static <T> T m26679a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static int m26676a(byte[] bArr) {
        int length = bArr.length;
        int a = m26673a(length, bArr, 0, length);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: a */
    static int m26673a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: a */
    static Object m26678a(Object obj, Object obj2) {
        return ((zzvv) obj).mo30426c().mo30371a((zzvv) obj2).mo30437v();
    }
}
