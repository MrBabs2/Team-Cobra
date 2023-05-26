package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;
import java.io.IOException;
import java.util.Arrays;

public final class zzxe {

    /* renamed from: e */
    private static final zzxe f23529e = new zzxe(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f23530a;

    /* renamed from: b */
    private int[] f23531b;

    /* renamed from: c */
    private Object[] f23532c;

    /* renamed from: d */
    private int f23533d;

    private zzxe() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    static zzxe m26721a(zzxe zzxe, zzxe zzxe2) {
        int i = zzxe.f23530a + zzxe2.f23530a;
        int[] copyOf = Arrays.copyOf(zzxe.f23531b, i);
        System.arraycopy(zzxe2.f23531b, 0, copyOf, zzxe.f23530a, zzxe2.f23530a);
        Object[] copyOf2 = Arrays.copyOf(zzxe.f23532c, i);
        System.arraycopy(zzxe2.f23532c, 0, copyOf2, zzxe.f23530a, zzxe2.f23530a);
        return new zzxe(i, copyOf, copyOf2, true);
    }

    /* renamed from: d */
    public static zzxe m26723d() {
        return f23529e;
    }

    /* renamed from: a */
    public final void mo30466a() {
    }

    /* renamed from: b */
    public final void mo30470b(C8309k3 k3Var) throws IOException {
        if (this.f23530a != 0) {
            if (k3Var.mo30148a() == zzuo.zze.f23507i) {
                for (int i = 0; i < this.f23530a; i++) {
                    m26722a(this.f23531b[i], this.f23532c[i], k3Var);
                }
                return;
            }
            for (int i2 = this.f23530a - 1; i2 >= 0; i2--) {
                m26722a(this.f23531b[i2], this.f23532c[i2], k3Var);
            }
        }
    }

    /* renamed from: c */
    public final int mo30471c() {
        int i = this.f23533d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f23530a; i3++) {
            i2 += zztv.m26558d(this.f23531b[i3] >>> 3, (zzte) this.f23532c[i3]);
        }
        this.f23533d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzxe)) {
            return false;
        }
        zzxe zzxe = (zzxe) obj;
        int i = this.f23530a;
        if (i == zzxe.f23530a) {
            int[] iArr = this.f23531b;
            int[] iArr2 = zzxe.f23531b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f23532c;
                Object[] objArr2 = zzxe.f23532c;
                int i3 = this.f23530a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.f23530a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f23531b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f23532c;
        int i7 = this.f23530a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    private zzxe(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f23533d = -1;
        this.f23530a = i;
        this.f23531b = iArr;
        this.f23532c = objArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30467a(C8309k3 k3Var) throws IOException {
        if (k3Var.mo30148a() == zzuo.zze.f23508j) {
            for (int i = this.f23530a - 1; i >= 0; i--) {
                k3Var.mo30156a(this.f23531b[i] >>> 3, this.f23532c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f23530a; i2++) {
            k3Var.mo30156a(this.f23531b[i2] >>> 3, this.f23532c[i2]);
        }
    }

    /* renamed from: b */
    public final int mo30469b() {
        int i;
        int i2 = this.f23533d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f23530a; i4++) {
            int i5 = this.f23531b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zztv.m26561e(i6, ((Long) this.f23532c[i4]).longValue());
            } else if (i7 == 1) {
                i = zztv.m26569g(i6, ((Long) this.f23532c[i4]).longValue());
            } else if (i7 == 2) {
                i = zztv.m26553c(i6, (zzte) this.f23532c[i4]);
            } else if (i7 == 3) {
                i = (zztv.m26560e(i6) << 1) + ((zzxe) this.f23532c[i4]).mo30469b();
            } else if (i7 == 5) {
                i = zztv.m26576i(i6, ((Integer) this.f23532c[i4]).intValue());
            } else {
                throw new IllegalStateException(zzuv.m26689c());
            }
            i3 += i;
        }
        this.f23533d = i3;
        return i3;
    }

    /* renamed from: a */
    private static void m26722a(int i, Object obj, C8309k3 k3Var) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            k3Var.mo30174d(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            k3Var.mo30165b(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            k3Var.mo30155a(i2, (zzte) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                k3Var.mo30176e(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzuv.m26689c());
        } else if (k3Var.mo30148a() == zzuo.zze.f23507i) {
            k3Var.mo30163b(i2);
            ((zzxe) obj).mo30470b(k3Var);
            k3Var.mo30149a(i2);
        } else {
            k3Var.mo30149a(i2);
            ((zzxe) obj).mo30470b(k3Var);
            k3Var.mo30163b(i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30468a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f23530a; i2++) {
            C8350u1.m26196a(sb, i, String.valueOf(this.f23531b[i2] >>> 3), this.f23532c[i2]);
        }
    }
}
