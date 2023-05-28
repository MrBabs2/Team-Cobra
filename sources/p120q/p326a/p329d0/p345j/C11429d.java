package p120q.p326a.p329d0.p345j;

import java.util.concurrent.atomic.AtomicLong;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.j.d */
/* compiled from: BackpressureHelper */
public final class C11429d {
    /* renamed from: a */
    public static long m37450a(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: a */
    public static long m37451a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m37450a(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m37452b(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                C11459a.m37531b((Throwable) new IllegalStateException("More produced than requested: " + j3));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
