package p413s;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u0001H\u0016J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J(\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'H\u0016J \u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'2\u0006\u0010 \u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020'H\u0016J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\"H\u0016J\b\u00102\u001a\u00020\u0012H\u0016J\b\u00103\u001a\u00020\u0012H\u0016J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0018\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020\u00122\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000208H\u0016J\u0010\u0010;\u001a\u0002082\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\n\u0010=\u001a\u0004\u0018\u000108H\u0016J\b\u0010>\u001a\u000208H\u0016J\u0010\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020\u0012H\u0016J\u0010\u0010@\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010A\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u000208H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, mo16641d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "source", "Lokio/Source;", "(Lokio/Source;)V", "buffer", "Lokio/Buffer;", "buffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", "close", "", "exhausted", "indexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "peek", "rangeEquals", "offset", "bytesOffset", "", "byteCount", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "", "charset", "Ljava/nio/charset/Charset;", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "skip", "timeout", "Lokio/Timeout;", "toString", "jvm"}, mo16642k = 1, mo16643mv = {1, 1, 11})
/* renamed from: s.u */
/* compiled from: RealBufferedSource.kt */
public final class C12925u implements C12910h {

    /* renamed from: f */
    public final C12905f f33189f = new C12905f();

    /* renamed from: g */
    public boolean f33190g;

    /* renamed from: h */
    public final C12892a0 f33191h;

    public C12925u(C12892a0 a0Var) {
        C10202j.m34178b(a0Var, "source");
        this.f33191h = a0Var;
    }

    /* renamed from: a */
    public C12911i mo41148a(long j) {
        mo41172h(j);
        return this.f33189f.mo41148a(j);
    }

    /* renamed from: b */
    public String mo41154b(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long a = mo41280a(b, 0, j2);
            if (a != -1) {
                return this.f33189f.mo41178j(a);
            }
            if (j2 < Long.MAX_VALUE && request(j2) && this.f33189f.mo41163d(j2 - 1) == ((byte) 13) && request(1 + j2) && this.f33189f.mo41163d(j2) == b) {
                return this.f33189f.mo41178j(j2);
            }
            C12905f fVar = new C12905f();
            C12905f fVar2 = this.f33189f;
            fVar2.mo41145a(fVar, 0, Math.min((long) 32, fVar2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f33189f.size(), j) + " content=" + fVar.mo41179k().mo41234m() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: c */
    public C12905f mo41158c() {
        return this.f33189f;
    }

    public void close() {
        if (!this.f33190g) {
            this.f33190g = true;
            this.f33191h.close();
            this.f33189f.mo41157b();
        }
    }

    /* renamed from: e */
    public byte[] mo41165e(long j) {
        mo41172h(j);
        return this.f33189f.mo41165e(j);
    }

    /* renamed from: f */
    public byte[] mo41167f() {
        this.f33189f.mo41135a(this.f33191h);
        return this.f33189f.mo41167f();
    }

    /* renamed from: g */
    public boolean mo41169g() {
        if (!(!this.f33190g)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f33189f.mo41169g() || this.f33191h.read(this.f33189f, (long) 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    public C12905f getBuffer() {
        return this.f33189f;
    }

    /* renamed from: h */
    public void mo41172h(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    public boolean isOpen() {
        return !this.f33190g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r4 == 0) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r1 = kotlin.jvm.internal.C10185a0.f27833a;
        r1 = java.lang.String.format("Expected leading [0-9] or '-' character but was %#x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(r8)}, 1));
        kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, "java.lang.String.format(format, *args)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        throw new java.lang.NumberFormatException(r1);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo41177j() {
        /*
            r10 = this;
            r0 = 1
            r10.mo41172h(r0)
            r2 = 0
            r4 = r2
        L_0x0008:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L_0x0052
            s.f r8 = r10.f33189f
            byte r8 = r8.mo41163d(r4)
            r9 = 48
            byte r9 = (byte) r9
            if (r8 < r9) goto L_0x0020
            r9 = 57
            byte r9 = (byte) r9
            if (r8 <= r9) goto L_0x002a
        L_0x0020:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L_0x002c
            r9 = 45
            byte r9 = (byte) r9
            if (r8 == r9) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r4 = r6
            goto L_0x0008
        L_0x002c:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            goto L_0x0052
        L_0x0031:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            kotlin.jvm.internal.a0 r1 = kotlin.jvm.internal.C10185a0.f27833a
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            java.lang.Byte r4 = java.lang.Byte.valueOf(r8)
            r2[r3] = r4
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r2 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r2)
            r0.<init>(r1)
            throw r0
        L_0x0052:
            s.f r0 = r10.f33189f
            long r0 = r0.mo41177j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p413s.C12925u.mo41177j():long");
    }

    /* renamed from: k */
    public C12911i mo41179k() {
        this.f33189f.mo41135a(this.f33191h);
        return this.f33189f.mo41179k();
    }

    /* renamed from: n */
    public String mo41184n() {
        return mo41154b(Long.MAX_VALUE);
    }

    public C12910h peek() {
        return C12919p.m41675a((C12892a0) new C12923s(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo41187r() {
        /*
            r6 = this;
            r0 = 1
            r6.mo41172h(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.request(r3)
            if (r3 == 0) goto L_0x005b
            s.f r3 = r6.f33189f
            long r4 = (long) r1
            byte r3 = r3.mo41163d(r4)
            r4 = 48
            byte r4 = (byte) r4
            if (r3 < r4) goto L_0x0021
            r4 = 57
            byte r4 = (byte) r4
            if (r3 <= r4) goto L_0x0036
        L_0x0021:
            r4 = 97
            byte r4 = (byte) r4
            if (r3 < r4) goto L_0x002b
            r4 = 102(0x66, float:1.43E-43)
            byte r4 = (byte) r4
            if (r3 <= r4) goto L_0x0036
        L_0x002b:
            r4 = 65
            byte r4 = (byte) r4
            if (r3 < r4) goto L_0x0038
            r4 = 70
            byte r4 = (byte) r4
            if (r3 <= r4) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r1 = r2
            goto L_0x0007
        L_0x0038:
            if (r1 == 0) goto L_0x003b
            goto L_0x005b
        L_0x003b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            kotlin.jvm.internal.a0 r2 = kotlin.jvm.internal.C10185a0.f27833a
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r4[r0] = r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r2)
            r1.<init>(r0)
            throw r1
        L_0x005b:
            s.f r0 = r6.f33189f
            long r0 = r0.mo41187r()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p413s.C12925u.mo41187r():long");
    }

    public long read(C12905f fVar, long j) {
        C10202j.m34178b(fVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(true ^ this.f33190g)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f33189f.size() == 0 && this.f33191h.read(this.f33189f, (long) 8192) == -1) {
            return -1;
        } else {
            return this.f33189f.read(fVar, Math.min(j, this.f33189f.size()));
        }
    }

    public byte readByte() {
        mo41172h(1);
        return this.f33189f.readByte();
    }

    public void readFully(byte[] bArr) {
        C10202j.m34178b(bArr, "sink");
        try {
            mo41172h((long) bArr.length);
            this.f33189f.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f33189f.size() > 0) {
                C12905f fVar = this.f33189f;
                int read = fVar.read(bArr, i, (int) fVar.size());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    public int readInt() {
        mo41172h(4);
        return this.f33189f.readInt();
    }

    public long readLong() {
        mo41172h(8);
        return this.f33189f.readLong();
    }

    public short readShort() {
        mo41172h(2);
        return this.f33189f.readShort();
    }

    public boolean request(long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!this.f33190g) {
            while (this.f33189f.size() < j) {
                if (this.f33191h.read(this.f33189f, (long) 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: s */
    public InputStream mo41196s() {
        return new C12926a(this);
    }

    public void skip(long j) {
        if (!this.f33190g) {
            while (j > 0) {
                if (this.f33189f.size() == 0 && this.f33191h.read(this.f33189f, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f33189f.size());
                this.f33189f.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C12894b0 timeout() {
        return this.f33191h.timeout();
    }

    public String toString() {
        return "buffer(" + this.f33191h + ')';
    }

    /* renamed from: a */
    public int mo41132a(C12920q qVar) {
        C10202j.m34178b(qVar, "options");
        if (!this.f33190g) {
            do {
                int a = this.f33189f.mo41133a(qVar, true);
                if (a != -2) {
                    if (a == -1) {
                        return -1;
                    }
                    this.f33189f.skip((long) qVar.mo41261a()[a].mo41239s());
                    return a;
                }
            } while (this.f33191h.read(this.f33189f, (long) 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: s.u$a */
    /* compiled from: RealBufferedSource.kt */
    public static final class C12926a extends InputStream {

        /* renamed from: f */
        final /* synthetic */ C12925u f33192f;

        C12926a(C12925u uVar) {
            this.f33192f = uVar;
        }

        public int available() {
            C12925u uVar = this.f33192f;
            if (!uVar.f33190g) {
                return (int) Math.min(uVar.f33189f.size(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f33192f.close();
        }

        public int read() {
            C12925u uVar = this.f33192f;
            if (!uVar.f33190g) {
                if (uVar.f33189f.size() == 0) {
                    C12925u uVar2 = this.f33192f;
                    if (uVar2.f33191h.read(uVar2.f33189f, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f33192f.f33189f.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return this.f33192f + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            C10202j.m34178b(bArr, "data");
            if (!this.f33192f.f33190g) {
                C12897c.m41512a((long) bArr.length, (long) i, (long) i2);
                if (this.f33192f.f33189f.size() == 0) {
                    C12925u uVar = this.f33192f;
                    if (uVar.f33191h.read(uVar.f33189f, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f33192f.f33189f.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    public int read(ByteBuffer byteBuffer) {
        C10202j.m34178b(byteBuffer, "sink");
        if (this.f33189f.size() == 0 && this.f33191h.read(this.f33189f, (long) 8192) == -1) {
            return -1;
        }
        return this.f33189f.read(byteBuffer);
    }

    /* renamed from: a */
    public void mo41149a(C12905f fVar, long j) {
        C10202j.m34178b(fVar, "sink");
        try {
            mo41172h(j);
            this.f33189f.mo41149a(fVar, j);
        } catch (EOFException e) {
            fVar.mo41135a((C12892a0) this.f33189f);
            throw e;
        }
    }

    /* renamed from: a */
    public long mo41138a(C12932y yVar) {
        C10202j.m34178b(yVar, "sink");
        long j = 0;
        while (this.f33191h.read(this.f33189f, (long) 8192) != -1) {
            long i = this.f33189f.mo41174i();
            if (i > 0) {
                j += i;
                yVar.write(this.f33189f, i);
            }
        }
        if (this.f33189f.size() <= 0) {
            return j;
        }
        long size = j + this.f33189f.size();
        C12905f fVar = this.f33189f;
        yVar.write(fVar, fVar.size());
        return size;
    }

    /* renamed from: b */
    public short mo41284b() {
        mo41172h(2);
        return this.f33189f.mo41183m();
    }

    /* renamed from: b */
    public long mo41152b(C12911i iVar) {
        C10202j.m34178b(iVar, "targetBytes");
        return mo41283b(iVar, 0);
    }

    /* renamed from: b */
    public long mo41283b(C12911i iVar, long j) {
        C10202j.m34178b(iVar, "targetBytes");
        if (!this.f33190g) {
            while (true) {
                long b = this.f33189f.mo41153b(iVar, j);
                if (b != -1) {
                    return b;
                }
                long size = this.f33189f.size();
                if (this.f33191h.read(this.f33189f, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, size);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: a */
    public int mo41278a() {
        mo41172h(4);
        return this.f33189f.mo41181l();
    }

    /* renamed from: a */
    public long mo41279a(byte b) {
        return mo41280a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long mo41280a(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f33190g) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long a = this.f33189f.mo41134a(b, j, j2);
                    if (a == -1) {
                        long size = this.f33189f.size();
                        if (size >= j2 || this.f33191h.read(this.f33189f, (long) 8192) == -1) {
                            break;
                        }
                        j = Math.max(j, size);
                    } else {
                        return a;
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public long mo41136a(C12911i iVar) {
        C10202j.m34178b(iVar, "bytes");
        return mo41281a(iVar, 0);
    }

    /* renamed from: a */
    public long mo41281a(C12911i iVar, long j) {
        C10202j.m34178b(iVar, "bytes");
        if (!this.f33190g) {
            while (true) {
                long a = this.f33189f.mo41137a(iVar, j);
                if (a != -1) {
                    return a;
                }
                long size = this.f33189f.size();
                if (this.f33191h.read(this.f33189f, (long) 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (size - ((long) iVar.mo41239s())) + 1);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* renamed from: a */
    public boolean mo41150a(long j, C12911i iVar) {
        C10202j.m34178b(iVar, "bytes");
        return mo41282a(j, iVar, 0, iVar.mo41239s());
    }

    /* renamed from: a */
    public boolean mo41282a(long j, C12911i iVar, int i, int i2) {
        C10202j.m34178b(iVar, "bytes");
        if (!(!this.f33190g)) {
            throw new IllegalStateException("closed".toString());
        } else if (j < 0 || i < 0 || i2 < 0 || iVar.mo41239s() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!request(1 + j2) || this.f33189f.mo41163d(j2) != iVar.mo41216a(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public String mo41140a(Charset charset) {
        C10202j.m34178b(charset, "charset");
        this.f33189f.mo41135a(this.f33191h);
        return this.f33189f.mo41140a(charset);
    }
}
