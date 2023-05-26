package p112n.p277e.p279b.p282b.p283m;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: n.e.b.b.m.e */
/* compiled from: DrawableAlphaProperty */
public class C10589e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f28463b = new C10589e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f28464a = new WeakHashMap<>();

    private C10589e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f28464a.containsKey(drawable)) {
            return this.f28464a.get(drawable);
        }
        return 255;
    }

    /* renamed from: a */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f28464a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
