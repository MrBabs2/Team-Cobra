package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p258c0.C10190a;

/* renamed from: kotlin.jvm.internal.a */
/* compiled from: ArrayIterator.kt */
final class C10184a<T> implements Iterator<T>, C10190a {

    /* renamed from: f */
    private int f27831f;

    /* renamed from: g */
    private final T[] f27832g;

    public C10184a(T[] tArr) {
        C10202j.m34178b(tArr, "array");
        this.f27832g = tArr;
    }

    public boolean hasNext() {
        return this.f27831f < this.f27832g.length;
    }

    public T next() {
        try {
            T[] tArr = this.f27832g;
            int i = this.f27831f;
            this.f27831f = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f27831f--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
