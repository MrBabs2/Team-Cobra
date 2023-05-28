package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: androidx.core.graphics.drawable.f */
/* compiled from: WrappedDrawableState */
final class C0419f extends Drawable.ConstantState {

    /* renamed from: a */
    int f1819a;

    /* renamed from: b */
    Drawable.ConstantState f1820b;

    /* renamed from: c */
    ColorStateList f1821c = null;

    /* renamed from: d */
    PorterDuff.Mode f1822d = C0417d.f1811l;

    C0419f(C0419f fVar) {
        if (fVar != null) {
            this.f1819a = fVar.f1819a;
            this.f1820b = fVar.f1820b;
            this.f1821c = fVar.f1821c;
            this.f1822d = fVar.f1822d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2367a() {
        return this.f1820b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f1819a;
        Drawable.ConstantState constantState = this.f1820b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0418e(this, resources);
        }
        return new C0417d(this, resources);
    }
}
