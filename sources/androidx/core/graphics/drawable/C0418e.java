package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.drawable.e */
/* compiled from: WrappedDrawableApi21 */
class C0418e extends C0417d {

    /* renamed from: m */
    private static Method f1818m;

    C0418e(Drawable drawable) {
        super(drawable);
        m2038c();
    }

    /* renamed from: c */
    private void m2038c() {
        if (f1818m == null) {
            try {
                f1818m = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2333b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f1817k;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.f1817k.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f1817k.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.f1817k.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f1817k.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo2333b()) {
            super.setTint(i);
        } else {
            this.f1817k.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo2333b()) {
            super.setTintList(colorStateList);
        } else {
            this.f1817k.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo2333b()) {
            super.setTintMode(mode);
        } else {
            this.f1817k.setTintMode(mode);
        }
    }

    C0418e(C0419f fVar, Resources resources) {
        super(fVar, resources);
        m2038c();
    }
}
