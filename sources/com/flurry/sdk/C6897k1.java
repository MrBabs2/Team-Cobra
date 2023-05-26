package com.flurry.sdk;

import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.flurry.sdk.k1 */
public class C6897k1 extends C6831g2 {

    /* renamed from: A */
    private C6883j1 f12903A = new C6883j1(this);

    /* renamed from: B */
    boolean f12904B;

    /* renamed from: i */
    private final C7096z0<String, String> f12905i = new C7096z0<>();

    /* renamed from: j */
    private final C7096z0<String, String> f12906j = new C7096z0<>();

    /* renamed from: k */
    final Object f12907k = new Object();

    /* renamed from: l */
    public String f12908l;

    /* renamed from: m */
    public C6900c f12909m;

    /* renamed from: n */
    private int f12910n = 10000;

    /* renamed from: o */
    private int f12911o = 15000;

    /* renamed from: p */
    private boolean f12912p = true;

    /* renamed from: q */
    C6901d f12913q;

    /* renamed from: r */
    HttpURLConnection f12914r;

    /* renamed from: s */
    boolean f12915s;

    /* renamed from: t */
    boolean f12916t;

    /* renamed from: u */
    private boolean f12917u;

    /* renamed from: v */
    long f12918v = -1;

    /* renamed from: w */
    public int f12919w = -1;

    /* renamed from: x */
    private boolean f12920x;

    /* renamed from: y */
    private int f12921y = 25000;

    /* renamed from: z */
    public boolean f12922z = false;

    /* renamed from: com.flurry.sdk.k1$a */
    class C6898a extends Thread {
        C6898a() {
        }

