package p120q.p121b;

import p036io.sentry.dsn.C9055a;
import p120q.p121b.p354i.C11515d;
import p120q.p121b.p354i.C11516e;
import p120q.p121b.p367q.C11591b;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.e */
/* compiled from: SentryOptions */
public final class C11500e {

    /* renamed from: e */
    private static final C12938b f30730e = C12939c.m41777a((Class<?>) C11500e.class);

    /* renamed from: a */
    private C11515d f30731a;

    /* renamed from: b */
    private C5312d f30732b;

    /* renamed from: c */
    private String f30733c;
    @Deprecated

    /* renamed from: d */
    private C11516e f30734d;

    /* renamed from: q.b.e$b */
    /* compiled from: SentryOptions */
    private final class C11502b extends C5312d {
        /* renamed from: a */
        public C5311c mo18479a(C9055a aVar) {
            return null;
        }

        private C11502b(C11500e eVar) {
            super(eVar.mo37616b());
        }
    }

    public C11500e(C11515d dVar, String str, C5312d dVar2) {
        this.f30731a = (C11515d) C4758i.m7802a(dVar, "lookup");
        String a = m37622a(dVar, str);
        this.f30733c = a;
        dVar2 = dVar2 == null ? C5312d.m10110a(this.f30731a, a) : dVar2;
        this.f30732b = dVar2;
        this.f30734d = null;
        if (dVar2 == null) {
            f30730e.mo41305a("Failed to find a Sentry client factory in the provided configuration. Will continue with a dummy implementation that will send no data.");
            this.f30732b = new C11502b();
        }
    }

    /* renamed from: a */
    public static C11500e m37624a(C11515d dVar, String str, C5312d dVar2) {
        return new C11500e(dVar, str, dVar2);
    }

    /* renamed from: e */
    public static C11500e m37625e() {
        return m37623a((String) null);
    }

    /* renamed from: b */
    public C11515d mo37616b() {
        return this.f30731a;
    }

    @Deprecated
    /* renamed from: c */
    public C11516e mo37617c() {
        return this.f30734d;
    }

    /* renamed from: d */
    public C5312d mo37618d() {
        return this.f30732b;
    }

    /* renamed from: a */
    public static C11500e m37623a(String str) {
        return m37624a(C11515d.m37672a(), str, (C5312d) null);
    }

    /* renamed from: a */
    public void mo37615a(C5312d dVar) {
        if (dVar == null) {
            dVar = C5312d.m10110a(mo37616b(), mo37614a());
        }
        this.f30732b = dVar;
    }

    /* renamed from: a */
    public String mo37614a() {
        return this.f30733c;
    }

    /* renamed from: a */
    private static String m37622a(C11515d dVar, String str) {
        try {
            return C11591b.m37917a(str) ? C9055a.m29747a(dVar) : str;
        } catch (RuntimeException e) {
            f30730e.mo41317c("Error creating valid DSN from: '{}'.", str, e);
            throw e;
        }
    }
}
