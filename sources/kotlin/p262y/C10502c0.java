package kotlin.p262y;

import java.util.Iterator;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;
import kotlin.p215c0.p216c.C9102a;

/* renamed from: kotlin.y.c0 */
/* compiled from: Iterables.kt */
public final class C10502c0<T> implements Iterable<C10494b0<? extends T>>, C10190a {

    /* renamed from: f */
    private final C9102a<Iterator<T>> f28379f;

    public C10502c0(C9102a<? extends Iterator<? extends T>> aVar) {
        C10202j.m34178b(aVar, "iteratorFactory");
        this.f28379f = aVar;
    }

    public Iterator<C10494b0<T>> iterator() {
        return new C10504d0(this.f28379f.invoke());
    }
}
