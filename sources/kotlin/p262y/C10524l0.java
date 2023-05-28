package kotlin.p262y;

import java.util.List;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.y.l0 */
/* compiled from: ReversedViews.kt */
final class C10524l0<T> extends C10503d<T> {

    /* renamed from: f */
    private final List<T> f28388f;

    public C10524l0(List<T> list) {
        C10202j.m34178b(list, "delegate");
        this.f28388f = list;
    }

    /* renamed from: a */
    public int mo35992a() {
        return this.f28388f.size();
    }

    public void add(int i, T t) {
        this.f28388f.add(C10537u.m35767d(this, i), t);
    }

    public void clear() {
        this.f28388f.clear();
    }

    public T get(int i) {
        return this.f28388f.get(C10537u.m35766c(this, i));
    }

    /* renamed from: h */
    public T mo35993h(int i) {
        return this.f28388f.remove(C10537u.m35766c(this, i));
    }

    public T set(int i, T t) {
        return this.f28388f.set(C10537u.m35766c(this, i), t);
    }
}
