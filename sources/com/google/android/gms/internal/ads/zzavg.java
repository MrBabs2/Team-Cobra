package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

@zzard
public final class zzavg {

    /* renamed from: a */
    private final AtomicReference<ThreadPoolExecutor> f18557a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    private final Object f18558b = new Object();

    /* renamed from: c */
    private String f18559c = null;

    /* renamed from: d */
    private String f18560d = null;
    @VisibleForTesting

    /* renamed from: e */
    private final AtomicBoolean f18561e = new AtomicBoolean(false);
    @VisibleForTesting

    /* renamed from: f */
    private final AtomicInteger f18562f = new AtomicInteger(-1);

    /* renamed from: g */
    private final AtomicReference<Object> f18563g = new AtomicReference<>((Object) null);

    /* renamed from: h */
    private final AtomicReference<Object> f18564h = new AtomicReference<>((Object) null);

    /* renamed from: i */
    private final ConcurrentMap<String, Method> f18565i = new ConcurrentHashMap(9);

    /* renamed from: j */
    private final AtomicReference<zzbjf> f18566j = new AtomicReference<>((Object) null);

    /* renamed from: k */
    private final List<FutureTask> f18567k = new ArrayList();

    /* renamed from: h */
    private final Method m20076h(Context context) {
        Class<String> cls = String.class;
        Method method = (Method) this.f18565i.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{cls, cls, Bundle.class});
            this.f18565i.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m20073a(e, "logEventInternal", true);
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: i */
    private static boolean m20079i(Context context) {
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17938m0)).booleanValue()) {
            if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17942n0)).booleanValue()) {
                return false;
            }
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17946o0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    /* renamed from: j */
    private final Method m20080j(Context context, String str) {
        Class<String> cls = String.class;
        Method method = (Method) this.f18565i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, cls, cls});
            this.f18565i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m20073a(e, str, false);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo27688a(Context context, String str) {
        if (mo27700f(context)) {
            if (m20079i(context)) {
                m20074a("beginAdUnitExposure", (C7941s4) new C7383d4(str));
            } else {
                m20071a(context, str, "beginAdUnitExposure");
            }
        }
    }

    /* renamed from: b */
    public final void mo27692b(Context context, String str) {
        if (mo27700f(context)) {
            if (m20079i(context)) {
                m20074a("endAdUnitExposure", (C7941s4) new C7420e4(str));
            } else {
                m20071a(context, str, "endAdUnitExposure");
            }
        }
    }

    /* renamed from: c */
    public final void mo27694c(Context context, String str) {
        if (!mo27700f(context) || !(context instanceof Activity)) {
            return;
        }
        if (m20079i(context)) {
            m20074a("setScreenName", (C7941s4) new C7608j4(context, str));
        } else if (m20075a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f18564h, false)) {
            Method j = m20080j(context, "setCurrentScreen");
            try {
                j.invoke(this.f18564h.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception e) {
                m20073a(e, "setCurrentScreen", false);
            }
        }
    }

    /* renamed from: d */
    public final String mo27695d(Context context) {
        if (!mo27700f(context)) {
            return null;
        }
        synchronized (this.f18558b) {
            if (this.f18560d != null) {
                String str = this.f18560d;
                return str;
            }
            if (m20079i(context)) {
                this.f18560d = (String) m20068a("getAppIdOrigin", this.f18560d, C7830p4.f16557a);
            } else {
                this.f18560d = "fa";
            }
            String str2 = this.f18560d;
            return str2;
        }
    }

    /* renamed from: e */
    public final void mo27698e(Context context, String str) {
        m20072a(context, "_ai", str, (Bundle) null);
    }

    /* renamed from: f */
    public final boolean mo27700f(Context context) {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17903f0)).booleanValue() && !this.f18561e.get()) {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17950p0)).booleanValue()) {
                return true;
            }
            if (this.f18562f.get() == -1) {
                zzyt.m25666a();
                if (!zzazt.m20482c(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    zzyt.m25666a();
                    if (zzazt.m20481c(context)) {
                        zzbad.m20523d("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f18562f.set(0);
                    }
                }
                this.f18562f.set(1);
            }
            if (this.f18562f.get() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo27701g(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r6.mo27700f(r7)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            boolean r1 = m20079i(r7)
            if (r1 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.r4 r7 = com.google.android.gms.internal.ads.C7567i4.f15570a
            java.lang.String r0 = "getCurrentScreenNameOrScreenClass"
            java.lang.Object r7 = r6.m20068a((java.lang.String) r0, r2, r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r6.f18563g
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r1 = r6.m20075a((android.content.Context) r7, (java.lang.String) r4, (java.util.concurrent.atomic.AtomicReference<java.lang.Object>) r1, (boolean) r3)
            if (r1 != 0) goto L_0x0028
            return r2
        L_0x0028:
            r1 = 0
            java.lang.reflect.Method r3 = r6.m20078i(r7, r0)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r6.f18563g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "getCurrentScreenClass"
            java.lang.reflect.Method r7 = r6.m20078i(r7, r3)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r3 = r6.f18563g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch:{ Exception -> 0x0056 }
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            return r3
        L_0x0055:
            return r2
        L_0x0056:
            r7 = move-exception
            r6.m20073a((java.lang.Exception) r7, (java.lang.String) r0, (boolean) r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavg.mo27701g(android.content.Context):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ String mo27697e(Context context) throws Exception {
        return (String) m20067a("getAppInstanceId", context);
    }

    /* renamed from: a */
    public final String mo27687a(Context context) {
        if (!mo27700f(context)) {
            return null;
        }
        synchronized (this.f18558b) {
            if (this.f18559c != null) {
                String str = this.f18559c;
                return str;
            }
            if (m20079i(context)) {
                this.f18559c = (String) m20068a("getGmpAppId", this.f18559c, C7645k4.f15816a);
            } else {
                this.f18559c = (String) m20067a("getGmpAppId", context);
            }
            String str2 = this.f18559c;
            return str2;
        }
    }

    /* renamed from: b */
    public final String mo27691b(Context context) {
        if (!mo27700f(context)) {
            return null;
        }
        long longValue = ((Long) zzyt.m25670e().mo27163a(zzacu.f17928k0)).longValue();
        if (m20079i(context)) {
            if (longValue >= 0) {
                return (String) m20069a("getAppInstanceId", C7719m4.f16198a).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) m20069a("getAppInstanceId", C7682l4.f16079a).get();
            } catch (Exception e) {
                if (e instanceof TimeoutException) {
                    return "TIME_OUT";
                }
                return null;
            }
        } else if (longValue < 0) {
            return (String) m20067a("getAppInstanceId", context);
        } else {
            Future submit = m20070a().submit(new C7756n4(this, context));
            try {
                return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                submit.cancel(true);
                if (e2 instanceof TimeoutException) {
                    return "TIME_OUT";
                }
                return null;
            }
        }
    }

    /* renamed from: h */
    private final Method m20077h(Context context, String str) {
        Method method = (Method) this.f18565i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.f18565i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m20073a(e, str, false);
            return null;
        }
    }

    /* renamed from: i */
    private final Method m20078i(Context context, String str) {
        Method method = (Method) this.f18565i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f18565i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            m20073a(e, str, false);
            return null;
        }
    }

    /* renamed from: g */
    public final void mo27702g(Context context, String str) {
        m20072a(context, "_aa", str, (Bundle) null);
    }

    /* renamed from: d */
    public final void mo27696d(Context context, String str) {
        m20072a(context, "_ac", str, (Bundle) null);
    }

    /* renamed from: c */
    public final String mo27693c(Context context) {
        if (!mo27700f(context)) {
            return null;
        }
        if (m20079i(context)) {
            Long l = (Long) m20068a("getAdEventId", (Object) null, C7793o4.f16429a);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object a = m20067a("generateEventId", context);
        if (a != null) {
            return a.toString();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo27689a(Context context, String str, String str2, String str3, int i) {
        if (mo27700f(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("type", str3);
            bundle.putInt(DonationsAnalytics.VALUE, i);
            m20072a(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            zzawz.m20167e(sb.toString());
        }
    }

    /* renamed from: f */
    public final void mo27699f(Context context, String str) {
        m20072a(context, "_aq", str, (Bundle) null);
    }

    /* renamed from: a */
    private final void m20072a(Context context, String str, String str2, Bundle bundle) {
        if (mo27700f(context)) {
            Bundle a = m20066a(str2, str);
            if (bundle != null) {
                a.putAll(bundle);
            }
            if (m20079i(context)) {
                m20074a("logEventInternal", (C7941s4) new C7457f4(str, a));
            } else if (m20075a(context, "com.google.android.gms.measurement.AppMeasurement", this.f18563g, true)) {
                Method h = m20076h(context);
                try {
                    h.invoke(this.f18563g.get(), new Object[]{"am", str, a});
                } catch (Exception e) {
                    m20073a(e, "logEventInternal", true);
                }
            }
        }
    }

    /* renamed from: a */
    private static Bundle m20066a(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(str);
            zzbad.m20520b(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    /* renamed from: a */
    private final void m20071a(Context context, String str, String str2) {
        if (m20075a(context, "com.google.android.gms.measurement.AppMeasurement", this.f18563g, true)) {
            Method h = m20077h(context, str2);
            try {
                h.invoke(this.f18563g.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zzawz.m20167e(sb.toString());
            } catch (Exception e) {
                m20073a(e, str2, false);
            }
        }
    }

    /* renamed from: a */
    private final Object m20067a(String str, Context context) {
        if (!m20075a(context, "com.google.android.gms.measurement.AppMeasurement", this.f18563g, true)) {
            return null;
        }
        try {
            return m20078i(context, str).invoke(this.f18563g.get(), new Object[0]);
        } catch (Exception e) {
            m20073a(e, str, true);
            return null;
        }
    }

    /* renamed from: a */
    private final void m20073a(Exception exc, String str, boolean z) {
        if (!this.f18561e.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            zzbad.m20523d(sb.toString());
            if (z) {
                zzbad.m20523d("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f18561e.set(true);
            }
        }
    }

    /* renamed from: a */
    private final ThreadPoolExecutor m20070a() {
        if (this.f18557a.get() == null) {
            this.f18557a.compareAndSet((Object) null, new ThreadPoolExecutor(((Integer) zzyt.m25670e().mo27163a(zzacu.f17933l0)).intValue(), ((Integer) zzyt.m25670e().mo27163a(zzacu.f17933l0)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new C7867q4(this)));
        }
        return this.f18557a.get();
    }

    /* renamed from: a */
    private final boolean m20075a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception e) {
                m20073a(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final void m20074a(String str, C7941s4 s4Var) {
        synchronized (this.f18566j) {
            FutureTask futureTask = new FutureTask(new C7494g4(this, s4Var, str), (Object) null);
            if (this.f18566j.get() != null) {
                futureTask.run();
            } else {
                this.f18567k.add(futureTask);
            }
        }
    }

    /* renamed from: a */
    private final <T> Future<T> m20069a(String str, C7904r4<T> r4Var) {
        FutureTask futureTask;
        synchronized (this.f18566j) {
            futureTask = new FutureTask(new C7530h4(this, r4Var, str));
            if (this.f18566j.get() != null) {
                m20070a().submit(futureTask);
            } else {
                this.f18567k.add(futureTask);
            }
        }
        return futureTask;
    }

    /* renamed from: a */
    private final <T> T m20068a(String str, T t, C7904r4<T> r4Var) {
        synchronized (this.f18566j) {
            if (this.f18566j.get() != null) {
                try {
                    T a = r4Var.mo26073a(this.f18566j.get());
                    return a;
                } catch (Exception e) {
                    m20073a(e, str, false);
                    return t;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo27686a(C7904r4 r4Var, String str) throws Exception {
        try {
            return r4Var.mo26073a(this.f18566j.get());
        } catch (Exception e) {
            m20073a(e, str, false);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo27690a(C7941s4 s4Var, String str) {
        if (this.f18566j.get() != null) {
            try {
                s4Var.mo25815a(this.f18566j.get());
            } catch (Exception e) {
                m20073a(e, str, false);
            }
        }
    }
}
