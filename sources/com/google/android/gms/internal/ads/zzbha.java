package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.p398ws.WebSocketProtocol;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p050l.p075h.p084l.C5071v;

@VisibleForTesting
@zzard
public class zzbha extends WebViewClient implements zzbii {

    /* renamed from: w */
    private static final String[] f18972w = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: x */
    private static final String[] f18973x = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: a */
    protected zzbgz f18974a;

    /* renamed from: b */
    private final HashMap<String, List<zzaho<? super zzbgz>>> f18975b;

    /* renamed from: c */
    private final Object f18976c;

    /* renamed from: d */
    private zzxr f18977d;

    /* renamed from: e */
    private zzo f18978e;

    /* renamed from: f */
    private zzbij f18979f;

    /* renamed from: g */
    private zzbik f18980g;

    /* renamed from: h */
    private zzagv f18981h;

    /* renamed from: i */
    private zzagx f18982i;

    /* renamed from: j */
    private boolean f18983j;

    /* renamed from: k */
    private boolean f18984k;

    /* renamed from: l */
    private boolean f18985l;

    /* renamed from: m */
    private zzu f18986m;

    /* renamed from: n */
    private final zzaqa f18987n;

    /* renamed from: o */
    private zzb f18988o;

    /* renamed from: p */
    private zzapr f18989p;

    /* renamed from: q */
    protected zzavb f18990q;

    /* renamed from: r */
    private boolean f18991r;

    /* renamed from: s */
    private boolean f18992s;

    /* renamed from: t */
    private int f18993t;

    /* renamed from: u */
    private boolean f18994u;

    /* renamed from: v */
    private View.OnAttachStateChangeListener f18995v;

    public zzbha(zzbgz zzbgz, zzwj zzwj, boolean z) {
        this(zzbgz, zzwj, z, new zzaqa(zzbgz, zzbgz.mo25640B(), new zzacf(zzbgz.getContext())), (zzapr) null);
    }

    /* renamed from: m */
    private final void m20952m() {
        if (this.f18995v != null) {
            this.f18974a.getView().removeOnAttachStateChangeListener(this.f18995v);
        }
    }

    /* renamed from: n */
    private final void m20953n() {
        if (this.f18979f != null && ((this.f18991r && this.f18993t <= 0) || this.f18992s)) {
            this.f18979f.zzae(!this.f18992s);
            this.f18979f = null;
        }
        this.f18974a.mo25722t();
    }

