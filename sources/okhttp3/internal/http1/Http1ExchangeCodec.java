package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import okhttp3.Address;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import p413s.C12892a0;
import p413s.C12894b0;
import p413s.C12905f;
import p413s.C12909g;
import p413s.C12910h;
import p413s.C12915l;
import p413s.C12932y;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 =2\u00020\u0001:\u0007:;<=>?@B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u0015H\u0016J\b\u0010!\u001a\u00020\u0018H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\fH\u0002J\b\u0010(\u001a\u00020\u0018H\u0002J\b\u0010)\u001a\u00020#H\u0002J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0013H\u0002J\u0012\u00100\u001a\u0004\u0018\u0001012\u0006\u00102\u001a\u00020\u000eH\u0016J\u0010\u00103\u001a\u00020\f2\u0006\u0010+\u001a\u00020,H\u0016J\u000e\u00104\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020.J\u0010\u00108\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\f\u00109\u001a\u00020\u000e*\u00020\u001aH\u0002J\f\u00109\u001a\u00020\u000e*\u00020,H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, mo16641d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "realConnection", "Lokhttp3/internal/connection/RealConnection;", "source", "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/RealConnection;Lokio/BufferedSource;Lokio/BufferedSink;)V", "headerLimit", "", "isClosed", "", "()Z", "state", "", "trailers", "Lokhttp3/Headers;", "cancel", "", "connection", "createRequestBody", "Lokio/Sink;", "request", "Lokhttp3/Request;", "contentLength", "detachTimeout", "timeout", "Lokio/ForwardingTimeout;", "finishRequest", "flushRequest", "newChunkedSink", "newChunkedSource", "Lokio/Source;", "url", "Lokhttp3/HttpUrl;", "newFixedLengthSource", "length", "newKnownLengthSink", "newUnknownLengthSource", "openResponseBodySource", "response", "Lokhttp3/Response;", "readHeaderLine", "", "readHeaders", "readResponseHeaders", "Lokhttp3/Response$Builder;", "expectContinue", "reportedContentLength", "skipConnectBody", "writeRequest", "headers", "requestLine", "writeRequestHeaders", "isChunked", "AbstractSource", "ChunkedSink", "ChunkedSource", "Companion", "FixedLengthSource", "KnownLengthSink", "UnknownLengthSource", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: Http1ExchangeCodec.kt */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int HEADER_LIMIT = 262144;
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    /* access modifiers changed from: private */
    public final OkHttpClient client;
    private long headerLimit = ((long) HEADER_LIMIT);
    /* access modifiers changed from: private */
    public final RealConnection realConnection;
    /* access modifiers changed from: private */
    public final C12909g sink;
    /* access modifiers changed from: private */
    public final C12910h source;
    /* access modifiers changed from: private */
    public int state;
    /* access modifiers changed from: private */
    public Headers trailers;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b¢\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\r\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\b\u0010\t\u001a\u00020\u0015H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, mo16641d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokio/Source;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "timeout", "Lokio/ForwardingTimeout;", "getTimeout", "()Lokio/ForwardingTimeout;", "read", "", "sink", "Lokio/Buffer;", "byteCount", "responseBodyComplete", "", "responseBodyComplete$okhttp", "Lokio/Timeout;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http1ExchangeCodec.kt */
    private abstract class AbstractSource implements C12892a0 {
        private boolean closed;
        private final C12915l timeout;

        public AbstractSource() {
            this.timeout = new C12915l(Http1ExchangeCodec.this.source.timeout());
        }

        /* access modifiers changed from: protected */
        public final boolean getClosed() {
            return this.closed;
        }

        /* access modifiers changed from: protected */
        public final C12915l getTimeout() {
            return this.timeout;
        }

        public long read(C12905f fVar, long j) {
            C10202j.m34178b(fVar, "sink");
            try {
                return Http1ExchangeCodec.this.source.read(fVar, j);
            } catch (IOException e) {
                RealConnection access$getRealConnection$p = Http1ExchangeCodec.this.realConnection;
                if (access$getRealConnection$p == null) {
                    C10202j.m34172a();
                    throw null;
                }
                access$getRealConnection$p.noNewExchanges();
                responseBodyComplete$okhttp();
                throw e;
            }
        }

        public final void responseBodyComplete$okhttp() {
            if (Http1ExchangeCodec.this.state != 6) {
                if (Http1ExchangeCodec.this.state == 5) {
                    Http1ExchangeCodec.this.detachTimeout(this.timeout);
                    Http1ExchangeCodec.this.state = 6;
                    return;
                }
                throw new IllegalStateException("state: " + Http1ExchangeCodec.this.state);
            }
        }

        /* access modifiers changed from: protected */
        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public C12894b0 timeout() {
            return this.timeout;
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0005\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo16641d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "Lokio/Sink;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "closed", "", "timeout", "Lokio/ForwardingTimeout;", "close", "", "flush", "Lokio/Timeout;", "write", "source", "Lokio/Buffer;", "byteCount", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http1ExchangeCodec.kt */
    private final class ChunkedSink implements C12932y {
        private boolean closed;
        private final C12915l timeout;

        public ChunkedSink() {
            this.timeout = new C12915l(Http1ExchangeCodec.this.sink.timeout());
        }

        public synchronized void close() {
            if (!this.closed) {
                this.closed = true;
                Http1ExchangeCodec.this.sink.mo41155b("0\r\n\r\n");
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 3;
            }
        }

        public synchronized void flush() {
            if (!this.closed) {
                Http1ExchangeCodec.this.sink.flush();
            }
        }

        public C12894b0 timeout() {
            return this.timeout;
        }

        public void write(C12905f fVar, long j) {
            C10202j.m34178b(fVar, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            } else if (j != 0) {
                Http1ExchangeCodec.this.sink.mo41160c(j);
                Http1ExchangeCodec.this.sink.mo41155b("\r\n");
                Http1ExchangeCodec.this.sink.write(fVar, j);
                Http1ExchangeCodec.this.sink.mo41155b("\r\n");
            }
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo16641d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "url", "Lokhttp3/HttpUrl;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V", "bytesRemainingInChunk", "", "hasMoreChunks", "", "close", "", "read", "sink", "Lokio/Buffer;", "byteCount", "readChunkSize", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http1ExchangeCodec.kt */
    private final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk = -1;
        private boolean hasMoreChunks = true;
        final /* synthetic */ Http1ExchangeCodec this$0;
        private final HttpUrl url;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super();
            C10202j.m34178b(httpUrl, "url");
            this.this$0 = http1ExchangeCodec;
            this.url = httpUrl;
        }

        private final void readChunkSize() {
            if (this.bytesRemainingInChunk != -1) {
                this.this$0.source.mo41184n();
            }
            try {
                this.bytesRemainingInChunk = this.this$0.source.mo41187r();
                String n = this.this$0.source.mo41184n();
                if (n != null) {
                    String obj = C12131w.m40115f(n).toString();
                    if (this.bytesRemainingInChunk >= 0) {
                        if (!(obj.length() > 0) || C12130v.m40056c(obj, ";", false, 2, (Object) null)) {
                            if (this.bytesRemainingInChunk == 0) {
                                this.hasMoreChunks = false;
                                Http1ExchangeCodec http1ExchangeCodec = this.this$0;
                                http1ExchangeCodec.trailers = http1ExchangeCodec.readHeaders();
                                OkHttpClient access$getClient$p = this.this$0.client;
                                if (access$getClient$p != null) {
                                    CookieJar cookieJar = access$getClient$p.cookieJar();
                                    HttpUrl httpUrl = this.url;
                                    Headers access$getTrailers$p = this.this$0.trailers;
                                    if (access$getTrailers$p != null) {
                                        HttpHeaders.receiveHeaders(cookieJar, httpUrl, access$getTrailers$p);
                                        responseBodyComplete$okhttp();
                                        return;
                                    }
                                    C10202j.m34172a();
                                    throw null;
                                }
                                C10202j.m34172a();
                                throw null;
                            }
                            return;
                        }
                    }
                    throw new ProtocolException("expected chunk size and optional extensions" + " but was \"" + this.bytesRemainingInChunk + obj + '\"');
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() {
            if (!getClosed()) {
                if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    RealConnection access$getRealConnection$p = this.this$0.realConnection;
                    if (access$getRealConnection$p != null) {
                        access$getRealConnection$p.noNewExchanges();
                        responseBodyComplete$okhttp();
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                }
                setClosed(true);
            }
        }

        public long read(C12905f fVar, long j) {
            C10202j.m34178b(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(true ^ getClosed())) {
                throw new IllegalStateException("closed".toString());
            } else if (!this.hasMoreChunks) {
                return -1;
            } else {
                long j2 = this.bytesRemainingInChunk;
                if (j2 == 0 || j2 == -1) {
                    readChunkSize();
                    if (!this.hasMoreChunks) {
                        return -1;
                    }
                }
                long read = super.read(fVar, Math.min(j, this.bytesRemainingInChunk));
                if (read == -1) {
                    RealConnection access$getRealConnection$p = this.this$0.realConnection;
                    if (access$getRealConnection$p == null) {
                        C10202j.m34172a();
                        throw null;
                    }
                    access$getRealConnection$p.noNewExchanges();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete$okhttp();
                    throw protocolException;
                }
                this.bytesRemainingInChunk -= read;
                return read;
            }
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo16641d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;", "", "()V", "HEADER_LIMIT", "", "NO_CHUNK_YET", "", "STATE_CLOSED", "STATE_IDLE", "STATE_OPEN_REQUEST_BODY", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_WRITING_REQUEST_BODY", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http1ExchangeCodec.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, mo16641d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "bytesRemaining", "", "(Lokhttp3/internal/http1/Http1ExchangeCodec;J)V", "close", "", "read", "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http1ExchangeCodec.kt */
    private final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete$okhttp();
            }
        }

        public void close() {
            if (!getClosed()) {
                if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    RealConnection access$getRealConnection$p = Http1ExchangeCodec.this.realConnection;
                    if (access$getRealConnection$p != null) {
                        access$getRealConnection$p.noNewExchanges();
                        responseBodyComplete$okhttp();
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                }
                setClosed(true);
            }
        }

        public long read(C12905f fVar, long j) {
            C10202j.m34178b(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (true ^ getClosed()) {
                long j2 = this.bytesRemaining;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(fVar, Math.min(j2, j));
                if (read == -1) {
                    RealConnection access$getRealConnection$p = Http1ExchangeCodec.this.realConnection;
                    if (access$getRealConnection$p == null) {
                        C10202j.m34172a();
                        throw null;
                    }
                    access$getRealConnection$p.noNewExchanges();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete$okhttp();
                    throw protocolException;
                }
                long j3 = this.bytesRemaining - read;
                this.bytesRemaining = j3;
                if (j3 == 0) {
                    responseBodyComplete$okhttp();
                }
                return read;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0005\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo16641d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "Lokio/Sink;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "closed", "", "timeout", "Lokio/ForwardingTimeout;", "close", "", "flush", "Lokio/Timeout;", "write", "source", "Lokio/Buffer;", "byteCount", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http1ExchangeCodec.kt */
    private final class KnownLengthSink implements C12932y {
        private boolean closed;
        private final C12915l timeout;

        public KnownLengthSink() {
            this.timeout = new C12915l(Http1ExchangeCodec.this.sink.timeout());
        }

        public void close() {
            if (!this.closed) {
                this.closed = true;
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 3;
            }
        }

        public void flush() {
            if (!this.closed) {
                Http1ExchangeCodec.this.sink.flush();
            }
        }

        public C12894b0 timeout() {
            return this.timeout;
        }

        public void write(C12905f fVar, long j) {
            C10202j.m34178b(fVar, "source");
            if (!this.closed) {
                Util.checkOffsetAndCount(fVar.size(), 0, j);
                Http1ExchangeCodec.this.sink.write(fVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, mo16641d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "(Lokhttp3/internal/http1/Http1ExchangeCodec;)V", "inputExhausted", "", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Http1ExchangeCodec.kt */
    private final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        public void close() {
            if (!getClosed()) {
                if (!this.inputExhausted) {
                    responseBodyComplete$okhttp();
                }
                setClosed(true);
            }
        }

        public long read(C12905f fVar, long j) {
            C10202j.m34178b(fVar, "sink");
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
            } else if (!(!getClosed())) {
                throw new IllegalStateException("closed".toString());
            } else if (this.inputExhausted) {
                return -1;
            } else {
                long read = super.read(fVar, j);
                if (read != -1) {
                    return read;
                }
                this.inputExhausted = true;
                responseBodyComplete$okhttp();
                return -1;
            }
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection2, C12910h hVar, C12909g gVar) {
        C10202j.m34178b(hVar, "source");
        C10202j.m34178b(gVar, "sink");
        this.client = okHttpClient;
        this.realConnection = realConnection2;
        this.source = hVar;
        this.sink = gVar;
    }

    /* access modifiers changed from: private */
    public final void detachTimeout(C12915l lVar) {
        C12894b0 a = lVar.mo41256a();
        lVar.mo41257a(C12894b0.NONE);
        a.clearDeadline();
        a.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return C12130v.m40053b("chunked", Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true);
    }

    private final C12932y newChunkedSink() {
        boolean z = true;
        if (this.state != 1) {
            z = false;
        }
        if (z) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final C12892a0 newChunkedSource(HttpUrl httpUrl) {
        if (this.state == 4) {
            this.state = 5;
            return new ChunkedSource(this, httpUrl);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final C12892a0 newFixedLengthSource(long j) {
        if (this.state == 4) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final C12932y newKnownLengthSink() {
        boolean z = true;
        if (this.state != 1) {
            z = false;
        }
        if (z) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final C12892a0 newUnknownLengthSource() {
        if (this.state == 4) {
            this.state = 5;
            RealConnection realConnection2 = this.realConnection;
            if (realConnection2 != null) {
                realConnection2.noNewExchanges();
                return new UnknownLengthSource();
            }
            C10202j.m34172a();
            throw null;
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    private final String readHeaderLine() {
        String b = this.source.mo41154b(this.headerLimit);
        this.headerLimit -= (long) b.length();
        return b;
    }

    /* access modifiers changed from: private */
    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        String readHeaderLine = readHeaderLine();
        while (true) {
            if (!(readHeaderLine.length() > 0)) {
                return builder.build();
            }
            builder.addLenient$okhttp(readHeaderLine);
            readHeaderLine = readHeaderLine();
        }
    }

    public void cancel() {
        RealConnection realConnection2 = this.realConnection;
        if (realConnection2 != null) {
            realConnection2.cancel();
        }
    }

    public RealConnection connection() {
        return this.realConnection;
    }

    public C12932y createRequestBody(Request request, long j) {
        C10202j.m34178b(request, "request");
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        } else if (isChunked(request)) {
            return newChunkedSink();
        } else {
            if (j != -1) {
                return newKnownLengthSink();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public void finishRequest() {
        this.sink.flush();
    }

    public void flushRequest() {
        this.sink.flush();
    }

    public final boolean isClosed() {
        return this.state == 6;
    }

    public C12892a0 openResponseBodySource(Response response) {
        C10202j.m34178b(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            return newFixedLengthSource(headersContentLength);
        }
        return newUnknownLengthSource();
    }

    public Response.Builder readResponseHeaders(boolean z) {
        String str;
        Route route;
        Address address;
        HttpUrl url;
        int i = this.state;
        boolean z2 = true;
        if (!(i == 1 || i == 3)) {
            z2 = false;
        }
        if (z2) {
            try {
                StatusLine parse = StatusLine.Companion.parse(readHeaderLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                RealConnection realConnection2 = this.realConnection;
                if (realConnection2 == null || (route = realConnection2.route()) == null || (address = route.address()) == null || (url = address.url()) == null || (str = url.redact()) == null) {
                    str = "unknown";
                }
                throw new IOException("unexpected end of stream on " + str, e);
            }
        } else {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
    }

    public long reportedContentLength(Response response) {
        C10202j.m34178b(response, "response");
        if (!HttpHeaders.promisesBody(response)) {
            return 0;
        }
        if (isChunked(response)) {
            return -1;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        C10202j.m34178b(response, "response");
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != -1) {
            C12892a0 newFixedLengthSource = newFixedLengthSource(headersContentLength);
            Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
        }
    }

    public Headers trailers() {
        if (this.state == 6) {
            Headers headers = this.trailers;
            return headers != null ? headers : Util.EMPTY_HEADERS;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }

    public final void writeRequest(Headers headers, String str) {
        C10202j.m34178b(headers, "headers");
        C10202j.m34178b(str, "requestLine");
        if (this.state == 0) {
            this.sink.mo41155b(str).mo41155b("\r\n");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                this.sink.mo41155b(headers.name(i)).mo41155b(": ").mo41155b(headers.value(i)).mo41155b("\r\n");
            }
            this.sink.mo41155b("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    public void writeRequestHeaders(Request request) {
        C10202j.m34178b(request, "request");
        RequestLine requestLine = RequestLine.INSTANCE;
        RealConnection realConnection2 = this.realConnection;
        if (realConnection2 != null) {
            Proxy.Type type = realConnection2.route().proxy().type();
            C10202j.m34174a((Object) type, "realConnection!!.route().proxy.type()");
            writeRequest(request.headers(), requestLine.get(request, type));
            return;
        }
        C10202j.m34172a();
        throw null;
    }

    private final boolean isChunked(Request request) {
        return C12130v.m40053b("chunked", request.header("Transfer-Encoding"), true);
    }
}
