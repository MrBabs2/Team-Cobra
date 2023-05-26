package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.bw */
final class C7337bw<T> implements C7784nw<T> {

    /* renamed from: r */
    private static final int[] f14665r = new int[0];

    /* renamed from: s */
    private static final Unsafe f14666s = C7596ix.m17227d();

    /* renamed from: a */
    private final int[] f14667a;

    /* renamed from: b */
    private final Object[] f14668b;

    /* renamed from: c */
    private final int f14669c;

    /* renamed from: d */
    private final int f14670d;

    /* renamed from: e */
    private final zzdpk f14671e;

    /* renamed from: f */
    private final boolean f14672f;

    /* renamed from: g */
    private final boolean f14673g;

    /* renamed from: h */
    private final boolean f14674h;

    /* renamed from: i */
    private final boolean f14675i;

    /* renamed from: j */
    private final int[] f14676j;

    /* renamed from: k */
    private final int f14677k;

    /* renamed from: l */
    private final int f14678l;

    /* renamed from: m */
    private final C7448ew f14679m;

    /* renamed from: n */
    private final C7709lv f14680n;

    /* renamed from: o */
    private final C7449ex<?, ?> f14681o;

    /* renamed from: p */
    private final C8115wu<?> f14682p;

    /* renamed from: q */
    private final C8079vv f14683q;

    private C7337bw(int[] iArr, Object[] objArr, int i, int i2, zzdpk zzdpk, boolean z, boolean z2, int[] iArr2, int i3, int i4, C7448ew ewVar, C7709lv lvVar, C7449ex<?, ?> exVar, C8115wu<?> wuVar, C8079vv vvVar) {
        this.f14667a = iArr;
        this.f14668b = objArr;
        this.f14669c = i;
        this.f14670d = i2;
        this.f14673g = zzdpk instanceof zzdob;
        this.f14674h = z;
        this.f14672f = wuVar != null && wuVar.mo26749a(zzdpk);
        this.f14675i = false;
        this.f14676j = iArr2;
        this.f14677k = i3;
        this.f14678l = i4;
        this.f14679m = ewVar;
        this.f14680n = lvVar;
        this.f14681o = exVar;
        this.f14682p = wuVar;
        this.f14671e = zzdpk;
        this.f14683q = vvVar;
    }

