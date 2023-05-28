package p036io.sentry.connection;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* renamed from: io.sentry.connection.k */
/* compiled from: ProxyAuthenticator */
public class C9053k extends Authenticator {

    /* renamed from: a */
    private String f25624a;

    /* renamed from: b */
    private String f25625b;

    public C9053k(String str, String str2) {
        this.f25624a = str;
        this.f25625b = str2;
    }

    /* access modifiers changed from: protected */
    public PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f25624a, this.f25625b.toCharArray());
        }
        return null;
    }
}
