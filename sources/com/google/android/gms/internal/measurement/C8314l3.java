package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l3 */
final class C8314l3 implements Cloneable {

    /* renamed from: f */
    private zzyd<?, ?> f23286f;

    /* renamed from: g */
    private Object f23287g;

    /* renamed from: h */
    private List<C8319m3> f23288h = new ArrayList();

    C8314l3() {
    }

    /* renamed from: c */
    private final byte[] m26084c() throws IOException {
        byte[] bArr = new byte[mo30195b()];
        mo30194a(zzya.m26739b(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C8314l3 clone() {
        C8314l3 l3Var = new C8314l3();
        try {
            l3Var.f23286f = this.f23286f;
            if (this.f23288h == null) {
                l3Var.f23288h = null;
            } else {
                l3Var.f23288h.addAll(this.f23288h);
            }
            if (this.f23287g != null) {
                if (this.f23287g instanceof zzyi) {
                    l3Var.f23287g = (zzyi) ((zzyi) this.f23287g).clone();
                } else if (this.f23287g instanceof byte[]) {
                    l3Var.f23287g = ((byte[]) this.f23287g).clone();
                } else {
                    int i = 0;
                    if (this.f23287g instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f23287g;
                        byte[][] bArr2 = new byte[bArr.length][];
                        l3Var.f23287g = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f23287g instanceof boolean[]) {
                        l3Var.f23287g = ((boolean[]) this.f23287g).clone();
                    } else if (this.f23287g instanceof int[]) {
                        l3Var.f23287g = ((int[]) this.f23287g).clone();
                    } else if (this.f23287g instanceof long[]) {
                        l3Var.f23287g = ((long[]) this.f23287g).clone();
                    } else if (this.f23287g instanceof float[]) {
                        l3Var.f23287g = ((float[]) this.f23287g).clone();
                    } else if (this.f23287g instanceof double[]) {
                        l3Var.f23287g = ((double[]) this.f23287g).clone();
                    } else if (this.f23287g instanceof zzyi[]) {
                        zzyi[] zzyiArr = (zzyi[]) this.f23287g;
                        zzyi[] zzyiArr2 = new zzyi[zzyiArr.length];
                        l3Var.f23287g = zzyiArr2;
                        while (i < zzyiArr.length) {
                            zzyiArr2[i] = (zzyi) zzyiArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return l3Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30194a(zzya zzya) throws IOException {
        Object obj = this.f23287g;
        if (obj != null) {
            zzyd<?, ?> zzyd = this.f23286f;
            if (zzyd.f23572d) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        zzyd.mo30489a(obj2, zzya);
                    }
                }
                return;
            }
            zzyd.mo30489a(obj, zzya);
            return;
        }
        for (C8319m3 next : this.f23288h) {
            zzya.mo30480a(next.f23294a);
            zzya.mo30483a(next.f23295b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo30195b() {
        Object obj = this.f23287g;
        if (obj != null) {
            zzyd<?, ?> zzyd = this.f23286f;
            if (!zzyd.f23572d) {
                return zzyd.mo30488a(obj);
            }
            int length = Array.getLength(obj);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = Array.get(obj, i2);
                if (obj2 != null) {
                    i += zzyd.mo30488a(obj2);
                }
            }
            return i;
        }
        int i3 = 0;
        for (C8319m3 next : this.f23288h) {
            i3 += zzya.m26740c(next.f23294a) + 0 + next.f23295b.length;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        List<C8319m3> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8314l3)) {
            return false;
        }
        C8314l3 l3Var = (C8314l3) obj;
        if (this.f23287g == null || l3Var.f23287g == null) {
            List<C8319m3> list2 = this.f23288h;
            if (list2 != null && (list = l3Var.f23288h) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(m26084c(), l3Var.m26084c());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            zzyd<?, ?> zzyd = this.f23286f;
            if (zzyd != l3Var.f23286f) {
                return false;
            }
            if (!zzyd.f23570b.isArray()) {
                return this.f23287g.equals(l3Var.f23287g);
            }
            Object obj2 = this.f23287g;
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) l3Var.f23287g);
            }
            if (obj2 instanceof int[]) {
                return Arrays.equals((int[]) obj2, (int[]) l3Var.f23287g);
            }
            if (obj2 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) l3Var.f23287g);
            }
            if (obj2 instanceof float[]) {
                return Arrays.equals((float[]) obj2, (float[]) l3Var.f23287g);
            }
            if (obj2 instanceof double[]) {
                return Arrays.equals((double[]) obj2, (double[]) l3Var.f23287g);
            }
            if (obj2 instanceof boolean[]) {
                return Arrays.equals((boolean[]) obj2, (boolean[]) l3Var.f23287g);
            }
            return Arrays.deepEquals((Object[]) obj2, (Object[]) l3Var.f23287g);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m26084c()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
