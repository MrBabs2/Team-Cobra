package p050l.p108s;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: l.s.g0 */
/* compiled from: ViewUtilsApi23 */
class C5233g0 extends C5231f0 {

    /* renamed from: i */
    private static boolean f9273i = true;

    C5233g0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo18052a(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo18052a(view, i);
        } else if (f9273i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f9273i = false;
            }
        }
    }
}
