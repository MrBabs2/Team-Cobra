package com.google.android.material.bottomappbar;

import p112n.p277e.p279b.p282b.p297z.C10637f;
import p112n.p277e.p279b.p282b.p297z.C10652m;

/* renamed from: com.google.android.material.bottomappbar.a */
/* compiled from: BottomAppBarTopEdgeTreatment */
public class C8443a extends C10637f implements Cloneable {

    /* renamed from: f */
    private float f23904f;

    /* renamed from: g */
    private float f23905g;

    /* renamed from: h */
    private float f23906h;

    /* renamed from: i */
    private float f23907i;

    /* renamed from: j */
    private float f23908j;

    /* renamed from: a */
    public void mo30959a(float f, float f2, float f3, C10652m mVar) {
        float f4 = f;
        C10652m mVar2 = mVar;
        float f5 = this.f23906h;
        if (f5 == 0.0f) {
            mVar2.mo36319a(f4, 0.0f);
            return;
        }
        float f6 = ((this.f23905g * 2.0f) + f5) / 2.0f;
        float f7 = f3 * this.f23904f;
        float f8 = f2 + this.f23908j;
        float f9 = (this.f23907i * f3) + ((1.0f - f3) * f6);
        if (f9 / f6 >= 1.0f) {
            mVar2.mo36319a(f4, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) - (f11 * f11)));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f11)));
        float f14 = 90.0f - degrees;
        mVar2.mo36319a(f12, 0.0f);
        float f15 = f7 * 2.0f;
        float f16 = degrees;
        mVar.mo36321a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        mVar.mo36321a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        mVar.mo36321a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - f16, f16);
        mVar2.mo36319a(f4, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30960b(float f) {
        this.f23905g = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo30961c() {
        return this.f23907i;
    }

    /* renamed from: d */
    public void mo30963d(float f) {
        this.f23906h = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo30965e(float f) {
        this.f23908j = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo30966f() {
        return this.f23904f;
    }

    /* renamed from: g */
    public float mo30967g() {
        return this.f23906h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo30962c(float f) {
        this.f23904f = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo30964e() {
        return this.f23905g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30958a(float f) {
        if (f >= 0.0f) {
            this.f23907i = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }
}
