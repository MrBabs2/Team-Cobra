package com.fasterxml.jackson.core.p187io;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fasterxml.jackson.core.io.MergedStream */
public final class MergedStream extends InputStream {

    /* renamed from: _b */
    private byte[] f12505_b;
    private final IOContext _ctxt;
    private final int _end;
    private final InputStream _in;
    private int _ptr;

    public MergedStream(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2) {
        this._ctxt = iOContext;
        this._in = inputStream;
        this.f12505_b = bArr;
        this._ptr = i;
        this._end = i2;
    }

    private void _free() {
        byte[] bArr = this.f12505_b;
        if (bArr != null) {
            this.f12505_b = null;
            IOContext iOContext = this._ctxt;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    public int available() throws IOException {
        if (this.f12505_b != null) {
            return this._end - this._ptr;
        }
        return this._in.available();
    }

    public void close() throws IOException {
        _free();
        this._in.close();
    }

    public void mark(int i) {
        if (this.f12505_b == null) {
            this._in.mark(i);
        }
    }

    public boolean markSupported() {
        return this.f12505_b == null && this._in.markSupported();
    }

    public int read() throws IOException {
        byte[] bArr = this.f12505_b;
        if (bArr == null) {
            return this._in.read();
        }
        int i = this._ptr;
        int i2 = i + 1;
        this._ptr = i2;
        byte b = bArr[i] & 255;
        if (i2 >= this._end) {
            _free();
        }
        return b;
    }

    public void reset() throws IOException {
        if (this.f12505_b == null) {
            this._in.reset();
        }
    }

    public long skip(long j) throws IOException {
        long j2;
        if (this.f12505_b != null) {
            int i = this._end;
            int i2 = this._ptr;
            long j3 = (long) (i - i2);
            if (j3 > j) {
                this._ptr = i2 + ((int) j);
                return j;
            }
            _free();
            j2 = j3 + 0;
            j -= j3;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this._in.skip(j) : j2;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f12505_b == null) {
            return this._in.read(bArr, i, i2);
        }
        int i3 = this._end - this._ptr;
        if (i2 > i3) {
            i2 = i3;
        }
        System.arraycopy(this.f12505_b, this._ptr, bArr, i, i2);
        int i4 = this._ptr + i2;
        this._ptr = i4;
        if (i4 >= this._end) {
            _free();
        }
        return i2;
    }
}
