package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class zzdtf {
    /* renamed from: a */
    public static <T> List<T> m24224a(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    /* renamed from: b */
    static <T> HashSet<T> m24225b(int i) {
        return new HashSet<>(m24227d(i));
    }

    /* renamed from: c */
    public static <K, V> LinkedHashMap<K, V> m24226c(int i) {
        return new LinkedHashMap<>(m24227d(i));
    }

    /* renamed from: d */
    private static int m24227d(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
