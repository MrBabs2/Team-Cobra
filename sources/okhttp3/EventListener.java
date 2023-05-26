package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 92\u00020\u0001:\u00029:B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J*\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J2\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0011\u0010\u001b\u001a\r\u0012\t\u0012\u00070\u001d¢\u0006\u0002\b\u001e0\u001cH\u0016J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J+\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"2\u0011\u0010#\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u001e0\u001cH\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u00100\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00102\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u00105\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00108\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006;"}, mo16641d2 = {"Lokhttp3/EventListener;", "", "()V", "callEnd", "", "call", "Lokhttp3/Call;", "callFailed", "ioe", "Ljava/io/IOException;", "callStart", "connectEnd", "inetSocketAddress", "Ljava/net/InetSocketAddress;", "proxy", "Ljava/net/Proxy;", "protocol", "Lokhttp3/Protocol;", "connectFailed", "connectStart", "connectionAcquired", "connection", "Lokhttp3/Connection;", "connectionReleased", "dnsEnd", "domainName", "", "inetAddressList", "", "Ljava/net/InetAddress;", "Lkotlin/jvm/JvmSuppressWildcards;", "dnsStart", "proxySelectEnd", "url", "Lokhttp3/HttpUrl;", "proxies", "proxySelectStart", "requestBodyEnd", "byteCount", "", "requestBodyStart", "requestFailed", "requestHeadersEnd", "request", "Lokhttp3/Request;", "requestHeadersStart", "responseBodyEnd", "responseBodyStart", "responseFailed", "responseHeadersEnd", "response", "Lokhttp3/Response;", "responseHeadersStart", "secureConnectEnd", "handshake", "Lokhttp3/Handshake;", "secureConnectStart", "Companion", "Factory", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: EventListener.kt */
public abstract class EventListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final EventListener NONE = new EventListener$Companion$NONE$1();

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo16641d2 = {"Lokhttp3/EventListener$Companion;", "", "()V", "NONE", "Lokhttp3/EventListener;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: EventListener.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo16641d2 = {"Lokhttp3/EventListener$Factory;", "", "create", "Lokhttp3/EventListener;", "call", "Lokhttp3/Call;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: EventListener.kt */
    public interface Factory {
        EventListener create(Call call);
    }

    public void callEnd(Call call) {
        C10202j.m34178b(call, "call");
    }

    public void callFailed(Call call, IOException iOException) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(iOException, "ioe");
    }

    public void callStart(Call call) {
        C10202j.m34178b(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(inetSocketAddress, "inetSocketAddress");
        C10202j.m34178b(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(inetSocketAddress, "inetSocketAddress");
        C10202j.m34178b(proxy, "proxy");
        C10202j.m34178b(iOException, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(inetSocketAddress, "inetSocketAddress");
        C10202j.m34178b(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(connection, "connection");
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(str, "domainName");
        C10202j.m34178b(list, "inetAddressList");
    }

    public void dnsStart(Call call, String str) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(str, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(httpUrl, "url");
        C10202j.m34178b(list, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(httpUrl, "url");
    }

    public void requestBodyEnd(Call call, long j) {
        C10202j.m34178b(call, "call");
    }

    public void requestBodyStart(Call call) {
        C10202j.m34178b(call, "call");
    }

    public void requestFailed(Call call, IOException iOException) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(iOException, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(request, "request");
    }

    public void requestHeadersStart(Call call) {
        C10202j.m34178b(call, "call");
    }

    public void responseBodyEnd(Call call, long j) {
        C10202j.m34178b(call, "call");
    }

    public void responseBodyStart(Call call) {
        C10202j.m34178b(call, "call");
    }

    public void responseFailed(Call call, IOException iOException) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(iOException, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        C10202j.m34178b(call, "call");
        C10202j.m34178b(response, "response");
    }

    public void responseHeadersStart(Call call) {
        C10202j.m34178b(call, "call");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        C10202j.m34178b(call, "call");
    }

    public void secureConnectStart(Call call) {
        C10202j.m34178b(call, "call");
    }
}
