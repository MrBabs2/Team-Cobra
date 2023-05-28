package com.google.android.gms.internal.measurement;

public final class zzye implements Cloneable {

    /* renamed from: f */
    private int[] f23573f;

    /* renamed from: g */
    private C8314l3[] f23574g;

    /* renamed from: h */
    private int f23575h;

    static {
        new C8314l3();
    }

    zzye() {
        this(10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C8314l3 mo30492a(int i) {
        return this.f23574g[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo30493b() {
        return this.f23575h;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f23575h;
        zzye zzye = new zzye(i);
        System.arraycopy(this.f23573f, 0, zzye.f23573f, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C8314l3[] l3VarArr = this.f23574g;
            if (l3VarArr[i2] != null) {
                zzye.f23574g[i2] = (C8314l3) l3VarArr[i2].clone();
            }
        }
        zzye.f23575h = i;
        return zzye;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzye)) {
            return false;
        }
        zzye zzye = (zzye) obj;
        int i = this.f23575h;
        if (i != zzye.f23575h) {
            return false;
        }
        int[] iArr = this.f23573f;
        int[] iArr2 = zzye.f23573f;
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
            C8314l3[] l3VarArr = this.f23574g;
            C8314l3[] l3VarArr2 = zzye.f23574g;
            int i3 = this.f23575h;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!l3VarArr[i4].equals(l3VarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f23575h; i2++) {
            i = (((i * 31) + this.f23573f[i2]) * 31) + this.f23574g[i2].hashCode();
        }
        return i;
    }

    private zzye(int i) {
        int b = m26751b(i);
        this.f23573f = new int[b];
        this.f23574g = new C8314l3[b];
        this.f23575h = 0;
    }

    /* renamed from: b */
    private static int m26751b(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }
}
