package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

final class k10 {

    /* renamed from: a */
    private final int f15784a;

    /* renamed from: b */
    private final int f15785b;

    /* renamed from: c */
    private final int f15786c;

    /* renamed from: d */
    private final int f15787d;

    /* renamed from: e */
    private final int f15788e;

    /* renamed from: f */
    private final short[] f15789f;

    /* renamed from: g */
    private int f15790g;

    /* renamed from: h */
    private short[] f15791h;

    /* renamed from: i */
    private int f15792i;

    /* renamed from: j */
    private short[] f15793j;

    /* renamed from: k */
    private int f15794k;

    /* renamed from: l */
    private short[] f15795l;

    /* renamed from: m */
    private int f15796m = 0;

    /* renamed from: n */
    private int f15797n = 0;

    /* renamed from: o */
    private float f15798o = 1.0f;

    /* renamed from: p */
    private float f15799p = 1.0f;

    /* renamed from: q */
    private int f15800q;

    /* renamed from: r */
    private int f15801r;

    /* renamed from: s */
    private int f15802s;

    /* renamed from: t */
    private int f15803t;

    /* renamed from: u */
    private int f15804u = 0;

    /* renamed from: v */
    private int f15805v;

    /* renamed from: w */
    private int f15806w;

    /* renamed from: x */
    private int f15807x;

    public k10(int i, int i2) {
        this.f15784a = i;
        this.f15785b = i2;
        this.f15786c = i / 400;
        int i3 = i / 65;
        this.f15787d = i3;
        int i4 = i3 * 2;
        this.f15788e = i4;
        this.f15789f = new short[i4];
        this.f15790g = i4;
        this.f15791h = new short[(i4 * i2)];
        this.f15792i = i4;
        this.f15793j = new short[(i4 * i2)];
        this.f15794k = i4;
        this.f15795l = new short[(i4 * i2)];
    }

