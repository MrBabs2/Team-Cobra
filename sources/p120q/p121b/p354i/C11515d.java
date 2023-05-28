package p120q.p121b.p354i;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p036io.sentry.dsn.C9055a;
import p120q.p121b.C5310b;
import p120q.p121b.p354i.p355f.C11517a;
import p120q.p121b.p354i.p355f.C11518b;
import p120q.p121b.p354i.p355f.C11519c;
import p120q.p121b.p354i.p355f.C11520d;
import p120q.p121b.p354i.p355f.C11521e;
import p120q.p121b.p354i.p356g.C11522a;
import p120q.p121b.p354i.p356g.C11523b;
import p120q.p121b.p354i.p356g.C11524c;
import p120q.p121b.p354i.p356g.C11525d;
import p120q.p121b.p354i.p356g.C11528e;
import p120q.p121b.p354i.p356g.C11529f;
import p120q.p121b.p354i.p356g.C11531h;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.i.d */
/* compiled from: Lookup */
public final class C11515d {

    /* renamed from: c */
    private static final C12938b f30760c = C12939c.m41777a((Class<?>) C11515d.class);

    /* renamed from: a */
    private final C11523b f30761a;

    /* renamed from: b */
    private final C11523b f30762b;

    public C11515d(C11523b bVar, C11523b bVar2) {
        this.f30761a = bVar;
        this.f30762b = bVar2;
    }

    /* renamed from: a */
    public static C11515d m37672a() {
        return new C11515d(new C11522a(m37671a((Collection<C11523b>) Collections.emptyList())), new C11522a(m37674b(Collections.emptyList())));
    }

    /* renamed from: b */
    private static List<C11516e> m37673b() {
        C11516e a = C5310b.m10090a();
        if (a == null) {
            return Arrays.asList(new C11516e[]{new C11514c(), new C11513b()});
        }
        return Arrays.asList(new C11516e[]{new C11514c(), a, new C11513b()});
    }

    /* renamed from: c */
    private static List<C11518b> m37675c() {
        return Arrays.asList(new C11518b[]{new C11521e(), new C11519c(), new C11520d()});
    }

    /* renamed from: a */
    private static List<C11523b> m37671a(Collection<C11523b> collection) {
        boolean a = C11528e.m37688a();
        ArrayList arrayList = new ArrayList(a ? collection.size() + 3 : collection.size() + 2);
        arrayList.addAll(collection);
        if (a) {
            arrayList.add(new C11525d());
        }
        arrayList.add(new C11531h());
        arrayList.add(new C11524c());
        return arrayList;
    }

    /* renamed from: b */
    private static List<C11523b> m37674b(Collection<C11523b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        arrayList.addAll(collection);
        try {
            arrayList.add(new C11529f(new C11512a(m37673b()), new C11517a(m37675c()), Charset.defaultCharset()));
        } catch (IOException e) {
            f30760c.mo41321d("Failed to instantiate resource locator-based configuration provider.", (Throwable) e);
        }
        return arrayList;
    }

    /* renamed from: a */
    public String mo37633a(String str) {
        return mo37634a(str, (C9055a) null);
    }

    /* renamed from: a */
    public String mo37634a(String str, C9055a aVar) {
        String a = this.f30761a.mo37636a(str);
        if (!(a != null || aVar == null || (a = aVar.mo33430a().get(str)) == null)) {
            f30760c.mo41307a("Found {}={} in DSN.", str, a);
        }
        if (a == null) {
            a = this.f30762b.mo37636a(str);
        }
        if (a == null) {
            return null;
        }
        return a.trim();
    }
}
