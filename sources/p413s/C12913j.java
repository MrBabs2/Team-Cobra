package p413s;

import java.io.IOException;
import kotlin.jvm.internal.C10202j;

/* renamed from: s.j */
/* compiled from: ForwardingSink.kt */
public abstract class C12913j implements C12932y {
    private final C12932y delegate;

    public C12913j(C12932y yVar) {
        C10202j.m34178b(yVar, "delegate");
        this.delegate = yVar;
    }

    /* renamed from: -deprecated_delegate  reason: not valid java name */
    public final C12932y m42080deprecated_delegate() {
        return this.delegate;
    }

    public void close() throws IOException {
        this.delegate.close();
    }

    public final C12932y delegate() {
        return this.delegate;
    }

    public void flush() throws IOException {
        this.delegate.flush();
    }

    public C12894b0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    public void write(C12905f fVar, long j) throws IOException {
        C10202j.m34178b(fVar, "source");
        this.delegate.write(fVar, j);
    }
}
