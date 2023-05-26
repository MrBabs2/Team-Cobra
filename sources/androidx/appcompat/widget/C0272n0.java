package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.n0 */
/* compiled from: TintContextWrapper */
public class C0272n0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1159c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0272n0>> f1160d;

    /* renamed from: a */
    private final Resources f1161a;

    /* renamed from: b */
    private final Resources.Theme f1162b;

    private C0272n0(Context context) {
        super(context);
        if (C0296v0.m1411b()) {
            C0296v0 v0Var = new C0296v0(this, context.getResources());
            this.f1161a = v0Var;
            Resources.Theme newTheme = v0Var.newTheme();
            this.f1162b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1161a = new C0276p0(this, context.getResources());
        this.f1162b = null;
    }

    /* renamed from: a */
    private static boolean m1255a(Context context) {
        if ((context instanceof C0272n0) || (context.getResources() instanceof C0276p0) || (context.getResources() instanceof C0296v0)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || C0296v0.m1411b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Context m1256b(Context context) {
        if (!m1255a(context)) {
            return context;
        }
        synchronized (f1159c) {
            if (f1160d == null) {
                f1160d = new ArrayList<>();
            } else {
                for (int size = f1160d.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1160d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1160d.remove(size);
                    }
                }
                for (int size2 = f1160d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1160d.get(size2);
                    C0272n0 n0Var = weakReference2 != null ? (C0272n0) weakReference2.get() : null;
                    if (n0Var != null && n0Var.getBaseContext() == context) {
                        return n0Var;
                    }
                }
            }
            C0272n0 n0Var2 = new C0272n0(context);
            f1160d.add(new WeakReference(n0Var2));
            return n0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1161a.getAssets();
    }

    public Resources getResources() {
        return this.f1161a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1162b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1162b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
