package androidx.work.impl.utils.p013j;

import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.j.b */
/* compiled from: DirectExecutor */
enum C0954b implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
