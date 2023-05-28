package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.p0 */
/* compiled from: TintResources */
class C0276p0 extends C0255h0 {

    /* renamed from: b */
    private final WeakReference<Context> f1171b;

    public C0276p0(Context context, Resources resources) {
        super(resources);
        this.f1171b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1171b.get();
        if (!(drawable == null || context == null)) {
            C0246g0.m1150a().mo1558a(context, i, drawable);
        }
        return drawable;
    }
}
