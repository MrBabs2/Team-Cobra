package com.google.android.gms.internal.ads;

import java.util.Arrays;

public class zzrd implements zzrm {

    /* renamed from: a */
    private final zzra f22579a;

    /* renamed from: b */
    private final int f22580b;

    /* renamed from: c */
    private final int[] f22581c;

    /* renamed from: d */
    private final zzlh[] f22582d;

    /* renamed from: e */
    private int f22583e;

    public zzrd(zzra zzra, int... iArr) {
        int i = 0;
        zzsk.m25218b(iArr.length > 0);
        zzsk.m25214a(zzra);
        this.f22579a = zzra;
        int length = iArr.length;
        this.f22580b = length;
        this.f22582d = new zzlh[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f22582d[i2] = zzra.mo29671a(iArr[i2]);
        }
        Arrays.sort(this.f22582d, new m30());
        this.f22581c = new int[this.f22580b];
        while (true) {
            int i3 = this.f22580b;
            if (i < i3) {
                this.f22581c[i] = zzra.mo29670a(this.f22582d[i]);
                i++;
            } else {
                long[] jArr = new long[i3];
                return;
            }
        }
    }

    /* renamed from: a */
    public final zzra mo29679a() {
        return this.f22579a;
    }

    /* renamed from: b */
    public final zzlh mo29680b(int i) {
        return this.f22582d[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzrd zzrd = (zzrd) obj;
            return this.f22579a == zzrd.f22579a && Arrays.equals(this.f22581c, zzrd.f22581c);
        }
    }

    public int hashCode() {
        if (this.f22583e == 0) {
            this.f22583e = (System.identityHashCode(this.f22579a) * 31) + Arrays.hashCode(this.f22581c);
        }
        return this.f22583e;
    }

    public final int length() {
        return this.f22581c.length;
    }

    /* renamed from: a */
    public final int mo29678a(int i) {
        return this.f22581c[0];
    }
}
