package kotlin.p262y;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C10198f;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;
import okhttp3.HttpUrl;

/* renamed from: kotlin.y.a0 */
/* compiled from: Sets.kt */
public final class C10488a0 implements Set, Serializable, C10190a {

    /* renamed from: f */
    public static final C10488a0 f28362f = new C10488a0();

    private C10488a0() {
    }

    private final Object readResolve() {
        return f28362f;
    }

    /* renamed from: a */
    public int mo35911a() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo35912a(Void voidR) {
        C10202j.m34178b(voidR, "element");
        return false;
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo35912a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C10202j.m34178b(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C10542x.f28391f;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo35911a();
    }

    public Object[] toArray() {
        return C10198f.m34164a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C10198f.m34165a(this, tArr);
    }

    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
