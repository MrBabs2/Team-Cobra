package p120q.p121b.p363n;

import java.io.IOException;
import java.io.OutputStream;
import p120q.p121b.p359l.C11542b;

/* renamed from: q.b.n.a */
/* compiled from: Marshaller */
public interface C11573a {

    /* renamed from: q.b.n.a$a */
    /* compiled from: Marshaller */
    public static final class C11574a extends OutputStream {

        /* renamed from: f */
        private final OutputStream f30905f;

        public C11574a(OutputStream outputStream) {
            this.f30905f = outputStream;
        }

        public void close() throws IOException {
        }

        public void flush() throws IOException {
            this.f30905f.flush();
        }

        public void write(int i) throws IOException {
            this.f30905f.write(i);
        }

        public void write(byte[] bArr) throws IOException {
            this.f30905f.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f30905f.write(bArr, i, i2);
        }
    }

    /* renamed from: a */
    String mo37803a();

    /* renamed from: a */
    void mo37804a(C11542b bVar, OutputStream outputStream) throws IOException;

    /* renamed from: b */
    String mo37805b();
}
