package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.lx */
final class C7711lx {

    /* renamed from: a */
    private static final C7785nx f16183a;

    static {
        C7785nx nxVar;
        if (!(C7596ix.m17220b() && C7596ix.m17224c()) || C8225zt.m18654a()) {
            nxVar = new C7822ox();
        } else {
            nxVar = new C7896qx();
        }
        f16183a = nxVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m17522a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m17523a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m17524a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    public static boolean m17528a(byte[] bArr) {
        return f16183a.mo26328a(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m17533b(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m17522a((int) b);
        }
        if (i3 == 1) {
            return m17523a((int) b, (int) bArr[i]);
        }
        if (i3 == 2) {
            return m17524a((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    static String m17534c(byte[] bArr, int i, int i2) throws zzdok {
        return f16183a.mo26329b(bArr, i, i2);
    }

    /* renamed from: a */
    public static boolean m17529a(byte[] bArr, int i, int i2) {
        return f16183a.mo26328a(bArr, i, i2);
    }

    /* renamed from: a */
    static int m17525a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C7859px(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static int m17526a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f16183a.mo26326a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    static void m17527a(CharSequence charSequence, ByteBuffer byteBuffer) {
        C7785nx nxVar = f16183a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m17526a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            nxVar.mo26327a(charSequence, byteBuffer);
        } else {
            C7785nx.m17708b(charSequence, byteBuffer);
        }
    }
}
