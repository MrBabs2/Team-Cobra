package com.bumptech.glide.p142k;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.k.b */
/* compiled from: StrictLineReader */
class C5892b implements Closeable {

    /* renamed from: f */
    private final InputStream f10714f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Charset f10715g;

    /* renamed from: h */
    private byte[] f10716h;

    /* renamed from: i */
    private int f10717i;

    /* renamed from: j */
    private int f10718j;

    /* renamed from: com.bumptech.glide.k.b$a */
    /* compiled from: StrictLineReader */
    class C5893a extends ByteArrayOutputStream {
        C5893a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            try {
                return new String(this.buf, 0, (i <= 0 || this.buf[i + -1] != 13) ? this.count : i - 1, C5892b.this.f10715g.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C5892b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: d */
    private void m11608d() throws IOException {
        InputStream inputStream = this.f10714f;
        byte[] bArr = this.f10716h;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f10717i = 0;
            this.f10718j = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public String mo20036b() throws IOException {
        int i;
        int i2;
        synchronized (this.f10714f) {
            if (this.f10716h != null) {
                if (this.f10717i >= this.f10718j) {
                    m11608d();
                }
                for (int i3 = this.f10717i; i3 != this.f10718j; i3++) {
                    if (this.f10716h[i3] == 10) {
                        if (i3 != this.f10717i) {
                            i2 = i3 - 1;
                            if (this.f10716h[i2] == 13) {
                                String str = new String(this.f10716h, this.f10717i, i2 - this.f10717i, this.f10715g.name());
                                this.f10717i = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f10716h, this.f10717i, i2 - this.f10717i, this.f10715g.name());
                        this.f10717i = i3 + 1;
                        return str2;
                    }
                }
                C5893a aVar = new C5893a((this.f10718j - this.f10717i) + 80);
                loop1:
                while (true) {
                    aVar.write(this.f10716h, this.f10717i, this.f10718j - this.f10717i);
                    this.f10718j = -1;
                    m11608d();
                    i = this.f10717i;
                    while (true) {
                        if (i != this.f10718j) {
                            if (this.f10716h[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f10717i) {
                    aVar.write(this.f10716h, this.f10717i, i - this.f10717i);
                }
                this.f10717i = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public void close() throws IOException {
        synchronized (this.f10714f) {
            if (this.f10716h != null) {
                this.f10716h = null;
                this.f10714f.close();
            }
        }
    }

    public C5892b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C5894c.f10720a)) {
            this.f10714f = inputStream;
            this.f10715g = charset;
            this.f10716h = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    public boolean mo20035a() {
        return this.f10718j == -1;
    }
}
