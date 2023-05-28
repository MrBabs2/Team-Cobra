package p120q.p121b.p359l.p361g;

import java.util.Arrays;
import java.util.List;

/* renamed from: q.b.l.g.f */
/* compiled from: MessageInterface */
public class C11563f implements C11565h {

    /* renamed from: f */
    private final String f30878f;

    /* renamed from: g */
    private final List<String> f30879g;

    /* renamed from: h */
    private final String f30880h;

    /* renamed from: a */
    public String mo37760a() {
        return this.f30880h;
    }

    /* renamed from: b */
    public String mo37761b() {
        return this.f30878f;
    }

    /* renamed from: c */
    public List<String> mo37762c() {
        return this.f30879g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11563f.class != obj.getClass()) {
            return false;
        }
        C11563f fVar = (C11563f) obj;
        if (!C4757h.m7801a(this.f30878f, fVar.f30878f) || !C4757h.m7801a(this.f30879g, fVar.f30879g) || !C4757h.m7801a(this.f30880h, fVar.f30880h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30878f, this.f30879g, this.f30880h});
    }

    public String toString() {
        return "MessageInterface{message='" + this.f30878f + '\'' + ", parameters=" + this.f30879g + ", formatted=" + this.f30880h + '}';
    }

    /* renamed from: y */
    public String mo37724y() {
        return "sentry.interfaces.Message";
    }
}
