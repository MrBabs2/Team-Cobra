package p050l.p108s;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: l.s.i */
/* compiled from: PropertyValuesHolderUtils */
class C5236i {
    /* renamed from: a */
    static PropertyValuesHolder m9766a(Property<?, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
        return PropertyValuesHolder.ofFloat(new C5234h(property, path), new float[]{0.0f, 1.0f});
    }
}
