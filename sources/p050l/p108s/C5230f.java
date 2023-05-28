package p050l.p108s;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: l.s.f */
/* compiled from: ObjectAnimatorUtils */
class C5230f {
    /* renamed from: a */
    static <T> ObjectAnimator m9755a(T t, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(t, new C5234h(property, path), new float[]{0.0f, 1.0f});
    }
}
