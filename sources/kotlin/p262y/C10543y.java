package kotlin.p262y;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C10198f;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;
import okhttp3.HttpUrl;

/* renamed from: kotlin.y.y */
/* compiled from: Collections.kt */
public final class C10543y implements List, Serializable, RandomAccess, C10190a {

    /* renamed from: f */
    public static final C10543y f28392f = new C10543y();

    private C10543y() {
    }

    private final Object readResolve() {
        return f28392f;
    }

    /* renamed from: a */
    public int mo36037a() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo36038a(Void voidR) {
        C10202j.m34178b(voidR, "element");
        return false;
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo36043b(Void voidR) {
        C10202j.m34178b(voidR, "element");
        return -1;
    }

    /* renamed from: c */
    public int mo36044c(Void voidR) {
        C10202j.m34178b(voidR, "element");
        return -1;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return mo36038a((Void) obj);
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        C10202j.m34178b(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int hashCode() {
        return 1;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return mo36043b((Void) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C10542x.f28391f;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return mo36044c((Void) obj);
        }
        return -1;
    }

    public ListIterator listIterator() {
        return C10542x.f28391f;
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo36037a();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
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

    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C10542x.f28391f;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }
}
