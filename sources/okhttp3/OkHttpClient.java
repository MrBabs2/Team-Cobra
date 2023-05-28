package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9113l;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.p398ws.RealWebSocket;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002opB\u0007\b\u0016¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\bLJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\bMJ\r\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\bNJ\r\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\bOJ\r\u0010\u0017\u001a\u00020\u000fH\u0007¢\u0006\u0002\bPJ\r\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\bQJ\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0007¢\u0006\u0002\bRJ\r\u0010\u001f\u001a\u00020 H\u0007¢\u0006\u0002\bSJ\r\u0010\"\u001a\u00020#H\u0007¢\u0006\u0002\bTJ\r\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\bUJ\r\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\bVJ\r\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\bWJ\r\u0010.\u001a\u00020,H\u0007¢\u0006\u0002\bXJ\r\u0010/\u001a\u000200H\u0007¢\u0006\u0002\bYJ\u0013\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0002\bZJ\u0013\u00104\u001a\b\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0002\b[J\b\u0010\\\u001a\u00020\u0006H\u0016J\u0010\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`H\u0016J\u0018\u0010a\u001a\u00020b2\u0006\u0010_\u001a\u00020`2\u0006\u0010c\u001a\u00020dH\u0016J\r\u00105\u001a\u00020\u000fH\u0007¢\u0006\u0002\beJ\u0013\u00106\u001a\b\u0012\u0004\u0012\u0002070\u001cH\u0007¢\u0006\u0002\bfJ\u000f\u00108\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\bgJ\r\u0010;\u001a\u00020\tH\u0007¢\u0006\u0002\bhJ\r\u0010<\u001a\u00020=H\u0007¢\u0006\u0002\biJ\r\u0010?\u001a\u00020\u000fH\u0007¢\u0006\u0002\bjJ\r\u0010@\u001a\u00020,H\u0007¢\u0006\u0002\bkJ\r\u0010A\u001a\u00020BH\u0007¢\u0006\u0002\blJ\r\u0010D\u001a\u00020EH\u0007¢\u0006\u0002\bmJ\r\u0010H\u001a\u00020\u000fH\u0007¢\u0006\u0002\bnR\u0013\u0010\b\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f8G¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0013\u0010\u000e\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00128G¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0013\u0010\u0014\u001a\u00020\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0016R\u0013\u0010\u0017\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0018\u001a\u00020\u00198G¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001eR\u0013\u0010\u001f\u001a\u00020 8G¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010!R\u0013\u0010\"\u001a\u00020#8G¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010$R\u0013\u0010%\u001a\u00020&8G¢\u0006\b\n\u0000\u001a\u0004\b%\u0010'R\u0013\u0010(\u001a\u00020)8G¢\u0006\b\n\u0000\u001a\u0004\b(\u0010*R\u0013\u0010+\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\b+\u0010-R\u0013\u0010.\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010/\u001a\u0002008G¢\u0006\b\n\u0000\u001a\u0004\b/\u00101R\u0019\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0019\u00104\u001a\b\u0012\u0004\u0012\u0002030\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001eR\u0013\u00105\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0010R\u0019\u00106\u001a\b\u0012\u0004\u0012\u0002070\u001c8G¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001eR\u0015\u00108\u001a\u0004\u0018\u0001098G¢\u0006\b\n\u0000\u001a\u0004\b8\u0010:R\u0013\u0010;\u001a\u00020\t8G¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\nR\u0013\u0010<\u001a\u00020=8G¢\u0006\b\n\u0000\u001a\u0004\b<\u0010>R\u0013\u0010?\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0010R\u0013\u0010@\u001a\u00020,8G¢\u0006\b\n\u0000\u001a\u0004\b@\u0010-R\u0013\u0010A\u001a\u00020B8G¢\u0006\b\n\u0000\u001a\u0004\bA\u0010CR\u0011\u0010D\u001a\u00020E8G¢\u0006\u0006\u001a\u0004\bD\u0010FR\u0010\u0010G\u001a\u0004\u0018\u00010EX\u0004¢\u0006\u0002\n\u0000R\u0013\u0010H\u001a\u00020\u000f8G¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0010R\u0015\u0010I\u001a\u0004\u0018\u00010J8G¢\u0006\b\n\u0000\u001a\u0004\bI\u0010K¨\u0006q"}, mo16641d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "()V", "builder", "Lokhttp3/OkHttpClient$Builder;", "(Lokhttp3/OkHttpClient$Builder;)V", "authenticator", "Lokhttp3/Authenticator;", "()Lokhttp3/Authenticator;", "cache", "Lokhttp3/Cache;", "()Lokhttp3/Cache;", "callTimeoutMillis", "", "()I", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "certificatePinner", "Lokhttp3/CertificatePinner;", "()Lokhttp3/CertificatePinner;", "connectTimeoutMillis", "connectionPool", "Lokhttp3/ConnectionPool;", "()Lokhttp3/ConnectionPool;", "connectionSpecs", "", "Lokhttp3/ConnectionSpec;", "()Ljava/util/List;", "cookieJar", "Lokhttp3/CookieJar;", "()Lokhttp3/CookieJar;", "dispatcher", "Lokhttp3/Dispatcher;", "()Lokhttp3/Dispatcher;", "dns", "Lokhttp3/Dns;", "()Lokhttp3/Dns;", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "()Lokhttp3/EventListener$Factory;", "followRedirects", "", "()Z", "followSslRedirects", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "interceptors", "Lokhttp3/Interceptor;", "networkInterceptors", "pingIntervalMillis", "protocols", "Lokhttp3/Protocol;", "proxy", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxyAuthenticator", "proxySelector", "Ljava/net/ProxySelector;", "()Ljava/net/ProxySelector;", "readTimeoutMillis", "retryOnConnectionFailure", "socketFactory", "Ljavax/net/SocketFactory;", "()Ljavax/net/SocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "writeTimeoutMillis", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "-deprecated_authenticator", "-deprecated_cache", "-deprecated_callTimeoutMillis", "-deprecated_certificatePinner", "-deprecated_connectTimeoutMillis", "-deprecated_connectionPool", "-deprecated_connectionSpecs", "-deprecated_cookieJar", "-deprecated_dispatcher", "-deprecated_dns", "-deprecated_eventListenerFactory", "-deprecated_followRedirects", "-deprecated_followSslRedirects", "-deprecated_hostnameVerifier", "-deprecated_interceptors", "-deprecated_networkInterceptors", "newBuilder", "newCall", "Lokhttp3/Call;", "request", "Lokhttp3/Request;", "newWebSocket", "Lokhttp3/WebSocket;", "listener", "Lokhttp3/WebSocketListener;", "-deprecated_pingIntervalMillis", "-deprecated_protocols", "-deprecated_proxy", "-deprecated_proxyAuthenticator", "-deprecated_proxySelector", "-deprecated_readTimeoutMillis", "-deprecated_retryOnConnectionFailure", "-deprecated_socketFactory", "-deprecated_sslSocketFactory", "-deprecated_writeTimeoutMillis", "Builder", "Companion", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: OkHttpClient.kt */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);
    /* access modifiers changed from: private */
    public static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);
    private final Authenticator authenticator;
    private final Cache cache;
    private final int callTimeoutMillis;
    private final CertificateChainCleaner certificateChainCleaner;
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;
    private final ConnectionPool connectionPool;
    private final List<ConnectionSpec> connectionSpecs;
    private final CookieJar cookieJar;
    private final Dispatcher dispatcher;
    private final Dns dns;
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;
    private final HostnameVerifier hostnameVerifier;
    private final List<Interceptor> interceptors;
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;
    private final SocketFactory socketFactory;
    /* access modifiers changed from: private */
    public final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;
    private final X509TrustManager x509TrustManager;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0005¢\u0006\u0002\u0010\u0005J<\u0010\u0001\u001a\u00020\u00002*\b\u0004\u0010\u0001\u001a#\u0012\u0017\u0012\u00150\u0001¢\u0006\u000f\b\u0001\u0012\n\b\u0001\u0012\u0005\b\b(\u0001\u0012\u0005\u0012\u00030\u00010\u0001H\b¢\u0006\u0003\b\u0001J\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020]J<\u0010\u0001\u001a\u00020\u00002*\b\u0004\u0010\u0001\u001a#\u0012\u0017\u0012\u00150\u0001¢\u0006\u000f\b\u0001\u0012\n\b\u0001\u0012\u0005\b\b(\u0001\u0012\u0005\u0012\u00030\u00010\u0001H\b¢\u0006\u0003\b\u0001J\u0010\u0010\u0001\u001a\u00020\u00002\u0007\u0010\u0001\u001a\u00020]J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0007\u0010\u0001\u001a\u00020\u0003J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u0012\u001a\u00020\u00002\b\u0010\u0001\u001a\u00030 \u0001H\u0007J\u001a\u0010\u0012\u001a\u00020\u00002\b\u0010¡\u0001\u001a\u00030¢\u00012\b\u0010£\u0001\u001a\u00030¤\u0001J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\u0012\u0010$\u001a\u00020\u00002\b\u0010\u0001\u001a\u00030 \u0001H\u0007J\u001a\u0010$\u001a\u00020\u00002\b\u0010¡\u0001\u001a\u00030¢\u00012\b\u0010£\u0001\u001a\u00030¤\u0001J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(J\u0014\u0010-\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.J\u000e\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u000205J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020AJ\u0011\u0010¥\u0001\u001a\u00020\u00002\b\u0010¥\u0001\u001a\u00030¦\u0001J\u000e\u0010F\u001a\u00020\u00002\u0006\u0010F\u001a\u00020GJ\u000e\u0010L\u001a\u00020\u00002\u0006\u0010L\u001a\u00020MJ\u000f\u0010R\u001a\u00020\u00002\u0007\u0010§\u0001\u001a\u00020MJ\u000e\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020VJ\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\J\f\u0010_\u001a\b\u0012\u0004\u0012\u00020]0\\J\u0012\u0010a\u001a\u00020\u00002\b\u0010\u0001\u001a\u00030 \u0001H\u0007J\u001a\u0010a\u001a\u00020\u00002\b\u0010¨\u0001\u001a\u00030¢\u00012\b\u0010£\u0001\u001a\u00030¤\u0001J\u0014\u0010d\u001a\u00020\u00002\f\u0010d\u001a\b\u0012\u0004\u0012\u00020e0.J\u0010\u0010h\u001a\u00020\u00002\b\u0010h\u001a\u0004\u0018\u00010iJ\u000e\u0010n\u001a\u00020\u00002\u0006\u0010n\u001a\u00020\u0007J\u000e\u0010q\u001a\u00020\u00002\u0006\u0010q\u001a\u00020rJ\u0012\u0010w\u001a\u00020\u00002\b\u0010\u0001\u001a\u00030 \u0001H\u0007J\u001a\u0010w\u001a\u00020\u00002\b\u0010¡\u0001\u001a\u00030¢\u00012\b\u0010£\u0001\u001a\u00030¤\u0001J\u000e\u0010z\u001a\u00020\u00002\u0006\u0010z\u001a\u00020MJ\u000e\u0010}\u001a\u00020\u00002\u0006\u0010}\u001a\u00020~J\u0013\u0010©\u0001\u001a\u00020\u00002\b\u0010©\u0001\u001a\u00030\u0001H\u0007J\u001b\u0010©\u0001\u001a\u00020\u00002\b\u0010©\u0001\u001a\u00030\u00012\b\u0010ª\u0001\u001a\u00030\u0001J\u0013\u0010\u0001\u001a\u00020\u00002\b\u0010\u0001\u001a\u00030 \u0001H\u0007J\u001b\u0010\u0001\u001a\u00020\u00002\b\u0010¡\u0001\u001a\u00030¢\u00012\b\u0010£\u0001\u001a\u00030¤\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001a\u0010'\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020AX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020MX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020MX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR\u001a\u0010U\u001a\u00020VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\X\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u00101R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020]0\\X\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u00101R\u001a\u0010a\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0015\"\u0004\bc\u0010\u0017R \u0010d\u001a\b\u0012\u0004\u0012\u00020e0.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u00101\"\u0004\bg\u00103R\u001c\u0010h\u001a\u0004\u0018\u00010iX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010n\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010\t\"\u0004\bp\u0010\u000bR\u001c\u0010q\u001a\u0004\u0018\u00010rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010w\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010\u0015\"\u0004\by\u0010\u0017R\u001a\u0010z\u001a\u00020MX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010O\"\u0004\b|\u0010QR\u001d\u0010}\u001a\u00020~X\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001d\u0010\u0001\u001a\u00020\u0013X\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u0015\"\u0005\b\u0001\u0010\u0017R\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001¨\u0006«\u0001"}, mo16641d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "()V", "authenticator", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "cache", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "callTimeout", "", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "certificatePinner", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "connectTimeout", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "connectionPool", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "connectionSpecs", "", "Lokhttp3/ConnectionSpec;", "getConnectionSpecs$okhttp", "()Ljava/util/List;", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "cookieJar", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "dispatcher", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "dns", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "eventListenerFactory", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "followRedirects", "", "getFollowRedirects$okhttp", "()Z", "setFollowRedirects$okhttp", "(Z)V", "followSslRedirects", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "interceptors", "", "Lokhttp3/Interceptor;", "getInterceptors$okhttp", "networkInterceptors", "getNetworkInterceptors$okhttp", "pingInterval", "getPingInterval$okhttp", "setPingInterval$okhttp", "protocols", "Lokhttp3/Protocol;", "getProtocols$okhttp", "setProtocols$okhttp", "proxy", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "proxyAuthenticator", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "proxySelector", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "readTimeout", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "retryOnConnectionFailure", "getRetryOnConnectionFailure$okhttp", "setRetryOnConnectionFailure$okhttp", "socketFactory", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "writeTimeout", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "addInterceptor", "block", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lkotlin/ParameterName;", "name", "chain", "Lokhttp3/Response;", "-addInterceptor", "interceptor", "addNetworkInterceptor", "-addNetworkInterceptor", "build", "duration", "Ljava/time/Duration;", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "eventListener", "Lokhttp3/EventListener;", "followProtocolRedirects", "interval", "sslSocketFactory", "trustManager", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: OkHttpClient.kt */
    public static final class Builder {
        private Authenticator authenticator;
        private Cache cache;
        private int callTimeout;
        private CertificateChainCleaner certificateChainCleaner;
        private CertificatePinner certificatePinner;
        private int connectTimeout;
        private ConnectionPool connectionPool;
        private List<ConnectionSpec> connectionSpecs;
        private CookieJar cookieJar;
        private Dispatcher dispatcher;
        private Dns dns;
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;
        private HostnameVerifier hostnameVerifier;
        private final List<Interceptor> interceptors;
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;
        private List<? extends Protocol> protocols;
        private Proxy proxy;
        private Authenticator proxyAuthenticator;
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;
        private SocketFactory socketFactory;
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            this.authenticator = Authenticator.NONE;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = Authenticator.NONE;
            SocketFactory socketFactory2 = SocketFactory.getDefault();
            C10202j.m34174a((Object) socketFactory2, "SocketFactory.getDefault()");
            this.socketFactory = socketFactory2;
            this.connectionSpecs = OkHttpClient.Companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = OkHttpClient.Companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
        }

        /* renamed from: -addInterceptor  reason: not valid java name */
        public final Builder m41971addInterceptor(C9113l<? super Interceptor.Chain, Response> lVar) {
            C10202j.m34178b(lVar, "block");
            Interceptor.Companion companion = Interceptor.Companion;
            return addInterceptor(new OkHttpClient$Builder$addInterceptor$$inlined$invoke$1(lVar));
        }

        /* renamed from: -addNetworkInterceptor  reason: not valid java name */
        public final Builder m41972addNetworkInterceptor(C9113l<? super Interceptor.Chain, Response> lVar) {
            C10202j.m34178b(lVar, "block");
            Interceptor.Companion companion = Interceptor.Companion;
            return addNetworkInterceptor(new OkHttpClient$Builder$addNetworkInterceptor$$inlined$invoke$1(lVar));
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            C10202j.m34178b(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            C10202j.m34178b(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        public final Builder authenticator(Authenticator authenticator2) {
            C10202j.m34178b(authenticator2, "authenticator");
            this.authenticator = authenticator2;
            return this;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public final Builder cache(Cache cache2) {
            this.cache = cache2;
            return this;
        }

        public final Builder callTimeout(long j, TimeUnit timeUnit) {
            C10202j.m34178b(timeUnit, "unit");
            this.callTimeout = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner2) {
            C10202j.m34178b(certificatePinner2, "certificatePinner");
            this.certificatePinner = certificatePinner2;
            return this;
        }

        public final Builder connectTimeout(long j, TimeUnit timeUnit) {
            C10202j.m34178b(timeUnit, "unit");
            this.connectTimeout = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public final Builder connectionPool(ConnectionPool connectionPool2) {
            C10202j.m34178b(connectionPool2, "connectionPool");
            this.connectionPool = connectionPool2;
            return this;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> list) {
            C10202j.m34178b(list, "connectionSpecs");
            this.connectionSpecs = Util.toImmutableList(list);
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar2) {
            C10202j.m34178b(cookieJar2, "cookieJar");
            this.cookieJar = cookieJar2;
            return this;
        }

        public final Builder dispatcher(Dispatcher dispatcher2) {
            C10202j.m34178b(dispatcher2, "dispatcher");
            this.dispatcher = dispatcher2;
            return this;
        }

        public final Builder dns(Dns dns2) {
            C10202j.m34178b(dns2, "dns");
            this.dns = dns2;
            return this;
        }

        public final Builder eventListener(EventListener eventListener) {
            C10202j.m34178b(eventListener, "eventListener");
            this.eventListenerFactory = Util.asFactory(eventListener);
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory factory) {
            C10202j.m34178b(factory, "eventListenerFactory");
            this.eventListenerFactory = factory;
            return this;
        }

        public final Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        public final Builder followSslRedirects(boolean z) {
            this.followSslRedirects = z;
            return this;
        }

        public final Authenticator getAuthenticator$okhttp() {
            return this.authenticator;
        }

        public final Cache getCache$okhttp() {
            return this.cache;
        }

        public final int getCallTimeout$okhttp() {
            return this.callTimeout;
        }

        public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
            return this.certificateChainCleaner;
        }

        public final CertificatePinner getCertificatePinner$okhttp() {
            return this.certificatePinner;
        }

        public final int getConnectTimeout$okhttp() {
            return this.connectTimeout;
        }

        public final ConnectionPool getConnectionPool$okhttp() {
            return this.connectionPool;
        }

        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        public final CookieJar getCookieJar$okhttp() {
            return this.cookieJar;
        }

        public final Dispatcher getDispatcher$okhttp() {
            return this.dispatcher;
        }

        public final Dns getDns$okhttp() {
            return this.dns;
        }

        public final EventListener.Factory getEventListenerFactory$okhttp() {
            return this.eventListenerFactory;
        }

        public final boolean getFollowRedirects$okhttp() {
            return this.followRedirects;
        }

        public final boolean getFollowSslRedirects$okhttp() {
            return this.followSslRedirects;
        }

        public final HostnameVerifier getHostnameVerifier$okhttp() {
            return this.hostnameVerifier;
        }

        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        public final int getPingInterval$okhttp() {
            return this.pingInterval;
        }

        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        public final Proxy getProxy$okhttp() {
            return this.proxy;
        }

        public final Authenticator getProxyAuthenticator$okhttp() {
            return this.proxyAuthenticator;
        }

        public final ProxySelector getProxySelector$okhttp() {
            return this.proxySelector;
        }

        public final int getReadTimeout$okhttp() {
            return this.readTimeout;
        }

        public final boolean getRetryOnConnectionFailure$okhttp() {
            return this.retryOnConnectionFailure;
        }

        public final SocketFactory getSocketFactory$okhttp() {
            return this.socketFactory;
        }

        public final SSLSocketFactory getSslSocketFactoryOrNull$okhttp() {
            return this.sslSocketFactoryOrNull;
        }

        public final int getWriteTimeout$okhttp() {
            return this.writeTimeout;
        }

        public final X509TrustManager getX509TrustManagerOrNull$okhttp() {
            return this.x509TrustManagerOrNull;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier2) {
            C10202j.m34178b(hostnameVerifier2, "hostnameVerifier");
            this.hostnameVerifier = hostnameVerifier2;
            return this;
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final Builder pingInterval(long j, TimeUnit timeUnit) {
            C10202j.m34178b(timeUnit, "unit");
            this.pingInterval = Util.checkDuration("interval", j, timeUnit);
            return this;
        }

        public final Builder protocols(List<? extends Protocol> list) {
            C10202j.m34178b(list, "protocols");
            List<T> c = C10539w.m35789c(list);
            boolean z = false;
            if (c.contains(Protocol.H2_PRIOR_KNOWLEDGE) || c.contains(Protocol.HTTP_1_1)) {
                if (!c.contains(Protocol.H2_PRIOR_KNOWLEDGE) || c.size() <= 1) {
                    z = true;
                }
                if (!z) {
                    throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + c).toString());
                } else if (!(!c.contains(Protocol.HTTP_1_0))) {
                    throw new IllegalArgumentException(("protocols must not contain http/1.0: " + c).toString());
                } else if (c == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
                } else if (!c.contains((Object) null)) {
                    c.remove(Protocol.SPDY_3);
                    List<? extends Protocol> unmodifiableList = Collections.unmodifiableList(list);
                    C10202j.m34174a((Object) unmodifiableList, "Collections.unmodifiableList(protocols)");
                    this.protocols = unmodifiableList;
                    return this;
                } else {
                    throw new IllegalArgumentException("protocols must not contain null".toString());
                }
            } else {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + c).toString());
            }
        }

        public final Builder proxy(Proxy proxy2) {
            this.proxy = proxy2;
            return this;
        }

        public final Builder proxyAuthenticator(Authenticator authenticator2) {
            C10202j.m34178b(authenticator2, "proxyAuthenticator");
            this.proxyAuthenticator = authenticator2;
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector2) {
            C10202j.m34178b(proxySelector2, "proxySelector");
            this.proxySelector = proxySelector2;
            return this;
        }

        public final Builder readTimeout(long j, TimeUnit timeUnit) {
            C10202j.m34178b(timeUnit, "unit");
            this.readTimeout = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean z) {
            this.retryOnConnectionFailure = z;
            return this;
        }

        public final void setAuthenticator$okhttp(Authenticator authenticator2) {
            C10202j.m34178b(authenticator2, "<set-?>");
            this.authenticator = authenticator2;
        }

        public final void setCache$okhttp(Cache cache2) {
            this.cache = cache2;
        }

        public final void setCallTimeout$okhttp(int i) {
            this.callTimeout = i;
        }

        public final void setCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner2) {
            this.certificateChainCleaner = certificateChainCleaner2;
        }

        public final void setCertificatePinner$okhttp(CertificatePinner certificatePinner2) {
            C10202j.m34178b(certificatePinner2, "<set-?>");
            this.certificatePinner = certificatePinner2;
        }

        public final void setConnectTimeout$okhttp(int i) {
            this.connectTimeout = i;
        }

        public final void setConnectionPool$okhttp(ConnectionPool connectionPool2) {
            C10202j.m34178b(connectionPool2, "<set-?>");
            this.connectionPool = connectionPool2;
        }

        public final void setConnectionSpecs$okhttp(List<ConnectionSpec> list) {
            C10202j.m34178b(list, "<set-?>");
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(CookieJar cookieJar2) {
            C10202j.m34178b(cookieJar2, "<set-?>");
            this.cookieJar = cookieJar2;
        }

        public final void setDispatcher$okhttp(Dispatcher dispatcher2) {
            C10202j.m34178b(dispatcher2, "<set-?>");
            this.dispatcher = dispatcher2;
        }

        public final void setDns$okhttp(Dns dns2) {
            C10202j.m34178b(dns2, "<set-?>");
            this.dns = dns2;
        }

        public final void setEventListenerFactory$okhttp(EventListener.Factory factory) {
            C10202j.m34178b(factory, "<set-?>");
            this.eventListenerFactory = factory;
        }

        public final void setFollowRedirects$okhttp(boolean z) {
            this.followRedirects = z;
        }

        public final void setFollowSslRedirects$okhttp(boolean z) {
            this.followSslRedirects = z;
        }

        public final void setHostnameVerifier$okhttp(HostnameVerifier hostnameVerifier2) {
            C10202j.m34178b(hostnameVerifier2, "<set-?>");
            this.hostnameVerifier = hostnameVerifier2;
        }

        public final void setPingInterval$okhttp(int i) {
            this.pingInterval = i;
        }

        public final void setProtocols$okhttp(List<? extends Protocol> list) {
            C10202j.m34178b(list, "<set-?>");
            this.protocols = list;
        }

        public final void setProxy$okhttp(Proxy proxy2) {
            this.proxy = proxy2;
        }

        public final void setProxyAuthenticator$okhttp(Authenticator authenticator2) {
            C10202j.m34178b(authenticator2, "<set-?>");
            this.proxyAuthenticator = authenticator2;
        }

        public final void setProxySelector$okhttp(ProxySelector proxySelector2) {
            this.proxySelector = proxySelector2;
        }

        public final void setReadTimeout$okhttp(int i) {
            this.readTimeout = i;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z) {
            this.retryOnConnectionFailure = z;
        }

        public final void setSocketFactory$okhttp(SocketFactory socketFactory2) {
            C10202j.m34178b(socketFactory2, "<set-?>");
            this.socketFactory = socketFactory2;
        }

        public final void setSslSocketFactoryOrNull$okhttp(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i) {
            this.writeTimeout = i;
        }

        public final void setX509TrustManagerOrNull$okhttp(X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        public final Builder socketFactory(SocketFactory socketFactory2) {
            C10202j.m34178b(socketFactory2, "socketFactory");
            if (!(socketFactory2 instanceof SSLSocketFactory)) {
                this.socketFactory = socketFactory2;
                return this;
            }
            throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory".toString());
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            C10202j.m34178b(sSLSocketFactory, "sslSocketFactory");
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            this.certificateChainCleaner = Platform.Companion.get().buildCertificateChainCleaner(sSLSocketFactory);
            return this;
        }

        public final Builder writeTimeout(long j, TimeUnit timeUnit) {
            C10202j.m34178b(timeUnit, "unit");
            this.writeTimeout = Util.checkDuration("timeout", j, timeUnit);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder callTimeout(Duration duration) {
            C10202j.m34178b(duration, "duration");
            this.callTimeout = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder connectTimeout(Duration duration) {
            C10202j.m34178b(duration, "duration");
            this.connectTimeout = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder pingInterval(Duration duration) {
            C10202j.m34178b(duration, "duration");
            this.pingInterval = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder readTimeout(Duration duration) {
            C10202j.m34178b(duration, "duration");
            this.readTimeout = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @IgnoreJRERequirement
        public final Builder writeTimeout(Duration duration) {
            C10202j.m34178b(duration, "duration");
            this.writeTimeout = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            C10202j.m34178b(sSLSocketFactory, "sslSocketFactory");
            C10202j.m34178b(x509TrustManager, "trustManager");
            this.sslSocketFactoryOrNull = sSLSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.Companion.get(x509TrustManager);
            this.x509TrustManagerOrNull = x509TrustManager;
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(OkHttpClient okHttpClient) {
            this();
            C10202j.m34178b(okHttpClient, "okHttpClient");
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            boolean unused = C10536t.m35760a(this.interceptors, okHttpClient.interceptors());
            boolean unused2 = C10536t.m35760a(this.networkInterceptors, okHttpClient.networkInterceptors());
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.x509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000f"}, mo16641d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "()V", "DEFAULT_CONNECTION_SPECS", "", "Lokhttp3/ConnectionSpec;", "getDEFAULT_CONNECTION_SPECS$okhttp", "()Ljava/util/List;", "DEFAULT_PROTOCOLS", "Lokhttp3/Protocol;", "getDEFAULT_PROTOCOLS$okhttp", "newSslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: OkHttpClient.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final SSLSocketFactory newSslSocketFactory(X509TrustManager x509TrustManager) {
            try {
                SSLContext newSSLContext = Platform.Companion.get().newSSLContext();
                newSSLContext.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                SSLSocketFactory socketFactory = newSSLContext.getSocketFactory();
                C10202j.m34174a((Object) socketFactory, "sslContext.socketFactory");
                return socketFactory;
            } catch (GeneralSecurityException e) {
                AssertionError assertionError = new AssertionError("No System TLS");
                assertionError.initCause(e);
                throw assertionError;
            }
        }

        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OkHttpClient(okhttp3.OkHttpClient.Builder r5) {
        /*
            r4 = this;
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.C10202j.m34178b(r5, r0)
            r4.<init>()
            okhttp3.Dispatcher r0 = r5.getDispatcher$okhttp()
            r4.dispatcher = r0
            okhttp3.ConnectionPool r0 = r5.getConnectionPool$okhttp()
            r4.connectionPool = r0
            java.util.List r0 = r5.getInterceptors$okhttp()
            java.util.List r0 = okhttp3.internal.Util.toImmutableList(r0)
            r4.interceptors = r0
            java.util.List r0 = r5.getNetworkInterceptors$okhttp()
            java.util.List r0 = okhttp3.internal.Util.toImmutableList(r0)
            r4.networkInterceptors = r0
            okhttp3.EventListener$Factory r0 = r5.getEventListenerFactory$okhttp()
            r4.eventListenerFactory = r0
            boolean r0 = r5.getRetryOnConnectionFailure$okhttp()
            r4.retryOnConnectionFailure = r0
            okhttp3.Authenticator r0 = r5.getAuthenticator$okhttp()
            r4.authenticator = r0
            boolean r0 = r5.getFollowRedirects$okhttp()
            r4.followRedirects = r0
            boolean r0 = r5.getFollowSslRedirects$okhttp()
            r4.followSslRedirects = r0
            okhttp3.CookieJar r0 = r5.getCookieJar$okhttp()
            r4.cookieJar = r0
            okhttp3.Cache r0 = r5.getCache$okhttp()
            r4.cache = r0
            okhttp3.Dns r0 = r5.getDns$okhttp()
            r4.dns = r0
            java.net.Proxy r0 = r5.getProxy$okhttp()
            r4.proxy = r0
            java.net.Proxy r0 = r5.getProxy$okhttp()
            if (r0 == 0) goto L_0x0067
            okhttp3.internal.proxy.NullProxySelector r0 = okhttp3.internal.proxy.NullProxySelector.INSTANCE
            goto L_0x0077
        L_0x0067:
            java.net.ProxySelector r0 = r5.getProxySelector$okhttp()
            if (r0 == 0) goto L_0x006e
            goto L_0x0072
        L_0x006e:
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
        L_0x0072:
            if (r0 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            okhttp3.internal.proxy.NullProxySelector r0 = okhttp3.internal.proxy.NullProxySelector.INSTANCE
        L_0x0077:
            r4.proxySelector = r0
            okhttp3.Authenticator r0 = r5.getProxyAuthenticator$okhttp()
            r4.proxyAuthenticator = r0
            javax.net.SocketFactory r0 = r5.getSocketFactory$okhttp()
            r4.socketFactory = r0
            java.util.List r0 = r5.getConnectionSpecs$okhttp()
            r4.connectionSpecs = r0
            java.util.List r0 = r5.getProtocols$okhttp()
            r4.protocols = r0
            javax.net.ssl.HostnameVerifier r0 = r5.getHostnameVerifier$okhttp()
            r4.hostnameVerifier = r0
            int r0 = r5.getCallTimeout$okhttp()
            r4.callTimeoutMillis = r0
            int r0 = r5.getConnectTimeout$okhttp()
            r4.connectTimeoutMillis = r0
            int r0 = r5.getReadTimeout$okhttp()
            r4.readTimeoutMillis = r0
            int r0 = r5.getWriteTimeout$okhttp()
            r4.writeTimeoutMillis = r0
            int r0 = r5.getPingInterval$okhttp()
            r4.pingIntervalMillis = r0
            javax.net.ssl.SSLSocketFactory r0 = r5.getSslSocketFactoryOrNull$okhttp()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x011d
            java.util.List<okhttp3.ConnectionSpec> r0 = r4.connectionSpecs
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x00cb
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x00cb
        L_0x00c9:
            r0 = 1
            goto L_0x00e2
        L_0x00cb:
            java.util.Iterator r0 = r0.iterator()
        L_0x00cf:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00c9
            java.lang.Object r3 = r0.next()
            okhttp3.ConnectionSpec r3 = (okhttp3.ConnectionSpec) r3
            boolean r3 = r3.isTls()
            if (r3 == 0) goto L_0x00cf
            r0 = 0
        L_0x00e2:
            if (r0 == 0) goto L_0x00e5
            goto L_0x011d
        L_0x00e5:
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            javax.net.ssl.X509TrustManager r0 = r0.platformTrustManager()
            r4.x509TrustManager = r0
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            javax.net.ssl.X509TrustManager r3 = r4.x509TrustManager
            r0.configureTrustManager(r3)
            okhttp3.OkHttpClient$Companion r0 = Companion
            javax.net.ssl.X509TrustManager r3 = r4.x509TrustManager
            if (r3 == 0) goto L_0x0119
            javax.net.ssl.SSLSocketFactory r0 = r0.newSslSocketFactory(r3)
            r4.sslSocketFactoryOrNull = r0
            okhttp3.internal.tls.CertificateChainCleaner$Companion r0 = okhttp3.internal.tls.CertificateChainCleaner.Companion
            javax.net.ssl.X509TrustManager r3 = r4.x509TrustManager
            if (r3 == 0) goto L_0x0115
            okhttp3.internal.tls.CertificateChainCleaner r0 = r0.get((javax.net.ssl.X509TrustManager) r3)
            r4.certificateChainCleaner = r0
            goto L_0x012f
        L_0x0115:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r1
        L_0x0119:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r1
        L_0x011d:
            javax.net.ssl.SSLSocketFactory r0 = r5.getSslSocketFactoryOrNull$okhttp()
            r4.sslSocketFactoryOrNull = r0
            okhttp3.internal.tls.CertificateChainCleaner r0 = r5.getCertificateChainCleaner$okhttp()
            r4.certificateChainCleaner = r0
            javax.net.ssl.X509TrustManager r0 = r5.getX509TrustManagerOrNull$okhttp()
            r4.x509TrustManager = r0
        L_0x012f:
            javax.net.ssl.SSLSocketFactory r0 = r4.sslSocketFactoryOrNull
            if (r0 == 0) goto L_0x013e
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            javax.net.ssl.SSLSocketFactory r3 = r4.sslSocketFactoryOrNull
            r0.configureSslSocketFactory(r3)
        L_0x013e:
            okhttp3.CertificatePinner r5 = r5.getCertificatePinner$okhttp()
            okhttp3.internal.tls.CertificateChainCleaner r0 = r4.certificateChainCleaner
            okhttp3.CertificatePinner r5 = r5.withCertificateChainCleaner$okhttp(r0)
            r4.certificatePinner = r5
            java.util.List<okhttp3.Interceptor> r5 = r4.interceptors
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            if (r5 == 0) goto L_0x01a3
            boolean r5 = r5.contains(r1)
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0186
            java.util.List<okhttp3.Interceptor> r5 = r4.networkInterceptors
            if (r5 == 0) goto L_0x0180
            boolean r5 = r5.contains(r1)
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0163
            return
        L_0x0163:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Null network interceptor: "
            r5.append(r0)
            java.util.List<okhttp3.Interceptor> r0 = r4.networkInterceptors
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L_0x0180:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            r5.<init>(r0)
            throw r5
        L_0x0186:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Null interceptor: "
            r5.append(r0)
            java.util.List<okhttp3.Interceptor> r0 = r4.interceptors
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L_0x01a3:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            r5.<init>(r0)
            goto L_0x01aa
        L_0x01a9:
            throw r5
        L_0x01aa:
            goto L_0x01a9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.OkHttpClient.<init>(okhttp3.OkHttpClient$Builder):void");
    }

    /* renamed from: -deprecated_authenticator  reason: not valid java name */
    public final Authenticator m41945deprecated_authenticator() {
        return this.authenticator;
    }

    /* renamed from: -deprecated_cache  reason: not valid java name */
    public final Cache m41946deprecated_cache() {
        return this.cache;
    }

    /* renamed from: -deprecated_callTimeoutMillis  reason: not valid java name */
    public final int m41947deprecated_callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* renamed from: -deprecated_certificatePinner  reason: not valid java name */
    public final CertificatePinner m41948deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    /* renamed from: -deprecated_connectTimeoutMillis  reason: not valid java name */
    public final int m41949deprecated_connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* renamed from: -deprecated_connectionPool  reason: not valid java name */
    public final ConnectionPool m41950deprecated_connectionPool() {
        return this.connectionPool;
    }

    /* renamed from: -deprecated_connectionSpecs  reason: not valid java name */
    public final List<ConnectionSpec> m41951deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    /* renamed from: -deprecated_cookieJar  reason: not valid java name */
    public final CookieJar m41952deprecated_cookieJar() {
        return this.cookieJar;
    }

    /* renamed from: -deprecated_dispatcher  reason: not valid java name */
    public final Dispatcher m41953deprecated_dispatcher() {
        return this.dispatcher;
    }

    /* renamed from: -deprecated_dns  reason: not valid java name */
    public final Dns m41954deprecated_dns() {
        return this.dns;
    }

    /* renamed from: -deprecated_eventListenerFactory  reason: not valid java name */
    public final EventListener.Factory m41955deprecated_eventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* renamed from: -deprecated_followRedirects  reason: not valid java name */
    public final boolean m41956deprecated_followRedirects() {
        return this.followRedirects;
    }

    /* renamed from: -deprecated_followSslRedirects  reason: not valid java name */
    public final boolean m41957deprecated_followSslRedirects() {
        return this.followSslRedirects;
    }

    /* renamed from: -deprecated_hostnameVerifier  reason: not valid java name */
    public final HostnameVerifier m41958deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    /* renamed from: -deprecated_interceptors  reason: not valid java name */
    public final List<Interceptor> m41959deprecated_interceptors() {
        return this.interceptors;
    }

    /* renamed from: -deprecated_networkInterceptors  reason: not valid java name */
    public final List<Interceptor> m41960deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    /* renamed from: -deprecated_pingIntervalMillis  reason: not valid java name */
    public final int m41961deprecated_pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    /* renamed from: -deprecated_protocols  reason: not valid java name */
    public final List<Protocol> m41962deprecated_protocols() {
        return this.protocols;
    }

    /* renamed from: -deprecated_proxy  reason: not valid java name */
    public final Proxy m41963deprecated_proxy() {
        return this.proxy;
    }

    /* renamed from: -deprecated_proxyAuthenticator  reason: not valid java name */
    public final Authenticator m41964deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* renamed from: -deprecated_proxySelector  reason: not valid java name */
    public final ProxySelector m41965deprecated_proxySelector() {
        return this.proxySelector;
    }

    /* renamed from: -deprecated_readTimeoutMillis  reason: not valid java name */
    public final int m41966deprecated_readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* renamed from: -deprecated_retryOnConnectionFailure  reason: not valid java name */
    public final boolean m41967deprecated_retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    /* renamed from: -deprecated_socketFactory  reason: not valid java name */
    public final SocketFactory m41968deprecated_socketFactory() {
        return this.socketFactory;
    }

    /* renamed from: -deprecated_sslSocketFactory  reason: not valid java name */
    public final SSLSocketFactory m41969deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    /* renamed from: -deprecated_writeTimeoutMillis  reason: not valid java name */
    public final int m41970deprecated_writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final Authenticator authenticator() {
        return this.authenticator;
    }

    public final Cache cache() {
        return this.cache;
    }

    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    public final CertificateChainCleaner certificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public Object clone() {
        return super.clone();
    }

    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public final boolean followRedirects() {
        return this.followRedirects;
    }

    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public Call newCall(Request request) {
        C10202j.m34178b(request, "request");
        return RealCall.Companion.newRealCall(this, request, false);
    }

    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        C10202j.m34178b(request, "request");
        C10202j.m34178b(webSocketListener, "listener");
        RealWebSocket realWebSocket = new RealWebSocket(request, webSocketListener, new Random(), (long) this.pingIntervalMillis);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public final X509TrustManager x509TrustManager() {
        return this.x509TrustManager;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
