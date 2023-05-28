package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.y2 */
final class C8161y2 extends FilterInputStream {

    /* renamed from: f */
    private final long f17262f;

    /* renamed from: g */
    private long f17263g;

    C8161y2(InputStream inputStream, long j) {
        super(inputStream);
        this.f17262f = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo26794a() {
        return this.f17262f - this.f17263g;
    }

    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f17263g++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f17263g += (long) read;
        }
        return read;
    }
}
