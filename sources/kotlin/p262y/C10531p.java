package kotlin.p262y;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.y.p */
/* compiled from: Iterables.kt */
class C10531p extends C10529o {
    /* renamed from: a */
    public static final <T> Integer m35751a(Iterable<? extends T> iterable) {
        C10202j.m34178b(iterable, "$this$collectionSizeOrNull");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* renamed from: b */
    private static final <T> boolean m35753b(Collection<? extends T> collection) {
        return collection.size() > 2 && (collection instanceof ArrayList);
    }

    /* renamed from: a */
    public static <T> int m35750a(Iterable<? extends T> iterable, int i) {
        C10202j.m34178b(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* renamed from: a */
    public static final <T> Collection<T> m35752a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C10202j.m34178b(iterable, "$this$convertToSetForSetOperationWith");
        C10202j.m34178b(iterable2, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return C10539w.m35814m(iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection<T> collection = (Collection) iterable;
        return m35753b(collection) ? C10539w.m35814m(iterable) : collection;
    }
}
