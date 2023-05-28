package okhttp3;

import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C10483v;
import kotlin.C10485x;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.internal.connection.Transmitter;
import p413s.C12894b0;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 '2\u00020\u0001:\u0002&'B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0000H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u001cJ\b\u0010\u001e\u001a\u00020\u0007H\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0006\u0010%\u001a\u00020!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006("}, mo16641d2 = {"Lokhttp3/RealCall;", "Lokhttp3/Call;", "client", "Lokhttp3/OkHttpClient;", "originalRequest", "Lokhttp3/Request;", "forWebSocket", "", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "getClient", "()Lokhttp3/OkHttpClient;", "executed", "getExecuted", "()Z", "setExecuted", "(Z)V", "getForWebSocket", "getOriginalRequest", "()Lokhttp3/Request;", "transmitter", "Lokhttp3/internal/connection/Transmitter;", "cancel", "", "clone", "enqueue", "responseCallback", "Lokhttp3/Callback;", "execute", "Lokhttp3/Response;", "getResponseWithInterceptorChain", "isCanceled", "isExecuted", "redactedUrl", "", "request", "timeout", "Lokio/Timeout;", "toLoggableString", "AsyncCall", "Companion", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: RealCall.kt */
public final class RealCall implements Call {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final OkHttpClient client;
    private boolean executed;
    private final boolean forWebSocket;
    private final Request originalRequest;
    /* access modifiers changed from: private */
    public Transmitter transmitter;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\b2\n\u0010\u0012\u001a\u00060\u0000R\u00020\fJ\b\u0010\u0013\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo16641d2 = {"Lokhttp3/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "responseCallback", "Lokhttp3/Callback;", "(Lokhttp3/RealCall;Lokhttp3/Callback;)V", "callsPerHost", "Ljava/util/concurrent/atomic/AtomicInteger;", "executeOn", "", "executorService", "Ljava/util/concurrent/ExecutorService;", "get", "Lokhttp3/RealCall;", "host", "", "request", "Lokhttp3/Request;", "reuseCallsPerHostFrom", "other", "run", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: RealCall.kt */
    public final class AsyncCall implements Runnable {
        private volatile AtomicInteger callsPerHost = new AtomicInteger(0);
        private final Callback responseCallback;
        final /* synthetic */ RealCall this$0;

        public AsyncCall(RealCall realCall, Callback callback) {
            C10202j.m34178b(callback, "responseCallback");
            this.this$0 = realCall;
            this.responseCallback = callback;
        }

        public final AtomicInteger callsPerHost() {
            return this.callsPerHost;
        }

        public final void executeOn(ExecutorService executorService) {
            C10202j.m34178b(executorService, "executorService");
            boolean z = !Thread.holdsLock(this.this$0.getClient().dispatcher());
            if (!C10485x.f28360a || z) {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    RealCall.access$getTransmitter$p(this.this$0).noMoreExchanges(interruptedIOException);
                    this.responseCallback.onFailure(this.this$0, interruptedIOException);
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                } catch (Throwable th) {
                    this.this$0.getClient().dispatcher().finished$okhttp(this);
                    throw th;
                }
            } else {
                throw new AssertionError("Assertion failed");
            }
        }

        public final RealCall get() {
            return this.this$0;
        }

        public final String host() {
            return this.this$0.getOriginalRequest().url().host();
        }

        public final Request request() {
            return this.this$0.getOriginalRequest();
        }

        public final void reuseCallsPerHostFrom(AsyncCall asyncCall) {
            C10202j.m34178b(asyncCall, "other");
            this.callsPerHost = asyncCall.callsPerHost;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A[SYNTHETIC, Splitter:B:16:0x0056] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0078 A[Catch:{ all -> 0x004f, all -> 0x009c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OkHttp "
                r0.append(r1)
                okhttp3.RealCall r1 = r7.this$0
                java.lang.String r1 = r1.redactedUrl()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                r0 = 0
                okhttp3.RealCall r3 = r7.this$0     // Catch:{ all -> 0x009c }
                okhttp3.internal.connection.Transmitter r3 = okhttp3.RealCall.access$getTransmitter$p(r3)     // Catch:{ all -> 0x009c }
                r3.timeoutEnter()     // Catch:{ all -> 0x009c }
                okhttp3.RealCall r3 = r7.this$0     // Catch:{ IOException -> 0x0051 }
                okhttp3.Response r0 = r3.getResponseWithInterceptorChain()     // Catch:{ IOException -> 0x0051 }
                r3 = 1
                okhttp3.Callback r4 = r7.responseCallback     // Catch:{ IOException -> 0x004d }
                okhttp3.RealCall r5 = r7.this$0     // Catch:{ IOException -> 0x004d }
                r4.onResponse(r5, r0)     // Catch:{ IOException -> 0x004d }
                okhttp3.RealCall r0 = r7.this$0     // Catch:{ all -> 0x009c }
                okhttp3.OkHttpClient r0 = r0.getClient()     // Catch:{ all -> 0x009c }
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch:{ all -> 0x009c }
            L_0x0049:
                r0.finished$okhttp((okhttp3.RealCall.AsyncCall) r7)     // Catch:{ all -> 0x009c }
                goto L_0x008a
            L_0x004d:
                r0 = move-exception
                goto L_0x0054
            L_0x004f:
                r0 = move-exception
                goto L_0x008e
            L_0x0051:
                r3 = move-exception
                r0 = r3
                r3 = 0
            L_0x0054:
                if (r3 == 0) goto L_0x0078
                okhttp3.internal.platform.Platform$Companion r3 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x004f }
                okhttp3.internal.platform.Platform r3 = r3.get()     // Catch:{ all -> 0x004f }
                r4 = 4
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004f }
                r5.<init>()     // Catch:{ all -> 0x004f }
                java.lang.String r6 = "Callback failure for "
                r5.append(r6)     // Catch:{ all -> 0x004f }
                okhttp3.RealCall r6 = r7.this$0     // Catch:{ all -> 0x004f }
                java.lang.String r6 = r6.toLoggableString()     // Catch:{ all -> 0x004f }
                r5.append(r6)     // Catch:{ all -> 0x004f }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004f }
                r3.log(r4, r5, r0)     // Catch:{ all -> 0x004f }
                goto L_0x007f
            L_0x0078:
                okhttp3.Callback r3 = r7.responseCallback     // Catch:{ all -> 0x004f }
                okhttp3.RealCall r4 = r7.this$0     // Catch:{ all -> 0x004f }
                r3.onFailure(r4, r0)     // Catch:{ all -> 0x004f }
            L_0x007f:
                okhttp3.RealCall r0 = r7.this$0     // Catch:{ all -> 0x009c }
                okhttp3.OkHttpClient r0 = r0.getClient()     // Catch:{ all -> 0x009c }
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch:{ all -> 0x009c }
                goto L_0x0049
            L_0x008a:
                r1.setName(r2)
                return
            L_0x008e:
                okhttp3.RealCall r3 = r7.this$0     // Catch:{ all -> 0x009c }
                okhttp3.OkHttpClient r3 = r3.getClient()     // Catch:{ all -> 0x009c }
                okhttp3.Dispatcher r3 = r3.dispatcher()     // Catch:{ all -> 0x009c }
                r3.finished$okhttp((okhttp3.RealCall.AsyncCall) r7)     // Catch:{ all -> 0x009c }
                throw r0     // Catch:{ all -> 0x009c }
            L_0x009c:
                r0 = move-exception
                r1.setName(r2)
                goto L_0x00a2
            L_0x00a1:
                throw r0
            L_0x00a2:
                goto L_0x00a1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RealCall.AsyncCall.run():void");
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, mo16641d2 = {"Lokhttp3/RealCall$Companion;", "", "()V", "newRealCall", "Lokhttp3/RealCall;", "client", "Lokhttp3/OkHttpClient;", "originalRequest", "Lokhttp3/Request;", "forWebSocket", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: RealCall.kt */
    public static final class Companion {
        private Companion() {
        }

        public final RealCall newRealCall(OkHttpClient okHttpClient, Request request, boolean z) {
            C10202j.m34178b(okHttpClient, "client");
            C10202j.m34178b(request, "originalRequest");
            RealCall realCall = new RealCall(okHttpClient, request, z, (DefaultConstructorMarker) null);
            realCall.transmitter = new Transmitter(okHttpClient, realCall);
            return realCall;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private RealCall(OkHttpClient okHttpClient, Request request, boolean z) {
        this.client = okHttpClient;
        this.originalRequest = request;
        this.forWebSocket = z;
    }

    public static final /* synthetic */ Transmitter access$getTransmitter$p(RealCall realCall) {
        Transmitter transmitter2 = realCall.transmitter;
        if (transmitter2 != null) {
            return transmitter2;
        }
        C10202j.m34181d("transmitter");
        throw null;
    }

    public void cancel() {
        Transmitter transmitter2 = this.transmitter;
        if (transmitter2 != null) {
            transmitter2.cancel();
        } else {
            C10202j.m34181d("transmitter");
            throw null;
        }
    }

    public void enqueue(Callback callback) {
        C10202j.m34178b(callback, "responseCallback");
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                C10483v vVar = C10483v.f28357a;
            } else {
                throw new IllegalStateException("Already Executed".toString());
            }
        }
        Transmitter transmitter2 = this.transmitter;
        if (transmitter2 != null) {
            transmitter2.callStart();
            this.client.dispatcher().enqueue$okhttp(new AsyncCall(this, callback));
            return;
        }
        C10202j.m34181d("transmitter");
        throw null;
    }

    public Response execute() {
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                C10483v vVar = C10483v.f28357a;
            } else {
                throw new IllegalStateException("Already Executed".toString());
            }
        }
        Transmitter transmitter2 = this.transmitter;
        if (transmitter2 != null) {
            transmitter2.timeoutEnter();
            Transmitter transmitter3 = this.transmitter;
            if (transmitter3 != null) {
                transmitter3.callStart();
                try {
                    this.client.dispatcher().executed$okhttp(this);
                    return getResponseWithInterceptorChain();
                } finally {
                    this.client.dispatcher().finished$okhttp(this);
                }
            } else {
                C10202j.m34181d("transmitter");
                throw null;
            }
        } else {
            C10202j.m34181d("transmitter");
            throw null;
        }
    }

    public final OkHttpClient getClient() {
        return this.client;
    }

    public final boolean getExecuted() {
        return this.executed;
    }

    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    public final Request getOriginalRequest() {
        return this.originalRequest;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response getResponseWithInterceptorChain() throws java.io.IOException {
        /*
            r13 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            okhttp3.OkHttpClient r0 = r13.client
            java.util.List r0 = r0.interceptors()
            boolean unused = kotlin.p262y.C10536t.m35760a(r1, r0)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r0 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r2 = r13.client
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.http.BridgeInterceptor r0 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r2 = r13.client
            okhttp3.CookieJar r2 = r2.cookieJar()
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.cache.CacheInterceptor r0 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r2 = r13.client
            okhttp3.Cache r2 = r2.cache()
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.connection.ConnectInterceptor r0 = okhttp3.internal.connection.ConnectInterceptor.INSTANCE
            r1.add(r0)
            boolean r0 = r13.forWebSocket
            if (r0 != 0) goto L_0x0046
            okhttp3.OkHttpClient r0 = r13.client
            java.util.List r0 = r0.networkInterceptors()
            boolean unused = kotlin.p262y.C10536t.m35760a(r1, r0)
        L_0x0046:
            okhttp3.internal.http.CallServerInterceptor r0 = new okhttp3.internal.http.CallServerInterceptor
            boolean r2 = r13.forWebSocket
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.http.RealInterceptorChain r10 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.internal.connection.Transmitter r2 = r13.transmitter
            java.lang.String r11 = "transmitter"
            r12 = 0
            if (r2 == 0) goto L_0x00cc
            r3 = 0
            r4 = 0
            okhttp3.Request r5 = r13.originalRequest
            okhttp3.OkHttpClient r0 = r13.client
            int r7 = r0.connectTimeoutMillis()
            okhttp3.OkHttpClient r0 = r13.client
            int r8 = r0.readTimeoutMillis()
            okhttp3.OkHttpClient r0 = r13.client
            int r9 = r0.writeTimeoutMillis()
            r0 = r10
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            okhttp3.Request r1 = r13.originalRequest     // Catch:{ IOException -> 0x00a2, all -> 0x00a0 }
            okhttp3.Response r1 = r10.proceed(r1)     // Catch:{ IOException -> 0x00a2, all -> 0x00a0 }
            okhttp3.internal.connection.Transmitter r2 = r13.transmitter     // Catch:{ IOException -> 0x00a2, all -> 0x00a0 }
            if (r2 == 0) goto L_0x009c
            boolean r2 = r2.isCanceled()     // Catch:{ IOException -> 0x00a2, all -> 0x00a0 }
            if (r2 != 0) goto L_0x0091
            okhttp3.internal.connection.Transmitter r0 = r13.transmitter
            if (r0 == 0) goto L_0x008d
            r0.noMoreExchanges(r12)
            return r1
        L_0x008d:
            kotlin.jvm.internal.C10202j.m34181d(r11)
            throw r12
        L_0x0091:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)     // Catch:{ IOException -> 0x00a2, all -> 0x00a0 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x00a2, all -> 0x00a0 }
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch:{ IOException -> 0x00a2, all -> 0x00a0 }
            throw r1     // Catch:{ IOException -> 0x00a2, all -> 0x00a0 }
        L_0x009c:
            kotlin.jvm.internal.C10202j.m34181d(r11)     // Catch:{ IOException -> 0x00a2, all -> 0x00a0 }
            throw r12
        L_0x00a0:
            r1 = move-exception
            goto L_0x00be
        L_0x00a2:
            r0 = move-exception
            r1 = 1
            okhttp3.internal.connection.Transmitter r2 = r13.transmitter     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x00b7
            java.io.IOException r0 = r2.noMoreExchanges(r0)     // Catch:{ all -> 0x00bb }
            if (r0 != 0) goto L_0x00b6
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch:{ all -> 0x00bb }
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00b6:
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00b7:
            kotlin.jvm.internal.C10202j.m34181d(r11)     // Catch:{ all -> 0x00bb }
            throw r12
        L_0x00bb:
            r0 = move-exception
            r1 = r0
            r0 = 1
        L_0x00be:
            if (r0 != 0) goto L_0x00cb
            okhttp3.internal.connection.Transmitter r0 = r13.transmitter
            if (r0 != 0) goto L_0x00c8
            kotlin.jvm.internal.C10202j.m34181d(r11)
            throw r12
        L_0x00c8:
            r0.noMoreExchanges(r12)
        L_0x00cb:
            throw r1
        L_0x00cc:
            kotlin.jvm.internal.C10202j.m34181d(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.RealCall.getResponseWithInterceptorChain():okhttp3.Response");
    }

    public boolean isCanceled() {
        Transmitter transmitter2 = this.transmitter;
        if (transmitter2 != null) {
            return transmitter2.isCanceled();
        }
        C10202j.m34181d("transmitter");
        throw null;
    }

    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public final String redactedUrl() {
        return this.originalRequest.url().redact();
    }

    public Request request() {
        return this.originalRequest;
    }

    public final void setExecuted(boolean z) {
        this.executed = z;
    }

    public C12894b0 timeout() {
        Transmitter transmitter2 = this.transmitter;
        if (transmitter2 != null) {
            return transmitter2.timeout();
        }
        C10202j.m34181d("transmitter");
        throw null;
    }

    public final String toLoggableString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.forWebSocket ? "web socket" : "call");
        sb.append(" to ");
        sb.append(redactedUrl());
        return sb.toString();
    }

    public /* synthetic */ RealCall(OkHttpClient okHttpClient, Request request, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(okHttpClient, request, z);
    }

    public RealCall clone() {
        return Companion.newRealCall(this.client, this.originalRequest, this.forWebSocket);
    }
}
