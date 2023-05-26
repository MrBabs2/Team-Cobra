package okhttp3.logging;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.C4789l;
import kotlin.jvm.internal.C10185a0;
import kotlin.jvm.internal.C10202j;
import kotlin.p257io.C10182a;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import p413s.C12892a0;
import p413s.C12905f;
import p413s.C12910h;
import p413s.C12916m;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\r\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0007J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\n\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u0007\n\u0005\bF0\u0001¨\u0006 "}, mo16641d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "headersToRedact", "", "", "<set-?>", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "getLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "bodyHasUnknownEncoding", "", "headers", "Lokhttp3/Headers;", "-deprecated_level", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "logHeader", "", "i", "", "redactHeader", "name", "setLevel", "Level", "Logger", "okhttp-logging-interceptor"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: HttpLoggingInterceptor.kt */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo16641d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: HttpLoggingInterceptor.kt */
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0002\u0007\n\u0005\bF0\u0001¨\u0006\u0007"}, mo16641d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "log", "", "message", "", "Companion", "okhttp-logging-interceptor"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: HttpLoggingInterceptor.kt */
    public interface Logger {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final Logger DEFAULT = new HttpLoggingInterceptor$Logger$Companion$DEFAULT$1();

        @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0002\u0007\n\u0005\bF0\u0001¨\u0006\u0005"}, mo16641d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "okhttp-logging-interceptor"}, mo16642k = 1, mo16643mv = {1, 1, 15})
        /* compiled from: HttpLoggingInterceptor.kt */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = null;

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        void log(String str);
    }

    public HttpLoggingInterceptor() {
        this((Logger) null, 1, (DefaultConstructorMarker) null);
    }

    public HttpLoggingInterceptor(Logger logger2) {
        C10202j.m34178b(logger2, "logger");
        this.logger = logger2;
        this.headersToRedact = C10530o0.m35747a();
        this.level = Level.NONE;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        if (str == null || C12130v.m40053b(str, "identity", true) || C12130v.m40053b(str, "gzip", true)) {
            return false;
        }
        return true;
    }

    private final void logHeader(Headers headers, int i) {
        String value = this.headersToRedact.contains(headers.name(i)) ? "██" : headers.value(i);
        Logger logger2 = this.logger;
        logger2.log(headers.name(i) + ": " + value);
    }

    /* renamed from: -deprecated_level  reason: not valid java name */
    public final Level m42079deprecated_level() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l;
        Charset charset;
        Throwable th;
        Charset charset2;
        Interceptor.Chain chain2 = chain;
        C10202j.m34178b(chain2, "chain");
        Level level2 = this.level;
        Request request = chain.request();
        if (level2 == Level.NONE) {
            return chain2.proceed(request);
        }
        boolean z = level2 == Level.BODY;
        boolean z2 = z || level2 == Level.HEADERS;
        RequestBody body = request.body();
        Connection connection = chain.connection();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(request.method());
        sb.append(' ');
        sb.append(request.url());
        if (connection != null) {
            str = " " + connection.protocol();
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        if (!z2 && body != null) {
            sb2 = sb2 + " (" + body.contentLength() + "-byte body)";
        }
        this.logger.log(sb2);
        if (z2) {
            Headers headers = request.headers();
            if (body != null) {
                MediaType contentType = body.contentType();
                if (contentType != null && headers.get("Content-Type") == null) {
                    this.logger.log("Content-Type: " + contentType);
                }
                if (body.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log("Content-Length: " + body.contentLength());
                }
            }
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                logHeader(headers, i);
            }
            if (!z || body == null) {
                this.logger.log("--> END " + request.method());
            } else if (bodyHasUnknownEncoding(request.headers())) {
                this.logger.log("--> END " + request.method() + " (encoded body omitted)");
            } else if (body.isDuplex()) {
                this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
            } else {
                C12905f fVar = new C12905f();
                body.writeTo(fVar);
                MediaType contentType2 = body.contentType();
                if (contentType2 == null || (charset2 = contentType2.charset(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    C10202j.m34174a((Object) charset2, "UTF_8");
                }
                this.logger.log("");
                if (Utf8Kt.isProbablyUtf8(fVar)) {
                    this.logger.log(fVar.mo41140a(charset2));
                    this.logger.log("--> END " + request.method() + " (" + body.contentLength() + "-byte body)");
                } else {
                    this.logger.log("--> END " + request.method() + " (binary " + body.contentLength() + "-byte body omitted)");
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain2.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            if (body2 != null) {
                long contentLength = body2.contentLength();
                if (contentLength != -1) {
                    str2 = contentLength + "-byte";
                } else {
                    str2 = "unknown-length";
                }
                Logger logger2 = this.logger;
                String str6 = "-byte body)";
                StringBuilder sb3 = new StringBuilder();
                long j = contentLength;
                sb3.append("<-- ");
                sb3.append(proceed.code());
                if (proceed.message().length() == 0) {
                    str3 = "-byte body omitted)";
                    str4 = "";
                } else {
                    String message = proceed.message();
                    StringBuilder sb4 = new StringBuilder();
                    str3 = "-byte body omitted)";
                    sb4.append(String.valueOf(' '));
                    sb4.append(message);
                    str4 = sb4.toString();
                }
                sb3.append(str4);
                sb3.append(' ');
                sb3.append(proceed.request().url());
                sb3.append(" (");
                sb3.append(millis);
                sb3.append("ms");
                if (!z2) {
                    str5 = ", " + str2 + " body";
                } else {
                    str5 = "";
                }
                sb3.append(str5);
                sb3.append(')');
                logger2.log(sb3.toString());
                if (z2) {
                    Headers headers2 = proceed.headers();
                    int size2 = headers2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        logHeader(headers2, i2);
                    }
                    if (!z || !HttpHeaders.promisesBody(proceed)) {
                        this.logger.log("<-- END HTTP");
                    } else if (bodyHasUnknownEncoding(proceed.headers())) {
                        this.logger.log("<-- END HTTP (encoded body omitted)");
                    } else {
                        C12910h source = body2.source();
                        source.request(Long.MAX_VALUE);
                        C12905f buffer = source.getBuffer();
                        if (C12130v.m40053b("gzip", headers2.get("Content-Encoding"), true)) {
                            Long valueOf = Long.valueOf(buffer.size());
                            C12916m mVar = new C12916m(buffer.clone());
                            try {
                                buffer = new C12905f();
                                buffer.mo41135a((C12892a0) mVar);
                                C10182a.m34136a(mVar, (Throwable) null);
                                l = valueOf;
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                C10182a.m34136a(mVar, th);
                                throw th3;
                            }
                        } else {
                            l = null;
                        }
                        MediaType contentType3 = body2.contentType();
                        if (contentType3 == null || (charset = contentType3.charset(StandardCharsets.UTF_8)) == null) {
                            charset = StandardCharsets.UTF_8;
                            C10202j.m34174a((Object) charset, "UTF_8");
                        }
                        if (!Utf8Kt.isProbablyUtf8(buffer)) {
                            this.logger.log("");
                            this.logger.log("<-- END HTTP (binary " + buffer.size() + str3);
                            return proceed;
                        }
                        if (j != 0) {
                            this.logger.log("");
                            this.logger.log(buffer.clone().mo41140a(charset));
                        }
                        if (l != null) {
                            this.logger.log("<-- END HTTP (" + buffer.size() + "-byte, " + l + "-gzipped-byte body)");
                        } else {
                            this.logger.log("<-- END HTTP (" + buffer.size() + str6);
                        }
                    }
                }
                return proceed;
            }
            C10202j.m34172a();
            throw null;
        } catch (Exception e) {
            Exception exc = e;
            this.logger.log("<-- HTTP FAILED: " + exc);
            throw exc;
        }
    }

    public final void level(Level level2) {
        C10202j.m34178b(level2, "<set-?>");
        this.level = level2;
    }

    public final void redactHeader(String str) {
        C10202j.m34178b(str, "name");
        TreeSet treeSet = new TreeSet(C12130v.m40046a(C10185a0.f27833a));
        boolean unused = C10536t.m35760a(treeSet, this.headersToRedact);
        treeSet.add(str);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level2) {
        C10202j.m34178b(level2, "level");
        this.level = level2;
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HttpLoggingInterceptor(Logger logger2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Logger.DEFAULT : logger2);
    }
}
