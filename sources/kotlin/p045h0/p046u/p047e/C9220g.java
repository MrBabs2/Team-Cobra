package kotlin.p045h0.p046u.p047e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10200h;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9154c;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.C9157f;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.C10176z;
import kotlin.p045h0.p046u.p047e.C9247i;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11786x;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11721e;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9328c;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9401d;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9878f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10088d;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10101j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p222j0.C9316k;
import kotlin.p215c0.C9100a;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10352i0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10357l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10376t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10241a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001`B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010O\u001a\u00020%2\b\u0010P\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00132\u0006\u0010S\u001a\u00020TH\u0016J\u0012\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010W\u001a\u00020XH\u0016J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0\u00132\u0006\u0010S\u001a\u00020TH\u0016J\b\u0010Z\u001a\u00020XH\u0016J\u0012\u0010[\u001a\u00020%2\b\u0010\\\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010]\u001a\u00020^H\u0002J\b\u0010_\u001a\u00020<H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R3\u0010\u001a\u001a$\u0012 \u0012\u001e \u001d*\u000e\u0018\u00010\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&R\u0014\u0010'\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008@X\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001e\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0016R\u001e\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0016R\u0016\u00108\u001a\u0004\u0018\u00018\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010;\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\"\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\n8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\rR\u0016\u0010A\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010>R\u0014\u0010C\u001a\u0002008@X\u0004¢\u0006\u0006\u001a\u0004\bD\u00102R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\n8VX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\rR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\n8VX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\rR\u0016\u0010K\u001a\u0004\u0018\u00010L8VX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006a"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "isAbstract", "", "()Z", "isCompanion", "isData", "isFinal", "isInner", "isOpen", "isSealed", "getJClass", "()Ljava/lang/Class;", "memberScope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses", "simpleName", "getSimpleName", "staticScope", "getStaticScope$kotlin_reflection", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "isInstance", "value", "reportUnresolvedClass", "", "toString", "Data", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.g */
/* compiled from: KClassImpl.kt */
public final class C9220g<T> extends C9247i implements C9154c<T> {

    /* renamed from: i */
    private final C10176z.C10178b<C9220g<T>.C0000a> f25752i;

    /* renamed from: j */
    private final Class<T> f25753j;

    /* renamed from: kotlin.h0.u.e.g$b */
    /* compiled from: KClassImpl.kt */
    static final class C9242b extends C10203k implements C9102a<C9220g<T>.C0000a> {

        /* renamed from: f */
        final /* synthetic */ C9220g f25788f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9242b(C9220g gVar) {
            super(0);
            this.f25788f = gVar;
        }

        public final C9220g<T>.C0000a invoke() {
            return new C9221a();
        }
    }

    /* renamed from: kotlin.h0.u.e.g$c */
    /* compiled from: KClassImpl.kt */
    static final /* synthetic */ class C9243c extends C10200h implements C9117p<C11786x, C9930z, C10352i0> {

        /* renamed from: g */
        public static final C9243c f25789g = new C9243c();

        C9243c() {
            super(2);
        }

        /* renamed from: a */
        public final C10352i0 invoke(C11786x xVar, C9930z zVar) {
            C10202j.m34178b(xVar, "p1");
            C10202j.m34178b(zVar, "p2");
            return xVar.mo38393a(zVar);
        }

        public final String getName() {
            return "loadProperty";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(C11786x.class);
        }

        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }
    }

    public C9220g(Class<T> cls) {
        C10202j.m34178b(cls, "jClass");
        this.f25753j = cls;
        C10176z.C10178b<C9220g<T>.C0000a> a = C10176z.m34123a(new C9242b(this));
        C10202j.m34174a((Object) a, "ReflectProperties.lazy { Data() }");
        this.f25752i = a;
    }

    /* renamed from: b */
    public static final /* synthetic */ Void m29959b(C9220g gVar) {
        gVar.m29961t();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final C9933a m29960s() {
        return C9205d0.f25736b.mo33582a((Class<?>) mo33537a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.mo33661a();
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void m29961t() {
        /*
            r4 = this;
            kotlin.h0.u.e.j0.f$a r0 = kotlin.p045h0.p046u.p047e.p222j0.C9310f.f25877c
            java.lang.Class r1 = r4.mo33537a()
            kotlin.h0.u.e.j0.f r0 = r0.mo33670a(r1)
            if (r0 == 0) goto L_0x0017
            kotlin.h0.u.e.k0.c.b.a0.a r0 = r0.mo33661a()
            if (r0 == 0) goto L_0x0017
            kotlin.h0.u.e.k0.c.b.a0.a$a r0 = r0.mo34261c()
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x0093
            int[] r1 = kotlin.p045h0.p046u.p047e.C9245h.f25791a
            int r2 = r0.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L_0x0073;
                case 2: goto L_0x0073;
                case 3: goto L_0x0073;
                case 4: goto L_0x0053;
                case 5: goto L_0x002b;
                case 6: goto L_0x0093;
                default: goto L_0x0025;
            }
        L_0x0025:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x002b:
            kotlin.h0.u.e.x r1 = new kotlin.h0.u.e.x
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown class: "
            r2.append(r3)
            java.lang.Class r3 = r4.mo33537a()
            r2.append(r3)
            java.lang.String r3 = " (kind = "
            r2.append(r3)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0053:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection "
            r1.append(r2)
            java.lang.String r2 = "library has no idea what declarations does it have. Please use Java reflection to inspect this class: "
            r1.append(r2)
            java.lang.Class r2 = r4.mo33537a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0073:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Packages and file facades are not yet supported in Kotlin reflection. "
            r1.append(r2)
            java.lang.String r2 = "Meanwhile please use Java reflection to inspect this class: "
            r1.append(r2)
            java.lang.Class r2 = r4.mo33537a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0093:
            kotlin.h0.u.e.x r0 = new kotlin.h0.u.e.x
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unresolved class: "
            r1.append(r2)
            java.lang.Class r2 = r4.mo33537a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.C9220g.m29961t():java.lang.Void");
    }

    /* renamed from: d */
    public Collection<C10357l> mo33541d() {
        C10342e p = mo33596p();
        if (p.mo33763g() == C10345f.INTERFACE || p.mo33763g() == C10345f.OBJECT) {
            return C10529o.m35736a();
        }
        Collection<C10273d> j = p.mo33769j();
        C10202j.m34174a((Object) j, "descriptor.constructors");
        return j;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9220g) && C10202j.m34176a((Object) C9100a.m29807b(this), (Object) C9100a.m29807b((C9154c) obj));
    }

    public List<Annotation> getAnnotations() {
        return this.f25752i.mo35358a().mo33602d();
    }

    public int hashCode() {
        return C9100a.m29807b(this).hashCode();
    }

    public boolean isAbstract() {
        return mo33596p().mo33767i() == C10388w.f28185i;
    }

    /* renamed from: j */
    public Collection<C9157f<T>> mo33594j() {
        return this.f25752i.mo35358a().mo33603e();
    }

    /* renamed from: k */
    public boolean mo33510k() {
        return mo33596p().mo33770k();
    }

    /* renamed from: l */
    public String mo33511l() {
        return this.f25752i.mo35358a().mo33607i();
    }

    /* renamed from: m */
    public T mo33512m() {
        return this.f25752i.mo35358a().mo33606h();
    }

    /* renamed from: n */
    public boolean mo33513n() {
        return mo33596p().mo33767i() == C10388w.f28183g;
    }

    /* renamed from: o */
    public final C10176z.C10178b<C9220g<T>.C0000a> mo33595o() {
        return this.f25752i;
    }

    /* renamed from: p */
    public C10342e mo33596p() {
        return this.f25752i.mo35358a().mo33605g();
    }

    /* renamed from: q */
    public final C10096h mo33597q() {
        return mo33596p().mo35445o().mo34008m();
    }

    /* renamed from: r */
    public final C10096h mo33598r() {
        C10096h M = mo33596p().mo33760M();
        C10202j.m34174a((Object) M, "descriptor.staticScope");
        return M;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        C9933a s = m29960s();
        C9934b d = s.mo34986d();
        C10202j.m34174a((Object) d, "classId.packageFqName");
        if (d.mo34996b()) {
            str = "";
        } else {
            str = d.mo34994a() + ".";
        }
        String a = s.mo34987e().mo34994a();
        C10202j.m34174a((Object) a, "classId.relativeClassName.asString()");
        sb.append(str + C12130v.m40043a(a, '.', '$', false, 4, (Object) null));
        return sb.toString();
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010N\u001a\u00020<2\n\u0010O\u001a\u0006\u0012\u0002\b\u00030PH\u0002R%\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR%\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R-\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00058FX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\bR%\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\bR%\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b!\u0010\bR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\bR\u001b\u0010&\u001a\u00020'8FX\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)R%\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b,\u0010\bR%\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b/\u0010\bR%\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003020\u00058FX\u0002¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b3\u0010\bR#\u00105\u001a\u0004\u0018\u00018\u00008FX\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u00108R\u001d\u0010;\u001a\u0004\u0018\u00010<8FX\u0002¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b=\u0010>R)\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u0000020\u00128FX\u0002¢\u0006\f\n\u0004\bB\u0010\n\u001a\u0004\bA\u0010\u0015R\u001d\u0010C\u001a\u0004\u0018\u00010<8FX\u0002¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bD\u0010>R!\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00128FX\u0002¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bH\u0010\u0015R!\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00128FX\u0002¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bL\u0010\u0015¨\u0006Q"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "allMembers", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getAllMembers", "()Ljava/util/Collection;", "allMembers$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "allNonStaticMembers", "getAllNonStaticMembers", "allNonStaticMembers$delegate", "allStaticMembers", "getAllStaticMembers", "allStaticMembers$delegate", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "constructors", "Lkotlin/reflect/KFunction;", "constructors$annotations", "()V", "getConstructors", "constructors$delegate", "declaredMembers", "getDeclaredMembers", "declaredMembers$delegate", "declaredNonStaticMembers", "getDeclaredNonStaticMembers", "declaredNonStaticMembers$delegate", "declaredStaticMembers", "getDeclaredStaticMembers", "declaredStaticMembers$delegate", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor$delegate", "inheritedNonStaticMembers", "getInheritedNonStaticMembers", "inheritedNonStaticMembers$delegate", "inheritedStaticMembers", "getInheritedStaticMembers", "inheritedStaticMembers$delegate", "nestedClasses", "Lkotlin/reflect/KClass;", "getNestedClasses", "nestedClasses$delegate", "objectInstance", "objectInstance$annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "qualifiedName$delegate", "sealedSubclasses", "getSealedSubclasses", "sealedSubclasses$delegate", "simpleName", "getSimpleName", "simpleName$delegate", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes$delegate", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters$delegate", "calculateLocalClassName", "jClass", "Ljava/lang/Class;", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.g$a */
    /* compiled from: KClassImpl.kt */
    public final class C9221a extends C9247i.C9249b {

        /* renamed from: p */
        static final /* synthetic */ C9168l[] f25754p;

        /* renamed from: d */
        private final C10176z.C10177a f25755d = C10176z.m34125b(new C9230i(this));

        /* renamed from: e */
        private final C10176z.C10177a f25756e = C10176z.m34125b(new C9225d(this));

        /* renamed from: f */
        private final C10176z.C10177a f25757f;

        /* renamed from: g */
        private final C10176z.C10177a f25758g;

        /* renamed from: h */
        private final C10176z.C10178b f25759h;

        /* renamed from: i */
        private final C10176z.C10177a f25760i;

        /* renamed from: j */
        private final C10176z.C10177a f25761j;

        /* renamed from: k */
        private final C10176z.C10177a f25762k;

        /* renamed from: l */
        private final C10176z.C10177a f25763l;

        /* renamed from: m */
        private final C10176z.C10177a f25764m;

        /* renamed from: n */
        private final C10176z.C10177a f25765n;

        /* renamed from: kotlin.h0.u.e.g$a$a */
        /* compiled from: KClassImpl.kt */
        static final class C9222a extends C10203k implements C9102a<List<? extends C9206e<?>>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25767f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9222a(C9221a aVar) {
                super(0);
                this.f25767f = aVar;
            }

            public final List<C9206e<?>> invoke() {
                return C10539w.m35796d(this.f25767f.mo33600b(), this.f25767f.mo33601c());
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$b */
        /* compiled from: KClassImpl.kt */
        static final class C9223b extends C10203k implements C9102a<List<? extends C9206e<?>>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25768f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9223b(C9221a aVar) {
                super(0);
                this.f25768f = aVar;
            }

            public final List<C9206e<?>> invoke() {
                return C10539w.m35796d(this.f25768f.mo33604f(), this.f25768f.m29982k());
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$c */
        /* compiled from: KClassImpl.kt */
        static final class C9224c extends C10203k implements C9102a<List<? extends C9206e<?>>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25769f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9224c(C9221a aVar) {
                super(0);
                this.f25769f = aVar;
            }

            public final List<C9206e<?>> invoke() {
                return C10539w.m35796d(this.f25769f.m29981j(), this.f25769f.m29983l());
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$d */
        /* compiled from: KClassImpl.kt */
        static final class C9225d extends C10203k implements C9102a<List<? extends Annotation>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25770f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9225d(C9221a aVar) {
                super(0);
                this.f25770f = aVar;
            }

            public final List<Annotation> invoke() {
                return C9244g0.m29999a((C10241a) this.f25770f.mo33605g());
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$e */
        /* compiled from: KClassImpl.kt */
        static final class C9226e extends C10203k implements C9102a<List<? extends C9157f<? extends T>>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25771f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9226e(C9221a aVar) {
                super(0);
                this.f25771f = aVar;
            }

            public final List<C9157f<T>> invoke() {
                Collection<C10357l> d = C9220g.this.mo33541d();
                ArrayList arrayList = new ArrayList(C10531p.m35750a(d, 10));
                for (C10357l jVar : d) {
                    arrayList.add(new C9301j(C9220g.this, jVar));
                }
                return arrayList;
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$f */
        /* compiled from: KClassImpl.kt */
        static final class C9227f extends C10203k implements C9102a<List<? extends C9206e<?>>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25772f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9227f(C9221a aVar) {
                super(0);
                this.f25772f = aVar;
            }

            public final List<C9206e<?>> invoke() {
                return C10539w.m35796d(this.f25772f.mo33604f(), this.f25772f.m29981j());
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$g */
        /* compiled from: KClassImpl.kt */
        static final class C9228g extends C10203k implements C9102a<Collection<? extends C9206e<?>>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25773f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9228g(C9221a aVar) {
                super(0);
                this.f25773f = aVar;
            }

            public final Collection<C9206e<?>> invoke() {
                C9220g gVar = C9220g.this;
                return gVar.mo33615a(gVar.mo33597q(), C9247i.C9251c.DECLARED);
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$h */
        /* compiled from: KClassImpl.kt */
        static final class C9229h extends C10203k implements C9102a<Collection<? extends C9206e<?>>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25774f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9229h(C9221a aVar) {
                super(0);
                this.f25774f = aVar;
            }

            public final Collection<C9206e<?>> invoke() {
                C9220g gVar = C9220g.this;
                return gVar.mo33615a(gVar.mo33598r(), C9247i.C9251c.DECLARED);
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$i */
        /* compiled from: KClassImpl.kt */
        static final class C9230i extends C10203k implements C9102a<C10342e> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25775f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9230i(C9221a aVar) {
                super(0);
                this.f25775f = aVar;
            }

            public final C10342e invoke() {
                C10342e eVar;
                C9933a a = C9220g.this.m29960s();
                C9316k a2 = C9220g.this.mo33595o().mo35358a().mo33622a();
                if (a.mo34990g()) {
                    eVar = a2.mo33676a().mo38353a(a);
                } else {
                    eVar = C10376t.m35016a(a2.mo33677b(), a);
                }
                if (eVar != null) {
                    return eVar;
                }
                C9220g.m29959b(C9220g.this);
                throw null;
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$j */
        /* compiled from: KClassImpl.kt */
        static final class C9231j extends C10203k implements C9102a<Collection<? extends C9206e<?>>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25776f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9231j(C9221a aVar) {
                super(0);
                this.f25776f = aVar;
            }

            public final Collection<C9206e<?>> invoke() {
                C9220g gVar = C9220g.this;
                return gVar.mo33615a(gVar.mo33597q(), C9247i.C9251c.INHERITED);
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$k */
        /* compiled from: KClassImpl.kt */
        static final class C9232k extends C10203k implements C9102a<Collection<? extends C9206e<?>>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25777f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9232k(C9221a aVar) {
                super(0);
                this.f25777f = aVar;
            }

            public final Collection<C9206e<?>> invoke() {
                C9220g gVar = C9220g.this;
                return gVar.mo33615a(gVar.mo33598r(), C9247i.C9251c.INHERITED);
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$l */
        /* compiled from: KClassImpl.kt */
        static final class C9233l extends C10203k implements C9102a<List<? extends C9220g<? extends Object>>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25778f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9233l(C9221a aVar) {
                super(0);
                this.f25778f = aVar;
            }

            public final List<C9220g<? extends Object>> invoke() {
                Collection a = C10101j.C10102a.m34010a(this.f25778f.mo33605g().mo33928k0(), (C10088d) null, (C9113l) null, 3, (Object) null);
                ArrayList<C10359m> arrayList = new ArrayList<>();
                for (Object next : a) {
                    if (!C9999c.m33691p((C10359m) next)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (C10359m mVar : arrayList) {
                    if (mVar != null) {
                        Class<?> a2 = C9244g0.m29996a((C10342e) mVar);
                        C9220g gVar = a2 != null ? new C9220g(a2) : null;
                        if (gVar != null) {
                            arrayList2.add(gVar);
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                }
                return arrayList2;
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$m */
        /* compiled from: KClassImpl.kt */
        static final class C9234m extends C10203k implements C9102a<T> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25779f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9234m(C9221a aVar) {
                super(0);
                this.f25779f = aVar;
            }

            public final T invoke() {
                Field field;
                C10342e g = this.f25779f.mo33605g();
                if (g.mo33763g() != C10345f.OBJECT) {
                    return null;
                }
                if (!g.mo33779v() || C9328c.f25898b.mo33690a(g)) {
                    field = C9220g.this.mo33537a().getDeclaredField("INSTANCE");
                } else {
                    field = C9220g.this.mo33537a().getEnclosingClass().getDeclaredField(g.getName().mo35021a());
                }
                T t = field.get((Object) null);
                if (t != null) {
                    return t;
                }
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$n */
        /* compiled from: KClassImpl.kt */
        static final class C9235n extends C10203k implements C9102a<String> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25780f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9235n(C9221a aVar) {
                super(0);
                this.f25780f = aVar;
            }

            public final String invoke() {
                if (C9220g.this.mo33537a().isAnonymousClass()) {
                    return null;
                }
                C9933a a = C9220g.this.m29960s();
                if (a.mo34990g()) {
                    return null;
                }
                return a.mo34983a().mo34994a();
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$o */
        /* compiled from: KClassImpl.kt */
        static final class C9236o extends C10203k implements C9102a<List<? extends C9220g<? extends T>>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25781f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9236o(C9221a aVar) {
                super(0);
                this.f25781f = aVar;
            }

            public final List<C9220g<? extends T>> invoke() {
                Collection<C10342e> E = this.f25781f.mo33605g().mo33757E();
                C10202j.m34174a((Object) E, "descriptor.sealedSubclasses");
                ArrayList arrayList = new ArrayList();
                for (C10342e eVar : E) {
                    if (eVar != null) {
                        Class<?> a = C9244g0.m29996a(eVar);
                        C9220g gVar = a != null ? new C9220g(a) : null;
                        if (gVar != null) {
                            arrayList.add(gVar);
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                }
                return arrayList;
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$p */
        /* compiled from: KClassImpl.kt */
        static final class C9237p extends C10203k implements C9102a<String> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25782f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9237p(C9221a aVar) {
                super(0);
                this.f25782f = aVar;
            }

            public final String invoke() {
                if (C9220g.this.mo33537a().isAnonymousClass()) {
                    return null;
                }
                C9933a a = C9220g.this.m29960s();
                if (a.mo34990g()) {
                    C9221a aVar = this.f25782f;
                    return aVar.m29976a((Class<?>) C9220g.this.mo33537a());
                }
                String a2 = a.mo34989f().mo35021a();
                C10202j.m34174a((Object) a2, "classId.shortClassName.asString()");
                return a2;
            }
        }

        @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "T", "", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 15})
        /* renamed from: kotlin.h0.u.e.g$a$q */
        /* compiled from: KClassImpl.kt */
        static final class C9238q extends C10203k implements C9102a<List<? extends C10166v>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25783f;

            /* renamed from: kotlin.h0.u.e.g$a$q$a */
            /* compiled from: KClassImpl.kt */
            static final class C9239a extends C10203k implements C9102a<Type> {

                /* renamed from: f */
                final /* synthetic */ C11824b0 f25784f;

                /* renamed from: g */
                final /* synthetic */ C9238q f25785g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C9239a(C11824b0 b0Var, C9238q qVar) {
                    super(0);
                    this.f25784f = b0Var;
                    this.f25785g = qVar;
                }

                public final Type invoke() {
                    C10349h b = this.f25784f.mo35227v0().mo33781b();
                    if (b instanceof C10342e) {
                        Class<?> a = C9244g0.m29996a((C10342e) b);
                        if (a == null) {
                            throw new C10174x("Unsupported superclass of " + this.f25785g.f25783f + ": " + b);
                        } else if (C10202j.m34176a((Object) C9220g.this.mo33537a().getSuperclass(), (Object) a)) {
                            Type genericSuperclass = C9220g.this.mo33537a().getGenericSuperclass();
                            C10202j.m34174a((Object) genericSuperclass, "jClass.genericSuperclass");
                            return genericSuperclass;
                        } else {
                            Class[] interfaces = C9220g.this.mo33537a().getInterfaces();
                            C10202j.m34174a((Object) interfaces, "jClass.interfaces");
                            int b2 = C10519k.m35628b((T[]) interfaces, a);
                            if (b2 >= 0) {
                                Type type = C9220g.this.mo33537a().getGenericInterfaces()[b2];
                                C10202j.m34174a((Object) type, "jClass.genericInterfaces[index]");
                                return type;
                            }
                            throw new C10174x("No superclass of " + this.f25785g.f25783f + " in Java reflection for " + b);
                        }
                    } else {
                        throw new C10174x("Supertype not a class: " + b);
                    }
                }
            }

            /* renamed from: kotlin.h0.u.e.g$a$q$b */
            /* compiled from: KClassImpl.kt */
            static final class C9240b extends C10203k implements C9102a<Class<Object>> {

                /* renamed from: f */
                public static final C9240b f25786f = new C9240b();

                C9240b() {
                    super(0);
                }

                public final Class<Object> invoke() {
                    return Object.class;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9238q(C9221a aVar) {
                super(0);
                this.f25783f = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x0090  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.util.List<kotlin.p045h0.p046u.p047e.C10166v> invoke() {
                /*
                    r6 = this;
                    kotlin.h0.u.e.g$a r0 = r6.f25783f
                    kotlin.reflect.jvm.internal.impl.descriptors.e r0 = r0.mo33605g()
                    kotlin.h0.u.e.k0.k.s0 r0 = r0.mo33766h()
                    java.lang.String r1 = "descriptor.typeConstructor"
                    kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
                    java.util.Collection r0 = r0.mo35229a()
                    java.lang.String r1 = "descriptor.typeConstructor.supertypes"
                    kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
                    java.util.ArrayList r1 = new java.util.ArrayList
                    int r2 = r0.size()
                    r1.<init>(r2)
                    java.util.Iterator r0 = r0.iterator()
                L_0x0025:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L_0x0044
                    java.lang.Object r2 = r0.next()
                    kotlin.h0.u.e.k0.k.b0 r2 = (kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r2
                    kotlin.h0.u.e.v r3 = new kotlin.h0.u.e.v
                    java.lang.String r4 = "kotlinType"
                    kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r4)
                    kotlin.h0.u.e.g$a$q$a r4 = new kotlin.h0.u.e.g$a$q$a
                    r4.<init>(r2, r6)
                    r3.<init>(r2, r4)
                    r1.add(r3)
                    goto L_0x0025
                L_0x0044:
                    kotlin.h0.u.e.g$a r0 = r6.f25783f
                    kotlin.reflect.jvm.internal.impl.descriptors.e r0 = r0.mo33605g()
                    boolean r0 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.m30192e((kotlin.reflect.jvm.internal.impl.descriptors.C10342e) r0)
                    if (r0 != 0) goto L_0x00ad
                    boolean r0 = r1.isEmpty()
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L_0x005a
                L_0x0058:
                    r2 = 1
                    goto L_0x008e
                L_0x005a:
                    java.util.Iterator r0 = r1.iterator()
                L_0x005e:
                    boolean r4 = r0.hasNext()
                    if (r4 == 0) goto L_0x0058
                    java.lang.Object r4 = r0.next()
                    kotlin.h0.u.e.v r4 = (kotlin.p045h0.p046u.p047e.C10166v) r4
                    kotlin.h0.u.e.k0.k.b0 r4 = r4.getType()
                    kotlin.reflect.jvm.internal.impl.descriptors.e r4 = kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c.m33660a((kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0) r4)
                    java.lang.String r5 = "DescriptorUtils.getClassDescriptorForType(it.type)"
                    kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r4, (java.lang.String) r5)
                    kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.mo33763g()
                    java.lang.String r5 = "DescriptorUtils.getClass…ptorForType(it.type).kind"
                    kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r4, (java.lang.String) r5)
                    kotlin.reflect.jvm.internal.impl.descriptors.f r5 = kotlin.reflect.jvm.internal.impl.descriptors.C10345f.INTERFACE
                    if (r4 == r5) goto L_0x008b
                    kotlin.reflect.jvm.internal.impl.descriptors.f r5 = kotlin.reflect.jvm.internal.impl.descriptors.C10345f.ANNOTATION_CLASS
                    if (r4 != r5) goto L_0x0089
                    goto L_0x008b
                L_0x0089:
                    r4 = 0
                    goto L_0x008c
                L_0x008b:
                    r4 = 1
                L_0x008c:
                    if (r4 != 0) goto L_0x005e
                L_0x008e:
                    if (r2 == 0) goto L_0x00ad
                    kotlin.h0.u.e.v r0 = new kotlin.h0.u.e.v
                    kotlin.h0.u.e.g$a r2 = r6.f25783f
                    kotlin.reflect.jvm.internal.impl.descriptors.e r2 = r2.mo33605g()
                    kotlin.h0.u.e.k0.a.g r2 = kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a.m33892b((kotlin.reflect.jvm.internal.impl.descriptors.C10359m) r2)
                    kotlin.h0.u.e.k0.k.j0 r2 = r2.mo33707c()
                    java.lang.String r3 = "descriptor.builtIns.anyType"
                    kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r2, (java.lang.String) r3)
                    kotlin.h0.u.e.g$a$q$b r3 = kotlin.p045h0.p046u.p047e.C9220g.C9221a.C9238q.C9240b.f25786f
                    r0.<init>(r2, r3)
                    r1.add(r0)
                L_0x00ad:
                    java.util.List r0 = kotlin.reflect.jvm.internal.impl.utils.C12141a.m40131a(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.C9220g.C9221a.C9238q.invoke():java.util.List");
            }
        }

        /* renamed from: kotlin.h0.u.e.g$a$r */
        /* compiled from: KClassImpl.kt */
        static final class C9241r extends C10203k implements C9102a<List<? extends C10171w>> {

            /* renamed from: f */
            final /* synthetic */ C9221a f25787f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9241r(C9221a aVar) {
                super(0);
                this.f25787f = aVar;
            }

            public final List<C10171w> invoke() {
                List<C10375s0> s = this.f25787f.mo33605g().mo33776s();
                C10202j.m34174a((Object) s, "descriptor.declaredTypeParameters");
                ArrayList arrayList = new ArrayList(C10531p.m35750a(s, 10));
                for (C10375s0 wVar : s) {
                    arrayList.add(new C10171w(wVar));
                }
                return arrayList;
            }
        }

        static {
            Class<C9221a> cls = C9221a.class;
            f25754p = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "annotations", "getAnnotations()Ljava/util/List;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "simpleName", "getSimpleName()Ljava/lang/String;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "constructors", "getConstructors()Ljava/util/Collection;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "typeParameters", "getTypeParameters()Ljava/util/List;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "supertypes", "getSupertypes()Ljava/util/List;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        }

        public C9221a() {
            super();
            C10176z.m34125b(new C9237p(this));
            this.f25757f = C10176z.m34125b(new C9235n(this));
            this.f25758g = C10176z.m34125b(new C9226e(this));
            C10176z.m34125b(new C9233l(this));
            this.f25759h = C10176z.m34123a(new C9234m(this));
            C10176z.m34125b(new C9241r(this));
            C10176z.m34125b(new C9238q(this));
            C10176z.m34125b(new C9236o(this));
            this.f25760i = C10176z.m34125b(new C9228g(this));
            this.f25761j = C10176z.m34125b(new C9229h(this));
            this.f25762k = C10176z.m34125b(new C9231j(this));
            this.f25763l = C10176z.m34125b(new C9232k(this));
            this.f25764m = C10176z.m34125b(new C9223b(this));
            this.f25765n = C10176z.m34125b(new C9224c(this));
            C10176z.m34125b(new C9227f(this));
            C10176z.m34125b(new C9222a(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final Collection<C9206e<?>> m29981j() {
            return (Collection) this.f25761j.mo35360a(this, f25754p[11]);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public final Collection<C9206e<?>> m29982k() {
            return (Collection) this.f25762k.mo35360a(this, f25754p[12]);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final Collection<C9206e<?>> m29983l() {
            return (Collection) this.f25763l.mo35360a(this, f25754p[13]);
        }

        /* renamed from: b */
        public final Collection<C9206e<?>> mo33600b() {
            return (Collection) this.f25764m.mo35360a(this, f25754p[14]);
        }

        /* renamed from: c */
        public final Collection<C9206e<?>> mo33601c() {
            return (Collection) this.f25765n.mo35360a(this, f25754p[15]);
        }

        /* renamed from: d */
        public final List<Annotation> mo33602d() {
            return (List) this.f25756e.mo35360a(this, f25754p[1]);
        }

        /* renamed from: e */
        public final Collection<C9157f<T>> mo33603e() {
            return (Collection) this.f25758g.mo35360a(this, f25754p[4]);
        }

        /* renamed from: f */
        public final Collection<C9206e<?>> mo33604f() {
            return (Collection) this.f25760i.mo35360a(this, f25754p[10]);
        }

        /* renamed from: g */
        public final C10342e mo33605g() {
            return (C10342e) this.f25755d.mo35360a(this, f25754p[0]);
        }

        /* renamed from: h */
        public final T mo33606h() {
            return this.f25759h.mo35360a(this, f25754p[6]);
        }

        /* renamed from: i */
        public final String mo33607i() {
            return (String) this.f25757f.mo35360a(this, f25754p[3]);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final String m29976a(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                C10202j.m34174a((Object) simpleName, "name");
                return C12131w.m40070a(simpleName, enclosingMethod.getName() + "$", (String) null, 2, (Object) null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                C10202j.m34174a((Object) simpleName, "name");
                return C12131w.m40070a(simpleName, enclosingConstructor.getName() + "$", (String) null, 2, (Object) null);
            }
            C10202j.m34174a((Object) simpleName, "name");
            return C12131w.m40068a(simpleName, '$', (String) null, 2, (Object) null);
        }
    }

    /* renamed from: a */
    public Class<T> mo33537a() {
        return this.f25753j;
    }

    /* renamed from: b */
    public Collection<C10352i0> mo33540b(C9939f fVar) {
        C10202j.m34178b(fVar, "name");
        return C10539w.m35796d(mo33597q().mo33918c(fVar, C9401d.FROM_REFLECTION), mo33598r().mo33918c(fVar, C9401d.FROM_REFLECTION));
    }

    /* renamed from: a */
    public Collection<C10382u> mo33538a(C9939f fVar) {
        C10202j.m34178b(fVar, "name");
        return C10539w.m35796d(mo33597q().mo33913a(fVar, C9401d.FROM_REFLECTION), mo33598r().mo33913a(fVar, C9401d.FROM_REFLECTION));
    }

    /* renamed from: a */
    public C10352i0 mo33539a(int i) {
        Class<?> declaringClass;
        if (!C10202j.m34176a((Object) mo33537a().getSimpleName(), (Object) "DefaultImpls") || (declaringClass = mo33537a().getDeclaringClass()) == null || !declaringClass.isInterface()) {
            C10342e p = mo33596p();
            if (!(p instanceof C11721e)) {
                p = null;
            }
            C11721e eVar = (C11721e) p;
            if (eVar == null) {
                return null;
            }
            C9775f B = eVar.mo38301B();
            C10427h.C10435g<C9775f, List<C9930z>> gVar = C9890a.f27293j;
            C10202j.m34174a((Object) gVar, "JvmProtoBuf.classLocalVariable");
            C9930z zVar = (C9930z) C9878f.m32874a(B, gVar, i);
            if (zVar != null) {
                return (C10352i0) C9244g0.m30003a(mo33537a(), zVar, eVar.mo38305r().mo38379e(), eVar.mo38305r().mo38382h(), eVar.mo38302C(), C9243c.f25789g);
            }
            return null;
        }
        C9154c<?> a = C9100a.m29805a(declaringClass);
        if (a != null) {
            return ((C9220g) a).mo33539a(i);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
    }
}
