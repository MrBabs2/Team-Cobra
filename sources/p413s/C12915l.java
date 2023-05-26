package p413s;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C10202j;

/* renamed from: s.l */
/* compiled from: ForwardingTimeout.kt */
public class C12915l extends C12894b0 {

    /* renamed from: a */
    private C12894b0 f33163a;

    public C12915l(C12894b0 b0Var) {
        C10202j.m34178b(b0Var, "delegate");
        this.f33163a = b0Var;
    }

    /* renamed from: a */
    public final C12894b0 mo41256a() {
        return this.f33163a;
    }

    public C12894b0 clearDeadline() {
        return this.f33163a.clearDeadline();
    }

    public C12894b0 clearTimeout() {
        return this.f33163a.clearTimeout();
    }

    public long deadlineNanoTime() {
        return this.f33163a.deadlineNanoTime();
    }

    public boolean hasDeadline() {
        return this.f33163a.hasDeadline();
    }

    public void throwIfReached() throws IOException {
        this.f33163a.throwIfReached();
    }

    public C12894b0 timeout(long j, TimeUnit timeUnit) {
        C10202j.m34178b(timeUnit, "unit");
        return this.f33163a.timeout(j, timeUnit);
    }

    public long timeoutNanos() {
        return this.f33163a.timeoutNanos();
    }

    /* renamed from: a */
    public final C12915l mo41257a(C12894b0 b0Var) {
        C10202j.m34178b(b0Var, "delegate");
        this.f33163a = b0Var;
        return this;
    }

    public C12894b0 deadlineNanoTime(long j) {
        return this.f33163a.deadlineNanoTime(j);
    }
}
