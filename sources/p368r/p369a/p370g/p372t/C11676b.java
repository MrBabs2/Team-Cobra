package p368r.p369a.p370g.p372t;

import java.util.Timer;
import p368r.p369a.p370g.C11639l;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.t.b */
/* compiled from: RecordReaper */
public class C11676b extends C11675a {

    /* renamed from: g */
    static C12938b f31235g = C12939c.m41778a(C11676b.class.getName());

    public C11676b(C11639l lVar) {
        super(lVar);
    }

    /* renamed from: a */
    public void mo38217a(Timer timer) {
        if (!mo38214a().mo38086O() && !mo38214a().mo38085N()) {
            timer.schedule(this, 10000, 10000);
        }
    }

    /* renamed from: b */
    public String mo38215b() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecordReaper(");
        sb.append(mo38214a() != null ? mo38214a().mo38077F() : "");
        sb.append(")");
        return sb.toString();
    }

    public void run() {
        if (!mo38214a().mo38086O() && !mo38214a().mo38085N()) {
            if (f31235g.mo41314b()) {
                C12938b bVar = f31235g;
                bVar.mo41319d(mo38215b() + ".run() JmDNS reaping cache");
            }
            mo38214a().mo38119w();
        }
    }
}
