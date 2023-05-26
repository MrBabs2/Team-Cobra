package p036io.sentry.dsn;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import p120q.p121b.p354i.C11515d;
import p120q.p121b.p367q.C11591b;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: io.sentry.dsn.a */
/* compiled from: Dsn */
public class C9055a {

    /* renamed from: k */
    private static final C12938b f25628k = C12939c.m41777a((Class<?>) C9055a.class);

    /* renamed from: a */
    private String f25629a;

    /* renamed from: b */
    private String f25630b;

    /* renamed from: c */
    private String f25631c;

    /* renamed from: d */
    private String f25632d;

    /* renamed from: e */
    private String f25633e;

    /* renamed from: f */
    private int f25634f;

    /* renamed from: g */
    private String f25635g;

    /* renamed from: h */
    private Set<String> f25636h;

    /* renamed from: i */
    private Map<String, String> f25637i;

    /* renamed from: j */
    private URI f25638j;

    public C9055a(String str) throws InvalidDsnException {
        this(URI.create(str));
    }

    /* renamed from: a */
    public static String m29747a(C11515d dVar) {
        String a = dVar.mo37633a("dsn");
        if (C11591b.m37917a(a)) {
            a = dVar.mo37633a("dns");
        }
        if (!C11591b.m37917a(a)) {
            return a;
        }
        f25628k.mo41315c("*** Couldn't find a suitable DSN, Sentry operations will do nothing! See documentation: https://docs.sentry.io/clients/java/ ***");
        return "noop://localhost?async=false";
    }

    /* renamed from: b */
    private void m29749b(URI uri) {
        String query = uri.getQuery();
        if (query != null && !query.isEmpty()) {
            String[] split = query.split("&");
            int length = split.length;
            int i = 0;
            while (i < length) {
                String str = split[i];
                try {
                    String[] split2 = str.split("=");
                    this.f25637i.put(URLDecoder.decode(split2[0], "UTF-8"), split2.length > 1 ? URLDecoder.decode(split2[1], "UTF-8") : null);
                    i++;
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalArgumentException("Impossible to decode the query parameter '" + str + "'", e);
                }
            }
        }
    }

    /* renamed from: c */
    private void m29750c(URI uri) {
        String path = uri.getPath();
        if (path != null) {
            int lastIndexOf = path.lastIndexOf("/") + 1;
            this.f25635g = path.substring(0, lastIndexOf);
            this.f25631c = path.substring(lastIndexOf);
        }
    }

    /* renamed from: d */
    private void m29751d(URI uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            String[] split = scheme.split("\\+");
            this.f25636h.addAll(Arrays.asList(split).subList(0, split.length - 1));
            this.f25632d = split[split.length - 1];
        }
    }

    /* renamed from: e */
    private void m29752e(URI uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo != null) {
            String[] split = userInfo.split(":");
            this.f25630b = split[0];
            if (split.length > 1) {
                this.f25629a = split[1];
            }
        }
    }

    /* renamed from: h */
    private void m29753h() {
        this.f25637i = Collections.unmodifiableMap(this.f25637i);
        this.f25636h = Collections.unmodifiableSet(this.f25636h);
    }

    /* renamed from: i */
    private void m29754i() {
        LinkedList linkedList = new LinkedList();
        if (this.f25633e == null) {
            linkedList.add("host");
        }
        String str = this.f25632d;
        if (str != null && !str.equalsIgnoreCase("noop") && !this.f25632d.equalsIgnoreCase("out")) {
            if (this.f25630b == null) {
                linkedList.add("public key");
            }
            String str2 = this.f25631c;
            if (str2 == null || str2.isEmpty()) {
                linkedList.add("project ID");
            }
        }
        if (!linkedList.isEmpty()) {
            throw new InvalidDsnException("Invalid DSN, the following properties aren't set '" + linkedList + "'");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9055a.class != obj.getClass()) {
            return false;
        }
        C9055a aVar = (C9055a) obj;
        if (this.f25634f != aVar.f25634f || !this.f25633e.equals(aVar.f25633e) || !this.f25637i.equals(aVar.f25637i) || !this.f25635g.equals(aVar.f25635g) || !this.f25631c.equals(aVar.f25631c)) {
            return false;
        }
        String str = this.f25632d;
        if (str == null ? aVar.f25632d == null : str.equals(aVar.f25632d)) {
            return this.f25636h.equals(aVar.f25636h) && this.f25630b.equals(aVar.f25630b) && C11591b.m37916a((Object) this.f25629a, (Object) aVar.f25629a);
        }
        return false;
    }

    /* renamed from: f */
    public String mo33436f() {
        return this.f25629a;
    }

    /* renamed from: g */
    public URI mo33437g() {
        return this.f25638j;
    }

    public int hashCode() {
        return (((((((this.f25630b.hashCode() * 31) + this.f25631c.hashCode()) * 31) + this.f25633e.hashCode()) * 31) + this.f25634f) * 31) + this.f25635g.hashCode();
    }

    public String toString() {
        return "Dsn{uri=" + this.f25638j + '}';
    }

    public C9055a(URI uri) throws InvalidDsnException {
        if (uri != null) {
            this.f25637i = new HashMap();
            this.f25636h = new HashSet();
            m29751d(uri);
            m29752e(uri);
            m29748a(uri);
            m29750c(uri);
            m29749b(uri);
            m29753h();
            m29754i();
            try {
                this.f25638j = new URI(this.f25632d, (String) null, this.f25633e, this.f25634f, this.f25635g, (String) null, (String) null);
            } catch (URISyntaxException e) {
                throw new InvalidDsnException("Impossible to determine Sentry's URI from the DSN '" + uri + "'", e);
            }
        } else {
            throw new InvalidDsnException("DSN constructed with null value!");
        }
    }

    /* renamed from: c */
    public String mo33432c() {
        return this.f25632d;
    }

    /* renamed from: d */
    public Set<String> mo33433d() {
        return this.f25636h;
    }

    /* renamed from: a */
    private void m29748a(URI uri) {
        this.f25633e = uri.getHost();
        this.f25634f = uri.getPort();
    }

    /* renamed from: e */
    public String mo33434e() {
        return this.f25630b;
    }

    /* renamed from: a */
    public Map<String, String> mo33430a() {
        return this.f25637i;
    }

    /* renamed from: b */
    public String mo33431b() {
        return this.f25631c;
    }
}
