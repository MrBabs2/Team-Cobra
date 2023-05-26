package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;

public final class zzjs implements zzkf {

    /* renamed from: o */
    private static final Pattern f22116o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: p */
    private static final AtomicReference<byte[]> f22117p = new AtomicReference<>();

    /* renamed from: a */
    private final boolean f22118a;

    /* renamed from: b */
    private final int f22119b;

    /* renamed from: c */
    private final int f22120c;

    /* renamed from: d */
    private final String f22121d;

    /* renamed from: e */
    private final HashMap<String, String> f22122e;

    /* renamed from: f */
    private final zzke f22123f;

    /* renamed from: g */
    private zzjq f22124g;

    /* renamed from: h */
    private HttpURLConnection f22125h;

    /* renamed from: i */
    private InputStream f22126i;

    /* renamed from: j */
    private boolean f22127j;

    /* renamed from: k */
    private long f22128k;

    /* renamed from: l */
    private long f22129l;

    /* renamed from: m */
    private long f22130m;

    /* renamed from: n */
    private long f22131n;

    public zzjs(String str, zzkn<String> zzkn, zzke zzke, int i, int i2, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f22121d = str;
            this.f22123f = null;
            this.f22122e = new HashMap<>();
            this.f22119b = i;
            this.f22120c = i2;
            this.f22118a = z;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final long mo25635a(zzjq zzjq) throws zzjx {
        HttpURLConnection httpURLConnection;
        zzjq zzjq2 = zzjq;
        this.f22124g = zzjq2;
        long j = 0;
        this.f22131n = 0;
        this.f22130m = 0;
        try {
            URL url = new URL(zzjq2.f22106a.toString());
            long j2 = zzjq2.f22108c;
            long j3 = zzjq2.f22109d;
            boolean z = (zzjq2.f22111f & 1) != 0;
            if (!this.f22118a) {
                httpURLConnection = m24633a(url, j2, j3, z);
                httpURLConnection.connect();
            } else {
                URL url2 = url;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i <= 20) {
                        URL url3 = url2;
                        int i3 = i2;
                        long j4 = j3;
                        HttpURLConnection a = m24633a(url2, j2, j3, z);
                        a.setInstanceFollowRedirects(false);
                        a.connect();
                        int responseCode = a.getResponseCode();
                        if (!(responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307)) {
                            if (responseCode != 308) {
                                httpURLConnection = a;
                                break;
                            }
                        }
                        String headerField = a.getHeaderField("Location");
                        a.disconnect();
                        if (headerField != null) {
                            URL url4 = new URL(url3, headerField);
                            String protocol = url4.getProtocol();
                            if (BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equals(protocol) || "http".equals(protocol)) {
                                url2 = url4;
                                i = i3;
                                j3 = j4;
                            } else {
                                String valueOf = String.valueOf(protocol);
                                throw new ProtocolException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
                            }
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Too many redirects: ");
                        sb.append(i2);
                        throw new NoRouteToHostException(sb.toString());
                    }
                }
            }
            this.f22125h = httpURLConnection;
            try {
                int responseCode2 = httpURLConnection.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map headerFields = this.f22125h.getHeaderFields();
                    m24634a();
                    throw new zzjy(responseCode2, headerFields, zzjq2);
                }
                this.f22125h.getContentType();
                if (responseCode2 == 200) {
                    long j5 = zzjq2.f22108c;
                    if (j5 != 0) {
                        j = j5;
                    }
                }
                this.f22128k = j;
                if ((zzjq2.f22111f & 1) == 0) {
                    long a2 = m24632a(this.f22125h);
                    long j6 = zzjq2.f22109d;
                    if (j6 == -1) {
                        j6 = a2 != -1 ? a2 - this.f22128k : -1;
                    }
                    this.f22129l = j6;
                } else {
                    this.f22129l = zzjq2.f22109d;
                }
                try {
                    this.f22126i = this.f22125h.getInputStream();
                    this.f22127j = true;
                    zzke zzke = this.f22123f;
                    if (zzke != null) {
                        zzke.mo29411a();
                    }
                    return this.f22129l;
                } catch (IOException e) {
                    m24634a();
                    throw new zzjx(e, zzjq2);
                }
            } catch (IOException e2) {
                IOException iOException = e2;
                m24634a();
                String valueOf2 = String.valueOf(zzjq2.f22106a.toString());
                throw new zzjx(valueOf2.length() != 0 ? "Unable to connect to ".concat(valueOf2) : new String("Unable to connect to "), iOException, zzjq2);
            }
        } catch (IOException e3) {
            String valueOf3 = String.valueOf(zzjq2.f22106a.toString());
            throw new zzjx(valueOf3.length() != 0 ? "Unable to connect to ".concat(valueOf3) : new String("Unable to connect to "), e3, zzjq2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(1:19)|21|(1:25))|26|27|28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r2 > 2048) goto L_0x0039;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() throws com.google.android.gms.internal.ads.zzjx {
        /*
            r8 = this;
            r0 = 0
            java.io.InputStream r1 = r8.f22126i     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x007c
            java.net.HttpURLConnection r1 = r8.f22125h     // Catch:{ all -> 0x008d }
            long r2 = r8.f22129l     // Catch:{ all -> 0x008d }
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0012
            long r2 = r8.f22129l     // Catch:{ all -> 0x008d }
            goto L_0x0017
        L_0x0012:
            long r2 = r8.f22129l     // Catch:{ all -> 0x008d }
            long r6 = r8.f22131n     // Catch:{ all -> 0x008d }
            long r2 = r2 - r6
        L_0x0017:
            int r6 = com.google.android.gms.internal.ads.zzkq.f22154a     // Catch:{ all -> 0x008d }
            r7 = 19
            if (r6 == r7) goto L_0x0023
            int r6 = com.google.android.gms.internal.ads.zzkq.f22154a     // Catch:{ all -> 0x008d }
            r7 = 20
            if (r6 != r7) goto L_0x006a
        L_0x0023:
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException | Exception -> 0x006a }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0033
            int r2 = r1.read()     // Catch:{ IOException | Exception -> 0x006a }
            r3 = -1
            if (r2 != r3) goto L_0x0039
            goto L_0x006a
        L_0x0033:
            r4 = 2048(0x800, double:1.0118E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x006a
        L_0x0039:
            java.lang.Class r2 = r1.getClass()     // Catch:{ IOException | Exception -> 0x006a }
            java.lang.String r2 = r2.getName()     // Catch:{ IOException | Exception -> 0x006a }
            java.lang.String r3 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r3 = r2.equals(r3)     // Catch:{ IOException | Exception -> 0x006a }
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r2 = r2.equals(r3)     // Catch:{ IOException | Exception -> 0x006a }
            if (r2 == 0) goto L_0x006a
        L_0x0051:
            java.lang.Class r2 = r1.getClass()     // Catch:{ IOException | Exception -> 0x006a }
            java.lang.Class r2 = r2.getSuperclass()     // Catch:{ IOException | Exception -> 0x006a }
            java.lang.String r3 = "unexpectedEndOfInput"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ IOException | Exception -> 0x006a }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch:{ IOException | Exception -> 0x006a }
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ IOException | Exception -> 0x006a }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ IOException | Exception -> 0x006a }
            r2.invoke(r1, r3)     // Catch:{ IOException | Exception -> 0x006a }
        L_0x006a:
            java.io.InputStream r1 = r8.f22126i     // Catch:{ IOException -> 0x0073 }
            r1.close()     // Catch:{ IOException -> 0x0073 }
            r1 = 0
            r8.f22126i = r1     // Catch:{ all -> 0x008d }
            goto L_0x007c
        L_0x0073:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzjx r2 = new com.google.android.gms.internal.ads.zzjx     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.zzjq r3 = r8.f22124g     // Catch:{ all -> 0x008d }
            r2.<init>((java.io.IOException) r1, (com.google.android.gms.internal.ads.zzjq) r3)     // Catch:{ all -> 0x008d }
            throw r2     // Catch:{ all -> 0x008d }
        L_0x007c:
            boolean r1 = r8.f22127j
            if (r1 == 0) goto L_0x008c
            r8.f22127j = r0
            com.google.android.gms.internal.ads.zzke r0 = r8.f22123f
            if (r0 == 0) goto L_0x0089
            r0.mo29413b()
        L_0x0089:
            r8.m24634a()
        L_0x008c:
            return
        L_0x008d:
            r1 = move-exception
            boolean r2 = r8.f22127j
            if (r2 == 0) goto L_0x009e
            r8.f22127j = r0
            com.google.android.gms.internal.ads.zzke r0 = r8.f22123f
            if (r0 == 0) goto L_0x009b
            r0.mo29413b()
        L_0x009b:
            r8.m24634a()
        L_0x009e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjs.close():void");
    }

    public final int read(byte[] bArr, int i, int i2) throws zzjx {
        try {
            if (this.f22130m != this.f22128k) {
                byte[] andSet = f22117p.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT];
                }
                while (this.f22130m != this.f22128k) {
                    int read = this.f22126i.read(andSet, 0, (int) Math.min(this.f22128k - this.f22130m, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f22130m += (long) read;
                        if (this.f22123f != null) {
                            this.f22123f.mo29412a(read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                f22117p.set(andSet);
            }
            if (this.f22129l != -1) {
                i2 = (int) Math.min((long) i2, this.f22129l - this.f22131n);
            }
            if (i2 == 0) {
                return -1;
            }
            int read2 = this.f22126i.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.f22129l != -1) {
                    if (this.f22129l != this.f22131n) {
                        throw new EOFException();
                    }
                }
                return -1;
            }
            this.f22131n += (long) read2;
            if (this.f22123f != null) {
                this.f22123f.mo29412a(read2);
            }
            return read2;
        } catch (IOException e) {
            throw new zzjx(e, this.f22124g);
        }
    }

    /* renamed from: a */
    private final HttpURLConnection m24633a(URL url, long j, long j2, boolean z) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f22119b);
        httpURLConnection.setReadTimeout(this.f22120c);
        httpURLConnection.setDoOutput(false);
        synchronized (this.f22122e) {
            for (Map.Entry next : this.f22122e.entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        if (!(j == 0 && j2 == -1)) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            String sb2 = sb.toString();
            if (j2 != -1) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append((j + j2) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f22121d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m24632a(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "HttpDataSource"
            if (r1 != 0) goto L_0x0036
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x0038
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            int r4 = r4 + 28
            r1.<init>(r4)
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1)
        L_0x0036:
            r4 = -1
        L_0x0038:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00cb
            java.util.regex.Pattern r1 = f22116o
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00cb
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch:{ NumberFormatException -> 0x00aa }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x00aa }
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch:{ NumberFormatException -> 0x00aa }
            long r8 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x006e
            r4 = r6
            goto L_0x00cb
        L_0x006e:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00cb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            int r8 = r8.length()     // Catch:{ NumberFormatException -> 0x00aa }
            int r8 = r8 + 26
            java.lang.String r9 = java.lang.String.valueOf(r10)     // Catch:{ NumberFormatException -> 0x00aa }
            int r9 = r9.length()     // Catch:{ NumberFormatException -> 0x00aa }
            int r8 = r8 + r9
            r1.<init>(r8)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r8 = "Inconsistent headers ["
            r1.append(r8)     // Catch:{ NumberFormatException -> 0x00aa }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            r1.append(r10)     // Catch:{ NumberFormatException -> 0x00aa }
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x00aa }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x00aa }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x00aa }
            r4 = r0
            goto L_0x00cb
        L_0x00aa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r10)
            int r1 = r1.length()
            int r1 = r1 + 27
            r0.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            android.util.Log.e(r3, r10)
        L_0x00cb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjs.m24632a(java.net.HttpURLConnection):long");
    }

    /* renamed from: a */
    private final void m24634a() {
        HttpURLConnection httpURLConnection = this.f22125h;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f22125h = null;
        }
    }
}
