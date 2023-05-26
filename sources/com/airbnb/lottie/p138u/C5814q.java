package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.p140w.C5830a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p050l.p066e.C4882h;

/* renamed from: com.airbnb.lottie.u.q */
/* compiled from: KeyframeParser */
class C5814q {

    /* renamed from: a */
    private static final Interpolator f10477a = new LinearInterpolator();

    /* renamed from: b */
    private static C4882h<WeakReference<Interpolator>> f10478b;

    C5814q() {
    }

    /* renamed from: a */
    private static C4882h<WeakReference<Interpolator>> m11315a() {
        if (f10478b == null) {
            f10478b = new C4882h<>();
        }
        return f10478b;
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m11314a(int i) {
        WeakReference<Interpolator> a;
        synchronized (C5814q.class) {
            a = m11315a().mo17043a(i);
        }
        return a;
    }

    /* renamed from: a */
    private static void m11316a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C5814q.class) {
            f10478b.mo17050c(i, weakReference);
        }
    }

    /* renamed from: a */
    static <T> C5830a<T> m11312a(JsonReader jsonReader, C5648d dVar, float f, C5806j0<T> j0Var, boolean z) throws IOException {
        if (z) {
            return m11313a(dVar, jsonReader, f, j0Var);
        }
        return m11311a(jsonReader, f, j0Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: android.view.animation.Interpolator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> com.airbnb.lottie.p140w.C5830a<T> m11313a(com.airbnb.lottie.C5648d r16, android.util.JsonReader r17, float r18, com.airbnb.lottie.p138u.C5806j0<T> r19) throws java.io.IOException {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r17.beginObject()
            r5 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
        L_0x0012:
            boolean r10 = r17.hasNext()
            if (r10 == 0) goto L_0x00d2
            java.lang.String r10 = r17.nextName()
            r12 = -1
            int r15 = r10.hashCode()
            r3 = 101(0x65, float:1.42E-43)
            r4 = 1
            if (r15 == r3) goto L_0x0089
            r3 = 111(0x6f, float:1.56E-43)
            if (r15 == r3) goto L_0x007f
            r3 = 3701(0xe75, float:5.186E-42)
            if (r15 == r3) goto L_0x0075
            r3 = 3707(0xe7b, float:5.195E-42)
            if (r15 == r3) goto L_0x006b
            r3 = 104(0x68, float:1.46E-43)
            if (r15 == r3) goto L_0x0061
            r3 = 105(0x69, float:1.47E-43)
            if (r15 == r3) goto L_0x0057
            r3 = 115(0x73, float:1.61E-43)
            if (r15 == r3) goto L_0x004d
            r3 = 116(0x74, float:1.63E-43)
            if (r15 == r3) goto L_0x0043
            goto L_0x0092
        L_0x0043:
            java.lang.String r3 = "t"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0092
            r12 = 0
            goto L_0x0092
        L_0x004d:
            java.lang.String r3 = "s"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0092
            r12 = 1
            goto L_0x0092
        L_0x0057:
            java.lang.String r3 = "i"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0092
            r12 = 4
            goto L_0x0092
        L_0x0061:
            java.lang.String r3 = "h"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0092
            r12 = 5
            goto L_0x0092
        L_0x006b:
            java.lang.String r3 = "to"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0092
            r12 = 6
            goto L_0x0092
        L_0x0075:
            java.lang.String r3 = "ti"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0092
            r12 = 7
            goto L_0x0092
        L_0x007f:
            java.lang.String r3 = "o"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0092
            r12 = 3
            goto L_0x0092
        L_0x0089:
            java.lang.String r3 = "e"
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0092
            r12 = 2
        L_0x0092:
            switch(r12) {
                case 0: goto L_0x00ca;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00be;
                case 3: goto L_0x00b8;
                case 4: goto L_0x00b2;
                case 5: goto L_0x00a6;
                case 6: goto L_0x00a0;
                case 7: goto L_0x009a;
                default: goto L_0x0095;
            }
        L_0x0095:
            r17.skipValue()
            goto L_0x0012
        L_0x009a:
            android.graphics.PointF r14 = com.airbnb.lottie.p138u.C5812p.m11309d(r17, r18)
            goto L_0x0012
        L_0x00a0:
            android.graphics.PointF r13 = com.airbnb.lottie.p138u.C5812p.m11309d(r17, r18)
            goto L_0x0012
        L_0x00a6:
            int r3 = r17.nextInt()
            if (r3 != r4) goto L_0x00af
            r5 = 1
            goto L_0x0012
        L_0x00af:
            r5 = 0
            goto L_0x0012
        L_0x00b2:
            android.graphics.PointF r7 = com.airbnb.lottie.p138u.C5812p.m11309d(r17, r18)
            goto L_0x0012
        L_0x00b8:
            android.graphics.PointF r6 = com.airbnb.lottie.p138u.C5812p.m11309d(r17, r18)
            goto L_0x0012
        L_0x00be:
            java.lang.Object r9 = r2.mo19696a(r0, r1)
            goto L_0x0012
        L_0x00c4:
            java.lang.Object r8 = r2.mo19696a(r0, r1)
            goto L_0x0012
        L_0x00ca:
            double r3 = r17.nextDouble()
            float r3 = (float) r3
            r11 = r3
            goto L_0x0012
        L_0x00d2:
            r17.endObject()
            if (r5 == 0) goto L_0x00dc
            android.view.animation.Interpolator r0 = f10477a
            r10 = r0
            r9 = r8
            goto L_0x013f
        L_0x00dc:
            if (r6 == 0) goto L_0x013c
            if (r7 == 0) goto L_0x013c
            float r0 = r6.x
            float r2 = -r1
            float r0 = com.airbnb.lottie.p139v.C5828e.m11365a((float) r0, (float) r2, (float) r1)
            r6.x = r0
            float r0 = r6.y
            r3 = 1120403456(0x42c80000, float:100.0)
            r4 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r0 = com.airbnb.lottie.p139v.C5828e.m11365a((float) r0, (float) r4, (float) r3)
            r6.y = r0
            float r0 = r7.x
            float r0 = com.airbnb.lottie.p139v.C5828e.m11365a((float) r0, (float) r2, (float) r1)
            r7.x = r0
            float r0 = r7.y
            float r0 = com.airbnb.lottie.p139v.C5828e.m11365a((float) r0, (float) r4, (float) r3)
            r7.y = r0
            float r2 = r6.x
            float r3 = r6.y
            float r4 = r7.x
            int r0 = com.airbnb.lottie.p139v.C5829f.m11378a((float) r2, (float) r3, (float) r4, (float) r0)
            java.lang.ref.WeakReference r2 = m11314a(r0)
            if (r2 == 0) goto L_0x011d
            java.lang.Object r3 = r2.get()
            r4 = r3
            android.view.animation.Interpolator r4 = (android.view.animation.Interpolator) r4
            goto L_0x011e
        L_0x011d:
            r4 = 0
        L_0x011e:
            if (r2 == 0) goto L_0x0122
            if (r4 != 0) goto L_0x013a
        L_0x0122:
            float r2 = r6.x
            float r2 = r2 / r1
            float r3 = r6.y
            float r3 = r3 / r1
            float r4 = r7.x
            float r4 = r4 / r1
            float r5 = r7.y
            float r5 = r5 / r1
            android.view.animation.Interpolator r4 = p050l.p075h.p084l.p086f0.C5053b.m9088a(r2, r3, r4, r5)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ ArrayIndexOutOfBoundsException -> 0x013a }
            r1.<init>(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x013a }
            m11316a(r0, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x013a }
        L_0x013a:
            r10 = r4
            goto L_0x013f
        L_0x013c:
            android.view.animation.Interpolator r0 = f10477a
            r10 = r0
        L_0x013f:
            com.airbnb.lottie.w.a r0 = new com.airbnb.lottie.w.a
            r12 = 0
            r6 = r0
            r7 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.f10508i = r13
            r0.f10509j = r14
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p138u.C5814q.m11313a(com.airbnb.lottie.d, android.util.JsonReader, float, com.airbnb.lottie.u.j0):com.airbnb.lottie.w.a");
    }

    /* renamed from: a */
    private static <T> C5830a<T> m11311a(JsonReader jsonReader, float f, C5806j0<T> j0Var) throws IOException {
        return new C5830a<>(j0Var.mo19696a(jsonReader, f));
    }
}
