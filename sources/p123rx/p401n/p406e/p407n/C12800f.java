package p123rx.p401n.p406e.p407n;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p123rx.p401n.p406e.p408o.C12812j;

/* renamed from: rx.n.e.n.f */
/* compiled from: SpscExactAtomicArrayQueue */
public final class C12800f<T> extends AtomicReferenceArray<T> implements Queue<T> {

    /* renamed from: f */
    final int f33006f;

    /* renamed from: g */
    final int f33007g;

    /* renamed from: h */
    final AtomicLong f33008h = new AtomicLong();

    /* renamed from: i */
    final AtomicLong f33009i = new AtomicLong();

    public C12800f(int i) {
        super(C12812j.m41367b(i));
        int length = length();
        this.f33006f = length - 1;
        this.f33007g = length - i;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public T element() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return this.f33008h == this.f33009i;
    }

    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    public boolean offer(T t) {
        if (t != null) {
            long j = this.f33008h.get();
            int i = this.f33006f;
            if (get(((int) (((long) this.f33007g) + j)) & i) != null) {
                return false;
            }
            this.f33008h.lazySet(j + 1);
            lazySet(i & ((int) j), t);
            return true;
        }
        throw null;
    }

    public T peek() {
        return get(this.f33006f & ((int) this.f33009i.get()));
    }

    public T poll() {
        long j = this.f33009i.get();
        int i = ((int) j) & this.f33006f;
        T t = get(i);
        if (t == null) {
            return null;
        }
        this.f33009i.lazySet(j + 1);
        lazySet(i, (Object) null);
        return t;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        long j = this.f33009i.get();
        while (true) {
            long j2 = this.f33008h.get();
            long j3 = this.f33009i.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public T remove() {
        throw new UnsupportedOperationException();
    }

    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }
}
