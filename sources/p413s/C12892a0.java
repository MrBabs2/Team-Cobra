package p413s;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: s.a0 */
/* compiled from: Source.kt */
public interface C12892a0 extends Closeable {
    void close() throws IOException;

    long read(C12905f fVar, long j) throws IOException;

    C12894b0 timeout();
}
