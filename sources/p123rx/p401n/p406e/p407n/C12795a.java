package p123rx.p401n.p406e.p407n;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p123rx.p401n.p406e.p408o.C12812j;

/* renamed from: rx.n.e.n.a */
/* compiled from: AtomicReferenceArrayQueue */
abstract class C12795a<E> extends AbstractQueue<E> {

    /* renamed from: f */
    protected final AtomicReferenceArray<E> f32996f;

    /* renamed from: g */
    protected final int f32997g;

    public C12795a(int i) {
        int b = C12812j.m41367b(i);
        this.f32997g = b - 1;
        this.f32996f = new AtomicReferenceArray<>(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40916a(long j) {
        return this.f32997g & ((int) j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40917a(long j, int i) {
        return ((int) j) & i;
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final E mo40921h(int i) {
        return mo40918a(this.f32996f, i);
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final E mo40918a(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40919a(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }
}
