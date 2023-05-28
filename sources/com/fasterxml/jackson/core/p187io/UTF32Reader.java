package com.fasterxml.jackson.core.p187io;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* renamed from: com.fasterxml.jackson.core.io.UTF32Reader */
public class UTF32Reader extends Reader {
    protected final boolean _bigEndian;
    protected byte[] _buffer;
    protected int _byteCount;
    protected int _charCount;
    protected final IOContext _context;
    protected InputStream _in;
    protected int _length;
    protected final boolean _managedBuffers;
    protected int _ptr;
    protected char _surrogate = 0;
    protected char[] _tmpBuf;

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        boolean z2 = false;
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i;
        this._length = i2;
        this._bigEndian = z;
        this._managedBuffers = inputStream != null ? true : z2;
    }

    private void freeBuffers() {
        byte[] bArr = this._buffer;
        if (bArr != null) {
            this._buffer = null;
            this._context.releaseReadIOBuffer(bArr);
        }
    }

    private boolean loadMore(int i) throws IOException {
        int i2;
        this._byteCount += this._length - i;
        if (i > 0) {
            int i3 = this._ptr;
            if (i3 > 0) {
                byte[] bArr = this._buffer;
                System.arraycopy(bArr, i3, bArr, 0, i);
                this._ptr = 0;
            }
            this._length = i;
        } else {
            this._ptr = 0;
            InputStream inputStream = this._in;
            int read = inputStream == null ? -1 : inputStream.read(this._buffer);
            if (read < 1) {
                this._length = 0;
                if (read < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    return false;
                }
                reportStrangeStream();
                throw null;
            }
            this._length = read;
        }
        while (true) {
            int i4 = this._length;
            if (i4 >= 4) {
                return true;
            }
            InputStream inputStream2 = this._in;
            if (inputStream2 == null) {
                i2 = -1;
            } else {
                byte[] bArr2 = this._buffer;
                i2 = inputStream2.read(bArr2, i4, bArr2.length - i4);
            }
            if (i2 >= 1) {
                this._length += i2;
            } else if (i2 < 0) {
                if (this._managedBuffers) {
                    freeBuffers();
                }
                reportUnexpectedEOF(this._length, 4);
                throw null;
            } else {
                reportStrangeStream();
                throw null;
            }
        }
    }

    private void reportBounds(char[] cArr, int i, int i2) throws IOException {
        throw new ArrayIndexOutOfBoundsException("read(buf," + i + "," + i2 + "), cbuf[" + cArr.length + "]");
    }

    private void reportInvalid(int i, int i2, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-32 character 0x");
        sb.append(Integer.toHexString(i));
        sb.append(str);
        sb.append(" at char #");
        sb.append(this._charCount + i2);
        sb.append(", byte #");
        sb.append((this._byteCount + this._ptr) - 1);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    private void reportStrangeStream() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    private void reportUnexpectedEOF(int i, int i2) throws IOException {
        int i3 = this._charCount;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i + ", needed " + i2 + ", at char #" + i3 + ", byte #" + (this._byteCount + i) + ")");
    }

    public void close() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            this._in = null;
            freeBuffers();
            inputStream.close();
        }
    }

    public int read() throws IOException {
        if (this._tmpBuf == null) {
            this._tmpBuf = new char[1];
        }
        if (read(this._tmpBuf, 0, 1) < 1) {
            return -1;
        }
        return this._tmpBuf[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cd, code lost:
        r1 = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(char[] r12, int r13, int r14) throws java.io.IOException {
        /*
            r11 = this;
            byte[] r0 = r11._buffer
            r1 = -1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            if (r14 >= r0) goto L_0x000a
            return r14
        L_0x000a:
            r2 = 0
            if (r13 < 0) goto L_0x00d9
            int r3 = r13 + r14
            int r4 = r12.length
            if (r3 > r4) goto L_0x00d9
            int r14 = r14 + r13
            char r3 = r11._surrogate
            r4 = 0
            r5 = 4
            if (r3 == 0) goto L_0x0020
            int r1 = r13 + 1
            r12[r13] = r3
            r11._surrogate = r4
            goto L_0x003a
        L_0x0020:
            int r3 = r11._length
            int r6 = r11._ptr
            int r3 = r3 - r6
            if (r3 >= r5) goto L_0x0039
            boolean r6 = r11.loadMore(r3)
            if (r6 != 0) goto L_0x0039
            if (r3 != 0) goto L_0x0030
            return r1
        L_0x0030:
            int r12 = r11._length
            int r13 = r11._ptr
            int r12 = r12 - r13
            r11.reportUnexpectedEOF(r12, r5)
            throw r2
        L_0x0039:
            r1 = r13
        L_0x003a:
            int r3 = r11._length
            int r3 = r3 - r5
        L_0x003d:
            if (r1 >= r14) goto L_0x00d2
            int r6 = r11._ptr
            boolean r7 = r11._bigEndian
            if (r7 == 0) goto L_0x0062
            byte[] r7 = r11._buffer
            byte r8 = r7[r6]
            int r8 = r8 << 8
            int r9 = r6 + 1
            byte r9 = r7[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r8 = r8 | r9
            int r9 = r6 + 2
            byte r9 = r7[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            int r6 = r6 + 3
            byte r6 = r7[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 | r9
            goto L_0x0081
        L_0x0062:
            byte[] r7 = r11._buffer
            byte r8 = r7[r6]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r9 = r6 + 1
            byte r9 = r7[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            r8 = r8 | r9
            int r9 = r6 + 2
            byte r9 = r7[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r6 = r6 + 3
            byte r6 = r7[r6]
            int r6 = r6 << 8
            r6 = r6 | r9
            r10 = r8
            r8 = r6
            r6 = r10
        L_0x0081:
            int r7 = r11._ptr
            int r7 = r7 + r5
            r11._ptr = r7
            if (r8 == 0) goto L_0x00c4
            r7 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            int r8 = r7 + -1
            r9 = 16
            int r8 = r8 << r9
            r6 = r6 | r8
            if (r7 > r9) goto L_0x00ae
            int r7 = r1 + 1
            r8 = 55296(0xd800, float:7.7486E-41)
            int r9 = r6 >> 10
            int r9 = r9 + r8
            char r8 = (char) r9
            r12[r1] = r8
            r1 = 56320(0xdc00, float:7.8921E-41)
            r8 = r6 & 1023(0x3ff, float:1.434E-42)
            r1 = r1 | r8
            if (r7 < r14) goto L_0x00ab
            char r12 = (char) r6
            r11._surrogate = r12
            goto L_0x00cd
        L_0x00ab:
            r6 = r1
            r1 = r7
            goto L_0x00c4
        L_0x00ae:
            int r1 = r1 - r13
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r13 = 1114111(0x10ffff, float:1.561202E-39)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r4] = r13
            java.lang.String r13 = " (above 0x%08x)"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            r11.reportInvalid(r6, r1, r12)
            throw r2
        L_0x00c4:
            int r7 = r1 + 1
            char r6 = (char) r6
            r12[r1] = r6
            int r1 = r11._ptr
            if (r1 <= r3) goto L_0x00cf
        L_0x00cd:
            r1 = r7
            goto L_0x00d2
        L_0x00cf:
            r1 = r7
            goto L_0x003d
        L_0x00d2:
            int r1 = r1 - r13
            int r12 = r11._charCount
            int r12 = r12 + r1
            r11._charCount = r12
            return r1
        L_0x00d9:
            r11.reportBounds(r12, r13, r14)
            goto L_0x00de
        L_0x00dd:
            throw r2
        L_0x00de:
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p187io.UTF32Reader.read(char[], int, int):int");
    }
}
