package com.bumptech.glide.load.p148m;

import com.bumptech.glide.load.engine.p147z.C5999b;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.m.c */
/* compiled from: BufferedOutputStream */
public final class C6033c extends OutputStream {

    /* renamed from: f */
    private final OutputStream f11107f;

    /* renamed from: g */
    private byte[] f11108g;

    /* renamed from: h */
    private C5999b f11109h;

    /* renamed from: i */
    private int f11110i;

    public C6033c(OutputStream outputStream, C5999b bVar) {
        this(outputStream, bVar, 65536);
    }

    /* renamed from: a */
    private void m12087a() throws IOException {
        int i = this.f11110i;
        if (i > 0) {
            this.f11107f.write(this.f11108g, 0, i);
            this.f11110i = 0;
        }
    }

    /* renamed from: b */
    private void m12088b() throws IOException {
        if (this.f11110i == this.f11108g.length) {
            m12087a();
        }
    }

    /* renamed from: d */
    private void m12089d() {
        byte[] bArr = this.f11108g;
        if (bArr != null) {
            this.f11109h.mo20262a(bArr);
            this.f11108g = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() throws IOException {
        try {
            flush();
            this.f11107f.close();
            m12089d();
        } catch (Throwable th) {
            this.f11107f.close();
            throw th;
        }
    }

    public void flush() throws IOException {
        m12087a();
        this.f11107f.flush();
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.f11108g;
        int i2 = this.f11110i;
        this.f11110i = i2 + 1;
        bArr[i2] = (byte) i;
        m12088b();
    }

    C6033c(OutputStream outputStream, C5999b bVar, int i) {
        this.f11107f = outputStream;
        this.f11109h = bVar;
        this.f11108g = (byte[]) bVar.mo20263b(i, byte[].class);
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.f11110i != 0 || i4 < this.f11108g.length) {
                int min = Math.min(i4, this.f11108g.length - this.f11110i);
                System.arraycopy(bArr, i5, this.f11108g, this.f11110i, min);
                this.f11110i += min;
                i3 += min;
                m12088b();
            } else {
                this.f11107f.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
