package p415t.p417b.p419g;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import p415t.p417b.C12938b;
import p415t.p417b.p418f.C12942a;
import p415t.p417b.p418f.C12944c;
import p415t.p417b.p418f.C12945d;

/* renamed from: t.b.g.h */
/* compiled from: SubstituteLogger */
public class C12953h implements C12938b {

    /* renamed from: f */
    private final String f33232f;

    /* renamed from: g */
    private volatile C12938b f33233g;

    /* renamed from: h */
    private Boolean f33234h;

    /* renamed from: i */
    private Method f33235i;

    /* renamed from: j */
    private C12942a f33236j;

    /* renamed from: k */
    private Queue<C12945d> f33237k;

    /* renamed from: l */
    private final boolean f33238l;

    public C12953h(String str, Queue<C12945d> queue, boolean z) {
        this.f33232f = str;
        this.f33237k = queue;
        this.f33238l = z;
    }

    /* renamed from: g */
    private C12938b m41870g() {
        if (this.f33236j == null) {
            this.f33236j = new C12942a(this, this.f33237k);
        }
        return this.f33236j;
    }

    /* renamed from: a */
    public boolean mo41309a() {
        return mo41343c().mo41309a();
    }

    /* renamed from: b */
    public boolean mo41314b() {
        return mo41343c().mo41314b();
    }

    /* renamed from: c */
    public void mo41316c(String str, Object obj) {
        mo41343c().mo41316c(str, obj);
    }

    /* renamed from: d */
    public void mo41319d(String str) {
        mo41343c().mo41319d(str);
    }

    /* renamed from: e */
    public boolean mo41345e() {
        return this.f33233g instanceof C12949d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C12953h.class == obj.getClass() && this.f33232f.equals(((C12953h) obj).f33232f);
    }

    /* renamed from: f */
    public boolean mo41347f() {
        return this.f33233g == null;
    }

    public String getName() {
        return this.f33232f;
    }

    public int hashCode() {
        return this.f33232f.hashCode();
    }

    /* renamed from: a */
    public void mo41307a(String str, Object obj, Object obj2) {
        mo41343c().mo41307a(str, obj, obj2);
    }

    /* renamed from: b */
    public void mo41311b(String str, Object obj) {
        mo41343c().mo41311b(str, obj);
    }

    /* renamed from: c */
    public void mo41315c(String str) {
        mo41343c().mo41315c(str);
    }

    /* renamed from: d */
    public void mo41321d(String str, Throwable th) {
        mo41343c().mo41321d(str, th);
    }

    /* renamed from: a */
    public void mo41306a(String str, Object obj) {
        mo41343c().mo41306a(str, obj);
    }

    /* renamed from: b */
    public void mo41310b(String str) {
        mo41343c().mo41310b(str);
    }

    /* renamed from: c */
    public void mo41318c(String str, Throwable th) {
        mo41343c().mo41318c(str, th);
    }

    /* renamed from: d */
    public void mo41320d(String str, Object obj) {
        mo41343c().mo41320d(str, obj);
    }

    /* renamed from: a */
    public void mo41305a(String str) {
        mo41343c().mo41305a(str);
    }

    /* renamed from: b */
    public void mo41313b(String str, Throwable th) {
        mo41343c().mo41313b(str, th);
    }

    /* renamed from: c */
    public void mo41317c(String str, Object obj, Object obj2) {
        mo41343c().mo41317c(str, obj, obj2);
    }

    /* renamed from: d */
    public boolean mo41344d() {
        Boolean bool = this.f33234h;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f33235i = this.f33233g.getClass().getMethod("log", new Class[]{C12944c.class});
            this.f33234h = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f33234h = Boolean.FALSE;
        }
        return this.f33234h.booleanValue();
    }

    /* renamed from: a */
    public void mo41308a(String str, Throwable th) {
        mo41343c().mo41308a(str, th);
    }

    /* renamed from: b */
    public void mo41312b(String str, Object obj, Object obj2) {
        mo41343c().mo41312b(str, obj, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C12938b mo41343c() {
        if (this.f33233g != null) {
            return this.f33233g;
        }
        if (this.f33238l) {
            return C12949d.f33230g;
        }
        return m41870g();
    }

    /* renamed from: a */
    public void mo41341a(C12938b bVar) {
        this.f33233g = bVar;
    }

    /* renamed from: a */
    public void mo41342a(C12944c cVar) {
        if (mo41344d()) {
            try {
                this.f33235i.invoke(this.f33233g, new Object[]{cVar});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }
}
