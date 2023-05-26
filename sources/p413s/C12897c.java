package p413s;

import kotlin.jvm.internal.C10202j;

/* renamed from: s.c */
/* compiled from: -Util.kt */
public final class C12897c {
    /* renamed from: a */
    public static final int m41510a(int i) {
        return ((i & 255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    /* renamed from: a */
    public static final short m41511a(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    /* renamed from: a */
    public static final void m41512a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* renamed from: a */
    public static final boolean m41513a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C10202j.m34178b(bArr, "a");
        C10202j.m34178b(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
