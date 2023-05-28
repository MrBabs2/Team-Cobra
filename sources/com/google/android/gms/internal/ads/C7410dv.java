package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.dv */
final class C7410dv extends C8188yt<Float> implements zzdoj<Float>, C7558hw, RandomAccess {

    /* renamed from: g */
    private float[] f15029g;

    /* renamed from: h */
    private int f15030h;

    static {
        new C7410dv(new float[0], 0).mo26836w();
    }

    C7410dv() {
        this(new float[10], 0);
    }

    /* renamed from: h */
    private final void m16840h(int i) {
        if (i < 0 || i >= this.f15030h) {
            throw new IndexOutOfBoundsException(m16841i(i));
        }
    }

    /* renamed from: i */
    private final String m16841i(int i) {
        int i2 = this.f15030h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo25839a(float f) {
        m16839a(this.f15030h, f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m16839a(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo26829a();
        zzdod.m24034a(collection);
        if (!(collection instanceof C7410dv)) {
            return super.addAll(collection);
        }
        C7410dv dvVar = (C7410dv) collection;
        int i = dvVar.f15030h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15030h;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f15029g;
            if (i3 > fArr.length) {
                this.f15029g = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(dvVar.f15029g, 0, this.f15029g, this.f15030h, dvVar.f15030h);
            this.f15030h = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final /* synthetic */ zzdoj mo25790c(int i) {
        if (i >= this.f15030h) {
            return new C7410dv(Arrays.copyOf(this.f15029g, i), this.f15030h);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7410dv)) {
            return super.equals(obj);
        }
        C7410dv dvVar = (C7410dv) obj;
        if (this.f15030h != dvVar.f15030h) {
            return false;
        }
        float[] fArr = dvVar.f15029g;
        for (int i = 0; i < this.f15030h; i++) {
            if (Float.floatToIntBits(this.f15029g[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m16840h(i);
        return Float.valueOf(this.f15029g[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15030h; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f15029g[i2]);
        }
        return i;
    }

    public final boolean remove(Object obj) {
        mo26829a();
        for (int i = 0; i < this.f15030h; i++) {
            if (obj.equals(Float.valueOf(this.f15029g[i]))) {
                float[] fArr = this.f15029g;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f15030h - i) - 1);
                this.f15030h--;
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
            float[] fArr = this.f15029g;
            System.arraycopy(fArr, i2, fArr, i, this.f15030h - i2);
            this.f15030h -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo26829a();
        m16840h(i);
        float[] fArr = this.f15029g;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f15030h;
    }

    private C7410dv(float[] fArr, int i) {
        this.f15029g = fArr;
        this.f15030h = i;
    }

    /* renamed from: a */
    private final void m16839a(int i, float f) {
        int i2;
        mo26829a();
        if (i < 0 || i > (i2 = this.f15030h)) {
            throw new IndexOutOfBoundsException(m16841i(i));
        }
        float[] fArr = this.f15029g;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f15029g, i, fArr2, i + 1, this.f15030h - i);
            this.f15029g = fArr2;
        }
        this.f15029g[i] = f;
        this.f15030h++;
        this.modCount++;
    }

    public final /* synthetic */ Object remove(int i) {
        mo26829a();
        m16840h(i);
        float[] fArr = this.f15029g;
        float f = fArr[i];
        int i2 = this.f15030h;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f15030h--;
        this.modCount++;
        return Float.valueOf(f);
    }
}
