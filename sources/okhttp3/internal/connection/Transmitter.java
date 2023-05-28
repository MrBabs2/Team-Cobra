package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.C10483v;
import kotlin.C10485x;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.internal.Util;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.platform.Platform;
import p413s.C12894b0;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001 \u0018\u00002\u00020\u0001:\u0001FB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010#\u001a\u00020$2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020\tJ\u0006\u0010'\u001a\u00020$J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\u0006\u0010,\u001a\u00020$J;\u0010-\u001a\u0002H.\"\n\b\u0000\u0010.*\u0004\u0018\u00010/2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u0002H.H\u0000¢\u0006\u0004\b3\u00104J\u0006\u00105\u001a\u00020\tJ)\u00106\u001a\u0002H.\"\n\b\u0000\u0010.*\u0004\u0018\u00010/2\u0006\u00102\u001a\u0002H.2\u0006\u00107\u001a\u00020\tH\u0002¢\u0006\u0002\u00108J\u001d\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\tH\u0000¢\u0006\u0002\b=J\u0012\u0010\u001c\u001a\u0004\u0018\u00010/2\b\u00102\u001a\u0004\u0018\u00010/J\u000e\u0010>\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010?\u001a\u0004\u0018\u00010@J\u0006\u0010\u001f\u001a\u00020AJ\u0006\u0010\"\u001a\u00020$J\u0006\u0010B\u001a\u00020$J!\u0010C\u001a\u0002H.\"\n\b\u0000\u0010.*\u0004\u0018\u00010/2\u0006\u0010D\u001a\u0002H.H\u0002¢\u0006\u0002\u0010ER\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0004\n\u0002\u0010!R\u000e\u0010\"\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, mo16641d2 = {"Lokhttp3/internal/connection/Transmitter;", "", "client", "Lokhttp3/OkHttpClient;", "call", "Lokhttp3/Call;", "(Lokhttp3/OkHttpClient;Lokhttp3/Call;)V", "callStackTrace", "canceled", "", "connection", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "setConnection", "(Lokhttp3/internal/connection/RealConnection;)V", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "eventListener", "Lokhttp3/EventListener;", "exchange", "Lokhttp3/internal/connection/Exchange;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "exchangeRequestDone", "exchangeResponseDone", "isCanceled", "()Z", "noMoreExchanges", "request", "Lokhttp3/Request;", "timeout", "okhttp3/internal/connection/Transmitter$timeout$1", "Lokhttp3/internal/connection/Transmitter$timeout$1;", "timeoutEarlyExit", "acquireConnectionNoEvents", "", "callStart", "canRetry", "cancel", "createAddress", "Lokhttp3/Address;", "url", "Lokhttp3/HttpUrl;", "exchangeDoneDueToException", "exchangeMessageDone", "E", "Ljava/io/IOException;", "requestDone", "responseDone", "e", "exchangeMessageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "hasExchange", "maybeReleaseConnection", "force", "(Ljava/io/IOException;Z)Ljava/io/IOException;", "newExchange", "chain", "Lokhttp3/Interceptor$Chain;", "doExtensiveHealthChecks", "newExchange$okhttp", "prepareToConnect", "releaseConnectionNoEvents", "Ljava/net/Socket;", "Lokio/Timeout;", "timeoutEnter", "timeoutExit", "cause", "(Ljava/io/IOException;)Ljava/io/IOException;", "TransmitterReference", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: Transmitter.kt */
public final class Transmitter {
    private final Call call;
    private Object callStackTrace;
    private boolean canceled;
    private final OkHttpClient client;
    private RealConnection connection;
    private final RealConnectionPool connectionPool;
    private final EventListener eventListener = this.client.eventListenerFactory().create(this.call);
    private Exchange exchange;
    private ExchangeFinder exchangeFinder;
    private boolean exchangeRequestDone;
    private boolean exchangeResponseDone;
    private boolean noMoreExchanges;
    private Request request;
    private final Transmitter$timeout$1 timeout;
    private boolean timeoutEarlyExit;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo16641d2 = {"Lokhttp3/internal/connection/Transmitter$TransmitterReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/Transmitter;", "referent", "callStackTrace", "", "(Lokhttp3/internal/connection/Transmitter;Ljava/lang/Object;)V", "getCallStackTrace", "()Ljava/lang/Object;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Transmitter.kt */
    public static final class TransmitterReference extends WeakReference<Transmitter> {
        private final Object callStackTrace;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TransmitterReference(Transmitter transmitter, Object obj) {
            super(transmitter);
            C10202j.m34178b(transmitter, "referent");
            this.callStackTrace = obj;
        }

        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    public Transmitter(OkHttpClient okHttpClient, Call call2) {
        C10202j.m34178b(okHttpClient, "client");
        C10202j.m34178b(call2, "call");
        this.client = okHttpClient;
        this.call = call2;
        this.connectionPool = okHttpClient.connectionPool().getDelegate$okhttp();
        Transmitter$timeout$1 transmitter$timeout$1 = new Transmitter$timeout$1(this);
        transmitter$timeout$1.timeout((long) this.client.callTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = transmitter$timeout$1;
    }

    private final Address createAddress(HttpUrl httpUrl) {
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (httpUrl.isHttps()) {
            SSLSocketFactory sslSocketFactory = this.client.sslSocketFactory();
            hostnameVerifier = this.client.hostnameVerifier();
            sSLSocketFactory = sslSocketFactory;
            certificatePinner = this.client.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0019 A[Catch:{ all -> 0x0013 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <E extends java.io.IOException> E maybeReleaseConnection(E r8, boolean r9) {
        /*
            r7 = this;
            kotlin.jvm.internal.w r0 = new kotlin.jvm.internal.w
            r0.<init>()
            okhttp3.internal.connection.RealConnectionPool r1 = r7.connectionPool
            monitor-enter(r1)
            r2 = 0
            r3 = 1
            if (r9 == 0) goto L_0x0016
            okhttp3.internal.connection.Exchange r4 = r7.exchange     // Catch:{ all -> 0x0013 }
            if (r4 != 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            r4 = 0
            goto L_0x0017
        L_0x0013:
            r8 = move-exception
            goto L_0x008f
        L_0x0016:
            r4 = 1
        L_0x0017:
            if (r4 == 0) goto L_0x0083
            okhttp3.internal.connection.RealConnection r4 = r7.connection     // Catch:{ all -> 0x0013 }
            r0.f27854f = r4     // Catch:{ all -> 0x0013 }
            okhttp3.internal.connection.RealConnection r4 = r7.connection     // Catch:{ all -> 0x0013 }
            r5 = 0
            if (r4 == 0) goto L_0x0031
            okhttp3.internal.connection.Exchange r4 = r7.exchange     // Catch:{ all -> 0x0013 }
            if (r4 != 0) goto L_0x0031
            if (r9 != 0) goto L_0x002c
            boolean r9 = r7.noMoreExchanges     // Catch:{ all -> 0x0013 }
            if (r9 == 0) goto L_0x0031
        L_0x002c:
            java.net.Socket r9 = r7.releaseConnectionNoEvents()     // Catch:{ all -> 0x0013 }
            goto L_0x0032
        L_0x0031:
            r9 = r5
        L_0x0032:
            okhttp3.internal.connection.RealConnection r4 = r7.connection     // Catch:{ all -> 0x0013 }
            if (r4 == 0) goto L_0x0038
            r0.f27854f = r5     // Catch:{ all -> 0x0013 }
        L_0x0038:
            boolean r4 = r7.noMoreExchanges     // Catch:{ all -> 0x0013 }
            if (r4 == 0) goto L_0x0042
            okhttp3.internal.connection.Exchange r4 = r7.exchange     // Catch:{ all -> 0x0013 }
            if (r4 != 0) goto L_0x0042
            r4 = 1
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            kotlin.v r6 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            if (r9 == 0) goto L_0x004b
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r9)
        L_0x004b:
            T r9 = r0.f27854f
            r0 = r9
            okhttp3.Connection r0 = (okhttp3.Connection) r0
            if (r0 == 0) goto L_0x0062
            okhttp3.EventListener r0 = r7.eventListener
            okhttp3.Call r1 = r7.call
            okhttp3.Connection r9 = (okhttp3.Connection) r9
            if (r9 == 0) goto L_0x005e
            r0.connectionReleased(r1, r9)
            goto L_0x0062
        L_0x005e:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x0062:
            if (r4 == 0) goto L_0x0082
            if (r8 == 0) goto L_0x0067
            r2 = 1
        L_0x0067:
            java.io.IOException r8 = r7.timeoutExit(r8)
            if (r2 == 0) goto L_0x007b
            okhttp3.EventListener r9 = r7.eventListener
            okhttp3.Call r0 = r7.call
            if (r8 == 0) goto L_0x0077
            r9.callFailed(r0, r8)
            goto L_0x0082
        L_0x0077:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x007b:
            okhttp3.EventListener r9 = r7.eventListener
            okhttp3.Call r0 = r7.call
            r9.callEnd(r0)
        L_0x0082:
            return r8
        L_0x0083:
            java.lang.String r8 = "cannot release connection while it is in use"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0013 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0013 }
            r9.<init>(r8)     // Catch:{ all -> 0x0013 }
            throw r9     // Catch:{ all -> 0x0013 }
        L_0x008f:
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.Transmitter.maybeReleaseConnection(java.io.IOException, boolean):java.io.IOException");
    }

    private final <E extends IOException> E timeoutExit(E e) {
        if (this.timeoutEarlyExit || !this.timeout.exit()) {
            return e;
        }
        E interruptedIOException = new InterruptedIOException("timeout");
        if (e != null) {
            interruptedIOException.initCause(e);
        }
        return interruptedIOException;
    }

    public final void acquireConnectionNoEvents(RealConnection realConnection) {
        C10202j.m34178b(realConnection, "connection");
        boolean holdsLock = Thread.holdsLock(this.connectionPool);
        if (!C10485x.f28360a || holdsLock) {
            if (this.connection == null) {
                this.connection = realConnection;
                realConnection.getTransmitters().add(new TransmitterReference(this, this.callStackTrace));
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new AssertionError("Assertion failed");
    }

    public final void callStart() {
        this.callStackTrace = Platform.Companion.get().getStackTraceForCloseable("response.body().close()");
        this.eventListener.callStart(this.call);
    }

    public final boolean canRetry() {
        ExchangeFinder exchangeFinder2 = this.exchangeFinder;
        if (exchangeFinder2 != null) {
            if (exchangeFinder2.hasStreamFailure()) {
                ExchangeFinder exchangeFinder3 = this.exchangeFinder;
                if (exchangeFinder3 == null) {
                    C10202j.m34172a();
                    throw null;
                } else if (exchangeFinder3.hasRouteToTry()) {
                    return true;
                }
            }
            return false;
        }
        C10202j.m34172a();
        throw null;
    }

    public final void cancel() {
        Exchange exchange2;
        RealConnection realConnection;
        synchronized (this.connectionPool) {
            this.canceled = true;
            exchange2 = this.exchange;
            ExchangeFinder exchangeFinder2 = this.exchangeFinder;
            if (exchangeFinder2 == null || (realConnection = exchangeFinder2.connectingConnection()) == null) {
                realConnection = this.connection;
            }
            C10483v vVar = C10483v.f28357a;
        }
        if (exchange2 != null) {
            exchange2.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public final void exchangeDoneDueToException() {
        synchronized (this.connectionPool) {
            if (!this.noMoreExchanges) {
                this.exchange = null;
                C10483v vVar = C10483v.f28357a;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0053, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return maybeReleaseConnection(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E exchangeMessageDone$okhttp(okhttp3.internal.connection.Exchange r4, boolean r5, boolean r6, E r7) {
        /*
            r3 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)
            okhttp3.internal.connection.RealConnectionPool r0 = r3.connectionPool
            monitor-enter(r0)
            okhttp3.internal.connection.Exchange r1 = r3.exchange     // Catch:{ all -> 0x005a }
            boolean r4 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r4, (java.lang.Object) r1)     // Catch:{ all -> 0x005a }
            r1 = 1
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x0014
            monitor-exit(r0)
            return r7
        L_0x0014:
            r4 = 0
            if (r5 == 0) goto L_0x001d
            boolean r5 = r3.exchangeRequestDone     // Catch:{ all -> 0x005a }
            r5 = r5 ^ r1
            r3.exchangeRequestDone = r1     // Catch:{ all -> 0x005a }
            goto L_0x001e
        L_0x001d:
            r5 = 0
        L_0x001e:
            if (r6 == 0) goto L_0x0027
            boolean r6 = r3.exchangeResponseDone     // Catch:{ all -> 0x005a }
            if (r6 != 0) goto L_0x0025
            r5 = 1
        L_0x0025:
            r3.exchangeResponseDone = r1     // Catch:{ all -> 0x005a }
        L_0x0027:
            boolean r6 = r3.exchangeRequestDone     // Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x004f
            boolean r6 = r3.exchangeResponseDone     // Catch:{ all -> 0x005a }
            if (r6 == 0) goto L_0x004f
            if (r5 == 0) goto L_0x004f
            okhttp3.internal.connection.Exchange r5 = r3.exchange     // Catch:{ all -> 0x005a }
            r6 = 0
            if (r5 == 0) goto L_0x004b
            okhttp3.internal.connection.RealConnection r5 = r5.connection()     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x0047
            int r2 = r5.getSuccessCount$okhttp()     // Catch:{ all -> 0x005a }
            int r2 = r2 + r1
            r5.setSuccessCount$okhttp(r2)     // Catch:{ all -> 0x005a }
            r3.exchange = r6     // Catch:{ all -> 0x005a }
            goto L_0x0050
        L_0x0047:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x005a }
            throw r6
        L_0x004b:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x005a }
            throw r6
        L_0x004f:
            r1 = 0
        L_0x0050:
            kotlin.v r5 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x005a }
            monitor-exit(r0)
            if (r1 == 0) goto L_0x0059
            java.io.IOException r7 = r3.maybeReleaseConnection(r7, r4)
        L_0x0059:
            return r7
        L_0x005a:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.Transmitter.exchangeMessageDone$okhttp(okhttp3.internal.connection.Exchange, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final RealConnection getConnection() {
        return this.connection;
    }

    public final boolean hasExchange() {
        boolean z;
        synchronized (this.connectionPool) {
            z = this.exchange != null;
        }
        return z;
    }

    public final boolean isCanceled() {
        boolean z;
        synchronized (this.connectionPool) {
            z = this.canceled;
        }
        return z;
    }

    public final Exchange newExchange$okhttp(Interceptor.Chain chain, boolean z) {
        C10202j.m34178b(chain, "chain");
        synchronized (this.connectionPool) {
            boolean z2 = true;
            if (!this.noMoreExchanges) {
                if (this.exchange != null) {
                    z2 = false;
                }
                if (z2) {
                    C10483v vVar = C10483v.f28357a;
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        ExchangeFinder exchangeFinder2 = this.exchangeFinder;
        if (exchangeFinder2 != null) {
            ExchangeCodec find = exchangeFinder2.find(this.client, chain, z);
            Call call2 = this.call;
            EventListener eventListener2 = this.eventListener;
            ExchangeFinder exchangeFinder3 = this.exchangeFinder;
            if (exchangeFinder3 != null) {
                Exchange exchange2 = new Exchange(this, call2, eventListener2, exchangeFinder3, find);
                synchronized (this.connectionPool) {
                    this.exchange = exchange2;
                    this.exchangeRequestDone = false;
                    this.exchangeResponseDone = false;
                }
                return exchange2;
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }

    public final IOException noMoreExchanges(IOException iOException) {
        synchronized (this.connectionPool) {
            this.noMoreExchanges = true;
            C10483v vVar = C10483v.f28357a;
        }
        return maybeReleaseConnection(iOException, false);
    }

    public final void prepareToConnect(Request request2) {
        C10202j.m34178b(request2, "request");
        Request request3 = this.request;
        if (request3 != null) {
            if (request3 != null) {
                if (Util.canReuseConnectionFor(request3.url(), request2.url())) {
                    ExchangeFinder exchangeFinder2 = this.exchangeFinder;
                    if (exchangeFinder2 == null) {
                        C10202j.m34172a();
                        throw null;
                    } else if (exchangeFinder2.hasRouteToTry()) {
                        return;
                    }
                }
                if (!(this.exchange == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (this.exchangeFinder != null) {
                    maybeReleaseConnection((IOException) null, true);
                    this.exchangeFinder = null;
                }
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
        this.request = request2;
        this.exchangeFinder = new ExchangeFinder(this, this.connectionPool, createAddress(request2.url()), this.call, this.eventListener);
    }

    public final Socket releaseConnectionNoEvents() {
        boolean holdsLock = Thread.holdsLock(this.connectionPool);
        if (!C10485x.f28360a || holdsLock) {
            RealConnection realConnection = this.connection;
            if (realConnection != null) {
                Iterator<Reference<Transmitter>> it = realConnection.getTransmitters().iterator();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (C10202j.m34176a((Object) (Transmitter) it.next().get(), (Object) this)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i != -1) {
                    z = true;
                }
                if (z) {
                    RealConnection realConnection2 = this.connection;
                    if (realConnection2 != null) {
                        realConnection2.getTransmitters().remove(i);
                        this.connection = null;
                        if (realConnection2.getTransmitters().isEmpty()) {
                            realConnection2.setIdleAtNanos$okhttp(System.nanoTime());
                            if (this.connectionPool.connectionBecameIdle(realConnection2)) {
                                return realConnection2.socket();
                            }
                        }
                        return null;
                    }
                    C10202j.m34172a();
                    throw null;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            C10202j.m34172a();
            throw null;
        }
        throw new AssertionError("Assertion failed");
    }

    public final void setConnection(RealConnection realConnection) {
        this.connection = realConnection;
    }

    public final C12894b0 timeout() {
        return this.timeout;
    }

    public final void timeoutEarlyExit() {
        if (!this.timeoutEarlyExit) {
            this.timeoutEarlyExit = true;
            this.timeout.exit();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void timeoutEnter() {
        this.timeout.enter();
    }
}
