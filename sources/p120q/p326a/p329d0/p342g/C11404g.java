package p120q.p326a.p329d0.p342g;

import java.util.concurrent.ThreadFactory;
import p120q.p326a.C11491v;

/* renamed from: q.a.d0.g.g */
/* compiled from: NewThreadScheduler */
public final class C11404g extends C11491v {

    /* renamed from: c */
    private static final C11407j f30564c = new C11407j("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    final ThreadFactory f30565b;

    public C11404g() {
        this(f30564c);
    }

    /* renamed from: a */
    public C11491v.C11494c mo37114a() {
        return new C11405h(this.f30565b);
    }

    public C11404g(ThreadFactory threadFactory) {
        this.f30565b = threadFactory;
    }
}
