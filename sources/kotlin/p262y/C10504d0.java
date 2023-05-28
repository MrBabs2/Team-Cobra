package kotlin.p262y;

import java.util.Iterator;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;

/* renamed from: kotlin.y.d0 */
/* compiled from: Iterators.kt */
public final class C10504d0<T> implements Iterator<C10494b0<? extends T>>, C10190a {

    /* renamed from: f */
    private int f28380f;

    /* renamed from: g */
    private final Iterator<T> f28381g;

    public C10504d0(Iterator<? extends T> it) {
        C10202j.m34178b(it, "iterator");
        this.f28381g = it;
    }

    public final boolean hasNext() {
        return this.f28381g.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final C10494b0<T> next() {
        int i = this.f28380f;
        this.f28380f = i + 1;
        if (i >= 0) {
            return new C10494b0<>(i, this.f28381g.next());
        }
        C10525m.m35693c();
        throw null;
    }
}
