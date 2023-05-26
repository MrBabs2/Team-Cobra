package p413s;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0004J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\rJ\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo16641d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "()V", "inQueue", "", "next", "timeoutAt", "", "enter", "", "exit", "Ljava/io/IOException;", "cause", "exit$jvm", "throwOnTimeout", "newTimeoutException", "remainingNanos", "now", "sink", "Lokio/Sink;", "source", "Lokio/Source;", "timedOut", "Companion", "Watchdog", "jvm"}, mo16642k = 1, mo16643mv = {1, 1, 11})
/* renamed from: s.d */
/* compiled from: AsyncTimeout.kt */
public class C12899d extends C12894b0 {
    public static final C12900a Companion = new C12900a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    /* access modifiers changed from: private */
    public static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    /* access modifiers changed from: private */
    public static C12899d head;
    private boolean inQueue;
    /* access modifiers changed from: private */
    public C12899d next;
    /* access modifiers changed from: private */
    public long timeoutAt;

    /* renamed from: s.d$a */
    /* compiled from: AsyncTimeout.kt */
    public static final class C12900a {
        private C12900a() {
        }

        public /* synthetic */ C12900a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m41537a(C12899d dVar, long j, boolean z) {
            Class<C12899d> cls = C12899d.class;
            synchronized (cls) {
                if (C12899d.head == null) {
                    C12899d.head = new C12899d();
                    new C12901b().start();
                }
                long nanoTime = System.nanoTime();
                if (j != 0 && z) {
                    dVar.timeoutAt = Math.min(j, dVar.deadlineNanoTime() - nanoTime) + nanoTime;
                } else if (j != 0) {
                    dVar.timeoutAt = j + nanoTime;
                } else if (z) {
                    dVar.timeoutAt = dVar.deadlineNanoTime();
                } else {
                    throw new AssertionError();
                }
                long access$remainingNanos = dVar.remainingNanos(nanoTime);
                C12899d access$getHead$cp = C12899d.head;
                if (access$getHead$cp != null) {
                    while (true) {
                        if (access$getHead$cp.next != null) {
                            C12899d access$getNext$p = access$getHead$cp.next;
                            if (access$getNext$p == null) {
                                C10202j.m34172a();
                                throw null;
                            } else if (access$remainingNanos < access$getNext$p.remainingNanos(nanoTime)) {
                                break;
                            } else {
                                access$getHead$cp = access$getHead$cp.next;
                                if (access$getHead$cp == null) {
                                    C10202j.m34172a();
                                    throw null;
                                }
                            }
                        }
                    }
                    dVar.next = access$getHead$cp.next;
                    access$getHead$cp.next = dVar;
                    if (access$getHead$cp == C12899d.head) {
                        cls.notify();
                    }
                    C10483v vVar = C10483v.f28357a;
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final boolean m41539a(C12899d dVar) {
            synchronized (C12899d.class) {
                for (C12899d access$getHead$cp = C12899d.head; access$getHead$cp != null; access$getHead$cp = access$getHead$cp.next) {
                    if (access$getHead$cp.next == dVar) {
                        access$getHead$cp.next = dVar.next;
                        dVar.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* renamed from: a */
        public final C12899d mo41128a() throws InterruptedException {
            Class<C12899d> cls = C12899d.class;
            C12899d access$getHead$cp = C12899d.head;
            if (access$getHead$cp != null) {
                C12899d access$getNext$p = access$getHead$cp.next;
                if (access$getNext$p == null) {
                    long nanoTime = System.nanoTime();
                    cls.wait(C12899d.IDLE_TIMEOUT_MILLIS);
                    C12899d access$getHead$cp2 = C12899d.head;
                    if (access$getHead$cp2 == null) {
                        C10202j.m34172a();
                        throw null;
                    } else if (access$getHead$cp2.next != null || System.nanoTime() - nanoTime < C12899d.IDLE_TIMEOUT_NANOS) {
                        return null;
                    } else {
                        return C12899d.head;
                    }
                } else {
                    long access$remainingNanos = access$getNext$p.remainingNanos(System.nanoTime());
                    if (access$remainingNanos > 0) {
                        long j = access$remainingNanos / 1000000;
                        cls.wait(j, (int) (access$remainingNanos - (1000000 * j)));
                        return null;
                    }
                    C12899d access$getHead$cp3 = C12899d.head;
                    if (access$getHead$cp3 != null) {
                        access$getHead$cp3.next = access$getNext$p.next;
                        access$getNext$p.next = null;
                        return access$getNext$p;
                    }
                    C10202j.m34172a();
                    throw null;
                }
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
    }

    /* renamed from: s.d$b */
    /* compiled from: AsyncTimeout.kt */
    private static final class C12901b extends Thread {
        public C12901b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001a, code lost:
            r1.timedOut();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<s.d> r0 = p413s.C12899d.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                s.d$a r1 = p413s.C12899d.Companion     // Catch:{ all -> 0x001e }
                s.d r1 = r1.mo41128a()     // Catch:{ all -> 0x001e }
                s.d r2 = p413s.C12899d.head     // Catch:{ all -> 0x001e }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                p413s.C12899d.head = r1     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0015:
                kotlin.v r2 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x001e }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.timedOut()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0022
            L_0x0021:
                throw r1
            L_0x0022:
                goto L_0x0021
            */
            throw new UnsupportedOperationException("Method not decompiled: p413s.C12899d.C12901b.run():void");
        }
    }

    /* renamed from: s.d$c */
    /* compiled from: AsyncTimeout.kt */
    public static final class C12902c implements C12932y {

        /* renamed from: f */
        final /* synthetic */ C12899d f33143f;

        /* renamed from: g */
        final /* synthetic */ C12932y f33144g;

        C12902c(C12899d dVar, C12932y yVar) {
            this.f33143f = dVar;
            this.f33144g = yVar;
        }

        public void close() {
            this.f33143f.enter();
            try {
                this.f33144g.close();
                this.f33143f.exit$jvm(true);
            } catch (IOException e) {
                throw this.f33143f.exit$jvm(e);
            } catch (Throwable th) {
                this.f33143f.exit$jvm(false);
                throw th;
            }
        }

        public void flush() {
            this.f33143f.enter();
            try {
                this.f33144g.flush();
                this.f33143f.exit$jvm(true);
            } catch (IOException e) {
                throw this.f33143f.exit$jvm(e);
            } catch (Throwable th) {
                this.f33143f.exit$jvm(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f33144g + ')';
        }

        public void write(C12905f fVar, long j) {
            C10202j.m34178b(fVar, "source");
            C12897c.m41512a(fVar.size(), 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C12927v vVar = fVar.f33148f;
                    if (vVar != null) {
                        while (true) {
                            if (j2 >= ((long) C12899d.TIMEOUT_WRITE_SIZE)) {
                                break;
                            }
                            j2 += (long) (vVar.f33195c - vVar.f33194b);
                            if (j2 >= j) {
                                j2 = j;
                                break;
                            }
                            vVar = vVar.f33198f;
                            if (vVar == null) {
                                C10202j.m34172a();
                                throw null;
                            }
                        }
                        this.f33143f.enter();
                        try {
                            this.f33144g.write(fVar, j2);
                            j -= j2;
                            this.f33143f.exit$jvm(true);
                        } catch (IOException e) {
                            throw this.f33143f.exit$jvm(e);
                        } catch (Throwable th) {
                            this.f33143f.exit$jvm(false);
                            throw th;
                        }
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                } else {
                    return;
                }
            }
        }

        public C12899d timeout() {
            return this.f33143f;
        }
    }

    /* renamed from: s.d$d */
    /* compiled from: AsyncTimeout.kt */
    public static final class C12903d implements C12892a0 {

        /* renamed from: f */
        final /* synthetic */ C12899d f33145f;

        /* renamed from: g */
        final /* synthetic */ C12892a0 f33146g;

        C12903d(C12899d dVar, C12892a0 a0Var) {
            this.f33145f = dVar;
            this.f33146g = a0Var;
        }

        public void close() {
            this.f33145f.enter();
            try {
                this.f33146g.close();
                this.f33145f.exit$jvm(true);
            } catch (IOException e) {
                throw this.f33145f.exit$jvm(e);
            } catch (Throwable th) {
                this.f33145f.exit$jvm(false);
                throw th;
            }
        }

        public long read(C12905f fVar, long j) {
            C10202j.m34178b(fVar, "sink");
            this.f33145f.enter();
            try {
                long read = this.f33146g.read(fVar, j);
                this.f33145f.exit$jvm(true);
                return read;
            } catch (IOException e) {
                throw this.f33145f.exit$jvm(e);
            } catch (Throwable th) {
                this.f33145f.exit$jvm(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f33146g + ')';
        }

        public C12899d timeout() {
            return this.f33145f;
        }
    }

    /* access modifiers changed from: private */
    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.inQueue = true;
                Companion.m41537a(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return Companion.m41539a(this);
    }

    public final void exit$jvm(boolean z) {
        if (exit() && z) {
            throw newTimeoutException((IOException) null);
        }
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final C12932y sink(C12932y yVar) {
        C10202j.m34178b(yVar, "sink");
        return new C12902c(this, yVar);
    }

    public final C12892a0 source(C12892a0 a0Var) {
        C10202j.m34178b(a0Var, "source");
        return new C12903d(this, a0Var);
    }

    /* access modifiers changed from: protected */
    public void timedOut() {
    }

    public final IOException exit$jvm(IOException iOException) {
        C10202j.m34178b(iOException, "cause");
        return !exit() ? iOException : newTimeoutException(iOException);
    }
}
