package kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.C10485x;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9328c;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p224n.C9352b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9935c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9938e;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9941h;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10081d;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;

/* renamed from: kotlin.h0.u.e.k0.a.o.c */
/* compiled from: JavaToKotlinClassMap.kt */
public final class C9367c {

    /* renamed from: a */
    private static final String f26052a = (C9352b.C9356d.Function.mo33789d().toString() + "." + C9352b.C9356d.Function.mo33787a());

    /* renamed from: b */
    private static final String f26053b = (C9352b.C9356d.KFunction.mo33789d().toString() + "." + C9352b.C9356d.KFunction.mo33787a());

    /* renamed from: c */
    private static final String f26054c = (C9352b.C9356d.SuspendFunction.mo33789d().toString() + "." + C9352b.C9356d.SuspendFunction.mo33787a());

    /* renamed from: d */
    private static final String f26055d = (C9352b.C9356d.KSuspendFunction.mo33789d().toString() + "." + C9352b.C9356d.KSuspendFunction.mo33787a());

    /* renamed from: e */
    private static final C9933a f26056e;

    /* renamed from: f */
    private static final C9934b f26057f;

    /* renamed from: g */
    private static final C9933a f26058g;

    /* renamed from: h */
    private static final HashMap<C9935c, C9933a> f26059h = new HashMap<>();

    /* renamed from: i */
    private static final HashMap<C9935c, C9933a> f26060i = new HashMap<>();

    /* renamed from: j */
    private static final HashMap<C9935c, C9934b> f26061j = new HashMap<>();

    /* renamed from: k */
    private static final HashMap<C9935c, C9934b> f26062k = new HashMap<>();

    /* renamed from: l */
    private static final List<C9368a> f26063l;

    /* renamed from: m */
    public static final C9367c f26064m;

    /* renamed from: kotlin.h0.u.e.k0.a.o.c$a */
    /* compiled from: JavaToKotlinClassMap.kt */
    public static final class C9368a {

        /* renamed from: a */
        private final C9933a f26065a;

        /* renamed from: b */
        private final C9933a f26066b;

        /* renamed from: c */
        private final C9933a f26067c;

        public C9368a(C9933a aVar, C9933a aVar2, C9933a aVar3) {
            C10202j.m34178b(aVar, "javaClass");
            C10202j.m34178b(aVar2, "kotlinReadOnly");
            C10202j.m34178b(aVar3, "kotlinMutable");
            this.f26065a = aVar;
            this.f26066b = aVar2;
            this.f26067c = aVar3;
        }

        /* renamed from: a */
        public final C9933a mo33813a() {
            return this.f26065a;
        }

        /* renamed from: b */
        public final C9933a mo33814b() {
            return this.f26066b;
        }

        /* renamed from: c */
        public final C9933a mo33815c() {
            return this.f26067c;
        }

