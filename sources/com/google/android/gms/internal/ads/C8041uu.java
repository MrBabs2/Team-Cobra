package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.uu */
final class C8041uu extends C8188yt<Double> implements zzdoj<Double>, C7558hw, RandomAccess {

    /* renamed from: g */
    private double[] f16981g;

    /* renamed from: h */
    private int f16982h;

    static {
        new C8041uu(new double[0], 0).mo26836w();
    }

    C8041uu() {
        this(new double[10], 0);
    }

    /* renamed from: h */
    private final void m18294h(int i) {
        if (i < 0 || i >= this.f16982h) {
            throw new IndexOutOfBoundsException(m18295i(i));
        }
    }

    /* renamed from: i */
    private final String m18295i(int i) {
        int i2 = this.f16982h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo26665a(double d) {
        m18293a(this.f16982h, d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m18293a(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo26829a();
        zzdod.m24034a(collection);
        if (!(collection instanceof C8041uu)) {
            return super.addAll(collection);
        }
        C8041uu uuVar = (C8041uu) collection;
        int i = uuVar.f16982h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16982h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f16981g;
            if (i3 > dArr.length) {
                this.f16981g = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(uuVar.f16981g, 0, this.f16981g, this.f16982h, uuVar.f16982h);
            this.f16982h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final /* synthetic */ zzdoj mo25790c(int i) {
        if (i >= this.f16982h) {
            return new C8041uu(Arrays.copyOf(this.f16981g, i), this.f16982h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8041uu)) {
            return super.equals(obj);
        }
        C8041uu uuVar = (C8041uu) obj;
        if (this.f16982h != uuVar.f16982h) {
            return false;
        }
        double[] dArr = uuVar.f16981g;
        for (int i = 0; i < this.f16982h; i++) {
            if (Double.doubleToLongBits(this.f16981g[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m18294h(i);
        return Double.valueOf(this.f16981g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16982h; i2++) {
            i = (i * 31) + zzdod.m24031a(Double.doubleToLongBits(this.f16981g[i2]));
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo26829a();
        for (int i = 0; i < this.f16982h; i++) {
            if (obj.equals(Double.valueOf(this.f16981g[i]))) {
                double[] dArr = this.f16981g;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f16982h - i) - 1);
                this.f16982h--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo26829a();
        if (i2 >= i) {
            double[] dArr = this.f16981g;
            System.arraycopy(dArr, i2, dArr, i, this.f16982h - i2);
            this.f16982h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo26829a();
        m18294h(i);
        double[] dArr = this.f16981g;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f16982h;
    }

    private C8041uu(double[] dArr, int i) {
        this.f16981g = dArr;
        this.f16982h = i;
    }

    /* renamed from: a */
    private final void m18293a(int i, double d) {
        int i2;
        mo26829a();
        if (i < 0 || i > (i2 = this.f16982h)) {
            throw new IndexOutOfBoundsException(m18295i(i));
        }
        double[] dArr = this.f16981g;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f16981g, i, dArr2, i + 1, this.f16982h - i);
            this.f16981g = dArr2;
        }
        this.f16981g[i] = d;
        this.f16982h++;
        this.modCount++;
    }

    public final /* synthetic */ Object remove(int i) {
        mo26829a();
        m18294h(i);
        double[] dArr = this.f16981g;
        double d = dArr[i];
        int i2 = this.f16982h;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f16982h--;
        this.modCount++;
        return Double.valueOf(d);
    }
}
