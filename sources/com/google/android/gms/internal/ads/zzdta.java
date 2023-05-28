package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class zzdta<E> extends AbstractList<E> {

    /* renamed from: h */
    private static final zzdtc f21737h = zzdtc.m24221a(zzdta.class);

    /* renamed from: f */
    List<E> f21738f;

    /* renamed from: g */
    Iterator<E> f21739g;

    public zzdta(List<E> list, Iterator<E> it) {
        this.f21738f = list;
        this.f21739g = it;
    }

    public E get(int i) {
        if (this.f21738f.size() > i) {
            return this.f21738f.get(i);
        }
        if (this.f21739g.hasNext()) {
            this.f21738f.add(this.f21739g.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    public Iterator<E> iterator() {
        return new C7675ky(this);
    }

    public int size() {
        f21737h.mo29219a("potentially expensive size() call");
        f21737h.mo29219a("blowup running");
        while (this.f21739g.hasNext()) {
            this.f21738f.add(this.f21739g.next());
        }
        return this.f21738f.size();
    }
}
