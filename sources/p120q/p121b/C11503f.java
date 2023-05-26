package p120q.p121b;

import java.io.PrintStream;
import java.lang.Thread;
import p120q.p121b.p359l.C11542b;
import p120q.p121b.p359l.C11544c;
import p120q.p121b.p359l.p361g.C11559b;
import p120q.p121b.p359l.p361g.C11565h;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.f */
/* compiled from: SentryUncaughtExceptionHandler */
public class C11503f implements Thread.UncaughtExceptionHandler {

    /* renamed from: h */
    private static final C12938b f30735h = C12939c.m41777a((Class<?>) C5312d.class);

    /* renamed from: f */
    private Thread.UncaughtExceptionHandler f30736f;

    /* renamed from: g */
    private volatile Boolean f30737g = true;

    public C11503f(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f30736f = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public static C11503f m37632a() {
        f30735h.mo41310b("Configuring uncaught exception handler.");
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            C12938b bVar = f30735h;
            bVar.mo41310b("default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'");
        }
        C11503f fVar = new C11503f(defaultUncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(fVar);
        return fVar;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (this.f30737g.booleanValue()) {
            f30735h.mo41319d("Uncaught exception received.");
            C11544c cVar = new C11544c();
            cVar.mo37705c(th.getMessage());
            cVar.mo37700a(C11542b.C11543a.FATAL);
            cVar.mo37701a((C11565h) new C11559b(th));
            try {
                C5310b.m10092a(cVar);
            } catch (RuntimeException e) {
                f30735h.mo41308a("Error sending uncaught exception to Sentry.", (Throwable) e);
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f30736f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else if (!(th instanceof ThreadDeath)) {
            PrintStream printStream = System.err;
            printStream.print("Exception in thread \"" + thread.getName() + "\" ");
            th.printStackTrace(System.err);
        }
    }
}
