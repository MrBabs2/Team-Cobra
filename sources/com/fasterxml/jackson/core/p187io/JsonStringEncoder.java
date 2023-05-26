package com.fasterxml.jackson.core.p187io;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;

/* renamed from: com.fasterxml.jackson.core.io.JsonStringEncoder */
public final class JsonStringEncoder {

    /* renamed from: HB */
    private static final byte[] f12503HB = CharTypes.copyHexBytes();

    /* renamed from: HC */
    private static final char[] f12504HC = CharTypes.copyHexChars();
    private static final JsonStringEncoder instance = new JsonStringEncoder();

    private int _appendByte(int i, int i2, ByteArrayBuilder byteArrayBuilder, int i3) {
        byteArrayBuilder.setCurrentSegmentLength(i3);
        byteArrayBuilder.append(92);
        if (i2 < 0) {
            byteArrayBuilder.append(117);
            if (i > 255) {
                int i4 = i >> 8;
                byteArrayBuilder.append(f12503HB[i4 >> 4]);
                byteArrayBuilder.append(f12503HB[i4 & 15]);
                i &= 255;
            } else {
                byteArrayBuilder.append(48);
                byteArrayBuilder.append(48);
            }
            byteArrayBuilder.append(f12503HB[i >> 4]);
            byteArrayBuilder.append(f12503HB[i & 15]);
        } else {
            byteArrayBuilder.append((byte) i2);
        }
        return byteArrayBuilder.getCurrentSegmentLength();
    }

    private int _appendNamed(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    private int _appendNumeric(int i, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = f12504HC;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    private static int _convert(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + 65536 + (i2 - 56320);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    private static void _illegal(int i) {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i));
    }

    private char[] _qbuf() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[2] = '0';
        cArr[3] = '0';
        return cArr;
    }

