package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.C10483v;
import kotlin.C10485x;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p262y.C10525m;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Transmitter;
import okhttp3.internal.platform.Platform;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003*\u0001\n\u0018\u0000 12\u00020\u0001:\u00011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0014J\u0006\u0010$\u001a\u00020\u0003J\u0006\u0010%\u001a\u00020\u001dJ\u0006\u0010&\u001a\u00020\u0003J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u000e\u0010(\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0014J.\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010/2\u0006\u00100\u001a\u00020\rR\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00062"}, mo16641d2 = {"Lokhttp3/internal/connection/RealConnectionPool;", "", "maxIdleConnections", "", "keepAliveDuration", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(IJLjava/util/concurrent/TimeUnit;)V", "cleanupRunnable", "okhttp3/internal/connection/RealConnectionPool$cleanupRunnable$1", "Lokhttp3/internal/connection/RealConnectionPool$cleanupRunnable$1;", "cleanupRunning", "", "getCleanupRunning", "()Z", "setCleanupRunning", "(Z)V", "connections", "Ljava/util/ArrayDeque;", "Lokhttp3/internal/connection/RealConnection;", "keepAliveDurationNs", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lokhttp3/internal/connection/RouteDatabase;", "cleanup", "now", "connectFailed", "", "failedRoute", "Lokhttp3/Route;", "failure", "Ljava/io/IOException;", "connectionBecameIdle", "connection", "connectionCount", "evictAll", "idleConnectionCount", "pruneAndGetAllocationCount", "put", "transmitterAcquirePooledConnection", "address", "Lokhttp3/Address;", "transmitter", "Lokhttp3/internal/connection/Transmitter;", "routes", "", "requireMultiplexed", "Companion", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: RealConnectionPool.kt */
public final class RealConnectionPool {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final ThreadPoolExecutor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
    private final RealConnectionPool$cleanupRunnable$1 cleanupRunnable = new RealConnectionPool$cleanupRunnable$1(this);
    private boolean cleanupRunning;
    private final ArrayDeque<RealConnection> connections = new ArrayDeque<>();
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;
    private final RouteDatabase routeDatabase = new RouteDatabase();

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo16641d2 = {"Lokhttp3/internal/connection/RealConnectionPool$Companion;", "", "()V", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "get", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionPool", "Lokhttp3/ConnectionPool;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: RealConnectionPool.kt */
    public static final class Companion {
        private Companion() {
        }

        public final RealConnectionPool get(ConnectionPool connectionPool) {
            C10202j.m34178b(connectionPool, "connectionPool");
            return connectionPool.getDelegate$okhttp();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RealConnectionPool(int i, long j, TimeUnit timeUnit) {
        C10202j.m34178b(timeUnit, "timeUnit");
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        if (!(j > 0)) {
            throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j).toString());
        }
    }

    private final int pruneAndGetAllocationCount(RealConnection realConnection, long j) {
        List<Reference<Transmitter>> transmitters = realConnection.getTransmitters();
        int i = 0;
        while (i < transmitters.size()) {
            Reference reference = transmitters.get(i);
            if (reference.get() != null) {
                i++;
            } else if (reference != null) {
                Platform.Companion.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. " + "Did you forget to close a response body?", ((Transmitter.TransmitterReference) reference).getCallStackTrace());
                transmitters.remove(i);
                realConnection.setNoNewExchanges(true);
                if (transmitters.isEmpty()) {
                    realConnection.setIdleAtNanos$okhttp(j - this.keepAliveDurationNs);
                    return 0;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type okhttp3.internal.connection.Transmitter.TransmitterReference");
            }
        }
        return transmitters.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005b, code lost:
        if (r6 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005d, code lost:
        okhttp3.internal.Util.closeQuietly(r6.socket());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0067, code lost:
        kotlin.jvm.internal.C10202j.m34172a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006a, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long cleanup(long r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.ArrayDeque<okhttp3.internal.connection.RealConnection> r0 = r12.connections     // Catch:{ all -> 0x006b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x006b }
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r6 = r1
            r5 = 0
            r7 = 0
        L_0x000e:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x006b }
            if (r8 == 0) goto L_0x0037
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x006b }
            okhttp3.internal.connection.RealConnection r8 = (okhttp3.internal.connection.RealConnection) r8     // Catch:{ all -> 0x006b }
            java.lang.String r9 = "connection"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r8, (java.lang.String) r9)     // Catch:{ all -> 0x006b }
            int r9 = r12.pruneAndGetAllocationCount(r8, r13)     // Catch:{ all -> 0x006b }
            if (r9 <= 0) goto L_0x0028
            int r7 = r7 + 1
            goto L_0x000e
        L_0x0028:
            int r5 = r5 + 1
            long r9 = r8.getIdleAtNanos$okhttp()     // Catch:{ all -> 0x006b }
            long r9 = r13 - r9
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x000e
            r6 = r8
            r3 = r9
            goto L_0x000e
        L_0x0037:
            long r13 = r12.keepAliveDurationNs     // Catch:{ all -> 0x006b }
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            int r13 = r12.maxIdleConnections     // Catch:{ all -> 0x006b }
            if (r5 <= r13) goto L_0x0042
            goto L_0x0055
        L_0x0042:
            if (r5 <= 0) goto L_0x0049
            long r13 = r12.keepAliveDurationNs     // Catch:{ all -> 0x006b }
            long r13 = r13 - r3
            monitor-exit(r12)
            return r13
        L_0x0049:
            if (r7 <= 0) goto L_0x004f
            long r13 = r12.keepAliveDurationNs     // Catch:{ all -> 0x006b }
            monitor-exit(r12)
            return r13
        L_0x004f:
            r12.cleanupRunning = r2     // Catch:{ all -> 0x006b }
            r13 = -1
            monitor-exit(r12)
            return r13
        L_0x0055:
            java.util.ArrayDeque<okhttp3.internal.connection.RealConnection> r13 = r12.connections     // Catch:{ all -> 0x006b }
            r13.remove(r6)     // Catch:{ all -> 0x006b }
            monitor-exit(r12)
            if (r6 == 0) goto L_0x0067
            java.net.Socket r13 = r6.socket()
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r13)
            r13 = 0
            return r13
        L_0x0067:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r1
        L_0x006b:
            r13 = move-exception
            monitor-exit(r12)
            goto L_0x006f
        L_0x006e:
            throw r13
        L_0x006f:
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnectionPool.cleanup(long):long");
    }

    public final void connectFailed(Route route, IOException iOException) {
        C10202j.m34178b(route, "failedRoute");
        C10202j.m34178b(iOException, "failure");
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = route.address();
            address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
        }
        this.routeDatabase.failed(route);
    }

    public final boolean connectionBecameIdle(RealConnection realConnection) {
        C10202j.m34178b(realConnection, "connection");
        boolean holdsLock = Thread.holdsLock(this);
        if (C10485x.f28360a && !holdsLock) {
            throw new AssertionError("Assertion failed");
        } else if (realConnection.getNoNewExchanges() || this.maxIdleConnections == 0) {
            this.connections.remove(realConnection);
            return true;
        } else {
            notifyAll();
            return false;
        }
    }

    public final synchronized int connectionCount() {
        return this.connections.size();
    }

    public final void evictAll() {
        ArrayList<RealConnection> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<RealConnection> it = this.connections.iterator();
            C10202j.m34174a((Object) it, "connections.iterator()");
            while (it.hasNext()) {
                RealConnection next = it.next();
                if (next.getTransmitters().isEmpty()) {
                    next.setNoNewExchanges(true);
                    C10202j.m34174a((Object) next, "connection");
                    arrayList.add(next);
                    it.remove();
                }
            }
            C10483v vVar = C10483v.f28357a;
        }
        for (RealConnection socket : arrayList) {
            Util.closeQuietly(socket.socket());
        }
    }

    public final boolean getCleanupRunning() {
        return this.cleanupRunning;
    }

    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    public final synchronized int idleConnectionCount() {
        int i;
        ArrayDeque<RealConnection> arrayDeque = this.connections;
        i = 0;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            for (RealConnection transmitters : arrayDeque) {
                if (transmitters.getTransmitters().isEmpty()) {
                    i++;
                    if (i < 0) {
                        C10525m.m35683b();
                        throw null;
                    }
                }
            }
        }
        return i;
    }

    public final void put(RealConnection realConnection) {
        C10202j.m34178b(realConnection, "connection");
        boolean holdsLock = Thread.holdsLock(this);
        if (!C10485x.f28360a || holdsLock) {
            if (!this.cleanupRunning) {
                this.cleanupRunning = true;
                executor.execute(this.cleanupRunnable);
            }
            this.connections.add(realConnection);
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public final void setCleanupRunning(boolean z) {
        this.cleanupRunning = z;
    }

    public final boolean transmitterAcquirePooledConnection(Address address, Transmitter transmitter, List<Route> list, boolean z) {
        C10202j.m34178b(address, "address");
        C10202j.m34178b(transmitter, "transmitter");
        boolean holdsLock = Thread.holdsLock(this);
        if (!C10485x.f28360a || holdsLock) {
            Iterator<RealConnection> it = this.connections.iterator();
            while (it.hasNext()) {
                RealConnection next = it.next();
                if ((!z || next.isMultiplexed()) && next.isEligible$okhttp(address, list)) {
                    C10202j.m34174a((Object) next, "connection");
                    transmitter.acquireConnectionNoEvents(next);
                    return true;
                }
            }
            return false;
        }
        throw new AssertionError("Assertion failed");
    }
}
