package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.p013j.C0955c;
import p112n.p277e.p298c.p299a.p300a.C10661a;

public abstract class Worker extends ListenableWorker {
    C0955c<ListenableWorker.C0815a> mFuture;

    /* renamed from: androidx.work.Worker$a */
    class C0819a implements Runnable {
        C0819a() {
        }

        public void run() {
            try {
                Worker.this.mFuture.mo4938a(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.mFuture.mo4939a(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.C0815a doWork();

    public final C10661a<ListenableWorker.C0815a> startWork() {
        this.mFuture = C0955c.m4117d();
        getBackgroundExecutor().execute(new C0819a());
        return this.mFuture;
    }
}
