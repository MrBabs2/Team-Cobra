package p123rx.p401n.p406e;

import java.io.PrintStream;
import java.util.Queue;
import p123rx.C5375k;
import p123rx.exceptions.MissingBackpressureException;
import p123rx.p401n.p402a.C12558h;
import p123rx.p401n.p406e.p407n.C12799e;
import p123rx.p401n.p406e.p408o.C12813k;
import p123rx.p401n.p406e.p408o.C12821s;
import p123rx.p401n.p406e.p408o.C12828z;

/* renamed from: rx.n.e.h */
/* compiled from: RxRingBuffer */
public class C12772h implements C5375k {

    /* renamed from: h */
    public static final int f32957h;

    /* renamed from: f */
    private Queue<Object> f32958f;

    /* renamed from: g */
    public volatile Object f32959g;

    static {
        int i = C12771g.m41265b() ? 16 : 128;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                PrintStream printStream = System.err;
                printStream.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        f32957h = i;
    }

    private C12772h(Queue<Object> queue, int i) {
        this.f32958f = queue;
    }

    /* renamed from: f */
    public static C12772h m41267f() {
        if (C12828z.m41379a()) {
            return new C12772h(true, f32957h);
        }
        return new C12772h();
    }

    /* renamed from: g */
    public static C12772h m41268g() {
        if (C12828z.m41379a()) {
            return new C12772h(false, f32957h);
        }
        return new C12772h();
    }

    /* renamed from: a */
    public boolean mo40890a() {
        Queue<Object> queue = this.f32958f;
        return queue == null || queue.isEmpty();
    }

    /* renamed from: b */
    public void mo40891b() {
        if (this.f32959g == null) {
            this.f32959g = C12558h.m41014a();
        }
    }

    /* renamed from: c */
    public void mo40894c(Object obj) throws MissingBackpressureException {
        boolean z;
        boolean z2;
        synchronized (this) {
            Queue<Object> queue = this.f32958f;
            z = true;
            z2 = false;
            if (queue != null) {
                z2 = !queue.offer(C12558h.m41020d(obj));
                z = false;
            }
        }
        if (z) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        } else if (z2) {
            throw new MissingBackpressureException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo40895d() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Queue<java.lang.Object> r0 = r4.f32958f     // Catch:{ all -> 0x001d }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            return r1
        L_0x0008:
            java.lang.Object r2 = r0.poll()     // Catch:{ all -> 0x001d }
            java.lang.Object r3 = r4.f32959g     // Catch:{ all -> 0x001d }
            if (r2 != 0) goto L_0x001b
            if (r3 == 0) goto L_0x001b
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001b
            r4.f32959g = r1     // Catch:{ all -> 0x001d }
            r2 = r3
        L_0x001b:
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            return r2
        L_0x001d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p406e.C12772h.mo40895d():java.lang.Object");
    }

    /* renamed from: e */
    public synchronized void mo40896e() {
    }

    public boolean isUnsubscribed() {
        return this.f32958f == null;
    }

    public void unsubscribe() {
        mo40896e();
    }

    private C12772h(boolean z, int i) {
        this.f32958f = z ? new C12813k<>(i) : new C12821s<>(i);
    }

    /* renamed from: a */
    public Object mo40889a(Object obj) {
        return C12558h.m41018b(obj);
    }

    /* renamed from: b */
    public boolean mo40892b(Object obj) {
        return C12558h.m41019c(obj);
    }

    C12772h() {
        this((Queue<Object>) new C12799e(f32957h), f32957h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        return r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo40893c() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Queue<java.lang.Object> r0 = r3.f32958f     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            return r0
        L_0x0008:
            java.lang.Object r1 = r0.peek()     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r3.f32959g     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x0019
            if (r2 == 0) goto L_0x0019
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1 = r2
        L_0x0019:
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            return r1
        L_0x001b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x001b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p123rx.p401n.p406e.C12772h.mo40893c():java.lang.Object");
    }
}
