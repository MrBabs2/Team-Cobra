package kotlin.p262y;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C10186b;
import kotlin.jvm.internal.C10198f;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;

/* renamed from: kotlin.y.f */
/* compiled from: Collections.kt */
final class C10508f<T> implements Collection<T>, C10190a {

    /* renamed from: f */
    private final T[] f28383f;

    /* renamed from: g */
    private final boolean f28384g;

    public C10508f(T[] tArr, boolean z) {
        C10202j.m34178b(tArr, "values");
        this.f28383f = tArr;
        this.f28384g = z;
    }

    /* renamed from: a */
    public int mo36005a() {
        return this.f28383f.length;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C10519k.m35626a(this.f28383f, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C10202j.m34178b(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f28383f.length == 0;
    }

    public Iterator<T> iterator() {
        return C10186b.m34138a(this.f28383f);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo36005a();
    }

    public final Object[] toArray() {
        return C10527n.m35730a(this.f28383f, this.f28384g);
    }

    public <T> T[] toArray(T[] tArr) {
        return C10198f.m34165a(this, tArr);
    }
}
