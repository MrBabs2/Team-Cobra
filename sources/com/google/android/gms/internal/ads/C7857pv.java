package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.pv */
final class C7857pv extends C8188yt<Long> implements zzdoj<Long>, C7558hw, RandomAccess {

    /* renamed from: g */
    private long[] f16610g;

    /* renamed from: h */
    private int f16611h;

    static {
        new C7857pv(new long[0], 0).mo26836w();
    }

    C7857pv() {
        this(new long[10], 0);
    }

    /* renamed from: i */
    private final void m17914i(int i) {
        if (i < 0 || i >= this.f16611h) {
            throw new IndexOutOfBoundsException(m17915j(i));
        }
    }

    /* renamed from: j */
    private final String m17915j(int i) {
        int i2 = this.f16611h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo26438a(long j) {
        m17913a(this.f16611h, j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m17913a(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo26829a();
        zzdod.m24034a(collection);
        if (!(collection instanceof C7857pv)) {
            return super.addAll(collection);
        }
        C7857pv pvVar = (C7857pv) collection;
        int i = pvVar.f16611h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16611h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f16610g;
            if (i3 > jArr.length) {
                this.f16610g = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(pvVar.f16610g, 0, this.f16610g, this.f16611h, pvVar.f16611h);
            this.f16611h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final /* synthetic */ zzdoj mo25790c(int i) {
        if (i >= this.f16611h) {
            return new C7857pv(Arrays.copyOf(this.f16610g, i), this.f16611h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7857pv)) {
            return super.equals(obj);
        }
        C7857pv pvVar = (C7857pv) obj;
        if (this.f16611h != pvVar.f16611h) {
            return false;
        }
        long[] jArr = pvVar.f16610g;
        for (int i = 0; i < this.f16611h; i++) {
            if (this.f16610g[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(mo26441h(i));
    }

    /* renamed from: h */
    public final long mo26441h(int i) {
        m17914i(i);
        return this.f16610g[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16611h; i2++) {
            i = (i * 31) + zzdod.m24031a(this.f16610g[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo26829a();
        for (int i = 0; i < this.f16611h; i++) {
            if (obj.equals(Long.valueOf(this.f16610g[i]))) {
                long[] jArr = this.f16610g;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f16611h - i) - 1);
                this.f16611h--;
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
            long[] jArr = this.f16610g;
            System.arraycopy(jArr, i2, jArr, i, this.f16611h - i2);
            this.f16611h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo26829a();
        m17914i(i);
        long[] jArr = this.f16610g;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f16611h;
    }

    private C7857pv(long[] jArr, int i) {
        this.f16610g = jArr;
        this.f16611h = i;
    }

    /* renamed from: a */
    private final void m17913a(int i, long j) {
        int i2;
        mo26829a();
        if (i < 0 || i > (i2 = this.f16611h)) {
            throw new IndexOutOfBoundsException(m17915j(i));
        }
        long[] jArr = this.f16610g;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f16610g, i, jArr2, i + 1, this.f16611h - i);
            this.f16610g = jArr2;
        }
        this.f16610g[i] = j;
        this.f16611h++;
        this.modCount++;
    }

    public final /* synthetic */ Object remove(int i) {
        mo26829a();
        m17914i(i);
        long[] jArr = this.f16610g;
        long j = jArr[i];
        int i2 = this.f16611h;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f16611h--;
        this.modCount++;
        return Long.valueOf(j);
    }
}
