package p123rx.p401n.p406e.p407n;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p123rx.p401n.p406e.p408o.C12812j;

/* renamed from: rx.n.e.n.h */
/* compiled from: SpscUnboundedAtomicArrayQueue */
public final class C12802h<T> implements Queue<T> {

    /* renamed from: n */
    static final int f33020n = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: o */
    private static final Object f33021o = new Object();

    /* renamed from: f */
    final AtomicLong f33022f = new AtomicLong();

    /* renamed from: g */
    int f33023g;

    /* renamed from: h */
    long f33024h;

    /* renamed from: i */
    int f33025i;

    /* renamed from: j */
    AtomicReferenceArray<Object> f33026j;

    /* renamed from: k */
    int f33027k;

    /* renamed from: l */
    AtomicReferenceArray<Object> f33028l;

    /* renamed from: m */
    final AtomicLong f33029m = new AtomicLong();

    public C12802h(int i) {
        int b = C12812j.m41367b(Math.max(8, i));
        int i2 = b - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(b + 1);
        this.f33026j = atomicReferenceArray;
        this.f33025i = i2;
        m41352h(b);
        this.f33028l = atomicReferenceArray;
        this.f33027k = i2;
        this.f33024h = (long) (i2 - 1);
        m41349b(0);
    }

    /* renamed from: a */
    private boolean m41346a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m41349b(j + 1);
        m41343a(atomicReferenceArray, i, (Object) t);
        return true;
    }

    /* renamed from: b */
    private T m41348b(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f33028l = atomicReferenceArray;
        int a = m41337a(j, i);
        T a2 = m41339a(atomicReferenceArray, a);
        if (a2 == null) {
            return null;
        }
        m41342a(j + 1);
        m41343a(atomicReferenceArray, a, (Object) null);
        return a2;
    }

    /* renamed from: c */
    private long m41350c() {
        return this.f33029m.get();
    }

    /* renamed from: d */
    private long m41351d() {
        return this.f33022f.get();
    }

    /* renamed from: h */
    private void m41352h(int i) {
        this.f33023g = Math.min(i / 4, f33020n);
    }

    /* renamed from: i */
    private static int m41353i(int i) {
        return i;
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
        return m41351d() == m41350c();
    }

    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f33026j;
            long b = m41347b();
            int i = this.f33025i;
            int a = m41337a(b, i);
            if (b < this.f33024h) {
                return m41346a(atomicReferenceArray, t, b, a);
            }
            long j = ((long) this.f33023g) + b;
            if (m41339a(atomicReferenceArray, m41337a(j, i)) == null) {
                this.f33024h = j - 1;
                return m41346a(atomicReferenceArray, t, b, a);
            } else if (m41339a(atomicReferenceArray, m41337a(1 + b, i)) != null) {
                return m41346a(atomicReferenceArray, t, b, a);
            } else {
                m41344a(atomicReferenceArray, b, a, t, (long) i);
                return true;
            }
        } else {
            throw null;
        }
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f33028l;
        long a = m41338a();
        int i = this.f33027k;
        T a2 = m41339a(atomicReferenceArray, m41337a(a, i));
        return a2 == f33021o ? m41340a(m41341a(atomicReferenceArray), a, i) : a2;
    }

    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f33028l;
        long a = m41338a();
        int i = this.f33027k;
        int a2 = m41337a(a, i);
        T a3 = m41339a(atomicReferenceArray, a2);
        boolean z = a3 == f33021o;
        if (a3 != null && !z) {
            m41342a(a + 1);
            m41343a(atomicReferenceArray, a2, (Object) null);
            return a3;
        } else if (z) {
            return m41348b(m41341a(atomicReferenceArray), a, i);
        } else {
            return null;
        }
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
        long c = m41350c();
        while (true) {
            long d = m41351d();
            long c2 = m41350c();
            if (c == c2) {
                return (int) (d - c2);
            }
            c = c2;
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

    /* renamed from: a */
    private void m41344a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f33026j = atomicReferenceArray2;
        this.f33024h = (j2 + j) - 1;
        m41349b(j + 1);
        m41343a(atomicReferenceArray2, i, (Object) t);
        m41345a(atomicReferenceArray, atomicReferenceArray2);
        m41343a(atomicReferenceArray, i, f33021o);
    }

    /* renamed from: b */
    private long m41347b() {
        return this.f33022f.get();
    }

    /* renamed from: b */
    private void m41349b(long j) {
        this.f33022f.lazySet(j);
    }

    /* renamed from: a */
    private void m41345a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        int length = atomicReferenceArray.length() - 1;
        m41353i(length);
        m41343a(atomicReferenceArray, length, (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private AtomicReferenceArray<Object> m41341a(AtomicReferenceArray<Object> atomicReferenceArray) {
        int length = atomicReferenceArray.length() - 1;
        m41353i(length);
        return (AtomicReferenceArray) m41339a(atomicReferenceArray, length);
    }

    /* renamed from: a */
    private T m41340a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f33028l = atomicReferenceArray;
        return m41339a(atomicReferenceArray, m41337a(j, i));
    }

    /* renamed from: a */
    private long m41338a() {
        return this.f33029m.get();
    }

    /* renamed from: a */
    private void m41342a(long j) {
        this.f33029m.lazySet(j);
    }

    /* renamed from: a */
    private static int m41337a(long j, int i) {
        int i2 = ((int) j) & i;
        m41353i(i2);
        return i2;
    }

    /* renamed from: a */
    private static void m41343a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private static <E> Object m41339a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }
}
