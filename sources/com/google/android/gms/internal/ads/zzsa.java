package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;

public final class zzsa implements zzrv {

    /* renamed from: o */
    private static final Pattern f22624o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: p */
    private static final AtomicReference<byte[]> f22625p = new AtomicReference<>();

    /* renamed from: a */
    private final boolean f22626a;

    /* renamed from: b */
    private final int f22627b;

    /* renamed from: c */
    private final int f22628c;

    /* renamed from: d */
    private final String f22629d;

    /* renamed from: e */
    private final zzsd f22630e = new zzsd();

    /* renamed from: f */
    private final zzsj<? super zzsa> f22631f;

    /* renamed from: g */
    private zzry f22632g;

    /* renamed from: h */
    private HttpURLConnection f22633h;

    /* renamed from: i */
    private InputStream f22634i;

    /* renamed from: j */
    private boolean f22635j;

    /* renamed from: k */
    private long f22636k;

    /* renamed from: l */
    private long f22637l;

    /* renamed from: m */
    private long f22638m;

    /* renamed from: n */
    private long f22639n;

    public zzsa(String str, zzsv<String> zzsv, zzsj<? super zzsa> zzsj, int i, int i2, boolean z, zzsd zzsd) {
        zzsk.m25215a(str);
        this.f22629d = str;
        this.f22631f = zzsj;
        this.f22627b = i;
        this.f22628c = i2;
        this.f22626a = true;
    }