    /* renamed from: o */
    private static WebResourceResponse m20954o() {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17982x0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* renamed from: a */
    public final void mo28125a(int i, int i2, boolean z) {
        this.f18987n.mo27553a(i, i2);
        zzapr zzapr = this.f18989p;
        if (zzapr != null) {
            zzapr.mo27541a(i, i2, false);
        }
    }

    /* renamed from: b */
    public final void mo28137b() {
        zzavb zzavb = this.f18990q;
        if (zzavb != null) {
            WebView webView = this.f18974a.getWebView();
            if (C5071v.m9139D(webView)) {
                m20948a((View) webView, zzavb, 10);
                return;
            }
            m20952m();
            this.f18995v = new C8058va(this, zzavb);
            this.f18974a.getView().addOnAttachStateChangeListener(this.f18995v);
        }
    }

    /* renamed from: c */
    public final void mo28140c() {
        synchronized (this.f18976c) {
        }
        this.f18993t++;
        m20953n();
    }

    /* renamed from: d */
    public final void mo28142d() {
        this.f18993t--;
        m20953n();
    }

    /* renamed from: e */
    public final void mo28143e() {
        this.f18992s = true;
        m20953n();
    }

    /* renamed from: f */
    public final boolean mo28144f() {
        boolean z;
        synchronized (this.f18976c) {
            z = this.f18984k;
        }
        return z;
    }

    /* renamed from: g */
    public final zzavb mo28145g() {
        return this.f18990q;
    }

    /* renamed from: h */
    public final zzb mo28146h() {
        return this.f18988o;
    }

    /* renamed from: i */
    public final void mo28147i() {
        zzavb zzavb = this.f18990q;
        if (zzavb != null) {
            zzavb.mo27669a();
            this.f18990q = null;
        }
        m20952m();
        synchronized (this.f18976c) {
            this.f18975b.clear();
            this.f18977d = null;
            this.f18978e = null;
            this.f18979f = null;
            this.f18980g = null;
            this.f18981h = null;
            this.f18982i = null;
            this.f18983j = false;
            this.f18984k = false;
            this.f18985l = false;
            this.f18986m = null;
            if (this.f18989p != null) {
                this.f18989p.mo27543a(true);
                this.f18989p = null;
            }
        }
    }

    /* renamed from: j */
    public final boolean mo28148j() {
        boolean z;
        synchronized (this.f18976c) {
            z = this.f18985l;
        }
        return z;
    }

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener mo28149k() {
        synchronized (this.f18976c) {
        }
        return null;
    }

    /* renamed from: l */
    public final ViewTreeObserver.OnScrollChangedListener mo28150l() {
        synchronized (this.f18976c) {
        }
        return null;
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzawz.m20167e(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            mo28126a(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.mo25597a();
        r0.f18980g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        m20953n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.f18991r = true;
        r1 = r0.f18980g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f18976c
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbgz r2 = r0.f18974a     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.mo25689f()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.zzawz.m20167e(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.zzbgz r2 = r0.f18974a     // Catch:{ all -> 0x0029 }
            r2.mo25646H()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.f18991r = r1
            com.google.android.gms.internal.ads.zzbik r1 = r0.f18980g
            if (r1 == 0) goto L_0x0025
            r1.mo25597a()
            r1 = 0
            r0.f18980g = r1
        L_0x0025:
            r0.m20953n()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbha.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        if (i < 0) {
            int i2 = (-i) - 1;
            String[] strArr = f18972w;
            if (i2 < strArr.length) {
                str3 = strArr[i2];
                m20947a(this.f18974a.getContext(), "http_err", str3, str2);
                super.onReceivedError(webView, i, str, str2);
            }
        }
        str3 = String.valueOf(i);
        m20947a(this.f18974a.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError >= 0) {
                String[] strArr = f18973x;
                if (primaryError < strArr.length) {
                    str = strArr[primaryError];
                    Context context = this.f18974a.getContext();
                    zzk.zzli();
                    m20947a(context, "ssl_err", str, sslError.getUrl());
                }
            }
            str = String.valueOf(primaryError);
            Context context2 = this.f18974a.getContext();
            zzk.zzli();
            m20947a(context2, "ssl_err", str, sslError.getUrl());
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f18974a.mo25671a(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo28122a(str, (Map<String, String>) Collections.emptyMap());
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case WebSocketProtocol.PAYLOAD_SHORT /*126*/:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzawz.m20167e(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f18983j && webView == this.f18974a.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(scheme)) {
                    zzxr zzxr = this.f18977d;
                    if (zzxr != null) {
                        zzxr.onAdClicked();
                        zzavb zzavb = this.f18990q;
                        if (zzavb != null) {
                            zzavb.mo27671a(str);
                        }
                        this.f18977d = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f18974a.getWebView().willNotDraw()) {
                try {
                    zzdh d = this.f18974a.mo25682d();
                    if (d != null && d.mo29017a(parse)) {
                        parse = d.mo29014a(parse, this.f18974a.getContext(), this.f18974a.getView(), this.f18974a.mo25650a());
                    }
                } catch (zzdi unused) {
                    String valueOf2 = String.valueOf(str);
                    zzbad.m20523d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                zzb zzb = this.f18988o;
                if (zzb == null || zzb.zzkx()) {
                    mo28127a(new zzc("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
                } else {
                    this.f18988o.zzbk(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                zzbad.m20523d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            mo28126a(parse);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo28130a(zzxr zzxr, zzagv zzagv, zzo zzo, zzagx zzagx, zzu zzu, boolean z, zzahp zzahp, zzb zzb, zzaqc zzaqc, zzavb zzavb) {
        if (zzb == null) {
            zzb = new zzb(this.f18974a.getContext(), zzavb, (zzark) null);
        }
        this.f18989p = new zzapr(this.f18974a, zzaqc);
        this.f18990q = zzavb;
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17778B0)).booleanValue()) {
            mo28132a("/adMetadata", (zzaho<? super zzbgz>) new zzagu(zzagv));
        }
        mo28132a("/appEvent", (zzaho<? super zzbgz>) new zzagw(zzagx));
        mo28132a("/backButton", (zzaho<? super zzbgz>) zzagz.f18103j);
        mo28132a("/refresh", (zzaho<? super zzbgz>) zzagz.f18104k);
        mo28132a("/canOpenURLs", (zzaho<? super zzbgz>) zzagz.f18094a);
        mo28132a("/canOpenIntents", (zzaho<? super zzbgz>) zzagz.f18095b);
        mo28132a("/click", (zzaho<? super zzbgz>) zzagz.f18096c);
        mo28132a("/close", (zzaho<? super zzbgz>) zzagz.f18097d);
        mo28132a("/customClose", (zzaho<? super zzbgz>) zzagz.f18098e);
        mo28132a("/instrument", (zzaho<? super zzbgz>) zzagz.f18107n);
        mo28132a("/delayPageLoaded", (zzaho<? super zzbgz>) zzagz.f18109p);
        mo28132a("/delayPageClosed", (zzaho<? super zzbgz>) zzagz.f18110q);
        mo28132a("/getLocationInfo", (zzaho<? super zzbgz>) zzagz.f18111r);
        mo28132a("/httpTrack", (zzaho<? super zzbgz>) zzagz.f18099f);
        mo28132a("/log", (zzaho<? super zzbgz>) zzagz.f18100g);
        mo28132a("/mraid", (zzaho<? super zzbgz>) new zzahr(zzb, this.f18989p, zzaqc));
        mo28132a("/mraidLoaded", (zzaho<? super zzbgz>) this.f18987n);
        mo28132a("/open", (zzaho<? super zzbgz>) new zzahs(zzb, this.f18989p));
        mo28132a("/precache", (zzaho<? super zzbgz>) new zzbgc());
        mo28132a("/touch", (zzaho<? super zzbgz>) zzagz.f18102i);
        mo28132a("/video", (zzaho<? super zzbgz>) zzagz.f18105l);
        mo28132a("/videoMeta", (zzaho<? super zzbgz>) zzagz.f18106m);
        if (zzk.zzme().mo27700f(this.f18974a.getContext())) {
            mo28132a("/logScionEvent", (zzaho<? super zzbgz>) new zzahq(this.f18974a.getContext()));
        }
        this.f18977d = zzxr;
        this.f18978e = zzo;
        this.f18981h = zzagv;
        this.f18982i = zzagx;
        this.f18986m = zzu;
        this.f18988o = zzb;
        this.f18983j = z;
    }

    @VisibleForTesting
    private zzbha(zzbgz zzbgz, zzwj zzwj, boolean z, zzaqa zzaqa, zzapr zzapr) {
        this.f18975b = new HashMap<>();
        this.f18976c = new Object();
        this.f18983j = false;
        this.f18974a = zzbgz;
        this.f18984k = z;
        this.f18987n = zzaqa;
        this.f18989p = null;
    }

    /* renamed from: c */
    public final void mo28141c(boolean z) {
        this.f18994u = z;
    }

    /* renamed from: b */
    public final void mo28138b(String str, zzaho<? super zzbgz> zzaho) {
        synchronized (this.f18976c) {
            List list = this.f18975b.get(str);
            if (list != null) {
                list.remove(zzaho);
            }
        }
    }

    /* renamed from: b */
    private final WebResourceResponse m20951b(String str, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : map.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    zzk.zzlg().mo27800a(this.f18974a.getContext(), this.f18974a.mo25672b().f18742f, false, httpURLConnection);
                    zzazx zzazx = new zzazx();
                    zzazx.mo27885a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzazx.mo27884a(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        zzk.zzlg();
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                zzbad.m20523d("Protocol is null");
                                return m20954o();
                            } else if (protocol.equals("http") || protocol.equals(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME)) {
                                String valueOf = String.valueOf(headerField);
                                zzbad.m20516a(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                zzbad.m20523d(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return m20954o();
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        zzk.zzlg();
        return zzaxi.m20265a(httpURLConnection);
    }

    /* renamed from: b */
    public final void mo28139b(boolean z) {
        this.f18983j = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20948a(View view, zzavb zzavb, int i) {
        if (zzavb.mo27677c() && i > 0) {
            zzavb.mo27670a(view);
            if (zzavb.mo27677c()) {
                zzaxi.f18651h.postDelayed(new C8021ua(this, view, zzavb, i), 100);
            }
        }
    }

    /* renamed from: a */
    public final void mo28127a(zzc zzc) {
        zzo zzo;
        boolean g = this.f18974a.mo25691g();
        zzxr zzxr = (!g || this.f18974a.mo25695i().mo28181b()) ? this.f18977d : null;
        if (g) {
            zzo = null;
        } else {
            zzo = this.f18978e;
        }
        m20949a(new AdOverlayInfoParcel(zzc, zzxr, zzo, this.f18986m, this.f18974a.mo25672b()));
    }

    /* renamed from: a */
    public final void mo28134a(boolean z, int i) {
        zzxr zzxr = (!this.f18974a.mo25691g() || this.f18974a.mo25695i().mo28181b()) ? this.f18977d : null;
        zzo zzo = this.f18978e;
        zzu zzu = this.f18986m;
        zzbgz zzbgz = this.f18974a;
        m20949a(new AdOverlayInfoParcel(zzxr, zzo, zzu, zzbgz, z, i, zzbgz.mo25672b()));
    }

    /* renamed from: a */
    public final void mo28135a(boolean z, int i, String str) {
        C8095wa waVar;
        boolean g = this.f18974a.mo25691g();
        zzxr zzxr = (!g || this.f18974a.mo25695i().mo28181b()) ? this.f18977d : null;
        if (g) {
            waVar = null;
        } else {
            waVar = new C8095wa(this.f18974a, this.f18978e);
        }
        zzagv zzagv = this.f18981h;
        zzagx zzagx = this.f18982i;
        zzu zzu = this.f18986m;
        zzbgz zzbgz = this.f18974a;
        m20949a(new AdOverlayInfoParcel(zzxr, waVar, zzagv, zzagx, zzu, zzbgz, z, i, str, zzbgz.mo25672b()));
    }

    /* renamed from: a */
    public final void mo28136a(boolean z, int i, String str, String str2) {
        C8095wa waVar;
        boolean g = this.f18974a.mo25691g();
        zzxr zzxr = (!g || this.f18974a.mo25695i().mo28181b()) ? this.f18977d : null;
        if (g) {
            waVar = null;
        } else {
            waVar = new C8095wa(this.f18974a, this.f18978e);
        }
        zzagv zzagv = this.f18981h;
        zzagx zzagx = this.f18982i;
        zzu zzu = this.f18986m;
        zzbgz zzbgz = this.f18974a;
        m20949a(new AdOverlayInfoParcel(zzxr, waVar, zzagv, zzagx, zzu, zzbgz, z, i, str, str2, zzbgz.mo25672b()));
    }

    /* renamed from: a */
    private final void m20949a(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzc;
        zzapr zzapr = this.f18989p;
        boolean a = zzapr != null ? zzapr.mo27544a() : false;
        zzk.zzlf();
        zzm.zza(this.f18974a.getContext(), adOverlayInfoParcel, !a);
        if (this.f18990q != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && (zzc = adOverlayInfoParcel.zzdkl) != null) {
                str = zzc.url;
            }
            this.f18990q.mo27671a(str);
        }
    }

    /* renamed from: a */
    public final void mo28132a(String str, zzaho<? super zzbgz> zzaho) {
        synchronized (this.f18976c) {
            List list = this.f18975b.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f18975b.put(str, list);
            }
            list.add(zzaho);
        }
    }

    /* renamed from: a */
    public final void mo28131a(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        synchronized (this.f18976c) {
            List<zzaho> list = this.f18975b.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzaho zzaho : list) {
                    if (predicate.apply(zzaho)) {
                        arrayList.add(zzaho);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo28128a(zzbij zzbij) {
        this.f18979f = zzbij;
    }

    /* renamed from: a */
    public final void mo28129a(zzbik zzbik) {
        this.f18980g = zzbik;
    }

    /* renamed from: a */
    private final void m20947a(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17879a1)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                    zzk.zzlg().mo27799a(context, this.f18974a.mo25672b().f18742f, "gmob-apps", bundle, true);
                }
            }
            str4 = "";
            bundle.putString("host", str4);
            zzk.zzlg().mo27799a(context, this.f18974a.mo25672b().f18742f, "gmob-apps", bundle, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo28122a(String str, Map<String, String> map) {
        zzvs a;
        try {
            String a2 = zzavx.m20100a(str, this.f18974a.getContext(), this.f18994u);
            if (!a2.equals(str)) {
                return m20951b(a2, map);
            }
            zzvv a3 = zzvv.m25451a(str);
            if (a3 != null && (a = zzk.zzlm().mo29842a(a3)) != null && a.mo29845d()) {
                return new WebResourceResponse("", "", a.mo29846o());
            }
            if (!zzazx.m20498a()) {
                return null;
            }
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17834P0)).booleanValue()) {
                return m20951b(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            zzk.zzlk().mo27734a(e, "AdWebViewClient.interceptRequest");
            return m20954o();
        }
    }

    /* renamed from: a */
    public final void mo28123a() {
        synchronized (this.f18976c) {
            this.f18983j = false;
            this.f18984k = true;
            zzbbm.f18748a.execute(new C7984ta(this));
        }
    }

    /* renamed from: a */
    public final void mo28124a(int i, int i2) {
        zzapr zzapr = this.f18989p;
        if (zzapr != null) {
            zzapr.mo27540a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo28126a(Uri uri) {
        String path = uri.getPath();
        List<zzaho> list = this.f18975b.get(path);
        if (list != null) {
            zzk.zzlg();
            Map<String, String> a = zzaxi.m20271a(uri);
            if (zzbad.m20518a(2)) {
                String valueOf = String.valueOf(path);
                zzawz.m20167e(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
                for (String next : a.keySet()) {
                    String str = a.get(next);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str).length());
                    sb.append("  ");
                    sb.append(next);
                    sb.append(": ");
                    sb.append(str);
                    zzawz.m20167e(sb.toString());
                }
            }
            for (zzaho a2 : list) {
                a2.mo25559a(this.f18974a, a);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        zzawz.m20167e(sb2.toString());
    }

    /* renamed from: a */
    public final void mo28133a(boolean z) {
        synchronized (this.f18976c) {
            this.f18985l = true;
        }
    }
}
