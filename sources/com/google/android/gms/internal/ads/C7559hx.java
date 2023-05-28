package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.hx */
final class C7559hx implements Iterator<String> {

    /* renamed from: f */
    private Iterator<String> f15547f = this.f15548g.f21613f.iterator();

    /* renamed from: g */
    private final /* synthetic */ zzdqw f15548g;

    C7559hx(zzdqw zzdqw) {
        this.f15548g = zzdqw;
    }

    public final boolean hasNext() {
        return this.f15547f.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f15547f.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
