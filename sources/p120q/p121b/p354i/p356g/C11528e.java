package p120q.p121b.p354i.p356g;

import p036io.sentry.dsn.C9055a;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.i.g.e */
/* compiled from: JndiSupport */
public final class C11528e {

    /* renamed from: a */
    private static final C12938b f30773a = C12939c.m41777a((Class<?>) C11528e.class);

    private C11528e() {
    }

    /* renamed from: a */
    public static boolean m37688a() {
        try {
            Class.forName("javax.naming.InitialContext", false, C9055a.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError e) {
            C12938b bVar = f30773a;
            bVar.mo41319d("JNDI is not available: " + e.getMessage());
            return false;
        }
    }
}
