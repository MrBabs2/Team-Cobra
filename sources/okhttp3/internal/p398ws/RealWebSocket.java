package okhttp3.internal.p398ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.C10483v;
import kotlin.C10485x;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.RealCall;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.p398ws.WebSocketReader;
import p015cm.aptoide.p016pt.root.execution.Command;
import p413s.C12909g;
import p413s.C12910h;
import p413s.C12911i;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0006[\\]^_`B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020#2\u0006\u00101\u001a\u000202J\b\u00103\u001a\u00020/H\u0016J\u001f\u00104\u001a\u00020/2\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0002\b9J\u001a\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020#2\b\u0010<\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020#2\b\u0010<\u001a\u0004\u0018\u00010\u00172\u0006\u0010=\u001a\u00020\nJ\u000e\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020@J\u001c\u0010A\u001a\u00020/2\n\u0010B\u001a\u00060Cj\u0002`D2\b\u00105\u001a\u0004\u0018\u000106J\u0016\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)J\u0006\u0010G\u001a\u00020/J\u0018\u0010H\u001a\u00020/2\u0006\u0010;\u001a\u00020#2\u0006\u0010<\u001a\u00020\u0017H\u0016J\u0010\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020\u0017H\u0016J\u0010\u0010I\u001a\u00020/2\u0006\u0010K\u001a\u00020\u001eH\u0016J\u0010\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020\u001eH\u0016J\u0010\u0010N\u001a\u00020/2\u0006\u0010M\u001a\u00020\u001eH\u0016J\u000e\u0010O\u001a\u00020\r2\u0006\u0010M\u001a\u00020\u001eJ\u0006\u0010P\u001a\u00020\rJ\b\u0010\u001f\u001a\u00020\nH\u0016J\u0006\u0010%\u001a\u00020#J\u0006\u0010&\u001a\u00020#J\b\u0010Q\u001a\u00020\u0004H\u0016J\b\u0010R\u001a\u00020/H\u0002J\u0010\u0010S\u001a\u00020\r2\u0006\u0010J\u001a\u00020\u0017H\u0016J\u0010\u0010S\u001a\u00020\r2\u0006\u0010K\u001a\u00020\u001eH\u0016J\u0018\u0010S\u001a\u00020\r2\u0006\u0010T\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020#H\u0002J\u0006\u0010'\u001a\u00020#J\u0006\u0010V\u001a\u00020/J\r\u0010W\u001a\u00020\rH\u0000¢\u0006\u0002\bXJ\r\u0010Y\u001a\u00020/H\u0000¢\u0006\u0002\bZR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000¨\u0006a"}, mo16641d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "originalRequest", "Lokhttp3/Request;", "listener", "Lokhttp3/WebSocketListener;", "random", "Ljava/util/Random;", "pingIntervalMillis", "", "(Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;J)V", "awaitingPong", "", "call", "Lokhttp3/Call;", "cancelFuture", "Ljava/util/concurrent/ScheduledFuture;", "enqueuedClose", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "failed", "key", "", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "messageAndCloseQueue", "Ljava/util/ArrayDeque;", "", "pongQueue", "Lokio/ByteString;", "queueSize", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "receivedCloseCode", "", "receivedCloseReason", "receivedPingCount", "receivedPongCount", "sentPingCount", "streams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "writerRunnable", "Ljava/lang/Runnable;", "awaitTermination", "", "timeout", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "cancel", "checkUpgradeSuccess", "response", "Lokhttp3/Response;", "exchange", "Lokhttp3/internal/connection/Exchange;", "checkUpgradeSuccess$okhttp", "close", "code", "reason", "cancelAfterCloseMillis", "connect", "client", "Lokhttp3/OkHttpClient;", "failWebSocket", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initReaderAndWriter", "name", "loopReader", "onReadClose", "onReadMessage", "text", "bytes", "onReadPing", "payload", "onReadPong", "pong", "processNextFrame", "request", "runWriter", "send", "data", "formatOpcode", "tearDown", "writeOneFrame", "writeOneFrame$okhttp", "writePingFrame", "writePingFrame$okhttp", "CancelRunnable", "Close", "Companion", "Message", "PingRunnable", "Streams", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: okhttp3.internal.ws.RealWebSocket */
/* compiled from: RealWebSocket.kt */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1 = C10527n.m35729a(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<C12911i> pongQueue = new ArrayDeque<>();
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode = -1;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo16641d2 = {"Lokhttp3/internal/ws/RealWebSocket$CancelRunnable;", "Ljava/lang/Runnable;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "run", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$CancelRunnable */
    /* compiled from: RealWebSocket.kt */
    public final class CancelRunnable implements Runnable {
        public CancelRunnable() {
        }

        public void run() {
            RealWebSocket.this.cancel();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo16641d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "code", "", "reason", "Lokio/ByteString;", "cancelAfterCloseMillis", "", "(ILokio/ByteString;J)V", "getCancelAfterCloseMillis", "()J", "getCode", "()I", "getReason", "()Lokio/ByteString;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Close */
    /* compiled from: RealWebSocket.kt */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final C12911i reason;

        public Close(int i, C12911i iVar, long j) {
            this.code = i;
            this.reason = iVar;
            this.cancelAfterCloseMillis = j;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final C12911i getReason() {
            return this.reason;
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo16641d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "()V", "CANCEL_AFTER_CLOSE_MILLIS", "", "MAX_QUEUE_SIZE", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Companion */
    /* compiled from: RealWebSocket.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo16641d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "formatOpcode", "", "data", "Lokio/ByteString;", "(ILokio/ByteString;)V", "getData", "()Lokio/ByteString;", "getFormatOpcode", "()I", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Message */
    /* compiled from: RealWebSocket.kt */
    public static final class Message {
        private final C12911i data;
        private final int formatOpcode;

        public Message(int i, C12911i iVar) {
            C10202j.m34178b(iVar, "data");
            this.formatOpcode = i;
            this.data = iVar;
        }

        public final C12911i getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo16641d2 = {"Lokhttp3/internal/ws/RealWebSocket$PingRunnable;", "Ljava/lang/Runnable;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "run", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$PingRunnable */
    /* compiled from: RealWebSocket.kt */
    private final class PingRunnable implements Runnable {
        public PingRunnable() {
        }

        public void run() {
            RealWebSocket.this.writePingFrame$okhttp();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo16641d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "client", "", "source", "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "getClient", "()Z", "getSink", "()Lokio/BufferedSink;", "getSource", "()Lokio/BufferedSource;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Streams */
    /* compiled from: RealWebSocket.kt */
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final C12909g sink;
        private final C12910h source;

        public Streams(boolean z, C12910h hVar, C12909g gVar) {
            C10202j.m34178b(hVar, "source");
            C10202j.m34178b(gVar, "sink");
            this.client = z;
            this.source = hVar;
            this.sink = gVar;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final C12909g getSink() {
            return this.sink;
        }

        public final C12910h getSource() {
            return this.source;
        }
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random2, long j) {
        C10202j.m34178b(request, "originalRequest");
        C10202j.m34178b(webSocketListener, "listener");
        C10202j.m34178b(random2, "random");
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random2;
        this.pingIntervalMillis = j;
        if (C10202j.m34176a((Object) "GET", (Object) this.originalRequest.method())) {
            C12911i.C12912a aVar = C12911i.f33159j;
            byte[] bArr = new byte[16];
            this.random.nextBytes(bArr);
            this.key = C12911i.C12912a.m41657a(aVar, bArr, 0, 0, 3, (Object) null).mo41218a();
            this.writerRunnable = new Runnable(this) {
                final /* synthetic */ RealWebSocket this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    do {
                        try {
                        } catch (IOException e) {
                            this.this$0.failWebSocket(e, (Response) null);
                            return;
                        }
                    } while (this.this$0.writeOneFrame$okhttp());
                }
            };
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + this.originalRequest.method()).toString());
    }

    private final void runWriter() {
        boolean holdsLock = Thread.holdsLock(this);
        if (!C10485x.f28360a || holdsLock) {
            ScheduledExecutorService scheduledExecutorService = this.executor;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.execute(this.writerRunnable);
                return;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public final void awaitTermination(int i, TimeUnit timeUnit) throws InterruptedException {
        C10202j.m34178b(timeUnit, "timeUnit");
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.awaitTermination((long) i, timeUnit);
        } else {
            C10202j.m34172a();
            throw null;
        }
    }

    public void cancel() {
        Call call2 = this.call;
        if (call2 != null) {
            call2.cancel();
        } else {
            C10202j.m34172a();
            throw null;
        }
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
        C10202j.m34178b(response, "response");
        if (response.code() == 101) {
            String header$default = Response.header$default(response, "Connection", (String) null, 2, (Object) null);
            if (C12130v.m40053b("Upgrade", header$default, true)) {
                String header$default2 = Response.header$default(response, "Upgrade", (String) null, 2, (Object) null);
                if (C12130v.m40053b("websocket", header$default2, true)) {
                    String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", (String) null, 2, (Object) null);
                    C12911i.C12912a aVar = C12911i.f33159j;
                    String a = aVar.mo41249c(this.key + WebSocketProtocol.ACCEPT_MAGIC).mo41237q().mo41218a();
                    if (!C10202j.m34176a((Object) a, (Object) header$default3)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a + "' but was '" + header$default3 + '\'');
                    } else if (exchange == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header$default2 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header$default + '\'');
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
    }

    public boolean close(int i, String str) {
        return close(i, str, CANCEL_AFTER_CLOSE_MILLIS);
    }

    public final void connect(OkHttpClient okHttpClient) {
        C10202j.m34178b(okHttpClient, "client");
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        RealCall newRealCall = RealCall.Companion.newRealCall(build, build2, true);
        this.call = newRealCall;
        if (newRealCall != null) {
            newRealCall.enqueue(new RealWebSocket$connect$1(this, build2));
        } else {
            C10202j.m34172a();
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.listener.onFailure(r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        if (r0 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void failWebSocket(java.lang.Exception r4, okhttp3.Response r5) {
        /*
            r3 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)
            monitor-enter(r3)
            boolean r0 = r3.failed     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)
            return
        L_0x000c:
            r0 = 1
            r3.failed = r0     // Catch:{ all -> 0x0038 }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r3.streams     // Catch:{ all -> 0x0038 }
            r1 = 0
            r3.streams = r1     // Catch:{ all -> 0x0038 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.cancelFuture     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x001c
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0038 }
        L_0x001c:
            java.util.concurrent.ScheduledExecutorService r1 = r3.executor     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0025
            r1.shutdown()     // Catch:{ all -> 0x0038 }
            kotlin.v r1 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x0038 }
        L_0x0025:
            monitor-exit(r3)
            okhttp3.WebSocketListener r1 = r3.listener     // Catch:{ all -> 0x0031 }
            r1.onFailure(r3, r4, r5)     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0030
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
        L_0x0030:
            return
        L_0x0031:
            r4 = move-exception
            if (r0 == 0) goto L_0x0037
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
        L_0x0037:
            throw r4
        L_0x0038:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p398ws.RealWebSocket.failWebSocket(java.lang.Exception, okhttp3.Response):void");
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public final void initReaderAndWriter(String str, Streams streams2) throws IOException {
        C10202j.m34178b(str, "name");
        C10202j.m34178b(streams2, "streams");
        synchronized (this) {
            this.streams = streams2;
            this.writer = new WebSocketWriter(streams2.getClient(), streams2.getSink(), this.random);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            this.executor = scheduledThreadPoolExecutor;
            if (this.pingIntervalMillis != 0) {
                if (scheduledThreadPoolExecutor != null) {
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(new PingRunnable(), this.pingIntervalMillis, this.pingIntervalMillis, TimeUnit.MILLISECONDS);
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            C10483v vVar = C10483v.f28357a;
        }
        this.reader = new WebSocketReader(streams2.getClient(), streams2.getSource(), this);
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            if (webSocketReader != null) {
                webSocketReader.processNextFrame();
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, okhttp3.internal.ws.RealWebSocket$Streams] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReadClose(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.C10202j.m34178b(r6, r0)
            r0 = 1
            r1 = -1
            r2 = 0
            if (r5 == r1) goto L_0x000c
            r3 = 1
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r3 == 0) goto L_0x0075
            monitor-enter(r4)
            int r3 = r4.receivedCloseCode     // Catch:{ all -> 0x0072 }
            if (r3 != r1) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0066
            r4.receivedCloseCode = r5     // Catch:{ all -> 0x0072 }
            r4.receivedCloseReason = r6     // Catch:{ all -> 0x0072 }
            boolean r0 = r4.enqueuedClose     // Catch:{ all -> 0x0072 }
            r1 = 0
            if (r0 == 0) goto L_0x004a
            java.util.ArrayDeque<java.lang.Object> r0 = r4.messageAndCloseQueue     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x004a
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r4.streams     // Catch:{ all -> 0x0072 }
            r4.streams = r1     // Catch:{ all -> 0x0072 }
            java.util.concurrent.ScheduledFuture<?> r3 = r4.cancelFuture     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x003d
            java.util.concurrent.ScheduledFuture<?> r3 = r4.cancelFuture     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0039
            r3.cancel(r2)     // Catch:{ all -> 0x0072 }
            goto L_0x003d
        L_0x0039:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x0072 }
            throw r1
        L_0x003d:
            java.util.concurrent.ScheduledExecutorService r2 = r4.executor     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x0046
            r2.shutdown()     // Catch:{ all -> 0x0072 }
            r1 = r0
            goto L_0x004a
        L_0x0046:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x0072 }
            throw r1
        L_0x004a:
            kotlin.v r0 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x0072 }
            monitor-exit(r4)
            okhttp3.WebSocketListener r0 = r4.listener     // Catch:{ all -> 0x005f }
            r0.onClosing(r4, r5, r6)     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0059
            okhttp3.WebSocketListener r0 = r4.listener     // Catch:{ all -> 0x005f }
            r0.onClosed(r4, r5, r6)     // Catch:{ all -> 0x005f }
        L_0x0059:
            if (r1 == 0) goto L_0x005e
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x005e:
            return
        L_0x005f:
            r5 = move-exception
            if (r1 == 0) goto L_0x0065
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r1)
        L_0x0065:
            throw r5
        L_0x0066:
            java.lang.String r5 = "already closed"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0072 }
            r6.<init>(r5)     // Catch:{ all -> 0x0072 }
            throw r6     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0075:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p398ws.RealWebSocket.onReadClose(int, java.lang.String):void");
    }

    public void onReadMessage(String str) throws IOException {
        C10202j.m34178b(str, Command.CommandHandler.TEXT);
        this.listener.onMessage((WebSocket) this, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onReadPing(p413s.C12911i r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.C10202j.m34178b(r2, r0)     // Catch:{ all -> 0x0029 }
            boolean r0 = r1.failed     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r1.enqueuedClose     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            goto L_0x0027
        L_0x0017:
            java.util.ArrayDeque<s.i> r0 = r1.pongQueue     // Catch:{ all -> 0x0029 }
            r0.add(r2)     // Catch:{ all -> 0x0029 }
            r1.runWriter()     // Catch:{ all -> 0x0029 }
            int r2 = r1.receivedPingCount     // Catch:{ all -> 0x0029 }
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            return
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p398ws.RealWebSocket.onReadPing(s.i):void");
    }

    public synchronized void onReadPong(C12911i iVar) {
        C10202j.m34178b(iVar, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(C12911i iVar) {
        C10202j.m34178b(iVar, "payload");
        if (!this.failed) {
            if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                this.pongQueue.add(iVar);
                runWriter();
                return true;
            }
        }
        return false;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            if (webSocketReader != null) {
                webSocketReader.processNextFrame();
                if (this.receivedCloseCode == -1) {
                    return true;
                }
                return false;
            }
            C10202j.m34172a();
            throw null;
        } catch (Exception e) {
            failWebSocket(e, (Response) null);
            return false;
        }
    }

    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    public Request request() {
        return this.originalRequest;
    }

    public boolean send(String str) {
        C10202j.m34178b(str, Command.CommandHandler.TEXT);
        return send(C12911i.f33159j.mo41249c(str), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.cancelFuture;
        if (scheduledFuture != null) {
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            ScheduledExecutorService scheduledExecutorService2 = this.executor;
            if (scheduledExecutorService2 != null) {
                scheduledExecutorService2.awaitTermination(10, TimeUnit.SECONDS);
            } else {
                C10202j.m34172a();
                throw null;
            }
        } else {
            C10202j.m34172a();
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        if (r2 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0064, code lost:
        if (r0 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0.writePong(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006a, code lost:
        kotlin.jvm.internal.C10202j.m34172a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006d, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0070, code lost:
        if ((r5 instanceof okhttp3.internal.p398ws.RealWebSocket.Message) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0072, code lost:
        r1 = ((okhttp3.internal.p398ws.RealWebSocket.Message) r5).getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0079, code lost:
        if (r0 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007b, code lost:
        r0 = p413s.C12919p.m41674a(r0.newMessageSink(((okhttp3.internal.p398ws.RealWebSocket.Message) r5).getFormatOpcode(), (long) r1.mo41239s()));
        r0.mo41161c(r1);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0094, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r11.queueSize -= (long) r1.mo41239s();
        r0 = kotlin.C10483v.f28357a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a6, code lost:
        kotlin.jvm.internal.C10202j.m34172a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a9, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ac, code lost:
        if ((r5 instanceof okhttp3.internal.p398ws.RealWebSocket.Close) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ae, code lost:
        r5 = (okhttp3.internal.p398ws.RealWebSocket.Close) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b0, code lost:
        if (r0 == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b2, code lost:
        r0.writeClose(r5.getCode(), r5.getReason());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00bd, code lost:
        if (r3 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00bf, code lost:
        r0 = r11.listener;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c1, code lost:
        if (r6 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c3, code lost:
        r0.onClosed(r11, r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c7, code lost:
        kotlin.jvm.internal.C10202j.m34172a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ca, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00cc, code lost:
        if (r3 == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ce, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d1, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        kotlin.jvm.internal.C10202j.m34172a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d5, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00db, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00dd, code lost:
        if (r3 != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00df, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00e2, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.failed     // Catch:{ all -> 0x00e3 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r11)
            return r1
        L_0x0008:
            okhttp3.internal.ws.WebSocketWriter r0 = r11.writer     // Catch:{ all -> 0x00e3 }
            java.util.ArrayDeque<s.i> r2 = r11.pongQueue     // Catch:{ all -> 0x00e3 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00e3 }
            s.i r2 = (p413s.C12911i) r2     // Catch:{ all -> 0x00e3 }
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x005b
            java.util.ArrayDeque<java.lang.Object> r5 = r11.messageAndCloseQueue     // Catch:{ all -> 0x00e3 }
            java.lang.Object r5 = r5.poll()     // Catch:{ all -> 0x00e3 }
            boolean r6 = r5 instanceof okhttp3.internal.p398ws.RealWebSocket.Close     // Catch:{ all -> 0x00e3 }
            if (r6 == 0) goto L_0x0054
            int r1 = r11.receivedCloseCode     // Catch:{ all -> 0x00e3 }
            java.lang.String r6 = r11.receivedCloseReason     // Catch:{ all -> 0x00e3 }
            if (r1 == r3) goto L_0x0036
            okhttp3.internal.ws.RealWebSocket$Streams r3 = r11.streams     // Catch:{ all -> 0x00e3 }
            r11.streams = r4     // Catch:{ all -> 0x00e3 }
            java.util.concurrent.ScheduledExecutorService r7 = r11.executor     // Catch:{ all -> 0x00e3 }
            if (r7 == 0) goto L_0x0032
            r7.shutdown()     // Catch:{ all -> 0x00e3 }
            goto L_0x005f
        L_0x0032:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x00e3 }
            throw r4
        L_0x0036:
            java.util.concurrent.ScheduledExecutorService r3 = r11.executor     // Catch:{ all -> 0x00e3 }
            if (r3 == 0) goto L_0x0050
            okhttp3.internal.ws.RealWebSocket$CancelRunnable r7 = new okhttp3.internal.ws.RealWebSocket$CancelRunnable     // Catch:{ all -> 0x00e3 }
            r7.<init>()     // Catch:{ all -> 0x00e3 }
            r8 = r5
            okhttp3.internal.ws.RealWebSocket$Close r8 = (okhttp3.internal.p398ws.RealWebSocket.Close) r8     // Catch:{ all -> 0x00e3 }
            long r8 = r8.getCancelAfterCloseMillis()     // Catch:{ all -> 0x00e3 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00e3 }
            java.util.concurrent.ScheduledFuture r3 = r3.schedule(r7, r8, r10)     // Catch:{ all -> 0x00e3 }
            r11.cancelFuture = r3     // Catch:{ all -> 0x00e3 }
            r3 = r4
            goto L_0x005f
        L_0x0050:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x00e3 }
            throw r4
        L_0x0054:
            if (r5 != 0) goto L_0x0058
            monitor-exit(r11)
            return r1
        L_0x0058:
            r3 = r4
            r6 = r3
            goto L_0x005e
        L_0x005b:
            r3 = r4
            r5 = r3
            r6 = r5
        L_0x005e:
            r1 = -1
        L_0x005f:
            kotlin.v r7 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x00e3 }
            monitor-exit(r11)
            if (r2 == 0) goto L_0x006e
            if (r0 == 0) goto L_0x006a
            r0.writePong(r2)     // Catch:{ all -> 0x00dc }
            goto L_0x00cb
        L_0x006a:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x00dc }
            throw r4
        L_0x006e:
            boolean r2 = r5 instanceof okhttp3.internal.p398ws.RealWebSocket.Message     // Catch:{ all -> 0x00dc }
            if (r2 == 0) goto L_0x00aa
            r1 = r5
            okhttp3.internal.ws.RealWebSocket$Message r1 = (okhttp3.internal.p398ws.RealWebSocket.Message) r1     // Catch:{ all -> 0x00dc }
            s.i r1 = r1.getData()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00a6
            okhttp3.internal.ws.RealWebSocket$Message r5 = (okhttp3.internal.p398ws.RealWebSocket.Message) r5     // Catch:{ all -> 0x00dc }
            int r2 = r5.getFormatOpcode()     // Catch:{ all -> 0x00dc }
            int r4 = r1.mo41239s()     // Catch:{ all -> 0x00dc }
            long r4 = (long) r4     // Catch:{ all -> 0x00dc }
            s.y r0 = r0.newMessageSink(r2, r4)     // Catch:{ all -> 0x00dc }
            s.g r0 = p413s.C12919p.m41674a((p413s.C12932y) r0)     // Catch:{ all -> 0x00dc }
            r0.mo41161c((p413s.C12911i) r1)     // Catch:{ all -> 0x00dc }
            r0.close()     // Catch:{ all -> 0x00dc }
            monitor-enter(r11)     // Catch:{ all -> 0x00dc }
            long r4 = r11.queueSize     // Catch:{ all -> 0x00a3 }
            int r0 = r1.mo41239s()     // Catch:{ all -> 0x00a3 }
            long r0 = (long) r0     // Catch:{ all -> 0x00a3 }
            long r4 = r4 - r0
            r11.queueSize = r4     // Catch:{ all -> 0x00a3 }
            kotlin.v r0 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x00a3 }
            monitor-exit(r11)     // Catch:{ all -> 0x00dc }
            goto L_0x00cb
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00dc }
            throw r0     // Catch:{ all -> 0x00dc }
        L_0x00a6:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x00dc }
            throw r4
        L_0x00aa:
            boolean r2 = r5 instanceof okhttp3.internal.p398ws.RealWebSocket.Close     // Catch:{ all -> 0x00dc }
            if (r2 == 0) goto L_0x00d6
            okhttp3.internal.ws.RealWebSocket$Close r5 = (okhttp3.internal.p398ws.RealWebSocket.Close) r5     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00d2
            int r2 = r5.getCode()     // Catch:{ all -> 0x00dc }
            s.i r5 = r5.getReason()     // Catch:{ all -> 0x00dc }
            r0.writeClose(r2, r5)     // Catch:{ all -> 0x00dc }
            if (r3 == 0) goto L_0x00cb
            okhttp3.WebSocketListener r0 = r11.listener     // Catch:{ all -> 0x00dc }
            if (r6 == 0) goto L_0x00c7
            r0.onClosed(r11, r1, r6)     // Catch:{ all -> 0x00dc }
            goto L_0x00cb
        L_0x00c7:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x00dc }
            throw r4
        L_0x00cb:
            r0 = 1
            if (r3 == 0) goto L_0x00d1
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x00d1:
            return r0
        L_0x00d2:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x00dc }
            throw r4
        L_0x00d6:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00dc }
            r0.<init>()     // Catch:{ all -> 0x00dc }
            throw r0     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            if (r3 == 0) goto L_0x00e2
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r3)
        L_0x00e2:
            throw r0
        L_0x00e3:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p398ws.RealWebSocket.writeOneFrame$okhttp():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r1 == -1) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        failWebSocket(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r7.pingIntervalMillis + "ms (after " + (r1 - 1) + " successful ping/pongs)"), (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r0 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.writePing(p413s.C12911i.f33158i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        kotlin.jvm.internal.C10202j.m34172a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        failWebSocket(r0, (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writePingFrame$okhttp() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.failed     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            okhttp3.internal.ws.WebSocketWriter r0 = r7.writer     // Catch:{ all -> 0x005c }
            boolean r1 = r7.awaitingPong     // Catch:{ all -> 0x005c }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r7.sentPingCount     // Catch:{ all -> 0x005c }
            goto L_0x0012
        L_0x0011:
            r1 = -1
        L_0x0012:
            int r3 = r7.sentPingCount     // Catch:{ all -> 0x005c }
            r4 = 1
            int r3 = r3 + r4
            r7.sentPingCount = r3     // Catch:{ all -> 0x005c }
            r7.awaitingPong = r4     // Catch:{ all -> 0x005c }
            kotlin.v r3 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x005c }
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L_0x004a
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.pingIntervalMillis
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.failWebSocket(r0, r3)
            return
        L_0x004a:
            if (r0 == 0) goto L_0x0054
            s.i r1 = p413s.C12911i.f33158i     // Catch:{ IOException -> 0x0052 }
            r0.writePing(r1)     // Catch:{ IOException -> 0x0052 }
            goto L_0x005b
        L_0x0052:
            r0 = move-exception
            goto L_0x0058
        L_0x0054:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ IOException -> 0x0052 }
            throw r3
        L_0x0058:
            r7.failWebSocket(r0, r3)
        L_0x005b:
            return
        L_0x005c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p398ws.RealWebSocket.writePingFrame$okhttp():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean close(int r9, java.lang.String r10, long r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.p398ws.WebSocketProtocol.INSTANCE     // Catch:{ all -> 0x0059 }
            r0.validateCloseCode(r9)     // Catch:{ all -> 0x0059 }
            r0 = 0
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L_0x003d
            s.i$a r0 = p413s.C12911i.f33159j     // Catch:{ all -> 0x0059 }
            s.i r0 = r0.mo41249c(r10)     // Catch:{ all -> 0x0059 }
            int r3 = r0.mo41239s()     // Catch:{ all -> 0x0059 }
            long r3 = (long) r3     // Catch:{ all -> 0x0059 }
            r5 = 123(0x7b, double:6.1E-322)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r3 == 0) goto L_0x0022
            goto L_0x003d
        L_0x0022:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r9.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r11 = "reason.size() > 123: "
            r9.append(r11)     // Catch:{ all -> 0x0059 }
            r9.append(r10)     // Catch:{ all -> 0x0059 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0059 }
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0059 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0059 }
            r10.<init>(r9)     // Catch:{ all -> 0x0059 }
            throw r10     // Catch:{ all -> 0x0059 }
        L_0x003d:
            boolean r10 = r8.failed     // Catch:{ all -> 0x0059 }
            if (r10 != 0) goto L_0x0057
            boolean r10 = r8.enqueuedClose     // Catch:{ all -> 0x0059 }
            if (r10 == 0) goto L_0x0046
            goto L_0x0057
        L_0x0046:
            r8.enqueuedClose = r2     // Catch:{ all -> 0x0059 }
            java.util.ArrayDeque<java.lang.Object> r10 = r8.messageAndCloseQueue     // Catch:{ all -> 0x0059 }
            okhttp3.internal.ws.RealWebSocket$Close r1 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch:{ all -> 0x0059 }
            r1.<init>(r9, r0, r11)     // Catch:{ all -> 0x0059 }
            r10.add(r1)     // Catch:{ all -> 0x0059 }
            r8.runWriter()     // Catch:{ all -> 0x0059 }
            monitor-exit(r8)
            return r2
        L_0x0057:
            monitor-exit(r8)
            return r1
        L_0x0059:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p398ws.RealWebSocket.close(int, java.lang.String, long):boolean");
    }

    public void onReadMessage(C12911i iVar) throws IOException {
        C10202j.m34178b(iVar, "bytes");
        this.listener.onMessage((WebSocket) this, iVar);
    }

    public boolean send(C12911i iVar) {
        C10202j.m34178b(iVar, "bytes");
        return send(iVar, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean send(p413s.C12911i r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.enqueuedClose     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r0 = r7.mo41239s()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r2 = r7.mo41239s()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch:{ all -> 0x003e }
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.runWriter()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p398ws.RealWebSocket.send(s.i, int):boolean");
    }
}
