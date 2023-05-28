package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.cu */
final class C7372cu extends C8188yt<Boolean> implements zzdoj<Boolean>, C7558hw, RandomAccess {

    /* renamed from: g */
    private boolean[] f14771g;

    /* renamed from: h */
    private int f14772h;

    static {
        new C7372cu(new boolean[0], 0).mo26836w();
    }

    C7372cu() {
        this(new boolean[10], 0);
    }

    /* renamed from: h */
    private final void m16745h(int i) {
        if (i < 0 || i >= this.f14772h) {
            throw new IndexOutOfBoundsException(m16746i(i));
        }
    }

    /* renamed from: i */
    private final String m16746i(int i) {
        int i2 = this.f14772h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo25787a(boolean z) {
        m16744a(this.f14772h, z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m16744a(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo26829a();
        zzdod.m24034a(collection);
        if (!(collection instanceof C7372cu)) {
            return super.addAll(collection);
        }
        C7372cu cuVar = (C7372cu) collection;
        int i = cuVar.f14772h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14772h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f14771g;
            if (i3 > zArr.length) {
                this.f14771g = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(cuVar.f14771g, 0, this.f14771g, this.f14772h, cuVar.f14772h);
            this.f14772h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final /* synthetic */ zzdoj mo25790c(int i) {
        if (i >= this.f14772h) {
            return new C7372cu(Arrays.copyOf(this.f14771g, i), this.f14772h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7372cu)) {
            return super.equals(obj);
        }
        C7372cu cuVar = (C7372cu) obj;
        if (this.f14772h != cuVar.f14772h) {
            return false;
        }
        boolean[] zArr = cuVar.f14771g;
        for (int i = 0; i < this.f14772h; i++) {
            if (this.f14771g[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m16745h(i);
        return Boolean.valueOf(this.f14771g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14772h; i2++) {
            i = (i * 31) + zzdod.m24032a(this.f14771g[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo26829a();
        for (int i = 0; i < this.f14772h; i++) {
            if (obj.equals(Boolean.valueOf(this.f14771g[i]))) {
                boolean[] zArr = this.f14771g;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f14772h - i) - 1);
                this.f14772h--;
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
            boolean[] zArr = this.f14771g;
            System.arraycopy(zArr, i2, zArr, i, this.f14772h - i2);
            this.f14772h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo26829a();
        m16745h(i);
        boolean[] zArr = this.f14771g;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f14772h;
    }

    private C7372cu(boolean[] zArr, int i) {
        this.f14771g = zArr;
        this.f14772h = i;
    }

    /* renamed from: a */
    private final void m16744a(int i, boolean z) {
        int i2;
        mo26829a();
        if (i < 0 || i > (i2 = this.f14772h)) {
            throw new IndexOutOfBoundsException(m16746i(i));
        }
        boolean[] zArr = this.f14771g;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f14771g, i, zArr2, i + 1, this.f14772h - i);
            this.f14771g = zArr2;
        }
        this.f14771g[i] = z;
        this.f14772h++;
        this.modCount++;
    }

    public final /* synthetic */ Object remove(int i) {
        mo26829a();
        m16745h(i);
        boolean[] zArr = this.f14771g;
        boolean z = zArr[i];
        int i2 = this.f14772h;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f14772h--;
        this.modCount++;
        return Boolean.valueOf(z);
    }
}
