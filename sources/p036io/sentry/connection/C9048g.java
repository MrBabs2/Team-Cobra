package p036io.sentry.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import p120q.p121b.p358k.C11537a;
import p120q.p121b.p363n.C11573a;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: io.sentry.connection.g */
/* compiled from: HttpConnection */
public class C9048g extends C9035a {

    /* renamed from: r */
    private static final Charset f25602r = Charset.forName("UTF-8");

    /* renamed from: s */
    private static final C12938b f25603s = C12939c.m41777a((Class<?>) C9048g.class);

    /* renamed from: t */
    private static final int f25604t = ((int) TimeUnit.SECONDS.toMillis(1));

    /* renamed from: u */
    private static final int f25605u = ((int) TimeUnit.SECONDS.toMillis(5));

    /* renamed from: v */
    private static final HostnameVerifier f25606v = new C9049a();

    /* renamed from: k */
    private final URL f25607k;

    /* renamed from: l */
    private final Proxy f25608l;

    /* renamed from: m */
    private C9046e f25609m;

    /* renamed from: n */
    private C11573a f25610n;

    /* renamed from: o */
    private int f25611o = f25604t;

    /* renamed from: p */
    private int f25612p = f25605u;

    /* renamed from: q */
    private boolean f25613q = false;

    /* renamed from: io.sentry.connection.g$a */
    /* compiled from: HttpConnection */
    static class C9049a implements HostnameVerifier {
        C9049a() {
        }

        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public C9048g(URL url, String str, String str2, Proxy proxy, C9046e eVar) {
        super(str, str2);
        this.f25607k = url;
        this.f25608l = proxy;
        this.f25609m = eVar;
    }

