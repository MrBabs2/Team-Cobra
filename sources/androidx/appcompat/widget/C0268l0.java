package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p050l.p051a.C4799j;
import p050l.p075h.p076e.C4949a;

/* renamed from: androidx.appcompat.widget.l0 */
/* compiled from: ThemeUtils */
public class C0268l0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1147a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1148b = {-16842910};

    /* renamed from: c */
    static final int[] f1149c = {16842908};

    /* renamed from: d */
    static final int[] f1150d = {16842919};

    /* renamed from: e */
    static final int[] f1151e = {16842912};

    /* renamed from: f */
    static final int[] f1152f = new int[0];

    /* renamed from: g */
    private static final int[] f1153g = new int[1];

    /* renamed from: a */
    public static int m1247a(Context context, int i) {
        ColorStateList c = m1252c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f1148b, c.getDefaultColor());
        }
        TypedValue a = m1249a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m1248a(context, i, a.getFloat());
    }

    /* renamed from: b */
    public static int m1251b(Context context, int i) {
        int[] iArr = f1153g;
        iArr[0] = i;
        C0278q0 a = C0278q0.m1270a(context, (AttributeSet) null, iArr);
        try {
            return a.mo1712a(0, 0);
        } finally {
            a.mo1720b();
        }
    }

    /* renamed from: c */
    public static ColorStateList m1252c(Context context, int i) {
        int[] iArr = f1153g;
        iArr[0] = i;
        C0278q0 a = C0278q0.m1270a(context, (AttributeSet) null, iArr);
        try {
            return a.mo1713a(0);
        } finally {
            a.mo1720b();
        }
    }

    /* renamed from: a */
    private static TypedValue m1249a() {
        TypedValue typedValue = f1147a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1147a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    static int m1248a(Context context, int i, float f) {
        int b = m1251b(context, i);
        return C4949a.m8709d(b, Math.round(((float) Color.alpha(b)) * f));
    }

    /* renamed from: a */
    public static void m1250a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C4799j.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(C4799j.AppCompatTheme_windowActionBar)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
