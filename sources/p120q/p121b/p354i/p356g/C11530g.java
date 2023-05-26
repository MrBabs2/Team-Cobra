package p120q.p121b.p354i.p356g;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Properties;
import p120q.p121b.p354i.C11516e;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.i.g.g */
/* compiled from: ResourceLoaderConfigurationProvider */
public class C11530g implements C11523b {

    /* renamed from: b */
    private static final C12938b f30774b = C12939c.m41777a((Class<?>) C11530g.class);

    /* renamed from: a */
    private final Properties f30775a;

    public C11530g(C11516e eVar, String str, Charset charset) throws IOException {
        this.f30775a = m37689a(eVar, str, charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Properties m37689a(p120q.p121b.p354i.C11516e r1, java.lang.String r2, java.nio.charset.Charset r3) throws java.io.IOException {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.InputStream r1 = r1.mo37632a(r2)
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r1, r3)
            java.util.Properties r1 = new java.util.Properties     // Catch:{ all -> 0x001c }
            r1.<init>()     // Catch:{ all -> 0x001c }
            r1.load(r2)     // Catch:{ all -> 0x001c }
            r2.close()
            return r1
        L_0x001c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001e }
        L_0x001e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0022 }
        L_0x0022:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p121b.p354i.p356g.C11530g.m37689a(q.b.i.e, java.lang.String, java.nio.charset.Charset):java.util.Properties");
    }

    /* renamed from: a */
    public String mo37636a(String str) {
        Properties properties = this.f30775a;
        if (properties == null) {
            return null;
        }
        String property = properties.getProperty(str);
        if (property != null) {
            f30774b.mo41307a("Found {}={} in properties file.", str, property);
        }
        return property;
    }
}
