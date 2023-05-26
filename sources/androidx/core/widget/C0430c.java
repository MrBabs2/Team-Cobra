package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
/* compiled from: CompoundButtonCompat */
public final class C0430c {

    /* renamed from: a */
    private static Field f1891a;

    /* renamed from: b */
    private static boolean f1892b;

    /* renamed from: a */
    public static void m2128a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof C0438j) {
            ((C0438j) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: b */
    public static ColorStateList m2130b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof C0438j) {
            return ((C0438j) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* renamed from: a */
    public static void m2129a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof C0438j) {
            ((C0438j) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m2127a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f1892b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f1891a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f1892b = true;
        }
        Field field = f1891a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f1891a = null;
            }
        }
        return null;
    }
}
