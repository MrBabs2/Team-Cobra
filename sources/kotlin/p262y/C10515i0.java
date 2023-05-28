package kotlin.p262y;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.C10221n;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.y.i0 */
/* compiled from: MapsJVM.kt */
class C10515i0 extends C10513h0 {
    /* renamed from: a */
    public static int m35582a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m35584a(C10221n<? extends K, ? extends V> nVar) {
        C10202j.m34178b(nVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(nVar.mo35391c(), nVar.mo35392d());
        C10202j.m34174a((Object) singletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: a */
    public static <K, V> SortedMap<K, V> m35585a(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        C10202j.m34178b(map, "$this$toSortedMap");
        C10202j.m34178b(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m35583a(Map<? extends K, ? extends V> map) {
        C10202j.m34178b(map, "$this$toSingletonMap");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C10202j.m34174a((Object) singletonMap, "java.util.Collections.singletonMap(key, value)");
        C10202j.m34174a((Object) singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
