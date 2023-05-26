package p120q.p121b.p354i;

import java.io.InputStream;
import java.util.Collection;

/* renamed from: q.b.i.a */
/* compiled from: CompoundResourceLoader */
public class C11512a implements C11516e {

    /* renamed from: a */
    private final Collection<C11516e> f30758a;

    public C11512a(Collection<C11516e> collection) {
        this.f30758a = collection;
    }

    /* renamed from: a */
    public InputStream mo37632a(String str) {
        for (C11516e a : this.f30758a) {
            InputStream a2 = a.mo37632a(str);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }
}
