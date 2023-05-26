package p050l.p075h.p082j;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: l.h.j.b */
/* compiled from: ICUCompat */
public final class C4988b {

    /* renamed from: a */
    private static Method f8836a;

    /* renamed from: b */
    private static Method f8837b;

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                if (cls2 != null) {
                    f8836a = cls2.getMethod("getScript", new Class[]{cls});
                    f8837b = cls2.getMethod("addLikelySubtags", new Class[]{cls});
                }
            } catch (Exception e) {
                f8836a = null;
                f8837b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f8837b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m8859a(String str) {
        try {
            if (f8836a != null) {
                return (String) f8836a.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    /* renamed from: b */
    public static String m8861b(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f8837b.invoke((Object) null, new Object[]{locale})).getScript();
            } catch (InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        } else {
            String a = m8860a(locale);
            if (a != null) {
                return m8859a(a);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static String m8860a(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f8837b != null) {
                return (String) f8837b.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }
}
