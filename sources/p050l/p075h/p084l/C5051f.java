package p050l.p075h.p084l;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: l.h.l.f */
/* compiled from: LayoutInflaterCompat */
public final class C5051f {

    /* renamed from: a */
    private static Field f8917a;

    /* renamed from: b */
    private static boolean f8918b;

    /* renamed from: a */
    private static void m9085a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f8918b) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f8917a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f8918b = true;
        }
        Field field = f8917a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    /* renamed from: b */
    public static void m9086b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                m9085a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                m9085a(layoutInflater, factory2);
            }
        }
    }
}
