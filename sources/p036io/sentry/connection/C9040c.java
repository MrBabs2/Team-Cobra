package p036io.sentry.connection;

import java.io.IOException;
import java.io.NotSerializableException;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p120q.p121b.p353h.C11509a;
import p120q.p121b.p358k.C11537a;
import p120q.p121b.p359l.C11542b;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: io.sentry.connection.c */
/* compiled from: BufferedConnection */
public class C9040c implements C9045d {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C12938b f25587m = C12939c.m41777a((Class<?>) C9040c.class);

    /* renamed from: f */
    private final C9044d f25588f = new C9044d(this, (C9041a) null);

    /* renamed from: g */
    private final ScheduledExecutorService f25589g = Executors.newSingleThreadScheduledExecutor(new C9041a(this));

    /* renamed from: h */
    private C9045d f25590h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C11509a f25591i;

    /* renamed from: j */
    private boolean f25592j;

    /* renamed from: k */
    private long f25593k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public volatile boolean f25594l = false;

    /* renamed from: io.sentry.connection.c$a */
    /* compiled from: BufferedConnection */
    class C9041a implements ThreadFactory {
        C9041a(C9040c cVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        }
    }

    /* renamed from: io.sentry.connection.c$b */
    /* compiled from: BufferedConnection */
    class C9042b implements C9045d {

        /* renamed from: f */
        final C9045d f25595f = this.f25596g;

        /* renamed from: g */
        final /* synthetic */ C9045d f25596g;

        C9042b(C9045d dVar) {
            this.f25596g = dVar;
        }

        /* renamed from: a */
        public void mo33402a(C11542b bVar) throws ConnectionException {
            try {
                C9040c.this.f25591i.mo37627a(bVar);
            } catch (RuntimeException e) {
                C9040c.f25587m.mo41308a("Exception occurred while attempting to add Event to buffer: ", (Throwable) e);
            }
            this.f25595f.mo33402a(bVar);
        }

        public void close() throws IOException {
            this.f25595f.close();
        }
    }

    /* renamed from: io.sentry.connection.c$c */
    /* compiled from: BufferedConnection */
    private class C9043c implements Runnable {

        /* renamed from: f */
        private long f25598f;

        C9043c(long j) {
            this.f25598f = j;
        }

        public void run() {
            C9040c.f25587m.mo41319d("Running Flusher");
            C11537a.m37700c();
            try {
                Iterator<C11542b> a = C9040c.this.f25591i.mo37626a();
                while (a.hasNext() && !C9040c.this.f25594l) {
                    C11542b next = a.next();
                    long currentTimeMillis = System.currentTimeMillis() - next.mo37691s().getTime();
                    if (currentTimeMillis < this.f25598f) {
                        C12938b a2 = C9040c.f25587m;
                        a2.mo41319d("Ignoring buffered event because it only " + currentTimeMillis + "ms old.");
                        C11537a.m37701d();
                        return;
                    }
                    try {
                        C12938b a3 = C9040c.f25587m;
                        a3.mo41319d("Flusher attempting to send Event: " + next.mo37681i());
                        C9040c.this.mo33402a(next);
                        C12938b a4 = C9040c.f25587m;
                        a4.mo41319d("Flusher successfully sent Event: " + next.mo37681i());
                    } catch (RuntimeException e) {
                        C12938b a5 = C9040c.f25587m;
                        a5.mo41321d("Flusher failed to send Event: " + next.mo37681i(), (Throwable) e);
                        C9040c.f25587m.mo41319d("Flusher run exiting early.");
                        C11537a.m37701d();
                        return;
                    }
                }
                C9040c.f25587m.mo41319d("Flusher run exiting, no more events to send.");
            } catch (RuntimeException e2) {
                C9040c.f25587m.mo41308a("Error running Flusher: ", (Throwable) e2);
            } catch (Throwable th) {
                C11537a.m37701d();
                throw th;
            }
            C11537a.m37701d();
        }
    }

