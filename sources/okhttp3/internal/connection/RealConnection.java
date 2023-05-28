package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.C10483v;
import kotlin.C10485x;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.p398ws.RealWebSocket;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import p413s.C12909g;
import p413s.C12910h;
import p413s.C12919p;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0001pB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u00105\u001a\u000206J>\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u00172\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@J(\u0010A\u001a\u0002062\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010B\u001a\u0002062\u0006\u0010C\u001a\u00020DH\u0002J0\u0010E\u001a\u0002062\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0002J*\u0010F\u001a\u0004\u0018\u00010G2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\t2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020JH\u0002J\b\u0010K\u001a\u00020GH\u0002J(\u0010L\u001a\u0002062\u0006\u0010C\u001a\u00020D2\u0006\u0010;\u001a\u00020\t2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J%\u0010M\u001a\u00020\u00172\u0006\u0010N\u001a\u00020O2\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010QH\u0000¢\u0006\u0002\bRJ\u000e\u0010S\u001a\u00020\u00172\u0006\u0010T\u001a\u00020\u0017J\u001d\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZH\u0000¢\u0006\u0002\b[J\u0015\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_H\u0000¢\u0006\u0002\b`J\u0006\u0010\u0019\u001a\u000206J\u0010\u0010a\u001a\u0002062\u0006\u0010b\u001a\u00020\u000fH\u0016J\u0010\u0010c\u001a\u0002062\u0006\u0010d\u001a\u00020eH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010f\u001a\u00020\u00172\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00060QH\u0002J\b\u0010)\u001a\u00020 H\u0016J\u0010\u0010h\u001a\u0002062\u0006\u0010;\u001a\u00020\tH\u0002J\u000e\u0010i\u001a\u00020\u00172\u0006\u0010I\u001a\u00020JJ\b\u0010j\u001a\u00020kH\u0016J\u0017\u0010l\u001a\u0002062\b\u0010m\u001a\u0004\u0018\u00010nH\u0000¢\u0006\u0002\boR\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020100¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006q"}, mo16641d2 = {"Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http2/Http2Connection$Listener;", "Lokhttp3/Connection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Route;)V", "allocationLimit", "", "getConnectionPool", "()Lokhttp3/internal/connection/RealConnectionPool;", "handshake", "Lokhttp3/Handshake;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "idleAtNanos", "", "getIdleAtNanos$okhttp", "()J", "setIdleAtNanos$okhttp", "(J)V", "isMultiplexed", "", "()Z", "noNewExchanges", "getNoNewExchanges", "setNoNewExchanges", "(Z)V", "protocol", "Lokhttp3/Protocol;", "rawSocket", "Ljava/net/Socket;", "refusedStreamCount", "routeFailureCount", "getRouteFailureCount$okhttp", "()I", "setRouteFailureCount$okhttp", "(I)V", "sink", "Lokio/BufferedSink;", "socket", "source", "Lokio/BufferedSource;", "successCount", "getSuccessCount$okhttp", "setSuccessCount$okhttp", "transmitters", "", "Ljava/lang/ref/Reference;", "Lokhttp3/internal/connection/Transmitter;", "getTransmitters", "()Ljava/util/List;", "cancel", "", "connect", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", "call", "Lokhttp3/Call;", "eventListener", "Lokhttp3/EventListener;", "connectSocket", "connectTls", "connectionSpecSelector", "Lokhttp3/internal/connection/ConnectionSpecSelector;", "connectTunnel", "createTunnel", "Lokhttp3/Request;", "tunnelRequest", "url", "Lokhttp3/HttpUrl;", "createTunnelRequest", "establishProtocol", "isEligible", "address", "Lokhttp3/Address;", "routes", "", "isEligible$okhttp", "isHealthy", "doExtensiveChecks", "newCodec", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "chain", "Lokhttp3/Interceptor$Chain;", "newCodec$okhttp", "newWebSocketStreams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "exchange", "Lokhttp3/internal/connection/Exchange;", "newWebSocketStreams$okhttp", "onSettings", "connection", "onStream", "stream", "Lokhttp3/internal/http2/Http2Stream;", "routeMatchesAny", "candidates", "startHttp2", "supportsUrl", "toString", "", "trackFailure", "e", "Ljava/io/IOException;", "trackFailure$okhttp", "Companion", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: RealConnection.kt */
public final class RealConnection extends Http2Connection.Listener implements Connection {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int MAX_TUNNEL_ATTEMPTS = 21;
    private static final String NPE_THROW_WITH_NULL = "throw with null exception";
    private int allocationLimit = 1;
    private final RealConnectionPool connectionPool;
    /* access modifiers changed from: private */
    public Handshake handshake;
    private Http2Connection http2Connection;
    private long idleAtNanos = Long.MAX_VALUE;
    private boolean noNewExchanges;
    private Protocol protocol;
    private Socket rawSocket;
    private int refusedStreamCount;
    private final Route route;
    private int routeFailureCount;
    private C12909g sink;
    /* access modifiers changed from: private */
    public Socket socket;
    private C12910h source;
    private int successCount;
    private final List<Reference<Transmitter>> transmitters = new ArrayList();

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo16641d2 = {"Lokhttp3/internal/connection/RealConnection$Companion;", "", "()V", "MAX_TUNNEL_ATTEMPTS", "", "NPE_THROW_WITH_NULL", "", "newTestConnection", "Lokhttp3/internal/connection/RealConnection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "idleAtNanos", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: RealConnection.kt */
    public static final class Companion {
        private Companion() {
        }

        public final RealConnection newTestConnection(RealConnectionPool realConnectionPool, Route route, Socket socket, long j) {
            C10202j.m34178b(realConnectionPool, "connectionPool");
            C10202j.m34178b(route, "route");
            C10202j.m34178b(socket, "socket");
            RealConnection realConnection = new RealConnection(realConnectionPool, route);
            realConnection.socket = socket;
            realConnection.setIdleAtNanos$okhttp(j);
            return realConnection;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            $EnumSwitchMapping$0[Proxy.Type.HTTP.ordinal()] = 2;
            int[] iArr2 = new int[ErrorCode.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[ErrorCode.REFUSED_STREAM.ordinal()] = 1;
            $EnumSwitchMapping$1[ErrorCode.CANCEL.ordinal()] = 2;
        }
    }

    public RealConnection(RealConnectionPool realConnectionPool, Route route2) {
        C10202j.m34178b(realConnectionPool, "connectionPool");
        C10202j.m34178b(route2, "route");
        this.connectionPool = realConnectionPool;
        this.route = route2;
    }

    private final void connectSocket(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Socket socket2;
        int i3;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) == 1 || i3 == 2)) {
            socket2 = address.socketFactory().createSocket();
            if (socket2 == null) {
                C10202j.m34172a();
                throw null;
            }
        } else {
            socket2 = new Socket(proxy);
        }
        this.rawSocket = socket2;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        socket2.setSoTimeout(i2);
        try {
            Platform.Companion.get().connectSocket(socket2, this.route.socketAddress(), i);
            try {
                this.source = C12919p.m41675a(C12919p.m41684b(socket2));
                this.sink = C12919p.m41674a(C12919p.m41681a(socket2));
            } catch (NullPointerException e) {
                if (C10202j.m34176a((Object) e.getMessage(), (Object) NPE_THROW_WITH_NULL)) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0199  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void connectTls(okhttp3.internal.connection.ConnectionSpecSelector r11) throws java.io.IOException {
        /*
            r10 = this;
            okhttp3.Route r0 = r10.route
            okhttp3.Address r0 = r0.address()
            javax.net.ssl.SSLSocketFactory r1 = r0.sslSocketFactory()
            r2 = 0
            if (r1 == 0) goto L_0x0188
            java.net.Socket r3 = r10.rawSocket     // Catch:{ all -> 0x0186 }
            okhttp3.HttpUrl r4 = r0.url()     // Catch:{ all -> 0x0186 }
            java.lang.String r4 = r4.host()     // Catch:{ all -> 0x0186 }
            okhttp3.HttpUrl r5 = r0.url()     // Catch:{ all -> 0x0186 }
            int r5 = r5.port()     // Catch:{ all -> 0x0186 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ all -> 0x0186 }
            if (r1 == 0) goto L_0x017e
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ all -> 0x0186 }
            okhttp3.ConnectionSpec r11 = r11.configureSecureSocket(r1)     // Catch:{ all -> 0x017b }
            boolean r3 = r11.supportsTlsExtensions()     // Catch:{ all -> 0x017b }
            if (r3 == 0) goto L_0x0047
            okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x017b }
            okhttp3.internal.platform.Platform r3 = r3.get()     // Catch:{ all -> 0x017b }
            okhttp3.HttpUrl r4 = r0.url()     // Catch:{ all -> 0x017b }
            java.lang.String r4 = r4.host()     // Catch:{ all -> 0x017b }
            java.util.List r5 = r0.protocols()     // Catch:{ all -> 0x017b }
            r3.configureTlsExtensions(r1, r4, r5)     // Catch:{ all -> 0x017b }
        L_0x0047:
            r1.startHandshake()     // Catch:{ all -> 0x017b }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ all -> 0x017b }
            okhttp3.Handshake$Companion r4 = okhttp3.Handshake.Companion     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "sslSocketSession"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r5)     // Catch:{ all -> 0x017b }
            okhttp3.Handshake r4 = r4.get(r3)     // Catch:{ all -> 0x017b }
            javax.net.ssl.HostnameVerifier r5 = r0.hostnameVerifier()     // Catch:{ all -> 0x017b }
            if (r5 == 0) goto L_0x0177
            okhttp3.HttpUrl r7 = r0.url()     // Catch:{ all -> 0x017b }
            java.lang.String r7 = r7.host()     // Catch:{ all -> 0x017b }
            boolean r3 = r5.verify(r7, r3)     // Catch:{ all -> 0x017b }
            if (r3 != 0) goto L_0x0106
            java.util.List r11 = r4.peerCertificates()     // Catch:{ all -> 0x017b }
            boolean r3 = r11.isEmpty()     // Catch:{ all -> 0x017b }
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x00e2
            r3 = 0
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x017b }
            if (r11 != 0) goto L_0x0087
            kotlin.TypeCastException r11 = new kotlin.TypeCastException     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r11.<init>(r0)     // Catch:{ all -> 0x017b }
            throw r11     // Catch:{ all -> 0x017b }
        L_0x0087:
            java.security.cert.X509Certificate r11 = (java.security.cert.X509Certificate) r11     // Catch:{ all -> 0x017b }
            javax.net.ssl.SSLPeerUnverifiedException r3 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r4.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "\n              |Hostname "
            r4.append(r5)     // Catch:{ all -> 0x017b }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x017b }
            r4.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = " not verified:\n              |    certificate: "
            r4.append(r0)     // Catch:{ all -> 0x017b }
            okhttp3.CertificatePinner$Companion r0 = okhttp3.CertificatePinner.Companion     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.pin(r11)     // Catch:{ all -> 0x017b }
            r4.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "\n              |    DN: "
            r4.append(r0)     // Catch:{ all -> 0x017b }
            java.security.Principal r0 = r11.getSubjectDN()     // Catch:{ all -> 0x017b }
            java.lang.String r5 = "cert.subjectDN"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r5)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x017b }
            r4.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = "\n              |    subjectAltNames: "
            r4.append(r0)     // Catch:{ all -> 0x017b }
            okhttp3.internal.tls.OkHostnameVerifier r0 = okhttp3.internal.tls.OkHostnameVerifier.INSTANCE     // Catch:{ all -> 0x017b }
            java.util.List r11 = r0.allSubjectAltNames(r11)     // Catch:{ all -> 0x017b }
            r4.append(r11)     // Catch:{ all -> 0x017b }
            java.lang.String r11 = "\n              "
            r4.append(r11)     // Catch:{ all -> 0x017b }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x017b }
            java.lang.String r11 = kotlin.p392j0.C12121o.m40026a(r11, r2, r6, r2)     // Catch:{ all -> 0x017b }
            r3.<init>(r11)     // Catch:{ all -> 0x017b }
            throw r3     // Catch:{ all -> 0x017b }
        L_0x00e2:
            javax.net.ssl.SSLPeerUnverifiedException r11 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x017b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x017b }
            r2.<init>()     // Catch:{ all -> 0x017b }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x017b }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x017b }
            r2.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x017b }
            r11.<init>(r0)     // Catch:{ all -> 0x017b }
            throw r11     // Catch:{ all -> 0x017b }
        L_0x0106:
            okhttp3.CertificatePinner r3 = r0.certificatePinner()     // Catch:{ all -> 0x017b }
            if (r3 == 0) goto L_0x0173
            okhttp3.Handshake r5 = new okhttp3.Handshake     // Catch:{ all -> 0x017b }
            okhttp3.TlsVersion r6 = r4.tlsVersion()     // Catch:{ all -> 0x017b }
            okhttp3.CipherSuite r7 = r4.cipherSuite()     // Catch:{ all -> 0x017b }
            java.util.List r8 = r4.localCertificates()     // Catch:{ all -> 0x017b }
            okhttp3.internal.connection.RealConnection$connectTls$1 r9 = new okhttp3.internal.connection.RealConnection$connectTls$1     // Catch:{ all -> 0x017b }
            r9.<init>(r3, r4, r0)     // Catch:{ all -> 0x017b }
            r5.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x017b }
            r10.handshake = r5     // Catch:{ all -> 0x017b }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ all -> 0x017b }
            java.lang.String r0 = r0.host()     // Catch:{ all -> 0x017b }
            okhttp3.internal.connection.RealConnection$connectTls$2 r4 = new okhttp3.internal.connection.RealConnection$connectTls$2     // Catch:{ all -> 0x017b }
            r4.<init>(r10)     // Catch:{ all -> 0x017b }
            r3.check$okhttp(r0, r4)     // Catch:{ all -> 0x017b }
            boolean r11 = r11.supportsTlsExtensions()     // Catch:{ all -> 0x017b }
            if (r11 == 0) goto L_0x0144
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x017b }
            okhttp3.internal.platform.Platform r11 = r11.get()     // Catch:{ all -> 0x017b }
            java.lang.String r2 = r11.getSelectedProtocol(r1)     // Catch:{ all -> 0x017b }
        L_0x0144:
            r10.socket = r1     // Catch:{ all -> 0x017b }
            s.a0 r11 = p413s.C12919p.m41684b((java.net.Socket) r1)     // Catch:{ all -> 0x017b }
            s.h r11 = p413s.C12919p.m41675a((p413s.C12892a0) r11)     // Catch:{ all -> 0x017b }
            r10.source = r11     // Catch:{ all -> 0x017b }
            s.y r11 = p413s.C12919p.m41681a((java.net.Socket) r1)     // Catch:{ all -> 0x017b }
            s.g r11 = p413s.C12919p.m41674a((p413s.C12932y) r11)     // Catch:{ all -> 0x017b }
            r10.sink = r11     // Catch:{ all -> 0x017b }
            if (r2 == 0) goto L_0x0163
            okhttp3.Protocol$Companion r11 = okhttp3.Protocol.Companion     // Catch:{ all -> 0x017b }
            okhttp3.Protocol r11 = r11.get(r2)     // Catch:{ all -> 0x017b }
            goto L_0x0165
        L_0x0163:
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_1_1     // Catch:{ all -> 0x017b }
        L_0x0165:
            r10.protocol = r11     // Catch:{ all -> 0x017b }
            if (r1 == 0) goto L_0x0172
            okhttp3.internal.platform.Platform$Companion r11 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r11 = r11.get()
            r11.afterHandshake(r1)
        L_0x0172:
            return
        L_0x0173:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x017b }
            throw r2
        L_0x0177:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x017b }
            throw r2
        L_0x017b:
            r11 = move-exception
            r2 = r1
            goto L_0x018c
        L_0x017e:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException     // Catch:{ all -> 0x0186 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r11.<init>(r0)     // Catch:{ all -> 0x0186 }
            throw r11     // Catch:{ all -> 0x0186 }
        L_0x0186:
            r11 = move-exception
            goto L_0x018c
        L_0x0188:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x0186 }
            throw r2
        L_0x018c:
            if (r2 == 0) goto L_0x0197
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            r0.afterHandshake(r2)
        L_0x0197:
            if (r2 == 0) goto L_0x019c
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r2)
        L_0x019c:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connectTls(okhttp3.internal.connection.ConnectionSpecSelector):void");
    }

    private final void connectTunnel(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        int i4 = 0;
        while (i4 < 21) {
            connectSocket(i, i2, call, eventListener);
            createTunnelRequest = createTunnel(i2, i3, createTunnelRequest, url);
            if (createTunnelRequest != null) {
                Socket socket2 = this.rawSocket;
                if (socket2 != null) {
                    Util.closeQuietly(socket2);
                }
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
                eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), (Protocol) null);
                i4++;
            } else {
                return;
            }
        }
    }

    private final Request createTunnel(int i, int i2, Request request, HttpUrl httpUrl) throws IOException {
        String str = "CONNECT " + Util.toHostHeader(httpUrl, true) + " HTTP/1.1";
        while (true) {
            C12910h hVar = this.source;
            if (hVar != null) {
                C12909g gVar = this.sink;
                if (gVar != null) {
                    Http1ExchangeCodec http1ExchangeCodec = new Http1ExchangeCodec((OkHttpClient) null, (RealConnection) null, hVar, gVar);
                    hVar.timeout().timeout((long) i, TimeUnit.MILLISECONDS);
                    gVar.timeout().timeout((long) i2, TimeUnit.MILLISECONDS);
                    http1ExchangeCodec.writeRequest(request.headers(), str);
                    http1ExchangeCodec.finishRequest();
                    Response.Builder readResponseHeaders = http1ExchangeCodec.readResponseHeaders(false);
                    if (readResponseHeaders != null) {
                        Response build = readResponseHeaders.request(request).build();
                        http1ExchangeCodec.skipConnectBody(build);
                        int code = build.code();
                        if (code != 200) {
                            if (code == 407) {
                                Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                                if (authenticate == null) {
                                    throw new IOException("Failed to authenticate with proxy");
                                } else if (C12130v.m40053b("close", Response.header$default(build, "Connection", (String) null, 2, (Object) null), true)) {
                                    return authenticate;
                                } else {
                                    request = authenticate;
                                }
                            } else {
                                throw new IOException("Unexpected response code for CONNECT: " + build.code());
                            }
                        } else if (hVar.getBuffer().mo41169g() && gVar.getBuffer().mo41169g()) {
                            return null;
                        } else {
                            throw new IOException("TLS tunnel buffered too many bytes!");
                        }
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
    }

    private final Request createTunnelRequest() throws IOException {
        Request build = new Request.Builder().url(this.route.address().url()).method("CONNECT", (RequestBody) null).header("Host", Util.toHostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent).build();
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1).receivedResponseAtMillis(-1).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        return authenticate != null ? authenticate : build;
    }

    private final void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i, Call call, EventListener eventListener) throws IOException {
        if (this.route.address().sslSocketFactory() != null) {
            eventListener.secureConnectStart(call);
            connectTls(connectionSpecSelector);
            eventListener.secureConnectEnd(call, this.handshake);
            if (this.protocol == Protocol.HTTP_2) {
                startHttp2(i);
            }
        } else if (this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            this.socket = this.rawSocket;
            this.protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            startHttp2(i);
        } else {
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
        }
    }

    private final boolean routeMatchesAny(List<Route> list) {
        boolean z;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Route route2 : list) {
                if (route2.proxy().type() == Proxy.Type.DIRECT && this.route.proxy().type() == Proxy.Type.DIRECT && C10202j.m34176a((Object) this.route.socketAddress(), (Object) route2.socketAddress())) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void startHttp2(int i) throws IOException {
        Socket socket2 = this.socket;
        if (socket2 != null) {
            C12910h hVar = this.source;
            if (hVar != null) {
                C12909g gVar = this.sink;
                if (gVar != null) {
                    socket2.setSoTimeout(0);
                    Http2Connection build = new Http2Connection.Builder(true).socket(socket2, this.route.address().url().host(), hVar, gVar).listener(this).pingIntervalMillis(i).build();
                    this.http2Connection = build;
                    Http2Connection.start$default(build, false, 1, (Object) null);
                    return;
                }
                C10202j.m34172a();
                throw null;
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }

    public final void cancel() {
        Socket socket2 = this.rawSocket;
        if (socket2 != null) {
            Util.closeQuietly(socket2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1 A[Catch:{ IOException -> 0x010a }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r0 = "call"
            kotlin.jvm.internal.C10202j.m34178b(r8, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.C10202j.m34178b(r9, r0)
            okhttp3.Protocol r0 = r7.protocol
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 == 0) goto L_0x0165
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.connectionSpecs()
            okhttp3.internal.connection.ConnectionSpecSelector r10 = new okhttp3.internal.connection.ConnectionSpecSelector
            r10.<init>(r0)
            okhttp3.Route r1 = r7.route
            okhttp3.Address r1 = r1.address()
            javax.net.ssl.SSLSocketFactory r1 = r1.sslSocketFactory()
            if (r1 != 0) goto L_0x0085
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0078
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r1 = r1.get()
            boolean r1 = r1.isCleartextTrafficPermitted(r0)
            if (r1 == 0) goto L_0x0057
            goto L_0x0097
        L_0x0057:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0078:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0085:
            okhttp3.Route r0 = r7.route
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.protocols()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0158
        L_0x0097:
            r11 = 0
            r12 = r11
        L_0x0099:
            okhttp3.Route r0 = r7.route     // Catch:{ IOException -> 0x010a }
            boolean r0 = r0.requiresTunnel()     // Catch:{ IOException -> 0x010a }
            if (r0 == 0) goto L_0x00ba
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.connectTunnel(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x010a }
            java.net.Socket r0 = r7.rawSocket     // Catch:{ IOException -> 0x010a }
            if (r0 != 0) goto L_0x00b5
            goto L_0x00d7
        L_0x00b5:
            r13 = r17
            r14 = r18
            goto L_0x00c1
        L_0x00ba:
            r13 = r17
            r14 = r18
            r7.connectSocket(r13, r14, r8, r9)     // Catch:{ IOException -> 0x0108 }
        L_0x00c1:
            r15 = r20
            r7.establishProtocol(r10, r15, r8, r9)     // Catch:{ IOException -> 0x0106 }
            okhttp3.Route r0 = r7.route     // Catch:{ IOException -> 0x0106 }
            java.net.InetSocketAddress r0 = r0.socketAddress()     // Catch:{ IOException -> 0x0106 }
            okhttp3.Route r1 = r7.route     // Catch:{ IOException -> 0x0106 }
            java.net.Proxy r1 = r1.proxy()     // Catch:{ IOException -> 0x0106 }
            okhttp3.Protocol r2 = r7.protocol     // Catch:{ IOException -> 0x0106 }
            r9.connectEnd(r8, r0, r1, r2)     // Catch:{ IOException -> 0x0106 }
        L_0x00d7:
            okhttp3.Route r0 = r7.route
            boolean r0 = r0.requiresTunnel()
            if (r0 == 0) goto L_0x00f1
            java.net.Socket r0 = r7.rawSocket
            if (r0 == 0) goto L_0x00e4
            goto L_0x00f1
        L_0x00e4:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00f1:
            okhttp3.internal.http2.Http2Connection r0 = r7.http2Connection
            if (r0 == 0) goto L_0x0105
            okhttp3.internal.connection.RealConnectionPool r1 = r7.connectionPool
            monitor-enter(r1)
            int r0 = r0.maxConcurrentStreams()     // Catch:{ all -> 0x0102 }
            r7.allocationLimit = r0     // Catch:{ all -> 0x0102 }
            kotlin.v r0 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x0102 }
            monitor-exit(r1)
            goto L_0x0105
        L_0x0102:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0105:
            return
        L_0x0106:
            r0 = move-exception
            goto L_0x0111
        L_0x0108:
            r0 = move-exception
            goto L_0x010f
        L_0x010a:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x010f:
            r15 = r20
        L_0x0111:
            java.net.Socket r1 = r7.socket
            if (r1 == 0) goto L_0x0118
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r1)
        L_0x0118:
            java.net.Socket r1 = r7.rawSocket
            if (r1 == 0) goto L_0x011f
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r1)
        L_0x011f:
            r7.socket = r11
            r7.rawSocket = r11
            r7.source = r11
            r7.sink = r11
            r7.handshake = r11
            r7.protocol = r11
            r7.http2Connection = r11
            okhttp3.Route r1 = r7.route
            java.net.InetSocketAddress r3 = r1.socketAddress()
            okhttp3.Route r1 = r7.route
            java.net.Proxy r4 = r1.proxy()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.connectFailed(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x014a
            okhttp3.internal.connection.RouteException r12 = new okhttp3.internal.connection.RouteException
            r12.<init>(r0)
            goto L_0x014d
        L_0x014a:
            r12.addConnectException(r0)
        L_0x014d:
            if (r21 == 0) goto L_0x0157
            boolean r0 = r10.connectionFailed(r0)
            if (r0 == 0) goto L_0x0157
            goto L_0x0099
        L_0x0157:
            throw r12
        L_0x0158:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0165:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x0172
        L_0x0171:
            throw r0
        L_0x0172:
            goto L_0x0171
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final RealConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    public final long getIdleAtNanos$okhttp() {
        return this.idleAtNanos;
    }

    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    public final int getRouteFailureCount$okhttp() {
        return this.routeFailureCount;
    }

    public final int getSuccessCount$okhttp() {
        return this.successCount;
    }

    public final List<Reference<Transmitter>> getTransmitters() {
        return this.transmitters;
    }

    public Handshake handshake() {
        return this.handshake;
    }

    public final boolean isEligible$okhttp(Address address, List<Route> list) {
        C10202j.m34178b(address, "address");
        if (this.transmitters.size() >= this.allocationLimit || this.noNewExchanges || !this.route.address().equalsNonHost$okhttp(address)) {
            return false;
        }
        if (C10202j.m34176a((Object) address.url().host(), (Object) route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || list == null || !routeMatchesAny(list) || address.hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            CertificatePinner certificatePinner = address.certificatePinner();
            if (certificatePinner != null) {
                String host = address.url().host();
                Handshake handshake2 = handshake();
                if (handshake2 != null) {
                    certificatePinner.check(host, (List<? extends Certificate>) handshake2.peerCertificates());
                    return true;
                }
                C10202j.m34172a();
                throw null;
            }
            C10202j.m34172a();
            throw null;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean isHealthy(boolean z) {
        int soTimeout;
        Socket socket2 = this.socket;
        if (socket2 != null) {
            C12910h hVar = this.source;
            if (hVar == null) {
                C10202j.m34172a();
                throw null;
            } else if (socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
                return false;
            } else {
                Http2Connection http2Connection2 = this.http2Connection;
                if (http2Connection2 != null) {
                    return !http2Connection2.isShutdown();
                }
                if (z) {
                    try {
                        soTimeout = socket2.getSoTimeout();
                        socket2.setSoTimeout(1);
                        boolean z2 = !hVar.mo41169g();
                        socket2.setSoTimeout(soTimeout);
                        return z2;
                    } catch (SocketTimeoutException unused) {
                    } catch (IOException unused2) {
                        return false;
                    } catch (Throwable th) {
                        socket2.setSoTimeout(soTimeout);
                        throw th;
                    }
                }
                return true;
            }
        } else {
            C10202j.m34172a();
            throw null;
        }
    }

    public final boolean isMultiplexed() {
        return this.http2Connection != null;
    }

    public final ExchangeCodec newCodec$okhttp(OkHttpClient okHttpClient, Interceptor.Chain chain) throws SocketException {
        C10202j.m34178b(okHttpClient, "client");
        C10202j.m34178b(chain, "chain");
        Socket socket2 = this.socket;
        if (socket2 != null) {
            C12910h hVar = this.source;
            if (hVar != null) {
                C12909g gVar = this.sink;
                if (gVar != null) {
                    Http2Connection http2Connection2 = this.http2Connection;
                    if (http2Connection2 != null) {
                        return new Http2ExchangeCodec(okHttpClient, this, chain, http2Connection2);
                    }
                    socket2.setSoTimeout(chain.readTimeoutMillis());
                    hVar.timeout().timeout((long) chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
                    gVar.timeout().timeout((long) chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
                    return new Http1ExchangeCodec(okHttpClient, this, hVar, gVar);
                }
                C10202j.m34172a();
                throw null;
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }

    public final RealWebSocket.Streams newWebSocketStreams$okhttp(Exchange exchange) throws SocketException {
        C10202j.m34178b(exchange, "exchange");
        Socket socket2 = this.socket;
        if (socket2 != null) {
            C12910h hVar = this.source;
            if (hVar != null) {
                C12909g gVar = this.sink;
                if (gVar != null) {
                    socket2.setSoTimeout(0);
                    noNewExchanges();
                    return new RealConnection$newWebSocketStreams$1(exchange, hVar, gVar, true, hVar, gVar);
                }
                C10202j.m34172a();
                throw null;
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }

    public final void noNewExchanges() {
        boolean z = !Thread.holdsLock(this.connectionPool);
        if (!C10485x.f28360a || z) {
            synchronized (this.connectionPool) {
                this.noNewExchanges = true;
                C10483v vVar = C10483v.f28357a;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public void onSettings(Http2Connection http2Connection2) {
        C10202j.m34178b(http2Connection2, "connection");
        synchronized (this.connectionPool) {
            this.allocationLimit = http2Connection2.maxConcurrentStreams();
            C10483v vVar = C10483v.f28357a;
        }
    }

    public void onStream(Http2Stream http2Stream) throws IOException {
        C10202j.m34178b(http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, (IOException) null);
    }

    public Protocol protocol() {
        Protocol protocol2 = this.protocol;
        if (protocol2 != null) {
            return protocol2;
        }
        C10202j.m34172a();
        throw null;
    }

    public Route route() {
        return this.route;
    }

    public final void setIdleAtNanos$okhttp(long j) {
        this.idleAtNanos = j;
    }

    public final void setNoNewExchanges(boolean z) {
        this.noNewExchanges = z;
    }

    public final void setRouteFailureCount$okhttp(int i) {
        this.routeFailureCount = i;
    }

    public final void setSuccessCount$okhttp(int i) {
        this.successCount = i;
    }

    public Socket socket() {
        Socket socket2 = this.socket;
        if (socket2 != null) {
            return socket2;
        }
        C10202j.m34172a();
        throw null;
    }

    public final boolean supportsUrl(HttpUrl httpUrl) {
        C10202j.m34178b(httpUrl, "url");
        HttpUrl url = this.route.address().url();
        if (httpUrl.port() != url.port()) {
            return false;
        }
        if (C10202j.m34176a((Object) httpUrl.host(), (Object) url.host())) {
            return true;
        }
        if (this.handshake == null) {
            return false;
        }
        OkHostnameVerifier okHostnameVerifier = OkHostnameVerifier.INSTANCE;
        String host = httpUrl.host();
        Handshake handshake2 = this.handshake;
        if (handshake2 != null) {
            Certificate certificate = handshake2.peerCertificates().get(0);
            if (certificate == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } else if (okHostnameVerifier.verify(host, (X509Certificate) certificate)) {
                return true;
            } else {
                return false;
            }
        } else {
            C10202j.m34172a();
            throw null;
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.route.address().url().host());
        sb.append(':');
        sb.append(this.route.address().url().port());
        sb.append(',');
        sb.append(" proxy=");
        sb.append(this.route.proxy());
        sb.append(" hostAddress=");
        sb.append(this.route.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake2 = this.handshake;
        if (handshake2 == null || (obj = handshake2.cipherSuite()) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    public final void trackFailure$okhttp(IOException iOException) {
        boolean z = !Thread.holdsLock(this.connectionPool);
        if (!C10485x.f28360a || z) {
            synchronized (this.connectionPool) {
                if (iOException instanceof StreamResetException) {
                    int i = WhenMappings.$EnumSwitchMapping$1[((StreamResetException) iOException).errorCode.ordinal()];
                    if (i == 1) {
                        int i2 = this.refusedStreamCount + 1;
                        this.refusedStreamCount = i2;
                        if (i2 > 1) {
                            this.noNewExchanges = true;
                            this.routeFailureCount++;
                        }
                    } else if (i != 2) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (!isMultiplexed() || (iOException instanceof ConnectionShutdownException)) {
                    this.noNewExchanges = true;
                    if (this.successCount == 0) {
                        if (iOException != null) {
                            this.connectionPool.connectFailed(this.route, iOException);
                        }
                        this.routeFailureCount++;
                    }
                }
                C10483v vVar = C10483v.f28357a;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }
}
