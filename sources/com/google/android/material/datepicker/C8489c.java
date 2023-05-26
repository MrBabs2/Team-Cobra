package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.c */
/* compiled from: DateStrings */
class C8489c {
    /* renamed from: a */
    static String m27644a(long j) {
        return m27645a(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m27646b(long j) {
        return m27647b(j, Locale.getDefault());
    }

    /* renamed from: a */
    static String m27645a(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C8514m.m27691a(locale).format(new Date(j));
        }
        return C8514m.m27695b(locale).format(new Date(j));
    }

    /* renamed from: b */
    static String m27647b(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C8514m.m27699c(locale).format(new Date(j));
        }
        return C8514m.m27695b(locale).format(new Date(j));
    }
}
