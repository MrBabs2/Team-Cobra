package p413s;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.C10202j;

/* renamed from: s.o */
/* compiled from: Okio.kt */
final class C12918o implements C12892a0 {

    /* renamed from: f */
    private final InputStream f33173f;

    /* renamed from: g */
    private final C12894b0 f33174g;

    public C12918o(InputStream inputStream, C12894b0 b0Var) {
        C10202j.m34178b(inputStream, "input");
        C10202j.m34178b(b0Var, "timeout");
        this.f33173f = inputStream;
        this.f33174g = b0Var;
    }

    public void close() {
        this.f33173f.close();
    }

    public long read(C12905f fVar, long j) {
        C10202j.m34178b(fVar, "sink");
        if (j == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                this.f33174g.throwIfReached();
                C12927v b = fVar.mo41156b(1);
                int read = this.f33173f.read(b.f33193a, b.f33195c, (int) Math.min(j, (long) (8192 - b.f33195c)));
                if (read == -1) {
                    return -1;
                }
                b.f33195c += read;
                long j2 = (long) read;
                fVar.mo41180k(fVar.size() + j2);
                return j2;
            } catch (AssertionError e) {
                if (C12919p.m41682a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    public C12894b0 timeout() {
        return this.f33174g;
    }

    public String toString() {
        return "source(" + this.f33173f + ')';
    }
}
