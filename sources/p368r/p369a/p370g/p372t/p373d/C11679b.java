package p368r.p369a.p370g.p372t.p373d;

import java.io.IOException;
import p368r.p369a.p370g.C11603b;
import p368r.p369a.p370g.C11609f;
import p368r.p369a.p370g.C11611g;
import p368r.p369a.p370g.C11620h;
import p368r.p369a.p370g.C11639l;
import p368r.p369a.p370g.C11662q;
import p368r.p369a.p370g.p371s.C11669d;
import p368r.p369a.p370g.p371s.C11670e;

/* renamed from: r.a.g.t.d.b */
/* compiled from: ServiceInfoResolver */
public class C11679b extends C11678a {

    /* renamed from: i */
    private final C11662q f31243i;

    public C11679b(C11639l lVar, C11662q qVar) {
        super(lVar);
        this.f31243i = qVar;
        qVar.mo38173a(mo38214a());
        mo38214a().mo38099a((C11607d) qVar, C11611g.m38039a(qVar.mo37862l(), C11670e.TYPE_ANY, C11669d.CLASS_IN, false));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11609f mo38221a(C11609f fVar) throws IOException {
        if (!this.f31243i.mo37868u()) {
            long currentTimeMillis = System.currentTimeMillis();
            fVar = mo38213a(mo38213a(fVar, (C11620h) mo38214a().mo38121y().mo37874a(this.f31243i.mo37862l(), C11670e.TYPE_SRV, C11669d.CLASS_IN), currentTimeMillis), (C11620h) mo38214a().mo38121y().mo37874a(this.f31243i.mo37862l(), C11670e.TYPE_TXT, C11669d.CLASS_IN), currentTimeMillis);
            if (this.f31243i.mo37863m().length() > 0) {
                for (C11603b bVar : mo38214a().mo38121y().mo37877b(this.f31243i.mo37863m(), C11670e.TYPE_A, C11669d.CLASS_IN)) {
                    fVar = mo38213a(fVar, (C11620h) bVar, currentTimeMillis);
                }
                for (C11603b bVar2 : mo38214a().mo38121y().mo37877b(this.f31243i.mo37863m(), C11670e.TYPE_AAAA, C11669d.CLASS_IN)) {
                    fVar = mo38213a(fVar, (C11620h) bVar2, currentTimeMillis);
                }
            }
        }
        return fVar;
    }

    /* renamed from: b */
    public String mo38215b() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceInfoResolver(");
        sb.append(mo38214a() != null ? mo38214a().mo38077F() : "");
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo38224c() {
        StringBuilder sb = new StringBuilder();
        sb.append("querying service info: ");
        C11662q qVar = this.f31243i;
        sb.append(qVar != null ? qVar.mo37862l() : "null");
        return sb.toString();
    }

    public boolean cancel() {
        boolean cancel = super.cancel();
        if (!this.f31243i.mo37869w()) {
            mo38214a().mo38098a((C11607d) this.f31243i);
        }
        return cancel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11609f mo38223b(C11609f fVar) throws IOException {
        if (this.f31243i.mo37868u()) {
            return fVar;
        }
        C11609f a = mo38211a(mo38211a(fVar, C11611g.m38039a(this.f31243i.mo37862l(), C11670e.TYPE_SRV, C11669d.CLASS_IN, false)), C11611g.m38039a(this.f31243i.mo37862l(), C11670e.TYPE_TXT, C11669d.CLASS_IN, false));
        return this.f31243i.mo37863m().length() > 0 ? mo38211a(mo38211a(a, C11611g.m38039a(this.f31243i.mo37863m(), C11670e.TYPE_A, C11669d.CLASS_IN, false)), C11611g.m38039a(this.f31243i.mo37863m(), C11670e.TYPE_AAAA, C11669d.CLASS_IN, false)) : a;
    }
}
