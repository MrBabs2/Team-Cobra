package kotlin.p045h0.p046u.p047e;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10219k;
import kotlin.C10220m;
import kotlin.C4789l;
import kotlin.C9134f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10209q;
import kotlin.jvm.internal.C10210r;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9155d;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.C9177p;
import kotlin.p045h0.C9179r;
import kotlin.p045h0.p046u.C4784b;
import kotlin.p045h0.p046u.p047e.C10176z;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11821a1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p045h0.p046u.p047e.p390m0.C12029b;
import kotlin.p215c0.C9100a;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p262y.C10525m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10373r0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10241a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0013\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8VX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138VX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u00068@X\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006(²\u0006\u0010\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0002"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "computeJavaType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "arguments", "Lkotlin/reflect/KTypeProjection;", "getArguments", "arguments$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier$delegate", "isMarkedNullable", "", "()Z", "javaType", "getJavaType$kotlin_reflection", "()Ljava/lang/reflect/Type;", "javaType$delegate", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "convert", "equals", "other", "", "hashCode", "", "toString", "", "kotlin-reflection", "parameterizedTypeArguments"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.v */
/* compiled from: KTypeImpl.kt */
public final class C10166v implements C9177p {

    /* renamed from: i */
    static final /* synthetic */ C9168l[] f27809i;

    /* renamed from: f */
    private final C10176z.C10177a f27810f;

    /* renamed from: g */
    private final C10176z.C10177a f27811g = C10176z.m34125b(new C10170b(this));

    /* renamed from: h */
    private final C11824b0 f27812h;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo16641d2 = {"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.v$a */
    /* compiled from: KTypeImpl.kt */
    static final class C10167a extends C10203k implements C9102a<List<? extends C9179r>> {

        /* renamed from: f */
        final /* synthetic */ C10166v f27813f;

        /* renamed from: kotlin.h0.u.e.v$a$a */
        /* compiled from: KTypeImpl.kt */
        static final class C10168a extends C10203k implements C9102a<Type> {

            /* renamed from: f */
            final /* synthetic */ int f27814f;

            /* renamed from: g */
            final /* synthetic */ C10167a f27815g;

            /* renamed from: h */
            final /* synthetic */ C9134f f27816h;

            /* renamed from: i */
            final /* synthetic */ C9168l f27817i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10168a(int i, C10167a aVar, C9134f fVar, C9168l lVar) {
                super(0);
                this.f27814f = i;
                this.f27815g = aVar;
                this.f27816h = fVar;
                this.f27817i = lVar;
            }

            public final Type invoke() {
                Type a = this.f27815g.f27813f.mo35349a();
                if (a instanceof Class) {
                    Class cls = (Class) a;
                    Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    C10202j.m34174a((Object) componentType, "if (javaType.isArray) ja…Type else Any::class.java");
                    return componentType;
                } else if (a instanceof GenericArrayType) {
                    if (this.f27814f == 0) {
                        Type genericComponentType = ((GenericArrayType) a).getGenericComponentType();
                        C10202j.m34174a((Object) genericComponentType, "javaType.genericComponentType");
                        return genericComponentType;
                    }
                    throw new C10174x("Array type has been queried for a non-0th argument: " + this.f27815g.f27813f);
                } else if (a instanceof ParameterizedType) {
                    Type type = (Type) ((List) this.f27816h.getValue()).get(this.f27814f);
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType = (WildcardType) type;
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        C10202j.m34174a((Object) lowerBounds, "argument.lowerBounds");
                        Type type2 = (Type) C10519k.m35648f(lowerBounds);
                        if (type2 != null) {
                            type = type2;
                        } else {
                            Type[] upperBounds = wildcardType.getUpperBounds();
                            C10202j.m34174a((Object) upperBounds, "argument.upperBounds");
                            type = (Type) C10519k.m35647e(upperBounds);
                        }
                    }
                    C10202j.m34174a((Object) type, "if (argument !is Wildcar…ument.upperBounds.first()");
                    return type;
                } else {
                    throw new C10174x("Non-generic type has been queried for arguments: " + this.f27815g.f27813f);
                }
            }
        }

        /* renamed from: kotlin.h0.u.e.v$a$b */
        /* compiled from: KTypeImpl.kt */
        static final class C10169b extends C10203k implements C9102a<List<? extends Type>> {

            /* renamed from: f */
            final /* synthetic */ C10167a f27818f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10169b(C10167a aVar) {
                super(0);
                this.f27818f = aVar;
            }

            public final List<Type> invoke() {
                return C12029b.m39747a(this.f27818f.f27813f.mo35349a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10167a(C10166v vVar) {
            super(0);
            this.f27813f = vVar;
        }

        public final List<C9179r> invoke() {
            C9179r rVar;
            List<C11965u0> u0 = this.f27813f.getType().mo35226u0();
            if (u0.isEmpty()) {
                return C10529o.m35736a();
            }
            C9134f a = C10181i.m34135a(C10219k.PUBLICATION, new C10169b(this));
            C9168l lVar = C10166v.f27809i[3];
            ArrayList arrayList = new ArrayList(C10531p.m35750a(u0, 10));
            int i = 0;
            for (T next : u0) {
                int i2 = i + 1;
                if (i >= 0) {
                    C11965u0 u0Var = (C11965u0) next;
                    if (u0Var.mo38597b()) {
                        rVar = C9179r.f25695d.mo33533a();
                    } else {
                        C11824b0 type = u0Var.getType();
                        C10202j.m34174a((Object) type, "typeProjection.type");
                        C10166v vVar = new C10166v(type, new C10168a(i, this, a, lVar));
                        int i3 = C10165u.f27808a[u0Var.mo38596a().ordinal()];
                        if (i3 == 1) {
                            rVar = C9179r.f25695d.mo33536c(vVar);
                        } else if (i3 == 2) {
                            rVar = C9179r.f25695d.mo33534a(vVar);
                        } else if (i3 == 3) {
                            rVar = C9179r.f25695d.mo33535b(vVar);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    arrayList.add(rVar);
                    i = i2;
                } else {
                    C10525m.m35693c();
                    throw null;
                }
            }
            return arrayList;
        }
    }

    /* renamed from: kotlin.h0.u.e.v$b */
    /* compiled from: KTypeImpl.kt */
    static final class C10170b extends C10203k implements C9102a<C9155d> {

        /* renamed from: f */
        final /* synthetic */ C10166v f27819f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10170b(C10166v vVar) {
            super(0);
            this.f27819f = vVar;
        }

        public final C9155d invoke() {
            C10166v vVar = this.f27819f;
            return vVar.m34115a(vVar.getType());
        }
    }

    static {
        Class<C10166v> cls = C10166v.class;
        f27809i = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "javaType", "getJavaType$kotlin_reflection()Ljava/lang/reflect/Type;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "arguments", "getArguments()Ljava/util/List;")), C10216x.m34191a((C10209q) new C10210r(C10216x.m34186a((Class) cls), "parameterizedTypeArguments", "<v#0>"))};
    }

    public C10166v(C11824b0 b0Var, C9102a<? extends Type> aVar) {
        C10202j.m34178b(b0Var, "type");
        C10202j.m34178b(aVar, "computeJavaType");
        this.f27812h = b0Var;
        this.f27810f = C10176z.m34125b(aVar);
        C10176z.m34125b(new C10167a(this));
    }

    /* renamed from: a */
    public final Type mo35349a() {
        return (Type) this.f27810f.mo35360a(this, f27809i[0]);
    }

    /* renamed from: b */
    public C9155d mo33527b() {
        return (C9155d) this.f27811g.mo35360a(this, f27809i[1]);
    }

    /* renamed from: c */
    public boolean mo33528c() {
        return this.f27812h.mo34094w0();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10166v) && C10202j.m34176a((Object) this.f27812h, (Object) ((C10166v) obj).f27812h);
    }

    public List<Annotation> getAnnotations() {
        return C9244g0.m29999a((C10241a) this.f27812h);
    }

    public final C11824b0 getType() {
        return this.f27812h;
    }

    public int hashCode() {
        return this.f27812h.hashCode();
    }

    public String toString() {
        return C9197c0.f25721b.mo33561a(this.f27812h);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C9155d m34115a(C11824b0 b0Var) {
        C11824b0 type;
        C10349h b = b0Var.mo35227v0().mo33781b();
        if (b instanceof C10342e) {
            Class<?> a = C9244g0.m29996a((C10342e) b);
            if (a == null) {
                return null;
            }
            if (a.isArray()) {
                C11965u0 u0Var = (C11965u0) C10539w.m35811j(b0Var.mo35226u0());
                if (u0Var == null || (type = u0Var.getType()) == null) {
                    return new C9220g(a);
                }
                C10202j.m34174a((Object) type, "type.arguments.singleOrN…return KClassImpl(jClass)");
                C9155d a2 = m34115a(type);
                if (a2 != null) {
                    return new C9220g(C12029b.m39746a(C9100a.m29804a(C4784b.m7902a(a2))));
                }
                throw new C10174x("Cannot determine classifier for array element type: " + this);
            } else if (C11821a1.m38916g(b0Var)) {
                return new C9220g(a);
            } else {
                Class<?> d = C12029b.m39750d(a);
                if (d != null) {
                    a = d;
                }
                return new C9220g(a);
            }
        } else if (b instanceof C10375s0) {
            return new C10171w((C10375s0) b);
        } else {
            if (!(b instanceof C10373r0)) {
                return null;
            }
            throw new C10220m("An operation is not implemented: " + "Type alias classifiers are not yet supported");
        }
    }
}
