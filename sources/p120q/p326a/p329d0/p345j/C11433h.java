package p120q.p326a.p329d0.p345j;

import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.ProtocolViolationException;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.j.h */
/* compiled from: EndConsumerHelper */
public final class C11433h {
    /* renamed from: a */
    public static boolean m37462a(C10842c cVar, C10842c cVar2, Class<?> cls) {
        C10910b.m36861a(cVar2, "next is null");
        if (cVar == null) {
            return true;
        }
        cVar2.dispose();
        if (cVar == C10867d.DISPOSED) {
            return false;
        }
        m37460a(cls);
        return false;
    }

    /* renamed from: a */
    public static boolean m37461a(AtomicReference<C10842c> atomicReference, C10842c cVar, Class<?> cls) {
        C10910b.m36861a(cVar, "next is null");
        if (atomicReference.compareAndSet((Object) null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (atomicReference.get() == C10867d.DISPOSED) {
            return false;
        }
        m37460a(cls);
        return false;
    }

    /* renamed from: a */
    public static String m37459a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    /* renamed from: a */
    public static void m37460a(Class<?> cls) {
        C11459a.m37531b((Throwable) new ProtocolViolationException(m37459a(cls.getName())));
    }
}
