package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10221n;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9748b;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10031b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10043k;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p220g0.C9146c;
import kotlin.p262y.C10507e0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10232a0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10376t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10245d;

/* renamed from: kotlin.h0.u.e.k0.i.b.g */
/* compiled from: AnnotationDeserializer.kt */
public final class C11715g {

    /* renamed from: a */
    private final C10393y f31308a;

    /* renamed from: b */
    private final C10232a0 f31309b;

    public C11715g(C10393y yVar, C10232a0 a0Var) {
        C10202j.m34178b(yVar, "module");
        C10202j.m34178b(a0Var, "notFoundClasses");
        this.f31308a = yVar;
        this.f31309b = a0Var;
    }

    /* renamed from: a */
    private final C9333g m38545a() {
        return this.f31308a.mo35561l();
    }

    /* renamed from: b */
    private final C10037g<?> m38549b(C11824b0 b0Var, C9748b.C9750b.C9753c cVar, C9875c cVar2) {
        C10037g<?> a = mo38290a(b0Var, cVar, cVar2);
        if (!m38548a(a, b0Var, cVar)) {
            a = null;
        }
        if (a != null) {
            return a;
        }
        C10043k.C10044a aVar = C10043k.f27631b;
        return aVar.mo35252a("Unexpected argument value: actual type " + cVar.mo34403t() + " != expected type " + b0Var);
    }

