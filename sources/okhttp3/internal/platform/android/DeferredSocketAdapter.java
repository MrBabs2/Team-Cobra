package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.Protocol;
import okhttp3.internal.platform.Platform;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, mo16641d2 = {"Lokhttp3/internal/platform/android/DeferredSocketAdapter;", "Lokhttp3/internal/platform/android/SocketAdapter;", "socketPackage", "", "(Ljava/lang/String;)V", "delegate", "initialized", "", "configureTlsExtensions", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", "protocols", "", "Lokhttp3/Protocol;", "getDelegate", "actualSSLSocketClass", "getSelectedProtocol", "isSupported", "matchesSocket", "matchesSocketFactory", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: DeferredSocketAdapter.kt */
public final class DeferredSocketAdapter implements SocketAdapter {
    private SocketAdapter delegate;
    private boolean initialized;
    private final String socketPackage;

    public DeferredSocketAdapter(String str) {
        C10202j.m34178b(str, "socketPackage");
        this.socketPackage = str;
    }

    private final synchronized SocketAdapter getDelegate(SSLSocket sSLSocket) {
        if (!this.initialized) {
            try {
                Class cls = sSLSocket.getClass();
                while (true) {
                    String name = cls.getName();
                    if (!(!C10202j.m34176a((Object) name, (Object) this.socketPackage + ".OpenSSLSocketImpl"))) {
                        this.delegate = new AndroidSocketAdapter(cls);
                        break;
                    }
                    cls = cls.getSuperclass();
                    C10202j.m34174a((Object) cls, "possibleClass.superclass");
                    if (cls == null) {
                        throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + sSLSocket);
                    }
                }
            } catch (Exception e) {
                Platform platform = Platform.Companion.get();
                platform.log(5, "Failed to initialize DeferredSocketAdapter " + this.socketPackage, e);
            }
            this.initialized = true;
        }
        return this.delegate;
    }

    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C10202j.m34178b(sSLSocket, "sslSocket");
        C10202j.m34178b(list, "protocols");
        SocketAdapter delegate2 = getDelegate(sSLSocket);
        if (delegate2 != null) {
            delegate2.configureTlsExtensions(sSLSocket, str, list);
        }
    }

    public String getSelectedProtocol(SSLSocket sSLSocket) {
        C10202j.m34178b(sSLSocket, "sslSocket");
        SocketAdapter delegate2 = getDelegate(sSLSocket);
        if (delegate2 != null) {
            return delegate2.getSelectedProtocol(sSLSocket);
        }
        return null;
    }

    public boolean isSupported() {
        return true;
    }

    public boolean matchesSocket(SSLSocket sSLSocket) {
        C10202j.m34178b(sSLSocket, "sslSocket");
        String name = sSLSocket.getClass().getName();
        C10202j.m34174a((Object) name, "sslSocket.javaClass.name");
        return C12130v.m40056c(name, this.socketPackage, false, 2, (Object) null);
    }

    public boolean matchesSocketFactory(SSLSocketFactory sSLSocketFactory) {
        C10202j.m34178b(sSLSocketFactory, "sslSocketFactory");
        return false;
    }

    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        C10202j.m34178b(sSLSocketFactory, "sslSocketFactory");
        return null;
    }
}
