package androidx.work;

/* renamed from: androidx.work.p */
/* compiled from: WorkInfo */
public enum C0974p {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    /* renamed from: a */
    public boolean mo4977a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
