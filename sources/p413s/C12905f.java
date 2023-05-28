package p413s;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10185a0;
import kotlin.jvm.internal.C10202j;
import kotlin.p392j0.C12100c;

@C4789l(mo16639bv = {1, 0, 2}, mo16640d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0001\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0000H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fJ$\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\fH\u0007J\"\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\fJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0000H\u0016J\b\u0010 \u001a\u00020\u0000H\u0016J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\u0012H\u0016J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\fH\u0002¢\u0006\u0002\b*J\u0015\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\fH\u0007¢\u0006\u0002\b,J\b\u0010-\u001a\u00020.H\u0016J\u0018\u0010/\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u001cH\u0002J\u000e\u00101\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001cJ\u000e\u00102\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001cJ\u000e\u00103\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u001cJ\u0010\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020(H\u0016J\u0018\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\fH\u0016J \u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u00104\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001cH\u0016J\u0018\u00104\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\fH\u0016J\u0010\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u001cH\u0016J\u0018\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\fH\u0016J\b\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020\"H\u0016J\u0006\u0010>\u001a\u00020\u001cJ\b\u0010?\u001a\u00020\u0018H\u0016J\b\u0010@\u001a\u00020\u0001H\u0016J\u0018\u0010A\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001cH\u0016J(\u0010A\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u00108\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020.H\u0016J0\u0010A\u001a\u00020\"2\u0006\u0010C\u001a\u00020\n2\u0006\u0010D\u001a\u00020.2\u0006\u00108\u001a\u00020E2\u0006\u0010B\u001a\u00020.2\u0006\u0010F\u001a\u00020.H\u0002J\u0010\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020EH\u0016J \u0010G\u001a\u00020.2\u0006\u0010H\u001a\u00020E2\u0006\u0010\u0019\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020.H\u0016J\u0018\u0010G\u001a\u00020\f2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010J\u001a\u00020\f2\u0006\u0010H\u001a\u00020KH\u0016J\u0012\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020MH\u0007J\b\u0010O\u001a\u00020(H\u0016J\b\u0010P\u001a\u00020EH\u0016J\u0010\u0010P\u001a\u00020E2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010Q\u001a\u00020\u001cH\u0016J\u0010\u0010Q\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010R\u001a\u00020\fH\u0016J\u000e\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020<J\u0016\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\fJ \u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020<2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010U\u001a\u00020\"H\u0002J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010H\u001a\u00020EH\u0016J\u0018\u0010V\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010W\u001a\u00020\fH\u0016J\b\u0010X\u001a\u00020.H\u0016J\b\u0010Y\u001a\u00020.H\u0016J\b\u0010Z\u001a\u00020\fH\u0016J\b\u0010[\u001a\u00020\fH\u0016J\b\u0010\\\u001a\u00020]H\u0016J\b\u0010^\u001a\u00020]H\u0016J\u0010\u0010_\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020aH\u0016J\u0018\u0010_\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010`\u001a\u00020aH\u0016J\u0012\u0010b\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020MH\u0007J\b\u0010c\u001a\u00020\u001eH\u0016J\u0010\u0010c\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010d\u001a\u00020.H\u0016J\n\u0010e\u001a\u0004\u0018\u00010\u001eH\u0016J\u0015\u0010e\u001a\u00020\u001e2\u0006\u0010f\u001a\u00020\fH\u0000¢\u0006\u0002\bgJ\b\u0010h\u001a\u00020\u001eH\u0016J\u0010\u0010h\u001a\u00020\u001e2\u0006\u0010i\u001a\u00020\fH\u0016J\u0010\u0010j\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010k\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\fH\u0016J8\u0010l\u001a\u0002Hm\"\u0004\b\u0000\u0010m2\u0006\u00106\u001a\u00020\f2\u001a\u0010n\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002Hm0oH\b¢\u0006\u0002\u0010pJ\u0010\u0010q\u001a\u00020.2\u0006\u0010r\u001a\u00020sH\u0016J\u001f\u0010t\u001a\u00020.2\u0006\u0010r\u001a\u00020s2\b\b\u0002\u0010u\u001a\u00020\"H\u0000¢\u0006\u0002\bvJ\u0006\u0010w\u001a\u00020\u001cJ\u0006\u0010x\u001a\u00020\u001cJ\u0006\u0010y\u001a\u00020\u001cJ\r\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\bzJ\u0010\u0010{\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0006\u0010|\u001a\u00020\u001cJ\u000e\u0010|\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020.J\b\u0010}\u001a\u00020~H\u0016J\b\u0010\u001a\u00020\u001eH\u0016J\u0018\u0010\u0001\u001a\u00020\n2\u0007\u0010\u0001\u001a\u00020.H\u0000¢\u0006\u0003\b\u0001J\u0012\u0010\u0001\u001a\u00020.2\u0007\u0010\u0001\u001a\u00020IH\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020EH\u0016J\"\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020E2\u0006\u0010\u0019\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020.H\u0016J\u001a\u0010\u0001\u001a\u00020\u00122\u0007\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u001cH\u0016J\u001b\u0010\u0001\u001a\u00020\u00022\b\u0010\u0001\u001a\u00030\u00012\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0013\u0010\u0001\u001a\u00020\f2\b\u0010\u0001\u001a\u00030\u0001H\u0016J\u0011\u0010\u0001\u001a\u00020\u00002\u0006\u00105\u001a\u00020.H\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020.H\u0016J\u001a\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u001e2\u0006\u0010`\u001a\u00020aH\u0016J,\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u00020.2\u0007\u0010\u0001\u001a\u00020.2\u0006\u0010`\u001a\u00020aH\u0016J\u001b\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\fH\u0007J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u001eH\u0016J$\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020\u001e2\u0007\u0010\u0001\u001a\u00020.2\u0007\u0010\u0001\u001a\u00020.H\u0016J\u0012\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020.H\u0016R\u0014\u0010\u0006\u001a\u00020\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8\u0007@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0001"}, mo16641d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "()V", "buffer", "getBuffer", "()Lokio/Buffer;", "head", "Lokio/Segment;", "<set-?>", "", "size", "()J", "setSize$jvm", "(J)V", "clear", "", "clone", "close", "completeSegmentByteCount", "copyTo", "out", "Ljava/io/OutputStream;", "offset", "byteCount", "digest", "Lokio/ByteString;", "algorithm", "", "emit", "emitCompleteSegments", "equals", "", "other", "", "exhausted", "flush", "get", "", "pos", "getByte", "index", "-deprecated_getByte", "hashCode", "", "hmac", "key", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "b", "fromIndex", "toIndex", "bytes", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "md5", "outputStream", "peek", "rangeEquals", "bytesOffset", "segment", "segmentPos", "", "bytesLimit", "read", "sink", "Ljava/nio/ByteBuffer;", "readAll", "Lokio/Sink;", "readAndWriteUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFrom", "input", "forever", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "charset", "Ljava/nio/charset/Charset;", "readUnsafe", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "newline", "readUtf8Line$jvm", "readUtf8LineStrict", "limit", "request", "require", "seek", "T", "lambda", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "select", "options", "Lokio/Options;", "selectPrefix", "selectTruncated", "selectPrefix$jvm", "sha1", "sha256", "sha512", "-deprecated_size", "skip", "snapshot", "timeout", "Lokio/Timeout;", "toString", "writableSegment", "minimumCapacity", "writableSegment$jvm", "write", "source", "byteString", "Lokio/Source;", "writeAll", "writeByte", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", "string", "beginIndex", "endIndex", "writeTo", "writeUtf8", "writeUtf8CodePoint", "codePoint", "Companion", "UnsafeCursor", "jvm"}, mo16642k = 1, mo16643mv = {1, 1, 11})
/* renamed from: s.f */
/* compiled from: Buffer.kt */
public final class C12905f implements C12910h, C12909g, Cloneable, ByteChannel {

