package p015cm.aptoide.p016pt.sync;

/* renamed from: cm.aptoide.pt.sync.SyncScheduler */
public interface SyncScheduler {
    void cancel(String str);

    void reschedule(Sync sync);

    void schedule(Sync sync);
}