    /* renamed from: a */
    public static URL m29733a(URI uri, String str) {
        try {
            return new URL(uri.toString() + "api/" + str + "/store/");
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Couldn't build a valid URL from the Sentry API.", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public HttpURLConnection mo33419b() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.f25608l != null) {
                httpURLConnection = (HttpURLConnection) this.f25607k.openConnection(this.f25608l);
            } else {
                httpURLConnection = (HttpURLConnection) this.f25607k.openConnection();
            }
            if (this.f25613q && (httpURLConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(f25606v);
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(this.f25611o);
            httpURLConnection.setReadTimeout(this.f25612p);
            httpURLConnection.setRequestProperty("User-Agent", C11537a.m37698a());
            httpURLConnection.setRequestProperty("X-Sentry-Auth", mo33401a());
            if (this.f25610n.mo37803a() != null) {
                httpURLConnection.setRequestProperty("Content-Type", this.f25610n.mo37803a());
            }
            if (this.f25610n.mo37805b() != null) {
                httpURLConnection.setRequestProperty("Content-Encoding", this.f25610n.mo37805b());
            }
            return httpURLConnection;
        } catch (IOException e) {
            throw new IllegalStateException("Couldn't set up a connection to the Sentry server.", e);
        }
    }

    public void close() throws IOException {
    }

    /* renamed from: a */
    private String m29732a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f25602r));
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!z) {
                    sb.append("\n");
                }
                sb.append(readLine);
                z = false;
            } catch (IOException | RuntimeException e) {
                f25603s.mo41308a("Exception while reading the error message from the connection.", e);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo33416a(int i) {
        this.f25611o = i;
    }

    /* renamed from: a */
    public void mo33417a(C11573a aVar) {
        this.f25610n = aVar;
    }

    /* renamed from: a */
    public void mo33418a(boolean z) {
        this.f25613q = z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008d */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058 A[Catch:{ IOException -> 0x002c, all -> 0x0029, IOException -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007b A[SYNTHETIC, Splitter:B:29:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093 A[Catch:{ IOException -> 0x002c, all -> 0x0029, IOException -> 0x008d }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33403b(p120q.p121b.p359l.C11542b r9) throws p036io.sentry.connection.ConnectionException {
        /*
            r8 = this;
            io.sentry.connection.e r0 = r8.f25609m
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.mo33413a(r9)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            java.net.HttpURLConnection r0 = r8.mo33419b()
            r0.connect()     // Catch:{ IOException -> 0x002c }
            java.io.OutputStream r1 = r0.getOutputStream()     // Catch:{ IOException -> 0x002c }
            q.b.n.a r2 = r8.f25610n     // Catch:{ IOException -> 0x002c }
            r2.mo37804a(r9, r1)     // Catch:{ IOException -> 0x002c }
            r1.close()     // Catch:{ IOException -> 0x002c }
            java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x002c }
            r1.close()     // Catch:{ IOException -> 0x002c }
            r0.disconnect()
            return
        L_0x0029:
            r9 = move-exception
            goto L_0x00a7
        L_0x002c:
            r1 = move-exception
            java.lang.String r2 = "Retry-After"
            java.lang.String r2 = r0.getHeaderField(r2)     // Catch:{ all -> 0x0029 }
            r3 = 0
            if (r2 == 0) goto L_0x0047
            double r4 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x0047 }
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r6
            long r4 = (long) r4     // Catch:{ NumberFormatException -> 0x0047 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0047 }
            goto L_0x0048
        L_0x0047:
            r2 = r3
        L_0x0048:
            int r4 = r0.getResponseCode()     // Catch:{ IOException -> 0x008c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x008c }
            int r5 = r4.intValue()     // Catch:{ IOException -> 0x008d }
            r6 = 403(0x193, float:5.65E-43)
            if (r5 != r6) goto L_0x007b
            t.b.b r5 = f25603s     // Catch:{ IOException -> 0x008d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008d }
            r6.<init>()     // Catch:{ IOException -> 0x008d }
            java.lang.String r7 = "Event '"
            r6.append(r7)     // Catch:{ IOException -> 0x008d }
            java.util.UUID r9 = r9.mo37681i()     // Catch:{ IOException -> 0x008d }
            r6.append(r9)     // Catch:{ IOException -> 0x008d }
            java.lang.String r9 = "' was rejected by the Sentry server due to a filter."
            r6.append(r9)     // Catch:{ IOException -> 0x008d }
            java.lang.String r9 = r6.toString()     // Catch:{ IOException -> 0x008d }
            r5.mo41310b(r9)     // Catch:{ IOException -> 0x008d }
            r0.disconnect()
            return
        L_0x007b:
            int r9 = r4.intValue()     // Catch:{ IOException -> 0x008d }
            r5 = 429(0x1ad, float:6.01E-43)
            if (r9 == r5) goto L_0x0084
            goto L_0x008d
        L_0x0084:
            io.sentry.connection.TooManyRequestsException r9 = new io.sentry.connection.TooManyRequestsException     // Catch:{ IOException -> 0x008d }
            java.lang.String r5 = "Too many requests to Sentry: https://docs.sentry.io/learn/quotas/"
            r9.<init>(r5, r1, r2, r4)     // Catch:{ IOException -> 0x008d }
            throw r9     // Catch:{ IOException -> 0x008d }
        L_0x008c:
            r4 = r3
        L_0x008d:
            java.io.InputStream r9 = r0.getErrorStream()     // Catch:{ all -> 0x0029 }
            if (r9 == 0) goto L_0x0097
            java.lang.String r3 = r8.m29732a((java.io.InputStream) r9)     // Catch:{ all -> 0x0029 }
        L_0x0097:
            if (r3 == 0) goto L_0x009f
            boolean r9 = r3.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r9 == 0) goto L_0x00a1
        L_0x009f:
            java.lang.String r3 = "An exception occurred while submitting the event to the Sentry server."
        L_0x00a1:
            io.sentry.connection.ConnectionException r9 = new io.sentry.connection.ConnectionException     // Catch:{ all -> 0x0029 }
            r9.<init>(r3, r1, r2, r4)     // Catch:{ all -> 0x0029 }
            throw r9     // Catch:{ all -> 0x0029 }
        L_0x00a7:
            r0.disconnect()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p036io.sentry.connection.C9048g.mo33403b(q.b.l.b):void");
    }

    /* renamed from: b */
    public void mo33420b(int i) {
        this.f25612p = i;
    }
}
