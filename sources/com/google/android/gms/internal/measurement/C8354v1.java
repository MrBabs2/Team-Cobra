package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.v1 */
final class C8354v1<T> implements C8273d2<T> {

    /* renamed from: m */
    private static final int[] f23351m = new int[0];

    /* renamed from: n */
    private static final Unsafe f23352n = C8367y2.m26313d();

    /* renamed from: a */
    private final int[] f23353a;

    /* renamed from: b */
    private final Object[] f23354b;

    /* renamed from: c */
    private final boolean f23355c;

    /* renamed from: d */
    private final boolean f23356d;

    /* renamed from: e */
    private final boolean f23357e;

    /* renamed from: f */
    private final int[] f23358f;

    /* renamed from: g */
    private final int f23359g;

    /* renamed from: h */
    private final int f23360h;

    /* renamed from: i */
    private final C8287g1 f23361i;

    /* renamed from: j */
    private final C8351u2<?, ?> f23362j;

    /* renamed from: k */
    private final C8349u0<?> f23363k;

    /* renamed from: l */
    private final C8330p1 f23364l;

    private C8354v1(int[] iArr, Object[] objArr, int i, int i2, zzvv zzvv, boolean z, boolean z2, int[] iArr2, int i3, int i4, C8362x1 x1Var, C8287g1 g1Var, C8351u2<?, ?> u2Var, C8349u0<?> u0Var, C8330p1 p1Var) {
        this.f23353a = iArr;
        this.f23354b = objArr;
        boolean z3 = zzvv instanceof zzuo;
        this.f23356d = z;
        this.f23355c = u0Var != null && u0Var.mo30236a(zzvv);
        this.f23357e = false;
        this.f23358f = iArr2;
        this.f23359g = i3;
        this.f23360h = i4;
        this.f23361i = g1Var;
        this.f23362j = u2Var;
        this.f23363k = u0Var;
        this.f23364l = p1Var;
    }

