package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.k1 */
final class C8307k1 extends C8276e0<Long> implements zzuu<Long>, C8258a2, RandomAccess {

    /* renamed from: g */
    private long[] f23276g;

    /* renamed from: h */
    private int f23277h;

    static {
        new C8307k1().mo30101s();
    }

    C8307k1() {
        this(new long[10], 0);
    }

    /* renamed from: a */
    private final void m26029a(int i, long j) {
        int i2;
        mo30095a();
        if (i < 0 || i > (i2 = this.f23277h)) {
            throw new IndexOutOfBoundsException(m26031j(i));
        }
        long[] jArr = this.f23276g;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f23276g, i, jArr2, i + 1, this.f23277h - i);
            this.f23276g = jArr2;
        }
        this.f23276g[i] = j;
        this.f23277h++;
        this.modCount++;
    }

    /* renamed from: i */
    private final void m26030i(int i) {
        if (i < 0 || i >= this.f23277h) {
            throw new IndexOutOfBoundsException(m26031j(i));
        }
    }

    /* renamed from: j */
    private final String m26031j(int i) {
        int i2 = this.f23277h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m26029a(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo30095a();
        zzuq.m26677a(collection);
        if (!(collection instanceof C8307k1)) {
            return super.addAll(collection);
        }
        C8307k1 k1Var = (C8307k1) collection;
        int i = k1Var.f23277h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23277h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f23276g;
            if (i3 > jArr.length) {
                this.f23276g = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(k1Var.f23276g, 0, this.f23276g, this.f23277h, k1Var.f23277h);
            this.f23277h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final /* synthetic */ zzuu mo30071b(int i) {
        if (i >= this.f23277h) {
            return new C8307k1(Arrays.copyOf(this.f23276g, i), this.f23277h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8307k1)) {
            return super.equals(obj);
        }
        C8307k1 k1Var = (C8307k1) obj;
        if (this.f23277h != k1Var.f23277h) {
            return false;
        }
        long[] jArr = k1Var.f23276g;
        for (int i = 0; i < this.f23277h; i++) {
            if (this.f23276g[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo30143h(i));
    }

    /* renamed from: h */
    public final long mo30143h(int i) {
        m26030i(i);
        return this.f23276g[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f23277h; i2++) {
            i = (i * 31) + zzuq.m26674a(this.f23276g[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo30095a();
        for (int i = 0; i < this.f23277h; i++) {
            if (obj.equals(Long.valueOf(this.f23276g[i]))) {
                long[] jArr = this.f23276g;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f23277h - i) - 1);
                this.f23277h--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo30095a();
        if (i2 >= i) {
            long[] jArr = this.f23276g;
            System.arraycopy(jArr, i2, jArr, i, this.f23277h - i2);
            this.f23277h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo30095a();
        m26030i(i);
        long[] jArr = this.f23276g;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f23277h;
    }

    private C8307k1(long[] jArr, int i) {
        this.f23276g = jArr;
        this.f23277h = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo30095a();
        m26030i(i);
        long[] jArr = this.f23276g;
        long j = jArr[i];
        int i2 = this.f23277h;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f23277h--;
        this.modCount++;
        return Long.valueOf(j);
    }
}
