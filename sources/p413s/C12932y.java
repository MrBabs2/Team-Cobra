package p413s;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: s.y */
/* compiled from: Sink.kt */
public interface C12932y extends Closeable, Flushable {
    void close() throws IOException;

    void flush() throws IOException;

    C12894b0 timeout();

    void write(C12905f fVar, long j) throws IOException;
}
