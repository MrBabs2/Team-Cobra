package p120q.p121b.p359l.p361g;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import p120q.p121b.p359l.p360f.C11555e;

/* renamed from: q.b.l.g.e */
/* compiled from: HttpInterface */
public class C11562e implements C11565h {

    /* renamed from: f */
    private final String f30860f;

    /* renamed from: g */
    private final String f30861g;

    /* renamed from: h */
    private final Map<String, Collection<String>> f30862h;

    /* renamed from: i */
    private final String f30863i;

    /* renamed from: j */
    private final Map<String, String> f30864j;

    /* renamed from: k */
    private final String f30865k;

    /* renamed from: l */
    private final String f30866l;

    /* renamed from: m */
    private final int f30867m;

    /* renamed from: n */
    private final String f30868n;

    /* renamed from: o */
    private final String f30869o;

    /* renamed from: p */
    private final int f30870p;

    /* renamed from: q */
    private final String f30871q;

    /* renamed from: r */
    private final boolean f30872r;

    /* renamed from: s */
    private final boolean f30873s;

    /* renamed from: t */
    private final String f30874t;

    /* renamed from: u */
    private final String f30875u;

    /* renamed from: v */
    private final Map<String, Collection<String>> f30876v;

    /* renamed from: w */
    private final String f30877w;

    public C11562e(HttpServletRequest httpServletRequest, C11555e eVar) {
        this(httpServletRequest, eVar, (String) null);
    }

    /* renamed from: a */
    public String mo37739a() {
        return this.f30874t;
    }

    /* renamed from: b */
    public String mo37740b() {
        return this.f30877w;
    }

    /* renamed from: c */
    public Map<String, String> mo37741c() {
        return this.f30864j;
    }

    /* renamed from: d */
    public Map<String, Collection<String>> mo37742d() {
        return Collections.unmodifiableMap(this.f30876v);
    }

    /* renamed from: e */
    public String mo37743e() {
        return this.f30868n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11562e.class != obj.getClass()) {
            return false;
        }
        C11562e eVar = (C11562e) obj;
        if (this.f30873s != eVar.f30873s || this.f30870p != eVar.f30870p || this.f30872r != eVar.f30872r || this.f30867m != eVar.f30867m) {
            return false;
        }
        String str = this.f30874t;
        if (str == null ? eVar.f30874t != null : !str.equals(eVar.f30874t)) {
            return false;
        }
        if (!this.f30864j.equals(eVar.f30864j) || !this.f30876v.equals(eVar.f30876v)) {
            return false;
        }
        String str2 = this.f30868n;
        if (str2 == null ? eVar.f30868n != null : !str2.equals(eVar.f30868n)) {
            return false;
        }
        String str3 = this.f30869o;
        if (str3 == null ? eVar.f30869o != null : !str3.equals(eVar.f30869o)) {
            return false;
        }
        String str4 = this.f30861g;
        if (str4 == null ? eVar.f30861g != null : !str4.equals(eVar.f30861g)) {
            return false;
        }
        if (!this.f30862h.equals(eVar.f30862h)) {
            return false;
        }
        String str5 = this.f30871q;
        if (str5 == null ? eVar.f30871q != null : !str5.equals(eVar.f30871q)) {
            return false;
        }
        String str6 = this.f30863i;
        if (str6 == null ? eVar.f30863i != null : !str6.equals(eVar.f30863i)) {
            return false;
        }
        String str7 = this.f30865k;
        if (str7 == null ? eVar.f30865k != null : !str7.equals(eVar.f30865k)) {
            return false;
        }
        String str8 = this.f30875u;
        if (str8 == null ? eVar.f30875u != null : !str8.equals(eVar.f30875u)) {
            return false;
        }
        if (!this.f30860f.equals(eVar.f30860f)) {
            return false;
        }
        String str9 = this.f30866l;
        if (str9 == null ? eVar.f30866l != null : !str9.equals(eVar.f30866l)) {
            return false;
        }
        String str10 = this.f30877w;
        String str11 = eVar.f30877w;
        return str10 == null ? str11 == null : str10.equals(str11);
    }

    /* renamed from: f */
    public String mo37745f() {
        return this.f30869o;
    }

    /* renamed from: g */
    public int mo37746g() {
        return this.f30870p;
    }

    /* renamed from: h */
    public String mo37747h() {
        return this.f30861g;
    }

    public int hashCode() {
        int hashCode = this.f30860f.hashCode() * 31;
        String str = this.f30861g;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f30862h.hashCode();
    }

    /* renamed from: i */
    public Map<String, Collection<String>> mo37749i() {
        return Collections.unmodifiableMap(this.f30862h);
    }

    /* renamed from: j */
    public String mo37750j() {
        return this.f30871q;
    }

    /* renamed from: k */
    public String mo37751k() {
        return this.f30863i;
    }

    /* renamed from: l */
    public String mo37752l() {
        return this.f30865k;
    }

    /* renamed from: m */
    public String mo37753m() {
        return this.f30875u;
    }

    /* renamed from: n */
    public String mo37754n() {
        return this.f30860f;
    }

    /* renamed from: o */
    public String mo37755o() {
        return this.f30866l;
    }

    /* renamed from: p */
    public int mo37756p() {
        return this.f30867m;
    }

    /* renamed from: q */
    public boolean mo37757q() {
        return this.f30873s;
    }

    /* renamed from: r */
    public boolean mo37758r() {
        return this.f30872r;
    }

    public String toString() {
        return "HttpInterface{requestUrl='" + this.f30860f + '\'' + ", method='" + this.f30861g + '\'' + ", queryString='" + this.f30863i + '\'' + ", parameters=" + this.f30862h + '}';
    }

    /* renamed from: y */
    public String mo37724y() {
        return "sentry.interfaces.Http";
    }

    public C11562e(HttpServletRequest httpServletRequest, C11555e eVar, String str) {
        this.f30860f = httpServletRequest.getRequestURL().toString();
        this.f30861g = httpServletRequest.getMethod();
        this.f30862h = new HashMap();
        for (Map.Entry entry : httpServletRequest.getParameterMap().entrySet()) {
            this.f30862h.put(entry.getKey(), Arrays.asList((Object[]) entry.getValue()));
        }
        this.f30863i = httpServletRequest.getQueryString();
        if (httpServletRequest.getCookies() != null) {
            this.f30864j = new HashMap();
            for (Cookie cookie : httpServletRequest.getCookies()) {
                this.f30864j.put(cookie.getName(), cookie.getValue());
            }
        } else {
            this.f30864j = Collections.emptyMap();
        }
        this.f30865k = eVar.mo37718a(httpServletRequest);
        this.f30866l = httpServletRequest.getServerName();
        this.f30867m = httpServletRequest.getServerPort();
        this.f30868n = httpServletRequest.getLocalAddr();
        this.f30869o = httpServletRequest.getLocalName();
        this.f30870p = httpServletRequest.getLocalPort();
        this.f30871q = httpServletRequest.getProtocol();
        this.f30872r = httpServletRequest.isSecure();
        this.f30873s = httpServletRequest.isAsyncStarted();
        this.f30874t = httpServletRequest.getAuthType();
        this.f30875u = httpServletRequest.getRemoteUser();
        this.f30876v = new HashMap();
        Iterator it = Collections.list(httpServletRequest.getHeaderNames()).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            this.f30876v.put(str2, Collections.list(httpServletRequest.getHeaders(str2)));
        }
        this.f30877w = str;
    }
}
