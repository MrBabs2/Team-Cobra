package com.bumptech.glide.load.p152o.p153c;

import com.bumptech.glide.load.engine.p147z.C5999b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.o.c.s */
/* compiled from: RecyclableBufferedInputStream */
public class C6177s extends FilterInputStream {

    /* renamed from: f */
    private volatile byte[] f11292f;

    /* renamed from: g */
    private int f11293g;

    /* renamed from: h */
    private int f11294h;

    /* renamed from: i */
    private int f11295i;

    /* renamed from: j */
    private int f11296j;

    /* renamed from: k */
    private final C5999b f11297k;

    /* renamed from: com.bumptech.glide.load.o.c.s$a */
    /* compiled from: RecyclableBufferedInputStream */
    static class C6178a extends IOException {
        C6178a(String str) {
            super(str);
        }
    }

    public C6177s(InputStream inputStream, C5999b bVar) {
        this(inputStream, bVar, 65536);
    }

    /* renamed from: d */
    private static IOException m12489d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public synchronized void mo20464a() {
        this.f11294h = this.f11292f.length;
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f11292f == null || inputStream == null) {
            m12489d();
            throw null;
        }
        return (this.f11293g - this.f11296j) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void mo20466b() {
        if (this.f11292f != null) {
            this.f11297k.mo20262a(this.f11292f);
            this.f11292f = null;
        }
    }

