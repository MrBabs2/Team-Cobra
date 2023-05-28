package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9069g;
import kotlinx.coroutines.p393g2.C12223j;
import kotlinx.coroutines.p393g2.C12239t;
import kotlinx.coroutines.p393g2.C12240u;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b \u0018\u00002\u0002092\u00020::\u00044567B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0002J\u0017\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00032\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0002J\u000f\u0010\u0018\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0018\u0010\u0002J\u001d\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00142\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0014¢\u0006\u0004\b+\u0010\u0002R$\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00118B@BX\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00118T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0016\u00103\u001a\u00020\u00148T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016¨\u00068"}, mo16641d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "<init>", "()V", "", "closeQueue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dequeue", "()Ljava/lang/Runnable;", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "enqueue", "(Ljava/lang/Runnable;)V", "", "enqueueImpl", "(Ljava/lang/Runnable;)Z", "", "processNextEvent", "()J", "rescheduleAllDelayed", "resetAll", "now", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "delayedTask", "schedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", "", "scheduleImpl", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)I", "timeMillis", "Lkotlinx/coroutines/DisposableHandle;", "scheduleInvokeOnTimeout", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "shouldUnpark", "(Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;)Z", "shutdown", "value", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "getNextTime", "nextTime", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.y0 */
/* compiled from: EventLoop.common.kt */
public abstract class C12327y0 extends C12334z0 implements C12284m0 {

    /* renamed from: j */
    private static final AtomicReferenceFieldUpdater f32147j;

    /* renamed from: k */
    private static final AtomicReferenceFieldUpdater f32148k;
    private volatile Object _delayed = null;
    private volatile int _isCompleted = 0;
    private volatile Object _queue = null;

    /* renamed from: kotlinx.coroutines.y0$a */
    /* compiled from: EventLoop.common.kt */
    private final class C12328a extends C12329b {

        /* renamed from: i */
        private final C12242h<C10483v> f32149i;

        public C12328a(long j, C12242h<? super C10483v> hVar) {
            super(j);
            this.f32149i = hVar;
        }

        public void run() {
            this.f32149i.mo38924a(C12327y0.this, C10483v.f28357a);
        }

