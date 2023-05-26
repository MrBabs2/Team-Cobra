package p123rx.p401n.p406e.p407n;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.n.e.n.c */
/* compiled from: LinkedQueueNode */
public final class C12797c<E> extends AtomicReference<C12797c<E>> {

    /* renamed from: f */
    private E f33000f;

    public C12797c() {
    }

    /* renamed from: a */
    public E mo40931a() {
        E b = mo40934b();
        mo40932a((Object) null);
        return b;
    }

    /* renamed from: b */
    public E mo40934b() {
        return this.f33000f;
    }

    /* renamed from: c */
    public C12797c<E> mo40935c() {
        return (C12797c) get();
    }

    public C12797c(E e) {
        mo40932a(e);
    }

    /* renamed from: a */
    public void mo40932a(E e) {
        this.f33000f = e;
    }

    /* renamed from: a */
    public void mo40933a(C12797c<E> cVar) {
        lazySet(cVar);
    }
}
