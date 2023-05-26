package kotlinx.coroutines.p396j2;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.p042a0.C9069g;
import kotlinx.coroutines.C12186c1;

/* renamed from: kotlinx.coroutines.j2.f */
/* compiled from: Dispatcher.kt */
final class C12266f extends C12186c1 implements C12270j, Executor {

    /* renamed from: k */
    private static final AtomicIntegerFieldUpdater f32069k = AtomicIntegerFieldUpdater.newUpdater(C12266f.class, "inFlightTasks");

    /* renamed from: g */
    private final ConcurrentLinkedQueue<Runnable> f32070g = new ConcurrentLinkedQueue<>();

    /* renamed from: h */
    private final C12264d f32071h;

    /* renamed from: i */
    private final int f32072i;
    private volatile int inFlightTasks = 0;

    /* renamed from: j */
    private final int f32073j;

    public C12266f(C12264d dVar, int i, int i2) {
        this.f32071h = dVar;
        this.f32072i = i;
        this.f32073j = i2;
    }

    /* renamed from: a */
    public void mo38845a(C9069g gVar, Runnable runnable) {
        m40458a(runnable, false);
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public void execute(Runnable runnable) {
        m40458a(runnable, false);
    }

    /* renamed from: i */
    public int mo38967i() {
        return this.f32073j;
    }

    public String toString() {
        return super.toString() + "[dispatcher = " + this.f32071h + ']';
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m40458a(java.lang.Runnable r3, boolean r4) {
        /*
            r2 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f32069k
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.f32072i
            if (r0 > r1) goto L_0x0010
            kotlinx.coroutines.j2.d r0 = r2.f32071h
            r0.mo38963a(r3, r2, r4)
            return
        L_0x0010:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r2.f32070g
            r0.add(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = f32069k
            int r3 = r3.decrementAndGet(r2)
            int r0 = r2.f32072i
            if (r3 < r0) goto L_0x0020
            return
        L_0x0020:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r3 = r2.f32070g
            java.lang.Object r3 = r3.poll()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 == 0) goto L_0x002b
            goto L_0x0000
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p396j2.C12266f.m40458a(java.lang.Runnable, boolean):void");
    }

    /* renamed from: a */
    public void mo38964a() {
        Runnable poll = this.f32070g.poll();
        if (poll != null) {
            this.f32071h.mo38963a(poll, this, true);
            return;
        }
        f32069k.decrementAndGet(this);
        Runnable poll2 = this.f32070g.poll();
        if (poll2 != null) {
            m40458a(poll2, true);
        }
    }
}