        public String toString() {
            return super.toString() + this.f32149i.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.y0$b */
    /* compiled from: EventLoop.common.kt */
    public static abstract class C12329b implements Runnable, Comparable<C12329b>, C12313u0, C12240u {

        /* renamed from: f */
        private Object f32151f;

        /* renamed from: g */
        private int f32152g = -1;

        /* renamed from: h */
        public long f32153h;

        public C12329b(long j) {
            this.f32153h = j;
        }

        /* renamed from: a */
        public C12239t<?> mo38915a() {
            Object obj = this.f32151f;
            if (!(obj instanceof C12239t)) {
                obj = null;
            }
            return (C12239t) obj;
        }

        public final synchronized void dispose() {
            Object obj = this.f32151f;
            if (obj != C12181b1.f31950a) {
                if (!(obj instanceof C12330c)) {
                    obj = null;
                }
                C12330c cVar = (C12330c) obj;
                if (cVar != null) {
                    cVar.mo38911b(this);
                }
                this.f32151f = C12181b1.f31950a;
            }
        }

        /* renamed from: e */
        public int mo38918e() {
            return this.f32152g;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f32153h + ']';
        }

        /* renamed from: a */
        public void mo38917a(C12239t<?> tVar) {
            if (this.f32151f != C12181b1.f31950a) {
                this.f32151f = tVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: a */
        public void mo38916a(int i) {
            this.f32152g = i;
        }

        /* renamed from: a */
        public int compareTo(C12329b bVar) {
            long j = this.f32153h - bVar.f32153h;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        /* renamed from: a */
        public final boolean mo39058a(long j) {
            return j - this.f32153h >= 0;
        }

        /* renamed from: a */
        public final synchronized int mo39056a(long j, C12330c cVar, C12327y0 y0Var) {
            if (this.f32151f == C12181b1.f31950a) {
                return 2;
            }
            synchronized (cVar) {
                C12329b bVar = (C12329b) cVar.mo38907a();
                if (y0Var.m40670A()) {
                    return 1;
                }
                if (bVar == null) {
                    cVar.f32154b = j;
                } else {
                    long j2 = bVar.f32153h;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - cVar.f32154b > 0) {
                        cVar.f32154b = j;
                    }
                }
                if (this.f32153h - cVar.f32154b < 0) {
                    this.f32153h = cVar.f32154b;
                }
                cVar.mo38909a(this);
                return 0;
            }
        }
    }

    /* renamed from: kotlinx.coroutines.y0$c */
    /* compiled from: EventLoop.common.kt */
    public static final class C12330c extends C12239t<C12329b> {

        /* renamed from: b */
        public long f32154b;

        public C12330c(long j) {
            this.f32154b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C12327y0> cls2 = C12327y0.class;
        f32147j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f32148k = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    /* access modifiers changed from: private */
    /* renamed from: A */
    public final boolean m40670A() {
        return this._isCompleted;
    }

    /* renamed from: B */
    private final void m40671B() {
        C12329b bVar;
        C12177a2 a = C12182b2.m40222a();
        long a2 = a != null ? a.mo38823a() : System.nanoTime();
        while (true) {
            C12330c cVar = (C12330c) this._delayed;
            if (cVar != null && (bVar = (C12329b) cVar.mo38914e()) != null) {
                mo39060a(a2, bVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    private final void m40675c(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: y */
    private final void m40677y() {
        if (!C12248i0.m40396a() || m40670A()) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (f32147j.compareAndSet(this, (Object) null, C12181b1.f31951b)) {
                        return;
                    }
                } else if (obj instanceof C12223j) {
                    ((C12223j) obj).mo38888a();
                    return;
                } else if (obj != C12181b1.f31951b) {
                    C12223j jVar = new C12223j(8, true);
                    if (obj != null) {
                        jVar.mo38887a((Runnable) obj);
                        if (f32147j.compareAndSet(this, obj, jVar)) {
                            return;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: z */
    private final Runnable m40678z() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C12223j) {
                if (obj != null) {
                    C12223j jVar = (C12223j) obj;
                    Object e = jVar.mo38892e();
                    if (e != C12223j.f31994g) {
                        return (Runnable) e;
                    }
                    f32147j.compareAndSet(this, obj, jVar.mo38891d());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C12181b1.f31951b) {
                return null;
            } else {
                if (f32147j.compareAndSet(this, obj, (Object) null)) {
                    if (obj != null) {
                        return (Runnable) obj;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo39050b(Runnable runnable) {
        if (m40676c(runnable)) {
            mo39061u();
        } else {
            C12276k0.f32092m.mo39050b(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public long mo39043m() {
        C12329b bVar;
        if (super.mo39043m() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C12223j) {
                if (!((C12223j) obj).mo38890c()) {
                    return 0;
                }
            } else if (obj == C12181b1.f31951b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        C12330c cVar = (C12330c) this._delayed;
        if (cVar == null || (bVar = (C12329b) cVar.mo38913d()) == null) {
            return Long.MAX_VALUE;
        }
        long j = bVar.f32153h;
        C12177a2 a = C12182b2.m40222a();
        return C9150f.m29849a(j - (a != null ? a.mo38823a() : System.nanoTime()), 0);
    }

    /* access modifiers changed from: protected */
    public void shutdown() {
        C12335z1.f32157b.mo39064b();
        m40675c(true);
        m40677y();
        do {
        } while (mo39052w() <= 0);
        m40671B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo39051v() {
        if (!mo39045p()) {
            return false;
        }
        C12330c cVar = (C12330c) this._delayed;
        if (cVar != null && !cVar.mo38912c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C12223j) {
                return ((C12223j) obj).mo38890c();
            }
            if (obj == C12181b1.f31951b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo39052w() {
        /*
            r9 = this;
            boolean r0 = r9.mo39046q()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            kotlinx.coroutines.y0$c r0 = (kotlinx.coroutines.C12327y0.C12330c) r0
            if (r0 == 0) goto L_0x004d
            boolean r3 = r0.mo38912c()
            if (r3 != 0) goto L_0x004d
            kotlinx.coroutines.a2 r3 = kotlinx.coroutines.C12182b2.m40222a()
            if (r3 == 0) goto L_0x0020
            long r3 = r3.mo38823a()
            goto L_0x0024
        L_0x0020:
            long r3 = java.lang.System.nanoTime()
        L_0x0024:
            monitor-enter(r0)
            kotlinx.coroutines.g2.u r5 = r0.mo38907a()     // Catch:{ all -> 0x004a }
            r6 = 0
            if (r5 == 0) goto L_0x0044
            kotlinx.coroutines.y0$b r5 = (kotlinx.coroutines.C12327y0.C12329b) r5     // Catch:{ all -> 0x004a }
            boolean r7 = r5.mo39058a((long) r3)     // Catch:{ all -> 0x004a }
            r8 = 0
            if (r7 == 0) goto L_0x003a
            boolean r5 = r9.m40676c((java.lang.Runnable) r5)     // Catch:{ all -> 0x004a }
            goto L_0x003b
        L_0x003a:
            r5 = 0
        L_0x003b:
            if (r5 == 0) goto L_0x0042
            kotlinx.coroutines.g2.u r5 = r0.mo38908a((int) r8)     // Catch:{ all -> 0x004a }
            r6 = r5
        L_0x0042:
            monitor-exit(r0)
            goto L_0x0045
        L_0x0044:
            monitor-exit(r0)
        L_0x0045:
            kotlinx.coroutines.y0$b r6 = (kotlinx.coroutines.C12327y0.C12329b) r6
            if (r6 == 0) goto L_0x004d
            goto L_0x0024
        L_0x004a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x004d:
            java.lang.Runnable r0 = r9.m40678z()
            if (r0 == 0) goto L_0x0057
            r0.run()
            return r1
        L_0x0057:
            long r0 = r9.mo39043m()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C12327y0.mo39052w():long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo39053x() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: c */
    private final int m40674c(long j, C12329b bVar) {
        if (m40670A()) {
            return 1;
        }
        C12330c cVar = (C12330c) this._delayed;
        if (cVar == null) {
            f32148k.compareAndSet(this, (Object) null, new C12330c(j));
            Object obj = this._delayed;
            if (obj != null) {
                cVar = (C12330c) obj;
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
        return bVar.mo39056a(j, cVar, this);
    }

    /* renamed from: a */
    public void mo38987a(long j, C12242h<? super C10483v> hVar) {
        long a = C12181b1.m40219a(j);
        if (a < 4611686018427387903L) {
            C12177a2 a2 = C12182b2.m40222a();
            long a3 = a2 != null ? a2.mo38823a() : System.nanoTime();
            C12328a aVar = new C12328a(a + a3, hVar);
            C12255j.m40408a(hVar, aVar);
            mo39049b(a3, aVar);
        }
    }

    /* renamed from: b */
    public final void mo39049b(long j, C12329b bVar) {
        int c = m40674c(j, bVar);
        if (c != 0) {
            if (c == 1) {
                mo39060a(j, bVar);
            } else if (c != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m40672a(bVar)) {
            mo39061u();
        }
    }

    /* renamed from: a */
    public final void mo38845a(C9069g gVar, Runnable runnable) {
        mo39050b(runnable);
    }

    /* renamed from: a */
    private final boolean m40672a(C12329b bVar) {
        C12330c cVar = (C12330c) this._delayed;
        return (cVar != null ? (C12329b) cVar.mo38913d() : null) == bVar;
    }

    /* renamed from: c */
    private final boolean m40676c(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m40670A()) {
                return false;
            }
            if (obj == null) {
                if (f32147j.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C12223j) {
                if (obj != null) {
                    C12223j jVar = (C12223j) obj;
                    int a = jVar.mo38887a(runnable);
                    if (a == 0) {
                        return true;
                    }
                    if (a == 1) {
                        f32147j.compareAndSet(this, obj, jVar.mo38891d());
                    } else if (a == 2) {
                        return false;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == C12181b1.f31951b) {
                return false;
            } else {
                C12223j jVar2 = new C12223j(8, true);
                if (obj != null) {
                    jVar2.mo38887a((Runnable) obj);
                    jVar2.mo38887a(runnable);
                    if (f32147j.compareAndSet(this, obj, jVar2)) {
                        return true;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }
}
