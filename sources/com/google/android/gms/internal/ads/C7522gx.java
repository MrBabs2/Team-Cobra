package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.gx */
final class C7522gx implements ListIterator<String> {

    /* renamed from: f */
    private ListIterator<String> f15325f = this.f15327h.f21613f.listIterator(this.f15326g);

    /* renamed from: g */
    private final /* synthetic */ int f15326g;

    /* renamed from: h */
    private final /* synthetic */ zzdqw f15327h;

    C7522gx(zzdqw zzdqw, int i) {
        this.f15327h = zzdqw;
        this.f15326g = i;
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f15325f.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f15325f.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f15325f.next();
    }

    public final int nextIndex() {
        return this.f15325f.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f15325f.previous();
    }

    public final int previousIndex() {
        return this.f15325f.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
