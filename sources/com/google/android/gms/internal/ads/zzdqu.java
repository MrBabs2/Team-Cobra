package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.io.IOException;
import java.util.Arrays;

public final class zzdqu {

    /* renamed from: f */
    private static final zzdqu f21607f = new zzdqu(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f21608a;

    /* renamed from: b */
    private int[] f21609b;

    /* renamed from: c */
    private Object[] f21610c;

    /* renamed from: d */
    private int f21611d;

    /* renamed from: e */
    private boolean f21612e;

    private zzdqu() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    static zzdqu m24093a(zzdqu zzdqu, zzdqu zzdqu2) {
        int i = zzdqu.f21608a + zzdqu2.f21608a;
        int[] copyOf = Arrays.copyOf(zzdqu.f21609b, i);
        System.arraycopy(zzdqu2.f21609b, 0, copyOf, zzdqu.f21608a, zzdqu2.f21608a);
        Object[] copyOf2 = Arrays.copyOf(zzdqu.f21610c, i);
        System.arraycopy(zzdqu2.f21610c, 0, copyOf2, zzdqu.f21608a, zzdqu2.f21608a);
        return new zzdqu(i, copyOf, copyOf2, true);
    }

    /* renamed from: d */
    public static zzdqu m24095d() {
        return f21607f;
    }

    /* renamed from: e */
    static zzdqu m24096e() {
        return new zzdqu();
    }

    /* renamed from: b */
    public final void mo29179b(C8118wx wxVar) throws IOException {
        if (this.f21608a != 0) {
            if (wxVar.mo26584a() == zzdob.zze.f21584k) {
                for (int i = 0; i < this.f21608a; i++) {
                    m24094a(this.f21609b[i], this.f21610c[i], wxVar);
                }
                return;
            }
            for (int i2 = this.f21608a - 1; i2 >= 0; i2--) {
                m24094a(this.f21609b[i2], this.f21610c[i2], wxVar);
            }
        }
    }

    /* renamed from: c */
    public final int mo29180c() {
        int i = this.f21611d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f21608a; i3++) {
            i2 += zzdni.m23831d(this.f21609b[i3] >>> 3, (zzdmr) this.f21610c[i3]);
        }
        this.f21611d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzdqu)) {
            return false;
        }
        zzdqu zzdqu = (zzdqu) obj;
        int i = this.f21608a;
        if (i == zzdqu.f21608a) {
            int[] iArr = this.f21609b;
            int[] iArr2 = zzdqu.f21609b;
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
                Object[] objArr = this.f21610c;
                Object[] objArr2 = zzdqu.f21610c;
                int i3 = this.f21608a;
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
        int i = this.f21608a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f21609b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f21610c;
        int i7 = this.f21608a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    private zzdqu(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f21611d = -1;
        this.f21608a = i;
        this.f21609b = iArr;
        this.f21610c = objArr;
        this.f21612e = z;
    }

    /* renamed from: a */
    public final void mo29174a() {
        this.f21612e = false;
    }

    /* renamed from: b */
    public final int mo29178b() {
        int i;
        int i2 = this.f21611d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f21608a; i4++) {
            int i5 = this.f21609b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = zzdni.m23836e(i6, ((Long) this.f21610c[i4]).longValue());
            } else if (i7 == 1) {
                i = zzdni.m23844g(i6, ((Long) this.f21610c[i4]).longValue());
            } else if (i7 == 2) {
                i = zzdni.m23826c(i6, (zzdmr) this.f21610c[i4]);
            } else if (i7 == 3) {
                i = (zzdni.m23835e(i6) << 1) + ((zzdqu) this.f21610c[i4]).mo29178b();
            } else if (i7 == 5) {
                i = zzdni.m23851i(i6, ((Integer) this.f21610c[i4]).intValue());
            } else {
                throw new IllegalStateException(zzdok.m24052f());
            }
            i3 += i;
        }
        this.f21611d = i3;
        return i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29176a(C8118wx wxVar) throws IOException {
        if (wxVar.mo26584a() == zzdob.zze.f21585l) {
            for (int i = this.f21608a - 1; i >= 0; i--) {
                wxVar.mo26591a(this.f21609b[i] >>> 3, this.f21610c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f21608a; i2++) {
            wxVar.mo26591a(this.f21609b[i2] >>> 3, this.f21610c[i2]);
        }
    }

    /* renamed from: a */
    private static void m24094a(int i, Object obj, C8118wx wxVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            wxVar.mo26611e(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            wxVar.mo26605c(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            wxVar.mo26590a(i2, (zzdmr) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                wxVar.mo26588a(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzdok.m24052f());
        } else if (wxVar.mo26584a() == zzdob.zze.f21584k) {
            wxVar.mo26598b(i2);
            ((zzdqu) obj).mo29179b(wxVar);
            wxVar.mo26585a(i2);
        } else {
            wxVar.mo26585a(i2);
            ((zzdqu) obj).mo29179b(wxVar);
            wxVar.mo26598b(i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29177a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f21608a; i2++) {
            C7300aw.m16512a(sb, i, String.valueOf(this.f21609b[i2] >>> 3), this.f21610c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29175a(int i, Object obj) {
        if (this.f21612e) {
            int i2 = this.f21608a;
            if (i2 == this.f21609b.length) {
                int i3 = this.f21608a + (i2 < 4 ? 8 : i2 >> 1);
                this.f21609b = Arrays.copyOf(this.f21609b, i3);
                this.f21610c = Arrays.copyOf(this.f21610c, i3);
            }
            int[] iArr = this.f21609b;
            int i4 = this.f21608a;
            iArr[i4] = i;
            this.f21610c[i4] = obj;
            this.f21608a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
