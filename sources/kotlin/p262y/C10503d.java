package kotlin.p262y;

import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.p258c0.C10194e;

/* renamed from: kotlin.y.d */
/* compiled from: AbstractMutableList.kt */
public abstract class C10503d<E> extends AbstractList<E> implements List<E>, C10194e {
    protected C10503d() {
    }

    /* renamed from: a */
    public abstract int mo35992a();

    /* renamed from: h */
    public abstract E mo35993h(int i);

    public final /* bridge */ E remove(int i) {
        return mo35993h(i);
    }

    public final /* bridge */ int size() {
        return mo35992a();
    }
}
