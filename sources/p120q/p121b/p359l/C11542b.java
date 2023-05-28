package p120q.p121b.p359l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p120q.p121b.p359l.p361g.C11565h;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.l.b */
/* compiled from: Event */
public class C11542b implements Serializable {

    /* renamed from: z */
    private static final C12938b f30806z = C12939c.m41777a((Class<?>) C11542b.class);

    /* renamed from: f */
    private final UUID f30807f;

    /* renamed from: g */
    private String f30808g;

    /* renamed from: h */
    private Date f30809h;

    /* renamed from: i */
    private C11543a f30810i;

    /* renamed from: j */
    private String f30811j;

    /* renamed from: k */
    private String f30812k;

    /* renamed from: l */
    private C11549d f30813l;

    /* renamed from: m */
    private String f30814m;

    /* renamed from: n */
    private String f30815n;

    /* renamed from: o */
    private Map<String, String> f30816o = new HashMap();

    /* renamed from: p */
    private List<C11539a> f30817p = new ArrayList();

    /* renamed from: q */
    private Map<String, Map<String, Object>> f30818q = new HashMap();

    /* renamed from: r */
    private String f30819r;

    /* renamed from: s */
    private String f30820s;

    /* renamed from: t */
    private String f30821t;

    /* renamed from: u */
    private String f30822u;

    /* renamed from: v */
    private transient Map<String, Object> f30823v = new HashMap();

    /* renamed from: w */
    private List<String> f30824w;

    /* renamed from: x */
    private String f30825x;

    /* renamed from: y */
    private Map<String, C11565h> f30826y = new HashMap();

    /* renamed from: q.b.l.b$a */
    /* compiled from: Event */
    public enum C11543a {
        FATAL,
        ERROR,
        WARNING,
        INFO,
        DEBUG
    }

    C11542b(UUID uuid) {
        if (uuid != null) {
            this.f30807f = uuid;
            return;
        }
        throw new IllegalArgumentException("The id can't be null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f30823v = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(m37710e(this.f30823v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37659a(Date date) {
        this.f30809h = date;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37665b(String str) {
        this.f30821t = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo37668c(String str) {
        this.f30808g = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo37671d(String str) {
        this.f30812k = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo37674e(String str) {
        this.f30819r = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11542b.class != obj.getClass()) {
            return false;
        }
        return this.f30807f.equals(((C11542b) obj).f30807f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo37677f(String str) {
        this.f30822u = str;
    }

    /* renamed from: g */
    public Map<String, Object> mo37678g() {
        if (this.f30823v == null) {
            this.f30823v = new HashMap();
            f30806z.mo41315c("`extra` field was null, deserialization must not have been called, please check your ProGuard (or other obfuscation) configuration.");
        }
        return this.f30823v;
    }

    /* renamed from: h */
    public List<String> mo37679h() {
        return this.f30824w;
    }

    public int hashCode() {
        return this.f30807f.hashCode();
    }

    /* renamed from: i */
    public UUID mo37681i() {
        return this.f30807f;
    }

    /* renamed from: j */
    public C11543a mo37682j() {
        return this.f30810i;
    }

    /* renamed from: k */
    public String mo37683k() {
        return this.f30811j;
    }

    /* renamed from: l */
    public String mo37684l() {
        return this.f30808g;
    }

    /* renamed from: m */
    public String mo37685m() {
        return this.f30812k;
    }

    /* renamed from: n */
    public String mo37686n() {
        return this.f30819r;
    }

    /* renamed from: o */
    public C11549d mo37687o() {
        return this.f30813l;
    }

    /* renamed from: p */
    public Map<String, C11565h> mo37688p() {
        return this.f30826y;
    }

    /* renamed from: q */
    public String mo37689q() {
        return this.f30822u;
    }

    /* renamed from: r */
    public Map<String, String> mo37690r() {
        return this.f30816o;
    }

    /* renamed from: s */
    public Date mo37691s() {
        Date date = this.f30809h;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: t */
    public String mo37692t() {
        return this.f30815n;
    }

    public String toString() {
        return "Event{level=" + this.f30810i + ", message='" + this.f30808g + '\'' + ", logger='" + this.f30811j + '\'' + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37662a(C11543a aVar) {
        this.f30810i = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37666b(Map<String, Object> map) {
        this.f30823v = map;
    }

    /* renamed from: c */
    public Map<String, Map<String, Object>> mo37667c() {
        return this.f30818q;
    }

    /* renamed from: d */
    public String mo37670d() {
        return this.f30814m;
    }

    /* renamed from: e */
    public String mo37673e() {
        return this.f30820s;
    }

    /* renamed from: f */
    public String mo37676f() {
        return this.f30821t;
    }

    /* renamed from: e */
    private static HashMap<String, ? super Serializable> m37710e(Map<String, Object> map) {
        HashMap<String, ? super Serializable> hashMap = new HashMap<>(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() == null) {
                hashMap.put(next.getKey(), (Object) null);
            } else if (next.getValue() instanceof Serializable) {
                hashMap.put(next.getKey(), (Serializable) next.getValue());
            } else {
                hashMap.put(next.getKey(), next.getValue().toString());
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public void mo37663a(C11549d dVar) {
        this.f30813l = dVar;
    }

    /* renamed from: b */
    public String mo37664b() {
        return this.f30825x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo37669c(Map<String, C11565h> map) {
        this.f30826y = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo37672d(Map<String, String> map) {
        this.f30816o = map;
    }

    /* renamed from: a */
    public List<C11539a> mo37657a() {
        return this.f30817p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37660a(List<C11539a> list) {
        this.f30817p = list;
    }

    /* renamed from: a */
    public void mo37661a(Map<String, Map<String, Object>> map) {
        this.f30818q = map;
    }

    /* renamed from: a */
    public void mo37658a(String str) {
        this.f30820s = str;
    }
}
