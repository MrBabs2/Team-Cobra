package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzwl;
import com.google.android.gms.internal.ads.zzwt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;

@VisibleForTesting
@zzard
/* renamed from: com.google.android.gms.internal.ads.bb */
final class C7316bb extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzbgz {

    /* renamed from: A */
    private String f14572A = "";

    /* renamed from: B */
    private zzbhq f14573B;

    /* renamed from: C */
    private boolean f14574C;

    /* renamed from: D */
    private boolean f14575D;

    /* renamed from: E */
    private zzadx f14576E;

    /* renamed from: F */
    private zzadv f14577F;

    /* renamed from: G */
    private int f14578G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public int f14579H;

    /* renamed from: I */
    private zzadg f14580I;

    /* renamed from: J */
    private zzadg f14581J;

    /* renamed from: K */
    private zzadg f14582K;

    /* renamed from: L */
    private zzadh f14583L;

    /* renamed from: M */
    private zzd f14584M;

    /* renamed from: N */
    private boolean f14585N;

    /* renamed from: O */
    private zzazs f14586O;

    /* renamed from: P */
    private int f14587P = -1;

    /* renamed from: Q */
    private int f14588Q = -1;

    /* renamed from: R */
    private int f14589R = -1;

    /* renamed from: S */
    private int f14590S = -1;

    /* renamed from: T */
    private Map<String, zzbft> f14591T;

    /* renamed from: U */
    private final WindowManager f14592U;

    /* renamed from: V */
    private final zzwj f14593V;

    /* renamed from: f */
    private final zzbim f14594f;

    /* renamed from: g */
    private final zzdh f14595g;

    /* renamed from: h */
    private final zzbai f14596h;

    /* renamed from: i */
    private final zzj f14597i;

    /* renamed from: j */
    private final zza f14598j;

    /* renamed from: k */
    private final DisplayMetrics f14599k;

    /* renamed from: l */
    private final float f14600l;

    /* renamed from: m */
    private boolean f14601m = false;

    /* renamed from: n */
    private boolean f14602n = false;

    /* renamed from: o */
    private zzbha f14603o;

    /* renamed from: p */
    private zzd f14604p;

    /* renamed from: q */
    private IObjectWrapper f14605q;

    /* renamed from: r */
    private zzbin f14606r;

    /* renamed from: s */
    private String f14607s;

    /* renamed from: t */
    private boolean f14608t;

    /* renamed from: u */
    private boolean f14609u;

    /* renamed from: v */
    private boolean f14610v;

    /* renamed from: w */
    private boolean f14611w;

    /* renamed from: x */
    private Boolean f14612x;

    /* renamed from: y */
    private int f14613y;

    /* renamed from: z */
    private boolean f14614z = true;

