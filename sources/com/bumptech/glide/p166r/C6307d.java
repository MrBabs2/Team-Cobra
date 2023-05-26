package com.bumptech.glide.p166r;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.r.d */
/* compiled from: ExceptionCatchingInputStream */
public class C6307d extends InputStream {

    /* renamed from: h */
    private static final Queue<C6307d> f11556h = C6316k.m12994a(0);

    /* renamed from: f */
    private InputStream f11557f;

    /* renamed from: g */
    private IOException f11558g;

    C6307d() {
    }

    /* renamed from: b */
    public static C6307d m12958b(InputStream inputStream) {
        C6307d poll;
        synchronized (f11556h) {
            poll = f11556h.poll();
        }
        if (poll == null) {
            poll = new C6307d();
        }
        poll.mo20743a(inputStream);
        return poll;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20743a(InputStream inputStream) {
        this.f11557f = inputStream;
    }

    public int available() throws IOException {
        return this.f11557f.available();
    }

    public void close() throws IOException {
        this.f11557f.close();
    }

    public void mark(int i) {
        this.f11557f.mark(i);
    }

    public boolean markSupported() {
        return this.f11557f.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.f11557f.read(bArr);
        } catch (IOException e) {
            this.f11558g = e;
            return -1;
        }
    }

    public synchronized void reset() throws IOException {
        this.f11557f.reset();
    }

    public long skip(long j) {
        try {
            return this.f11557f.skip(j);
        } catch (IOException e) {
            this.f11558g = e;
            return 0;
        }
    }

    /* renamed from: a */
    public IOException mo20742a() {
        return this.f11558g;
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f11557f.read(bArr, i, i2);
        } catch (IOException e) {
            this.f11558g = e;
            return -1;
        }
    }

    public int read() {
        try {
            return this.f11557f.read();
        } catch (IOException e) {
            this.f11558g = e;
            return -1;
        }
    }

    /* renamed from: b */
    public void mo20745b() {
        this.f11558g = null;
        this.f11557f = null;
        synchronized (f11556h) {
            f11556h.offer(this);
        }
    }
}
