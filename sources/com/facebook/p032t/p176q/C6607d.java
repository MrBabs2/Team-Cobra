package com.facebook.p032t.p176q;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.C6596m;
import com.facebook.p032t.p181u.C6650b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.t.q.d */
/* compiled from: MetadataViewObserver */
final class C6607d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: j */
    private static final Map<Integer, C6607d> f12271j = new HashMap();

    /* renamed from: f */
    private final Set<String> f12272f = new HashSet();

    /* renamed from: g */
    private final Handler f12273g;

    /* renamed from: h */
    private WeakReference<Activity> f12274h;

    /* renamed from: i */
    private AtomicBoolean f12275i;

    /* renamed from: com.facebook.t.q.d$a */
    /* compiled from: MetadataViewObserver */
    class C6608a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f12276f;

        C6608a(View view) {
            this.f12276f = view;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    if (this.f12276f instanceof EditText) {
                        C6607d.m14049a(C6607d.this, this.f12276f);
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    static {
        Class<C6607d> cls = C6607d.class;
    }

    private C6607d(Activity activity) {
        this.f12274h = new WeakReference<>(activity);
        this.f12273g = new Handler(Looper.getMainLooper());
        this.f12275i = new AtomicBoolean(false);
    }

    /* renamed from: a */
    static /* synthetic */ void m14049a(C6607d dVar, View view) {
        if (!C6391a.m13260a((Object) C6607d.class)) {
            try {
                dVar.m14052b(view);
            } catch (Throwable th) {
                C6391a.m13259a(th, C6607d.class);
            }
        }
    }

    /* renamed from: b */
    private void m14052b(View view) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                String lowerCase = ((EditText) view).getText().toString().trim().toLowerCase();
                if (!lowerCase.isEmpty() && !this.f12272f.contains(lowerCase)) {
                    if (lowerCase.length() <= 100) {
                        this.f12272f.add(lowerCase);
                        HashMap hashMap = new HashMap();
                        List<String> b = C6605b.m14036b(view);
                        List<String> list = null;
                        for (C6606c next : C6606c.m14041e()) {
                            String a = m14045a(next.mo21355b(), lowerCase);
                            if (next.mo21356c().isEmpty() || C6605b.m14033a(a, next.mo21356c())) {
                                if (C6605b.m14035a(b, next.mo21354a())) {
                                    m14051a(hashMap, next.mo21355b(), a);
                                } else {
                                    if (list == null) {
                                        list = C6605b.m14032a(view);
                                    }
                                    if (C6605b.m14035a(list, next.mo21354a())) {
                                        m14051a(hashMap, next.mo21355b(), a);
                                    }
                                }
                            }
                        }
                        C6596m.m13994a((Map<String, String>) hashMap);
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!C6391a.m13260a((Object) this)) {
            if (view != null) {
                try {
                    m14048a(view);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                    return;
                }
            }
            if (view2 != null) {
                m14048a(view2);
            }
        }
    }

    /* renamed from: a */
    static void m14047a(Activity activity) {
        C6607d dVar;
        if (!C6391a.m13260a((Object) C6607d.class)) {
            try {
                int hashCode = activity.hashCode();
                if (!f12271j.containsKey(Integer.valueOf(hashCode))) {
                    dVar = new C6607d(activity);
                    f12271j.put(Integer.valueOf(activity.hashCode()), dVar);
                } else {
                    dVar = f12271j.get(Integer.valueOf(hashCode));
                }
                dVar.m14046a();
            } catch (Throwable th) {
                C6391a.m13259a(th, C6607d.class);
            }
        }
    }

    /* renamed from: a */
    private void m14046a() {
        View a;
        if (!C6391a.m13260a((Object) this)) {
            try {
                if (!this.f12275i.getAndSet(true) && (a = C6650b.m14182a((Activity) this.f12274h.get())) != null) {
                    ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(this);
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    private void m14048a(View view) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                m14050a((Runnable) new C6608a(view));
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    private static String m14045a(String str, String str2) {
        if (C6391a.m13260a((Object) C6607d.class)) {
            return null;
        }
        try {
            return "r2".equals(str) ? str2.replaceAll("[^\\d.]", "") : str2;
        } catch (Throwable th) {
            C6391a.m13259a(th, C6607d.class);
            return null;
        }
    }

    /* renamed from: a */
    private static void m14051a(Map<String, String> map, String str, String str2) {
        if (!C6391a.m13260a((Object) C6607d.class)) {
            char c = 65535;
            try {
                switch (str.hashCode()) {
                    case 3585:
                        if (str.equals("r3")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3586:
                        if (str.equals("r4")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3587:
                        if (str.equals("r5")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3588:
                        if (str.equals("r6")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    if (!str2.startsWith("m") && !str2.startsWith("b")) {
                        if (!str2.startsWith("ge")) {
                            str2 = "f";
                        }
                    }
                    str2 = "m";
                } else if (c == 1 || c == 2) {
                    str2 = str2.replaceAll("[^a-z]+", "");
                } else if (c == 3) {
                    if (str2.contains("-")) {
                        str2 = str2.split("-")[0];
                    }
                }
                map.put(str, str2);
            } catch (Throwable th) {
                C6391a.m13259a(th, C6607d.class);
            }
        }
    }

    /* renamed from: a */
    private void m14050a(Runnable runnable) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    runnable.run();
                } else {
                    this.f12273g.post(runnable);
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }
}
