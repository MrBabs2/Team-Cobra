package com.bumptech.glide.p166r;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.r.h */
/* compiled from: MarkEnforcingInputStream */
public class C6313h extends FilterInputStream {

    /* renamed from: f */
    private int f11566f = Integer.MIN_VALUE;

    public C6313h(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: d */
    private long m12975d(long j) {
        int i = this.f11566f;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    /* renamed from: g */
    private void m12976g(long j) {
        int i = this.f11566f;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f11566f = (int) (((long) i) - j);
        }
    }

    public int available() throws IOException {
        int i = this.f11566f;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f11566f = i;
    }

    public int read() throws IOException {
        if (m12975d(1) == -1) {
            return -1;
        }
        int read = super.read();
        m12976g(1);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.f11566f = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        long d = m12975d(j);
        if (d == -1) {
            return 0;
        }
        long skip = super.skip(d);
        m12976g(skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int d = (int) m12975d((long) i2);
        if (d == -1) {
            return -1;
        }
        int read = super.read(bArr, i, d);
        m12976g((long) read);
        return read;
    }
}
