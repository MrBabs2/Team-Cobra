package p050l.p108s;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: l.s.e0 */
/* compiled from: ViewUtilsApi21 */
class C5229e0 extends C5223d0 {

    /* renamed from: f */
    private static boolean f9270f = true;

    /* renamed from: g */
    private static boolean f9271g = true;

    C5229e0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo18048a(View view, Matrix matrix) {
        if (f9270f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f9270f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public void mo18049b(View view, Matrix matrix) {
        if (f9271g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f9271g = false;
            }
        }
    }
}
