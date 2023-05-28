package kotlin.p262y;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.y.p0 */
/* compiled from: _Sets.kt */
class C10532p0 extends C10530o0 {
    /* renamed from: a */
    public static <T> Set<T> m35755a(Set<? extends T> set, T t) {
        C10202j.m34178b(set, "$this$plus");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C10515i0.m35582a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    /* renamed from: a */
    public static <T> Set<T> m35754a(Set<? extends T> set, Iterable<? extends T> iterable) {
        int i;
        C10202j.m34178b(set, "$this$plus");
        C10202j.m34178b(iterable, "elements");
        Integer a = C10531p.m35751a(iterable);
        if (a != null) {
            i = set.size() + a.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C10515i0.m35582a(i));
        linkedHashSet.addAll(set);
        boolean unused = C10536t.m35760a(linkedHashSet, iterable);
        return linkedHashSet;
    }
}
