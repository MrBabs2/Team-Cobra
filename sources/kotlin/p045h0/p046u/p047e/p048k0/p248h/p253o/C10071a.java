package kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.C10483v;
import kotlin.C10485x;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10200h;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10215w;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9398b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9935c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10088d;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10101j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import kotlin.p391i0.C12079h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10350h0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10351i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.utils.C12142b;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.h0.u.e.k0.h.o.a */
/* compiled from: DescriptorUtils.kt */
public final class C10071a {

    /* renamed from: kotlin.h0.u.e.k0.h.o.a$a */
    /* compiled from: DescriptorUtils.kt */
    static final class C10072a extends C10203k implements C9117p<C10096h, Boolean, C10483v> {

        /* renamed from: f */
        final /* synthetic */ C10342e f27653f;

        /* renamed from: g */
        final /* synthetic */ LinkedHashSet f27654g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10072a(C10342e eVar, LinkedHashSet linkedHashSet) {
            super(2);
            this.f27653f = eVar;
            this.f27654g = linkedHashSet;
        }

        /* renamed from: a */
        public final void mo35271a(C10096h hVar, boolean z) {
            C10202j.m34178b(hVar, "scope");
            for (C10359m mVar : C10101j.C10102a.m34010a(hVar, C10088d.f27700p, (C9113l) null, 2, (Object) null)) {
                if (mVar instanceof C10342e) {
                    C10342e eVar = (C10342e) mVar;
                    if (C9999c.m33669a(eVar, this.f27653f)) {
                        this.f27654g.add(mVar);
                    }
                    if (z) {
                        C10096h k0 = eVar.mo33928k0();
                        C10202j.m34174a((Object) k0, "descriptor.unsubstitutedInnerClassesScope");
                        mo35271a(k0, z);
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo35271a((C10096h) obj, ((Boolean) obj2).booleanValue());
            return C10483v.f28357a;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.o.a$b */
    /* compiled from: DescriptorUtils.kt */
    static final class C10073b<N> implements C12142b.C12145c<N> {

        /* renamed from: a */
        public static final C10073b f27655a = new C10073b();

        C10073b() {
        }

        /* renamed from: a */
        public final List<C10386v0> mo33837a(C10386v0 v0Var) {
            C10202j.m34174a((Object) v0Var, "current");
            Collection<C10386v0> d = v0Var.mo35406d();
            ArrayList arrayList = new ArrayList(C10531p.m35750a(d, 10));
            for (C10386v0 a : d) {
                arrayList.add(a.mo35404a());
            }
            return arrayList;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.o.a$c */
    /* compiled from: DescriptorUtils.kt */
    static final /* synthetic */ class C10074c extends C10200h implements C9113l<C10386v0, Boolean> {

        /* renamed from: g */
        public static final C10074c f27656g = new C10074c();

        C10074c() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo35273a(C10386v0 v0Var) {
            C10202j.m34178b(v0Var, "p1");
            return v0Var.mo35489h0();
        }

        public final String getName() {
            return "declaresDefaultValue";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(C10386v0.class);
        }

        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo35273a((C10386v0) obj));
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.o.a$d */
    /* compiled from: DescriptorUtils.kt */
    static final class C10075d<N> implements C12142b.C12145c<N> {

        /* renamed from: a */
        final /* synthetic */ boolean f27657a;

        C10075d(boolean z) {
            this.f27657a = z;
        }

        /* renamed from: a */
        public final Iterable<C10238b> mo33837a(C10238b bVar) {
            Collection<? extends C10238b> d;
            if (this.f27657a) {
                bVar = bVar != null ? bVar.mo35404a() : null;
            }
            return (bVar == null || (d = bVar.mo35406d()) == null) ? C10529o.m35736a() : d;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.o.a$e */
    /* compiled from: DescriptorUtils.kt */
    public static final class C10076e extends C12142b.C12144b<C10238b, C10238b> {

        /* renamed from: a */
        final /* synthetic */ C10215w f27658a;

        /* renamed from: b */
        final /* synthetic */ C9113l f27659b;

        C10076e(C10215w wVar, C9113l lVar) {
            this.f27658a = wVar;
            this.f27659b = lVar;
        }

        /* renamed from: b */
        public boolean mo33841b(C10238b bVar) {
            C10202j.m34178b(bVar, "current");
            return ((C10238b) this.f27658a.f27854f) == null;
        }

        /* renamed from: a */
        public void mo35275a(C10238b bVar) {
            C10202j.m34178b(bVar, "current");
            if (((C10238b) this.f27658a.f27854f) == null && ((Boolean) this.f27659b.invoke(bVar)).booleanValue()) {
                this.f27658a.f27854f = bVar;
            }
        }

        /* renamed from: a */
        public C10238b m33907a() {
            return (C10238b) this.f27658a.f27854f;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.o.a$f */
    /* compiled from: DescriptorUtils.kt */
    static final class C10077f extends C10203k implements C9113l<C10359m, C10359m> {

        /* renamed from: f */
        public static final C10077f f27660f = new C10077f();

        C10077f() {
            super(1);
        }

        /* renamed from: a */
        public final C10359m invoke(C10359m mVar) {
            C10202j.m34178b(mVar, "it");
            return mVar.mo33762b();
        }
    }

    static {
        C10202j.m34174a((Object) C9939f.m33302b(DonationsAnalytics.VALUE), "Name.identifier(\"value\")");
    }

    /* renamed from: a */
    public static final C10342e m33890a(C10393y yVar, C9934b bVar, C9398b bVar2) {
        C10202j.m34178b(yVar, "$this$resolveTopLevelClass");
        C10202j.m34178b(bVar, "topLevelClassFqName");
        C10202j.m34178b(bVar2, "location");
        boolean z = !bVar.mo34996b();
        if (!C10485x.f28360a || z) {
            C9934b c = bVar.mo34998c();
            C10202j.m34174a((Object) c, "topLevelClassFqName.parent()");
            C10096h m = yVar.mo35554a(c).mo35545m();
            C9939f e = bVar.mo35000e();
            C10202j.m34174a((Object) e, "topLevelClassFqName.shortName()");
            C10349h b = m.mo33917b(e, bVar2);
            if (!(b instanceof C10342e)) {
                b = null;
            }
            return (C10342e) b;
        }
        throw new AssertionError("Assertion failed");
    }

    /* renamed from: b */
    public static final C10342e m33894b(C10342e eVar) {
        C10202j.m34178b(eVar, "$this$getSuperClassNotAny");
        for (C11824b0 next : eVar.mo35445o().mo35227v0().mo35229a()) {
            if (!C9333g.m30176b(next)) {
                C10349h b = next.mo35227v0().mo33781b();
                if (C9999c.m33687l(b)) {
                    if (b != null) {
                        return (C10342e) b;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final C9934b m33895c(C10359m mVar) {
        C10202j.m34178b(mVar, "$this$fqNameSafe");
        C9934b f = C9999c.m33681f(mVar);
        C10202j.m34174a((Object) f, "DescriptorUtils.getFqNameSafe(this)");
        return f;
    }

    /* renamed from: d */
    public static final C9935c m33896d(C10359m mVar) {
        C10202j.m34178b(mVar, "$this$fqNameUnsafe");
        C9935c e = C9999c.m33680e(mVar);
        C10202j.m34174a((Object) e, "DescriptorUtils.getFqName(this)");
        return e;
    }

    /* renamed from: e */
    public static final C10393y m33897e(C10359m mVar) {
        C10202j.m34178b(mVar, "$this$module");
        C10393y a = C9999c.m33665a(mVar);
        C10202j.m34174a((Object) a, "DescriptorUtils.getContainingModule(this)");
        return a;
    }

    /* renamed from: f */
    public static final C12079h<C10359m> m33898f(C10359m mVar) {
        C10202j.m34178b(mVar, "$this$parents");
        return C12090n.m39918a(m33899g(mVar), 1);
    }

    /* renamed from: g */
    public static final C12079h<C10359m> m33899g(C10359m mVar) {
        C10202j.m34178b(mVar, "$this$parentsWithSelf");
        return C12083l.m39906a(mVar, C10077f.f27660f);
    }

    /* renamed from: a */
    public static final C9933a m33884a(C10349h hVar) {
        C10359m b;
        C9933a a;
        if (hVar == null || (b = hVar.mo33762b()) == null) {
            return null;
        }
        if (b instanceof C10240b0) {
            return new C9933a(((C10240b0) b).mo35425c(), hVar.getName());
        }
        if (!(b instanceof C10351i) || (a = m33884a((C10349h) b)) == null) {
            return null;
        }
        return a.mo34982a(hVar.getName());
    }

    /* renamed from: b */
    public static final C9333g m33892b(C10359m mVar) {
        C10202j.m34178b(mVar, "$this$builtIns");
        return m33897e(mVar).mo35561l();
    }

    /* renamed from: b */
    public static final C10342e m33893b(C10243c cVar) {
        C10202j.m34178b(cVar, "$this$annotationClass");
        C10349h b = cVar.getType().mo35227v0().mo33781b();
        if (!(b instanceof C10342e)) {
            b = null;
        }
        return (C10342e) b;
    }

    /* renamed from: a */
    public static final boolean m33891a(C10386v0 v0Var) {
        C10202j.m34178b(v0Var, "$this$declaresOrInheritsDefaultValue");
        Boolean a = C12142b.m40137a(C10527n.m35729a(v0Var), C10073b.f27655a, C10074c.f27656g);
        C10202j.m34174a((Object) a, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
        return a.booleanValue();
    }

    /* renamed from: a */
    public static final C10238b m33887a(C10238b bVar) {
        C10202j.m34178b(bVar, "$this$propertyIfAccessor");
        if (!(bVar instanceof C10350h0)) {
            return bVar;
        }
        C10352i0 l0 = ((C10350h0) bVar).mo35574l0();
        C10202j.m34174a((Object) l0, "correspondingProperty");
        return l0;
    }

    /* renamed from: a */
    public static final C9934b m33885a(C10359m mVar) {
        C10202j.m34178b(mVar, "$this$fqNameOrNull");
        C9935c d = m33896d(mVar);
        if (!d.mo35010c()) {
            d = null;
        }
        if (d != null) {
            return d.mo35016h();
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ C10238b m33889a(C10238b bVar, boolean z, C9113l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m33888a(bVar, z, (C9113l<? super C10238b, Boolean>) lVar);
    }

    /* renamed from: a */
    public static final C10238b m33888a(C10238b bVar, boolean z, C9113l<? super C10238b, Boolean> lVar) {
        C10202j.m34178b(bVar, "$this$firstOverridden");
        C10202j.m34178b(lVar, "predicate");
        C10215w wVar = new C10215w();
        wVar.f27854f = null;
        return (C10238b) C12142b.m40138a(C10527n.m35729a(bVar), new C10075d(z), new C10076e(wVar, lVar));
    }

    /* renamed from: a */
    public static final Collection<C10342e> m33883a(C10342e eVar) {
        C10202j.m34178b(eVar, "sealedClass");
        if (eVar.mo33767i() != C10388w.SEALED) {
            return C10529o.m35736a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C10072a aVar = new C10072a(eVar, linkedHashSet);
        C10359m b = eVar.mo33762b();
        C10202j.m34174a((Object) b, "sealedClass.containingDeclaration");
        if (b instanceof C10240b0) {
            aVar.mo35271a(((C10240b0) b).mo33834m(), false);
        }
        C10096h k0 = eVar.mo33928k0();
        C10202j.m34174a((Object) k0, "sealedClass.unsubstitutedInnerClassesScope");
        aVar.mo35271a(k0, true);
        return linkedHashSet;
    }

    /* renamed from: a */
    public static final C10037g<?> m33886a(C10243c cVar) {
        C10202j.m34178b(cVar, "$this$firstArgument");
        return (C10037g) C10539w.m35802f(cVar.mo33921a().values());
    }
}
