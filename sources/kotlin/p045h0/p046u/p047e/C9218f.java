package kotlin.p045h0.p046u.p047e;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p389l0.C12023b;

/* renamed from: kotlin.h0.u.e.f */
/* compiled from: kClassCache.kt */
public final class C9218f {

    /* renamed from: a */
    private static C12023b<String, Object> f25751a;

    static {
        C12023b<String, Object> a = C12023b.m39728a();
        C10202j.m34174a((Object) a, "HashPMap.empty<String, Any>()");
        f25751a = a;
    }

    /* renamed from: a */
    public static final <T> C9220g<T> m29956a(Class<T> cls) {
        C10202j.m34178b(cls, "jClass");
        String name = cls.getName();
        Object a = f25751a.mo38651a((Object) name);
        Class<T> cls2 = null;
        if (a instanceof WeakReference) {
            C9220g<T> gVar = (C9220g) ((WeakReference) a).get();
            if (gVar != null) {
                cls2 = gVar.mo33537a();
            }
            if (C10202j.m34176a((Object) cls2, (Object) cls)) {
                return gVar;
            }
        } else if (a != null) {
            for (WeakReference weakReference : (WeakReference[]) a) {
                C9220g<T> gVar2 = (C9220g) weakReference.get();
                if (C10202j.m34176a((Object) gVar2 != null ? gVar2.mo33537a() : null, (Object) cls)) {
                    return gVar2;
                }
            }
            int length = ((Object[]) a).length;
            WeakReference[] weakReferenceArr = new WeakReference[(length + 1)];
            System.arraycopy(a, 0, weakReferenceArr, 0, length);
            C9220g<T> gVar3 = new C9220g<>(cls);
            weakReferenceArr[length] = new WeakReference(gVar3);
            C12023b<String, Object> a2 = f25751a.mo38652a(name, weakReferenceArr);
            C10202j.m34174a((Object) a2, "K_CLASS_CACHE.plus(name, newArray)");
            f25751a = a2;
            return gVar3;
        }
        C9220g<T> gVar4 = new C9220g<>(cls);
        C12023b<String, Object> a3 = f25751a.mo38652a(name, new WeakReference(gVar4));
        C10202j.m34174a((Object) a3, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
        f25751a = a3;
        return gVar4;
    }
}
