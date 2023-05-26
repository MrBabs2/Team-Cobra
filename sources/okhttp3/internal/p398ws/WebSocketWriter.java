package okhttp3.internal.p398ws;

import java.io.IOException;
import java.util.Random;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p413s.C12894b0;
import p413s.C12905f;
import p413s.C12909g;
import p413s.C12911i;
import p413s.C12932y;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u00012B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!2\b\u0010'\u001a\u0004\u0018\u00010(J\u0018\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020(H\u0002J&\u0010,\u001a\u00020%2\u0006\u0010 \u001a\u00020!2\u0006\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0003J\u000e\u00100\u001a\u00020%2\u0006\u0010+\u001a\u00020(J\u000e\u00101\u001a\u00020%2\u0006\u0010+\u001a\u00020(R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, mo16641d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "", "isClient", "", "sink", "Lokio/BufferedSink;", "random", "Ljava/util/Random;", "(ZLokio/BufferedSink;Ljava/util/Random;)V", "activeWriter", "getActiveWriter", "()Z", "setActiveWriter", "(Z)V", "buffer", "Lokio/Buffer;", "getBuffer", "()Lokio/Buffer;", "frameSink", "Lokhttp3/internal/ws/WebSocketWriter$FrameSink;", "maskCursor", "Lokio/Buffer$UnsafeCursor;", "maskKey", "", "getRandom", "()Ljava/util/Random;", "getSink", "()Lokio/BufferedSink;", "sinkBuffer", "writerClosed", "newMessageSink", "Lokio/Sink;", "formatOpcode", "", "contentLength", "", "writeClose", "", "code", "reason", "Lokio/ByteString;", "writeControlFrame", "opcode", "payload", "writeMessageFrame", "byteCount", "isFirstFrame", "isFinal", "writePing", "writePong", "FrameSink", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: okhttp3.internal.ws.WebSocketWriter */
/* compiled from: WebSocketWriter.kt */
public final class WebSocketWriter {
    private boolean activeWriter;
    private final C12905f buffer = new C12905f();
    private final FrameSink frameSink = new FrameSink();
    private final boolean isClient;
    private final C12905f.C12907b maskCursor;
    private final byte[] maskKey;
    private final Random random;
    private final C12909g sink;
    private final C12905f sinkBuffer;
    private boolean writerClosed;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006 "}, mo16641d2 = {"Lokhttp3/internal/ws/WebSocketWriter$FrameSink;", "Lokio/Sink;", "(Lokhttp3/internal/ws/WebSocketWriter;)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "contentLength", "", "getContentLength", "()J", "setContentLength", "(J)V", "formatOpcode", "", "getFormatOpcode", "()I", "setFormatOpcode", "(I)V", "isFirstFrame", "setFirstFrame", "close", "", "flush", "timeout", "Lokio/Timeout;", "write", "source", "Lokio/Buffer;", "byteCount", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.WebSocketWriter$FrameSink */
    /* compiled from: WebSocketWriter.kt */
    public final class FrameSink implements C12932y {
        private boolean closed;
        private long contentLength;
        private int formatOpcode;
        private boolean isFirstFrame;

        public FrameSink() {
        }

