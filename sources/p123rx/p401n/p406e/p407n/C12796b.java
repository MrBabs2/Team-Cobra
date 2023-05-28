package p123rx.p401n.p406e.p407n;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.n.e.n.b */
/* compiled from: BaseLinkedAtomicQueue */
abstract class C12796b<E> extends AbstractQueue<E> {

    /* renamed from: f */
    private final AtomicReference<C12797c<E>> f32998f = new AtomicReference<>();

    /* renamed from: g */
    private final AtomicReference<C12797c<E>> f32999g = new AtomicReference<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C12797c<E> mo40923a() {
        return this.f32999g.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C12797c<E> mo40926b(C12797c<E> cVar) {
        return this.f32998f.getAndSet(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C12797c<E> mo40927c() {
        return this.f32998f.get();
    }

    public final boolean isEmpty() {
        return mo40925b() == mo40927c();
    }

    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        C12797c c;
        C12797c b = mo40925b();
        C12797c c2 = mo40927c();
        int i = 0;
        while (b != c2 && i < Integer.MAX_VALUE) {
            do {
                c = b.mo40935c();
            } while (c == null);
            i++;
            b = c;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40924a(C12797c<E> cVar) {
        this.f32999g.lazySet(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C12797c<E> mo40925b() {
        return this.f32999g.get();
    }
}
