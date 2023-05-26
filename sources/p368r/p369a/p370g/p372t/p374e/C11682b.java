package p368r.p369a.p370g.p372t.p374e;

import java.io.IOException;
import java.util.Timer;
import p368r.p369a.p370g.C11604c;
import p368r.p369a.p370g.C11609f;
import p368r.p369a.p370g.C11620h;
import p368r.p369a.p370g.C11639l;
import p368r.p369a.p370g.C11662q;
import p368r.p369a.p370g.p371s.C11669d;
import p368r.p369a.p370g.p371s.C11672g;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.t.e.b */
/* compiled from: Canceler */
public class C11682b extends C11683c {
    static {
        C12939c.m41778a(C11682b.class.getName());
    }

    public C11682b(C11639l lVar) {
        super(lVar, 0);
        mo38240b(C11672g.CANCELING_1);
        mo38239a(C11672g.CANCELING_1);
    }

    /* renamed from: a */
    public void mo38236a(Timer timer) {
        timer.schedule(this, 0, 1000);
    }

    /* renamed from: b */
    public String mo38215b() {
        StringBuilder sb = new StringBuilder();
        sb.append("Canceler(");
        sb.append(mo38214a() != null ? mo38214a().mo38077F() : "");
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo38231c() {
        mo38240b(mo38242h().mo38200a());
        if (!mo38242h().mo38204l()) {
            cancel();
        }
    }

    public boolean cancel() {
        mo38243i();
        return super.cancel();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo38233d() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C11609f mo38234e() {
        return new C11609f(33792);
    }

    /* renamed from: g */
    public String mo38235g() {
        return "canceling";
    }

    public String toString() {
        return super.toString() + " state: " + mo38242h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11609f mo38227a(C11609f fVar) throws IOException {
        for (C11620h a : mo38214a().mo38076E().mo38045a(C11669d.CLASS_ANY, true, mo38241f())) {
            fVar = mo38210a(fVar, (C11604c) null, a);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11609f mo38228a(C11662q qVar, C11609f fVar) throws IOException {
        for (C11620h a : qVar.mo38169a(C11669d.CLASS_ANY, true, mo38241f(), mo38214a().mo38076E())) {
            fVar = mo38210a(fVar, (C11604c) null, a);
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo38229a(Throwable th) {
        mo38214a().mo38089R();
    }
}