    public void close() throws IOException {
        if (this.f11292f != null) {
            this.f11297k.mo20262a(this.f11292f);
            this.f11292f = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f11294h = Math.max(this.f11294h, i);
        this.f11295i = this.f11296j;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0026=Splitter:B:19:0x0026, B:11:0x0019=Splitter:B:11:0x0019, B:28:0x003b=Splitter:B:28:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f11292f     // Catch:{ all -> 0x003f }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003f }
            r2 = 0
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r3 = r6.f11296j     // Catch:{ all -> 0x003f }
            int r4 = r6.f11293g     // Catch:{ all -> 0x003f }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.m12488a(r1, r0)     // Catch:{ all -> 0x003f }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f11292f     // Catch:{ all -> 0x003f }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f11292f     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            m12489d()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x0026:
            int r1 = r6.f11293g     // Catch:{ all -> 0x003f }
            int r2 = r6.f11296j     // Catch:{ all -> 0x003f }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r6.f11296j     // Catch:{ all -> 0x003f }
            int r2 = r1 + 1
            r6.f11296j = r2     // Catch:{ all -> 0x003f }
            byte r0 = r0[r1]     // Catch:{ all -> 0x003f }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0039:
            monitor-exit(r6)
            return r5
        L_0x003b:
            m12489d()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p152o.p153c.C6177s.read():int");
    }

    public synchronized void reset() throws IOException {
        if (this.f11292f == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.f11295i) {
            this.f11296j = this.f11295i;
        } else {
            throw new C6178a("Mark has been invalidated, pos: " + this.f11296j + " markLimit: " + this.f11294h);
        }
    }

    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f11292f;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                m12489d();
                throw null;
            } else if (((long) (this.f11293g - this.f11296j)) >= j) {
                this.f11296j = (int) (((long) this.f11296j) + j);
                return j;
            } else {
                long j2 = ((long) this.f11293g) - ((long) this.f11296j);
                this.f11296j = this.f11293g;
                if (this.f11295i == -1 || j > ((long) this.f11294h)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m12488a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    if (((long) (this.f11293g - this.f11296j)) >= j - j2) {
                        this.f11296j = (int) ((((long) this.f11296j) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) this.f11293g)) - ((long) this.f11296j);
                    this.f11296j = this.f11293g;
                    return j3;
                }
            }
        } else {
            m12489d();
            throw null;
        }
    }

    C6177s(InputStream inputStream, C5999b bVar, int i) {
        super(inputStream);
        this.f11295i = -1;
        this.f11297k = bVar;
        this.f11292f = (byte[]) bVar.mo20263b(i, byte[].class);
    }

    /* renamed from: a */
    private int m12488a(InputStream inputStream, byte[] bArr) throws IOException {
        int i;
        int i2 = this.f11295i;
        if (i2 == -1 || this.f11296j - i2 >= (i = this.f11294h)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f11295i = -1;
                this.f11296j = 0;
                this.f11293g = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f11293g == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f11297k.mo20263b(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f11292f = bArr2;
            this.f11297k.mo20262a(bArr);
            bArr = bArr2;
        } else {
            int i3 = this.f11295i;
            if (i3 > 0) {
                System.arraycopy(bArr, i3, bArr, 0, bArr.length - i3);
            }
        }
        int i4 = this.f11296j - this.f11295i;
        this.f11296j = i4;
        this.f11295i = 0;
        this.f11293g = 0;
        int read2 = inputStream.read(bArr, i4, bArr.length - i4);
        int i5 = this.f11296j;
        if (read2 > 0) {
            i5 += read2;
        }
        this.f11293g = i5;
        return read2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005e, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f11292f     // Catch:{ all -> 0x009c }
            r1 = 0
            if (r0 == 0) goto L_0x0098
            if (r9 != 0) goto L_0x000b
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x009c }
            if (r2 == 0) goto L_0x0094
            int r3 = r6.f11296j     // Catch:{ all -> 0x009c }
            int r4 = r6.f11293g     // Catch:{ all -> 0x009c }
            if (r3 >= r4) goto L_0x003c
            int r3 = r6.f11293g     // Catch:{ all -> 0x009c }
            int r4 = r6.f11296j     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
            if (r3 < r9) goto L_0x001e
            r3 = r9
            goto L_0x0023
        L_0x001e:
            int r3 = r6.f11293g     // Catch:{ all -> 0x009c }
            int r4 = r6.f11296j     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
        L_0x0023:
            int r4 = r6.f11296j     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x009c }
            int r4 = r6.f11296j     // Catch:{ all -> 0x009c }
            int r4 = r4 + r3
            r6.f11296j = r4     // Catch:{ all -> 0x009c }
            if (r3 == r9) goto L_0x003a
            int r4 = r2.available()     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r8 = r8 + r3
            int r3 = r9 - r3
            goto L_0x003d
        L_0x003a:
            monitor-exit(r6)
            return r3
        L_0x003c:
            r3 = r9
        L_0x003d:
            int r4 = r6.f11295i     // Catch:{ all -> 0x009c }
            r5 = -1
            if (r4 != r5) goto L_0x0052
            int r4 = r0.length     // Catch:{ all -> 0x009c }
            if (r3 < r4) goto L_0x0052
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x0084
            if (r3 != r9) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            int r5 = r9 - r3
        L_0x0050:
            monitor-exit(r6)
            return r5
        L_0x0052:
            int r4 = r6.m12488a(r2, r0)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x005f
            if (r3 != r9) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            int r5 = r9 - r3
        L_0x005d:
            monitor-exit(r6)
            return r5
        L_0x005f:
            byte[] r4 = r6.f11292f     // Catch:{ all -> 0x009c }
            if (r0 == r4) goto L_0x006c
            byte[] r0 = r6.f11292f     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            m12489d()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x006c:
            int r4 = r6.f11293g     // Catch:{ all -> 0x009c }
            int r5 = r6.f11296j     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0075
            r4 = r3
            goto L_0x007a
        L_0x0075:
            int r4 = r6.f11293g     // Catch:{ all -> 0x009c }
            int r5 = r6.f11296j     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
        L_0x007a:
            int r5 = r6.f11296j     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x009c }
            int r5 = r6.f11296j     // Catch:{ all -> 0x009c }
            int r5 = r5 + r4
            r6.f11296j = r5     // Catch:{ all -> 0x009c }
        L_0x0084:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0089
            monitor-exit(r6)
            return r9
        L_0x0089:
            int r5 = r2.available()     // Catch:{ all -> 0x009c }
            if (r5 != 0) goto L_0x0092
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x0092:
            int r8 = r8 + r4
            goto L_0x003d
        L_0x0094:
            m12489d()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x0098:
            m12489d()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x009c:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x00a0
        L_0x009f:
            throw r7
        L_0x00a0:
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p152o.p153c.C6177s.read(byte[], int, int):int");
    }
}
