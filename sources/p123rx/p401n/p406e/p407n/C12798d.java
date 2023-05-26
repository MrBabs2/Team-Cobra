package p123rx.p401n.p406e.p407n;

/* renamed from: rx.n.e.n.d */
/* compiled from: MpscLinkedAtomicQueue */
public final class C12798d<E> extends C12796b<E> {
    public C12798d() {
        C12797c cVar = new C12797c();
        mo40924a(cVar);
        mo40926b(cVar);
    }

    public boolean offer(E e) {
        if (e != null) {
            C12797c cVar = new C12797c(e);
            mo40926b(cVar).mo40933a(cVar);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public E peek() {
        C12797c c;
        C12797c a = mo40923a();
        C12797c c2 = a.mo40935c();
        if (c2 != null) {
            return c2.mo40934b();
        }
        if (a == mo40927c()) {
            return null;
        }
        do {
            c = a.mo40935c();
        } while (c == null);
        return c.mo40934b();
    }

    public E poll() {
        C12797c c;
        C12797c a = mo40923a();
        C12797c c2 = a.mo40935c();
        if (c2 != null) {
            E a2 = c2.mo40931a();
            mo40924a(c2);
            return a2;
        } else if (a == mo40927c()) {
            return null;
        } else {
            do {
                c = a.mo40935c();
            } while (c == null);
            E a3 = c.mo40931a();
            mo40924a(c);
            return a3;
        }
    }
}
