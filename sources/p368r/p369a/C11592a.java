package p368r.p369a;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Properties;
import p368r.p369a.p370g.C11639l;

/* renamed from: r.a.a */
/* compiled from: JmDNS */
public abstract class C11592a implements Closeable {

    /* renamed from: r.a.a$a */
    /* compiled from: JmDNS */
    public interface C11593a {
        /* renamed from: a */
        void mo37843a(C11592a aVar, Collection<C11598d> collection);
    }

    static {
        InputStream resourceAsStream;
        try {
            resourceAsStream = C11592a.class.getClassLoader().getResourceAsStream("version.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            properties.getProperty("jmdns.version");
            resourceAsStream.close();
        } catch (Exception unused) {
        } catch (Throwable th) {
            resourceAsStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static C11592a m37922a(InetAddress inetAddress, String str) throws IOException {
        return new C11639l(inetAddress, str);
    }

    /* renamed from: a */
    public abstract void mo37841a(String str, C11600e eVar);

    /* renamed from: t */
    public abstract void mo37842t();
}
