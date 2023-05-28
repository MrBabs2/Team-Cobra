package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.yt */
abstract class C8188yt<E> extends AbstractList<E> implements zzdoj<E> {

    /* renamed from: f */
    private boolean f17484f = true;

    C8188yt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26829a() {
        if (!this.f17484f) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(E e) {
        mo26829a();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo26829a();
        return super.addAll(collection);
    }

    public void clear() {
        mo26829a();
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

    /* renamed from: q */
    public boolean mo26833q() {
        return this.f17484f;
    }

    public boolean remove(Object obj) {
        mo26829a();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo26829a();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo26829a();
        return super.retainAll(collection);
    }

    /* renamed from: w */
    public final void mo26836w() {
        this.f17484f = false;
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo26829a();
        return super.addAll(i, collection);
    }
}
