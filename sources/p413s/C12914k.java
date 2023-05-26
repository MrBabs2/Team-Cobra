package p413s;

import java.io.IOException;
import kotlin.jvm.internal.C10202j;

/* renamed from: s.k */
/* compiled from: ForwardingSource.kt */
public abstract class C12914k implements C12892a0 {
    private final C12892a0 delegate;

    public C12914k(C12892a0 a0Var) {
        C10202j.m34178b(a0Var, "delegate");
        this.delegate = a0Var;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final C12892a0 m42081deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public final C12892a0 delegate() {
        return this.delegate;
    }

    public long read(C12905f fVar, long j) throws IOException {
        C10202j.m34178b(fVar, "sink");
        return this.delegate.read(fVar, j);
    }

    public C12894b0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
