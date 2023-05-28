package androidx.work.impl.utils.p014k;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.C0938f;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.k.b */
/* compiled from: WorkManagerTaskExecutor */
public class C0957b implements C0956a {

    /* renamed from: a */
    private final Executor f3301a;

    /* renamed from: b */
    private final Handler f3302b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Executor f3303c = new C0958a();

    /* renamed from: androidx.work.impl.utils.k.b$a */
    /* compiled from: WorkManagerTaskExecutor */
    class C0958a implements Executor {
        C0958a() {
        }

        public void execute(Runnable runnable) {
            C0957b.this.mo4963b(runnable);
        }
    }

    public C0957b(Executor executor) {
        this.f3301a = new C0938f(executor);
    }

    /* renamed from: a */
    public Executor mo4960a() {
        return this.f3303c;
    }

    /* renamed from: b */
    public void mo4963b(Runnable runnable) {
        this.f3302b.post(runnable);
    }

    /* renamed from: a */
    public void mo4961a(Runnable runnable) {
        this.f3301a.execute(runnable);
    }

    /* renamed from: b */
    public Executor mo4962b() {
        return this.f3301a;
    }
}
