package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.f */
/* compiled from: Lifecycle */
public abstract class C0514f {

    /* renamed from: androidx.lifecycle.f$a */
    /* compiled from: Lifecycle */
    public enum C0515a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: androidx.lifecycle.f$b */
    /* compiled from: Lifecycle */
    public enum C0516b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo3041a(C0516b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public C0514f() {
        new AtomicReference();
    }

    /* renamed from: a */
    public abstract C0516b mo3038a();

    /* renamed from: a */
    public abstract void mo3039a(C0520i iVar);

    /* renamed from: b */
    public abstract void mo3040b(C0520i iVar);
}
