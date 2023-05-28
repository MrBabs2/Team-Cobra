package kotlin.p262y;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p258c0.C10190a;

/* renamed from: kotlin.y.x */
/* compiled from: Collections.kt */
public final class C10542x implements ListIterator, C10190a {

    /* renamed from: f */
    public static final C10542x f28391f = new C10542x();

    private C10542x() {
    }

    public /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void next() {
        throw new NoSuchElementException();
    }

    public Void previous() {
        throw new NoSuchElementException();
    }
}
