package kotlin.p045h0.p046u.p047e;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.C9188c;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11718c;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9340h;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o.C9363a;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o.C9367c;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9631r;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9636w;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p233b0.C9508a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9525l;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9667c;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9670f;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9734s;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9790h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9836r;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9920e;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9928i;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C10003e;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9997b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10081d;
import kotlin.p045h0.p046u.p047e.p390m0.C12029b;
import kotlin.p045h0.p046u.p047e.p390m0.C12041j;
import kotlin.p045h0.p046u.p047e.p390m0.C12052m;
import kotlin.p045h0.p046u.p047e.p390m0.C12058s;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10354j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10356k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;

/* renamed from: kotlin.h0.u.e.d0 */
/* compiled from: RuntimeTypeMapper.kt */
public final class C9205d0 {

    /* renamed from: a */
    private static final C9933a f25735a;

    /* renamed from: b */
    public static final C9205d0 f25736b = new C9205d0();

    static {
        C9933a a = C9933a.m33260a(new C9934b("java.lang.Void"));
        C10202j.m34174a((Object) a, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
        f25735a = a;
    }

    private C9205d0() {
    }

    /* renamed from: b */
    private final boolean m29937b(C10382u uVar) {
        if (C9997b.m33654b(uVar) || C9997b.m33655c(uVar)) {
            return true;
        }
        if (!C10202j.m34176a((Object) uVar.getName(), (Object) C9363a.f26049f.mo33797a()) || !uVar.mo35407f().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final C9188c.C9196e m29938c(C10382u uVar) {
        return new C9188c.C9196e(new C9920e.C9922b(m29935a((C10238b) uVar), C9734s.m31395a(uVar, false, false, 1, (Object) null)));
    }

    /* renamed from: a */
    public final C9188c mo33580a(C10382u uVar) {
        Method i;
        C9920e.C9922b a;
        C9920e.C9922b a2;
        C10202j.m34178b(uVar, "possiblySubstitutedFunction");
        C10238b a3 = C9999c.m33659a(uVar);
        C10202j.m34174a((Object) a3, "DescriptorUtils.unwrapFa…siblySubstitutedFunction)");
        C10382u a4 = ((C10382u) a3).mo35404a();
        C10202j.m34174a((Object) a4, "DescriptorUtils.unwrapFa…titutedFunction).original");
        if (a4 instanceof C11718c) {
            C11718c cVar = (C11718c) a4;
            C10449o y = cVar.mo38300y();
            if ((y instanceof C9836r) && (a2 = C9928i.f27389b.mo34937a((C9836r) y, cVar.mo38297U(), cVar.mo38295N())) != null) {
                return new C9188c.C9196e(a2);
            }
            if (!(y instanceof C9790h) || (a = C9928i.f27389b.mo34936a((C9790h) y, cVar.mo38297U(), cVar.mo38295N())) == null) {
                return m29938c(a4);
            }
            C10359m b = uVar.mo33762b();
            C10202j.m34174a((Object) b, "possiblySubstitutedFunction.containingDeclaration");
            if (C10003e.m33701a(b)) {
                return new C9188c.C9196e(a);
            }
            return new C9188c.C9195d(a);
        }
        C9525l lVar = null;
        if (a4 instanceof C9670f) {
            C10362n0 p = ((C9670f) a4).mo33773p();
            if (!(p instanceof C9508a)) {
                p = null;
            }
            C9508a aVar = (C9508a) p;
            C9525l b2 = aVar != null ? aVar.mo33681b() : null;
            if (b2 instanceof C12058s) {
                lVar = b2;
            }
            C12058s sVar = (C12058s) lVar;
            if (sVar != null && (i = sVar.mo38685i()) != null) {
                return new C9188c.C9194c(i);
            }
            throw new C10174x("Incorrect resolution sequence for Java method " + a4);
        } else if (a4 instanceof C9667c) {
            C10362n0 p2 = ((C9667c) a4).mo33773p();
            if (!(p2 instanceof C9508a)) {
                p2 = null;
            }
            C9508a aVar2 = (C9508a) p2;
            if (aVar2 != null) {
                lVar = aVar2.mo33681b();
            }
            if (lVar instanceof C12052m) {
                return new C9188c.C9192b(((C12052m) lVar).m39818i());
            }
            if (lVar instanceof C12041j) {
                C12041j jVar = (C12041j) lVar;
                if (jVar.mo34039l()) {
                    return new C9188c.C9189a(jVar.m39793o());
                }
            }
            throw new C10174x("Incorrect resolution sequence for Java constructor " + a4 + " (" + lVar + ')');
        } else if (m29937b(a4)) {
            return m29938c(a4);
        } else {
            throw new C10174x("Unknown origin of " + a4 + " (" + a4.getClass() + ')');
        }
    }

    /* renamed from: b */
    private final C9340h m29936b(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        C10081d a = C10081d.m33928a(cls.getSimpleName());
        C10202j.m34174a((Object) a, "JvmPrimitiveType.get(simpleName)");
        return a.mo35289e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlin.h0.u.e.c$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.p045h0.p046u.p047e.C9200d mo33581a(kotlin.reflect.jvm.internal.impl.descriptors.C10352i0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "possiblyOverriddenProperty"
            kotlin.jvm.internal.C10202j.m34178b(r8, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.b r8 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c.m33659a(r8)
            java.lang.String r0 = "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r8, (java.lang.String) r0)
            kotlin.reflect.jvm.internal.impl.descriptors.i0 r8 = (kotlin.reflect.jvm.internal.impl.descriptors.C10352i0) r8
            kotlin.reflect.jvm.internal.impl.descriptors.i0 r1 = r8.mo35404a()
            java.lang.String r8 = "DescriptorUtils.unwrapFa…rriddenProperty).original"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r8)
            boolean r8 = r1 instanceof kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11752j
            r0 = 0
            if (r8 == 0) goto L_0x0043
            r8 = r1
            kotlin.h0.u.e.k0.i.b.g0.j r8 = (kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11752j) r8
            kotlin.h0.u.e.k0.d.z r2 = r8.m38693y()
            kotlin.reflect.jvm.internal.impl.protobuf.h$g<kotlin.h0.u.e.k0.d.z, kotlin.h0.u.e.k0.d.y0.a$d> r3 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.f27287d
            java.lang.String r4 = "JvmProtoBuf.propertySignature"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r4)
            java.lang.Object r3 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9878f.m32873a(r2, r3)
            kotlin.h0.u.e.k0.d.y0.a$d r3 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9898d) r3
            if (r3 == 0) goto L_0x00ca
            kotlin.h0.u.e.d$c r6 = new kotlin.h0.u.e.d$c
            kotlin.h0.u.e.k0.d.x0.c r4 = r8.mo38297U()
            kotlin.h0.u.e.k0.d.x0.h r5 = r8.mo38295N()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x0043:
            boolean r8 = r1 instanceof kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9673g
            if (r8 == 0) goto L_0x00ca
            r8 = r1
            kotlin.h0.u.e.k0.c.a.z.g r8 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9673g) r8
            kotlin.reflect.jvm.internal.impl.descriptors.n0 r8 = r8.mo33773p()
            boolean r2 = r8 instanceof kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p233b0.C9508a
            if (r2 != 0) goto L_0x0053
            r8 = r0
        L_0x0053:
            kotlin.h0.u.e.k0.c.a.b0.a r8 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p233b0.C9508a) r8
            if (r8 == 0) goto L_0x005c
            kotlin.h0.u.e.k0.c.a.c0.l r8 = r8.mo33681b()
            goto L_0x005d
        L_0x005c:
            r8 = r0
        L_0x005d:
            boolean r2 = r8 instanceof kotlin.p045h0.p046u.p047e.p390m0.C12055p
            if (r2 == 0) goto L_0x006d
            kotlin.h0.u.e.d$a r0 = new kotlin.h0.u.e.d$a
            kotlin.h0.u.e.m0.p r8 = (kotlin.p045h0.p046u.p047e.p390m0.C12055p) r8
            java.lang.reflect.Field r8 = r8.m39823i()
            r0.<init>(r8)
            goto L_0x00a5
        L_0x006d:
            boolean r2 = r8 instanceof kotlin.p045h0.p046u.p047e.p390m0.C12058s
            if (r2 == 0) goto L_0x00a6
            kotlin.h0.u.e.d$b r2 = new kotlin.h0.u.e.d$b
            kotlin.h0.u.e.m0.s r8 = (kotlin.p045h0.p046u.p047e.p390m0.C12058s) r8
            java.lang.reflect.Method r8 = r8.mo38685i()
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r1 = r1.getSetter()
            if (r1 == 0) goto L_0x0084
            kotlin.reflect.jvm.internal.impl.descriptors.n0 r1 = r1.mo33773p()
            goto L_0x0085
        L_0x0084:
            r1 = r0
        L_0x0085:
            boolean r3 = r1 instanceof kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p233b0.C9508a
            if (r3 != 0) goto L_0x008a
            r1 = r0
        L_0x008a:
            kotlin.h0.u.e.k0.c.a.b0.a r1 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p233b0.C9508a) r1
            if (r1 == 0) goto L_0x0093
            kotlin.h0.u.e.k0.c.a.c0.l r1 = r1.mo33681b()
            goto L_0x0094
        L_0x0093:
            r1 = r0
        L_0x0094:
            boolean r3 = r1 instanceof kotlin.p045h0.p046u.p047e.p390m0.C12058s
            if (r3 != 0) goto L_0x0099
            r1 = r0
        L_0x0099:
            kotlin.h0.u.e.m0.s r1 = (kotlin.p045h0.p046u.p047e.p390m0.C12058s) r1
            if (r1 == 0) goto L_0x00a1
            java.lang.reflect.Method r0 = r1.mo38685i()
        L_0x00a1:
            r2.<init>(r8, r0)
            r0 = r2
        L_0x00a5:
            return r0
        L_0x00a6:
            kotlin.h0.u.e.x r0 = new kotlin.h0.u.e.x
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Incorrect resolution sequence for Java field "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " (source = "
            r2.append(r1)
            r2.append(r8)
            r8 = 41
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        L_0x00ca:
            kotlin.reflect.jvm.internal.impl.descriptors.j0 r8 = r1.getGetter()
            if (r8 == 0) goto L_0x00e4
            kotlin.h0.u.e.c$e r8 = r7.m29938c(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r1 = r1.getSetter()
            if (r1 == 0) goto L_0x00de
            kotlin.h0.u.e.c$e r0 = r7.m29938c(r1)
        L_0x00de:
            kotlin.h0.u.e.d$d r1 = new kotlin.h0.u.e.d$d
            r1.<init>(r8, r0)
            return r1
        L_0x00e4:
            kotlin.jvm.internal.C10202j.m34172a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.C9205d0.mo33581a(kotlin.reflect.jvm.internal.impl.descriptors.i0):kotlin.h0.u.e.d");
    }

    /* renamed from: a */
    private final String m29935a(C10238b bVar) {
        String a;
        String b = C9636w.m31080b(bVar);
        if (b == null) {
            if (bVar instanceof C10354j0) {
                a = C9631r.m31047a(C10071a.m33887a(bVar).getName().mo35021a());
            } else if (bVar instanceof C10356k0) {
                a = C9631r.m31055d(C10071a.m33887a(bVar).getName().mo35021a());
            } else {
                a = bVar.getName().mo35021a();
            }
            b = a;
            C10202j.m34174a((Object) b, "when (descriptor) {\n    …name.asString()\n        }");
        }
        return b;
    }

    /* renamed from: a */
    public final C9933a mo33582a(Class<?> cls) {
        C10202j.m34178b(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            C10202j.m34174a((Object) componentType, "klass.componentType");
            C9340h b = m29936b(componentType);
            if (b != null) {
                return new C9933a(C9333g.f25902f, b.mo33733d());
            }
            C9933a a = C9933a.m33260a(C9333g.f25907k.f25956g.mo35016h());
            C10202j.m34174a((Object) a, "ClassId.topLevel(KotlinB….FQ_NAMES.array.toSafe())");
            return a;
        } else if (C10202j.m34176a((Object) cls, (Object) Void.TYPE)) {
            return f25735a;
        } else {
            C9340h b2 = m29936b(cls);
            if (b2 != null) {
                return new C9933a(C9333g.f25902f, b2.mo33735i());
            }
            C9933a b3 = C12029b.m39748b(cls);
            if (!b3.mo34990g()) {
                C9367c cVar = C9367c.f26064m;
                C9934b a2 = b3.mo34983a();
                C10202j.m34174a((Object) a2, "classId.asSingleFqName()");
                C9933a a3 = cVar.mo33800a(a2);
                if (a3 != null) {
                    return a3;
                }
            }
            return b3;
        }
    }
}
