package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class zzbzj extends zzaen implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcab {

    /* renamed from: o */
    public static final String[] f19774o = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};

    /* renamed from: f */
    private final String f19775f;

    /* renamed from: g */
    private Map<String, WeakReference<View>> f19776g = new HashMap();

    /* renamed from: h */
    private FrameLayout f19777h;

    /* renamed from: i */
    private FrameLayout f19778i;

    /* renamed from: j */
    private zzbbl f19779j;

    /* renamed from: k */
    private View f19780k;

    /* renamed from: l */
    private zzbyn f19781l;

    /* renamed from: m */
    private zzua f19782m;

    /* renamed from: n */
    private boolean f19783n = false;

    public zzbzj(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        this.f19777h = frameLayout;
        this.f19778i = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = NativeAppInstallAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f19775f = str;
        zzk.zzmd();
        zzbbz.m20571a((View) frameLayout, (ViewTreeObserver.OnGlobalLayoutListener) this);
        zzk.zzmd();
        zzbbz.m20572a((View) frameLayout, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f19779j = zzbbm.f18750c;
        this.f19782m = new zzua(this.f19777h.getContext(), this.f19777h);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    /* renamed from: q1 */
    private final synchronized void m22209q1() {
        this.f19779j.execute(new C8174yf(this));
    }

    /* renamed from: F0 */
    public final synchronized Map<String, WeakReference<View>> mo28581F0() {
        return this.f19776g;
    }

    /* renamed from: K0 */
    public final synchronized Map<String, WeakReference<View>> mo28582K0() {
        return null;
    }

    /* renamed from: U0 */
    public final synchronized String mo28583U0() {
        return this.f19775f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo28584a(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r4 = r1.f19783n     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f19776g     // Catch:{ all -> 0x0039 }
            r3.remove(r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r1)
            return
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f19776g     // Catch:{ all -> 0x0039 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0039 }
            r0.<init>(r3)     // Catch:{ all -> 0x0039 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0039 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0039 }
            if (r4 != 0) goto L_0x0037
            java.lang.String r4 = "3011"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x002b
            goto L_0x0037
        L_0x002b:
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0039 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0039 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0039 }
            monitor-exit(r1)
            return
        L_0x0037:
            monitor-exit(r1)
            return
        L_0x0039:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzj.mo28584a(java.lang.String, android.view.View, boolean):void");
    }

    /* renamed from: b */
    public final synchronized void mo27102b(String str, IObjectWrapper iObjectWrapper) {
        mo28584a(str, (View) ObjectWrapper.m16390H(iObjectWrapper), true);
    }

    /* renamed from: c */
    public final synchronized void mo27103c(IObjectWrapper iObjectWrapper) {
        if (!this.f19783n) {
            Object H = ObjectWrapper.m16390H(iObjectWrapper);
            if (!(H instanceof zzbyn)) {
                zzbad.m20523d("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            if (this.f19781l != null) {
                this.f19781l.mo28507b((zzcab) this);
            }
            m22209q1();
            zzbyn zzbyn = (zzbyn) H;
            this.f19781l = zzbyn;
            zzbyn.mo28502a((zzcab) this);
            this.f19781l.mo28506b((View) this.f19777h);
        }
    }

    /* renamed from: d */
    public final synchronized void mo27104d(IObjectWrapper iObjectWrapper) {
        this.f19781l.mo28495a((View) ObjectWrapper.m16390H(iObjectWrapper));
    }

    public final synchronized void destroy() {
        if (!this.f19783n) {
            if (this.f19781l != null) {
                this.f19781l.mo28507b((zzcab) this);
                this.f19781l = null;
            }
            this.f19776g.clear();
            this.f19777h.removeAllViews();
            this.f19778i.removeAllViews();
            this.f19776g = null;
            this.f19777h = null;
            this.f19778i = null;
            this.f19780k = null;
            this.f19782m = null;
            this.f19783n = true;
        }
    }

    /* renamed from: h0 */
    public final /* synthetic */ View mo28585h0() {
        return this.f19777h;
    }

    /* renamed from: l */
    public final synchronized IObjectWrapper mo27106l(String str) {
        return ObjectWrapper.m16391a(mo28586m(str));
    }

    /* renamed from: m */
    public final synchronized View mo28586m(String str) {
        if (this.f19783n) {
            return null;
        }
        WeakReference weakReference = this.f19776g.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* renamed from: m0 */
    public final FrameLayout mo28587m0() {
        return this.f19778i;
    }

    public final synchronized void onClick(View view) {
        if (this.f19781l != null) {
            this.f19781l.mo28509f();
            this.f19781l.mo28497a(view, this.f19777h, mo28581F0(), mo28593u0(), false);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.f19781l != null) {
            this.f19781l.mo28498a(this.f19777h, mo28581F0(), mo28593u0(), zzbyn.m22064c((View) this.f19777h));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.f19781l != null) {
            this.f19781l.mo28498a(this.f19777h, mo28581F0(), mo28593u0(), zzbyn.m22064c((View) this.f19777h));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f19781l != null) {
            this.f19781l.mo28496a(view, motionEvent, this.f19777h);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public final /* synthetic */ void mo28598p1() {
        if (this.f19780k == null) {
            View view = new View(this.f19777h.getContext());
            this.f19780k = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f19777h != this.f19780k.getParent()) {
            this.f19777h.addView(this.f19780k);
        }
    }

    /* renamed from: q0 */
    public final zzua mo28592q0() {
        return this.f19782m;
    }

    /* renamed from: u0 */
    public final synchronized Map<String, WeakReference<View>> mo28593u0() {
        return this.f19776g;
    }

    /* renamed from: a */
    public final synchronized void mo27101a(IObjectWrapper iObjectWrapper, int i) {
    }
}
