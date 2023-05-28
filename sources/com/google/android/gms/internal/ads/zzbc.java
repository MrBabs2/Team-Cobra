package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public final class zzbc {
    /* renamed from: a */
    public static int m20573a(byte b) {
        return b < 0 ? b + 256 : b;
    }

    /* renamed from: a */
    public static long m20574a(ByteBuffer byteBuffer) {
        long j = (long) byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    /* renamed from: b */
    public static int m20575b(ByteBuffer byteBuffer) {
        return (m20573a(byteBuffer.get()) << 8) + 0 + m20573a(byteBuffer.get());
    }

    /* renamed from: c */
    public static long m20576c(ByteBuffer byteBuffer) {
        long a = (m20574a(byteBuffer) << 32) + 0;
        if (a >= 0) {
            return a + m20574a(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    /* renamed from: d */
    public static double m20577d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = (double) (0 | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255));
        Double.isNaN(d);
        return d / 65536.0d;
    }

    /* renamed from: e */
    public static double m20578e(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = (double) (0 | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255));
        Double.isNaN(d);
        return d / 1.073741824E9d;
    }

    /* renamed from: f */
    public static String m20579f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
