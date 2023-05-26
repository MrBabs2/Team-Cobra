package p368r.p369a.p370g.p372t.p373d;

import java.io.IOException;
import p368r.p369a.C11598d;
import p368r.p369a.p370g.C11609f;
import p368r.p369a.p370g.C11611g;
import p368r.p369a.p370g.C11620h;
import p368r.p369a.p370g.C11639l;
import p368r.p369a.p370g.p371s.C11669d;
import p368r.p369a.p370g.p371s.C11670e;

/* renamed from: r.a.g.t.d.c */
/* compiled from: ServiceResolver */
public class C11680c extends C11678a {

    /* renamed from: i */
    private final String f31244i;

    public C11680c(C11639l lVar, String str) {
        super(lVar);
        this.f31244i = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11609f mo38221a(C11609f fVar) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        for (C11598d next : mo38214a().mo38079H().values()) {
            fVar = mo38213a(fVar, (C11620h) new C11620h.C11625e(next.mo37866r(), C11669d.CLASS_IN, false, 3600, next.mo37862l()), currentTimeMillis);
        }
        return fVar;
    }

    /* renamed from: b */
    public String mo38215b() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceResolver(");
        sb.append(mo38214a() != null ? mo38214a().mo38077F() : "");
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo38224c() {
        return "querying service";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11609f mo38223b(C11609f fVar) throws IOException {
        return mo38211a(fVar, C11611g.m38039a(this.f31244i, C11670e.TYPE_PTR, C11669d.CLASS_IN, false));
    }
}
