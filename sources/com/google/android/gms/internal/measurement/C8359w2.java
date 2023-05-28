package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.measurement.w2 */
final class C8359w2 implements ListIterator<String> {

    /* renamed from: f */
    private ListIterator<String> f23372f = this.f23374h.f23534f.listIterator(this.f23373g);

    /* renamed from: g */
    private final /* synthetic */ int f23373g;

    /* renamed from: h */
    private final /* synthetic */ zzxg f23374h;

    C8359w2(zzxg zzxg, int i) {
        this.f23374h = zzxg;
        this.f23373g = i;
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f23372f.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f23372f.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f23372f.next();
    }

    public final int nextIndex() {
        return this.f23372f.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f23372f.previous();
    }

    public final int previousIndex() {
        return this.f23372f.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
