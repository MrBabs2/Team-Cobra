package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;
import p413s.C12905f;
import p413s.C12909g;
import p413s.C12910h;
import p413s.C12911i;
import p413s.C12919p;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 \u00012\u00020\u0001:\b\u0001\u0001\u0001\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010H\u001a\u00020IJ\b\u0010J\u001a\u00020IH\u0016J'\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\b\u0010N\u001a\u0004\u0018\u00010OH\u0000¢\u0006\u0002\bPJ\u0012\u0010Q\u001a\u00020I2\b\u0010R\u001a\u0004\u0018\u00010OH\u0002J\u0006\u0010S\u001a\u00020IJ\u0010\u0010T\u001a\u0004\u0018\u00010;2\u0006\u0010U\u001a\u00020\u0010J\u0006\u0010V\u001a\u00020\u0010J&\u0010W\u001a\u00020;2\u0006\u0010X\u001a\u00020\u00102\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0Z2\u0006\u0010\\\u001a\u00020\u0006H\u0002J\u001c\u0010W\u001a\u00020;2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0Z2\u0006\u0010\\\u001a\u00020\u0006J\u0006\u0010]\u001a\u00020\u0010J-\u0010^\u001a\u00020I2\u0006\u0010_\u001a\u00020\u00102\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020\u00102\u0006\u0010c\u001a\u00020\u0006H\u0000¢\u0006\u0002\bdJ+\u0010e\u001a\u00020I2\u0006\u0010_\u001a\u00020\u00102\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0Z2\u0006\u0010c\u001a\u00020\u0006H\u0000¢\u0006\u0002\bfJ#\u0010g\u001a\u00020I2\u0006\u0010_\u001a\u00020\u00102\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0ZH\u0000¢\u0006\u0002\bhJ\u001d\u0010i\u001a\u00020I2\u0006\u0010_\u001a\u00020\u00102\u0006\u0010j\u001a\u00020LH\u0000¢\u0006\u0002\bkJ$\u0010l\u001a\u00020;2\u0006\u0010X\u001a\u00020\u00102\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0Z2\u0006\u0010\\\u001a\u00020\u0006J\u0015\u0010m\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u0010H\u0000¢\u0006\u0002\bnJ\u0017\u0010o\u001a\u0004\u0018\u00010;2\u0006\u0010_\u001a\u00020\u0010H\u0000¢\u0006\u0002\bpJ\u000e\u0010q\u001a\u00020I2\u0006\u0010r\u001a\u00020\"J\u000e\u0010s\u001a\u00020I2\u0006\u0010t\u001a\u00020LJ\u0012\u0010u\u001a\u00020I2\b\b\u0002\u0010v\u001a\u00020\u0006H\u0007J\u0015\u0010w\u001a\u00020I2\u0006\u0010x\u001a\u00020+H\u0000¢\u0006\u0002\byJ(\u0010z\u001a\u00020I2\u0006\u0010_\u001a\u00020\u00102\u0006\u0010{\u001a\u00020\u00062\b\u0010|\u001a\u0004\u0018\u00010}2\u0006\u0010b\u001a\u00020+J,\u0010~\u001a\u00020I2\u0006\u0010_\u001a\u00020\u00102\u0006\u0010{\u001a\u00020\u00062\f\u0010\u001a\b\u0012\u0004\u0012\u00020[0ZH\u0000¢\u0006\u0003\b\u0001J\"\u0010\u0001\u001a\u00020I2\u0007\u0010\u0001\u001a\u00020\u00062\u0007\u0010\u0001\u001a\u00020\u00102\u0007\u0010\u0001\u001a\u00020\u0010J\u0007\u0010\u0001\u001a\u00020IJ\u001f\u0010\u0001\u001a\u00020I2\u0006\u0010_\u001a\u00020\u00102\u0006\u0010t\u001a\u00020LH\u0000¢\u0006\u0003\b\u0001J\u001f\u0010\u0001\u001a\u00020I2\u0006\u0010_\u001a\u00020\u00102\u0006\u0010j\u001a\u00020LH\u0000¢\u0006\u0003\b\u0001J \u0010\u0001\u001a\u00020I2\u0006\u0010_\u001a\u00020\u00102\u0007\u0010\u0001\u001a\u00020+H\u0000¢\u0006\u0003\b\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068F@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u000e\u0010'\u001a\u00020(X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020+@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001e\u0010/\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020+@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0015\u00101\u001a\u000602R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u000206X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020;0:X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u001e\u0010>\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020+@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010.R\u001e\u0010@\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020+@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0011\u0010B\u001a\u00020C¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, mo16641d2 = {"Lokhttp3/internal/http2/Http2Connection;", "Ljava/io/Closeable;", "builder", "Lokhttp3/internal/http2/Http2Connection$Builder;", "(Lokhttp3/internal/http2/Http2Connection$Builder;)V", "awaitingPong", "", "client", "getClient$okhttp", "()Z", "connectionName", "", "getConnectionName$okhttp", "()Ljava/lang/String;", "currentPushRequests", "", "", "<set-?>", "isShutdown", "setShutdown$okhttp", "(Z)V", "lastGoodStreamId", "getLastGoodStreamId$okhttp", "()I", "setLastGoodStreamId$okhttp", "(I)V", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "nextStreamId", "getNextStreamId$okhttp", "setNextStreamId$okhttp", "okHttpSettings", "Lokhttp3/internal/http2/Settings;", "getOkHttpSettings", "()Lokhttp3/internal/http2/Settings;", "peerSettings", "getPeerSettings", "pushExecutor", "Ljava/util/concurrent/ThreadPoolExecutor;", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "readBytesTotal", "getReadBytesTotal", "readerRunnable", "Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "getReaderRunnable", "()Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "streams", "", "Lokhttp3/internal/http2/Http2Stream;", "getStreams$okhttp", "()Ljava/util/Map;", "writeBytesMaximum", "getWriteBytesMaximum", "writeBytesTotal", "getWriteBytesTotal", "writer", "Lokhttp3/internal/http2/Http2Writer;", "getWriter", "()Lokhttp3/internal/http2/Http2Writer;", "writerExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "awaitPong", "", "close", "connectionCode", "Lokhttp3/internal/http2/ErrorCode;", "streamCode", "cause", "Ljava/io/IOException;", "close$okhttp", "failConnection", "e", "flush", "getStream", "id", "maxConcurrentStreams", "newStream", "associatedStreamId", "requestHeaders", "", "Lokhttp3/internal/http2/Header;", "out", "openStreamCount", "pushDataLater", "streamId", "source", "Lokio/BufferedSource;", "byteCount", "inFinished", "pushDataLater$okhttp", "pushHeadersLater", "pushHeadersLater$okhttp", "pushRequestLater", "pushRequestLater$okhttp", "pushResetLater", "errorCode", "pushResetLater$okhttp", "pushStream", "pushedStream", "pushedStream$okhttp", "removeStream", "removeStream$okhttp", "setSettings", "settings", "shutdown", "statusCode", "start", "sendConnectionPreface", "updateConnectionFlowControl", "read", "updateConnectionFlowControl$okhttp", "writeData", "outFinished", "buffer", "Lokio/Buffer;", "writeHeaders", "alternating", "writeHeaders$okhttp", "writePing", "reply", "payload1", "payload2", "writePingAndAwaitPong", "writeSynReset", "writeSynReset$okhttp", "writeSynResetLater", "writeSynResetLater$okhttp", "writeWindowUpdateLater", "unacknowledgedBytesRead", "writeWindowUpdateLater$okhttp", "Builder", "Companion", "Listener", "ReaderRunnable", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: Http2Connection.kt */
public final class Http2Connection implements Closeable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    /* access modifiers changed from: private */
    public static final ThreadPoolExecutor listenerExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Http2Connection", true));
    /* access modifiers changed from: private */
    public boolean awaitingPong;
    private final boolean client;
    private final String connectionName;
    /* access modifiers changed from: private */
    public final Set<Integer> currentPushRequests;
    private boolean isShutdown;
    private int lastGoodStreamId;
    private final Listener listener;
    private int nextStreamId;
    private final Settings okHttpSettings;
    private final Settings peerSettings;
    private final ThreadPoolExecutor pushExecutor;
    /* access modifiers changed from: private */
    public final PushObserver pushObserver;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final ReaderRunnable readerRunnable;
    private final Socket socket;
    private final Map<Integer, Http2Stream> streams = new LinkedHashMap();
    /* access modifiers changed from: private */
    public long writeBytesMaximum;
    private long writeBytesTotal;
    private final Http2Writer writer;
    /* access modifiers changed from: private */
    public final ScheduledThreadPoolExecutor writerExecutor;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u00102\u001a\u000203J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ.\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010 \u001a\u00020!H\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00064"}, mo16641d2 = {"Lokhttp3/internal/http2/Http2Connection$Builder;", "", "client", "", "(Z)V", "getClient$okhttp", "()Z", "setClient$okhttp", "connectionName", "", "getConnectionName$okhttp", "()Ljava/lang/String;", "setConnectionName$okhttp", "(Ljava/lang/String;)V", "listener", "Lokhttp3/internal/http2/Http2Connection$Listener;", "getListener$okhttp", "()Lokhttp3/internal/http2/Http2Connection$Listener;", "setListener$okhttp", "(Lokhttp3/internal/http2/Http2Connection$Listener;)V", "pingIntervalMillis", "", "getPingIntervalMillis$okhttp", "()I", "setPingIntervalMillis$okhttp", "(I)V", "pushObserver", "Lokhttp3/internal/http2/PushObserver;", "getPushObserver$okhttp", "()Lokhttp3/internal/http2/PushObserver;", "setPushObserver$okhttp", "(Lokhttp3/internal/http2/PushObserver;)V", "sink", "Lokio/BufferedSink;", "getSink$okhttp", "()Lokio/BufferedSink;", "setSink$okhttp", "(Lokio/BufferedSink;)V", "socket", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "setSocket$okhttp", "(Ljava/net/Socket;)V", "source", "Lokio/BufferedSource;", "getSource$okhttp", "()Lokio/BufferedSource;", "setSource$okhttp", "(Lokio/BufferedSource;)V", "build", "Lokhttp3/internal/http2/Http2Connection;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http2Connection.kt */
    public static final class Builder {
        private boolean client;
        public String connectionName;
        private Listener listener = Listener.REFUSE_INCOMING_STREAMS;
        private int pingIntervalMillis;
        private PushObserver pushObserver = PushObserver.CANCEL;
        public C12909g sink;
        public Socket socket;
        public C12910h source;

        public Builder(boolean z) {
            this.client = z;
        }

        public static /* synthetic */ Builder socket$default(Builder builder, Socket socket2, String str, C12910h hVar, C12909g gVar, int i, Object obj) throws IOException {
            if ((i & 2) != 0) {
                str = Util.connectionName(socket2);
            }
            if ((i & 4) != 0) {
                hVar = C12919p.m41675a(C12919p.m41684b(socket2));
            }
            if ((i & 8) != 0) {
                gVar = C12919p.m41674a(C12919p.m41681a(socket2));
            }
            return builder.socket(socket2, str, hVar, gVar);
        }

        public final Http2Connection build() {
            return new Http2Connection(this);
        }

        public final boolean getClient$okhttp() {
            return this.client;
        }

        public final String getConnectionName$okhttp() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            C10202j.m34181d("connectionName");
            throw null;
        }

        public final Listener getListener$okhttp() {
            return this.listener;
        }

        public final int getPingIntervalMillis$okhttp() {
            return this.pingIntervalMillis;
        }

        public final PushObserver getPushObserver$okhttp() {
            return this.pushObserver;
        }

        public final C12909g getSink$okhttp() {
            C12909g gVar = this.sink;
            if (gVar != null) {
                return gVar;
            }
            C10202j.m34181d("sink");
            throw null;
        }

        public final Socket getSocket$okhttp() {
            Socket socket2 = this.socket;
            if (socket2 != null) {
                return socket2;
            }
            C10202j.m34181d("socket");
            throw null;
        }

        public final C12910h getSource$okhttp() {
            C12910h hVar = this.source;
            if (hVar != null) {
                return hVar;
            }
            C10202j.m34181d("source");
            throw null;
        }

        public final Builder listener(Listener listener2) {
            C10202j.m34178b(listener2, "listener");
            this.listener = listener2;
            return this;
        }

        public final Builder pingIntervalMillis(int i) {
            this.pingIntervalMillis = i;
            return this;
        }

        public final Builder pushObserver(PushObserver pushObserver2) {
            C10202j.m34178b(pushObserver2, "pushObserver");
            this.pushObserver = pushObserver2;
            return this;
        }

        public final void setClient$okhttp(boolean z) {
            this.client = z;
        }

        public final void setConnectionName$okhttp(String str) {
            C10202j.m34178b(str, "<set-?>");
            this.connectionName = str;
        }

        public final void setListener$okhttp(Listener listener2) {
            C10202j.m34178b(listener2, "<set-?>");
            this.listener = listener2;
        }

        public final void setPingIntervalMillis$okhttp(int i) {
            this.pingIntervalMillis = i;
        }

        public final void setPushObserver$okhttp(PushObserver pushObserver2) {
            C10202j.m34178b(pushObserver2, "<set-?>");
            this.pushObserver = pushObserver2;
        }

        public final void setSink$okhttp(C12909g gVar) {
            C10202j.m34178b(gVar, "<set-?>");
            this.sink = gVar;
        }

        public final void setSocket$okhttp(Socket socket2) {
            C10202j.m34178b(socket2, "<set-?>");
            this.socket = socket2;
        }

        public final void setSource$okhttp(C12910h hVar) {
            C10202j.m34178b(hVar, "<set-?>");
            this.source = hVar;
        }

        public final Builder socket(Socket socket2) throws IOException {
            return socket$default(this, socket2, (String) null, (C12910h) null, (C12909g) null, 14, (Object) null);
        }

        public final Builder socket(Socket socket2, String str) throws IOException {
            return socket$default(this, socket2, str, (C12910h) null, (C12909g) null, 12, (Object) null);
        }

        public final Builder socket(Socket socket2, String str, C12910h hVar) throws IOException {
            return socket$default(this, socket2, str, hVar, (C12909g) null, 8, (Object) null);
        }

        public final Builder socket(Socket socket2, String str, C12910h hVar, C12909g gVar) throws IOException {
            C10202j.m34178b(socket2, "socket");
            C10202j.m34178b(str, "connectionName");
            C10202j.m34178b(hVar, "source");
            C10202j.m34178b(gVar, "sink");
            this.socket = socket2;
            this.connectionName = str;
            this.source = hVar;
            this.sink = gVar;
            return this;
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo16641d2 = {"Lokhttp3/internal/http2/Http2Connection$Companion;", "", "()V", "OKHTTP_CLIENT_WINDOW_SIZE", "", "listenerExecutor", "Ljava/util/concurrent/ThreadPoolExecutor;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http2Connection.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, mo16641d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener;", "", "()V", "onSettings", "", "connection", "Lokhttp3/internal/http2/Http2Connection;", "onStream", "stream", "Lokhttp3/internal/http2/Http2Stream;", "Companion", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http2Connection.kt */
    public static abstract class Listener {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final Listener REFUSE_INCOMING_STREAMS = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();

        @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo16641d2 = {"Lokhttp3/internal/http2/Http2Connection$Listener$Companion;", "", "()V", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/Http2Connection$Listener;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
        /* compiled from: Http2Connection.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public void onSettings(Http2Connection http2Connection) {
            C10202j.m34178b(http2Connection, "connection");
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J8\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J(\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fH\u0016J \u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0010H\u0016J.\u0010$\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J \u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\fH\u0016J(\u0010-\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\u0017H\u0016J&\u00101\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\f\u00103\u001a\b\u0012\u0004\u0012\u00020(0'H\u0016J\u0018\u00104\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u00105\u001a\u00020\tH\u0016J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u00106\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0014H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u00068"}, mo16641d2 = {"Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;", "Ljava/lang/Runnable;", "Lokhttp3/internal/http2/Http2Reader$Handler;", "reader", "Lokhttp3/internal/http2/Http2Reader;", "(Lokhttp3/internal/http2/Http2Connection;Lokhttp3/internal/http2/Http2Reader;)V", "getReader$okhttp", "()Lokhttp3/internal/http2/Http2Reader;", "ackSettings", "", "alternateService", "streamId", "", "origin", "", "protocol", "Lokio/ByteString;", "host", "port", "maxAge", "", "applyAndAckSettings", "clearPrevious", "", "settings", "Lokhttp3/internal/http2/Settings;", "data", "inFinished", "source", "Lokio/BufferedSource;", "length", "goAway", "lastGoodStreamId", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "debugData", "headers", "associatedStreamId", "headerBlock", "", "Lokhttp3/internal/http2/Header;", "ping", "ack", "payload1", "payload2", "priority", "streamDependency", "weight", "exclusive", "pushPromise", "promisedStreamId", "requestHeaders", "rstStream", "run", "windowUpdate", "windowSizeIncrement", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http2Connection.kt */
    public final class ReaderRunnable implements Runnable, Http2Reader.Handler {
        private final Http2Reader reader;
        final /* synthetic */ Http2Connection this$0;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader http2Reader) {
            C10202j.m34178b(http2Reader, "reader");
            this.this$0 = http2Connection;
            this.reader = http2Reader;
        }

        public void ackSettings() {
        }

        public void alternateService(int i, String str, C12911i iVar, String str2, int i2, long j) {
            C10202j.m34178b(str, "origin");
            C10202j.m34178b(iVar, "protocol");
            C10202j.m34178b(str2, "host");
        }

        public final void applyAndAckSettings(boolean z, Settings settings) {
            int i;
            long j;
            Http2Stream[] http2StreamArr;
            C10202j.m34178b(settings, "settings");
            synchronized (this.this$0.getWriter()) {
                synchronized (this.this$0) {
                    int initialWindowSize = this.this$0.getPeerSettings().getInitialWindowSize();
                    if (z) {
                        this.this$0.getPeerSettings().clear();
                    }
                    this.this$0.getPeerSettings().merge(settings);
                    int initialWindowSize2 = this.this$0.getPeerSettings().getInitialWindowSize();
                    if (initialWindowSize2 == -1 || initialWindowSize2 == initialWindowSize) {
                        j = 0;
                    } else {
                        j = (long) (initialWindowSize2 - initialWindowSize);
                        if (!this.this$0.getStreams$okhttp().isEmpty()) {
                            Object[] array = this.this$0.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                            if (array != null) {
                                http2StreamArr = (Http2Stream[]) array;
                                C10483v vVar = C10483v.f28357a;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                    }
                    http2StreamArr = null;
                    C10483v vVar2 = C10483v.f28357a;
                }
                try {
                    this.this$0.getWriter().applyAndAckSettings(this.this$0.getPeerSettings());
                } catch (IOException e) {
                    this.this$0.failConnection(e);
                }
                C10483v vVar3 = C10483v.f28357a;
            }
            if (http2StreamArr != null) {
                if (http2StreamArr != null) {
                    for (Http2Stream http2Stream : http2StreamArr) {
                        synchronized (http2Stream) {
                            http2Stream.addBytesToWriteWindow(j);
                            C10483v vVar4 = C10483v.f28357a;
                        }
                    }
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
            Http2Connection.listenerExecutor.execute(new C12339x5de897ce("OkHttp " + this.this$0.getConnectionName$okhttp() + " settings", this));
        }

        public void data(boolean z, int i, C12910h hVar, int i2) throws IOException {
            C10202j.m34178b(hVar, "source");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushDataLater$okhttp(i, hVar, i2, z);
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream == null) {
                this.this$0.writeSynResetLater$okhttp(i, ErrorCode.PROTOCOL_ERROR);
                long j = (long) i2;
                this.this$0.updateConnectionFlowControl$okhttp(j);
                hVar.skip(j);
                return;
            }
            stream.receiveData(hVar, i2);
            if (z) {
                stream.receiveHeaders(Util.EMPTY_HEADERS, true);
            }
        }

        public final Http2Reader getReader$okhttp() {
            return this.reader;
        }

        public void goAway(int i, ErrorCode errorCode, C12911i iVar) {
            int i2;
            Http2Stream[] http2StreamArr;
            C10202j.m34178b(errorCode, "errorCode");
            C10202j.m34178b(iVar, "debugData");
            int s = iVar.mo41239s();
            synchronized (this.this$0) {
                Object[] array = this.this$0.getStreams$okhttp().values().toArray(new Http2Stream[0]);
                if (array != null) {
                    http2StreamArr = (Http2Stream[]) array;
                    this.this$0.setShutdown$okhttp(true);
                    C10483v vVar = C10483v.f28357a;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    this.this$0.removeStream$okhttp(http2Stream.getId());
                }
            }
        }

        public void headers(boolean z, int i, int i2, List<Header> list) {
            boolean z2 = z;
            int i3 = i;
            List<Header> list2 = list;
            C10202j.m34178b(list2, "headerBlock");
            if (this.this$0.pushedStream$okhttp(i3)) {
                this.this$0.pushHeadersLater$okhttp(i3, list2, z2);
                return;
            }
            synchronized (this.this$0) {
                Http2Stream stream = this.this$0.getStream(i3);
                if (stream != null) {
                    C10483v vVar = C10483v.f28357a;
                    stream.receiveHeaders(Util.toHeaders(list), z2);
                } else if (!this.this$0.isShutdown()) {
                    if (i3 > this.this$0.getLastGoodStreamId$okhttp()) {
                        if (i3 % 2 != this.this$0.getNextStreamId$okhttp() % 2) {
                            int i4 = i;
                            Http2Stream http2Stream = new Http2Stream(i4, this.this$0, false, z, Util.toHeaders(list));
                            this.this$0.setLastGoodStreamId$okhttp(i3);
                            this.this$0.getStreams$okhttp().put(Integer.valueOf(i), http2Stream);
                            ThreadPoolExecutor access$getListenerExecutor$cp = Http2Connection.listenerExecutor;
                            access$getListenerExecutor$cp.execute(new C12340xe89ff7cd("OkHttp " + this.this$0.getConnectionName$okhttp() + " stream " + i3, http2Stream, this, stream, i, list, z));
                        }
                    }
                }
            }
        }

        public void ping(boolean z, int i, int i2) {
            if (z) {
                synchronized (this.this$0) {
                    this.this$0.awaitingPong = false;
                    Http2Connection http2Connection = this.this$0;
                    if (http2Connection != null) {
                        http2Connection.notifyAll();
                        C10483v vVar = C10483v.f28357a;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            ScheduledThreadPoolExecutor access$getWriterExecutor$p = this.this$0.writerExecutor;
            try {
                access$getWriterExecutor$p.execute(new Http2Connection$ReaderRunnable$ping$$inlined$tryExecute$1("OkHttp " + this.this$0.getConnectionName$okhttp() + " ping", this, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void priority(int i, int i2, int i3, boolean z) {
        }

        public void pushPromise(int i, int i2, List<Header> list) {
            C10202j.m34178b(list, "requestHeaders");
            this.this$0.pushRequestLater$okhttp(i2, list);
        }

        public void rstStream(int i, ErrorCode errorCode) {
            C10202j.m34178b(errorCode, "errorCode");
            if (this.this$0.pushedStream$okhttp(i)) {
                this.this$0.pushResetLater$okhttp(i, errorCode);
                return;
            }
            Http2Stream removeStream$okhttp = this.this$0.removeStream$okhttp(i);
            if (removeStream$okhttp != null) {
                removeStream$okhttp.receiveRstStream(errorCode);
            }
        }

        public void run() {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            e = null;
            try {
                this.reader.readConnectionPreface(this);
                while (this.reader.nextFrame(false, this)) {
                }
                errorCode = ErrorCode.NO_ERROR;
                try {
                    errorCode2 = ErrorCode.CANCEL;
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                errorCode = errorCode3;
                try {
                    errorCode = ErrorCode.PROTOCOL_ERROR;
                    errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    this.this$0.close$okhttp(errorCode, errorCode2, e);
                    Util.closeQuietly((Closeable) this.reader);
                } catch (Throwable th) {
                    th = th;
                    this.this$0.close$okhttp(errorCode, errorCode3, e);
                    Util.closeQuietly((Closeable) this.reader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                errorCode = errorCode3;
                this.this$0.close$okhttp(errorCode, errorCode3, e);
                Util.closeQuietly((Closeable) this.reader);
                throw th;
            }
            this.this$0.close$okhttp(errorCode, errorCode2, e);
            Util.closeQuietly((Closeable) this.reader);
        }

        public void settings(boolean z, Settings settings) {
            C10202j.m34178b(settings, "settings");
            ScheduledThreadPoolExecutor access$getWriterExecutor$p = this.this$0.writerExecutor;
            try {
                access$getWriterExecutor$p.execute(new Http2Connection$ReaderRunnable$settings$$inlined$tryExecute$1("OkHttp " + this.this$0.getConnectionName$okhttp() + " ACK Settings", this, z, settings));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void windowUpdate(int i, long j) {
            if (i == 0) {
                synchronized (this.this$0) {
                    Http2Connection http2Connection = this.this$0;
                    http2Connection.writeBytesMaximum = http2Connection.getWriteBytesMaximum() + j;
                    Http2Connection http2Connection2 = this.this$0;
                    if (http2Connection2 != null) {
                        http2Connection2.notifyAll();
                        C10483v vVar = C10483v.f28357a;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                return;
            }
            Http2Stream stream = this.this$0.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                    C10483v vVar2 = C10483v.f28357a;
                }
            }
        }
    }

    public Http2Connection(Builder builder) {
        C10202j.m34178b(builder, "builder");
        this.client = builder.getClient$okhttp();
        this.listener = builder.getListener$okhttp();
        this.connectionName = builder.getConnectionName$okhttp();
        this.nextStreamId = builder.getClient$okhttp() ? 3 : 2;
        this.writerExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(Util.format("OkHttp %s Writer", this.connectionName), false));
        this.pushExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(Util.format("OkHttp %s Push Observer", this.connectionName), true));
        this.pushObserver = builder.getPushObserver$okhttp();
        Settings settings = new Settings();
        if (builder.getClient$okhttp()) {
            settings.set(7, OKHTTP_CLIENT_WINDOW_SIZE);
        }
        this.okHttpSettings = settings;
        Settings settings2 = new Settings();
        settings2.set(7, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        settings2.set(5, Http2.INITIAL_MAX_FRAME_SIZE);
        this.peerSettings = settings2;
        this.writeBytesMaximum = (long) settings2.getInitialWindowSize();
        this.socket = builder.getSocket$okhttp();
        this.writer = new Http2Writer(builder.getSink$okhttp(), this.client);
        this.readerRunnable = new ReaderRunnable(this, new Http2Reader(builder.getSource$okhttp(), this.client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis$okhttp() != 0) {
            this.writerExecutor.scheduleAtFixedRate(new Runnable(this) {
                final /* synthetic */ Http2Connection this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    Thread currentThread = Thread.currentThread();
                    C10202j.m34174a((Object) currentThread, "currentThread");
                    String name = currentThread.getName();
                    currentThread.setName("OkHttp " + this.this$0.getConnectionName$okhttp() + " ping");
                    try {
                        this.this$0.writePing(false, 0, 0);
                    } finally {
                        currentThread.setName(name);
                    }
                }
            }, (long) builder.getPingIntervalMillis$okhttp(), (long) builder.getPingIntervalMillis$okhttp(), TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: private */
    public final void failConnection(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        close$okhttp(errorCode, errorCode, iOException);
    }

    public static /* synthetic */ void start$default(Http2Connection http2Connection, boolean z, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            z = true;
        }
        http2Connection.start(z);
    }

    public final synchronized void awaitPong() throws InterruptedException {
        while (this.awaitingPong) {
            wait();
        }
    }

    public void close() {
        close$okhttp(ErrorCode.NO_ERROR, ErrorCode.CANCEL, (IOException) null);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:5|6|7|23|(2:21|(5:23|24|25|38|26))|28|29|30|31|32|34) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close$okhttp(okhttp3.internal.http2.ErrorCode r4, okhttp3.internal.http2.ErrorCode r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.C10202j.m34178b(r5, r0)
            boolean r0 = java.lang.Thread.holdsLock(r3)
            r0 = r0 ^ 1
            boolean r1 = kotlin.C10485x.f28360a
            if (r1 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x0017
            goto L_0x001f
        L_0x0017:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "Assertion failed"
            r4.<init>(r5)
            throw r4
        L_0x001f:
            r3.shutdown(r4)     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r3.streams     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0072 }
            r0 = r0 ^ 1
            r1 = 0
            if (r0 == 0) goto L_0x004d
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r3.streams     // Catch:{ all -> 0x0072 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0072 }
            okhttp3.internal.http2.Http2Stream[] r0 = new okhttp3.internal.http2.Http2Stream[r1]     // Catch:{ all -> 0x0072 }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x0045
            okhttp3.internal.http2.Http2Stream[] r4 = (okhttp3.internal.http2.Http2Stream[]) r4     // Catch:{ all -> 0x0072 }
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r0 = r3.streams     // Catch:{ all -> 0x0072 }
            r0.clear()     // Catch:{ all -> 0x0072 }
            goto L_0x004d
        L_0x0045:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException     // Catch:{ all -> 0x0072 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0072 }
            throw r4     // Catch:{ all -> 0x0072 }
        L_0x004d:
            kotlin.v r0 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x0072 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x005d
            int r0 = r4.length
        L_0x0053:
            if (r1 >= r0) goto L_0x005d
            r2 = r4[r1]
            r2.close(r5, r6)     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            int r1 = r1 + 1
            goto L_0x0053
        L_0x005d:
            okhttp3.internal.http2.Http2Writer r4 = r3.writer     // Catch:{ IOException -> 0x0062 }
            r4.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            java.net.Socket r4 = r3.socket     // Catch:{ IOException -> 0x0067 }
            r4.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r3.writerExecutor
            r4.shutdown()
            java.util.concurrent.ThreadPoolExecutor r4 = r3.pushExecutor
            r4.shutdown()
            return
        L_0x0072:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0076
        L_0x0075:
            throw r4
        L_0x0076:
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.close$okhttp(okhttp3.internal.http2.ErrorCode, okhttp3.internal.http2.ErrorCode, java.io.IOException):void");
    }

    public final void flush() throws IOException {
        this.writer.flush();
    }

    public final boolean getClient$okhttp() {
        return this.client;
    }

    public final String getConnectionName$okhttp() {
        return this.connectionName;
    }

    public final int getLastGoodStreamId$okhttp() {
        return this.lastGoodStreamId;
    }

    public final Listener getListener$okhttp() {
        return this.listener;
    }

    public final int getNextStreamId$okhttp() {
        return this.nextStreamId;
    }

    public final Settings getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final Settings getPeerSettings() {
        return this.peerSettings;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final ReaderRunnable getReaderRunnable() {
        return this.readerRunnable;
    }

    public final Socket getSocket$okhttp() {
        return this.socket;
    }

    public final synchronized Http2Stream getStream(int i) {
        return this.streams.get(Integer.valueOf(i));
    }

    public final Map<Integer, Http2Stream> getStreams$okhttp() {
        return this.streams;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final Http2Writer getWriter() {
        return this.writer;
    }

    public final synchronized boolean isShutdown() {
        return this.isShutdown;
    }

    public final synchronized int maxConcurrentStreams() {
        return this.peerSettings.getMaxConcurrentStreams(Integer.MAX_VALUE);
    }

    public final Http2Stream newStream(List<Header> list, boolean z) throws IOException {
        C10202j.m34178b(list, "requestHeaders");
        return newStream(0, list, z);
    }

    public final synchronized int openStreamCount() {
        return this.streams.size();
    }

    public final void pushDataLater$okhttp(int i, C12910h hVar, int i2, boolean z) throws IOException {
        C10202j.m34178b(hVar, "source");
        C12905f fVar = new C12905f();
        long j = (long) i2;
        hVar.mo41172h(j);
        hVar.read(fVar, j);
        if (!this.isShutdown) {
            ThreadPoolExecutor threadPoolExecutor = this.pushExecutor;
            threadPoolExecutor.execute(new Http2Connection$pushDataLater$$inlined$execute$1("OkHttp " + this.connectionName + " Push Data[" + i + ']', this, i, fVar, i2, z));
        }
    }

    public final void pushHeadersLater$okhttp(int i, List<Header> list, boolean z) {
        C10202j.m34178b(list, "requestHeaders");
        if (!this.isShutdown) {
            ThreadPoolExecutor threadPoolExecutor = this.pushExecutor;
            try {
                threadPoolExecutor.execute(new Http2Connection$pushHeadersLater$$inlined$tryExecute$1("OkHttp " + this.connectionName + " Push Headers[" + i + ']', this, i, list, z));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r3.isShutdown != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r0 = r3.pushExecutor;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.execute(new okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$tryExecute$1("OkHttp " + r3.connectionName + " Push Request[" + r4 + ']', r3, r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void pushRequestLater$okhttp(int r4, java.util.List<okhttp3.internal.http2.Header> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.C10202j.m34178b(r5, r0)
            monitor-enter(r3)
            java.util.Set<java.lang.Integer> r0 = r3.currentPushRequests     // Catch:{ all -> 0x0052 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0052 }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0019
            okhttp3.internal.http2.ErrorCode r5 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x0052 }
            r3.writeSynResetLater$okhttp(r4, r5)     // Catch:{ all -> 0x0052 }
            monitor-exit(r3)
            return
        L_0x0019:
            java.util.Set<java.lang.Integer> r0 = r3.currentPushRequests     // Catch:{ all -> 0x0052 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0052 }
            r0.add(r1)     // Catch:{ all -> 0x0052 }
            monitor-exit(r3)
            boolean r0 = r3.isShutdown
            if (r0 != 0) goto L_0x0051
            java.util.concurrent.ThreadPoolExecutor r0 = r3.pushExecutor
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OkHttp "
            r1.append(r2)
            java.lang.String r2 = r3.connectionName
            r1.append(r2)
            java.lang.String r2 = " Push Request["
            r1.append(r2)
            r1.append(r4)
            r2 = 93
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$tryExecute$1 r2 = new okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$tryExecute$1     // Catch:{ RejectedExecutionException -> 0x0051 }
            r2.<init>(r1, r3, r4, r5)     // Catch:{ RejectedExecutionException -> 0x0051 }
            r0.execute(r2)     // Catch:{ RejectedExecutionException -> 0x0051 }
        L_0x0051:
            return
        L_0x0052:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.pushRequestLater$okhttp(int, java.util.List):void");
    }

    public final void pushResetLater$okhttp(int i, ErrorCode errorCode) {
        C10202j.m34178b(errorCode, "errorCode");
        if (!this.isShutdown) {
            ThreadPoolExecutor threadPoolExecutor = this.pushExecutor;
            threadPoolExecutor.execute(new Http2Connection$pushResetLater$$inlined$execute$1("OkHttp " + this.connectionName + " Push Reset[" + i + ']', this, i, errorCode));
        }
    }

    public final Http2Stream pushStream(int i, List<Header> list, boolean z) throws IOException {
        C10202j.m34178b(list, "requestHeaders");
        if (!this.client) {
            return newStream(i, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }

    public final boolean pushedStream$okhttp(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final synchronized Http2Stream removeStream$okhttp(int i) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final void setLastGoodStreamId$okhttp(int i) {
        this.lastGoodStreamId = i;
    }

    public final void setNextStreamId$okhttp(int i) {
        this.nextStreamId = i;
    }

    public final void setSettings(Settings settings) throws IOException {
        C10202j.m34178b(settings, "settings");
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.okHttpSettings.merge(settings);
                    C10483v vVar = C10483v.f28357a;
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
            C10483v vVar2 = C10483v.f28357a;
        }
    }

    public final void setShutdown$okhttp(boolean z) {
        this.isShutdown = z;
    }

    public final void shutdown(ErrorCode errorCode) throws IOException {
        C10202j.m34178b(errorCode, "statusCode");
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.isShutdown) {
                    this.isShutdown = true;
                    int i = this.lastGoodStreamId;
                    C10483v vVar = C10483v.f28357a;
                    this.writer.goAway(i, errorCode, Util.EMPTY_BYTE_ARRAY);
                    C10483v vVar2 = C10483v.f28357a;
                }
            }
        }
    }

    public final void start() throws IOException {
        start$default(this, false, 1, (Object) null);
    }

    public final void start(boolean z) throws IOException {
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, (long) (initialWindowSize - Settings.DEFAULT_INITIAL_WINDOW_SIZE));
            }
        }
        ReaderRunnable readerRunnable2 = this.readerRunnable;
        new Thread(readerRunnable2, "OkHttp " + this.connectionName).start();
    }

    public final synchronized void updateConnectionFlowControl$okhttp(long j) {
        long j2 = this.readBytesTotal + j;
        this.readBytesTotal = j2;
        long j3 = j2 - this.readBytesAcknowledged;
        if (j3 >= ((long) (this.okHttpSettings.getInitialWindowSize() / 2))) {
            writeWindowUpdateLater$okhttp(0, j3);
            this.readBytesAcknowledged += j3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5 = (int) java.lang.Math.min(r13, r9.writeBytesMaximum - r9.writeBytesTotal);
        r3.f27853f = r5;
        r4 = java.lang.Math.min(r5, r9.writer.maxDataLength());
        r3.f27853f = r4;
        r9.writeBytesTotal += (long) r4;
        r5 = kotlin.C10483v.f28357a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeData(int r10, boolean r11, p413s.C12905f r12, long r13) throws java.io.IOException {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            okhttp3.internal.http2.Http2Writer r13 = r9.writer
            r13.data(r11, r10, r12, r0)
            return
        L_0x000d:
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x007c
            kotlin.jvm.internal.v r3 = new kotlin.jvm.internal.v
            r3.<init>()
            monitor-enter(r9)
        L_0x0017:
            long r4 = r9.writeBytesTotal     // Catch:{ InterruptedException -> 0x006d }
            long r6 = r9.writeBytesMaximum     // Catch:{ InterruptedException -> 0x006d }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0037
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r4 = r9.streams     // Catch:{ InterruptedException -> 0x006d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch:{ InterruptedException -> 0x006d }
            boolean r4 = r4.containsKey(r5)     // Catch:{ InterruptedException -> 0x006d }
            if (r4 == 0) goto L_0x002f
            r9.wait()     // Catch:{ InterruptedException -> 0x006d }
            goto L_0x0017
        L_0x002f:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ InterruptedException -> 0x006d }
            java.lang.String r11 = "stream closed"
            r10.<init>(r11)     // Catch:{ InterruptedException -> 0x006d }
            throw r10     // Catch:{ InterruptedException -> 0x006d }
        L_0x0037:
            long r4 = r9.writeBytesMaximum     // Catch:{ all -> 0x006b }
            long r6 = r9.writeBytesTotal     // Catch:{ all -> 0x006b }
            long r4 = r4 - r6
            long r4 = java.lang.Math.min(r13, r4)     // Catch:{ all -> 0x006b }
            int r5 = (int) r4     // Catch:{ all -> 0x006b }
            r3.f27853f = r5     // Catch:{ all -> 0x006b }
            okhttp3.internal.http2.Http2Writer r4 = r9.writer     // Catch:{ all -> 0x006b }
            int r4 = r4.maxDataLength()     // Catch:{ all -> 0x006b }
            int r4 = java.lang.Math.min(r5, r4)     // Catch:{ all -> 0x006b }
            r3.f27853f = r4     // Catch:{ all -> 0x006b }
            long r5 = r9.writeBytesTotal     // Catch:{ all -> 0x006b }
            long r7 = (long) r4     // Catch:{ all -> 0x006b }
            long r5 = r5 + r7
            r9.writeBytesTotal = r5     // Catch:{ all -> 0x006b }
            kotlin.v r5 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x006b }
            monitor-exit(r9)
            long r4 = (long) r4
            long r13 = r13 - r4
            okhttp3.internal.http2.Http2Writer r4 = r9.writer
            if (r11 == 0) goto L_0x0064
            int r5 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0064
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            int r3 = r3.f27853f
            r4.data(r5, r10, r12, r3)
            goto L_0x000d
        L_0x006b:
            r10 = move-exception
            goto L_0x007a
        L_0x006d:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x006b }
            r10.interrupt()     // Catch:{ all -> 0x006b }
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch:{ all -> 0x006b }
            r10.<init>()     // Catch:{ all -> 0x006b }
            throw r10     // Catch:{ all -> 0x006b }
        L_0x007a:
            monitor-exit(r9)
            throw r10
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, s.f, long):void");
    }

    public final void writeHeaders$okhttp(int i, boolean z, List<Header> list) throws IOException {
        C10202j.m34178b(list, "alternating");
        this.writer.headers(z, i, list);
    }

    public final void writePing(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.awaitingPong;
                this.awaitingPong = true;
                C10483v vVar = C10483v.f28357a;
            }
            if (z2) {
                failConnection((IOException) null);
                return;
            }
        }
        try {
            this.writer.ping(z, i, i2);
        } catch (IOException e) {
            failConnection(e);
        }
    }

    public final void writePingAndAwaitPong() throws InterruptedException {
        writePing(false, 1330343787, -257978967);
        awaitPong();
    }

    public final void writeSynReset$okhttp(int i, ErrorCode errorCode) throws IOException {
        C10202j.m34178b(errorCode, "statusCode");
        this.writer.rstStream(i, errorCode);
    }

    public final void writeSynResetLater$okhttp(int i, ErrorCode errorCode) {
        C10202j.m34178b(errorCode, "errorCode");
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.writerExecutor;
        try {
            scheduledThreadPoolExecutor.execute(new Http2Connection$writeSynResetLater$$inlined$tryExecute$1("OkHttp " + this.connectionName + " stream " + i, this, i, errorCode));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void writeWindowUpdateLater$okhttp(int i, long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.writerExecutor;
        try {
            scheduledThreadPoolExecutor.execute(new Http2Connection$writeWindowUpdateLater$$inlined$tryExecute$1("OkHttp Window Update " + this.connectionName + " stream " + i, this, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final okhttp3.internal.http2.Http2Stream newStream(int r11, java.util.List<okhttp3.internal.http2.Header> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.Http2Writer r7 = r10.writer
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0088 }
            int r0 = r10.nextStreamId     // Catch:{ all -> 0x0085 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0085 }
            r10.shutdown(r0)     // Catch:{ all -> 0x0085 }
        L_0x0013:
            boolean r0 = r10.isShutdown     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x007f
            int r8 = r10.nextStreamId     // Catch:{ all -> 0x0085 }
            int r0 = r10.nextStreamId     // Catch:{ all -> 0x0085 }
            int r0 = r0 + 2
            r10.nextStreamId = r0     // Catch:{ all -> 0x0085 }
            okhttp3.internal.http2.Http2Stream r9 = new okhttp3.internal.http2.Http2Stream     // Catch:{ all -> 0x0085 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0085 }
            r0 = 1
            if (r13 == 0) goto L_0x0043
            long r1 = r10.writeBytesTotal     // Catch:{ all -> 0x0085 }
            long r3 = r10.writeBytesMaximum     // Catch:{ all -> 0x0085 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0043
            long r1 = r9.getWriteBytesTotal()     // Catch:{ all -> 0x0085 }
            long r3 = r9.getWriteBytesMaximum()     // Catch:{ all -> 0x0085 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r13 = 0
            goto L_0x0044
        L_0x0043:
            r13 = 1
        L_0x0044:
            boolean r1 = r9.isOpen()     // Catch:{ all -> 0x0085 }
            if (r1 == 0) goto L_0x0053
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.Http2Stream> r1 = r10.streams     // Catch:{ all -> 0x0085 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0085 }
            r1.put(r2, r9)     // Catch:{ all -> 0x0085 }
        L_0x0053:
            kotlin.v r1 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x0085 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            if (r11 != 0) goto L_0x005e
            okhttp3.internal.http2.Http2Writer r11 = r10.writer     // Catch:{ all -> 0x0088 }
            r11.headers(r6, r8, r12)     // Catch:{ all -> 0x0088 }
            goto L_0x0068
        L_0x005e:
            boolean r1 = r10.client     // Catch:{ all -> 0x0088 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0073
            okhttp3.internal.http2.Http2Writer r0 = r10.writer     // Catch:{ all -> 0x0088 }
            r0.pushPromise(r11, r8, r12)     // Catch:{ all -> 0x0088 }
        L_0x0068:
            kotlin.v r11 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x0088 }
            monitor-exit(r7)
            if (r13 == 0) goto L_0x0072
            okhttp3.internal.http2.Http2Writer r11 = r10.writer
            r11.flush()
        L_0x0072:
            return r9
        L_0x0073:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0088 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0088 }
            r12.<init>(r11)     // Catch:{ all -> 0x0088 }
            throw r12     // Catch:{ all -> 0x0088 }
        L_0x007f:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0085 }
            r11.<init>()     // Catch:{ all -> 0x0085 }
            throw r11     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            throw r11     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }
}
