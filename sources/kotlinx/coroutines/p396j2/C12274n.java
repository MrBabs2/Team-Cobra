package kotlinx.coroutines.p396j2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C12248i0;

/* renamed from: kotlinx.coroutines.j2.n */
/* compiled from: WorkQueue.kt */
public final class C12274n {

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f32085b;

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f32086c;

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f32087d;

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f32088e;

    /* renamed from: a */
    private final AtomicReferenceArray<C12269i> f32089a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer = 0;
    private volatile int consumerIndex = 0;
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;

    static {
        Class<C12274n> cls = C12274n.class;
        f32085b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f32086c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f32087d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f32088e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: d */
    private final C12269i m40473d() {
        C12269i andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f32087d.compareAndSet(this, i, i + 1) && (andSet = this.f32089a.getAndSet(i2, (Object) null)) != null) {
                m40471b(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: a */
    public final int mo38971a() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: b */
    public final int mo38975b() {
        return this.lastScheduledTask != null ? mo38971a() + 1 : mo38971a();
    }

    /* renamed from: c */
    public final C12269i mo38977c() {
        C12269i iVar = (C12269i) f32085b.getAndSet(this, (Object) null);
        return iVar != null ? iVar : m40473d();
    }

    /* renamed from: a */
    public static /* synthetic */ C12269i m40470a(C12274n nVar, C12269i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return nVar.mo38973a(iVar, z);
    }

    /* renamed from: b */
    public final long mo38976b(C12274n nVar) {
        boolean z = true;
        if (C12248i0.m40396a()) {
            if (!(mo38971a() == 0)) {
                throw new AssertionError();
            }
        }
        C12269i d = nVar.m40473d();
        if (d == null) {
            return m40468a(nVar, false);
        }
        C12269i a = m40470a(this, d, false, 2, (Object) null);
        if (!C12248i0.m40396a()) {
            return -1;
        }
        if (a != null) {
            z = false;
        }
        if (z) {
            return -1;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public final C12269i mo38973a(C12269i iVar, boolean z) {
        if (z) {
            return m40469a(iVar);
        }
        C12269i iVar2 = (C12269i) f32085b.getAndSet(this, iVar);
        if (iVar2 != null) {
            return m40469a(iVar2);
        }
        return null;
    }

    /* renamed from: a */
    public final long mo38972a(C12274n nVar) {
        if (C12248i0.m40396a()) {
            if (!(mo38971a() == 0)) {
                throw new AssertionError();
            }
        }
        int i = nVar.producerIndex;
        AtomicReferenceArray<C12269i> atomicReferenceArray = nVar.f32089a;
        for (int i2 = nVar.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            C12269i iVar = atomicReferenceArray.get(i3);
            if (iVar != null) {
                if ((iVar.f32078g.mo38967i() == 1) && atomicReferenceArray.compareAndSet(i3, iVar, (Object) null)) {
                    f32088e.decrementAndGet(nVar);
                    m40470a(this, iVar, false, 2, (Object) null);
                    return -1;
                }
            }
        }
        return m40468a(nVar, true);
    }

    /* renamed from: b */
    private final boolean m40472b(C12265e eVar) {
        C12269i d = m40473d();
        if (d == null) {
            return false;
        }
        eVar.mo38884a(d);
        return true;
    }

    /* renamed from: b */
    private final void m40471b(C12269i iVar) {
        if (iVar != null) {
            boolean z = false;
            if (iVar.f32078g.mo38967i() == 1) {
                int decrementAndGet = f32088e.decrementAndGet(this);
                if (C12248i0.m40396a()) {
                    if (decrementAndGet >= 0) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo38974a(C12265e eVar) {
        C12269i iVar = (C12269i) f32085b.getAndSet(this, (Object) null);
        if (iVar != null) {
            eVar.mo38884a(iVar);
        }
        do {
        } while (m40472b(eVar));
    }

    /* renamed from: a */
    private final long m40468a(C12274n nVar, boolean z) {
        C12269i iVar;
        do {
            iVar = (C12269i) nVar.lastScheduledTask;
            if (iVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (iVar.f32078g.mo38967i() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = C12272l.f32084e.mo38968a() - iVar.f32077f;
            long j = C12272l.f32080a;
            if (a < j) {
                return j - a;
            }
        } while (!f32085b.compareAndSet(nVar, iVar, (Object) null));
        m40470a(this, iVar, false, 2, (Object) null);
        return -1;
    }

    /* renamed from: a */
    private final C12269i m40469a(C12269i iVar) {
        boolean z = true;
        if (iVar.f32078g.mo38967i() != 1) {
            z = false;
        }
        if (z) {
            f32088e.incrementAndGet(this);
        }
        if (mo38971a() == 127) {
            return iVar;
        }
        int i = this.producerIndex & 127;
        while (this.f32089a.get(i) != null) {
            Thread.yield();
        }
        this.f32089a.lazySet(i, iVar);
        f32086c.incrementAndGet(this);
        return null;
    }
}
