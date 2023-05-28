package com.facebook.p032t.p184x;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p177r.p178g.C6637d;
import com.facebook.p032t.p181u.C6650b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.t.x.e */
/* compiled from: ViewObserver */
final class C6690e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: i */
    private static final Map<Integer, C6690e> f12480i = new HashMap();

    /* renamed from: f */
    private WeakReference<Activity> f12481f;

    /* renamed from: g */
    private final Handler f12482g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private AtomicBoolean f12483h = new AtomicBoolean(false);

    /* renamed from: com.facebook.t.x.e$a */
    /* compiled from: ViewObserver */
    class C6691a implements Runnable {
        C6691a() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    View a = C6650b.m14182a((Activity) C6690e.m14331a(C6690e.this).get());
                    Activity activity = (Activity) C6690e.m14331a(C6690e.this).get();
                    if (a == null) {
                        return;
                    }
                    if (activity != null) {
                        for (View next : C6688c.m14321a(a)) {
                            if (!C6637d.m14119a(next)) {
                                String c = C6688c.m14325c(next);
                                if (!c.isEmpty() && c.length() <= 300) {
                                    C6692f.m14339a(next, a, activity.getLocalClassName());
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    static {
        Class<C6690e> cls = C6690e.class;
    }

    private C6690e(Activity activity) {
        this.f12481f = new WeakReference<>(activity);
    }

    /* renamed from: a */
    static /* synthetic */ WeakReference m14331a(C6690e eVar) {
        if (C6391a.m13260a((Object) C6690e.class)) {
            return null;
        }
        try {
            return eVar.f12481f;
        } catch (Throwable th) {
            C6391a.m13259a(th, C6690e.class);
            return null;
        }
    }

    /* renamed from: b */
    static void m14335b(Activity activity) {
        if (!C6391a.m13260a((Object) C6690e.class)) {
            try {
                int hashCode = activity.hashCode();
                if (f12480i.containsKey(Integer.valueOf(hashCode))) {
                    f12480i.remove(Integer.valueOf(hashCode));
                    f12480i.get(Integer.valueOf(hashCode)).m14336c();
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, C6690e.class);
            }
        }
    }

    /* renamed from: c */
    private void m14336c() {
        View a;
        if (!C6391a.m13260a((Object) this)) {
            try {
                if (this.f12483h.getAndSet(false) && (a = C6650b.m14182a((Activity) this.f12481f.get())) != null) {
                    ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        if (Build.VERSION.SDK_INT < 16) {
                            viewTreeObserver.removeGlobalOnLayoutListener(this);
                        } else {
                            viewTreeObserver.removeOnGlobalLayoutListener(this);
                        }
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    public void onGlobalLayout() {
        if (!C6391a.m13260a((Object) this)) {
            try {
                m14332a();
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    static void m14333a(Activity activity) {
        if (!C6391a.m13260a((Object) C6690e.class)) {
            try {
                int hashCode = activity.hashCode();
                if (!f12480i.containsKey(Integer.valueOf(hashCode))) {
                    C6690e eVar = new C6690e(activity);
                    f12480i.put(Integer.valueOf(hashCode), eVar);
                    eVar.m14334b();
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, C6690e.class);
            }
        }
    }

    /* renamed from: b */
    private void m14334b() {
        View a;
        if (!C6391a.m13260a((Object) this)) {
            try {
                if (!this.f12483h.getAndSet(true) && (a = C6650b.m14182a((Activity) this.f12481f.get())) != null) {
                    ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        m14332a();
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    private void m14332a() {
        if (!C6391a.m13260a((Object) this)) {
            try {
                C6691a aVar = new C6691a();
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    aVar.run();
                } else {
                    this.f12482g.post(aVar);
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }
}
