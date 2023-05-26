package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C10200h;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11717b;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11755m;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9332f;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9346k;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9811l0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9870b;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9879g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11938m0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11940n0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11949q0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11970w0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p384k1.C11924a;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p262y.C10525m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10376t;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.i.b.e0 */
/* compiled from: TypeDeserializer.kt */
public final class C11699e0 {

    /* renamed from: a */
    private final C9113l<Integer, C10342e> f31285a;

    /* renamed from: b */
    private final C9113l<Integer, C10349h> f31286b;

    /* renamed from: c */
    private final Map<Integer, C10375s0> f31287c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C11771n f31288d;

    /* renamed from: e */
    private final C11699e0 f31289e;

    /* renamed from: f */
    private final String f31290f;

    /* renamed from: g */
    private final String f31291g;

    /* renamed from: h */
    private boolean f31292h;

    /* renamed from: kotlin.h0.u.e.k0.i.b.e0$a */
    /* compiled from: TypeDeserializer.kt */
    static final class C11700a extends C10203k implements C9113l<Integer, C10342e> {

        /* renamed from: f */
        final /* synthetic */ C11699e0 f31293f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11700a(C11699e0 e0Var) {
            super(1);
            this.f31293f = e0Var;
        }

        /* renamed from: a */
        public final C10342e mo38277a(int i) {
            return this.f31293f.m38518a(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo38277a(((Number) obj).intValue());
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.i.b.e0$b */
    /* compiled from: TypeDeserializer.kt */
    static final class C11701b extends C10203k implements C9113l<C9782g0, List<? extends C9782g0.C9784b>> {

        /* renamed from: f */
        final /* synthetic */ C11699e0 f31294f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11701b(C11699e0 e0Var) {
            super(1);
            this.f31294f = e0Var;
        }

        /* renamed from: a */
        public final List<C9782g0.C9784b> invoke(C9782g0 g0Var) {
            C10202j.m34178b(g0Var, "$this$collectAllArguments");
            List<C9782g0.C9784b> o = g0Var.mo34532o();
            C10202j.m34174a((Object) o, "argumentList");
            C9782g0 c = C9879g.m32890c(g0Var, this.f31294f.f31288d.mo38382h());
            List<C9782g0.C9784b> a = c != null ? invoke(c) : null;
            if (a == null) {
                a = C10529o.m35736a();
            }
            return C10539w.m35796d(o, a);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.i.b.e0$c */
    /* compiled from: TypeDeserializer.kt */
    static final class C11702c extends C10203k implements C9102a<List<? extends C10243c>> {

        /* renamed from: f */
        final /* synthetic */ C11699e0 f31295f;

        /* renamed from: g */
        final /* synthetic */ C9782g0 f31296g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11702c(C11699e0 e0Var, C9782g0 g0Var) {
            super(0);
            this.f31295f = e0Var;
            this.f31296g = g0Var;
        }

        public final List<C10243c> invoke() {
            return this.f31295f.f31288d.mo38374a().mo38354b().mo34239a(this.f31296g, this.f31295f.f31288d.mo38379e());
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.i.b.e0$d */
    /* compiled from: TypeDeserializer.kt */
    static final class C11703d extends C10203k implements C9113l<Integer, C10349h> {

        /* renamed from: f */
        final /* synthetic */ C11699e0 f31297f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11703d(C11699e0 e0Var) {
            super(1);
            this.f31297f = e0Var;
        }

        /* renamed from: a */
        public final C10349h mo38279a(int i) {
            return this.f31297f.m38524c(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo38279a(((Number) obj).intValue());
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.i.b.e0$e */
    /* compiled from: TypeDeserializer.kt */
    static final class C11704e extends C10203k implements C9113l<Integer, C10342e> {

        /* renamed from: f */
        final /* synthetic */ C11699e0 f31298f;

        /* renamed from: g */
        final /* synthetic */ C9782g0 f31299g;

        /* renamed from: kotlin.h0.u.e.k0.i.b.e0$e$a */
        /* compiled from: TypeDeserializer.kt */
        static final /* synthetic */ class C11705a extends C10200h implements C9113l<C9933a, C9933a> {

            /* renamed from: g */
            public static final C11705a f31300g = new C11705a();

            C11705a() {
                super(1);
            }

            /* renamed from: a */
            public final C9933a invoke(C9933a aVar) {
                C10202j.m34178b(aVar, "p1");
                return aVar.mo34985c();
            }

            public final String getName() {
                return "getOuterClassId";
            }

            public final C9156e getOwner() {
                return C10216x.m34186a(C9933a.class);
            }

            public final String getSignature() {
                return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.i.b.e0$e$b */
        /* compiled from: TypeDeserializer.kt */
        static final class C11706b extends C10203k implements C9113l<C9782g0, C9782g0> {

            /* renamed from: f */
            final /* synthetic */ C11704e f31301f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11706b(C11704e eVar) {
                super(1);
                this.f31301f = eVar;
            }

            /* renamed from: a */
            public final C9782g0 invoke(C9782g0 g0Var) {
                C10202j.m34178b(g0Var, "it");
                return C9879g.m32890c(g0Var, this.f31301f.f31298f.f31288d.mo38382h());
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.i.b.e0$e$c */
        /* compiled from: TypeDeserializer.kt */
        static final class C11707c extends C10203k implements C9113l<C9782g0, Integer> {

            /* renamed from: f */
            public static final C11707c f31302f = new C11707c();

            C11707c() {
                super(1);
            }

            /* renamed from: a */
            public final int mo38283a(C9782g0 g0Var) {
                C10202j.m34178b(g0Var, "it");
                return g0Var.mo34531n();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Integer.valueOf(mo38283a((C9782g0) obj));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11704e(C11699e0 e0Var, C9782g0 g0Var) {
            super(1);
            this.f31298f = e0Var;
            this.f31299g = g0Var;
        }

        /* renamed from: a */
        public final C10342e mo38280a(int i) {
            C9933a a = C11792y.m38824a(this.f31298f.f31288d.mo38379e(), i);
            List h = C12090n.m39932h(C12090n.m39926d(C12083l.m39906a(this.f31299g, new C11706b(this)), C11707c.f31302f));
            int d = C12090n.m39925d(C12083l.m39906a(a, C11705a.f31300g));
            while (h.size() < d) {
                h.add(0);
            }
            return this.f31298f.f31288d.mo38374a().mo38366n().mo35410a(a, h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo38280a(((Number) obj).intValue());
        }
    }

    public C11699e0(C11771n nVar, C11699e0 e0Var, List<C9811l0> list, String str, String str2, boolean z) {
        Map<Integer, C10375s0> map;
        C10202j.m34178b(nVar, "c");
        C10202j.m34178b(list, "typeParameterProtos");
        C10202j.m34178b(str, "debugName");
        C10202j.m34178b(str2, "containerPresentableName");
        this.f31288d = nVar;
        this.f31289e = e0Var;
        this.f31290f = str;
        this.f31291g = str2;
        this.f31292h = z;
        this.f31285a = nVar.mo38380f().mo38406b(new C11700a(this));
        this.f31286b = this.f31288d.mo38380f().mo38406b(new C11703d(this));
        if (list.isEmpty()) {
            map = C10518j0.m35601a();
        } else {
            map = new LinkedHashMap<>();
            int i = 0;
            for (C9811l0 l0Var : list) {
                map.put(Integer.valueOf(l0Var.mo34643l()), new C11755m(this.f31288d, l0Var, i));
                i++;
            }
        }
        this.f31287c = map;
    }

    /* renamed from: c */
    private final C11953s0 m38523c(C9782g0 g0Var) {
        T t;
        C11953s0 h;
        C11704e eVar = new C11704e(this, g0Var);
        if (g0Var.mo34517E()) {
            C10342e invoke = this.f31285a.invoke(Integer.valueOf(g0Var.mo34533p()));
            if (invoke == null) {
                invoke = eVar.mo38280a(g0Var.mo34533p());
            }
            C11953s0 h2 = invoke.mo33766h();
            C10202j.m34174a((Object) h2, "(classDescriptors(proto.…assName)).typeConstructor");
            return h2;
        } else if (g0Var.mo34526N()) {
            C11953s0 d = m38525d(g0Var.mo34513A());
            if (d != null) {
                return d;
            }
            C11953s0 d2 = C11958u.m39561d("Unknown type parameter " + g0Var.mo34513A() + ". Please try recompiling module containing \"" + this.f31291g + '\"');
            C10202j.m34174a((Object) d2, "ErrorUtils.createErrorTy…\\\"\"\n                    )");
            return d2;
        } else if (g0Var.mo34527O()) {
            C10359m c = this.f31288d.mo38377c();
            String string = this.f31288d.mo38379e().getString(g0Var.mo34514B());
            Iterator<T> it = mo38274b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C10202j.m34176a((Object) ((C10375s0) t).getName().mo35021a(), (Object) string)) {
                    break;
                }
            }
            C10375s0 s0Var = (C10375s0) t;
            if (s0Var != null && (h = s0Var.mo33766h()) != null) {
                return h;
            }
            C11953s0 d3 = C11958u.m39561d("Deserialized type parameter " + string + " in " + c);
            C10202j.m34174a((Object) d3, "ErrorUtils.createErrorTy…ter $name in $container\")");
            return d3;
        } else if (g0Var.mo34525M()) {
            C10349h invoke2 = this.f31286b.invoke(Integer.valueOf(g0Var.mo34541z()));
            if (invoke2 == null) {
                invoke2 = eVar.mo38280a(g0Var.mo34541z());
            }
            C11953s0 h3 = invoke2.mo33766h();
            C10202j.m34174a((Object) h3, "(typeAliasDescriptors(pr…iasName)).typeConstructor");
            return h3;
        } else {
            C11953s0 d4 = C11958u.m39561d("Unknown type");
            C10202j.m34174a((Object) d4, "ErrorUtils.createErrorTy…nstructor(\"Unknown type\")");
            return d4;
        }
    }

    /* renamed from: d */
    private final C11953s0 m38525d(int i) {
        C11953s0 h;
        C10375s0 s0Var = this.f31287c.get(Integer.valueOf(i));
        if (s0Var != null && (h = s0Var.mo33766h()) != null) {
            return h;
        }
        C11699e0 e0Var = this.f31289e;
        if (e0Var != null) {
            return e0Var.m38525d(i);
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31290f);
        if (this.f31289e == null) {
            str = "";
        } else {
            str = ". Child of " + this.f31289e.f31290f;
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public final List<C10375s0> mo38274b() {
        return C10539w.m35815n(this.f31287c.values());
    }

    /* renamed from: a */
    public final boolean mo38273a() {
        return this.f31292h;
    }

    /* renamed from: b */
    public final C11824b0 mo38275b(C9782g0 g0Var) {
        C10202j.m34178b(g0Var, "proto");
        if (!g0Var.mo34519G()) {
            return mo38272a(g0Var);
        }
        String string = this.f31288d.mo38379e().getString(g0Var.mo34535r());
        C11901j0 a = mo38272a(g0Var);
        C9782g0 b = C9879g.m32885b(g0Var, this.f31288d.mo38382h());
        if (b != null) {
            return this.f31288d.mo38374a().mo38362j().mo34290a(g0Var, string, a, mo38272a(b));
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: a */
    public final C11901j0 mo38272a(C9782g0 g0Var) {
        C11901j0 j0Var;
        C11901j0 j0Var2;
        C10202j.m34178b(g0Var, "proto");
        if (g0Var.mo34517E()) {
            j0Var = m38520b(g0Var.mo34533p());
        } else {
            j0Var = g0Var.mo34525M() ? m38520b(g0Var.mo34541z()) : null;
        }
        if (j0Var != null) {
            return j0Var;
        }
        C11953s0 c = m38523c(g0Var);
        if (C11958u.m39553a((C10359m) c.mo33781b())) {
            C11901j0 a = C11958u.m39547a(c.toString(), c);
            C10202j.m34174a((Object) a, "ErrorUtils.createErrorTy….toString(), constructor)");
            return a;
        }
        C11717b bVar = new C11717b(this.f31288d.mo38380f(), new C11702c(this, g0Var));
        List<C9782g0.C9784b> a2 = new C11701b(this).invoke(g0Var);
        ArrayList arrayList = new ArrayList(C10531p.m35750a(a2, 10));
        int i = 0;
        for (T next : a2) {
            int i2 = i + 1;
            if (i >= 0) {
                List<C10375s0> parameters = c.getParameters();
                C10202j.m34174a((Object) parameters, "constructor.parameters");
                arrayList.add(m38517a((C10375s0) C10539w.m35792d(parameters, i), (C9782g0.C9784b) next));
                i = i2;
            } else {
                C10525m.m35693c();
                throw null;
            }
        }
        List n = C10539w.m35815n(arrayList);
        Boolean a3 = C9870b.f27236a.m32856a(g0Var.mo34534q());
        C10202j.m34174a((Object) a3, "Flags.SUSPEND_TYPE.get(proto.flags)");
        if (a3.booleanValue()) {
            j0Var2 = m38516a(bVar, c, n, g0Var.mo34538u());
        } else {
            j0Var2 = C11827c0.m38948a(bVar, c, n, g0Var.mo34538u());
        }
        C9782g0 a4 = C9879g.m32878a(g0Var, this.f31288d.mo38382h());
        return a4 != null ? C11938m0.m39471a(j0Var2, mo38272a(a4)) : j0Var2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11699e0(C11771n nVar, C11699e0 e0Var, List list, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, e0Var, list, str, str2, (i & 32) != 0 ? false : z);
    }

    /* renamed from: b */
    private final C11901j0 m38521b(C10249g gVar, C11953s0 s0Var, List<? extends C11965u0> list, boolean z) {
        C11901j0 a = C11827c0.m38948a(gVar, s0Var, list, z);
        if (!C9332f.m30159g(a)) {
            return null;
        }
        return m38514a((C11824b0) a);
    }

    /* renamed from: b */
    private final C11901j0 m38520b(int i) {
        if (C11792y.m38824a(this.f31288d.mo38379e(), i).mo34990g()) {
            return this.f31288d.mo38374a().mo38363k().mo38391a();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C10349h m38524c(int i) {
        C9933a a = C11792y.m38824a(this.f31288d.mo38379e(), i);
        if (a.mo34990g()) {
            return null;
        }
        return C10376t.m35018b(this.f31288d.mo38374a().mo38365m(), a);
    }

    /* renamed from: a */
    private final C11901j0 m38516a(C10249g gVar, C11953s0 s0Var, List<? extends C11965u0> list, boolean z) {
        int size;
        int size2 = s0Var.getParameters().size() - list.size();
        C11901j0 j0Var = null;
        if (size2 == 0) {
            j0Var = m38521b(gVar, s0Var, list, z);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            C10342e b = s0Var.mo35232l().mo33706b(size);
            C10202j.m34174a((Object) b, "functionTypeConstructor.…getSuspendFunction(arity)");
            C11953s0 h = b.mo33766h();
            C10202j.m34174a((Object) h, "functionTypeConstructor.…on(arity).typeConstructor");
            j0Var = C11827c0.m38948a(gVar, h, list, z);
        }
        if (j0Var != null) {
            return j0Var;
        }
        C11901j0 a = C11958u.m39546a("Bad suspend function in metadata with constructor: " + s0Var, (List<C11965u0>) list);
        C10202j.m34174a((Object) a, "ErrorUtils.createErrorTy…      arguments\n        )");
        return a;
    }

    /* renamed from: a */
    private final C11901j0 m38514a(C11824b0 b0Var) {
        C11824b0 type;
        boolean d = this.f31288d.mo38374a().mo38357e().mo38373d();
        C11965u0 u0Var = (C11965u0) C10539w.m35807h(C9332f.m30156d(b0Var));
        C9934b bVar = null;
        if (u0Var == null || (type = u0Var.getType()) == null) {
            return null;
        }
        C10202j.m34174a((Object) type, "funType.getValueParamete…ll()?.type ?: return null");
        C10349h b = type.mo35227v0().mo33781b();
        C9934b c = b != null ? C10071a.m33895c(b) : null;
        boolean z = true;
        if (type.mo35226u0().size() != 1 || (!C9346k.m30273a(c, true) && !C9346k.m30273a(c, false))) {
            return (C11901j0) b0Var;
        }
        C11824b0 type2 = ((C11965u0) C10539w.m35809i(type.mo35226u0())).getType();
        C10202j.m34174a((Object) type2, "continuationArgumentType.arguments.single().type");
        C10359m c2 = this.f31288d.mo38377c();
        if (!(c2 instanceof C10230a)) {
            c2 = null;
        }
        C10230a aVar = (C10230a) c2;
        if (aVar != null) {
            bVar = C10071a.m33885a((C10359m) aVar);
        }
        if (C10202j.m34176a((Object) bVar, (Object) C11697d0.f31282a)) {
            return m38515a(b0Var, type2);
        }
        if (!this.f31292h && (!d || !C9346k.m30273a(c, !d))) {
            z = false;
        }
        this.f31292h = z;
        return m38515a(b0Var, type2);
    }

    /* renamed from: a */
    private final C11901j0 m38515a(C11824b0 b0Var, C11824b0 b0Var2) {
        C9333g b = C11924a.m39418b(b0Var);
        C10249g annotations = b0Var.getAnnotations();
        C11824b0 b2 = C9332f.m30154b(b0Var);
        List<T> c = C10539w.m35790c(C9332f.m30156d(b0Var), 1);
        ArrayList arrayList = new ArrayList(C10531p.m35750a(c, 10));
        for (T type : c) {
            arrayList.add(type.getType());
        }
        return C9332f.m30152a(b, annotations, b2, arrayList, (List<C9939f>) null, b0Var2, true).mo34007a(b0Var.mo34094w0());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C10342e m38518a(int i) {
        C9933a a = C11792y.m38824a(this.f31288d.mo38379e(), i);
        if (a.mo34990g()) {
            return this.f31288d.mo38374a().mo38353a(a);
        }
        return C10376t.m35016a(this.f31288d.mo38374a().mo38365m(), a);
    }

    /* renamed from: a */
    private final C11965u0 m38517a(C10375s0 s0Var, C9782g0.C9784b bVar) {
        if (bVar.mo34542i() != C9782g0.C9784b.C9787c.STAR) {
            C11695c0 c0Var = C11695c0.f31280a;
            C9782g0.C9784b.C9787c i = bVar.mo34542i();
            C10202j.m34174a((Object) i, "typeArgumentProto.projection");
            C11838f1 a = c0Var.mo38266a(i);
            C9782g0 a2 = C9879g.m32877a(bVar, this.f31288d.mo38382h());
            if (a2 != null) {
                return new C11970w0(a, mo38275b(a2));
            }
            return new C11970w0(C11958u.m39559c("No type recorded"));
        } else if (s0Var != null) {
            return new C11940n0(s0Var);
        } else {
            C11901j0 u = this.f31288d.mo38374a().mo38365m().mo35561l().mo33725u();
            C10202j.m34174a((Object) u, "c.components.moduleDescr….builtIns.nullableAnyType");
            return new C11949q0(u);
        }
    }
}
