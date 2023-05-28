package p123rx.exceptions;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import p123rx.C12474i;
import p123rx.C5372f;

/* renamed from: rx.exceptions.a */
/* compiled from: Exceptions */
public final class C12472a {
    /* renamed from: a */
    public static void m40938a(Throwable th, Throwable th2) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i < 25) {
                th = th.getCause();
                if (!hashSet.contains(th.getCause())) {
                    hashSet.add(th.getCause());
                    i = i2;
                }
            } else {
                return;
            }
        }
        try {
            th.initCause(th2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static RuntimeException m40944b(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: c */
    public static void m40945c(Throwable th) {
        if (th instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th);
        } else if (th instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th);
        } else if (th instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th);
        } else if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: a */
    public static Throwable m40937a(Throwable th) {
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th = th.getCause();
            i = i2;
        }
        return th;
    }

    /* renamed from: a */
    public static void m40943a(List<? extends Throwable> list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                Throwable th = (Throwable) list.get(0);
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                } else if (th instanceof Error) {
                    throw ((Error) th);
                } else {
                    throw new RuntimeException(th);
                }
            } else {
                throw new CompositeException((Collection<? extends Throwable>) list);
            }
        }
    }

    /* renamed from: a */
    public static void m40940a(Throwable th, C5372f<?> fVar, Object obj) {
        m40945c(th);
        fVar.onError(OnErrorThrowable.m40933a(th, obj));
    }

    /* renamed from: a */
    public static void m40942a(Throwable th, C12474i<?> iVar, Object obj) {
        m40945c(th);
        iVar.onError(OnErrorThrowable.m40933a(th, obj));
    }

    /* renamed from: a */
    public static void m40939a(Throwable th, C5372f<?> fVar) {
        m40945c(th);
        fVar.onError(th);
    }

    /* renamed from: a */
    public static void m40941a(Throwable th, C12474i<?> iVar) {
        m40945c(th);
        iVar.onError(th);
    }
}
