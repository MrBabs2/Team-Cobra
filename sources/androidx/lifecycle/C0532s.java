package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0537t;

/* renamed from: androidx.lifecycle.s */
/* compiled from: ProcessLifecycleOwner */
public class C0532s implements C0521j {

    /* renamed from: n */
    private static final C0532s f2187n = new C0532s();

    /* renamed from: f */
    private int f2188f = 0;

    /* renamed from: g */
    private int f2189g = 0;

    /* renamed from: h */
    private boolean f2190h = true;

    /* renamed from: i */
    private boolean f2191i = true;

    /* renamed from: j */
    private Handler f2192j;

    /* renamed from: k */
    private final C0522k f2193k = new C0522k(this);

    /* renamed from: l */
    private Runnable f2194l = new C0533a();

    /* renamed from: m */
    C0537t.C0538a f2195m = new C0534b();

    /* renamed from: androidx.lifecycle.s$a */
    /* compiled from: ProcessLifecycleOwner */
    class C0533a implements Runnable {
        C0533a() {
        }

        public void run() {
            C0532s.this.mo3058e();
            C0532s.this.mo3059f();
        }
    }

    /* renamed from: androidx.lifecycle.s$b */
    /* compiled from: ProcessLifecycleOwner */
    class C0534b implements C0537t.C0538a {
        C0534b() {
        }

        /* renamed from: a */
        public void mo3061a() {
        }

        public void onResume() {
            C0532s.this.mo3055b();
        }

        public void onStart() {
            C0532s.this.mo3056c();
        }
    }

    /* renamed from: androidx.lifecycle.s$c */
    /* compiled from: ProcessLifecycleOwner */
    class C0535c extends C0510b {

        /* renamed from: androidx.lifecycle.s$c$a */
        /* compiled from: ProcessLifecycleOwner */
        class C0536a extends C0510b {
            C0536a() {
            }

            public void onActivityPostResumed(Activity activity) {
                C0532s.this.mo3055b();
            }

            public void onActivityPostStarted(Activity activity) {
                C0532s.this.mo3056c();
            }
        }

        C0535c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                C0537t.m2615a(activity).mo3067a(C0532s.this.f2195m);
            }
        }

        public void onActivityPaused(Activity activity) {
            C0532s.this.mo3053a();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C0536a());
        }

        public void onActivityStopped(Activity activity) {
            C0532s.this.mo3057d();
        }
    }

    private C0532s() {
    }

    /* renamed from: b */
    static void m2605b(Context context) {
        f2187n.mo3054a(context);
    }

    /* renamed from: g */
    public static C0521j m2606g() {
        return f2187n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3053a() {
        int i = this.f2189g - 1;
        this.f2189g = i;
        if (i == 0) {
            this.f2192j.postDelayed(this.f2194l, 700);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3056c() {
        int i = this.f2188f + 1;
        this.f2188f = i;
        if (i == 1 && this.f2191i) {
            this.f2193k.mo3042a(C0514f.C0515a.ON_START);
            this.f2191i = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3057d() {
        this.f2188f--;
        mo3059f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3058e() {
        if (this.f2189g == 0) {
            this.f2190h = true;
            this.f2193k.mo3042a(C0514f.C0515a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3059f() {
        if (this.f2188f == 0 && this.f2190h) {
            this.f2193k.mo3042a(C0514f.C0515a.ON_STOP);
            this.f2191i = true;
        }
    }

    public C0514f getLifecycle() {
        return this.f2193k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3055b() {
        int i = this.f2189g + 1;
        this.f2189g = i;
        if (i != 1) {
            return;
        }
        if (this.f2190h) {
            this.f2193k.mo3042a(C0514f.C0515a.ON_RESUME);
            this.f2190h = false;
            return;
        }
        this.f2192j.removeCallbacks(this.f2194l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3054a(Context context) {
        this.f2192j = new Handler();
        this.f2193k.mo3042a(C0514f.C0515a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0535c());
    }
}
