package kotlin.p262y;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.y.h0 */
/* compiled from: MapWithDefault.kt */
class C10513h0 {
    /* renamed from: a */
    public static final <K, V> V m35581a(Map<K, ? extends V> map, K k) {
        C10202j.m34178b(map, "$this$getOrImplicitDefault");
        if (map instanceof C10509f0) {
            return ((C10509f0) map).mo36019a(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }
}
