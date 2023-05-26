package p413s;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10201i;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;

@C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\u0000H\u0016J\b\u0010\t\u001a\u00020\u0000H\u0016J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001f\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\bJ\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo16641d2 = {"Lokio/Timeout;", "", "()V", "deadlineNanoTime", "", "hasDeadline", "", "timeoutNanos", "clearDeadline", "clearTimeout", "deadline", "duration", "unit", "Ljava/util/concurrent/TimeUnit;", "intersectWith", "", "other", "block", "Lkotlin/Function0;", "throwIfReached", "timeout", "waitUntilNotified", "monitor", "Companion", "jvm"}, mo16642k = 1, mo16643mv = {1, 1, 11})
/* renamed from: s.b0 */
/* compiled from: Timeout.kt */
public class C12894b0 {
    public static final C12896b Companion = new C12896b((DefaultConstructorMarker) null);
    public static final C12894b0 NONE = new C12895a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* renamed from: s.b0$a */
    /* compiled from: Timeout.kt */
    public static final class C12895a extends C12894b0 {
        C12895a() {
        }

        public C12894b0 deadlineNanoTime(long j) {
            return this;
        }

        public void throwIfReached() {
        }

        public C12894b0 timeout(long j, TimeUnit timeUnit) {
            C10202j.m34178b(timeUnit, "unit");
            return this;
        }
    }

    /* renamed from: s.b0$b */
    /* compiled from: Timeout.kt */
    public static final class C12896b {
        private C12896b() {
        }

        /* renamed from: a */
        public final long mo41121a(long j, long j2) {
            return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
        }

        public /* synthetic */ C12896b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C12894b0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public C12894b0 clearTimeout() {
        this.timeoutNanos = 0;
        return this;
    }

    public final C12894b0 deadline(long j, TimeUnit timeUnit) {
        C10202j.m34178b(timeUnit, "unit");
        if (j > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final void intersectWith(C12894b0 b0Var, C9102a<C10483v> aVar) {
        C10202j.m34178b(b0Var, "other");
        C10202j.m34178b(aVar, "block");
        long timeoutNanos2 = timeoutNanos();
        timeout(Companion.mo41121a(b0Var.timeoutNanos(), timeoutNanos()), TimeUnit.NANOSECONDS);
        if (hasDeadline()) {
            long deadlineNanoTime2 = deadlineNanoTime();
            if (b0Var.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), b0Var.deadlineNanoTime()));
            }
            try {
                aVar.invoke();
            } finally {
                C10201i.m34167b(1);
                timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
                if (b0Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime2);
                }
                C10201i.m34166a(1);
            }
        } else {
            if (b0Var.hasDeadline()) {
                deadlineNanoTime(b0Var.deadlineNanoTime());
            }
            try {
                aVar.invoke();
            } finally {
                C10201i.m34167b(1);
                timeout(timeoutNanos2, TimeUnit.NANOSECONDS);
                if (b0Var.hasDeadline()) {
                    clearDeadline();
                }
                C10201i.m34166a(1);
            }
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C12894b0 timeout(long j, TimeUnit timeUnit) {
        C10202j.m34178b(timeUnit, "unit");
        if (j >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        C10202j.m34178b(obj, "monitor");
        try {
            boolean hasDeadline2 = hasDeadline();
            long timeoutNanos2 = timeoutNanos();
            long j = 0;
            if (hasDeadline2 || timeoutNanos2 != 0) {
                long nanoTime = System.nanoTime();
                if (hasDeadline2 && timeoutNanos2 != 0) {
                    timeoutNanos2 = Math.min(timeoutNanos2, deadlineNanoTime() - nanoTime);
                } else if (hasDeadline2) {
                    timeoutNanos2 = deadlineNanoTime() - nanoTime;
                }
                if (timeoutNanos2 > 0) {
                    long j2 = timeoutNanos2 / 1000000;
                    Long.signum(j2);
                    obj.wait(j2, (int) (timeoutNanos2 - (1000000 * j2)));
                    j = System.nanoTime() - nanoTime;
                }
                if (j >= timeoutNanos2) {
                    throw new InterruptedIOException("timeout");
                }
                return;
            }
            obj.wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public C12894b0 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
