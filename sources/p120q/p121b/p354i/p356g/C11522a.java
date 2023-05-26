package p120q.p121b.p354i.p356g;

import java.util.Collection;

/* renamed from: q.b.i.g.a */
/* compiled from: CompoundConfigurationProvider */
public class C11522a implements C11523b {

    /* renamed from: a */
    private final Collection<C11523b> f30767a;

    public C11522a(Collection<C11523b> collection) {
        this.f30767a = collection;
    }

    /* renamed from: a */
    public String mo37636a(String str) {
        for (C11523b a : this.f30767a) {
            String a2 = a.mo37636a(str);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
