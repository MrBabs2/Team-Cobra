package p120q.p121b.p354i.p356g;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.NoInitialContextException;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.i.g.d */
/* compiled from: JndiConfigurationProvider */
public class C11525d implements C11523b {

    /* renamed from: c */
    private static final C12938b f30770c = C12939c.m41777a((Class<?>) C11525d.class);

    /* renamed from: a */
    private final String f30771a;

    /* renamed from: b */
    private final C11527b f30772b;

    /* renamed from: q.b.i.g.d$a */
    /* compiled from: JndiConfigurationProvider */
    class C11526a implements C11527b {
        C11526a() {
        }

        public Context getContext() throws NamingException {
            return new InitialContext();
        }
    }

    /* renamed from: q.b.i.g.d$b */
    /* compiled from: JndiConfigurationProvider */
    public interface C11527b {
        Context getContext() throws NamingException;
    }

    public C11525d() {
        this("java:comp/env/sentry/", new C11526a());
    }

    /* renamed from: a */
    public String mo37636a(String str) {
        try {
            Context context = this.f30772b.getContext();
            return (String) context.lookup(this.f30771a + str);
        } catch (NoInitialContextException unused) {
            f30770c.mo41319d("JNDI not configured for Sentry (NoInitialContextEx)");
        } catch (NamingException unused2) {
            C12938b bVar = f30770c;
            bVar.mo41319d("No " + this.f30771a + str + " in JNDI");
        } catch (RuntimeException e) {
            f30770c.mo41318c("Odd RuntimeException while testing for JNDI", (Throwable) e);
        }
        return null;
    }

    public C11525d(String str, C11527b bVar) {
        this.f30771a = str;
        this.f30772b = bVar;
    }
}
