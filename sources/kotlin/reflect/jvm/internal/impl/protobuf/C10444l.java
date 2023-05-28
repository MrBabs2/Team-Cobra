package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.l */
/* compiled from: LazyStringArrayList */
public class C10444l extends AbstractList<String> implements RandomAccess, C10445m {

    /* renamed from: g */
    public static final C10445m f28273g = new C10444l().mo35796B();

    /* renamed from: f */
    private final List<Object> f28274f;

    public C10444l() {
        this.f28274f = new ArrayList();
    }

    /* renamed from: B */
    public C10445m mo35796B() {
        return new C10468u(this);
    }

    /* renamed from: a */
    public void add(int i, String str) {
        this.f28274f.add(i, str);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public String set(int i, String str) {
        return m35386b(this.f28274f.set(i, str));
    }

    public void clear() {
        this.f28274f.clear();
        this.modCount++;
    }

    /* renamed from: e */
    public C10417d mo35804e(int i) {
        Object obj = this.f28274f.get(i);
        C10417d a = m35385a(obj);
        if (a != obj) {
            this.f28274f.set(i, a);
        }
        return a;
    }

    /* renamed from: r */
    public List<?> mo35806r() {
        return Collections.unmodifiableList(this.f28274f);
    }

    public int size() {
        return this.f28274f.size();
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof C10445m) {
            collection = ((C10445m) collection).mo35806r();
        }
        boolean addAll = this.f28274f.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public String get(int i) {
        Object obj = this.f28274f.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C10417d) {
            C10417d dVar = (C10417d) obj;
            String h = dVar.mo35693h();
            if (dVar.mo35689c()) {
                this.f28274f.set(i, h);
            }
            return h;
        }
        byte[] bArr = (byte[]) obj;
        String b = C10436i.m35377b(bArr);
        if (C10436i.m35376a(bArr)) {
            this.f28274f.set(i, b);
        }
        return b;
    }

    public String remove(int i) {
        Object remove = this.f28274f.remove(i);
        this.modCount++;
        return m35386b(remove);
    }

    public C10444l(C10445m mVar) {
        this.f28274f = new ArrayList(mVar.size());
        addAll(mVar);
    }

    /* renamed from: b */
    private static String m35386b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C10417d) {
            return ((C10417d) obj).mo35693h();
        }
        return C10436i.m35377b((byte[]) obj);
    }

    /* renamed from: a */
    public void mo35798a(C10417d dVar) {
        this.f28274f.add(dVar);
        this.modCount++;
    }

    /* renamed from: a */
    private static C10417d m35385a(Object obj) {
        if (obj instanceof C10417d) {
            return (C10417d) obj;
        }
        if (obj instanceof String) {
            return C10417d.m35228b((String) obj);
        }
        return C10417d.m35226a((byte[]) obj);
    }
}
