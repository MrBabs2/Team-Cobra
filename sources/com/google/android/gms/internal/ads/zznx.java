package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zznx {

    /* renamed from: a */
    public final int f22359a = 1;

    /* renamed from: b */
    public final byte[] f22360b;

    public zznx(int i, byte[] bArr) {
        this.f22360b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznx.class == obj.getClass()) {
            zznx zznx = (zznx) obj;
            return this.f22359a == zznx.f22359a && Arrays.equals(this.f22360b, zznx.f22360b);
        }
    }

    public final int hashCode() {
        return (this.f22359a * 31) + Arrays.hashCode(this.f22360b);
    }
}
