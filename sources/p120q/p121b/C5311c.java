package p120q.p121b;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p036io.sentry.connection.C9045d;
import p036io.sentry.connection.LockedDownException;
import p036io.sentry.connection.TooManyRequestsException;
import p120q.p121b.p357j.C11532a;
import p120q.p121b.p357j.C11533b;
import p120q.p121b.p359l.C11542b;
import p120q.p121b.p359l.C11544c;
import p120q.p121b.p359l.p360f.C11553c;
import p120q.p121b.p359l.p360f.C11556f;
import p120q.p121b.p367q.C11591b;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.c */
/* compiled from: SentryClient */
public class C5311c {

    /* renamed from: m */
    private static final C12938b f9531m;

    /* renamed from: a */
    protected String f9532a;

    /* renamed from: b */
    protected String f9533b;

    /* renamed from: c */
    protected String f9534c;

    /* renamed from: d */
    protected String f9535d;

    /* renamed from: e */
    protected Map<String, String> f9536e = new HashMap();

    /* renamed from: f */
    protected Set<String> f9537f = new HashSet();

    /* renamed from: g */
    protected Map<String, Object> f9538g = new HashMap();

    /* renamed from: h */
    private final Set<C11556f> f9539h = new HashSet();

    /* renamed from: i */
    private final C9045d f9540i;

    /* renamed from: j */
    private final List<C11553c> f9541j = new CopyOnWriteArrayList();

    /* renamed from: k */
    private final C11533b f9542k;

    /* renamed from: l */
    private C11503f f9543l;

    static {
        Class<C5311c> cls = C5311c.class;
        f9531m = C12939c.m41777a((Class<?>) cls);
        C12939c.m41778a(cls.getName() + ".lockdown");
    }

    public C5311c(C9045d dVar, C11533b bVar) {
        this.f9540i = dVar;
        this.f9542k = bVar;
    }

    /* renamed from: a */
    public void mo18513a(C11542b bVar) {
        if (bVar != null) {
            for (C11556f next : this.f9539h) {
                if (!next.mo37719a(bVar)) {
                    f9531m.mo41311b("Not sending Event because of ShouldSendEventCallback: {}", (Object) next);
                    return;
                }
            }
            try {
                this.f9540i.mo33402a(bVar);
            } catch (LockedDownException | TooManyRequestsException unused) {
                C12938b bVar2 = f9531m;
                bVar2.mo41310b("Dropping an Event due to lockdown: " + bVar);
            } catch (RuntimeException e) {
                f9531m.mo41308a("An exception occurred while sending the event to Sentry.", (Throwable) e);
            } catch (Throwable th) {
                mo18508a().mo37639a(bVar.mo37681i());
                throw th;
            }
            mo18508a().mo37639a(bVar.mo37681i());
        }
    }

    /* renamed from: b */
    public void mo18517b(C11544c cVar) {
        for (C11553c a : this.f9541j) {
            a.mo37625a(cVar);
        }
    }

    /* renamed from: c */
    public void mo18519c(C11544c cVar) {
        if (cVar != null) {
            mo18513a(mo18509a(cVar));
        }
    }

    /* renamed from: d */
    public void mo18520d(String str) {
        this.f9532a = str;
    }

    /* renamed from: e */
    public void mo18521e(String str) {
        this.f9535d = str;
    }

    public String toString() {
        return "SentryClient{release='" + this.f9532a + '\'' + ", dist='" + this.f9533b + '\'' + ", environment='" + this.f9534c + '\'' + ", serverName='" + this.f9535d + '\'' + ", tags=" + this.f9536e + ", mdcTags=" + this.f9537f + ", extra=" + this.f9538g + ", connection=" + this.f9540i + ", builderHelpers=" + this.f9541j + ", contextManager=" + this.f9542k + ", uncaughtExceptionHandler=" + this.f9543l + '}';
    }

    /* renamed from: b */
    public void mo18516b(String str) {
        this.f9533b = str;
    }

    /* renamed from: c */
    public void mo18518c(String str) {
        this.f9534c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18515b() {
        this.f9543l = C11503f.m37632a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11542b mo18509a(C11544c cVar) {
        C11542b b = cVar.mo37703b();
        if (!C11591b.m37917a(this.f9532a) && b.mo37686n() == null) {
            cVar.mo37706d(this.f9532a.trim());
            if (!C11591b.m37917a(this.f9533b)) {
                cVar.mo37695a(this.f9533b.trim());
            }
        }
        if (!C11591b.m37917a(this.f9534c) && b.mo37676f() == null) {
            cVar.mo37704b(this.f9534c.trim());
        }
        if (!C11591b.m37917a(this.f9535d) && b.mo37689q() == null) {
            cVar.mo37708f(this.f9535d.trim());
        }
        for (Map.Entry next : this.f9536e.entrySet()) {
            Map<String, String> r = b.mo37690r();
            String put = r.put(next.getKey(), next.getValue());
            if (put != null) {
                r.put(next.getKey(), put);
            }
        }
        for (Map.Entry next2 : this.f9538g.entrySet()) {
            Map<String, Object> g = b.mo37678g();
            Object put2 = g.put(next2.getKey(), next2.getValue());
            if (put2 != null) {
                g.put(next2.getKey(), put2);
            }
        }
        mo18517b(cVar);
        return cVar.mo37694a();
    }

    /* renamed from: a */
    public void mo18514a(C11553c cVar) {
        f9531m.mo41316c("Adding '{}' to the list of builder helpers.", (Object) cVar);
        this.f9541j.add(cVar);
    }

    /* renamed from: a */
    public C11532a mo18508a() {
        return this.f9542k.getContext();
    }

    /* renamed from: a */
    public void mo18512a(String str, String str2) {
        this.f9536e.put(str, str2);
    }

    /* renamed from: a */
    public void mo18510a(String str) {
        this.f9537f.add(str);
    }

    /* renamed from: a */
    public void mo18511a(String str, Object obj) {
        this.f9538g.put(str, obj);
    }
}
