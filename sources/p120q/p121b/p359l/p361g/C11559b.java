package p120q.p121b.p359l.p361g;

import java.util.Deque;

/* renamed from: q.b.l.g.b */
/* compiled from: ExceptionInterface */
public class C11559b implements C11565h {

    /* renamed from: f */
    private final Deque<C11564g> f30855f;

    public C11559b(Throwable th) {
        this(C11564g.m37815a(th));
    }

    /* renamed from: a */
    public Deque<C11564g> mo37728a() {
        return this.f30855f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11559b.class != obj.getClass()) {
            return false;
        }
        return this.f30855f.equals(((C11559b) obj).f30855f);
    }

    public int hashCode() {
        return this.f30855f.hashCode();
    }

    public String toString() {
        return "ExceptionInterface{exceptions=" + this.f30855f + '}';
    }

    /* renamed from: y */
    public String mo37724y() {
        return "sentry.interfaces.Exception";
    }

    public C11559b(Deque<C11564g> deque) {
        this.f30855f = deque;
    }
}