    /* renamed from: h */
    private static final byte[] f33147h;

    /* renamed from: f */
    public C12927v f33148f;

    /* renamed from: g */
    private long f33149g;

    /* renamed from: s.f$a */
    /* compiled from: Buffer.kt */
    public static final class C12906a {
        private C12906a() {
        }

        public /* synthetic */ C12906a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: s.f$b */
    /* compiled from: Buffer.kt */
    public static final class C12907b implements Closeable {

        /* renamed from: f */
        public C12905f f33150f;

        /* renamed from: g */
        public boolean f33151g;

        /* renamed from: h */
        private C12927v f33152h;

        /* renamed from: i */
        public long f33153i = -1;

        /* renamed from: j */
        public byte[] f33154j;

        /* renamed from: k */
        public int f33155k = -1;

        /* renamed from: l */
        public int f33156l = -1;

        /* renamed from: a */
        public final int mo41208a() {
            long j = this.f33153i;
            C12905f fVar = this.f33150f;
            if (fVar != null) {
                if (j != fVar.size()) {
                    long j2 = this.f33153i;
                    return mo41210d(j2 == -1 ? 0 : j2 + ((long) (this.f33156l - this.f33155k)));
                }
                throw new IllegalStateException("no more bytes".toString());
            }
            C10202j.m34172a();
            throw null;
        }

