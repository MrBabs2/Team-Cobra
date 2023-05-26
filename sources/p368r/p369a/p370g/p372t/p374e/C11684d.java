package p368r.p369a.p370g.p372t.p374e;

import java.io.IOException;
import java.util.Timer;
import p368r.p369a.p370g.C11609f;
import p368r.p369a.p370g.C11611g;
import p368r.p369a.p370g.C11620h;
import p368r.p369a.p370g.C11639l;
import p368r.p369a.p370g.C11662q;
import p368r.p369a.p370g.p371s.C11669d;
import p368r.p369a.p370g.p371s.C11670e;
import p368r.p369a.p370g.p371s.C11672g;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.t.e.d */
/* compiled from: Prober */
public class C11684d extends C11683c {
    static {
        C12939c.m41778a(C11684d.class.getName());
    }

    public C11684d(C11639l lVar) {
        super(lVar, C11683c.m38434j());
        mo38240b(C11672g.PROBING_1);
        mo38239a(C11672g.PROBING_1);
    }

    /* renamed from: a */
    public void mo38245a(Timer timer) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - mo38214a().mo38075D() < 5000) {
            mo38214a().mo38093a(mo38214a().mo38081J() + 1);
        } else {
            mo38214a().mo38093a(1);
        }
        mo38214a().mo38110d(currentTimeMillis);
        if (mo38214a().mo38084M() && mo38214a().mo38081J() < 10) {
            timer.schedule(this, (long) C11639l.m38225W().nextInt(251), 250);
        } else if (!mo38214a().mo38086O() && !mo38214a().mo38085N()) {
            timer.schedule(this, 1000, 1000);
        }
    }

    /* renamed from: b */
    public String mo38215b() {
        StringBuilder sb = new StringBuilder();
        sb.append("Prober(");
        sb.append(mo38214a() != null ? mo38214a().mo38077F() : "");
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo38231c() {
        mo38240b(mo38242h().mo38200a());
        if (!mo38242h().mo38207p()) {
            cancel();
            mo38214a().mo38032o();
        }
    }

    public boolean cancel() {
        mo38243i();
        return super.cancel();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo38233d() {
        return !mo38214a().mo38086O() && !mo38214a().mo38085N();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C11609f mo38234e() {
        return new C11609f(0);
    }

    /* renamed from: g */
    public String mo38235g() {
        return "probing";
    }

    public String toString() {
        return super.toString() + " state: " + mo38242h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11609f mo38227a(C11609f fVar) throws IOException {
        fVar.mo37948a(C11611g.m38039a(mo38214a().mo38076E().mo38061g(), C11670e.TYPE_ANY, C11669d.CLASS_IN, false));
        for (C11620h a : mo38214a().mo38076E().mo38045a(C11669d.CLASS_ANY, false, mo38241f())) {
            fVar = mo38212a(fVar, a);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11609f mo38228a(C11662q qVar, C11609f fVar) throws IOException {
        return mo38212a(mo38211a(fVar, C11611g.m38039a(qVar.mo37862l(), C11670e.TYPE_ANY, C11669d.CLASS_IN, false)), (C11620h) new C11620h.C11626f(qVar.mo37862l(), C11669d.CLASS_IN, false, mo38241f(), qVar.mo37860j(), qVar.mo37867s(), qVar.mo37859i(), mo38214a().mo38076E().mo38061g()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38229a(Throwable th) {
        mo38214a().mo38089R();
    }
}
