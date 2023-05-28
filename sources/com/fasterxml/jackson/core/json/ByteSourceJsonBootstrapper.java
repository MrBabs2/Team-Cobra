package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.p187io.IOContext;
import com.fasterxml.jackson.core.p187io.MergedStream;
import com.fasterxml.jackson.core.p187io.UTF32Reader;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public final class ByteSourceJsonBootstrapper {
    private boolean _bigEndian = true;
    private final boolean _bufferRecyclable;
    private int _bytesPerChar;
    private final IOContext _context;
    private final InputStream _in;
    private final byte[] _inputBuffer;
    private int _inputEnd;
    private int _inputPtr;

    public ByteSourceJsonBootstrapper(IOContext iOContext, InputStream inputStream) {
        this._context = iOContext;
        this._in = inputStream;
        this._inputBuffer = iOContext.allocReadIOBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._bufferRecyclable = true;
    }

    private boolean checkUTF16(int i) {
        if ((65280 & i) == 0) {
            this._bigEndian = true;
        } else if ((i & 255) != 0) {
            return false;
        } else {
            this._bigEndian = false;
        }
        this._bytesPerChar = 2;
        return true;
    }

    private boolean checkUTF32(int i) throws IOException {
        if ((i >> 8) == 0) {
            this._bigEndian = true;
        } else if ((16777215 & i) == 0) {
            this._bigEndian = false;
        } else if ((-16711681 & i) == 0) {
            reportWeirdUCS4("3412");
            throw null;
        } else if ((i & -65281) != 0) {
            return false;
        } else {
            reportWeirdUCS4("2143");
            throw null;
        }
        this._bytesPerChar = 4;
        return true;
    }

    private boolean handleBOM(int i) throws IOException {
        if (i == -16842752) {
            reportWeirdUCS4("3412");
            throw null;
        } else if (i == -131072) {
            this._inputPtr += 4;
            this._bytesPerChar = 4;
            this._bigEndian = false;
            return true;
        } else if (i == 65279) {
            this._bigEndian = true;
            this._inputPtr += 4;
            this._bytesPerChar = 4;
            return true;
        } else if (i != 65534) {
            int i2 = i >>> 16;
            if (i2 == 65279) {
                this._inputPtr += 2;
                this._bytesPerChar = 2;
                this._bigEndian = true;
                return true;
            } else if (i2 == 65534) {
                this._inputPtr += 2;
                this._bytesPerChar = 2;
                this._bigEndian = false;
                return true;
            } else if ((i >>> 8) != 15711167) {
                return false;
            } else {
                this._inputPtr += 3;
                this._bytesPerChar = 1;
                this._bigEndian = true;
                return true;
            }
        } else {
            reportWeirdUCS4("2143");
            throw null;
        }
    }

    private void reportWeirdUCS4(String str) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    public JsonParser constructParser(int i, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer, int i2) throws IOException {
        int i3 = i2;
        int i4 = this._inputPtr;
        JsonEncoding detectEncoding = detectEncoding();
        int i5 = this._inputPtr - i4;
        if (detectEncoding != JsonEncoding.UTF8 || !JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i3)) {
            return new ReaderBasedJsonParser(this._context, i, constructReader(), objectCodec, charsToNameCanonicalizer.makeChild(i2));
        }
        return new UTF8StreamJsonParser(this._context, i, this._in, objectCodec, byteQuadsCanonicalizer.makeChild(i3), this._inputBuffer, this._inputPtr, this._inputEnd, i5, this._bufferRecyclable);
    }

    public Reader constructReader() throws IOException {
        JsonEncoding encoding = this._context.getEncoding();
        int bits = encoding.bits();
        if (bits == 8 || bits == 16) {
            InputStream inputStream = this._in;
            if (inputStream == null) {
                inputStream = new ByteArrayInputStream(this._inputBuffer, this._inputPtr, this._inputEnd);
            } else if (this._inputPtr < this._inputEnd) {
                inputStream = new MergedStream(this._context, inputStream, this._inputBuffer, this._inputPtr, this._inputEnd);
            }
            return new InputStreamReader(inputStream, encoding.getJavaName());
        } else if (bits == 32) {
            IOContext iOContext = this._context;
            return new UTF32Reader(iOContext, this._in, this._inputBuffer, this._inputPtr, this._inputEnd, iOContext.getEncoding().isBigEndian());
        } else {
            throw new RuntimeException("Internal error");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (checkUTF16((r1[r5 + 1] & 255) | ((r1[r5] & 255) << 8)) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (checkUTF16(r1 >>> 16) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonEncoding detectEncoding() throws java.io.IOException {
        /*
            r8 = this;
            r0 = 4
            boolean r1 = r8.ensureLoaded(r0)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0042
            byte[] r1 = r8._inputBuffer
            int r5 = r8._inputPtr
            byte r6 = r1[r5]
            int r6 = r6 << 24
            int r7 = r5 + 1
            byte r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r6 = r6 | r7
            int r7 = r5 + 2
            byte r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 | r7
            int r5 = r5 + 3
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r5 = r8.handleBOM(r1)
            if (r5 == 0) goto L_0x0032
            goto L_0x005e
        L_0x0032:
            boolean r5 = r8.checkUTF32(r1)
            if (r5 == 0) goto L_0x0039
            goto L_0x005e
        L_0x0039:
            int r1 = r1 >>> 16
            boolean r1 = r8.checkUTF16(r1)
            if (r1 == 0) goto L_0x005f
            goto L_0x005e
        L_0x0042:
            boolean r1 = r8.ensureLoaded(r2)
            if (r1 == 0) goto L_0x005f
            byte[] r1 = r8._inputBuffer
            int r5 = r8._inputPtr
            byte r6 = r1[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r5 = r5 + r3
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r1 = r8.checkUTF16(r1)
            if (r1 == 0) goto L_0x005f
        L_0x005e:
            r4 = 1
        L_0x005f:
            if (r4 != 0) goto L_0x0064
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
            goto L_0x008a
        L_0x0064:
            int r1 = r8._bytesPerChar
            if (r1 == r3) goto L_0x0088
            if (r1 == r2) goto L_0x007e
            if (r1 != r0) goto L_0x0076
            boolean r0 = r8._bigEndian
            if (r0 == 0) goto L_0x0073
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_BE
            goto L_0x008a
        L_0x0073:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_LE
            goto L_0x008a
        L_0x0076:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal error"
            r0.<init>(r1)
            throw r0
        L_0x007e:
            boolean r0 = r8._bigEndian
            if (r0 == 0) goto L_0x0085
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE
            goto L_0x008a
        L_0x0085:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE
            goto L_0x008a
        L_0x0088:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
        L_0x008a:
            com.fasterxml.jackson.core.io.IOContext r1 = r8._context
            r1.setEncoding(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper.detectEncoding():com.fasterxml.jackson.core.JsonEncoding");
    }

    /* access modifiers changed from: protected */
    public boolean ensureLoaded(int i) throws IOException {
        int i2;
        int i3 = this._inputEnd - this._inputPtr;
        while (i3 < i) {
            InputStream inputStream = this._in;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this._inputBuffer;
                int i4 = this._inputEnd;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this._inputEnd += i2;
            i3 += i2;
        }
        return true;
    }
}
