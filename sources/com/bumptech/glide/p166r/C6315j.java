package com.bumptech.glide.p166r;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: com.bumptech.glide.r.j */
/* compiled from: Preconditions */
public final class C6315j {
    /* renamed from: a */
    public static void m12982a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static <T> T m12978a(T t) {
        m12979a(t, "Argument must not be null");
        return t;
    }

    /* renamed from: a */
    public static <T> T m12979a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static String m12980a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: a */
    public static <T extends Collection<Y>, Y> T m12981a(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }
}
