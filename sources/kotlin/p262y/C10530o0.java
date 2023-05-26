package kotlin.p262y;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.y.o0 */
/* compiled from: Sets.kt */
class C10530o0 extends C10528n0 {
    /* renamed from: a */
    public static <T> Set<T> m35747a() {
        return C10488a0.f28362f;
    }

    /* renamed from: b */
    public static <T> Set<T> m35749b(T... tArr) {
        C10202j.m34178b(tArr, "elements");
        return tArr.length > 0 ? C10519k.m35655m(tArr) : m35747a();
    }

    /* renamed from: a */
    public static <T> LinkedHashSet<T> m35746a(T... tArr) {
        C10202j.m34178b(tArr, "elements");
        LinkedHashSet<T> linkedHashSet = new LinkedHashSet<>(C10515i0.m35582a(tArr.length));
        C10519k.m35630b(tArr, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: a */
    public static final <T> Set<T> m35748a(Set<? extends T> set) {
        C10202j.m34178b(set, "$this$optimizeReadOnlySet");
        int size = set.size();
        if (size == 0) {
            return m35747a();
        }
        if (size != 1) {
            return set;
        }
        return C10528n0.m35731a(set.iterator().next());
    }
}
