package okhttp3.internal.cache2;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.internal.Util;
import p413s.C12892a0;
import p413s.C12894b0;
import p413s.C12905f;
import p413s.C12911i;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 :2\u00020\u0001:\u0002:;B3\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\u000e\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u00105\u001a\u0004\u0018\u00010\u0005J \u00106\u001a\u0002032\u0006\u00107\u001a\u00020\t2\u0006\u00104\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002J\u0010\u00109\u001a\u0002032\u0006\u00104\u001a\u00020\u0007H\u0002R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006<"}, mo16641d2 = {"Lokhttp3/internal/cache2/Relay;", "", "file", "Ljava/io/RandomAccessFile;", "upstream", "Lokio/Source;", "upstreamPos", "", "metadata", "Lokio/ByteString;", "bufferMaxSize", "(Ljava/io/RandomAccessFile;Lokio/Source;JLokio/ByteString;J)V", "buffer", "Lokio/Buffer;", "getBuffer", "()Lokio/Buffer;", "getBufferMaxSize", "()J", "complete", "", "getComplete", "()Z", "setComplete", "(Z)V", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "isClosed", "sourceCount", "", "getSourceCount", "()I", "setSourceCount", "(I)V", "getUpstream", "()Lokio/Source;", "setUpstream", "(Lokio/Source;)V", "upstreamBuffer", "getUpstreamBuffer", "getUpstreamPos", "setUpstreamPos", "(J)V", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "commit", "", "upstreamSize", "newSource", "writeHeader", "prefix", "metadataSize", "writeMetadata", "Companion", "RelaySource", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: Relay.kt */
public final class Relay {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final C12911i PREFIX_CLEAN = C12911i.f33159j.mo41249c("OkHttp cache v1\n");
    public static final C12911i PREFIX_DIRTY = C12911i.f33159j.mo41249c("OkHttp DIRTY :(\n");
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final C12905f buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final C12911i metadata;
    private int sourceCount;
    private C12892a0 upstream;
    private final C12905f upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo16641d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "()V", "FILE_HEADER_SIZE", "", "PREFIX_CLEAN", "Lokio/ByteString;", "PREFIX_DIRTY", "SOURCE_FILE", "", "SOURCE_UPSTREAM", "edit", "Lokhttp3/internal/cache2/Relay;", "file", "Ljava/io/File;", "upstream", "Lokio/Source;", "metadata", "bufferMaxSize", "read", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Relay.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Relay edit(File file, C12892a0 a0Var, C12911i iVar, long j) throws IOException {
            C10202j.m34178b(file, "file");
            C10202j.m34178b(a0Var, "upstream");
            C10202j.m34178b(iVar, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, a0Var, 0, iVar, j, (DefaultConstructorMarker) null);
            randomAccessFile.setLength(0);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1, -1);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            C10202j.m34178b(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            C10202j.m34174a((Object) channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            C12905f fVar = new C12905f();
            fileOperator.read(0, fVar, Relay.FILE_HEADER_SIZE);
            if (!(!C10202j.m34176a((Object) fVar.mo41148a((long) Relay.PREFIX_CLEAN.mo41239s()), (Object) Relay.PREFIX_CLEAN))) {
                long readLong = fVar.readLong();
                long readLong2 = fVar.readLong();
                C12905f fVar2 = new C12905f();
                fileOperator.read(readLong + Relay.FILE_HEADER_SIZE, fVar2, readLong2);
                return new Relay(randomAccessFile, (C12892a0) null, readLong, fVar2.mo41179k(), 0, (DefaultConstructorMarker) null);
            }
            throw new IOException("unreadable cache file");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo16641d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lokio/Source;", "(Lokhttp3/internal/cache2/Relay;)V", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "", "timeout", "Lokio/Timeout;", "close", "", "read", "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Relay.kt */
    public final class RelaySource implements C12892a0 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final C12894b0 timeout = new C12894b0();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            if (file != null) {
                FileChannel channel = file.getChannel();
                C10202j.m34174a((Object) channel, "file!!.channel");
                this.fileOperator = new FileOperator(channel);
                return;
            }
            C10202j.m34172a();
            throw null;
        }

        public void close() throws IOException {
            if (this.fileOperator != null) {
                RandomAccessFile randomAccessFile = null;
                this.fileOperator = null;
                synchronized (Relay.this) {
                    Relay relay = Relay.this;
                    relay.setSourceCount(relay.getSourceCount() - 1);
                    if (Relay.this.getSourceCount() == 0) {
                        RandomAccessFile file = Relay.this.getFile();
                        Relay.this.setFile((RandomAccessFile) null);
                        randomAccessFile = file;
                    }
                    C10483v vVar = C10483v.f28357a;
                }
                if (randomAccessFile != null) {
                    Util.closeQuietly((Closeable) randomAccessFile);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x01bc, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008c, code lost:
            if (r4 != 2) goto L_0x00b2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
            r11 = java.lang.Math.min(r2, r1.this$0.getUpstreamPos() - r1.sourcePos);
            r2 = r1.fileOperator;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
            if (r2 == null) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
            r2.read(r1.sourcePos + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r20, r11);
            r1.sourcePos += r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
            return r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
            kotlin.jvm.internal.C10202j.m34172a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            r0 = r1.this$0.getUpstream();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
            if (r0 == null) goto L_0x019d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ba, code lost:
            r14 = r0.read(r1.this$0.getUpstreamBuffer(), r1.this$0.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cc, code lost:
            if (r14 != -1) goto L_0x00f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ce, code lost:
            r1.this$0.commit(r1.this$0.getUpstreamPos());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d9, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00db, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e3, code lost:
            if (r0 == null) goto L_0x00ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
            r0.notifyAll();
            r0 = kotlin.C10483v.f28357a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ea, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f3, code lost:
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            r11 = java.lang.Math.min(r14, r2);
            r1.this$0.getUpstreamBuffer().mo41145a(r20, 0, r11);
            r1.sourcePos += r11;
            r13 = r1.fileOperator;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0111, code lost:
            if (r13 == null) goto L_0x0199;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0113, code lost:
            r4 = r14;
            r13.write(r1.this$0.getUpstreamPos() + okhttp3.internal.cache2.Relay.FILE_HEADER_SIZE, r1.this$0.getUpstreamBuffer().clone(), r4);
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x012d, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            r1.this$0.getBuffer().write(r1.this$0.getUpstreamBuffer(), r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x014f, code lost:
            if (r1.this$0.getBuffer().size() <= r1.this$0.getBufferMaxSize()) goto L_0x016b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0151, code lost:
            r1.this$0.getBuffer().skip(r1.this$0.getBuffer().size() - r1.this$0.getBufferMaxSize());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x016b, code lost:
            r0 = r1.this$0;
            r0.setUpstreamPos(r0.getUpstreamPos() + r4);
            r0 = kotlin.C10483v.f28357a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
            r2 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x017a, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r0 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0182, code lost:
            if (r0 == null) goto L_0x018b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0184, code lost:
            r0.notifyAll();
            r0 = kotlin.C10483v.f28357a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0189, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x018a, code lost:
            return r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0192, code lost:
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x0199, code lost:
            kotlin.jvm.internal.C10202j.m34172a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x019c, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
            kotlin.jvm.internal.C10202j.m34172a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a0, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a1, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a4, code lost:
            monitor-enter(r1.this$0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
            r1.this$0.setUpstreamReader((java.lang.Thread) null);
            r3 = r1.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ac, code lost:
            if (r3 == null) goto L_0x01ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b5, code lost:
            throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x01b6, code lost:
            r3.notifyAll();
            r3 = kotlin.C10483v.f28357a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long read(p413s.C12905f r20, long r21) throws java.io.IOException {
            /*
                r19 = this;
                r1 = r19
                r2 = r21
                java.lang.String r0 = "sink"
                r5 = r20
                kotlin.jvm.internal.C10202j.m34178b(r5, r0)
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                r4 = 1
                if (r0 == 0) goto L_0x0012
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                if (r0 == 0) goto L_0x01c3
                okhttp3.internal.cache2.Relay r8 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r8)
            L_0x0018:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01c0 }
                long r6 = r0.getUpstreamPos()     // Catch:{ all -> 0x01c0 }
                long r9 = r1.sourcePos     // Catch:{ all -> 0x01c0 }
                r0 = 2
                r11 = -1
                int r13 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r13 == 0) goto L_0x0065
                okhttp3.internal.cache2.Relay r4 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01c0 }
                long r6 = r4.getUpstreamPos()     // Catch:{ all -> 0x01c0 }
                okhttp3.internal.cache2.Relay r4 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01c0 }
                s.f r4 = r4.getBuffer()     // Catch:{ all -> 0x01c0 }
                long r9 = r4.size()     // Catch:{ all -> 0x01c0 }
                long r6 = r6 - r9
                long r9 = r1.sourcePos     // Catch:{ all -> 0x01c0 }
                int r4 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
                if (r4 >= 0) goto L_0x0040
                r4 = 2
                goto L_0x0088
            L_0x0040:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01c0 }
                long r9 = r0.getUpstreamPos()     // Catch:{ all -> 0x01c0 }
                long r11 = r1.sourcePos     // Catch:{ all -> 0x01c0 }
                long r9 = r9 - r11
                long r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01c0 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01c0 }
                s.f r2 = r0.getBuffer()     // Catch:{ all -> 0x01c0 }
                long r3 = r1.sourcePos     // Catch:{ all -> 0x01c0 }
                long r6 = r3 - r6
                r3 = r20
                r4 = r6
                r6 = r9
                r2.mo41145a((p413s.C12905f) r3, (long) r4, (long) r6)     // Catch:{ all -> 0x01c0 }
                long r2 = r1.sourcePos     // Catch:{ all -> 0x01c0 }
                long r2 = r2 + r9
                r1.sourcePos = r2     // Catch:{ all -> 0x01c0 }
                monitor-exit(r8)
                return r9
            L_0x0065:
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01c0 }
                boolean r6 = r6.getComplete()     // Catch:{ all -> 0x01c0 }
                if (r6 == 0) goto L_0x006f
                monitor-exit(r8)
                return r11
            L_0x006f:
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01c0 }
                java.lang.Thread r6 = r6.getUpstreamReader()     // Catch:{ all -> 0x01c0 }
                if (r6 == 0) goto L_0x007f
                s.b0 r0 = r1.timeout     // Catch:{ all -> 0x01c0 }
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01c0 }
                r0.waitUntilNotified(r6)     // Catch:{ all -> 0x01c0 }
                goto L_0x0018
            L_0x007f:
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01c0 }
                java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x01c0 }
                r6.setUpstreamReader(r7)     // Catch:{ all -> 0x01c0 }
            L_0x0088:
                monitor-exit(r8)
                r8 = 32
                r10 = 0
                if (r4 != r0) goto L_0x00b2
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this
                long r6 = r0.getUpstreamPos()
                long r11 = r1.sourcePos
                long r6 = r6 - r11
                long r11 = java.lang.Math.min(r2, r6)
                okhttp3.internal.cache2.FileOperator r2 = r1.fileOperator
                if (r2 == 0) goto L_0x00ae
                long r3 = r1.sourcePos
                long r3 = r3 + r8
                r5 = r20
                r6 = r11
                r2.read(r3, r5, r6)
                long r2 = r1.sourcePos
                long r2 = r2 + r11
                r1.sourcePos = r2
                return r11
            L_0x00ae:
                kotlin.jvm.internal.C10202j.m34172a()
                throw r10
            L_0x00b2:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01a1 }
                s.a0 r0 = r0.getUpstream()     // Catch:{ all -> 0x01a1 }
                if (r0 == 0) goto L_0x019d
                okhttp3.internal.cache2.Relay r4 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01a1 }
                s.f r4 = r4.getUpstreamBuffer()     // Catch:{ all -> 0x01a1 }
                okhttp3.internal.cache2.Relay r6 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01a1 }
                long r6 = r6.getBufferMaxSize()     // Catch:{ all -> 0x01a1 }
                long r14 = r0.read(r4, r6)     // Catch:{ all -> 0x01a1 }
                int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
                if (r0 != 0) goto L_0x00f7
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01a1 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01a1 }
                long r2 = r2.getUpstreamPos()     // Catch:{ all -> 0x01a1 }
                r0.commit(r2)     // Catch:{ all -> 0x01a1 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x00f4 }
                r0.setUpstreamReader(r10)     // Catch:{ all -> 0x00f4 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x00f4 }
                if (r0 == 0) goto L_0x00ec
                r0.notifyAll()     // Catch:{ all -> 0x00f4 }
                kotlin.v r0 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x00f4 }
                monitor-exit(r2)
                return r11
            L_0x00ec:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x00f4 }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x00f4 }
                throw r0     // Catch:{ all -> 0x00f4 }
            L_0x00f4:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x00f7:
                long r11 = java.lang.Math.min(r14, r2)     // Catch:{ all -> 0x01a1 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01a1 }
                s.f r2 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x01a1 }
                r6 = 0
                r3 = r20
                r4 = r6
                r6 = r11
                r2.mo41145a((p413s.C12905f) r3, (long) r4, (long) r6)     // Catch:{ all -> 0x01a1 }
                long r2 = r1.sourcePos     // Catch:{ all -> 0x01a1 }
                long r2 = r2 + r11
                r1.sourcePos = r2     // Catch:{ all -> 0x01a1 }
                okhttp3.internal.cache2.FileOperator r13 = r1.fileOperator     // Catch:{ all -> 0x01a1 }
                if (r13 == 0) goto L_0x0199
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01a1 }
                long r2 = r0.getUpstreamPos()     // Catch:{ all -> 0x01a1 }
                long r2 = r2 + r8
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01a1 }
                s.f r0 = r0.getUpstreamBuffer()     // Catch:{ all -> 0x01a1 }
                s.f r16 = r0.clone()     // Catch:{ all -> 0x01a1 }
                r4 = r14
                r14 = r2
                r17 = r4
                r13.write(r14, r16, r17)     // Catch:{ all -> 0x01a1 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01a1 }
                monitor-enter(r2)     // Catch:{ all -> 0x01a1 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0196 }
                s.f r0 = r0.getBuffer()     // Catch:{ all -> 0x0196 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0196 }
                s.f r3 = r3.getUpstreamBuffer()     // Catch:{ all -> 0x0196 }
                r0.write(r3, r4)     // Catch:{ all -> 0x0196 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0196 }
                s.f r0 = r0.getBuffer()     // Catch:{ all -> 0x0196 }
                long r6 = r0.size()     // Catch:{ all -> 0x0196 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0196 }
                long r8 = r0.getBufferMaxSize()     // Catch:{ all -> 0x0196 }
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 <= 0) goto L_0x016b
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0196 }
                s.f r0 = r0.getBuffer()     // Catch:{ all -> 0x0196 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0196 }
                s.f r3 = r3.getBuffer()     // Catch:{ all -> 0x0196 }
                long r6 = r3.size()     // Catch:{ all -> 0x0196 }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0196 }
                long r8 = r3.getBufferMaxSize()     // Catch:{ all -> 0x0196 }
                long r6 = r6 - r8
                r0.skip(r6)     // Catch:{ all -> 0x0196 }
            L_0x016b:
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0196 }
                long r6 = r0.getUpstreamPos()     // Catch:{ all -> 0x0196 }
                long r6 = r6 + r4
                r0.setUpstreamPos(r6)     // Catch:{ all -> 0x0196 }
                kotlin.v r0 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x0196 }
                monitor-exit(r2)     // Catch:{ all -> 0x01a1 }
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0193 }
                r0.setUpstreamReader(r10)     // Catch:{ all -> 0x0193 }
                okhttp3.internal.cache2.Relay r0 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x0193 }
                if (r0 == 0) goto L_0x018b
                r0.notifyAll()     // Catch:{ all -> 0x0193 }
                kotlin.v r0 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x0193 }
                monitor-exit(r2)
                return r11
            L_0x018b:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x0193 }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x0193 }
                throw r0     // Catch:{ all -> 0x0193 }
            L_0x0193:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0196:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x01a1 }
                throw r0     // Catch:{ all -> 0x01a1 }
            L_0x0199:
                kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x01a1 }
                throw r10
            L_0x019d:
                kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x01a1 }
                throw r10
            L_0x01a1:
                r0 = move-exception
                okhttp3.internal.cache2.Relay r2 = okhttp3.internal.cache2.Relay.this
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01bd }
                r3.setUpstreamReader(r10)     // Catch:{ all -> 0x01bd }
                okhttp3.internal.cache2.Relay r3 = okhttp3.internal.cache2.Relay.this     // Catch:{ all -> 0x01bd }
                if (r3 != 0) goto L_0x01b6
                kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ all -> 0x01bd }
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                r0.<init>(r3)     // Catch:{ all -> 0x01bd }
                throw r0     // Catch:{ all -> 0x01bd }
            L_0x01b6:
                r3.notifyAll()     // Catch:{ all -> 0x01bd }
                kotlin.v r3 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x01bd }
                monitor-exit(r2)
                throw r0
            L_0x01bd:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x01c0:
                r0 = move-exception
                monitor-exit(r8)
                throw r0
            L_0x01c3:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "Check failed."
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                goto L_0x01d0
            L_0x01cf:
                throw r0
            L_0x01d0:
                goto L_0x01cf
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(s.f, long):long");
        }

        public C12894b0 timeout() {
            return this.timeout;
        }
    }

    private Relay(RandomAccessFile randomAccessFile, C12892a0 a0Var, long j, C12911i iVar, long j2) {
        this.file = randomAccessFile;
        this.upstream = a0Var;
        this.upstreamPos = j;
        this.metadata = iVar;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new C12905f();
        this.complete = this.upstream == null;
        this.buffer = new C12905f();
    }

    /* access modifiers changed from: private */
    public final void writeHeader(C12911i iVar, long j, long j2) throws IOException {
        C12905f fVar = new C12905f();
        fVar.mo41161c(iVar);
        fVar.mo41182l(j);
        fVar.mo41182l(j2);
        if (fVar.size() == FILE_HEADER_SIZE) {
            RandomAccessFile randomAccessFile = this.file;
            if (randomAccessFile != null) {
                FileChannel channel = randomAccessFile.getChannel();
                C10202j.m34174a((Object) channel, "file!!.channel");
                new FileOperator(channel).write(0, fVar, FILE_HEADER_SIZE);
                return;
            }
            C10202j.m34172a();
            throw null;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void writeMetadata(long j) throws IOException {
        C12905f fVar = new C12905f();
        fVar.mo41161c(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            FileChannel channel = randomAccessFile.getChannel();
            C10202j.m34174a((Object) channel, "file!!.channel");
            new FileOperator(channel).write(FILE_HEADER_SIZE + j, fVar, (long) this.metadata.mo41239s());
            return;
        }
        C10202j.m34172a();
        throw null;
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            randomAccessFile.getChannel().force(false);
            writeHeader(PREFIX_CLEAN, j, (long) this.metadata.mo41239s());
            RandomAccessFile randomAccessFile2 = this.file;
            if (randomAccessFile2 != null) {
                randomAccessFile2.getChannel().force(false);
                synchronized (this) {
                    this.complete = true;
                    C10483v vVar = C10483v.f28357a;
                }
                C12892a0 a0Var = this.upstream;
                if (a0Var != null) {
                    Util.closeQuietly((Closeable) a0Var);
                }
                this.upstream = null;
                return;
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }

    public final C12905f getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final C12892a0 getUpstream() {
        return this.upstream;
    }

    public final C12905f getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    public final C12911i metadata() {
        return this.metadata;
    }

    public final C12892a0 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(C12892a0 a0Var) {
        this.upstream = a0Var;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, C12892a0 a0Var, long j, C12911i iVar, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(randomAccessFile, a0Var, j, iVar, j2);
    }
}
