package p120q.p121b.p359l.p361g;

import java.io.Serializable;

/* renamed from: q.b.l.g.c */
/* compiled from: ExceptionMechanism */
public final class C11560c implements Serializable {

    /* renamed from: f */
    private final String f30856f;

    /* renamed from: g */
    private final boolean f30857g;

    public C11560c(String str, boolean z) {
        this.f30856f = str;
        this.f30857g = z;
    }

    /* renamed from: a */
    public String mo37732a() {
        return this.f30856f;
    }

    /* renamed from: b */
    public boolean mo37733b() {
        return this.f30857g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11560c.class != obj.getClass()) {
            return false;
        }
        C11560c cVar = (C11560c) obj;
        String str = this.f30856f;
        if (str == null ? cVar.f30856f != null : !str.equals(cVar.f30856f)) {
            return false;
        }
        if (this.f30857g == cVar.f30857g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f30856f;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.f30857g ? 1231 : 1237);
    }

    public String toString() {
        return "ExceptionMechanism{type='" + this.f30856f + '\'' + ", handled=" + this.f30857g + '}';
    }
}
