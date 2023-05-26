package p050l.p067f.p071b;

import java.util.Arrays;
import p050l.p067f.p071b.C4886b;

/* renamed from: l.f.b.j */
/* compiled from: SolverVariableValues */
public class C4900j implements C4886b.C4887a {

    /* renamed from: m */
    private static float f8501m = 0.001f;

    /* renamed from: a */
    private int f8502a = 16;

    /* renamed from: b */
    private int f8503b = 16;

    /* renamed from: c */
    int[] f8504c = new int[16];

    /* renamed from: d */
    int[] f8505d = new int[16];

    /* renamed from: e */
    int[] f8506e = new int[16];

    /* renamed from: f */
    float[] f8507f = new float[16];

    /* renamed from: g */
    int[] f8508g = new int[16];

    /* renamed from: h */
    int[] f8509h = new int[16];

    /* renamed from: i */
    int f8510i = 0;

    /* renamed from: j */
    int f8511j = -1;

    /* renamed from: k */
    private final C4886b f8512k;

    /* renamed from: l */
    protected final C4888c f8513l;

    C4900j(C4886b bVar, C4888c cVar) {
        this.f8512k = bVar;
        this.f8513l = cVar;
        clear();
    }

    /* renamed from: d */
    private void m8370d() {
        int i = this.f8502a * 2;
        this.f8506e = Arrays.copyOf(this.f8506e, i);
        this.f8507f = Arrays.copyOf(this.f8507f, i);
        this.f8508g = Arrays.copyOf(this.f8508g, i);
        this.f8509h = Arrays.copyOf(this.f8509h, i);
        this.f8505d = Arrays.copyOf(this.f8505d, i);
        for (int i2 = this.f8502a; i2 < i; i2++) {
            this.f8506e[i2] = -1;
            this.f8505d[i2] = -1;
        }
        this.f8502a = i;
    }

    /* renamed from: a */
    public int mo17059a() {
        return this.f8510i;
    }

