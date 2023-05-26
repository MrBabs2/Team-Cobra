package p050l.p075h.p084l.p086f0;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: l.h.l.f0.b */
/* compiled from: PathInterpolatorCompat */
public final class C5053b {
    /* renamed from: a */
    public static Interpolator m9088a(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new C5052a(f, f2, f3, f4);
    }
}
