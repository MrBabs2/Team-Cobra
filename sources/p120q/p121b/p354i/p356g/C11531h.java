package p120q.p121b.p354i.p356g;

import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.i.g.h */
/* compiled from: SystemPropertiesConfigurationProvider */
public class C11531h implements C11523b {

    /* renamed from: b */
    private static final C12938b f30776b = C12939c.m41777a((Class<?>) C11531h.class);

    /* renamed from: a */
    private final String f30777a;

    public C11531h() {
        this("sentry.");
    }

    /* renamed from: a */
    public String mo37636a(String str) {
        String property = System.getProperty(this.f30777a + str.toLowerCase());
        if (property != null) {
            f30776b.mo41307a("Found {}={} in Java System Properties.", str, property);
        }
        return property;
    }

    public C11531h(String str) {
        this.f30777a = str;
    }
}
