package p120q.p326a.p329d0.p330a;

import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.ProtocolViolationException;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.a.d */
/* compiled from: DisposableHelper */
public enum C10867d implements C10842c {
    DISPOSED;

    /* renamed from: a */
    public static boolean m36775a(C10842c cVar) {
        return cVar == DISPOSED;
    }

    /* renamed from: b */
    public static boolean m36777b(AtomicReference<C10842c> atomicReference, C10842c cVar) {
        C10842c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.dispose();
        return true;
    }

    /* renamed from: c */
    public static boolean m36778c(AtomicReference<C10842c> atomicReference, C10842c cVar) {
        C10910b.m36861a(cVar, "d is null");
        if (atomicReference.compareAndSet((Object) null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        m36772a();
        return false;
    }

    /* renamed from: d */
    public static boolean m36779d(AtomicReference<C10842c> atomicReference, C10842c cVar) {
        if (atomicReference.compareAndSet((Object) null, cVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        cVar.dispose();
        return false;
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }

    /* renamed from: a */
    public static boolean m36774a(AtomicReference<C10842c> atomicReference, C10842c cVar) {
        C10842c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == DISPOSED) {
                if (cVar == null) {
                    return false;
                }
                cVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        return true;
    }

    /* renamed from: a */
    public static boolean m36773a(AtomicReference<C10842c> atomicReference) {
        C10842c andSet;
        C10842c cVar = atomicReference.get();
        C10867d dVar = DISPOSED;
        if (cVar == dVar || (andSet = atomicReference.getAndSet(dVar)) == dVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    /* renamed from: a */
    public static boolean m36776a(C10842c cVar, C10842c cVar2) {
        if (cVar2 == null) {
            C11459a.m37531b((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.dispose();
            m36772a();
            return false;
        }
    }

    /* renamed from: a */
    public static void m36772a() {
        C11459a.m37531b((Throwable) new ProtocolViolationException("Disposable already set!"));
    }
}
