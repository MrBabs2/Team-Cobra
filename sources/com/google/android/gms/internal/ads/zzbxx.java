package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.root.execution.Command;

public final class zzbxx implements zzbzb {

    /* renamed from: a */
    private final Context f19620a;

    /* renamed from: b */
    private final zzbzc f19621b;

    /* renamed from: c */
    private final JSONObject f19622c;

    /* renamed from: d */
    private final zzccj f19623d;

    /* renamed from: e */
    private final zzbyt f19624e;

    /* renamed from: f */
    private final zzdh f19625f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzbrt f19626g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final zzbri f19627h;

    /* renamed from: i */
    private final zzcxm f19628i;

    /* renamed from: j */
    private final zzbai f19629j;

    /* renamed from: k */
    private final zzcxv f19630k;

    /* renamed from: l */
    private final zzbmn f19631l;

    /* renamed from: m */
    private final zzbzq f19632m;

    /* renamed from: n */
    private final Clock f19633n;

    /* renamed from: o */
    private final zzbva f19634o;

    /* renamed from: p */
    private final zzdae f19635p;

    /* renamed from: q */
    private boolean f19636q = false;

    /* renamed from: r */
    private boolean f19637r;

    /* renamed from: s */
    private boolean f19638s = false;

    /* renamed from: t */
    private boolean f19639t = false;

    /* renamed from: u */
    private Point f19640u = new Point();

    /* renamed from: v */
    private Point f19641v = new Point();

    /* renamed from: w */
    private long f19642w = 0;

    /* renamed from: x */
    private long f19643x = 0;

    /* renamed from: y */
    private zzaag f19644y;

    public zzbxx(Context context, zzbzc zzbzc, JSONObject jSONObject, zzccj zzccj, zzbyt zzbyt, zzdh zzdh, zzbrt zzbrt, zzbri zzbri, zzcxm zzcxm, zzbai zzbai, zzcxv zzcxv, zzbmn zzbmn, zzbzq zzbzq, Clock clock, zzbva zzbva, zzdae zzdae) {
        this.f19620a = context;
        this.f19621b = zzbzc;
        this.f19622c = jSONObject;
        this.f19623d = zzccj;
        this.f19624e = zzbyt;
        this.f19625f = zzdh;
        this.f19626g = zzbrt;
        this.f19627h = zzbri;
        this.f19628i = zzcxm;
        this.f19629j = zzbai;
        this.f19630k = zzcxv;
        this.f19631l = zzbmn;
        this.f19632m = zzbzq;
        this.f19633n = clock;
        this.f19634o = zzbva;
        this.f19635p = zzdae;
    }

