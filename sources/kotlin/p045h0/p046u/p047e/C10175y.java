package kotlin.p045h0.p046u.p047e;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p222j0.C9316k;
import kotlin.p045h0.p046u.p047e.p390m0.C12029b;

/* renamed from: kotlin.h0.u.e.y */
/* compiled from: moduleByClassLoader.kt */
public final class C10175y {

    /* renamed from: a */
    private static final ConcurrentMap<C9246h0, WeakReference<C9316k>> f27825a = new ConcurrentHashMap();

    /* renamed from: a */
    public static final C9316k m34121a(Class<?> cls) {
        C10202j.m34178b(cls, "$this$getOrCreateModule");
        ClassLoader e = C12029b.m39751e(cls);
        C9246h0 h0Var = new C9246h0(e);
        WeakReference weakReference = (WeakReference) f27825a.get(h0Var);
        if (weakReference != null) {
            C9316k kVar = (C9316k) weakReference.get();
            if (kVar != null) {
                C10202j.m34174a((Object) kVar, "it");
                return kVar;
            }
            f27825a.remove(h0Var, weakReference);
        }
        C9316k a = C9316k.f25883c.mo33679a(e);
        while (true) {
            try {
                WeakReference putIfAbsent = f27825a.putIfAbsent(h0Var, new WeakReference(a));
                if (putIfAbsent != null) {
                    C9316k kVar2 = (C9316k) putIfAbsent.get();
                    if (kVar2 != null) {
                        return kVar2;
                    }
                    f27825a.remove(h0Var, putIfAbsent);
                } else {
                    h0Var.mo33609a((ClassLoader) null);
                    return a;
                }
            } finally {
                h0Var.mo33609a((ClassLoader) null);
            }
        }
    }
}
