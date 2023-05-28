package p120q.p326a.p329d0.p344i;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.ProtocolViolationException;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p345j.C11429d;
import p120q.p326a.p348g0.C11459a;
import p415t.p416a.C12936c;

/* renamed from: q.a.d0.i.b */
/* compiled from: SubscriptionHelper */
public enum C11424b implements C12936c {
    CANCELLED;

    /* renamed from: a */
    public static boolean m37440a(C12936c cVar, C12936c cVar2) {
        if (cVar2 == null) {
            C11459a.m37531b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.cancel();
            m37434a();
            return false;
        }
    }

    public void cancel() {
    }

    public void request(long j) {
    }

    /* renamed from: a */
    public static void m37434a() {
        C11459a.m37531b((Throwable) new ProtocolViolationException("Subscription already set!"));
    }

    /* renamed from: a */
    public static boolean m37436a(long j) {
        if (j > 0) {
            return true;
        }
        C11459a.m37531b((Throwable) new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    /* renamed from: a */
    public static boolean m37439a(AtomicReference<C12936c> atomicReference, C12936c cVar) {
        C10910b.m36861a(cVar, "s is null");
        if (atomicReference.compareAndSet((Object) null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        m37434a();
        return false;
    }

    /* renamed from: a */
    public static boolean m37437a(AtomicReference<C12936c> atomicReference) {
        C12936c andSet;
        C12936c cVar = atomicReference.get();
        C11424b bVar = CANCELLED;
        if (cVar == bVar || (andSet = atomicReference.getAndSet(bVar)) == CANCELLED) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    /* renamed from: a */
    public static boolean m37438a(AtomicReference<C12936c> atomicReference, AtomicLong atomicLong, C12936c cVar) {
        if (!m37439a(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        cVar.request(andSet);
        return true;
    }

    /* renamed from: a */
    public static void m37435a(AtomicReference<C12936c> atomicReference, AtomicLong atomicLong, long j) {
        C12936c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.request(j);
        } else if (m37436a(j)) {
            C11429d.m37451a(atomicLong, j);
            C12936c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }
}
