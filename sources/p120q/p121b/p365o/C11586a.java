package p120q.p121b.p365o;

import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import p415t.p417b.C12939c;

/* renamed from: q.b.o.a */
/* compiled from: SentryServletRequestListener */
public class C11586a implements ServletRequestListener {

    /* renamed from: a */
    private static final ThreadLocal<HttpServletRequest> f30924a = new ThreadLocal<>();

    static {
        C12939c.m41777a((Class<?>) C11586a.class);
    }

    /* renamed from: a */
    public static HttpServletRequest m37894a() {
        return f30924a.get();
    }
}
