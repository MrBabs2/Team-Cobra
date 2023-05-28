package p415t.p417b.p418f;

import java.util.Queue;
import p415t.p417b.C12938b;
import p415t.p417b.C12941e;
import p415t.p417b.p419g.C12953h;

/* renamed from: t.b.f.a */
/* compiled from: EventRecodingLogger */
public class C12942a implements C12938b {

    /* renamed from: f */
    String f33215f;

    /* renamed from: g */
    C12953h f33216g;

    /* renamed from: h */
    Queue<C12945d> f33217h;

    public C12942a(C12953h hVar, Queue<C12945d> queue) {
        this.f33216g = hVar;
        this.f33215f = hVar.getName();
        this.f33217h = queue;
    }

    /* renamed from: a */
    private void m41801a(C12943b bVar, String str, Object[] objArr, Throwable th) {
        m41802a(bVar, (C12941e) null, str, objArr, th);
    }

    /* renamed from: a */
    public boolean mo41309a() {
        return true;
    }

    /* renamed from: b */
    public void mo41311b(String str, Object obj) {
        m41801a(C12943b.TRACE, str, new Object[]{obj}, (Throwable) null);
    }

    /* renamed from: b */
    public boolean mo41314b() {
        return true;
    }

    /* renamed from: c */
    public void mo41316c(String str, Object obj) {
        m41801a(C12943b.DEBUG, str, new Object[]{obj}, (Throwable) null);
    }

    /* renamed from: d */
    public void mo41319d(String str) {
        m41801a(C12943b.TRACE, str, (Object[]) null, (Throwable) null);
    }

    public String getName() {
        return this.f33215f;
    }

    /* renamed from: a */
    private void m41802a(C12943b bVar, C12941e eVar, String str, Object[] objArr, Throwable th) {
        C12945d dVar = new C12945d();
        dVar.mo41325a(System.currentTimeMillis());
        dVar.mo41329a(bVar);
        dVar.mo41330a(this.f33216g);
        dVar.mo41326a(this.f33215f);
        dVar.mo41328a(eVar);
        dVar.mo41332b(str);
        dVar.mo41331a(objArr);
        dVar.mo41327a(th);
        dVar.mo41333c(Thread.currentThread().getName());
        this.f33217h.add(dVar);
    }

    /* renamed from: b */
    public void mo41310b(String str) {
        m41801a(C12943b.TRACE, str, (Object[]) null, (Throwable) null);
    }

    /* renamed from: c */
    public void mo41315c(String str) {
        m41801a(C12943b.WARN, str, (Object[]) null, (Throwable) null);
    }

    /* renamed from: d */
    public void mo41321d(String str, Throwable th) {
        m41801a(C12943b.DEBUG, str, (Object[]) null, th);
    }

    /* renamed from: b */
    public void mo41313b(String str, Throwable th) {
        m41801a(C12943b.INFO, str, (Object[]) null, th);
    }

    /* renamed from: c */
    public void mo41318c(String str, Throwable th) {
        m41801a(C12943b.WARN, str, (Object[]) null, th);
    }

    /* renamed from: d */
    public void mo41320d(String str, Object obj) {
        m41801a(C12943b.ERROR, str, new Object[]{obj}, (Throwable) null);
    }

    /* renamed from: b */
    public void mo41312b(String str, Object obj, Object obj2) {
        m41801a(C12943b.WARN, str, new Object[]{obj, obj2}, (Throwable) null);
    }

    /* renamed from: c */
    public void mo41317c(String str, Object obj, Object obj2) {
        m41801a(C12943b.ERROR, str, new Object[]{obj, obj2}, (Throwable) null);
    }

    /* renamed from: a */
    public void mo41307a(String str, Object obj, Object obj2) {
        m41801a(C12943b.DEBUG, str, new Object[]{obj, obj2}, (Throwable) null);
    }

    /* renamed from: a */
    public void mo41306a(String str, Object obj) {
        m41801a(C12943b.WARN, str, new Object[]{obj}, (Throwable) null);
    }

    /* renamed from: a */
    public void mo41305a(String str) {
        m41801a(C12943b.ERROR, str, (Object[]) null, (Throwable) null);
    }

    /* renamed from: a */
    public void mo41308a(String str, Throwable th) {
        m41801a(C12943b.ERROR, str, (Object[]) null, th);
    }
}
