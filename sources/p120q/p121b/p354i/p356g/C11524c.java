package p120q.p121b.p354i.p356g;

import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.i.g.c */
/* compiled from: EnvironmentConfigurationProvider */
public class C11524c implements C11523b {

    /* renamed from: b */
    private static final C12938b f30768b = C12939c.m41777a((Class<?>) C11524c.class);

    /* renamed from: a */
    private final String f30769a;

    public C11524c() {
        this("SENTRY_");
    }

    /* renamed from: a */
    public String mo37636a(String str) {
        String str2 = System.getenv(this.f30769a + str.replace(".", "_").toUpperCase());
        if (str2 != null) {
            f30768b.mo41307a("Found {}={} in System Environment Variables.", str, str2);
        }
        return str2;
    }

    public C11524c(String str) {
        this.f30769a = str;
    }
}
