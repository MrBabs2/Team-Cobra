package kotlin.p392j0;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.j0.u */
/* compiled from: StringNumberConversions.kt */
class C12129u extends C12128t {
    /* renamed from: a */
    public static Byte m40035a(String str, int i) {
        int intValue;
        C10202j.m34178b(str, "$this$toByteOrNull");
        Integer b = m40036b(str, i);
        if (b == null || (intValue = b.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    /* renamed from: b */
    public static Integer m40036b(String str, int i) {
        boolean z;
        int i2;
        C10202j.m34178b(str, "$this$toIntOrNull");
        C12098a.m39941a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char charAt = str.charAt(0);
        int i4 = -2147483647;
        int i5 = 1;
        if (charAt >= '0') {
            z = false;
            i5 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i4 = Integer.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i6 = -59652323;
        while (i5 < length) {
            int a = C12098a.m39940a(str.charAt(i5), i);
            if (a < 0) {
                return null;
            }
            if ((i3 < i6 && (i6 != -59652323 || i3 < (i6 = i4 / i))) || (i2 = i3 * i) < i4 + a) {
                return null;
            }
            i3 = i2 - a;
            i5++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    /* renamed from: c */
    public static Integer m40037c(String str) {
        C10202j.m34178b(str, "$this$toIntOrNull");
        return m40036b(str, 10);
    }

    /* renamed from: d */
    public static Short m40040d(String str, int i) {
        int intValue;
        C10202j.m34178b(str, "$this$toShortOrNull");
        Integer b = m40036b(str, i);
        if (b == null || (intValue = b.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Long m40038c(java.lang.String r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "$this$toLongOrNull"
            kotlin.jvm.internal.C10202j.m34178b(r0, r2)
            kotlin.p392j0.C12098a.m39941a((int) r19)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L_0x0014
            return r3
        L_0x0014:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r5 >= r6) goto L_0x0035
            if (r2 != r9) goto L_0x0026
            return r3
        L_0x0026:
            r6 = 45
            if (r5 != r6) goto L_0x002e
            r7 = -9223372036854775808
            r4 = 1
            goto L_0x0036
        L_0x002e:
            r6 = 43
            if (r5 != r6) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            return r3
        L_0x0035:
            r9 = 0
        L_0x0036:
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r5
        L_0x003e:
            if (r4 >= r2) goto L_0x006f
            char r14 = r0.charAt(r4)
            int r14 = kotlin.p392j0.C12098a.m39940a(r14, r1)
            if (r14 >= 0) goto L_0x004b
            return r3
        L_0x004b:
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x005b
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x005a
            long r12 = (long) r1
            long r12 = r7 / r12
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x005b
        L_0x005a:
            return r3
        L_0x005b:
            long r5 = (long) r1
            long r10 = r10 * r5
            long r5 = (long) r14
            long r16 = r7 + r5
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x0066
            return r3
        L_0x0066:
            long r10 = r10 - r5
            int r4 = r4 + 1
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L_0x003e
        L_0x006f:
            if (r9 == 0) goto L_0x0076
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            goto L_0x007b
        L_0x0076:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p392j0.C12129u.m40038c(java.lang.String, int):java.lang.Long");
    }

    /* renamed from: d */
    public static Long m40039d(String str) {
        C10202j.m34178b(str, "$this$toLongOrNull");
        return m40038c(str, 10);
    }
}
