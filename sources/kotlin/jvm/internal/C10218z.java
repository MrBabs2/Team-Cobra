package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: kotlin.jvm.internal.z */
/* compiled from: SpreadBuilder */
public class C10218z {

    /* renamed from: a */
    private final ArrayList<Object> f27856a;

    public C10218z(int i) {
        this.f27856a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public int mo35385a() {
        return this.f27856a.size();
    }

    /* renamed from: b */
    public void mo35388b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f27856a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f27856a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f27856a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f27856a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f27856a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    /* renamed from: a */
    public void mo35386a(Object obj) {
        this.f27856a.add(obj);
    }

    /* renamed from: a */
    public Object[] mo35387a(Object[] objArr) {
        return this.f27856a.toArray(objArr);
    }
}