    /* renamed from: c */
    private final void m17377c() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f15801r;
        float f = this.f15798o / this.f15799p;
        double d = (double) f;
        int i8 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i9 = this.f15800q;
            if (i9 >= this.f15788e) {
                int i10 = 0;
                while (true) {
                    int i11 = this.f15803t;
                    if (i11 > 0) {
                        int min = Math.min(this.f15788e, i11);
                        m17374a(this.f15791h, i10, min);
                        this.f15803t -= min;
                        i10 += min;
                    } else {
                        short[] sArr = this.f15791h;
                        int i12 = this.f15784a;
                        int i13 = i12 > 4000 ? i12 / 4000 : 1;
                        if (this.f15785b == i8 && i13 == i8) {
                            i4 = m17371a(sArr, i10, this.f15786c, this.f15787d);
                        } else {
                            m17376b(sArr, i10, i13);
                            int a = m17371a(this.f15789f, 0, this.f15786c / i13, this.f15787d / i13);
                            if (i13 != i8) {
                                int i14 = a * i13;
                                int i15 = i13 << 2;
                                int i16 = i14 - i15;
                                int i17 = i14 + i15;
                                int i18 = this.f15786c;
                                if (i16 < i18) {
                                    i16 = i18;
                                }
                                int i19 = this.f15787d;
                                if (i17 > i19) {
                                    i17 = i19;
                                }
                                if (this.f15785b == i8) {
                                    i4 = m17371a(sArr, i10, i16, i17);
                                } else {
                                    m17376b(sArr, i10, i8);
                                    i4 = m17371a(this.f15789f, 0, i16, i17);
                                }
                            } else {
                                i4 = a;
                            }
                        }
                        int i20 = this.f15806w;
                        int i21 = i20 != 0 && this.f15804u != 0 && this.f15807x <= i20 * 3 && (i20 << 1) > this.f15805v * 3 ? this.f15804u : i4;
                        this.f15805v = this.f15806w;
                        this.f15804u = i4;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f15791h;
                            if (f >= 2.0f) {
                                i6 = (int) (((float) i21) / (f - 1.0f));
                            } else {
                                this.f15803t = (int) ((((float) i21) * (2.0f - f)) / (f - 1.0f));
                                i6 = i21;
                            }
                            m17372a(i6);
                            int i22 = i6;
                            m17373a(i6, this.f15785b, this.f15793j, this.f15801r, sArr2, i10, sArr2, i10 + i21);
                            this.f15801r += i22;
                            i10 += i21 + i22;
                        } else {
                            int i23 = i21;
                            short[] sArr3 = this.f15791h;
                            if (f < 0.5f) {
                                i5 = (int) ((((float) i23) * f) / (1.0f - f));
                            } else {
                                this.f15803t = (int) ((((float) i23) * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i5 = i23;
                            }
                            int i24 = i23 + i5;
                            m17372a(i24);
                            int i25 = this.f15785b;
                            System.arraycopy(sArr3, i10 * i25, this.f15793j, this.f15801r * i25, i25 * i23);
                            m17373a(i5, this.f15785b, this.f15793j, this.f15801r + i23, sArr3, i23 + i10, sArr3, i10);
                            this.f15801r += i24;
                            i10 += i5;
                        }
                    }
                    if (this.f15788e + i10 > i9) {
                        break;
                    }
                    i8 = 1;
                }
                int i26 = this.f15800q - i10;
                short[] sArr4 = this.f15791h;
                int i27 = this.f15785b;
                System.arraycopy(sArr4, i10 * i27, sArr4, 0, i27 * i26);
                this.f15800q = i26;
            }
        } else {
            m17374a(this.f15791h, 0, this.f15800q);
            this.f15800q = 0;
        }
        float f2 = this.f15799p;
        if (f2 != 1.0f && this.f15801r != i7) {
            int i28 = this.f15784a;
            int i29 = (int) (((float) i28) / f2);
            while (true) {
                if (i29 <= 16384 && i28 <= 16384) {
                    break;
                }
                i29 /= 2;
                i28 /= 2;
            }
            int i30 = this.f15801r - i7;
            int i31 = this.f15802s + i30;
            int i32 = this.f15794k;
            if (i31 > i32) {
                int i33 = i32 + (i32 / 2) + i30;
                this.f15794k = i33;
                this.f15795l = Arrays.copyOf(this.f15795l, i33 * this.f15785b);
            }
            short[] sArr5 = this.f15793j;
            int i34 = this.f15785b;
            System.arraycopy(sArr5, i7 * i34, this.f15795l, this.f15802s * i34, i34 * i30);
            this.f15801r = i7;
            this.f15802s += i30;
            int i35 = 0;
            while (true) {
                i = this.f15802s;
                if (i35 >= i - 1) {
                    break;
                }
                while (true) {
                    i2 = this.f15796m;
                    int i36 = (i2 + 1) * i29;
                    i3 = this.f15797n;
                    if (i36 <= i3 * i28) {
                        break;
                    }
                    m17372a(1);
                    int i37 = 0;
                    while (true) {
                        int i38 = this.f15785b;
                        if (i37 >= i38) {
                            break;
                        }
                        short[] sArr6 = this.f15795l;
                        int i39 = (i35 * i38) + i37;
                        short s = sArr6[i39];
                        short s2 = sArr6[i39 + i38];
                        int i40 = this.f15796m;
                        int i41 = i40 * i29;
                        int i42 = (i40 + 1) * i29;
                        int i43 = i42 - (this.f15797n * i28);
                        int i44 = i42 - i41;
                        this.f15793j[(this.f15801r * i38) + i37] = (short) (((s * i43) + ((i44 - i43) * s2)) / i44);
                        i37++;
                    }
                    this.f15797n++;
                    this.f15801r++;
                }
                int i45 = i2 + 1;
                this.f15796m = i45;
                if (i45 == i28) {
                    this.f15796m = 0;
                    zzsk.m25218b(i3 == i29);
                    this.f15797n = 0;
                }
                i35++;
            }
            int i46 = i - 1;
            if (i46 != 0) {
                short[] sArr7 = this.f15795l;
                int i47 = this.f15785b;
                System.arraycopy(sArr7, i46 * i47, sArr7, 0, (i - i46) * i47);
                this.f15802s -= i46;
            }
        }
    }

    /* renamed from: a */
    public final void mo26154a(float f) {
        this.f15798o = f;
    }

    /* renamed from: b */
    public final void mo26157b(float f) {
        this.f15799p = f;
    }

    /* renamed from: a */
    public final void mo26155a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f15785b;
        int i2 = remaining / i;
        m17375b(i2);
        shortBuffer.get(this.f15791h, this.f15800q * this.f15785b, ((i * i2) << 1) / 2);
        this.f15800q += i2;
        m17377c();
    }

    /* renamed from: b */
    public final void mo26158b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f15785b, this.f15801r);
        shortBuffer.put(this.f15793j, 0, this.f15785b * min);
        int i = this.f15801r - min;
        this.f15801r = i;
        short[] sArr = this.f15793j;
        int i2 = this.f15785b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: b */
    public final int mo26156b() {
        return this.f15801r;
    }

    /* renamed from: b */
    private final void m17375b(int i) {
        int i2 = this.f15800q + i;
        int i3 = this.f15790g;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f15790g = i4;
            this.f15791h = Arrays.copyOf(this.f15791h, i4 * this.f15785b);
        }
    }

    /* renamed from: a */
    public final void mo26153a() {
        int i;
        int i2 = this.f15800q;
        float f = this.f15798o;
        float f2 = this.f15799p;
        int i3 = this.f15801r + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f15802s)) / f2) + 0.5f));
        m17375b((this.f15788e * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f15788e;
            int i5 = this.f15785b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f15791h[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f15800q += i * 2;
        m17377c();
        if (this.f15801r > i3) {
            this.f15801r = i3;
        }
        this.f15800q = 0;
        this.f15803t = 0;
        this.f15802s = 0;
    }

    /* renamed from: b */
    private final void m17376b(short[] sArr, int i, int i2) {
        int i3 = this.f15788e / i2;
        int i4 = this.f15785b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f15789f[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: a */
    private final void m17372a(int i) {
        int i2 = this.f15801r + i;
        int i3 = this.f15792i;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f15792i = i4;
            this.f15793j = Arrays.copyOf(this.f15793j, i4 * this.f15785b);
        }
    }

    /* renamed from: a */
    private final void m17374a(short[] sArr, int i, int i2) {
        m17372a(i2);
        int i3 = this.f15785b;
        System.arraycopy(sArr, i * i3, this.f15793j, this.f15801r * i3, i3 * i2);
        this.f15801r += i2;
    }

    /* renamed from: a */
    private final int m17371a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f15785b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f15806w = i5 / i7;
        this.f15807x = i8 / i6;
        return i7;
    }

    /* renamed from: a */
    private static void m17373a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
