package p036io.rakam.api;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: io.rakam.api.g */
/* compiled from: RakamCallbacks */
class C9025g implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g */
    private static C9026i f25555g = C9026i.m29670a();

    /* renamed from: f */
    private C4760h f25556f = null;

    public C9025g(C4760h hVar) {
        if (hVar == null) {
            f25555g.mo33373b("io.rakam.api.RakamCallbacks", "Need to initialize RakamCallbacks with RakamClient instance");
            return;
        }
        this.f25556f = hVar;
        hVar.mo16588d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo33361a() {
        return System.currentTimeMillis();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        C4760h hVar = this.f25556f;
        if (hVar == null) {
            f25555g.mo33373b("io.rakam.api.RakamCallbacks", "Need to initialize RakamCallbacks with RakamClient instance");
        } else {
            hVar.mo16581b(mo33361a());
        }
    }

    public void onActivityResumed(Activity activity) {
        C4760h hVar = this.f25556f;
        if (hVar == null) {
            f25555g.mo33373b("io.rakam.api.RakamCallbacks", "Need to initialize RakamCallbacks with RakamClient instance");
        } else {
            hVar.mo16571a(mo33361a());
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