    /* renamed from: a */
    public final C10243c mo38291a(C9748b bVar, C9875c cVar) {
        C10202j.m34178b(bVar, "proto");
        C10202j.m34178b(cVar, "nameResolver");
        C10342e a = m38547a(C11792y.m38824a(cVar, bVar.mo34367k()));
        Map a2 = C10518j0.m35601a();
        if (bVar.mo34364i() != 0 && !C11958u.m39553a((C10359m) a) && C9999c.m33684i(a)) {
            Collection<C10273d> j = a.mo33769j();
            C10202j.m34174a((Object) j, "annotationClass.constructors");
            C10273d dVar = (C10273d) C10539w.m35812k(j);
            if (dVar != null) {
                List<C10386v0> f = dVar.mo35407f();
                C10202j.m34174a((Object) f, "constructor.valueParameters");
                LinkedHashMap linkedHashMap = new LinkedHashMap(C9150f.m29847a(C10515i0.m35582a(C10531p.m35750a(f, 10)), 16));
                for (T next : f) {
                    C10386v0 v0Var = (C10386v0) next;
                    C10202j.m34174a((Object) v0Var, "it");
                    linkedHashMap.put(v0Var.getName(), next);
                }
                List<C9748b.C9750b> j2 = bVar.mo34366j();
                C10202j.m34174a((Object) j2, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (C9748b.C9750b bVar2 : j2) {
                    C10202j.m34174a((Object) bVar2, "it");
                    C10221n<C9939f, C10037g<?>> a3 = m38546a(bVar2, (Map<C9939f, ? extends C10386v0>) linkedHashMap, cVar);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                a2 = C10518j0.m35602a(arrayList);
            }
        }
        return new C10245d(a.mo35445o(), a2, C10362n0.f28175a);
    }

    /* renamed from: a */
    private final C10221n<C9939f, C10037g<?>> m38546a(C9748b.C9750b bVar, Map<C9939f, ? extends C10386v0> map, C9875c cVar) {
        C10386v0 v0Var = (C10386v0) map.get(C11792y.m38825b(cVar, bVar.mo34370i()));
        if (v0Var == null) {
            return null;
        }
        C9939f b = C11792y.m38825b(cVar, bVar.mo34370i());
        C11824b0 type = v0Var.getType();
        C10202j.m34174a((Object) type, "parameter.type");
        C9748b.C9750b.C9753c j = bVar.mo34371j();
        C10202j.m34174a((Object) j, "proto.value");
        return new C10221n<>(b, m38549b(type, j, cVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g<?> mo38290a(kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0 r6, kotlin.p045h0.p046u.p047e.p048k0.p240d.C9748b.C9750b.C9753c r7, kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c r8) {
        /*
            r5 = this;
            java.lang.String r0 = "expectedType"
            kotlin.jvm.internal.C10202j.m34178b(r6, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C10202j.m34178b(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.C10202j.m34178b(r8, r0)
            kotlin.h0.u.e.k0.d.x0.b$b r0 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9870b.f27235J
            int r1 = r7.mo34399p()
            java.lang.Boolean r0 = r0.m32856a((int) r1)
            java.lang.String r1 = "Flags.IS_UNSIGNED.get(value.flags)"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
            boolean r0 = r0.booleanValue()
            kotlin.h0.u.e.k0.d.b$b$c$c r1 = r7.mo34403t()
            if (r1 == 0) goto L_0x014d
            int[] r2 = kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11708f.f31303a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            switch(r1) {
                case 1: goto L_0x0138;
                case 2: goto L_0x012c;
                case 3: goto L_0x0117;
                case 4: goto L_0x0104;
                case 5: goto L_0x00f1;
                case 6: goto L_0x00e7;
                case 7: goto L_0x00dc;
                case 8: goto L_0x00c8;
                case 9: goto L_0x00b9;
                case 10: goto L_0x00a6;
                case 11: goto L_0x008f;
                case 12: goto L_0x007b;
                case 13: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x014d
        L_0x0035:
            kotlin.h0.u.e.k0.h.m.h r0 = kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10038h.f27626a
            java.util.List r7 = r7.mo34395l()
            java.lang.String r1 = "value.arrayElementList"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r7, (java.lang.String) r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.p262y.C10531p.m35750a(r7, (int) r2)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L_0x004f:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0075
            java.lang.Object r2 = r7.next()
            kotlin.h0.u.e.k0.d.b$b$c r2 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9748b.C9750b.C9753c) r2
            kotlin.h0.u.e.k0.a.g r3 = r5.m38545a()
            kotlin.h0.u.e.k0.k.j0 r3 = r3.mo33707c()
            java.lang.String r4 = "builtIns.anyType"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r4)
            java.lang.String r4 = "it"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r4)
            kotlin.h0.u.e.k0.h.m.g r2 = r5.mo38290a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r3, (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9748b.C9750b.C9753c) r2, (kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c) r8)
            r1.add(r2)
            goto L_0x004f
        L_0x0075:
            kotlin.h0.u.e.k0.h.m.b r6 = r0.mo35247a((java.util.List<? extends kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g<?>>) r1, (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r6)
            goto L_0x014c
        L_0x007b:
            kotlin.h0.u.e.k0.h.m.a r6 = new kotlin.h0.u.e.k0.h.m.a
            kotlin.h0.u.e.k0.d.b r7 = r7.mo34392i()
            java.lang.String r0 = "value.annotation"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r7, (java.lang.String) r0)
            kotlin.reflect.jvm.internal.impl.descriptors.b1.c r7 = r5.mo38291a(r7, r8)
            r6.<init>(r7)
            goto L_0x014c
        L_0x008f:
            kotlin.h0.u.e.k0.h.m.j r6 = new kotlin.h0.u.e.k0.h.m.j
            int r0 = r7.mo34396m()
            kotlin.h0.u.e.k0.e.a r0 = kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11792y.m38824a(r8, r0)
            int r7 = r7.mo34398o()
            kotlin.h0.u.e.k0.e.f r7 = kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11792y.m38825b(r8, r7)
            r6.<init>(r0, r7)
            goto L_0x014c
        L_0x00a6:
            kotlin.h0.u.e.k0.h.m.r r6 = new kotlin.h0.u.e.k0.h.m.r
            int r0 = r7.mo34396m()
            kotlin.h0.u.e.k0.e.a r8 = kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11792y.m38824a(r8, r0)
            int r7 = r7.mo34393j()
            r6.<init>(r8, r7)
            goto L_0x014c
        L_0x00b9:
            kotlin.h0.u.e.k0.h.m.w r6 = new kotlin.h0.u.e.k0.h.m.w
            int r7 = r7.mo34402s()
            java.lang.String r7 = r8.getString(r7)
            r6.<init>(r7)
            goto L_0x014c
        L_0x00c8:
            kotlin.h0.u.e.k0.h.m.c r6 = new kotlin.h0.u.e.k0.h.m.c
            long r7 = r7.mo34401r()
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00d6
            r7 = 1
            goto L_0x00d7
        L_0x00d6:
            r7 = 0
        L_0x00d7:
            r6.<init>(r7)
            goto L_0x014c
        L_0x00dc:
            kotlin.h0.u.e.k0.h.m.i r6 = new kotlin.h0.u.e.k0.h.m.i
            double r7 = r7.mo34397n()
            r6.<init>(r7)
            goto L_0x014c
        L_0x00e7:
            kotlin.h0.u.e.k0.h.m.l r6 = new kotlin.h0.u.e.k0.h.m.l
            float r7 = r7.mo34400q()
            r6.<init>(r7)
            goto L_0x014c
        L_0x00f1:
            long r6 = r7.mo34401r()
            if (r0 == 0) goto L_0x00fd
            kotlin.h0.u.e.k0.h.m.z r8 = new kotlin.h0.u.e.k0.h.m.z
            r8.<init>(r6)
            goto L_0x0102
        L_0x00fd:
            kotlin.h0.u.e.k0.h.m.s r8 = new kotlin.h0.u.e.k0.h.m.s
            r8.<init>(r6)
        L_0x0102:
            r6 = r8
            goto L_0x014c
        L_0x0104:
            long r6 = r7.mo34401r()
            int r7 = (int) r6
            if (r0 == 0) goto L_0x0111
            kotlin.h0.u.e.k0.h.m.y r6 = new kotlin.h0.u.e.k0.h.m.y
            r6.<init>(r7)
            goto L_0x014c
        L_0x0111:
            kotlin.h0.u.e.k0.h.m.m r6 = new kotlin.h0.u.e.k0.h.m.m
            r6.<init>(r7)
            goto L_0x014c
        L_0x0117:
            long r6 = r7.mo34401r()
            int r7 = (int) r6
            short r6 = (short) r7
            if (r0 == 0) goto L_0x0125
            kotlin.h0.u.e.k0.h.m.a0 r7 = new kotlin.h0.u.e.k0.h.m.a0
            r7.<init>(r6)
            goto L_0x012a
        L_0x0125:
            kotlin.h0.u.e.k0.h.m.v r7 = new kotlin.h0.u.e.k0.h.m.v
            r7.<init>(r6)
        L_0x012a:
            r6 = r7
            goto L_0x014c
        L_0x012c:
            kotlin.h0.u.e.k0.h.m.e r6 = new kotlin.h0.u.e.k0.h.m.e
            long r7 = r7.mo34401r()
            int r8 = (int) r7
            char r7 = (char) r8
            r6.<init>(r7)
            goto L_0x014c
        L_0x0138:
            long r6 = r7.mo34401r()
            int r7 = (int) r6
            byte r6 = (byte) r7
            if (r0 == 0) goto L_0x0146
            kotlin.h0.u.e.k0.h.m.x r7 = new kotlin.h0.u.e.k0.h.m.x
            r7.<init>(r6)
            goto L_0x012a
        L_0x0146:
            kotlin.h0.u.e.k0.h.m.d r7 = new kotlin.h0.u.e.k0.h.m.d
            r7.<init>(r6)
            goto L_0x012a
        L_0x014c:
            return r6
        L_0x014d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unsupported annotation argument type: "
            r8.append(r0)
            kotlin.h0.u.e.k0.d.b$b$c$c r7 = r7.mo34403t()
            r8.append(r7)
            java.lang.String r7 = " (expected "
            r8.append(r7)
            r8.append(r6)
            r6 = 41
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            goto L_0x017a
        L_0x0179:
            throw r7
        L_0x017a:
            goto L_0x0179
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11715g.mo38290a(kotlin.h0.u.e.k0.k.b0, kotlin.h0.u.e.k0.d.b$b$c, kotlin.h0.u.e.k0.d.x0.c):kotlin.h0.u.e.k0.h.m.g");
    }

    /* renamed from: a */
    private final boolean m38548a(C10037g<?> gVar, C11824b0 b0Var, C9748b.C9750b.C9753c cVar) {
        C9748b.C9750b.C9753c.C9756c t = cVar.mo34403t();
        if (t != null) {
            int i = C11708f.f31304b[t.ordinal()];
            if (i == 1) {
                C10349h b = b0Var.mo35227v0().mo33781b();
                if (!(b instanceof C10342e)) {
                    b = null;
                }
                C10342e eVar = (C10342e) b;
                if (eVar == null || C9333g.m30183c(eVar)) {
                    return true;
                }
                return false;
            } else if (i == 2) {
                if ((gVar instanceof C10031b) && ((List) ((C10031b) gVar).mo35244a()).size() == cVar.mo34395l().size()) {
                    C11824b0 a = m38545a().mo33696a(b0Var);
                    C10202j.m34174a((Object) a, "builtIns.getArrayElementType(expectedType)");
                    C10031b bVar = (C10031b) gVar;
                    C9146c a2 = C10529o.m35737a((Collection<?>) (Collection) bVar.mo35244a());
                    if (!(a2 instanceof Collection) || !((Collection) a2).isEmpty()) {
                        Iterator it = a2.iterator();
                        while (it.hasNext()) {
                            int a3 = ((C10507e0) it).mo33492a();
                            C9748b.C9750b.C9753c a4 = cVar.mo34391a(a3);
                            C10202j.m34174a((Object) a4, "value.getArrayElement(i)");
                            if (!m38548a((C10037g<?>) (C10037g) ((List) bVar.mo35244a()).get(a3), a, a4)) {
                                return false;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
                }
            }
            return true;
        }
        return C10202j.m34176a((Object) gVar.mo35235a(this.f31308a), (Object) b0Var);
    }

    /* renamed from: a */
    private final C10342e m38547a(C9933a aVar) {
        return C10376t.m35017a(this.f31308a, aVar, this.f31309b);
    }
}
