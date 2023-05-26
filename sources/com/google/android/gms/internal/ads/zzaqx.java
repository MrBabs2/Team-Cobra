package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;

@zzard
public final class zzaqx implements zzarb {

    /* renamed from: f */
    private static final Object f18310f = new Object();
    @VisibleForTesting

    /* renamed from: g */
    private static zzarb f18311g;
    @VisibleForTesting

    /* renamed from: h */
    private static zzarb f18312h;

    /* renamed from: a */
    private final Object f18313a;

    /* renamed from: b */
    private final Context f18314b;

    /* renamed from: c */
    private final WeakHashMap<Thread, Boolean> f18315c;

    /* renamed from: d */
    private final ExecutorService f18316d;

    /* renamed from: e */
    private final zzbai f18317e;

    private zzaqx(Context context) {
        this(context, zzbai.m20531d());
    }

    /* renamed from: a */
    public static zzarb m19860a(Context context) {
        synchronized (f18310f) {
            if (f18311g == null) {
                if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17897e)).booleanValue()) {
                    f18311g = new zzaqx(context);
                } else {
                    f18311g = new zzarc();
                }
            }
        }
        return f18311g;
    }

    private zzaqx(Context context, zzbai zzbai) {
        this.f18313a = new Object();
        this.f18315c = new WeakHashMap<>();
        this.f18316d = Executors.newCachedThreadPool();
        this.f18314b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f18317e = zzbai;
    }

    /* renamed from: a */
    public static zzarb m19861a(Context context, zzbai zzbai) {
        synchronized (f18310f) {
            if (f18312h == null) {
                if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17897e)).booleanValue()) {
                    zzaqx zzaqx = new zzaqx(context, zzbai);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (zzaqx.f18313a) {
                            zzaqx.f18315c.put(thread, true);
                        }
                        thread.setUncaughtExceptionHandler(new C7829p3(zzaqx, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new C7792o3(zzaqx, Thread.getDefaultUncaughtExceptionHandler()));
                    f18312h = zzaqx;
                } else {
                    f18312h = new zzarc();
                }
            }
        }
        return f18312h;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r3 == false) goto L_0x003d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27570a(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x003c
            r1 = r11
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r1 == 0) goto L_0x0037
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = 0
        L_0x000f:
            if (r6 >= r5) goto L_0x0032
            r7 = r4[r6]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.zzazt.m20479b((java.lang.String) r8)
            if (r8 == 0) goto L_0x001e
            r2 = 1
        L_0x001e:
            java.lang.Class<com.google.android.gms.internal.ads.zzaqx> r8 = com.google.android.gms.internal.ads.zzaqx.class
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x002f
            r3 = 1
        L_0x002f:
            int r6 = r6 + 1
            goto L_0x000f
        L_0x0032:
            java.lang.Throwable r1 = r1.getCause()
            goto L_0x0007
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r10 = 0
        L_0x003d:
            if (r10 == 0) goto L_0x0046
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.mo27572a(r11, r0, r10)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqx.mo27570a(java.lang.Thread, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public final void mo27571a(Throwable th, String str) {
        mo27572a(th, str, 1.0f);
    }

    /* renamed from: a */
    public final void mo27572a(Throwable th, String str, float f) {
        if (zzazt.m20470a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            zzdmb.m23746a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f);
            if (f > 0.0f) {
                i2 = (int) (1.0f / f);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(m19859a(name, stringWriter2, str, i2).toString());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.f18316d.submit(new C7866q3(this, new zzbah(), (String) obj));
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private final Uri.Builder m19859a(String str, String str2, String str3, int i) {
        boolean z;
        String str4;
        try {
            z = Wrappers.m16317a(this.f18314b).mo25508a();
        } catch (Throwable th) {
            zzbad.m20520b("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.f18314b.getPackageName();
        } catch (Throwable unused) {
            zzbad.m20523d("Cannot obtain package name, proceeding.");
            str4 = "unknown";
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.f18317e.f18742f).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", zzacu.m18982a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "248613007").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", zzyt.m25671f()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzyt.m25670e().mo27163a(zzacu.f17860V2)));
    }
}
