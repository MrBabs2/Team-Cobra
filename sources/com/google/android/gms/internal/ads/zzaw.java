package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class zzaw extends ByteArrayOutputStream {

    /* renamed from: f */
    private final zzal f18568f;

    public zzaw(zzal zzal, int i) {
        this.f18568f = zzal;
        this.buf = zzal.mo27365a(Math.max(i, 256));
    }

    /* renamed from: a */
    private final void m20103a(int i) {
        int i2 = this.count;
        if (i2 + i > this.buf.length) {
            byte[] a = this.f18568f.mo27365a((i2 + i) << 1);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f18568f.mo27364a(this.buf);
            this.buf = a;
        }
    }

    public final void close() throws IOException {
        this.f18568f.mo27364a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f18568f.mo27364a(this.buf);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m20103a(i2);
        super.write(bArr, i, i2);
    }

    public final synchronized void write(int i) {
        m20103a(1);
        super.write(i);
    }
}
