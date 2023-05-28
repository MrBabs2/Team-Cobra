package kotlin.p262y;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10221n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.y.j0 */
/* compiled from: Maps.kt */
class C10518j0 extends C10515i0 {
    /* renamed from: a */
    public static <K, V> Map<K, V> m35601a() {
        C10544z zVar = C10544z.f28393f;
        if (zVar != null) {
            return zVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* renamed from: b */
    public static <K, V> V m35608b(Map<K, ? extends V> map, K k) {
        C10202j.m34178b(map, "$this$getValue");
        return C10513h0.m35581a(map, k);
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m35610c(Map<? extends K, ? extends V> map) {
        C10202j.m34178b(map, "$this$toMap");
        int size = map.size();
        if (size == 0) {
            return m35601a();
        }
        if (size != 1) {
            return m35611d(map);
        }
        return C10515i0.m35583a(map);
    }

    /* renamed from: d */
    public static <K, V> Map<K, V> m35611d(Map<? extends K, ? extends V> map) {
        C10202j.m34178b(map, "$this$toMutableMap");
        return new LinkedHashMap(map);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m35604a(C10221n<? extends K, ? extends V>... nVarArr) {
        C10202j.m34178b(nVarArr, "pairs");
        if (nVarArr.length <= 0) {
            return m35601a();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10515i0.m35582a(nVarArr.length));
        m35605a(nVarArr, linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m35609b(Map<K, ? extends V> map) {
        C10202j.m34178b(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        if (size == 0) {
            return m35601a();
        }
        if (size != 1) {
            return map;
        }
        return C10515i0.m35583a(map);
    }

    /* renamed from: a */
    public static final <K, V> void m35607a(Map<? super K, ? super V> map, C10221n<? extends K, ? extends V>[] nVarArr) {
        C10202j.m34178b(map, "$this$putAll");
        C10202j.m34178b(nVarArr, "pairs");
        for (C10221n<? extends K, ? extends V> nVar : nVarArr) {
            map.put(nVar.mo35389a(), nVar.mo35390b());
        }
    }

    /* renamed from: a */
    public static final <K, V> void m35606a(Map<? super K, ? super V> map, Iterable<? extends C10221n<? extends K, ? extends V>> iterable) {
        C10202j.m34178b(map, "$this$putAll");
        C10202j.m34178b(iterable, "pairs");
        for (C10221n nVar : iterable) {
            map.put(nVar.mo35389a(), nVar.mo35390b());
        }
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m35602a(Iterable<? extends C10221n<? extends K, ? extends V>> iterable) {
        C10202j.m34178b(iterable, "$this$toMap");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return m35601a();
            }
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C10515i0.m35582a(collection.size()));
                m35603a(iterable, linkedHashMap);
                return linkedHashMap;
            }
            return C10515i0.m35584a((C10221n) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        m35603a(iterable, linkedHashMap2);
        return m35609b(linkedHashMap2);
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m35603a(Iterable<? extends C10221n<? extends K, ? extends V>> iterable, M m) {
        C10202j.m34178b(iterable, "$this$toMap");
        C10202j.m34178b(m, "destination");
        m35606a(m, iterable);
        return m;
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m35605a(C10221n<? extends K, ? extends V>[] nVarArr, M m) {
        C10202j.m34178b(nVarArr, "$this$toMap");
        C10202j.m34178b(m, "destination");
        m35607a(m, nVarArr);
        return m;
    }
}
