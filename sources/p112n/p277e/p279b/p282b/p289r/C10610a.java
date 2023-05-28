package p112n.p277e.p279b.p282b.p289r;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: n.e.b.b.r.a */
/* compiled from: DrawableUtils */
public final class C10610a {
    /* renamed from: a */
    public static PorterDuffColorFilter m35929a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
