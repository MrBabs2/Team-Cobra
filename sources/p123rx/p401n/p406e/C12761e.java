package p123rx.p401n.p406e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import p123rx.exceptions.CompositeException;

/* renamed from: rx.n.e.e */
/* compiled from: ExceptionsUtils */
public enum C12761e {
    ;
    

    /* renamed from: f */
    private static final Throwable f32949f = null;

    static {
        f32949f = new Throwable("Terminated");
    }

    /* renamed from: a */
    public static boolean m41256a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == f32949f) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).mo40644a());
                arrayList.add(th);
                th3 = new CompositeException((Collection<? extends Throwable>) arrayList);
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }

    /* renamed from: a */
    public static Throwable m41254a(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f32949f;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: a */
    public static boolean m41255a(Throwable th) {
        return th == f32949f;
    }
}
