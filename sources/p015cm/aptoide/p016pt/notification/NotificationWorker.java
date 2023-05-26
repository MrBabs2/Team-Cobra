package p015cm.aptoide.p016pt.notification;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.sync.Sync;
import p015cm.aptoide.p016pt.sync.SyncScheduler;
import p015cm.aptoide.p016pt.sync.alarm.AlarmSyncScheduler;
import p015cm.aptoide.p016pt.sync.alarm.SyncStorage;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo16641d2 = {"Lcm/aptoide/pt/notification/NotificationWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "scheduler", "Lcm/aptoide/pt/sync/SyncScheduler;", "storage", "Lcm/aptoide/pt/sync/alarm/SyncStorage;", "crashReport", "Lcm/aptoide/pt/crashreports/CrashReport;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcm/aptoide/pt/sync/SyncScheduler;Lcm/aptoide/pt/sync/alarm/SyncStorage;Lcm/aptoide/pt/crashreports/CrashReport;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.NotificationWorker */
/* compiled from: NotificationWorker.kt */
public final class NotificationWorker extends Worker {
    /* access modifiers changed from: private */
    public final CrashReport crashReport;
    /* access modifiers changed from: private */
    public final SyncScheduler scheduler;
    private final SyncStorage storage;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationWorker(Context context, WorkerParameters workerParameters, SyncScheduler syncScheduler, SyncStorage syncStorage, CrashReport crashReport2) {
        super(context, workerParameters);
        C10202j.m34178b(context, "context");
        C10202j.m34178b(workerParameters, "workerParameters");
        C10202j.m34178b(syncScheduler, "scheduler");
        C10202j.m34178b(syncStorage, "storage");
        C10202j.m34178b(crashReport2, "crashReport");
        this.scheduler = syncScheduler;
        this.storage = syncStorage;
        this.crashReport = crashReport2;
    }

    public ListenableWorker.C0815a doWork() {
        if (C10202j.m34176a((Object) AlarmSyncScheduler.ACTION_SYNC, (Object) getInputData().mo4714a("action"))) {
            String a = getInputData().mo4714a("sync_id");
            Sync sync = this.storage.get(a);
            C10202j.m34174a((Object) sync, "storage.get(syncId)");
            boolean a2 = getInputData().mo4716a(AlarmSyncScheduler.EXTRA_RESCHEDULE, false);
            if (sync != null) {
                sync.execute().mo18601b((C5377a) new NotificationWorker$doWork$1(this, a, a2, sync)).mo18594a((C5377a) NotificationWorker$doWork$2.INSTANCE, (C5378b<? super Throwable>) new NotificationWorker$doWork$3(this));
            } else {
                this.scheduler.cancel(a);
            }
        }
        ListenableWorker.C0815a c = ListenableWorker.C0815a.m3650c();
        C10202j.m34174a((Object) c, "Result.success()");
        return c;
    }
}
