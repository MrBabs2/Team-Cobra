package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.C10483v;
import kotlin.C10485x;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010J0\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u0010H\u0002J8\u0010%\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\u0006\u0010&\u001a\u00020\u0010J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010'\u001a\u00020\u0010H\u0002J\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, mo16641d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "transmitter", "Lokhttp3/internal/connection/Transmitter;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "address", "Lokhttp3/Address;", "call", "Lokhttp3/Call;", "eventListener", "Lokhttp3/EventListener;", "(Lokhttp3/internal/connection/Transmitter;Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/Call;Lokhttp3/EventListener;)V", "connectingConnection", "Lokhttp3/internal/connection/RealConnection;", "hasStreamFailure", "", "nextRouteToTry", "Lokhttp3/Route;", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "find", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "chain", "Lokhttp3/Interceptor$Chain;", "doExtensiveHealthChecks", "findConnection", "connectTimeout", "", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", "findHealthyConnection", "hasRouteToTry", "retryCurrentRoute", "trackFailure", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: ExchangeFinder.kt */
public final class ExchangeFinder {
    private final Address address;
    private final Call call;
    private RealConnection connectingConnection;
    private final RealConnectionPool connectionPool;
    private final EventListener eventListener;
    private boolean hasStreamFailure;
    private Route nextRouteToTry;
    private RouteSelector.Selection routeSelection;
    private final RouteSelector routeSelector = new RouteSelector(this.address, this.connectionPool.getRouteDatabase(), this.call, this.eventListener);
    private final Transmitter transmitter;

