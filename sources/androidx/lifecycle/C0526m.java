package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.m */
/* compiled from: LifecycleService */
public class C0526m extends Service implements C0521j {

    /* renamed from: f */
    private final C0540u f2184f = new C0540u(this);

    public C0514f getLifecycle() {
        return this.f2184f.mo3087a();
    }

    public IBinder onBind(Intent intent) {
        this.f2184f.mo3088b();
        return null;
    }

    public void onCreate() {
        this.f2184f.mo3089c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f2184f.mo3090d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.f2184f.mo3091e();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
