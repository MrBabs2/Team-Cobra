package p120q.p121b.p359l;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import p015cm.aptoide.p016pt.BuildConfig;

/* renamed from: q.b.l.a */
/* compiled from: Breadcrumb */
public class C11539a implements Serializable {

    /* renamed from: f */
    private final C11541b f30787f;

    /* renamed from: g */
    private final Date f30788g;

    /* renamed from: h */
    private final C11540a f30789h;

    /* renamed from: i */
    private final String f30790i;

    /* renamed from: j */
    private final String f30791j;

    /* renamed from: k */
    private final Map<String, String> f30792k;

    /* renamed from: q.b.l.a$a */
    /* compiled from: Breadcrumb */
    public enum C11540a {
        DEBUG("debug"),
        INFO("info"),
        WARNING("warning"),
        ERROR("error"),
        CRITICAL("critical");
        

        /* renamed from: f */
        private final String f30799f;

        private C11540a(String str) {
            this.f30799f = str;
        }

        /* renamed from: a */
        public String mo37655a() {
            return this.f30799f;
        }
    }

    /* renamed from: q.b.l.a$b */
    /* compiled from: Breadcrumb */
    public enum C11541b {
        DEFAULT(BuildConfig.APTOIDE_THEME),
        HTTP("http"),
        NAVIGATION("navigation"),
        USER("user");
        

        /* renamed from: f */
        private final String f30805f;

        private C11541b(String str) {
            this.f30805f = str;
        }

        /* renamed from: a */
        public String mo37656a() {
            return this.f30805f;
        }
    }

    /* renamed from: a */
    public String mo37647a() {
        return this.f30791j;
    }

    /* renamed from: b */
    public Map<String, String> mo37648b() {
        return this.f30792k;
    }

    /* renamed from: c */
    public C11540a mo37649c() {
        return this.f30789h;
    }

    /* renamed from: d */
    public String mo37650d() {
        return this.f30790i;
    }

    /* renamed from: e */
    public Date mo37651e() {
        return this.f30788g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11539a.class != obj.getClass()) {
            return false;
        }
        C11539a aVar = (C11539a) obj;
        if (this.f30787f != aVar.f30787f || !C4757h.m7801a(this.f30788g, aVar.f30788g) || this.f30789h != aVar.f30789h || !C4757h.m7801a(this.f30790i, aVar.f30790i) || !C4757h.m7801a(this.f30791j, aVar.f30791j) || !C4757h.m7801a(this.f30792k, aVar.f30792k)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C11541b mo37653f() {
        return this.f30787f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30787f, this.f30788g, this.f30789h, this.f30790i, this.f30791j, this.f30792k});
    }
}
