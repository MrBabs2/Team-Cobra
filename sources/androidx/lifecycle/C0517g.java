package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.g */
/* compiled from: LifecycleDispatcher */
class C0517g {

    /* renamed from: a */
    private static AtomicBoolean f2172a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.g$a */
    /* compiled from: LifecycleDispatcher */
    static class C0518a extends C0510b {
        C0518a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0537t.m2618b(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m2574a(Context context) {
        if (!f2172a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0518a());
        }
    }
}
