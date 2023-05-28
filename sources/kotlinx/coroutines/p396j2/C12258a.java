package kotlinx.coroutines.p396j2;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p219f0.C9138c;
import kotlinx.coroutines.C12177a2;
import kotlinx.coroutines.C12182b2;
import kotlinx.coroutines.C12248i0;
import kotlinx.coroutines.C12256j0;
import kotlinx.coroutines.p393g2.C12230o;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000 \\2\u00020`2\u00020a:\u0003\\]^B+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\b¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001f\u001a\u00020\n2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\b¢\u0006\u0004\b \u0010\u0011J\u0015\u0010\"\u001a\b\u0018\u00010!R\u00020\u0000H\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0013H\b¢\u0006\u0004\b$\u0010\u0015J\u0010\u0010%\u001a\u00020\u0001H\b¢\u0006\u0004\b%\u0010\u0017J-\u0010'\u001a\u00020\u00132\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020\f¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u00020\u00132\n\u0010)\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004H\b¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0001H\b¢\u0006\u0004\b.\u0010\u0017J\u001b\u00100\u001a\u00020\u00012\n\u0010/\u001a\u00060!R\u00020\u0000H\u0002¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\b\u0018\u00010!R\u00020\u0000H\u0002¢\u0006\u0004\b2\u0010#J\u001b\u00105\u001a\u00020\f2\n\u0010/\u001a\u00060!R\u00020\u0000H\u0000¢\u0006\u0004\b3\u00104J+\u0010:\u001a\u00020\u00132\n\u0010/\u001a\u00060!R\u00020\u00002\u0006\u00106\u001a\u00020\u00012\u0006\u00107\u001a\u00020\u0001H\u0000¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020\u0004H\b¢\u0006\u0004\b;\u0010-J\u0015\u0010<\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\fH\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020\u0013H\u0000¢\u0006\u0004\bD\u0010\u0015J\u000f\u0010F\u001a\u00020\u0006H\u0016¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\fH\b¢\u0006\u0004\bH\u0010IJ\u0019\u0010J\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\fH\u0002¢\u0006\u0004\bL\u0010IJ+\u0010M\u001a\u0004\u0018\u00010\n*\b\u0018\u00010!R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0010\u001a\u00020\u00018Â\u0002@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00018\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010PR\u0017\u0010 \u001a\u00020\u00018Â\u0002@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0017R\u0016\u0010S\u001a\u00020R8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020R8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bU\u0010TR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010VR\u0013\u0010W\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\bW\u0010IR\u0016\u0010\u0003\u001a\u00020\u00018\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010PR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010XR\"\u0010Z\u001a\u000e\u0012\n\u0012\b\u0018\u00010!R\u00020\u00000Y8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006_"}, mo16641d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "addToGlobalQueue", "(Lkotlinx/coroutines/scheduling/Task;)Z", "state", "availableCpuPermits", "(J)I", "blockingTasks", "", "close", "()V", "createNewWorker", "()I", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "createTask$kotlinx_coroutines_core", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;", "createTask", "createdWorkers", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "currentWorker", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "decrementBlockingTasks", "decrementCreatedWorkers", "tailDispatch", "dispatch", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "incrementBlockingTasks", "()J", "incrementCreatedWorkers", "worker", "parkedWorkersStackNextIndex", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I", "parkedWorkersStackPop", "parkedWorkersStackPush$kotlinx_coroutines_core", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)Z", "parkedWorkersStackPush", "oldIndex", "newIndex", "parkedWorkersStackTopUpdate$kotlinx_coroutines_core", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V", "parkedWorkersStackTopUpdate", "releaseCpuPermit", "runSafely", "(Lkotlinx/coroutines/scheduling/Task;)V", "timeout", "shutdown", "(J)V", "skipUnpark", "signalBlockingWork", "(Z)V", "signalCpuWork$kotlinx_coroutines_core", "signalCpuWork", "toString", "()Ljava/lang/String;", "tryAcquireCpuPermit", "()Z", "tryCreateWorker", "(J)Z", "tryUnpark", "submitToLocalQueue", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "getAvailableCpuPermits", "I", "getCreatedWorkers", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "J", "isTerminated", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "workers", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.j2.a */
/* compiled from: CoroutineScheduler.kt */
public final class C12258a implements Executor, Closeable {

    /* renamed from: m */
    private static final AtomicLongFieldUpdater f32036m = AtomicLongFieldUpdater.newUpdater(C12258a.class, "parkedWorkersStack");

    /* renamed from: n */
    static final AtomicLongFieldUpdater f32037n = AtomicLongFieldUpdater.newUpdater(C12258a.class, "controlState");

    /* renamed from: o */
    private static final AtomicIntegerFieldUpdater f32038o = AtomicIntegerFieldUpdater.newUpdater(C12258a.class, "_isTerminated");

    /* renamed from: p */
    public static final C12230o f32039p = new C12230o("NOT_IN_STACK");
    private volatile int _isTerminated;
    volatile long controlState;

    /* renamed from: f */
    public final C12265e f32040f;

    /* renamed from: g */
    public final C12265e f32041g;

    /* renamed from: h */
    public final AtomicReferenceArray<C12260b> f32042h;

    /* renamed from: i */
    public final int f32043i;

    /* renamed from: j */
    public final int f32044j;

    /* renamed from: k */
    public final long f32045k;

    /* renamed from: l */
    public final String f32046l;
    private volatile long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.j2.a$a */
    /* compiled from: CoroutineScheduler.kt */
    public static final class C12259a {
        private C12259a() {
        }

        public /* synthetic */ C12259a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.j2.a$b */
    /* compiled from: CoroutineScheduler.kt */
    public final class C12260b extends Thread {

        /* renamed from: m */
        static final AtomicIntegerFieldUpdater f32047m = AtomicIntegerFieldUpdater.newUpdater(C12260b.class, "workerCtl");

        /* renamed from: f */
        public final C12274n f32048f;

        /* renamed from: g */
        public C12261c f32049g;

        /* renamed from: h */
        private long f32050h;

        /* renamed from: i */
        private long f32051i;
        private volatile int indexInArray;

        /* renamed from: j */
        private int f32052j;

        /* renamed from: k */
        public boolean f32053k;
        private volatile Object nextParkedWorker;
        volatile int workerCtl;

        private C12260b() {
            setDaemon(true);
            this.f32048f = new C12274n();
            this.f32049g = C12261c.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = C12258a.f32039p;
            this.f32052j = C9138c.f25677b.mo33479a();
        }

        /* renamed from: c */
        private final boolean m40437c() {
            return this.nextParkedWorker != C12258a.f32039p;
        }

        /* renamed from: d */
        private final void m40439d(int i) {
            if (i != 0 && mo38956a(C12261c.BLOCKING)) {
                C12258a.this.mo38942a();
            }
        }

        /* renamed from: e */
        private final void m40441e(int i) {
            this.f32050h = 0;
            if (this.f32049g == C12261c.PARKING) {
                if (C12248i0.m40396a()) {
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                this.f32049g = C12261c.BLOCKING;
            }
        }

        /* renamed from: f */
        private final void m40442f() {
            loop0:
            while (true) {
                boolean z = false;
                while (!C12258a.this.isTerminated() && this.f32049g != C12261c.TERMINATED) {
                    C12269i a = mo38954a(this.f32053k);
                    if (a != null) {
                        this.f32051i = 0;
                        m40433a(a);
                    } else {
                        this.f32053k = false;
                        if (this.f32051i == 0) {
                            m40444h();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo38956a(C12261c.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f32051i);
                            this.f32051i = 0;
                        }
                    }
                }
            }
            mo38956a(C12261c.TERMINATED);
        }

        /* renamed from: g */
        private final boolean m40443g() {
            boolean z;
            if (this.f32049g != C12261c.CPU_ACQUIRED) {
                C12258a aVar = C12258a.this;
                while (true) {
                    long j = aVar.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (C12258a.f32037n.compareAndSet(aVar, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f32049g = C12261c.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: h */
        private final void m40444h() {
            if (!m40437c()) {
                C12258a.this.mo38946a(this);
                return;
            }
            if (C12248i0.m40396a()) {
                if (!(this.f32048f.mo38975b() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (m40437c() && !C12258a.this.isTerminated() && this.f32049g != C12261c.TERMINATED) {
                mo38956a(C12261c.PARKING);
                Thread.interrupted();
                m40438d();
            }
        }

        /* renamed from: i */
        private final void m40445i() {
            synchronized (C12258a.this.f32042h) {
                if (!C12258a.this.isTerminated()) {
                    if (C12258a.this.m40423i() > C12258a.this.f32043i) {
                        if (f32047m.compareAndSet(this, -1, 1)) {
                            int i = this.indexInArray;
                            mo38958b(0);
                            C12258a.this.mo38944a(this, i, 0);
                            int andDecrement = (int) (C12258a.f32037n.getAndDecrement(C12258a.this) & 2097151);
                            if (andDecrement != i) {
                                C12260b bVar = C12258a.this.f32042h.get(andDecrement);
                                if (bVar != null) {
                                    C12260b bVar2 = bVar;
                                    C12258a.this.f32042h.set(i, bVar2);
                                    bVar2.mo38958b(i);
                                    C12258a.this.mo38944a(bVar2, andDecrement, i);
                                } else {
                                    C10202j.m34172a();
                                    throw null;
                                }
                            }
                            C12258a.this.f32042h.set(andDecrement, (Object) null);
                            C10483v vVar = C10483v.f28357a;
                            this.f32049g = C12261c.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final int mo38952a() {
            return this.indexInArray;
        }

        /* renamed from: b */
        public final void mo38958b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C12258a.this.f32046l);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public void run() {
            m40442f();
        }

        /* renamed from: c */
        private final void m40436c(int i) {
            if (i != 0) {
                C12258a.f32037n.addAndGet(C12258a.this, -2097152);
                C12261c cVar = this.f32049g;
                if (cVar != C12261c.TERMINATED) {
                    if (C12248i0.m40396a()) {
                        if (!(cVar == C12261c.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.f32049g = C12261c.DORMANT;
                }
            }
        }

        /* renamed from: a */
        public final void mo38955a(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: d */
        private final void m40438d() {
            if (this.f32050h == 0) {
                this.f32050h = System.nanoTime() + C12258a.this.f32045k;
            }
            LockSupport.parkNanos(C12258a.this.f32045k);
            if (System.nanoTime() - this.f32050h >= 0) {
                this.f32050h = 0;
                m40445i();
            }
        }

        /* renamed from: a */
        public final boolean mo38956a(C12261c cVar) {
            C12261c cVar2 = this.f32049g;
            boolean z = cVar2 == C12261c.CPU_ACQUIRED;
            if (z) {
                C12258a.f32037n.addAndGet(C12258a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.f32049g = cVar;
            }
            return z;
        }

        /* renamed from: b */
        public final Object mo38957b() {
            return this.nextParkedWorker;
        }

        /* renamed from: b */
        private final C12269i m40434b(boolean z) {
            C12269i e;
            C12269i e2;
            if (z) {
                boolean z2 = mo38953a(C12258a.this.f32043i * 2) == 0;
                if (z2 && (e2 = m40440e()) != null) {
                    return e2;
                }
                C12269i c = this.f32048f.mo38977c();
                if (c != null) {
                    return c;
                }
                if (!z2 && (e = m40440e()) != null) {
                    return e;
                }
            } else {
                C12269i e3 = m40440e();
                if (e3 != null) {
                    return e3;
                }
            }
            return m40435c(false);
        }

        /* renamed from: e */
        private final C12269i m40440e() {
            if (mo38953a(2) == 0) {
                C12269i iVar = (C12269i) C12258a.this.f32040f.mo38886c();
                if (iVar != null) {
                    return iVar;
                }
                return (C12269i) C12258a.this.f32041g.mo38886c();
            }
            C12269i iVar2 = (C12269i) C12258a.this.f32041g.mo38886c();
            if (iVar2 != null) {
                return iVar2;
            }
            return (C12269i) C12258a.this.f32040f.mo38886c();
        }

        public C12260b(C12258a aVar, int i) {
            this();
            mo38958b(i);
        }

        /* renamed from: c */
        private final C12269i m40435c(boolean z) {
            long j;
            if (C12248i0.m40396a()) {
                if (!(this.f32048f.mo38975b() == 0)) {
                    throw new AssertionError();
                }
            }
            int a = C12258a.this.m40423i();
            if (a < 2) {
                return null;
            }
            int a2 = mo38953a(a);
            long j2 = Long.MAX_VALUE;
            for (int i = 0; i < a; i++) {
                a2++;
                if (a2 > a) {
                    a2 = 1;
                }
                C12260b bVar = C12258a.this.f32042h.get(a2);
                if (!(bVar == null || bVar == this)) {
                    if (C12248i0.m40396a()) {
                        if (!(this.f32048f.mo38975b() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z) {
                        j = this.f32048f.mo38972a(bVar.f32048f);
                    } else {
                        j = this.f32048f.mo38976b(bVar.f32048f);
                    }
                    if (j == -1) {
                        return this.f32048f.mo38977c();
                    }
                    if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f32051i = j2;
            return null;
        }

        /* renamed from: a */
        public final int mo38953a(int i) {
            int i2 = this.f32052j;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f32052j = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: a */
        public final C12269i mo38954a(boolean z) {
            C12269i iVar;
            if (m40443g()) {
                return m40434b(z);
            }
            if (z) {
                iVar = this.f32048f.mo38977c();
                if (iVar == null) {
                    iVar = (C12269i) C12258a.this.f32041g.mo38886c();
                }
            } else {
                iVar = (C12269i) C12258a.this.f32041g.mo38886c();
            }
            return iVar != null ? iVar : m40435c(true);
        }

        /* renamed from: a */
        private final void m40433a(C12269i iVar) {
            int i = iVar.f32078g.mo38967i();
            m40441e(i);
            m40439d(i);
            C12258a.this.mo38945a(iVar);
            m40436c(i);
        }
    }

    /* renamed from: kotlinx.coroutines.j2.a$c */
    /* compiled from: CoroutineScheduler.kt */
    public enum C12261c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    static {
        new C12259a((DefaultConstructorMarker) null);
    }

    public C12258a(int i, int i2, long j, String str) {
        this.f32043i = i;
        this.f32044j = i2;
        this.f32045k = j;
        this.f32046l = str;
        if (i >= 1) {
            if (this.f32044j >= this.f32043i) {
                if (this.f32044j <= 2097150) {
                    if (this.f32045k > 0) {
                        this.f32040f = new C12265e();
                        this.f32041g = new C12265e();
                        this.parkedWorkersStack = 0;
                        this.f32042h = new AtomicReferenceArray<>(this.f32044j + 1);
                        this.controlState = ((long) this.f32043i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + this.f32045k + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + this.f32044j + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + this.f32044j + " should be greater than or equals to core pool size " + this.f32043i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + this.f32043i + " should be at least 1").toString());
    }

    /* renamed from: b */
    private final int m40419b(C12260b bVar) {
        Object b = bVar.mo38957b();
        while (b != f32039p) {
            if (b == null) {
                return 0;
            }
            C12260b bVar2 = (C12260b) b;
            int a = bVar2.mo38952a();
            if (a != 0) {
                return a;
            }
            b = bVar2.mo38957b();
        }
        return -1;
    }

    /* renamed from: g */
    private final boolean m40422g(long j) {
        if (C9150f.m29847a(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f32043i) {
            int b = m40418b();
            if (b == 1 && this.f32043i > 1) {
                m40418b();
            }
            if (b > 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final int m40423i() {
        return (int) (this.controlState & 2097151);
    }

    /* renamed from: l */
    private final C12260b m40424l() {
        while (true) {
            long j = this.parkedWorkersStack;
            C12260b bVar = this.f32042h.get((int) (2097151 & j));
            if (bVar == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int b = m40419b(bVar);
            if (b >= 0) {
                if (f32036m.compareAndSet(this, j, ((long) b) | j2)) {
                    bVar.mo38955a((Object) f32039p);
                    return bVar;
                }
            }
        }
    }

    /* renamed from: m */
    private final boolean m40425m() {
        C12260b l;
        do {
            l = m40424l();
            if (l == null) {
                return false;
            }
        } while (!C12260b.f32047m.compareAndSet(l, -1, 0));
        LockSupport.unpark(l);
        return true;
    }

    public void close() {
        mo38948d(10000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        if (r9 != null) goto L_0x007a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38948d(long r9) {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f32038o
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            kotlinx.coroutines.j2.a$b r0 = r8.m40421d()
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.j2.a$b> r3 = r8.f32042h
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch:{ all -> 0x00b9 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r2 > r5) goto L_0x005f
            r3 = 1
        L_0x001d:
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.j2.a$b> r4 = r8.f32042h
            java.lang.Object r4 = r4.get(r3)
            if (r4 == 0) goto L_0x005a
            kotlinx.coroutines.j2.a$b r4 = (kotlinx.coroutines.p396j2.C12258a.C12260b) r4
            if (r4 == r0) goto L_0x0055
        L_0x0029:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L_0x0036
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r9)
            goto L_0x0029
        L_0x0036:
            kotlinx.coroutines.j2.a$c r6 = r4.f32049g
            boolean r7 = kotlinx.coroutines.C12248i0.m40396a()
            if (r7 == 0) goto L_0x004e
            kotlinx.coroutines.j2.a$c r7 = kotlinx.coroutines.p396j2.C12258a.C12261c.TERMINATED
            if (r6 != r7) goto L_0x0044
            r6 = 1
            goto L_0x0045
        L_0x0044:
            r6 = 0
        L_0x0045:
            if (r6 == 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x004e:
            kotlinx.coroutines.j2.n r4 = r4.f32048f
            kotlinx.coroutines.j2.e r6 = r8.f32041g
            r4.mo38974a((kotlinx.coroutines.p396j2.C12265e) r6)
        L_0x0055:
            if (r3 == r5) goto L_0x005f
            int r3 = r3 + 1
            goto L_0x001d
        L_0x005a:
            kotlin.jvm.internal.C10202j.m34172a()
            r9 = 0
            throw r9
        L_0x005f:
            kotlinx.coroutines.j2.e r9 = r8.f32041g
            r9.mo38883a()
            kotlinx.coroutines.j2.e r9 = r8.f32040f
            r9.mo38883a()
        L_0x0069:
            if (r0 == 0) goto L_0x0072
            kotlinx.coroutines.j2.i r9 = r0.mo38954a((boolean) r2)
            if (r9 == 0) goto L_0x0072
            goto L_0x007a
        L_0x0072:
            kotlinx.coroutines.j2.e r9 = r8.f32040f
            java.lang.Object r9 = r9.mo38886c()
            kotlinx.coroutines.j2.i r9 = (kotlinx.coroutines.p396j2.C12269i) r9
        L_0x007a:
            if (r9 == 0) goto L_0x007d
            goto L_0x0085
        L_0x007d:
            kotlinx.coroutines.j2.e r9 = r8.f32041g
            java.lang.Object r9 = r9.mo38886c()
            kotlinx.coroutines.j2.i r9 = (kotlinx.coroutines.p396j2.C12269i) r9
        L_0x0085:
            if (r9 == 0) goto L_0x008b
            r8.mo38945a((kotlinx.coroutines.p396j2.C12269i) r9)
            goto L_0x0069
        L_0x008b:
            if (r0 == 0) goto L_0x0092
            kotlinx.coroutines.j2.a$c r9 = kotlinx.coroutines.p396j2.C12258a.C12261c.TERMINATED
            r0.mo38956a((kotlinx.coroutines.p396j2.C12258a.C12261c) r9)
        L_0x0092:
            boolean r9 = kotlinx.coroutines.C12248i0.m40396a()
            if (r9 == 0) goto L_0x00b2
            long r9 = r8.controlState
            r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r9 = r9 & r3
            r0 = 42
            long r9 = r9 >> r0
            int r10 = (int) r9
            int r9 = r8.f32043i
            if (r10 != r9) goto L_0x00a9
            r1 = 1
        L_0x00a9:
            if (r1 == 0) goto L_0x00ac
            goto L_0x00b2
        L_0x00ac:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x00b2:
            r9 = 0
            r8.parkedWorkersStack = r9
            r8.controlState = r9
            return
        L_0x00b9:
            r9 = move-exception
            monitor-exit(r3)
            goto L_0x00bd
        L_0x00bc:
            throw r9
        L_0x00bd:
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p396j2.C12258a.mo38948d(long):void");
    }

    public void execute(Runnable runnable) {
        m40415a(this, runnable, (C12270j) null, false, 6, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.f32042h.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            C12260b bVar = this.f32042h.get(i6);
            if (bVar != null) {
                int b = bVar.f32048f.mo38975b();
                int i7 = C12262b.f32061a[bVar.f32049g.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    arrayList.add(String.valueOf(b) + "b");
                } else if (i7 == 3) {
                    i++;
                    arrayList.add(String.valueOf(b) + "c");
                } else if (i7 == 4) {
                    i4++;
                    if (b > 0) {
                        arrayList.add(String.valueOf(b) + "d");
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return this.f32046l + '@' + C12256j0.m40411b(this) + '[' + "Pool Size {" + "core = " + this.f32043i + ", " + "max = " + this.f32044j + "}, " + "Worker States {" + "CPU = " + i + ", " + "blocking = " + i2 + ", " + "parked = " + i3 + ", " + "dormant = " + i4 + ", " + "terminated = " + i5 + "}, " + "running workers queues = " + arrayList + ", " + "global CPU queue size = " + this.f32040f.mo38885b() + ", " + "global blocking queue size = " + this.f32041g.mo38885b() + ", " + "Control State {" + "created workers= " + ((int) (2097151 & j)) + ", " + "blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", " + "CPUs acquired = " + (this.f32043i - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: a */
    public final boolean mo38946a(C12260b bVar) {
        long j;
        long j2;
        int a;
        if (bVar.mo38957b() != f32039p) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            int i = (int) (2097151 & j);
            j2 = (2097152 + j) & -2097152;
            a = bVar.mo38952a();
            if (C12248i0.m40396a()) {
                if (!(a != 0)) {
                    throw new AssertionError();
                }
            }
            bVar.mo38955a((Object) this.f32042h.get(i));
        } while (!f32036m.compareAndSet(this, j, ((long) a) | j2));
        return true;
    }

    /* renamed from: b */
    private final int m40418b() {
        synchronized (this.f32042h) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            boolean z = false;
            int a = C9150f.m29847a(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (a >= this.f32043i) {
                return 0;
            }
            if (i >= this.f32044j) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 > 0 && this.f32042h.get(i2) == null) {
                C12260b bVar = new C12260b(this, i2);
                this.f32042h.set(i2, bVar);
                if (i2 == ((int) (2097151 & f32037n.incrementAndGet(this)))) {
                    z = true;
                }
                if (z) {
                    bVar.start();
                    int i3 = a + 1;
                    return i3;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m40415a(C12258a aVar, Runnable runnable, C12270j jVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            jVar = C12268h.f32076g;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo38943a(runnable, jVar, z);
    }

    /* renamed from: a */
    public final void mo38943a(Runnable runnable, C12270j jVar, boolean z) {
        C12177a2 a = C12182b2.m40222a();
        if (a != null) {
            a.mo38830e();
        }
        C12269i a2 = mo38941a(runnable, jVar);
        C12260b d = m40421d();
        C12269i a3 = m40414a(d, a2, z);
        if (a3 == null || m40420b(a3)) {
            boolean z2 = z && d != null;
            if (a2.f32078g.mo38967i() != 0) {
                m40416a(z2);
            } else if (!z2) {
                mo38942a();
            }
        } else {
            throw new RejectedExecutionException(this.f32046l + " was terminated");
        }
    }

    /* renamed from: a */
    public final C12269i mo38941a(Runnable runnable, C12270j jVar) {
        long a = C12272l.f32084e.mo38968a();
        if (!(runnable instanceof C12269i)) {
            return new C12271k(runnable, a, jVar);
        }
        C12269i iVar = (C12269i) runnable;
        iVar.f32077f = a;
        iVar.f32078g = jVar;
        return iVar;
    }

    /* renamed from: b */
    private final boolean m40420b(C12269i iVar) {
        boolean z = true;
        if (iVar.f32078g.mo38967i() != 1) {
            z = false;
        }
        if (z) {
            return this.f32041g.mo38884a(iVar);
        }
        return this.f32040f.mo38884a(iVar);
    }

    /* renamed from: a */
    public final void mo38942a() {
        if (!m40425m() && !m40417a(this, 0, 1, (Object) null)) {
            m40425m();
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m40417a(C12258a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.controlState;
        }
        return aVar.m40422g(j);
    }

    /* renamed from: a */
    private final C12269i m40414a(C12260b bVar, C12269i iVar, boolean z) {
        if (bVar == null || bVar.f32049g == C12261c.TERMINATED) {
            return iVar;
        }
        if (iVar.f32078g.mo38967i() == 0 && bVar.f32049g == C12261c.BLOCKING) {
            return iVar;
        }
        bVar.f32053k = true;
        return bVar.f32048f.mo38973a(iVar, z);
    }

    /* renamed from: d */
    private final C12260b m40421d() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof C12260b)) {
            currentThread = null;
        }
        C12260b bVar = (C12260b) currentThread;
        if (bVar == null || !C10202j.m34176a((Object) C12258a.this, (Object) this)) {
            return null;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo38945a(C12269i iVar) {
        C12177a2 a;
        try {
            iVar.run();
            a = C12182b2.m40222a();
            if (a == null) {
                return;
            }
        } catch (Throwable th) {
            C12177a2 a2 = C12182b2.m40222a();
            if (a2 != null) {
                a2.mo38828c();
            }
            throw th;
        }
        a.mo38828c();
    }

    /* renamed from: a */
    public final void mo38944a(C12260b bVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? m40419b(bVar) : i2;
            }
            if (i3 >= 0) {
                if (f32036m.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m40416a(boolean z) {
        long addAndGet = f32037n.addAndGet(this, 2097152);
        if (!z && !m40425m() && !m40422g(addAndGet)) {
            m40425m();
        }
    }
}
