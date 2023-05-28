package p120q.p121b.p359l.p361g;

import java.util.Arrays;
import java.util.Map;

/* renamed from: q.b.l.g.k */
/* compiled from: UserInterface */
public class C11568k implements C11565h {

    /* renamed from: f */
    private final String f30896f;

    /* renamed from: g */
    private final String f30897g;

    /* renamed from: h */
    private final String f30898h;

    /* renamed from: i */
    private final String f30899i;

    /* renamed from: j */
    private final Map<String, Object> f30900j;

    public C11568k(String str, String str2, String str3, String str4, Map<String, Object> map) {
        this.f30896f = str;
        this.f30897g = str2;
        this.f30898h = str3;
        this.f30899i = str4;
        this.f30900j = map;
    }

    /* renamed from: a */
    public Map<String, Object> mo37790a() {
        return this.f30900j;
    }

    /* renamed from: b */
    public String mo37791b() {
        return this.f30899i;
    }

    /* renamed from: c */
    public String mo37792c() {
        return this.f30896f;
    }

    /* renamed from: d */
    public String mo37793d() {
        return this.f30898h;
    }

    /* renamed from: e */
    public String mo37794e() {
        return this.f30897g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11568k.class != obj.getClass()) {
            return false;
        }
        C11568k kVar = (C11568k) obj;
        if (!C4757h.m7801a(this.f30896f, kVar.f30896f) || !C4757h.m7801a(this.f30897g, kVar.f30897g) || !C4757h.m7801a(this.f30898h, kVar.f30898h) || !C4757h.m7801a(this.f30899i, kVar.f30899i) || !C4757h.m7801a(this.f30900j, kVar.f30900j)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30896f, this.f30897g, this.f30898h, this.f30899i, this.f30900j});
    }

    public String toString() {
        return "UserInterface{id='" + this.f30896f + '\'' + ", username='" + this.f30897g + '\'' + ", ipAddress='" + this.f30898h + '\'' + ", email='" + this.f30899i + '\'' + ", data=" + this.f30900j + '}';
    }

    /* renamed from: y */
    public String mo37724y() {
        return "sentry.interfaces.User";
    }

    public C11568k(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, (Map<String, Object>) null);
    }
}
