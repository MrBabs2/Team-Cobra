package p112n.p277e.p279b.p282b.p294w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.C0278q0;
import p050l.p051a.p052k.p053a.C4800a;

/* renamed from: n.e.b.b.w.c */
/* compiled from: MaterialResources */
public class C10620c {
    /* renamed from: a */
    public static ColorStateList m35957a(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (b = C4800a.m7935b(context, resourceId)) != null) {
            return b;
        }
        if (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i, -1)) == -1) {
            return typedArray.getColorStateList(i);
        }
        return ColorStateList.valueOf(color);
    }

    /* renamed from: b */
    public static Drawable m35959b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable c;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (c = C4800a.m7936c(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return c;
    }

    /* renamed from: c */
    public static C10621d m35960c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C10621d(context, resourceId);
    }

    /* renamed from: a */
    public static ColorStateList m35958a(Context context, C0278q0 q0Var, int i) {
        int a;
        int g;
        ColorStateList b;
        if (q0Var.mo1730g(i) && (g = q0Var.mo1729g(i, 0)) != 0 && (b = C4800a.m7935b(context, g)) != null) {
            return b;
        }
        if (Build.VERSION.SDK_INT > 15 || (a = q0Var.mo1712a(i, -1)) == -1) {
            return q0Var.mo1713a(i);
        }
        return ColorStateList.valueOf(a);
    }

    /* renamed from: a */
    public static int m35955a(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: a */
    static int m35956a(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }
}
