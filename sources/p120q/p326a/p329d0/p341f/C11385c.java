package p120q.p326a.p329d0.p341f;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p120q.p326a.p329d0.p332c.C10917f;
import p120q.p326a.p329d0.p345j.C11444p;

/* renamed from: q.a.d0.f.c */
/* compiled from: SpscLinkedArrayQueue */
public final class C11385c<T> implements C10917f<T> {

    /* renamed from: n */
    static final int f30490n = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: o */
    private static final Object f30491o = new Object();

    /* renamed from: f */
    final AtomicLong f30492f = new AtomicLong();

    /* renamed from: g */
    int f30493g;

    /* renamed from: h */
    long f30494h;

    /* renamed from: i */
    final int f30495i;

    /* renamed from: j */
    AtomicReferenceArray<Object> f30496j;

    /* renamed from: k */
    final int f30497k;

    /* renamed from: l */
    AtomicReferenceArray<Object> f30498l;

    /* renamed from: m */
    final AtomicLong f30499m = new AtomicLong();

    public C11385c(int i) {
        int a = C11444p.m37496a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f30496j = atomicReferenceArray;
        this.f30495i = i2;
        m37366b(a);
        this.f30498l = atomicReferenceArray;
        this.f30497k = i2;
        this.f30494h = (long) (i2 - 1);
        m37367b(0);
    }

    /* renamed from: a */
    private boolean m37363a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m37360a(atomicReferenceArray, i, (Object) t);
        m37367b(j + 1);
        return true;
    }

    /* renamed from: b */
    private AtomicReferenceArray<Object> m37365b(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        m37368c(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m37357a(atomicReferenceArray, i);
        m37360a(atomicReferenceArray, i, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: c */
    private static int m37368c(int i) {
        return i;
    }

    /* renamed from: c */
    private long m37369c() {
        return this.f30499m.get();
    }

    /* renamed from: d */
    private long m37370d() {
        return this.f30492f.get();
    }

    /* renamed from: e */
    private long m37371e() {
        return this.f30499m.get();
    }

    /* renamed from: f */
    private long m37372f() {
        return this.f30492f.get();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return m37372f() == m37371e();
    }

    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f30496j;
            long d = m37370d();
            int i = this.f30495i;
            int a = m37356a(d, i);
            if (d < this.f30494h) {
                return m37363a(atomicReferenceArray, t, d, a);
            }
            long j = ((long) this.f30493g) + d;
            if (m37357a(atomicReferenceArray, m37356a(j, i)) == null) {
                this.f30494h = j - 1;
                return m37363a(atomicReferenceArray, t, d, a);
            } else if (m37357a(atomicReferenceArray, m37356a(1 + d, i)) == null) {
                return m37363a(atomicReferenceArray, t, d, a);
            } else {
                m37361a(atomicReferenceArray, d, a, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f30498l;
        long c = m37369c();
        int i = this.f30497k;
        int a = m37356a(c, i);
        T a2 = m37357a(atomicReferenceArray, a);
        boolean z = a2 == f30491o;
        if (a2 != null && !z) {
            m37360a(atomicReferenceArray, a, (Object) null);
            m37359a(c + 1);
            return a2;
        } else if (z) {
            return m37364b(m37365b(atomicReferenceArray, i + 1), c, i);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private void m37361a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f30496j = atomicReferenceArray2;
        this.f30494h = (j2 + j) - 1;
        m37360a(atomicReferenceArray2, i, (Object) t);
        m37362a(atomicReferenceArray, atomicReferenceArray2);
        m37360a(atomicReferenceArray, i, f30491o);
        m37367b(j + 1);
    }

    /* renamed from: b */
    private T m37364b(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f30498l = atomicReferenceArray;
        int a = m37356a(j, i);
        T a2 = m37357a(atomicReferenceArray, a);
        if (a2 != null) {
            m37360a(atomicReferenceArray, a, (Object) null);
            m37359a(j + 1);
        }
        return a2;
    }

    /* renamed from: b */
    public int mo37110b() {
        long e = m37371e();
        while (true) {
            long f = m37372f();
            long e2 = m37371e();
            if (e == e2) {
                return (int) (f - e2);
            }
            e = e2;
        }
    }

    /* renamed from: a */
    private void m37362a(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        int length = atomicReferenceArray.length() - 1;
        m37368c(length);
        m37360a(atomicReferenceArray, length, (Object) atomicReferenceArray2);
    }

    /* renamed from: b */
    private void m37366b(int i) {
        this.f30493g = Math.min(i / 4, f30490n);
    }

    /* renamed from: a */
    public T mo37108a() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f30498l;
        long c = m37369c();
        int i = this.f30497k;
        T a = m37357a(atomicReferenceArray, m37356a(c, i));
        return a == f30491o ? m37358a(m37365b(atomicReferenceArray, i + 1), c, i) : a;
    }

    /* renamed from: b */
    private void m37367b(long j) {
        this.f30492f.lazySet(j);
    }

    /* renamed from: a */
    private T m37358a(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f30498l = atomicReferenceArray;
        return m37357a(atomicReferenceArray, m37356a(j, i));
    }

    /* renamed from: a */
    private void m37359a(long j) {
        this.f30499m.lazySet(j);
    }

    /* renamed from: a */
    private static int m37356a(long j, int i) {
        int i2 = ((int) j) & i;
        m37368c(i2);
        return i2;
    }

    /* renamed from: a */
    private static void m37360a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private static <E> Object m37357a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: a */
    public boolean mo37109a(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f30496j;
        long f = m37372f();
        int i = this.f30495i;
        long j = 2 + f;
        if (m37357a(atomicReferenceArray, m37356a(j, i)) == null) {
            int a = m37356a(f, i);
            m37360a(atomicReferenceArray, a + 1, (Object) t2);
            m37360a(atomicReferenceArray, a, (Object) t);
            m37367b(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f30496j = atomicReferenceArray2;
        int a2 = m37356a(f, i);
        m37360a(atomicReferenceArray2, a2 + 1, (Object) t2);
        m37360a(atomicReferenceArray2, a2, (Object) t);
        m37362a(atomicReferenceArray, atomicReferenceArray2);
        m37360a(atomicReferenceArray, a2, f30491o);
        m37367b(j);
        return true;
    }
}