        /* renamed from: d */
        public final C9933a mo33816d() {
            return this.f26065a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9368a)) {
                return false;
            }
            C9368a aVar = (C9368a) obj;
            return C10202j.m34176a((Object) this.f26065a, (Object) aVar.f26065a) && C10202j.m34176a((Object) this.f26066b, (Object) aVar.f26066b) && C10202j.m34176a((Object) this.f26067c, (Object) aVar.f26067c);
        }

        public int hashCode() {
            C9933a aVar = this.f26065a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            C9933a aVar2 = this.f26066b;
            int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            C9933a aVar3 = this.f26067c;
            if (aVar3 != null) {
                i = aVar3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f26065a + ", kotlinReadOnly=" + this.f26066b + ", kotlinMutable=" + this.f26067c + ")";
        }
    }

    static {
        C9367c cVar = new C9367c();
        f26064m = cVar;
        C9933a a = C9933a.m33260a(new C9934b("kotlin.jvm.functions.FunctionN"));
        C10202j.m34174a((Object) a, "ClassId.topLevel(FqName(…vm.functions.FunctionN\"))");
        f26056e = a;
        C9934b a2 = a.mo34983a();
        C10202j.m34174a((Object) a2, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f26057f = a2;
        C9933a a3 = C9933a.m33260a(new C9934b("kotlin.reflect.KFunction"));
        C10202j.m34174a((Object) a3, "ClassId.topLevel(FqName(…tlin.reflect.KFunction\"))");
        f26058g = a3;
        C9933a a4 = C9933a.m33260a(C9333g.f25907k.f25925H);
        C10202j.m34174a((Object) a4, "ClassId.topLevel(FQ_NAMES.iterable)");
        C9934b bVar = C9333g.f25907k.f25933P;
        C10202j.m34174a((Object) bVar, "FQ_NAMES.mutableIterable");
        C9934b d = a4.mo34986d();
        C9934b d2 = a4.mo34986d();
        C10202j.m34174a((Object) d2, "kotlinReadOnly.packageFqName");
        C9934b b = C9938e.m33299b(bVar, d2);
        C9933a aVar = new C9933a(d, b, false);
        C9933a a5 = C9933a.m33260a(C9333g.f25907k.f25924G);
        C10202j.m34174a((Object) a5, "ClassId.topLevel(FQ_NAMES.iterator)");
        C9934b bVar2 = C9333g.f25907k.f25932O;
        C10202j.m34174a((Object) bVar2, "FQ_NAMES.mutableIterator");
        C9934b d3 = a5.mo34986d();
        C9934b d4 = a5.mo34986d();
        C10202j.m34174a((Object) d4, "kotlinReadOnly.packageFqName");
        C9933a aVar2 = new C9933a(d3, C9938e.m33299b(bVar2, d4), false);
        C9933a a6 = C9933a.m33260a(C9333g.f25907k.f25926I);
        C10202j.m34174a((Object) a6, "ClassId.topLevel(FQ_NAMES.collection)");
        C9934b bVar3 = C9333g.f25907k.f25934Q;
        C10202j.m34174a((Object) bVar3, "FQ_NAMES.mutableCollection");
        C9934b d5 = a6.mo34986d();
        C9934b d6 = a6.mo34986d();
        C10202j.m34174a((Object) d6, "kotlinReadOnly.packageFqName");
        C9933a aVar3 = new C9933a(d5, C9938e.m33299b(bVar3, d6), false);
        C9933a a7 = C9933a.m33260a(C9333g.f25907k.f25927J);
        C10202j.m34174a((Object) a7, "ClassId.topLevel(FQ_NAMES.list)");
        C9934b bVar4 = C9333g.f25907k.f25935R;
        C10202j.m34174a((Object) bVar4, "FQ_NAMES.mutableList");
        C9934b d7 = a7.mo34986d();
        C9934b d8 = a7.mo34986d();
        C10202j.m34174a((Object) d8, "kotlinReadOnly.packageFqName");
        C9933a aVar4 = new C9933a(d7, C9938e.m33299b(bVar4, d8), false);
        C9933a a8 = C9933a.m33260a(C9333g.f25907k.f25929L);
        C10202j.m34174a((Object) a8, "ClassId.topLevel(FQ_NAMES.set)");
        C9934b bVar5 = C9333g.f25907k.f25937T;
        C10202j.m34174a((Object) bVar5, "FQ_NAMES.mutableSet");
        C9934b d9 = a8.mo34986d();
        C9934b d10 = a8.mo34986d();
        C10202j.m34174a((Object) d10, "kotlinReadOnly.packageFqName");
        C9933a aVar5 = new C9933a(d9, C9938e.m33299b(bVar5, d10), false);
        C9933a a9 = C9933a.m33260a(C9333g.f25907k.f25928K);
        C10202j.m34174a((Object) a9, "ClassId.topLevel(FQ_NAMES.listIterator)");
        C9934b bVar6 = C9333g.f25907k.f25936S;
        C10202j.m34174a((Object) bVar6, "FQ_NAMES.mutableListIterator");
        C9934b d11 = a9.mo34986d();
        C9934b d12 = a9.mo34986d();
        C10202j.m34174a((Object) d12, "kotlinReadOnly.packageFqName");
        C9933a aVar6 = new C9933a(d11, C9938e.m33299b(bVar6, d12), false);
        C9933a a10 = C9933a.m33260a(C9333g.f25907k.f25930M);
        C10202j.m34174a((Object) a10, "ClassId.topLevel(FQ_NAMES.map)");
        C9934b bVar7 = C9333g.f25907k.f25938U;
        C10202j.m34174a((Object) bVar7, "FQ_NAMES.mutableMap");
        C9934b d13 = a10.mo34986d();
        C9934b d14 = a10.mo34986d();
        C10202j.m34174a((Object) d14, "kotlinReadOnly.packageFqName");
        C9933a aVar7 = new C9933a(d13, C9938e.m33299b(bVar7, d14), false);
        C9933a a11 = C9933a.m33260a(C9333g.f25907k.f25930M).mo34982a(C9333g.f25907k.f25931N.mo35000e());
        C10202j.m34174a((Object) a11, "ClassId.topLevel(FQ_NAME…MES.mapEntry.shortName())");
        C9934b bVar8 = C9333g.f25907k.f25939V;
        C10202j.m34174a((Object) bVar8, "FQ_NAMES.mutableMapEntry");
        C9934b d15 = a11.mo34986d();
        C9934b d16 = a11.mo34986d();
        C10202j.m34174a((Object) d16, "kotlinReadOnly.packageFqName");
        f26063l = C10529o.m35741b((T[]) new C9368a[]{new C9368a(cVar.m30349a((Class<?>) Iterable.class), a4, aVar), new C9368a(cVar.m30349a((Class<?>) Iterator.class), a5, aVar2), new C9368a(cVar.m30349a((Class<?>) Collection.class), a6, aVar3), new C9368a(cVar.m30349a((Class<?>) List.class), a7, aVar4), new C9368a(cVar.m30349a((Class<?>) Set.class), a8, aVar5), new C9368a(cVar.m30349a((Class<?>) ListIterator.class), a9, aVar6), new C9368a(cVar.m30349a((Class<?>) Map.class), a10, aVar7), new C9368a(cVar.m30349a((Class<?>) Map.Entry.class), a11, new C9933a(d15, C9938e.m33299b(bVar8, d16), false))});
        C9935c cVar2 = C9333g.f25907k.f25944a;
        C10202j.m34174a((Object) cVar2, "FQ_NAMES.any");
        cVar.m30354a((Class<?>) Object.class, cVar2);
        C9935c cVar3 = C9333g.f25907k.f25954f;
        C10202j.m34174a((Object) cVar3, "FQ_NAMES.string");
        cVar.m30354a((Class<?>) String.class, cVar3);
        C9935c cVar4 = C9333g.f25907k.f25952e;
        C10202j.m34174a((Object) cVar4, "FQ_NAMES.charSequence");
        cVar.m30354a((Class<?>) CharSequence.class, cVar4);
        C9934b bVar9 = C9333g.f25907k.f25972r;
        C10202j.m34174a((Object) bVar9, "FQ_NAMES.throwable");
        cVar.m30353a((Class<?>) Throwable.class, bVar9);
        C9935c cVar5 = C9333g.f25907k.f25948c;
        C10202j.m34174a((Object) cVar5, "FQ_NAMES.cloneable");
        cVar.m30354a((Class<?>) Cloneable.class, cVar5);
        C9935c cVar6 = C9333g.f25907k.f25970p;
        C10202j.m34174a((Object) cVar6, "FQ_NAMES.number");
        cVar.m30354a((Class<?>) Number.class, cVar6);
        C9934b bVar10 = C9333g.f25907k.f25973s;
        C10202j.m34174a((Object) bVar10, "FQ_NAMES.comparable");
        cVar.m30353a((Class<?>) Comparable.class, bVar10);
        C9935c cVar7 = C9333g.f25907k.f25971q;
        C10202j.m34174a((Object) cVar7, "FQ_NAMES._enum");
        cVar.m30354a((Class<?>) Enum.class, cVar7);
        C9934b bVar11 = C9333g.f25907k.f25979y;
        C10202j.m34174a((Object) bVar11, "FQ_NAMES.annotation");
        cVar.m30353a((Class<?>) Annotation.class, bVar11);
        for (C9368a a12 : f26063l) {
            cVar.m30355a(a12);
        }
        for (C10081d dVar : C10081d.values()) {
            C9933a a13 = C9933a.m33260a(dVar.mo35290i());
            C10202j.m34174a((Object) a13, "ClassId.topLevel(jvmType.wrapperFqName)");
            C9933a a14 = C9933a.m33260a(C9333g.m30186d(dVar.mo35289e()));
            C10202j.m34174a((Object) a14, "ClassId.topLevel(KotlinB…e(jvmType.primitiveType))");
            cVar.m30356a(a13, a14);
        }
        for (C9933a next : C9328c.f25898b.mo33689a()) {
            C9933a a15 = C9933a.m33260a(new C9934b("kotlin.jvm.internal." + next.mo34989f().mo35021a() + "CompanionObject"));
            C10202j.m34174a((Object) a15, "ClassId.topLevel(FqName(…g() + \"CompanionObject\"))");
            C9933a a16 = next.mo34982a(C9941h.f27439b);
            C10202j.m34174a((Object) a16, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            cVar.m30356a(a15, a16);
        }
        for (int i = 0; i < 23; i++) {
            C9933a a17 = C9933a.m33260a(new C9934b("kotlin.jvm.functions.Function" + i));
            C10202j.m34174a((Object) a17, "ClassId.topLevel(FqName(…m.functions.Function$i\"))");
            C9933a d17 = C9333g.m30185d(i);
            C10202j.m34174a((Object) d17, "KotlinBuiltIns.getFunctionClassId(i)");
            cVar.m30356a(a17, d17);
            cVar.m30357a(new C9934b(f26053b + i), f26058g);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            C9352b.C9356d dVar2 = C9352b.C9356d.KSuspendFunction;
            cVar.m30357a(new C9934b((dVar2.mo33789d().toString() + "." + dVar2.mo33787a()) + i2), f26058g);
        }
        C9934b h = C9333g.f25907k.f25946b.mo35016h();
        C10202j.m34174a((Object) h, "FQ_NAMES.nothing.toSafe()");
        cVar.m30357a(h, cVar.m30349a((Class<?>) Void.class));
    }

    private C9367c() {
    }

    /* renamed from: b */
    public final List<C9368a> mo33806b() {
        return f26063l;
    }

    /* renamed from: c */
    public final C9933a mo33810c(C9935c cVar) {
        C10202j.m34178b(cVar, "kotlinFqName");
        if (m30358a(cVar, f26052a)) {
            return f26056e;
        }
        if (m30358a(cVar, f26054c)) {
            return f26056e;
        }
        if (m30358a(cVar, f26053b)) {
            return f26058g;
        }
        if (m30358a(cVar, f26055d)) {
            return f26058g;
        }
        return f26060i.get(cVar);
    }

    /* renamed from: d */
    public final boolean mo33812d(C10342e eVar) {
        C10202j.m34178b(eVar, "readOnly");
        return mo33808b(C9999c.m33680e(eVar));
    }

    /* renamed from: b */
    private final void m30359b(C9933a aVar, C9933a aVar2) {
        HashMap<C9935c, C9933a> hashMap = f26059h;
        C9935c g = aVar.mo34983a().mo35003g();
        C10202j.m34174a((Object) g, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(g, aVar2);
    }

    /* renamed from: a */
    public final C9934b mo33801a() {
        return f26057f;
    }

    /* renamed from: a */
    public final C9933a mo33800a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return f26059h.get(bVar.mo35003g());
    }

    /* renamed from: b */
    public final boolean mo33808b(C9935c cVar) {
        HashMap<C9935c, C9934b> hashMap = f26062k;
        if (hashMap != null) {
            return hashMap.containsKey(cVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    /* renamed from: a */
    public static /* synthetic */ C10342e m30351a(C9367c cVar, C9934b bVar, C9333g gVar, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return cVar.mo33802a(bVar, gVar, num);
    }

    /* renamed from: b */
    public final boolean mo33809b(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "type");
        C10342e b = C11821a1.m38911b(b0Var);
        return b != null && mo33812d(b);
    }

    /* renamed from: a */
    public final C10342e mo33802a(C9934b bVar, C9333g gVar, Integer num) {
        C9933a aVar;
        C10202j.m34178b(bVar, "fqName");
        C10202j.m34178b(gVar, "builtIns");
        if (num == null || !C10202j.m34176a((Object) bVar, (Object) f26057f)) {
            aVar = mo33800a(bVar);
        } else {
            aVar = C9333g.m30185d(num.intValue());
        }
        if (aVar != null) {
            return gVar.mo33701a(aVar.mo34983a());
        }
        return null;
    }

    /* renamed from: b */
    public final C10342e mo33807b(C10342e eVar) {
        C10202j.m34178b(eVar, "readOnly");
        return m30352a(eVar, (Map<C9935c, C9934b>) f26062k, "read-only");
    }

    /* renamed from: c */
    public final boolean mo33811c(C10342e eVar) {
        C10202j.m34178b(eVar, "mutable");
        return mo33804a(C9999c.m33680e(eVar));
    }

    /* renamed from: a */
    private final boolean m30358a(C9935c cVar, String str) {
        Integer c;
        String a = cVar.mo35006a();
        C10202j.m34174a((Object) a, "kotlinFqName.asString()");
        String b = C12131w.m40093b(a, str, "");
        if (!(b.length() > 0) || C12131w.m40110c((CharSequence) b, '0', false, 2, (Object) null) || (c = C12129u.m40037c(b)) == null || c.intValue() < 23) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m30355a(C9368a aVar) {
        C9933a a = aVar.mo33813a();
        C9933a b = aVar.mo33814b();
        C9933a c = aVar.mo33815c();
        m30356a(a, b);
        C9934b a2 = c.mo34983a();
        C10202j.m34174a((Object) a2, "mutableClassId.asSingleFqName()");
        m30357a(a2, a);
        C9934b a3 = b.mo34983a();
        C10202j.m34174a((Object) a3, "readOnlyClassId.asSingleFqName()");
        C9934b a4 = c.mo34983a();
        C10202j.m34174a((Object) a4, "mutableClassId.asSingleFqName()");
        HashMap<C9935c, C9934b> hashMap = f26061j;
        C9935c g = c.mo34983a().mo35003g();
        C10202j.m34174a((Object) g, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(g, a3);
        HashMap<C9935c, C9934b> hashMap2 = f26062k;
        C9935c g2 = a3.mo35003g();
        C10202j.m34174a((Object) g2, "readOnlyFqName.toUnsafe()");
        hashMap2.put(g2, a4);
    }

    /* renamed from: a */
    private final void m30356a(C9933a aVar, C9933a aVar2) {
        m30359b(aVar, aVar2);
        C9934b a = aVar2.mo34983a();
        C10202j.m34174a((Object) a, "kotlinClassId.asSingleFqName()");
        m30357a(a, aVar);
    }

    /* renamed from: a */
    private final void m30354a(Class<?> cls, C9935c cVar) {
        C9934b h = cVar.mo35016h();
        C10202j.m34174a((Object) h, "kotlinFqName.toSafe()");
        m30353a(cls, h);
    }

    /* renamed from: a */
    private final void m30353a(Class<?> cls, C9934b bVar) {
        C9933a a = m30349a(cls);
        C9933a a2 = C9933a.m33260a(bVar);
        C10202j.m34174a((Object) a2, "ClassId.topLevel(kotlinFqName)");
        m30356a(a, a2);
    }

    /* renamed from: a */
    private final void m30357a(C9934b bVar, C9933a aVar) {
        HashMap<C9935c, C9933a> hashMap = f26060i;
        C9935c g = bVar.mo35003g();
        C10202j.m34174a((Object) g, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(g, aVar);
    }

    /* renamed from: a */
    public final Collection<C10342e> mo33799a(C9934b bVar, C9333g gVar) {
        C10202j.m34178b(bVar, "fqName");
        C10202j.m34178b(gVar, "builtIns");
        C10342e a = m30351a(this, bVar, gVar, (Integer) null, 4, (Object) null);
        if (a == null) {
            return C10530o0.m35747a();
        }
        C9934b bVar2 = f26062k.get(C10071a.m33896d(a));
        if (bVar2 == null) {
            return C10528n0.m35731a(a);
        }
        C10202j.m34174a((Object) bVar2, "readOnlyToMutable[kotlin…eturn setOf(kotlinAnalog)");
        C10342e a2 = gVar.mo33701a(bVar2);
        C10202j.m34174a((Object) a2, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        return C10529o.m35741b((T[]) new C10342e[]{a, a2});
    }

    /* renamed from: a */
    public final boolean mo33804a(C9935c cVar) {
        HashMap<C9935c, C9934b> hashMap = f26061j;
        if (hashMap != null) {
            return hashMap.containsKey(cVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    /* renamed from: a */
    public final boolean mo33805a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "type");
        C10342e b = C11821a1.m38911b(b0Var);
        return b != null && mo33811c(b);
    }

    /* renamed from: a */
    public final C10342e mo33803a(C10342e eVar) {
        C10202j.m34178b(eVar, "mutable");
        return m30352a(eVar, (Map<C9935c, C9934b>) f26061j, "mutable");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C9933a m30349a(Class<?> cls) {
        boolean z = !cls.isPrimitive() && !cls.isArray();
        if (!C10485x.f28360a || z) {
            Class<?> declaringClass = cls.getDeclaringClass();
            if (declaringClass == null) {
                C9933a a = C9933a.m33260a(new C9934b(cls.getCanonicalName()));
                C10202j.m34174a((Object) a, "ClassId.topLevel(FqName(clazz.canonicalName))");
                return a;
            }
            C9933a a2 = m30349a(declaringClass).mo34982a(C9939f.m33302b(cls.getSimpleName()));
            C10202j.m34174a((Object) a2, "classId(outer).createNes…tifier(clazz.simpleName))");
            return a2;
        }
        throw new AssertionError("Invalid class: " + cls);
    }

    /* renamed from: a */
    private final C10342e m30352a(C10342e eVar, Map<C9935c, C9934b> map, String str) {
        C9934b bVar = map.get(C9999c.m33680e(eVar));
        if (bVar != null) {
            C10342e a = C10071a.m33892b((C10359m) eVar).mo33701a(bVar);
            C10202j.m34174a((Object) a, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return a;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a " + str + " collection");
    }
}
