package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

public final class zzeh implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: r */
    private static final Handler f21809r = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private final Context f21810f;

    /* renamed from: g */
    private Application f21811g;

    /* renamed from: h */
    private final PowerManager f21812h;

    /* renamed from: i */
    private final KeyguardManager f21813i;

    /* renamed from: j */
    private final zzdy f21814j;

    /* renamed from: k */
    private BroadcastReceiver f21815k;

    /* renamed from: l */
    private WeakReference<ViewTreeObserver> f21816l;

    /* renamed from: m */
    private WeakReference<View> f21817m;

    /* renamed from: n */
    private C7966st f21818n;

    /* renamed from: o */
    private byte f21819o = -1;

    /* renamed from: p */
    private int f21820p = -1;

    /* renamed from: q */
    private long f21821q = -3;

    public zzeh(zzdy zzdy, View view) {
        this.f21814j = zzdy;
        Context context = zzdy.f21775a;
        this.f21810f = context;
        this.f21812h = (PowerManager) context.getSystemService("power");
        this.f21813i = (KeyguardManager) this.f21810f.getSystemService("keyguard");
        Context context2 = this.f21810f;
        if (context2 instanceof Application) {
            this.f21811g = (Application) context2;
            this.f21818n = new C7966st((Application) context2, this);
        }
        mo29259a(view);
    }

    /* renamed from: b */
    private final void m24297b() {
        f21809r.post(new C8008ty(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        if (r7 == false) goto L_0x0069;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m24299c() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.f21817m
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L_0x0015
            r9.f21821q = r2
            r9.f21819o = r1
            return
        L_0x0015:
            int r4 = r0.getVisibility()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L_0x0029
            r4 = r4 | 2
            byte r4 = (byte) r4
        L_0x0029:
            android.os.PowerManager r7 = r9.f21812h
            if (r7 == 0) goto L_0x0036
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L_0x0036
            r4 = r4 | 4
            byte r4 = (byte) r4
        L_0x0036:
            com.google.android.gms.internal.ads.zzdy r7 = r9.f21814j
            boolean r7 = r7.mo29251k()
            if (r7 != 0) goto L_0x006a
            android.app.KeyguardManager r7 = r9.f21813i
            if (r7 == 0) goto L_0x0069
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L_0x0069
            android.app.Activity r7 = com.google.android.gms.internal.ads.zzef.m24287a((android.view.View) r0)
            if (r7 == 0) goto L_0x0065
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L_0x0056
            r7 = 0
            goto L_0x005a
        L_0x0056:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
        L_0x005a:
            if (r7 == 0) goto L_0x0065
            int r7 = r7.flags
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0065
            r7 = 1
            goto L_0x0066
        L_0x0065:
            r7 = 0
        L_0x0066:
            if (r7 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r5 = 0
        L_0x006a:
            if (r5 != 0) goto L_0x006f
            r4 = r4 | 8
            byte r4 = (byte) r4
        L_0x006f:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L_0x007d
            r4 = r4 | 16
            byte r4 = (byte) r4
        L_0x007d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x008b
            r4 = r4 | 32
            byte r4 = (byte) r4
        L_0x008b:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.f21820p
            if (r5 == r1) goto L_0x0094
            r0 = r5
        L_0x0094:
            if (r0 == 0) goto L_0x0099
            r0 = r4 | 64
            byte r4 = (byte) r0
        L_0x0099:
            byte r0 = r9.f21819o
            if (r0 == r4) goto L_0x00ab
            r9.f21819o = r4
            if (r4 != 0) goto L_0x00a6
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L_0x00a9
        L_0x00a6:
            long r0 = (long) r4
            long r0 = r2 - r0
        L_0x00a9:
            r9.f21821q = r0
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeh.m24299c():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29259a(View view) {
        WeakReference<View> weakReference = this.f21817m;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m24300c(view2);
        }
        this.f21817m = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                m24298b(view);
            }
            view.addOnAttachStateChangeListener(this);
            this.f21821q = -2;
            return;
        }
        this.f21821q = -3;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m24295a(activity, 0);
        m24299c();
    }

    public final void onActivityDestroyed(Activity activity) {
        m24299c();
    }

    public final void onActivityPaused(Activity activity) {
        m24295a(activity, 4);
        m24299c();
    }

    public final void onActivityResumed(Activity activity) {
        m24295a(activity, 0);
        m24299c();
        m24297b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m24299c();
    }

    public final void onActivityStarted(Activity activity) {
        m24295a(activity, 0);
        m24299c();
    }

    public final void onActivityStopped(Activity activity) {
        m24299c();
    }

    public final void onGlobalLayout() {
        m24299c();
    }

    public final void onScrollChanged() {
        m24299c();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f21820p = -1;
        m24298b(view);
        m24299c();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f21820p = -1;
        m24299c();
        m24297b();
        m24300c(view);
    }

    /* renamed from: b */
    private final void m24298b(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f21816l = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f21815k == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C8045uy uyVar = new C8045uy(this);
            this.f21815k = uyVar;
            this.f21810f.registerReceiver(uyVar, intentFilter);
        }
        Application application = this.f21811g;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f21818n);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private final void m24295a(Activity activity, int i) {
        Window window;
        if (this.f21817m != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.f21817m.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f21820p = i;
            }
        }
    }

    /* renamed from: a */
    public final long mo29258a() {
        if (this.f21821q <= -2 && this.f21817m.get() == null) {
            this.f21821q = -3;
        }
        return this.f21821q;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(3:4|(1:8)|9)|10|11|(1:13)|15|(3:17|18|19)|21|(3:23|24|26)(1:28)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ Exception -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC, Splitter:B:17:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC, Splitter:B:23:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m24300c(android.view.View r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f21816l     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r3.f21816l     // Catch:{ Exception -> 0x001d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x001d }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001b
            boolean r2 = r1.isAlive()     // Catch:{ Exception -> 0x001d }
            if (r2 == 0) goto L_0x001b
            r1.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x001d }
            r1.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x001d }
        L_0x001b:
            r3.f21816l = r0     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()     // Catch:{ Exception -> 0x002e }
            boolean r1 = r4.isAlive()     // Catch:{ Exception -> 0x002e }
            if (r1 == 0) goto L_0x002f
            r4.removeOnScrollChangedListener(r3)     // Catch:{ Exception -> 0x002e }
            r4.removeGlobalOnLayoutListener(r3)     // Catch:{ Exception -> 0x002e }
            goto L_0x002f
        L_0x002e:
        L_0x002f:
            android.content.BroadcastReceiver r4 = r3.f21815k
            if (r4 == 0) goto L_0x003a
            android.content.Context r1 = r3.f21810f     // Catch:{ Exception -> 0x0038 }
            r1.unregisterReceiver(r4)     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r3.f21815k = r0
        L_0x003a:
            android.app.Application r4 = r3.f21811g
            if (r4 == 0) goto L_0x0043
            com.google.android.gms.internal.ads.st r0 = r3.f21818n     // Catch:{ Exception -> 0x0043 }
            r4.unregisterActivityLifecycleCallbacks(r0)     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeh.m24300c(android.view.View):void");
    }
}
