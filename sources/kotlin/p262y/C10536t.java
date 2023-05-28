package kotlin.p262y;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C10187b0;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.y.t */
/* compiled from: MutableCollections.kt */
class C10536t extends C10535s {
    /* renamed from: a */
    public static <T> boolean m35760a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C10202j.m34178b(collection, "$this$addAll");
        C10202j.m34178b(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public static final <T> boolean m35762b(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C10202j.m34178b(collection, "$this$removeAll");
        C10202j.m34178b(iterable, "elements");
        return C10187b0.m34142a((Object) collection).removeAll(C10531p.m35752a(iterable, (Iterable<? extends T>) collection));
    }

    /* renamed from: c */
    public static final <T> boolean m35763c(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C10202j.m34178b(collection, "$this$retainAll");
        C10202j.m34178b(iterable, "elements");
        return C10187b0.m34142a((Object) collection).retainAll(C10531p.m35752a(iterable, (Iterable<? extends T>) collection));
    }

    /* renamed from: a */
    public static <T> boolean m35761a(Collection<? super T> collection, T[] tArr) {
        C10202j.m34178b(collection, "$this$addAll");
        C10202j.m34178b(tArr, "elements");
        return collection.addAll(C10516j.m35587a(tArr));
    }

    /* renamed from: a */
    public static <T> boolean m35758a(Iterable<? extends T> iterable, C9113l<? super T, Boolean> lVar) {
        C10202j.m34178b(iterable, "$this$retainAll");
        C10202j.m34178b(lVar, "predicate");
        return m35759a(iterable, lVar, false);
    }

    /* renamed from: a */
    private static final <T> boolean m35759a(Iterable<? extends T> iterable, C9113l<? super T, Boolean> lVar, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }
}
