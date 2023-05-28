package p123rx.p401n.p406e.p408o;

/* renamed from: rx.n.e.o.k */
/* compiled from: SpmcArrayQueue */
public final class C12813k<E> extends C12817o<E> {
    public C12813k(int i) {
        super(i);
    }

    public boolean isEmpty() {
        return mo41024b() == mo41026a();
    }

    public boolean offer(E e) {
        if (e != null) {
            E[] eArr = this.f33036g;
            long j = this.f33035f;
            long a = mo41026a();
            long a2 = mo41006a(a);
            if (mo41011b(eArr, a2) == null) {
                mo41012b(eArr, a2, e);
                mo41027c(a + 1);
            } else if (a - mo41024b() > j) {
                return false;
            } else {
                do {
                } while (mo41011b(eArr, a2) != null);
            }
            mo41012b(eArr, a2, e);
            mo41027c(a + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public E peek() {
        E b;
        long c = mo41028c();
        do {
            long b2 = mo41024b();
            if (b2 >= c) {
                long a = mo41026a();
                if (b2 >= a) {
                    return null;
                }
                mo41029d(a);
            }
            b = mo41010b(mo41006a(b2));
        } while (b == null);
        return b;
    }

    public E poll() {
        long b;
        long c = mo41028c();
        do {
            b = mo41024b();
            if (b >= c) {
                long a = mo41026a();
                if (b >= a) {
                    return null;
                }
                mo41029d(a);
            }
        } while (!mo41025b(b, 1 + b));
        long a2 = mo41006a(b);
        E[] eArr = this.f33036g;
        E a3 = mo41008a(eArr, a2);
        mo41009a(eArr, a2, null);
        return a3;
    }

    public int size() {
        long b = mo41024b();
        while (true) {
            long a = mo41026a();
            long b2 = mo41024b();
            if (b == b2) {
                return (int) (a - b2);
            }
            b = b2;
        }
    }
}
