package p050l.p067f.p071b;

import java.util.Arrays;
import p050l.p067f.p071b.C4886b;

/* renamed from: l.f.b.a */
/* compiled from: ArrayLinkedVariables */
public class C4885a implements C4886b.C4887a {

    /* renamed from: l */
    private static float f8394l = 0.001f;

    /* renamed from: a */
    int f8395a = 0;

    /* renamed from: b */
    private final C4886b f8396b;

    /* renamed from: c */
    protected final C4888c f8397c;

    /* renamed from: d */
    private int f8398d = 8;

    /* renamed from: e */
    private C4898i f8399e = null;

    /* renamed from: f */
    private int[] f8400f = new int[8];

    /* renamed from: g */
    private int[] f8401g = new int[8];

    /* renamed from: h */
    private float[] f8402h = new float[8];

    /* renamed from: i */
    private int f8403i = -1;

    /* renamed from: j */
    private int f8404j = -1;

    /* renamed from: k */
    private boolean f8405k = false;

    C4885a(C4886b bVar, C4888c cVar) {
        this.f8396b = bVar;
        this.f8397c = cVar;
    }

    /* renamed from: a */
    public final void mo17062a(C4898i iVar, float f) {
        if (f == 0.0f) {
            mo17058a(iVar, true);
            return;
        }
        int i = this.f8403i;
        if (i == -1) {
            this.f8403i = 0;
            this.f8402h[0] = f;
            this.f8400f[0] = iVar.f8481c;
            this.f8401g[0] = -1;
            iVar.f8491m++;
            iVar.mo17135a(this.f8396b);
            this.f8395a++;
            if (!this.f8405k) {
                int i2 = this.f8404j + 1;
                this.f8404j = i2;
                int[] iArr = this.f8400f;
                if (i2 >= iArr.length) {
                    this.f8405k = true;
                    this.f8404j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f8395a) {
            int[] iArr2 = this.f8400f;
            int i5 = iArr2[i];
            int i6 = iVar.f8481c;
            if (i5 == i6) {
                this.f8402h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f8401g[i];
            i3++;
        }
        int i7 = this.f8404j;
        int i8 = i7 + 1;
        if (this.f8405k) {
            int[] iArr3 = this.f8400f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f8400f;
        if (i7 >= iArr4.length && this.f8395a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f8400f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f8400f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f8398d * 2;
            this.f8398d = i10;
            this.f8405k = false;
            this.f8404j = i7 - 1;
            this.f8402h = Arrays.copyOf(this.f8402h, i10);
            this.f8400f = Arrays.copyOf(this.f8400f, this.f8398d);
            this.f8401g = Arrays.copyOf(this.f8401g, this.f8398d);
        }
        this.f8400f[i7] = iVar.f8481c;
        this.f8402h[i7] = f;
        if (i4 != -1) {
            int[] iArr7 = this.f8401g;
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            this.f8401g[i7] = this.f8403i;
            this.f8403i = i7;
        }
        iVar.f8491m++;
        iVar.mo17135a(this.f8396b);
        this.f8395a++;
        if (!this.f8405k) {
            this.f8404j++;
        }
        if (this.f8395a >= this.f8400f.length) {
            this.f8405k = true;
        }
        int i11 = this.f8404j;
        int[] iArr8 = this.f8400f;
        if (i11 >= iArr8.length) {
            this.f8405k = true;
            this.f8404j = iArr8.length - 1;
        }
    }

    /* renamed from: b */
    public boolean mo17066b(C4898i iVar) {
        int i = this.f8403i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f8395a) {
            if (this.f8400f[i] == iVar.f8481c) {
                return true;
            }
            i = this.f8401g[i];
            i2++;
        }
        return false;
    }

    public final void clear() {
        int i = this.f8403i;
        int i2 = 0;
        while (i != -1 && i2 < this.f8395a) {
            C4898i iVar = this.f8397c.f8415d[this.f8400f[i]];
            if (iVar != null) {
                iVar.mo17139b(this.f8396b);
            }
            i = this.f8401g[i];
            i2++;
        }
        this.f8403i = -1;
        this.f8404j = -1;
        this.f8405k = false;
        this.f8395a = 0;
    }

    public String toString() {
        int i = this.f8403i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f8395a) {
            str = ((str + " -> ") + this.f8402h[i] + " : ") + this.f8397c.f8415d[this.f8400f[i]];
            i = this.f8401g[i];
            i2++;
        }
        return str;
    }

    /* renamed from: b */
    public void mo17065b() {
        int i = this.f8403i;
        int i2 = 0;
        while (i != -1 && i2 < this.f8395a) {
            float[] fArr = this.f8402h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f8401g[i];
            i2++;
        }
    }

    /* renamed from: b */
    public float mo17064b(int i) {
        int i2 = this.f8403i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f8395a) {
            if (i3 == i) {
                return this.f8402h[i2];
            }
            i2 = this.f8401g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public void mo17063a(C4898i iVar, float f, boolean z) {
        float f2 = f8394l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f8403i;
            if (i == -1) {
                this.f8403i = 0;
                this.f8402h[0] = f;
                this.f8400f[0] = iVar.f8481c;
                this.f8401g[0] = -1;
                iVar.f8491m++;
                iVar.mo17135a(this.f8396b);
                this.f8395a++;
                if (!this.f8405k) {
                    int i2 = this.f8404j + 1;
                    this.f8404j = i2;
                    int[] iArr = this.f8400f;
                    if (i2 >= iArr.length) {
                        this.f8405k = true;
                        this.f8404j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f8395a) {
                int[] iArr2 = this.f8400f;
                int i5 = iArr2[i];
                int i6 = iVar.f8481c;
                if (i5 == i6) {
                    float f3 = this.f8402h[i] + f;
                    float f4 = f8394l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    this.f8402h[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f8403i) {
                            this.f8403i = this.f8401g[i];
                        } else {
                            int[] iArr3 = this.f8401g;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo17139b(this.f8396b);
                        }
                        if (this.f8405k) {
                            this.f8404j = i;
                        }
                        iVar.f8491m--;
                        this.f8395a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f8401g[i];
                i3++;
            }
            int i7 = this.f8404j;
            int i8 = i7 + 1;
            if (this.f8405k) {
                int[] iArr4 = this.f8400f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f8400f;
            if (i7 >= iArr5.length && this.f8395a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f8400f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f8400f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f8398d * 2;
                this.f8398d = i10;
                this.f8405k = false;
                this.f8404j = i7 - 1;
                this.f8402h = Arrays.copyOf(this.f8402h, i10);
                this.f8400f = Arrays.copyOf(this.f8400f, this.f8398d);
                this.f8401g = Arrays.copyOf(this.f8401g, this.f8398d);
            }
            this.f8400f[i7] = iVar.f8481c;
            this.f8402h[i7] = f;
            if (i4 != -1) {
                int[] iArr8 = this.f8401g;
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                this.f8401g[i7] = this.f8403i;
                this.f8403i = i7;
            }
            iVar.f8491m++;
            iVar.mo17135a(this.f8396b);
            this.f8395a++;
            if (!this.f8405k) {
                this.f8404j++;
            }
            int i11 = this.f8404j;
            int[] iArr9 = this.f8400f;
            if (i11 >= iArr9.length) {
                this.f8405k = true;
                this.f8404j = iArr9.length - 1;
            }
        }
    }

    /* renamed from: a */
    public float mo17056a(C4886b bVar, boolean z) {
        float a = mo17057a(bVar.f8406a);
        mo17058a(bVar.f8406a, z);
        C4886b.C4887a aVar = bVar.f8410e;
        int a2 = aVar.mo17059a();
        for (int i = 0; i < a2; i++) {
            C4898i a3 = aVar.mo17060a(i);
            mo17063a(a3, aVar.mo17057a(a3) * a, z);
        }
        return a;
    }

    /* renamed from: a */
    public final float mo17058a(C4898i iVar, boolean z) {
        if (this.f8399e == iVar) {
            this.f8399e = null;
        }
        int i = this.f8403i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f8395a) {
            if (this.f8400f[i] == iVar.f8481c) {
                if (i == this.f8403i) {
                    this.f8403i = this.f8401g[i];
                } else {
                    int[] iArr = this.f8401g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo17139b(this.f8396b);
                }
                iVar.f8491m--;
                this.f8395a--;
                this.f8400f[i] = -1;
                if (this.f8405k) {
                    this.f8404j = i;
                }
                return this.f8402h[i];
            }
            i2++;
            i3 = i;
            i = this.f8401g[i];
        }
        return 0.0f;
    }

    /* renamed from: a */
    public void mo17061a(float f) {
        int i = this.f8403i;
        int i2 = 0;
        while (i != -1 && i2 < this.f8395a) {
            float[] fArr = this.f8402h;
            fArr[i] = fArr[i] / f;
            i = this.f8401g[i];
            i2++;
        }
    }

    /* renamed from: a */
    public int mo17059a() {
        return this.f8395a;
    }

    /* renamed from: a */
    public C4898i mo17060a(int i) {
        int i2 = this.f8403i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f8395a) {
            if (i3 == i) {
                return this.f8397c.f8415d[this.f8400f[i2]];
            }
            i2 = this.f8401g[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: a */
    public final float mo17057a(C4898i iVar) {
        int i = this.f8403i;
        int i2 = 0;
        while (i != -1 && i2 < this.f8395a) {
            if (this.f8400f[i] == iVar.f8481c) {
                return this.f8402h[i];
            }
            i = this.f8401g[i];
            i2++;
        }
        return 0.0f;
    }
}
