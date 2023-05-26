package p368r.p369a.p370g.p372t.p374e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p368r.p369a.C11598d;
import p368r.p369a.p370g.C11609f;
import p368r.p369a.p370g.C11628i;
import p368r.p369a.p370g.C11639l;
import p368r.p369a.p370g.C11662q;
import p368r.p369a.p370g.p371s.C11672g;
import p368r.p369a.p370g.p372t.C11675a;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.t.e.c */
/* compiled from: DNSStateTask */
public abstract class C11683c extends C11675a {

    /* renamed from: i */
    static C12938b f31245i = C12939c.m41778a(C11683c.class.getName());

    /* renamed from: j */
    private static int f31246j = 3600;

    /* renamed from: g */
    private final int f31247g;

    /* renamed from: h */
    private C11672g f31248h = null;

    public C11683c(C11639l lVar, int i) {
        super(lVar);
        this.f31247g = i;
    }

    /* renamed from: j */
    public static int m38434j() {
        return f31246j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C11609f mo38227a(C11609f fVar) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C11609f mo38228a(C11662q qVar, C11609f fVar) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo38229a(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38239a(C11672g gVar) {
        synchronized (mo38214a()) {
            mo38214a().mo38102a((C11675a) this, gVar);
        }
        Iterator<C11598d> it = mo38214a().mo38079H().values().iterator();
        while (it.hasNext()) {
            ((C11662q) it.next()).mo38174a((C11675a) this, gVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo38240b(C11672g gVar) {
        this.f31248h = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo38231c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo38233d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C11609f mo38234e();

    /* renamed from: f */
    public int mo38241f() {
        return this.f31247g;
    }

    /* renamed from: g */
    public abstract String mo38235g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C11672g mo38242h() {
        return this.f31248h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo38243i() {
        synchronized (mo38214a()) {
            mo38214a().mo38107b((C11675a) this);
        }
        Iterator<C11598d> it = mo38214a().mo38079H().values().iterator();
        while (it.hasNext()) {
            ((C11662q) it.next()).mo38179b((C11675a) this);
        }
    }

    public void run() {
        C11609f e = mo38234e();
        try {
            if (!mo38233d()) {
                cancel();
                return;
            }
            ArrayList arrayList = new ArrayList();
            synchronized (mo38214a()) {
                if (mo38214a().mo38108b((C11675a) this, mo38242h())) {
                    C12938b bVar = f31245i;
                    bVar.mo41310b(mo38215b() + ".run() JmDNS " + mo38235g() + " " + mo38214a().mo38077F());
                    arrayList.add(mo38214a());
                    e = mo38227a(e);
                }
            }
            Iterator<C11598d> it = mo38214a().mo38079H().values().iterator();
            while (it.hasNext()) {
                C11662q qVar = (C11662q) it.next();
                synchronized (qVar) {
                    if (qVar.mo38181b(this, mo38242h())) {
                        C12938b bVar2 = f31245i;
                        bVar2.mo41310b(mo38215b() + ".run() JmDNS " + mo38235g() + " " + qVar.mo37862l());
                        arrayList.add(qVar);
                        e = mo38228a(qVar, e);
                    }
                }
            }
            if (!e.mo37939n()) {
                C12938b bVar3 = f31245i;
                bVar3.mo41310b(mo38215b() + ".run() JmDNS " + mo38235g() + " #" + mo38242h());
                mo38214a().mo38100a(e);
                mo38238a((List<C11628i>) arrayList);
                mo38231c();
                return;
            }
            mo38238a((List<C11628i>) arrayList);
            cancel();
        } catch (Throwable th) {
            C12938b bVar4 = f31245i;
            bVar4.mo41318c(mo38215b() + ".run() exception ", th);
            mo38229a(th);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38238a(List<C11628i> list) {
        if (list != null) {
            for (C11628i next : list) {
                synchronized (next) {
                    next.mo37998a(this);
                }
            }
        }
    }
}
