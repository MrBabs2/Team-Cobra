package com.google.android.gms.common.images;

public final class Size {

    /* renamed from: a */
    private final int f14050a;

    /* renamed from: b */
    private final int f14051b;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.f14050a == size.f14050a && this.f14051b == size.f14051b;
        }
    }

    public final int hashCode() {
        int i = this.f14051b;
        int i2 = this.f14050a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        int i = this.f14050a;
        int i2 = this.f14051b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}
