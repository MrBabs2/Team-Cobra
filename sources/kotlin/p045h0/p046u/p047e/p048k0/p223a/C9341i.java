package kotlin.p045h0.p046u.p047e.p048k0.p223a;

import java.util.List;
import kotlin.C10219k;
import kotlin.C9134f;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9401d;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11940n0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10232a0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10376t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.a.i */
/* compiled from: ReflectionTypes.kt */
public final class C9341i {

    /* renamed from: d */
    static final /* synthetic */ C9168l[] f25997d;

    /* renamed from: e */
    public static final C9343b f25998e = new C9343b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C9134f f25999a;

    /* renamed from: b */
    private final C9342a f26000b = new C9342a(1);

    /* renamed from: c */
    private final C10232a0 f26001c;

    /* renamed from: kotlin.h0.u.e.k0.a.i$a */
    /* compiled from: ReflectionTypes.kt */
    private static final class C9342a {

        /* renamed from: a */
        private final int f26002a;

        public C9342a(int i) {
            this.f26002a = i;
        }

        /* renamed from: a */
        public final C10342e mo33737a(C9341i iVar, C9168l<?> lVar) {
            C10202j.m34178b(iVar, "types");
            C10202j.m34178b(lVar, "property");
            return iVar.m30265a(C12130v.m40057e(lVar.getName()), this.f26002a);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.a.i$b */
    /* compiled from: ReflectionTypes.kt */
    public static final class C9343b {
        private C9343b() {
        }

        /* renamed from: a */
        public final C11824b0 mo33738a(C10393y yVar) {
            C10202j.m34178b(yVar, "module");
            C9933a aVar = C9333g.f25907k.f25942Y;
            C10202j.m34174a((Object) aVar, "KotlinBuiltIns.FQ_NAMES.kProperty");
            C10342e a = C10376t.m35016a(yVar, aVar);
            if (a == null) {
                return null;
            }
            C10249g a2 = C10249g.f27910c.mo35429a();
            C11953s0 h = a.mo33766h();
            C10202j.m34174a((Object) h, "kPropertyClass.typeConstructor");
            List<C10375s0> parameters = h.getParameters();
            C10202j.m34174a((Object) parameters, "kPropertyClass.typeConstructor.parameters");
            Object i = C10539w.m35809i(parameters);
            C10202j.m34174a(i, "kPropertyClass.typeConstructor.parameters.single()");
            return C11827c0.m38950a(a2, a, (List<? extends C11965u0>) C10527n.m35729a(new C11940n0((C10375s0) i)));
        }

        public /* synthetic */ C9343b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.a.i$c */
    /* compiled from: ReflectionTypes.kt */
    static final class C9344c extends C10203k implements C9102a<C10096h> {

        /* renamed from: f */
        final /* synthetic */ C10393y f26003f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9344c(C10393y yVar) {
            super(0);
            this.f26003f = yVar;
        }

        public final C10096h invoke() {
            return this.f26003f.mo35554a(C9345j.m30271a()).mo35545m();
        }
    }

    static {
        Class<C9341i> cls = C9341i.class;
        f25997d = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "kotlinReflectScope", "getKotlinReflectScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    }

    public C9341i(C10393y yVar, C10232a0 a0Var) {
        C10202j.m34178b(yVar, "module");
        C10202j.m34178b(a0Var, "notFoundClasses");
        this.f26001c = a0Var;
        this.f25999a = C10181i.m34135a(C10219k.PUBLICATION, new C9344c(yVar));
        new C9342a(1);
        new C9342a(1);
        new C9342a(2);
        new C9342a(3);
        new C9342a(1);
        new C9342a(2);
        new C9342a(3);
    }

    /* renamed from: b */
    private final C10096h m30267b() {
        C9134f fVar = this.f25999a;
        C9168l lVar = f25997d[0];
        return (C10096h) fVar.getValue();
    }

    /* renamed from: a */
    public final C10342e mo33736a() {
        return this.f26000b.mo33737a(this, f25997d[1]);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C10342e m30265a(String str, int i) {
        C9939f b = C9939f.m33302b(str);
        C10202j.m34174a((Object) b, "Name.identifier(className)");
        C10349h b2 = m30267b().mo33917b(b, C9401d.FROM_REFLECTION);
        if (!(b2 instanceof C10342e)) {
            b2 = null;
        }
        C10342e eVar = (C10342e) b2;
        return eVar != null ? eVar : this.f26001c.mo35410a(new C9933a(C9345j.m30271a(), b), C10527n.m35729a(Integer.valueOf(i)));
    }
}
