package p050l.p108s;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: l.s.h0 */
/* compiled from: ViewUtilsApi29 */
class C5235h0 extends C5233g0 {
    C5235h0() {
    }

    /* renamed from: a */
    public void mo18044a(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: b */
    public float mo18045b(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: a */
    public void mo18052a(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: b */
    public void mo18049b(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    /* renamed from: a */
    public void mo18050a(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo18048a(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
