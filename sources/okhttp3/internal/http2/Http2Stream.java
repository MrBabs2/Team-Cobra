package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.C10483v;
import kotlin.C10485x;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import okhttp3.Headers;
import okhttp3.internal.Util;
import p413s.C12892a0;
import p413s.C12894b0;
import p413s.C12899d;
import p413s.C12905f;
import p413s.C12910h;
import p413s.C12932y;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 _2\u00020\u0001:\u0004_`abB1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020#J\r\u0010C\u001a\u00020AH\u0000¢\u0006\u0002\bDJ\r\u0010E\u001a\u00020AH\u0000¢\u0006\u0002\bFJ\u0018\u0010G\u001a\u00020A2\u0006\u0010H\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001a\u0010I\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010J\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010K\u001a\u00020A2\u0006\u0010L\u001a\u00020\nJ\u0006\u0010M\u001a\u00020NJ\u0006\u0010O\u001a\u00020PJ\u0006\u0010,\u001a\u00020QJ\u0016\u0010R\u001a\u00020A2\u0006\u00104\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0003J\u0016\u0010U\u001a\u00020A2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010V\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010W\u001a\u00020\nJ\u0006\u0010L\u001a\u00020\nJ\r\u0010X\u001a\u00020AH\u0000¢\u0006\u0002\bYJ$\u0010Z\u001a\u00020A2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u0007J\u0006\u0010>\u001a\u00020QR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u0018\u0010,\u001a\u00060-R\u00020\u0000X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u00100\u001a\u000601R\u00020\u0000X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u00104\u001a\u000605R\u00020\u0000X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R$\u00108\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R$\u0010;\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(R\u0018\u0010>\u001a\u00060-R\u00020\u0000X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/¨\u0006c"}, mo16641d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "id", "", "connection", "Lokhttp3/internal/http2/Http2Connection;", "outFinished", "", "inFinished", "headers", "Lokhttp3/Headers;", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "errorException", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "hasResponseHeaders", "headersQueue", "Ljava/util/ArrayDeque;", "getId", "()I", "isLocallyInitiated", "()Z", "isOpen", "<set-?>", "", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "setReadBytesAcknowledged$okhttp", "(J)V", "readBytesTotal", "getReadBytesTotal", "setReadBytesTotal$okhttp", "readTimeout", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "source", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeTimeout", "getWriteTimeout$okhttp", "addBytesToWriteWindow", "", "delta", "cancelStreamIfNecessary", "cancelStreamIfNecessary$okhttp", "checkOutNotClosed", "checkOutNotClosed$okhttp", "close", "rstStatusCode", "closeInternal", "closeLater", "enqueueTrailers", "trailers", "getSink", "Lokio/Sink;", "getSource", "Lokio/Source;", "Lokio/Timeout;", "receiveData", "Lokio/BufferedSource;", "length", "receiveHeaders", "receiveRstStream", "takeHeaders", "waitForIo", "waitForIo$okhttp", "writeHeaders", "responseHeaders", "", "Lokhttp3/internal/http2/Header;", "flushHeaders", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: Http2Stream.kt */
public final class Http2Stream {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue = new ArrayDeque<>();

    /* renamed from: id */
    private final int f32159id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo16641d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http2Stream.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u001d\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, mo16641d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "maxByteCount", "", "finished", "", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getFinished$okhttp", "setFinished$okhttp", "readBuffer", "Lokio/Buffer;", "getReadBuffer", "()Lokio/Buffer;", "receiveBuffer", "getReceiveBuffer", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", "", "read", "sink", "byteCount", "receive", "source", "Lokio/BufferedSource;", "receive$okhttp", "timeout", "Lokio/Timeout;", "updateConnectionFlowControl", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http2Stream.kt */
    public final class FramingSource implements C12892a0 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final C12905f readBuffer = new C12905f();
        private final C12905f receiveBuffer = new C12905f();
        private Headers trailers;

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        private final void updateConnectionFlowControl(long j) {
            boolean z = !Thread.holdsLock(Http2Stream.this);
            if (!C10485x.f28360a || z) {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j);
                return;
            }
            throw new AssertionError("Assertion failed");
        }

        public void close() throws IOException {
            long size;
            synchronized (Http2Stream.this) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.mo41157b();
                Http2Stream http2Stream = Http2Stream.this;
                if (http2Stream != null) {
                    http2Stream.notifyAll();
                    C10483v vVar = C10483v.f28357a;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final C12905f getReadBuffer() {
            return this.readBuffer;
        }

        public final C12905f getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX INFO: finally extract failed */
        public long read(C12905f fVar, long j) throws IOException {
            Throwable th;
            boolean z;
            long j2;
            C12905f fVar2 = fVar;
            long j3 = j;
            C10202j.m34178b(fVar2, "sink");
            long j4 = 0;
            if (j3 >= 0) {
                while (true) {
                    synchronized (Http2Stream.this) {
                        Http2Stream.this.getReadTimeout$okhttp().enter();
                        try {
                            if (Http2Stream.this.getErrorCode$okhttp() != null) {
                                th = Http2Stream.this.getErrorException$okhttp();
                                if (th == null) {
                                    ErrorCode errorCode$okhttp = Http2Stream.this.getErrorCode$okhttp();
                                    if (errorCode$okhttp != null) {
                                        th = new StreamResetException(errorCode$okhttp);
                                    } else {
                                        C10202j.m34172a();
                                        throw null;
                                    }
                                }
                            } else {
                                th = null;
                            }
                            if (!this.closed) {
                                if (this.readBuffer.size() > j4) {
                                    j2 = this.readBuffer.read(fVar2, Math.min(j3, this.readBuffer.size()));
                                    Http2Stream http2Stream = Http2Stream.this;
                                    http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j2);
                                    long readBytesTotal = Http2Stream.this.getReadBytesTotal() - Http2Stream.this.getReadBytesAcknowledged();
                                    if (th == null && readBytesTotal >= ((long) (Http2Stream.this.getConnection().getOkHttpSettings().getInitialWindowSize() / 2))) {
                                        Http2Stream.this.getConnection().writeWindowUpdateLater$okhttp(Http2Stream.this.getId(), readBytesTotal);
                                        Http2Stream.this.setReadBytesAcknowledged$okhttp(Http2Stream.this.getReadBytesTotal());
                                    }
                                } else if (this.finished || th != null) {
                                    j2 = -1;
                                } else {
                                    Http2Stream.this.waitForIo$okhttp();
                                    j2 = -1;
                                    z = true;
                                    Http2Stream.this.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                                    C10483v vVar = C10483v.f28357a;
                                }
                                z = false;
                                Http2Stream.this.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                                C10483v vVar2 = C10483v.f28357a;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } catch (Throwable th2) {
                            Http2Stream.this.getReadTimeout$okhttp().exitAndThrowIfTimedOut();
                            throw th2;
                        }
                    }
                    if (z) {
                        j4 = 0;
                    } else if (j2 != -1) {
                        updateConnectionFlowControl(j2);
                        return j2;
                    } else if (th == null) {
                        return -1;
                    } else {
                        if (th == null) {
                            C10202j.m34172a();
                            throw null;
                        }
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
            }
        }

        public final void receive$okhttp(C12910h hVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            C10202j.m34178b(hVar, "source");
            boolean z4 = !Thread.holdsLock(Http2Stream.this);
            if (!C10485x.f28360a || z4) {
                while (j > 0) {
                    synchronized (Http2Stream.this) {
                        z = this.finished;
                        z2 = false;
                        z3 = this.readBuffer.size() + j > this.maxByteCount;
                        C10483v vVar = C10483v.f28357a;
                    }
                    if (z3) {
                        hVar.skip(j);
                        Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        hVar.skip(j);
                        return;
                    } else {
                        long read = hVar.read(this.receiveBuffer, j);
                        if (read != -1) {
                            j -= read;
                            synchronized (Http2Stream.this) {
                                if (this.closed) {
                                    j2 = this.receiveBuffer.size();
                                    this.receiveBuffer.mo41157b();
                                } else {
                                    if (this.readBuffer.size() == 0) {
                                        z2 = true;
                                    }
                                    this.readBuffer.mo41135a((C12892a0) this.receiveBuffer);
                                    if (z2) {
                                        Http2Stream http2Stream = Http2Stream.this;
                                        if (http2Stream != null) {
                                            http2Stream.notifyAll();
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                    j2 = 0;
                                }
                                C10483v vVar2 = C10483v.f28357a;
                            }
                            if (j2 > 0) {
                                updateConnectionFlowControl(j2);
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            throw new AssertionError("Assertion failed");
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public C12894b0 timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\t"}, mo16641d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "(Lokhttp3/internal/http2/Http2Stream;)V", "exitAndThrowIfTimedOut", "", "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http2Stream.kt */
    public final class StreamTimeout extends C12899d {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException((IOException) null);
            }
        }

        /* access modifiers changed from: protected */
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        C10202j.m34178b(http2Connection, "connection");
        this.f32159id = i;
        this.connection = http2Connection;
        this.writeBytesMaximum = (long) http2Connection.getPeerSettings().getInitialWindowSize();
        this.source = new FramingSource((long) this.connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!isLocallyInitiated()) {
                this.headersQueue.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!isLocallyInitiated()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    private final boolean closeInternal(ErrorCode errorCode2, IOException iOException) {
        boolean z = !Thread.holdsLock(this);
        if (!C10485x.f28360a || z) {
            synchronized (this) {
                if (this.errorCode != null) {
                    return false;
                }
                if (this.source.getFinished$okhttp() && this.sink.getFinished()) {
                    return false;
                }
                this.errorCode = errorCode2;
                this.errorException = iOException;
                notifyAll();
                C10483v vVar = C10483v.f28357a;
                this.connection.removeStream$okhttp(this.f32159id);
                return true;
            }
        }
        throw new AssertionError("Assertion failed");
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean isOpen;
        boolean z = true;
        boolean z2 = !Thread.holdsLock(this);
        if (!C10485x.f28360a || z2) {
            synchronized (this) {
                if (!this.source.getFinished$okhttp() && this.source.getClosed$okhttp()) {
                    if (!this.sink.getFinished()) {
                        if (this.sink.getClosed()) {
                        }
                    }
                    isOpen = isOpen();
                    C10483v vVar = C10483v.f28357a;
                }
                z = false;
                isOpen = isOpen();
                C10483v vVar2 = C10483v.f28357a;
            }
            if (z) {
                close(ErrorCode.CANCEL, (IOException) null);
            } else if (!isOpen) {
                this.connection.removeStream$okhttp(this.f32159id);
            }
        } else {
            throw new AssertionError("Assertion failed");
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        } else if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        } else if (this.errorCode != null) {
            Throwable th = this.errorException;
            if (th == null) {
                ErrorCode errorCode2 = this.errorCode;
                if (errorCode2 == null) {
                    C10202j.m34172a();
                    throw null;
                }
                th = new StreamResetException(errorCode2);
            }
            throw th;
        }
    }

    public final void close(ErrorCode errorCode2, IOException iOException) throws IOException {
        C10202j.m34178b(errorCode2, "rstStatusCode");
        if (closeInternal(errorCode2, iOException)) {
            this.connection.writeSynReset$okhttp(this.f32159id, errorCode2);
        }
    }

    public final void closeLater(ErrorCode errorCode2) {
        C10202j.m34178b(errorCode2, "errorCode");
        if (closeInternal(errorCode2, (IOException) null)) {
            this.connection.writeSynResetLater$okhttp(this.f32159id, errorCode2);
        }
    }

    public final void enqueueTrailers(Headers headers) {
        C10202j.m34178b(headers, "trailers");
        synchronized (this) {
            boolean z = true;
            if (!this.sink.getFinished()) {
                if (headers.size() == 0) {
                    z = false;
                }
                if (z) {
                    this.sink.setTrailers(headers);
                    C10483v vVar = C10483v.f28357a;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0".toString());
                }
            } else {
                throw new IllegalStateException("already finished".toString());
            }
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.f32159id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p413s.C12932y getSink() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x000e
            boolean r0 = r2.isLocallyInitiated()     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            kotlin.v r0 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            return r0
        L_0x0017:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ all -> 0x0023 }
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.getSink():s.y");
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final C12892a0 getSource() {
        return this.source;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        if (this.connection.getClient$okhttp() == ((this.f32159id & 1) == 1)) {
            return true;
        }
        return false;
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) && ((this.sink.getFinished() || this.sink.getClosed()) && this.hasResponseHeaders)) {
            return false;
        }
        return true;
    }

    public final C12894b0 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(C12910h hVar, int i) throws IOException {
        C10202j.m34178b(hVar, "source");
        boolean z = !Thread.holdsLock(this);
        if (!C10485x.f28360a || z) {
            this.source.receive$okhttp(hVar, (long) i);
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void receiveHeaders(okhttp3.Headers r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)
            boolean r0 = java.lang.Thread.holdsLock(r3)
            r1 = 1
            r0 = r0 ^ r1
            boolean r2 = kotlin.C10485x.f28360a
            if (r2 == 0) goto L_0x001a
            if (r0 == 0) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = "Assertion failed"
            r4.<init>(r5)
            throw r4
        L_0x001a:
            monitor-enter(r3)
            boolean r0 = r3.hasResponseHeaders     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0028
            if (r5 != 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r3.source     // Catch:{ all -> 0x004a }
            r0.setTrailers(r4)     // Catch:{ all -> 0x004a }
            goto L_0x002f
        L_0x0028:
            r3.hasResponseHeaders = r1     // Catch:{ all -> 0x004a }
            java.util.ArrayDeque<okhttp3.Headers> r0 = r3.headersQueue     // Catch:{ all -> 0x004a }
            r0.add(r4)     // Catch:{ all -> 0x004a }
        L_0x002f:
            if (r5 == 0) goto L_0x0036
            okhttp3.internal.http2.Http2Stream$FramingSource r4 = r3.source     // Catch:{ all -> 0x004a }
            r4.setFinished$okhttp(r1)     // Catch:{ all -> 0x004a }
        L_0x0036:
            boolean r4 = r3.isOpen()     // Catch:{ all -> 0x004a }
            r3.notifyAll()     // Catch:{ all -> 0x004a }
            kotlin.v r5 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x004a }
            monitor-exit(r3)
            if (r4 != 0) goto L_0x0049
            okhttp3.internal.http2.Http2Connection r4 = r3.connection
            int r5 = r3.f32159id
            r4.removeStream$okhttp(r5)
        L_0x0049:
            return
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode2) {
        C10202j.m34178b(errorCode2, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode2;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode2) {
        this.errorCode = errorCode2;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        r2.readTimeout.exitAndThrowIfTimedOut();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.Headers takeHeaders() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch:{ all -> 0x004e }
            r0.enter()     // Catch:{ all -> 0x004e }
        L_0x0006:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0016
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0016
            r2.waitForIo$okhttp()     // Catch:{ all -> 0x0047 }
            goto L_0x0006
        L_0x0016:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch:{ all -> 0x004e }
            r0.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x004e }
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x004e }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004e }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0034
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.removeFirst()     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "headersQueue.removeFirst()"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)     // Catch:{ all -> 0x004e }
            okhttp3.Headers r0 = (okhttp3.Headers) r0     // Catch:{ all -> 0x004e }
            monitor-exit(r2)
            return r0
        L_0x0034:
            java.io.IOException r0 = r2.errorException     // Catch:{ all -> 0x004e }
            if (r0 != 0) goto L_0x0046
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x004e }
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0043
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x004e }
            r0 = 0
            throw r0
        L_0x0043:
            r0.<init>(r1)     // Catch:{ all -> 0x004e }
        L_0x0046:
            throw r0     // Catch:{ all -> 0x004e }
        L_0x0047:
            r0 = move-exception
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch:{ all -> 0x004e }
            r1.exitAndThrowIfTimedOut()     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0052
        L_0x0051:
            throw r0
        L_0x0052:
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.takeHeaders():okhttp3.Headers");
    }

    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (this.errorCode != null) {
            Throwable th = this.errorException;
            if (th == null) {
                ErrorCode errorCode2 = this.errorCode;
                if (errorCode2 == null) {
                    C10202j.m34172a();
                    throw null;
                }
                th = new StreamResetException(errorCode2);
            }
            throw th;
        }
        if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().mo41169g() && this.source.getReadBuffer().mo41169g()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = Util.EMPTY_HEADERS;
            }
        } else {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> list, boolean z, boolean z2) throws IOException {
        boolean z3;
        C10202j.m34178b(list, "responseHeaders");
        boolean z4 = !Thread.holdsLock(this);
        if (!C10485x.f28360a || z4) {
            synchronized (this) {
                this.hasResponseHeaders = true;
                if (z) {
                    this.sink.setFinished(true);
                }
                C10483v vVar = C10483v.f28357a;
            }
            if (!z2) {
                synchronized (this.connection) {
                    z3 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
                    C10483v vVar2 = C10483v.f28357a;
                }
                z2 = z3;
            }
            this.connection.writeHeaders$okhttp(this.f32159id, z, list);
            if (z2) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    public final C12894b0 writeTimeout() {
        return this.writeTimeout;
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, mo16641d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "finished", "", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "closed", "getClosed", "()Z", "setClosed", "(Z)V", "getFinished", "setFinished", "sendBuffer", "Lokio/Buffer;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", "", "emitFrame", "outFinishedOnLastFrame", "flush", "timeout", "Lokio/Timeout;", "write", "source", "byteCount", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http2Stream.kt */
    public final class FramingSink implements C12932y {
        private boolean closed;
        private boolean finished;
        private final C12905f sendBuffer;
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new C12905f();
        }

        /* JADX INFO: finally extract failed */
        private final void emitFrame(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (Http2Stream.this) {
                Http2Stream.this.getWriteTimeout$okhttp().enter();
                while (Http2Stream.this.getWriteBytesTotal() >= Http2Stream.this.getWriteBytesMaximum() && !this.finished && !this.closed && Http2Stream.this.getErrorCode$okhttp() == null) {
                    try {
                        Http2Stream.this.waitForIo$okhttp();
                    } catch (Throwable th) {
                        Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed$okhttp();
                min = Math.min(Http2Stream.this.getWriteBytesMaximum() - Http2Stream.this.getWriteBytesTotal(), this.sendBuffer.size());
                Http2Stream http2Stream = Http2Stream.this;
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                z2 = z && min == this.sendBuffer.size() && Http2Stream.this.getErrorCode$okhttp() == null;
                C10483v vVar = C10483v.f28357a;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z2, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
            if (r8.this$0.getSink$okhttp().finished != false) goto L_0x00a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
            if (r8.sendBuffer.size() <= 0) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
            if (r8.trailers == null) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
            if (r4 == false) goto L_0x007c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
            if (r8.sendBuffer.size() <= 0) goto L_0x005f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
            emitFrame(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
            r0 = r8.this$0.getConnection();
            r3 = r8.this$0.getId();
            r4 = r8.trailers;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
            if (r4 == null) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
            r0.writeHeaders$okhttp(r3, r2, okhttp3.internal.Util.toHeaderList(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
            kotlin.jvm.internal.C10202j.m34172a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x007b, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x007c, code lost:
            if (r0 == false) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
            if (r8.sendBuffer.size() <= 0) goto L_0x00a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0088, code lost:
            emitFrame(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x008c, code lost:
            if (r2 == false) goto L_0x00a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x008e, code lost:
            r8.this$0.getConnection().writeData(r8.this$0.getId(), true, (p413s.C12905f) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a1, code lost:
            r0 = r8.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a3, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            r8.closed = true;
            r1 = kotlin.C10483v.f28357a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a8, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a9, code lost:
            r8.this$0.getConnection().flush();
            r8.this$0.cancelStreamIfNecessary$okhttp();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b7, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                boolean r0 = java.lang.Thread.holdsLock(r0)
                r1 = 1
                r0 = r0 ^ r1
                boolean r2 = kotlin.C10485x.f28360a
                if (r2 == 0) goto L_0x0017
                if (r0 == 0) goto L_0x000f
                goto L_0x0017
            L_0x000f:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "Assertion failed"
                r0.<init>(r1)
                throw r0
            L_0x0017:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                boolean r2 = r8.closed     // Catch:{ all -> 0x00bb }
                if (r2 == 0) goto L_0x0020
                monitor-exit(r0)
                return
            L_0x0020:
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x00bb }
                okhttp3.internal.http2.ErrorCode r2 = r2.getErrorCode$okhttp()     // Catch:{ all -> 0x00bb }
                r3 = 0
                if (r2 != 0) goto L_0x002b
                r2 = 1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                kotlin.v r4 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x00bb }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.getSink$okhttp()
                boolean r0 = r0.finished
                if (r0 != 0) goto L_0x00a1
                s.f r0 = r8.sendBuffer
                long r4 = r0.size()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0047
                r0 = 1
                goto L_0x0048
            L_0x0047:
                r0 = 0
            L_0x0048:
                okhttp3.Headers r4 = r8.trailers
                if (r4 == 0) goto L_0x004e
                r4 = 1
                goto L_0x004f
            L_0x004e:
                r4 = 0
            L_0x004f:
                if (r4 == 0) goto L_0x007c
            L_0x0051:
                s.f r0 = r8.sendBuffer
                long r4 = r0.size()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x005f
                r8.emitFrame(r3)
                goto L_0x0051
            L_0x005f:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r3 = okhttp3.internal.http2.Http2Stream.this
                int r3 = r3.getId()
                okhttp3.Headers r4 = r8.trailers
                if (r4 == 0) goto L_0x0077
                java.util.List r4 = okhttp3.internal.Util.toHeaderList(r4)
                r0.writeHeaders$okhttp(r3, r2, r4)
                goto L_0x00a1
            L_0x0077:
                kotlin.jvm.internal.C10202j.m34172a()
                r0 = 0
                throw r0
            L_0x007c:
                if (r0 == 0) goto L_0x008c
            L_0x007e:
                s.f r0 = r8.sendBuffer
                long r2 = r0.size()
                int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x00a1
                r8.emitFrame(r1)
                goto L_0x007e
            L_0x008c:
                if (r2 == 0) goto L_0x00a1
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r2 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                int r3 = r0.getId()
                r4 = 1
                r5 = 0
                r6 = 0
                r2.writeData(r3, r4, r5, r6)
            L_0x00a1:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                r8.closed = r1     // Catch:{ all -> 0x00b8 }
                kotlin.v r1 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x00b8 }
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                r0.cancelStreamIfNecessary$okhttp()
                return
            L_0x00b8:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x00bb:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x00bf
            L_0x00be:
                throw r1
            L_0x00bf:
                goto L_0x00be
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
        }

        public void flush() throws IOException {
            boolean z = !Thread.holdsLock(Http2Stream.this);
            if (!C10485x.f28360a || z) {
                synchronized (Http2Stream.this) {
                    Http2Stream.this.checkOutNotClosed$okhttp();
                    C10483v vVar = C10483v.f28357a;
                }
                while (this.sendBuffer.size() > 0) {
                    emitFrame(false);
                    Http2Stream.this.getConnection().flush();
                }
                return;
            }
            throw new AssertionError("Assertion failed");
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        public C12894b0 timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        public void write(C12905f fVar, long j) throws IOException {
            C10202j.m34178b(fVar, "source");
            boolean z = !Thread.holdsLock(Http2Stream.this);
            if (!C10485x.f28360a || z) {
                this.sendBuffer.write(fVar, j);
                while (this.sendBuffer.size() >= Http2Stream.EMIT_BUFFER_SIZE) {
                    emitFrame(false);
                }
                return;
            }
            throw new AssertionError("Assertion failed");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