    /* renamed from: b */
    private final boolean m22030b(String str) {
        JSONObject optJSONObject = this.f19622c.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final boolean m22034d() {
        return this.f19622c.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: e */
    private final String m22035e(View view) {
        try {
            JSONObject optJSONObject = this.f19622c.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return this.f19625f.mo29015a().zza(this.f19620a, optJSONObject.optString("click_string"), view);
        } catch (Exception e) {
            zzbad.m20520b("Exception obtaining click signals", e);
            return null;
        }
    }

    /* renamed from: f */
    private static int[] m22037f(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    /* renamed from: a */
    public final void mo28479a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f19640u = new Point();
        this.f19641v = new Point();
        if (!this.f19637r) {
            this.f19634o.mo28454a(view);
            this.f19637r = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f19631l.mo28272a((Object) this);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    view2.setOnTouchListener(onTouchListener);
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    view3.setOnTouchListener(onTouchListener);
                    view3.setClickable(false);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo28487c() {
        try {
            if (this.f19644y != null) {
                this.f19644y.onAdMuted();
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void destroy() {
        this.f19623d.mo28644a();
    }

    /* renamed from: u */
    public final void mo28490u() {
        if (this.f19622c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f19632m.mo28604a();
        }
    }

    /* renamed from: w */
    public final void mo28491w() {
        this.f19639t = true;
    }

    /* renamed from: d */
    private final JSONObject m22033d(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzk.zzlg();
            jSONObject.put("can_show_on_lock_screen", zzaxi.m20300e(view));
            zzk.zzlg();
            jSONObject.put("is_keyguard_locked", zzaxi.m20307j(this.f19620a));
        } catch (JSONException unused) {
            zzbad.m20523d("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* renamed from: b */
    private final String m22028b(View view, Map<String, WeakReference<View>> map) {
        if (!(map == null || view == null)) {
            for (Map.Entry next : map.entrySet()) {
                if (view.equals((View) ((WeakReference) next.getValue()).get())) {
                    return (String) next.getKey();
                }
            }
        }
        int n = this.f19624e.mo28547n();
        if (n == 1) {
            return "1099";
        }
        if (n == 2) {
            return "2099";
        }
        if (n != 6) {
            return null;
        }
        return "3099";
    }

    /* renamed from: c */
    public final boolean mo28488c(Bundle bundle) {
        if (!m22030b("impression_reporting")) {
            zzbad.m20519b("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return m22026a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, zzk.zzlg().mo27796a(bundle, (JSONObject) null));
    }

    /* renamed from: e */
    private final JSONObject m22036e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m22021a(this.f19640u.x));
            jSONObject.put("y", m22021a(this.f19640u.y));
            jSONObject.put("start_x", m22021a(this.f19641v.x));
            jSONObject.put("start_y", m22021a(this.f19641v.y));
            return jSONObject;
        } catch (JSONException e) {
            zzbad.m20520b("Error occurred while putting signals into JSON object.", e);
            return null;
        }
    }

    /* renamed from: c */
    private static JSONObject m22031c(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzk.zzlg();
            jSONObject.put("contained_in_scroll_view", zzaxi.m20302f(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final void mo28486b(Bundle bundle) {
        if (bundle == null) {
            zzbad.m20516a("Click data is null. No click is reported.");
        } else if (!m22030b("click_reporting")) {
            zzbad.m20519b("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            m22025a((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, zzk.zzlg().mo27796a(bundle, (JSONObject) null), false, false);
        }
    }

    /* renamed from: c */
    private final JSONObject m22032c(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("click_point", m22036e());
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e) {
                e = e;
                jSONObject = jSONObject2;
            }
        } catch (Exception e2) {
            e = e2;
            zzbad.m20520b("Error occurred while grabbing click signals.", e);
            return jSONObject;
        }
    }

    /* renamed from: b */
    public final void mo28485b() {
        m22026a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d4 A[Catch:{ JSONException -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[Catch:{ JSONException -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fc A[Catch:{ JSONException -> 0x0100 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject m22029b(android.view.View r14) {
        /*
            r13 = this;
            java.lang.String r0 = "window"
            java.lang.String r1 = "relative_to"
            java.lang.String r2 = "y"
            java.lang.String r3 = "x"
            java.lang.String r4 = "height"
            java.lang.String r5 = "width"
            java.lang.String r6 = "Cannot access method getTemplateTypeName: "
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            if (r14 != 0) goto L_0x0016
            return r7
        L_0x0016:
            r8 = 1
            r9 = 0
            int[] r10 = m22037f(r14)     // Catch:{ Exception -> 0x0088 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0088 }
            r11.<init>()     // Catch:{ Exception -> 0x0088 }
            int r12 = r14.getMeasuredWidth()     // Catch:{ Exception -> 0x0088 }
            int r12 = r13.m22021a((int) r12)     // Catch:{ Exception -> 0x0088 }
            r11.put(r5, r12)     // Catch:{ Exception -> 0x0088 }
            int r12 = r14.getMeasuredHeight()     // Catch:{ Exception -> 0x0088 }
            int r12 = r13.m22021a((int) r12)     // Catch:{ Exception -> 0x0088 }
            r11.put(r4, r12)     // Catch:{ Exception -> 0x0088 }
            r12 = r10[r9]     // Catch:{ Exception -> 0x0088 }
            int r12 = r13.m22021a((int) r12)     // Catch:{ Exception -> 0x0088 }
            r11.put(r3, r12)     // Catch:{ Exception -> 0x0088 }
            r12 = r10[r8]     // Catch:{ Exception -> 0x0088 }
            int r12 = r13.m22021a((int) r12)     // Catch:{ Exception -> 0x0088 }
            r11.put(r2, r12)     // Catch:{ Exception -> 0x0088 }
            r11.put(r1, r0)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r12 = "frame"
            r7.put(r12, r11)     // Catch:{ Exception -> 0x0088 }
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch:{ Exception -> 0x0088 }
            r11.<init>()     // Catch:{ Exception -> 0x0088 }
            boolean r12 = r14.getGlobalVisibleRect(r11)     // Catch:{ Exception -> 0x0088 }
            if (r12 == 0) goto L_0x0061
            org.json.JSONObject r0 = r13.m22023a((android.graphics.Rect) r11)     // Catch:{ Exception -> 0x0088 }
            goto L_0x0082
        L_0x0061:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0088 }
            r11.<init>()     // Catch:{ Exception -> 0x0088 }
            r11.put(r5, r9)     // Catch:{ Exception -> 0x0088 }
            r11.put(r4, r9)     // Catch:{ Exception -> 0x0088 }
            r4 = r10[r9]     // Catch:{ Exception -> 0x0088 }
            int r4 = r13.m22021a((int) r4)     // Catch:{ Exception -> 0x0088 }
            r11.put(r3, r4)     // Catch:{ Exception -> 0x0088 }
            r3 = r10[r8]     // Catch:{ Exception -> 0x0088 }
            int r3 = r13.m22021a((int) r3)     // Catch:{ Exception -> 0x0088 }
            r11.put(r2, r3)     // Catch:{ Exception -> 0x0088 }
            r11.put(r1, r0)     // Catch:{ Exception -> 0x0088 }
            r0 = r11
        L_0x0082:
            java.lang.String r1 = "visible_bounds"
            r7.put(r1, r0)     // Catch:{ Exception -> 0x0088 }
            goto L_0x008d
        L_0x0088:
            java.lang.String r0 = "Unable to get native ad view bounding box"
            com.google.android.gms.internal.ads.zzbad.m20523d(r0)
        L_0x008d:
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzacu.f17926j3
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r0 = r1.mo27163a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0106
            android.view.ViewParent r14 = r14.getParent()
            if (r14 == 0) goto L_0x00c8
            java.lang.Class r0 = r14.getClass()     // Catch:{ NoSuchMethodException -> 0x00c8, SecurityException -> 0x00c4, IllegalAccessException -> 0x00bf, InvocationTargetException -> 0x00ba }
            java.lang.String r1 = "getTemplateTypeName"
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x00c8, SecurityException -> 0x00c4, IllegalAccessException -> 0x00bf, InvocationTargetException -> 0x00ba }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x00c8, SecurityException -> 0x00c4, IllegalAccessException -> 0x00bf, InvocationTargetException -> 0x00ba }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x00c8, SecurityException -> 0x00c4, IllegalAccessException -> 0x00bf, InvocationTargetException -> 0x00ba }
            java.lang.Object r14 = r0.invoke(r14, r1)     // Catch:{ NoSuchMethodException -> 0x00c8, SecurityException -> 0x00c4, IllegalAccessException -> 0x00bf, InvocationTargetException -> 0x00ba }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ NoSuchMethodException -> 0x00c8, SecurityException -> 0x00c4, IllegalAccessException -> 0x00bf, InvocationTargetException -> 0x00ba }
            goto L_0x00ca
        L_0x00ba:
            r14 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20520b(r6, r14)
            goto L_0x00c8
        L_0x00bf:
            r14 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20520b(r6, r14)
            goto L_0x00c8
        L_0x00c4:
            r14 = move-exception
            com.google.android.gms.internal.ads.zzbad.m20520b(r6, r14)
        L_0x00c8:
            java.lang.String r14 = ""
        L_0x00ca:
            r0 = -1
            int r1 = r14.hashCode()     // Catch:{ JSONException -> 0x0100 }
            r2 = -2066603854(0xffffffff84d220b2, float:-4.940079E-36)
            if (r1 == r2) goto L_0x00e4
            r2 = 2019754500(0x78630204, float:1.8417067E34)
            if (r1 == r2) goto L_0x00da
            goto L_0x00ed
        L_0x00da:
            java.lang.String r1 = "medium_template"
            boolean r14 = r14.equals(r1)     // Catch:{ JSONException -> 0x0100 }
            if (r14 == 0) goto L_0x00ed
            r0 = 1
            goto L_0x00ed
        L_0x00e4:
            java.lang.String r1 = "small_template"
            boolean r14 = r14.equals(r1)     // Catch:{ JSONException -> 0x0100 }
            if (r14 == 0) goto L_0x00ed
            r0 = 0
        L_0x00ed:
            java.lang.String r14 = "native_template_type"
            if (r0 == 0) goto L_0x00fc
            if (r0 == r8) goto L_0x00f7
            r7.put(r14, r9)     // Catch:{ JSONException -> 0x0100 }
            goto L_0x0106
        L_0x00f7:
            r0 = 2
            r7.put(r14, r0)     // Catch:{ JSONException -> 0x0100 }
            goto L_0x0106
        L_0x00fc:
            r7.put(r14, r8)     // Catch:{ JSONException -> 0x0100 }
            goto L_0x0106
        L_0x0100:
            r14 = move-exception
            java.lang.String r0 = "Could not log native template signal to JSON"
            com.google.android.gms.internal.ads.zzbad.m20520b(r0, r14)
        L_0x0106:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxx.m22029b(android.view.View):org.json.JSONObject");
    }

    /* renamed from: a */
    public final void mo28477a(View view, Map<String, WeakReference<View>> map) {
        this.f19640u = new Point();
        this.f19641v = new Point();
        this.f19634o.mo28455b(view);
        this.f19637r = false;
    }

    /* renamed from: a */
    public final void mo28476a(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        View view3 = view2;
        Map<String, WeakReference<View>> map3 = map;
        JSONObject a = m22024a(map, map2, view2);
        JSONObject b = m22029b(view2);
        JSONObject c = m22031c(view2);
        JSONObject d = m22033d(view2);
        View view4 = view;
        String b2 = m22028b(view, map);
        m22025a(view, b, a, c, d, b2, m22032c(b2), (JSONObject) null, z, false);
    }

    /* renamed from: a */
    public final void mo28484a(String str) {
        m22025a((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    /* renamed from: a */
    public final void mo28480a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f19639t) {
            zzbad.m20516a("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!m22034d()) {
            zzbad.m20516a("Custom click reporting failed. Ad unit id not whitelisted.");
        } else {
            JSONObject a = m22024a(map, map2, view);
            JSONObject b = m22029b(view);
            JSONObject c = m22031c(view);
            JSONObject d = m22033d(view);
            String b2 = m22028b((View) null, map);
            m22025a(view, b, a, c, d, b2, m22032c(b2), (JSONObject) null, z, true);
        }
    }

    /* renamed from: a */
    private final void m22025a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        Preconditions.m16042a("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f19622c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.f19621b.mo28567b(this.f19624e.mo28538e()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f19624e.mo28547n());
            jSONObject8.put("view_aware_api_used", z);
            jSONObject8.put("custom_mute_requested", this.f19630k.f21172i != null && this.f19630k.f21172i.f18048l);
            jSONObject8.put("custom_mute_enabled", !this.f19624e.mo28542i().isEmpty() && this.f19624e.mo28549p() != null);
            if (this.f19632m.mo28606b() != null && this.f19622c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f19633n.mo25498b());
            if (this.f19639t && m22034d()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f19621b.mo28567b(this.f19624e.mo28538e()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            jSONObject8.put("click_signals", m22035e(view));
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long b = this.f19633n.mo25498b();
            jSONObject9.put("time_from_last_touch_down", b - this.f19642w);
            jSONObject9.put("time_from_last_touch", b - this.f19643x);
            jSONObject7.put("touch_signal", jSONObject9);
            zzbao.m20536a(this.f19623d.mo28641a("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e) {
            zzbad.m20520b("Unable to create click JSON.", e);
        }
    }

    /* renamed from: a */
    public final void mo28475a(View view, MotionEvent motionEvent, View view2) {
        int[] f = m22037f(view2);
        this.f19640u = new Point(((int) motionEvent.getRawX()) - f[0], ((int) motionEvent.getRawY()) - f[1]);
        long b = this.f19633n.mo25498b();
        this.f19643x = b;
        if (motionEvent.getAction() == 0) {
            this.f19642w = b;
            this.f19641v = this.f19640u;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f19640u;
        obtain.setLocation((float) point.x, (float) point.y);
        this.f19625f.mo29016a(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    public final void mo28473a(Bundle bundle) {
        if (bundle == null) {
            zzbad.m20516a("Touch event data is null. No touch event is reported.");
        } else if (!m22030b("touch_reporting")) {
            zzbad.m20519b("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i = bundle.getInt("duration_ms");
            this.f19625f.mo29015a().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i);
        }
    }

    /* renamed from: a */
    public final void mo28474a(View view) {
        if (!this.f19622c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzbad.m20523d("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzbzq zzbzq = this.f19632m;
        if (view != null) {
            view.setOnClickListener(zzbzq);
            view.setClickable(true);
            zzbzq.f19807l = new WeakReference<>(view);
        }
    }

    /* renamed from: a */
    public final void mo28483a(zzagd zzagd) {
        if (!this.f19622c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzbad.m20523d("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        } else {
            this.f19632m.mo28605a(zzagd);
        }
    }

    /* renamed from: a */
    public final void mo28482a(zzaak zzaak) {
        try {
            if (!this.f19638s) {
                if (zzaak != null || this.f19624e.mo28549p() == null) {
                    this.f19638s = true;
                    this.f19635p.mo28873a(zzaak.mo26924Y());
                    mo28487c();
                    return;
                }
                this.f19638s = true;
                this.f19635p.mo28873a(this.f19624e.mo28549p().mo26924Y());
                mo28487c();
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo28481a(zzaag zzaag) {
        this.f19644y = zzaag;
    }

    /* renamed from: a */
    public final void mo28478a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        m22026a(m22029b(view), m22024a(map, map2, view), m22031c(view), m22033d(view), (JSONObject) null);
    }

    /* renamed from: a */
    public final void mo28472a() {
        Preconditions.m16042a("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f19622c);
            zzbao.m20536a(this.f19623d.mo28641a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzbad.m20520b("", e);
        }
    }

    /* renamed from: a */
    private final boolean m22026a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        Preconditions.m16042a("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f19622c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            this.f19623d.mo28645a("/logScionEvent", (zzaho<Object>) new C7878qf(this));
            this.f19623d.mo28645a("/nativeImpression", (zzaho<Object>) new C7952sf(this));
            zzbao.m20536a(this.f19623d.mo28641a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            boolean z = this.f19636q;
            if (z || this.f19628i.f21142z == null) {
                return true;
            }
            this.f19636q = z | zzk.zzlq().mo27848b(this.f19620a, this.f19629j.f18742f, this.f19628i.f21142z.toString(), this.f19630k.f21169f);
            return true;
        } catch (JSONException e) {
            zzbad.m20520b("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* renamed from: a */
    private final JSONObject m22023a(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", m22021a(rect.right - rect.left));
        jSONObject.put("height", m22021a(rect.bottom - rect.top));
        jSONObject.put("x", m22021a(rect.left));
        jSONObject.put("y", m22021a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONObject m22024a(Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        String str;
        String str2;
        JSONObject jSONObject;
        Map<String, WeakReference<View>> map3 = map2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject2 = new JSONObject();
        if (!(map == null || view == null)) {
            int[] f = m22037f(view);
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                View view2 = (View) ((WeakReference) next.getValue()).get();
                if (view2 != null) {
                    int[] f2 = m22037f(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                    try {
                        jSONObject4.put("width", m22021a(view2.getMeasuredWidth()));
                        jSONObject4.put("height", m22021a(view2.getMeasuredHeight()));
                        jSONObject4.put("x", m22021a(f2[0] - f[0]));
                        jSONObject4.put("y", m22021a(f2[1] - f[1]));
                        jSONObject4.put(str4, str3);
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = m22023a(rect);
                        } else {
                            jSONObject = new JSONObject();
                            jSONObject.put("width", 0);
                            jSONObject.put("height", 0);
                            jSONObject.put("x", m22021a(f2[0] - f[0]));
                            jSONObject.put("y", m22021a(f2[1] - f[1]));
                            jSONObject.put(str4, str3);
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            str2 = str3;
                            str = str4;
                            try {
                                jSONObject3.put("font_size", (double) textView.getTextSize());
                                jSONObject3.put(Command.CommandHandler.TEXT, textView.getText());
                            } catch (JSONException unused) {
                                zzbad.m20523d("Unable to get asset views information");
                                it = it2;
                                str3 = str2;
                                str4 = str;
                            }
                        } else {
                            str2 = str3;
                            str = str4;
                        }
                        jSONObject3.put("is_clickable", map3 != null && map3.containsKey(next.getKey()) && view2.isClickable());
                        jSONObject2.put((String) next.getKey(), jSONObject3);
                    } catch (JSONException unused2) {
                        str2 = str3;
                        str = str4;
                        zzbad.m20523d("Unable to get asset views information");
                        it = it2;
                        str3 = str2;
                        str4 = str;
                    }
                    it = it2;
                    str3 = str2;
                    str4 = str;
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    private final int m22021a(int i) {
        return zzyt.m25666a().mo27878a(this.f19620a, i);
    }
}
