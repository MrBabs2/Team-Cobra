package p112n.p277e.p279b.p282b.p294w;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: n.e.b.b.w.b */
/* compiled from: MaterialAttributes */
public class C10619b {
    /* renamed from: a */
    public static TypedValue m35953a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: a */
    public static int m35951a(Context context, int i, String str) {
        TypedValue a = m35953a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: a */
    public static int m35952a(View view, int i) {
        return m35951a(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: a */
    public static boolean m35954a(Context context, int i, boolean z) {
        TypedValue a = m35953a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        return a.data != 0;
    }
}
