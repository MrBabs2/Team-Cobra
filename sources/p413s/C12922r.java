package p413s;

import java.io.OutputStream;
import kotlin.jvm.internal.C10202j;

/* renamed from: s.r */
/* compiled from: Okio.kt */
final class C12922r implements C12932y {

    /* renamed from: f */
    private final OutputStream f33178f;

    /* renamed from: g */
    private final C12894b0 f33179g;

    public C12922r(OutputStream outputStream, C12894b0 b0Var) {
        C10202j.m34178b(outputStream, "out");
        C10202j.m34178b(b0Var, "timeout");
        this.f33178f = outputStream;
        this.f33179g = b0Var;
    }

    public void close() {
        this.f33178f.close();
    }

    public void flush() {
        this.f33178f.flush();
    }

    public C12894b0 timeout() {
        return this.f33179g;
    }

    public String toString() {
        return "sink(" + this.f33178f + ')';
    }

    public void write(C12905f fVar, long j) {
        C10202j.m34178b(fVar, "source");
        C12897c.m41512a(fVar.size(), 0, j);
        while (j > 0) {
            this.f33179g.throwIfReached();
            C12927v vVar = fVar.f33148f;
            if (vVar != null) {
                int min = (int) Math.min(j, (long) (vVar.f33195c - vVar.f33194b));
                this.f33178f.write(vVar.f33193a, vVar.f33194b, min);
                vVar.f33194b += min;
                long j2 = (long) min;
                j -= j2;
                fVar.mo41180k(fVar.size() - j2);
                if (vVar.f33194b == vVar.f33195c) {
                    fVar.f33148f = vVar.mo41297b();
                    C12929w.m41739a(vVar);
                }
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
    }
}
