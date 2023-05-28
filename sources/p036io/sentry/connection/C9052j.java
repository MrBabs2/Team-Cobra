package p036io.sentry.connection;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import p120q.p121b.p359l.C11542b;
import p120q.p121b.p363n.C11573a;

/* renamed from: io.sentry.connection.j */
/* compiled from: OutputStreamConnection */
public class C9052j extends C9035a {

    /* renamed from: m */
    private static final Charset f25621m = Charset.forName("UTF-8");

    /* renamed from: k */
    private final OutputStream f25622k;

    /* renamed from: l */
    private C11573a f25623l;

    public C9052j(OutputStream outputStream) {
        super((String) null, (String) null);
        this.f25622k = outputStream;
    }

    /* renamed from: a */
    public void mo33427a(C11573a aVar) {
        this.f25623l = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void mo33403b(C11542b bVar) throws ConnectionException {
        try {
            this.f25622k.write("Sentry event:\n".getBytes(f25621m));
            this.f25623l.mo37804a(bVar, this.f25622k);
            this.f25622k.write("\n".getBytes(f25621m));
            this.f25622k.flush();
        } catch (IOException e) {
            throw new ConnectionException("Couldn't sent the event properly", e);
        }
    }

    public void close() throws IOException {
        this.f25622k.close();
    }
}
