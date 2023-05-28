package kotlin.p262y;

import java.util.Iterator;
import kotlin.jvm.internal.p258c0.C10190a;

/* renamed from: kotlin.y.e0 */
/* compiled from: Iterators.kt */
public abstract class C10507e0 implements Iterator<Integer>, C10190a {
    /* renamed from: a */
    public abstract int mo33492a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Integer next() {
        return Integer.valueOf(mo33492a());
    }
}
