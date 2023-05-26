package okhttp3.internal;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10185a0;
import kotlin.jvm.internal.C10201i;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p220g0.C9146c;
import kotlin.p262y.C10507e0;
import kotlin.p392j0.C12100c;
import kotlin.p392j0.C12113j;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p413s.C12892a0;
import p413s.C12905f;
import p413s.C12909g;
import p413s.C12910h;
import p413s.C12911i;
import p413s.C12920q;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u001a\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013\u001a'\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d\"\u00020\u001e¢\u0006\u0002\u0010\u001f\u001a\u0017\u0010 \u001a\u00020\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\"H\b\u001a-\u0010#\u001a\b\u0012\u0004\u0012\u0002H%0$\"\u0004\b\u0000\u0010%2\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u0002H%0\u001d\"\u0002H%H\u0007¢\u0006\u0002\u0010'\u001a1\u0010(\u001a\u0004\u0018\u0001H%\"\u0004\b\u0000\u0010%2\u0006\u0010)\u001a\u00020\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H%0+2\u0006\u0010,\u001a\u00020\u0011¢\u0006\u0002\u0010-\u001a\u0016\u0010.\u001a\u00020/2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u00100\u001a\u000201\u001a\u001f\u00102\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\"H\b\u001a\u0015\u00103\u001a\u00020\u000f*\u0002042\u0006\u00105\u001a\u00020\u000fH\u0004\u001a\u0015\u00103\u001a\u00020\u0013*\u00020\u000f2\u0006\u00105\u001a\u00020\u0013H\u0004\u001a\u0015\u00103\u001a\u00020\u000f*\u0002062\u0006\u00105\u001a\u00020\u000fH\u0004\u001a\n\u00107\u001a\u000208*\u000209\u001a\n\u0010:\u001a\u000201*\u00020\u0011\u001a\u0012\u0010;\u001a\u000201*\u00020<2\u0006\u0010=\u001a\u00020<\u001a\n\u0010>\u001a\u00020\u0017*\u00020?\u001a\n\u0010>\u001a\u00020\u0017*\u00020@\u001a\n\u0010>\u001a\u00020\u0017*\u00020A\u001a#\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d*\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u0010C\u001a\u00020\u0011¢\u0006\u0002\u0010D\u001a\n\u0010E\u001a\u00020\u0011*\u00020A\u001a&\u0010F\u001a\u00020\u000f*\u00020\u00112\u0006\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020\u000f2\b\b\u0002\u0010J\u001a\u00020\u000f\u001a&\u0010F\u001a\u00020\u000f*\u00020\u00112\u0006\u0010K\u001a\u00020\u00112\b\b\u0002\u0010I\u001a\u00020\u000f2\b\b\u0002\u0010J\u001a\u00020\u000f\u001a\u001a\u0010L\u001a\u000201*\u00020M2\u0006\u0010N\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u0015\u001a%\u0010P\u001a\u00020\u0017*\u00020Q2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\b\u0004\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\"H\b\u001a5\u0010R\u001a\u000201*\b\u0012\u0004\u0012\u00020\u00110\u001d2\u000e\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001d2\u000e\u0010S\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00110T¢\u0006\u0002\u0010U\u001a\n\u0010V\u001a\u00020\u0013*\u00020W\u001a+\u0010X\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u0010C\u001a\u00020\u00112\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00110T¢\u0006\u0002\u0010Y\u001a\n\u0010Z\u001a\u00020\u000f*\u00020\u0011\u001a\u001e\u0010[\u001a\u00020\u000f*\u00020\u00112\b\b\u0002\u0010I\u001a\u00020\u000f2\b\b\u0002\u0010J\u001a\u00020\u000f\u001a\u001e\u0010\\\u001a\u00020\u000f*\u00020\u00112\b\b\u0002\u0010I\u001a\u00020\u000f2\b\b\u0002\u0010J\u001a\u00020\u000f\u001a\u0014\u0010]\u001a\u00020\u000f*\u00020\u00112\b\b\u0002\u0010I\u001a\u00020\u000f\u001a9\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d*\b\u0012\u0004\u0012\u00020\u00110\u001d2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u000e\u0010S\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00110T¢\u0006\u0002\u0010_\u001a\u0012\u0010`\u001a\u00020\u0017*\u00020\u001e2\u0006\u0010a\u001a\u00020\u0013\u001a\r\u0010b\u001a\u00020\u0017*\u00020\u001eH\b\u001a\r\u0010c\u001a\u00020\u0017*\u00020\u001eH\b\u001a\n\u0010d\u001a\u00020\u000f*\u00020H\u001a\u0012\u0010e\u001a\u00020f*\u00020g2\u0006\u0010h\u001a\u00020f\u001a\n\u0010i\u001a\u00020\u000f*\u00020g\u001a\u0012\u0010j\u001a\u00020\u000f*\u00020k2\u0006\u0010l\u001a\u000204\u001a\u001a\u0010j\u001a\u000201*\u00020M2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u0015\u001a\u0010\u0010m\u001a\b\u0012\u0004\u0012\u00020n0$*\u00020\u0003\u001a\u0010\u0010o\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020n0$\u001a\n\u0010p\u001a\u00020\u0011*\u00020\u000f\u001a\n\u0010p\u001a\u00020\u0011*\u00020\u0013\u001a\u0014\u0010q\u001a\u00020\u0011*\u00020<2\b\b\u0002\u0010r\u001a\u000201\u001a\u001c\u0010s\u001a\b\u0012\u0004\u0012\u0002H%0$\"\u0004\b\u0000\u0010%*\b\u0012\u0004\u0012\u0002H%0$\u001a.\u0010t\u001a\u000e\u0012\u0004\u0012\u0002Hv\u0012\u0004\u0012\u0002Hw0u\"\u0004\b\u0000\u0010v\"\u0004\b\u0001\u0010w*\u000e\u0012\u0004\u0012\u0002Hv\u0012\u0004\u0012\u0002Hw0u\u001a\u0012\u0010x\u001a\u00020\u0013*\u00020\u00112\u0006\u0010y\u001a\u00020\u0013\u001a\u0014\u0010z\u001a\u00020\u000f*\u0004\u0018\u00010\u00112\u0006\u0010y\u001a\u00020\u000f\u001a\u001e\u0010{\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010I\u001a\u00020\u000f2\b\b\u0002\u0010J\u001a\u00020\u000f\u001a%\u0010|\u001a\u00020\u0017*\u00020Q2\u0006\u0010\u0010\u001a\u00020\u00112\u000e\b\u0004\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\"H\b\u001a\r\u0010}\u001a\u00020\u0017*\u00020\u001eH\b\u001a\u001c\u0010~\u001a\u00020\u0017*\u00020\u001e2\u0006\u0010N\u001a\u00020\u00132\b\b\u0002\u0010a\u001a\u00020\u000f\u001a\u0014\u0010\u001a\u00020\u0017*\u00030\u00012\u0007\u0010\u0001\u001a\u00020\u000f\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, mo16641d2 = {"EMPTY_BYTE_ARRAY", "", "EMPTY_HEADERS", "Lokhttp3/Headers;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "UNICODE_BOMS", "Lokio/Options;", "UTC", "Ljava/util/TimeZone;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "checkDuration", "", "name", "", "duration", "", "unit", "Ljava/util/concurrent/TimeUnit;", "checkOffsetAndCount", "", "arrayLength", "offset", "count", "format", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "ignoreIoExceptions", "block", "Lkotlin/Function0;", "immutableListOf", "", "T", "elements", "([Ljava/lang/Object;)Ljava/util/List;", "readFieldOrNull", "instance", "fieldType", "Ljava/lang/Class;", "fieldName", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "daemon", "", "threadName", "and", "", "mask", "", "asFactory", "Lokhttp3/EventListener$Factory;", "Lokhttp3/EventListener;", "canParseAsIpAddress", "canReuseConnectionFor", "Lokhttp3/HttpUrl;", "other", "closeQuietly", "Ljava/io/Closeable;", "Ljava/net/ServerSocket;", "Ljava/net/Socket;", "concat", "value", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "connectionName", "delimiterOffset", "delimiter", "", "startIndex", "endIndex", "delimiters", "discard", "Lokio/Source;", "timeout", "timeUnit", "execute", "Ljava/util/concurrent/Executor;", "hasIntersection", "comparator", "Ljava/util/Comparator;", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "headersContentLength", "Lokhttp3/Response;", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "indexOfControlOrNonAscii", "indexOfFirstNonAsciiWhitespace", "indexOfLastNonAsciiWhitespace", "indexOfNonWhitespace", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "lockAndWaitNanos", "nanos", "notify", "notifyAll", "parseHexDigit", "readBomAsCharset", "Ljava/nio/charset/Charset;", "Lokio/BufferedSource;", "default", "readMedium", "skipAll", "Lokio/Buffer;", "b", "toHeaderList", "Lokhttp3/internal/http2/Header;", "toHeaders", "toHexString", "toHostHeader", "includeDefaultPort", "toImmutableList", "toImmutableMap", "", "K", "V", "toLongOrDefault", "defaultValue", "toNonNegativeInt", "trimSubstring", "tryExecute", "wait", "waitMillis", "writeMedium", "Lokio/BufferedSink;", "medium", "okhttp"}, mo16642k = 2, mo16643mv = {1, 1, 15})
/* compiled from: Util.kt */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final Headers EMPTY_HEADERS = Headers.Companion.mo39410of(new String[0]);
    public static final RequestBody EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, EMPTY_BYTE_ARRAY, (MediaType) null, 0, 0, 7, (Object) null);
    public static final ResponseBody EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, EMPTY_BYTE_ARRAY, (MediaType) null, 1, (Object) null);
    private static final C12920q UNICODE_BOMS = C12920q.f33175h.mo41273a(C12911i.f33159j.mo41248b("efbbbf"), C12911i.f33159j.mo41248b("feff"), C12911i.f33159j.mo41248b("fffe"), C12911i.f33159j.mo41248b("0000ffff"), C12911i.f33159j.mo41248b("ffff0000"));
    public static final TimeZone UTC;
    private static final C12113j VERIFY_AS_IP_ADDRESS = new C12113j("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        if (timeZone != null) {
            UTC = timeZone;
            return;
        }
        C10202j.m34172a();
        throw null;
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final long and(int i, long j) {
        return j & ((long) i);
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        C10202j.m34178b(eventListener, "$this$asFactory");
        return new Util$asFactory$1(eventListener);
    }

    public static final boolean canParseAsIpAddress(String str) {
        C10202j.m34178b(str, "$this$canParseAsIpAddress");
        return VERIFY_AS_IP_ADDRESS.mo38744b(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        C10202j.m34178b(httpUrl, "$this$canReuseConnectionFor");
        C10202j.m34178b(httpUrl2, "other");
        return C10202j.m34176a((Object) httpUrl.host(), (Object) httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && C10202j.m34176a((Object) httpUrl.scheme(), (Object) httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        C10202j.m34178b(str, "name");
        boolean z = true;
        if (j >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= ((long) Integer.MAX_VALUE)) {
                    if (millis == 0 && j > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException((str + " too small.").toString());
                }
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException((str + " < 0").toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        C10202j.m34178b(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        C10202j.m34178b(strArr, "$this$concat");
        C10202j.m34178b(str, DonationsAnalytics.VALUE);
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C10202j.m34174a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C10519k.m35649g(strArr2)] = str;
        if (strArr2 != null) {
            return strArr2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
    }

    public static final String connectionName(Socket socket) {
        C10202j.m34178b(socket, "$this$connectionName");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        C10202j.m34174a((Object) hostName, "address.hostName");
        return hostName;
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        C10202j.m34178b(str, "$this$delimiterOffset");
        C10202j.m34178b(str2, "delimiters");
        while (i < i2) {
            if (C12131w.m40082a((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(C12892a0 a0Var, int i, TimeUnit timeUnit) {
        C10202j.m34178b(a0Var, "$this$discard");
        C10202j.m34178b(timeUnit, "timeUnit");
        try {
            return skipAll(a0Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void execute(Executor executor, String str, C9102a<C10483v> aVar) {
        C10202j.m34178b(executor, "$this$execute");
        C10202j.m34178b(str, "name");
        C10202j.m34178b(aVar, "block");
        executor.execute(new Util$execute$1(str, aVar));
    }

    public static final String format(String str, Object... objArr) {
        C10202j.m34178b(str, "format");
        C10202j.m34178b(objArr, "args");
        C10185a0 a0Var = C10185a0.f27833a;
        Locale locale = Locale.US;
        C10202j.m34174a((Object) locale, "Locale.US");
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C10202j.m34174a((Object) format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C10202j.m34178b(strArr, "$this$hasIntersection");
        C10202j.m34178b(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        C10202j.m34178b(response, "$this$headersContentLength");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1);
        }
        return -1;
    }

    public static final void ignoreIoExceptions(C9102a<C10483v> aVar) {
        C10202j.m34178b(aVar, "block");
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        C10202j.m34178b(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, objArr.length)));
        C10202j.m34174a((Object) unmodifiableList, "Collections.unmodifiable…sList(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        C10202j.m34178b(strArr, "$this$indexOf");
        C10202j.m34178b(str, DonationsAnalytics.VALUE);
        C10202j.m34178b(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        C10202j.m34178b(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        C10202j.m34178b(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        C10202j.m34178b(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        C10202j.m34178b(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C10202j.m34178b(strArr, "$this$intersect");
        C10202j.m34178b(strArr2, "other");
        C10202j.m34178b(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final void lockAndWaitNanos(Object obj, long j) throws InterruptedException {
        C10202j.m34178b(obj, "$this$lockAndWaitNanos");
        long j2 = j / 1000000;
        long j3 = j - (1000000 * j2);
        synchronized (obj) {
            waitMillis(obj, j2, (int) j3);
            C10483v vVar = C10483v.f28357a;
        }
    }

    public static final void notify(Object obj) {
        C10202j.m34178b(obj, "$this$notify");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        C10202j.m34178b(obj, "$this$notifyAll");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static final Charset readBomAsCharset(C12910h hVar, Charset charset) throws IOException {
        C10202j.m34178b(hVar, "$this$readBomAsCharset");
        C10202j.m34178b(charset, BuildConfig.APTOIDE_THEME);
        int a = hVar.mo41132a(UNICODE_BOMS);
        if (a == -1) {
            return charset;
        }
        if (a == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            C10202j.m34174a((Object) charset2, "UTF_8");
            return charset2;
        } else if (a == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            C10202j.m34174a((Object) charset3, "UTF_16BE");
            return charset3;
        } else if (a == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            C10202j.m34174a((Object) charset4, "UTF_16LE");
            return charset4;
        } else if (a == 3) {
            return C12100c.f31869d.mo38724a();
        } else {
            if (a == 4) {
                return C12100c.f31869d.mo38725b();
            }
            throw new AssertionError();
        }
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        Object readFieldOrNull;
        Class<Object> cls2 = Object.class;
        C10202j.m34178b(obj, "instance");
        C10202j.m34178b(cls, "fieldType");
        C10202j.m34178b(str, "fieldName");
        Class cls3 = obj.getClass();
        while (!C10202j.m34176a((Object) cls3, (Object) cls2)) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                C10202j.m34174a((Object) declaredField, "field");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    return null;
                }
                return cls.cast(obj2);
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
                C10202j.m34174a((Object) cls3, "c.superclass");
            }
        }
        if (!(!C10202j.m34176a((Object) str, (Object) "delegate")) || (readFieldOrNull = readFieldOrNull(obj, cls2, "delegate")) == null) {
            return null;
        }
        return readFieldOrNull(readFieldOrNull, cls, str);
    }

    public static final int readMedium(C12910h hVar) throws IOException {
        C10202j.m34178b(hVar, "$this$readMedium");
        return and(hVar.readByte(), 255) | (and(hVar.readByte(), 255) << 16) | (and(hVar.readByte(), 255) << 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r11.timeout().clearDeadline();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r11.timeout().deadlineNanoTime(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean skipAll(p413s.C12892a0 r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /*
            java.lang.String r0 = "$this$skipAll"
            kotlin.jvm.internal.C10202j.m34178b(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.C10202j.m34178b(r13, r0)
            long r0 = java.lang.System.nanoTime()
            s.b0 r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            s.b0 r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            s.b0 r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            s.f r12 = new s.f     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x004e
            r12.mo41157b()     // Catch:{ InterruptedIOException -> 0x007a, all -> 0x0064 }
            goto L_0x003e
        L_0x004e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
        L_0x0053:
            s.b0 r11 = r11.timeout()
            r11.clearDeadline()
            goto L_0x0081
        L_0x005b:
            s.b0 r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
            goto L_0x0081
        L_0x0064:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0071
            s.b0 r11 = r11.timeout()
            r11.clearDeadline()
            goto L_0x0079
        L_0x0071:
            s.b0 r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L_0x0079:
            throw r12
        L_0x007a:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
            goto L_0x0053
        L_0x0081:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.skipAll(s.a0, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory threadFactory(String str, boolean z) {
        C10202j.m34178b(str, "name");
        return new Util$threadFactory$1(str, z);
    }

    public static final void threadName(String str, C9102a<C10483v> aVar) {
        C10202j.m34178b(str, "name");
        C10202j.m34178b(aVar, "block");
        Thread currentThread = Thread.currentThread();
        C10202j.m34174a((Object) currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            C10201i.m34167b(1);
            currentThread.setName(name);
            C10201i.m34166a(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        C10202j.m34178b(headers, "$this$toHeaderList");
        C9146c d = C9150f.m29854d(0, headers.size());
        ArrayList arrayList = new ArrayList(C10531p.m35750a(d, 10));
        Iterator it = d.iterator();
        while (it.hasNext()) {
            int a = ((C10507e0) it).mo33492a();
            arrayList.add(new Header(headers.name(a), headers.value(a)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        C10202j.m34178b(list, "$this$toHeaders");
        Headers.Builder builder = new Headers.Builder();
        for (Header next : list) {
            builder.addLenient$okhttp(next.component1().mo41242v(), next.component2().mo41242v());
        }
        return builder.build();
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        C10202j.m34174a((Object) hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String str;
        C10202j.m34178b(httpUrl, "$this$toHostHeader");
        if (C12131w.m40085a((CharSequence) httpUrl.host(), (CharSequence) ":", false, 2, (Object) null)) {
            str = '[' + httpUrl.host() + ']';
        } else {
            str = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return str;
        }
        return str + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        C10202j.m34178b(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(C10539w.m35789c(list));
        C10202j.m34174a((Object) unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        C10202j.m34178b(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return C10518j0.m35601a();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C10202j.m34174a((Object) unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j) {
        C10202j.m34178b(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String trimSubstring(String str, int i, int i2) {
        C10202j.m34178b(str, "$this$trimSubstring");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        C10202j.m34174a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void tryExecute(Executor executor, String str, C9102a<C10483v> aVar) {
        C10202j.m34178b(executor, "$this$tryExecute");
        C10202j.m34178b(str, "name");
        C10202j.m34178b(aVar, "block");
        try {
            executor.execute(new Util$execute$1(str, aVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    public static final void wait(Object obj) {
        C10202j.m34178b(obj, "$this$wait");
        obj.wait();
    }

    public static final void waitMillis(Object obj, long j, int i) {
        C10202j.m34178b(obj, "$this$waitMillis");
        if (j > 0 || i > 0) {
            obj.wait(j, i);
        }
    }

    public static /* synthetic */ void waitMillis$default(Object obj, long j, int i, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        waitMillis(obj, j, i);
    }

    public static final void writeMedium(C12909g gVar, int i) throws IOException {
        C10202j.m34178b(gVar, "$this$writeMedium");
        gVar.writeByte((i >>> 16) & 255);
        gVar.writeByte((i >>> 8) & 255);
        gVar.writeByte(i & 255);
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        C10202j.m34178b(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        C10202j.m34174a((Object) hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final void closeQuietly(Socket socket) {
        C10202j.m34178b(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        C10202j.m34178b(serverSocket, "$this$closeQuietly");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(C12905f fVar, byte b) {
        C10202j.m34178b(fVar, "$this$skipAll");
        int i = 0;
        while (!fVar.mo41169g() && fVar.mo41163d(0) == b) {
            i++;
            fVar.readByte();
        }
        return i;
    }
}
