package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.C0514f;

/* renamed from: androidx.lifecycle.t */
/* compiled from: ReportFragment */
public class C0537t extends Fragment {

    /* renamed from: f */
    private C0538a f2198f;

    /* renamed from: androidx.lifecycle.t$a */
    /* compiled from: ReportFragment */
    interface C0538a {
        /* renamed from: a */
        void mo3061a();

        void onResume();

        void onStart();
    }

    /* renamed from: androidx.lifecycle.t$b */
    /* compiled from: ReportFragment */
    static class C0539b implements Application.ActivityLifecycleCallbacks {
        C0539b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C0537t.m2616a(activity, C0514f.C0515a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C0537t.m2616a(activity, C0514f.C0515a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C0537t.m2616a(activity, C0514f.C0515a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C0537t.m2616a(activity, C0514f.C0515a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C0537t.m2616a(activity, C0514f.C0515a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C0537t.m2616a(activity, C0514f.C0515a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m2616a(Activity activity, C0514f.C0515a aVar) {
        if (activity instanceof C0525l) {
            ((C0525l) activity).getLifecycle().mo3042a(aVar);
        } else if (activity instanceof C0521j) {
            C0514f lifecycle = ((C0521j) activity).getLifecycle();
            if (lifecycle instanceof C0522k) {
                ((C0522k) lifecycle).mo3042a(aVar);
            }
        }
    }

    /* renamed from: b */
    public static void m2618b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new C0539b());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new C0537t(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: c */
    private void m2620c(C0538a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: d */
    private void m2621d(C0538a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2619b(this.f2198f);
        m2617a(C0514f.C0515a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m2617a(C0514f.C0515a.ON_DESTROY);
        this.f2198f = null;
    }

    public void onPause() {
        super.onPause();
        m2617a(C0514f.C0515a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m2620c(this.f2198f);
        m2617a(C0514f.C0515a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m2621d(this.f2198f);
        m2617a(C0514f.C0515a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m2617a(C0514f.C0515a.ON_STOP);
    }

    /* renamed from: a */
    static C0537t m2615a(Activity activity) {
        return (C0537t) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: b */
    private void m2619b(C0538a aVar) {
        if (aVar != null) {
            aVar.mo3061a();
        }
    }

    /* renamed from: a */
    private void m2617a(C0514f.C0515a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m2616a(getActivity(), aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3067a(C0538a aVar) {
        this.f2198f = aVar;
    }
}
