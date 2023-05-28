package com.airbnb.lottie.p139v;

/* renamed from: com.airbnb.lottie.v.d */
/* compiled from: MeanCalculator */
public class C5827d {

    /* renamed from: a */
    private float f10492a;

    /* renamed from: b */
    private int f10493b;

    /* renamed from: a */
    public void mo19737a(float f) {
        float f2 = this.f10492a + f;
        this.f10492a = f2;
        int i = this.f10493b + 1;
        this.f10493b = i;
        if (i == Integer.MAX_VALUE) {
            this.f10492a = f2 / 2.0f;
            this.f10493b = i / 2;
        }
    }
}
