package com.google.zxing.p201j.p202b;

import com.google.zxing.WriterException;
import com.google.zxing.p197g.C8826c;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: com.google.zxing.j.b.g */
/* compiled from: PDF417HighLevelEncoder */
final class C8869g {

    /* renamed from: a */
    private static final byte[] f25170a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    private static final byte[] f25171b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c */
    private static final byte[] f25172c = new byte[128];

    /* renamed from: d */
    private static final byte[] f25173d = new byte[128];

    /* renamed from: e */
    private static final Charset f25174e = StandardCharsets.ISO_8859_1;

    /* renamed from: com.google.zxing.j.b.g$a */
    /* compiled from: PDF417HighLevelEncoder */
    static /* synthetic */ class C8870a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25175a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.zxing.j.b.c[] r0 = com.google.zxing.p201j.p202b.C8865c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25175a = r0
                com.google.zxing.j.b.c r1 = com.google.zxing.p201j.p202b.C8865c.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25175a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.j.b.c r1 = com.google.zxing.p201j.p202b.C8865c.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25175a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.j.b.c r1 = com.google.zxing.p201j.p202b.C8865c.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p201j.p202b.C8869g.C8870a.<clinit>():void");
        }
    }

    static {
        Arrays.fill(f25172c, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = f25170a;
            if (i2 >= bArr.length) {
                break;
            }
            byte b = bArr[i2];
            if (b > 0) {
                f25172c[b] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(f25173d, (byte) -1);
        while (true) {
            byte[] bArr2 = f25171b;
            if (i < bArr2.length) {
                byte b2 = bArr2[i];
                if (b2 > 0) {
                    f25173d[b2] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    static String m28973a(String str, C8865c cVar, Charset charset) throws WriterException {
        C8826c a;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = f25174e;
        } else if (!f25174e.equals(charset) && (a = C8826c.m28819a(charset.name())) != null) {
            m28974a(a.mo32607a(), sb);
        }
        int length = str.length();
        int i = C8870a.f25175a[cVar.ordinal()];
        if (i == 1) {
            m28971a((CharSequence) str, 0, length, sb, 0);
        } else if (i == 2) {
            byte[] bytes = str.getBytes(charset);
            m28976a(bytes, 0, bytes.length, 1, sb);
        } else if (i != 3) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int a2 = m28970a((CharSequence) str, i2);
                if (a2 >= 13) {
                    sb.append(902);
                    m28975a(str, i2, a2, sb);
                    i2 += a2;
                    i3 = 0;
                    i4 = 2;
                } else {
                    int b = m28978b(str, i2);
                    if (b >= 5 || a2 == length) {
                        if (i4 != 0) {
                            sb.append(900);
                            i3 = 0;
                            i4 = 0;
                        }
                        i3 = m28971a((CharSequence) str, i2, b, sb, i3);
                        i2 += b;
                    } else {
                        int a3 = m28972a(str, i2, charset);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        int i5 = a3 + i2;
                        byte[] bytes2 = str.substring(i2, i5).getBytes(charset);
                        if (bytes2.length == 1 && i4 == 0) {
                            m28976a(bytes2, 0, 1, 0, sb);
                        } else {
                            m28976a(bytes2, 0, bytes2.length, i4, sb);
                            i3 = 0;
                            i4 = 1;
                        }
                        i2 = i5;
                    }
                }
            }
        } else {
            sb.append(902);
            m28975a(str, 0, length, sb);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m28977a(char c) {
        if (c != ' ') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    /* renamed from: b */
    private static int m28978b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = i;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            int i3 = 0;
            while (i3 < 13 && m28980c(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
            if (i3 < 13) {
                if (i3 <= 0) {
                    if (!m28983f(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
            } else {
                return (i2 - i) - i3;
            }
        }
        return i2 - i;
    }

    /* renamed from: b */
    private static boolean m28979b(char c) {
        if (c != ' ') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m28980c(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: d */
    private static boolean m28981d(char c) {
        return f25172c[c] != -1;
    }

    /* renamed from: e */
    private static boolean m28982e(char c) {
        return f25173d[c] != -1;
    }

    /* renamed from: f */
    private static boolean m28983f(char c) {
        if (c == 9 || c == 10 || c == 13) {
            return true;
        }
        return c >= ' ' && c <= '~';
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6 A[EDGE_INSN: B:68:0x00f6->B:53:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0011 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m28971a(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = r20
            r8 = 0
        L_0x0011:
            int r9 = r17 + r8
            char r10 = r0.charAt(r9)
            r11 = 26
            r12 = 32
            r13 = 28
            r14 = 27
            r15 = 29
            if (r7 == 0) goto L_0x00bc
            if (r7 == r6) goto L_0x0083
            if (r7 == r4) goto L_0x003c
            boolean r9 = m28982e(r10)
            if (r9 == 0) goto L_0x0037
            byte[] r9 = f25173d
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x00f2
        L_0x0037:
            r3.append(r15)
        L_0x003a:
            r7 = 0
            goto L_0x0011
        L_0x003c:
            boolean r11 = m28981d(r10)
            if (r11 == 0) goto L_0x004c
            byte[] r9 = f25172c
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x00f2
        L_0x004c:
            boolean r11 = m28979b(r10)
            if (r11 == 0) goto L_0x0056
            r3.append(r13)
            goto L_0x003a
        L_0x0056:
            boolean r11 = m28977a(r10)
            if (r11 == 0) goto L_0x0061
            r3.append(r14)
            goto L_0x00d8
        L_0x0061:
            int r9 = r9 + 1
            if (r9 >= r1) goto L_0x0076
            char r9 = r0.charAt(r9)
            boolean r9 = m28982e(r9)
            if (r9 == 0) goto L_0x0076
            r7 = 3
            r9 = 25
            r3.append(r9)
            goto L_0x0011
        L_0x0076:
            r3.append(r15)
            byte[] r9 = f25173d
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x00f2
        L_0x0083:
            boolean r9 = m28977a(r10)
            if (r9 == 0) goto L_0x0096
            if (r10 != r12) goto L_0x008f
            r3.append(r11)
            goto L_0x00f2
        L_0x008f:
            int r10 = r10 + -97
            char r9 = (char) r10
            r3.append(r9)
            goto L_0x00f2
        L_0x0096:
            boolean r9 = m28979b(r10)
            if (r9 == 0) goto L_0x00a6
            r3.append(r14)
            int r10 = r10 + -65
            char r9 = (char) r10
            r3.append(r9)
            goto L_0x00f2
        L_0x00a6:
            boolean r9 = m28981d(r10)
            if (r9 == 0) goto L_0x00b0
            r3.append(r13)
            goto L_0x00e4
        L_0x00b0:
            r3.append(r15)
            byte[] r9 = f25173d
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
            goto L_0x00f2
        L_0x00bc:
            boolean r9 = m28979b(r10)
            if (r9 == 0) goto L_0x00cf
            if (r10 != r12) goto L_0x00c8
            r3.append(r11)
            goto L_0x00f2
        L_0x00c8:
            int r10 = r10 + -65
            char r9 = (char) r10
            r3.append(r9)
            goto L_0x00f2
        L_0x00cf:
            boolean r9 = m28977a(r10)
            if (r9 == 0) goto L_0x00db
            r3.append(r14)
        L_0x00d8:
            r7 = 1
            goto L_0x0011
        L_0x00db:
            boolean r9 = m28981d(r10)
            if (r9 == 0) goto L_0x00e7
            r3.append(r13)
        L_0x00e4:
            r7 = 2
            goto L_0x0011
        L_0x00e7:
            r3.append(r15)
            byte[] r9 = f25173d
            byte r9 = r9[r10]
            char r9 = (char) r9
            r3.append(r9)
        L_0x00f2:
            int r8 = r8 + 1
            if (r8 < r1) goto L_0x0011
            int r0 = r3.length()
            r1 = 0
            r8 = 0
        L_0x00fc:
            if (r1 >= r0) goto L_0x011a
            int r9 = r1 % 2
            if (r9 == 0) goto L_0x0104
            r9 = 1
            goto L_0x0105
        L_0x0104:
            r9 = 0
        L_0x0105:
            if (r9 == 0) goto L_0x0113
            int r8 = r8 * 30
            char r9 = r3.charAt(r1)
            int r8 = r8 + r9
            char r8 = (char) r8
            r2.append(r8)
            goto L_0x0117
        L_0x0113:
            char r8 = r3.charAt(r1)
        L_0x0117:
            int r1 = r1 + 1
            goto L_0x00fc
        L_0x011a:
            int r0 = r0 % r4
            if (r0 == 0) goto L_0x0124
            int r8 = r8 * 30
            int r8 = r8 + r15
            char r0 = (char) r8
            r2.append(r0)
        L_0x0124:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p201j.p202b.C8869g.m28971a(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: a */
    private static void m28976a(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append(913);
        } else if (i2 % 6 == 0) {
            sb.append(924);
        } else {
            sb.append(901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    /* renamed from: a */
    private static void m28975a(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder(DiskLruCache.VERSION_1);
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* renamed from: a */
    private static int m28970a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (m28980c(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r3 = r3 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m28972a(java.lang.String r5, int r6, java.nio.charset.Charset r7) throws com.google.zxing.WriterException {
        /*
            java.nio.charset.CharsetEncoder r7 = r7.newEncoder()
            int r0 = r5.length()
            r1 = r6
        L_0x0009:
            if (r1 >= r0) goto L_0x0057
            char r2 = r5.charAt(r1)
            r3 = 0
        L_0x0010:
            r4 = 13
            if (r3 >= r4) goto L_0x0025
            boolean r2 = m28980c(r2)
            if (r2 == 0) goto L_0x0025
            int r3 = r3 + 1
            int r2 = r1 + r3
            if (r2 >= r0) goto L_0x0025
            char r2 = r5.charAt(r2)
            goto L_0x0010
        L_0x0025:
            if (r3 < r4) goto L_0x0029
            int r1 = r1 - r6
            return r1
        L_0x0029:
            char r2 = r5.charAt(r1)
            boolean r3 = r7.canEncode(r2)
            if (r3 == 0) goto L_0x0036
            int r1 = r1 + 1
            goto L_0x0009
        L_0x0036:
            com.google.zxing.WriterException r5 = new com.google.zxing.WriterException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Non-encodable character detected: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r7 = " (Unicode: "
            r6.append(r7)
            r6.append(r2)
            r7 = 41
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>((java.lang.String) r6)
            throw r5
        L_0x0057:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p201j.p202b.C8869g.m28972a(java.lang.String, int, java.nio.charset.Charset):int");
    }

    /* renamed from: a */
    private static void m28974a(int i, StringBuilder sb) throws WriterException {
        if (i >= 0 && i < 900) {
            sb.append(927);
            sb.append((char) i);
        } else if (i < 810900) {
            sb.append(926);
            sb.append((char) ((i / 900) - 1));
            sb.append((char) (i % 900));
        } else if (i < 811800) {
            sb.append(925);
            sb.append((char) (810900 - i));
        } else {
            throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i)));
        }
    }
}
