package p036io.sentry.connection;

import java.util.HashSet;
import java.util.Set;
import p120q.p121b.p358k.C11537a;
import p120q.p121b.p359l.C11542b;
import p120q.p121b.p367q.C11591b;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: io.sentry.connection.a */
/* compiled from: AbstractConnection */
public abstract class C9035a implements C9045d {

    /* renamed from: i */
    private static final C12938b f25570i = C12939c.m41777a((Class<?>) C9035a.class);

    /* renamed from: j */
    private static final C12938b f25571j = C12939c.m41778a(C9035a.class.getName() + ".lockdown");

    /* renamed from: f */
    private final String f25572f;

    /* renamed from: g */
    private Set<C9047f> f25573g;

    /* renamed from: h */
    private C9050h f25574h;

    protected C9035a(String str, String str2) {
        this(str, str2, new C9050h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo33401a() {
        return this.f25572f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo33403b(C11542b bVar) throws ConnectionException;

    C9035a(String str, String str2, C9050h hVar) {
        String str3;
        this.f25574h = hVar;
        this.f25573g = new HashSet();
        StringBuilder sb = new StringBuilder();
        sb.append("Sentry sentry_version=6,sentry_client=");
        sb.append(C11537a.m37698a());
        sb.append(",");
        sb.append("sentry_key=");
        sb.append(str);
        if (!C11591b.m37917a(str2)) {
            str3 = ",sentry_secret=" + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        this.f25572f = sb.toString();
    }

    /* renamed from: a */
    public final void mo33402a(C11542b bVar) throws ConnectionException {
        try {
            if (!this.f25574h.mo33423a()) {
                mo33403b(bVar);
                this.f25574h.mo33425b();
                for (C9047f next : this.f25573g) {
                    try {
                        next.mo33414a(bVar);
                    } catch (RuntimeException e) {
                        C12938b bVar2 = f25570i;
                        bVar2.mo41318c("An exception occurred while running an EventSendCallback.onSuccess: " + next.getClass().getName(), (Throwable) e);
                    }
                }
                return;
            }
            throw new LockedDownException();
        } catch (ConnectionException e2) {
            for (C9047f next2 : this.f25573g) {
                try {
                    next2.mo33415a(bVar, e2);
                } catch (RuntimeException e3) {
                    C12938b bVar3 = f25570i;
                    bVar3.mo41318c("An exception occurred while running an EventSendCallback.onFailure: " + next2.getClass().getName(), (Throwable) e3);
                }
            }
            if (this.f25574h.mo33424a(e2)) {
                C12938b bVar4 = f25571j;
                bVar4.mo41315c("Initiated a temporary lockdown because of exception: " + e2.getMessage());
            }
            throw e2;
        }
    }
}
