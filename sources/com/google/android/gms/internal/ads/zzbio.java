package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
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
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p050l.p075h.p084l.C5071v;

@VisibleForTesting
@zzard
public final class zzbio extends zzbiz implements zzbii {

    /* renamed from: d */
    protected zzbgz f19022d;

    /* renamed from: e */
    private final zzaju<zzbgz> f19023e = new zzaju<>();

    /* renamed from: f */
    private final Object f19024f = new Object();

    /* renamed from: g */
    private zzxr f19025g;

    /* renamed from: h */
    private zzo f19026h;

    /* renamed from: i */
    private zzbij f19027i;

    /* renamed from: j */
    private zzbik f19028j;

    /* renamed from: k */
    private zzagv f19029k;

    /* renamed from: l */
    private zzagx f19030l;

    /* renamed from: m */
    private boolean f19031m = false;

    /* renamed from: n */
    private volatile boolean f19032n;

    /* renamed from: o */
    private boolean f19033o;

    /* renamed from: p */
    private zzu f19034p;

    /* renamed from: q */
    private zzaqa f19035q;

    /* renamed from: r */
    private zzb f19036r;

    /* renamed from: s */
    private zzapr f19037s;

    /* renamed from: t */
    private zzavb f19038t;

    /* renamed from: u */
    private boolean f19039u;

    /* renamed from: v */
    private boolean f19040v;

    /* renamed from: w */
    private int f19041w;

    /* renamed from: x */
    private boolean f19042x;

    /* renamed from: y */
    private View.OnAttachStateChangeListener f19043y;

    /* renamed from: m */
    private final void m21136m() {
        if (this.f19043y != null) {
            this.f19022d.getView().removeOnAttachStateChangeListener(this.f19043y);
        }
    }

    /* renamed from: n */
    private final void m21137n() {
        if (this.f19027i != null && ((this.f19039u && this.f19041w <= 0) || this.f19040v)) {
            this.f19027i.zzae(!this.f19040v);
            this.f19027i = null;
        }
        this.f19022d.mo25722t();
    }

