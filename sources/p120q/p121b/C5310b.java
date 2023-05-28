package p120q.p121b;

import p120q.p121b.p354i.C11516e;
import p120q.p121b.p359l.C11544c;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.b */
/* compiled from: Sentry */
public final class C5310b {

    /* renamed from: a */
    private static final C12938b f9527a = C12939c.m41777a((Class<?>) C5310b.class);

    /* renamed from: b */
    private static final Object f9528b = new Object();

    /* renamed from: c */
    private static C5311c f9529c = null;
    @Deprecated

    /* renamed from: d */
    private static C11516e f9530d;

    private C5310b() {
    }

    /* renamed from: a */
    public static C5311c m10088a(String str, C5312d dVar) {
        C11500e a = C11500e.m37623a(str);
        a.mo37615a(dVar);
        return m10089a(a);
    }

    /* renamed from: b */
    public static C5311c m10093b() {
        synchronized (f9528b) {
            if (m10094c()) {
                C5311c cVar = f9529c;
                return cVar;
            }
            m10089a(C11500e.m37625e());
            return f9529c;
        }
    }

    /* renamed from: c */
    public static boolean m10094c() {
        return f9529c != null;
    }

    /* renamed from: a */
    public static C5311c m10089a(C11500e eVar) {
        f9530d = eVar.mo37617c();
        C5311c a = eVar.mo37618d().mo18523a(eVar.mo37614a());
        m10091a(a);
        return a;
    }

    @Deprecated
    /* renamed from: a */
    public static C11516e m10090a() {
        return f9530d;
    }

    /* renamed from: a */
    public static void m10091a(C5311c cVar) {
        synchronized (f9528b) {
            if (m10094c()) {
                f9527a.mo41312b("Overwriting statically stored SentryClient instance {} with {}.", f9529c, cVar);
            }
            f9529c = cVar;
        }
    }

    /* renamed from: a */
    public static void m10092a(C11544c cVar) {
        m10093b().mo18519c(cVar);
    }
}
