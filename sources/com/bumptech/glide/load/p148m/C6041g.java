package com.bumptech.glide.load.p148m;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.m.g */
/* compiled from: ExifOrientationStream */
public final class C6041g extends FilterInputStream {

    /* renamed from: h */
    private static final byte[] f11114h;

    /* renamed from: i */
    private static final int f11115i;

    /* renamed from: j */
    private static final int f11116j;

    /* renamed from: f */
    private final byte f11117f;

    /* renamed from: g */
    private int f11118g;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f11114h = bArr;
        int length = bArr.length;
        f11115i = length;
        f11116j = length + 2;
    }

    public C6041g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f11117f = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f11118g;
        if (i3 < 2 || i3 > (i2 = f11116j)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f11117f;
        } else {
            i = f11114h[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f11118g++;
        }
        return i;
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f11118g = (int) (((long) this.f11118g) + skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f11118g;
        int i5 = f11116j;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f11117f;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f11114h, this.f11118g - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f11118g += i3;
        }
        return i3;
    }
}
