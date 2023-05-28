package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.reflect.jvm.internal.impl.utils.a */
/* compiled from: collections.kt */
public final class C12141a {
    /* renamed from: a */
    public static final <K> Map<K, Integer> m40132a(Iterable<? extends K> iterable) {
        C10202j.m34178b(iterable, "$this$mapToIndex");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object put : iterable) {
            linkedHashMap.put(put, Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    public static final <K, V> HashMap<K, V> m40134b(int i) {
        return new HashMap<>(m40130a(i));
    }

    /* renamed from: c */
    public static final <E> HashSet<E> m40135c(int i) {
        return new HashSet<>(m40130a(i));
    }

    /* renamed from: d */
    public static final <E> LinkedHashSet<E> m40136d(int i) {
        return new LinkedHashSet<>(m40130a(i));
    }

    /* renamed from: a */
    public static final <T> void m40133a(Collection<T> collection, T t) {
        C10202j.m34178b(collection, "$this$addIfNotNull");
        if (t != null) {
            collection.add(t);
        }
    }

    /* renamed from: a */
    private static final int m40130a(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    /* renamed from: a */
    public static final <T> List<T> m40131a(ArrayList<T> arrayList) {
        C10202j.m34178b(arrayList, "$this$compact");
        int size = arrayList.size();
        if (size == 0) {
            return C10529o.m35736a();
        }
        if (size == 1) {
            return C10527n.m35729a(C10539w.m35799e(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