    /* renamed from: o */
    private static WebResourceResponse m21138o() {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17982x0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo28186a(zzbgz zzbgz, boolean z) {
        zzaqa zzaqa = new zzaqa(zzbgz, zzbgz.mo25640B(), new zzacf(zzbgz.getContext()));
        this.f19022d = zzbgz;
        this.f19032n = z;
        this.f19035q = zzaqa;
        this.f19037s = null;
        this.f19023e.mo27349a(zzbgz);
    }

    /* renamed from: b */
    public final void mo28192b(String str, zzaho<? super zzbgz> zzaho) {
        this.f19023e.mo27354b(str, zzaho);
    }

    /* renamed from: c */
    public final void mo28140c() {
        synchronized (this.f19024f) {
        }
        this.f19041w++;
        m21137n();
    }

    /* renamed from: d */
    public final void mo28142d() {
        this.f19041w--;
        m21137n();
    }

    /* renamed from: e */
    public final void mo28143e() {
        this.f19040v = true;
        m21137n();
    }

    /* renamed from: f */
    public final boolean mo28144f() {
        return this.f19032n;
    }

    /* renamed from: g */
    public final zzavb mo28145g() {
        return this.f19038t;
    }

    /* renamed from: h */
    public final zzb mo28146h() {
        return this.f19036r;
    }

    /* renamed from: i */
    public final void mo28196i() {
        zzavb zzavb = this.f19038t;
        if (zzavb != null) {
            zzavb.mo27669a();
            this.f19038t = null;
        }
        m21136m();
        this.f19023e.mo27347M();
        this.f19023e.mo27349a(null);
        synchronized (this.f19024f) {
            this.f19025g = null;
            this.f19026h = null;
            this.f19027i = null;
            this.f19028j = null;
            this.f19029k = null;
            this.f19030l = null;
            this.f19034p = null;
            if (this.f19037s != null) {
                this.f19037s.mo27543a(true);
                this.f19037s = null;
            }
        }
    }

    /* renamed from: j */
    public final boolean mo28197j() {
        boolean z;
        synchronized (this.f19024f) {
            z = this.f19033o;
        }
        return z;
    }

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener mo28198k() {
        synchronized (this.f19024f) {
        }
        return null;
    }

    /* renamed from: l */
    public final ViewTreeObserver.OnScrollChangedListener mo28199l() {
        synchronized (this.f19024f) {
        }
        return null;
    }

    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f19022d.mo25671a(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    /* renamed from: b */
    public final void mo28137b() {
        zzavb zzavb = this.f19038t;
        if (zzavb != null) {
            WebView webView = this.f19022d.getWebView();
            if (C5071v.m9139D(webView)) {
                m21132a((View) webView, zzavb, 10);
                return;
            }
            m21136m();
            this.f19043y = new C7689lb(this, zzavb);
            this.f19022d.getView().addOnAttachStateChangeListener(this.f19043y);
        }
    }

    /* renamed from: e */
    private final WebResourceResponse m21135e(zzbja zzbja) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(zzbja.f19047a);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : zzbja.f19049c.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    zzk.zzlg().mo27800a(this.f19022d.getContext(), this.f19022d.mo25672b().f18742f, false, httpURLConnection);
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
                                return m21138o();
                            } else if (protocol.equals("http") || protocol.equals(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME)) {
                                String valueOf = String.valueOf(headerField);
                                zzbad.m20516a(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                zzbad.m20523d(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return m21138o();
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

    /* renamed from: d */
    public final WebResourceResponse mo28195d(zzbja zzbja) {
        WebResourceResponse webResourceResponse;
        zzvs a;
        String str;
        zzavb zzavb = this.f19038t;
        if (zzavb != null) {
            zzavb.mo27672a(zzbja.f19047a, zzbja.f19049c, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(zzbja.f19047a).getName())) {
            webResourceResponse = null;
        } else {
            mo28123a();
            if (this.f19022d.mo25695i().mo28181b()) {
                str = (String) zzyt.m25670e().mo27163a(zzacu.f17813K);
            } else if (this.f19022d.mo25691g()) {
                str = (String) zzyt.m25670e().mo27163a(zzacu.f17809J);
            } else {
                str = (String) zzyt.m25670e().mo27163a(zzacu.f17805I);
            }
            zzk.zzlg();
            webResourceResponse = zzaxi.m20289c(this.f19022d.getContext(), this.f19022d.mo25672b().f18742f, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!zzavx.m20100a(zzbja.f19047a, this.f19022d.getContext(), this.f19042x).equals(zzbja.f19047a)) {
                return m21135e(zzbja);
            }
            zzvv a2 = zzvv.m25451a(zzbja.f19047a);
            if (a2 != null && (a = zzk.zzlm().mo29842a(a2)) != null && a.mo29845d()) {
                return new WebResourceResponse("", "", a.mo29846o());
            }
            if (zzazx.m20498a()) {
                if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17834P0)).booleanValue()) {
                    return m21135e(zzbja);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            zzk.zzlk().mo27734a(e, "AdWebViewClient.interceptRequest");
            return m21138o();
        }
    }

    /* renamed from: c */
    public final boolean mo26857c(zzbja zzbja) {
        String valueOf = String.valueOf(zzbja.f19047a);
        zzawz.m20167e(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = zzbja.f19048b;
        if (this.f19023e.mo27352a(uri)) {
            return true;
        }
        if (this.f19031m) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(scheme)) {
                zzxr zzxr = this.f19025g;
                if (zzxr != null) {
                    zzxr.onAdClicked();
                    zzavb zzavb = this.f19038t;
                    if (zzavb != null) {
                        zzavb.mo27671a(zzbja.f19047a);
                    }
                    this.f19025g = null;
                }
                return false;
            }
        }
        if (!this.f19022d.getWebView().willNotDraw()) {
            try {
                zzdh d = this.f19022d.mo25682d();
                if (d != null && d.mo29017a(uri)) {
                    uri = d.mo29014a(uri, this.f19022d.getContext(), this.f19022d.getView(), this.f19022d.mo25650a());
                }
            } catch (zzdi unused) {
                String valueOf2 = String.valueOf(zzbja.f19047a);
                zzbad.m20523d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            zzb zzb = this.f19036r;
            if (zzb == null || zzb.zzkx()) {
                mo28185a(new zzc("android.intent.action.VIEW", uri.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
            } else {
                this.f19036r.zzbk(zzbja.f19047a);
            }
        } else {
            String valueOf3 = String.valueOf(zzbja.f19047a);
            zzbad.m20523d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    /* renamed from: a */
    public final void mo28125a(int i, int i2, boolean z) {
        this.f19035q.mo27553a(i, i2);
        zzapr zzapr = this.f19037s;
        if (zzapr != null) {
            zzapr.mo27541a(i, i2, false);
        }
    }

    /* renamed from: b */
    public final void mo26856b(zzbja zzbja) {
        this.f19023e.mo27352a(zzbja.f19048b);
    }

    /* renamed from: b */
    public final void mo28193b(boolean z) {
        this.f19031m = z;
    }

    /* renamed from: a */
    public final void mo28188a(String str, zzaho<? super zzbgz> zzaho) {
        this.f19023e.mo27351a(str, zzaho);
    }

    /* renamed from: a */
    public final void mo28187a(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        this.f19023e.mo27350a(str, predicate);
    }

    /* renamed from: a */
    public final void mo28130a(zzxr zzxr, zzagv zzagv, zzo zzo, zzagx zzagx, zzu zzu, boolean z, zzahp zzahp, zzb zzb, zzaqc zzaqc, zzavb zzavb) {
        if (zzb == null) {
            zzb = new zzb(this.f19022d.getContext(), zzavb, (zzark) null);
        }
        this.f19037s = new zzapr(this.f19022d, zzaqc);
        this.f19038t = zzavb;
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17778B0)).booleanValue()) {
            mo28188a("/adMetadata", (zzaho<? super zzbgz>) new zzagu(zzagv));
        }
        mo28188a("/appEvent", (zzaho<? super zzbgz>) new zzagw(zzagx));
        mo28188a("/backButton", (zzaho<? super zzbgz>) zzagz.f18103j);
        mo28188a("/refresh", (zzaho<? super zzbgz>) zzagz.f18104k);
        mo28188a("/canOpenURLs", (zzaho<? super zzbgz>) zzagz.f18094a);
        mo28188a("/canOpenIntents", (zzaho<? super zzbgz>) zzagz.f18095b);
        mo28188a("/click", (zzaho<? super zzbgz>) zzagz.f18096c);
        mo28188a("/close", (zzaho<? super zzbgz>) zzagz.f18097d);
        mo28188a("/customClose", (zzaho<? super zzbgz>) zzagz.f18098e);
        mo28188a("/instrument", (zzaho<? super zzbgz>) zzagz.f18107n);
        mo28188a("/delayPageLoaded", (zzaho<? super zzbgz>) zzagz.f18109p);
        mo28188a("/delayPageClosed", (zzaho<? super zzbgz>) zzagz.f18110q);
        mo28188a("/getLocationInfo", (zzaho<? super zzbgz>) zzagz.f18111r);
        mo28188a("/httpTrack", (zzaho<? super zzbgz>) zzagz.f18099f);
        mo28188a("/log", (zzaho<? super zzbgz>) zzagz.f18100g);
        mo28188a("/mraid", (zzaho<? super zzbgz>) new zzahr(zzb, this.f19037s, zzaqc));
        mo28188a("/mraidLoaded", (zzaho<? super zzbgz>) this.f19035q);
        mo28188a("/open", (zzaho<? super zzbgz>) new zzahs(zzb, this.f19037s));
        mo28188a("/precache", (zzaho<? super zzbgz>) new zzbgc());
        mo28188a("/touch", (zzaho<? super zzbgz>) zzagz.f18102i);
        mo28188a("/video", (zzaho<? super zzbgz>) zzagz.f18105l);
        mo28188a("/videoMeta", (zzaho<? super zzbgz>) zzagz.f18106m);
        if (zzk.zzme().mo27700f(this.f19022d.getContext())) {
            mo28188a("/logScionEvent", (zzaho<? super zzbgz>) new zzahq(this.f19022d.getContext()));
        }
        this.f19025g = zzxr;
        this.f19026h = zzo;
        this.f19029k = zzagv;
        this.f19030l = zzagx;
        this.f19034p = zzu;
        this.f19036r = zzb;
        this.f19031m = z;
    }

    /* renamed from: c */
    public final void mo28194c(boolean z) {
        this.f19042x = z;
    }

    /* renamed from: a */
    public final void mo26855a(zzbja zzbja) {
        this.f19039u = true;
        zzbik zzbik = this.f19028j;
        if (zzbik != null) {
            zzbik.mo25597a();
            this.f19028j = null;
        }
        m21137n();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21132a(View view, zzavb zzavb, int i) {
        if (zzavb.mo27677c() && i > 0) {
            zzavb.mo27670a(view);
            if (zzavb.mo27677c()) {
                zzaxi.f18651h.postDelayed(new C7652kb(this, view, zzavb, i), 100);
            }
        }
    }

    /* renamed from: a */
    public final void mo28185a(zzc zzc) {
        zzo zzo;
        boolean g = this.f19022d.mo25691g();
        zzxr zzxr = (!g || this.f19022d.mo25695i().mo28181b()) ? this.f19025g : null;
        if (g) {
            zzo = null;
        } else {
            zzo = this.f19026h;
        }
        m21133a(new AdOverlayInfoParcel(zzc, zzxr, zzo, this.f19034p, this.f19022d.mo25672b()));
    }

    /* renamed from: a */
    public final void mo28189a(boolean z, int i) {
        zzxr zzxr = (!this.f19022d.mo25691g() || this.f19022d.mo25695i().mo28181b()) ? this.f19025g : null;
        zzo zzo = this.f19026h;
        zzu zzu = this.f19034p;
        zzbgz zzbgz = this.f19022d;
        m21133a(new AdOverlayInfoParcel(zzxr, zzo, zzu, zzbgz, z, i, zzbgz.mo25672b()));
    }

    /* renamed from: a */
    public final void mo28190a(boolean z, int i, String str) {
        C7726mb mbVar;
        boolean g = this.f19022d.mo25691g();
        zzxr zzxr = (!g || this.f19022d.mo25695i().mo28181b()) ? this.f19025g : null;
        if (g) {
            mbVar = null;
        } else {
            mbVar = new C7726mb(this.f19022d, this.f19026h);
        }
        zzagv zzagv = this.f19029k;
        zzagx zzagx = this.f19030l;
        zzu zzu = this.f19034p;
        zzbgz zzbgz = this.f19022d;
        m21133a(new AdOverlayInfoParcel(zzxr, mbVar, zzagv, zzagx, zzu, zzbgz, z, i, str, zzbgz.mo25672b()));
    }

    /* renamed from: a */
    public final void mo28191a(boolean z, int i, String str, String str2) {
        C7726mb mbVar;
        boolean g = this.f19022d.mo25691g();
        zzxr zzxr = (!g || this.f19022d.mo25695i().mo28181b()) ? this.f19025g : null;
        if (g) {
            mbVar = null;
        } else {
            mbVar = new C7726mb(this.f19022d, this.f19026h);
        }
        zzagv zzagv = this.f19029k;
        zzagx zzagx = this.f19030l;
        zzu zzu = this.f19034p;
        zzbgz zzbgz = this.f19022d;
        m21133a(new AdOverlayInfoParcel(zzxr, mbVar, zzagv, zzagx, zzu, zzbgz, z, i, str, str2, zzbgz.mo25672b()));
    }

    /* renamed from: a */
    private final void m21133a(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzc;
        zzapr zzapr = this.f19037s;
        boolean a = zzapr != null ? zzapr.mo27544a() : false;
        zzk.zzlf();
        zzm.zza(this.f19022d.getContext(), adOverlayInfoParcel, !a);
        if (this.f19038t != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && (zzc = adOverlayInfoParcel.zzdkl) != null) {
                str = zzc.url;
            }
            this.f19038t.mo27671a(str);
        }
    }

    /* renamed from: a */
    public final void mo28128a(zzbij zzbij) {
        this.f19027i = zzbij;
    }

    /* renamed from: a */
    public final void mo28129a(zzbik zzbik) {
        this.f19028j = zzbik;
    }

    /* renamed from: a */
    public final void mo28123a() {
        synchronized (this.f19024f) {
            this.f19031m = false;
            this.f19032n = true;
            zzbbm.f18748a.execute(new C7615jb(this));
        }
    }

    /* renamed from: a */
    public final void mo28124a(int i, int i2) {
        zzapr zzapr = this.f19037s;
        if (zzapr != null) {
            zzapr.mo27540a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo28133a(boolean z) {
        synchronized (this.f19024f) {
            this.f19033o = true;
        }
    }

    /* renamed from: a */
    public final void mo28126a(Uri uri) {
        this.f19023e.mo27353b(uri);
    }
}
