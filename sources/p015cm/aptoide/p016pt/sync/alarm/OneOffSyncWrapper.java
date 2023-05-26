package p015cm.aptoide.p016pt.sync.alarm;

import p015cm.aptoide.p016pt.sync.Sync;
import p123rx.C5328b;

/* renamed from: cm.aptoide.pt.sync.alarm.OneOffSyncWrapper */
public class OneOffSyncWrapper extends Sync {
    private final Sync sync;

    public OneOffSyncWrapper(Sync sync2, long j) {
        super(sync2.getId(), sync2.isPeriodic(), sync2.isExact(), j, 0);
        this.sync = sync2;
    }

    public C5328b execute() {
        return this.sync.execute();
    }
}
