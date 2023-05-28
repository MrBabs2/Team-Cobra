package p120q.p326a.p329d0.p345j;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.CompositeException;

/* renamed from: q.a.d0.j.j */
/* compiled from: ExceptionHelper */
public final class C11435j {

    /* renamed from: a */
    public static final Throwable f30621a = new C11436a();

    /* renamed from: q.a.d0.j.j$a */
    /* compiled from: ExceptionHelper */
    static final class C11436a extends Throwable {
        C11436a() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static RuntimeException m37463a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public static <T> boolean m37466a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == f30621a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }

    /* renamed from: a */
    public static <T> Throwable m37465a(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = f30621a;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: a */
    public static String m37464a(long j, TimeUnit timeUnit) {
        return "The source did not signal an event for " + j + " " + timeUnit.toString().toLowerCase() + " and has been terminated.";
    }
}
