package p050l.p108s;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: l.s.f0 */
/* compiled from: ViewUtilsApi22 */
class C5231f0 extends C5229e0 {

    /* renamed from: h */
    private static boolean f9272h = true;

    C5231f0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo18050a(View view, int i, int i2, int i3, int i4) {
        if (f9272h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f9272h = false;
            }
        }
    }
}