        public void close() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.getBuffer().size(), this.isFirstFrame, true);
                this.closed = true;
                WebSocketWriter.this.setActiveWriter(false);
                return;
            }
            throw new IOException("closed");
        }

        public void flush() throws IOException {
            if (!this.closed) {
                WebSocketWriter webSocketWriter = WebSocketWriter.this;
                webSocketWriter.writeMessageFrame(this.formatOpcode, webSocketWriter.getBuffer().size(), this.isFirstFrame, false);
                this.isFirstFrame = false;
                return;
            }
            throw new IOException("closed");
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final long getContentLength() {
            return this.contentLength;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }

        public final boolean isFirstFrame() {
            return this.isFirstFrame;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setContentLength(long j) {
            this.contentLength = j;
        }

        public final void setFirstFrame(boolean z) {
            this.isFirstFrame = z;
        }

        public final void setFormatOpcode(int i) {
            this.formatOpcode = i;
        }

        public C12894b0 timeout() {
            return WebSocketWriter.this.getSink().timeout();
        }

        public void write(C12905f fVar, long j) throws IOException {
            C10202j.m34178b(fVar, "source");
            if (!this.closed) {
                WebSocketWriter.this.getBuffer().write(fVar, j);
                boolean z = this.isFirstFrame && this.contentLength != -1 && WebSocketWriter.this.getBuffer().size() > this.contentLength - ((long) 8192);
                long i = WebSocketWriter.this.getBuffer().mo41174i();
                if (i > 0 && !z) {
                    WebSocketWriter.this.writeMessageFrame(this.formatOpcode, i, this.isFirstFrame, false);
                    this.isFirstFrame = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    public WebSocketWriter(boolean z, C12909g gVar, Random random2) {
        C10202j.m34178b(gVar, "sink");
        C10202j.m34178b(random2, "random");
        this.isClient = z;
        this.sink = gVar;
        this.random = random2;
        this.sinkBuffer = gVar.getBuffer();
        C12905f.C12907b bVar = null;
        this.maskKey = this.isClient ? new byte[4] : null;
        this.maskCursor = this.isClient ? new C12905f.C12907b() : bVar;
    }

    private final void writeControlFrame(int i, C12911i iVar) throws IOException {
        if (!this.writerClosed) {
            int s = iVar.mo41239s();
            if (((long) s) <= 125) {
                this.sinkBuffer.writeByte(i | 128);
                if (this.isClient) {
                    this.sinkBuffer.writeByte(s | 128);
                    Random random2 = this.random;
                    byte[] bArr = this.maskKey;
                    if (bArr != null) {
                        random2.nextBytes(bArr);
                        this.sinkBuffer.write(this.maskKey);
                        if (s > 0) {
                            long size = this.sinkBuffer.size();
                            this.sinkBuffer.mo41161c(iVar);
                            C12905f fVar = this.sinkBuffer;
                            C12905f.C12907b bVar = this.maskCursor;
                            if (bVar != null) {
                                fVar.mo41141a(bVar);
                                this.maskCursor.mo41210d(size);
                                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                                this.maskCursor.close();
                            } else {
                                C10202j.m34172a();
                                throw null;
                            }
                        }
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                } else {
                    this.sinkBuffer.writeByte(s);
                    this.sinkBuffer.mo41161c(iVar);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    public final boolean getActiveWriter() {
        return this.activeWriter;
    }

    public final C12905f getBuffer() {
        return this.buffer;
    }

    public final Random getRandom() {
        return this.random;
    }

    public final C12909g getSink() {
        return this.sink;
    }

    public final C12932y newMessageSink(int i, long j) {
        if (!this.activeWriter) {
            this.activeWriter = true;
            this.frameSink.setFormatOpcode(i);
            this.frameSink.setContentLength(j);
            this.frameSink.setFirstFrame(true);
            this.frameSink.setClosed(false);
            return this.frameSink;
        }
        throw new IllegalStateException("Another message writer is active. Did you call close()?".toString());
    }

    public final void setActiveWriter(boolean z) {
        this.activeWriter = z;
    }

    public final void writeClose(int i, C12911i iVar) throws IOException {
        C12911i iVar2 = C12911i.f33158i;
        if (!(i == 0 && iVar == null)) {
            if (i != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i);
            }
            C12905f fVar = new C12905f();
            fVar.writeShort(i);
            if (iVar != null) {
                fVar.mo41161c(iVar);
            }
            iVar2 = fVar.mo41179k();
        }
        try {
            writeControlFrame(8, iVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i, long j, boolean z, boolean z2) throws IOException {
        if (!this.writerClosed) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.sinkBuffer.writeByte(i);
            if (this.isClient) {
                i2 = 128;
            }
            if (j <= 125) {
                this.sinkBuffer.writeByte(((int) j) | i2);
            } else if (j <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.writeByte(i2 | WebSocketProtocol.PAYLOAD_SHORT);
                this.sinkBuffer.writeShort((int) j);
            } else {
                this.sinkBuffer.writeByte(i2 | 127);
                this.sinkBuffer.mo41182l(j);
            }
            if (this.isClient) {
                Random random2 = this.random;
                byte[] bArr = this.maskKey;
                if (bArr != null) {
                    random2.nextBytes(bArr);
                    this.sinkBuffer.write(this.maskKey);
                    if (j > 0) {
                        long size = this.sinkBuffer.size();
                        this.sinkBuffer.write(this.buffer, j);
                        C12905f fVar = this.sinkBuffer;
                        C12905f.C12907b bVar = this.maskCursor;
                        if (bVar != null) {
                            fVar.mo41141a(bVar);
                            this.maskCursor.mo41210d(size);
                            WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                            this.maskCursor.close();
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    }
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            } else {
                this.sinkBuffer.write(this.buffer, j);
            }
            this.sink.mo41164e();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(C12911i iVar) throws IOException {
        C10202j.m34178b(iVar, "payload");
        writeControlFrame(9, iVar);
    }

    public final void writePong(C12911i iVar) throws IOException {
        C10202j.m34178b(iVar, "payload");
        writeControlFrame(10, iVar);
    }
}