    public ExchangeFinder(Transmitter transmitter2, RealConnectionPool realConnectionPool, Address address2, Call call2, EventListener eventListener2) {
        C10202j.m34178b(transmitter2, "transmitter");
        C10202j.m34178b(realConnectionPool, "connectionPool");
        C10202j.m34178b(address2, "address");
        C10202j.m34178b(call2, "call");
        C10202j.m34178b(eventListener2, "eventListener");
        this.transmitter = transmitter2;
        this.connectionPool = realConnectionPool;
        this.address = address2;
        this.call = call2;
        this.eventListener = eventListener2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    private final okhttp3.internal.connection.RealConnection findConnection(int r19, int r20, int r21, int r22, boolean r23) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            kotlin.jvm.internal.w r0 = new kotlin.jvm.internal.w
            r0.<init>()
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            monitor-enter(r2)
            okhttp3.internal.connection.Transmitter r3 = r1.transmitter     // Catch:{ all -> 0x01ef }
            boolean r3 = r3.isCanceled()     // Catch:{ all -> 0x01ef }
            if (r3 != 0) goto L_0x01e7
            r3 = 0
            r1.hasStreamFailure = r3     // Catch:{ all -> 0x01ef }
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch:{ all -> 0x01ef }
            okhttp3.internal.connection.RealConnection r4 = r4.getConnection()     // Catch:{ all -> 0x01ef }
            r0.f27854f = r4     // Catch:{ all -> 0x01ef }
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch:{ all -> 0x01ef }
            okhttp3.internal.connection.RealConnection r4 = r4.getConnection()     // Catch:{ all -> 0x01ef }
            r5 = 0
            if (r4 == 0) goto L_0x003f
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch:{ all -> 0x01ef }
            okhttp3.internal.connection.RealConnection r4 = r4.getConnection()     // Catch:{ all -> 0x01ef }
            if (r4 == 0) goto L_0x003b
            boolean r4 = r4.getNoNewExchanges()     // Catch:{ all -> 0x01ef }
            if (r4 == 0) goto L_0x003f
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch:{ all -> 0x01ef }
            java.net.Socket r4 = r4.releaseConnectionNoEvents()     // Catch:{ all -> 0x01ef }
            goto L_0x0040
        L_0x003b:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x01ef }
            throw r5
        L_0x003f:
            r4 = r5
        L_0x0040:
            okhttp3.internal.connection.Transmitter r6 = r1.transmitter     // Catch:{ all -> 0x01ef }
            okhttp3.internal.connection.RealConnection r6 = r6.getConnection()     // Catch:{ all -> 0x01ef }
            if (r6 == 0) goto L_0x0051
            okhttp3.internal.connection.Transmitter r6 = r1.transmitter     // Catch:{ all -> 0x01ef }
            okhttp3.internal.connection.RealConnection r6 = r6.getConnection()     // Catch:{ all -> 0x01ef }
            r0.f27854f = r5     // Catch:{ all -> 0x01ef }
            goto L_0x0052
        L_0x0051:
            r6 = r5
        L_0x0052:
            r7 = 1
            if (r6 != 0) goto L_0x008a
            okhttp3.internal.connection.RealConnectionPool r8 = r1.connectionPool     // Catch:{ all -> 0x01ef }
            okhttp3.Address r9 = r1.address     // Catch:{ all -> 0x01ef }
            okhttp3.internal.connection.Transmitter r10 = r1.transmitter     // Catch:{ all -> 0x01ef }
            boolean r8 = r8.transmitterAcquirePooledConnection(r9, r10, r5, r3)     // Catch:{ all -> 0x01ef }
            if (r8 == 0) goto L_0x006a
            okhttp3.internal.connection.Transmitter r6 = r1.transmitter     // Catch:{ all -> 0x01ef }
            okhttp3.internal.connection.RealConnection r6 = r6.getConnection()     // Catch:{ all -> 0x01ef }
            r8 = r5
            r9 = 1
            goto L_0x008c
        L_0x006a:
            okhttp3.Route r8 = r1.nextRouteToTry     // Catch:{ all -> 0x01ef }
            if (r8 == 0) goto L_0x0073
            okhttp3.Route r8 = r1.nextRouteToTry     // Catch:{ all -> 0x01ef }
            r1.nextRouteToTry = r5     // Catch:{ all -> 0x01ef }
            goto L_0x008b
        L_0x0073:
            boolean r8 = r18.retryCurrentRoute()     // Catch:{ all -> 0x01ef }
            if (r8 == 0) goto L_0x008a
            okhttp3.internal.connection.Transmitter r8 = r1.transmitter     // Catch:{ all -> 0x01ef }
            okhttp3.internal.connection.RealConnection r8 = r8.getConnection()     // Catch:{ all -> 0x01ef }
            if (r8 == 0) goto L_0x0086
            okhttp3.Route r8 = r8.route()     // Catch:{ all -> 0x01ef }
            goto L_0x008b
        L_0x0086:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x01ef }
            throw r5
        L_0x008a:
            r8 = r5
        L_0x008b:
            r9 = 0
        L_0x008c:
            kotlin.v r10 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x01ef }
            monitor-exit(r2)
            if (r4 == 0) goto L_0x0094
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r4)
        L_0x0094:
            T r0 = r0.f27854f
            r2 = r0
            okhttp3.internal.connection.RealConnection r2 = (okhttp3.internal.connection.RealConnection) r2
            if (r2 == 0) goto L_0x00ab
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.Call r4 = r1.call
            okhttp3.internal.connection.RealConnection r0 = (okhttp3.internal.connection.RealConnection) r0
            if (r0 == 0) goto L_0x00a7
            r2.connectionReleased(r4, r0)
            goto L_0x00ab
        L_0x00a7:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x00ab:
            if (r9 == 0) goto L_0x00bb
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.Call r2 = r1.call
            if (r6 == 0) goto L_0x00b7
            r0.connectionAcquired(r2, r6)
            goto L_0x00bb
        L_0x00b7:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x00bb:
            if (r6 == 0) goto L_0x00c4
            if (r6 == 0) goto L_0x00c0
            return r6
        L_0x00c0:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x00c4:
            if (r8 != 0) goto L_0x00e1
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.routeSelection
            if (r0 == 0) goto L_0x00d7
            if (r0 == 0) goto L_0x00d3
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x00e1
            goto L_0x00d7
        L_0x00d3:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x00d7:
            okhttp3.internal.connection.RouteSelector r0 = r1.routeSelector
            okhttp3.internal.connection.RouteSelector$Selection r0 = r0.next()
            r1.routeSelection = r0
            r0 = 1
            goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            monitor-enter(r2)
            okhttp3.internal.connection.Transmitter r4 = r1.transmitter     // Catch:{ all -> 0x01e4 }
            boolean r4 = r4.isCanceled()     // Catch:{ all -> 0x01e4 }
            if (r4 != 0) goto L_0x01dc
            if (r0 == 0) goto L_0x010f
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.routeSelection     // Catch:{ all -> 0x01e4 }
            if (r0 == 0) goto L_0x010b
            java.util.List r0 = r0.getRoutes()     // Catch:{ all -> 0x01e4 }
            okhttp3.internal.connection.RealConnectionPool r4 = r1.connectionPool     // Catch:{ all -> 0x01e4 }
            okhttp3.Address r10 = r1.address     // Catch:{ all -> 0x01e4 }
            okhttp3.internal.connection.Transmitter r11 = r1.transmitter     // Catch:{ all -> 0x01e4 }
            boolean r3 = r4.transmitterAcquirePooledConnection(r10, r11, r0, r3)     // Catch:{ all -> 0x01e4 }
            if (r3 == 0) goto L_0x0110
            okhttp3.internal.connection.Transmitter r3 = r1.transmitter     // Catch:{ all -> 0x01e4 }
            okhttp3.internal.connection.RealConnection r6 = r3.getConnection()     // Catch:{ all -> 0x01e4 }
            r9 = 1
            goto L_0x0110
        L_0x010b:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x01e4 }
            throw r5
        L_0x010f:
            r0 = r5
        L_0x0110:
            if (r9 != 0) goto L_0x0131
            if (r8 != 0) goto L_0x0121
            okhttp3.internal.connection.RouteSelector$Selection r3 = r1.routeSelection     // Catch:{ all -> 0x01e4 }
            if (r3 == 0) goto L_0x011d
            okhttp3.Route r8 = r3.next()     // Catch:{ all -> 0x01e4 }
            goto L_0x0121
        L_0x011d:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x01e4 }
            throw r5
        L_0x0121:
            okhttp3.internal.connection.RealConnection r6 = new okhttp3.internal.connection.RealConnection     // Catch:{ all -> 0x01e4 }
            okhttp3.internal.connection.RealConnectionPool r3 = r1.connectionPool     // Catch:{ all -> 0x01e4 }
            if (r8 == 0) goto L_0x012d
            r6.<init>(r3, r8)     // Catch:{ all -> 0x01e4 }
            r1.connectingConnection = r6     // Catch:{ all -> 0x01e4 }
            goto L_0x0131
        L_0x012d:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x01e4 }
            throw r5
        L_0x0131:
            kotlin.v r3 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x01e4 }
            monitor-exit(r2)
            if (r9 == 0) goto L_0x014a
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.Call r2 = r1.call
            if (r6 == 0) goto L_0x0146
            r0.connectionAcquired(r2, r6)
            if (r6 == 0) goto L_0x0142
            return r6
        L_0x0142:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x0146:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x014a:
            if (r6 == 0) goto L_0x01d8
            okhttp3.Call r2 = r1.call
            okhttp3.EventListener r3 = r1.eventListener
            r10 = r6
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r22
            r15 = r23
            r16 = r2
            r17 = r3
            r10.connect(r11, r12, r13, r14, r15, r16, r17)
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            okhttp3.internal.connection.RouteDatabase r2 = r2.getRouteDatabase()
            if (r6 == 0) goto L_0x01d4
            okhttp3.Route r3 = r6.route()
            r2.connected(r3)
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            monitor-enter(r2)
            r1.connectingConnection = r5     // Catch:{ all -> 0x01d1 }
            okhttp3.internal.connection.RealConnectionPool r3 = r1.connectionPool     // Catch:{ all -> 0x01d1 }
            okhttp3.Address r4 = r1.address     // Catch:{ all -> 0x01d1 }
            okhttp3.internal.connection.Transmitter r9 = r1.transmitter     // Catch:{ all -> 0x01d1 }
            boolean r0 = r3.transmitterAcquirePooledConnection(r4, r9, r0, r7)     // Catch:{ all -> 0x01d1 }
            if (r0 == 0) goto L_0x019e
            if (r6 == 0) goto L_0x019a
            r6.setNoNewExchanges(r7)     // Catch:{ all -> 0x01d1 }
            if (r6 == 0) goto L_0x0196
            java.net.Socket r0 = r6.socket()     // Catch:{ all -> 0x01d1 }
            okhttp3.internal.connection.Transmitter r3 = r1.transmitter     // Catch:{ all -> 0x01d1 }
            okhttp3.internal.connection.RealConnection r6 = r3.getConnection()     // Catch:{ all -> 0x01d1 }
            r1.nextRouteToTry = r8     // Catch:{ all -> 0x01d1 }
            goto L_0x01ad
        L_0x0196:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x01d1 }
            throw r5
        L_0x019a:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x01d1 }
            throw r5
        L_0x019e:
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch:{ all -> 0x01d1 }
            if (r6 == 0) goto L_0x01cd
            r0.put(r6)     // Catch:{ all -> 0x01d1 }
            okhttp3.internal.connection.Transmitter r0 = r1.transmitter     // Catch:{ all -> 0x01d1 }
            if (r6 == 0) goto L_0x01c9
            r0.acquireConnectionNoEvents(r6)     // Catch:{ all -> 0x01d1 }
            r0 = r5
        L_0x01ad:
            kotlin.v r3 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x01d1 }
            monitor-exit(r2)
            if (r0 == 0) goto L_0x01b5
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r0)
        L_0x01b5:
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.Call r2 = r1.call
            if (r6 == 0) goto L_0x01c5
            r0.connectionAcquired(r2, r6)
            if (r6 == 0) goto L_0x01c1
            return r6
        L_0x01c1:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x01c5:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x01c9:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x01d1 }
            throw r5
        L_0x01cd:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x01d1 }
            throw r5
        L_0x01d1:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01d4:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x01d8:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x01dc:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01e4 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x01e4 }
            throw r0     // Catch:{ all -> 0x01e4 }
        L_0x01e4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x01e7:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01ef }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x01ef }
            throw r0     // Catch:{ all -> 0x01ef }
        L_0x01ef:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.findConnection(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.isHealthy(r9) != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.internal.connection.RealConnection findHealthyConnection(int r4, int r5, int r6, int r7, boolean r8, boolean r9) throws java.io.IOException {
        /*
            r3 = this;
        L_0x0000:
            okhttp3.internal.connection.RealConnection r0 = r3.findConnection(r4, r5, r6, r7, r8)
            okhttp3.internal.connection.RealConnectionPool r1 = r3.connectionPool
            monitor-enter(r1)
            int r2 = r0.getSuccessCount$okhttp()     // Catch:{ all -> 0x001d }
            if (r2 != 0) goto L_0x000f
            monitor-exit(r1)
            return r0
        L_0x000f:
            kotlin.v r2 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x001d }
            monitor-exit(r1)
            boolean r1 = r0.isHealthy(r9)
            if (r1 != 0) goto L_0x001c
            r0.noNewExchanges()
            goto L_0x0000
        L_0x001c:
            return r0
        L_0x001d:
            r4 = move-exception
            monitor-exit(r1)
            goto L_0x0021
        L_0x0020:
            throw r4
        L_0x0021:
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.findHealthyConnection(int, int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }

    private final boolean retryCurrentRoute() {
        if (this.transmitter.getConnection() != null) {
            RealConnection connection = this.transmitter.getConnection();
            if (connection == null) {
                C10202j.m34172a();
                throw null;
            } else if (connection.getRouteFailureCount$okhttp() == 0) {
                RealConnection connection2 = this.transmitter.getConnection();
                if (connection2 == null) {
                    C10202j.m34172a();
                    throw null;
                } else if (Util.canReuseConnectionFor(connection2.route().address().url(), this.address.url())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final RealConnection connectingConnection() {
        boolean holdsLock = Thread.holdsLock(this.connectionPool);
        if (!C10485x.f28360a || holdsLock) {
            return this.connectingConnection;
        }
        throw new AssertionError("Assertion failed");
    }

    public final ExchangeCodec find(OkHttpClient okHttpClient, Interceptor.Chain chain, boolean z) {
        C10202j.m34178b(okHttpClient, "client");
        C10202j.m34178b(chain, "chain");
        try {
            return findHealthyConnection(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z).newCodec$okhttp(okHttpClient, chain);
        } catch (RouteException e) {
            trackFailure();
            throw e;
        } catch (IOException e2) {
            trackFailure();
            throw new RouteException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasRouteToTry() {
        /*
            r4 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r4.connectionPool
            monitor-enter(r0)
            okhttp3.Route r1 = r4.nextRouteToTry     // Catch:{ all -> 0x003e }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)
            return r2
        L_0x000a:
            boolean r1 = r4.retryCurrentRoute()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0025
            okhttp3.internal.connection.Transmitter r1 = r4.transmitter     // Catch:{ all -> 0x003e }
            okhttp3.internal.connection.RealConnection r1 = r1.getConnection()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0020
            okhttp3.Route r1 = r1.route()     // Catch:{ all -> 0x003e }
            r4.nextRouteToTry = r1     // Catch:{ all -> 0x003e }
            monitor-exit(r0)
            return r2
        L_0x0020:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x003e }
            r0 = 0
            throw r0
        L_0x0025:
            okhttp3.internal.connection.RouteSelector$Selection r1 = r4.routeSelection     // Catch:{ all -> 0x003e }
            r3 = 0
            if (r1 == 0) goto L_0x002f
            boolean r1 = r1.hasNext()     // Catch:{ all -> 0x003e }
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            if (r1 != 0) goto L_0x003c
            okhttp3.internal.connection.RouteSelector r1 = r4.routeSelector     // Catch:{ all -> 0x003e }
            boolean r1 = r1.hasNext()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            monitor-exit(r0)
            return r2
        L_0x003e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.hasRouteToTry():boolean");
    }

    public final boolean hasStreamFailure() {
        boolean z;
        synchronized (this.connectionPool) {
            z = this.hasStreamFailure;
        }
        return z;
    }

    public final void trackFailure() {
        boolean z = !Thread.holdsLock(this.connectionPool);
        if (!C10485x.f28360a || z) {
            synchronized (this.connectionPool) {
                this.hasStreamFailure = true;
                C10483v vVar = C10483v.f28357a;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }
}
