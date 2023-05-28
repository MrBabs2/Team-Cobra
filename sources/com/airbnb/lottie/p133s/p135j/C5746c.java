package com.airbnb.lottie.p133s.p135j;

import com.airbnb.lottie.p139v.C5825b;
import com.airbnb.lottie.p139v.C5828e;

/* renamed from: com.airbnb.lottie.s.j.c */
/* compiled from: GradientColor */
public class C5746c {

    /* renamed from: a */
    private final float[] f10270a;

    /* renamed from: b */
    private final int[] f10271b;

    public C5746c(float[] fArr, int[] iArr) {
        this.f10270a = fArr;
        this.f10271b = iArr;
    }

    /* renamed from: a */
    public int[] mo19578a() {
        return this.f10271b;
    }

    /* renamed from: b */
    public float[] mo19579b() {
        return this.f10270a;
    }

    /* renamed from: c */
    public int mo19580c() {
        return this.f10271b.length;
    }

    /* renamed from: a */
    public void mo19577a(C5746c cVar, C5746c cVar2, float f) {
        if (cVar.f10271b.length == cVar2.f10271b.length) {
            for (int i = 0; i < cVar.f10271b.length; i++) {
                this.f10270a[i] = C5828e.m11375c(cVar.f10270a[i], cVar2.f10270a[i], f);
                this.f10271b[i] = C5825b.m11340a(f, cVar.f10271b[i], cVar2.f10271b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + cVar.f10271b.length + " vs " + cVar2.f10271b.length + ")");
    }
}