    public static JsonStringEncoder getInstance() {
        return instance;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ea A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] encodeAsUTF8(java.lang.String r13) {
        /*
            r12 = this;
            int r0 = r13.length()
            r1 = 200(0xc8, float:2.8E-43)
            byte[] r2 = new byte[r1]
            r3 = 0
            r4 = 0
            r7 = r3
            r5 = 0
            r6 = 0
        L_0x000d:
            if (r5 >= r0) goto L_0x00f6
            int r8 = r5 + 1
            char r5 = r13.charAt(r5)
        L_0x0015:
            r9 = 127(0x7f, float:1.78E-43)
            if (r5 > r9) goto L_0x003e
            if (r6 < r1) goto L_0x002a
            if (r7 != 0) goto L_0x0021
            com.fasterxml.jackson.core.util.ByteArrayBuilder r7 = com.fasterxml.jackson.core.util.ByteArrayBuilder.fromInitial(r2, r6)
        L_0x0021:
            byte[] r1 = r7.finishCurrentSegment()
            int r2 = r1.length
            r6 = 0
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x002a:
            int r9 = r6 + 1
            byte r5 = (byte) r5
            r2[r6] = r5
            if (r8 < r0) goto L_0x0034
            r6 = r9
            goto L_0x00f6
        L_0x0034:
            int r5 = r8 + 1
            char r6 = r13.charAt(r8)
            r8 = r5
            r5 = r6
            r6 = r9
            goto L_0x0015
        L_0x003e:
            if (r7 != 0) goto L_0x0044
            com.fasterxml.jackson.core.util.ByteArrayBuilder r7 = com.fasterxml.jackson.core.util.ByteArrayBuilder.fromInitial(r2, r6)
        L_0x0044:
            if (r6 < r1) goto L_0x004c
            byte[] r2 = r7.finishCurrentSegment()
            int r1 = r2.length
            r6 = 0
        L_0x004c:
            r9 = 2048(0x800, float:2.87E-42)
            if (r5 >= r9) goto L_0x005d
            int r9 = r6 + 1
            int r10 = r5 >> 6
            r10 = r10 | 192(0xc0, float:2.69E-43)
            byte r10 = (byte) r10
            r2[r6] = r10
        L_0x0059:
            r6 = r5
            r5 = r8
            goto L_0x00df
        L_0x005d:
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r9) goto L_0x00c0
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r5 <= r9) goto L_0x0068
            goto L_0x00c0
        L_0x0068:
            r9 = 56319(0xdbff, float:7.892E-41)
            if (r5 > r9) goto L_0x00bc
            if (r8 >= r0) goto L_0x00b8
            int r9 = r8 + 1
            char r8 = r13.charAt(r8)
            int r5 = _convert(r5, r8)
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r5 > r8) goto L_0x00b4
            int r8 = r6 + 1
            int r10 = r5 >> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            r2[r6] = r10
            if (r8 < r1) goto L_0x008f
            byte[] r2 = r7.finishCurrentSegment()
            int r1 = r2.length
            r8 = 0
        L_0x008f:
            int r6 = r8 + 1
            int r10 = r5 >> 12
            r10 = r10 & 63
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            r2[r8] = r10
            if (r6 < r1) goto L_0x00a5
            byte[] r1 = r7.finishCurrentSegment()
            int r2 = r1.length
            r6 = 0
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x00a5:
            int r8 = r6 + 1
            int r10 = r5 >> 6
            r10 = r10 & 63
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            r2[r6] = r10
            r6 = r5
            r5 = r9
            r9 = r8
            goto L_0x00df
        L_0x00b4:
            _illegal(r5)
            throw r3
        L_0x00b8:
            _illegal(r5)
            throw r3
        L_0x00bc:
            _illegal(r5)
            throw r3
        L_0x00c0:
            int r9 = r6 + 1
            int r10 = r5 >> 12
            r10 = r10 | 224(0xe0, float:3.14E-43)
            byte r10 = (byte) r10
            r2[r6] = r10
            if (r9 < r1) goto L_0x00d1
            byte[] r2 = r7.finishCurrentSegment()
            int r1 = r2.length
            r9 = 0
        L_0x00d1:
            int r6 = r9 + 1
            int r10 = r5 >> 6
            r10 = r10 & 63
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            r2[r9] = r10
            r9 = r6
            goto L_0x0059
        L_0x00df:
            if (r9 < r1) goto L_0x00ea
            byte[] r1 = r7.finishCurrentSegment()
            int r2 = r1.length
            r9 = 0
            r11 = r2
            r2 = r1
            r1 = r11
        L_0x00ea:
            int r8 = r9 + 1
            r6 = r6 & 63
            r6 = r6 | 128(0x80, float:1.794E-43)
            byte r6 = (byte) r6
            r2[r9] = r6
            r6 = r8
            goto L_0x000d
        L_0x00f6:
            if (r7 != 0) goto L_0x00fd
            byte[] r13 = java.util.Arrays.copyOfRange(r2, r4, r6)
            return r13
        L_0x00fd:
            byte[] r13 = r7.completeAndCoalesce(r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p187io.JsonStringEncoder.encodeAsUTF8(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        r7 = _appendNumeric(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r7 = _appendNamed(r10, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r10 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r10 <= r0.length) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r10 = r0.length - r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r10 <= 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        java.lang.System.arraycopy(r6, 0, r0, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r4 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r4 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r0 = r4.finishCurrentSegment();
        r7 = r7 - r10;
        java.lang.System.arraycopy(r6, r10, r0, 0, r7);
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        java.lang.System.arraycopy(r6, 0, r0, r8, r7);
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r6 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r6 = _qbuf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r9 = r7 + 1;
        r7 = r13.charAt(r7);
        r10 = r1[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r10 >= 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] quoteAsString(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 120(0x78, float:1.68E-43)
            char[] r0 = new char[r0]
            int[] r1 = com.fasterxml.jackson.core.p187io.CharTypes.get7BitOutputEscapes()
            int r2 = r1.length
            int r3 = r13.length()
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = 0
            r8 = 0
        L_0x0012:
            if (r7 >= r3) goto L_0x0073
        L_0x0014:
            char r9 = r13.charAt(r7)
            if (r9 >= r2) goto L_0x0059
            r10 = r1[r9]
            if (r10 == 0) goto L_0x0059
            if (r6 != 0) goto L_0x0024
            char[] r6 = r12._qbuf()
        L_0x0024:
            int r9 = r7 + 1
            char r7 = r13.charAt(r7)
            r10 = r1[r7]
            if (r10 >= 0) goto L_0x0033
            int r7 = r12._appendNumeric(r7, r6)
            goto L_0x0037
        L_0x0033:
            int r7 = r12._appendNamed(r10, r6)
        L_0x0037:
            int r10 = r8 + r7
            int r11 = r0.length
            if (r10 <= r11) goto L_0x0053
            int r10 = r0.length
            int r10 = r10 - r8
            if (r10 <= 0) goto L_0x0043
            java.lang.System.arraycopy(r6, r5, r0, r8, r10)
        L_0x0043:
            if (r4 != 0) goto L_0x0049
            com.fasterxml.jackson.core.util.TextBuffer r4 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r0)
        L_0x0049:
            char[] r0 = r4.finishCurrentSegment()
            int r7 = r7 - r10
            java.lang.System.arraycopy(r6, r10, r0, r5, r7)
            r8 = r7
            goto L_0x0057
        L_0x0053:
            java.lang.System.arraycopy(r6, r5, r0, r8, r7)
            r8 = r10
        L_0x0057:
            r7 = r9
            goto L_0x0012
        L_0x0059:
            int r10 = r0.length
            if (r8 < r10) goto L_0x0067
            if (r4 != 0) goto L_0x0062
            com.fasterxml.jackson.core.util.TextBuffer r4 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r0)
        L_0x0062:
            char[] r0 = r4.finishCurrentSegment()
            r8 = 0
        L_0x0067:
            int r10 = r8 + 1
            r0[r8] = r9
            int r7 = r7 + 1
            if (r7 < r3) goto L_0x0071
            r8 = r10
            goto L_0x0073
        L_0x0071:
            r8 = r10
            goto L_0x0014
        L_0x0073:
            if (r4 != 0) goto L_0x007a
            char[] r13 = java.util.Arrays.copyOfRange(r0, r5, r8)
            return r13
        L_0x007a:
            r4.setCurrentLength(r8)
            char[] r13 = r4.contentsAsArray()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p187io.JsonStringEncoder.quoteAsString(java.lang.String):char[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] quoteAsUTF8(java.lang.String r12) {
        /*
            r11 = this;
            int r0 = r12.length()
            r1 = 200(0xc8, float:2.8E-43)
            byte[] r1 = new byte[r1]
            r2 = 0
            r3 = 0
            r6 = r2
            r4 = 0
            r5 = 0
        L_0x000d:
            if (r4 >= r0) goto L_0x010a
            int[] r7 = com.fasterxml.jackson.core.p187io.CharTypes.get7BitOutputEscapes()
        L_0x0013:
            char r8 = r12.charAt(r4)
            r9 = 127(0x7f, float:1.78E-43)
            if (r8 > r9) goto L_0x003c
            r10 = r7[r8]
            if (r10 == 0) goto L_0x0020
            goto L_0x003c
        L_0x0020:
            int r9 = r1.length
            if (r5 < r9) goto L_0x002e
            if (r6 != 0) goto L_0x0029
            com.fasterxml.jackson.core.util.ByteArrayBuilder r6 = com.fasterxml.jackson.core.util.ByteArrayBuilder.fromInitial(r1, r5)
        L_0x0029:
            byte[] r1 = r6.finishCurrentSegment()
            r5 = 0
        L_0x002e:
            int r9 = r5 + 1
            byte r8 = (byte) r8
            r1[r5] = r8
            int r4 = r4 + 1
            if (r4 < r0) goto L_0x003a
            r5 = r9
            goto L_0x010a
        L_0x003a:
            r5 = r9
            goto L_0x0013
        L_0x003c:
            if (r6 != 0) goto L_0x0042
            com.fasterxml.jackson.core.util.ByteArrayBuilder r6 = com.fasterxml.jackson.core.util.ByteArrayBuilder.fromInitial(r1, r5)
        L_0x0042:
            int r8 = r1.length
            if (r5 < r8) goto L_0x004a
            byte[] r1 = r6.finishCurrentSegment()
            r5 = 0
        L_0x004a:
            int r8 = r4 + 1
            char r4 = r12.charAt(r4)
            if (r4 > r9) goto L_0x005e
            r1 = r7[r4]
            int r5 = r11._appendByte(r4, r1, r6, r5)
            byte[] r1 = r6.getCurrentSegment()
            r4 = r8
            goto L_0x000d
        L_0x005e:
            r7 = 2047(0x7ff, float:2.868E-42)
            if (r4 > r7) goto L_0x0073
            int r7 = r5 + 1
            int r9 = r4 >> 6
            r9 = r9 | 192(0xc0, float:2.69E-43)
            byte r9 = (byte) r9
            r1[r5] = r9
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
        L_0x006f:
            r5 = r4
            r4 = r8
            goto L_0x00fa
        L_0x0073:
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r7) goto L_0x00d7
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r4 <= r7) goto L_0x007e
            goto L_0x00d7
        L_0x007e:
            r7 = 56319(0xdbff, float:7.892E-41)
            if (r4 > r7) goto L_0x00d3
            if (r8 >= r0) goto L_0x00cf
            int r7 = r8 + 1
            char r8 = r12.charAt(r8)
            int r4 = _convert(r4, r8)
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r4 > r8) goto L_0x00cb
            int r8 = r5 + 1
            int r9 = r4 >> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r1[r5] = r9
            int r5 = r1.length
            if (r8 < r5) goto L_0x00a5
            byte[] r1 = r6.finishCurrentSegment()
            r8 = 0
        L_0x00a5:
            int r5 = r8 + 1
            int r9 = r4 >> 12
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r1[r8] = r9
            int r8 = r1.length
            if (r5 < r8) goto L_0x00b8
            byte[] r1 = r6.finishCurrentSegment()
            r5 = 0
        L_0x00b8:
            int r8 = r5 + 1
            int r9 = r4 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r1[r5] = r9
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
            r5 = r4
            r4 = r7
            r7 = r8
            goto L_0x00fa
        L_0x00cb:
            _illegal(r4)
            throw r2
        L_0x00cf:
            _illegal(r4)
            throw r2
        L_0x00d3:
            _illegal(r4)
            throw r2
        L_0x00d7:
            int r7 = r5 + 1
            int r9 = r4 >> 12
            r9 = r9 | 224(0xe0, float:3.14E-43)
            byte r9 = (byte) r9
            r1[r5] = r9
            int r5 = r1.length
            if (r7 < r5) goto L_0x00e8
            byte[] r1 = r6.finishCurrentSegment()
            r7 = 0
        L_0x00e8:
            int r5 = r7 + 1
            int r9 = r4 >> 6
            r9 = r9 & 63
            r9 = r9 | 128(0x80, float:1.794E-43)
            byte r9 = (byte) r9
            r1[r7] = r9
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.794E-43)
            r7 = r5
            goto L_0x006f
        L_0x00fa:
            int r8 = r1.length
            if (r7 < r8) goto L_0x0102
            byte[] r1 = r6.finishCurrentSegment()
            r7 = 0
        L_0x0102:
            int r8 = r7 + 1
            byte r5 = (byte) r5
            r1[r7] = r5
            r5 = r8
            goto L_0x000d
        L_0x010a:
            if (r6 != 0) goto L_0x0111
            byte[] r12 = java.util.Arrays.copyOfRange(r1, r3, r5)
            return r12
        L_0x0111:
            byte[] r12 = r6.completeAndCoalesce(r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p187io.JsonStringEncoder.quoteAsUTF8(java.lang.String):byte[]");
    }
}
