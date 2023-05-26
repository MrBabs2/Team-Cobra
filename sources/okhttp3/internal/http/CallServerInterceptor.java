package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealConnection;
import p413s.C12909g;
import p413s.C12919p;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo16641d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: CallServerInterceptor.kt */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        Response.Builder builder;
        Response response;
        C10202j.m34178b(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.exchange();
        Request request = realInterceptorChain.request();
        RequestBody body = request.body();
        long currentTimeMillis = System.currentTimeMillis();
        exchange.writeRequestHeaders(request);
        Long l = null;
        if (!HttpMethod.permitsRequestBody(request.method()) || body == null) {
            exchange.noRequestBody();
            builder = null;
            z = false;
        } else {
            if (C12130v.m40053b("100-continue", request.header("Expect"), true)) {
                exchange.flushRequest();
                exchange.responseHeadersStart();
                builder = exchange.readResponseHeaders(true);
                z = true;
            } else {
                builder = null;
                z = false;
            }
            if (builder != null) {
                exchange.noRequestBody();
                RealConnection connection = exchange.connection();
                if (connection == null) {
                    C10202j.m34172a();
                    throw null;
                } else if (!connection.isMultiplexed()) {
                    exchange.noNewExchangesOnConnection();
                }
            } else if (body.isDuplex()) {
                exchange.flushRequest();
                body.writeTo(C12919p.m41674a(exchange.createRequestBody(request, true)));
            } else {
                C12909g a = C12919p.m41674a(exchange.createRequestBody(request, false));
                body.writeTo(a);
                a.close();
            }
        }
        if (body == null || !body.isDuplex()) {
            exchange.finishRequest();
        }
        if (!z) {
            exchange.responseHeadersStart();
        }
        if (builder == null && (builder = exchange.readResponseHeaders(false)) == null) {
            C10202j.m34172a();
            throw null;
        }
        Response.Builder request2 = builder.request(request);
        RealConnection connection2 = exchange.connection();
        if (connection2 != null) {
            Response build = request2.handshake(connection2.handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            int code = build.code();
            if (code == 100) {
                Response.Builder readResponseHeaders = exchange.readResponseHeaders(false);
                if (readResponseHeaders != null) {
                    Response.Builder request3 = readResponseHeaders.request(request);
                    RealConnection connection3 = exchange.connection();
                    if (connection3 != null) {
                        build = request3.handshake(connection3.handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                        code = build.code();
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
            exchange.responseHeadersEnd(build);
            if (!this.forWebSocket || code != 101) {
                response = build.newBuilder().body(exchange.openResponseBody(build)).build();
            } else {
                response = build.newBuilder().body(Util.EMPTY_RESPONSE).build();
            }
            if (C12130v.m40053b("close", response.request().header("Connection"), true) || C12130v.m40053b("close", Response.header$default(response, "Connection", (String) null, 2, (Object) null), true)) {
                exchange.noNewExchangesOnConnection();
            }
            if (code == 204 || code == 205) {
                ResponseBody body2 = response.body();
                if ((body2 != null ? body2.contentLength() : -1) > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("HTTP ");
                    sb.append(code);
                    sb.append(" had non-zero Content-Length: ");
                    ResponseBody body3 = response.body();
                    if (body3 != null) {
                        l = Long.valueOf(body3.contentLength());
                    }
                    sb.append(l);
                    throw new ProtocolException(sb.toString());
                }
            }
            return response;
        }
        C10202j.m34172a();
        throw null;
    }
}
