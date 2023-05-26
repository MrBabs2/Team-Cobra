package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11689a0;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11692b;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11694c;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9348m;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9632s;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9724o;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9732r;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9748b;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9790h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9811l0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9818n;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9831p0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9836r;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9870b;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9878f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9879g;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9880h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9915b;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9920e;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9928i;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10080c;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11811c;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

/* renamed from: kotlin.h0.u.e.k0.c.b.a */
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public abstract class C9679a<A, C> implements C11694c<A, C> {

    /* renamed from: c */
    private static final Set<C9933a> f26609c;

    /* renamed from: a */
    private final C11811c<C9724o, C9682c<A, C>> f26610a;

    /* renamed from: b */
    private final C9719m f26611b;

    /* renamed from: kotlin.h0.u.e.k0.c.b.a$a */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class C9680a {
        private C9680a() {
        }

        public /* synthetic */ C9680a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.b.a$b */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    private enum C9681b {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* renamed from: kotlin.h0.u.e.k0.c.b.a$c */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    private static final class C9682c<A, C> {

        /* renamed from: a */
        private final Map<C9732r, List<A>> f26616a;

        /* renamed from: b */
        private final Map<C9732r, C> f26617b;

        public C9682c(Map<C9732r, ? extends List<? extends A>> map, Map<C9732r, ? extends C> map2) {
            C10202j.m34178b(map, "memberAnnotations");
            C10202j.m34178b(map2, "propertyConstants");
            this.f26616a = map;
            this.f26617b = map2;
        }

        /* renamed from: a */
        public final Map<C9732r, List<A>> mo34250a() {
            return this.f26616a;
        }

        /* renamed from: b */
        public final Map<C9732r, C> mo34251b() {
            return this.f26617b;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.b.a$d */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class C9683d implements C9724o.C9728d {

        /* renamed from: a */
        final /* synthetic */ C9679a f26618a;

        /* renamed from: b */
        final /* synthetic */ HashMap f26619b;

        /* renamed from: c */
        final /* synthetic */ HashMap f26620c;

        /* renamed from: kotlin.h0.u.e.k0.c.b.a$d$a */
        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public final class C9684a extends C9685b implements C9724o.C9729e {

            /* renamed from: d */
            final /* synthetic */ C9683d f26621d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C9684a(C9683d dVar, C9732r rVar) {
                super(dVar, rVar);
                C10202j.m34178b(rVar, RoomInstalled.SIGNATURE);
                this.f26621d = dVar;
            }

            /* renamed from: a */
            public C9724o.C9725a mo34254a(int i, C9933a aVar, C10362n0 n0Var) {
                C10202j.m34178b(aVar, "classId");
                C10202j.m34178b(n0Var, "source");
                C9732r a = C9732r.f26703b.mo34329a(mo34257b(), i);
                List list = (List) this.f26621d.f26619b.get(a);
                if (list == null) {
                    list = new ArrayList();
                    this.f26621d.f26619b.put(a, list);
                }
                return this.f26621d.f26618a.m31200b(aVar, n0Var, list);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.c.b.a$d$b */
        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public class C9685b implements C9724o.C9727c {

            /* renamed from: a */
            private final ArrayList<A> f26622a = new ArrayList<>();

            /* renamed from: b */
            private final C9732r f26623b;

            /* renamed from: c */
            final /* synthetic */ C9683d f26624c;

            public C9685b(C9683d dVar, C9732r rVar) {
                C10202j.m34178b(rVar, RoomInstalled.SIGNATURE);
                this.f26624c = dVar;
                this.f26623b = rVar;
            }

            /* renamed from: a */
            public C9724o.C9725a mo34255a(C9933a aVar, C10362n0 n0Var) {
                C10202j.m34178b(aVar, "classId");
                C10202j.m34178b(n0Var, "source");
                return this.f26624c.f26618a.m31200b(aVar, n0Var, this.f26622a);
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public final C9732r mo34257b() {
                return this.f26623b;
            }

            /* renamed from: a */
            public void mo34256a() {
                if (!this.f26622a.isEmpty()) {
                    this.f26624c.f26619b.put(this.f26623b, this.f26622a);
                }
            }
        }

        C9683d(C9679a aVar, HashMap hashMap, HashMap hashMap2) {
            this.f26618a = aVar;
            this.f26619b = hashMap;
            this.f26620c = hashMap2;
        }

        /* renamed from: a */
        public C9724o.C9729e mo34253a(C9939f fVar, String str) {
            C10202j.m34178b(fVar, "name");
            C10202j.m34178b(str, "desc");
            C9732r.C9733a aVar = C9732r.f26703b;
            String a = fVar.mo35021a();
            C10202j.m34174a((Object) a, "name.asString()");
            return new C9684a(this, aVar.mo34332b(a, str));
        }

        /* renamed from: a */
        public C9724o.C9727c mo34252a(C9939f fVar, String str, Object obj) {
            Object a;
            C10202j.m34178b(fVar, "name");
            C10202j.m34178b(str, "desc");
            C9732r.C9733a aVar = C9732r.f26703b;
            String a2 = fVar.mo35021a();
            C10202j.m34174a((Object) a2, "name.asString()");
            C9732r a3 = aVar.mo34328a(a2, str);
            if (!(obj == null || (a = this.f26618a.mo34236a(str, obj)) == null)) {
                this.f26620c.put(a3, a);
            }
            return new C9685b(this, a3);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.b.a$e */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class C9686e implements C9724o.C9727c {

        /* renamed from: a */
        final /* synthetic */ C9679a f26625a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f26626b;

        C9686e(C9679a aVar, ArrayList arrayList) {
            this.f26625a = aVar;
            this.f26626b = arrayList;
        }

        /* renamed from: a */
        public C9724o.C9725a mo34255a(C9933a aVar, C10362n0 n0Var) {
            C10202j.m34178b(aVar, "classId");
            C10202j.m34178b(n0Var, "source");
            return this.f26625a.m31200b(aVar, n0Var, this.f26626b);
        }

        /* renamed from: a */
        public void mo34256a() {
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.b.a$f */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    static final class C9687f extends C10203k implements C9113l<C9724o, C9682c<? extends A, ? extends C>> {

        /* renamed from: f */
        final /* synthetic */ C9679a f26627f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9687f(C9679a aVar) {
            super(1);
            this.f26627f = aVar;
        }

        /* renamed from: a */
        public final C9682c<A, C> invoke(C9724o oVar) {
            C10202j.m34178b(oVar, "kotlinClass");
            return this.f26627f.m31199b(oVar);
        }
    }

    static {
        new C9680a((DefaultConstructorMarker) null);
        List<C9934b> b = C10529o.m35741b((T[]) new C9934b[]{C9632s.f26515a, C9632s.f26517c, C9632s.f26518d, new C9934b("java.lang.annotation.Target"), new C9934b("java.lang.annotation.Retention"), new C9934b("java.lang.annotation.Documented")});
        ArrayList arrayList = new ArrayList(C10531p.m35750a(b, 10));
        for (C9934b a : b) {
            arrayList.add(C9933a.m33260a(a));
        }
        f26609c = C10539w.m35818q(arrayList);
    }

    public C9679a(C11817i iVar, C9719m mVar) {
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(mVar, "kotlinClassFinder");
        this.f26611b = mVar;
        this.f26610a = iVar.mo38399a(new C9687f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C9724o.C9725a m31200b(C9933a aVar, C10362n0 n0Var, List<A> list) {
        if (f26609c.contains(aVar)) {
            return null;
        }
        return mo34246a(aVar, n0Var, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C mo34235a(C c);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C mo34236a(String str, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract A mo34237a(C9748b bVar, C9875c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C9724o.C9725a mo34246a(C9933a aVar, C10362n0 n0Var, List<A> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] mo34247a(C9724o oVar) {
        C10202j.m34178b(oVar, "kotlinClass");
        return null;
    }

    /* renamed from: b */
    private final C9724o m31201b(C11689a0.C11690a aVar) {
        C10362n0 c = aVar.mo38258c();
        if (!(c instanceof C9731q)) {
            c = null;
        }
        C9731q qVar = (C9731q) c;
        if (qVar != null) {
            return qVar.mo34322d();
        }
        return null;
    }

    /* renamed from: a */
    public List<A> mo34241a(C11689a0.C11690a aVar) {
        C10202j.m34178b(aVar, "container");
        C9724o b = m31201b(aVar);
        if (b != null) {
            ArrayList arrayList = new ArrayList(1);
            b.mo33662a((C9724o.C9727c) new C9686e(this, arrayList), mo34247a(b));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.mo38256a()).toString());
    }

    /* renamed from: b */
    public List<A> mo34249b(C11689a0 a0Var, C10449o oVar, C11692b bVar) {
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(oVar, "proto");
        C10202j.m34178b(bVar, "kind");
        if (bVar == C11692b.PROPERTY) {
            return m31190a(a0Var, (C9930z) oVar, C9681b.PROPERTY);
        }
        C9732r a = m31196a(this, oVar, a0Var.mo38257b(), a0Var.mo38259d(), bVar, false, 16, (Object) null);
        if (a != null) {
            return m31188a(this, a0Var, a, false, false, (Boolean) null, false, 60, (Object) null);
        }
        return C10529o.m35736a();
    }

    /* renamed from: a */
    public List<A> mo34243a(C11689a0 a0Var, C9930z zVar) {
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(zVar, "proto");
        return m31190a(a0Var, zVar, C9681b.BACKING_FIELD);
    }

    /* renamed from: b */
    public List<A> mo34248b(C11689a0 a0Var, C9930z zVar) {
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(zVar, "proto");
        return m31190a(a0Var, zVar, C9681b.DELEGATE_FIELD);
    }

    /* renamed from: a */
    private final List<A> m31190a(C11689a0 a0Var, C9930z zVar, C9681b bVar) {
        C9681b bVar2 = bVar;
        Boolean a = C9870b.f27258w.m32856a(zVar.mo34950l());
        C10202j.m34174a((Object) a, "Flags.IS_CONST.get(proto.flags)");
        boolean booleanValue = a.booleanValue();
        boolean a2 = C9928i.m33159a(zVar);
        if (bVar2 == C9681b.PROPERTY) {
            C9732r a3 = m31195a(this, zVar, a0Var.mo38257b(), a0Var.mo38259d(), false, true, false, 40, (Object) null);
            if (a3 == null) {
                return C10529o.m35736a();
            }
            return m31188a(this, a0Var, a3, true, false, Boolean.valueOf(booleanValue), a2, 8, (Object) null);
        }
        C9732r a4 = m31195a(this, zVar, a0Var.mo38257b(), a0Var.mo38259d(), true, false, false, 48, (Object) null);
        if (a4 == null) {
            return C10529o.m35736a();
        }
        boolean z = false;
        boolean a5 = C12131w.m40085a((CharSequence) a4.mo34324a(), (CharSequence) "$delegate", false, 2, (Object) null);
        if (bVar2 == C9681b.DELEGATE_FIELD) {
            z = true;
        }
        if (a5 != z) {
            return C10529o.m35736a();
        }
        return m31189a(a0Var, a4, true, true, Boolean.valueOf(booleanValue), a2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C9682c<A, C> m31199b(C9724o oVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        oVar.mo33663a((C9724o.C9728d) new C9683d(this, hashMap, hashMap2), mo34247a(oVar));
        return new C9682c<>(hashMap, hashMap2);
    }

    /* renamed from: a */
    public List<A> mo34242a(C11689a0 a0Var, C9818n nVar) {
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(nVar, "proto");
        C9732r.C9733a aVar = C9732r.f26703b;
        String string = a0Var.mo38257b().getString(nVar.mo34662l());
        String b = ((C11689a0.C11690a) a0Var).mo38261e().mo34984b();
        C10202j.m34174a((Object) b, "(container as ProtoConta…Class).classId.asString()");
        return m31188a(this, a0Var, aVar.mo34328a(string, C9915b.m33137a(b)), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: a */
    static /* synthetic */ List m31188a(C9679a aVar, C11689a0 a0Var, C9732r rVar, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj == null) {
            return aVar.m31189a(a0Var, rVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    /* renamed from: a */
    private final List<A> m31189a(C11689a0 a0Var, C9732r rVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        C9724o a = m31193a(a0Var, m31194a(a0Var, z, z2, bool, z3));
        if (a == null) {
            return C10529o.m35736a();
        }
        List<A> list = (List) this.f26610a.invoke(a).mo34250a().get(rVar);
        return list != null ? list : C10529o.m35736a();
    }

    /* renamed from: a */
    public List<A> mo34245a(C11689a0 a0Var, C10449o oVar, C11692b bVar, int i, C9831p0 p0Var) {
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(oVar, "callableProto");
        C10202j.m34178b(bVar, "kind");
        C10202j.m34178b(p0Var, "proto");
        C9732r a = m31196a(this, oVar, a0Var.mo38257b(), a0Var.mo38259d(), bVar, false, 16, (Object) null);
        if (a == null) {
            return C10529o.m35736a();
        }
        return m31188a(this, a0Var, C9732r.f26703b.mo34329a(a, i + m31187a(a0Var, oVar)), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: a */
    private final int m31187a(C11689a0 a0Var, C10449o oVar) {
        if (oVar instanceof C9836r) {
            if (C9879g.m32883a((C9836r) oVar)) {
                return 1;
            }
        } else if (oVar instanceof C9930z) {
            if (C9879g.m32884a((C9930z) oVar)) {
                return 1;
            }
        } else if (!(oVar instanceof C9790h)) {
            throw new UnsupportedOperationException("Unsupported message: " + oVar.getClass());
        } else if (a0Var != null) {
            C11689a0.C11690a aVar = (C11689a0.C11690a) a0Var;
            if (aVar.mo38263g() == C9775f.C9778c.ENUM_CLASS) {
                return 2;
            }
            if (aVar.mo38265i()) {
                return 1;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        }
        return 0;
    }

    /* renamed from: a */
    public List<A> mo34244a(C11689a0 a0Var, C10449o oVar, C11692b bVar) {
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(oVar, "proto");
        C10202j.m34178b(bVar, "kind");
        C9732r a = m31196a(this, oVar, a0Var.mo38257b(), a0Var.mo38259d(), bVar, false, 16, (Object) null);
        if (a == null) {
            return C10529o.m35736a();
        }
        return m31188a(this, a0Var, C9732r.f26703b.mo34329a(a, 0), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* renamed from: a */
    public List<A> mo34239a(C9782g0 g0Var, C9875c cVar) {
        C10202j.m34178b(g0Var, "proto");
        C10202j.m34178b(cVar, "nameResolver");
        Object a = g0Var.mo35765a(C9890a.f27289f);
        C10202j.m34174a(a, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<C9748b> iterable = (Iterable) a;
        ArrayList arrayList = new ArrayList(C10531p.m35750a(iterable, 10));
        for (C9748b bVar : iterable) {
            C10202j.m34174a((Object) bVar, "it");
            arrayList.add(mo34237a(bVar, cVar));
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<A> mo34240a(C9811l0 l0Var, C9875c cVar) {
        C10202j.m34178b(l0Var, "proto");
        C10202j.m34178b(cVar, "nameResolver");
        Object a = l0Var.mo35765a(C9890a.f27291h);
        C10202j.m34174a(a, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<C9748b> iterable = (Iterable) a;
        ArrayList arrayList = new ArrayList(C10531p.m35750a(iterable, 10));
        for (C9748b bVar : iterable) {
            C10202j.m34174a((Object) bVar, "it");
            arrayList.add(mo34237a(bVar, cVar));
        }
        return arrayList;
    }

    /* renamed from: a */
    public C mo34238a(C11689a0 a0Var, C9930z zVar, C11824b0 b0Var) {
        C9732r a;
        C c;
        C10202j.m34178b(a0Var, "container");
        C10202j.m34178b(zVar, "proto");
        C10202j.m34178b(b0Var, "expectedType");
        C9724o a2 = m31193a(a0Var, m31194a(a0Var, true, true, C9870b.f27258w.m32856a(zVar.mo34950l()), C9928i.m33159a(zVar)));
        if (a2 == null || (a = m31198a((C10449o) zVar, a0Var.mo38257b(), a0Var.mo38259d(), C11692b.PROPERTY, a2.mo33661a().mo34262d().mo34842a(C9706e.f26686g.mo34288a()))) == null || (c = this.f26610a.invoke(a2).mo34251b().get(a)) == null) {
            return null;
        }
        return C9348m.f26019e.mo33744a(b0Var) ? mo34235a(c) : c;
    }

    /* renamed from: a */
    private final C9724o m31193a(C11689a0 a0Var, C9724o oVar) {
        if (oVar != null) {
            return oVar;
        }
        if (a0Var instanceof C11689a0.C11690a) {
            return m31201b((C11689a0.C11690a) a0Var);
        }
        return null;
    }

    /* renamed from: a */
    private final C9724o m31194a(C11689a0 a0Var, boolean z, boolean z2, Boolean bool, boolean z3) {
        C11689a0.C11690a h;
        if (z) {
            if (bool != null) {
                if (a0Var instanceof C11689a0.C11690a) {
                    C11689a0.C11690a aVar = (C11689a0.C11690a) a0Var;
                    if (aVar.mo38263g() == C9775f.C9778c.INTERFACE) {
                        C9719m mVar = this.f26611b;
                        C9933a a = aVar.mo38261e().mo34982a(C9939f.m33302b("DefaultImpls"));
                        C10202j.m34174a((Object) a, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                        return C9723n.m31362a(mVar, a);
                    }
                }
                if (bool.booleanValue() && (a0Var instanceof C11689a0.C11691b)) {
                    C10362n0 c = a0Var.mo38258c();
                    if (!(c instanceof C9712i)) {
                        c = null;
                    }
                    C9712i iVar = (C9712i) c;
                    C10080c e = iVar != null ? iVar.mo34297e() : null;
                    if (e != null) {
                        C9719m mVar2 = this.f26611b;
                        String b = e.mo35282b();
                        C10202j.m34174a((Object) b, "facadeClassName.internalName");
                        C9933a a2 = C9933a.m33260a(new C9934b(C12130v.m40043a(b, '/', '.', false, 4, (Object) null)));
                        C10202j.m34174a((Object) a2, "ClassId.topLevel(FqName(…lName.replace('/', '.')))");
                        return C9723n.m31362a(mVar2, a2);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + a0Var + ')').toString());
            }
        }
        if (z2 && (a0Var instanceof C11689a0.C11690a)) {
            C11689a0.C11690a aVar2 = (C11689a0.C11690a) a0Var;
            if (aVar2.mo38263g() == C9775f.C9778c.COMPANION_OBJECT && (h = aVar2.mo38264h()) != null && (h.mo38263g() == C9775f.C9778c.CLASS || h.mo38263g() == C9775f.C9778c.ENUM_CLASS || (z3 && (h.mo38263g() == C9775f.C9778c.INTERFACE || h.mo38263g() == C9775f.C9778c.ANNOTATION_CLASS)))) {
                return m31201b(h);
            }
        }
        if (!(a0Var instanceof C11689a0.C11691b) || !(a0Var.mo38258c() instanceof C9712i)) {
            return null;
        }
        C10362n0 c2 = a0Var.mo38258c();
        if (c2 != null) {
            C9712i iVar2 = (C9712i) c2;
            C9724o f = iVar2.mo34298f();
            return f != null ? f : C9723n.m31362a(this.f26611b, iVar2.mo34296d());
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
    }

    /* renamed from: a */
    static /* synthetic */ C9732r m31195a(C9679a aVar, C9930z zVar, C9875c cVar, C9880h hVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return aVar.m31197a(zVar, cVar, hVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    /* renamed from: a */
    private final C9732r m31197a(C9930z zVar, C9875c cVar, C9880h hVar, boolean z, boolean z2, boolean z3) {
        C10427h.C10435g<C9930z, C9890a.C9898d> gVar = C9890a.f27287d;
        C10202j.m34174a((Object) gVar, "propertySignature");
        C9890a.C9898d dVar = (C9890a.C9898d) C9878f.m32873a(zVar, gVar);
        if (dVar != null) {
            if (z) {
                C9920e.C9921a a = C9928i.f27389b.mo34935a(zVar, cVar, hVar, z3);
                if (a != null) {
                    return C9732r.f26703b.mo34331a(a);
                }
                return null;
            } else if (z2 && dVar.mo34893p()) {
                C9732r.C9733a aVar = C9732r.f26703b;
                C9890a.C9895c l = dVar.mo34889l();
                C10202j.m34174a((Object) l, "signature.syntheticMethod");
                return aVar.mo34330a(cVar, l);
            }
        }
        return null;
    }

    /* renamed from: a */
    static /* synthetic */ C9732r m31196a(C9679a aVar, C10449o oVar, C9875c cVar, C9880h hVar, C11692b bVar, boolean z, int i, Object obj) {
        if (obj == null) {
            return aVar.m31198a(oVar, cVar, hVar, bVar, (i & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    /* renamed from: a */
    private final C9732r m31198a(C10449o oVar, C9875c cVar, C9880h hVar, C11692b bVar, boolean z) {
        if (oVar instanceof C9790h) {
            C9732r.C9733a aVar = C9732r.f26703b;
            C9920e.C9922b a = C9928i.f27389b.mo34936a((C9790h) oVar, cVar, hVar);
            if (a != null) {
                return aVar.mo34331a(a);
            }
            return null;
        } else if (oVar instanceof C9836r) {
            C9732r.C9733a aVar2 = C9732r.f26703b;
            C9920e.C9922b a2 = C9928i.f27389b.mo34937a((C9836r) oVar, cVar, hVar);
            if (a2 != null) {
                return aVar2.mo34331a(a2);
            }
            return null;
        } else if (!(oVar instanceof C9930z)) {
            return null;
        } else {
            C10427h.C10435g<C9930z, C9890a.C9898d> gVar = C9890a.f27287d;
            C10202j.m34174a((Object) gVar, "propertySignature");
            C9890a.C9898d dVar = (C9890a.C9898d) C9878f.m32873a((C10427h.C10431d) oVar, gVar);
            if (dVar == null) {
                return null;
            }
            int i = C9700b.f26663a[bVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return m31197a((C9930z) oVar, cVar, hVar, true, true, z);
                } else if (!dVar.mo34892o()) {
                    return null;
                } else {
                    C9732r.C9733a aVar3 = C9732r.f26703b;
                    C9890a.C9895c k = dVar.mo34888k();
                    C10202j.m34174a((Object) k, "signature.setter");
                    return aVar3.mo34330a(cVar, k);
                }
            } else if (!dVar.mo34891n()) {
                return null;
            } else {
                C9732r.C9733a aVar4 = C9732r.f26703b;
                C9890a.C9895c j = dVar.mo34887j();
                C10202j.m34174a((Object) j, "signature.getter");
                return aVar4.mo34330a(cVar, j);
            }
        }
    }
}
