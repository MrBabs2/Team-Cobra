package p123rx.p401n.p406e.p407n;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: rx.n.e.n.e */
/* compiled from: SpscAtomicArrayQueue */
public final class C12799e<E> extends C12795a<E> {

    /* renamed from: l */
    private static final Integer f33001l = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: h */
    final AtomicLong f33002h = new AtomicLong();

    /* renamed from: i */
    long f33003i;

    /* renamed from: j */
    final AtomicLong f33004j = new AtomicLong();

    /* renamed from: k */
    final int f33005k;

    public C12799e(int i) {
        super(i);
        this.f33005k = Math.min(i / 4, f33001l.intValue());
    }

    /* renamed from: a */
    private long m41315a() {
        return this.f33004j.get();
    }

    /* renamed from: b */
    private void m41317b(long j) {
        this.f33004j.lazySet(j);
    }

    /* renamed from: c */
    private void m41318c(long j) {
        this.f33002h.lazySet(j);
    }

    public boolean isEmpty() {
        return m41316b() == m41315a();
    }

    public boolean offer(E e) {
        if (e != null) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f32996f;
            int i = this.f32997g;
            long j = this.f33002h.get();
            int a = mo40917a(j, i);
            if (j >= this.f33003i) {
                long j2 = ((long) this.f33005k) + j;
                if (mo40918a(atomicReferenceArray, mo40917a(j2, i)) == null) {
                    this.f33003i = j2;
                } else if (mo40918a(atomicReferenceArray, a) != null) {
                    return false;
                }
            }
            mo40919a(atomicReferenceArray, a, e);
            m41318c(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E peek() {
        return mo40921h(mo40916a(this.f33004j.get()));
    }

    public E poll() {
        long j = this.f33004j.get();
        int a = mo40916a(j);
        AtomicReferenceArray<E> atomicReferenceArray = this.f32996f;
        E a2 = mo40918a(atomicReferenceArray, a);
        if (a2 == null) {
            return null;
        }
        mo40919a(atomicReferenceArray, a, null);
        m41317b(j + 1);
        return a2;
    }

    public int size() {
        long a = m41315a();
        while (true) {
            long b = m41316b();
            long a2 = m41315a();
            if (a == a2) {
                return (int) (b - a2);
            }
            a = a2;
        }
    }

    /* renamed from: b */
    private long m41316b() {
        return this.f33002h.get();
    }
}
