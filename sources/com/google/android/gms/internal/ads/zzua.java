package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.ScrollView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
@zzard
public final class zzua implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: u */
    private static final long f22750u = ((Long) zzyt.m25670e().mo27163a(zzacu.f17858V0)).longValue();

    /* renamed from: f */
    private final Context f22751f;

    /* renamed from: g */
    private Application f22752g;

    /* renamed from: h */
    private final WindowManager f22753h;

    /* renamed from: i */
    private final PowerManager f22754i;

    /* renamed from: j */
    private final KeyguardManager f22755j;
    @VisibleForTesting

    /* renamed from: k */
    private BroadcastReceiver f22756k;

    /* renamed from: l */
    private WeakReference<ViewTreeObserver> f22757l;

    /* renamed from: m */
    private WeakReference<View> f22758m;

    /* renamed from: n */
    private g40 f22759n;

    /* renamed from: o */
    private zzazj f22760o = new zzazj(f22750u);

    /* renamed from: p */
    private boolean f22761p = false;

    /* renamed from: q */
    private int f22762q = -1;

    /* renamed from: r */
    private final HashSet<zzue> f22763r = new HashSet<>();

    /* renamed from: s */
    private final DisplayMetrics f22764s;

    /* renamed from: t */
    private final Rect f22765t;

    public zzua(Context context, View view) {
        this.f22751f = context.getApplicationContext();
        this.f22753h = (WindowManager) context.getSystemService("window");
        this.f22754i = (PowerManager) this.f22751f.getSystemService("power");
        this.f22755j = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.f22751f;
        if (context2 instanceof Application) {
            this.f22752g = (Application) context2;
            this.f22759n = new g40((Application) context2, this);
        }
        this.f22764s = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f22765t = rect;
        rect.right = this.f22753h.getDefaultDisplay().getWidth();
        this.f22765t.bottom = this.f22753h.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.f22758m;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m25367b(view2);
        }
        this.f22758m = new WeakReference<>(view);
        if (view != null) {
            if (zzk.zzli().mo27821a(view)) {
                m25363a(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: c */
    private final List<Rect> m25368c(View view) {
        boolean z;
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (Build.VERSION.SDK_INT >= 16) {
                    z = view2.isScrollContainer();
                } else {
                    if (!(view2 instanceof ScrollView)) {
                        if (!(view2 instanceof ListView)) {
                            z = false;
                        }
                    }
                    z = true;
                }
                if (z && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(m25360a(rect));
                }
            }
            return arrayList;
        } catch (Exception e) {
            zzk.zzlk().mo27734a((Throwable) e, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final void mo29778a(zzue zzue) {
        this.f22763r.add(zzue);
        m25361a(3);
    }

    /* renamed from: b */
    public final void mo29779b(zzue zzue) {
        this.f22763r.remove(zzue);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m25362a(activity, 0);
        m25361a(3);
        m25366b();
    }

    public final void onActivityDestroyed(Activity activity) {
        m25361a(3);
        m25366b();
    }

    public final void onActivityPaused(Activity activity) {
        m25362a(activity, 4);
        m25361a(3);
        m25366b();
    }

    public final void onActivityResumed(Activity activity) {
        m25362a(activity, 0);
        m25361a(3);
        m25366b();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m25361a(3);
        m25366b();
    }

    public final void onActivityStarted(Activity activity) {
        m25362a(activity, 0);
        m25361a(3);
        m25366b();
    }

    public final void onActivityStopped(Activity activity) {
        m25361a(3);
        m25366b();
    }

    public final void onGlobalLayout() {
        m25361a(2);
        m25366b();
    }

    public final void onScrollChanged() {
        m25361a(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.f22762q = -1;
        m25363a(view);
        m25361a(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f22762q = -1;
        m25361a(3);
        m25366b();
        m25367b(view);
    }

    /* renamed from: b */
    private final void m25366b() {
        zzk.zzlg();
        zzaxi.f18651h.post(new e40(this));
    }

    /* renamed from: a */
    private final void m25362a(Activity activity, int i) {
        Window window;
        if (this.f22758m != null && (window = activity.getWindow()) != null) {
            View peekDecorView = window.peekDecorView();
            View view = (View) this.f22758m.get();
            if (view != null && peekDecorView != null && view.getRootView() == peekDecorView.getRootView()) {
                this.f22762q = i;
            }
        }
    }

    /* renamed from: b */
    private final int m25365b(int i) {
        return (int) (((float) i) / this.f22764s.density);
    }

    /* renamed from: b */
    private final void m25367b(View view) {
        try {
            if (this.f22757l != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f22757l.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f22757l = null;
            }
        } catch (Exception e) {
            zzbad.m20520b("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            zzbad.m20520b("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f22756k != null) {
            try {
                zzk.zzmb().mo27871a(this.f22751f, this.f22756k);
            } catch (IllegalStateException e3) {
                zzbad.m20520b("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                zzk.zzlk().mo27734a((Throwable) e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f22756k = null;
        }
        Application application = this.f22752g;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f22759n);
            } catch (Exception e5) {
                zzbad.m20520b("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25361a(int i) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        List<Rect> list;
        int i2 = i;
        if (this.f22763r.size() != 0 && (weakReference = this.f22758m) != null) {
            View view = (View) weakReference.get();
            boolean z3 = i2 == 1;
            boolean z4 = view == null;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            if (view != null) {
                boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
                boolean localVisibleRect = view.getLocalVisibleRect(rect3);
                view.getHitRect(rect4);
                try {
                    view.getLocationOnScreen(iArr);
                    view.getLocationInWindow(iArr2);
                } catch (Exception e) {
                    zzbad.m20520b("Failure getting view location.", e);
                }
                int i3 = iArr[0];
                rect.left = i3;
                rect.top = iArr[1];
                rect.right = i3 + view.getWidth();
                rect.bottom = rect.top + view.getHeight();
                z2 = globalVisibleRect;
                z = localVisibleRect;
            } else {
                z2 = false;
                z = false;
            }
            if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17870Y0)).booleanValue() || view == null) {
                list = Collections.emptyList();
            } else {
                list = m25368c(view);
            }
            List<Rect> list2 = list;
            int windowVisibility = view != null ? view.getWindowVisibility() : 8;
            int i4 = this.f22762q;
            if (i4 != -1) {
                windowVisibility = i4;
            }
            boolean z5 = !z4 && zzk.zzlg().mo27803a(view, this.f22754i, this.f22755j) && z2 && z && windowVisibility == 0;
            if (z3 && !this.f22760o.mo27867a() && z5 == this.f22761p) {
                return;
            }
            if (z5 || this.f22761p || i2 != 1) {
                zzud zzud = new zzud(zzk.zzln().mo25499c(), this.f22754i.isScreenOn(), view != null && zzk.zzli().mo27821a(view), view != null ? view.getWindowVisibility() : 8, m25360a(this.f22765t), m25360a(rect), m25360a(rect2), z2, m25360a(rect3), z, m25360a(rect4), this.f22764s.density, z5, list2);
                Iterator<zzue> it = this.f22763r.iterator();
                while (it.hasNext()) {
                    it.next().mo25659a(zzud);
                }
                this.f22761p = z5;
            }
        }
    }

    /* renamed from: a */
    private final Rect m25360a(Rect rect) {
        return new Rect(m25365b(rect.left), m25365b(rect.top), m25365b(rect.right), m25365b(rect.bottom));
    }

    /* renamed from: a */
    private final void m25363a(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f22757l = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f22756k == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f22756k = new f40(this);
            zzk.zzmb().mo27872a(this.f22751f, this.f22756k, intentFilter);
        }
        Application application = this.f22752g;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f22759n);
            } catch (Exception e) {
                zzbad.m20520b("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo29777a(long j) {
        this.f22760o.mo27866a(j);
    }

    /* renamed from: a */
    public final void mo29776a() {
        this.f22760o.mo27866a(f22750u);
    }
}
