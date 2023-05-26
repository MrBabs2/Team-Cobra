package p413s;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.C10202j;

/* renamed from: s.t */
/* compiled from: RealBufferedSink.kt */
public final class C12924t implements C12909g {

    /* renamed from: f */
    public final C12905f f33186f = new C12905f();

    /* renamed from: g */
    public boolean f33187g;

    /* renamed from: h */
    public final C12932y f33188h;

    public C12924t(C12932y yVar) {
        C10202j.m34178b(yVar, "sink");
        this.f33188h = yVar;
    }

    /* renamed from: a */
    public C12909g mo41142a(String str, int i, int i2) {
        C10202j.m34178b(str, "string");
        if (!this.f33187g) {
            this.f33186f.mo41142a(str, i, i2);
            mo41171h();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b */
    public C12909g mo41155b(String str) {
        C10202j.m34178b(str, "string");
        if (!this.f33187g) {
            this.f33186f.mo41155b(str);
            return mo41171h();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: c */
    public C12909g mo41161c(C12911i iVar) {
        C10202j.m34178b(iVar, "byteString");
        if (!this.f33187g) {
            this.f33186f.mo41161c(iVar);
            mo41171h();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f33187g) {
            Throwable th = null;
            try {
                if (this.f33186f.size() > 0) {
                    this.f33188h.write(this.f33186f, this.f33186f.size());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f33188h.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f33187g = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public C12909g mo41164e() {
        if (!this.f33187g) {
            long size = this.f33186f.size();
            if (size > 0) {
                this.f33188h.write(this.f33186f, size);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void flush() {
        if (!this.f33187g) {
            if (this.f33186f.size() > 0) {
                C12932y yVar = this.f33188h;
                C12905f fVar = this.f33186f;
                yVar.write(fVar, fVar.size());
            }
            this.f33188h.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C12905f getBuffer() {
        return this.f33186f;
    }

    /* renamed from: h */
    public C12909g mo41171h() {
        if (!this.f33187g) {
            long i = this.f33186f.mo41174i();
            if (i > 0) {
                this.f33188h.write(this.f33186f, i);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: i */
    public C12909g mo41175i(long j) {
        if (!this.f33187g) {
            this.f33186f.mo41175i(j);
            mo41171h();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f33187g;
    }

    public C12894b0 timeout() {
        return this.f33188h.timeout();
    }

    public String toString() {
        return "buffer(" + this.f33188h + ')';
    }

    public void write(C12905f fVar, long j) {
        C10202j.m34178b(fVar, "source");
        if (!this.f33187g) {
            this.f33186f.write(fVar, j);
            mo41171h();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C12909g writeByte(int i) {
        if (!this.f33187g) {
            this.f33186f.writeByte(i);
            mo41171h();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C12909g writeInt(int i) {
        if (!this.f33187g) {
            this.f33186f.writeInt(i);
            return mo41171h();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C12909g writeShort(int i) {
        if (!this.f33187g) {
            this.f33186f.writeShort(i);
            mo41171h();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public long mo41135a(C12892a0 a0Var) {
        C10202j.m34178b(a0Var, "source");
        long j = 0;
        while (true) {
            long read = a0Var.read(this.f33186f, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            mo41171h();
        }
    }

    /* renamed from: c */
    public C12909g mo41160c(long j) {
        if (!this.f33187g) {
            this.f33186f.mo41160c(j);
            return mo41171h();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C12909g write(byte[] bArr) {
        C10202j.m34178b(bArr, "source");
        if (!this.f33187g) {
            this.f33186f.write(bArr);
            mo41171h();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C12909g write(byte[] bArr, int i, int i2) {
        C10202j.m34178b(bArr, "source");
        if (!this.f33187g) {
            this.f33186f.write(bArr, i, i2);
            mo41171h();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        C10202j.m34178b(byteBuffer, "source");
        if (!this.f33187g) {
            int write = this.f33186f.write(byteBuffer);
            mo41171h();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}
