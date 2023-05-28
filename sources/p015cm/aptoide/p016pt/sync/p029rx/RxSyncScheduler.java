package p015cm.aptoide.p016pt.sync.p029rx;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import p015cm.aptoide.analytics.implementation.CrashLogger;
import p015cm.aptoide.p016pt.sync.Sync;
import p015cm.aptoide.p016pt.sync.SyncScheduler;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.sync.rx.RxSyncScheduler */
public class RxSyncScheduler implements SyncScheduler {
    private final CrashLogger consoleLogger;
    private final Map<String, C5375k> subscriptionStorage;

    public RxSyncScheduler(Map<String, C5375k> map, CrashLogger crashLogger) {
        this.subscriptionStorage = map;
        this.consoleLogger = crashLogger;
    }

    /* renamed from: a */
    static /* synthetic */ void m7406a(Object obj) {
    }

    /* renamed from: c */
    static /* synthetic */ void m7407c(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    private boolean isSyncScheduled(String str) {
        return this.subscriptionStorage.containsKey(str);
    }

    private void scheduleOneOffSync(Sync sync) {
        this.subscriptionStorage.put(sync.getId(), sync.execute().mo18594a((C5377a) new C4395e(this, sync), (C5378b<? super Throwable>) new C4391a(this)));
    }

    private void schedulePeriodicSync(Sync sync) {
        if (!isSyncScheduled(sync.getId())) {
            this.subscriptionStorage.put(sync.getId(), C5368e.m10232a(sync.getTrigger(), sync.getInterval(), TimeUnit.MILLISECONDS).mo18703o(new C4393c(this, sync)).mo18655a(C4392b.f7548f, (C5378b<Throwable>) C4396f.f7554f));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14864a(Sync sync) {
        this.subscriptionStorage.remove(sync.getId());
    }

    /* renamed from: b */
    public /* synthetic */ void mo14866b(Throwable th) {
        this.consoleLogger.log(th);
    }

    public synchronized void cancel(String str) {
        C5375k remove = this.subscriptionStorage.remove(str);
        if (remove != null) {
            remove.unsubscribe();
        }
    }

    public synchronized void reschedule(Sync sync) {
        if (isSyncScheduled(sync.getId())) {
            cancel(sync.getId());
            schedule(sync);
        }
    }

    public synchronized void schedule(Sync sync) {
        if (sync.isPeriodic()) {
            schedulePeriodicSync(sync);
        } else {
            scheduleOneOffSync(sync);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14865a(Throwable th) {
        this.consoleLogger.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14863a(Sync sync, Long l) {
        return sync.execute().mo18590a((C5378b<? super Throwable>) new C4394d(this)).mo18598b().mo18610e();
    }
}
