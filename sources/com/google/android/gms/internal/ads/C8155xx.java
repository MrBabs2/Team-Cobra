package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xx */
final class C8155xx implements Cloneable {

    /* renamed from: f */
    private zzdrs<?, ?> f17210f;

    /* renamed from: g */
    private Object f17211g;

    /* renamed from: h */
    private List<Object> f17212h = new ArrayList();

    C8155xx() {
    }

    /* renamed from: c */
    private final byte[] m18476c() throws IOException {
        byte[] bArr = new byte[mo26785b()];
        mo26784a(zzdrp.m24114a(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C8155xx clone() {
        C8155xx xxVar = new C8155xx();
        try {
            xxVar.f17210f = this.f17210f;
            if (this.f17212h == null) {
                xxVar.f17212h = null;
            } else {
                xxVar.f17212h.addAll(this.f17212h);
            }
            if (this.f17211g != null) {
                if (this.f17211g instanceof zzdrw) {
                    xxVar.f17211g = (zzdrw) ((zzdrw) this.f17211g).clone();
                } else if (this.f17211g instanceof byte[]) {
                    xxVar.f17211g = ((byte[]) this.f17211g).clone();
                } else {
                    int i = 0;
                    if (this.f17211g instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.f17211g;
                        byte[][] bArr2 = new byte[bArr.length][];
                        xxVar.f17211g = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.f17211g instanceof boolean[]) {
                        xxVar.f17211g = ((boolean[]) this.f17211g).clone();
                    } else if (this.f17211g instanceof int[]) {
                        xxVar.f17211g = ((int[]) this.f17211g).clone();
                    } else if (this.f17211g instanceof long[]) {
                        xxVar.f17211g = ((long[]) this.f17211g).clone();
                    } else if (this.f17211g instanceof float[]) {
                        xxVar.f17211g = ((float[]) this.f17211g).clone();
                    } else if (this.f17211g instanceof double[]) {
                        xxVar.f17211g = ((double[]) this.f17211g).clone();
                    } else if (this.f17211g instanceof zzdrw[]) {
                        zzdrw[] zzdrwArr = (zzdrw[]) this.f17211g;
                        zzdrw[] zzdrwArr2 = new zzdrw[zzdrwArr.length];
                        xxVar.f17211g = zzdrwArr2;
                        while (i < zzdrwArr.length) {
                            zzdrwArr2[i] = (zzdrw) zzdrwArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return xxVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26784a(zzdrp zzdrp) throws IOException {
        if (this.f17211g == null) {
            Iterator<Object> it = this.f17212h.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo26785b() {
        if (this.f17211g == null) {
            Iterator<Object> it = this.f17212h.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<Object> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8155xx)) {
            return false;
        }
        C8155xx xxVar = (C8155xx) obj;
        if (this.f17211g == null || xxVar.f17211g == null) {
            List<Object> list2 = this.f17212h;
            if (list2 != null && (list = xxVar.f17212h) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(m18476c(), xxVar.m18476c());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            zzdrs<?, ?> zzdrs = this.f17210f;
            if (zzdrs != xxVar.f17210f) {
                return false;
            }
            if (!zzdrs.f21650a.isArray()) {
                return this.f17211g.equals(xxVar.f17211g);
            }
            Object obj2 = this.f17211g;
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) xxVar.f17211g);
            }
            if (obj2 instanceof int[]) {
                return Arrays.equals((int[]) obj2, (int[]) xxVar.f17211g);
            }
            if (obj2 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) xxVar.f17211g);
            }
            if (obj2 instanceof float[]) {
                return Arrays.equals((float[]) obj2, (float[]) xxVar.f17211g);
            }
            if (obj2 instanceof double[]) {
                return Arrays.equals((double[]) obj2, (double[]) xxVar.f17211g);
            }
            if (obj2 instanceof boolean[]) {
                return Arrays.equals((boolean[]) obj2, (boolean[]) xxVar.f17211g);
            }
            return Arrays.deepEquals((Object[]) obj2, (Object[]) xxVar.f17211g);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m18476c()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
