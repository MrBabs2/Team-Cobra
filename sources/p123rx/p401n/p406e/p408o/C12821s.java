package p123rx.p401n.p406e.p408o;

/* renamed from: rx.n.e.o.s */
/* compiled from: SpscArrayQueue */
public final class C12821s<E> extends C12826x<E> {
    public C12821s(int i) {
        super(i);
    }

    /* renamed from: a */
    private long m41374a() {
        return C12828z.f33043a.getLongVolatile(this, C12823u.f33041m);
    }

    /* renamed from: b */
    private long m41375b() {
        return C12828z.f33043a.getLongVolatile(this, C12827y.f33042l);
    }

    /* renamed from: c */
    private void m41376c(long j) {
        C12828z.f33043a.putOrderedLong(this, C12823u.f33041m, j);
    }

    /* renamed from: d */
    private void m41377d(long j) {
        C12828z.f33043a.putOrderedLong(this, C12827y.f33042l, j);
    }

    public boolean isEmpty() {
        return m41375b() == m41374a();
    }

    public boolean offer(E e) {
        if (e != null) {
            E[] eArr = this.f33036g;
            long j = this.producerIndex;
            long a = mo41006a(j);
            if (mo41011b(eArr, a) != null) {
                return false;
            }
            mo41009a(eArr, a, e);
            m41377d(j + 1);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public E peek() {
        return mo41010b(mo41006a(this.consumerIndex));
    }

    public E poll() {
        long j = this.consumerIndex;
        long a = mo41006a(j);
        E[] eArr = this.f33036g;
        E b = mo41011b(eArr, a);
        if (b == null) {
            return null;
        }
        mo41009a(eArr, a, null);
        m41376c(j + 1);
        return b;
    }

    public int size() {
        long a = m41374a();
        while (true) {
            long b = m41375b();
            long a2 = m41374a();
            if (a == a2) {
                return (int) (b - a2);
            }
            a = a2;
        }
    }
}
