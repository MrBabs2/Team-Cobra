package kotlin.p045h0.p046u;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.C9154c;
import kotlin.p045h0.C9155d;
import kotlin.p045h0.C9177p;
import kotlin.p045h0.p046u.p047e.C10174x;

/* renamed from: kotlin.h0.u.b */
/* compiled from: KTypesJvm.kt */
public final class C4784b {
    /* renamed from: a */
    public static final C9154c<?> m7903a(C9177p pVar) {
        C9154c<?> a;
        C10202j.m34178b(pVar, "$this$jvmErasure");
        C9155d b = pVar.mo33527b();
        if (b != null && (a = m7902a(b)) != null) {
            return a;
        }
        throw new C10174x("Cannot calculate JVM erasure for type: " + pVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlin.h0.p} */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        r5 = m7903a(r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.p045h0.C9154c<?> m7902a(kotlin.p045h0.C9155d r5) {
        /*
            java.lang.String r0 = "$this$jvmErasure"
            kotlin.jvm.internal.C10202j.m34178b(r5, r0)
            boolean r0 = r5 instanceof kotlin.p045h0.C9154c
            if (r0 == 0) goto L_0x000d
            kotlin.h0.c r5 = (kotlin.p045h0.C9154c) r5
            goto L_0x007d
        L_0x000d:
            boolean r0 = r5 instanceof kotlin.p045h0.C9178q
            if (r0 == 0) goto L_0x007e
            kotlin.h0.q r5 = (kotlin.p045h0.C9178q) r5
            java.util.List r5 = r5.getUpperBounds()
            java.util.Iterator r0 = r5.iterator()
        L_0x001b:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0062
            java.lang.Object r1 = r0.next()
            r3 = r1
            kotlin.h0.p r3 = (kotlin.p045h0.C9177p) r3
            if (r3 == 0) goto L_0x005a
            kotlin.h0.u.e.v r3 = (kotlin.p045h0.p046u.p047e.C10166v) r3
            kotlin.h0.u.e.k0.k.b0 r3 = r3.getType()
            kotlin.h0.u.e.k0.k.s0 r3 = r3.mo35227v0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r3 = r3.mo33781b()
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C10342e
            if (r4 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r2 = r3
        L_0x003f:
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r2
            if (r2 == 0) goto L_0x0055
            kotlin.reflect.jvm.internal.impl.descriptors.f r3 = r2.mo33763g()
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = kotlin.reflect.jvm.internal.impl.descriptors.C10345f.INTERFACE
            if (r3 == r4) goto L_0x0055
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.mo33763g()
            kotlin.reflect.jvm.internal.impl.descriptors.f r3 = kotlin.reflect.jvm.internal.impl.descriptors.C10345f.ANNOTATION_CLASS
            if (r2 == r3) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 == 0) goto L_0x001b
            r2 = r1
            goto L_0x0062
        L_0x005a:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"
            r5.<init>(r0)
            throw r5
        L_0x0062:
            kotlin.h0.p r2 = (kotlin.p045h0.C9177p) r2
            if (r2 == 0) goto L_0x0067
            goto L_0x006e
        L_0x0067:
            java.lang.Object r5 = kotlin.p262y.C10539w.m35803f(r5)
            r2 = r5
            kotlin.h0.p r2 = (kotlin.p045h0.C9177p) r2
        L_0x006e:
            if (r2 == 0) goto L_0x0077
            kotlin.h0.c r5 = m7903a((kotlin.p045h0.C9177p) r2)
            if (r5 == 0) goto L_0x0077
            goto L_0x007d
        L_0x0077:
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            kotlin.h0.c r5 = kotlin.jvm.internal.C10216x.m34186a((java.lang.Class) r5)
        L_0x007d:
            return r5
        L_0x007e:
            kotlin.h0.u.e.x r0 = new kotlin.h0.u.e.x
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot calculate JVM erasure for type: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            goto L_0x0096
        L_0x0095:
            throw r0
        L_0x0096:
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.C4784b.m7902a(kotlin.h0.d):kotlin.h0.c");
    }
}