    public C9040c(C9045d dVar, C11509a aVar, long j, boolean z, long j2) {
        this.f25590h = dVar;
        this.f25591i = aVar;
        this.f25592j = z;
        this.f25593k = j2;
        if (z) {
            Runtime.getRuntime().addShutdownHook(this.f25588f);
        }
        this.f25589g.scheduleWithFixedDelay(new C9043c(j), j, j, TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        java.lang.Thread.currentThread().interrupt();
        f25587m.mo41315c("Graceful shutdown interrupted, forcing the shutdown.");
        f25587m.mo41306a("{} tasks failed to execute before the shutdown.", (java.lang.Object) java.lang.Integer.valueOf(r6.f25589g.shutdownNow().size()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0095, code lost:
        r6.f25590h.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0072 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "{} tasks failed to execute before the shutdown."
            boolean r1 = r6.f25592j
            if (r1 == 0) goto L_0x0011
            io.sentry.connection.c$d r1 = r6.f25588f
            p120q.p121b.p367q.C11591b.m37918a((java.lang.Thread) r1)
            io.sentry.connection.c$d r1 = r6.f25588f
            r2 = 0
            boolean unused = r1.f25600f = r2
        L_0x0011:
            t.b.b r1 = f25587m
            java.lang.String r2 = "Gracefully shutting down Sentry buffer threads."
            r1.mo41310b(r2)
            r1 = 1
            r6.f25594l = r1
            java.util.concurrent.ScheduledExecutorService r1 = r6.f25589g
            r1.shutdown()
            long r1 = r6.f25593k     // Catch:{ InterruptedException -> 0x0072 }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            r1 = 5000(0x1388, double:2.4703E-320)
        L_0x002a:
            java.util.concurrent.ScheduledExecutorService r3 = r6.f25589g     // Catch:{ InterruptedException -> 0x0072 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0072 }
            boolean r3 = r3.awaitTermination(r1, r4)     // Catch:{ InterruptedException -> 0x0072 }
            if (r3 == 0) goto L_0x0035
            goto L_0x0063
        L_0x0035:
            t.b.b r3 = f25587m     // Catch:{ InterruptedException -> 0x0072 }
            java.lang.String r4 = "Still waiting on buffer flusher executor to terminate."
            r3.mo41310b(r4)     // Catch:{ InterruptedException -> 0x0072 }
            goto L_0x002a
        L_0x003d:
            java.util.concurrent.ScheduledExecutorService r1 = r6.f25589g     // Catch:{ InterruptedException -> 0x0072 }
            long r2 = r6.f25593k     // Catch:{ InterruptedException -> 0x0072 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0072 }
            boolean r1 = r1.awaitTermination(r2, r4)     // Catch:{ InterruptedException -> 0x0072 }
            if (r1 != 0) goto L_0x0063
            t.b.b r1 = f25587m     // Catch:{ InterruptedException -> 0x0072 }
            java.lang.String r2 = "Graceful shutdown took too much time, forcing the shutdown."
            r1.mo41315c(r2)     // Catch:{ InterruptedException -> 0x0072 }
            java.util.concurrent.ScheduledExecutorService r1 = r6.f25589g     // Catch:{ InterruptedException -> 0x0072 }
            java.util.List r1 = r1.shutdownNow()     // Catch:{ InterruptedException -> 0x0072 }
            t.b.b r2 = f25587m     // Catch:{ InterruptedException -> 0x0072 }
            int r1 = r1.size()     // Catch:{ InterruptedException -> 0x0072 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InterruptedException -> 0x0072 }
            r2.mo41306a((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ InterruptedException -> 0x0072 }
        L_0x0063:
            t.b.b r1 = f25587m     // Catch:{ InterruptedException -> 0x0072 }
            java.lang.String r2 = "Shutdown finished."
            r1.mo41310b(r2)     // Catch:{ InterruptedException -> 0x0072 }
        L_0x006a:
            io.sentry.connection.d r0 = r6.f25590h
            r0.close()
            goto L_0x0094
        L_0x0070:
            r0 = move-exception
            goto L_0x0095
        L_0x0072:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0070 }
            r1.interrupt()     // Catch:{ all -> 0x0070 }
            t.b.b r1 = f25587m     // Catch:{ all -> 0x0070 }
            java.lang.String r2 = "Graceful shutdown interrupted, forcing the shutdown."
            r1.mo41315c(r2)     // Catch:{ all -> 0x0070 }
            java.util.concurrent.ScheduledExecutorService r1 = r6.f25589g     // Catch:{ all -> 0x0070 }
            java.util.List r1 = r1.shutdownNow()     // Catch:{ all -> 0x0070 }
            t.b.b r2 = f25587m     // Catch:{ all -> 0x0070 }
            int r1 = r1.size()     // Catch:{ all -> 0x0070 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0070 }
            r2.mo41306a((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x0070 }
            goto L_0x006a
        L_0x0094:
            return
        L_0x0095:
            io.sentry.connection.d r1 = r6.f25590h
            r1.close()
            goto L_0x009c
        L_0x009b:
            throw r0
        L_0x009c:
            goto L_0x009b
        */
        throw new UnsupportedOperationException("Method not decompiled: p036io.sentry.connection.C9040c.close():void");
    }

    /* renamed from: io.sentry.connection.c$d */
    /* compiled from: BufferedConnection */
    private final class C9044d extends Thread {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public volatile boolean f25600f;

        private C9044d() {
            this.f25600f = true;
        }

        public void run() {
            if (this.f25600f) {
                C11537a.m37700c();
                try {
                    C9040c.this.close();
                } catch (IOException | RuntimeException e) {
                    C9040c.f25587m.mo41308a("An exception occurred while closing the connection.", e);
                } catch (Throwable th) {
                    C11537a.m37701d();
                    throw th;
                }
                C11537a.m37701d();
            }
        }

        /* synthetic */ C9044d(C9040c cVar, C9041a aVar) {
            this();
        }
    }

    /* renamed from: a */
    public void mo33402a(C11542b bVar) {
        try {
            this.f25590h.mo33402a(bVar);
            this.f25591i.mo37628b(bVar);
        } catch (ConnectionException e) {
            boolean z = e.getCause() instanceof NotSerializableException;
            Integer b = e.mo33400b();
            if (z || b != null) {
                this.f25591i.mo37628b(bVar);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public C9045d mo33407a(C9045d dVar) {
        return new C9042b(dVar);
    }
}
