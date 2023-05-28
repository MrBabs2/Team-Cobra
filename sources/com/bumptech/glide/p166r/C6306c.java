package com.bumptech.glide.p166r;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.r.c */
/* compiled from: ContentLengthInputStream */
public final class C6306c extends FilterInputStream {

    /* renamed from: f */
    private final long f11554f;

    /* renamed from: g */
    private int f11555g;

    private C6306c(InputStream inputStream, long j) {
        super(inputStream);
        this.f11554f = j;
    }

    /* renamed from: a */
    public static InputStream m12957a(InputStream inputStream, long j) {
        return new C6306c(inputStream, j);
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f11554f - ((long) this.f11555g), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m12956a(read >= 0 ? 1 : -1);
        return read;
    }

    /* renamed from: a */
    private int m12956a(int i) throws IOException {
        if (i >= 0) {
            this.f11555g += i;
        } else if (this.f11554f - ((long) this.f11555g) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f11554f + ", but read: " + this.f11555g);
        }
        return i;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        m12956a(read);
        return read;
    }
}
