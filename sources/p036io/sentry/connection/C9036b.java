package p036io.sentry.connection;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p120q.p121b.C5311c;
import p120q.p121b.p358k.C11537a;
import p120q.p121b.p359l.C11542b;
import p120q.p121b.p367q.C11591b;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;
import p415t.p417b.C12940d;

/* renamed from: io.sentry.connection.b */
/* compiled from: AsyncConnection */
public class C9036b implements C9045d {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C12938b f25575l = C12939c.m41777a((Class<?>) C9036b.class);

    /* renamed from: f */
    final C9039c f25576f = new C9039c();

    /* renamed from: g */
    private final long f25577g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C9045d f25578h;

    /* renamed from: i */
    private final ExecutorService f25579i;

    /* renamed from: j */
    private boolean f25580j;

    /* renamed from: k */
    private volatile boolean f25581k;

    /* renamed from: io.sentry.connection.b$b */
    /* compiled from: AsyncConnection */
    private final class C9038b implements Runnable {

        /* renamed from: f */
        private final C11542b f25582f;

        /* renamed from: g */
        private Map<String, String> f25583g;

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
            if (r0 != null) goto L_0x0023;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
            if (r0 == null) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r4 = this;
                p120q.p121b.p358k.C11537a.m37700c()
                java.util.Map r0 = p415t.p417b.C12940d.m41800c()
                java.util.Map<java.lang.String, java.lang.String> r1 = r4.f25583g
                if (r1 != 0) goto L_0x000f
                p415t.p417b.C12940d.m41799b()
                goto L_0x0012
            L_0x000f:
                p415t.p417b.C12940d.m41798a(r1)
            L_0x0012:
                io.sentry.connection.b r1 = p036io.sentry.connection.C9036b.this     // Catch:{ LockedDownException | TooManyRequestsException -> 0x0039, RuntimeException -> 0x002c }
                io.sentry.connection.d r1 = r1.f25578h     // Catch:{ LockedDownException | TooManyRequestsException -> 0x0039, RuntimeException -> 0x002c }
                q.b.l.b r2 = r4.f25582f     // Catch:{ LockedDownException | TooManyRequestsException -> 0x0039, RuntimeException -> 0x002c }
                r1.mo33402a(r2)     // Catch:{ LockedDownException | TooManyRequestsException -> 0x0039, RuntimeException -> 0x002c }
                if (r0 != 0) goto L_0x0023
            L_0x001f:
                p415t.p417b.C12940d.m41799b()
                goto L_0x0026
            L_0x0023:
                p415t.p417b.C12940d.m41798a(r0)
            L_0x0026:
                p120q.p121b.p358k.C11537a.m37701d()
                goto L_0x0056
            L_0x002a:
                r1 = move-exception
                goto L_0x0057
            L_0x002c:
                r1 = move-exception
                t.b.b r2 = p036io.sentry.connection.C9036b.f25575l     // Catch:{ all -> 0x002a }
                java.lang.String r3 = "An exception occurred while sending the event to Sentry."
                r2.mo41308a((java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x002a }
                if (r0 != 0) goto L_0x0023
                goto L_0x001f
            L_0x0039:
                t.b.b r1 = p036io.sentry.connection.C9036b.f25575l     // Catch:{ all -> 0x002a }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002a }
                r2.<init>()     // Catch:{ all -> 0x002a }
                java.lang.String r3 = "Dropping an Event due to lockdown: "
                r2.append(r3)     // Catch:{ all -> 0x002a }
                q.b.l.b r3 = r4.f25582f     // Catch:{ all -> 0x002a }
                r2.append(r3)     // Catch:{ all -> 0x002a }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x002a }
                r1.mo41310b(r2)     // Catch:{ all -> 0x002a }
                if (r0 != 0) goto L_0x0023
                goto L_0x001f
            L_0x0056:
                return
            L_0x0057:
                if (r0 != 0) goto L_0x005d
                p415t.p417b.C12940d.m41799b()
                goto L_0x0060
            L_0x005d:
                p415t.p417b.C12940d.m41798a(r0)
            L_0x0060:
                p120q.p121b.p358k.C11537a.m37701d()
                goto L_0x0065
            L_0x0064:
                throw r1
            L_0x0065:
                goto L_0x0064
            */
            throw new UnsupportedOperationException("Method not decompiled: p036io.sentry.connection.C9036b.C9038b.run():void");
        }

        private C9038b(C11542b bVar, Map<String, String> map) {
            this.f25582f = bVar;
            this.f25583g = map;
        }
    }

    /* renamed from: io.sentry.connection.b$c */
    /* compiled from: AsyncConnection */
    private final class C9039c extends Thread {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public volatile boolean f25585f;

        private C9039c() {
            this.f25585f = true;
        }

        public void run() {
            if (this.f25585f) {
                C11537a.m37700c();
                try {
                    C9036b.this.m29718d();
                } catch (IOException | RuntimeException e) {
                    C9036b.f25575l.mo41308a("An exception occurred while closing the connection.", e);
                } catch (Throwable th) {
                    C11537a.m37701d();
                    throw th;
                }
                C11537a.m37701d();
            }
        }
    }

    static {
        C12939c.m41778a(C5311c.class.getName() + ".lockdown");
    }

