package com.bumptech.glide.p162p.p163l;

import com.bumptech.glide.p166r.C6316k;

@Deprecated
/* renamed from: com.bumptech.glide.p.l.g */
/* compiled from: SimpleTarget */
public abstract class C6285g<Z> extends C6279a<Z> {
    private final int height;
    private final int width;

    public C6285g() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final void getSize(C6286h hVar) {
        if (C6316k.m12999b(this.width, this.height)) {
            hVar.mo20710a(this.width, this.height);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.width + " and height: " + this.height + ", either provide dimensions in the constructor or call override()");
    }

    public void removeCallback(C6286h hVar) {
    }

    public C6285g(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
