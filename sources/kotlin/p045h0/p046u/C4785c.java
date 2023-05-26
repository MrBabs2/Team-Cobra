package kotlin.p045h0.p046u;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.C9157f;
import kotlin.p045h0.C9158g;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.C9177p;
import kotlin.p045h0.p046u.p047e.C10150s;
import kotlin.p045h0.p046u.p047e.C10166v;
import kotlin.p045h0.p046u.p047e.C9244g0;

/* renamed from: kotlin.h0.u.c */
/* compiled from: ReflectJvmMapping.kt */
public final class C4785c {
    /* renamed from: a */
    public static final Field m7905a(C9168l<?> lVar) {
        C10202j.m34178b(lVar, "$this$javaField");
        C10150s<?> c = C9244g0.m30006c(lVar);
        if (c != null) {
            return c.mo35345t();
        }
        return null;
    }

    /* renamed from: b */
    public static final Method m7909b(C9168l<?> lVar) {
        C10202j.m34178b(lVar, "$this$javaGetter");
        return m7908b((C9157f<?>) lVar.getGetter());
    }

    /* renamed from: a */
    public static final Method m7906a(C9158g<?> gVar) {
        C10202j.m34178b(gVar, "$this$javaSetter");
        return m7908b((C9157f<?>) gVar.getSetter());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = r2.mo33584f();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.reflect.Method m7908b(kotlin.p045h0.C9157f<?> r2) {
        /*
            java.lang.String r0 = "$this$javaMethod"
            kotlin.jvm.internal.C10202j.m34178b(r2, r0)
            kotlin.h0.u.e.e r2 = kotlin.p045h0.p046u.p047e.C9244g0.m30001a((java.lang.Object) r2)
            r0 = 0
            if (r2 == 0) goto L_0x0017
            kotlin.h0.u.e.i0.d r2 = r2.mo33584f()
            if (r2 == 0) goto L_0x0017
            java.lang.reflect.Member r2 = r2.getMember()
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            boolean r1 = r2 instanceof java.lang.reflect.Method
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.C4785c.m7908b(kotlin.h0.f):java.lang.reflect.Method");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = r2.mo33584f();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.reflect.Constructor<T> m7904a(kotlin.p045h0.C9157f<? extends T> r2) {
        /*
            java.lang.String r0 = "$this$javaConstructor"
            kotlin.jvm.internal.C10202j.m34178b(r2, r0)
            kotlin.h0.u.e.e r2 = kotlin.p045h0.p046u.p047e.C9244g0.m30001a((java.lang.Object) r2)
            r0 = 0
            if (r2 == 0) goto L_0x0017
            kotlin.h0.u.e.i0.d r2 = r2.mo33584f()
            if (r2 == 0) goto L_0x0017
            java.lang.reflect.Member r2 = r2.getMember()
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            boolean r1 = r2 instanceof java.lang.reflect.Constructor
            if (r1 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.C4785c.m7904a(kotlin.h0.f):java.lang.reflect.Constructor");
    }

    /* renamed from: a */
    public static final Type m7907a(C9177p pVar) {
        C10202j.m34178b(pVar, "$this$javaType");
        return ((C10166v) pVar).mo35349a();
    }
}
