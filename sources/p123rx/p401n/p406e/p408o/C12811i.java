package p123rx.p401n.p406e.p408o;

import p123rx.p401n.p406e.p407n.C12797c;

/* renamed from: rx.n.e.o.i */
/* compiled from: MpscLinkedQueue */
public final class C12811i<E> extends C12803a<E> {
    public C12811i() {
        C12797c<E> cVar = new C12797c<>();
        this.consumerNode = cVar;
        mo41016b(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C12797c<E> mo41016b(C12797c<E> cVar) {
        C12797c<E> cVar2;
        do {
            cVar2 = this.producerNode;
        } while (!C12828z.f33043a.compareAndSwapObject(this, C12807e.f33031f, cVar2, cVar));
        return cVar2;
    }

    public boolean offer(E e) {
        if (e != null) {
            C12797c cVar = new C12797c(e);
            mo41016b(cVar).mo40933a(cVar);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public E peek() {
        C12797c<E> c;
        C12797c<E> cVar = this.consumerNode;
        C12797c<E> c2 = cVar.mo40935c();
        if (c2 != null) {
            return c2.mo40934b();
        }
        if (cVar == mo41005a()) {
            return null;
        }
        do {
            c = cVar.mo40935c();
        } while (c == null);
        return c.mo40934b();
    }

    public E poll() {
        C12797c<E> c;
        C12797c b = mo41003b();
        C12797c c2 = b.mo40935c();
        if (c2 != null) {
            E a = c2.mo40931a();
            mo41002a(c2);
            return a;
        } else if (b == mo41005a()) {
            return null;
        } else {
            do {
                c = b.mo40935c();
            } while (c == null);
            E a2 = c.mo40931a();
            this.consumerNode = c;
            return a2;
        }
    }
}