    /* renamed from: a */
    static <T> C7337bw<T> m16655a(Class<T> cls, C8190yv yvVar, C7448ew ewVar, C7709lv lvVar, C7449ex<?, ?> exVar, C8115wu<?> wuVar, C8079vv vvVar) {
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
        C7673kw kwVar;
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
        C8190yv yvVar2 = yvVar;
        if (yvVar2 instanceof C7673kw) {
            C7673kw kwVar2 = (C7673kw) yvVar2;
            char c9 = 0;
            boolean z2 = kwVar2.mo25606c() == zzdob.zze.f21583j;
            String d = kwVar2.mo26187d();
            int length = d.length();
            char charAt15 = d.charAt(0);
            if (charAt15 >= 55296) {
                char c10 = charAt15 & 8191;
                int i24 = 1;
                int i25 = 13;
                while (true) {
                    i = i24 + 1;
                    charAt14 = d.charAt(i24);
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
            char charAt16 = d.charAt(i);
            if (charAt16 >= 55296) {
                char c11 = charAt16 & 8191;
                int i27 = 13;
                while (true) {
                    i23 = i26 + 1;
                    charAt13 = d.charAt(i26);
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
                iArr = f14665r;
                c5 = 0;
                c4 = 0;
                c3 = 0;
                i2 = 0;
                c2 = 0;
                c = 0;
            } else {
                int i28 = i26 + 1;
                char charAt17 = d.charAt(i26);
                if (charAt17 >= 55296) {
                    char c12 = charAt17 & 8191;
                    int i29 = 13;
                    while (true) {
                        i22 = i28 + 1;
                        charAt12 = d.charAt(i28);
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
                char charAt18 = d.charAt(i28);
                if (charAt18 >= 55296) {
                    char c13 = charAt18 & 8191;
                    int i31 = 13;
                    while (true) {
                        i21 = i30 + 1;
                        charAt11 = d.charAt(i30);
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
                c3 = d.charAt(i30);
                if (c3 >= 55296) {
                    char c14 = c3 & 8191;
                    int i33 = 13;
                    while (true) {
                        i20 = i32 + 1;
                        charAt10 = d.charAt(i32);
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
                char charAt19 = d.charAt(i32);
                if (charAt19 >= 55296) {
                    char c15 = charAt19 & 8191;
                    int i35 = 13;
                    while (true) {
                        i19 = i34 + 1;
                        charAt9 = d.charAt(i34);
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
                c2 = d.charAt(i34);
                if (c2 >= 55296) {
                    char c16 = c2 & 8191;
                    int i37 = 13;
                    while (true) {
                        i18 = i36 + 1;
                        charAt8 = d.charAt(i36);
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
                char charAt20 = d.charAt(i36);
                if (charAt20 >= 55296) {
                    char c17 = charAt20 & 8191;
                    int i39 = 13;
                    while (true) {
                        i17 = i38 + 1;
                        charAt7 = d.charAt(i38);
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
                char charAt21 = d.charAt(i38);
                if (charAt21 >= 55296) {
                    char c18 = charAt21 & 8191;
                    int i41 = i40;
                    int i42 = 13;
                    while (true) {
                        i16 = i41 + 1;
                        charAt6 = d.charAt(i41);
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
                char charAt22 = d.charAt(i14);
                if (charAt22 >= 55296) {
                    char c19 = charAt22 & 8191;
                    int i44 = i43;
                    int i45 = 13;
                    while (true) {
                        i15 = i44 + 1;
                        charAt5 = d.charAt(i44);
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
            Unsafe unsafe = f14666s;
            Object[] e = kwVar2.mo26188e();
            Class<?> cls3 = kwVar2.mo25605b().getClass();
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
                int charAt23 = d.charAt(i49);
                int i54 = length;
                if (charAt23 >= 55296) {
                    int i55 = charAt23 & 8191;
                    int i56 = i53;
                    int i57 = 13;
                    while (true) {
                        i13 = i56 + 1;
                        charAt4 = d.charAt(i56);
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
                char charAt24 = d.charAt(i3);
                int i59 = i58;
                if (charAt24 >= 55296) {
                    char c22 = charAt24 & 8191;
                    int i60 = i59;
                    int i61 = 13;
                    while (true) {
                        i12 = i60 + 1;
                        charAt3 = d.charAt(i60);
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
                    char charAt25 = d.charAt(i4);
                    char c26 = 55296;
                    if (charAt25 >= 55296) {
                        char c27 = charAt25 & 8191;
                        int i63 = 13;
                        while (true) {
                            i11 = i62 + 1;
                            charAt2 = d.charAt(i62);
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
                        objArr[((i52 / 3) << 1) + 1] = e[i2];
                        i2++;
                    } else if (i64 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i52 / 3) << 1) + 1] = e[i2];
                        i2++;
                    }
                    int i66 = charAt25 << 1;
                    Object obj = e[i66];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = m16659a(cls3, (String) obj);
                        e[i66] = field2;
                    }
                    kwVar = kwVar2;
                    String str2 = d;
                    i8 = (int) unsafe.objectFieldOffset(field2);
                    int i67 = i66 + 1;
                    Object obj2 = e[i67];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = m16659a(cls3, (String) obj2);
                        e[i67] = field3;
                    }
                    cls2 = cls3;
                    i5 = i2;
                    i4 = i65;
                    str = str2;
                    i6 = 0;
                    i7 = (int) unsafe.objectFieldOffset(field3);
                    c7 = c9;
                } else {
                    kwVar = kwVar2;
                    String str3 = d;
                    int i68 = i2 + 1;
                    Field a = m16659a(cls3, (String) e[i2]);
                    if (c23 == 9 || c23 == 17) {
                        c8 = 1;
                        objArr[((i52 / 3) << 1) + 1] = a.getType();
                    } else {
                        if (c23 == 27 || c23 == '1') {
                            c8 = 1;
                            i10 = i68 + 1;
                            objArr[((i52 / 3) << 1) + 1] = e[i68];
                        } else if (c23 == 12 || c23 == 30 || c23 == ',') {
                            c8 = 1;
                            if ((charAt15 & 1) == 1) {
                                i10 = i68 + 1;
                                objArr[((i52 / 3) << 1) + 1] = e[i68];
                            }
                        } else {
                            if (c23 == '2') {
                                int i69 = c21 + 1;
                                iArr[c21] = i52;
                                int i70 = (i52 / 3) << 1;
                                int i71 = i68 + 1;
                                objArr[i70] = e[i68];
                                if ((charAt24 & 2048) != 0) {
                                    i68 = i71 + 1;
                                    objArr[i70 + 1] = e[i71];
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
                    i8 = (int) unsafe.objectFieldOffset(a);
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
                        Object obj3 = e[i74];
                        i5 = i68;
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = m16659a(cls3, (String) obj3);
                            e[i74] = field;
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
                d = str;
                i49 = i4;
                cls3 = cls2;
                c4 = c24;
                length = i54;
                c = c6;
                z2 = z;
                c3 = c25;
                i2 = i5;
                kwVar2 = kwVar;
            }
            char c29 = c4;
            boolean z3 = z2;
            return new C7337bw(iArr2, objArr, c3, c4, kwVar2.mo25605b(), z2, false, iArr, c, i48, ewVar, lvVar, exVar, wuVar, vvVar);
        }
        ((C7301ax) yvVar2).mo25606c();
        throw null;
    }

    /* renamed from: e */
    private static zzdqu m16684e(Object obj) {
        zzdob zzdob = (zzdob) obj;
        zzdqu zzdqu = zzdob.zzhhd;
        if (zzdqu != zzdqu.m24095d()) {
            return zzdqu;
        }
        zzdqu e = zzdqu.m24096e();
        zzdob.zzhhd = e;
        return e;
    }

    /* renamed from: f */
    private static boolean m16685f(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: f */
    private static <T> boolean m16686f(T t, long j) {
        return ((Boolean) C7596ix.m17234f(t, j)).booleanValue();
    }

    /* renamed from: g */
    private final int m16687g(int i) {
        if (i < this.f14669c || i > this.f14670d) {
            return -1;
        }
        return m16671b(i, 0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.ads.C7858pw.m17935a(com.google.android.gms.internal.ads.C7596ix.m17234f(r10, r6), com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.ads.C7596ix.m17217b(r10, r6) == com.google.android.gms.internal.ads.C7596ix.m17217b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.ads.C7596ix.m17217b(r10, r6) == com.google.android.gms.internal.ads.C7596ix.m17217b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.ads.C7858pw.m17935a(com.google.android.gms.internal.ads.C7596ix.m17234f(r10, r6), com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.ads.C7858pw.m17935a(com.google.android.gms.internal.ads.C7596ix.m17234f(r10, r6), com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.ads.C7858pw.m17935a(com.google.android.gms.internal.ads.C7596ix.m17234f(r10, r6), com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.ads.C7596ix.m17225c(r10, r6) == com.google.android.gms.internal.ads.C7596ix.m17225c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.ads.C7596ix.m17217b(r10, r6) == com.google.android.gms.internal.ads.C7596ix.m17217b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.ads.C7596ix.m17217b(r10, r6) == com.google.android.gms.internal.ads.C7596ix.m17217b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.ads.C7596ix.m17217b(r10, r6) == com.google.android.gms.internal.ads.C7596ix.m17217b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.C7596ix.m17226d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.C7596ix.m17226d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.C7596ix.m17231e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.C7596ix.m17231e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.ads.C7858pw.m17935a(com.google.android.gms.internal.ads.C7596ix.m17234f(r10, r6), com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25750b(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f14667a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.m16680d((int) r2)
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
            int r4 = r9.m16682e((int) r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, (long) r4)
            int r4 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, (long) r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.C7596ix.m17234f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.C7858pw.m17935a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7596ix.m17234f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.C7858pw.m17935a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7596ix.m17234f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.C7858pw.m17935a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.C7596ix.m17234f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.C7858pw.m17935a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.C7596ix.m17217b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C7596ix.m17217b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.C7596ix.m17217b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C7596ix.m17217b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.C7596ix.m17234f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.C7858pw.m17935a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.C7596ix.m17234f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.C7858pw.m17935a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.C7596ix.m17234f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.C7858pw.m17935a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.ads.C7596ix.m17225c(r10, r6)
            boolean r5 = com.google.android.gms.internal.ads.C7596ix.m17225c(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.C7596ix.m17217b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C7596ix.m17217b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.C7596ix.m17217b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C7596ix.m17217b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.C7596ix.m17217b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C7596ix.m17217b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.ads.C7596ix.m17226d(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.ads.C7596ix.m17226d(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.m16679c(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.ads.C7596ix.m17231e(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.ads.C7596ix.m17231e(r11, r6)
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
            com.google.android.gms.internal.ads.ex<?, ?> r0 = r9.f14681o
            java.lang.Object r0 = r0.mo25900d(r10)
            com.google.android.gms.internal.ads.ex<?, ?> r2 = r9.f14681o
            java.lang.Object r2 = r2.mo25900d(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f14672f
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.ads.wu<?> r0 = r9.f14682p
            com.google.android.gms.internal.ads.zu r10 = r0.mo26750b(r10)
            com.google.android.gms.internal.ads.wu<?> r0 = r9.f14682p
            com.google.android.gms.internal.ads.zu r11 = r0.mo26750b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7337bw.mo25750b(java.lang.Object, java.lang.Object):boolean");
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
    public final int mo25751c(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f14674h
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x04f2
            sun.misc.Unsafe r2 = f14666s
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f14667a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x04ea
            int r14 = r0.m16680d((int) r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f14667a
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.ads.zzdnv r14 = com.google.android.gms.internal.ads.zzdnv.f21532P
            int r14 = r14.mo29127a()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.ads.zzdnv r14 = com.google.android.gms.internal.ads.zzdnv.f21545c0
            int r14 = r14.mo29127a()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f14667a
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
            boolean r14 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r1, r5)
            com.google.android.gms.internal.ads.zzdpk r5 = (com.google.android.gms.internal.ads.zzdpk) r5
            com.google.android.gms.internal.ads.nw r6 = r0.m16656a((int) r12)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23828c((int) r3, (com.google.android.gms.internal.ads.zzdpk) r5, (com.google.android.gms.internal.ads.C7784nw) r6)
            goto L_0x03c9
        L_0x005d:
            boolean r14 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m16683e(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23840f((int) r3, (long) r5)
            goto L_0x03c9
        L_0x006d:
            boolean r14 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m16681d(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23847h((int) r3, (int) r5)
            goto L_0x03c9
        L_0x007d:
            boolean r5 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzdni.m23848h((int) r3, (long) r9)
            goto L_0x03c9
        L_0x0089:
            boolean r5 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzdni.m23854j(r3, r11)
            goto L_0x03c9
        L_0x0095:
            boolean r14 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m16681d(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23856k(r3, r5)
            goto L_0x03c9
        L_0x00a5:
            boolean r14 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m16681d(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23843g((int) r3, (int) r5)
            goto L_0x03c9
        L_0x00b5:
            boolean r14 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r1, r5)
            com.google.android.gms.internal.ads.zzdmr r5 = (com.google.android.gms.internal.ads.zzdmr) r5
            int r3 = com.google.android.gms.internal.ads.zzdni.m23826c((int) r3, (com.google.android.gms.internal.ads.zzdmr) r5)
            goto L_0x03c9
        L_0x00c7:
            boolean r14 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r1, r5)
            com.google.android.gms.internal.ads.nw r6 = r0.m16656a((int) r12)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17919a((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.ads.C7784nw) r6)
            goto L_0x03c9
        L_0x00db:
            boolean r14 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzdmr
            if (r6 == 0) goto L_0x00f1
            com.google.android.gms.internal.ads.zzdmr r5 = (com.google.android.gms.internal.ads.zzdmr) r5
            int r3 = com.google.android.gms.internal.ads.zzdni.m23826c((int) r3, (com.google.android.gms.internal.ads.zzdmr) r5)
            goto L_0x03c9
        L_0x00f1:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.zzdni.m23819b((int) r3, (java.lang.String) r5)
            goto L_0x03c9
        L_0x00f9:
            boolean r5 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzdni.m23820b((int) r3, (boolean) r7)
            goto L_0x03c9
        L_0x0105:
            boolean r5 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzdni.m23851i(r3, r11)
            goto L_0x03c9
        L_0x0111:
            boolean r5 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzdni.m23844g((int) r3, (long) r9)
            goto L_0x03c9
        L_0x011d:
            boolean r14 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m16681d(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23839f((int) r3, (int) r5)
            goto L_0x03c9
        L_0x012d:
            boolean r14 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m16683e(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23836e((int) r3, (long) r5)
            goto L_0x03c9
        L_0x013d:
            boolean r14 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m16683e(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23830d((int) r3, (long) r5)
            goto L_0x03c9
        L_0x014d:
            boolean r5 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzdni.m23816b((int) r3, (float) r4)
            goto L_0x03c9
        L_0x0159:
            boolean r5 = r0.m16667a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.zzdni.m23815b((int) r3, (double) r5)
            goto L_0x03c9
        L_0x0167:
            com.google.android.gms.internal.ads.vv r14 = r0.f14683q
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r1, r5)
            java.lang.Object r6 = r0.m16672b((int) r12)
            int r3 = r14.mo26702a(r3, r5, r6)
            goto L_0x03c9
        L_0x0177:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.ads.nw r6 = r0.m16656a((int) r12)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17937b((int) r3, (java.util.List<com.google.android.gms.internal.ads.zzdpk>) r5, (com.google.android.gms.internal.ads.C7784nw) r6)
            goto L_0x03c9
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17923a((java.util.List<java.lang.Long>) r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x0199
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0199:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x01a3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17953e(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x01b7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01b7:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x01c1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17960g(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x01d5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01d5:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x01df:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17957f(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x01f3
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f3:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17939b(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x021b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17949d(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x022f
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x022f:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x0239:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17963h(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x024d
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x024d:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17957f(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x026b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x026b:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17960g(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x0289
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0289:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17945c(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x02a7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02a7:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17969j(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x02c5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02c5:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17966i(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x02e2
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02e2:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17957f(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x02ff
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02ff:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C7858pw.m17960g(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f14675i
            if (r6 == 0) goto L_0x031c
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x031c:
            int r3 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r3)
            int r6 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r5)
        L_0x0324:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x03c9
        L_0x0328:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17944c(r3, r5, r11)
            goto L_0x03c9
        L_0x0332:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17959g(r3, r5, r11)
            goto L_0x03c9
        L_0x033c:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17965i(r3, r5, r11)
            goto L_0x03c9
        L_0x0346:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17962h(r3, r5, r11)
            goto L_0x03c9
        L_0x0350:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17948d(r3, r5, r11)
            goto L_0x03c9
        L_0x035a:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17956f(r3, r5, r11)
            goto L_0x03c9
        L_0x0363:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17936b(r3, r5)
            goto L_0x03c9
        L_0x036c:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.ads.nw r6 = r0.m16656a((int) r12)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17921a((int) r3, (java.util.List<?>) r5, (com.google.android.gms.internal.ads.C7784nw) r6)
            goto L_0x03c9
        L_0x0379:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17920a((int) r3, (java.util.List<?>) r5)
            goto L_0x03c9
        L_0x0382:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17968j(r3, r5, r11)
            goto L_0x03c9
        L_0x038b:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17962h(r3, r5, r11)
            goto L_0x03c9
        L_0x0394:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17965i(r3, r5, r11)
            goto L_0x03c9
        L_0x039d:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17952e(r3, r5, r11)
            goto L_0x03c9
        L_0x03a6:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17938b((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x03c9
        L_0x03af:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17922a((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x03c9
        L_0x03b8:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17962h(r3, r5, r11)
            goto L_0x03c9
        L_0x03c1:
            java.util.List r5 = m16660a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17965i(r3, r5, r11)
        L_0x03c9:
            int r13 = r13 + r3
            goto L_0x04e4
        L_0x03cc:
            boolean r14 = r0.m16666a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r1, r5)
            com.google.android.gms.internal.ads.zzdpk r5 = (com.google.android.gms.internal.ads.zzdpk) r5
            com.google.android.gms.internal.ads.nw r6 = r0.m16656a((int) r12)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23828c((int) r3, (com.google.android.gms.internal.ads.zzdpk) r5, (com.google.android.gms.internal.ads.C7784nw) r6)
            goto L_0x03c9
        L_0x03e1:
            boolean r14 = r0.m16666a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.ads.C7596ix.m17217b(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23840f((int) r3, (long) r5)
            goto L_0x03c9
        L_0x03f0:
            boolean r14 = r0.m16666a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23847h((int) r3, (int) r5)
            goto L_0x03c9
        L_0x03ff:
            boolean r5 = r0.m16666a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzdni.m23848h((int) r3, (long) r9)
            goto L_0x03c9
        L_0x040a:
            boolean r5 = r0.m16666a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzdni.m23854j(r3, r11)
            goto L_0x03c9
        L_0x0415:
            boolean r14 = r0.m16666a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23856k(r3, r5)
            goto L_0x03c9
        L_0x0424:
            boolean r14 = r0.m16666a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23843g((int) r3, (int) r5)
            goto L_0x03c9
        L_0x0433:
            boolean r14 = r0.m16666a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r1, r5)
            com.google.android.gms.internal.ads.zzdmr r5 = (com.google.android.gms.internal.ads.zzdmr) r5
            int r3 = com.google.android.gms.internal.ads.zzdni.m23826c((int) r3, (com.google.android.gms.internal.ads.zzdmr) r5)
            goto L_0x03c9
        L_0x0444:
            boolean r14 = r0.m16666a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r1, r5)
            com.google.android.gms.internal.ads.nw r6 = r0.m16656a((int) r12)
            int r3 = com.google.android.gms.internal.ads.C7858pw.m17919a((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.ads.C7784nw) r6)
            goto L_0x03c9
        L_0x0458:
            boolean r14 = r0.m16666a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzdmr
            if (r6 == 0) goto L_0x046e
            com.google.android.gms.internal.ads.zzdmr r5 = (com.google.android.gms.internal.ads.zzdmr) r5
            int r3 = com.google.android.gms.internal.ads.zzdni.m23826c((int) r3, (com.google.android.gms.internal.ads.zzdmr) r5)
            goto L_0x03c9
        L_0x046e:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.zzdni.m23819b((int) r3, (java.lang.String) r5)
            goto L_0x03c9
        L_0x0476:
            boolean r5 = r0.m16666a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzdni.m23820b((int) r3, (boolean) r7)
            goto L_0x03c9
        L_0x0482:
            boolean r5 = r0.m16666a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzdni.m23851i(r3, r11)
            goto L_0x03c9
        L_0x048e:
            boolean r5 = r0.m16666a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzdni.m23844g((int) r3, (long) r9)
            goto L_0x03c9
        L_0x049a:
            boolean r14 = r0.m16666a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23839f((int) r3, (int) r5)
            goto L_0x03c9
        L_0x04aa:
            boolean r14 = r0.m16666a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.ads.C7596ix.m17217b(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23836e((int) r3, (long) r5)
            goto L_0x03c9
        L_0x04ba:
            boolean r14 = r0.m16666a(r1, (int) r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.ads.C7596ix.m17217b(r1, r5)
            int r3 = com.google.android.gms.internal.ads.zzdni.m23830d((int) r3, (long) r5)
            goto L_0x03c9
        L_0x04ca:
            boolean r5 = r0.m16666a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.ads.zzdni.m23816b((int) r3, (float) r4)
            goto L_0x03c9
        L_0x04d6:
            boolean r5 = r0.m16666a(r1, (int) r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.zzdni.m23815b((int) r3, (double) r5)
            goto L_0x03c9
        L_0x04e4:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x04ea:
            com.google.android.gms.internal.ads.ex<?, ?> r2 = r0.f14681o
            int r1 = m16650a(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x04f2:
            sun.misc.Unsafe r2 = f14666s
            r3 = -1
            r5 = 0
            r6 = 0
            r12 = 0
        L_0x04f8:
            int[] r13 = r0.f14667a
            int r13 = r13.length
            if (r5 >= r13) goto L_0x0a24
            int r13 = r0.m16680d((int) r5)
            int[] r14 = r0.f14667a
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
            boolean r9 = r0.f14675i
            if (r9 == 0) goto L_0x053f
            com.google.android.gms.internal.ads.zzdnv r9 = com.google.android.gms.internal.ads.zzdnv.f21532P
            int r9 = r9.mo29127a()
            if (r4 < r9) goto L_0x053f
            com.google.android.gms.internal.ads.zzdnv r9 = com.google.android.gms.internal.ads.zzdnv.f21545c0
            int r9 = r9.mo29127a()
            if (r4 > r9) goto L_0x053f
            int[] r9 = r0.f14667a
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
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.ads.zzdpk r4 = (com.google.android.gms.internal.ads.zzdpk) r4
            com.google.android.gms.internal.ads.nw r9 = r0.m16656a((int) r5)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23828c((int) r15, (com.google.android.gms.internal.ads.zzdpk) r4, (com.google.android.gms.internal.ads.C7784nw) r9)
            goto L_0x0907
        L_0x0560:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            long r9 = m16683e(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23840f((int) r15, (long) r9)
            goto L_0x0907
        L_0x0570:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = m16681d(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23847h((int) r15, (int) r4)
            goto L_0x0907
        L_0x0580:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzdni.m23848h((int) r15, (long) r9)
            goto L_0x0907
        L_0x058e:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzdni.m23854j(r15, r4)
            goto L_0x0951
        L_0x059b:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = m16681d(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23856k(r15, r4)
            goto L_0x0907
        L_0x05ab:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = m16681d(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23843g((int) r15, (int) r4)
            goto L_0x0907
        L_0x05bb:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.ads.zzdmr r4 = (com.google.android.gms.internal.ads.zzdmr) r4
            int r4 = com.google.android.gms.internal.ads.zzdni.m23826c((int) r15, (com.google.android.gms.internal.ads.zzdmr) r4)
            goto L_0x0907
        L_0x05cd:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.ads.nw r9 = r0.m16656a((int) r5)
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17919a((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C7784nw) r9)
            goto L_0x0907
        L_0x05e1:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.ads.zzdmr
            if (r9 == 0) goto L_0x05f7
            com.google.android.gms.internal.ads.zzdmr r4 = (com.google.android.gms.internal.ads.zzdmr) r4
            int r4 = com.google.android.gms.internal.ads.zzdni.m23826c((int) r15, (com.google.android.gms.internal.ads.zzdmr) r4)
            goto L_0x0907
        L_0x05f7:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.zzdni.m23819b((int) r15, (java.lang.String) r4)
            goto L_0x0907
        L_0x05ff:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = com.google.android.gms.internal.ads.zzdni.m23820b((int) r15, (boolean) r7)
            goto L_0x0907
        L_0x060b:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzdni.m23851i(r15, r4)
            goto L_0x0951
        L_0x0618:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzdni.m23844g((int) r15, (long) r9)
            goto L_0x0907
        L_0x0626:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            int r4 = m16681d(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23839f((int) r15, (int) r4)
            goto L_0x0907
        L_0x0636:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            long r9 = m16683e(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23836e((int) r15, (long) r9)
            goto L_0x0907
        L_0x0646:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            long r9 = m16683e(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23830d((int) r15, (long) r9)
            goto L_0x0907
        L_0x0656:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzdni.m23816b((int) r15, (float) r4)
            goto L_0x0951
        L_0x0663:
            boolean r4 = r0.m16667a(r1, (int) r15, (int) r5)
            if (r4 == 0) goto L_0x0908
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzdni.m23815b((int) r15, (double) r9)
            goto L_0x0907
        L_0x0671:
            com.google.android.gms.internal.ads.vv r4 = r0.f14683q
            java.lang.Object r9 = r2.getObject(r1, r10)
            java.lang.Object r10 = r0.m16672b((int) r5)
            int r4 = r4.mo26702a(r15, r9, r10)
            goto L_0x0907
        L_0x0681:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.nw r9 = r0.m16656a((int) r5)
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17937b((int) r15, (java.util.List<com.google.android.gms.internal.ads.zzdpk>) r4, (com.google.android.gms.internal.ads.C7784nw) r9)
            goto L_0x0907
        L_0x0691:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17923a((java.util.List<java.lang.Long>) r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x06a5
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06a5:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x06af:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17953e(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x06c3
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06c3:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x06cd:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17960g(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x06e1
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06e1:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x06eb:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17957f(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x06ff
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x06ff:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x0709:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17939b(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x071d
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x071d:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x0727:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17949d(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x073b
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x073b:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x0745:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17963h(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x0759
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0759:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x0763:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17957f(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x0777
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0777:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x0781:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17960g(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x0795
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0795:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x079f:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17945c(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x07b3
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x07b3:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x07bd:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17969j(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x07d1
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x07d1:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x07da:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17966i(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x07ee
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x07ee:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x07f7:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17957f(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x080b
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x080b:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
            goto L_0x0830
        L_0x0814:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17960g(r4)
            if (r4 <= 0) goto L_0x0908
            boolean r10 = r0.f14675i
            if (r10 == 0) goto L_0x0828
            long r9 = (long) r9
            r2.putInt(r1, r9, r4)
        L_0x0828:
            int r9 = com.google.android.gms.internal.ads.zzdni.m23835e((int) r15)
            int r10 = com.google.android.gms.internal.ads.zzdni.m23842g((int) r4)
        L_0x0830:
            int r9 = r9 + r10
            int r9 = r9 + r4
            goto L_0x0951
        L_0x0834:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17944c(r15, r4, r9)
            goto L_0x0907
        L_0x0841:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17959g(r15, r4, r9)
            goto L_0x0907
        L_0x084e:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17965i(r15, r4, r9)
            goto L_0x0907
        L_0x085b:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17962h(r15, r4, r9)
            goto L_0x0907
        L_0x0868:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17948d(r15, r4, r9)
            goto L_0x0907
        L_0x0875:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17956f(r15, r4, r9)
            goto L_0x0907
        L_0x0882:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17936b(r15, r4)
            goto L_0x0907
        L_0x088e:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.nw r9 = r0.m16656a((int) r5)
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17921a((int) r15, (java.util.List<?>) r4, (com.google.android.gms.internal.ads.C7784nw) r9)
            goto L_0x0907
        L_0x089d:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17920a((int) r15, (java.util.List<?>) r4)
            goto L_0x0907
        L_0x08a8:
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17968j(r15, r4, r9)
            goto L_0x0907
        L_0x08b4:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17962h(r15, r4, r9)
            goto L_0x0907
        L_0x08c0:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17965i(r15, r4, r9)
            goto L_0x0907
        L_0x08cc:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17952e(r15, r4, r9)
            goto L_0x0907
        L_0x08d8:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17938b((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r9)
            goto L_0x0907
        L_0x08e4:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17922a((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r9)
            goto L_0x0907
        L_0x08f0:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17962h(r15, r4, r9)
            goto L_0x0907
        L_0x08fc:
            r9 = 0
            java.lang.Object r4 = r2.getObject(r1, r10)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17965i(r15, r4, r9)
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
            com.google.android.gms.internal.ads.zzdpk r4 = (com.google.android.gms.internal.ads.zzdpk) r4
            com.google.android.gms.internal.ads.nw r9 = r0.m16656a((int) r5)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23828c((int) r15, (com.google.android.gms.internal.ads.zzdpk) r4, (com.google.android.gms.internal.ads.C7784nw) r9)
            goto L_0x0907
        L_0x0923:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            long r9 = r2.getLong(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23840f((int) r15, (long) r9)
            goto L_0x0907
        L_0x0930:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            int r4 = r2.getInt(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23847h((int) r15, (int) r4)
            goto L_0x0907
        L_0x093d:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.zzdni.m23848h((int) r15, (long) r9)
            goto L_0x0907
        L_0x0948:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzdni.m23854j(r15, r4)
        L_0x0951:
            int r6 = r6 + r9
            goto L_0x0908
        L_0x0953:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            int r4 = r2.getInt(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23856k(r15, r4)
            goto L_0x0907
        L_0x0960:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            int r4 = r2.getInt(r1, r10)
            int r4 = com.google.android.gms.internal.ads.zzdni.m23843g((int) r15, (int) r4)
            goto L_0x0907
        L_0x096d:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.ads.zzdmr r4 = (com.google.android.gms.internal.ads.zzdmr) r4
            int r4 = com.google.android.gms.internal.ads.zzdni.m23826c((int) r15, (com.google.android.gms.internal.ads.zzdmr) r4)
            goto L_0x0907
        L_0x097c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            com.google.android.gms.internal.ads.nw r9 = r0.m16656a((int) r5)
            int r4 = com.google.android.gms.internal.ads.C7858pw.m17919a((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C7784nw) r9)
            goto L_0x0907
        L_0x098e:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            java.lang.Object r4 = r2.getObject(r1, r10)
            boolean r9 = r4 instanceof com.google.android.gms.internal.ads.zzdmr
            if (r9 == 0) goto L_0x09a2
            com.google.android.gms.internal.ads.zzdmr r4 = (com.google.android.gms.internal.ads.zzdmr) r4
            int r4 = com.google.android.gms.internal.ads.zzdni.m23826c((int) r15, (com.google.android.gms.internal.ads.zzdmr) r4)
            goto L_0x0907
        L_0x09a2:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.zzdni.m23819b((int) r15, (java.lang.String) r4)
            goto L_0x0907
        L_0x09aa:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            int r4 = com.google.android.gms.internal.ads.zzdni.m23820b((int) r15, (boolean) r7)
            goto L_0x0907
        L_0x09b4:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x0908
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.zzdni.m23851i(r15, r4)
            int r6 = r6 + r9
            goto L_0x0909
        L_0x09c0:
            r4 = 0
            r9 = r12 & r18
            r13 = 0
            if (r9 == 0) goto L_0x09fc
            int r9 = com.google.android.gms.internal.ads.zzdni.m23844g((int) r15, (long) r13)
            goto L_0x09fb
        L_0x09cc:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fc
            int r9 = r2.getInt(r1, r10)
            int r9 = com.google.android.gms.internal.ads.zzdni.m23839f((int) r15, (int) r9)
            goto L_0x09fb
        L_0x09dc:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fc
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.ads.zzdni.m23836e((int) r15, (long) r9)
            goto L_0x09fb
        L_0x09ec:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x09fc
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.ads.zzdni.m23830d((int) r15, (long) r9)
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
            int r10 = com.google.android.gms.internal.ads.zzdni.m23816b((int) r15, (float) r9)
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
            int r15 = com.google.android.gms.internal.ads.zzdni.m23815b((int) r15, (double) r10)
            int r6 = r6 + r15
        L_0x0a1d:
            int r5 = r5 + 3
            r9 = r13
            r4 = 0
            r11 = 0
            goto L_0x04f8
        L_0x0a24:
            com.google.android.gms.internal.ads.ex<?, ?> r2 = r0.f14681o
            int r2 = m16650a(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f14672f
            if (r2 == 0) goto L_0x0a3a
            com.google.android.gms.internal.ads.wu<?> r2 = r0.f14682p
            com.google.android.gms.internal.ads.zu r1 = r2.mo26750b(r1)
            int r1 = r1.mo26898g()
            int r6 = r6 + r1
        L_0x0a3a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7337bw.mo25751c(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo25752d(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.f14677k) {
                return !this.f14672f || this.f14682p.mo26750b(t).mo26894d();
            }
            int i5 = this.f14676j[i3];
            int i6 = this.f14667a[i5];
            int d = m16680d(i5);
            if (!this.f14674h) {
                int i7 = this.f14667a[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = f14666s.getInt(t, (long) i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if (((268435456 & d) != 0) && !m16668a(t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & d) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (m16667a(t, i6, i5) && !m16669a((Object) t, d, m16656a(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> a = this.f14683q.mo26704a(C7596ix.m17234f(t, (long) (d & 1048575)));
                            if (!a.isEmpty()) {
                                if (this.f14683q.mo26707d(m16672b(i5)).f16985c.mo29187a() == zzdrn.MESSAGE) {
                                    C7784nw<?> nwVar = null;
                                    Iterator<?> it = a.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (nwVar == null) {
                                            nwVar = C7595iw.m17197a().mo26088a(next.getClass());
                                        }
                                        if (!nwVar.mo25752d(next)) {
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
                List list = (List) C7596ix.m17234f(t, (long) (d & 1048575));
                if (!list.isEmpty()) {
                    C7784nw a2 = m16656a(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        } else if (!a2.mo25752d(list.get(i10))) {
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
            } else if (m16668a(t, i5, i4, i) && !m16669a((Object) t, d, m16656a(i5))) {
                return false;
            }
            i3++;
        }
    }

    /* renamed from: e */
    private final int m16682e(int i) {
        return this.f14667a[i + 2];
    }

    /* renamed from: e */
    private static <T> long m16683e(T t, long j) {
        return ((Long) C7596ix.m17234f(t, j)).longValue();
    }

    /* renamed from: d */
    private final int m16680d(int i) {
        return this.f14667a[i + 1];
    }

    /* renamed from: d */
    private static <T> int m16681d(T t, long j) {
        return ((Integer) C7596ix.m17234f(t, j)).intValue();
    }

    /* renamed from: b */
    private final void m16676b(T t, T t2, int i) {
        int d = m16680d(i);
        int i2 = this.f14667a[i];
        long j = (long) (d & 1048575);
        if (m16667a(t2, i2, i)) {
            Object f = C7596ix.m17234f(t, j);
            Object f2 = C7596ix.m17234f(t2, j);
            if (f != null && f2 != null) {
                C7596ix.m17211a((Object) t, j, zzdod.m24035a(f, f2));
                m16674b(t, i2, i);
            } else if (f2 != null) {
                C7596ix.m17211a((Object) t, j, f2);
                m16674b(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x0484  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m16675b(T r19, com.google.android.gms.internal.ads.C8118wx r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f14672f
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.wu<?> r3 = r0.f14682p
            com.google.android.gms.internal.ads.zu r3 = r3.mo26750b(r1)
            boolean r5 = r3.mo26891b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo26895e()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            r5 = -1
            int[] r6 = r0.f14667a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f14666s
            r9 = 0
            r10 = 0
        L_0x002a:
            if (r9 >= r6) goto L_0x0481
            int r11 = r0.m16680d((int) r9)
            int[] r12 = r0.f14667a
            r13 = r12[r9]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r11
            int r14 = r14 >>> 20
            boolean r15 = r0.f14674h
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
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.ads.nw r8 = r0.m16656a((int) r9)
            r2.mo26592a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C7784nw) r8)
            goto L_0x0067
        L_0x007c:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            long r11 = m16683e(r1, r11)
            r2.mo26608d((int) r13, (long) r11)
            goto L_0x0067
        L_0x008a:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            int r4 = m16681d(r1, r11)
            r2.mo26610e((int) r13, (int) r4)
            goto L_0x0067
        L_0x0098:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            long r11 = m16683e(r1, r11)
            r2.mo26616g(r13, r11)
            goto L_0x0067
        L_0x00a6:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            int r4 = m16681d(r1, r11)
            r2.mo26599b((int) r13, (int) r4)
            goto L_0x0067
        L_0x00b4:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            int r4 = m16681d(r1, r11)
            r2.mo26607d((int) r13, (int) r4)
            goto L_0x0067
        L_0x00c2:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            int r4 = m16681d(r1, r11)
            r2.mo26604c((int) r13, (int) r4)
            goto L_0x0067
        L_0x00d0:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.ads.zzdmr r4 = (com.google.android.gms.internal.ads.zzdmr) r4
            r2.mo26590a((int) r13, (com.google.android.gms.internal.ads.zzdmr) r4)
            goto L_0x0067
        L_0x00e0:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.ads.nw r8 = r0.m16656a((int) r9)
            r2.mo26600b((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C7784nw) r8)
            goto L_0x0067
        L_0x00f3:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            java.lang.Object r4 = r7.getObject(r1, r11)
            m16661a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C8118wx) r2)
            goto L_0x0067
        L_0x0102:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            boolean r4 = m16686f(r1, r11)
            r2.mo26597a((int) r13, (boolean) r4)
            goto L_0x0067
        L_0x0111:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            int r4 = m16681d(r1, r11)
            r2.mo26588a((int) r13, (int) r4)
            goto L_0x0067
        L_0x0120:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            long r11 = m16683e(r1, r11)
            r2.mo26605c((int) r13, (long) r11)
            goto L_0x0067
        L_0x012f:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            int r4 = m16681d(r1, r11)
            r2.mo26613f((int) r13, (int) r4)
            goto L_0x0067
        L_0x013e:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            long r11 = m16683e(r1, r11)
            r2.mo26614f((int) r13, (long) r11)
            goto L_0x0067
        L_0x014d:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            long r11 = m16683e(r1, r11)
            r2.mo26611e((int) r13, (long) r11)
            goto L_0x0067
        L_0x015c:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            float r4 = m16677c(r1, r11)
            r2.mo26587a((int) r13, (float) r4)
            goto L_0x0067
        L_0x016b:
            boolean r4 = r0.m16667a(r1, (int) r13, (int) r9)
            if (r4 == 0) goto L_0x0067
            double r11 = m16670b(r1, (long) r11)
            r2.mo26586a((int) r13, (double) r11)
            goto L_0x0067
        L_0x017a:
            java.lang.Object r4 = r7.getObject(r1, r11)
            r0.m16663a((com.google.android.gms.internal.ads.C8118wx) r2, (int) r13, (java.lang.Object) r4, (int) r9)
            goto L_0x0067
        L_0x0183:
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.nw r11 = r0.m16656a((int) r9)
            com.google.android.gms.internal.ads.C7858pw.m17942b((int) r4, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.C8118wx) r2, (com.google.android.gms.internal.ads.C7784nw) r11)
            goto L_0x0067
        L_0x0196:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17955e(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01a5:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17970j(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01b4:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17961g(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01c3:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17972l(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01d2:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17973m(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01e1:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17967i(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01f0:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17974n(r8, r11, r2, r4)
            goto L_0x0067
        L_0x01ff:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17971k(r8, r11, r2, r4)
            goto L_0x0067
        L_0x020e:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17958f(r8, r11, r2, r4)
            goto L_0x0067
        L_0x021d:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17964h(r8, r11, r2, r4)
            goto L_0x0067
        L_0x022c:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17951d(r8, r11, r2, r4)
            goto L_0x0067
        L_0x023b:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17947c(r8, r11, r2, r4)
            goto L_0x0067
        L_0x024a:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17943b((int) r8, (java.util.List<java.lang.Float>) r11, (com.google.android.gms.internal.ads.C8118wx) r2, (boolean) r4)
            goto L_0x0067
        L_0x0259:
            int[] r8 = r0.f14667a
            r8 = r8[r9]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C7858pw.m17930a((int) r8, (java.util.List<java.lang.Double>) r11, (com.google.android.gms.internal.ads.C8118wx) r2, (boolean) r4)
            goto L_0x0067
        L_0x0268:
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.android.gms.internal.ads.C7858pw.m17955e(r4, r8, r2, r13)
            goto L_0x0067
        L_0x0278:
            r13 = 0
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17970j(r4, r8, r2, r13)
            goto L_0x0067
        L_0x0288:
            r13 = 0
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17961g(r4, r8, r2, r13)
            goto L_0x0067
        L_0x0298:
            r13 = 0
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17972l(r4, r8, r2, r13)
            goto L_0x0067
        L_0x02a8:
            r13 = 0
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17973m(r4, r8, r2, r13)
            goto L_0x0067
        L_0x02b8:
            r13 = 0
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17967i(r4, r8, r2, r13)
            goto L_0x0067
        L_0x02c8:
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17941b((int) r4, (java.util.List<com.google.android.gms.internal.ads.zzdmr>) r8, (com.google.android.gms.internal.ads.C8118wx) r2)
            goto L_0x0067
        L_0x02d7:
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.nw r11 = r0.m16656a((int) r9)
            com.google.android.gms.internal.ads.C7858pw.m17929a((int) r4, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.C8118wx) r2, (com.google.android.gms.internal.ads.C7784nw) r11)
            goto L_0x0067
        L_0x02ea:
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17928a((int) r4, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.ads.C8118wx) r2)
            goto L_0x0067
        L_0x02f9:
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            com.google.android.gms.internal.ads.C7858pw.m17974n(r4, r8, r2, r14)
            goto L_0x0476
        L_0x0309:
            r14 = 0
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17971k(r4, r8, r2, r14)
            goto L_0x0476
        L_0x0319:
            r14 = 0
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17958f(r4, r8, r2, r14)
            goto L_0x0476
        L_0x0329:
            r14 = 0
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17964h(r4, r8, r2, r14)
            goto L_0x0476
        L_0x0339:
            r14 = 0
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17951d(r4, r8, r2, r14)
            goto L_0x0476
        L_0x0349:
            r14 = 0
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17947c(r4, r8, r2, r14)
            goto L_0x0476
        L_0x0359:
            r14 = 0
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17943b((int) r4, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.C8118wx) r2, (boolean) r14)
            goto L_0x0476
        L_0x0369:
            r14 = 0
            int[] r4 = r0.f14667a
            r4 = r4[r9]
            java.lang.Object r8 = r7.getObject(r1, r11)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17930a((int) r4, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.C8118wx) r2, (boolean) r14)
            goto L_0x0476
        L_0x0379:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.ads.nw r8 = r0.m16656a((int) r9)
            r2.mo26592a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C7784nw) r8)
            goto L_0x0476
        L_0x038b:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            long r11 = r7.getLong(r1, r11)
            r2.mo26608d((int) r13, (long) r11)
            goto L_0x0476
        L_0x0399:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            int r4 = r7.getInt(r1, r11)
            r2.mo26610e((int) r13, (int) r4)
            goto L_0x0476
        L_0x03a7:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            long r11 = r7.getLong(r1, r11)
            r2.mo26616g(r13, r11)
            goto L_0x0476
        L_0x03b5:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            int r4 = r7.getInt(r1, r11)
            r2.mo26599b((int) r13, (int) r4)
            goto L_0x0476
        L_0x03c3:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            int r4 = r7.getInt(r1, r11)
            r2.mo26607d((int) r13, (int) r4)
            goto L_0x0476
        L_0x03d1:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            int r4 = r7.getInt(r1, r11)
            r2.mo26604c((int) r13, (int) r4)
            goto L_0x0476
        L_0x03df:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.ads.zzdmr r4 = (com.google.android.gms.internal.ads.zzdmr) r4
            r2.mo26590a((int) r13, (com.google.android.gms.internal.ads.zzdmr) r4)
            goto L_0x0476
        L_0x03ef:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.ads.nw r8 = r0.m16656a((int) r9)
            r2.mo26600b((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C7784nw) r8)
            goto L_0x0476
        L_0x0401:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            java.lang.Object r4 = r7.getObject(r1, r11)
            m16661a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C8118wx) r2)
            goto L_0x0476
        L_0x040f:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            boolean r4 = com.google.android.gms.internal.ads.C7596ix.m17225c(r1, r11)
            r2.mo26597a((int) r13, (boolean) r4)
            goto L_0x0476
        L_0x041c:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            int r4 = r7.getInt(r1, r11)
            r2.mo26588a((int) r13, (int) r4)
            goto L_0x0476
        L_0x0429:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            long r11 = r7.getLong(r1, r11)
            r2.mo26605c((int) r13, (long) r11)
            goto L_0x0476
        L_0x0436:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            int r4 = r7.getInt(r1, r11)
            r2.mo26613f((int) r13, (int) r4)
            goto L_0x0476
        L_0x0443:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            long r11 = r7.getLong(r1, r11)
            r2.mo26614f((int) r13, (long) r11)
            goto L_0x0476
        L_0x0450:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            long r11 = r7.getLong(r1, r11)
            r2.mo26611e((int) r13, (long) r11)
            goto L_0x0476
        L_0x045d:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            float r4 = com.google.android.gms.internal.ads.C7596ix.m17226d(r1, r11)
            r2.mo26587a((int) r13, (float) r4)
            goto L_0x0476
        L_0x046a:
            r14 = 0
            r4 = r10 & r8
            if (r4 == 0) goto L_0x0476
            double r11 = com.google.android.gms.internal.ads.C7596ix.m17231e(r1, r11)
            r2.mo26586a((int) r13, (double) r11)
        L_0x0476:
            int r9 = r9 + 3
            goto L_0x002a
        L_0x047a:
            com.google.android.gms.internal.ads.wu<?> r1 = r0.f14682p
            r1.mo26742a((java.util.Map.Entry<?, ?>) r3)
            r4 = 0
            throw r4
        L_0x0481:
            r4 = 0
            if (r3 != 0) goto L_0x048a
            com.google.android.gms.internal.ads.ex<?, ?> r3 = r0.f14681o
            m16662a(r3, r1, (com.google.android.gms.internal.ads.C8118wx) r2)
            return
        L_0x048a:
            com.google.android.gms.internal.ads.wu<?> r1 = r0.f14682p
            r1.mo26746a(r2, r3)
            goto L_0x0491
        L_0x0490:
            throw r4
        L_0x0491:
            goto L_0x0490
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7337bw.m16675b(java.lang.Object, com.google.android.gms.internal.ads.wx):void");
    }

    /* renamed from: a */
    private static Field m16659a(Class<?> cls, String str) {
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

    /* renamed from: a */
    public final T mo25744a() {
        return this.f14679m.mo25883a(this.f14671e);
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
    public final int mo25742a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f14667a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.m16680d((int) r1)
            int[] r4 = r8.f14667a
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
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7596ix.m17234f(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m16683e(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24031a((long) r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m16681d(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m16683e(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24031a((long) r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m16681d(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m16681d(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m16681d(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7596ix.m17234f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7596ix.m17234f(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7596ix.m17234f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = m16686f(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24032a((boolean) r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m16681d(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m16683e(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24031a((long) r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m16681d(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m16683e(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24031a((long) r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m16683e(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24031a((long) r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = m16677c(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.m16667a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = m16670b(r9, (long) r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24031a((long) r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7596ix.m17234f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7596ix.m17234f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7596ix.m17234f(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.C7596ix.m17217b(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24031a((long) r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.C7596ix.m17217b(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24031a((long) r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7596ix.m17234f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7596ix.m17234f(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7596ix.m17234f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.ads.C7596ix.m17225c(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24032a((boolean) r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.C7596ix.m17217b(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24031a((long) r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r9, (long) r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.C7596ix.m17217b(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24031a((long) r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.C7596ix.m17217b(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24031a((long) r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.ads.C7596ix.m17226d(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.ads.C7596ix.m17231e(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.zzdod.m24031a((long) r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.ex<?, ?> r0 = r8.f14681o
            java.lang.Object r0 = r0.mo25900d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f14672f
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.wu<?> r0 = r8.f14682p
            com.google.android.gms.internal.ads.zu r9 = r0.mo26750b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7337bw.mo25742a(java.lang.Object):int");
    }

    /* renamed from: a */
    public final void mo25747a(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f14667a.length; i += 3) {
                int d = m16680d(i);
                long j = (long) (1048575 & d);
                int i2 = this.f14667a[i];
                switch ((d & 267386880) >>> 20) {
                    case 0:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17207a((Object) t, j, C7596ix.m17231e(t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 1:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17208a((Object) t, j, C7596ix.m17226d(t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 2:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17210a((Object) t, j, C7596ix.m17217b(t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 3:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17210a((Object) t, j, C7596ix.m17217b(t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 4:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17209a((Object) t, j, C7596ix.m17201a((Object) t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 5:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17210a((Object) t, j, C7596ix.m17217b(t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 6:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17209a((Object) t, j, C7596ix.m17201a((Object) t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 7:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17212a((Object) t, j, C7596ix.m17225c(t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 8:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17211a((Object) t, j, C7596ix.m17234f(t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 9:
                        m16665a(t, t2, i);
                        break;
                    case 10:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17211a((Object) t, j, C7596ix.m17234f(t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 11:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17209a((Object) t, j, C7596ix.m17201a((Object) t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 12:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17209a((Object) t, j, C7596ix.m17201a((Object) t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 13:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17209a((Object) t, j, C7596ix.m17201a((Object) t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 14:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17210a((Object) t, j, C7596ix.m17217b(t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 15:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17209a((Object) t, j, C7596ix.m17201a((Object) t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 16:
                        if (!m16666a(t2, i)) {
                            break;
                        } else {
                            C7596ix.m17210a((Object) t, j, C7596ix.m17217b(t2, j));
                            m16673b(t, i);
                            break;
                        }
                    case 17:
                        m16665a(t, t2, i);
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
                        this.f14680n.mo26221a(t, t2, j);
                        break;
                    case 50:
                        C7858pw.m17932a(this.f14683q, t, t2, j);
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
                        if (!m16667a(t2, i2, i)) {
                            break;
                        } else {
                            C7596ix.m17211a((Object) t, j, C7596ix.m17234f(t2, j));
                            m16674b(t, i2, i);
                            break;
                        }
                    case 60:
                        m16676b(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m16667a(t2, i2, i)) {
                            break;
                        } else {
                            C7596ix.m17211a((Object) t, j, C7596ix.m17234f(t2, j));
                            m16674b(t, i2, i);
                            break;
                        }
                    case 68:
                        m16676b(t, t2, i);
                        break;
                }
            }
            if (!this.f14674h) {
                C7858pw.m17931a(this.f14681o, t, t2);
                if (this.f14672f) {
                    C7858pw.m17933a(this.f14682p, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: a */
    private final void m16665a(T t, T t2, int i) {
        long d = (long) (m16680d(i) & 1048575);
        if (m16666a(t2, i)) {
            Object f = C7596ix.m17234f(t, d);
            Object f2 = C7596ix.m17234f(t2, d);
            if (f != null && f2 != null) {
                C7596ix.m17211a((Object) t, d, zzdod.m24035a(f, f2));
                m16673b(t, i);
            } else if (f2 != null) {
                C7596ix.m17211a((Object) t, d, f2);
                m16673b(t, i);
            }
        }
    }

    /* renamed from: a */
    private static <UT, UB> int m16650a(C7449ex<UT, UB> exVar, T t) {
        return exVar.mo25898c(exVar.mo25900d(t));
    }

    /* renamed from: a */
    private static <E> List<E> m16660a(Object obj, long j) {
        return (List) C7596ix.m17234f(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04ba A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x0969  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x096f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25746a(T r13, com.google.android.gms.internal.ads.C8118wx r14) throws java.io.IOException {
        /*
            r12 = this;
            int r0 = r14.mo26584a()
            int r1 = com.google.android.gms.internal.ads.zzdob.zze.f21585l
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04c1
            com.google.android.gms.internal.ads.ex<?, ?> r0 = r12.f14681o
            m16662a(r0, r13, (com.google.android.gms.internal.ads.C8118wx) r14)
            boolean r0 = r12.f14672f
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.ads.wu<?> r0 = r12.f14682p
            com.google.android.gms.internal.ads.zu r0 = r0.mo26750b(r13)
            boolean r1 = r0.mo26891b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.mo26889a()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0031
        L_0x0030:
            r0 = r3
        L_0x0031:
            int[] r1 = r12.f14667a
            int r1 = r1.length
            int r1 = r1 + -3
        L_0x0036:
            if (r1 < 0) goto L_0x04b8
            int r7 = r12.m16680d((int) r1)
            int[] r8 = r12.f14667a
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
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r7)
            com.google.android.gms.internal.ads.nw r8 = r12.m16656a((int) r1)
            r14.mo26592a((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.ads.C7784nw) r8)
            goto L_0x04ae
        L_0x0060:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m16683e(r13, r7)
            r14.mo26608d((int) r9, (long) r7)
            goto L_0x04ae
        L_0x0071:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m16681d(r13, r7)
            r14.mo26610e((int) r9, (int) r7)
            goto L_0x04ae
        L_0x0082:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m16683e(r13, r7)
            r14.mo26616g(r9, r7)
            goto L_0x04ae
        L_0x0093:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m16681d(r13, r7)
            r14.mo26599b((int) r9, (int) r7)
            goto L_0x04ae
        L_0x00a4:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m16681d(r13, r7)
            r14.mo26607d((int) r9, (int) r7)
            goto L_0x04ae
        L_0x00b5:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m16681d(r13, r7)
            r14.mo26604c((int) r9, (int) r7)
            goto L_0x04ae
        L_0x00c6:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r7)
            com.google.android.gms.internal.ads.zzdmr r7 = (com.google.android.gms.internal.ads.zzdmr) r7
            r14.mo26590a((int) r9, (com.google.android.gms.internal.ads.zzdmr) r7)
            goto L_0x04ae
        L_0x00d9:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r7)
            com.google.android.gms.internal.ads.nw r8 = r12.m16656a((int) r1)
            r14.mo26600b((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.ads.C7784nw) r8)
            goto L_0x04ae
        L_0x00ee:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r7)
            m16661a((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.ads.C8118wx) r14)
            goto L_0x04ae
        L_0x00ff:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = m16686f(r13, r7)
            r14.mo26597a((int) r9, (boolean) r7)
            goto L_0x04ae
        L_0x0110:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m16681d(r13, r7)
            r14.mo26588a((int) r9, (int) r7)
            goto L_0x04ae
        L_0x0121:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m16683e(r13, r7)
            r14.mo26605c((int) r9, (long) r7)
            goto L_0x04ae
        L_0x0132:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m16681d(r13, r7)
            r14.mo26613f((int) r9, (int) r7)
            goto L_0x04ae
        L_0x0143:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m16683e(r13, r7)
            r14.mo26614f((int) r9, (long) r7)
            goto L_0x04ae
        L_0x0154:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m16683e(r13, r7)
            r14.mo26611e((int) r9, (long) r7)
            goto L_0x04ae
        L_0x0165:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = m16677c(r13, r7)
            r14.mo26587a((int) r9, (float) r7)
            goto L_0x04ae
        L_0x0176:
            boolean r8 = r12.m16667a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = m16670b(r13, (long) r7)
            r14.mo26586a((int) r9, (double) r7)
            goto L_0x04ae
        L_0x0187:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r7)
            r12.m16663a((com.google.android.gms.internal.ads.C8118wx) r14, (int) r9, (java.lang.Object) r7, (int) r1)
            goto L_0x04ae
        L_0x0192:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.nw r9 = r12.m16656a((int) r1)
            com.google.android.gms.internal.ads.C7858pw.m17942b((int) r8, (java.util.List<?>) r7, (com.google.android.gms.internal.ads.C8118wx) r14, (com.google.android.gms.internal.ads.C7784nw) r9)
            goto L_0x04ae
        L_0x01a5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17955e(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x01b4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17970j(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x01c3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17961g(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x01d2:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17972l(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x01e1:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17973m(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x01f0:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17967i(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x01ff:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17974n(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x020e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17971k(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x021d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17958f(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x022c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17964h(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x023b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17951d(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x024a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17947c(r8, r7, r14, r4)
            goto L_0x04ae
        L_0x0259:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17943b((int) r8, (java.util.List<java.lang.Float>) r7, (com.google.android.gms.internal.ads.C8118wx) r14, (boolean) r4)
            goto L_0x04ae
        L_0x0268:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17930a((int) r8, (java.util.List<java.lang.Double>) r7, (com.google.android.gms.internal.ads.C8118wx) r14, (boolean) r4)
            goto L_0x04ae
        L_0x0277:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17955e(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x0286:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17970j(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x0295:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17961g(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x02a4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17972l(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x02b3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17973m(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x02c2:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17967i(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x02d1:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17941b((int) r8, (java.util.List<com.google.android.gms.internal.ads.zzdmr>) r7, (com.google.android.gms.internal.ads.C8118wx) r14)
            goto L_0x04ae
        L_0x02e0:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.nw r9 = r12.m16656a((int) r1)
            com.google.android.gms.internal.ads.C7858pw.m17929a((int) r8, (java.util.List<?>) r7, (com.google.android.gms.internal.ads.C8118wx) r14, (com.google.android.gms.internal.ads.C7784nw) r9)
            goto L_0x04ae
        L_0x02f3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17928a((int) r8, (java.util.List<java.lang.String>) r7, (com.google.android.gms.internal.ads.C8118wx) r14)
            goto L_0x04ae
        L_0x0302:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17974n(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x0311:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17971k(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x0320:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17958f(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x032f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17964h(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x033e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17951d(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x034d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17947c(r8, r7, r14, r5)
            goto L_0x04ae
        L_0x035c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17943b((int) r8, (java.util.List<java.lang.Float>) r7, (com.google.android.gms.internal.ads.C8118wx) r14, (boolean) r5)
            goto L_0x04ae
        L_0x036b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C7858pw.m17930a((int) r8, (java.util.List<java.lang.Double>) r7, (com.google.android.gms.internal.ads.C8118wx) r14, (boolean) r5)
            goto L_0x04ae
        L_0x037a:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r7)
            com.google.android.gms.internal.ads.nw r8 = r12.m16656a((int) r1)
            r14.mo26592a((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.ads.C7784nw) r8)
            goto L_0x04ae
        L_0x038f:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C7596ix.m17217b(r13, r7)
            r14.mo26608d((int) r9, (long) r7)
            goto L_0x04ae
        L_0x03a0:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r13, (long) r7)
            r14.mo26610e((int) r9, (int) r7)
            goto L_0x04ae
        L_0x03b1:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C7596ix.m17217b(r13, r7)
            r14.mo26616g(r9, r7)
            goto L_0x04ae
        L_0x03c2:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r13, (long) r7)
            r14.mo26599b((int) r9, (int) r7)
            goto L_0x04ae
        L_0x03d3:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r13, (long) r7)
            r14.mo26607d((int) r9, (int) r7)
            goto L_0x04ae
        L_0x03e4:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r13, (long) r7)
            r14.mo26604c((int) r9, (int) r7)
            goto L_0x04ae
        L_0x03f5:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r7)
            com.google.android.gms.internal.ads.zzdmr r7 = (com.google.android.gms.internal.ads.zzdmr) r7
            r14.mo26590a((int) r9, (com.google.android.gms.internal.ads.zzdmr) r7)
            goto L_0x04ae
        L_0x0408:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r7)
            com.google.android.gms.internal.ads.nw r8 = r12.m16656a((int) r1)
            r14.mo26600b((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.ads.C7784nw) r8)
            goto L_0x04ae
        L_0x041d:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r7)
            m16661a((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.ads.C8118wx) r14)
            goto L_0x04ae
        L_0x042e:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = com.google.android.gms.internal.ads.C7596ix.m17225c(r13, r7)
            r14.mo26597a((int) r9, (boolean) r7)
            goto L_0x04ae
        L_0x043f:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r13, (long) r7)
            r14.mo26588a((int) r9, (int) r7)
            goto L_0x04ae
        L_0x044f:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C7596ix.m17217b(r13, r7)
            r14.mo26605c((int) r9, (long) r7)
            goto L_0x04ae
        L_0x045f:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r13, (long) r7)
            r14.mo26613f((int) r9, (int) r7)
            goto L_0x04ae
        L_0x046f:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C7596ix.m17217b(r13, r7)
            r14.mo26614f((int) r9, (long) r7)
            goto L_0x04ae
        L_0x047f:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C7596ix.m17217b(r13, r7)
            r14.mo26611e((int) r9, (long) r7)
            goto L_0x04ae
        L_0x048f:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = com.google.android.gms.internal.ads.C7596ix.m17226d(r13, r7)
            r14.mo26587a((int) r9, (float) r7)
            goto L_0x04ae
        L_0x049f:
            boolean r8 = r12.m16666a(r13, (int) r1)
            if (r8 == 0) goto L_0x04ae
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = com.google.android.gms.internal.ads.C7596ix.m17231e(r13, r7)
            r14.mo26586a((int) r9, (double) r7)
        L_0x04ae:
            int r1 = r1 + -3
            goto L_0x0036
        L_0x04b2:
            com.google.android.gms.internal.ads.wu<?> r13 = r12.f14682p
            r13.mo26742a((java.util.Map.Entry<?, ?>) r0)
            throw r3
        L_0x04b8:
            if (r0 != 0) goto L_0x04bb
            return
        L_0x04bb:
            com.google.android.gms.internal.ads.wu<?> r13 = r12.f14682p
            r13.mo26746a(r14, r0)
            throw r3
        L_0x04c1:
            boolean r0 = r12.f14674h
            if (r0 == 0) goto L_0x0975
            boolean r0 = r12.f14672f
            if (r0 == 0) goto L_0x04e0
            com.google.android.gms.internal.ads.wu<?> r0 = r12.f14682p
            com.google.android.gms.internal.ads.zu r0 = r0.mo26750b(r13)
            boolean r1 = r0.mo26891b()
            if (r1 != 0) goto L_0x04e0
            java.util.Iterator r0 = r0.mo26895e()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x04e1
        L_0x04e0:
            r0 = r3
        L_0x04e1:
            int[] r1 = r12.f14667a
            int r1 = r1.length
            r7 = 0
        L_0x04e5:
            if (r7 >= r1) goto L_0x0967
            int r8 = r12.m16680d((int) r7)
            int[] r9 = r12.f14667a
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
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r8)
            com.google.android.gms.internal.ads.nw r9 = r12.m16656a((int) r7)
            r14.mo26592a((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.ads.C7784nw) r9)
            goto L_0x095d
        L_0x050f:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m16683e(r13, r8)
            r14.mo26608d((int) r10, (long) r8)
            goto L_0x095d
        L_0x0520:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m16681d(r13, r8)
            r14.mo26610e((int) r10, (int) r8)
            goto L_0x095d
        L_0x0531:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m16683e(r13, r8)
            r14.mo26616g(r10, r8)
            goto L_0x095d
        L_0x0542:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m16681d(r13, r8)
            r14.mo26599b((int) r10, (int) r8)
            goto L_0x095d
        L_0x0553:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m16681d(r13, r8)
            r14.mo26607d((int) r10, (int) r8)
            goto L_0x095d
        L_0x0564:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m16681d(r13, r8)
            r14.mo26604c((int) r10, (int) r8)
            goto L_0x095d
        L_0x0575:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r8)
            com.google.android.gms.internal.ads.zzdmr r8 = (com.google.android.gms.internal.ads.zzdmr) r8
            r14.mo26590a((int) r10, (com.google.android.gms.internal.ads.zzdmr) r8)
            goto L_0x095d
        L_0x0588:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r8)
            com.google.android.gms.internal.ads.nw r9 = r12.m16656a((int) r7)
            r14.mo26600b((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.ads.C7784nw) r9)
            goto L_0x095d
        L_0x059d:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r8)
            m16661a((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.ads.C8118wx) r14)
            goto L_0x095d
        L_0x05ae:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = m16686f(r13, r8)
            r14.mo26597a((int) r10, (boolean) r8)
            goto L_0x095d
        L_0x05bf:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m16681d(r13, r8)
            r14.mo26588a((int) r10, (int) r8)
            goto L_0x095d
        L_0x05d0:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m16683e(r13, r8)
            r14.mo26605c((int) r10, (long) r8)
            goto L_0x095d
        L_0x05e1:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m16681d(r13, r8)
            r14.mo26613f((int) r10, (int) r8)
            goto L_0x095d
        L_0x05f2:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m16683e(r13, r8)
            r14.mo26614f((int) r10, (long) r8)
            goto L_0x095d
        L_0x0603:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m16683e(r13, r8)
            r14.mo26611e((int) r10, (long) r8)
            goto L_0x095d
        L_0x0614:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = m16677c(r13, r8)
            r14.mo26587a((int) r10, (float) r8)
            goto L_0x095d
        L_0x0625:
            boolean r9 = r12.m16667a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = m16670b(r13, (long) r8)
            r14.mo26586a((int) r10, (double) r8)
            goto L_0x095d
        L_0x0636:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r8)
            r12.m16663a((com.google.android.gms.internal.ads.C8118wx) r14, (int) r10, (java.lang.Object) r8, (int) r7)
            goto L_0x095d
        L_0x0641:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.nw r10 = r12.m16656a((int) r7)
            com.google.android.gms.internal.ads.C7858pw.m17942b((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.C8118wx) r14, (com.google.android.gms.internal.ads.C7784nw) r10)
            goto L_0x095d
        L_0x0654:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17955e(r9, r8, r14, r4)
            goto L_0x095d
        L_0x0663:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17970j(r9, r8, r14, r4)
            goto L_0x095d
        L_0x0672:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17961g(r9, r8, r14, r4)
            goto L_0x095d
        L_0x0681:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17972l(r9, r8, r14, r4)
            goto L_0x095d
        L_0x0690:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17973m(r9, r8, r14, r4)
            goto L_0x095d
        L_0x069f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17967i(r9, r8, r14, r4)
            goto L_0x095d
        L_0x06ae:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17974n(r9, r8, r14, r4)
            goto L_0x095d
        L_0x06bd:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17971k(r9, r8, r14, r4)
            goto L_0x095d
        L_0x06cc:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17958f(r9, r8, r14, r4)
            goto L_0x095d
        L_0x06db:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17964h(r9, r8, r14, r4)
            goto L_0x095d
        L_0x06ea:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17951d(r9, r8, r14, r4)
            goto L_0x095d
        L_0x06f9:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17947c(r9, r8, r14, r4)
            goto L_0x095d
        L_0x0708:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17943b((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.C8118wx) r14, (boolean) r4)
            goto L_0x095d
        L_0x0717:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17930a((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.C8118wx) r14, (boolean) r4)
            goto L_0x095d
        L_0x0726:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17955e(r9, r8, r14, r5)
            goto L_0x095d
        L_0x0735:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17970j(r9, r8, r14, r5)
            goto L_0x095d
        L_0x0744:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17961g(r9, r8, r14, r5)
            goto L_0x095d
        L_0x0753:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17972l(r9, r8, r14, r5)
            goto L_0x095d
        L_0x0762:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17973m(r9, r8, r14, r5)
            goto L_0x095d
        L_0x0771:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17967i(r9, r8, r14, r5)
            goto L_0x095d
        L_0x0780:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17941b((int) r9, (java.util.List<com.google.android.gms.internal.ads.zzdmr>) r8, (com.google.android.gms.internal.ads.C8118wx) r14)
            goto L_0x095d
        L_0x078f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.nw r10 = r12.m16656a((int) r7)
            com.google.android.gms.internal.ads.C7858pw.m17929a((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.C8118wx) r14, (com.google.android.gms.internal.ads.C7784nw) r10)
            goto L_0x095d
        L_0x07a2:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17928a((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.ads.C8118wx) r14)
            goto L_0x095d
        L_0x07b1:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17974n(r9, r8, r14, r5)
            goto L_0x095d
        L_0x07c0:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17971k(r9, r8, r14, r5)
            goto L_0x095d
        L_0x07cf:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17958f(r9, r8, r14, r5)
            goto L_0x095d
        L_0x07de:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17964h(r9, r8, r14, r5)
            goto L_0x095d
        L_0x07ed:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17951d(r9, r8, r14, r5)
            goto L_0x095d
        L_0x07fc:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17947c(r9, r8, r14, r5)
            goto L_0x095d
        L_0x080b:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17943b((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.C8118wx) r14, (boolean) r5)
            goto L_0x095d
        L_0x081a:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C7858pw.m17930a((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.C8118wx) r14, (boolean) r5)
            goto L_0x095d
        L_0x0829:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r8)
            com.google.android.gms.internal.ads.nw r9 = r12.m16656a((int) r7)
            r14.mo26592a((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.ads.C7784nw) r9)
            goto L_0x095d
        L_0x083e:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C7596ix.m17217b(r13, r8)
            r14.mo26608d((int) r10, (long) r8)
            goto L_0x095d
        L_0x084f:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r13, (long) r8)
            r14.mo26610e((int) r10, (int) r8)
            goto L_0x095d
        L_0x0860:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C7596ix.m17217b(r13, r8)
            r14.mo26616g(r10, r8)
            goto L_0x095d
        L_0x0871:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r13, (long) r8)
            r14.mo26599b((int) r10, (int) r8)
            goto L_0x095d
        L_0x0882:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r13, (long) r8)
            r14.mo26607d((int) r10, (int) r8)
            goto L_0x095d
        L_0x0893:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r13, (long) r8)
            r14.mo26604c((int) r10, (int) r8)
            goto L_0x095d
        L_0x08a4:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r8)
            com.google.android.gms.internal.ads.zzdmr r8 = (com.google.android.gms.internal.ads.zzdmr) r8
            r14.mo26590a((int) r10, (com.google.android.gms.internal.ads.zzdmr) r8)
            goto L_0x095d
        L_0x08b7:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r8)
            com.google.android.gms.internal.ads.nw r9 = r12.m16656a((int) r7)
            r14.mo26600b((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.ads.C7784nw) r9)
            goto L_0x095d
        L_0x08cc:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C7596ix.m17234f(r13, r8)
            m16661a((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.ads.C8118wx) r14)
            goto L_0x095d
        L_0x08dd:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = com.google.android.gms.internal.ads.C7596ix.m17225c(r13, r8)
            r14.mo26597a((int) r10, (boolean) r8)
            goto L_0x095d
        L_0x08ee:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r13, (long) r8)
            r14.mo26588a((int) r10, (int) r8)
            goto L_0x095d
        L_0x08fe:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C7596ix.m17217b(r13, r8)
            r14.mo26605c((int) r10, (long) r8)
            goto L_0x095d
        L_0x090e:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C7596ix.m17201a((java.lang.Object) r13, (long) r8)
            r14.mo26613f((int) r10, (int) r8)
            goto L_0x095d
        L_0x091e:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C7596ix.m17217b(r13, r8)
            r14.mo26614f((int) r10, (long) r8)
            goto L_0x095d
        L_0x092e:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C7596ix.m17217b(r13, r8)
            r14.mo26611e((int) r10, (long) r8)
            goto L_0x095d
        L_0x093e:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = com.google.android.gms.internal.ads.C7596ix.m17226d(r13, r8)
            r14.mo26587a((int) r10, (float) r8)
            goto L_0x095d
        L_0x094e:
            boolean r9 = r12.m16666a(r13, (int) r7)
            if (r9 == 0) goto L_0x095d
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = com.google.android.gms.internal.ads.C7596ix.m17231e(r13, r8)
            r14.mo26586a((int) r10, (double) r8)
        L_0x095d:
            int r7 = r7 + 3
            goto L_0x04e5
        L_0x0961:
            com.google.android.gms.internal.ads.wu<?> r13 = r12.f14682p
            r13.mo26742a((java.util.Map.Entry<?, ?>) r0)
            throw r3
        L_0x0967:
            if (r0 != 0) goto L_0x096f
            com.google.android.gms.internal.ads.ex<?, ?> r0 = r12.f14681o
            m16662a(r0, r13, (com.google.android.gms.internal.ads.C8118wx) r14)
            return
        L_0x096f:
            com.google.android.gms.internal.ads.wu<?> r13 = r12.f14682p
            r13.mo26746a(r14, r0)
            throw r3
        L_0x0975:
            r12.m16675b(r13, (com.google.android.gms.internal.ads.C8118wx) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7337bw.mo25746a(java.lang.Object, com.google.android.gms.internal.ads.wx):void");
    }

    /* renamed from: b */
    private final Object m16672b(int i) {
        return this.f14668b[(i / 3) << 1];
    }

    /* renamed from: b */
    public final void mo25749b(T t) {
        int i;
        int i2 = this.f14677k;
        while (true) {
            i = this.f14678l;
            if (i2 >= i) {
                break;
            }
            long d = (long) (m16680d(this.f14676j[i2]) & 1048575);
            Object f = C7596ix.m17234f(t, d);
            if (f != null) {
                C7596ix.m17211a((Object) t, d, this.f14683q.mo26705b(f));
            }
            i2++;
        }
        int length = this.f14676j.length;
        while (i < length) {
            this.f14680n.mo26222b(t, (long) this.f14676j[i]);
            i++;
        }
        this.f14681o.mo25885a((Object) t);
        if (this.f14672f) {
            this.f14682p.mo26748a((Object) t);
        }
    }

    /* renamed from: b */
    private static <T> double m16670b(T t, long j) {
        return ((Double) C7596ix.m17234f(t, j)).doubleValue();
    }

    /* renamed from: b */
    private final void m16673b(T t, int i) {
        if (!this.f14674h) {
            int e = m16682e(i);
            long j = (long) (e & 1048575);
            C7596ix.m17209a((Object) t, j, C7596ix.m17201a((Object) t, j) | (1 << (e >>> 20)));
        }
    }

    /* renamed from: b */
    private final void m16674b(T t, int i, int i2) {
        C7596ix.m17209a((Object) t, (long) (m16682e(i2) & 1048575), i);
    }

    /* renamed from: b */
    private final int m16671b(int i, int i2) {
        int length = (this.f14667a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f14667a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private final zzdog m16678c(int i) {
        return (zzdog) this.f14668b[((i / 3) << 1) + 1];
    }

    /* renamed from: c */
    private static <T> float m16677c(T t, long j) {
        return ((Float) C7596ix.m17234f(t, j)).floatValue();
    }

    /* renamed from: c */
    private final boolean m16679c(T t, T t2, int i) {
        return m16666a(t, i) == m16666a(t2, i);
    }

    /* renamed from: a */
    private final <K, V> void m16663a(C8118wx wxVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            wxVar.mo26589a(i, this.f14683q.mo26707d(m16672b(i2)), this.f14683q.mo26704a(obj));
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m16662a(C7449ex<UT, UB> exVar, T t, C8118wx wxVar) throws IOException {
        exVar.mo25890a(exVar.mo25900d(t), wxVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:149|150|(1:152)|153|(5:175|155|(2:158|156)|256|(2:160|264)(1:265))(1:252)) */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        r8.mo25892a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0598, code lost:
        if (r9 == null) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x059a, code lost:
        r9 = r8.mo25901e(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x05a3, code lost:
        if (r8.mo25893a(r9, r12) == false) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x05a5, code lost:
        r12 = r10.f14677k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x05a9, code lost:
        if (r12 < r10.f14678l) goto L_0x05ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x05ab, code lost:
        r9 = m16658a((java.lang.Object) r11, r10.f14676j[r12], r9, r8);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x05b6, code lost:
        if (r9 != null) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x05b8, code lost:
        r8.mo25897b((java.lang.Object) r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x0595 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25745a(T r11, com.google.android.gms.internal.ads.C7747mw r12, com.google.android.gms.internal.ads.zzdno r13) throws java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            if (r13 == 0) goto L_0x05d4
            com.google.android.gms.internal.ads.ex<?, ?> r8 = r10.f14681o
            com.google.android.gms.internal.ads.wu<?> r1 = r10.f14682p
            r9 = r0
        L_0x0008:
            int r2 = r12.mo26276h()     // Catch:{ all -> 0x05bc }
            int r3 = r10.m16687g(r2)     // Catch:{ all -> 0x05bc }
            if (r3 >= 0) goto L_0x006f
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L_0x002e
            int r12 = r10.f14677k
        L_0x0019:
            int r13 = r10.f14678l
            if (r12 >= r13) goto L_0x0028
            int[] r13 = r10.f14676j
            r13 = r13[r12]
            java.lang.Object r9 = r10.m16658a((java.lang.Object) r11, (int) r13, r9, r8)
            int r12 = r12 + 1
            goto L_0x0019
        L_0x0028:
            if (r9 == 0) goto L_0x002d
            r8.mo25897b((java.lang.Object) r11, r9)
        L_0x002d:
            return
        L_0x002e:
            boolean r3 = r10.f14672f     // Catch:{ all -> 0x05bc }
            if (r3 != 0) goto L_0x0034
            r3 = r0
            goto L_0x003b
        L_0x0034:
            com.google.android.gms.internal.ads.zzdpk r3 = r10.f14671e     // Catch:{ all -> 0x05bc }
            java.lang.Object r2 = r1.mo26744a(r13, r3, r2)     // Catch:{ all -> 0x05bc }
            r3 = r2
        L_0x003b:
            if (r3 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.zu r5 = r1.mo26751c(r11)     // Catch:{ all -> 0x05bc }
            r2 = r12
            r4 = r13
            r6 = r9
            r7 = r8
            r1.mo26743a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x05bc }
            throw r0
        L_0x0049:
            r8.mo25892a((com.google.android.gms.internal.ads.C7747mw) r12)     // Catch:{ all -> 0x05bc }
            if (r9 != 0) goto L_0x0052
            java.lang.Object r9 = r8.mo25901e(r11)     // Catch:{ all -> 0x05bc }
        L_0x0052:
            boolean r2 = r8.mo25893a(r9, (com.google.android.gms.internal.ads.C7747mw) r12)     // Catch:{ all -> 0x05bc }
            if (r2 != 0) goto L_0x0008
            int r12 = r10.f14677k
        L_0x005a:
            int r13 = r10.f14678l
            if (r12 >= r13) goto L_0x0069
            int[] r13 = r10.f14676j
            r13 = r13[r12]
            java.lang.Object r9 = r10.m16658a((java.lang.Object) r11, (int) r13, r9, r8)
            int r12 = r12 + 1
            goto L_0x005a
        L_0x0069:
            if (r9 == 0) goto L_0x006e
            r8.mo25897b((java.lang.Object) r11, r9)
        L_0x006e:
            return
        L_0x006f:
            int r4 = r10.m16680d((int) r3)     // Catch:{ all -> 0x05bc }
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            r6 = 1048575(0xfffff, float:1.469367E-39)
            switch(r5) {
                case 0: goto L_0x0569;
                case 1: goto L_0x055a;
                case 2: goto L_0x054b;
                case 3: goto L_0x053c;
                case 4: goto L_0x052d;
                case 5: goto L_0x051e;
                case 6: goto L_0x050f;
                case 7: goto L_0x0500;
                case 8: goto L_0x04f8;
                case 9: goto L_0x04c7;
                case 10: goto L_0x04b8;
                case 11: goto L_0x04a9;
                case 12: goto L_0x0487;
                case 13: goto L_0x0478;
                case 14: goto L_0x0469;
                case 15: goto L_0x045a;
                case 16: goto L_0x044b;
                case 17: goto L_0x041a;
                case 18: goto L_0x040c;
                case 19: goto L_0x03fe;
                case 20: goto L_0x03f0;
                case 21: goto L_0x03e2;
                case 22: goto L_0x03d4;
                case 23: goto L_0x03c6;
                case 24: goto L_0x03b8;
                case 25: goto L_0x03aa;
                case 26: goto L_0x0388;
                case 27: goto L_0x0376;
                case 28: goto L_0x0368;
                case 29: goto L_0x035a;
                case 30: goto L_0x0345;
                case 31: goto L_0x0337;
                case 32: goto L_0x0329;
                case 33: goto L_0x031b;
                case 34: goto L_0x030d;
                case 35: goto L_0x02ff;
                case 36: goto L_0x02f1;
                case 37: goto L_0x02e3;
                case 38: goto L_0x02d5;
                case 39: goto L_0x02c7;
                case 40: goto L_0x02b9;
                case 41: goto L_0x02ab;
                case 42: goto L_0x029d;
                case 43: goto L_0x028f;
                case 44: goto L_0x027a;
                case 45: goto L_0x026c;
                case 46: goto L_0x025e;
                case 47: goto L_0x0250;
                case 48: goto L_0x0242;
                case 49: goto L_0x0230;
                case 50: goto L_0x01ee;
                case 51: goto L_0x01dc;
                case 52: goto L_0x01ca;
                case 53: goto L_0x01b8;
                case 54: goto L_0x01a6;
                case 55: goto L_0x0194;
                case 56: goto L_0x0182;
                case 57: goto L_0x0170;
                case 58: goto L_0x015e;
                case 59: goto L_0x0156;
                case 60: goto L_0x0125;
                case 61: goto L_0x0117;
                case 62: goto L_0x0105;
                case 63: goto L_0x00e0;
                case 64: goto L_0x00ce;
                case 65: goto L_0x00bc;
                case 66: goto L_0x00aa;
                case 67: goto L_0x0098;
                case 68: goto L_0x0086;
                default: goto L_0x007e;
            }
        L_0x007e:
            if (r9 != 0) goto L_0x0578
            java.lang.Object r9 = r8.mo25884a()     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0578
        L_0x0086:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.nw r6 = r10.m16656a((int) r3)     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r6 = r12.mo26262b(r6, r13)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0098:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            long r6 = r12.mo26267d()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x00aa:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            int r6 = r12.mo26256a()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x00bc:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            long r6 = r12.mo26294q()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x00ce:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            int r6 = r12.mo26292p()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x00e0:
            int r5 = r12.mo26290o()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.zzdog r7 = r10.m16678c((int) r3)     // Catch:{ zzdol -> 0x0595 }
            if (r7 == 0) goto L_0x00f7
            boolean r7 = r7.mo25753a(r5)     // Catch:{ zzdol -> 0x0595 }
            if (r7 == 0) goto L_0x00f1
            goto L_0x00f7
        L_0x00f1:
            java.lang.Object r9 = com.google.android.gms.internal.ads.C7858pw.m17926a((int) r2, (int) r5, r9, r8)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x00f7:
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r6, (java.lang.Object) r4)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0105:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            int r6 = r12.mo26286m()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0117:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.zzdmr r6 = r12.mo26284l()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0125:
            boolean r5 = r10.m16667a(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            if (r5 == 0) goto L_0x0141
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r6 = com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r4)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.nw r7 = r10.m16656a((int) r3)     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r7 = r12.mo26257a(r7, r13)     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r6 = com.google.android.gms.internal.ads.zzdod.m24035a((java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0151
        L_0x0141:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.nw r6 = r10.m16656a((int) r3)     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r6 = r12.mo26257a(r6, r13)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
        L_0x0151:
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0156:
            r10.m16664a((java.lang.Object) r11, (int) r4, (com.google.android.gms.internal.ads.C7747mw) r12)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x015e:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            boolean r6 = r12.mo26266c()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0170:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            int r6 = r12.mo26280j()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0182:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            long r6 = r12.mo26271f()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0194:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            int r6 = r12.mo26278i()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x01a6:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            long r6 = r12.mo26261b()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x01b8:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            long r6 = r12.mo26269e()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x01ca:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            float r6 = r12.readFloat()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x01dc:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            double r6 = r12.readDouble()     // Catch:{ zzdol -> 0x0595 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16674b(r11, (int) r2, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x01ee:
            java.lang.Object r2 = r10.m16672b((int) r3)     // Catch:{ zzdol -> 0x0595 }
            int r3 = r10.m16680d((int) r3)     // Catch:{ zzdol -> 0x0595 }
            r3 = r3 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            if (r5 != 0) goto L_0x0208
            com.google.android.gms.internal.ads.vv r5 = r10.f14683q     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r5 = r5.mo26706c(r2)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r3, (java.lang.Object) r5)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x021f
        L_0x0208:
            com.google.android.gms.internal.ads.vv r6 = r10.f14683q     // Catch:{ zzdol -> 0x0595 }
            boolean r6 = r6.mo26708e(r5)     // Catch:{ zzdol -> 0x0595 }
            if (r6 == 0) goto L_0x021f
            com.google.android.gms.internal.ads.vv r6 = r10.f14683q     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r6 = r6.mo26706c(r2)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.vv r7 = r10.f14683q     // Catch:{ zzdol -> 0x0595 }
            r7.mo26703a(r6, r5)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r3, (java.lang.Object) r6)     // Catch:{ zzdol -> 0x0595 }
            r5 = r6
        L_0x021f:
            com.google.android.gms.internal.ads.vv r3 = r10.f14683q     // Catch:{ zzdol -> 0x0595 }
            java.util.Map r3 = r3.mo26709f(r5)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.vv r4 = r10.f14683q     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.uv r2 = r4.mo26707d(r2)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26260a(r3, r2, (com.google.android.gms.internal.ads.zzdno) r13)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0230:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.nw r2 = r10.m16656a((int) r3)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.lv r3 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            java.util.List r3 = r3.mo26220a(r11, r4)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26259a(r3, r2, (com.google.android.gms.internal.ads.zzdno) r13)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0242:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26265c(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0250:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26268d(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x025e:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26291o(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x026c:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26295q(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x027a:
            com.google.android.gms.internal.ads.lv r5 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            java.util.List r4 = r5.mo26220a(r11, r6)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26281j(r4)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.zzdog r3 = r10.m16678c((int) r3)     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r9 = com.google.android.gms.internal.ads.C7858pw.m17927a(r2, r4, r3, r9, r8)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x028f:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26285l(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x029d:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26258a(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x02ab:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26263b(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x02b9:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26289n(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x02c7:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26293p(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x02d5:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26282k(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x02e3:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26279i(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x02f1:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26270e(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x02ff:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26274g(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x030d:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26265c(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x031b:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26268d(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0329:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26291o(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0337:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26295q(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0345:
            com.google.android.gms.internal.ads.lv r5 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzdol -> 0x0595 }
            java.util.List r4 = r5.mo26220a(r11, r6)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26281j(r4)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.zzdog r3 = r10.m16678c((int) r3)     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r9 = com.google.android.gms.internal.ads.C7858pw.m17927a(r2, r4, r3, r9, r8)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x035a:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26285l(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0368:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26272f(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0376:
            com.google.android.gms.internal.ads.nw r2 = r10.m16656a((int) r3)     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.lv r5 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            java.util.List r3 = r5.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26264b(r3, r2, r13)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0388:
            boolean r2 = m16685f(r4)     // Catch:{ zzdol -> 0x0595 }
            if (r2 == 0) goto L_0x039c
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26277h(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x039c:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26287m(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x03aa:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26258a(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x03b8:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26263b(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x03c6:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26289n(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x03d4:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26293p(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x03e2:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26282k(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x03f0:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26279i(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x03fe:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26270e(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x040c:
            com.google.android.gms.internal.ads.lv r2 = r10.f14680n     // Catch:{ zzdol -> 0x0595 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzdol -> 0x0595 }
            java.util.List r2 = r2.mo26220a(r11, r3)     // Catch:{ zzdol -> 0x0595 }
            r12.mo26274g(r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x041a:
            boolean r2 = r10.m16666a(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            if (r2 == 0) goto L_0x0438
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r2 = com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r4)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.nw r3 = r10.m16656a((int) r3)     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r3 = r12.mo26262b(r3, r13)     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzdod.m24035a((java.lang.Object) r2, (java.lang.Object) r3)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0438:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.nw r2 = r10.m16656a((int) r3)     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r2 = r12.mo26262b(r2, r13)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r2)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x044b:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            long r6 = r12.mo26267d()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17210a((java.lang.Object) r11, (long) r4, (long) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x045a:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            int r2 = r12.mo26256a()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17209a((java.lang.Object) r11, (long) r4, (int) r2)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0469:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            long r6 = r12.mo26294q()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17210a((java.lang.Object) r11, (long) r4, (long) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0478:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            int r2 = r12.mo26292p()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17209a((java.lang.Object) r11, (long) r4, (int) r2)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0487:
            int r5 = r12.mo26290o()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.zzdog r7 = r10.m16678c((int) r3)     // Catch:{ zzdol -> 0x0595 }
            if (r7 == 0) goto L_0x049e
            boolean r7 = r7.mo25753a(r5)     // Catch:{ zzdol -> 0x0595 }
            if (r7 == 0) goto L_0x0498
            goto L_0x049e
        L_0x0498:
            java.lang.Object r9 = com.google.android.gms.internal.ads.C7858pw.m17926a((int) r2, (int) r5, r9, r8)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x049e:
            r2 = r4 & r6
            long r6 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17209a((java.lang.Object) r11, (long) r6, (int) r5)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x04a9:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            int r2 = r12.mo26286m()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17209a((java.lang.Object) r11, (long) r4, (int) r2)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x04b8:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.zzdmr r2 = r12.mo26284l()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r2)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x04c7:
            boolean r2 = r10.m16666a(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            if (r2 == 0) goto L_0x04e5
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r2 = com.google.android.gms.internal.ads.C7596ix.m17234f(r11, r4)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.nw r3 = r10.m16656a((int) r3)     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r3 = r12.mo26257a(r3, r13)     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzdod.m24035a((java.lang.Object) r2, (java.lang.Object) r3)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r2)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x04e5:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.nw r2 = r10.m16656a((int) r3)     // Catch:{ zzdol -> 0x0595 }
            java.lang.Object r2 = r12.mo26257a(r2, r13)     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r11, (long) r4, (java.lang.Object) r2)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x04f8:
            r10.m16664a((java.lang.Object) r11, (int) r4, (com.google.android.gms.internal.ads.C7747mw) r12)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0500:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            boolean r2 = r12.mo26266c()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17212a((java.lang.Object) r11, (long) r4, (boolean) r2)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x050f:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            int r2 = r12.mo26280j()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17209a((java.lang.Object) r11, (long) r4, (int) r2)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x051e:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            long r6 = r12.mo26271f()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17210a((java.lang.Object) r11, (long) r4, (long) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x052d:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            int r2 = r12.mo26278i()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17209a((java.lang.Object) r11, (long) r4, (int) r2)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x053c:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            long r6 = r12.mo26261b()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17210a((java.lang.Object) r11, (long) r4, (long) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x054b:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            long r6 = r12.mo26269e()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17210a((java.lang.Object) r11, (long) r4, (long) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x055a:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            float r2 = r12.readFloat()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17208a((java.lang.Object) r11, (long) r4, (float) r2)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0569:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzdol -> 0x0595 }
            double r6 = r12.readDouble()     // Catch:{ zzdol -> 0x0595 }
            com.google.android.gms.internal.ads.C7596ix.m17207a((java.lang.Object) r11, (long) r4, (double) r6)     // Catch:{ zzdol -> 0x0595 }
            r10.m16673b(r11, (int) r3)     // Catch:{ zzdol -> 0x0595 }
            goto L_0x0008
        L_0x0578:
            boolean r2 = r8.mo25893a(r9, (com.google.android.gms.internal.ads.C7747mw) r12)     // Catch:{ zzdol -> 0x0595 }
            if (r2 != 0) goto L_0x0008
            int r12 = r10.f14677k
        L_0x0580:
            int r13 = r10.f14678l
            if (r12 >= r13) goto L_0x058f
            int[] r13 = r10.f14676j
            r13 = r13[r12]
            java.lang.Object r9 = r10.m16658a((java.lang.Object) r11, (int) r13, r9, r8)
            int r12 = r12 + 1
            goto L_0x0580
        L_0x058f:
            if (r9 == 0) goto L_0x0594
            r8.mo25897b((java.lang.Object) r11, r9)
        L_0x0594:
            return
        L_0x0595:
            r8.mo25892a((com.google.android.gms.internal.ads.C7747mw) r12)     // Catch:{ all -> 0x05bc }
            if (r9 != 0) goto L_0x059f
            java.lang.Object r2 = r8.mo25901e(r11)     // Catch:{ all -> 0x05bc }
            r9 = r2
        L_0x059f:
            boolean r2 = r8.mo25893a(r9, (com.google.android.gms.internal.ads.C7747mw) r12)     // Catch:{ all -> 0x05bc }
            if (r2 != 0) goto L_0x0008
            int r12 = r10.f14677k
        L_0x05a7:
            int r13 = r10.f14678l
            if (r12 >= r13) goto L_0x05b6
            int[] r13 = r10.f14676j
            r13 = r13[r12]
            java.lang.Object r9 = r10.m16658a((java.lang.Object) r11, (int) r13, r9, r8)
            int r12 = r12 + 1
            goto L_0x05a7
        L_0x05b6:
            if (r9 == 0) goto L_0x05bb
            r8.mo25897b((java.lang.Object) r11, r9)
        L_0x05bb:
            return
        L_0x05bc:
            r12 = move-exception
            int r13 = r10.f14677k
        L_0x05bf:
            int r0 = r10.f14678l
            if (r13 >= r0) goto L_0x05ce
            int[] r0 = r10.f14676j
            r0 = r0[r13]
            java.lang.Object r9 = r10.m16658a((java.lang.Object) r11, (int) r0, r9, r8)
            int r13 = r13 + 1
            goto L_0x05bf
        L_0x05ce:
            if (r9 == 0) goto L_0x05d3
            r8.mo25897b((java.lang.Object) r11, r9)
        L_0x05d3:
            throw r12
        L_0x05d4:
            goto L_0x05d6
        L_0x05d5:
            throw r0
        L_0x05d6:
            goto L_0x05d5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7337bw.mo25745a(java.lang.Object, com.google.android.gms.internal.ads.mw, com.google.android.gms.internal.ads.zzdno):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m16654a(byte[] r1, int r2, int r3, com.google.android.gms.internal.ads.zzdri r4, java.lang.Class<?> r5, com.google.android.gms.internal.ads.C7335bu r6) throws java.io.IOException {
        /*
            int[] r0 = com.google.android.gms.internal.ads.C7374cw.f14778a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = com.google.android.gms.internal.ads.C7298au.m16507d(r1, r2, r6)
            goto L_0x00ae
        L_0x0019:
            int r1 = com.google.android.gms.internal.ads.C7298au.m16502b(r1, r2, r6)
            long r2 = r6.f14660b
            long r2 = com.google.android.gms.internal.ads.zzdnd.m23781a((long) r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f14661c = r2
            goto L_0x00ae
        L_0x002b:
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r1, r2, r6)
            int r2 = r6.f14659a
            int r2 = com.google.android.gms.internal.ads.zzdnd.m23783e(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f14661c = r2
            goto L_0x00ae
        L_0x003d:
            com.google.android.gms.internal.ads.iw r4 = com.google.android.gms.internal.ads.C7595iw.m17197a()
            com.google.android.gms.internal.ads.nw r4 = r4.mo26088a(r5)
            int r1 = com.google.android.gms.internal.ads.C7298au.m16498a((com.google.android.gms.internal.ads.C7784nw) r4, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.C7335bu) r6)
            goto L_0x00ae
        L_0x004a:
            int r1 = com.google.android.gms.internal.ads.C7298au.m16502b(r1, r2, r6)
            long r2 = r6.f14660b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f14661c = r2
            goto L_0x00ae
        L_0x0057:
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r1, r2, r6)
            int r2 = r6.f14659a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f14661c = r2
            goto L_0x00ae
        L_0x0064:
            float r1 = com.google.android.gms.internal.ads.C7298au.m16506d(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.f14661c = r1
            goto L_0x0084
        L_0x006f:
            long r3 = com.google.android.gms.internal.ads.C7298au.m16503b(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.f14661c = r1
            goto L_0x0091
        L_0x007a:
            int r1 = com.google.android.gms.internal.ads.C7298au.m16499a(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.f14661c = r1
        L_0x0084:
            int r1 = r2 + 4
            goto L_0x00ae
        L_0x0087:
            double r3 = com.google.android.gms.internal.ads.C7298au.m16504c(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.f14661c = r1
        L_0x0091:
            int r1 = r2 + 8
            goto L_0x00ae
        L_0x0094:
            int r1 = com.google.android.gms.internal.ads.C7298au.m16508e(r1, r2, r6)
            goto L_0x00ae
        L_0x0099:
            int r1 = com.google.android.gms.internal.ads.C7298au.m16502b(r1, r2, r6)
            long r2 = r6.f14660b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r2 = 1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.f14661c = r2
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7337bw.m16654a(byte[], int, int, com.google.android.gms.internal.ads.zzdri, java.lang.Class, com.google.android.gms.internal.ads.bu):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0422 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    /* renamed from: a */
    private final int m16652a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.C7335bu r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f14666s
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.zzdoj r11 = (com.google.android.gms.internal.ads.zzdoj) r11
            boolean r12 = r11.mo26833q()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.ads.zzdoj r11 = r11.mo25790c(r12)
            sun.misc.Unsafe r12 = f14666s
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03e4;
                case 19: goto L_0x03a6;
                case 20: goto L_0x0365;
                case 21: goto L_0x0365;
                case 22: goto L_0x034b;
                case 23: goto L_0x030c;
                case 24: goto L_0x02cd;
                case 25: goto L_0x0276;
                case 26: goto L_0x01c3;
                case 27: goto L_0x01a9;
                case 28: goto L_0x0151;
                case 29: goto L_0x034b;
                case 30: goto L_0x0119;
                case 31: goto L_0x02cd;
                case 32: goto L_0x030c;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03e4;
                case 36: goto L_0x03a6;
                case 37: goto L_0x0365;
                case 38: goto L_0x0365;
                case 39: goto L_0x034b;
                case 40: goto L_0x030c;
                case 41: goto L_0x02cd;
                case 42: goto L_0x0276;
                case 43: goto L_0x034b;
                case 44: goto L_0x0119;
                case 45: goto L_0x02cd;
                case 46: goto L_0x030c;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0422
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0422
            com.google.android.gms.internal.ads.nw r1 = r0.m16656a((int) r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.ads.C7298au.m16497a((com.google.android.gms.internal.ads.C7784nw) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.ads.C7335bu) r27)
            java.lang.Object r8 = r7.f14661c
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0422
            int r8 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r9 = r7.f14659a
            if (r2 != r9) goto L_0x0422
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.ads.C7298au.m16497a((com.google.android.gms.internal.ads.C7784nw) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.ads.C7335bu) r27)
            java.lang.Object r8 = r7.f14661c
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            com.google.android.gms.internal.ads.pv r11 = (com.google.android.gms.internal.ads.C7857pv) r11
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r2 = r7.f14659a
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = com.google.android.gms.internal.ads.C7298au.m16502b(r3, r1, r7)
            long r4 = r7.f14660b
            long r4 = com.google.android.gms.internal.ads.zzdnd.m23781a((long) r4)
            r11.mo26438a(r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0423
        L_0x009e:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24047a()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.ads.pv r11 = (com.google.android.gms.internal.ads.C7857pv) r11
            int r1 = com.google.android.gms.internal.ads.C7298au.m16502b(r3, r4, r7)
            long r8 = r7.f14660b
            long r8 = com.google.android.gms.internal.ads.zzdnd.m23781a((long) r8)
            r11.mo26438a(r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r1, r7)
            int r6 = r7.f14659a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.ads.C7298au.m16502b(r3, r4, r7)
            long r8 = r7.f14660b
            long r8 = com.google.android.gms.internal.ads.zzdnd.m23781a((long) r8)
            r11.mo26438a(r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            com.google.android.gms.internal.ads.hv r11 = (com.google.android.gms.internal.ads.C7557hv) r11
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r2 = r7.f14659a
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r1, r7)
            int r4 = r7.f14659a
            int r4 = com.google.android.gms.internal.ads.zzdnd.m23783e(r4)
            r11.mo26051f(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0423
        L_0x00eb:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24047a()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.ads.hv r11 = (com.google.android.gms.internal.ads.C7557hv) r11
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r4 = r7.f14659a
            int r4 = com.google.android.gms.internal.ads.zzdnd.m23783e(r4)
            r11.mo26051f(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r1, r7)
            int r6 = r7.f14659a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r4 = r7.f14659a
            int r4 = com.google.android.gms.internal.ads.zzdnd.m23783e(r4)
            r11.mo26051f(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = com.google.android.gms.internal.ads.C7298au.m16501a((byte[]) r3, (int) r4, (com.google.android.gms.internal.ads.zzdoj<?>) r11, (com.google.android.gms.internal.ads.C7335bu) r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0422
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.ads.C7298au.m16493a((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.zzdoj<?>) r6, (com.google.android.gms.internal.ads.C7335bu) r7)
        L_0x0131:
            com.google.android.gms.internal.ads.zzdob r1 = (com.google.android.gms.internal.ads.zzdob) r1
            com.google.android.gms.internal.ads.zzdqu r3 = r1.zzhhd
            com.google.android.gms.internal.ads.zzdqu r4 = com.google.android.gms.internal.ads.zzdqu.m24095d()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            com.google.android.gms.internal.ads.zzdog r4 = r0.m16678c((int) r8)
            com.google.android.gms.internal.ads.ex<?, ?> r5 = r0.f14681o
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.ads.C7858pw.m17927a(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.ads.zzdqu r3 = (com.google.android.gms.internal.ads.zzdqu) r3
            if (r3 == 0) goto L_0x014e
            r1.zzhhd = r3
        L_0x014e:
            r1 = r2
            goto L_0x0423
        L_0x0151:
            if (r6 != r10) goto L_0x0422
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r4 = r7.f14659a
            if (r4 < 0) goto L_0x01a4
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019f
            if (r4 != 0) goto L_0x0167
            com.google.android.gms.internal.ads.zzdmr r4 = com.google.android.gms.internal.ads.zzdmr.f21488g
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            com.google.android.gms.internal.ads.zzdmr r6 = com.google.android.gms.internal.ads.zzdmr.m23764a((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
        L_0x016e:
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r1, r7)
            int r6 = r7.f14659a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r4 = r7.f14659a
            if (r4 < 0) goto L_0x019a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0195
            if (r4 != 0) goto L_0x018d
            com.google.android.gms.internal.ads.zzdmr r4 = com.google.android.gms.internal.ads.zzdmr.f21488g
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            com.google.android.gms.internal.ads.zzdmr r6 = com.google.android.gms.internal.ads.zzdmr.m23764a((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
            goto L_0x016e
        L_0x0195:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24047a()
            throw r1
        L_0x019a:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24048b()
            throw r1
        L_0x019f:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24047a()
            throw r1
        L_0x01a4:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24048b()
            throw r1
        L_0x01a9:
            if (r6 != r10) goto L_0x0422
            com.google.android.gms.internal.ads.nw r1 = r0.m16656a((int) r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = com.google.android.gms.internal.ads.C7298au.m16496a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0423
        L_0x01c3:
            if (r6 != r10) goto L_0x0422
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x0216
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r6 = r7.f14659a
            if (r6 < 0) goto L_0x0211
            if (r6 != 0) goto L_0x01de
            r11.add(r1)
            goto L_0x01e9
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zzdod.f21586a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
        L_0x01e8:
            int r4 = r4 + r6
        L_0x01e9:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r8 = r7.f14659a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r6, r7)
            int r6 = r7.f14659a
            if (r6 < 0) goto L_0x020c
            if (r6 != 0) goto L_0x0201
            r11.add(r1)
            goto L_0x01e9
        L_0x0201:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zzdod.f21586a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
            goto L_0x01e8
        L_0x020c:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24048b()
            throw r1
        L_0x0211:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24048b()
            throw r1
        L_0x0216:
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r6 = r7.f14659a
            if (r6 < 0) goto L_0x0271
            if (r6 != 0) goto L_0x0224
            r11.add(r1)
            goto L_0x0237
        L_0x0224:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.C7711lx.m17529a((byte[]) r3, (int) r4, (int) r8)
            if (r9 == 0) goto L_0x026c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zzdod.f21586a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
        L_0x0236:
            r4 = r8
        L_0x0237:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r8 = r7.f14659a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r6, r7)
            int r6 = r7.f14659a
            if (r6 < 0) goto L_0x0267
            if (r6 != 0) goto L_0x024f
            r11.add(r1)
            goto L_0x0237
        L_0x024f:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.C7711lx.m17529a((byte[]) r3, (int) r4, (int) r8)
            if (r9 == 0) goto L_0x0262
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zzdod.f21586a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
            goto L_0x0236
        L_0x0262:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24054h()
            throw r1
        L_0x0267:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24048b()
            throw r1
        L_0x026c:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24054h()
            throw r1
        L_0x0271:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24048b()
            throw r1
        L_0x0276:
            r1 = 0
            if (r6 != r10) goto L_0x029e
            com.google.android.gms.internal.ads.cu r11 = (com.google.android.gms.internal.ads.C7372cu) r11
            int r2 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r4 = r7.f14659a
            int r4 = r4 + r2
        L_0x0282:
            if (r2 >= r4) goto L_0x0295
            int r2 = com.google.android.gms.internal.ads.C7298au.m16502b(r3, r2, r7)
            long r5 = r7.f14660b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0290
            r5 = 1
            goto L_0x0291
        L_0x0290:
            r5 = 0
        L_0x0291:
            r11.mo25787a(r5)
            goto L_0x0282
        L_0x0295:
            if (r2 != r4) goto L_0x0299
            goto L_0x014e
        L_0x0299:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24047a()
            throw r1
        L_0x029e:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.ads.cu r11 = (com.google.android.gms.internal.ads.C7372cu) r11
            int r4 = com.google.android.gms.internal.ads.C7298au.m16502b(r3, r4, r7)
            long r8 = r7.f14660b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r11.mo25787a(r6)
        L_0x02b2:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r8 = r7.f14659a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.ads.C7298au.m16502b(r3, r6, r7)
            long r8 = r7.f14660b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02c8
            r6 = 1
            goto L_0x02c9
        L_0x02c8:
            r6 = 0
        L_0x02c9:
            r11.mo25787a(r6)
            goto L_0x02b2
        L_0x02cd:
            if (r6 != r10) goto L_0x02ed
            com.google.android.gms.internal.ads.hv r11 = (com.google.android.gms.internal.ads.C7557hv) r11
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r2 = r7.f14659a
            int r2 = r2 + r1
        L_0x02d8:
            if (r1 >= r2) goto L_0x02e4
            int r4 = com.google.android.gms.internal.ads.C7298au.m16499a(r3, r1)
            r11.mo26051f(r4)
            int r1 = r1 + 4
            goto L_0x02d8
        L_0x02e4:
            if (r1 != r2) goto L_0x02e8
            goto L_0x0423
        L_0x02e8:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24047a()
            throw r1
        L_0x02ed:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.ads.hv r11 = (com.google.android.gms.internal.ads.C7557hv) r11
            int r1 = com.google.android.gms.internal.ads.C7298au.m16499a(r18, r19)
            r11.mo26051f(r1)
        L_0x02f8:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r1, r7)
            int r6 = r7.f14659a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.ads.C7298au.m16499a(r3, r4)
            r11.mo26051f(r1)
            goto L_0x02f8
        L_0x030c:
            if (r6 != r10) goto L_0x032c
            com.google.android.gms.internal.ads.pv r11 = (com.google.android.gms.internal.ads.C7857pv) r11
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r2 = r7.f14659a
            int r2 = r2 + r1
        L_0x0317:
            if (r1 >= r2) goto L_0x0323
            long r4 = com.google.android.gms.internal.ads.C7298au.m16503b(r3, r1)
            r11.mo26438a(r4)
            int r1 = r1 + 8
            goto L_0x0317
        L_0x0323:
            if (r1 != r2) goto L_0x0327
            goto L_0x0423
        L_0x0327:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24047a()
            throw r1
        L_0x032c:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.ads.pv r11 = (com.google.android.gms.internal.ads.C7857pv) r11
            long r8 = com.google.android.gms.internal.ads.C7298au.m16503b(r18, r19)
            r11.mo26438a(r8)
        L_0x0337:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r1, r7)
            int r6 = r7.f14659a
            if (r2 != r6) goto L_0x0423
            long r8 = com.google.android.gms.internal.ads.C7298au.m16503b(r3, r4)
            r11.mo26438a(r8)
            goto L_0x0337
        L_0x034b:
            if (r6 != r10) goto L_0x0353
            int r1 = com.google.android.gms.internal.ads.C7298au.m16501a((byte[]) r3, (int) r4, (com.google.android.gms.internal.ads.zzdoj<?>) r11, (com.google.android.gms.internal.ads.C7335bu) r7)
            goto L_0x0423
        L_0x0353:
            if (r6 != 0) goto L_0x0422
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.ads.C7298au.m16493a((int) r21, (byte[]) r22, (int) r23, (int) r24, (com.google.android.gms.internal.ads.zzdoj<?>) r25, (com.google.android.gms.internal.ads.C7335bu) r26)
            goto L_0x0423
        L_0x0365:
            if (r6 != r10) goto L_0x0385
            com.google.android.gms.internal.ads.pv r11 = (com.google.android.gms.internal.ads.C7857pv) r11
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r2 = r7.f14659a
            int r2 = r2 + r1
        L_0x0370:
            if (r1 >= r2) goto L_0x037c
            int r1 = com.google.android.gms.internal.ads.C7298au.m16502b(r3, r1, r7)
            long r4 = r7.f14660b
            r11.mo26438a(r4)
            goto L_0x0370
        L_0x037c:
            if (r1 != r2) goto L_0x0380
            goto L_0x0423
        L_0x0380:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24047a()
            throw r1
        L_0x0385:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.ads.pv r11 = (com.google.android.gms.internal.ads.C7857pv) r11
            int r1 = com.google.android.gms.internal.ads.C7298au.m16502b(r3, r4, r7)
            long r8 = r7.f14660b
            r11.mo26438a(r8)
        L_0x0392:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r1, r7)
            int r6 = r7.f14659a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.ads.C7298au.m16502b(r3, r4, r7)
            long r8 = r7.f14660b
            r11.mo26438a(r8)
            goto L_0x0392
        L_0x03a6:
            if (r6 != r10) goto L_0x03c5
            com.google.android.gms.internal.ads.dv r11 = (com.google.android.gms.internal.ads.C7410dv) r11
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r2 = r7.f14659a
            int r2 = r2 + r1
        L_0x03b1:
            if (r1 >= r2) goto L_0x03bd
            float r4 = com.google.android.gms.internal.ads.C7298au.m16506d(r3, r1)
            r11.mo25839a(r4)
            int r1 = r1 + 4
            goto L_0x03b1
        L_0x03bd:
            if (r1 != r2) goto L_0x03c0
            goto L_0x0423
        L_0x03c0:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24047a()
            throw r1
        L_0x03c5:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.ads.dv r11 = (com.google.android.gms.internal.ads.C7410dv) r11
            float r1 = com.google.android.gms.internal.ads.C7298au.m16506d(r18, r19)
            r11.mo25839a(r1)
        L_0x03d0:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r1, r7)
            int r6 = r7.f14659a
            if (r2 != r6) goto L_0x0423
            float r1 = com.google.android.gms.internal.ads.C7298au.m16506d(r3, r4)
            r11.mo25839a(r1)
            goto L_0x03d0
        L_0x03e4:
            if (r6 != r10) goto L_0x0403
            com.google.android.gms.internal.ads.uu r11 = (com.google.android.gms.internal.ads.C8041uu) r11
            int r1 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r7)
            int r2 = r7.f14659a
            int r2 = r2 + r1
        L_0x03ef:
            if (r1 >= r2) goto L_0x03fb
            double r4 = com.google.android.gms.internal.ads.C7298au.m16504c(r3, r1)
            r11.mo26665a(r4)
            int r1 = r1 + 8
            goto L_0x03ef
        L_0x03fb:
            if (r1 != r2) goto L_0x03fe
            goto L_0x0423
        L_0x03fe:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24047a()
            throw r1
        L_0x0403:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.ads.uu r11 = (com.google.android.gms.internal.ads.C8041uu) r11
            double r8 = com.google.android.gms.internal.ads.C7298au.m16504c(r18, r19)
            r11.mo26665a(r8)
        L_0x040e:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r1, r7)
            int r6 = r7.f14659a
            if (r2 != r6) goto L_0x0423
            double r8 = com.google.android.gms.internal.ads.C7298au.m16504c(r3, r4)
            r11.mo26665a(r8)
            goto L_0x040e
        L_0x0422:
            r1 = r4
        L_0x0423:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7337bw.m16652a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.bu):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int m16653a(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.ads.C7335bu r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = f14666s
            java.lang.Object r12 = r7.m16672b((int) r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.ads.vv r2 = r7.f14683q
            boolean r2 = r2.mo26708e(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.vv r2 = r7.f14683q
            java.lang.Object r2 = r2.mo26706c(r12)
            com.google.android.gms.internal.ads.vv r3 = r7.f14683q
            r3.mo26703a(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.ads.vv r8 = r7.f14683q
            com.google.android.gms.internal.ads.uv r8 = r8.mo26707d(r12)
            com.google.android.gms.internal.ads.vv r12 = r7.f14683q
            java.util.Map r12 = r12.mo26709f(r1)
            int r10 = com.google.android.gms.internal.ads.C7298au.m16500a(r9, r10, r15)
            int r13 = r15.f14659a
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.f16984b
            V r0 = r8.f16986d
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.ads.C7298au.m16495a((int) r10, (byte[]) r9, (int) r1, (com.google.android.gms.internal.ads.C7335bu) r15)
            int r10 = r15.f14659a
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            com.google.android.gms.internal.ads.zzdri r1 = r8.f16985c
            int r1 = r1.mo29188d()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.ads.zzdri r4 = r8.f16985c
            V r10 = r8.f16986d
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m16654a((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzdri) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.ads.C7335bu) r6)
            java.lang.Object r0 = r15.f14661c
            goto L_0x003e
        L_0x0072:
            com.google.android.gms.internal.ads.zzdri r1 = r8.f16983a
            int r1 = r1.mo29188d()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.ads.zzdri r4 = r8.f16983a
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m16654a((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzdri) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.ads.C7335bu) r6)
            java.lang.Object r14 = r15.f14661c
            goto L_0x003e
        L_0x0087:
            int r10 = com.google.android.gms.internal.ads.C7298au.m16492a((int) r10, (byte[]) r9, (int) r2, (int) r11, (com.google.android.gms.internal.ads.C7335bu) r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            com.google.android.gms.internal.ads.zzdok r8 = com.google.android.gms.internal.ads.zzdok.m24053g()
            throw r8
        L_0x0097:
            com.google.android.gms.internal.ads.zzdok r8 = com.google.android.gms.internal.ads.zzdok.m24047a()
            goto L_0x009d
        L_0x009c:
            throw r8
        L_0x009d:
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7337bw.m16653a(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.ads.bu):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m16651a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.ads.C7335bu r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f14666s
            int[] r7 = r0.f14667a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.ads.nw r2 = r0.m16656a((int) r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.C7298au.m16497a((com.google.android.gms.internal.ads.C7784nw) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (com.google.android.gms.internal.ads.C7335bu) r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.f14661c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.f14661c
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzdod.m24035a((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.C7298au.m16502b(r3, r4, r11)
            long r3 = r11.f14660b
            long r3 = com.google.android.gms.internal.ads.zzdnd.m23781a((long) r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r11)
            int r3 = r11.f14659a
            int r3 = com.google.android.gms.internal.ads.zzdnd.m23783e(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r11)
            int r4 = r11.f14659a
            com.google.android.gms.internal.ads.zzdog r5 = r0.m16678c((int) r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.mo25753a(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.ads.zzdqu r1 = m16684e((java.lang.Object) r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo29175a((int) r2, (java.lang.Object) r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.C7298au.m16508e(r3, r4, r11)
            java.lang.Object r3 = r11.f14661c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            com.google.android.gms.internal.ads.nw r2 = r0.m16656a((int) r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.ads.C7298au.m16498a((com.google.android.gms.internal.ads.C7784nw) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.C7335bu) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.f14661c
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.f14661c
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzdod.m24035a((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r11)
            int r4 = r11.f14659a
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.ads.C7711lx.m17529a((byte[]) r3, (int) r2, (int) r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.ads.zzdok r1 = com.google.android.gms.internal.ads.zzdok.m24054h()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.ads.zzdod.f21586a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.C7298au.m16502b(r3, r4, r11)
            long r3 = r11.f14660b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.C7298au.m16499a(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = com.google.android.gms.internal.ads.C7298au.m16503b(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.C7298au.m16500a(r3, r4, r11)
            int r3 = r11.f14659a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.ads.C7298au.m16502b(r3, r4, r11)
            long r3 = r11.f14660b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = com.google.android.gms.internal.ads.C7298au.m16506d(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = com.google.android.gms.internal.ads.C7298au.m16504c(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7337bw.m16651a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.ads.bu):int");
    }

    /* renamed from: a */
    private final C7784nw m16656a(int i) {
        int i2 = (i / 3) << 1;
        C7784nw nwVar = (C7784nw) this.f14668b[i2];
        if (nwVar != null) {
            return nwVar;
        }
        C7784nw a = C7595iw.m17197a().mo26088a((Class) this.f14668b[i2 + 1]);
        this.f14668b[i2] = a;
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x036a, code lost:
        if (r0 == r15) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03b3, code lost:
        if (r0 == r15) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0174, code lost:
        r6 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0213, code lost:
        r6 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0215, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
        r11 = r34;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023f, code lost:
        r32 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02b6, code lost:
        r0 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b8, code lost:
        r6 = r6 | r22;
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02bc, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02c0, code lost:
        r13 = r33;
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c6, code lost:
        r2 = r7;
        r18 = r9;
        r26 = r10;
        r24 = r11;
        r7 = r32;
        r9 = r8;
        r8 = r34;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo25743a(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.ads.C7335bu r35) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = f14666s
            r16 = 0
            r0 = r32
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            if (r0 >= r13) goto L_0x048c
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.android.gms.internal.ads.C7298au.m16495a((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.ads.C7335bu) r9)
            int r3 = r9.f14659a
            r4 = r0
            r5 = r3
            goto L_0x002a
        L_0x0028:
            r5 = r0
            r4 = r3
        L_0x002a:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0037
            int r2 = r2 / r8
            int r1 = r15.m16649a((int) r3, (int) r2)
            goto L_0x003b
        L_0x0037:
            int r1 = r15.m16687g(r3)
        L_0x003b:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004a
            r24 = r3
            r2 = r4
            r9 = r5
            r26 = r10
            r8 = r11
            r18 = 0
            goto L_0x03e1
        L_0x004a:
            int[] r1 = r15.f14667a
            int r18 = r2 + 1
            r8 = r1[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r8 & r18
            int r11 = r18 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r5
            r5 = r8 & r18
            long r12 = (long) r5
            r5 = 17
            r20 = r8
            if (r11 > r5) goto L_0x02d4
            int r5 = r2 + 2
            r1 = r1[r5]
            int r5 = r1 >>> 20
            r8 = 1
            int r22 = r8 << r5
            r1 = r1 & r18
            r5 = -1
            if (r1 == r7) goto L_0x007e
            if (r7 == r5) goto L_0x0078
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x0078:
            long r6 = (long) r1
            int r6 = r10.getInt(r14, r6)
            r7 = r1
        L_0x007e:
            r1 = 5
            switch(r11) {
                case 0: goto L_0x029e;
                case 1: goto L_0x0284;
                case 2: goto L_0x025e;
                case 3: goto L_0x025e;
                case 4: goto L_0x0243;
                case 5: goto L_0x021e;
                case 6: goto L_0x01fb;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01ae;
                case 9: goto L_0x0178;
                case 10: goto L_0x015d;
                case 11: goto L_0x0243;
                case 12: goto L_0x012b;
                case 13: goto L_0x01fb;
                case 14: goto L_0x021e;
                case 15: goto L_0x0110;
                case 16: goto L_0x00e3;
                case 17: goto L_0x0091;
                default: goto L_0x0082;
            }
        L_0x0082:
            r12 = r31
            r13 = r35
            r9 = r2
            r11 = r3
            r32 = r7
            r8 = r19
            r18 = -1
        L_0x008e:
            r7 = r4
            goto L_0x02c6
        L_0x0091:
            r8 = 3
            if (r0 != r8) goto L_0x00d7
            int r0 = r3 << 3
            r8 = r0 | 4
            com.google.android.gms.internal.ads.nw r0 = r15.m16656a((int) r2)
            r1 = r31
            r9 = r2
            r2 = r4
            r11 = r3
            r3 = r33
            r4 = r8
            r8 = r19
            r18 = -1
            r5 = r35
            int r0 = com.google.android.gms.internal.ads.C7298au.m16497a((com.google.android.gms.internal.ads.C7784nw) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.ads.C7335bu) r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00ba
            r5 = r35
            java.lang.Object r1 = r5.f14661c
            r10.putObject(r14, r12, r1)
            goto L_0x00c9
        L_0x00ba:
            r5 = r35
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r5.f14661c
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzdod.m24035a((java.lang.Object) r1, (java.lang.Object) r2)
            r10.putObject(r14, r12, r1)
        L_0x00c9:
            r6 = r6 | r22
            r12 = r31
            r13 = r33
            r3 = r8
            r2 = r9
            r1 = r11
            r11 = r34
            r9 = r5
            goto L_0x0017
        L_0x00d7:
            r9 = r2
            r11 = r3
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            goto L_0x023f
        L_0x00e3:
            r5 = r35
            r9 = r2
            r11 = r3
            r8 = r19
            r18 = -1
            if (r0 != 0) goto L_0x010b
            r2 = r12
            r12 = r31
            int r13 = com.google.android.gms.internal.ads.C7298au.m16502b(r12, r4, r5)
            long r0 = r5.f14660b
            long r19 = com.google.android.gms.internal.ads.zzdnd.m23781a((long) r0)
            r0 = r10
            r1 = r30
            r32 = r13
            r13 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            r0 = r32
            goto L_0x02bc
        L_0x010b:
            r12 = r31
            r13 = r5
            goto L_0x023f
        L_0x0110:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x023f
            int r0 = com.google.android.gms.internal.ads.C7298au.m16500a(r12, r4, r13)
            int r1 = r13.f14659a
            int r1 = com.google.android.gms.internal.ads.zzdnd.m23783e(r1)
            r10.putInt(r14, r2, r1)
            goto L_0x0174
        L_0x012b:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x023f
            int r0 = com.google.android.gms.internal.ads.C7298au.m16500a(r12, r4, r13)
            int r1 = r13.f14659a
            com.google.android.gms.internal.ads.zzdog r4 = r15.m16678c((int) r9)
            if (r4 == 0) goto L_0x0159
            boolean r4 = r4.mo25753a(r1)
            if (r4 == 0) goto L_0x014b
            goto L_0x0159
        L_0x014b:
            com.google.android.gms.internal.ads.zzdqu r2 = m16684e((java.lang.Object) r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo29175a((int) r8, (java.lang.Object) r1)
            goto L_0x02bc
        L_0x0159:
            r10.putInt(r14, r2, r1)
            goto L_0x0174
        L_0x015d:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x023f
            int r0 = com.google.android.gms.internal.ads.C7298au.m16508e(r12, r4, r13)
            java.lang.Object r1 = r13.f14661c
            r10.putObject(r14, r2, r1)
        L_0x0174:
            r6 = r6 | r22
            goto L_0x02bc
        L_0x0178:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x01aa
            com.google.android.gms.internal.ads.nw r0 = r15.m16656a((int) r9)
            r5 = r33
            int r0 = com.google.android.gms.internal.ads.C7298au.m16498a((com.google.android.gms.internal.ads.C7784nw) r0, (byte[]) r12, (int) r4, (int) r5, (com.google.android.gms.internal.ads.C7335bu) r13)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x019b
            java.lang.Object r1 = r13.f14661c
            r10.putObject(r14, r2, r1)
            goto L_0x0213
        L_0x019b:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r13.f14661c
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzdod.m24035a((java.lang.Object) r1, (java.lang.Object) r4)
            r10.putObject(r14, r2, r1)
            goto L_0x0213
        L_0x01aa:
            r5 = r33
            goto L_0x023f
        L_0x01ae:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x023f
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01c9
            int r0 = com.google.android.gms.internal.ads.C7298au.m16505c(r12, r4, r13)
            goto L_0x01cd
        L_0x01c9:
            int r0 = com.google.android.gms.internal.ads.C7298au.m16507d(r12, r4, r13)
        L_0x01cd:
            java.lang.Object r1 = r13.f14661c
            r10.putObject(r14, r2, r1)
            goto L_0x0213
        L_0x01d3:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x023f
            int r0 = com.google.android.gms.internal.ads.C7298au.m16502b(r12, r4, r13)
            r32 = r0
            long r0 = r13.f14660b
            r19 = 0
            int r4 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x01f2
            r0 = 1
            goto L_0x01f3
        L_0x01f2:
            r0 = 0
        L_0x01f3:
            com.google.android.gms.internal.ads.C7596ix.m17212a((java.lang.Object) r14, (long) r2, (boolean) r0)
            r6 = r6 | r22
            r0 = r32
            goto L_0x0215
        L_0x01fb:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x023f
            int r0 = com.google.android.gms.internal.ads.C7298au.m16499a(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x0213:
            r6 = r6 | r22
        L_0x0215:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r11 = r34
            r13 = r5
            goto L_0x0017
        L_0x021e:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 1
            r18 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x023f
            long r19 = com.google.android.gms.internal.ads.C7298au.m16503b(r12, r4)
            r0 = r10
            r1 = r30
            r32 = r7
            r7 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x02b6
        L_0x023f:
            r32 = r7
            goto L_0x008e
        L_0x0243:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != 0) goto L_0x02c6
            int r0 = com.google.android.gms.internal.ads.C7298au.m16500a(r12, r7, r13)
            int r1 = r13.f14659a
            r10.putInt(r14, r2, r1)
            goto L_0x02b8
        L_0x025e:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != 0) goto L_0x02c6
            int r7 = com.google.android.gms.internal.ads.C7298au.m16502b(r12, r7, r13)
            long r4 = r13.f14660b
            r0 = r10
            r1 = r30
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            r0 = r7
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r7 = r32
            goto L_0x02c0
        L_0x0284:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r18 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != r1) goto L_0x02c6
            float r0 = com.google.android.gms.internal.ads.C7298au.m16506d(r12, r7)
            com.google.android.gms.internal.ads.C7596ix.m17208a((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r7 + 4
            goto L_0x02b8
        L_0x029e:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r1 = 1
            r18 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != r1) goto L_0x02c6
            double r0 = com.google.android.gms.internal.ads.C7298au.m16504c(r12, r7)
            com.google.android.gms.internal.ads.C7596ix.m17207a((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x02b6:
            int r0 = r7 + 8
        L_0x02b8:
            r6 = r6 | r22
            r7 = r32
        L_0x02bc:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
        L_0x02c0:
            r13 = r33
            r11 = r34
            goto L_0x0017
        L_0x02c6:
            r2 = r7
            r18 = r9
            r26 = r10
            r24 = r11
            r7 = r32
            r9 = r8
            r8 = r34
            goto L_0x03e1
        L_0x02d4:
            r5 = r3
            r17 = r7
            r8 = r19
            r18 = -1
            r7 = r4
            r27 = r12
            r12 = r31
            r13 = r9
            r9 = r2
            r2 = r27
            r1 = 27
            if (r11 != r1) goto L_0x0339
            r1 = 2
            if (r0 != r1) goto L_0x032c
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.google.android.gms.internal.ads.zzdoj r0 = (com.google.android.gms.internal.ads.zzdoj) r0
            boolean r1 = r0.mo26833q()
            if (r1 != 0) goto L_0x0309
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0300
            r1 = 10
            goto L_0x0302
        L_0x0300:
            int r1 = r1 << 1
        L_0x0302:
            com.google.android.gms.internal.ads.zzdoj r0 = r0.mo25790c(r1)
            r10.putObject(r14, r2, r0)
        L_0x0309:
            r11 = r0
            com.google.android.gms.internal.ads.nw r0 = r15.m16656a((int) r9)
            r1 = r8
            r2 = r31
            r3 = r7
            r4 = r33
            r7 = r5
            r5 = r11
            r19 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.ads.C7298au.m16496a(r0, r1, r2, r3, r4, r5, r6)
            r11 = r34
            r1 = r7
            r3 = r8
            r2 = r9
            r9 = r13
            r7 = r17
            r6 = r19
            r13 = r33
            goto L_0x0017
        L_0x032c:
            r19 = r6
            r24 = r5
            r15 = r7
            r25 = r8
            r18 = r9
            r26 = r10
            goto L_0x03b6
        L_0x0339:
            r19 = r6
            r6 = r5
            r1 = 49
            if (r11 > r1) goto L_0x0388
            r5 = r20
            long r4 = (long) r5
            r1 = r0
            r0 = r29
            r32 = r1
            r1 = r30
            r22 = r2
            r2 = r31
            r3 = r7
            r20 = r4
            r4 = r33
            r5 = r8
            r24 = r6
            r15 = r7
            r7 = r32
            r25 = r8
            r8 = r9
            r18 = r9
            r26 = r10
            r9 = r20
            r12 = r22
            r14 = r35
            int r0 = r0.m16652a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.ads.C7335bu) r14)
            if (r0 != r15) goto L_0x036e
            goto L_0x03dd
        L_0x036e:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r7 = r17
            r2 = r18
            r6 = r19
            r1 = r24
            r3 = r25
            r10 = r26
            goto L_0x0017
        L_0x0388:
            r32 = r0
            r22 = r2
            r24 = r6
            r15 = r7
            r25 = r8
            r18 = r9
            r26 = r10
            r5 = r20
            r0 = 50
            if (r11 != r0) goto L_0x03c0
            r7 = r32
            r0 = 2
            if (r7 != r0) goto L_0x03b6
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r22
            r8 = r35
            int r0 = r0.m16653a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.ads.C7335bu) r8)
            if (r0 != r15) goto L_0x036e
            goto L_0x03dd
        L_0x03b6:
            r8 = r34
            r2 = r15
        L_0x03b9:
            r7 = r17
            r6 = r19
            r9 = r25
            goto L_0x03e1
        L_0x03c0:
            r7 = r32
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r8 = r5
            r5 = r25
            r6 = r24
            r9 = r11
            r10 = r22
            r12 = r18
            r13 = r35
            int r0 = r0.m16651a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.ads.C7335bu) r13)
            if (r0 != r15) goto L_0x0470
        L_0x03dd:
            r8 = r34
            r2 = r0
            goto L_0x03b9
        L_0x03e1:
            if (r9 != r8) goto L_0x03ef
            if (r8 != 0) goto L_0x03e6
            goto L_0x03ef
        L_0x03e6:
            r1 = -1
            r10 = r29
            r13 = r30
            r0 = r2
            r3 = r9
            goto L_0x0496
        L_0x03ef:
            r10 = r29
            boolean r0 = r10.f14672f
            if (r0 == 0) goto L_0x044b
            r11 = r35
            com.google.android.gms.internal.ads.zzdno r0 = r11.f14662d
            com.google.android.gms.internal.ads.zzdno r1 = com.google.android.gms.internal.ads.zzdno.m23985c()
            if (r0 == r1) goto L_0x0448
            com.google.android.gms.internal.ads.zzdpk r0 = r10.f14671e
            com.google.android.gms.internal.ads.zzdno r1 = r11.f14662d
            r12 = r24
            com.google.android.gms.internal.ads.zzdob$zzd r0 = r1.mo29117a(r0, r12)
            if (r0 != 0) goto L_0x0429
            com.google.android.gms.internal.ads.zzdqu r4 = m16684e((java.lang.Object) r30)
            r0 = r9
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.ads.C7298au.m16494a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzdqu) r4, (com.google.android.gms.internal.ads.C7335bu) r5)
            r14 = r30
            r13 = r33
            r3 = r9
            r15 = r10
            r9 = r11
            r1 = r12
            r2 = r18
            r10 = r26
            r12 = r31
            goto L_0x046d
        L_0x0429:
            r13 = r30
            r0 = r13
            com.google.android.gms.internal.ads.zzdob$zzc r0 = (com.google.android.gms.internal.ads.zzdob.zzc) r0
            com.google.android.gms.internal.ads.zu<java.lang.Object> r1 = r0.zzhhj
            boolean r1 = r1.mo26892c()
            if (r1 == 0) goto L_0x0440
            com.google.android.gms.internal.ads.zu<java.lang.Object> r1 = r0.zzhhj
            java.lang.Object r1 = r1.clone()
            com.google.android.gms.internal.ads.zu r1 = (com.google.android.gms.internal.ads.C8226zu) r1
            r0.zzhhj = r1
        L_0x0440:
            com.google.android.gms.internal.ads.zu<java.lang.Object> r0 = r0.zzhhj
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0448:
            r13 = r30
            goto L_0x044f
        L_0x044b:
            r13 = r30
            r11 = r35
        L_0x044f:
            r12 = r24
            com.google.android.gms.internal.ads.zzdqu r4 = m16684e((java.lang.Object) r30)
            r0 = r9
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.ads.C7298au.m16494a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzdqu) r4, (com.google.android.gms.internal.ads.C7335bu) r5)
            r3 = r9
            r15 = r10
            r9 = r11
            r1 = r12
            r14 = r13
            r2 = r18
            r10 = r26
            r12 = r31
            r13 = r33
        L_0x046d:
            r11 = r8
            goto L_0x0017
        L_0x0470:
            r12 = r24
            r9 = r25
            r15 = r29
            r14 = r30
            r13 = r33
            r11 = r34
            r3 = r9
            r1 = r12
            r7 = r17
            r2 = r18
            r6 = r19
            r10 = r26
            r12 = r31
            r9 = r35
            goto L_0x0017
        L_0x048c:
            r19 = r6
            r17 = r7
            r26 = r10
            r8 = r11
            r13 = r14
            r10 = r15
            r1 = -1
        L_0x0496:
            if (r7 == r1) goto L_0x049e
            long r1 = (long) r7
            r4 = r26
            r4.putInt(r13, r1, r6)
        L_0x049e:
            r1 = 0
            int r2 = r10.f14677k
        L_0x04a1:
            int r4 = r10.f14678l
            if (r2 >= r4) goto L_0x04b4
            int[] r4 = r10.f14676j
            r4 = r4[r2]
            com.google.android.gms.internal.ads.ex<?, ?> r5 = r10.f14681o
            java.lang.Object r1 = r10.m16658a((java.lang.Object) r13, (int) r4, r1, r5)
            com.google.android.gms.internal.ads.zzdqu r1 = (com.google.android.gms.internal.ads.zzdqu) r1
            int r2 = r2 + 1
            goto L_0x04a1
        L_0x04b4:
            if (r1 == 0) goto L_0x04bb
            com.google.android.gms.internal.ads.ex<?, ?> r2 = r10.f14681o
            r2.mo25897b((java.lang.Object) r13, r1)
        L_0x04bb:
            if (r8 != 0) goto L_0x04c7
            r1 = r33
            if (r0 != r1) goto L_0x04c2
            goto L_0x04cd
        L_0x04c2:
            com.google.android.gms.internal.ads.zzdok r0 = com.google.android.gms.internal.ads.zzdok.m24053g()
            throw r0
        L_0x04c7:
            r1 = r33
            if (r0 > r1) goto L_0x04ce
            if (r3 != r8) goto L_0x04ce
        L_0x04cd:
            return r0
        L_0x04ce:
            com.google.android.gms.internal.ads.zzdok r0 = com.google.android.gms.internal.ads.zzdok.m24053g()
            goto L_0x04d4
        L_0x04d3:
            throw r0
        L_0x04d4:
            goto L_0x04d3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7337bw.mo25743a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.bu):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010b, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015b, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e2, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020f, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022e, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25748a(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.ads.C7335bu r32) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            boolean r0 = r15.f14674h
            if (r0 == 0) goto L_0x025d
            sun.misc.Unsafe r9 = f14666s
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0254
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.ads.C7298au.m16495a((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.ads.C7335bu) r11)
            int r3 = r11.f14659a
            r8 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r8 = r3
        L_0x002c:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0039
            int r2 = r2 / 3
            int r0 = r15.m16649a((int) r7, (int) r2)
            goto L_0x003d
        L_0x0039:
            int r0 = r15.m16687g(r7)
        L_0x003d:
            r4 = r0
            if (r4 != r10) goto L_0x004b
            r24 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r26 = -1
            goto L_0x0231
        L_0x004b:
            int[] r0 = r15.f14667a
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0167
            r0 = 1
            switch(r3) {
                case 0: goto L_0x014e;
                case 1: goto L_0x013f;
                case 2: goto L_0x012d;
                case 3: goto L_0x012d;
                case 4: goto L_0x011f;
                case 5: goto L_0x010f;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00e8;
                case 8: goto L_0x00d1;
                case 9: goto L_0x00b0;
                case 10: goto L_0x00a3;
                case 11: goto L_0x011f;
                case 12: goto L_0x0094;
                case 13: goto L_0x00fe;
                case 14: goto L_0x010f;
                case 15: goto L_0x0081;
                case 16: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x01a4
        L_0x0066:
            if (r6 != 0) goto L_0x01a4
            int r6 = com.google.android.gms.internal.ads.C7298au.m16502b(r12, r8, r11)
            r19 = r1
            long r0 = r11.f14660b
            long r21 = com.google.android.gms.internal.ads.zzdnd.m23781a((long) r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x013d
        L_0x0081:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.ads.C7298au.m16500a(r12, r8, r11)
            int r1 = r11.f14659a
            int r1 = com.google.android.gms.internal.ads.zzdnd.m23783e(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x0094:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.ads.C7298au.m16500a(r12, r8, r11)
            int r1 = r11.f14659a
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x00a3:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            int r0 = com.google.android.gms.internal.ads.C7298au.m16508e(r12, r8, r11)
            java.lang.Object r1 = r11.f14661c
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00b0:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            com.google.android.gms.internal.ads.nw r0 = r15.m16656a((int) r4)
            int r0 = com.google.android.gms.internal.ads.C7298au.m16498a((com.google.android.gms.internal.ads.C7784nw) r0, (byte[]) r12, (int) r8, (int) r13, (com.google.android.gms.internal.ads.C7335bu) r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00c7
            java.lang.Object r1 = r11.f14661c
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00c7:
            java.lang.Object r5 = r11.f14661c
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzdod.m24035a((java.lang.Object) r1, (java.lang.Object) r5)
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00d1:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00de
            int r0 = com.google.android.gms.internal.ads.C7298au.m16505c(r12, r8, r11)
            goto L_0x00e2
        L_0x00de:
            int r0 = com.google.android.gms.internal.ads.C7298au.m16507d(r12, r8, r11)
        L_0x00e2:
            java.lang.Object r1 = r11.f14661c
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00e8:
            r2 = r1
            if (r6 != 0) goto L_0x01a4
            int r1 = com.google.android.gms.internal.ads.C7298au.m16502b(r12, r8, r11)
            long r5 = r11.f14660b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            com.google.android.gms.internal.ads.C7596ix.m17212a((java.lang.Object) r14, (long) r2, (boolean) r0)
            r0 = r1
            goto L_0x010b
        L_0x00fe:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x01a4
            int r0 = com.google.android.gms.internal.ads.C7298au.m16499a(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x010b:
            r2 = r4
            r1 = r7
            goto L_0x0251
        L_0x010f:
            r2 = r1
            if (r6 != r0) goto L_0x01a4
            long r5 = com.google.android.gms.internal.ads.C7298au.m16503b(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0159
        L_0x011f:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.ads.C7298au.m16500a(r12, r8, r11)
            int r1 = r11.f14659a
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x012d:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r6 = com.google.android.gms.internal.ads.C7298au.m16502b(r12, r8, r11)
            long r4 = r11.f14660b
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x013d:
            r0 = r6
            goto L_0x015b
        L_0x013f:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x015f
            float r0 = com.google.android.gms.internal.ads.C7298au.m16506d(r12, r8)
            com.google.android.gms.internal.ads.C7596ix.m17208a((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r8 + 4
            goto L_0x015b
        L_0x014e:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x015f
            double r0 = com.google.android.gms.internal.ads.C7298au.m16504c(r12, r8)
            com.google.android.gms.internal.ads.C7596ix.m17207a((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x0159:
            int r0 = r8 + 8
        L_0x015b:
            r1 = r7
            r2 = r10
            goto L_0x0251
        L_0x015f:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x01ab
        L_0x0167:
            r0 = 27
            if (r3 != r0) goto L_0x01af
            if (r6 != r10) goto L_0x01a4
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.android.gms.internal.ads.zzdoj r0 = (com.google.android.gms.internal.ads.zzdoj) r0
            boolean r3 = r0.mo26833q()
            if (r3 != 0) goto L_0x018b
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0182
            r3 = 10
            goto L_0x0184
        L_0x0182:
            int r3 = r3 << 1
        L_0x0184:
            com.google.android.gms.internal.ads.zzdoj r0 = r0.mo25790c(r3)
            r9.putObject(r14, r1, r0)
        L_0x018b:
            r5 = r0
            com.google.android.gms.internal.ads.nw r0 = r15.m16656a((int) r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = com.google.android.gms.internal.ads.C7298au.m16496a(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x0251
        L_0x01a4:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x01ab:
            r26 = -1
            goto L_0x0212
        L_0x01af:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e5
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.m16652a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.ads.C7335bu) r14)
            if (r0 != r15) goto L_0x0241
            goto L_0x0230
        L_0x01e5:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0214
            r7 = r30
            if (r7 != r10) goto L_0x0212
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.m16653a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.ads.C7335bu) r8)
            if (r0 != r15) goto L_0x0241
            goto L_0x0230
        L_0x0212:
            r2 = r15
            goto L_0x0231
        L_0x0214:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.m16651a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.ads.C7335bu) r13)
            if (r0 != r15) goto L_0x0241
        L_0x0230:
            r2 = r0
        L_0x0231:
            com.google.android.gms.internal.ads.zzdqu r4 = m16684e((java.lang.Object) r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = com.google.android.gms.internal.ads.C7298au.m16494a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.ads.zzdqu) r4, (com.google.android.gms.internal.ads.C7335bu) r5)
        L_0x0241:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
        L_0x0251:
            r10 = -1
            goto L_0x0017
        L_0x0254:
            r4 = r13
            if (r0 != r4) goto L_0x0258
            return
        L_0x0258:
            com.google.android.gms.internal.ads.zzdok r0 = com.google.android.gms.internal.ads.zzdok.m24053g()
            throw r0
        L_0x025d:
            r4 = r13
            r5 = 0
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r32
            r0.mo25743a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.C7335bu) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7337bw.mo25748a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.bu):void");
    }

    /* renamed from: a */
    private final <UT, UB> UB m16658a(Object obj, int i, UB ub, C7449ex<UT, UB> exVar) {
        zzdog c;
        int i2 = this.f14667a[i];
        Object f = C7596ix.m17234f(obj, (long) (m16680d(i) & 1048575));
        if (f == null || (c = m16678c(i)) == null) {
            return ub;
        }
        return m16657a(i, i2, this.f14683q.mo26709f(f), c, ub, exVar);
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m16657a(int i, int i2, Map<K, V> map, zzdog zzdog, UB ub, C7449ex<UT, UB> exVar) {
        C8042uv<?, ?> d = this.f14683q.mo26707d(m16672b(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!zzdog.mo25753a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = exVar.mo25884a();
                }
                C7634ju j = zzdmr.m23768j(zzdpc.m24072a(d, next.getKey(), next.getValue()));
                try {
                    zzdpc.m24073a(j.mo26142b(), d, next.getKey(), next.getValue());
                    exVar.mo25888a(ub, i2, j.mo26141a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    private static boolean m16669a(Object obj, int i, C7784nw nwVar) {
        return nwVar.mo25752d(C7596ix.m17234f(obj, (long) (i & 1048575)));
    }

    /* renamed from: a */
    private static void m16661a(int i, Object obj, C8118wx wxVar) throws IOException {
        if (obj instanceof String) {
            wxVar.mo26593a(i, (String) obj);
        } else {
            wxVar.mo26590a(i, (zzdmr) obj);
        }
    }

    /* renamed from: a */
    private final void m16664a(Object obj, int i, C7747mw mwVar) throws IOException {
        if (m16685f(i)) {
            C7596ix.m17211a(obj, (long) (i & 1048575), (Object) mwVar.mo26273g());
        } else if (this.f14673g) {
            C7596ix.m17211a(obj, (long) (i & 1048575), (Object) mwVar.mo26288n());
        } else {
            C7596ix.m17211a(obj, (long) (i & 1048575), (Object) mwVar.mo26284l());
        }
    }

    /* renamed from: a */
    private final boolean m16668a(T t, int i, int i2, int i3) {
        if (this.f14674h) {
            return m16666a(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    private final boolean m16666a(T t, int i) {
        if (this.f14674h) {
            int d = m16680d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return C7596ix.m17231e(t, j) != 0.0d;
                case 1:
                    return C7596ix.m17226d(t, j) != 0.0f;
                case 2:
                    return C7596ix.m17217b(t, j) != 0;
                case 3:
                    return C7596ix.m17217b(t, j) != 0;
                case 4:
                    return C7596ix.m17201a((Object) t, j) != 0;
                case 5:
                    return C7596ix.m17217b(t, j) != 0;
                case 6:
                    return C7596ix.m17201a((Object) t, j) != 0;
                case 7:
                    return C7596ix.m17225c(t, j);
                case 8:
                    Object f = C7596ix.m17234f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof zzdmr) {
                        return !zzdmr.f21488g.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C7596ix.m17234f(t, j) != null;
                case 10:
                    return !zzdmr.f21488g.equals(C7596ix.m17234f(t, j));
                case 11:
                    return C7596ix.m17201a((Object) t, j) != 0;
                case 12:
                    return C7596ix.m17201a((Object) t, j) != 0;
                case 13:
                    return C7596ix.m17201a((Object) t, j) != 0;
                case 14:
                    return C7596ix.m17217b(t, j) != 0;
                case 15:
                    return C7596ix.m17201a((Object) t, j) != 0;
                case 16:
                    return C7596ix.m17217b(t, j) != 0;
                case 17:
                    return C7596ix.m17234f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e = m16682e(i);
            return (C7596ix.m17201a((Object) t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: a */
    private final boolean m16667a(T t, int i, int i2) {
        return C7596ix.m17201a((Object) t, (long) (m16682e(i2) & 1048575)) == i;
    }

    /* renamed from: a */
    private final int m16649a(int i, int i2) {
        if (i < this.f14669c || i > this.f14670d) {
            return -1;
        }
        return m16671b(i, i2);
    }
}
