package p112n.p277e.p279b.p282b.p283m;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: n.e.b.b.m.g */
/* compiled from: MatrixEvaluator */
public class C10591g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f28466a = new float[9];

    /* renamed from: b */
    private final float[] f28467b = new float[9];

    /* renamed from: c */
    private final Matrix f28468c = new Matrix();

    /* renamed from: a */
    public Matrix mo31822a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f28466a);
        matrix2.getValues(this.f28467b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f28467b;
            float f2 = fArr[i];
            float[] fArr2 = this.f28466a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f28468c.setValues(this.f28467b);
        return this.f28468c;
    }
}
