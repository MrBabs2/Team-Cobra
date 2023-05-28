package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.c1 */
final class C8267c1 extends C8276e0<Integer> implements zzuu<Integer>, C8258a2, RandomAccess {

    /* renamed from: g */
    private int[] f23221g;

    /* renamed from: h */
    private int f23222h;

    static {
        new C8267c1().mo30101s();
    }

    C8267c1() {
        this(new int[10], 0);
    }

    /* renamed from: a */
    private final void m25899a(int i, int i2) {
        int i3;
        mo30095a();
        if (i < 0 || i > (i3 = this.f23222h)) {
            throw new IndexOutOfBoundsException(m25901j(i));
        }
        int[] iArr = this.f23221g;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f23221g, i, iArr2, i + 1, this.f23222h - i);
            this.f23221g = iArr2;
        }
        this.f23221g[i] = i2;
        this.f23222h++;
        this.modCount++;
    }

    /* renamed from: i */
    private final void m25900i(int i) {
        if (i < 0 || i >= this.f23222h) {
            throw new IndexOutOfBoundsException(m25901j(i));
        }
    }

    /* renamed from: j */
    private final String m25901j(int i) {
        int i2 = this.f23222h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m25899a(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo30095a();
        zzuq.m26677a(collection);
        if (!(collection instanceof C8267c1)) {
            return super.addAll(collection);
        }
        C8267c1 c1Var = (C8267c1) collection;
        int i = c1Var.f23222h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23222h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f23221g;
            if (i3 > iArr.length) {
                this.f23221g = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c1Var.f23221g, 0, this.f23221g, this.f23222h, c1Var.f23222h);
            this.f23222h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final /* synthetic */ zzuu mo30071b(int i) {
        if (i >= this.f23222h) {
            return new C8267c1(Arrays.copyOf(this.f23221g, i), this.f23222h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8267c1)) {
            return super.equals(obj);
        }
        C8267c1 c1Var = (C8267c1) obj;
        if (this.f23222h != c1Var.f23222h) {
            return false;
        }
        int[] iArr = c1Var.f23221g;
        for (int i = 0; i < this.f23222h; i++) {
            if (this.f23221g[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo30074h(i));
    }

    /* renamed from: h */
    public final int mo30074h(int i) {
        m25900i(i);
        return this.f23221g[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f23222h; i2++) {
            i = (i * 31) + this.f23221g[i2];
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo30095a();
        for (int i = 0; i < this.f23222h; i++) {
            if (obj.equals(Integer.valueOf(this.f23221g[i]))) {
                int[] iArr = this.f23221g;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f23222h - i) - 1);
                this.f23222h--;
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
            int[] iArr = this.f23221g;
            System.arraycopy(iArr, i2, iArr, i, this.f23222h - i2);
            this.f23222h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo30095a();
        m25900i(i);
        int[] iArr = this.f23221g;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f23222h;
    }

    private C8267c1(int[] iArr, int i) {
        this.f23221g = iArr;
        this.f23222h = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo30095a();
        m25900i(i);
        int[] iArr = this.f23221g;
        int i2 = iArr[i];
        int i3 = this.f23222h;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f23222h--;
        this.modCount++;
        return Integer.valueOf(i2);
    }
}
