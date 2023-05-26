package p050l.p108s;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* renamed from: l.s.x */
/* compiled from: ViewGroupUtils */
class C5269x {

    /* renamed from: a */
    private static boolean f9375a = true;

    /* renamed from: a */
    static C5268w m9919a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C5267v(viewGroup);
        }
        return C5266u.m9910a(viewGroup);
    }

    /* renamed from: b */
    static void m9921b(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m9920a(viewGroup, z);
        } else {
            C5270y.m9923a(viewGroup, z);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private static void m9920a(ViewGroup viewGroup, boolean z) {
        if (f9375a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f9375a = false;
            }
        }
    }
}
