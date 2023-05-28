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
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.internal.cache.DiskLruCache;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;

@VisibleForTesting
@zzard
/* renamed from: com.google.android.gms.internal.ads.ob */
final class C7800ob extends zzbjb implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzajq, zzbgz {

    /* renamed from: A */
    private boolean f16450A;

    /* renamed from: B */
    private boolean f16451B;

    /* renamed from: C */
    private zzadx f16452C;

    /* renamed from: D */
    private zzadv f16453D;

    /* renamed from: E */
    private int f16454E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f16455F;

    /* renamed from: G */
    private zzadg f16456G;

    /* renamed from: H */
    private zzadg f16457H;

    /* renamed from: I */
    private zzadg f16458I;

    /* renamed from: J */
    private zzadh f16459J;

    /* renamed from: K */
    private zzd f16460K;

    /* renamed from: L */
    private zzazs f16461L;

    /* renamed from: M */
    private final AtomicReference<IObjectWrapper> f16462M = new AtomicReference<>();

    /* renamed from: N */
    private int f16463N = -1;

    /* renamed from: O */
    private int f16464O = -1;

    /* renamed from: P */
    private int f16465P = -1;

    /* renamed from: Q */
    private int f16466Q = -1;

    /* renamed from: R */
    private Map<String, zzbft> f16467R;

    /* renamed from: S */
    private final WindowManager f16468S;

    /* renamed from: i */
    private final zzbim f16469i;

    /* renamed from: j */
    private final zzbio f16470j;

    /* renamed from: k */
    private final zzdh f16471k;

    /* renamed from: l */
    private final zzbai f16472l;

    /* renamed from: m */
    private final zzj f16473m;

    /* renamed from: n */
    private final zza f16474n;

    /* renamed from: o */
    private final DisplayMetrics f16475o;

    /* renamed from: p */
    private final zzwj f16476p;

    /* renamed from: q */
    private zzd f16477q;

    /* renamed from: r */
    private zzbin f16478r;

    /* renamed from: s */
    private String f16479s;

    /* renamed from: t */
    private boolean f16480t;

    /* renamed from: u */
    private boolean f16481u;

    /* renamed from: v */
    private boolean f16482v;

    /* renamed from: w */
    private int f16483w;

    /* renamed from: x */
    private boolean f16484x = true;

    /* renamed from: y */
    private String f16485y = "";

    /* renamed from: z */
    private zzbhq f16486z;

