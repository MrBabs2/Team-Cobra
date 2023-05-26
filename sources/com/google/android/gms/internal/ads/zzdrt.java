package com.google.android.gms.internal.ads;

public final class zzdrt implements Cloneable {

    /* renamed from: f */
    private int[] f21651f;

    /* renamed from: g */
    private C8155xx[] f21652g;

    /* renamed from: h */
    private int f21653h;

    static {
        new C8155xx();
    }

    zzdrt() {
        this(10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C8155xx mo29204a(int i) {
        return this.f21652g[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo29205b() {
        return this.f21653h;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f21653h;
        zzdrt zzdrt = new zzdrt(i);
        System.arraycopy(this.f21651f, 0, zzdrt.f21651f, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C8155xx[] xxVarArr = this.f21652g;
            if (xxVarArr[i2] != null) {
                zzdrt.f21652g[i2] = (C8155xx) xxVarArr[i2].clone();
            }
        }
        zzdrt.f21653h = i;
        return zzdrt;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdrt)) {
            return false;
        }
        zzdrt zzdrt = (zzdrt) obj;
        int i = this.f21653h;
        if (i != zzdrt.f21653h) {
            return false;
        }
        int[] iArr = this.f21651f;
        int[] iArr2 = zzdrt.f21651f;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            } else if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            C8155xx[] xxVarArr = this.f21652g;
            C8155xx[] xxVarArr2 = zzdrt.f21652g;
            int i3 = this.f21653h;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!xxVarArr[i4].equals(xxVarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f21653h; i2++) {
            i = (((i * 31) + this.f21651f[i2]) * 31) + this.f21652g[i2].hashCode();
        }
        return i;
    }

    private zzdrt(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f21651f = new int[i5];
        this.f21652g = new C8155xx[i5];
        this.f21653h = 0;
    }
}
