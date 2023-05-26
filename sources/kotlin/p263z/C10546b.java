package kotlin.p263z;

import java.util.Comparator;
import kotlin.TypeCastException;

/* renamed from: kotlin.z.b */
/* compiled from: Comparisons.kt */
class C10546b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m35832a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* renamed from: a */
    public static <T extends Comparable<? super T>> Comparator<T> m35833a() {
        C10549e eVar = C10549e.f28394f;
        if (eVar != null) {
            return eVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
    }
}
