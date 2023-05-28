package p015cm.aptoide.p016pt.sync;

import p123rx.C5328b;

/* renamed from: cm.aptoide.pt.sync.Sync */
public abstract class Sync {
    private final boolean exact;

    /* renamed from: id */
    private final String f7542id;
    private final long interval;
    private final boolean periodic;
    private final long trigger;

    public Sync(String str, boolean z, boolean z2, long j, long j2) {
        this.f7542id = str;
        this.periodic = z;
        this.exact = z2;
        this.trigger = j;
        this.interval = j2;
    }

    public abstract C5328b execute();

    public String getId() {
        return this.f7542id;
    }

    public long getInterval() {
        return this.interval;
    }

    public long getTrigger() {
        return this.trigger;
    }

    public boolean isExact() {
        return this.exact;
    }

    public boolean isPeriodic() {
        return this.periodic;
    }
}
