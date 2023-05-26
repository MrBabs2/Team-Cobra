package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9340h;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o.C9367c;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9609t;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9941h;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10003e;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10080c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10081d;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11830d0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.p215c0.p216c.C9118q;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10354j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10357l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.utils.C12150d;

/* renamed from: kotlin.h0.u.e.k0.c.b.z */
/* compiled from: typeSignatureMapping.kt */
public final class C9745z {
    /* renamed from: a */
    private static final <T> T m31435a(C9717k<T> kVar, T t, boolean z) {
        return z ? kVar.mo34308b(t) : t;
    }

    /* renamed from: a */
    public static /* synthetic */ Object m31438a(C11824b0 b0Var, C9717k kVar, C9742x xVar, C9739v vVar, C9711h hVar, C9118q<Object, Object, Object, C10483v> qVar, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            qVar = C12150d.m40157c();
        }
        return m31437a(b0Var, kVar, xVar, vVar, hVar, qVar, z);
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.Object, kotlin.h0.u.e.k0.c.b.v, kotlin.h0.u.e.k0.c.b.v<? extends T>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m31437a(kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0 r11, kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9717k<T> r12, kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9742x r13, kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9739v<? extends T> r14, kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9711h<T> r15, kotlin.p215c0.p216c.C9118q<? super kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0, ? super T, ? super kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9742x, kotlin.C10483v> r16, boolean r17) {
        /*
            r0 = r11
            r7 = r12
            r2 = r13
            r3 = r14
            r8 = r15
            r5 = r16
            java.lang.String r1 = "kotlinType"
            kotlin.jvm.internal.C10202j.m34178b(r11, r1)
            java.lang.String r1 = "factory"
            kotlin.jvm.internal.C10202j.m34178b(r12, r1)
            java.lang.String r1 = "mode"
            kotlin.jvm.internal.C10202j.m34178b(r13, r1)
            java.lang.String r1 = "typeMappingConfiguration"
            kotlin.jvm.internal.C10202j.m34178b(r14, r1)
            java.lang.String r1 = "writeGenericType"
            kotlin.jvm.internal.C10202j.m34178b(r5, r1)
            kotlin.h0.u.e.k0.k.b0 r1 = r14.mo34347a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r11)
            if (r1 == 0) goto L_0x0034
            r0 = r1
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            java.lang.Object r0 = m31437a(r0, r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0034:
            boolean r1 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9332f.m30160h(r11)
            if (r1 == 0) goto L_0x004f
            boolean r1 = r14.mo34349a()
            kotlin.h0.u.e.k0.k.j0 r0 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9346k.m30272a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r11, (boolean) r1)
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            java.lang.Object r0 = m31437a(r0, r1, r2, r3, r4, r5, r6)
            return r0
        L_0x004f:
            java.lang.Object r1 = m31436a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r11, r12, (kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9742x) r13)
            if (r1 == 0) goto L_0x0061
            boolean r3 = r13.mo34354c()
            java.lang.Object r1 = m31435a(r12, r1, (boolean) r3)
            r5.mo33471a(r11, r1, r13)
            return r1
        L_0x0061:
            kotlin.h0.u.e.k0.k.s0 r1 = r11.mo35227v0()
            boolean r4 = r1 instanceof kotlin.p045h0.p046u.p047e.p048k0.p380k.C11819a0
            if (r4 == 0) goto L_0x0084
            kotlin.h0.u.e.k0.k.a0 r1 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11819a0) r1
            java.util.Collection r0 = r1.mo35229a()
            kotlin.h0.u.e.k0.k.b0 r0 = r14.mo34346a((java.util.Collection<kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0>) r0)
            kotlin.h0.u.e.k0.k.b0 r0 = kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a.m39422f(r0)
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            java.lang.Object r0 = m31437a(r0, r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0084:
            kotlin.reflect.jvm.internal.impl.descriptors.h r9 = r1.mo33781b()
            if (r9 == 0) goto L_0x01f0
            java.lang.String r1 = "constructor.declarationD…structor of $kotlinType\")"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r9, (java.lang.String) r1)
            boolean r1 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u.m39553a((kotlin.reflect.jvm.internal.impl.descriptors.C10359m) r9)
            java.lang.String r4 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            r10 = 0
            if (r1 == 0) goto L_0x00b2
            java.lang.String r1 = "error/NonExistentClass"
            java.lang.Object r1 = r12.mo34309b((java.lang.String) r1)
            if (r9 == 0) goto L_0x00ac
            kotlin.reflect.jvm.internal.impl.descriptors.e r9 = (kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r9
            r14.mo34348a(r11, r9)
            if (r8 != 0) goto L_0x00a8
            return r1
        L_0x00a8:
            r15.mo34292a(r1)
            throw r10
        L_0x00ac:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            r0.<init>(r4)
            throw r0
        L_0x00b2:
            boolean r1 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C10342e
            if (r1 == 0) goto L_0x0137
            boolean r6 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30181c((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r11)
            if (r6 == 0) goto L_0x0137
            java.util.List r1 = r11.mo35226u0()
            int r1 = r1.size()
            r4 = 1
            if (r1 != r4) goto L_0x012f
            java.util.List r0 = r11.mo35226u0()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            kotlin.h0.u.e.k0.k.u0 r0 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0) r0
            kotlin.h0.u.e.k0.k.b0 r1 = r0.getType()
            java.lang.String r4 = "memberProjection.type"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r4)
            kotlin.h0.u.e.k0.k.f1 r4 = r0.mo38596a()
            kotlin.h0.u.e.k0.k.f1 r6 = kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1.IN_VARIANCE
            if (r4 != r6) goto L_0x00f0
            java.lang.String r0 = "java/lang/Object"
            java.lang.Object r0 = r12.mo34309b((java.lang.String) r0)
            if (r8 != 0) goto L_0x00ec
            goto L_0x010d
        L_0x00ec:
            r15.mo34294b()
            throw r10
        L_0x00f0:
            if (r8 != 0) goto L_0x012b
            kotlin.h0.u.e.k0.k.f1 r0 = r0.mo38596a()
            java.lang.String r4 = "memberProjection.projectionKind"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r4)
            kotlin.h0.u.e.k0.c.b.x r2 = r13.mo34351a(r0)
            r0 = r1
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            java.lang.Object r0 = m31437a(r0, r1, r2, r3, r4, r5, r6)
            if (r8 != 0) goto L_0x0127
        L_0x010d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            java.lang.String r0 = r12.mo34307a(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object r0 = r12.mo34306a((java.lang.String) r0)
            return r0
        L_0x0127:
            r15.mo34291a()
            throw r10
        L_0x012b:
            r15.mo34294b()
            throw r10
        L_0x012f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "arrays must have one type argument"
            r0.<init>(r1)
            throw r0
        L_0x0137:
            if (r1 == 0) goto L_0x01ae
            kotlin.reflect.jvm.internal.impl.descriptors.e r9 = (kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r9
            boolean r1 = r9.isInline()
            if (r1 == 0) goto L_0x015e
            boolean r1 = r13.mo34353b()
            if (r1 != 0) goto L_0x015e
            kotlin.h0.u.e.k0.k.b0 r1 = m31441a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r11)
            if (r1 == 0) goto L_0x015e
            kotlin.h0.u.e.k0.c.b.x r2 = r13.mo34356e()
            r0 = r1
            r1 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            java.lang.Object r0 = m31437a(r0, r1, r2, r3, r4, r5, r6)
            return r0
        L_0x015e:
            boolean r1 = r13.mo34355d()
            if (r1 == 0) goto L_0x016f
            boolean r1 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30183c((kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r9)
            if (r1 == 0) goto L_0x016f
            java.lang.Object r1 = r12.mo34305a()
            goto L_0x01aa
        L_0x016f:
            kotlin.reflect.jvm.internal.impl.descriptors.e r1 = r9.mo35404a()
            java.lang.String r6 = "descriptor.original"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r6)
            java.lang.Object r1 = r14.mo34345a((kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r1)
            if (r1 == 0) goto L_0x017f
            goto L_0x01aa
        L_0x017f:
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r9.mo33763g()
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = kotlin.reflect.jvm.internal.impl.descriptors.C10345f.ENUM_ENTRY
            if (r1 != r6) goto L_0x0197
            kotlin.reflect.jvm.internal.impl.descriptors.m r1 = r9.mo33762b()
            if (r1 == 0) goto L_0x0191
            r9 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.e r9 = (kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r9
            goto L_0x0197
        L_0x0191:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            r0.<init>(r4)
            throw r0
        L_0x0197:
            kotlin.reflect.jvm.internal.impl.descriptors.e r1 = r9.mo35404a()
            java.lang.String r4 = "enumClassIfEnumEntry.original"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r4)
            r6 = r17
            java.lang.String r1 = m31439a((kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r1, (kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9739v<?>) r14, (boolean) r6)
            java.lang.Object r1 = r12.mo34309b((java.lang.String) r1)
        L_0x01aa:
            r5.mo33471a(r11, r1, r13)
            return r1
        L_0x01ae:
            r6 = r17
            boolean r1 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C10375s0
            if (r1 == 0) goto L_0x01d9
            r0 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C10375s0) r0
            kotlin.h0.u.e.k0.k.b0 r0 = kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a.m39412a((kotlin.reflect.jvm.internal.impl.descriptors.C10375s0) r0)
            kotlin.c0.c.q r5 = kotlin.reflect.jvm.internal.impl.utils.C12150d.m40157c()
            r4 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r6 = r17
            java.lang.Object r0 = m31437a(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0207 }
            if (r8 != 0) goto L_0x01cc
            return r0
        L_0x01cc:
            kotlin.h0.u.e.k0.e.f r1 = r9.getName()
            java.lang.String r2 = "descriptor.getName()"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r2)
            r15.mo34293a(r1, r0)
            throw r10
        L_0x01d9:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown type "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x01f0:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "no descriptor for type constructor of "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0207:
            r0 = move-exception
            r1 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9745z.m31437a(kotlin.h0.u.e.k0.k.b0, kotlin.h0.u.e.k0.c.b.k, kotlin.h0.u.e.k0.c.b.x, kotlin.h0.u.e.k0.c.b.v, kotlin.h0.u.e.k0.c.b.h, kotlin.c0.c.q, boolean):java.lang.Object");
    }

    /* renamed from: a */
    public static final boolean m31444a(C10230a aVar) {
        C10202j.m34178b(aVar, "descriptor");
        if (aVar instanceof C10357l) {
            return true;
        }
        C11824b0 returnType = aVar.getReturnType();
        if (returnType != null) {
            if (C9333g.m30210v(returnType)) {
                C11824b0 returnType2 = aVar.getReturnType();
                if (returnType2 == null) {
                    C10202j.m34172a();
                    throw null;
                } else if (C11821a1.m38916g(returnType2) || (aVar instanceof C10354j0)) {
                    return false;
                } else {
                    return true;
                }
            }
            return false;
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: a */
    private static final <T> T m31436a(C11824b0 b0Var, C9717k<T> kVar, C9742x xVar) {
        C9933a c;
        C10349h b = b0Var.mo35227v0().mo33781b();
        if (!(b instanceof C10342e)) {
            b = null;
        }
        C10342e eVar = (C10342e) b;
        if (eVar != null) {
            C9340h b2 = C9333g.m30174b((C10359m) eVar);
            boolean z = true;
            if (b2 != null) {
                C10081d a = C10081d.m33929a(b2);
                C10202j.m34174a((Object) a, "JvmPrimitiveType.get(primitiveType)");
                String a2 = a.mo35287a();
                C10202j.m34174a((Object) a2, "JvmPrimitiveType.get(primitiveType).desc");
                T a3 = kVar.mo34306a(a2);
                if (!C11821a1.m38916g(b0Var) && !C9609t.m30999a(b0Var)) {
                    z = false;
                }
                return m31435a(kVar, a3, z);
            }
            C9340h a4 = C9333g.m30163a((C10359m) eVar);
            if (a4 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                C10081d a5 = C10081d.m33929a(a4);
                C10202j.m34174a((Object) a5, "JvmPrimitiveType.get(arrayElementType)");
                sb.append(a5.mo35287a());
                return kVar.mo34306a(sb.toString());
            } else if (C9333g.m30193e((C10359m) eVar) && (c = C9367c.f26064m.mo33810c(C10071a.m33896d(eVar))) != null) {
                if (!xVar.mo34352a()) {
                    List<C9367c.C9368a> b3 = C9367c.f26064m.mo33806b();
                    if (!(b3 instanceof Collection) || !b3.isEmpty()) {
                        Iterator<T> it = b3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (C10202j.m34176a((Object) ((C9367c.C9368a) it.next()).mo33816d(), (Object) c)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        return null;
                    }
                }
                C10080c a6 = C10080c.m33922a(c);
                C10202j.m34174a((Object) a6, "JvmClassName.byClassId(classId)");
                String b4 = a6.mo35282b();
                C10202j.m34174a((Object) b4, "JvmClassName.byClassId(classId).internalName");
                return kVar.mo34309b(b4);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final C11824b0 m31441a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "inlineClassType");
        return m31442a(b0Var, new HashSet());
    }

    /* renamed from: a */
    public static final C11824b0 m31442a(C11824b0 b0Var, HashSet<C10349h> hashSet) {
        C11824b0 b0Var2;
        C10202j.m34178b(b0Var, "kotlinType");
        C10202j.m34178b(hashSet, "visitedClassifiers");
        C10349h b = b0Var.mo35227v0().mo33781b();
        if (b != null) {
            C10202j.m34174a((Object) b, "kotlinType.constructor.d…n expected: $kotlinType\")");
            if (!hashSet.add(b)) {
                return null;
            }
            if (b instanceof C10375s0) {
                b0Var2 = m31442a(C11924a.m39412a((C10375s0) b), hashSet);
                if (b0Var2 == null) {
                    return null;
                }
                if (!C11830d0.m38959b(b0Var2) && b0Var.mo34094w0()) {
                    return C11924a.m39421e(b0Var2);
                }
            } else if (!(b instanceof C10342e) || !((C10342e) b).isInline()) {
                return b0Var;
            } else {
                C11824b0 b2 = C10003e.m33703b(b0Var);
                if (b2 == null || (b0Var2 = m31442a(b2, hashSet)) == null) {
                    return null;
                }
                if (C11830d0.m38959b(b0Var)) {
                    return (!C11830d0.m38959b(b0Var2) && !C9333g.m30206r(b0Var2)) ? C11924a.m39421e(b0Var2) : b0Var;
                }
            }
            return b0Var2;
        }
        throw new AssertionError("Type with a declaration expected: " + b0Var);
    }

    /* renamed from: a */
    public static /* synthetic */ String m31440a(C10342e eVar, C9739v vVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            vVar = C9741w.f26708a;
        }
        return m31439a(eVar, (C9739v<?>) vVar, z);
    }

    /* renamed from: a */
    public static final String m31439a(C10342e eVar, C9739v<?> vVar, boolean z) {
        C10202j.m34178b(eVar, "klass");
        C10202j.m34178b(vVar, "typeMappingConfiguration");
        C10359m b = eVar.mo33762b();
        if (z) {
            b = m31443a(b);
        }
        C9939f b2 = C9941h.m33312b(eVar.getName());
        C10202j.m34174a((Object) b2, "SpecialNames.safeIdentifier(klass.name)");
        String d = b2.mo35023d();
        C10202j.m34174a((Object) d, "SpecialNames.safeIdentifier(klass.name).identifier");
        if (b instanceof C10240b0) {
            C9934b c = ((C10240b0) b).mo35425c();
            if (c.mo34996b()) {
                return d;
            }
            StringBuilder sb = new StringBuilder();
            String a = c.mo34994a();
            C10202j.m34174a((Object) a, "fqName.asString()");
            sb.append(C12130v.m40043a(a, '.', '/', false, 4, (Object) null));
            sb.append('/');
            sb.append(d);
            return sb.toString();
        }
        C10342e eVar2 = (C10342e) (!(b instanceof C10342e) ? null : b);
        if (eVar2 != null) {
            String b3 = vVar.mo34350b(eVar2);
            if (b3 == null) {
                b3 = m31439a(eVar2, vVar, z);
            }
            return b3 + '$' + d;
        }
        throw new IllegalArgumentException("Unexpected container: " + b + " for " + eVar);
    }

    /* renamed from: a */
    private static final C10359m m31443a(C10359m mVar) {
        C10359m mVar2 = (C10342e) (!(mVar instanceof C10342e) ? null : mVar);
        if (mVar2 == null) {
            mVar2 = (C10240b0) (!(mVar instanceof C10240b0) ? null : mVar);
        }
        if (mVar2 != null) {
            return mVar2;
        }
        if (mVar != null) {
            return m31443a(mVar.mo33762b());
        }
        return null;
    }
}
