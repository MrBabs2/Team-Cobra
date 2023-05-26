package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@zzard
public final class zzbzi extends zzaes implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcab {

    /* renamed from: f */
    private final WeakReference<View> f19768f;

    /* renamed from: g */
    private final Map<String, WeakReference<View>> f19769g = new HashMap();

    /* renamed from: h */
    private final Map<String, WeakReference<View>> f19770h = new HashMap();

    /* renamed from: i */
    private final Map<String, WeakReference<View>> f19771i = new HashMap();

    /* renamed from: j */
    private zzbyn f19772j;

    /* renamed from: k */
    private zzua f19773k;

    public zzbzi(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzk.zzmd();
        zzbbz.m20571a(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        zzk.zzmd();
        zzbbz.m20572a(view, (ViewTreeObserver.OnScrollChangedListener) this);
        this.f19768f = new WeakReference<>(view);
        for (Map.Entry next : hashMap.entrySet()) {
            String str = (String) next.getKey();
            View view2 = (View) next.getValue();
            if (view2 != null) {
                this.f19769g.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f19771i.putAll(this.f19769g);
        for (Map.Entry next2 : hashMap2.entrySet()) {
            View view3 = (View) next2.getValue();
            if (view3 != null) {
                this.f19770h.put((String) next2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.f19771i.putAll(this.f19770h);
        this.f19773k = new zzua(view.getContext(), view);
    }

    /* renamed from: F0 */
    public final synchronized Map<String, WeakReference<View>> mo28581F0() {
        return this.f19771i;
    }

    /* renamed from: K0 */
    public final synchronized Map<String, WeakReference<View>> mo28582K0() {
        return this.f19770h;
    }

    /* renamed from: T0 */
    public final synchronized void mo27107T0() {
        if (this.f19772j != null) {
            this.f19772j.mo28507b((zzcab) this);
            this.f19772j = null;
        }
    }

    /* renamed from: U0 */
    public final synchronized String mo28583U0() {
        return NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo28584a(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto L_0x0014
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f19771i     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f19769g     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r3 = r1.f19770h     // Catch:{ all -> 0x0047 }
            r3.remove(r2)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x0014:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f19771i     // Catch:{ all -> 0x0047 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0047 }
            r0.<init>(r3)     // Catch:{ all -> 0x0047 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r4 != 0) goto L_0x0045
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r4 == 0) goto L_0x002f
            goto L_0x0045
        L_0x002f:
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4 = r1.f19769g     // Catch:{ all -> 0x0047 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0047 }
            r0.<init>(r3)     // Catch:{ all -> 0x0047 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0047 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0047 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0047 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            return
        L_0x0045:
            monitor-exit(r1)
            return
        L_0x0047:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzi.mo28584a(java.lang.String, android.view.View, boolean):void");
    }

    /* renamed from: c */
    public final synchronized void mo27108c(IObjectWrapper iObjectWrapper) {
        Object H = ObjectWrapper.m16390H(iObjectWrapper);
        if (!(H instanceof zzbyn)) {
            zzbad.m20523d("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.f19772j != null) {
            this.f19772j.mo28507b((zzcab) this);
        }
        if (((zzbyn) H).mo28512i()) {
            zzbyn zzbyn = (zzbyn) H;
            this.f19772j = zzbyn;
            zzbyn.mo28502a((zzcab) this);
            this.f19772j.mo28506b(mo28585h0());
            return;
        }
        zzbad.m20519b("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    /* renamed from: d */
    public final synchronized void mo27109d(IObjectWrapper iObjectWrapper) {
        if (this.f19772j != null) {
            Object H = ObjectWrapper.m16390H(iObjectWrapper);
            if (!(H instanceof View)) {
                zzbad.m20523d("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f19772j.mo28495a((View) H);
        }
    }

    /* renamed from: h0 */
    public final View mo28585h0() {
        return (View) this.f19768f.get();
    }

    /* renamed from: m */
    public final synchronized View mo28586m(String str) {
        WeakReference weakReference = this.f19771i.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* renamed from: m0 */
    public final FrameLayout mo28587m0() {
        return null;
    }

    public final synchronized void onClick(View view) {
        if (this.f19772j != null) {
            this.f19772j.mo28497a(view, mo28585h0(), mo28581F0(), mo28593u0(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        if (this.f19772j != null) {
            this.f19772j.mo28498a(mo28585h0(), mo28581F0(), mo28593u0(), zzbyn.m22064c(mo28585h0()));
        }
    }

    public final synchronized void onScrollChanged() {
        if (this.f19772j != null) {
            this.f19772j.mo28498a(mo28585h0(), mo28581F0(), mo28593u0(), zzbyn.m22064c(mo28585h0()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f19772j != null) {
            this.f19772j.mo28496a(view, motionEvent, mo28585h0());
        }
        return false;
    }

    /* renamed from: q0 */
    public final zzua mo28592q0() {
        return this.f19773k;
    }

    /* renamed from: u0 */
    public final synchronized Map<String, WeakReference<View>> mo28593u0() {
        return this.f19769g;
    }
}