    @VisibleForTesting
    protected C7800ob(zzbim zzbim, zzbio zzbio, zzbin zzbin, String str, boolean z, boolean z2, zzdh zzdh, zzbai zzbai, zzadi zzadi, zzj zzj, zza zza, zzwj zzwj) {
        super(zzbim, zzbio);
        this.f16469i = zzbim;
        this.f16470j = zzbio;
        this.f16478r = zzbin;
        this.f16479s = str;
        this.f16481u = z;
        this.f16483w = -1;
        this.f16471k = zzdh;
        this.f16472l = zzbai;
        this.f16473m = zzj;
        this.f16474n = zza;
        this.f16468S = (WindowManager) getContext().getSystemService("window");
        zzk.zzlg();
        this.f16475o = zzaxi.m20264a(this.f16468S);
        this.f16476p = zzwj;
        this.f16461L = new zzazs(this.f16469i.mo28176b(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        zzk.zzlg().mo27798a((Context) zzbim, zzbai.f18742f, getSettings());
        setDownloadListener(this);
        m17740P();
        if (PlatformVersion.m16288d()) {
            addJavascriptInterface(zzbht.m21074a((zzbgz) this), "googleAdsJsInterface");
        }
        m17744T();
        zzadh zzadh = new zzadh(new zzadi(true, "make_wv", this.f16479s));
        this.f16459J = zzadh;
        zzadh.mo27178a().mo27183a(zzadi);
        zzadg a = zzadb.m18999a(this.f16459J.mo27178a());
        this.f16457H = a;
        this.f16459J.mo27179a("native:view_create", a);
        this.f16458I = null;
        this.f16456G = null;
        zzk.zzli().mo27824b((Context) zzbim);
    }

    /* renamed from: N */
    private final boolean m17738N() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f16470j.mo28144f() && !this.f16470j.mo28197j()) {
            return false;
        }
        zzyt.m25666a();
        DisplayMetrics displayMetrics = this.f16475o;
        int b = zzazt.m20476b(displayMetrics, displayMetrics.widthPixels);
        zzyt.m25666a();
        DisplayMetrics displayMetrics2 = this.f16475o;
        int b2 = zzazt.m20476b(displayMetrics2, displayMetrics2.heightPixels);
        Activity b3 = this.f16469i.mo28176b();
        if (b3 == null || b3.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            zzk.zzlg();
            int[] c = zzaxi.m20293c(b3);
            zzyt.m25666a();
            int b4 = zzazt.m20476b(this.f16475o, c[0]);
            zzyt.m25666a();
            i = zzazt.m20476b(this.f16475o, c[1]);
            i2 = b4;
        }
        if (this.f16464O == b && this.f16463N == b2 && this.f16465P == i2 && this.f16466Q == i) {
            return false;
        }
        if (!(this.f16464O == b && this.f16463N == b2)) {
            z = true;
        }
        this.f16464O = b;
        this.f16463N = b2;
        this.f16465P = i2;
        this.f16466Q = i;
        new zzaqb(this).mo27555a(b, b2, i2, i, this.f16475o.density, this.f16468S.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: O */
    private final void m17739O() {
        zzadb.m19000a(this.f16459J.mo27178a(), this.f16457H, "aeh2");
    }

    /* renamed from: P */
    private final synchronized void m17740P() {
        if (!this.f16481u) {
            if (!this.f16478r.mo28181b()) {
                if (Build.VERSION.SDK_INT < 18) {
                    zzbad.m20516a("Disabling hardware acceleration on an AdView.");
                    m17741Q();
                    return;
                }
                zzbad.m20516a("Enabling hardware acceleration on an AdView.");
                m17742R();
                return;
            }
        }
        zzbad.m20516a("Enabling hardware acceleration on an overlay.");
        m17742R();
    }

    /* renamed from: Q */
    private final synchronized void m17741Q() {
        if (!this.f16482v) {
            zzk.zzli();
            setLayerType(1, (Paint) null);
        }
        this.f16482v = true;
    }

    /* renamed from: R */
    private final synchronized void m17742R() {
        if (this.f16482v) {
            zzk.zzli();
            setLayerType(0, (Paint) null);
        }
        this.f16482v = false;
    }

    /* renamed from: S */
    private final synchronized void m17743S() {
        if (this.f16467R != null) {
            for (zzbft a : this.f16467R.values()) {
                a.mo24917a();
            }
        }
        this.f16467R = null;
    }

    /* renamed from: T */
    private final void m17744T() {
        zzadi a;
        zzadh zzadh = this.f16459J;
        if (zzadh != null && (a = zzadh.mo27178a()) != null && zzk.zzlk().mo27737c() != null) {
            zzk.zzlk().mo27737c().mo27174a(a);
        }
    }

    /* renamed from: A */
    public final void mo25639A() {
        if (this.f16456G == null) {
            zzadb.m19000a(this.f16459J.mo27178a(), this.f16457H, "aes2");
            zzadg a = zzadb.m18999a(this.f16459J.mo27178a());
            this.f16456G = a;
            this.f16459J.mo27179a("native:view_show", a);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f16472l.f18742f);
        zzajr.m19305a((zzajq) this, "onshow", (Map) hashMap);
    }

    /* renamed from: B */
    public final Context mo25640B() {
        return this.f16469i.mo28175a();
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
        return this.f16477q;
    }

    /* renamed from: G */
    public final void mo25645G() {
        zzawz.m20167e("Cannot add text view to inner AdWebView");
    }

    /* renamed from: H */
    public final void mo25646H() {
    }

    /* renamed from: I */
    public final boolean mo25647I() {
        return false;
    }

    /* renamed from: K */
    public final synchronized zzd mo25648K() {
        return this.f16460K;
    }

    /* renamed from: L */
    public final synchronized boolean mo25649L() {
        return this.f16484x;
    }

    /* renamed from: a */
    public final void mo26359a(String str, String str2) {
        zzajr.m19304a((zzajq) this, str, str2);
    }

    /* renamed from: a */
    public final synchronized void mo25664a(String str, String str2, String str3) {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17974v0)).booleanValue()) {
            str2 = zzbid.m21100a(str2, zzbid.m21099a());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    /* renamed from: a */
    public final void mo25665a(String str, Map map) {
        zzajr.m19305a((zzajq) this, str, map);
    }

    /* renamed from: a */
    public final void mo25666a(String str, JSONObject jSONObject) {
        zzajr.m19307b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final zzbai mo25672b() {
        return this.f16472l;
    }

    /* renamed from: b */
    public final void mo25675b(String str, JSONObject jSONObject) {
        zzajr.m19306a((zzajq) this, str, jSONObject);
    }

    /* renamed from: c */
    public final zza mo25678c() {
        return this.f16474n;
    }

    /* renamed from: d */
    public final zzdh mo25682d() {
        return this.f16471k;
    }

    /* renamed from: e */
    public final synchronized void mo25686e(boolean z) {
        if (this.f16477q != null) {
            this.f16477q.zza(this.f16470j.mo28144f(), z);
        } else {
            this.f16480t = z;
        }
    }

    /* renamed from: f */
    public final void mo25688f(boolean z) {
        this.f16470j.mo28193b(z);
    }

    /* renamed from: g */
    public final synchronized boolean mo25691g() {
        return this.f16481u;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    /* renamed from: h */
    public final zzadh mo25694h() {
        return this.f16459J;
    }

    /* renamed from: i */
    public final synchronized zzbin mo25695i() {
        return this.f16478r;
    }

    /* renamed from: j */
    public final synchronized String mo25696j() {
        return this.f16485y;
    }

    /* renamed from: k */
    public final /* synthetic */ zzbii mo25697k() {
        return this.f16470j;
    }

    /* renamed from: l */
    public final synchronized boolean mo25698l() {
        return this.f16454E > 0;
    }

    /* renamed from: m */
    public final synchronized String mo25702m() {
        return this.f16479s;
    }

    /* renamed from: o */
    public final synchronized void mo25703o() {
        if (this.f16453D != null) {
            this.f16453D.mo27202R0();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo28215f()) {
            this.f16461L.mo27873a();
        }
        boolean z = this.f16450A;
        if (this.f16470j != null && this.f16470j.mo28197j()) {
            if (!this.f16451B) {
                this.f16470j.mo28198k();
                this.f16470j.mo28199l();
                this.f16451B = true;
            }
            m17738N();
            z = true;
        }
        m17748h(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!mo28215f()) {
                this.f16461L.mo27875b();
            }
            super.onDetachedFromWindow();
            if (this.f16451B && this.f16470j != null && this.f16470j.mo28197j() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f16470j.mo28198k();
                this.f16470j.mo28199l();
                this.f16451B = false;
            }
        }
        m17748h(false);
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
        if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
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
        boolean N = m17738N();
        zzd F = mo25644F();
        if (F != null && N) {
            F.zztk();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01d8 A[SYNTHETIC, Splitter:B:109:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0141  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x00de=Splitter:B:64:0x00de, B:116:0x01ee=Splitter:B:116:0x01ee} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.mo28215f()     // Catch:{ all -> 0x01f3 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ee
            boolean r0 = r7.f16481u     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x01ee
            com.google.android.gms.internal.ads.zzbin r0 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo28182c()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01ee
        L_0x0021:
            com.google.android.gms.internal.ads.zzbin r0 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo28184e()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.zzbin r0 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo28183d()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f17807I1     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r1.mo27163a(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.zzbhq r0 = r7.mo25685e()     // Catch:{ all -> 0x01f3 }
            r1 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.mo26938t()     // Catch:{ all -> 0x01f3 }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0063
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x0063:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
            float r1 = (float) r9     // Catch:{ all -> 0x01f3 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01f3 }
            float r2 = (float) r8     // Catch:{ all -> 0x01f3 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01f3 }
            if (r9 != 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            float r9 = (float) r2     // Catch:{ all -> 0x01f3 }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01f3 }
            r9 = r2
            goto L_0x0084
        L_0x007c:
            if (r8 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0084
            float r8 = (float) r1     // Catch:{ all -> 0x01f3 }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01f3 }
            r8 = r1
        L_0x0084:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01f3 }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x0091:
            com.google.android.gms.internal.ads.zzbin r0 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo28180a()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x00e3
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f17815K1     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r0 = r1.mo27163a(r0)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00de
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.m16288d()     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00de
        L_0x00b2:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.qb r1 = new com.google.android.gms.internal.ads.qb     // Catch:{ all -> 0x01f3 }
            r1.<init>(r7)     // Catch:{ all -> 0x01f3 }
            r7.mo25662a((java.lang.String) r0, (com.google.android.gms.internal.ads.zzaho<? super com.google.android.gms.internal.ads.zzbgz>) r1)     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.mo25660a((java.lang.String) r0)     // Catch:{ all -> 0x01f3 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r0 = r7.f16455F     // Catch:{ all -> 0x01f3 }
            r1 = -1
            if (r0 == r1) goto L_0x00d5
            int r9 = r7.f16455F     // Catch:{ all -> 0x01f3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r0 = r7.f16475o     // Catch:{ all -> 0x01f3 }
            float r0 = r0.density     // Catch:{ all -> 0x01f3 }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01f3 }
            goto L_0x00d9
        L_0x00d5:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
        L_0x00d9:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00de:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00e3:
            com.google.android.gms.internal.ads.zzbin r0 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            boolean r0 = r0.mo28181b()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x00f8
            android.util.DisplayMetrics r8 = r7.f16475o     // Catch:{ all -> 0x01f3 }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r9 = r7.f16475o     // Catch:{ all -> 0x01f3 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x00f8:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01f3 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01f3 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01f3 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01f3 }
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
            com.google.android.gms.internal.ads.zzbin r2 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f19021c     // Catch:{ all -> 0x01f3 }
            r3 = 1
            if (r2 > r0) goto L_0x012e
            com.google.android.gms.internal.ads.zzbin r2 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f19020b     // Catch:{ all -> 0x01f3 }
            if (r2 <= r5) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            r2 = 0
            goto L_0x012f
        L_0x012e:
            r2 = 1
        L_0x012f:
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.zzacu.f17780B2     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzacr r6 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x01f3 }
            java.lang.Object r4 = r6.mo27163a(r4)     // Catch:{ all -> 0x01f3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01f3 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01f3 }
            if (r4 == 0) goto L_0x016e
            com.google.android.gms.internal.ads.zzbin r4 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            int r4 = r4.f19021c     // Catch:{ all -> 0x01f3 }
            float r4 = (float) r4     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r6 = r7.f16475o     // Catch:{ all -> 0x01f3 }
            float r6 = r6.density     // Catch:{ all -> 0x01f3 }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r6 = r7.f16475o     // Catch:{ all -> 0x01f3 }
            float r6 = r6.density     // Catch:{ all -> 0x01f3 }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            com.google.android.gms.internal.ads.zzbin r0 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            int r0 = r0.f19020b     // Catch:{ all -> 0x01f3 }
            float r0 = (float) r0     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.f16475o     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r5 = r7.f16475o     // Catch:{ all -> 0x01f3 }
            float r5 = r5.density     // Catch:{ all -> 0x01f3 }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x016a
            goto L_0x016b
        L_0x016a:
            r3 = 0
        L_0x016b:
            if (r2 == 0) goto L_0x016e
            r2 = r3
        L_0x016e:
            r0 = 8
            if (r2 == 0) goto L_0x01d8
            com.google.android.gms.internal.ads.zzbin r2 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            int r2 = r2.f19021c     // Catch:{ all -> 0x01f3 }
            float r2 = (float) r2     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r3 = r7.f16475o     // Catch:{ all -> 0x01f3 }
            float r3 = r3.density     // Catch:{ all -> 0x01f3 }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzbin r3 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            int r3 = r3.f19020b     // Catch:{ all -> 0x01f3 }
            float r3 = (float) r3     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.f16475o     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01f3 }
            float r8 = (float) r8     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.f16475o     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01f3 }
            float r9 = (float) r9     // Catch:{ all -> 0x01f3 }
            android.util.DisplayMetrics r4 = r7.f16475o     // Catch:{ all -> 0x01f3 }
            float r4 = r4.density     // Catch:{ all -> 0x01f3 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01f3 }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f3 }
            r5.<init>(r4)     // Catch:{ all -> 0x01f3 }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01f3 }
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            r5.append(r3)     // Catch:{ all -> 0x01f3 }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01f3 }
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            r5.append(r9)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01f3 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzbad.m20523d(r8)     // Catch:{ all -> 0x01f3 }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01f3 }
            if (r8 == r0) goto L_0x01d3
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01f3 }
        L_0x01d3:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01d8:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01f3 }
            if (r8 == r0) goto L_0x01e1
            r7.setVisibility(r1)     // Catch:{ all -> 0x01f3 }
        L_0x01e1:
            com.google.android.gms.internal.ads.zzbin r8 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            int r8 = r8.f19021c     // Catch:{ all -> 0x01f3 }
            com.google.android.gms.internal.ads.zzbin r9 = r7.f16478r     // Catch:{ all -> 0x01f3 }
            int r9 = r9.f19020b     // Catch:{ all -> 0x01f3 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01ee:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r7)
            return
        L_0x01f3:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7800ob.onMeasure(int, int):void");
    }

    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            zzbad.m20520b("Could not pause webview.", e);
        }
    }

    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            zzbad.m20520b("Could not resume webview.", e);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f16470j.mo28197j()) {
            synchronized (this) {
                if (this.f16452C != null) {
                    this.f16452C.mo25734a(motionEvent);
                }
            }
        } else {
            zzdh zzdh = this.f16471k;
            if (zzdh != null) {
                zzdh.mo29016a(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final WebViewClient mo25714p() {
        return this.f16470j;
    }

    /* renamed from: q */
    public final void mo25715q() {
        this.f16461L.mo27876c();
    }

    /* renamed from: r */
    public final synchronized boolean mo25716r() {
        return this.f16480t;
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
        this.f16483w = i;
        if (this.f16477q != null) {
            this.f16477q.setRequestedOrientation(i);
        }
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzbad.m20520b("Could not stop loading webview.", e);
        }
    }

    /* renamed from: t */
    public final void mo25722t() {
        if (this.f16458I == null) {
            zzadg a = zzadb.m18999a(this.f16459J.mo27178a());
            this.f16458I = a;
            this.f16459J.mo27179a("native:view_load", a);
        }
    }

    /* renamed from: u */
    public final void mo25723u() {
        m17739O();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f16472l.f18742f);
        zzajr.m19305a((zzajq) this, "onhide", (Map) hashMap);
    }

    /* renamed from: v */
    public final void mo25724v() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(zzk.zzll().mo27831b()));
        hashMap.put("app_volume", String.valueOf(zzk.zzll().mo27828a()));
        hashMap.put("device_volume", String.valueOf(zzaya.m20374a(getContext())));
        zzajr.m19305a((zzajq) this, "volume", (Map) hashMap);
    }

    /* renamed from: w */
    public final zzadg mo25725w() {
        return this.f16457H;
    }

    /* renamed from: x */
    public final synchronized zzadx mo25726x() {
        return this.f16452C;
    }

    /* renamed from: y */
    public final int mo25727y() {
        return getMeasuredWidth();
    }

    /* renamed from: z */
    public final IObjectWrapper mo25728z() {
        return this.f16462M.get();
    }

    public final synchronized void zzlc() {
        if (this.f16473m != null) {
            this.f16473m.zzlc();
        }
    }

    public final synchronized void zzld() {
        if (this.f16473m != null) {
            this.f16473m.zzld();
        }
    }

    /* renamed from: h */
    private final void m17748h(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? DiskLruCache.VERSION_1 : "0");
        zzajr.m19305a((zzajq) this, "onAdVisibilityChanged", (Map) hashMap);
    }

    /* renamed from: b */
    public final synchronized void mo25673b(zzd zzd) {
        this.f16477q = zzd;
    }

    /* renamed from: c */
    public final void mo25679c(Context context) {
        this.f16469i.setBaseContext(context);
        this.f16461L.mo27874a(this.f16469i.mo28176b());
    }

    /* renamed from: d */
    public final synchronized void mo25683d(boolean z) {
        boolean z2 = z != this.f16481u;
        this.f16481u = z;
        m17740P();
        if (z2) {
            new zzaqb(this).mo27559c(z ? "expanded" : BuildConfig.APTOIDE_THEME);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final synchronized void mo26360g(boolean z) {
        if (!z) {
            m17744T();
            this.f16461L.mo27877d();
            if (this.f16477q != null) {
                this.f16477q.close();
                this.f16477q.onDestroy();
                this.f16477q = null;
            }
        }
        this.f16462M.set((Object) null);
        this.f16470j.mo28196i();
        zzk.zzmc();
        zzbfs.m20813a((zzbdf) this);
        m17743S();
    }

    /* renamed from: b */
    public final synchronized void mo25676b(boolean z) {
        this.f16484x = z;
    }

    /* renamed from: c */
    public final synchronized void mo25680c(boolean z) {
        int i = this.f16454E + (z ? 1 : -1);
        this.f16454E = i;
        if (i <= 0 && this.f16477q != null) {
            this.f16477q.zztn();
        }
    }

    /* renamed from: e */
    public final synchronized zzbhq mo25685e() {
        return this.f16486z;
    }

    /* renamed from: b */
    public final void mo25677b(boolean z, int i) {
        this.f16470j.mo28189a(z, i);
    }

    /* renamed from: a */
    public final synchronized void mo25660a(String str) {
        if (!mo28215f()) {
            super.mo25660a(str);
        } else {
            zzbad.m20523d("The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: b */
    public final void mo25674b(String str, zzaho<? super zzbgz> zzaho) {
        zzbio zzbio = this.f16470j;
        if (zzbio != null) {
            zzbio.mo28192b(str, zzaho);
        }
    }

    /* renamed from: d */
    public final synchronized zzbft mo25681d(String str) {
        if (this.f16467R == null) {
            return null;
        }
        return this.f16467R.get(str);
    }

    /* renamed from: a */
    public final void mo25651a(int i) {
        if (i == 0) {
            zzadb.m19000a(this.f16459J.mo27178a(), this.f16457H, "aebb2");
        }
        m17739O();
        if (this.f16459J.mo27178a() != null) {
            this.f16459J.mo27178a().mo27184a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f16472l.f18742f);
        zzajr.m19305a((zzajq) this, "onhide", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo25670a(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION, z ? DiskLruCache.VERSION_1 : "0");
        hashMap.put("duration", Long.toString(j));
        zzajr.m19305a((zzajq) this, "onCacheAccessComplete", (Map) hashMap);
    }

    /* renamed from: a */
    public final void mo25654a(IObjectWrapper iObjectWrapper) {
        this.f16462M.set(iObjectWrapper);
    }

    /* renamed from: a */
    public final synchronized void mo25653a(zzd zzd) {
        this.f16460K = zzd;
    }

    /* renamed from: a */
    public final synchronized void mo25658a(zzbin zzbin) {
        this.f16478r = zzbin;
        requestLayout();
    }

    /* renamed from: a */
    public final Activity mo25650a() {
        return this.f16469i.mo28176b();
    }

    /* renamed from: a */
    public final void mo25667a(boolean z) {
        this.f16470j.mo28194c(z);
    }

    /* renamed from: a */
    public final synchronized void mo25663a(String str, zzbft zzbft) {
        if (this.f16467R == null) {
            this.f16467R = new HashMap();
        }
        this.f16467R.put(str, zzbft);
    }

    /* renamed from: a */
    public final synchronized void mo25656a(zzadx zzadx) {
        this.f16452C = zzadx;
    }

    /* renamed from: a */
    public final synchronized void mo25655a(zzadv zzadv) {
        this.f16453D = zzadv;
    }

    /* renamed from: a */
    public final synchronized void mo25657a(zzbhq zzbhq) {
        if (this.f16486z != null) {
            zzbad.m20519b("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f16486z = zzbhq;
        }
    }

    /* renamed from: a */
    public final void mo25652a(zzc zzc) {
        this.f16470j.mo28185a(zzc);
    }

    /* renamed from: a */
    public final void mo25668a(boolean z, int i, String str) {
        this.f16470j.mo28190a(z, i, str);
    }

    /* renamed from: a */
    public final void mo25669a(boolean z, int i, String str, String str2) {
        this.f16470j.mo28191a(z, i, str, str2);
    }

    /* renamed from: a */
    public final void mo25659a(zzud zzud) {
        synchronized (this) {
            this.f16450A = zzud.f22775j;
        }
        m17748h(zzud.f22775j);
    }

    /* renamed from: a */
    public final void mo25662a(String str, zzaho<? super zzbgz> zzaho) {
        zzbio zzbio = this.f16470j;
        if (zzbio != null) {
            zzbio.mo28188a(str, zzaho);
        }
    }

    /* renamed from: a */
    public final void mo25661a(String str, Predicate<zzaho<? super zzbgz>> predicate) {
        zzbio zzbio = this.f16470j;
        if (zzbio != null) {
            zzbio.mo28187a(str, predicate);
        }
    }

    /* renamed from: a */
    public final boolean mo25671a(boolean z, int i) {
        destroy();
        this.f16476p.mo29858a((zzwk) new C7837pb(z, i));
        this.f16476p.mo29859a(zzwl.zza.zzb.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    /* renamed from: a */
    static final /* synthetic */ void m17747a(boolean z, int i, zzxn zzxn) {
        zzwt.zzv.zza k = zzwt.zzv.m25608k();
        if (k.mo29887m() != z) {
            k.mo29886a(z);
        }
        k.mo29885a(i);
        zzxn.f22971h = (zzwt.zzv) ((zzdob) k.mo29143t());
    }
}
