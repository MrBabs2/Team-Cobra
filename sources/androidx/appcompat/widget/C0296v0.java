package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.v0 */
/* compiled from: VectorEnabledTintResources */
public class C0296v0 extends Resources {

    /* renamed from: b */
    private static boolean f1261b = false;

    /* renamed from: a */
    private final WeakReference<Context> f1262a;

    public C0296v0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1262a = new WeakReference<>(context);
    }

    /* renamed from: b */
    public static boolean m1411b() {
        return m1410a() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo1861a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = (Context) this.f1262a.get();
        if (context != null) {
            return C0246g0.m1150a().mo1555a(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* renamed from: a */
    public static boolean m1410a() {
        return f1261b;
    }
}
