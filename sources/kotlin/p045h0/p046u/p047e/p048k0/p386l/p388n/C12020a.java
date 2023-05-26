package kotlin.p045h0.p046u.p047e.p048k0.p386l.p388n;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.k0.l.n.a */
/* compiled from: scopeUtils.kt */
public final class C12020a {
    /* renamed from: a */
    public static final <T> Collection<T> m39719a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C10202j.m34178b(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }
}
