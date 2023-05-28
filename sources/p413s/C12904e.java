package p413s;

import kotlin.jvm.internal.C10202j;

/* renamed from: s.e */
/* compiled from: Okio.kt */
final class C12904e implements C12932y {
    public void close() {
    }

    public void flush() {
    }

    public C12894b0 timeout() {
        return C12894b0.NONE;
    }

    public void write(C12905f fVar, long j) {
        C10202j.m34178b(fVar, "source");
        fVar.skip(j);
    }
}
