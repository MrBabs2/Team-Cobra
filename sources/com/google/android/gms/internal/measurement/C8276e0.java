package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
abstract class C8276e0<E> extends AbstractList<E> implements zzuu<E> {

    /* renamed from: f */
    private boolean f23235f = true;

    C8276e0() {
    }

    /* renamed from: H */
    public boolean mo30094H() {
        return this.f23235f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30095a() {
        if (!this.f23235f) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e) {
        mo30095a();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo30095a();
        return super.addAll(collection);
    }

    public void clear() {
        mo30095a();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean remove(Object obj) {
        mo30095a();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo30095a();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo30095a();
        return super.retainAll(collection);
    }

    /* renamed from: s */
    public final void mo30101s() {
        this.f23235f = false;
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo30095a();
        return super.addAll(i, collection);
    }
}
