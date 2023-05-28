package com.facebook.p032t.p182v;

import com.facebook.internal.p168a0.p170f.C6391a;

/* renamed from: com.facebook.t.v.d */
/* compiled from: Operator */
final class C6682d {
    C6682d() {
    }

    /* renamed from: a */
    static void m14287a(C6669a aVar, C6669a aVar2) {
        Class<C6682d> cls = C6682d.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                int a = aVar.mo21431a(0);
                int a2 = aVar.mo21431a(1);
                int a3 = aVar.mo21431a(2);
                float[] a4 = aVar.mo21433a();
                float[] a5 = aVar2.mo21433a();
                for (int i = 0; i < a; i++) {
                    for (int i2 = 0; i2 < a2; i2++) {
                        for (int i3 = 0; i3 < a3; i3++) {
                            int i4 = (i * a2 * a3) + (i2 * a3) + i3;
                            a4[i4] = a4[i4] + a5[i3];
                        }
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    static void m14290b(C6669a aVar) {
        Class<C6682d> cls = C6682d.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                int a = aVar.mo21431a(0);
                int a2 = aVar.mo21431a(1);
                float[] a3 = aVar.mo21433a();
                for (int i = 0; i < a; i++) {
                    int i2 = i * a2;
                    int i3 = i2 + a2;
                    float f = Float.MIN_VALUE;
                    float f2 = 0.0f;
                    for (int i4 = i2; i4 < i3; i4++) {
                        if (a3[i4] > f) {
                            f = a3[i4];
                        }
                    }
                    for (int i5 = i2; i5 < i3; i5++) {
                        a3[i5] = (float) Math.exp((double) (a3[i5] - f));
                    }
                    for (int i6 = i2; i6 < i3; i6++) {
                        f2 += a3[i6];
                    }
                    while (i2 < i3) {
                        a3[i2] = a3[i2] / f2;
                        i2++;
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: c */
    static C6669a m14292c(C6669a aVar, C6669a aVar2) {
        C6669a aVar3 = aVar2;
        Class<C6682d> cls = C6682d.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            int a = aVar.mo21431a(0);
            int a2 = aVar3.mo21431a(0);
            int a3 = aVar3.mo21431a(1);
            C6669a aVar4 = new C6669a(new int[]{a, a3});
            float[] a4 = aVar.mo21433a();
            float[] a5 = aVar2.mo21433a();
            float[] a6 = aVar4.mo21433a();
            for (int i = 0; i < a; i++) {
                for (int i2 = 0; i2 < a3; i2++) {
                    int i3 = (i * a3) + i2;
                    a6[i3] = 0.0f;
                    for (int i4 = 0; i4 < a2; i4++) {
                        a6[i3] = a6[i3] + (a4[(i * a2) + i4] * a5[(i4 * a3) + i2]);
                    }
                }
            }
            return aVar4;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    static C6669a m14293d(C6669a aVar) {
        Class<C6682d> cls = C6682d.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            int a = aVar.mo21431a(0);
            int a2 = aVar.mo21431a(1);
            int a3 = aVar.mo21431a(2);
            C6669a aVar2 = new C6669a(new int[]{a3, a2, a});
            float[] a4 = aVar.mo21433a();
            float[] a5 = aVar2.mo21433a();
            for (int i = 0; i < a; i++) {
                for (int i2 = 0; i2 < a2; i2++) {
                    for (int i3 = 0; i3 < a3; i3++) {
                        a5[(i3 * a * a2) + (i2 * a) + i] = a4[(i * a2 * a3) + (i2 * a3) + i3];
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static void m14285a(C6669a aVar) {
        Class<C6682d> cls = C6682d.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                float[] a = aVar.mo21433a();
                for (int i = 0; i < a.length; i++) {
                    if (a[i] < 0.0f) {
                        a[i] = 0.0f;
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    static C6669a m14289b(C6669a aVar, C6669a aVar2) {
        C6669a aVar3 = aVar;
        C6669a aVar4 = aVar2;
        Class<C6682d> cls = C6682d.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        int i = 0;
        try {
            int a = aVar3.mo21431a(0);
            int a2 = aVar3.mo21431a(1);
            int a3 = aVar3.mo21431a(2);
            int a4 = aVar4.mo21431a(0);
            int i2 = (a2 - a4) + 1;
            int a5 = aVar4.mo21431a(2);
            C6669a aVar5 = new C6669a(new int[]{a, i2, a5});
            float[] a6 = aVar.mo21433a();
            float[] a7 = aVar5.mo21433a();
            float[] a8 = aVar2.mo21433a();
            int i3 = 0;
            while (i3 < a) {
                int i4 = 0;
                while (i4 < a5) {
                    int i5 = 0;
                    while (i5 < i2) {
                        float f = 0.0f;
                        while (i < a4) {
                            for (int i6 = 0; i6 < a3; i6++) {
                                f += a6[(a2 * a3 * i3) + ((i + i5) * a3) + i6] * a8[(((i * a3) + i6) * a5) + i4];
                            }
                            i++;
                        }
                        a7[(i2 * a5 * i3) + (i5 * a5) + i4] = f;
                        i5++;
                        i = 0;
                    }
                    i4++;
                    i = 0;
                }
                i3++;
                i = 0;
            }
            return aVar5;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static C6669a m14291c(C6669a aVar) {
        Class<C6682d> cls = C6682d.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            int a = aVar.mo21431a(0);
            int a2 = aVar.mo21431a(1);
            C6669a aVar2 = new C6669a(new int[]{a2, a});
            float[] a3 = aVar.mo21433a();
            float[] a4 = aVar2.mo21433a();
            for (int i = 0; i < a; i++) {
                for (int i2 = 0; i2 < a2; i2++) {
                    a4[(i2 * a) + i] = a3[(i * a2) + i2];
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static void m14286a(C6669a aVar, int i) {
        Class<C6682d> cls = C6682d.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                if (i < aVar.mo21434b()) {
                    int i2 = 1;
                    for (int i3 = i; i3 < aVar.mo21434b(); i3++) {
                        i2 *= aVar.mo21431a(i3);
                    }
                    int[] iArr = new int[(i + 1)];
                    for (int i4 = 0; i4 < i; i4++) {
                        iArr[i4] = aVar.mo21431a(i4);
                    }
                    iArr[i] = i2;
                    aVar.mo21432a(iArr);
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: a */
    static C6669a m14283a(C6669a[] aVarArr) {
        Class<C6682d> cls = C6682d.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            int a = aVarArr[0].mo21431a(0);
            int i = 0;
            for (C6669a a2 : aVarArr) {
                i += a2.mo21431a(1);
            }
            C6669a aVar = new C6669a(new int[]{a, i});
            float[] a3 = aVar.mo21433a();
            for (int i2 = 0; i2 < a; i2++) {
                int i3 = i2 * i;
                for (int i4 = 0; i4 < aVarArr.length; i4++) {
                    float[] a4 = aVarArr[i4].mo21433a();
                    int a5 = aVarArr[i4].mo21431a(1);
                    System.arraycopy(a4, i2 * a5, a3, i3, a5);
                    i3 += a5;
                }
            }
            return aVar;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static C6669a m14288b(C6669a aVar, int i) {
        C6669a aVar2 = aVar;
        int i2 = i;
        Class<C6682d> cls = C6682d.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            int a = aVar2.mo21431a(0);
            int a2 = aVar2.mo21431a(1);
            int a3 = aVar2.mo21431a(2);
            int i3 = (a2 - i2) + 1;
            C6669a aVar3 = new C6669a(new int[]{a, i3, a3});
            float[] a4 = aVar.mo21433a();
            float[] a5 = aVar3.mo21433a();
            for (int i4 = 0; i4 < a; i4++) {
                for (int i5 = 0; i5 < a3; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        int i7 = i6 * a3;
                        int i8 = (i4 * i3 * a3) + i7 + i5;
                        int i9 = (i4 * a2 * a3) + i7 + i5;
                        a5[i8] = Float.MIN_VALUE;
                        for (int i10 = 0; i10 < i2; i10++) {
                            a5[i8] = Math.max(a5[i8], a4[i9 + (i10 * a3)]);
                        }
                    }
                }
            }
            return aVar3;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static C6669a m14282a(C6669a aVar, C6669a aVar2, C6669a aVar3) {
        Class<C6682d> cls = C6682d.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            int a = aVar.mo21431a(0);
            int a2 = aVar3.mo21431a(0);
            C6669a c = m14292c(aVar, aVar2);
            float[] a3 = aVar3.mo21433a();
            float[] a4 = c.mo21433a();
            for (int i = 0; i < a; i++) {
                for (int i2 = 0; i2 < a2; i2++) {
                    int i3 = (i * a2) + i2;
                    a4[i3] = a4[i3] + a3[i2];
                }
            }
            return c;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    static C6669a m14284a(String[] strArr, int i, C6669a aVar) {
        Class<C6682d> cls = C6682d.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            int length = strArr.length;
            int a = aVar.mo21431a(1);
            C6669a aVar2 = new C6669a(new int[]{length, i, a});
            float[] a2 = aVar2.mo21433a();
            float[] a3 = aVar.mo21433a();
            for (int i2 = 0; i2 < length; i2++) {
                int[] a4 = C6683e.m14296a(strArr[i2], i);
                for (int i3 = 0; i3 < i; i3++) {
                    System.arraycopy(a3, a4[i3] * a, a2, (a * i * i2) + (a * i3), a);
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
