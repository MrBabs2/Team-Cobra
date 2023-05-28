package kotlin.p391i0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.i0.a */
/* compiled from: SequencesJVM.kt */
public final class C12068a<T> implements C12079h<T> {

    /* renamed from: a */
    private final AtomicReference<C12079h<T>> f31824a;

    public C12068a(C12079h<? extends T> hVar) {
        C10202j.m34178b(hVar, "sequence");
        this.f31824a = new AtomicReference<>(hVar);
    }

    public Iterator<T> iterator() {
        C12079h andSet = this.f31824a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
