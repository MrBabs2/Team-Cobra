package p123rx.p401n.p402a;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.n.a.a */
/* compiled from: BackpressureUtils */
public final class C12502a {
    /* renamed from: a */
    public static long m40959a(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: a */
    public static long m40960a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j2, m40959a(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m40962b(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                throw new IllegalStateException("More produced than requested: " + j3);
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    /* renamed from: a */
    public static boolean m40961a(long j) {
        if (j >= 0) {
            return j != 0;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + j);
    }
}
