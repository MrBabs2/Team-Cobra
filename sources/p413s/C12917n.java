package p413s;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C10202j;

/* renamed from: s.n */
/* compiled from: InflaterSource.kt */
public final class C12917n implements C12892a0 {

    /* renamed from: f */
    private int f33169f;

    /* renamed from: g */
    private boolean f33170g;

    /* renamed from: h */
    private final C12910h f33171h;

    /* renamed from: i */
    private final Inflater f33172i;

    public C12917n(C12910h hVar, Inflater inflater) {
        C10202j.m34178b(hVar, "source");
        C10202j.m34178b(inflater, "inflater");
        this.f33171h = hVar;
        this.f33172i = inflater;
    }

    /* renamed from: b */
    private final void m41671b() {
        int i = this.f33169f;
        if (i != 0) {
            int remaining = i - this.f33172i.getRemaining();
            this.f33169f -= remaining;
            this.f33171h.skip((long) remaining);
        }
    }

    /* renamed from: a */
    public final boolean mo41258a() throws IOException {
        if (!this.f33172i.needsInput()) {
            return false;
        }
        m41671b();
        if (!(this.f33172i.getRemaining() == 0)) {
            throw new IllegalStateException("?".toString());
        } else if (this.f33171h.mo41169g()) {
            return true;
        } else {
            C12927v vVar = this.f33171h.getBuffer().f33148f;
            if (vVar != null) {
                int i = vVar.f33195c;
                int i2 = vVar.f33194b;
                int i3 = i - i2;
                this.f33169f = i3;
                this.f33172i.setInput(vVar.f33193a, i2, i3);
                return false;
            }
            C10202j.m34172a();
            throw null;
        }
    }

    public void close() throws IOException {
        if (!this.f33170g) {
            this.f33172i.end();
            this.f33170g = true;
            this.f33171h.close();
        }
    }

    public long read(C12905f fVar, long j) throws IOException {
        C12927v b;
        C10202j.m34178b(fVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.f33170g)) {
            throw new IllegalStateException("closed".toString());
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = mo41258a();
                try {
                    b = fVar.mo41156b(1);
                    int inflate = this.f33172i.inflate(b.f33193a, b.f33195c, (int) Math.min(j, (long) (8192 - b.f33195c)));
                    if (inflate > 0) {
                        b.f33195c += inflate;
                        long j2 = (long) inflate;
                        fVar.mo41180k(fVar.size() + j2);
                        return j2;
                    } else if (this.f33172i.finished()) {
                        break;
                    } else if (this.f33172i.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m41671b();
            if (b.f33194b != b.f33195c) {
                return -1;
            }
            fVar.f33148f = b.mo41297b();
            C12929w.m41739a(b);
            return -1;
        }
    }

    public C12894b0 timeout() {
        return this.f33171h.timeout();
    }
}