    /* renamed from: b */
    private final void m25190b() {
        HttpURLConnection httpURLConnection = this.f22633h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f22633h = null;
        }
    }

    /* renamed from: F */
    public final Uri mo26231F() {
        HttpURLConnection httpURLConnection = this.f22633h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: a */
    public final Map<String, List<String>> mo29708a() {
        HttpURLConnection httpURLConnection = this.f22633h;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(1:19)|21|(1:25))|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r3 > 2048) goto L_0x003a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() throws com.google.android.gms.internal.ads.zzsb {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f22634i     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x007b
            java.net.HttpURLConnection r2 = r9.f22633h     // Catch:{ all -> 0x008e }
            long r3 = r9.f22637l     // Catch:{ all -> 0x008e }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0013
            long r3 = r9.f22637l     // Catch:{ all -> 0x008e }
            goto L_0x0018
        L_0x0013:
            long r3 = r9.f22637l     // Catch:{ all -> 0x008e }
            long r7 = r9.f22639n     // Catch:{ all -> 0x008e }
            long r3 = r3 - r7
        L_0x0018:
            int r7 = com.google.android.gms.internal.ads.zzsy.f22671a     // Catch:{ all -> 0x008e }
            r8 = 19
            if (r7 == r8) goto L_0x0024
            int r7 = com.google.android.gms.internal.ads.zzsy.f22671a     // Catch:{ all -> 0x008e }
            r8 = 20
            if (r7 != r8) goto L_0x006b
        L_0x0024:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x006b }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0034
            int r3 = r2.read()     // Catch:{ Exception -> 0x006b }
            r4 = -1
            if (r3 != r4) goto L_0x003a
            goto L_0x006b
        L_0x0034:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x006b
        L_0x003a:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006b }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x006b }
            if (r4 != 0) goto L_0x0052
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x006b }
            if (r3 == 0) goto L_0x006b
        L_0x0052:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x006b }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x006b }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006b }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x006b }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x006b }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x006b }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            java.io.InputStream r2 = r9.f22634i     // Catch:{ IOException -> 0x0071 }
            r2.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x007b
        L_0x0071:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzsb r3 = new com.google.android.gms.internal.ads.zzsb     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.zzry r4 = r9.f22632g     // Catch:{ all -> 0x008e }
            r5 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.zzry) r4, (int) r5)     // Catch:{ all -> 0x008e }
            throw r3     // Catch:{ all -> 0x008e }
        L_0x007b:
            r9.f22634i = r0
            r9.m25190b()
            boolean r0 = r9.f22635j
            if (r0 == 0) goto L_0x008d
            r9.f22635j = r1
            com.google.android.gms.internal.ads.zzsj<? super com.google.android.gms.internal.ads.zzsa> r0 = r9.f22631f
            if (r0 == 0) goto L_0x008d
            r0.mo28048a(r9)
        L_0x008d:
            return
        L_0x008e:
            r2 = move-exception
            r9.f22634i = r0
            r9.m25190b()
            boolean r0 = r9.f22635j
            if (r0 == 0) goto L_0x00a1
            r9.f22635j = r1
            com.google.android.gms.internal.ads.zzsj<? super com.google.android.gms.internal.ads.zzsa> r0 = r9.f22631f
            if (r0 == 0) goto L_0x00a1
            r0.mo28048a(r9)
        L_0x00a1:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.close():void");
    }

    public final int read(byte[] bArr, int i, int i2) throws zzsb {
        try {
            if (this.f22638m != this.f22636k) {
                byte[] andSet = f22625p.getAndSet((Object) null);
                if (andSet == null) {
                    andSet = new byte[RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT];
                }
                while (this.f22638m != this.f22636k) {
                    int read = this.f22634i.read(andSet, 0, (int) Math.min(this.f22636k - this.f22638m, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f22638m += (long) read;
                        if (this.f22631f != null) {
                            this.f22631f.mo28049a(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                f22625p.set(andSet);
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.f22637l != -1) {
                long j = this.f22637l - this.f22639n;
                if (j == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j);
            }
            int read2 = this.f22634i.read(bArr, i, i2);
            if (read2 != -1) {
                this.f22639n += (long) read2;
                if (this.f22631f != null) {
                    this.f22631f.mo28049a(this, read2);
                }
                return read2;
            } else if (this.f22637l == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new zzsb(e, this.f22632g, 2);
        }
    }

    /* renamed from: a */
    public final long mo26232a(zzry zzry) throws zzsb {
        HttpURLConnection httpURLConnection;
        HttpURLConnection a;
        zzry zzry2 = zzry;
        this.f22632g = zzry2;
        long j = 0;
        this.f22639n = 0;
        this.f22638m = 0;
        try {
            URL url = new URL(zzry2.f22610a.toString());
            byte[] bArr = zzry2.f22611b;
            long j2 = zzry2.f22613d;
            long j3 = zzry2.f22614e;
            boolean a2 = zzry2.mo29703a(1);
            if (!this.f22626a) {
                httpURLConnection = m25189a(url, bArr, j2, j3, a2, true);
            } else {
                URL url2 = url;
                byte[] bArr2 = bArr;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i <= 20) {
                        URL url3 = url2;
                        int i3 = i2;
                        long j4 = j3;
                        long j5 = j2;
                        a = m25189a(url2, bArr2, j2, j3, a2, false);
                        int responseCode = a.getResponseCode();
                        if (!(responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303)) {
                            if (bArr2 == null) {
                                if (responseCode != 307) {
                                    if (responseCode != 308) {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        bArr2 = null;
                        String headerField = a.getHeaderField("Location");
                        a.disconnect();
                        if (headerField != null) {
                            url2 = new URL(url3, headerField);
                            String protocol = url2.getProtocol();
                            if (BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equals(protocol) || "http".equals(protocol)) {
                                i = i3;
                                j3 = j4;
                                j2 = j5;
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
                httpURLConnection = a;
            }
            this.f22633h = httpURLConnection;
            try {
                int responseCode2 = httpURLConnection.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map headerFields = this.f22633h.getHeaderFields();
                    m25190b();
                    zzsc zzsc = new zzsc(responseCode2, headerFields, zzry2);
                    if (responseCode2 == 416) {
                        zzsc.initCause(new zzrx(0));
                    }
                    throw zzsc;
                }
                this.f22633h.getContentType();
                if (responseCode2 == 200) {
                    long j6 = zzry2.f22613d;
                    if (j6 != 0) {
                        j = j6;
                    }
                }
                this.f22636k = j;
                if (!zzry2.mo29703a(1)) {
                    long j7 = zzry2.f22614e;
                    long j8 = -1;
                    if (j7 != -1) {
                        this.f22637l = j7;
                    } else {
                        long a3 = m25188a(this.f22633h);
                        if (a3 != -1) {
                            j8 = a3 - this.f22636k;
                        }
                        this.f22637l = j8;
                    }
                } else {
                    this.f22637l = zzry2.f22614e;
                }
                try {
                    this.f22634i = this.f22633h.getInputStream();
                    this.f22635j = true;
                    zzsj<? super zzsa> zzsj = this.f22631f;
                    if (zzsj != null) {
                        zzsj.mo28050a(this, zzry2);
                    }
                    return this.f22637l;
                } catch (IOException e) {
                    m25190b();
                    throw new zzsb(e, zzry2, 1);
                }
            } catch (IOException e2) {
                IOException iOException = e2;
                m25190b();
                String valueOf2 = String.valueOf(zzry2.f22610a.toString());
                throw new zzsb(valueOf2.length() != 0 ? "Unable to connect to ".concat(valueOf2) : new String("Unable to connect to "), iOException, zzry2, 1);
            }
        } catch (IOException e3) {
            String valueOf3 = String.valueOf(zzry2.f22610a.toString());
            throw new zzsb(valueOf3.length() != 0 ? "Unable to connect to ".concat(valueOf3) : new String("Unable to connect to "), e3, zzry2, 1);
        }
    }

    /* renamed from: a */
    private final HttpURLConnection m25189a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f22627b);
        httpURLConnection.setReadTimeout(this.f22628c);
        for (Map.Entry next : this.f22630e.mo29709a().entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
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
        httpURLConnection.setRequestProperty("User-Agent", this.f22629d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m25188a(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x0036
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0015 }
            goto L_0x0038
        L_0x0015:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r4.append(r1)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r3, r1)
        L_0x0036:
            r4 = -1
        L_0x0038:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00cb
            java.util.regex.Pattern r1 = f22624o
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
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1.length()     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1 + 26
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch:{ NumberFormatException -> 0x00aa }
            int r8 = r8.length()     // Catch:{ NumberFormatException -> 0x00aa }
            int r1 = r1 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00aa }
            r8.<init>(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r1 = "Inconsistent headers ["
            r8.append(r1)     // Catch:{ NumberFormatException -> 0x00aa }
            r8.append(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r0 = "] ["
            r8.append(r0)     // Catch:{ NumberFormatException -> 0x00aa }
            r8.append(r10)     // Catch:{ NumberFormatException -> 0x00aa }
            r8.append(r2)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r0 = r8.toString()     // Catch:{ NumberFormatException -> 0x00aa }
            android.util.Log.w(r3, r0)     // Catch:{ NumberFormatException -> 0x00aa }
            long r0 = java.lang.Math.max(r4, r6)     // Catch:{ NumberFormatException -> 0x00aa }
            r4 = r0
            goto L_0x00cb
        L_0x00aa:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            android.util.Log.e(r3, r10)
        L_0x00cb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.m25188a(java.net.HttpURLConnection):long");
    }
}
