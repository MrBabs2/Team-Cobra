package kotlin.p045h0.p046u.p047e.p048k0.p248h;

import java.util.Collection;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;

/* renamed from: kotlin.h0.u.e.k0.h.k */
/* compiled from: VisibilityUtil.kt */
public final class C10022k {
    /* renamed from: a */
    public static final C10238b m33771a(Collection<? extends C10238b> collection) {
        Integer a;
        C10202j.m34178b(collection, "descriptors");
        boolean z = !collection.isEmpty();
        if (!C10485x.f28360a || z) {
            C10238b bVar = null;
            for (C10238b bVar2 : collection) {
                if (bVar == null || ((a = C10397z0.m35085a(bVar.getVisibility(), bVar2.getVisibility())) != null && a.intValue() < 0)) {
                    bVar = bVar2;
                }
            }
            if (bVar != null) {
                return bVar;
            }
            C10202j.m34172a();
            throw null;
        }
        throw new AssertionError("Assertion failed");
    }
}
