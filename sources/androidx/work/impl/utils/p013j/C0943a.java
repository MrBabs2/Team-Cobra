package androidx.work.impl.utils.p013j;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p112n.p277e.p298c.p299a.p300a.C10661a;

/* renamed from: androidx.work.impl.utils.j.a */
/* compiled from: AbstractFuture */
public abstract class C0943a<V> implements C10661a<V> {

    /* renamed from: i */
    static final boolean f3272i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", AdultContentAnalytics.UNLOCK));

    /* renamed from: j */
    private static final Logger f3273j = Logger.getLogger(C0943a.class.getName());

    /* renamed from: k */
    static final C0945b f3274k;

    /* renamed from: l */
    private static final Object f3275l = new Object();

    /* renamed from: f */
    volatile Object f3276f;

    /* renamed from: g */
    volatile C0949e f3277g;

    /* renamed from: h */
    volatile C0953i f3278h;

    /* renamed from: androidx.work.impl.utils.j.a$b */
    /* compiled from: AbstractFuture */
    private static abstract class C0945b {
        private C0945b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo4949a(C0953i iVar, C0953i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo4950a(C0953i iVar, Thread thread);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo4951a(C0943a<?> aVar, C0949e eVar, C0949e eVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo4952a(C0943a<?> aVar, C0953i iVar, C0953i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo4953a(C0943a<?> aVar, Object obj, Object obj2);
    }

    /* renamed from: androidx.work.impl.utils.j.a$c */
    /* compiled from: AbstractFuture */
    private static final class C0946c {

        /* renamed from: c */
        static final C0946c f3279c;

        /* renamed from: d */
        static final C0946c f3280d;

        /* renamed from: a */
        final boolean f3281a;

        /* renamed from: b */
        final Throwable f3282b;

        static {
            if (C0943a.f3272i) {
                f3280d = null;
                f3279c = null;
                return;
            }
            f3280d = new C0946c(false, (Throwable) null);
            f3279c = new C0946c(true, (Throwable) null);
        }

        C0946c(boolean z, Throwable th) {
            this.f3281a = z;
            this.f3282b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.j.a$d */
    /* compiled from: AbstractFuture */
    private static final class C0947d {

        /* renamed from: b */
        static final C0947d f3283b = new C0947d(new C0948a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f3284a;

        /* renamed from: androidx.work.impl.utils.j.a$d$a */
        /* compiled from: AbstractFuture */
        static class C0948a extends Throwable {
            C0948a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C0947d(Throwable th) {
            C0943a.m4087b(th);
            this.f3284a = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.j.a$e */
    /* compiled from: AbstractFuture */
    private static final class C0949e {

        /* renamed from: d */
        static final C0949e f3285d = new C0949e((Runnable) null, (Executor) null);

        /* renamed from: a */
        final Runnable f3286a;

        /* renamed from: b */
        final Executor f3287b;

        /* renamed from: c */
        C0949e f3288c;

        C0949e(Runnable runnable, Executor executor) {
            this.f3286a = runnable;
            this.f3287b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.j.a$f */
    /* compiled from: AbstractFuture */
    private static final class C0950f extends C0945b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C0953i, Thread> f3289a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C0953i, C0953i> f3290b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C0943a, C0953i> f3291c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C0943a, C0949e> f3292d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C0943a, Object> f3293e;

        C0950f(AtomicReferenceFieldUpdater<C0953i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C0953i, C0953i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C0943a, C0953i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C0943a, C0949e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C0943a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f3289a = atomicReferenceFieldUpdater;
            this.f3290b = atomicReferenceFieldUpdater2;
            this.f3291c = atomicReferenceFieldUpdater3;
            this.f3292d = atomicReferenceFieldUpdater4;
            this.f3293e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4950a(C0953i iVar, Thread thread) {
            this.f3289a.lazySet(iVar, thread);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4949a(C0953i iVar, C0953i iVar2) {
            this.f3290b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4952a(C0943a<?> aVar, C0953i iVar, C0953i iVar2) {
            return this.f3291c.compareAndSet(aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4951a(C0943a<?> aVar, C0949e eVar, C0949e eVar2) {
            return this.f3292d.compareAndSet(aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4953a(C0943a<?> aVar, Object obj, Object obj2) {
            return this.f3293e.compareAndSet(aVar, obj, obj2);
        }
    }

    /* renamed from: androidx.work.impl.utils.j.a$g */
    /* compiled from: AbstractFuture */
    private static final class C0951g<V> implements Runnable {

        /* renamed from: f */
        final C0943a<V> f3294f;

        /* renamed from: g */
        final C10661a<? extends V> f3295g;

        C0951g(C0943a<V> aVar, C10661a<? extends V> aVar2) {
            this.f3294f = aVar;
            this.f3295g = aVar2;
        }

        public void run() {
            if (this.f3294f.f3276f == this) {
                if (C0943a.f3274k.mo4953a((C0943a<?>) this.f3294f, (Object) this, C0943a.m4088b((C10661a<?>) this.f3295g))) {
                    C0943a.m4085a((C0943a<?>) this.f3294f);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.j.a$h */
    /* compiled from: AbstractFuture */
    private static final class C0952h extends C0945b {
        C0952h() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4950a(C0953i iVar, Thread thread) {
            iVar.f3297a = thread;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4949a(C0953i iVar, C0953i iVar2) {
            iVar.f3298b = iVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4952a(C0943a<?> aVar, C0953i iVar, C0953i iVar2) {
            synchronized (aVar) {
                if (aVar.f3278h != iVar) {
                    return false;
                }
                aVar.f3278h = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4951a(C0943a<?> aVar, C0949e eVar, C0949e eVar2) {
            synchronized (aVar) {
                if (aVar.f3277g != eVar) {
                    return false;
                }
                aVar.f3277g = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4953a(C0943a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f3276f != obj) {
                    return false;
                }
                aVar.f3276f = obj2;
                return true;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.j.a$i */
    /* compiled from: AbstractFuture */
    private static final class C0953i {

        /* renamed from: c */
        static final C0953i f3296c = new C0953i(false);

        /* renamed from: a */
        volatile Thread f3297a;

        /* renamed from: b */
        volatile C0953i f3298b;

        C0953i(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4957a(C0953i iVar) {
            C0943a.f3274k.mo4949a(this, iVar);
        }

        C0953i() {
            C0943a.f3274k.mo4950a(this, Thread.currentThread());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4956a() {
            Thread thread = this.f3297a;
            if (thread != null) {
                this.f3297a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.j.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.j.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.j.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.j.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.j.a$i> r0 = androidx.work.impl.utils.p013j.C0943a.C0953i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f3272i = r1
            java.lang.Class<androidx.work.impl.utils.j.a> r1 = androidx.work.impl.utils.p013j.C0943a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f3273j = r1
            androidx.work.impl.utils.j.a$f r1 = new androidx.work.impl.utils.j.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.j.a> r2 = androidx.work.impl.utils.p013j.C0943a.class
            java.lang.String r5 = "h"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.j.a> r0 = androidx.work.impl.utils.p013j.C0943a.class
            java.lang.Class<androidx.work.impl.utils.j.a$e> r2 = androidx.work.impl.utils.p013j.C0943a.C0949e.class
            java.lang.String r6 = "g"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.j.a> r0 = androidx.work.impl.utils.p013j.C0943a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "f"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.j.a$h r1 = new androidx.work.impl.utils.j.a$h
            r1.<init>()
        L_0x0054:
            f3274k = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f3273j
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f3275l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.p013j.C0943a.<clinit>():void");
    }

    protected C0943a() {
    }

    /* renamed from: a */
    private void m4084a(C0953i iVar) {
        iVar.f3297a = null;
        while (true) {
            C0953i iVar2 = this.f3278h;
            if (iVar2 != C0953i.f3296c) {
                C0953i iVar3 = null;
                while (iVar2 != null) {
                    C0953i iVar4 = iVar2.f3298b;
                    if (iVar2.f3297a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f3298b = iVar4;
                        if (iVar3.f3297a == null) {
                        }
                    } else if (!f3274k.mo4952a((C0943a<?>) this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: b */
    static Object m4088b(C10661a<?> aVar) {
        if (aVar instanceof C0943a) {
            Object obj = ((C0943a) aVar).f3276f;
            if (!(obj instanceof C0946c)) {
                return obj;
            }
            C0946c cVar = (C0946c) obj;
            if (cVar.f3281a) {
                return cVar.f3282b != null ? new C0946c(false, cVar.f3282b) : C0946c.f3280d;
            }
            return obj;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f3272i) && isCancelled) {
            return C0946c.f3280d;
        }
        try {
            Object a = m4082a(aVar);
            return a == null ? f3275l : a;
        } catch (ExecutionException e) {
            return new C0947d(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C0946c(false, e2);
            }
            return new C0947d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e2));
        } catch (Throwable th) {
            return new C0947d(th);
        }
    }

    /* renamed from: c */
    private V m4089c(Object obj) throws ExecutionException {
        if (obj instanceof C0946c) {
            throw m4083a("Task was cancelled.", ((C0946c) obj).f3282b);
        } else if (obj instanceof C0947d) {
            throw new ExecutionException(((C0947d) obj).f3284a);
        } else if (obj == f3275l) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: d */
    private void m4092d() {
        C0953i iVar;
        do {
            iVar = this.f3278h;
        } while (!f3274k.mo4952a((C0943a<?>) this, iVar, C0953i.f3296c));
        while (iVar != null) {
            iVar.mo4956a();
            iVar = iVar.f3298b;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4936a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4941b() {
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, n.e.c.a.a.a<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f3276f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.p013j.C0943a.C0951g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f3272i
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.j.a$c r3 = new androidx.work.impl.utils.j.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.j.a$c r3 = androidx.work.impl.utils.p013j.C0943a.C0946c.f3279c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.j.a$c r3 = androidx.work.impl.utils.p013j.C0943a.C0946c.f3280d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.work.impl.utils.j.a$b r6 = f3274k
            boolean r6 = r6.mo4953a((androidx.work.impl.utils.p013j.C0943a<?>) r4, (java.lang.Object) r0, (java.lang.Object) r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo4941b()
        L_0x0035:
            m4085a((androidx.work.impl.utils.p013j.C0943a<?>) r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.p013j.C0943a.C0951g
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.j.a$g r0 = (androidx.work.impl.utils.p013j.C0943a.C0951g) r0
            n.e.c.a.a.a<? extends V> r0 = r0.f3295g
            boolean r4 = r0 instanceof androidx.work.impl.utils.p013j.C0943a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.j.a r4 = (androidx.work.impl.utils.p013j.C0943a) r4
            java.lang.Object r0 = r4.f3276f
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.p013j.C0943a.C0951g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f3276f
            boolean r6 = r0 instanceof androidx.work.impl.utils.p013j.C0943a.C0951g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.p013j.C0943a.cancel(boolean):boolean");
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f3276f;
            if ((obj != null) && (!(obj instanceof C0951g))) {
                return m4089c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C0953i iVar = this.f3278h;
                if (iVar != C0953i.f3296c) {
                    C0953i iVar2 = new C0953i();
                    do {
                        iVar2.mo4957a(iVar);
                        if (f3274k.mo4952a((C0943a<?>) this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f3276f;
                                    if ((obj2 != null) && (!(obj2 instanceof C0951g))) {
                                        return m4089c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m4084a(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m4084a(iVar2);
                        } else {
                            iVar = this.f3278h;
                        }
                    } while (iVar != C0953i.f3296c);
                }
                return m4089c(this.f3276f);
            }
            while (nanos > 0) {
                Object obj3 = this.f3276f;
                if ((obj3 != null) && (!(obj3 instanceof C0951g))) {
                    return m4089c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                boolean z = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f3276f instanceof C0946c;
    }

    public final boolean isDone() {
        Object obj = this.f3276f;
        return (!(obj instanceof C0951g)) & (obj != null);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m4086a(sb);
        } else {
            try {
                str = mo4942c();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m4086a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: d */
    private String m4091d(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo4942c() {
        Object obj = this.f3276f;
        if (obj instanceof C0951g) {
            return "setFuture=[" + m4091d(((C0951g) obj).f3295g) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* renamed from: a */
    public final void mo4937a(Runnable runnable, Executor executor) {
        m4087b(runnable);
        m4087b(executor);
        C0949e eVar = this.f3277g;
        if (eVar != C0949e.f3285d) {
            C0949e eVar2 = new C0949e(runnable, executor);
            do {
                eVar2.f3288c = eVar;
                if (!f3274k.mo4951a((C0943a<?>) this, eVar, eVar2)) {
                    eVar = this.f3277g;
                } else {
                    return;
                }
            } while (eVar != C0949e.f3285d);
        }
        m4090c(runnable, executor);
    }

    /* renamed from: c */
    private static void m4090c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f3273j;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: b */
    static <T> T m4087b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo4938a(V v) {
        if (v == null) {
            v = f3275l;
        }
        if (!f3274k.mo4953a((C0943a<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        m4085a((C0943a<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo4939a(Throwable th) {
        m4087b(th);
        if (!f3274k.mo4953a((C0943a<?>) this, (Object) null, (Object) new C0947d(th))) {
            return false;
        }
        m4085a((C0943a<?>) this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo4940a(C10661a<? extends V> aVar) {
        C0951g gVar;
        C0947d dVar;
        m4087b(aVar);
        Object obj = this.f3276f;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!f3274k.mo4953a((C0943a<?>) this, (Object) null, m4088b((C10661a<?>) aVar))) {
                    return false;
                }
                m4085a((C0943a<?>) this);
                return true;
            }
            gVar = new C0951g(this, aVar);
            if (f3274k.mo4953a((C0943a<?>) this, (Object) null, (Object) gVar)) {
                try {
                    aVar.mo4937a(gVar, C0954b.INSTANCE);
                } catch (Throwable unused) {
                    dVar = C0947d.f3283b;
                }
                return true;
            }
            obj = this.f3276f;
        }
        if (obj instanceof C0946c) {
            aVar.cancel(((C0946c) obj).f3281a);
        }
        return false;
        f3274k.mo4953a((C0943a<?>) this, (Object) gVar, (Object) dVar);
        return true;
    }

    /* renamed from: a */
    private static <V> V m4082a(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: a */
    static void m4085a(C0943a<?> aVar) {
        C0949e eVar = null;
        C0943a<V> aVar2 = aVar;
        while (true) {
            aVar2.m4092d();
            aVar2.mo4936a();
            C0949e a = aVar2.m4081a(eVar);
            while (true) {
                if (a != null) {
                    eVar = a.f3288c;
                    Runnable runnable = a.f3286a;
                    if (runnable instanceof C0951g) {
                        C0951g gVar = (C0951g) runnable;
                        C0943a<V> aVar3 = gVar.f3294f;
                        if (aVar3.f3276f == gVar) {
                            if (f3274k.mo4953a((C0943a<?>) aVar3, (Object) gVar, m4088b((C10661a<?>) gVar.f3295g))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m4090c(runnable, a.f3287b);
                    }
                    a = eVar;
                } else {
                    return;
                }
            }
        }
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f3276f;
            if ((obj2 != null) && (!(obj2 instanceof C0951g))) {
                return m4089c(obj2);
            }
            C0953i iVar = this.f3278h;
            if (iVar != C0953i.f3296c) {
                C0953i iVar2 = new C0953i();
                do {
                    iVar2.mo4957a(iVar);
                    if (f3274k.mo4952a((C0943a<?>) this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f3276f;
                            } else {
                                m4084a(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C0951g))));
                        return m4089c(obj);
                    }
                    iVar = this.f3278h;
                } while (iVar != C0953i.f3296c);
            }
            return m4089c(this.f3276f);
        }
        throw new InterruptedException();
    }

    /* renamed from: a */
    private C0949e m4081a(C0949e eVar) {
        C0949e eVar2;
        do {
            eVar2 = this.f3277g;
        } while (!f3274k.mo4951a((C0943a<?>) this, eVar2, C0949e.f3285d));
        C0949e eVar3 = eVar2;
        C0949e eVar4 = eVar;
        C0949e eVar5 = eVar3;
        while (eVar5 != null) {
            C0949e eVar6 = eVar5.f3288c;
            eVar5.f3288c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* renamed from: a */
    private void m4086a(StringBuilder sb) {
        try {
            Object a = m4082a(this);
            sb.append("SUCCESS, result=[");
            sb.append(m4091d(a));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: a */
    private static CancellationException m4083a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
