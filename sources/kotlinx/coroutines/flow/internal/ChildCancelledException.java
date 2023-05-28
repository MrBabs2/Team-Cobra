package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.C4789l;
import kotlinx.coroutines.C12248i0;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo16641d2 = {"Lkotlinx/coroutines/flow/internal/ChildCancelledException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "()V", "fillInStackTrace", "", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* compiled from: FlowExceptions.kt */
public final class ChildCancelledException extends CancellationException {
    public ChildCancelledException() {
        super("Child of the scoped flow was cancelled");
    }

    public Throwable fillInStackTrace() {
        if (C12248i0.m40398c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
