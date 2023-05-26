package p036io.rakam.api;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: io.rakam.api.l */
/* compiled from: WorkerThread */
public class C9029l extends HandlerThread {

    /* renamed from: f */
    private Handler f25562f;

    public C9029l(String str) {
        super(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33388a(Runnable runnable) {
        m29697a();
        this.f25562f.post(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33389a(Runnable runnable, long j) {
        m29697a();
        this.f25562f.postDelayed(runnable, j);
    }

    /* renamed from: a */
    private synchronized void m29697a() {
        if (this.f25562f == null) {
            this.f25562f = new Handler(getLooper());
        }
    }
}
