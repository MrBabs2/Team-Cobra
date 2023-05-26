package p050l.p075h.p082j;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: l.h.j.f */
/* compiled from: TextUtilsCompat */
public final class C5000f {

    /* renamed from: a */
    private static final Locale f8859a = new Locale("", "");

    /* renamed from: a */
    private static int m8884a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m8885b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f8859a)) {
            return 0;
        }
        String b = C4988b.m8861b(locale);
        if (b == null) {
            return m8884a(locale);
        }
        return (b.equalsIgnoreCase("Arab") || b.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
