package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.hv */
final class C7557hv extends C8188yt<Integer> implements zzdoh, C7558hw, RandomAccess {

    /* renamed from: i */
    private static final C7557hv f15544i;

    /* renamed from: g */
    private int[] f15545g;

    /* renamed from: h */
    private int f15546h;

    static {
        C7557hv hvVar = new C7557hv(new int[0], 0);
        f15544i = hvVar;
        hvVar.mo26836w();
    }

    C7557hv() {
        this(new int[10], 0);
    }

    /* renamed from: a */
    private final void m17127a(int i, int i2) {
        int i3;
        mo26829a();
        if (i < 0 || i > (i3 = this.f15546h)) {
            throw new IndexOutOfBoundsException(m17130j(i));
        }
        int[] iArr = this.f15545g;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f15545g, i, iArr2, i + 1, this.f15546h - i);
            this.f15545g = iArr2;
        }
        this.f15545g[i] = i2;
        this.f15546h++;
        this.modCount++;
    }

    /* renamed from: b */
    public static C7557hv m17128b() {
        return f15544i;
    }

    /* renamed from: i */
    private final void m17129i(int i) {
        if (i < 0 || i >= this.f15546h) {
            throw new IndexOutOfBoundsException(m17130j(i));
        }
    }

    /* renamed from: j */
    private final String m17130j(int i) {
        int i2 = this.f15546h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m17127a(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo26829a();
        zzdod.m24034a(collection);
        if (!(collection instanceof C7557hv)) {
            return super.addAll(collection);
        }
        C7557hv hvVar = (C7557hv) collection;
        int i = hvVar.f15546h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15546h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f15545g;
            if (i3 > iArr.length) {
                this.f15545g = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(hvVar.f15545g, 0, this.f15545g, this.f15546h, hvVar.f15546h);
            this.f15546h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public final zzdoh mo25790c(int i) {
        if (i >= this.f15546h) {
            return new C7557hv(Arrays.copyOf(this.f15545g, i), this.f15546h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7557hv)) {
            return super.equals(obj);
        }
        C7557hv hvVar = (C7557hv) obj;
        if (this.f15546h != hvVar.f15546h) {
            return false;
        }
        int[] iArr = hvVar.f15545g;
        for (int i = 0; i < this.f15546h; i++) {
            if (this.f15545g[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo26051f(int i) {
        m17127a(this.f15546h, i);
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(mo26053h(i));
    }

    /* renamed from: h */
    public final int mo26053h(int i) {
        m17129i(i);
        return this.f15545g[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15546h; i2++) {
            i = (i * 31) + this.f15545g[i2];
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo26829a();
        for (int i = 0; i < this.f15546h; i++) {
            if (obj.equals(Integer.valueOf(this.f15545g[i]))) {
                int[] iArr = this.f15545g;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f15546h - i) - 1);
                this.f15546h--;
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
            int[] iArr = this.f15545g;
            System.arraycopy(iArr, i2, iArr, i, this.f15546h - i2);
            this.f15546h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo26829a();
        m17129i(i);
        int[] iArr = this.f15545g;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f15546h;
    }

    private C7557hv(int[] iArr, int i) {
        this.f15545g = iArr;
        this.f15546h = i;
    }

    public final /* synthetic */ Object remove(int i) {
        mo26829a();
        m17129i(i);
        int[] iArr = this.f15545g;
        int i2 = iArr[i];
        int i3 = this.f15546h;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f15546h--;
        this.modCount++;
        return Integer.valueOf(i2);
    }
}
