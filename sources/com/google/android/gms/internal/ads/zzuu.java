package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.root.execution.Command;

@TargetApi(14)
@zzard
public final class zzuu extends Thread {

    /* renamed from: f */
    private boolean f22800f;

    /* renamed from: g */
    private boolean f22801g;

    /* renamed from: h */
    private final Object f22802h;

    /* renamed from: i */
    private final zzup f22803i;

    /* renamed from: j */
    private final int f22804j;

    /* renamed from: k */
    private final int f22805k;

    /* renamed from: l */
    private final int f22806l;

    /* renamed from: m */
    private final int f22807m;

    /* renamed from: n */
    private final int f22808n;

    /* renamed from: o */
    private final int f22809o;

    /* renamed from: p */
    private final int f22810p;

    /* renamed from: q */
    private final int f22811q;

    /* renamed from: r */
    private final String f22812r;

    /* renamed from: s */
    private final boolean f22813s;

    /* renamed from: t */
    private final boolean f22814t;

    /* renamed from: u */
    private final boolean f22815u;

    public zzuu() {
        this(new zzup());
    }

    @VisibleForTesting
    /* renamed from: e */
    private static boolean m25402e() {
        boolean z;
        try {
            Context b = zzk.zzlj().mo29815b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager == null) {
                return false;
            }
            if (keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (Process.myPid() == next.pid) {
                    if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) b.getSystemService("power");
                    if (powerManager == null) {
                        z = false;
                    } else {
                        z = powerManager.isScreenOn();
                    }
                    if (z) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            zzk.zzlk().mo27734a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    /* renamed from: f */
    private final void m25403f() {
        synchronized (this.f22802h) {
            this.f22801g = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            zzbad.m20516a(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: a */
    public final void mo29817a(View view) {
        try {
            zzuo zzuo = new zzuo(this.f22805k, this.f22806l, this.f22807m, this.f22808n, this.f22809o, this.f22810p, this.f22811q, this.f22814t);
            Context b = zzk.zzlj().mo29815b();
            if (b != null && !TextUtils.isEmpty(this.f22812r)) {
                String str = (String) view.getTag(b.getResources().getIdentifier((String) zzyt.m25670e().mo27163a(zzacu.f17873Z), DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, b.getPackageName()));
                if (str != null && str.equals(this.f22812r)) {
                    return;
                }
            }
            t40 a = m25401a(view, zzuo);
            zzuo.mo29805j();
            if (a.f16890a != 0 || a.f16891b != 0) {
                if (a.f16891b != 0 || zzuo.mo29806k() != 0) {
                    if (a.f16891b != 0 || !this.f22803i.mo29809a(zzuo)) {
                        this.f22803i.mo29811c(zzuo);
                    }
                }
            }
        } catch (Exception e) {
            zzbad.m20520b("Exception in fetchContentOnUIThread", e);
            zzk.zzlk().mo27734a((Throwable) e, "ContentFetchTask.fetchContent");
        }
    }

    /* renamed from: b */
    public final void mo29819b() {
        synchronized (this.f22802h) {
            if (this.f22800f) {
                zzbad.m20516a("Content hash thread already started, quiting...");
                return;
            }
            this.f22800f = true;
            start();
        }
    }

    /* renamed from: c */
    public final zzuo mo29820c() {
        return this.f22803i.mo29808a(this.f22815u);
    }

    /* renamed from: d */
    public final boolean mo29821d() {
        return this.f22801g;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0083 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083 A[LOOP:1: B:29:0x0083->B:41:0x0083, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = m25402e()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.zzuq r0 = com.google.android.gms.ads.internal.zzk.zzlj()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            android.app.Activity r0 = r0.mo29812a()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.zzbad.m20516a((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r4.m25403f()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            goto L_0x0061
        L_0x0019:
            if (r0 == 0) goto L_0x0061
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d }
            if (r2 == 0) goto L_0x004c
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x003d }
            if (r2 == 0) goto L_0x004c
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x003d }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x003d }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x003d }
            r1 = r0
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzawm r2 = com.google.android.gms.ads.internal.zzk.zzlk()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.mo27734a((java.lang.Throwable) r0, (java.lang.String) r3)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.zzbad.m20516a((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        L_0x004c:
            if (r1 == 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.internal.ads.q40 r0 = new com.google.android.gms.internal.ads.q40     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r0.<init>(r4, r1)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            goto L_0x0061
        L_0x0059:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.zzbad.m20516a((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            r4.m25403f()     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
        L_0x0061:
            int r0 = r4.f22804j     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x007a, Exception -> 0x006a }
            goto L_0x0080
        L_0x006a:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzbad.m20520b(r1, r0)
            com.google.android.gms.internal.ads.zzawm r1 = com.google.android.gms.ads.internal.zzk.zzlk()
            java.lang.String r2 = "ContentFetchTask.run"
            r1.mo27734a((java.lang.Throwable) r0, (java.lang.String) r2)
            goto L_0x0080
        L_0x007a:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.zzbad.m20520b(r1, r0)
        L_0x0080:
            java.lang.Object r0 = r4.f22802h
            monitor-enter(r0)
        L_0x0083:
            boolean r1 = r4.f22801g     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x0092
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.zzbad.m20516a((java.lang.String) r1)     // Catch:{ InterruptedException -> 0x0083 }
            java.lang.Object r1 = r4.f22802h     // Catch:{ InterruptedException -> 0x0083 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0083 }
            goto L_0x0083
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x0000
        L_0x0095:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x0099
        L_0x0098:
            throw r1
        L_0x0099:
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.run():void");
    }

    @VisibleForTesting
    private zzuu(zzup zzup) {
        this.f22800f = false;
        this.f22801g = false;
        this.f22803i = zzup;
        this.f22802h = new Object();
        this.f22805k = ((Integer) zzyt.m25670e().mo27163a(zzacu.f17841R)).intValue();
        this.f22806l = ((Integer) zzyt.m25670e().mo27163a(zzacu.f17845S)).intValue();
        this.f22807m = ((Integer) zzyt.m25670e().mo27163a(zzacu.f17849T)).intValue();
        this.f22808n = ((Integer) zzyt.m25670e().mo27163a(zzacu.f17853U)).intValue();
        this.f22809o = ((Integer) zzyt.m25670e().mo27163a(zzacu.f17861W)).intValue();
        this.f22810p = ((Integer) zzyt.m25670e().mo27163a(zzacu.f17865X)).intValue();
        this.f22811q = ((Integer) zzyt.m25670e().mo27163a(zzacu.f17869Y)).intValue();
        this.f22804j = ((Integer) zzyt.m25670e().mo27163a(zzacu.f17857V)).intValue();
        this.f22812r = (String) zzyt.m25670e().mo27163a(zzacu.f17878a0);
        this.f22813s = ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17883b0)).booleanValue();
        this.f22814t = ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17888c0)).booleanValue();
        this.f22815u = ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17893d0)).booleanValue();
        setName("ContentFetchTask");
    }

    @VisibleForTesting
    /* renamed from: a */
    private final t40 m25401a(View view, zzuo zzuo) {
        boolean z;
        if (view == null) {
            return new t40(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new t40(this, 0, 0);
            }
            zzuo.mo29794b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new t40(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzbgz)) {
            WebView webView = (WebView) view;
            if (!PlatformVersion.m16290f()) {
                z = false;
            } else {
                zzuo.mo29802h();
                webView.post(new r40(this, zzuo, webView, globalVisibleRect));
                z = true;
            }
            if (z) {
                return new t40(this, 0, 1);
            }
            return new t40(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new t40(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                t40 a = m25401a(viewGroup.getChildAt(i3), zzuo);
                i += a.f16890a;
                i2 += a.f16891b;
            }
            return new t40(this, i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: a */
    public final void mo29818a(zzuo zzuo, WebView webView, String str, boolean z) {
        zzuo.mo29801g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(Command.CommandHandler.TEXT);
                if (this.f22813s || TextUtils.isEmpty(webView.getTitle())) {
                    zzuo.mo29793a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzuo.mo29793a(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (zzuo.mo29795b()) {
                this.f22803i.mo29810b(zzuo);
            }
        } catch (JSONException unused) {
            zzbad.m20516a("Json string may be malformed.");
        } catch (Throwable th) {
            zzbad.m20517a("Failed to get webview content.", th);
            zzk.zzlk().mo27734a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: a */
    public final void mo29816a() {
        synchronized (this.f22802h) {
            this.f22801g = false;
            this.f22802h.notifyAll();
            zzbad.m20516a("ContentFetchThread: wakeup");
        }
    }
}
