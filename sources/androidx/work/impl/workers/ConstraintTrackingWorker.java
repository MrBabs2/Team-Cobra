package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C0834i;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C0868h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p009k.C0876c;
import androidx.work.impl.p009k.C0877d;
import androidx.work.impl.p012l.C0911j;
import androidx.work.impl.utils.p013j.C0955c;
import androidx.work.impl.utils.p014k.C0956a;
import java.util.Collections;
import java.util.List;
import p112n.p277e.p298c.p299a.p300a.C10661a;

public class ConstraintTrackingWorker extends ListenableWorker implements C0876c {

    /* renamed from: k */
    private static final String f3305k = C0834i.m3721a("ConstraintTrkngWrkr");

    /* renamed from: f */
    private WorkerParameters f3306f;

    /* renamed from: g */
    final Object f3307g = new Object();

    /* renamed from: h */
    volatile boolean f3308h = false;

    /* renamed from: i */
    C0955c<ListenableWorker.C0815a> f3309i = C0955c.m4117d();

    /* renamed from: j */
    private ListenableWorker f3310j;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    class C0959a implements Runnable {
        C0959a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.mo4968d();
        }
    }

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    class C0960b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C10661a f3312f;

        C0960b(C10661a aVar) {
            this.f3312f = aVar;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f3307g) {
                if (ConstraintTrackingWorker.this.f3308h) {
                    ConstraintTrackingWorker.this.mo4967c();
                } else {
                    ConstraintTrackingWorker.this.f3309i.mo4940a(this.f3312f);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3306f = workerParameters;
    }

    /* renamed from: a */
    public WorkDatabase mo4965a() {
        return C0868h.m3846a(getApplicationContext()).mo4808f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4966b() {
        this.f3309i.mo4938a(ListenableWorker.C0815a.m3647a());
    }

    /* renamed from: b */
    public void mo4749b(List<String> list) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4967c() {
        this.f3309i.mo4938a(ListenableWorker.C0815a.m3649b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4968d() {
        String a = getInputData().mo4714a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(a)) {
            C0834i.m3720a().mo4727b(f3305k, "No worker to delegate to.", new Throwable[0]);
            mo4966b();
            return;
        }
        ListenableWorker createWorkerWithDefaultFallback = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), a, this.f3306f);
        this.f3310j = createWorkerWithDefaultFallback;
        if (createWorkerWithDefaultFallback == null) {
            C0834i.m3720a().mo4726a(f3305k, "No worker to delegate to.", new Throwable[0]);
            mo4966b();
            return;
        }
        C0911j d = mo4965a().mo4734d().mo4903d(getId().toString());
        if (d == null) {
            mo4966b();
            return;
        }
        C0877d dVar = new C0877d(getApplicationContext(), getTaskExecutor(), this);
        dVar.mo4834c(Collections.singletonList(d));
        if (dVar.mo4832a(getId().toString())) {
            C0834i.m3720a().mo4726a(f3305k, String.format("Constraints met for delegate %s", new Object[]{a}), new Throwable[0]);
            try {
                C10661a<ListenableWorker.C0815a> startWork = this.f3310j.startWork();
                startWork.mo4937a(new C0960b(startWork), getBackgroundExecutor());
            } catch (Throwable th) {
                C0834i.m3720a().mo4726a(f3305k, String.format("Delegated worker %s threw exception in startWork.", new Object[]{a}), th);
                synchronized (this.f3307g) {
                    if (this.f3308h) {
                        C0834i.m3720a().mo4726a(f3305k, "Constraints were unmet, Retrying.", new Throwable[0]);
                        mo4967c();
                    } else {
                        mo4966b();
                    }
                }
            }
        } else {
            C0834i.m3720a().mo4726a(f3305k, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{a}), new Throwable[0]);
            mo4967c();
        }
    }

    public C0956a getTaskExecutor() {
        return C0868h.m3846a(getApplicationContext()).mo4809g();
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f3310j;
        if (listenableWorker != null) {
            listenableWorker.stop();
        }
    }

    public C10661a<ListenableWorker.C0815a> startWork() {
        getBackgroundExecutor().execute(new C0959a());
        return this.f3309i;
    }

    /* renamed from: a */
    public void mo4748a(List<String> list) {
        C0834i.m3720a().mo4726a(f3305k, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f3307g) {
            this.f3308h = true;
        }
    }
}