    /* renamed from: a */
    static <T> C8354v1<T> m26214a(Class<T> cls, C8342s1 s1Var, C8362x1 x1Var, C8287g1 g1Var, C8351u2<?, ?> u2Var, C8349u0<?> u0Var, C8330p1 p1Var) {
        int i;
        char c;
        int[] iArr;
        char c2;
        int i2;
        char c3;
        char c4;
        char c5;
        char c6;
        int i3;
        boolean z;
        int i4;
        C8268c2 c2Var;
        int i5;
        Class<?> cls2;
        int i6;
        String str;
        int i7;
        int i8;
        char c7;
        char c8;
        Field field;
        int i9;
        char charAt;
        int i10;
        Field field2;
        Field field3;
        int i11;
        char charAt2;
        int i12;
        char charAt3;
        int i13;
        char charAt4;
        int i14;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        char charAt10;
        int i21;
        char charAt11;
        int i22;
        char charAt12;
        int i23;
        char charAt13;
        char charAt14;
        C8342s1 s1Var2 = s1Var;
        if (s1Var2 instanceof C8268c2) {
            C8268c2 c2Var2 = (C8268c2) s1Var2;
            char c9 = 0;
            boolean z2 = c2Var2.mo30085g() == zzuo.zze.f23506h;
            String a = c2Var2.mo30081a();
            int length = a.length();
            char charAt15 = a.charAt(0);
            if (charAt15 >= 55296) {
                char c10 = charAt15 & 8191;
                int i24 = 1;
                int i25 = 13;
                while (true) {
                    i = i24 + 1;
                    charAt14 = a.charAt(i24);
                    if (charAt14 < 55296) {
                        break;
                    }
                    c10 |= (charAt14 & 8191) << i25;
                    i25 += 13;
                    i24 = i;
                }
                charAt15 = c10 | (charAt14 << i25);
            } else {
                i = 1;
            }
            int i26 = i + 1;
            char charAt16 = a.charAt(i);
            if (charAt16 >= 55296) {
                char c11 = charAt16 & 8191;
                int i27 = 13;
                while (true) {
                    i23 = i26 + 1;
                    charAt13 = a.charAt(i26);
                    if (charAt13 < 55296) {
                        break;
                    }
                    c11 |= (charAt13 & 8191) << i27;
                    i27 += 13;
                    i26 = i23;
                }
                charAt16 = c11 | (charAt13 << i27);
                i26 = i23;
            }
            if (charAt16 == 0) {
                iArr = f23351m;
                c5 = 0;
                c4 = 0;
                c3 = 0;
                i2 = 0;
                c2 = 0;
                c = 0;
            } else {
                int i28 = i26 + 1;
                char charAt17 = a.charAt(i26);
                if (charAt17 >= 55296) {
                    char c12 = charAt17 & 8191;
                    int i29 = 13;
                    while (true) {
                        i22 = i28 + 1;
                        charAt12 = a.charAt(i28);
                        if (charAt12 < 55296) {
                            break;
                        }
                        c12 |= (charAt12 & 8191) << i29;
                        i29 += 13;
                        i28 = i22;
                    }
                    charAt17 = c12 | (charAt12 << i29);
                    i28 = i22;
                }
                int i30 = i28 + 1;
                char charAt18 = a.charAt(i28);
                if (charAt18 >= 55296) {
                    char c13 = charAt18 & 8191;
                    int i31 = 13;
                    while (true) {
                        i21 = i30 + 1;
                        charAt11 = a.charAt(i30);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c13 |= (charAt11 & 8191) << i31;
                        i31 += 13;
                        i30 = i21;
                    }
                    charAt18 = c13 | (charAt11 << i31);
                    i30 = i21;
                }
                int i32 = i30 + 1;
                c3 = a.charAt(i30);
                if (c3 >= 55296) {
                    char c14 = c3 & 8191;
                    int i33 = 13;
                    while (true) {
                        i20 = i32 + 1;
                        charAt10 = a.charAt(i32);
                        if (charAt10 < 55296) {
                            break;
                        }
                        c14 |= (charAt10 & 8191) << i33;
                        i33 += 13;
                        i32 = i20;
                    }
                    c3 = c14 | (charAt10 << i33);
                    i32 = i20;
                }
                int i34 = i32 + 1;
                char charAt19 = a.charAt(i32);
                if (charAt19 >= 55296) {
                    char c15 = charAt19 & 8191;
                    int i35 = 13;
                    while (true) {
                        i19 = i34 + 1;
                        charAt9 = a.charAt(i34);
                        if (charAt9 < 55296) {
                            break;
                        }
                        c15 |= (charAt9 & 8191) << i35;
                        i35 += 13;
                        i34 = i19;
                    }
                    charAt19 = c15 | (charAt9 << i35);
                    i34 = i19;
                }
                int i36 = i34 + 1;
                c2 = a.charAt(i34);
                if (c2 >= 55296) {
                    char c16 = c2 & 8191;
                    int i37 = 13;
                    while (true) {
                        i18 = i36 + 1;
                        charAt8 = a.charAt(i36);
                        if (charAt8 < 55296) {
                            break;
                        }
                        c16 |= (charAt8 & 8191) << i37;
                        i37 += 13;
                        i36 = i18;
                    }
                    c2 = c16 | (charAt8 << i37);
                    i36 = i18;
                }
                int i38 = i36 + 1;
                char charAt20 = a.charAt(i36);
                if (charAt20 >= 55296) {
                    char c17 = charAt20 & 8191;
                    int i39 = 13;
                    while (true) {
                        i17 = i38 + 1;
                        charAt7 = a.charAt(i38);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c17 |= (charAt7 & 8191) << i39;
                        i39 += 13;
                        i38 = i17;
                    }
                    charAt20 = c17 | (charAt7 << i39);
                    i38 = i17;
                }
                int i40 = i38 + 1;
                char charAt21 = a.charAt(i38);
                if (charAt21 >= 55296) {
                    char c18 = charAt21 & 8191;
                    int i41 = i40;
                    int i42 = 13;
                    while (true) {
                        i16 = i41 + 1;
                        charAt6 = a.charAt(i41);
                        if (charAt6 < 55296) {
                            break;
                        }
                        c18 |= (charAt6 & 8191) << i42;
                        i42 += 13;
                        i41 = i16;
                    }
                    charAt21 = c18 | (charAt6 << i42);
                    i14 = i16;
                } else {
                    i14 = i40;
                }
                int i43 = i14 + 1;
                char charAt22 = a.charAt(i14);
                if (charAt22 >= 55296) {
                    char c19 = charAt22 & 8191;
                    int i44 = i43;
                    int i45 = 13;
                    while (true) {
                        i15 = i44 + 1;
                        charAt5 = a.charAt(i44);
                        if (charAt5 < 55296) {
                            break;
                        }
                        c19 |= (charAt5 & 8191) << i45;
                        i45 += 13;
                        i44 = i15;
                    }
                    charAt22 = c19 | (charAt5 << i45);
                    i43 = i15;
                }
                int i46 = (charAt17 << 1) + charAt18;
                c4 = charAt19;
                i2 = i46;
                c = charAt22;
                c9 = charAt17;
                i26 = i43;
                char c20 = charAt20;
                iArr = new int[(charAt22 + charAt20 + charAt21)];
                c5 = c20;
            }
            Unsafe unsafe = f23352n;
            Object[] b = c2Var2.mo30082b();
            Class<?> cls3 = c2Var2.mo30083e().getClass();
            int i47 = i26;
            int[] iArr2 = new int[(c2 * 3)];
            Object[] objArr = new Object[(c2 << 1)];
            int i48 = c + c5;
            char c21 = c;
            int i49 = i47;
            int i50 = i48;
            int i51 = 0;
            int i52 = 0;
            while (i49 < length) {
                int i53 = i49 + 1;
                int charAt23 = a.charAt(i49);
                int i54 = length;
                if (charAt23 >= 55296) {
                    int i55 = charAt23 & 8191;
                    int i56 = i53;
                    int i57 = 13;
                    while (true) {
                        i13 = i56 + 1;
                        charAt4 = a.charAt(i56);
                        c6 = c;
                        if (charAt4 < 55296) {
                            break;
                        }
                        i55 |= (charAt4 & 8191) << i57;
                        i57 += 13;
                        i56 = i13;
                        c = c6;
                    }
                    charAt23 = i55 | (charAt4 << i57);
                    i3 = i13;
                } else {
                    c6 = c;
                    i3 = i53;
                }
                int i58 = i3 + 1;
                char charAt24 = a.charAt(i3);
                int i59 = i58;
                if (charAt24 >= 55296) {
                    char c22 = charAt24 & 8191;
                    int i60 = i59;
                    int i61 = 13;
                    while (true) {
                        i12 = i60 + 1;
                        charAt3 = a.charAt(i60);
                        z = z2;
                        if (charAt3 < 55296) {
                            break;
                        }
                        c22 |= (charAt3 & 8191) << i61;
                        i61 += 13;
                        i60 = i12;
                        z2 = z;
                    }
                    charAt24 = c22 | (charAt3 << i61);
                    i4 = i12;
                } else {
                    z = z2;
                    i4 = i59;
                }
                char c23 = charAt24 & 255;
                char c24 = c4;
                if ((charAt24 & 1024) != 0) {
                    iArr[i51] = i52;
                    i51++;
                }
                char c25 = c3;
                if (c23 >= '3') {
                    int i62 = i4 + 1;
                    char charAt25 = a.charAt(i4);
                    char c26 = 55296;
                    if (charAt25 >= 55296) {
                        char c27 = charAt25 & 8191;
                        int i63 = 13;
                        while (true) {
                            i11 = i62 + 1;
                            charAt2 = a.charAt(i62);
                            if (charAt2 < c26) {
                                break;
                            }
                            c27 |= (charAt2 & 8191) << i63;
                            i63 += 13;
                            i62 = i11;
                            c26 = 55296;
                        }
                        charAt25 = c27 | (charAt2 << i63);
                        i62 = i11;
                    }
                    int i64 = c23 - '3';
                    int i65 = i62;
                    if (i64 == 9 || i64 == 17) {
                        objArr[((i52 / 3) << 1) + 1] = b[i2];
                        i2++;
                    } else if (i64 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i52 / 3) << 1) + 1] = b[i2];
                        i2++;
                    }
                    int i66 = charAt25 << 1;
                    Object obj = b[i66];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = m26215a(cls3, (String) obj);
                        b[i66] = field2;
                    }
                    c2Var = c2Var2;
                    String str2 = a;
                    i8 = (int) unsafe.objectFieldOffset(field2);
                    int i67 = i66 + 1;
                    Object obj2 = b[i67];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = m26215a(cls3, (String) obj2);
                        b[i67] = field3;
                    }
                    cls2 = cls3;
                    i5 = i2;
                    i4 = i65;
                    str = str2;
                    i6 = 0;
                    i7 = (int) unsafe.objectFieldOffset(field3);
                    c7 = c9;
                } else {
                    c2Var = c2Var2;
                    String str3 = a;
                    int i68 = i2 + 1;
                    Field a2 = m26215a(cls3, (String) b[i2]);
                    if (c23 == 9 || c23 == 17) {
                        c8 = 1;
                        objArr[((i52 / 3) << 1) + 1] = a2.getType();
                    } else {
                        if (c23 == 27 || c23 == '1') {
                            c8 = 1;
                            i10 = i68 + 1;
                            objArr[((i52 / 3) << 1) + 1] = b[i68];
                        } else if (c23 == 12 || c23 == 30 || c23 == ',') {
                            c8 = 1;
                            if ((charAt15 & 1) == 1) {
                                i10 = i68 + 1;
                                objArr[((i52 / 3) << 1) + 1] = b[i68];
                            }
                        } else {
                            if (c23 == '2') {
                                int i69 = c21 + 1;
                                iArr[c21] = i52;
                                int i70 = (i52 / 3) << 1;
                                int i71 = i68 + 1;
                                objArr[i70] = b[i68];
                                if ((charAt24 & 2048) != 0) {
                                    i68 = i71 + 1;
                                    objArr[i70 + 1] = b[i71];
                                    c21 = i69;
                                } else {
                                    i68 = i71;
                                    c8 = 1;
                                    c21 = i69;
                                }
                            }
                            c8 = 1;
                        }
                        i68 = i10;
                    }
                    i8 = (int) unsafe.objectFieldOffset(a2);
                    if ((charAt15 & 1) != c8 || c23 > 17) {
                        i5 = i68;
                        c7 = c9;
                        cls2 = cls3;
                        str = str3;
                        i7 = 0;
                        i6 = 0;
                    } else {
                        int i72 = i4 + 1;
                        str = str3;
                        char charAt26 = str.charAt(i4);
                        if (charAt26 >= 55296) {
                            char c28 = charAt26 & 8191;
                            int i73 = 13;
                            while (true) {
                                i9 = i72 + 1;
                                charAt = str.charAt(i72);
                                if (charAt < 55296) {
                                    break;
                                }
                                c28 |= (charAt & 8191) << i73;
                                i73 += 13;
                                i72 = i9;
                            }
                            charAt26 = c28 | (charAt << i73);
                            i72 = i9;
                        }
                        int i74 = (c9 << 1) + (charAt26 / ' ');
                        Object obj3 = b[i74];
                        i5 = i68;
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = m26215a(cls3, (String) obj3);
                            b[i74] = field;
                        }
                        c7 = c9;
                        cls2 = cls3;
                        i7 = (int) unsafe.objectFieldOffset(field);
                        i6 = charAt26 % ' ';
                        i4 = i72;
                    }
                    if (c23 >= 18 && c23 <= '1') {
                        iArr[i50] = i8;
                        i50++;
                    }
                }
                int i75 = i52 + 1;
                iArr2[i52] = charAt23;
                int i76 = i75 + 1;
                iArr2[i75] = i8 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (c23 << 20);
                i52 = i76 + 1;
                iArr2[i76] = (i6 << 20) | i7;
                c9 = c7;
                a = str;
                i49 = i4;
                cls3 = cls2;
                c4 = c24;
                length = i54;
                c = c6;
                z2 = z;
                c3 = c25;
                i2 = i5;
                c2Var2 = c2Var;
            }
            char c29 = c4;
            boolean z3 = z2;
            return new C8354v1(iArr2, objArr, c3, c4, c2Var2.mo30083e(), z2, false, iArr, c, i48, x1Var, g1Var, u2Var, u0Var, p1Var);
        }
        ((C8335q2) s1Var2).mo30085g();
        throw null;
    }

    /* renamed from: e */
    private static <T> long m26236e(T t, long j) {
        return ((Long) C8367y2.m26320f(t, j)).longValue();
    }

    /* renamed from: f */
    private static <T> boolean m26237f(T t, long j) {
        return ((Boolean) C8367y2.m26320f(t, j)).booleanValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.C8283f2.m25947a(com.google.android.gms.internal.measurement.C8367y2.m26320f(r10, r6), com.google.android.gms.internal.measurement.C8367y2.m26320f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.C8367y2.m26303b(r10, r6) == com.google.android.gms.internal.measurement.C8367y2.m26303b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.C8367y2.m26303b(r10, r6) == com.google.android.gms.internal.measurement.C8367y2.m26303b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.C8283f2.m25947a(com.google.android.gms.internal.measurement.C8367y2.m26320f(r10, r6), com.google.android.gms.internal.measurement.C8367y2.m26320f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.C8283f2.m25947a(com.google.android.gms.internal.measurement.C8367y2.m26320f(r10, r6), com.google.android.gms.internal.measurement.C8367y2.m26320f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.C8283f2.m25947a(com.google.android.gms.internal.measurement.C8367y2.m26320f(r10, r6), com.google.android.gms.internal.measurement.C8367y2.m26320f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.C8367y2.m26311c(r10, r6) == com.google.android.gms.internal.measurement.C8367y2.m26311c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.C8367y2.m26303b(r10, r6) == com.google.android.gms.internal.measurement.C8367y2.m26303b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.C8367y2.m26303b(r10, r6) == com.google.android.gms.internal.measurement.C8367y2.m26303b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.C8367y2.m26303b(r10, r6) == com.google.android.gms.internal.measurement.C8367y2.m26303b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C8367y2.m26312d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C8367y2.m26312d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C8367y2.m26317e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C8367y2.m26317e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.C8283f2.m25947a(com.google.android.gms.internal.measurement.C8367y2.m26320f(r10, r6), com.google.android.gms.internal.measurement.C8367y2.m26320f(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo30091b(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f23353a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.m26232c((int) r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.m26234d((int) r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, (long) r4)
            int r4 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, (long) r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C8283f2.m25947a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.C8283f2.m25947a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.C8283f2.m25947a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C8283f2.m25947a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C8283f2.m25947a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C8283f2.m25947a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.C8283f2.m25947a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.measurement.C8367y2.m26311c(r10, r6)
            boolean r5 = com.google.android.gms.internal.measurement.C8367y2.m26311c(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.measurement.C8367y2.m26312d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.measurement.C8367y2.m26312d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.m26233c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.measurement.C8367y2.m26317e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.measurement.C8367y2.m26317e(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.measurement.u2<?, ?> r0 = r9.f23362j
            java.lang.Object r0 = r0.mo30242b(r10)
            com.google.android.gms.internal.measurement.u2<?, ?> r2 = r9.f23362j
            java.lang.Object r2 = r2.mo30242b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f23355c
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.measurement.u0<?> r0 = r9.f23363k
            com.google.android.gms.internal.measurement.x0 r10 = r0.mo30234a((java.lang.Object) r10)
            com.google.android.gms.internal.measurement.u0<?> r0 = r9.f23363k
            com.google.android.gms.internal.measurement.x0 r11 = r0.mo30234a((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C8354v1.mo30091b(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0830, code lost:
        r9 = (r9 + r10) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0909, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0951, code lost:
        r6 = r6 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x09fb, code lost:
        r6 = r6 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0a1d, code lost:
        r5 = r5 + 3;
        r9 = r13;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo30092c(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f23356d
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x04f2
            sun.misc.Unsafe r2 = f23352n
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f23353a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x04ea
            int r14 = r0.m26232c((int) r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f23353a
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.measurement.zzui r14 = com.google.android.gms.internal.measurement.zzui.f23457P
            int r14 = r14.mo30422a()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.measurement.zzui r14 = com.google.android.gms.internal.measurement.zzui.f23470c0
            int r14 = r14.mo30422a()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f23353a
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04ca;
                case 2: goto L_0x04ba;
                case 3: goto L_0x04aa;
                case 4: goto L_0x049a;
                case 5: goto L_0x048e;
                case 6: goto L_0x0482;
                case 7: goto L_0x0476;
                case 8: goto L_0x0458;
                case 9: goto L_0x0444;
                case 10: goto L_0x0433;
                case 11: goto L_0x0424;
                case 12: goto L_0x0415;
                case 13: goto L_0x040a;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03f0;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03cc;
                case 18: goto L_0x03c1;
                case 19: goto L_0x03b8;
                case 20: goto L_0x03af;
                case 21: goto L_0x03a6;
                case 22: goto L_0x039d;
                case 23: goto L_0x0394;
                case 24: goto L_0x038b;
                case 25: goto L_0x0382;
                case 26: goto L_0x0379;
                case 27: goto L_0x036c;
                case 28: goto L_0x0363;
                case 29: goto L_0x035a;
                case 30: goto L_0x0350;
                case 31: goto L_0x0346;
                case 32: goto L_0x033c;
                case 33: goto L_0x0332;
                case 34: goto L_0x0328;
                case 35: goto L_0x0308;
                case 36: goto L_0x02eb;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b1;
                case 39: goto L_0x0293;
                case 40: goto L_0x0275;
                case 41: goto L_0x0257;
                case 42: goto L_0x0239;
                case 43: goto L_0x021b;
                case 44: goto L_0x01fd;
                case 45: goto L_0x01df;
                case 46: goto L_0x01c1;
                case 47: goto L_0x01a3;
                case 48: goto L_0x0185;
                case 49: goto L_0x0177;
                case 50: goto L_0x0167;
                case 51: goto L_0x0159;
                case 52: goto L_0x014d;
                case 53: goto L_0x013d;
                case 54: goto L_0x012d;
                case 55: goto L_0x011d;
                case 56: goto L_0x0111;
                case 57: goto L_0x0105;
                case 58: goto L_0x00f9;
                case 59: goto L_0x00db;
                case 60: goto L_0x00c7;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00a5;
                case 63: goto L_0x0095;
                case 64: goto L_0x0089;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x04e4
        L_0x0047:
            boolean r14 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r1, r5)
            com.google.android.gms.internal.measurement.zzvv r5 = (com.google.android.gms.internal.measurement.zzvv) r5
            com.google.android.gms.internal.measurement.d2 r6 = r0.m26213a((int) r12)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26555c(r3, r5, r6)
            goto L_0x03c9
        L_0x005d:
            boolean r14 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m26236e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26565f((int) r3, (long) r5)
            goto L_0x03c9
        L_0x006d:
            boolean r14 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m26235d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26572h((int) r3, (int) r5)
            goto L_0x03c9
        L_0x007d:
            boolean r5 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zztv.m26573h((int) r3, (long) r9)
            goto L_0x03c9
        L_0x0089:
            boolean r5 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zztv.m26579j(r3, r11)
            goto L_0x03c9
        L_0x0095:
            boolean r14 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m26235d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26581k(r3, r5)
            goto L_0x03c9
        L_0x00a5:
            boolean r14 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m26235d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26568g((int) r3, (int) r5)
            goto L_0x03c9
        L_0x00b5:
            boolean r14 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r1, r5)
            com.google.android.gms.internal.measurement.zzte r5 = (com.google.android.gms.internal.measurement.zzte) r5
            int r3 = com.google.android.gms.internal.measurement.zztv.m26553c((int) r3, (com.google.android.gms.internal.measurement.zzte) r5)
            goto L_0x03c9
        L_0x00c7:
            boolean r14 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r1, r5)
            com.google.android.gms.internal.measurement.d2 r6 = r0.m26213a((int) r12)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25933a((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.measurement.C8273d2) r6)
            goto L_0x03c9
        L_0x00db:
            boolean r14 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzte
            if (r6 == 0) goto L_0x00f1
            com.google.android.gms.internal.measurement.zzte r5 = (com.google.android.gms.internal.measurement.zzte) r5
            int r3 = com.google.android.gms.internal.measurement.zztv.m26553c((int) r3, (com.google.android.gms.internal.measurement.zzte) r5)
            goto L_0x03c9
        L_0x00f1:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.zztv.m26545b((int) r3, (java.lang.String) r5)
            goto L_0x03c9
        L_0x00f9:
            boolean r5 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zztv.m26546b((int) r3, (boolean) r7)
            goto L_0x03c9
        L_0x0105:
            boolean r5 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zztv.m26576i(r3, r11)
            goto L_0x03c9
        L_0x0111:
            boolean r5 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zztv.m26569g((int) r3, (long) r9)
            goto L_0x03c9
        L_0x011d:
            boolean r14 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m26235d(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26564f((int) r3, (int) r5)
            goto L_0x03c9
        L_0x012d:
            boolean r14 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m26236e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26561e((int) r3, (long) r5)
            goto L_0x03c9
        L_0x013d:
            boolean r14 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m26236e(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26557d((int) r3, (long) r5)
            goto L_0x03c9
        L_0x014d:
            boolean r5 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zztv.m26541b((int) r3, (float) r4)
            goto L_0x03c9
        L_0x0159:
            boolean r5 = r0.m26222a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.zztv.m26540b((int) r3, (double) r5)
            goto L_0x03c9
        L_0x0167:
            com.google.android.gms.internal.measurement.p1 r14 = r0.f23364l
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r1, r5)
            java.lang.Object r6 = r0.m26226b((int) r12)
            int r3 = r14.mo30219a(r3, r5, r6)
            goto L_0x03c9
        L_0x0177:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.measurement.d2 r6 = r0.m26213a((int) r12)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25949b((int) r3, (java.util.List<com.google.android.gms.internal.measurement.zzvv>) r5, (com.google.android.gms.internal.measurement.C8273d2) r6)
            goto L_0x03c9
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25937a((java.util.List<java.lang.Long>) r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x0199
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0199:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x01a3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25965e(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x01b7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01b7:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x01c1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25972g(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x01d5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01d5:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x01df:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25969f(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x01f3
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f3:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25951b(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x021b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25961d(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x022f
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x022f:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x0239:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25975h(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x024d
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x024d:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25969f(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x026b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x026b:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25972g(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x0289
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0289:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25957c(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x02a7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02a7:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25981j(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x02c5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02c5:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25978i(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x02e2
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02e2:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25969f(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x02ff
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02ff:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.measurement.C8283f2.m25972g(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f23357e
            if (r6 == 0) goto L_0x031c
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x031c:
            int r3 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r3)
            int r6 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r5)
        L_0x0324:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x03c9
        L_0x0328:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25956c(r3, r5, r11)
            goto L_0x03c9
        L_0x0332:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25971g(r3, r5, r11)
            goto L_0x03c9
        L_0x033c:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25977i(r3, r5, r11)
            goto L_0x03c9
        L_0x0346:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25974h(r3, r5, r11)
            goto L_0x03c9
        L_0x0350:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25960d(r3, r5, r11)
            goto L_0x03c9
        L_0x035a:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25968f(r3, r5, r11)
            goto L_0x03c9
        L_0x0363:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25948b(r3, r5)
            goto L_0x03c9
        L_0x036c:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.measurement.d2 r6 = r0.m26213a((int) r12)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25935a((int) r3, (java.util.List<?>) r5, (com.google.android.gms.internal.measurement.C8273d2) r6)
            goto L_0x03c9
        L_0x0379:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25934a((int) r3, (java.util.List<?>) r5)
            goto L_0x03c9
        L_0x0382:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25980j(r3, r5, r11)
            goto L_0x03c9
        L_0x038b:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25974h(r3, r5, r11)
            goto L_0x03c9
        L_0x0394:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25977i(r3, r5, r11)
            goto L_0x03c9
        L_0x039d:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25964e(r3, r5, r11)
            goto L_0x03c9
        L_0x03a6:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25950b((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x03c9
        L_0x03af:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25936a((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x03c9
        L_0x03b8:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25974h(r3, r5, r11)
            goto L_0x03c9
        L_0x03c1:
            java.util.List r5 = m26216a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25977i(r3, r5, r11)
        L_0x03c9:
            int r13 = r13 + r3
            goto L_0x04e4
        L_0x03cc:
            boolean r14 = r0.m26221a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r1, r5)
            com.google.android.gms.internal.measurement.zzvv r5 = (com.google.android.gms.internal.measurement.zzvv) r5
            com.google.android.gms.internal.measurement.d2 r6 = r0.m26213a((int) r12)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26555c(r3, r5, r6)
            goto L_0x03c9
        L_0x03e1:
            boolean r14 = r0.m26221a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26565f((int) r3, (long) r5)
            goto L_0x03c9
        L_0x03f0:
            boolean r14 = r0.m26221a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26572h((int) r3, (int) r5)
            goto L_0x03c9
        L_0x03ff:
            boolean r5 = r0.m26221a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zztv.m26573h((int) r3, (long) r9)
            goto L_0x03c9
        L_0x040a:
            boolean r5 = r0.m26221a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zztv.m26579j(r3, r11)
            goto L_0x03c9
        L_0x0415:
            boolean r14 = r0.m26221a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26581k(r3, r5)
            goto L_0x03c9
        L_0x0424:
            boolean r14 = r0.m26221a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26568g((int) r3, (int) r5)
            goto L_0x03c9
        L_0x0433:
            boolean r14 = r0.m26221a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r1, r5)
            com.google.android.gms.internal.measurement.zzte r5 = (com.google.android.gms.internal.measurement.zzte) r5
            int r3 = com.google.android.gms.internal.measurement.zztv.m26553c((int) r3, (com.google.android.gms.internal.measurement.zzte) r5)
            goto L_0x03c9
        L_0x0444:
            boolean r14 = r0.m26221a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r1, r5)
            com.google.android.gms.internal.measurement.d2 r6 = r0.m26213a((int) r12)
            int r3 = com.google.android.gms.internal.measurement.C8283f2.m25933a((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.measurement.C8273d2) r6)
            goto L_0x03c9
        L_0x0458:
            boolean r14 = r0.m26221a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.measurement.zzte
            if (r6 == 0) goto L_0x046e
            com.google.android.gms.internal.measurement.zzte r5 = (com.google.android.gms.internal.measurement.zzte) r5
            int r3 = com.google.android.gms.internal.measurement.zztv.m26553c((int) r3, (com.google.android.gms.internal.measurement.zzte) r5)
            goto L_0x03c9
        L_0x046e:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.measurement.zztv.m26545b((int) r3, (java.lang.String) r5)
            goto L_0x03c9
        L_0x0476:
            boolean r5 = r0.m26221a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zztv.m26546b((int) r3, (boolean) r7)
            goto L_0x03c9
        L_0x0482:
            boolean r5 = r0.m26221a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zztv.m26576i(r3, r11)
            goto L_0x03c9
        L_0x048e:
            boolean r5 = r0.m26221a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zztv.m26569g((int) r3, (long) r9)
            goto L_0x03c9
        L_0x049a:
            boolean r14 = r0.m26221a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26564f((int) r3, (int) r5)
            goto L_0x03c9
        L_0x04aa:
            boolean r14 = r0.m26221a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26561e((int) r3, (long) r5)
            goto L_0x03c9
        L_0x04ba:
            boolean r14 = r0.m26221a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r1, r5)
            int r3 = com.google.android.gms.internal.measurement.zztv.m26557d((int) r3, (long) r5)
            goto L_0x03c9
        L_0x04ca:
            boolean r5 = r0.m26221a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.measurement.zztv.m26541b((int) r3, (float) r4)
            goto L_0x03c9
        L_0x04d6:
            boolean r5 = r0.m26221a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.gms.internal.measurement.zztv.m26540b((int) r3, (double) r5)
            goto L_0x03c9
        L_0x04e4:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x04ea:
            com.google.android.gms.internal.measurement.u2<?, ?> r2 = r0.f23362j
            int r1 = m26212a(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x04f2:
            sun.misc.Unsafe r2 = f23352n
            r3 = -1
            r5 = 0
            r6 = 0
            r12 = 0
        L_0x04f8:
            int[] r13 = r0.f23353a
            int r13 = r13.length
            if (r5 >= r13) goto L_0x0a24
            int r13 = r0.m26232c((int) r5)
            int[] r14 = r0.f23353a
            r15 = r14[r5]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x0523
            int r11 = r5 + 2
            r11 = r14[r11]
            r14 = r11 & r8
            int r18 = r11 >>> 20
            int r18 = r7 << r18
            if (r14 == r3) goto L_0x0521
            long r9 = (long) r14
            int r12 = r2.getInt(r1, r9)
            r3 = r14
        L_0x0521:
            r9 = r11
            goto L_0x0542
        L_0x0523:
            boolean r9 = r0.f23357e
            if (r9 == 0) goto L_0x053f
            com.google.android.gms.internal.measurement.zzui r9 = com.google.android.gms.internal.measurement.zzui.f23457P
            int r9 = r9.mo30422a()
            if (r4 < r9) goto L_0x053f
            com.google.android.gms.internal.measurement.zzui r9 = com.google.android.gms.internal.measurement.zzui.f23470c0
            int r9 = r9.mo30422a()
            if (r4 > r9) goto L_0x053f
            int[] r9 = r0.f23353a
            int r10 = r5 + 2
            r9 = r9[r10]
            r9 = r9 & r8
            goto L_0x0540
        L_0x053f:
            r9 = 0
        L_0x0540:
            r18 = 0
        L_0x0542:
            r10 = r13 & r8
            long r10 = (long) r10
            switch(r4) {
                case 0: goto L_0x0a0e;
                case 1: goto L_0x09fe;
                case 2: goto L_0x09ec;
                case 3: goto L_0x09dc;
                case 4: goto L_0x09cc;
                case 5: goto L_0x09c0;
                case 6: goto L_0x09b4;
                case 7: goto L_0x09aa;
                case 8: goto L_0x098e;
                case 9: goto L_0x097c;
                case 10: goto L_0x096d;
                case 11: goto L_0x0960;
                case 12: goto L_0x0953;
                case 13: goto L_0x0948;
                case 14: goto L_0x093d;
                case 15: goto L_0x0930;
                case 16: goto L_0x0923;
                case 17: goto L_0x0910;
                case 18: goto L_0x08fc;
                case 19: goto L_0x08f0;
                case 20: goto L_0x08e4;
                case 21: goto L_0x08d8;
                case 22: goto L_0x08cc;
                case 23: goto L_0x08c0;
                case 24: goto L_0x08b4;
                case 25: goto L_0x08a8;
                case 26: goto L_0x089d;
                case 27: goto L_0x088e;
                case 28: goto L_0x0882;
                case 29: goto L_0x0875;
                case 30: goto L_0x0868;
                case 31: goto L_0x085b;
                case 32: goto L_0x084e;
                case 33: goto L_0x0841;
                case 34: goto L_0x0834;
                case 35: goto L_0x0814;
                case 36: goto L_0x07f7;
                case 37: goto L_0x07da;
                case 38: goto L_0x07bd;
                case 39: goto L_0x079f;
                case 40: goto L_0x0781;
                case 41: goto L_0x0763;
                case 42: goto L_0x0745;
                case 43: goto L_0x0727;
                case 44: goto L_0x0709;
                case 45: goto L_0x06eb;
                case 46: goto L_0x06cd;
                case 47: goto L_0x06af;
                case 48: goto L_0x0691;
                case 49: goto L_0x0681;
                case 50: goto L_0x0671;
                case 51: goto L_0x0663;
                case 52: goto L_0x0656;
                case 53: goto L_0x0646;
                case 54: goto L_0x0636;
                case 55: goto L_0x0626;
                case 56: goto L_0x0618;
                case 57: goto L_0x060b;
                case 58: goto L_0x05ff;
                case 59: goto L_0x05e1;
                case 60: goto L_0x05cd;
                case 61: goto L_0x05bb;
                case 62: goto L_0x05ab;
                case 63: goto L_0x059b;
                case 64: goto L_0x058e;
                case 65: goto L_0x0580;
                case 66: goto L_0x0570;
                case 67: goto L_0x0560;
                case 68: goto L_0x054a;
                default: goto L_0x0548;
            }
        L_0x0548:
            goto L_0x0908
        L_0x054a:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.measurement.zzvv r4 = (com.google.android.gms.internal.measurement.zzvv) r4
            com.google.android.gms.internal.measurement.d2 r9 = r0.m26213a((int) r5)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26555c(r15, r4, r9)
            goto L_0x0907
        L_0x0560:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            long r9 = m26236e(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26565f((int) r15, (long) r9)
            goto L_0x0907
        L_0x0570:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = m26235d(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26572h((int) r15, (int) r4)
            goto L_0x0907
        L_0x0580:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.zztv.m26573h((int) r15, (long) r9)
            goto L_0x0907
        L_0x058e:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zztv.m26579j(r15, r4)
            goto L_0x0951
        L_0x059b:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = m26235d(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26581k(r15, r4)
            goto L_0x0907
        L_0x05ab:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = m26235d(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26568g((int) r15, (int) r4)
            goto L_0x0907
        L_0x05bb:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.measurement.zzte r4 = (com.google.android.gms.internal.measurement.zzte) r4
            int r4 = com.google.android.gms.internal.measurement.zztv.m26553c((int) r15, (com.google.android.gms.internal.measurement.zzte) r4)
            goto L_0x0907
        L_0x05cd:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.measurement.d2 r9 = r0.m26213a((int) r5)
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25933a((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C8273d2) r9)
            goto L_0x0907
        L_0x05e1:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.measurement.zzte
            if (r9 == 0) goto L_0x05f7
            com.google.android.gms.internal.measurement.zzte r4 = (com.google.android.gms.internal.measurement.zzte) r4
            int r4 = com.google.android.gms.internal.measurement.zztv.m26553c((int) r15, (com.google.android.gms.internal.measurement.zzte) r4)
            goto L_0x0907
        L_0x05f7:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.zztv.m26545b((int) r15, (java.lang.String) r4)
            goto L_0x0907
        L_0x05ff:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = com.google.android.gms.internal.measurement.zztv.m26546b((int) r15, (boolean) r7)
            goto L_0x0907
        L_0x060b:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zztv.m26576i(r15, r4)
            goto L_0x0951
        L_0x0618:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.zztv.m26569g((int) r15, (long) r9)
            goto L_0x0907
        L_0x0626:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = m26235d(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26564f((int) r15, (int) r4)
            goto L_0x0907
        L_0x0636:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            long r9 = m26236e(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26561e((int) r15, (long) r9)
            goto L_0x0907
        L_0x0646:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            long r9 = m26236e(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26557d((int) r15, (long) r9)
            goto L_0x0907
        L_0x0656:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zztv.m26541b((int) r15, (float) r4)
            goto L_0x0951
        L_0x0663:
            boolean r4 = r0.m26222a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.zztv.m26540b((int) r15, (double) r9)
            goto L_0x0907
        L_0x0671:
            com.google.android.gms.internal.measurement.p1 r4 = r0.f23364l
            java.lang.Object r9 = r2.getObject(r1, r10)
            java.lang.Object r10 = r0.m26226b((int) r5)
            int r4 = r4.mo30219a(r15, r9, r10)
            goto L_0x0907
        L_0x0681:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.d2 r9 = r0.m26213a((int) r5)
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25949b((int) r15, (java.util.List<com.google.android.gms.internal.measurement.zzvv>) r4, (com.google.android.gms.internal.measurement.C8273d2) r9)
            goto L_0x0907
        L_0x0691:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25937a((java.util.List<java.lang.Long>) r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x06a5
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06a5:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x06af:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25965e(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x06c3
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06c3:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x06cd:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25972g(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x06e1
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06e1:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x06eb:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25969f(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x06ff
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06ff:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x0709:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25951b(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x071d
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x071d:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x0727:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25961d(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x073b
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x073b:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x0745:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25975h(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x0759
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0759:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x0763:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25969f(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x0777
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0777:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x0781:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25972g(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x0795
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0795:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x079f:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25957c(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x07b3
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x07b3:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x07bd:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25981j(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x07d1
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x07d1:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x07da:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25978i(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x07ee
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x07ee:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x07f7:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25969f(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x080b
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x080b:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
            goto L_0x0830
        L_0x0814:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25972g(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f23357e
            if (r10 == 0) goto L_0x0828
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0828:
            int r9 = com.google.android.gms.internal.measurement.zztv.m26560e((int) r15)
            int r10 = com.google.android.gms.internal.measurement.zztv.m26567g((int) r4)
        L_0x0830:
            int r9 = r9 + r10
            int r9 = r9 + r4
            goto L_0x0951
        L_0x0834:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25956c(r15, r4, r9)
            goto L_0x0907
        L_0x0841:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25971g(r15, r4, r9)
            goto L_0x0907
        L_0x084e:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25977i(r15, r4, r9)
            goto L_0x0907
        L_0x085b:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25974h(r15, r4, r9)
            goto L_0x0907
        L_0x0868:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25960d(r15, r4, r9)
            goto L_0x0907
        L_0x0875:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25968f(r15, r4, r9)
            goto L_0x0907
        L_0x0882:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25948b(r15, r4)
            goto L_0x0907
        L_0x088e:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.d2 r9 = r0.m26213a((int) r5)
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25935a((int) r15, (java.util.List<?>) r4, (com.google.android.gms.internal.measurement.C8273d2) r9)
            goto L_0x0907
        L_0x089d:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25934a((int) r15, (java.util.List<?>) r4)
            goto L_0x0907
        L_0x08a8:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25980j(r15, r4, r9)
            goto L_0x0907
        L_0x08b4:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25974h(r15, r4, r9)
            goto L_0x0907
        L_0x08c0:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25977i(r15, r4, r9)
            goto L_0x0907
        L_0x08cc:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25964e(r15, r4, r9)
            goto L_0x0907
        L_0x08d8:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25950b((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r9)
            goto L_0x0907
        L_0x08e4:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25936a((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r9)
            goto L_0x0907
        L_0x08f0:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25974h(r15, r4, r9)
            goto L_0x0907
        L_0x08fc:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25977i(r15, r4, r9)
        L_0x0907:
            int r6 = r6 + r4
        L_0x0908:
            r4 = 0
        L_0x0909:
            r9 = 0
            r10 = 0
            r13 = 0
            goto L_0x0a1d
        L_0x0910:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.measurement.zzvv r4 = (com.google.android.gms.internal.measurement.zzvv) r4
            com.google.android.gms.internal.measurement.d2 r9 = r0.m26213a((int) r5)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26555c(r15, r4, r9)
            goto L_0x0907
        L_0x0923:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            long r9 = r2.getLong(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26565f((int) r15, (long) r9)
            goto L_0x0907
        L_0x0930:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            int r4 = r2.getInt(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26572h((int) r15, (int) r4)
            goto L_0x0907
        L_0x093d:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            r9 = 0
            int r4 = com.google.android.gms.internal.measurement.zztv.m26573h((int) r15, (long) r9)
            goto L_0x0907
        L_0x0948:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zztv.m26579j(r15, r4)
        L_0x0951:
            int r6 = r6 + r9
            goto L_0x0908
        L_0x0953:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            int r4 = r2.getInt(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26581k(r15, r4)
            goto L_0x0907
        L_0x0960:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            int r4 = r2.getInt(r1, r10)
            int r4 = com.google.android.gms.internal.measurement.zztv.m26568g((int) r15, (int) r4)
            goto L_0x0907
        L_0x096d:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.measurement.zzte r4 = (com.google.android.gms.internal.measurement.zzte) r4
            int r4 = com.google.android.gms.internal.measurement.zztv.m26553c((int) r15, (com.google.android.gms.internal.measurement.zzte) r4)
            goto L_0x0907
        L_0x097c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.measurement.d2 r9 = r0.m26213a((int) r5)
            int r4 = com.google.android.gms.internal.measurement.C8283f2.m25933a((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C8273d2) r9)
            goto L_0x0907
        L_0x098e:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.measurement.zzte
            if (r9 == 0) goto L_0x09a2
            com.google.android.gms.internal.measurement.zzte r4 = (com.google.android.gms.internal.measurement.zzte) r4
            int r4 = com.google.android.gms.internal.measurement.zztv.m26553c((int) r15, (com.google.android.gms.internal.measurement.zzte) r4)
            goto L_0x0907
        L_0x09a2:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.measurement.zztv.m26545b((int) r15, (java.lang.String) r4)
            goto L_0x0907
        L_0x09aa:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            int r4 = com.google.android.gms.internal.measurement.zztv.m26546b((int) r15, (boolean) r7)
            goto L_0x0907
        L_0x09b4:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.measurement.zztv.m26576i(r15, r4)
            int r6 = r6 + r9
            goto L_0x0909
        L_0x09c0:
            r4 = 0
            r9 = r12 & r18
            r13 = 0
            if (r9 == 0) goto L_0x09fc
            int r9 = com.google.android.gms.internal.measurement.zztv.m26569g((int) r15, (long) r13)
            goto L_0x09fb
        L_0x09cc:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fc
            int r9 = r2.getInt(r1, r10)
            int r9 = com.google.android.gms.internal.measurement.zztv.m26564f((int) r15, (int) r9)
            goto L_0x09fb
        L_0x09dc:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fc
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.measurement.zztv.m26561e((int) r15, (long) r9)
            goto L_0x09fb
        L_0x09ec:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fc
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.measurement.zztv.m26557d((int) r15, (long) r9)
        L_0x09fb:
            int r6 = r6 + r9
        L_0x09fc:
            r9 = 0
            goto L_0x0a0b
        L_0x09fe:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fc
            r9 = 0
            int r10 = com.google.android.gms.internal.measurement.zztv.m26541b((int) r15, (float) r9)
            int r6 = r6 + r10
        L_0x0a0b:
            r10 = 0
            goto L_0x0a1d
        L_0x0a0e:
            r4 = 0
            r9 = 0
            r13 = 0
            r10 = r12 & r18
            if (r10 == 0) goto L_0x0a0b
            r10 = 0
            int r15 = com.google.android.gms.internal.measurement.zztv.m26540b((int) r15, (double) r10)
            int r6 = r6 + r15
        L_0x0a1d:
            int r5 = r5 + 3
            r9 = r13
            r4 = 0
            r11 = 0
            goto L_0x04f8
        L_0x0a24:
            com.google.android.gms.internal.measurement.u2<?, ?> r2 = r0.f23362j
            int r2 = m26212a(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f23355c
            if (r2 == 0) goto L_0x0a3a
            com.google.android.gms.internal.measurement.u0<?> r2 = r0.f23363k
            com.google.android.gms.internal.measurement.x0 r1 = r2.mo30234a((java.lang.Object) r1)
            int r1 = r1.mo30265g()
            int r6 = r6 + r1
        L_0x0a3a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C8354v1.mo30092c(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo30093d(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.f23359g) {
                return !this.f23355c || this.f23363k.mo30234a((Object) t).mo30261d();
            }
            int i5 = this.f23358f[i3];
            int i6 = this.f23353a[i5];
            int c = m26232c(i5);
            if (!this.f23356d) {
                int i7 = this.f23353a[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = f23352n.getInt(t, (long) i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if (((268435456 & c) != 0) && !m26223a(t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & c) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (m26222a(t, i6, i5) && !m26224a((Object) t, c, m26213a(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> c2 = this.f23364l.mo30223c(C8367y2.m26320f(t, (long) (c & 1048575)));
                            if (!c2.isEmpty()) {
                                if (this.f23364l.mo30222b(m26226b(i5)).f23311b.mo30478a() == zzxx.MESSAGE) {
                                    C8273d2<?> d2Var = null;
                                    Iterator<?> it = c2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (d2Var == null) {
                                            d2Var = C8263b2.m25892a().mo30064a(next.getClass());
                                        }
                                        if (!d2Var.mo30093d(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) C8367y2.m26320f(t, (long) (c & 1048575));
                if (!list.isEmpty()) {
                    C8273d2 a = m26213a(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!a.mo30093d(list.get(i10))) {
                            z = false;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (m26223a(t, i5, i4, i) && !m26224a((Object) t, c, m26213a(i5))) {
                return false;
            }
            i3++;
        }
    }

    /* renamed from: d */
    private final int m26234d(int i) {
        return this.f23353a[i + 2];
    }

    /* renamed from: d */
    private static <T> int m26235d(T t, long j) {
        return ((Integer) C8367y2.m26320f(t, j)).intValue();
    }

    /* renamed from: b */
    private final void m26230b(T t, T t2, int i) {
        int c = m26232c(i);
        int i2 = this.f23353a[i];
        long j = (long) (c & 1048575);
        if (m26222a(t2, i2, i)) {
            Object f = C8367y2.m26320f(t, j);
            Object f2 = C8367y2.m26320f(t2, j);
            if (f != null && f2 != null) {
                C8367y2.m26298a((Object) t, j, zzuq.m26678a(f, f2));
                m26228b(t, i2, i);
            } else if (f2 != null) {
                C8367y2.m26298a((Object) t, j, f2);
                m26228b(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m26229b(T r19, com.google.android.gms.internal.measurement.C8309k3 r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f23355c
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.measurement.u0<?> r3 = r0.f23363k
            com.google.android.gms.internal.measurement.x0 r3 = r3.mo30234a((java.lang.Object) r1)
            boolean r5 = r3.mo30258b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo30262e()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            r5 = -1
            int[] r6 = r0.f23353a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f23352n
            r9 = 0
            r10 = 0
        L_0x002a:
            if (r9 >= r6) goto L_0x0481
            int r11 = r0.m26232c((int) r9)
            int[] r12 = r0.f23353a
            r13 = r12[r9]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r11
            int r14 = r14 >>> 20
            boolean r15 = r0.f23356d
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 1
            if (r15 != 0) goto L_0x005a
            r15 = 17
            if (r14 > r15) goto L_0x005a
            int r15 = r9 + 2
            r12 = r12[r15]
            r15 = r12 & r16
            r17 = r9
            if (r15 == r5) goto L_0x0055
            long r8 = (long) r15
            int r10 = r7.getInt(r1, r8)
            r5 = r15
        L_0x0055:
            int r8 = r12 >>> 20
            int r8 = r4 << r8
            goto L_0x005d
        L_0x005a:
            r17 = r9
            r8 = 0
        L_0x005d:
            if (r3 != 0) goto L_0x047a
            r9 = r11 & r16
            long r11 = (long) r9
            r9 = r17
            switch(r14) {
                case 0: goto L_0x046a;
                case 1: goto L_0x045d;
                case 2: goto L_0x0450;
                case 3: goto L_0x0443;
                case 4: goto L_0x0436;
                case 5: goto L_0x0429;
                case 6: goto L_0x041c;
                case 7: goto L_0x040f;
                case 8: goto L_0x0401;
                case 9: goto L_0x03ef;
                case 10: goto L_0x03df;
                case 11: goto L_0x03d1;
                case 12: goto L_0x03c3;
                case 13: goto L_0x03b5;
                case 14: goto L_0x03a7;
                case 15: goto L_0x0399;
                case 16: goto L_0x038b;
                case 17: goto L_0x0379;
                case 18: goto L_0x0369;
                case 19: goto L_0x0359;
                case 20: goto L_0x0349;
                case 21: goto L_0x0339;
                case 22: goto L_0x0329;
                case 23: goto L_0x0319;
                case 24: goto L_0x0309;
                case 25: goto L_0x02f9;
                case 26: goto L_0x02ea;
                case 27: goto L_0x02d7;
                case 28: goto L_0x02c8;
                case 29: goto L_0x02b8;
                case 30: goto L_0x02a8;
                case 31: goto L_0x0298;
                case 32: goto L_0x0288;
                case 33: goto L_0x0278;
                case 34: goto L_0x0268;
                case 35: goto L_0x0259;
                case 36: goto L_0x024a;
                case 37: goto L_0x023b;
                case 38: goto L_0x022c;
                case 39: goto L_0x021d;
                case 40: goto L_0x020e;
                case 41: goto L_0x01ff;
                case 42: goto L_0x01f0;
                case 43: goto L_0x01e1;
                case 44: goto L_0x01d2;
                case 45: goto L_0x01c3;
                case 46: goto L_0x01b4;
                case 47: goto L_0x01a5;
                case 48: goto L_0x0196;
                case 49: goto L_0x0183;
                case 50: goto L_0x017a;
                case 51: goto L_0x016b;
                case 52: goto L_0x015c;
                case 53: goto L_0x014d;
                case 54: goto L_0x013e;
                case 55: goto L_0x012f;
                case 56: goto L_0x0120;
                case 57: goto L_0x0111;
                case 58: goto L_0x0102;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00e0;
                case 61: goto L_0x00d0;
                case 62: goto L_0x00c2;
                case 63: goto L_0x00b4;
                case 64: goto L_0x00a6;
                case 65: goto L_0x0098;
                case 66: goto L_0x008a;
                case 67: goto L_0x007c;
                case 68: goto L_0x006a;
                default: goto L_0x0067;
            }
        L_0x0067:
            r14 = 0
            goto L_0x0476
        L_0x006a:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.measurement.d2 r8 = r0.m26213a((int) r9)
            r2.mo30166b((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C8273d2) r8)
            goto L_0x0067
        L_0x007c:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            long r11 = m26236e(r1, r11)
            r2.mo30153a((int) r13, (long) r11)
            goto L_0x0067
        L_0x008a:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            int r4 = m26235d(r1, r11)
            r2.mo30173d((int) r13, (int) r4)
            goto L_0x0067
        L_0x0098:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            long r11 = m26236e(r1, r11)
            r2.mo30171c((int) r13, (long) r11)
            goto L_0x0067
        L_0x00a6:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            int r4 = m26235d(r1, r11)
            r2.mo30170c((int) r13, (int) r4)
            goto L_0x0067
        L_0x00b4:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            int r4 = m26235d(r1, r11)
            r2.mo30152a((int) r13, (int) r4)
            goto L_0x0067
        L_0x00c2:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            int r4 = m26235d(r1, r11)
            r2.mo30179f(r13, r4)
            goto L_0x0067
        L_0x00d0:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.measurement.zzte r4 = (com.google.android.gms.internal.measurement.zzte) r4
            r2.mo30155a((int) r13, (com.google.android.gms.internal.measurement.zzte) r4)
            goto L_0x0067
        L_0x00e0:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.measurement.d2 r8 = r0.m26213a((int) r9)
            r2.mo30157a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C8273d2) r8)
            goto L_0x0067
        L_0x00f3:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            java.lang.Object r4 = r7.getObject(r1, r11)
            m26217a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C8309k3) r2)
            goto L_0x0067
        L_0x0102:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            boolean r4 = m26237f(r1, r11)
            r2.mo30162a((int) r13, (boolean) r4)
            goto L_0x0067
        L_0x0111:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            int r4 = m26235d(r1, r11)
            r2.mo30176e((int) r13, (int) r4)
            goto L_0x0067
        L_0x0120:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            long r11 = m26236e(r1, r11)
            r2.mo30165b((int) r13, (long) r11)
            goto L_0x0067
        L_0x012f:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            int r4 = m26235d(r1, r11)
            r2.mo30164b((int) r13, (int) r4)
            goto L_0x0067
        L_0x013e:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            long r11 = m26236e(r1, r11)
            r2.mo30177e((int) r13, (long) r11)
            goto L_0x0067
        L_0x014d:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            long r11 = m26236e(r1, r11)
            r2.mo30174d((int) r13, (long) r11)
            goto L_0x0067
        L_0x015c:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            float r4 = m26231c(r1, r11)
            r2.mo30151a((int) r13, (float) r4)
            goto L_0x0067
        L_0x016b:
            boolean r4 = r0.m26222a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            double r11 = m26225b(r1, (long) r11)
            r2.mo30150a((int) r13, (double) r11)
            goto L_0x0067
        L_0x017a:
            java.lang.Object r4 = r7.getObject(r1, r11)
            r0.m26218a((com.google.android.gms.internal.measurement.C8309k3) r2, (int) r13, (java.lang.Object) r4, (int) r9)
            goto L_0x0067
        L_0x0183:
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.d2 r11 = r0.m26213a((int) r9)
            com.google.android.gms.internal.measurement.C8283f2.m25954b((int) r4, (java.util.List<?>) r8, (com.google.android.gms.internal.measurement.C8309k3) r2, (com.google.android.gms.internal.measurement.C8273d2) r11)
            goto L_0x0067
        L_0x0196:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25967e(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01a5:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25982j(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01b4:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25973g(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01c3:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25984l(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01d2:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25985m(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01e1:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25979i(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01f0:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25986n(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01ff:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25983k(r8, r11, r2, r4)
            goto L_0x0067
        L_0x020e:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25970f(r8, r11, r2, r4)
            goto L_0x0067
        L_0x021d:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25976h(r8, r11, r2, r4)
            goto L_0x0067
        L_0x022c:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25963d(r8, r11, r2, r4)
            goto L_0x0067
        L_0x023b:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25959c(r8, r11, r2, r4)
            goto L_0x0067
        L_0x024a:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25955b((int) r8, (java.util.List<java.lang.Float>) r11, (com.google.android.gms.internal.measurement.C8309k3) r2, (boolean) r4)
            goto L_0x0067
        L_0x0259:
            int[] r8 = r0.f23353a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.measurement.C8283f2.m25942a((int) r8, (java.util.List<java.lang.Double>) r11, (com.google.android.gms.internal.measurement.C8309k3) r2, (boolean) r4)
            goto L_0x0067
        L_0x0268:
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.measurement.C8283f2.m25967e(r4, r8, r2, r13)
            goto L_0x0067
        L_0x0278:
            r13 = 0
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25982j(r4, r8, r2, r13)
            goto L_0x0067
        L_0x0288:
            r13 = 0
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25973g(r4, r8, r2, r13)
            goto L_0x0067
        L_0x0298:
            r13 = 0
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25984l(r4, r8, r2, r13)
            goto L_0x0067
        L_0x02a8:
            r13 = 0
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25985m(r4, r8, r2, r13)
            goto L_0x0067
        L_0x02b8:
            r13 = 0
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25979i(r4, r8, r2, r13)
            goto L_0x0067
        L_0x02c8:
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25953b((int) r4, (java.util.List<com.google.android.gms.internal.measurement.zzte>) r8, (com.google.android.gms.internal.measurement.C8309k3) r2)
            goto L_0x0067
        L_0x02d7:
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.d2 r11 = r0.m26213a((int) r9)
            com.google.android.gms.internal.measurement.C8283f2.m25941a((int) r4, (java.util.List<?>) r8, (com.google.android.gms.internal.measurement.C8309k3) r2, (com.google.android.gms.internal.measurement.C8273d2) r11)
            goto L_0x0067
        L_0x02ea:
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25940a((int) r4, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.measurement.C8309k3) r2)
            goto L_0x0067
        L_0x02f9:
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            com.google.android.gms.internal.measurement.C8283f2.m25986n(r4, r8, r2, r14)
            goto L_0x0476
        L_0x0309:
            r14 = 0
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25983k(r4, r8, r2, r14)
            goto L_0x0476
        L_0x0319:
            r14 = 0
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25970f(r4, r8, r2, r14)
            goto L_0x0476
        L_0x0329:
            r14 = 0
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25976h(r4, r8, r2, r14)
            goto L_0x0476
        L_0x0339:
            r14 = 0
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25963d(r4, r8, r2, r14)
            goto L_0x0476
        L_0x0349:
            r14 = 0
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25959c(r4, r8, r2, r14)
            goto L_0x0476
        L_0x0359:
            r14 = 0
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25955b((int) r4, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.measurement.C8309k3) r2, (boolean) r14)
            goto L_0x0476
        L_0x0369:
            r14 = 0
            int[] r4 = r0.f23353a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25942a((int) r4, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.measurement.C8309k3) r2, (boolean) r14)
            goto L_0x0476
        L_0x0379:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.measurement.d2 r8 = r0.m26213a((int) r9)
            r2.mo30166b((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C8273d2) r8)
            goto L_0x0476
        L_0x038b:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            long r11 = r7.getLong(r1, r11)
            r2.mo30153a((int) r13, (long) r11)
            goto L_0x0476
        L_0x0399:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            int r4 = r7.getInt(r1, r11)
            r2.mo30173d((int) r13, (int) r4)
            goto L_0x0476
        L_0x03a7:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            long r11 = r7.getLong(r1, r11)
            r2.mo30171c((int) r13, (long) r11)
            goto L_0x0476
        L_0x03b5:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            int r4 = r7.getInt(r1, r11)
            r2.mo30170c((int) r13, (int) r4)
            goto L_0x0476
        L_0x03c3:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            int r4 = r7.getInt(r1, r11)
            r2.mo30152a((int) r13, (int) r4)
            goto L_0x0476
        L_0x03d1:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            int r4 = r7.getInt(r1, r11)
            r2.mo30179f(r13, r4)
            goto L_0x0476
        L_0x03df:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.measurement.zzte r4 = (com.google.android.gms.internal.measurement.zzte) r4
            r2.mo30155a((int) r13, (com.google.android.gms.internal.measurement.zzte) r4)
            goto L_0x0476
        L_0x03ef:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.measurement.d2 r8 = r0.m26213a((int) r9)
            r2.mo30157a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C8273d2) r8)
            goto L_0x0476
        L_0x0401:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            java.lang.Object r4 = r7.getObject(r1, r11)
            m26217a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.measurement.C8309k3) r2)
            goto L_0x0476
        L_0x040f:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            boolean r4 = com.google.android.gms.internal.measurement.C8367y2.m26311c(r1, r11)
            r2.mo30162a((int) r13, (boolean) r4)
            goto L_0x0476
        L_0x041c:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            int r4 = r7.getInt(r1, r11)
            r2.mo30176e((int) r13, (int) r4)
            goto L_0x0476
        L_0x0429:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            long r11 = r7.getLong(r1, r11)
            r2.mo30165b((int) r13, (long) r11)
            goto L_0x0476
        L_0x0436:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            int r4 = r7.getInt(r1, r11)
            r2.mo30164b((int) r13, (int) r4)
            goto L_0x0476
        L_0x0443:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            long r11 = r7.getLong(r1, r11)
            r2.mo30177e((int) r13, (long) r11)
            goto L_0x0476
        L_0x0450:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            long r11 = r7.getLong(r1, r11)
            r2.mo30174d((int) r13, (long) r11)
            goto L_0x0476
        L_0x045d:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            float r4 = com.google.android.gms.internal.measurement.C8367y2.m26312d(r1, r11)
            r2.mo30151a((int) r13, (float) r4)
            goto L_0x0476
        L_0x046a:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            double r11 = com.google.android.gms.internal.measurement.C8367y2.m26317e(r1, r11)
            r2.mo30150a((int) r13, (double) r11)
        L_0x0476:
            int r9 = r9 + 3
            goto L_0x002a
        L_0x047a:
            com.google.android.gms.internal.measurement.u0<?> r1 = r0.f23363k
            r1.mo30233a((java.util.Map.Entry<?, ?>) r3)
            r4 = 0
            throw r4
        L_0x0481:
            r4 = 0
            if (r3 != 0) goto L_0x048a
            com.google.android.gms.internal.measurement.u2<?, ?> r3 = r0.f23362j
            m26219a(r3, r1, (com.google.android.gms.internal.measurement.C8309k3) r2)
            return
        L_0x048a:
            com.google.android.gms.internal.measurement.u0<?> r1 = r0.f23363k
            r1.mo30235a(r2, r3)
            goto L_0x0491
        L_0x0490:
            throw r4
        L_0x0491:
            goto L_0x0490
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C8354v1.m26229b(java.lang.Object, com.google.android.gms.internal.measurement.k3):void");
    }

    /* renamed from: a */
    private static Field m26215a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo30087a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f23353a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.m26232c((int) r1)
            int[] r4 = r8.f23353a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m26236e(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26674a((long) r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m26235d(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m26236e(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26674a((long) r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m26235d(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m26235d(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m26235d(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = m26237f(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26675a((boolean) r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m26235d(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m26236e(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26674a((long) r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m26235d(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m26236e(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26674a((long) r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m26236e(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26674a((long) r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = m26231c(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.m26222a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = m26225b(r9, (long) r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26674a((long) r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26674a((long) r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26674a((long) r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.C8367y2.m26311c(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26675a((boolean) r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26674a((long) r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26674a((long) r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26674a((long) r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.C8367y2.m26312d(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.C8367y2.m26317e(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.zzuq.m26674a((long) r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.u2<?, ?> r0 = r8.f23362j
            java.lang.Object r0 = r0.mo30242b(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f23355c
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.u0<?> r0 = r8.f23363k
            com.google.android.gms.internal.measurement.x0 r9 = r0.mo30234a((java.lang.Object) r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C8354v1.mo30087a(java.lang.Object):int");
    }

    /* renamed from: a */
    public final void mo30089a(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f23353a.length; i += 3) {
                int c = m26232c(i);
                long j = (long) (1048575 & c);
                int i2 = this.f23353a[i];
                switch ((c & 267386880) >>> 20) {
                    case 0:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26294a((Object) t, j, C8367y2.m26317e(t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 1:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26295a((Object) t, j, C8367y2.m26312d(t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 2:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26297a((Object) t, j, C8367y2.m26303b(t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 3:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26297a((Object) t, j, C8367y2.m26303b(t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 4:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26296a((Object) t, j, C8367y2.m26290a((Object) t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 5:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26297a((Object) t, j, C8367y2.m26303b(t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 6:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26296a((Object) t, j, C8367y2.m26290a((Object) t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 7:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26299a((Object) t, j, C8367y2.m26311c(t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 8:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26298a((Object) t, j, C8367y2.m26320f(t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 9:
                        m26220a(t, t2, i);
                        break;
                    case 10:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26298a((Object) t, j, C8367y2.m26320f(t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 11:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26296a((Object) t, j, C8367y2.m26290a((Object) t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 12:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26296a((Object) t, j, C8367y2.m26290a((Object) t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 13:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26296a((Object) t, j, C8367y2.m26290a((Object) t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 14:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26297a((Object) t, j, C8367y2.m26303b(t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 15:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26296a((Object) t, j, C8367y2.m26290a((Object) t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 16:
                        if (!m26221a(t2, i)) {
                            break;
                        } else {
                            C8367y2.m26297a((Object) t, j, C8367y2.m26303b(t2, j));
                            m26227b(t, i);
                            break;
                        }
                    case 17:
                        m26220a(t, t2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f23361i.mo30113a(t, t2, j);
                        break;
                    case 50:
                        C8283f2.m25943a(this.f23364l, t, t2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!m26222a(t2, i2, i)) {
                            break;
                        } else {
                            C8367y2.m26298a((Object) t, j, C8367y2.m26320f(t2, j));
                            m26228b(t, i2, i);
                            break;
                        }
                    case 60:
                        m26230b(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m26222a(t2, i2, i)) {
                            break;
                        } else {
                            C8367y2.m26298a((Object) t, j, C8367y2.m26320f(t2, j));
                            m26228b(t, i2, i);
                            break;
                        }
                    case 68:
                        m26230b(t, t2, i);
                        break;
                }
            }
            if (!this.f23356d) {
                C8283f2.m25945a(this.f23362j, t, t2);
                if (this.f23355c) {
                    C8283f2.m25944a(this.f23363k, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: a */
    private final void m26220a(T t, T t2, int i) {
        long c = (long) (m26232c(i) & 1048575);
        if (m26221a(t2, i)) {
            Object f = C8367y2.m26320f(t, c);
            Object f2 = C8367y2.m26320f(t2, c);
            if (f != null && f2 != null) {
                C8367y2.m26298a((Object) t, c, zzuq.m26678a(f, f2));
                m26227b(t, i);
            } else if (f2 != null) {
                C8367y2.m26298a((Object) t, c, f2);
                m26227b(t, i);
            }
        }
    }

    /* renamed from: a */
    private static <UT, UB> int m26212a(C8351u2<UT, UB> u2Var, T t) {
        return u2Var.mo30239a(u2Var.mo30242b(t));
    }

    /* renamed from: a */
    private static <E> List<E> m26216a(Object obj, long j) {
        return (List) C8367y2.m26320f(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0969  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x096f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30088a(T r13, com.google.android.gms.internal.measurement.C8309k3 r14) throws java.io.IOException {
        /*
            r12 = this;
            int r0 = r14.mo30148a()
            int r1 = com.google.android.gms.internal.measurement.zzuo.zze.f23508j
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04c1
            com.google.android.gms.internal.measurement.u2<?, ?> r0 = r12.f23362j
            m26219a(r0, r13, (com.google.android.gms.internal.measurement.C8309k3) r14)
            boolean r0 = r12.f23355c
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.measurement.u0<?> r0 = r12.f23363k
            com.google.android.gms.internal.measurement.x0 r0 = r0.mo30234a((java.lang.Object) r13)
            boolean r1 = r0.mo30258b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.mo30256a()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0031
        L_0x0030:
            r0 = r3
        L_0x0031:
            int[] r1 = r12.f23353a
            int r1 = r1.length
            int r1 = r1 + -3
        L_0x0036:
            if (r1 < 0) goto L_0x04b8
            int r7 = r12.m26232c((int) r1)
            int[] r8 = r12.f23353a
            r9 = r8[r1]
            if (r0 != 0) goto L_0x04b2
            r10 = r7 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x049f;
                case 1: goto L_0x048f;
                case 2: goto L_0x047f;
                case 3: goto L_0x046f;
                case 4: goto L_0x045f;
                case 5: goto L_0x044f;
                case 6: goto L_0x043f;
                case 7: goto L_0x042e;
                case 8: goto L_0x041d;
                case 9: goto L_0x0408;
                case 10: goto L_0x03f5;
                case 11: goto L_0x03e4;
                case 12: goto L_0x03d3;
                case 13: goto L_0x03c2;
                case 14: goto L_0x03b1;
                case 15: goto L_0x03a0;
                case 16: goto L_0x038f;
                case 17: goto L_0x037a;
                case 18: goto L_0x036b;
                case 19: goto L_0x035c;
                case 20: goto L_0x034d;
                case 21: goto L_0x033e;
                case 22: goto L_0x032f;
                case 23: goto L_0x0320;
                case 24: goto L_0x0311;
                case 25: goto L_0x0302;
                case 26: goto L_0x02f3;
                case 27: goto L_0x02e0;
                case 28: goto L_0x02d1;
                case 29: goto L_0x02c2;
                case 30: goto L_0x02b3;
                case 31: goto L_0x02a4;
                case 32: goto L_0x0295;
                case 33: goto L_0x0286;
                case 34: goto L_0x0277;
                case 35: goto L_0x0268;
                case 36: goto L_0x0259;
                case 37: goto L_0x024a;
                case 38: goto L_0x023b;
                case 39: goto L_0x022c;
                case 40: goto L_0x021d;
                case 41: goto L_0x020e;
                case 42: goto L_0x01ff;
                case 43: goto L_0x01f0;
                case 44: goto L_0x01e1;
                case 45: goto L_0x01d2;
                case 46: goto L_0x01c3;
                case 47: goto L_0x01b4;
                case 48: goto L_0x01a5;
                case 49: goto L_0x0192;
                case 50: goto L_0x0187;
                case 51: goto L_0x0176;
                case 52: goto L_0x0165;
                case 53: goto L_0x0154;
                case 54: goto L_0x0143;
                case 55: goto L_0x0132;
                case 56: goto L_0x0121;
                case 57: goto L_0x0110;
                case 58: goto L_0x00ff;
                case 59: goto L_0x00ee;
                case 60: goto L_0x00d9;
                case 61: goto L_0x00c6;
                case 62: goto L_0x00b5;
                case 63: goto L_0x00a4;
                case 64: goto L_0x0093;
                case 65: goto L_0x0082;
                case 66: goto L_0x0071;
                case 67: goto L_0x0060;
                case 68: goto L_0x004b;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x04ae
        L_0x004b:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r7)
            com.google.android.gms.internal.measurement.d2 r8 = r12.m26213a((int) r1)
            r14.mo30166b((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.measurement.C8273d2) r8)
            goto L_0x04ae
        L_0x0060:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m26236e(r13, r7)
            r14.mo30153a((int) r9, (long) r7)
            goto L_0x04ae
        L_0x0071:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m26235d(r13, r7)
            r14.mo30173d((int) r9, (int) r7)
            goto L_0x04ae
        L_0x0082:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m26236e(r13, r7)
            r14.mo30171c((int) r9, (long) r7)
            goto L_0x04ae
        L_0x0093:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m26235d(r13, r7)
            r14.mo30170c((int) r9, (int) r7)
            goto L_0x04ae
        L_0x00a4:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m26235d(r13, r7)
            r14.mo30152a((int) r9, (int) r7)
            goto L_0x04ae
        L_0x00b5:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m26235d(r13, r7)
            r14.mo30179f(r9, r7)
            goto L_0x04ae
        L_0x00c6:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r7)
            com.google.android.gms.internal.measurement.zzte r7 = (com.google.android.gms.internal.measurement.zzte) r7
            r14.mo30155a((int) r9, (com.google.android.gms.internal.measurement.zzte) r7)
            goto L_0x04ae
        L_0x00d9:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r7)
            com.google.android.gms.internal.measurement.d2 r8 = r12.m26213a((int) r1)
            r14.mo30157a((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.measurement.C8273d2) r8)
            goto L_0x04ae
        L_0x00ee:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r7)
            m26217a((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.measurement.C8309k3) r14)
            goto L_0x04ae
        L_0x00ff:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = m26237f(r13, r7)
            r14.mo30162a((int) r9, (boolean) r7)
            goto L_0x04ae
        L_0x0110:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m26235d(r13, r7)
            r14.mo30176e((int) r9, (int) r7)
            goto L_0x04ae
        L_0x0121:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m26236e(r13, r7)
            r14.mo30165b((int) r9, (long) r7)
            goto L_0x04ae
        L_0x0132:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m26235d(r13, r7)
            r14.mo30164b((int) r9, (int) r7)
            goto L_0x04ae
        L_0x0143:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m26236e(r13, r7)
            r14.mo30177e((int) r9, (long) r7)
            goto L_0x04ae
        L_0x0154:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m26236e(r13, r7)
            r14.mo30174d((int) r9, (long) r7)
            goto L_0x04ae
        L_0x0165:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = m26231c(r13, r7)
            r14.mo30151a((int) r9, (float) r7)
            goto L_0x04ae
        L_0x0176:
            boolean r8 = r12.m26222a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = m26225b(r13, (long) r7)
            r14.mo30150a((int) r9, (double) r7)
            goto L_0x04ae
        L_0x0187:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r7)
            r12.m26218a((com.google.android.gms.internal.measurement.C8309k3) r14, (int) r9, (java.lang.Object) r7, (int) r1)
            goto L_0x04ae
        L_0x0192:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.d2 r9 = r12.m26213a((int) r1)
            com.google.android.gms.internal.measurement.C8283f2.m25954b((int) r8, (java.util.List<?>) r7, (com.google.android.gms.internal.measurement.C8309k3) r14, (com.google.android.gms.internal.measurement.C8273d2) r9)
            goto L_0x04ae
        L_0x01a5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25967e(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x01b4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25982j(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x01c3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25973g(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x01d2:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25984l(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x01e1:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25985m(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x01f0:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25979i(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x01ff:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25986n(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x020e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25983k(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x021d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25970f(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x022c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25976h(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x023b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25963d(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x024a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25959c(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x0259:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25955b((int) r8, (java.util.List<java.lang.Float>) r7, (com.google.android.gms.internal.measurement.C8309k3) r14, (boolean) r4)
            goto L_0x04ae
        L_0x0268:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25942a((int) r8, (java.util.List<java.lang.Double>) r7, (com.google.android.gms.internal.measurement.C8309k3) r14, (boolean) r4)
            goto L_0x04ae
        L_0x0277:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25967e(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x0286:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25982j(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x0295:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25973g(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x02a4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25984l(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x02b3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25985m(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x02c2:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25979i(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x02d1:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25953b((int) r8, (java.util.List<com.google.android.gms.internal.measurement.zzte>) r7, (com.google.android.gms.internal.measurement.C8309k3) r14)
            goto L_0x04ae
        L_0x02e0:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.d2 r9 = r12.m26213a((int) r1)
            com.google.android.gms.internal.measurement.C8283f2.m25941a((int) r8, (java.util.List<?>) r7, (com.google.android.gms.internal.measurement.C8309k3) r14, (com.google.android.gms.internal.measurement.C8273d2) r9)
            goto L_0x04ae
        L_0x02f3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25940a((int) r8, (java.util.List<java.lang.String>) r7, (com.google.android.gms.internal.measurement.C8309k3) r14)
            goto L_0x04ae
        L_0x0302:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25986n(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x0311:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25983k(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x0320:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25970f(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x032f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25976h(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x033e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25963d(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x034d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25959c(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x035c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25955b((int) r8, (java.util.List<java.lang.Float>) r7, (com.google.android.gms.internal.measurement.C8309k3) r14, (boolean) r5)
            goto L_0x04ae
        L_0x036b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.C8283f2.m25942a((int) r8, (java.util.List<java.lang.Double>) r7, (com.google.android.gms.internal.measurement.C8309k3) r14, (boolean) r5)
            goto L_0x04ae
        L_0x037a:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r7)
            com.google.android.gms.internal.measurement.d2 r8 = r12.m26213a((int) r1)
            r14.mo30166b((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.measurement.C8273d2) r8)
            goto L_0x04ae
        L_0x038f:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r13, r7)
            r14.mo30153a((int) r9, (long) r7)
            goto L_0x04ae
        L_0x03a0:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r13, (long) r7)
            r14.mo30173d((int) r9, (int) r7)
            goto L_0x04ae
        L_0x03b1:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r13, r7)
            r14.mo30171c((int) r9, (long) r7)
            goto L_0x04ae
        L_0x03c2:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r13, (long) r7)
            r14.mo30170c((int) r9, (int) r7)
            goto L_0x04ae
        L_0x03d3:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r13, (long) r7)
            r14.mo30152a((int) r9, (int) r7)
            goto L_0x04ae
        L_0x03e4:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r13, (long) r7)
            r14.mo30179f(r9, r7)
            goto L_0x04ae
        L_0x03f5:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r7)
            com.google.android.gms.internal.measurement.zzte r7 = (com.google.android.gms.internal.measurement.zzte) r7
            r14.mo30155a((int) r9, (com.google.android.gms.internal.measurement.zzte) r7)
            goto L_0x04ae
        L_0x0408:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r7)
            com.google.android.gms.internal.measurement.d2 r8 = r12.m26213a((int) r1)
            r14.mo30157a((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.measurement.C8273d2) r8)
            goto L_0x04ae
        L_0x041d:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r7)
            m26217a((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.measurement.C8309k3) r14)
            goto L_0x04ae
        L_0x042e:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = com.google.android.gms.internal.measurement.C8367y2.m26311c(r13, r7)
            r14.mo30162a((int) r9, (boolean) r7)
            goto L_0x04ae
        L_0x043f:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r13, (long) r7)
            r14.mo30176e((int) r9, (int) r7)
            goto L_0x04ae
        L_0x044f:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r13, r7)
            r14.mo30165b((int) r9, (long) r7)
            goto L_0x04ae
        L_0x045f:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r13, (long) r7)
            r14.mo30164b((int) r9, (int) r7)
            goto L_0x04ae
        L_0x046f:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r13, r7)
            r14.mo30177e((int) r9, (long) r7)
            goto L_0x04ae
        L_0x047f:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r13, r7)
            r14.mo30174d((int) r9, (long) r7)
            goto L_0x04ae
        L_0x048f:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = com.google.android.gms.internal.measurement.C8367y2.m26312d(r13, r7)
            r14.mo30151a((int) r9, (float) r7)
            goto L_0x04ae
        L_0x049f:
            boolean r8 = r12.m26221a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = com.google.android.gms.internal.measurement.C8367y2.m26317e(r13, r7)
            r14.mo30150a((int) r9, (double) r7)
        L_0x04ae:
            int r1 = r1 + -3
            goto L_0x0036
        L_0x04b2:
            com.google.android.gms.internal.measurement.u0<?> r13 = r12.f23363k
            r13.mo30233a((java.util.Map.Entry<?, ?>) r0)
            throw r3
        L_0x04b8:
            if (r0 != 0) goto L_0x04bb
            return
        L_0x04bb:
            com.google.android.gms.internal.measurement.u0<?> r13 = r12.f23363k
            r13.mo30235a(r14, r0)
            throw r3
        L_0x04c1:
            boolean r0 = r12.f23356d
            if (r0 == 0) goto L_0x0975
            boolean r0 = r12.f23355c
            if (r0 == 0) goto L_0x04e0
            com.google.android.gms.internal.measurement.u0<?> r0 = r12.f23363k
            com.google.android.gms.internal.measurement.x0 r0 = r0.mo30234a((java.lang.Object) r13)
            boolean r1 = r0.mo30258b()
            if (r1 != 0) goto L_0x04e0
            java.util.Iterator r0 = r0.mo30262e()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x04e1
        L_0x04e0:
            r0 = r3
        L_0x04e1:
            int[] r1 = r12.f23353a
            int r1 = r1.length
            r7 = 0
        L_0x04e5:
            if (r7 >= r1) goto L_0x0967
            int r8 = r12.m26232c((int) r7)
            int[] r9 = r12.f23353a
            r10 = r9[r7]
            if (r0 != 0) goto L_0x0961
            r11 = r8 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x094e;
                case 1: goto L_0x093e;
                case 2: goto L_0x092e;
                case 3: goto L_0x091e;
                case 4: goto L_0x090e;
                case 5: goto L_0x08fe;
                case 6: goto L_0x08ee;
                case 7: goto L_0x08dd;
                case 8: goto L_0x08cc;
                case 9: goto L_0x08b7;
                case 10: goto L_0x08a4;
                case 11: goto L_0x0893;
                case 12: goto L_0x0882;
                case 13: goto L_0x0871;
                case 14: goto L_0x0860;
                case 15: goto L_0x084f;
                case 16: goto L_0x083e;
                case 17: goto L_0x0829;
                case 18: goto L_0x081a;
                case 19: goto L_0x080b;
                case 20: goto L_0x07fc;
                case 21: goto L_0x07ed;
                case 22: goto L_0x07de;
                case 23: goto L_0x07cf;
                case 24: goto L_0x07c0;
                case 25: goto L_0x07b1;
                case 26: goto L_0x07a2;
                case 27: goto L_0x078f;
                case 28: goto L_0x0780;
                case 29: goto L_0x0771;
                case 30: goto L_0x0762;
                case 31: goto L_0x0753;
                case 32: goto L_0x0744;
                case 33: goto L_0x0735;
                case 34: goto L_0x0726;
                case 35: goto L_0x0717;
                case 36: goto L_0x0708;
                case 37: goto L_0x06f9;
                case 38: goto L_0x06ea;
                case 39: goto L_0x06db;
                case 40: goto L_0x06cc;
                case 41: goto L_0x06bd;
                case 42: goto L_0x06ae;
                case 43: goto L_0x069f;
                case 44: goto L_0x0690;
                case 45: goto L_0x0681;
                case 46: goto L_0x0672;
                case 47: goto L_0x0663;
                case 48: goto L_0x0654;
                case 49: goto L_0x0641;
                case 50: goto L_0x0636;
                case 51: goto L_0x0625;
                case 52: goto L_0x0614;
                case 53: goto L_0x0603;
                case 54: goto L_0x05f2;
                case 55: goto L_0x05e1;
                case 56: goto L_0x05d0;
                case 57: goto L_0x05bf;
                case 58: goto L_0x05ae;
                case 59: goto L_0x059d;
                case 60: goto L_0x0588;
                case 61: goto L_0x0575;
                case 62: goto L_0x0564;
                case 63: goto L_0x0553;
                case 64: goto L_0x0542;
                case 65: goto L_0x0531;
                case 66: goto L_0x0520;
                case 67: goto L_0x050f;
                case 68: goto L_0x04fa;
                default: goto L_0x04f8;
            }
        L_0x04f8:
            goto L_0x095d
        L_0x04fa:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r8)
            com.google.android.gms.internal.measurement.d2 r9 = r12.m26213a((int) r7)
            r14.mo30166b((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.C8273d2) r9)
            goto L_0x095d
        L_0x050f:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m26236e(r13, r8)
            r14.mo30153a((int) r10, (long) r8)
            goto L_0x095d
        L_0x0520:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m26235d(r13, r8)
            r14.mo30173d((int) r10, (int) r8)
            goto L_0x095d
        L_0x0531:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m26236e(r13, r8)
            r14.mo30171c((int) r10, (long) r8)
            goto L_0x095d
        L_0x0542:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m26235d(r13, r8)
            r14.mo30170c((int) r10, (int) r8)
            goto L_0x095d
        L_0x0553:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m26235d(r13, r8)
            r14.mo30152a((int) r10, (int) r8)
            goto L_0x095d
        L_0x0564:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m26235d(r13, r8)
            r14.mo30179f(r10, r8)
            goto L_0x095d
        L_0x0575:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r8)
            com.google.android.gms.internal.measurement.zzte r8 = (com.google.android.gms.internal.measurement.zzte) r8
            r14.mo30155a((int) r10, (com.google.android.gms.internal.measurement.zzte) r8)
            goto L_0x095d
        L_0x0588:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r8)
            com.google.android.gms.internal.measurement.d2 r9 = r12.m26213a((int) r7)
            r14.mo30157a((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.C8273d2) r9)
            goto L_0x095d
        L_0x059d:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r8)
            m26217a((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.C8309k3) r14)
            goto L_0x095d
        L_0x05ae:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = m26237f(r13, r8)
            r14.mo30162a((int) r10, (boolean) r8)
            goto L_0x095d
        L_0x05bf:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m26235d(r13, r8)
            r14.mo30176e((int) r10, (int) r8)
            goto L_0x095d
        L_0x05d0:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m26236e(r13, r8)
            r14.mo30165b((int) r10, (long) r8)
            goto L_0x095d
        L_0x05e1:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m26235d(r13, r8)
            r14.mo30164b((int) r10, (int) r8)
            goto L_0x095d
        L_0x05f2:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m26236e(r13, r8)
            r14.mo30177e((int) r10, (long) r8)
            goto L_0x095d
        L_0x0603:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m26236e(r13, r8)
            r14.mo30174d((int) r10, (long) r8)
            goto L_0x095d
        L_0x0614:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = m26231c(r13, r8)
            r14.mo30151a((int) r10, (float) r8)
            goto L_0x095d
        L_0x0625:
            boolean r9 = r12.m26222a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = m26225b(r13, (long) r8)
            r14.mo30150a((int) r10, (double) r8)
            goto L_0x095d
        L_0x0636:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r8)
            r12.m26218a((com.google.android.gms.internal.measurement.C8309k3) r14, (int) r10, (java.lang.Object) r8, (int) r7)
            goto L_0x095d
        L_0x0641:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.d2 r10 = r12.m26213a((int) r7)
            com.google.android.gms.internal.measurement.C8283f2.m25954b((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.measurement.C8309k3) r14, (com.google.android.gms.internal.measurement.C8273d2) r10)
            goto L_0x095d
        L_0x0654:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25967e(r9, r8, r14, r4)
            goto L_0x095d
        L_0x0663:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25982j(r9, r8, r14, r4)
            goto L_0x095d
        L_0x0672:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25973g(r9, r8, r14, r4)
            goto L_0x095d
        L_0x0681:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25984l(r9, r8, r14, r4)
            goto L_0x095d
        L_0x0690:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25985m(r9, r8, r14, r4)
            goto L_0x095d
        L_0x069f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25979i(r9, r8, r14, r4)
            goto L_0x095d
        L_0x06ae:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25986n(r9, r8, r14, r4)
            goto L_0x095d
        L_0x06bd:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25983k(r9, r8, r14, r4)
            goto L_0x095d
        L_0x06cc:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25970f(r9, r8, r14, r4)
            goto L_0x095d
        L_0x06db:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25976h(r9, r8, r14, r4)
            goto L_0x095d
        L_0x06ea:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25963d(r9, r8, r14, r4)
            goto L_0x095d
        L_0x06f9:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25959c(r9, r8, r14, r4)
            goto L_0x095d
        L_0x0708:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25955b((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.measurement.C8309k3) r14, (boolean) r4)
            goto L_0x095d
        L_0x0717:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25942a((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.measurement.C8309k3) r14, (boolean) r4)
            goto L_0x095d
        L_0x0726:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25967e(r9, r8, r14, r5)
            goto L_0x095d
        L_0x0735:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25982j(r9, r8, r14, r5)
            goto L_0x095d
        L_0x0744:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25973g(r9, r8, r14, r5)
            goto L_0x095d
        L_0x0753:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25984l(r9, r8, r14, r5)
            goto L_0x095d
        L_0x0762:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25985m(r9, r8, r14, r5)
            goto L_0x095d
        L_0x0771:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25979i(r9, r8, r14, r5)
            goto L_0x095d
        L_0x0780:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25953b((int) r9, (java.util.List<com.google.android.gms.internal.measurement.zzte>) r8, (com.google.android.gms.internal.measurement.C8309k3) r14)
            goto L_0x095d
        L_0x078f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.d2 r10 = r12.m26213a((int) r7)
            com.google.android.gms.internal.measurement.C8283f2.m25941a((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.measurement.C8309k3) r14, (com.google.android.gms.internal.measurement.C8273d2) r10)
            goto L_0x095d
        L_0x07a2:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25940a((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.measurement.C8309k3) r14)
            goto L_0x095d
        L_0x07b1:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25986n(r9, r8, r14, r5)
            goto L_0x095d
        L_0x07c0:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25983k(r9, r8, r14, r5)
            goto L_0x095d
        L_0x07cf:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25970f(r9, r8, r14, r5)
            goto L_0x095d
        L_0x07de:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25976h(r9, r8, r14, r5)
            goto L_0x095d
        L_0x07ed:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25963d(r9, r8, r14, r5)
            goto L_0x095d
        L_0x07fc:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25959c(r9, r8, r14, r5)
            goto L_0x095d
        L_0x080b:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25955b((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.measurement.C8309k3) r14, (boolean) r5)
            goto L_0x095d
        L_0x081a:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.measurement.C8283f2.m25942a((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.measurement.C8309k3) r14, (boolean) r5)
            goto L_0x095d
        L_0x0829:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r8)
            com.google.android.gms.internal.measurement.d2 r9 = r12.m26213a((int) r7)
            r14.mo30166b((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.C8273d2) r9)
            goto L_0x095d
        L_0x083e:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r13, r8)
            r14.mo30153a((int) r10, (long) r8)
            goto L_0x095d
        L_0x084f:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r13, (long) r8)
            r14.mo30173d((int) r10, (int) r8)
            goto L_0x095d
        L_0x0860:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r13, r8)
            r14.mo30171c((int) r10, (long) r8)
            goto L_0x095d
        L_0x0871:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r13, (long) r8)
            r14.mo30170c((int) r10, (int) r8)
            goto L_0x095d
        L_0x0882:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r13, (long) r8)
            r14.mo30152a((int) r10, (int) r8)
            goto L_0x095d
        L_0x0893:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r13, (long) r8)
            r14.mo30179f(r10, r8)
            goto L_0x095d
        L_0x08a4:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r8)
            com.google.android.gms.internal.measurement.zzte r8 = (com.google.android.gms.internal.measurement.zzte) r8
            r14.mo30155a((int) r10, (com.google.android.gms.internal.measurement.zzte) r8)
            goto L_0x095d
        L_0x08b7:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r8)
            com.google.android.gms.internal.measurement.d2 r9 = r12.m26213a((int) r7)
            r14.mo30157a((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.C8273d2) r9)
            goto L_0x095d
        L_0x08cc:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.measurement.C8367y2.m26320f(r13, r8)
            m26217a((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.measurement.C8309k3) r14)
            goto L_0x095d
        L_0x08dd:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = com.google.android.gms.internal.measurement.C8367y2.m26311c(r13, r8)
            r14.mo30162a((int) r10, (boolean) r8)
            goto L_0x095d
        L_0x08ee:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r13, (long) r8)
            r14.mo30176e((int) r10, (int) r8)
            goto L_0x095d
        L_0x08fe:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r13, r8)
            r14.mo30165b((int) r10, (long) r8)
            goto L_0x095d
        L_0x090e:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.measurement.C8367y2.m26290a((java.lang.Object) r13, (long) r8)
            r14.mo30164b((int) r10, (int) r8)
            goto L_0x095d
        L_0x091e:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r13, r8)
            r14.mo30177e((int) r10, (long) r8)
            goto L_0x095d
        L_0x092e:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.measurement.C8367y2.m26303b(r13, r8)
            r14.mo30174d((int) r10, (long) r8)
            goto L_0x095d
        L_0x093e:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = com.google.android.gms.internal.measurement.C8367y2.m26312d(r13, r8)
            r14.mo30151a((int) r10, (float) r8)
            goto L_0x095d
        L_0x094e:
            boolean r9 = r12.m26221a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = com.google.android.gms.internal.measurement.C8367y2.m26317e(r13, r8)
            r14.mo30150a((int) r10, (double) r8)
        L_0x095d:
            int r7 = r7 + 3
            goto L_0x04e5
        L_0x0961:
            com.google.android.gms.internal.measurement.u0<?> r13 = r12.f23363k
            r13.mo30233a((java.util.Map.Entry<?, ?>) r0)
            throw r3
        L_0x0967:
            if (r0 != 0) goto L_0x096f
            com.google.android.gms.internal.measurement.u2<?, ?> r0 = r12.f23362j
            m26219a(r0, r13, (com.google.android.gms.internal.measurement.C8309k3) r14)
            return
        L_0x096f:
            com.google.android.gms.internal.measurement.u0<?> r13 = r12.f23363k
            r13.mo30235a(r14, r0)
            throw r3
        L_0x0975:
            r12.m26229b(r13, (com.google.android.gms.internal.measurement.C8309k3) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C8354v1.mo30088a(java.lang.Object, com.google.android.gms.internal.measurement.k3):void");
    }

    /* renamed from: b */
    private final Object m26226b(int i) {
        return this.f23354b[(i / 3) << 1];
    }

    /* renamed from: b */
    public final void mo30090b(T t) {
        int i;
        int i2 = this.f23359g;
        while (true) {
            i = this.f23360h;
            if (i2 >= i) {
                break;
            }
            long c = (long) (m26232c(this.f23358f[i2]) & 1048575);
            Object f = C8367y2.m26320f(t, c);
            if (f != null) {
                C8367y2.m26298a((Object) t, c, this.f23364l.mo30220a(f));
            }
            i2++;
        }
        int length = this.f23358f.length;
        while (i < length) {
            this.f23361i.mo30112a(t, (long) this.f23358f[i]);
            i++;
        }
        this.f23362j.mo30246d(t);
        if (this.f23355c) {
            this.f23363k.mo30238c(t);
        }
    }

    /* renamed from: b */
    private static <T> double m26225b(T t, long j) {
        return ((Double) C8367y2.m26320f(t, j)).doubleValue();
    }

    /* renamed from: b */
    private final void m26227b(T t, int i) {
        if (!this.f23356d) {
            int d = m26234d(i);
            long j = (long) (d & 1048575);
            C8367y2.m26296a((Object) t, j, C8367y2.m26290a((Object) t, j) | (1 << (d >>> 20)));
        }
    }

    /* renamed from: b */
    private final void m26228b(T t, int i, int i2) {
        C8367y2.m26296a((Object) t, (long) (m26234d(i2) & 1048575), i);
    }

    /* renamed from: c */
    private final int m26232c(int i) {
        return this.f23353a[i + 1];
    }

    /* renamed from: c */
    private static <T> float m26231c(T t, long j) {
        return ((Float) C8367y2.m26320f(t, j)).floatValue();
    }

    /* renamed from: c */
    private final boolean m26233c(T t, T t2, int i) {
        return m26221a(t, i) == m26221a(t2, i);
    }

    /* renamed from: a */
    private final <K, V> void m26218a(C8309k3 k3Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            k3Var.mo30154a(i, this.f23364l.mo30222b(m26226b(i2)), this.f23364l.mo30223c(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m26219a(C8351u2<UT, UB> u2Var, T t, C8309k3 k3Var) throws IOException {
        u2Var.mo30240a(u2Var.mo30242b(t), k3Var);
    }

    /* renamed from: a */
    private final C8273d2 m26213a(int i) {
        int i2 = (i / 3) << 1;
        C8273d2 d2Var = (C8273d2) this.f23354b[i2];
        if (d2Var != null) {
            return d2Var;
        }
        C8273d2 a = C8263b2.m25892a().mo30064a((Class) this.f23354b[i2 + 1]);
        this.f23354b[i2] = a;
        return a;
    }

    /* renamed from: a */
    private static boolean m26224a(Object obj, int i, C8273d2 d2Var) {
        return d2Var.mo30093d(C8367y2.m26320f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m26217a(int i, Object obj, C8309k3 k3Var) throws IOException {
        if (obj instanceof String) {
            k3Var.mo30158a(i, (String) obj);
        } else {
            k3Var.mo30155a(i, (zzte) obj);
        }
    }

    /* renamed from: a */
    private final boolean m26223a(T t, int i, int i2, int i3) {
        if (this.f23356d) {
            return m26221a(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    private final boolean m26221a(T t, int i) {
        if (this.f23356d) {
            int c = m26232c(i);
            long j = (long) (c & 1048575);
            switch ((c & 267386880) >>> 20) {
                case 0:
                    return C8367y2.m26317e(t, j) != 0.0d;
                case 1:
                    return C8367y2.m26312d(t, j) != 0.0f;
                case 2:
                    return C8367y2.m26303b(t, j) != 0;
                case 3:
                    return C8367y2.m26303b(t, j) != 0;
                case 4:
                    return C8367y2.m26290a((Object) t, j) != 0;
                case 5:
                    return C8367y2.m26303b(t, j) != 0;
                case 6:
                    return C8367y2.m26290a((Object) t, j) != 0;
                case 7:
                    return C8367y2.m26311c(t, j);
                case 8:
                    Object f = C8367y2.m26320f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof zzte) {
                        return !zzte.f23433g.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C8367y2.m26320f(t, j) != null;
                case 10:
                    return !zzte.f23433g.equals(C8367y2.m26320f(t, j));
                case 11:
                    return C8367y2.m26290a((Object) t, j) != 0;
                case 12:
                    return C8367y2.m26290a((Object) t, j) != 0;
                case 13:
                    return C8367y2.m26290a((Object) t, j) != 0;
                case 14:
                    return C8367y2.m26303b(t, j) != 0;
                case 15:
                    return C8367y2.m26290a((Object) t, j) != 0;
                case 16:
                    return C8367y2.m26303b(t, j) != 0;
                case 17:
                    return C8367y2.m26320f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int d = m26234d(i);
            return (C8367y2.m26290a((Object) t, (long) (d & 1048575)) & (1 << (d >>> 20))) != 0;
        }
    }

    /* renamed from: a */
    private final boolean m26222a(T t, int i, int i2) {
        return C8367y2.m26290a((Object) t, (long) (m26234d(i2) & 1048575)) == i;
    }
}