    /* renamed from: b */
    public float mo17064b(int i) {
        int i2 = this.f8510i;
        int i3 = this.f8511j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f8507f[i3];
            }
            i3 = this.f8509h[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: c */
    public int mo17141c(C4898i iVar) {
        if (!(this.f8510i == 0 || iVar == null)) {
            int i = iVar.f8481c;
            int i2 = this.f8504c[i % this.f8503b];
            if (i2 == -1) {
                return -1;
            }
            if (this.f8506e[i2] == i) {
                return i2;
            }
            while (true) {
                int[] iArr = this.f8505d;
                if (iArr[i2] == -1 || this.f8506e[iArr[i2]] == i) {
                    int[] iArr2 = this.f8505d;
                } else {
                    i2 = iArr[i2];
                }
            }
            int[] iArr22 = this.f8505d;
            if (iArr22[i2] != -1 && this.f8506e[iArr22[i2]] == i) {
                return iArr22[i2];
            }
        }
        return -1;
    }

    public void clear() {
        int i = this.f8510i;
        for (int i2 = 0; i2 < i; i2++) {
            C4898i a = mo17060a(i2);
            if (a != null) {
                a.mo17139b(this.f8512k);
            }
        }
        for (int i3 = 0; i3 < this.f8502a; i3++) {
            this.f8506e[i3] = -1;
            this.f8505d[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f8503b; i4++) {
            this.f8504c[i4] = -1;
        }
        this.f8510i = 0;
        this.f8511j = -1;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i = this.f8510i;
        for (int i2 = 0; i2 < i; i2++) {
            C4898i a = mo17060a(i2);
            if (a != null) {
                String str4 = str3 + a + " = " + mo17064b(i2) + " ";
                int c = mo17141c(a);
                String str5 = str4 + "[p: ";
                if (this.f8508g[c] != -1) {
                    str = str5 + this.f8513l.f8415d[this.f8506e[this.f8508g[c]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f8509h[c] != -1) {
                    str2 = str6 + this.f8513l.f8415d[this.f8506e[this.f8509h[c]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }

    /* renamed from: a */
    public C4898i mo17060a(int i) {
        int i2 = this.f8510i;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f8511j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f8513l.f8415d[this.f8506e[i3]];
            }
            i3 = this.f8509h[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo17066b(C4898i iVar) {
        return mo17141c(iVar) != -1;
    }

    /* renamed from: b */
    private void m8368b(int i, C4898i iVar, float f) {
        int c = m8369c();
        m8366a(c, iVar, f);
        if (i != -1) {
            this.f8508g[c] = i;
            int[] iArr = this.f8509h;
            iArr[c] = iArr[i];
            iArr[i] = c;
        } else {
            this.f8508g[c] = -1;
            if (this.f8510i > 0) {
                this.f8509h[c] = this.f8511j;
                this.f8511j = c;
            } else {
                this.f8509h[c] = -1;
            }
        }
        int[] iArr2 = this.f8509h;
        if (iArr2[c] != -1) {
            this.f8508g[iArr2[c]] = c;
        }
        m8367a(iVar, c);
    }

    /* renamed from: a */
    public float mo17057a(C4898i iVar) {
        int c = mo17141c(iVar);
        if (c != -1) {
            return this.f8507f[c];
        }
        return 0.0f;
    }

    /* renamed from: a */
    private void m8367a(C4898i iVar, int i) {
        int[] iArr;
        int i2 = iVar.f8481c % this.f8503b;
        int[] iArr2 = this.f8504c;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f8505d;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f8505d[i] = -1;
    }

    /* renamed from: c */
    private int m8369c() {
        for (int i = 0; i < this.f8502a; i++) {
            if (this.f8506e[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private void m8371d(C4898i iVar) {
        int i = iVar.f8481c;
        int i2 = i % this.f8503b;
        int[] iArr = this.f8504c;
        int i3 = iArr[i2];
        if (i3 != -1) {
            if (this.f8506e[i3] == i) {
                int[] iArr2 = this.f8505d;
                iArr[i2] = iArr2[i3];
                iArr2[i3] = -1;
                return;
            }
            while (true) {
                int[] iArr3 = this.f8505d;
                if (iArr3[i3] == -1 || this.f8506e[iArr3[i3]] == i) {
                    int[] iArr4 = this.f8505d;
                    int i4 = iArr4[i3];
                } else {
                    i3 = iArr3[i3];
                }
            }
            int[] iArr42 = this.f8505d;
            int i42 = iArr42[i3];
            if (i42 != -1 && this.f8506e[i42] == i) {
                iArr42[i3] = iArr42[i42];
                iArr42[i42] = -1;
            }
        }
    }

    /* renamed from: a */
    private void m8366a(int i, C4898i iVar, float f) {
        this.f8506e[i] = iVar.f8481c;
        this.f8507f[i] = f;
        this.f8508g[i] = -1;
        this.f8509h[i] = -1;
        iVar.mo17135a(this.f8512k);
        iVar.f8491m++;
        this.f8510i++;
    }

    /* renamed from: b */
    public void mo17065b() {
        int i = this.f8510i;
        int i2 = this.f8511j;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f8507f;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f8509h[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo17062a(C4898i iVar, float f) {
        float f2 = f8501m;
        if (f <= (-f2) || f >= f2) {
            if (this.f8510i == 0) {
                m8366a(0, iVar, f);
                m8367a(iVar, 0);
                this.f8511j = 0;
                return;
            }
            int c = mo17141c(iVar);
            if (c != -1) {
                this.f8507f[c] = f;
                return;
            }
            if (this.f8510i + 1 >= this.f8502a) {
                m8370d();
            }
            int i = this.f8510i;
            int i2 = this.f8511j;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int[] iArr = this.f8506e;
                int i5 = iArr[i2];
                int i6 = iVar.f8481c;
                if (i5 == i6) {
                    this.f8507f[i2] = f;
                    return;
                }
                if (iArr[i2] < i6) {
                    i3 = i2;
                }
                i2 = this.f8509h[i2];
                if (i2 == -1) {
                    break;
                }
            }
            m8368b(i3, iVar, f);
            return;
        }
        mo17058a(iVar, true);
    }

    /* renamed from: a */
    public float mo17058a(C4898i iVar, boolean z) {
        int c = mo17141c(iVar);
        if (c == -1) {
            return 0.0f;
        }
        m8371d(iVar);
        float f = this.f8507f[c];
        if (this.f8511j == c) {
            this.f8511j = this.f8509h[c];
        }
        this.f8506e[c] = -1;
        int[] iArr = this.f8508g;
        if (iArr[c] != -1) {
            int[] iArr2 = this.f8509h;
            iArr2[iArr[c]] = iArr2[c];
        }
        int[] iArr3 = this.f8509h;
        if (iArr3[c] != -1) {
            int[] iArr4 = this.f8508g;
            iArr4[iArr3[c]] = iArr4[c];
        }
        this.f8510i--;
        iVar.f8491m--;
        if (z) {
            iVar.mo17139b(this.f8512k);
        }
        return f;
    }

    /* renamed from: a */
    public void mo17063a(C4898i iVar, float f, boolean z) {
        float f2 = f8501m;
        if (f <= (-f2) || f >= f2) {
            int c = mo17141c(iVar);
            if (c == -1) {
                mo17062a(iVar, f);
                return;
            }
            float[] fArr = this.f8507f;
            fArr[c] = fArr[c] + f;
            float f3 = fArr[c];
            float f4 = f8501m;
            if (f3 > (-f4) && fArr[c] < f4) {
                fArr[c] = 0.0f;
                mo17058a(iVar, z);
            }
        }
    }

    /* renamed from: a */
    public float mo17056a(C4886b bVar, boolean z) {
        float a = mo17057a(bVar.f8406a);
        mo17058a(bVar.f8406a, z);
        C4900j jVar = (C4900j) bVar.f8410e;
        int a2 = jVar.mo17059a();
        int i = jVar.f8511j;
        int i2 = 0;
        int i3 = 0;
        while (i2 < a2) {
            int[] iArr = jVar.f8506e;
            if (iArr[i3] != -1) {
                mo17063a(this.f8513l.f8415d[iArr[i3]], jVar.f8507f[i3] * a, z);
                i2++;
            }
            i3++;
        }
        return a;
    }

    /* renamed from: a */
    public void mo17061a(float f) {
        int i = this.f8510i;
        int i2 = this.f8511j;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f8507f;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f8509h[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }
}
