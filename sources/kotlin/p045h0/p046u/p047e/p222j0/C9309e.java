package kotlin.p045h0.p046u.p047e.p222j0;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.h0.u.e.j0.e */
/* compiled from: ReflectJavaClassFinder.kt */
public final class C9309e {
    /* renamed from: a */
    public static final Class<?> m30112a(ClassLoader classLoader, String str) {
        C10202j.m34178b(classLoader, "$this$tryLoadClass");
        C10202j.m34178b(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
