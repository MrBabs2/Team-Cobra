package p015cm.aptoide.p016pt.sync.alarm;

import android.content.Context;
import androidx.work.C0829e;
import androidx.work.C0831f;
import androidx.work.C0832g;
import androidx.work.C0962k;
import androidx.work.C0970m;
import androidx.work.C0975q;
import java.util.concurrent.TimeUnit;
import p015cm.aptoide.p016pt.notification.NotificationWorker;
import p015cm.aptoide.p016pt.sync.Sync;
import p015cm.aptoide.p016pt.sync.SyncScheduler;

/* renamed from: cm.aptoide.pt.sync.alarm.AlarmSyncScheduler */
public class AlarmSyncScheduler implements SyncScheduler {
    public static final String ACTION_SYNC = "cm.aptoide.pt.sync.alarm.action.SYNC";
    public static final String EXTRA_RESCHEDULE = "cm.aptoide.pt.sync.alarm.extra.RESCHEDULE";
    private final Context context;
    private final SyncStorage syncStorage;

    public AlarmSyncScheduler(Context context2, SyncStorage syncStorage2) {
        this.context = context2;
        this.syncStorage = syncStorage2;
    }

    private void scheduleOneOffSync(Sync sync) {
        this.syncStorage.save(sync);
        setOneOffWorker(sync);
    }

    private void schedulePeriodicSync(Sync sync) {
        this.syncStorage.save(sync);
        setPeriodicWorker(sync);
    }

    private void setOneOffWorker(Sync sync) {
        C0829e.C0830a aVar = new C0829e.C0830a();
        aVar.mo4722a("sync_id", sync.getId());
        aVar.mo4722a("action", ACTION_SYNC);
        aVar.mo4723a(EXTRA_RESCHEDULE, false);
        C0829e a = aVar.mo4725a();
        C0975q.m4144a(this.context).mo4978a(sync.getId(), C0832g.REPLACE, (C0962k) ((C0962k.C0963a) new C0962k.C0963a(NotificationWorker.class).mo4984a(a)).mo4986a());
    }

    private void setPeriodicWorker(Sync sync) {
        C0829e.C0830a aVar = new C0829e.C0830a();
        aVar.mo4722a("sync_id", sync.getId());
        aVar.mo4722a("action", ACTION_SYNC);
        aVar.mo4723a(EXTRA_RESCHEDULE, false);
        C0829e a = aVar.mo4725a();
        C0975q.m4144a(this.context).mo4796a(sync.getId(), C0831f.KEEP, (C0970m) ((C0970m.C0971a) ((C0970m.C0971a) new C0970m.C0971a(NotificationWorker.class, sync.getInterval(), TimeUnit.MILLISECONDS).mo4984a(a)).mo4982a(sync.getInterval(), TimeUnit.MILLISECONDS)).mo4986a());
    }

    public void cancel(String str) {
        C0975q.m4144a(this.context).mo4802b(str);
        this.syncStorage.remove(str);
    }

    public void reschedule(Sync sync) {
        schedule(sync);
    }

    public void schedule(Sync sync) {
        if (sync.isPeriodic()) {
            schedulePeriodicSync(sync);
        } else {
            scheduleOneOffSync(sync);
        }
    }
}
