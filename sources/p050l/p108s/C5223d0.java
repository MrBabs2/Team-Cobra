package p050l.p108s;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: l.s.d0 */
/* compiled from: ViewUtilsApi19 */
class C5223d0 extends C5237i0 {

    /* renamed from: e */
    private static boolean f9258e = true;

    C5223d0() {
    }

    /* renamed from: a */
    public void mo18043a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo18044a(View view, float f) {
        if (f9258e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f9258e = false;
            }
        }
        view.setAlpha(f);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo18045b(View view) {
        if (f9258e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f9258e = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo18046c(View view) {
    }
}
