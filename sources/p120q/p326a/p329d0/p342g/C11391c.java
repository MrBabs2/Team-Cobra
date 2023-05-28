package p120q.p326a.p329d0.p342g;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p120q.p326a.p327b0.C10842c;

/* renamed from: q.a.d0.g.c */
/* compiled from: DisposeOnCancel */
final class C11391c implements Future<Object> {

    /* renamed from: f */
    final C10842c f30518f;

    C11391c(C10842c cVar) {
        this.f30518f = cVar;
    }

    public boolean cancel(boolean z) {
        this.f30518f.dispose();
        return false;
    }

    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }
}