    public C9036b(C9045d dVar, ExecutorService executorService, boolean z, long j) {
        this.f25578h = dVar;
        if (executorService == null) {
            this.f25579i = Executors.newSingleThreadExecutor();
        } else {
            this.f25579i = executorService;
        }
        if (z) {
            this.f25580j = z;
            m29716b();
        }
        this.f25577g = j;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        java.lang.Thread.currentThread().interrupt();
        f25575l.mo41315c("Graceful shutdown interrupted, forcing the shutdown.");
        f25575l.mo41306a("{} tasks failed to execute before shutdown.", (java.lang.Object) java.lang.Integer.valueOf(r6.f25579i.shutdownNow().size()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0086, code lost:
        r6.f25578h.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008c, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0063 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m29718d() throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "{} tasks failed to execute before shutdown."
            t.b.b r1 = f25575l
            java.lang.String r2 = "Gracefully shutting down Sentry async threads."
            r1.mo41310b(r2)
            r1 = 1
            r6.f25581k = r1
            java.util.concurrent.ExecutorService r1 = r6.f25579i
            r1.shutdown()
            long r1 = r6.f25577g     // Catch:{ InterruptedException -> 0x0063 }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x002e
            r1 = 5000(0x1388, double:2.4703E-320)
        L_0x001b:
            java.util.concurrent.ExecutorService r3 = r6.f25579i     // Catch:{ InterruptedException -> 0x0063 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0063 }
            boolean r3 = r3.awaitTermination(r1, r4)     // Catch:{ InterruptedException -> 0x0063 }
            if (r3 == 0) goto L_0x0026
            goto L_0x0054
        L_0x0026:
            t.b.b r3 = f25575l     // Catch:{ InterruptedException -> 0x0063 }
            java.lang.String r4 = "Still waiting on async executor to terminate."
            r3.mo41310b(r4)     // Catch:{ InterruptedException -> 0x0063 }
            goto L_0x001b
        L_0x002e:
            java.util.concurrent.ExecutorService r1 = r6.f25579i     // Catch:{ InterruptedException -> 0x0063 }
            long r2 = r6.f25577g     // Catch:{ InterruptedException -> 0x0063 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0063 }
            boolean r1 = r1.awaitTermination(r2, r4)     // Catch:{ InterruptedException -> 0x0063 }
            if (r1 != 0) goto L_0x0054
            t.b.b r1 = f25575l     // Catch:{ InterruptedException -> 0x0063 }
            java.lang.String r2 = "Graceful shutdown took too much time, forcing the shutdown."
            r1.mo41315c(r2)     // Catch:{ InterruptedException -> 0x0063 }
            java.util.concurrent.ExecutorService r1 = r6.f25579i     // Catch:{ InterruptedException -> 0x0063 }
            java.util.List r1 = r1.shutdownNow()     // Catch:{ InterruptedException -> 0x0063 }
            t.b.b r2 = f25575l     // Catch:{ InterruptedException -> 0x0063 }
            int r1 = r1.size()     // Catch:{ InterruptedException -> 0x0063 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InterruptedException -> 0x0063 }
            r2.mo41306a((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ InterruptedException -> 0x0063 }
        L_0x0054:
            t.b.b r1 = f25575l     // Catch:{ InterruptedException -> 0x0063 }
            java.lang.String r2 = "Shutdown finished."
            r1.mo41310b(r2)     // Catch:{ InterruptedException -> 0x0063 }
        L_0x005b:
            io.sentry.connection.d r0 = r6.f25578h
            r0.close()
            goto L_0x0085
        L_0x0061:
            r0 = move-exception
            goto L_0x0086
        L_0x0063:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0061 }
            r1.interrupt()     // Catch:{ all -> 0x0061 }
            t.b.b r1 = f25575l     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "Graceful shutdown interrupted, forcing the shutdown."
            r1.mo41315c(r2)     // Catch:{ all -> 0x0061 }
            java.util.concurrent.ExecutorService r1 = r6.f25579i     // Catch:{ all -> 0x0061 }
            java.util.List r1 = r1.shutdownNow()     // Catch:{ all -> 0x0061 }
            t.b.b r2 = f25575l     // Catch:{ all -> 0x0061 }
            int r1 = r1.size()     // Catch:{ all -> 0x0061 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0061 }
            r2.mo41306a((java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x0061 }
            goto L_0x005b
        L_0x0085:
            return
        L_0x0086:
            io.sentry.connection.d r1 = r6.f25578h
            r1.close()
            goto L_0x008d
        L_0x008c:
            throw r0
        L_0x008d:
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: p036io.sentry.connection.C9036b.m29718d():void");
    }

    public void close() throws IOException {
        if (this.f25580j) {
            C11591b.m37918a((Thread) this.f25576f);
            boolean unused = this.f25576f.f25585f = false;
        }
        m29718d();
    }

    /* renamed from: b */
    private void m29716b() {
        Runtime.getRuntime().addShutdownHook(this.f25576f);
    }

    /* renamed from: a */
    public void mo33402a(C11542b bVar) {
        if (!this.f25581k) {
            this.f25579i.execute(new C9038b(bVar, C12940d.m41800c()));
        }
    }
}
