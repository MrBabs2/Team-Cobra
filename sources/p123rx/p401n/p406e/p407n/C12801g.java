package p123rx.p401n.p406e.p407n;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p123rx.p401n.p406e.p408o.C12812j;

/* renamed from: rx.n.e.n.g */
/* compiled from: SpscLinkedArrayQueue */
public final class C12801g<T> implements Queue<T> {

    /* renamed from: n */
    static final int f33010n = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: o */
    private static final Object f33011o = new Object();

    /* renamed from: f */
    final AtomicLong f33012f = new AtomicLong();

    /* renamed from: g */
    int f33013g;

    /* renamed from: h */
    long f33014h;

    /* renamed from: i */
    int f33015i;

    /* renamed from: j */
    AtomicReferenceArray<Object> f33016j;

    /* renamed from: k */
    int f33017k;

    /* renamed from: l */
    AtomicReferenceArray<Object> f33018l;

    /* renamed from: m */
    final AtomicLong f33019m = new AtomicLong();

    public C12801g(int i) {
        int b = C12812j.m41367b(i);
        int i2 = b - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(b + 1);
        this.f33016j = atomicReferenceArray;
        this.f33015i = i2;
        m41334h(b);
        this.f33018l = atomicReferenceArray;
        this.f33017k = i2;
        this.f33014h = (long) (i2 - 1);
    }

    /* renamed from: a */
    private boolean m41328a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m41325a(atomicReferenceArray, i, (Object) t);
        m41331b(j + 1);
        return true;
    }

    /* renamed from: b */
    private T m41330b(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f33018l = atomicReferenceArray;
        int a = m41319a(j, i);
        T a2 = m41321a(atomicReferenceArray, a);
        if (a2 == null) {
            return null;
        }
        m41325a(atomicReferenceArray, a, (Object) null);
        m41324a(j + 1);
        return a2;
    }

    /* renamed from: c */
    private long m41332c() {
        return this.f33019m.get();
    }

    /* renamed from: d */
    private long m41333d() {
        return this.f33012f.get();
    }

    /* renamed from: h */
    private void m41334h(int i) {
        this.f33013g = Math.min(i / 4, f33010n);
    }

    /* renamed from: i */
    private static int m41335i(int i) {
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
        return m41333d() == m41332c();
    }

    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    public boolean offer(T t) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f33016j;
        long b = m41329b();
        int i = this.f33015i;
        int a = m41319a(b, i);
        if (b < this.f33014h) {
            return m41328a(atomicReferenceArray, t, b, a);
        }
        long j = ((long) this.f33013g) + b;
        if (m41321a(atomicReferenceArray, m41319a(j, i)) == null) {
            this.f33014h = j - 1;
            return m41328a(atomicReferenceArray, t, b, a);
        } else if (m41321a(atomicReferenceArray, m41319a(1 + b, i)) == null) {
            return m41328a(atomicReferenceArray, t, b, a);
        } else {
            m41326a(atomicReferenceArray, b, a, t, (long) i);
            return true;
        }
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f33018l;
        long a = m41320a();
        int i = this.f33017k;
        T a2 = m41321a(atomicReferenceArray, m41319a(a, i));
        return a2 == f33011o ? m41322a(m41323a(atomicReferenceArray), a, i) : a2;
    }

    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f33018l;
        long a = m41320a();
        int i = this.f33017k;
        int a2 = m41319a(a, i);
        T a3 = m41321a(atomicReferenceArray, a2);
        boolean z = a3 == f33011o;
        if (a3 != null && !z) {
            m41325a(atomicReferenceArray, a2, (Object) null);
            m41324a(a + 1);
            return a3;
        } else if (z) {
            return m41330b(m41323a(atomicReferenceArray), a, i);
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
        long c = m41332c();
        while (true) {
            long d = m41333d();
            long c2 = m41332c();
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
    private void m41326a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f33016j = atomicReferenceArray2;
        this.f33014h = (j2 + j) - 1;
        m41325a(atomicReferenceArray2, i, (Object) t);
        m41327a(atomicReferenceArray, atomicReferenceArray2);
        m41325a(atomicReferenceArray, i, f33011o);
        m41331b(j + 1);
    }

    /* renamed from: b */
    private long m41329b() {
        return this.f33012f.get();
    }

    /* renamed from: b */
    private void m41331b(long j) {
        this.f33012f.lazySet(j);
    }

    /* renamed from: a */
    private void m41327a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        int length = atomicReferenceArray.length() - 1;
        m41335i(length);
        m41325a(atomicReferenceArray, length, (Object) atomicReferenceArray2);
    }

    /* renamed from: a */
    private AtomicReferenceArray<Object> m41323a(AtomicReferenceArray<Object> atomicReferenceArray) {
        int length = atomicReferenceArray.length() - 1;
        m41335i(length);
        return (AtomicReferenceArray) m41321a(atomicReferenceArray, length);
    }

    /* renamed from: a */
    private T m41322a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f33018l = atomicReferenceArray;
        return m41321a(atomicReferenceArray, m41319a(j, i));
    }

    /* renamed from: a */
    private long m41320a() {
        return this.f33019m.get();
    }

    /* renamed from: a */
    private void m41324a(long j) {
        this.f33019m.lazySet(j);
    }

    /* renamed from: a */
    private static int m41319a(long j, int i) {
        int i2 = ((int) j) & i;
        m41335i(i2);
        return i2;
    }

    /* renamed from: a */
    private static void m41325a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private static <E> Object m41321a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: a */
    public boolean mo40962a(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f33016j;
        long d = m41333d();
        int i = this.f33015i;
        long j = 2 + d;
        if (m41321a(atomicReferenceArray, m41319a(j, i)) == null) {
            int a = m41319a(d, i);
            m41325a(atomicReferenceArray, a + 1, (Object) t2);
            m41325a(atomicReferenceArray, a, (Object) t);
            m41331b(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f33016j = atomicReferenceArray2;
        int a2 = m41319a(d, i);
        m41325a(atomicReferenceArray2, a2 + 1, (Object) t2);
        m41325a(atomicReferenceArray2, a2, (Object) t);
        m41327a(atomicReferenceArray, atomicReferenceArray2);
        m41325a(atomicReferenceArray, a2, f33011o);
        m41331b(j);
        return true;
    }
}