    @VisibleForTesting
    private C7316bb(zzbim zzbim, zzbin zzbin, String str, boolean z, boolean z2, zzdh zzdh, zzbai zzbai, zzadi zzadi, zzj zzj, zza zza, zzwj zzwj) {
        super(zzbim);
        this.f14594f = zzbim;
        this.f14606r = zzbin;
        this.f14607s = str;
        this.f14610v = z;
        this.f14613y = -1;
        this.f14595g = zzdh;
        this.f14596h = zzbai;
        this.f14597i = zzj;
        this.f14598j = zza;
        this.f14592U = (WindowManager) getContext().getSystemService("window");
        zzk.zzlg();
        DisplayMetrics a = zzaxi.m20264a(this.f14592U);
        this.f14599k = a;
        this.f14600l = a.density;
        this.f14593V = zzwj;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzbad.m20520b("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzk.zzlg().mo27798a((Context) zzbim, zzbai.f18742f, settings);
        zzk.zzli().mo27820a(getContext(), settings);
        setDownloadListener(this);
        m16550P();
        if (PlatformVersion.m16288d()) {
            addJavascriptInterface(zzbht.m21074a((zzbgz) this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f14586O = new zzazs(this.f14594f.mo28176b(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        m16554T();
        zzadh zzadh = new zzadh(new zzadi(true, "make_wv", this.f14607s));
        this.f14583L = zzadh;
        zzadh.mo27178a().mo27183a(zzadi);
        zzadg a2 = zzadb.m18999a(this.f14583L.mo27178a());
        this.f14581J = a2;
        this.f14583L.mo27179a("native:view_create", a2);
        this.f14582K = null;
        this.f14580I = null;
        zzk.zzli().mo27824b((Context) zzbim);
        zzk.zzlk().mo27740f();
    }

    /* renamed from: M */
    private final boolean m16547M() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f14603o.mo28144f() && !this.f14603o.mo28148j()) {
            return false;
        }
        zzyt.m25666a();
        DisplayMetrics displayMetrics = this.f14599k;
        int b = zzazt.m20476b(displayMetrics, displayMetrics.widthPixels);
        zzyt.m25666a();
        DisplayMetrics displayMetrics2 = this.f14599k;
        int b2 = zzazt.m20476b(displayMetrics2, displayMetrics2.heightPixels);
        Activity b3 = this.f14594f.mo28176b();
        if (b3 == null || b3.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            zzk.zzlg();
            int[] c = zzaxi.m20293c(b3);
            zzyt.m25666a();
            int b4 = zzazt.m20476b(this.f14599k, c[0]);
            zzyt.m25666a();
            i = zzazt.m20476b(this.f14599k, c[1]);
            i2 = b4;
        }
        if (this.f14588Q == b && this.f14587P == b2 && this.f14589R == i2 && this.f14590S == i) {
            return false;
        }
        if (!(this.f14588Q == b && this.f14587P == b2)) {
            z = true;
        }
        this.f14588Q = b;
        this.f14587P = b2;
        this.f14589R = i2;
        this.f14590S = i;
        new zzaqb(this).mo27555a(b, b2, i2, i, this.f14599k.density, this.f14592U.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: N */
    private final synchronized void m16548N() {
        Boolean d = zzk.zzlk().mo27738d();
        this.f14612x = d;
        if (d == null) {
            try {
                evaluateJavascript("(function(){})()", (ValueCallback<String>) null);
                m16560a((Boolean) true);
            } catch (IllegalStateException unused) {
                m16560a((Boolean) false);
            }
        }
    }

    /* renamed from: O */
    private final void m16549O() {
        zzadb.m19000a(this.f14583L.mo27178a(), this.f14581J, "aeh2");
    }

    /* renamed from: P */
    private final synchronized void m16550P() {
        if (!this.f14610v) {
            if (!this.f14606r.mo28181b()) {
                if (Build.VERSION.SDK_INT < 18) {
                    zzbad.m20516a("Disabling hardware acceleration on an AdView.");
                    m16551Q();
                    return;
                }
                zzbad.m20516a("Enabling hardware acceleration on an AdView.");
                m16552R();
                return;
            }
        }
        zzbad.m20516a("Enabling hardware acceleration on an overlay.");
        m16552R();
    }

    /* renamed from: Q */
    private final synchronized void m16551Q() {
        if (!this.f14611w) {
            zzk.zzli();
            setLayerType(1, (Paint) null);
        }
        this.f14611w = true;
    }

    /* renamed from: R */
    private final synchronized void m16552R() {
        if (this.f14611w) {
            zzk.zzli();
            setLayerType(0, (Paint) null);
        }
        this.f14611w = false;
    }

    /* renamed from: S */
    private final synchronized void m16553S() {
        if (this.f14591T != null) {
            for (zzbft a : this.f14591T.values()) {
                a.mo24917a();
            }
        }
        this.f14591T = null;
    }

    /* renamed from: T */
    private final void m16554T() {
        zzadi a;
        zzadh zzadh = this.f14583L;
        if (zzadh != null && (a = zzadh.mo27178a()) != null && zzk.zzlk().mo27737c() != null) {
            zzk.zzlk().mo27737c().mo27174a(a);
        }
    }

    @VisibleForTesting
    /* renamed from: U */
    private final synchronized Boolean m16555U() {
        return this.f14612x;
    }

    /* renamed from: V */
    private final synchronized void m16556V() {
        if (!this.f14585N) {
            this.f14585N = true;
            zzk.zzlk().mo27741g();
        }
    }

    /* renamed from: a */
    static C7316bb m16559a(Context context, zzbin zzbin, String str, boolean z, boolean z2, zzdh zzdh, zzbai zzbai, zzadi zzadi, zzj zzj, zza zza, zzwj zzwj) {
        Context context2 = context;
        return new C7316bb(new zzbim(context), zzbin, str, z, z2, zzdh, zzbai, zzadi, zzj, zza, zzwj);
    }

    /* renamed from: b */
    private final synchronized void m16564b(String str) {
        if (!mo25689f()) {
            loadUrl(str);
        } else {
            zzbad.m20523d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: g */
    private final synchronized void m16565g(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            zzk.zzlk().mo27734a(e, "AdWebViewImpl.loadUrlUnsafe");
            zzbad.m20522c("Could not call loadUrl. ", e);
        }
    }

    /* renamed from: h */
    private final void m16567h(String str) {
        if (PlatformVersion.m16290f()) {
            if (m16555U() == null) {
                m16548N();
            }
            if (m16555U().booleanValue()) {
                m16561a(str, (ValueCallback<String>) null);
                return;
            }
            String valueOf = String.valueOf(str);
            m16564b(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        m16564b(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    /* renamed from: A */
    public final void mo25639A() {
        if (this.f14580I == null) {
            zzadb.m19000a(this.f14583L.mo27178a(), this.f14581J, "aes2");
            zzadg a = zzadb.m18999a(this.f14583L.mo27178a());
            this.f14580I = a;
            this.f14583L.mo27179a("native:view_show", a);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f14596h.f18742f);
        mo25665a("onshow", (Map<String, ?>) hashMap);
    }

    /* renamed from: B */
    public final Context mo25640B() {
        return this.f14594f.mo28175a();
    }

    /* renamed from: C */
    public final void mo25641C() {
        setBackgroundColor(0);
    }

    /* renamed from: D */
    public final int mo25642D() {
        return getMeasuredHeight();
    }

    /* renamed from: E */
    public final zzbcw mo25643E() {
        return null;
    }

    /* renamed from: F */
    public final synchronized zzd mo25644F() {
        return this.f14604p;
    }

    /* renamed from: G */
    public final void mo25645G() {
        zzawz.m20167e("Cannot add text view to inner AdWebView");
    }

    /* renamed from: H */
    public final synchronized void mo25646H() {
        zzawz.m20167e("Destroying WebView!");
        m16556V();
        zzaxi.f18651h.post(new C7427eb(this));
    }

    /* renamed from: I */
    public final boolean mo25647I() {
        return false;
    }

    /* renamed from: K */
    public final synchronized zzd mo25648K() {
        return this.f14584M;
    }

    /* renamed from: L */
    public final synchronized boolean mo25649L() {
        return this.f14614z;
    }

    /* renamed from: c */
    public final zza mo25678c() {
        return this.f14598j;
    }

    /* renamed from: d */
    public final zzdh mo25682d() {
        return this.f14595g;
    }

    public final synchronized void destroy() {
        m16554T();
        this.f14586O.mo27877d();
        if (this.f14604p != null) {
            this.f14604p.close();
            this.f14604p.onDestroy();
            this.f14604p = null;
        }
        this.f14605q = null;
        this.f14603o.mo28147i();
        if (!this.f14609u) {
            zzk.zzmc();
            zzbfs.m20813a((zzbdf) this);
            m16553S();
            this.f14609u = true;
            zzawz.m20167e("Initiating WebView self destruct sequence in 3...");
            zzawz.m20167e("Loading blank page in WebView, 2...");
            m16565g("about:blank");
        }
    }

    /* renamed from: e */
    public final synchronized void mo25686e(boolean z) {
        if (this.f14604p != null) {
            this.f14604p.zza(this.f14603o.mo28144f(), z);
        } else {
            this.f14608t = z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mo25689f()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.zzbad.m20526f(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7316bb.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* renamed from: f */
    public final synchronized boolean mo25689f() {
        return this.f14609u;
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.f14609u) {
                    this.f14603o.mo28147i();
                    zzk.zzmc();
                    zzbfs.m20813a((zzbdf) this);
                    m16553S();
                    m16556V();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    /* renamed from: i */
    public final synchronized zzbin mo25695i() {
        return this.f14606r;
    }

    /* renamed from: j */
    public final synchronized String mo25696j() {
        return this.f14572A;
    }

    /* renamed from: k */
    public final /* synthetic */ zzbii mo25697k() {
        return this.f14603o;
    }

    /* renamed from: l */
    public final synchronized boolean mo25698l() {
        return this.f14578G > 0;
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo25689f()) {
            super.loadData(str, str2, str3);
        } else {
            zzbad.m20523d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo25689f()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzbad.m20523d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo25689f()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                zzk.zzlk().mo27734a(e, "AdWebViewImpl.loadUrl");
                zzbad.m20522c("Could not call loadUrl. ", e);
            }
        } else {
            zzbad.m20523d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: m */
    public final synchronized String mo25702m() {
        return this.f14607s;
    }

    /* renamed from: o */
    public final synchronized void mo25703o() {
        if (this.f14577F != null) {
            this.f14577F.mo27202R0();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo25689f()) {
            this.f14586O.mo27873a();
        }
        boolean z = this.f14574C;
        if (this.f14603o != null && this.f14603o.mo28148j()) {
            if (!this.f14575D) {
                this.f14603o.mo28149k();
                this.f14603o.mo28150l();
                this.f14575D = true;
            }
            m16547M();
            z = true;
        }
        m16566g(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo25689f()) {
                this.f14586O.mo27875b();
            }
            super.onDetachedFromWindow();
            if (this.f14575D && this.f14603o != null && this.f14603o.mo28148j() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f14603o.mo28149k();
                this.f14603o.mo28150l();
                this.f14575D = false;
            }
        }
        m16566g(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzk.zzlg();
            zzaxi.m20273a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            zzbad.m20516a(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!mo25689f()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean M = m16547M();
        zzd F = mo25644F();
        if (F != null && M) {
            F.zztk();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01f8, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01d6 A[SYNTHETIC, Splitter:B:111:0x01d6] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:121:0x01f9=Splitter:B:121:0x01f9, B:64:0x00de=Splitter:B:64:0x00de} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo25689f()     // Catch:{ all -> 0x01fe }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x01f9
            boolean r0 = r7.f14610v     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x01f9
            com.google.android.gms.internal.ads.zzbin r0 = r7.f14606r     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.mo28182c()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x0021
            goto L_0x01f9
        L_0x0021:
            com.google.android.gms.internal.ads.zzbin r0 = r7.f14606r     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.mo28184e()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.zzbin r0 = r7.f14606r     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.mo28183d()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f17807I1     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x01fe }
            java.lang.Object r0 = r1.mo27163a(r0)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.zzbhq r0 = r7.mo25685e()     // Catch:{ all -> 0x01fe }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.mo26938t()     // Catch:{ all -> 0x01fe }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01fe }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01fe }
            float r1 = (float) r9     // Catch:{ all -> 0x01fe }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01fe }
            float r2 = (float) r8     // Catch:{ all -> 0x01fe }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01fe }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01fe }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01fe }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01fe }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01fe }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01fe }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01fe }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.zzbin r0 = r7.f14606r     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.mo28180a()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f17815K1     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x01fe }
            java.lang.Object r0 = r1.mo27163a(r0)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.m16288d()     // Catch:{ all -> 0x01fe }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.db r1 = new com.google.android.gms.internal.ads.db     // Catch:{ all -> 0x01fe }
            r1.<init>(r7)     // Catch:{ all -> 0x01fe }
            r7.mo25662a((java.lang.String) r0, (com.google.android.gms.internal.ads.zzaho<? super com.google.android.gms.internal.ads.zzbgz>) r1)     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.m16567h(r0)     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r0 = r7.f14599k     // Catch:{ all -> 0x01fe }
            float r0 = r0.density     // Catch:{ all -> 0x01fe }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01fe }
            int r1 = r7.f14579H     // Catch:{ all -> 0x01fe }
            r2 = -1
            if (r1 == r2) goto L_0x00d5
            int r9 = r7.f14579H     // Catch:{ all -> 0x01fe }
            float r9 = (float) r9     // Catch:{ all -> 0x01fe }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01fe }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01fe }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.zzbin r0 = r7.f14606r     // Catch:{ all -> 0x01fe }
            boolean r0 = r0.mo28181b()     // Catch:{ all -> 0x01fe }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.f14599k     // Catch:{ all -> 0x01fe }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01fe }
            android.util.DisplayMetrics r9 = r7.f14599k     // Catch:{ all -> 0x01fe }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01fe }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01fe }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01fe }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01fe }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01fe }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x0118
            if (r0 != r3) goto L_0x0114
            goto L_0x0118
        L_0x0114:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0119
        L_0x0118:
            r0 = r8
        L_0x0119:
            if (r2 == r4) goto L_0x011d
            if (r2 != r3) goto L_0x011e
        L_0x011d:
            r5 = r9
        L_0x011e:
            com.google.android.gms.internal.ads.zzbin r2 = r7.f14606r     // Catch:{ all -> 0x01fe }
            int r2 = r2.f19021c     // Catch:{ all -> 0x01fe }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.zzbin r2 = r7.f14606r     // Catch:{ all -> 0x01fe }
            int r2 = r2.f19020b     // Catch:{ all -> 0x01fe }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.zzacu.f17780B2     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzacr r6 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x01fe }
            java.lang.Object r4 = r6.mo27163a(r4)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01fe }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01fe }
            if (r4 == 0) goto L_0x0167
            com.google.android.gms.internal.ads.zzbin r4 = r7.f14606r     // Catch:{ all -> 0x01fe }
            int r4 = r4.f19021c     // Catch:{ all -> 0x01fe }
            float r4 = (float) r4     // Catch:{ all -> 0x01fe }
            float r6 = r7.f14600l     // Catch:{ all -> 0x01fe }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01fe }
            float r6 = r7.f14600l     // Catch:{ all -> 0x01fe }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            com.google.android.gms.internal.ads.zzbin r0 = r7.f14606r     // Catch:{ all -> 0x01fe }
            int r0 = r0.f19020b     // Catch:{ all -> 0x01fe }
            float r0 = (float) r0     // Catch:{ all -> 0x01fe }
            float r4 = r7.f14600l     // Catch:{ all -> 0x01fe }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01fe }
            float r5 = r7.f14600l     // Catch:{ all -> 0x01fe }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0163
            r0 = 1
            goto L_0x0164
        L_0x0163:
            r0 = 0
        L_0x0164:
            if (r2 == 0) goto L_0x0167
            r2 = r0
        L_0x0167:
            r0 = 8
            if (r2 == 0) goto L_0x01d6
            com.google.android.gms.internal.ads.zzbin r2 = r7.f14606r     // Catch:{ all -> 0x01fe }
            int r2 = r2.f19021c     // Catch:{ all -> 0x01fe }
            float r2 = (float) r2     // Catch:{ all -> 0x01fe }
            float r4 = r7.f14600l     // Catch:{ all -> 0x01fe }
            float r2 = r2 / r4
            int r2 = (int) r2     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzbin r4 = r7.f14606r     // Catch:{ all -> 0x01fe }
            int r4 = r4.f19020b     // Catch:{ all -> 0x01fe }
            float r4 = (float) r4     // Catch:{ all -> 0x01fe }
            float r5 = r7.f14600l     // Catch:{ all -> 0x01fe }
            float r4 = r4 / r5
            int r4 = (int) r4     // Catch:{ all -> 0x01fe }
            float r8 = (float) r8     // Catch:{ all -> 0x01fe }
            float r5 = r7.f14600l     // Catch:{ all -> 0x01fe }
            float r8 = r8 / r5
            int r8 = (int) r8     // Catch:{ all -> 0x01fe }
            float r9 = (float) r9     // Catch:{ all -> 0x01fe }
            float r5 = r7.f14600l     // Catch:{ all -> 0x01fe }
            float r9 = r9 / r5
            int r9 = (int) r9     // Catch:{ all -> 0x01fe }
            r5 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r6.<init>(r5)     // Catch:{ all -> 0x01fe }
            java.lang.String r5 = "Not enough space to show ad. Needs "
            r6.append(r5)     // Catch:{ all -> 0x01fe }
            r6.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "x"
            r6.append(r2)     // Catch:{ all -> 0x01fe }
            r6.append(r4)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = " dp, but only has "
            r6.append(r2)     // Catch:{ all -> 0x01fe }
            r6.append(r8)     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = "x"
            r6.append(r8)     // Catch:{ all -> 0x01fe }
            r6.append(r9)     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = " dp."
            r6.append(r8)     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzbad.m20523d(r8)     // Catch:{ all -> 0x01fe }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01fe }
            if (r8 == r0) goto L_0x01c4
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01fe }
        L_0x01c4:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01fe }
            boolean r8 = r7.f14601m     // Catch:{ all -> 0x01fe }
            if (r8 != 0) goto L_0x01f7
            com.google.android.gms.internal.ads.zzwj r8 = r7.f14593V     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzwl$zza$zzb r9 = com.google.android.gms.internal.ads.zzwl.zza.zzb.BANNER_SIZE_INVALID     // Catch:{ all -> 0x01fe }
            r8.mo29859a((com.google.android.gms.internal.ads.zzwl.zza.zzb) r9)     // Catch:{ all -> 0x01fe }
            r7.f14601m = r3     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x01d6:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01fe }
            if (r8 == r0) goto L_0x01df
            r7.setVisibility(r1)     // Catch:{ all -> 0x01fe }
        L_0x01df:
            boolean r8 = r7.f14602n     // Catch:{ all -> 0x01fe }
            if (r8 != 0) goto L_0x01ec
            com.google.android.gms.internal.ads.zzwj r8 = r7.f14593V     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzwl$zza$zzb r9 = com.google.android.gms.internal.ads.zzwl.zza.zzb.BANNER_SIZE_VALID     // Catch:{ all -> 0x01fe }
            r8.mo29859a((com.google.android.gms.internal.ads.zzwl.zza.zzb) r9)     // Catch:{ all -> 0x01fe }
            r7.f14602n = r3     // Catch:{ all -> 0x01fe }
        L_0x01ec:
            com.google.android.gms.internal.ads.zzbin r8 = r7.f14606r     // Catch:{ all -> 0x01fe }
            int r8 = r8.f19021c     // Catch:{ all -> 0x01fe }
            com.google.android.gms.internal.ads.zzbin r9 = r7.f14606r     // Catch:{ all -> 0x01fe }
            int r9 = r9.f19020b     // Catch:{ all -> 0x01fe }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01fe }
        L_0x01f7:
            monitor-exit(r7)
            return
        L_0x01f9:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01fe }
            monitor-exit(r7)
            return
        L_0x01fe:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7316bb.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!mo25689f()) {
            try {
                super.onPause();
            } catch (Exception e) {
                zzbad.m20520b("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo25689f()) {
            try {
                super.onResume();
            } catch (Exception e) {
                zzbad.m20520b("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f14603o.mo28148j()) {
            synchronized (this) {
                if (this.f14576E != null) {
                    this.f14576E.mo25734a(motionEvent);
                }
            }
        } else {
            zzdh zzdh = this.f14595g;
            if (zzdh != null) {
                zzdh.mo29016a(motionEvent);
            }
        }
        if (mo25689f()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final WebViewClient mo25714p() {
        return this.f14603o;
    }

    /* renamed from: q */
    public final void mo25715q() {
        this.f14586O.mo27876c();
    }

    /* renamed from: r */
    public final synchronized boolean mo25716r() {
        return this.f14608t;
    }

    /* renamed from: s */
    public final void mo25717s() {
        zzd F = mo25644F();
        if (F != null) {
            F.zztm();
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f14613y = i;
        if (this.f14604p != null) {
            this.f14604p.setRequestedOrientation(i);
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzbha) {
            this.f14603o = (zzbha) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!mo25689f()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                zzbad.m20520b("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: t */
    public final void mo25722t() {
        if (this.f14582K == null) {
            zzadg a = zzadb.m18999a(this.f14583L.mo27178a());
            this.f14582K = a;
            this.f14583L.mo27179a("native:view_load", a);
        }
    }

    /* renamed from: u */
    public final void mo25723u() {
        m16549O();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f14596h.f18742f);
        mo25665a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: v */
    public final void mo25724v() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzk.zzll().mo27831b()));
        hashMap.put("app_volume", String.valueOf(zzk.zzll().mo27828a()));
        hashMap.put("device_volume", String.valueOf(zzaya.m20374a(getContext())));
        mo25665a("volume", (Map<String, ?>) hashMap);
    }

    /* renamed from: w */
    public final zzadg mo25725w() {
        return this.f14581J;
    }

    /* renamed from: x */
    public final synchronized zzadx mo25726x() {
        return this.f14576E;
    }

    /* renamed from: y */
    public final int mo25727y() {
        return getMeasuredWidth();
    }

    /* renamed from: z */
    public final synchronized IObjectWrapper mo25728z() {
        return this.f14605q;
    }

    public final synchronized void zzlc() {
        if (this.f14597i != null) {
            this.f14597i.zzlc();
        }
    }

    public final synchronized void zzld() {
        if (this.f14597i != null) {
            this.f14597i.zzld();
        }
    }

    /* renamed from: c */
    public final void mo25679c(Context context) {
        this.f14594f.setBaseContext(context);
        this.f14586O.mo27874a(this.f14594f.mo28176b());
    }

    /* renamed from: d */
    public final synchronized void mo25683d(boolean z) {
        boolean z2 = z != this.f14610v;
        this.f14610v = z;
        m16550P();
        if (z2) {
            new zzaqb(this).mo27559c(z ? "expanded" : BuildConfig.APTOIDE_THEME);
        }
    }

    /* renamed from: f */
    public final void mo25688f(boolean z) {
        this.f14603o.mo28139b(z);
    }

    /* renamed from: a */
    public final void mo25665a(String str, Map<String, ?> map) {
        try {
            mo25666a(str, zzk.zzlg().mo27797a(map));
        } catch (JSONException unused) {
            zzbad.m20523d("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: c */
    public final synchronized void mo25680c(boolean z) {
        int i = this.f14578G + (z ? 1 : -1);
        this.f14578G = i;
        if (i <= 0 && this.f14604p != null) {
            this.f14604p.zztn();
        }
    }

    /* renamed from: b */
    public final void mo25675b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        m16567h(sb.toString());
    }

    /* renamed from: e */
    public final synchronized zzbhq mo25685e() {
        return this.f14573B;
    }

    /* renamed from: a */
    public final synchronized void mo25664a(String str, String str2, String str3) {
        if (!mo25689f()) {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17974v0)).booleanValue()) {
                str2 = zzbid.m21100a(str2, zzbid.m21099a());
            }
            super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
            return;
        }
        zzbad.m20523d("#004 The webview is destroyed. Ignoring action.");
    }

    /* renamed from: g */
    public final synchronized boolean mo25691g() {
        return this.f14610v;
    }

    /* renamed from: g */
    private final void m16566g(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? DiskLruCache.VERSION_1 : "0");
        mo25665a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }

    /* renamed from: d */
    public final synchronized zzbft mo25681d(String str) {
        if (this.f14591T == null) {
            return null;
        }
        return this.f14591T.get(str);
    }

    /* renamed from: h */
    public final zzadh mo25694h() {
        return this.f14583L;
    }

    /* renamed from: b */
    public final zzbai mo25672b() {
        return this.f14596h;
    }

    /* renamed from: b */
    public final synchronized void mo25673b(zzd zzd) {
        this.f14604p = zzd;
    }

    /* renamed from: b */
    public final synchronized void mo25676b(boolean z) {
        this.f14614z = z;
    }

    /* renamed from: b */
    public final void mo25677b(boolean z, int i) {
        this.f14603o.mo28134a(z, i);
    }

    @TargetApi(19)
    /* renamed from: a */
    private final synchronized void m16561a(String str, ValueCallback<String> valueCallback) {
        if (!mo25689f()) {
            evaluateJavascript(str, (ValueCallback<String>) null);
        } else {
            zzbad.m20523d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: b */
    public final void mo25674b(String str, zzaho<? super zzbgz> zzaho) {
        zzbha zzbha = this.f14603o;
        if (zzbha != null) {
            zzbha.mo28138b(str, zzaho);
        }
    }

    /* renamed from: a */
    public final void mo25660a(String str) {
        m16567h(str);
    }

    @VisibleForTesting
    /* renamed from: a */
    private final void m16560a(Boolean bool) {
        synchronized (this) {
            this.f14612x = bool;
        }
        zzk.zzlk().mo27733a(bool);
    }

    /* renamed from: a */
    public final void mo25666a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        zzbad.m20516a(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        m16567h(sb.toString());
    }

    /* renamed from: a */
    public final void mo25651a(int i) {
        if (i == 0) {
            zzadb.m19000a(this.f14583L.mo27178a(), this.f14581J, "aebb2");
        }
        m16549O();
        if (this.f14583L.mo27178a() != null) {
            this.f14583L.mo27178a().mo27184a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f14596h.f18742f);
        mo25665a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo25670a(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, z ? DiskLruCache.VERSION_1 : "0");
        hashMap.put("duration", Long.toString(j));
        mo25665a("onCacheAccessComplete", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final synchronized void mo25654a(IObjectWrapper iObjectWrapper) {
        this.f14605q = iObjectWrapper;
    }

    /* renamed from: a */
    public final synchronized void mo25653a(zzd zzd) {
        this.f14584M = zzd;
    }

    /* renamed from: a */
    public final synchronized void mo25658a(zzbin zzbin) {
        this.f14606r = zzbin;
        requestLayout();
    }

    /* renamed from: a */
    public final Activity mo25650a() {
        return this.f14594f.mo28176b();
    }

    /* renamed from: a */
    public final void mo25667a(boolean z) {
        this.f14603o.mo28141c(z);
    }

    /* renamed from: a */
    public final synchronized void mo25663a(String str, zzbft zzbft) {
        if (this.f14591T == null) {
            this.f14591T = new HashMap();
        }
        this.f14591T.put(str, zzbft);
    }

    /* renamed from: a */
    public final synchronized void mo25655a(zzadv zzadv) {
        this.f14577F = zzadv;
    }

    /* renamed from: a */
    public final synchronized void mo25656a(zzadx zzadx) {
        this.f14576E = zzadx;
    }

    /* renamed from: a */
    public final synchronized void mo25657a(zzbhq zzbhq) {
        if (this.f14573B != null) {
            zzbad.m20519b("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f14573B = zzbhq;
        }
    }

    /* renamed from: a */
    public final void mo25652a(zzc zzc) {
        this.f14603o.mo28127a(zzc);
    }

    /* renamed from: a */
    public final void mo25668a(boolean z, int i, String str) {
        this.f14603o.mo28135a(z, i, str);
    }

    /* renamed from: a */
    public final void mo25669a(boolean z, int i, String str, String str2) {
        this.f14603o.mo28136a(z, i, str, str2);
    }

    /* renamed from: a */
    public final void mo25659a(zzud zzud) {
        synchronized (this) {
            this.f14574C = zzud.f22775j;
        }
        m16566g(zzud.f22775j);
    }

    /* renamed from: a */
    public final void mo25662a(String str, zzaho<? super zzbgz> zzaho) {
        zzbha zzbha = this.f14603o;
        if (zzbha != null) {
            zzbha.mo28132a(str, zzaho);
        }
    }

    /* renamed from: a */
    public final void mo25661a(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        zzbha zzbha = this.f14603o;
        if (zzbha != null) {
            zzbha.mo28131a(str, predicate);
        }
    }

    /* renamed from: a */
    public final boolean mo25671a(boolean z, int i) {
        destroy();
        this.f14593V.mo29858a((zzwk) new C7353cb(z, i));
        this.f14593V.mo29859a(zzwl.zza.zzb.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    /* renamed from: a */
    static final /* synthetic */ void m16562a(boolean z, int i, zzxn zzxn) {
        zzwt.zzv.zza k = zzwt.zzv.m25608k();
        if (k.mo29887m() != z) {
            k.mo29886a(z);
        }
        k.mo29885a(i);
        zzxn.f22971h = (zzwt.zzv) ((zzdob) k.mo29143t());
    }
}
