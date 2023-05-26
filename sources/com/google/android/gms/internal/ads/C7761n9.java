package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.n9 */
final class C7761n9 extends SSLSocketFactory {

    /* renamed from: a */
    private SSLSocketFactory f16293a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    private final /* synthetic */ C7724m9 f16294b;

    C7761n9(C7724m9 m9Var) {
        this.f16294b = m9Var;
    }

    /* renamed from: a */
    private final Socket m17670a(Socket socket) throws SocketException {
        if (this.f16294b.f16221o > 0) {
            socket.setReceiveBufferSize(this.f16294b.f16221o);
        }
        this.f16294b.m17558a(socket);
        return socket;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f16293a.createSocket(socket, str, i, z);
        m17670a(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f16293a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f16293a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f16293a.createSocket(str, i);
        m17670a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f16293a.createSocket(str, i, inetAddress, i2);
        m17670a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f16293a.createSocket(inetAddress, i);
        m17670a(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f16293a.createSocket(inetAddress, i, inetAddress2, i2);
        m17670a(createSocket);
        return createSocket;
    }
}
