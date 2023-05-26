package p413s;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C10202j;

/* renamed from: s.m */
/* compiled from: GzipSource.kt */
public final class C12916m implements C12892a0 {

    /* renamed from: f */
    private byte f33164f;

    /* renamed from: g */
    private final C12925u f33165g;

    /* renamed from: h */
    private final Inflater f33166h;

    /* renamed from: i */
    private final C12917n f33167i;

    /* renamed from: j */
    private final CRC32 f33168j = new CRC32();

    public C12916m(C12892a0 a0Var) {
        C10202j.m34178b(a0Var, "source");
        this.f33165g = new C12925u(a0Var);
        Inflater inflater = new Inflater(true);
        this.f33166h = inflater;
        this.f33167i = new C12917n(this.f33165g, inflater);
    }

    /* renamed from: a */
    private final void m41667a() throws IOException {
        this.f33165g.mo41172h(10);
        byte d = this.f33165g.f33189f.mo41163d(3);
        boolean z = true;
        boolean z2 = ((d >> 1) & 1) == 1;
        if (z2) {
            m41668a(this.f33165g.f33189f, 0, 10);
        }
        m41670b("ID1ID2", 8075, this.f33165g.readShort());
        this.f33165g.skip(8);
        if (((d >> 2) & 1) == 1) {
            this.f33165g.mo41172h(2);
            if (z2) {
                m41668a(this.f33165g.f33189f, 0, 2);
            }
            long m = (long) this.f33165g.f33189f.mo41183m();
            this.f33165g.mo41172h(m);
            if (z2) {
                m41668a(this.f33165g.f33189f, 0, m);
            }
            this.f33165g.skip(m);
        }
        if (((d >> 3) & 1) == 1) {
            long a = this.f33165g.mo41279a((byte) 0);
            if (a != -1) {
                if (z2) {
                    m41668a(this.f33165g.f33189f, 0, a + 1);
                }
                this.f33165g.skip(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((d >> 4) & 1) != 1) {
            z = false;
        }
        if (z) {
            long a2 = this.f33165g.mo41279a((byte) 0);
            if (a2 != -1) {
                if (z2) {
                    m41668a(this.f33165g.f33189f, 0, a2 + 1);
                }
                this.f33165g.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z2) {
            m41670b("FHCRC", this.f33165g.mo41284b(), (short) ((int) this.f33168j.getValue()));
            this.f33168j.reset();
        }
    }

    /* renamed from: b */
    private final void m41669b() throws IOException {
        m41670b("CRC", this.f33165g.mo41278a(), (int) this.f33168j.getValue());
        m41670b("ISIZE", this.f33165g.mo41278a(), (int) this.f33166h.getBytesWritten());
    }

    public void close() throws IOException {
        this.f33167i.close();
    }

    public long read(C12905f fVar, long j) throws IOException {
        C10202j.m34178b(fVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (j == 0) {
            return 0;
        } else {
            if (this.f33164f == 0) {
                m41667a();
                this.f33164f = 1;
            }
            if (this.f33164f == 1) {
                long size = fVar.size();
                long read = this.f33167i.read(fVar, j);
                if (read != -1) {
                    m41668a(fVar, size, read);
                    return read;
                }
                this.f33164f = 2;
            }
            if (this.f33164f == 2) {
                m41669b();
                this.f33164f = 3;
                if (!this.f33165g.mo41169g()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public C12894b0 timeout() {
        return this.f33165g.timeout();
    }

    /* renamed from: b */
    private final void m41670b(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            C10202j.m34174a((Object) format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: a */
    private final void m41668a(C12905f fVar, long j, long j2) {
        C12927v vVar = fVar.f33148f;
        if (vVar != null) {
            do {
                int i = vVar.f33195c;
                int i2 = vVar.f33194b;
                if (j >= ((long) (i - i2))) {
                    j -= (long) (i - i2);
                    vVar = vVar.f33198f;
                } else {
                    while (j2 > 0) {
                        int i3 = (int) (((long) vVar.f33194b) + j);
                        int min = (int) Math.min((long) (vVar.f33195c - i3), j2);
                        this.f33168j.update(vVar.f33193a, i3, min);
                        j2 -= (long) min;
                        vVar = vVar.f33198f;
                        if (vVar != null) {
                            j = 0;
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    }
                    return;
                }
            } while (vVar != null);
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }
}
