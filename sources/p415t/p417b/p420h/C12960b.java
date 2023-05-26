package p415t.p417b.p420h;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p415t.p417b.C12937a;
import p415t.p417b.C12938b;

/* renamed from: t.b.h.b */
/* compiled from: SimpleLoggerFactory */
public class C12960b implements C12937a {

    /* renamed from: a */
    ConcurrentMap<String, C12938b> f33260a = new ConcurrentHashMap();

    public C12960b() {
        C12958a.m41914f();
    }

    /* renamed from: a */
    public C12938b mo41304a(String str) {
        C12938b bVar = (C12938b) this.f33260a.get(str);
        if (bVar != null) {
            return bVar;
        }
        C12958a aVar = new C12958a(str);
        C12938b putIfAbsent = this.f33260a.putIfAbsent(str, aVar);
        return putIfAbsent == null ? aVar : putIfAbsent;
    }
}
