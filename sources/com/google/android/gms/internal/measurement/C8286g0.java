package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.g0 */
final class C8286g0 extends C8296i0 {

    /* renamed from: f */
    private int f23249f = 0;

    /* renamed from: g */
    private final int f23250g = this.f23251h.size();

    /* renamed from: h */
    private final /* synthetic */ zzte f23251h;

    C8286g0(zzte zzte) {
        this.f23251h = zzte;
    }

    public final boolean hasNext() {
        return this.f23249f < this.f23250g;
    }

    public final byte nextByte() {
        int i = this.f23249f;
        if (i < this.f23250g) {
            this.f23249f = i + 1;
            return this.f23251h.mo30139i(i);
        }
        throw new NoSuchElementException();
    }
}
