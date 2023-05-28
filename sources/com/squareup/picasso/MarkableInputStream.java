package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

final class MarkableInputStream extends InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private long defaultMark;

    /* renamed from: in */
    private final InputStream f25488in;
    private long limit;
    private long offset;
    private long reset;

    public MarkableInputStream(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void setLimit(long j) {
        try {
            if (this.reset >= this.offset || this.offset > this.limit) {
                this.reset = this.offset;
                this.f25488in.mark((int) (j - this.offset));
            } else {
                this.f25488in.reset();
                this.f25488in.mark((int) (j - this.reset));
                skip(this.reset, this.offset);
            }
            this.limit = j;
        } catch (IOException e) {
            throw new IllegalStateException("Unable to mark: " + e);
        }
    }

    private void skip(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f25488in.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public int available() throws IOException {
        return this.f25488in.available();
    }

    public void close() throws IOException {
        this.f25488in.close();
    }

    public void mark(int i) {
        this.defaultMark = savePosition(i);
    }

    public boolean markSupported() {
        return this.f25488in.markSupported();
    }

    public int read() throws IOException {
        int read = this.f25488in.read();
        if (read != -1) {
            this.offset++;
        }
        return read;
    }

    public void reset() throws IOException {
        reset(this.defaultMark);
    }

    public long savePosition(int i) {
        long j = this.offset + ((long) i);
        if (this.limit < j) {
            setLimit(j);
        }
        return this.offset;
    }

    public MarkableInputStream(InputStream inputStream, int i) {
        this.defaultMark = -1;
        this.f25488in = !inputStream.markSupported() ? new BufferedInputStream(inputStream, i) : inputStream;
    }

    public void reset(long j) throws IOException {
        if (this.offset > this.limit || j < this.reset) {
            throw new IOException("Cannot reset");
        }
        this.f25488in.reset();
        skip(this.reset, j);
        this.offset = j;
    }

    public int read(byte[] bArr) throws IOException {
        int read = this.f25488in.read(bArr);
        if (read != -1) {
            this.offset += (long) read;
        }
        return read;
    }

    public long skip(long j) throws IOException {
        long skip = this.f25488in.skip(j);
        this.offset += skip;
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f25488in.read(bArr, i, i2);
        if (read != -1) {
            this.offset += (long) read;
        }
        return read;
    }
}