        public void close() {
            if (this.f33150f != null) {
                this.f33150f = null;
                this.f33152h = null;
                this.f33153i = -1;
                this.f33154j = null;
                this.f33155k = -1;
                this.f33156l = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: d */
        public final int mo41210d(long j) {
            long j2 = j;
            C12905f fVar = this.f33150f;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (j2 < ((long) -1) || j2 > fVar.size()) {
                C10185a0 a0Var = C10185a0.f27833a;
                String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(fVar.size())}, 2));
                C10202j.m34174a((Object) format, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(format);
            } else if (j2 == -1 || j2 == fVar.size()) {
                this.f33152h = null;
                this.f33153i = j2;
                this.f33154j = null;
                this.f33155k = -1;
                this.f33156l = -1;
                return -1;
            } else {
                long j3 = 0;
                long size = fVar.size();
                C12927v vVar = fVar.f33148f;
                C12927v vVar2 = this.f33152h;
                if (vVar2 != null) {
                    long j4 = this.f33153i;
                    int i = this.f33155k;
                    if (vVar2 != null) {
                        long j5 = j4 - ((long) (i - vVar2.f33194b));
                        if (j5 > j2) {
                            size = j5;
                            C12927v vVar3 = vVar2;
                            vVar2 = vVar;
                            vVar = vVar3;
                        } else {
                            j3 = j5;
                        }
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                } else {
                    vVar2 = vVar;
                }
                if (size - j2 > j2 - j3) {
                    while (vVar2 != null) {
                        int i2 = vVar2.f33195c;
                        int i3 = vVar2.f33194b;
                        if (j2 >= ((long) (i2 - i3)) + j3) {
                            j3 += (long) (i2 - i3);
                            vVar2 = vVar2.f33198f;
                        }
                    }
                    C10202j.m34172a();
                    throw null;
                }
                while (size > j2) {
                    if (vVar != null) {
                        vVar = vVar.f33199g;
                        if (vVar != null) {
                            size -= (long) (vVar.f33195c - vVar.f33194b);
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                }
                vVar2 = vVar;
                j3 = size;
                if (this.f33151g) {
                    if (vVar2 == null) {
                        C10202j.m34172a();
                        throw null;
                    } else if (vVar2.f33196d) {
                        C12927v d = vVar2.mo41299d();
                        if (fVar.f33148f == vVar2) {
                            fVar.f33148f = d;
                        }
                        vVar2.mo41294a(d);
                        C12927v vVar4 = d.f33199g;
                        if (vVar4 != null) {
                            vVar4.mo41297b();
                            vVar2 = d;
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    }
                }
                this.f33152h = vVar2;
                this.f33153i = j2;
                if (vVar2 != null) {
                    this.f33154j = vVar2.f33193a;
                    int i4 = vVar2.f33194b + ((int) (j2 - j3));
                    this.f33155k = i4;
                    int i5 = vVar2.f33195c;
                    this.f33156l = i5;
                    return i5 - i4;
                }
                C10202j.m34172a();
                throw null;
            }
        }
    }

    static {
        new C12906a((DefaultConstructorMarker) null);
        byte[] bytes = "0123456789abcdef".getBytes(C12100c.f31866a);
        C10202j.m34174a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        f33147h = bytes;
    }

    /* renamed from: c */
    public C12905f mo41158c() {
        return this;
    }

    public void close() {
    }

    /* renamed from: d */
    public final byte mo41163d(long j) {
        C12897c.m41512a(this.f33149g, j, 1);
        C12927v vVar = this.f33148f;
        if (vVar == null) {
            C10202j.m34172a();
            throw null;
        } else if (size() - j < j) {
            long size = size();
            while (size > j) {
                vVar = vVar.f33199g;
                if (vVar != null) {
                    size -= (long) (vVar.f33195c - vVar.f33194b);
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
            if (vVar != null) {
                return vVar.f33193a[(int) ((((long) vVar.f33194b) + j) - size)];
            }
            C10202j.m34172a();
            throw null;
        } else {
            long j2 = 0;
            while (true) {
                int i = vVar.f33195c;
                int i2 = vVar.f33194b;
                long j3 = ((long) (i - i2)) + j2;
                if (j3 <= j) {
                    vVar = vVar.f33198f;
                    if (vVar != null) {
                        j2 = j3;
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                } else if (vVar != null) {
                    return vVar.f33193a[(int) ((((long) i2) + j) - j2)];
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
        }
    }

    /* renamed from: e */
    public C12905f mo41164e() {
        return this;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof p413s.C12905f
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            long r5 = r0.f33149g
            s.f r1 = (p413s.C12905f) r1
            long r7 = r1.f33149g
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0019
            return r4
        L_0x0019:
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0020
            return r2
        L_0x0020:
            s.v r3 = r0.f33148f
            r5 = 0
            if (r3 == 0) goto L_0x0084
            s.v r1 = r1.f33148f
            if (r1 == 0) goto L_0x0080
            int r6 = r3.f33194b
            int r9 = r1.f33194b
            r10 = r7
        L_0x002e:
            long r12 = r0.f33149g
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x007f
            int r12 = r3.f33195c
            int r12 = r12 - r6
            int r13 = r1.f33195c
            int r13 = r13 - r9
            int r12 = java.lang.Math.min(r12, r13)
            long r12 = (long) r12
            r14 = r7
        L_0x0040:
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 >= 0) goto L_0x005c
            byte[] r7 = r3.f33193a
            int r8 = r6 + 1
            byte r6 = r7[r6]
            byte[] r7 = r1.f33193a
            int r17 = r9 + 1
            byte r7 = r7[r9]
            if (r6 == r7) goto L_0x0053
            return r4
        L_0x0053:
            r6 = 1
            long r14 = r14 + r6
            r6 = r8
            r9 = r17
            r7 = 0
            goto L_0x0040
        L_0x005c:
            int r7 = r3.f33195c
            if (r6 != r7) goto L_0x006b
            s.v r3 = r3.f33198f
            if (r3 == 0) goto L_0x0067
            int r6 = r3.f33194b
            goto L_0x006b
        L_0x0067:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x006b:
            int r7 = r1.f33195c
            if (r9 != r7) goto L_0x007b
            s.v r1 = r1.f33198f
            if (r1 == 0) goto L_0x0077
            int r7 = r1.f33194b
            r9 = r7
            goto L_0x007b
        L_0x0077:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x007b:
            long r10 = r10 + r12
            r7 = 0
            goto L_0x002e
        L_0x007f:
            return r2
        L_0x0080:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r5
        L_0x0084:
            kotlin.jvm.internal.C10202j.m34172a()
            goto L_0x0089
        L_0x0088:
            throw r5
        L_0x0089:
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: p413s.C12905f.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public byte[] mo41167f() {
        return mo41165e(this.f33149g);
    }

    public void flush() {
    }

    /* renamed from: g */
    public boolean mo41169g() {
        return this.f33149g == 0;
    }

    public C12905f getBuffer() {
        return this;
    }

    /* renamed from: h */
    public C12905f mo41171h() {
        return this;
    }

    public int hashCode() {
        C12927v vVar = this.f33148f;
        if (vVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = vVar.f33195c;
            for (int i3 = vVar.f33194b; i3 < i2; i3++) {
                i = (i * 31) + vVar.f33193a[i3];
            }
            vVar = vVar.f33198f;
            if (vVar == null) {
                C10202j.m34172a();
                throw null;
            }
        } while (vVar != this.f33148f);
        return i;
    }

    public boolean isOpen() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r8 != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r1.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        throw new java.lang.NumberFormatException("Number too large: " + r1.mo41186q());
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0013  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo41177j() throws java.io.EOFException {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f33149g
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00c0
            r5 = -7
            r7 = 0
            r8 = 0
            r9 = 0
        L_0x000f:
            s.v r10 = r0.f33148f
            if (r10 == 0) goto L_0x00bb
            byte[] r11 = r10.f33193a
            int r12 = r10.f33194b
            int r13 = r10.f33195c
        L_0x0019:
            if (r12 >= r13) goto L_0x009c
            byte r15 = r11[r12]
            r14 = 48
            byte r14 = (byte) r14
            if (r15 < r14) goto L_0x006d
            r1 = 57
            byte r1 = (byte) r1
            if (r15 > r1) goto L_0x006d
            int r14 = r14 - r15
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L_0x0042
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 != 0) goto L_0x003b
            long r1 = (long) r14
            int r16 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r16 >= 0) goto L_0x003b
            goto L_0x0042
        L_0x003b:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L_0x0078
        L_0x0042:
            s.f r1 = new s.f
            r1.<init>()
            r1.mo41175i((long) r3)
            r1.writeByte((int) r15)
            if (r8 != 0) goto L_0x0052
            r1.readByte()
        L_0x0052:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.mo41186q()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x006d:
            r1 = 45
            byte r1 = (byte) r1
            if (r15 != r1) goto L_0x007d
            if (r7 != 0) goto L_0x007d
            r1 = 1
            long r5 = r5 - r1
            r8 = 1
        L_0x0078:
            int r12 = r12 + 1
            int r7 = r7 + 1
            goto L_0x0019
        L_0x007d:
            if (r7 == 0) goto L_0x0081
            r9 = 1
            goto L_0x009c
        L_0x0081:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009c:
            if (r12 != r13) goto L_0x00a8
            s.v r1 = r10.mo41297b()
            r0.f33148f = r1
            p413s.C12929w.m41739a(r10)
            goto L_0x00aa
        L_0x00a8:
            r10.f33194b = r12
        L_0x00aa:
            if (r9 != 0) goto L_0x00b0
            s.v r1 = r0.f33148f
            if (r1 != 0) goto L_0x000f
        L_0x00b0:
            long r1 = r0.f33149g
            long r5 = (long) r7
            long r1 = r1 - r5
            r0.f33149g = r1
            if (r8 == 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            long r3 = -r3
        L_0x00ba:
            return r3
        L_0x00bb:
            kotlin.jvm.internal.C10202j.m34172a()
            r1 = 0
            throw r1
        L_0x00c0:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            goto L_0x00c7
        L_0x00c6:
            throw r1
        L_0x00c7:
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: p413s.C12905f.mo41177j():long");
    }

    /* renamed from: k */
    public final void mo41180k(long j) {
        this.f33149g = j;
    }

    /* renamed from: l */
    public int mo41181l() throws EOFException {
        return C12897c.m41510a(readInt());
    }

    /* renamed from: m */
    public short mo41183m() throws EOFException {
        return C12897c.m41511a(readShort());
    }

    /* renamed from: n */
    public String mo41184n() throws EOFException {
        return mo41154b(Long.MAX_VALUE);
    }

    public C12910h peek() {
        return C12919p.m41675a((C12892a0) new C12923s(this));
    }

    /* renamed from: q */
    public String mo41186q() {
        return mo41139a(this.f33149g, C12100c.f31866a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (r8 != r9) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0097, code lost:
        r15.f33148f = r6.mo41297b();
        p413s.C12929w.m41739a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a1, code lost:
        r6.f33194b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a3, code lost:
        if (r1 != false) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007a A[SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo41187r() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f33149g
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b5
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            s.v r6 = r15.f33148f
            if (r6 == 0) goto L_0x00b0
            byte[] r7 = r6.f33193a
            int r8 = r6.f33194b
            int r9 = r6.f33195c
        L_0x0015:
            if (r8 >= r9) goto L_0x0095
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0026
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0026
            int r11 = r10 - r11
            goto L_0x0040
        L_0x0026:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0035
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0035
        L_0x0030:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0040
        L_0x0035:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0076
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0076
            goto L_0x0030
        L_0x0040:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0050
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0015
        L_0x0050:
            s.f r0 = new s.f
            r0.<init>()
            r0.mo41160c((long) r4)
            r0.writeByte((int) r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo41186q()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0076:
            if (r0 == 0) goto L_0x007a
            r1 = 1
            goto L_0x0095
        L_0x007a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0095:
            if (r8 != r9) goto L_0x00a1
            s.v r7 = r6.mo41297b()
            r15.f33148f = r7
            p413s.C12929w.m41739a(r6)
            goto L_0x00a3
        L_0x00a1:
            r6.f33194b = r8
        L_0x00a3:
            if (r1 != 0) goto L_0x00a9
            s.v r6 = r15.f33148f
            if (r6 != 0) goto L_0x000b
        L_0x00a9:
            long r1 = r15.f33149g
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f33149g = r1
            return r4
        L_0x00b0:
            kotlin.jvm.internal.C10202j.m34172a()
            r0 = 0
            throw r0
        L_0x00b5:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            goto L_0x00bc
        L_0x00bb:
            throw r0
        L_0x00bc:
            goto L_0x00bb
        */
        throw new UnsupportedOperationException("Method not decompiled: p413s.C12905f.mo41187r():long");
    }

    public int read(byte[] bArr, int i, int i2) {
        C10202j.m34178b(bArr, "sink");
        C12897c.m41512a((long) bArr.length, (long) i, (long) i2);
        C12927v vVar = this.f33148f;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i2, vVar.f33195c - vVar.f33194b);
        System.arraycopy(vVar.f33193a, vVar.f33194b, bArr, i, min);
        int i3 = vVar.f33194b + min;
        vVar.f33194b = i3;
        this.f33149g -= (long) min;
        if (i3 == vVar.f33195c) {
            this.f33148f = vVar.mo41297b();
            C12929w.m41739a(vVar);
        }
        return min;
    }

    public byte readByte() throws EOFException {
        long j = this.f33149g;
        if (j != 0) {
            C12927v vVar = this.f33148f;
            if (vVar != null) {
                int i = vVar.f33194b;
                int i2 = vVar.f33195c;
                int i3 = i + 1;
                byte b = vVar.f33193a[i];
                this.f33149g = j - 1;
                if (i3 == i2) {
                    this.f33148f = vVar.mo41297b();
                    C12929w.m41739a(vVar);
                } else {
                    vVar.f33194b = i3;
                }
                return b;
            }
            C10202j.m34172a();
            throw null;
        }
        throw new EOFException();
    }

    public void readFully(byte[] bArr) throws EOFException {
        C10202j.m34178b(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() throws EOFException {
        long j = this.f33149g;
        if (j >= 4) {
            C12927v vVar = this.f33148f;
            if (vVar != null) {
                int i = vVar.f33194b;
                int i2 = vVar.f33195c;
                if (((long) (i2 - i)) < 4) {
                    return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
                }
                byte[] bArr = vVar.f33193a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
                int i5 = i4 + 1;
                byte b2 = b | ((bArr[i4] & 255) << 8);
                int i6 = i5 + 1;
                byte b3 = b2 | (bArr[i5] & 255);
                this.f33149g = j - 4;
                if (i6 == i2) {
                    this.f33148f = vVar.mo41297b();
                    C12929w.m41739a(vVar);
                } else {
                    vVar.f33194b = i6;
                }
                return b3;
            }
            C10202j.m34172a();
            throw null;
        }
        throw new EOFException();
    }

    public long readLong() throws EOFException {
        long j = this.f33149g;
        if (j >= 8) {
            C12927v vVar = this.f33148f;
            if (vVar != null) {
                int i = vVar.f33194b;
                int i2 = vVar.f33195c;
                if (((long) (i2 - i)) < 8) {
                    return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
                }
                byte[] bArr = vVar.f33193a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                long j2 = (((long) bArr[i3]) & 255) << 48;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                long j3 = j2 | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32);
                int i7 = i6 + 1;
                int i8 = i7 + 1;
                long j4 = j3 | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                long j5 = j4 | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
                this.f33149g = j - 8;
                if (i10 == i2) {
                    this.f33148f = vVar.mo41297b();
                    C12929w.m41739a(vVar);
                } else {
                    vVar.f33194b = i10;
                }
                return j5;
            }
            C10202j.m34172a();
            throw null;
        }
        throw new EOFException();
    }

    public short readShort() throws EOFException {
        long j = this.f33149g;
        if (j >= 2) {
            C12927v vVar = this.f33148f;
            if (vVar != null) {
                int i = vVar.f33194b;
                int i2 = vVar.f33195c;
                if (i2 - i < 2) {
                    return (short) (((readByte() & 255) << 8) | (readByte() & 255));
                }
                byte[] bArr = vVar.f33193a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
                this.f33149g = j - 2;
                if (i4 == i2) {
                    this.f33148f = vVar.mo41297b();
                    C12929w.m41739a(vVar);
                } else {
                    vVar.f33194b = i4;
                }
                return (short) b;
            }
            C10202j.m34172a();
            throw null;
        }
        throw new EOFException();
    }

    public boolean request(long j) {
        return this.f33149g >= j;
    }

    /* renamed from: s */
    public InputStream mo41196s() {
        return new C12908c(this);
    }

    public final long size() {
        return this.f33149g;
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            C12927v vVar = this.f33148f;
            if (vVar != null) {
                int min = (int) Math.min(j, (long) (vVar.f33195c - vVar.f33194b));
                long j2 = (long) min;
                this.f33149g -= j2;
                j -= j2;
                int i = vVar.f33194b + min;
                vVar.f33194b = i;
                if (i == vVar.f33195c) {
                    this.f33148f = vVar.mo41297b();
                    C12929w.m41739a(vVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public C12894b0 timeout() {
        return C12894b0.NONE;
    }

    public String toString() {
        return mo41201w().toString();
    }

    /* renamed from: u */
    public int mo41200u() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (this.f33149g != 0) {
            byte d = mo41163d(0);
            int i2 = 1;
            if ((d & 128) == 0) {
                b2 = d & Byte.MAX_VALUE;
                i = 1;
                b = 0;
            } else if ((d & 224) == 192) {
                b2 = d & 31;
                i = 2;
                b = 128;
            } else if ((d & 240) == 224) {
                b2 = d & 15;
                i = 3;
                b = 2048;
            } else if ((d & 248) == 240) {
                b2 = d & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (this.f33149g >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte d2 = mo41163d(j2);
                    if ((d2 & 192) == 128) {
                        b2 = (b2 << 6) | (d2 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if ((55296 <= b2 && 57343 >= b2) || b2 < b) {
                    return 65533;
                }
                return b2;
            }
            throw new EOFException("size < " + i + ": " + this.f33149g + " (to read code point prefixed 0x" + Integer.toHexString(d) + ")");
        }
        throw new EOFException();
    }

    /* renamed from: w */
    public final C12911i mo41201w() {
        if (this.f33149g <= ((long) Integer.MAX_VALUE)) {
            return mo41147a((int) this.f33149g);
        }
        throw new IllegalStateException(("size > Integer.MAX_VALUE: " + this.f33149g).toString());
    }

    /* renamed from: s.f$c */
    /* compiled from: Buffer.kt */
    public static final class C12908c extends InputStream {

        /* renamed from: f */
        final /* synthetic */ C12905f f33157f;

        C12908c(C12905f fVar) {
            this.f33157f = fVar;
        }

        public int available() {
            return (int) Math.min(this.f33157f.size(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f33157f.size() > 0) {
                return this.f33157f.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return this.f33157f + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            C10202j.m34178b(bArr, "sink");
            return this.f33157f.read(bArr, i, i2);
        }
    }

    /* renamed from: a */
    public final C12905f mo41145a(C12905f fVar, long j, long j2) {
        C10202j.m34178b(fVar, "out");
        C12897c.m41512a(this.f33149g, j, j2);
        if (j2 == 0) {
            return this;
        }
        fVar.f33149g += j2;
        C12927v vVar = this.f33148f;
        while (vVar != null) {
            int i = vVar.f33195c;
            int i2 = vVar.f33194b;
            if (j >= ((long) (i - i2))) {
                j -= (long) (i - i2);
                vVar = vVar.f33198f;
            } else {
                while (j2 > 0) {
                    if (vVar != null) {
                        C12927v c = vVar.mo41298c();
                        int i3 = c.f33194b + ((int) j);
                        c.f33194b = i3;
                        c.f33195c = Math.min(i3 + ((int) j2), c.f33195c);
                        C12927v vVar2 = fVar.f33148f;
                        if (vVar2 == null) {
                            c.f33199g = c;
                            c.f33198f = c;
                            fVar.f33148f = c;
                        } else if (vVar2 != null) {
                            C12927v vVar3 = vVar2.f33199g;
                            if (vVar3 != null) {
                                vVar3.mo41294a(c);
                            } else {
                                C10202j.m34172a();
                                throw null;
                            }
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                        j2 -= (long) (c.f33195c - c.f33194b);
                        vVar = vVar.f33198f;
                        j = 0;
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                }
                return this;
            }
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: b */
    public String mo41154b(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long a = mo41134a(b, 0, j2);
            if (a != -1) {
                return mo41178j(a);
            }
            if (j2 < this.f33149g && mo41163d(j2 - 1) == ((byte) 13) && mo41163d(j2) == b) {
                return mo41178j(j2);
            }
            C12905f fVar = new C12905f();
            mo41145a(fVar, 0, Math.min((long) 32, this.f33149g));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f33149g, j) + " content=" + fVar.mo41179k().mo41234m() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    public C12905f clone() {
        C12905f fVar = new C12905f();
        if (this.f33149g == 0) {
            return fVar;
        }
        C12927v vVar = this.f33148f;
        if (vVar != null) {
            C12927v c = vVar.mo41298c();
            fVar.f33148f = c;
            if (c != null) {
                c.f33199g = c;
                if (c == null) {
                    C10202j.m34172a();
                    throw null;
                } else if (c != null) {
                    c.f33198f = c;
                    C12927v vVar2 = this.f33148f;
                    if (vVar2 != null) {
                        C12927v vVar3 = vVar2.f33198f;
                        while (vVar3 != this.f33148f) {
                            C12927v vVar4 = fVar.f33148f;
                            if (vVar4 != null) {
                                C12927v vVar5 = vVar4.f33199g;
                                if (vVar5 == null) {
                                    C10202j.m34172a();
                                    throw null;
                                } else if (vVar3 != null) {
                                    vVar5.mo41294a(vVar3.mo41298c());
                                    vVar3 = vVar3.f33198f;
                                } else {
                                    C10202j.m34172a();
                                    throw null;
                                }
                            } else {
                                C10202j.m34172a();
                                throw null;
                            }
                        }
                        fVar.f33149g = this.f33149g;
                        return fVar;
                    }
                    C10202j.m34172a();
                    throw null;
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

    /* renamed from: e */
    public byte[] mo41165e(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f33149g >= j) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: g */
    public String mo41168g(long j) throws EOFException {
        return mo41139a(j, C12100c.f31866a);
    }

    /* renamed from: h */
    public void mo41172h(long j) throws EOFException {
        if (this.f33149g < j) {
            throw new EOFException();
        }
    }

    /* renamed from: i */
    public final long mo41174i() {
        long j = this.f33149g;
        if (j == 0) {
            return 0;
        }
        C12927v vVar = this.f33148f;
        if (vVar != null) {
            C12927v vVar2 = vVar.f33199g;
            if (vVar2 != null) {
                int i = vVar2.f33195c;
                return (i >= 8192 || !vVar2.f33197e) ? j : j - ((long) (i - vVar2.f33194b));
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: k */
    public C12911i mo41179k() {
        return new C12911i(mo41167f());
    }

    /* renamed from: l */
    public C12905f mo41182l(long j) {
        C12927v b = mo41156b(8);
        byte[] bArr = b.f33193a;
        int i = b.f33195c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        b.f33195c = i8 + 1;
        this.f33149g += 8;
        return this;
    }

    public C12905f writeByte(int i) {
        C12927v b = mo41156b(1);
        byte[] bArr = b.f33193a;
        int i2 = b.f33195c;
        b.f33195c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f33149g++;
        return this;
    }

    public C12905f writeInt(int i) {
        C12927v b = mo41156b(4);
        byte[] bArr = b.f33193a;
        int i2 = b.f33195c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        b.f33195c = i5 + 1;
        this.f33149g += 4;
        return this;
    }

    public C12905f writeShort(int i) {
        C12927v b = mo41156b(2);
        byte[] bArr = b.f33193a;
        int i2 = b.f33195c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        b.f33195c = i3 + 1;
        this.f33149g += 2;
        return this;
    }

    /* renamed from: c */
    public C12905f mo41161c(C12911i iVar) {
        C10202j.m34178b(iVar, "byteString");
        iVar.mo41220a(this);
        return this;
    }

    public C12905f write(byte[] bArr) {
        C10202j.m34178b(bArr, "source");
        write(bArr, 0, bArr.length);
        return this;
    }

    /* renamed from: c */
    public C12905f mo41159c(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            C12927v b = mo41156b(2);
            byte[] bArr = b.f33193a;
            int i2 = b.f33195c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            b.f33195c = i2 + 2;
            this.f33149g += 2;
        } else if (55296 <= i && 57343 >= i) {
            writeByte(63);
        } else if (i < 65536) {
            C12927v b2 = mo41156b(3);
            byte[] bArr2 = b2.f33193a;
            int i3 = b2.f33195c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            b2.f33195c = i3 + 3;
            this.f33149g += 3;
        } else if (i <= 1114111) {
            C12927v b3 = mo41156b(4);
            byte[] bArr3 = b3.f33193a;
            int i4 = b3.f33195c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            b3.f33195c = i4 + 4;
            this.f33149g += 4;
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    public C12905f write(byte[] bArr, int i, int i2) {
        C10202j.m34178b(bArr, "source");
        long j = (long) i2;
        C12897c.m41512a((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C12927v b = mo41156b(1);
            int min = Math.min(i3 - i, 8192 - b.f33195c);
            System.arraycopy(bArr, i, b.f33193a, b.f33195c, min);
            i += min;
            b.f33195c += min;
        }
        this.f33149g += j;
        return this;
    }

    /* renamed from: i */
    public C12905f mo41175i(long j) {
        if (j == 0) {
            writeByte(48);
            return this;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                mo41155b("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C12927v b = mo41156b(i);
        byte[] bArr = b.f33193a;
        int i2 = b.f33195c + i;
        while (j != 0) {
            long j2 = (long) 10;
            i2--;
            bArr[i2] = f33147h[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = (byte) 45;
        }
        b.f33195c += i;
        this.f33149g += (long) i;
        return this;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C10202j.m34178b(byteBuffer, "sink");
        C12927v vVar = this.f33148f;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vVar.f33195c - vVar.f33194b);
        byteBuffer.put(vVar.f33193a, vVar.f33194b, min);
        int i = vVar.f33194b + min;
        vVar.f33194b = i;
        this.f33149g -= (long) min;
        if (i == vVar.f33195c) {
            this.f33148f = vVar.mo41297b();
            C12929w.m41739a(vVar);
        }
        return min;
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        C10202j.m34178b(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C12927v b = mo41156b(1);
            int min = Math.min(i, 8192 - b.f33195c);
            byteBuffer.get(b.f33193a, b.f33195c, min);
            i -= min;
            b.f33195c += min;
        }
        this.f33149g += (long) remaining;
        return remaining;
    }

    /* renamed from: b */
    public final void mo41157b() {
        skip(this.f33149g);
    }

    public void write(C12905f fVar, long j) {
        C12927v vVar;
        C10202j.m34178b(fVar, "source");
        if (fVar != this) {
            C12897c.m41512a(fVar.f33149g, 0, j);
            while (j > 0) {
                C12927v vVar2 = fVar.f33148f;
                if (vVar2 != null) {
                    int i = vVar2.f33195c;
                    if (vVar2 != null) {
                        if (j < ((long) (i - vVar2.f33194b))) {
                            C12927v vVar3 = this.f33148f;
                            if (vVar3 == null) {
                                vVar = null;
                            } else if (vVar3 != null) {
                                vVar = vVar3.f33199g;
                            } else {
                                C10202j.m34172a();
                                throw null;
                            }
                            if (vVar != null && vVar.f33197e) {
                                if ((((long) vVar.f33195c) + j) - ((long) (vVar.f33196d ? 0 : vVar.f33194b)) <= ((long) 8192)) {
                                    C12927v vVar4 = fVar.f33148f;
                                    if (vVar4 != null) {
                                        vVar4.mo41296a(vVar, (int) j);
                                        fVar.f33149g -= j;
                                        this.f33149g += j;
                                        return;
                                    }
                                    C10202j.m34172a();
                                    throw null;
                                }
                            }
                            C12927v vVar5 = fVar.f33148f;
                            if (vVar5 != null) {
                                fVar.f33148f = vVar5.mo41293a((int) j);
                            } else {
                                C10202j.m34172a();
                                throw null;
                            }
                        }
                        C12927v vVar6 = fVar.f33148f;
                        if (vVar6 != null) {
                            long j2 = (long) (vVar6.f33195c - vVar6.f33194b);
                            fVar.f33148f = vVar6.mo41297b();
                            C12927v vVar7 = this.f33148f;
                            if (vVar7 == null) {
                                this.f33148f = vVar6;
                                vVar6.f33199g = vVar6;
                                vVar6.f33198f = vVar6;
                            } else if (vVar7 != null) {
                                C12927v vVar8 = vVar7.f33199g;
                                if (vVar8 != null) {
                                    vVar8.mo41294a(vVar6);
                                    vVar6.mo41295a();
                                } else {
                                    C10202j.m34172a();
                                    throw null;
                                }
                            } else {
                                C10202j.m34172a();
                                throw null;
                            }
                            fVar.f33149g -= j2;
                            this.f33149g += j2;
                            j -= j2;
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
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: b */
    public C12905f mo41155b(String str) {
        C10202j.m34178b(str, "string");
        mo41142a(str, 0, str.length());
        return this;
    }

    /* renamed from: b */
    public final C12927v mo41156b(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C12927v vVar = this.f33148f;
            if (vVar == null) {
                C12927v a = C12929w.m41738a();
                this.f33148f = a;
                a.f33199g = a;
                a.f33198f = a;
                return a;
            } else if (vVar != null) {
                C12927v vVar2 = vVar.f33199g;
                if (vVar2 == null) {
                    C10202j.m34172a();
                    throw null;
                } else if (vVar2.f33195c + i <= 8192 && vVar2.f33197e) {
                    return vVar2;
                } else {
                    C12927v a2 = C12929w.m41738a();
                    vVar2.mo41294a(a2);
                    return a2;
                }
            } else {
                C10202j.m34172a();
                throw null;
            }
        } else {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
    }

    public long read(C12905f fVar, long j) {
        C10202j.m34178b(fVar, "sink");
        if (j >= 0) {
            long j2 = this.f33149g;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            fVar.write(this, j);
            return j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    /* renamed from: a */
    public C12911i mo41148a(long j) throws EOFException {
        return new C12911i(mo41165e(j));
    }

    /* renamed from: j */
    public final String mo41178j(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (mo41163d(j2) == ((byte) 13)) {
                String g = mo41168g(j2);
                skip(2);
                return g;
            }
        }
        String g2 = mo41168g(j);
        skip(1);
        return g2;
    }

    /* renamed from: a */
    public int mo41132a(C12920q qVar) {
        C10202j.m34178b(qVar, "options");
        int a = m41541a(this, qVar, false, 2, (Object) null);
        if (a == -1) {
            return -1;
        }
        skip((long) qVar.mo41261a()[a].mo41239s());
        return a;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ int m41541a(C12905f fVar, C12920q qVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return fVar.mo41133a(qVar, z);
    }

    /* renamed from: a */
    public final int mo41133a(C12920q qVar, boolean z) {
        int i;
        int i2;
        int i3;
        C12927v vVar;
        int i4;
        C10202j.m34178b(qVar, "options");
        C12927v vVar2 = this.f33148f;
        int i5 = -2;
        if (vVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = vVar2.f33193a;
        int i6 = vVar2.f33194b;
        int i7 = vVar2.f33195c;
        int[] c = qVar.mo41265c();
        C12927v vVar3 = vVar2;
        int i8 = 0;
        int i9 = -1;
        loop0:
        while (true) {
            int i10 = i8 + 1;
            int i11 = c[i8];
            int i12 = i10 + 1;
            int i13 = c[i10];
            if (i13 != -1) {
                i9 = i13;
            }
            if (vVar3 == null) {
                break;
            }
            if (i11 < 0) {
                int i14 = i12 + (i11 * -1);
                while (true) {
                    int i15 = i6 + 1;
                    int i16 = i12 + 1;
                    if ((bArr[i6] & 255) != c[i12]) {
                        return i9;
                    }
                    boolean z2 = i16 == i14;
                    if (i15 != i7) {
                        C12927v vVar4 = vVar3;
                        i3 = i7;
                        i4 = i15;
                        vVar = vVar4;
                    } else if (vVar3 != null) {
                        C12927v vVar5 = vVar3.f33198f;
                        if (vVar5 != null) {
                            i4 = vVar5.f33194b;
                            byte[] bArr2 = vVar5.f33193a;
                            i3 = vVar5.f33195c;
                            if (vVar5 != vVar2) {
                                byte[] bArr3 = bArr2;
                                vVar = vVar5;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                vVar = null;
                            }
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                    if (z2) {
                        i = c[i16];
                        i2 = i4;
                        i7 = i3;
                        vVar3 = vVar;
                        break;
                    }
                    i6 = i4;
                    i7 = i3;
                    i12 = i16;
                    vVar3 = vVar;
                }
            } else {
                int i17 = i6 + 1;
                byte b = bArr[i6] & 255;
                int i18 = i12 + i11;
                while (i12 != i18) {
                    if (b == c[i12]) {
                        i = c[i12 + i11];
                        if (i17 == i7) {
                            vVar3 = vVar3.f33198f;
                            if (vVar3 != null) {
                                i2 = vVar3.f33194b;
                                bArr = vVar3.f33193a;
                                i7 = vVar3.f33195c;
                                if (vVar3 == vVar2) {
                                    vVar3 = null;
                                }
                            } else {
                                C10202j.m34172a();
                                throw null;
                            }
                        } else {
                            i2 = i17;
                        }
                    } else {
                        i12++;
                    }
                }
                return i9;
            }
            if (i >= 0) {
                return i;
            }
            i8 = -i;
            i6 = i2;
            i5 = -2;
        }
        return z ? i5 : i9;
    }

    /* renamed from: c */
    public C12905f mo41160c(long j) {
        if (j == 0) {
            writeByte(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C12927v b = mo41156b(numberOfTrailingZeros);
        byte[] bArr = b.f33193a;
        int i = b.f33195c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f33147h[(int) (15 & j)];
            j >>>= 4;
        }
        b.f33195c += numberOfTrailingZeros;
        this.f33149g += (long) numberOfTrailingZeros;
        return this;
    }

    /* renamed from: b */
    public long mo41152b(C12911i iVar) {
        C10202j.m34178b(iVar, "targetBytes");
        return mo41153b(iVar, 0);
    }

    /* renamed from: b */
    public long mo41153b(C12911i iVar, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        C10202j.m34178b(iVar, "targetBytes");
        long j3 = 0;
        if (j >= 0) {
            C12927v vVar = this.f33148f;
            if (vVar == null) {
                return -1;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    vVar = vVar.f33199g;
                    if (vVar != null) {
                        j2 -= (long) (vVar.f33195c - vVar.f33194b);
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                }
                if (vVar != null) {
                    if (iVar.mo41239s() == 2) {
                        byte a = iVar.mo41216a(0);
                        byte a2 = iVar.mo41216a(1);
                        while (j2 < this.f33149g) {
                            byte[] bArr = vVar.f33193a;
                            i2 = (int) ((((long) vVar.f33194b) + j) - j2);
                            int i4 = vVar.f33195c;
                            while (i2 < i4) {
                                byte b = bArr[i2];
                                if (!(b == a || b == a2)) {
                                    i2++;
                                }
                            }
                            j2 += (long) (vVar.f33195c - vVar.f33194b);
                            vVar = vVar.f33198f;
                            if (vVar != null) {
                                j = j2;
                            } else {
                                C10202j.m34172a();
                                throw null;
                            }
                        }
                    } else {
                        byte[] o = iVar.mo41235o();
                        while (j2 < this.f33149g) {
                            byte[] bArr2 = vVar.f33193a;
                            i = (int) ((((long) vVar.f33194b) + j) - j2);
                            int i5 = vVar.f33195c;
                            while (i < i5) {
                                byte b2 = bArr2[i];
                                for (byte b3 : o) {
                                    if (b2 == b3) {
                                        i3 = vVar.f33194b;
                                        return ((long) (i2 - i3)) + j2;
                                    }
                                }
                                i++;
                            }
                            j2 += (long) (vVar.f33195c - vVar.f33194b);
                            vVar = vVar.f33198f;
                            if (vVar != null) {
                                j = j2;
                            } else {
                                C10202j.m34172a();
                                throw null;
                            }
                        }
                    }
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (vVar.f33195c - vVar.f33194b)) + j3;
                if (j4 > j) {
                    if (vVar != null) {
                        if (iVar.mo41239s() == 2) {
                            byte a3 = iVar.mo41216a(0);
                            byte a4 = iVar.mo41216a(1);
                            while (j2 < this.f33149g) {
                                byte[] bArr3 = vVar.f33193a;
                                int i6 = (int) ((((long) vVar.f33194b) + j) - j2);
                                int i7 = vVar.f33195c;
                                while (i2 < i7) {
                                    byte b4 = bArr3[i2];
                                    if (!(b4 == a3 || b4 == a4)) {
                                        i6 = i2 + 1;
                                    }
                                }
                                j3 = j2 + ((long) (vVar.f33195c - vVar.f33194b));
                                vVar = vVar.f33198f;
                                if (vVar != null) {
                                    j = j3;
                                } else {
                                    C10202j.m34172a();
                                    throw null;
                                }
                            }
                        } else {
                            byte[] o2 = iVar.mo41235o();
                            while (j2 < this.f33149g) {
                                byte[] bArr4 = vVar.f33193a;
                                int i8 = (int) ((((long) vVar.f33194b) + j) - j2);
                                int i9 = vVar.f33195c;
                                while (i < i9) {
                                    byte b5 = bArr4[i];
                                    int length = o2.length;
                                    int i10 = 0;
                                    while (i10 < length) {
                                        if (b5 != o2[i10]) {
                                            i10++;
                                        }
                                    }
                                    i8 = i + 1;
                                }
                                j3 = j2 + ((long) (vVar.f33195c - vVar.f33194b));
                                vVar = vVar.f33198f;
                                if (vVar != null) {
                                    j = j3;
                                } else {
                                    C10202j.m34172a();
                                    throw null;
                                }
                            }
                        }
                    }
                    return -1;
                }
                vVar = vVar.f33198f;
                if (vVar != null) {
                    j3 = j4;
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
            i3 = vVar.f33194b;
            return ((long) (i2 - i3)) + j2;
            i3 = vVar.f33194b;
            return ((long) (i2 - i3)) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    /* renamed from: a */
    public void mo41149a(C12905f fVar, long j) throws EOFException {
        C10202j.m34178b(fVar, "sink");
        long j2 = this.f33149g;
        if (j2 >= j) {
            fVar.write(this, j);
        } else {
            fVar.write(this, j2);
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public long mo41138a(C12932y yVar) throws IOException {
        C10202j.m34178b(yVar, "sink");
        long j = this.f33149g;
        if (j > 0) {
            yVar.write(this, j);
        }
        return j;
    }

    /* renamed from: a */
    public String mo41140a(Charset charset) {
        C10202j.m34178b(charset, "charset");
        return mo41139a(this.f33149g, charset);
    }

    /* renamed from: a */
    public String mo41139a(long j, Charset charset) throws EOFException {
        C10202j.m34178b(charset, "charset");
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f33149g < j) {
            throw new EOFException();
        } else if (j == 0) {
            return "";
        } else {
            C12927v vVar = this.f33148f;
            if (vVar != null) {
                int i = vVar.f33194b;
                if (((long) i) + j > ((long) vVar.f33195c)) {
                    return new String(mo41165e(j), charset);
                }
                int i2 = (int) j;
                String str = new String(vVar.f33193a, i, i2, charset);
                int i3 = vVar.f33194b + i2;
                vVar.f33194b = i3;
                this.f33149g -= j;
                if (i3 == vVar.f33195c) {
                    this.f33148f = vVar.mo41297b();
                    C12929w.m41739a(vVar);
                }
                return str;
            }
            C10202j.m34172a();
            throw null;
        }
    }

    /* renamed from: a */
    public C12905f mo41142a(String str, int i, int i2) {
        C10202j.m34178b(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            C12927v b = mo41156b(1);
                            byte[] bArr = b.f33193a;
                            int i3 = b.f33195c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i4 + i3] = (byte) charAt2;
                                i4++;
                            }
                            int i5 = b.f33195c;
                            int i6 = (i3 + i4) - i5;
                            b.f33195c = i5 + i6;
                            this.f33149g += (long) i6;
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                C12927v b2 = mo41156b(2);
                                byte[] bArr2 = b2.f33193a;
                                int i7 = b2.f33195c;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                b2.f33195c = i7 + 2;
                                this.f33149g += 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                C12927v b3 = mo41156b(3);
                                byte[] bArr3 = b3.f33193a;
                                int i8 = b3.f33195c;
                                bArr3[i8] = (byte) ((charAt >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                                b3.f33195c = i8 + 3;
                                this.f33149g += 3;
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    writeByte(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    C12927v b4 = mo41156b(4);
                                    byte[] bArr4 = b4.f33193a;
                                    int i11 = b4.f33195c;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    b4.f33195c = i11 + 4;
                                    this.f33149g += 4;
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* renamed from: a */
    public C12905f mo41144a(String str, Charset charset) {
        C10202j.m34178b(str, "string");
        C10202j.m34178b(charset, "charset");
        mo41143a(str, 0, str.length(), charset);
        return this;
    }

    /* renamed from: a */
    public C12905f mo41143a(String str, int i, int i2, Charset charset) {
        C10202j.m34178b(str, "string");
        C10202j.m34178b(charset, "charset");
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
                } else if (C10202j.m34176a((Object) charset, (Object) C12100c.f31866a)) {
                    mo41142a(str, i, i2);
                    return this;
                } else {
                    String substring = str.substring(i, i2);
                    C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (substring != null) {
                        byte[] bytes = substring.getBytes(charset);
                        C10202j.m34174a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        write(bytes, 0, bytes.length);
                        return this;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
    }

    /* renamed from: a */
    public long mo41135a(C12892a0 a0Var) throws IOException {
        C10202j.m34178b(a0Var, "source");
        long j = 0;
        while (true) {
            long read = a0Var.read(this, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* renamed from: a */
    public C12909g mo41146a(C12892a0 a0Var, long j) throws IOException {
        C10202j.m34178b(a0Var, "source");
        while (j > 0) {
            long read = a0Var.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    /* renamed from: a */
    public long mo41134a(byte b, long j, long j2) {
        long j3;
        int i;
        byte b2 = b;
        long j4 = j;
        long j5 = j2;
        long j6 = 0;
        if (0 <= j4 && j5 >= j4) {
            long j7 = this.f33149g;
            if (j5 > j7) {
                j5 = j7;
            }
            long j8 = -1;
            if (j4 == j5) {
                return -1;
            }
            C12927v vVar = this.f33148f;
            if (vVar == null) {
                return -1;
            }
            if (size() - j4 < j4) {
                j3 = size();
                while (j3 > j4) {
                    vVar = vVar.f33199g;
                    if (vVar != null) {
                        j3 -= (long) (vVar.f33195c - vVar.f33194b);
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                }
                if (vVar == null) {
                    return -1;
                }
                while (j3 < j5) {
                    byte[] bArr = vVar.f33193a;
                    int min = (int) Math.min((long) vVar.f33195c, (((long) vVar.f33194b) + j5) - j3);
                    i = (int) ((((long) vVar.f33194b) + j4) - j3);
                    while (i < min) {
                        if (bArr[i] != b2) {
                            i++;
                        }
                    }
                    j3 += (long) (vVar.f33195c - vVar.f33194b);
                    vVar = vVar.f33198f;
                    if (vVar != null) {
                        j4 = j3;
                        j8 = -1;
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                }
                return j8;
            }
            while (true) {
                long j9 = ((long) (vVar.f33195c - vVar.f33194b)) + j6;
                if (j9 <= j4) {
                    vVar = vVar.f33198f;
                    if (vVar != null) {
                        j6 = j9;
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                } else if (vVar == null) {
                    return -1;
                } else {
                    while (j3 < j5) {
                        byte[] bArr2 = vVar.f33193a;
                        int min2 = (int) Math.min((long) vVar.f33195c, (((long) vVar.f33194b) + j5) - j3);
                        int i2 = (int) ((((long) vVar.f33194b) + j4) - j3);
                        while (i < min2) {
                            if (bArr2[i] != b2) {
                                i2 = i + 1;
                            }
                        }
                        j6 = j3 + ((long) (vVar.f33195c - vVar.f33194b));
                        vVar = vVar.f33198f;
                        if (vVar != null) {
                            j4 = j6;
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    }
                    return -1;
                }
            }
            return ((long) (i - vVar.f33194b)) + j3;
        }
        throw new IllegalArgumentException(("size=" + this.f33149g + " fromIndex=" + j4 + " toIndex=" + j5).toString());
    }

    /* renamed from: a */
    public long mo41136a(C12911i iVar) throws IOException {
        C10202j.m34178b(iVar, "bytes");
        return mo41137a(iVar, 0);
    }

    /* renamed from: a */
    public long mo41137a(C12911i iVar, long j) throws IOException {
        int i;
        C12905f fVar = this;
        long j2 = j;
        C10202j.m34178b(iVar, "bytes");
        boolean z = true;
        if (iVar.mo41239s() > 0) {
            long j3 = 0;
            if (j2 < 0) {
                z = false;
            }
            if (z) {
                C12927v vVar = fVar.f33148f;
                if (vVar == null) {
                    return -1;
                }
                if (size() - j2 < j2) {
                    long size = size();
                    while (size > j2) {
                        vVar = vVar.f33199g;
                        if (vVar != null) {
                            size -= (long) (vVar.f33195c - vVar.f33194b);
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    }
                    if (vVar == null) {
                        return -1;
                    }
                    byte[] o = iVar.mo41235o();
                    byte b = o[0];
                    int s = iVar.mo41239s();
                    long j4 = (fVar.f33149g - ((long) s)) + 1;
                    long j5 = size;
                    C12927v vVar2 = vVar;
                    while (j5 < j4) {
                        byte[] bArr = vVar2.f33193a;
                        long j6 = j4;
                        int min = (int) Math.min((long) vVar2.f33195c, (((long) vVar2.f33194b) + j4) - j5);
                        int i2 = (int) ((((long) vVar2.f33194b) + j2) - j5);
                        while (i2 < min) {
                            if (bArr[i2] == b) {
                                i = s;
                                if (m41542a(vVar2, i2 + 1, o, 1, s)) {
                                    return ((long) (i2 - vVar2.f33194b)) + j5;
                                }
                            } else {
                                i = s;
                            }
                            i2++;
                            s = i;
                        }
                        int i3 = s;
                        j5 += (long) (vVar2.f33195c - vVar2.f33194b);
                        vVar2 = vVar2.f33198f;
                        if (vVar2 != null) {
                            j2 = j5;
                            j4 = j6;
                            s = i3;
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    }
                    return -1;
                }
                while (true) {
                    long j7 = ((long) (vVar.f33195c - vVar.f33194b)) + j3;
                    if (j7 <= j2) {
                        vVar = vVar.f33198f;
                        if (vVar != null) {
                            fVar = this;
                            j3 = j7;
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    } else if (vVar == null) {
                        return -1;
                    } else {
                        byte[] o2 = iVar.mo41235o();
                        byte b2 = o2[0];
                        int s2 = iVar.mo41239s();
                        long j8 = 1 + (fVar.f33149g - ((long) s2));
                        C12927v vVar3 = vVar;
                        while (j3 < j8) {
                            byte[] bArr2 = vVar3.f33193a;
                            long j9 = j8;
                            int min2 = (int) Math.min((long) vVar3.f33195c, (((long) vVar3.f33194b) + j8) - j3);
                            for (int i4 = (int) ((((long) vVar3.f33194b) + j2) - j3); i4 < min2; i4++) {
                                if (bArr2[i4] == b2) {
                                    if (m41542a(vVar3, i4 + 1, o2, 1, s2)) {
                                        return ((long) (i4 - vVar3.f33194b)) + j3;
                                    }
                                }
                            }
                            j3 += (long) (vVar3.f33195c - vVar3.f33194b);
                            vVar3 = vVar3.f33198f;
                            if (vVar3 != null) {
                                j2 = j3;
                                j8 = j9;
                            } else {
                                C10202j.m34172a();
                                throw null;
                            }
                        }
                        return -1;
                    }
                }
            } else {
                throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
            }
        } else {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
    }

    /* renamed from: a */
    public boolean mo41150a(long j, C12911i iVar) {
        C10202j.m34178b(iVar, "bytes");
        return mo41151a(j, iVar, 0, iVar.mo41239s());
    }

    /* renamed from: a */
    public boolean mo41151a(long j, C12911i iVar, int i, int i2) {
        C10202j.m34178b(iVar, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || this.f33149g - j < ((long) i2) || iVar.mo41239s() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo41163d(((long) i3) + j) != iVar.mo41216a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m41542a(C12927v vVar, int i, byte[] bArr, int i2, int i3) {
        int i4 = vVar.f33195c;
        byte[] bArr2 = vVar.f33193a;
        while (i2 < i3) {
            if (i == i4) {
                vVar = vVar.f33198f;
                if (vVar != null) {
                    byte[] bArr3 = vVar.f33193a;
                    int i5 = vVar.f33194b;
                    bArr2 = bArr3;
                    i = i5;
                    i4 = vVar.f33195c;
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: a */
    public final C12911i mo41147a(int i) {
        return i == 0 ? C12911i.f33158i : C12930x.f33203m.mo41303a(this, i);
    }

    /* renamed from: a */
    public final C12907b mo41141a(C12907b bVar) {
        C10202j.m34178b(bVar, "unsafeCursor");
        if (bVar.f33150f == null) {
            bVar.f33150f = this;
            bVar.f33151g = true;
            return bVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }
}
