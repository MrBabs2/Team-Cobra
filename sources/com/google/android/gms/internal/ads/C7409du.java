package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.du */
final class C7409du extends C7483fu {

    /* renamed from: f */
    private int f15026f = 0;

    /* renamed from: g */
    private final int f15027g = this.f15028h.size();

    /* renamed from: h */
    private final /* synthetic */ zzdmr f15028h;

    C7409du(zzdmr zzdmr) {
        this.f15028h = zzdmr;
    }

    public final boolean hasNext() {
        return this.f15026f < this.f15027g;
    }

    public final byte nextByte() {
        int i = this.f15026f;
        if (i < this.f15027g) {
            this.f15026f = i + 1;
            return this.f15028h.mo26047i(i);
        }
        throw new NoSuchElementException();
    }
}