        public final void run() {
            try {
                if (C6897k1.this.f12914r != null) {
                    C6897k1.this.f12914r.disconnect();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.flurry.sdk.k1$b */
    static /* synthetic */ class C6899b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12924a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.flurry.sdk.k1$c[] r0 = com.flurry.sdk.C6897k1.C6900c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12924a = r0
                com.flurry.sdk.k1$c r1 = com.flurry.sdk.C6897k1.C6900c.kPost     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12924a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.flurry.sdk.k1$c r1 = com.flurry.sdk.C6897k1.C6900c.kPut     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12924a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.flurry.sdk.k1$c r1 = com.flurry.sdk.C6897k1.C6900c.kDelete     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12924a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.flurry.sdk.k1$c r1 = com.flurry.sdk.C6897k1.C6900c.kHead     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12924a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.flurry.sdk.k1$c r1 = com.flurry.sdk.C6897k1.C6900c.kGet     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6897k1.C6899b.<clinit>():void");
        }
    }

    /* renamed from: com.flurry.sdk.k1$c */
    public enum C6900c {
        kUnknown,
        kGet,
        kPost,
        kPut,
        kDelete,
        kHead;

        public final String toString() {
            int i = C6899b.f12924a[ordinal()];
            if (i == 1) {
                return "POST";
            }
            if (i == 2) {
                return "PUT";
            }
            if (i == 3) {
                return "DELETE";
            }
            if (i == 4) {
                return "HEAD";
            }
            if (i != 5) {
                return null;
            }
            return "GET";
        }
    }

    /* renamed from: com.flurry.sdk.k1$d */
    public interface C6901d {
        /* renamed from: a */
        void mo23608a();

        /* renamed from: a */
        void mo23609a(InputStream inputStream) throws Exception;

        /* renamed from: a */
        void mo23610a(OutputStream outputStream) throws Exception;
    }

    /* renamed from: d */
    private void m14650d() throws Exception {
        InputStream inputStream;
        InputStream inputStream2;
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        OutputStream outputStream;
        if (!this.f12916t) {
            String str = this.f12908l;
            if (!TextUtils.isEmpty(str) && Uri.parse(str).getScheme() == null) {
                str = "http://".concat(String.valueOf(str));
            }
            this.f12908l = str;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f12908l).openConnection();
            this.f12914r = httpURLConnection;
            httpURLConnection.setConnectTimeout(this.f12910n);
            this.f12914r.setReadTimeout(this.f12911o);
            this.f12914r.setRequestMethod(this.f12909m.toString());
            this.f12914r.setInstanceFollowRedirects(this.f12912p);
            this.f12914r.setDoOutput(C6900c.kPost.equals(this.f12909m));
            this.f12914r.setDoInput(true);
            TrafficStats.setThreadStatsTag(1234);
            for (Map.Entry next : this.f12905i.mo23741a()) {
                this.f12914r.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            if (!C6900c.kGet.equals(this.f12909m) && !C6900c.kPost.equals(this.f12909m)) {
                this.f12914r.setRequestProperty("Accept-Encoding", "");
            }
            if (this.f12916t) {
                m14651e();
                return;
            }
            if (this.f12922z && (this.f12914r instanceof HttpsURLConnection)) {
                this.f12914r.connect();
                C6915l1.m14694a((HttpsURLConnection) this.f12914r);
            }
            BufferedInputStream bufferedInputStream = null;
            if (C6900c.kPost.equals(this.f12909m)) {
                try {
                    outputStream = this.f12914r.getOutputStream();
                    try {
                        bufferedOutputStream = new BufferedOutputStream(outputStream);
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        bufferedOutputStream = null;
                        th = th3;
                        C6766c2.m14420a((Closeable) bufferedOutputStream);
                        C6766c2.m14420a((Closeable) outputStream);
                        throw th;
                    }
                    try {
                        if (this.f12913q != null && !mo23634c()) {
                            this.f12913q.mo23610a((OutputStream) bufferedOutputStream);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        C6766c2.m14420a((Closeable) bufferedOutputStream);
                        C6766c2.m14420a((Closeable) outputStream);
                        throw th;
                    }
                } catch (Throwable th5) {
                    bufferedOutputStream = null;
                    th = th5;
                    outputStream = null;
                    C6766c2.m14420a((Closeable) bufferedOutputStream);
                    C6766c2.m14420a((Closeable) outputStream);
                    throw th;
                }
                try {
                    C6766c2.m14420a((Closeable) bufferedOutputStream);
                    C6766c2.m14420a((Closeable) outputStream);
                } catch (Exception e) {
                    C6792d1.m14476a(6, "HttpStreamRequest", "Exception is:" + e.getLocalizedMessage());
                    m14651e();
                    return;
                } catch (Throwable th6) {
                    m14651e();
                    throw th6;
                }
            }
            if (this.f12917u) {
                this.f12918v = System.currentTimeMillis();
            }
            if (this.f12920x) {
                this.f12903A.mo23622a((long) this.f12921y);
            }
            this.f12919w = this.f12914r.getResponseCode();
            if (this.f12917u && this.f12918v != -1) {
                System.currentTimeMillis();
            }
            this.f12903A.mo23621a();
            for (Map.Entry entry : this.f12914r.getHeaderFields().entrySet()) {
                for (String a : (List) entry.getValue()) {
                    this.f12906j.mo23743a(entry.getKey(), a);
                }
            }
            if (!C6900c.kGet.equals(this.f12909m) && !C6900c.kPost.equals(this.f12909m)) {
                m14651e();
            } else if (this.f12916t) {
                m14651e();
            } else {
                try {
                    if (this.f12919w == 200) {
                        inputStream2 = this.f12914r.getInputStream();
                    } else {
                        inputStream2 = this.f12914r.getErrorStream();
                    }
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream2);
                        try {
                            if (this.f12913q != null && !mo23634c()) {
                                this.f12913q.mo23609a((InputStream) bufferedInputStream2);
                            }
                            C6766c2.m14420a((Closeable) bufferedInputStream2);
                            C6766c2.m14420a((Closeable) inputStream2);
                            m14651e();
                        } catch (Throwable th7) {
                            BufferedInputStream bufferedInputStream3 = bufferedInputStream2;
                            inputStream = inputStream2;
                            th = th7;
                            bufferedInputStream = bufferedInputStream3;
                            C6766c2.m14420a((Closeable) bufferedInputStream);
                            C6766c2.m14420a((Closeable) inputStream);
                            throw th;
                        }
                    } catch (Throwable th8) {
                        Throwable th9 = th8;
                        inputStream = inputStream2;
                        th = th9;
                        C6766c2.m14420a((Closeable) bufferedInputStream);
                        C6766c2.m14420a((Closeable) inputStream);
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    inputStream = null;
                    C6766c2.m14420a((Closeable) bufferedInputStream);
                    C6766c2.m14420a((Closeable) inputStream);
                    throw th;
                }
            }
        }
    }

    /* renamed from: e */
    private void m14651e() {
        if (!this.f12915s) {
            this.f12915s = true;
            HttpURLConnection httpURLConnection = this.f12914r;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    /* renamed from: a */
    public final void mo23632a(String str, String str2) {
        this.f12905i.mo23743a(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo23633b() {
        if (this.f12913q != null && !mo23634c()) {
            this.f12913q.mo23608a();
        }
    }

    /* renamed from: c */
    public final boolean mo23634c() {
        boolean z;
        synchronized (this.f12907k) {
            z = this.f12916t;
        }
        return z;
    }

    /* renamed from: a */
    public void mo23531a() {
        try {
            if (this.f12908l != null) {
                if (!C7075x0.m15016a()) {
                    C6792d1.m14476a(3, "HttpStreamRequest", "Network not available, aborting http request: " + this.f12908l);
                } else {
                    if (this.f12909m == null || C6900c.kUnknown.equals(this.f12909m)) {
                        this.f12909m = C6900c.kGet;
                    }
                    m14650d();
                    C6792d1.m14476a(4, "HttpStreamRequest", "HTTP status: " + this.f12919w + " for url: " + this.f12908l);
                }
            }
        } catch (Exception e) {
            C6792d1.m14476a(4, "HttpStreamRequest", "HTTP status: " + this.f12919w + " for url: " + this.f12908l);
            StringBuilder sb = new StringBuilder("Exception during http request: ");
            sb.append(this.f12908l);
            C6792d1.m14477a(3, "HttpStreamRequest", sb.toString(), e);
            if (this.f12914r != null) {
                this.f12914r.getReadTimeout();
                this.f12914r.getConnectTimeout();
            }
        } catch (Throwable th) {
            this.f12903A.mo23621a();
            mo23633b();
            throw th;
        }
        this.f12903A.mo23621a();
        mo23633b();
    }
}
