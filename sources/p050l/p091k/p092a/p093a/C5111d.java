package p050l.p091k.p092a.p093a;

import android.view.animation.Interpolator;

/* renamed from: l.k.a.a.d */
/* compiled from: LookupTableInterpolator */
abstract class C5111d implements Interpolator {

    /* renamed from: a */
    private final float[] f9013a;

    /* renamed from: b */
    private final float f9014b;

    protected C5111d(float[] fArr) {
        this.f9013a = fArr;
        this.f9014b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f9013a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f9014b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f9013a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
