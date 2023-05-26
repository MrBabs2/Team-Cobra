package kotlin.p045h0.p046u.p047e;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p042a0.C9064d;
import kotlin.p045h0.C9153b;
import kotlin.p045h0.C9166k;
import kotlin.p045h0.C9177p;
import kotlin.p045h0.C9178q;
import kotlin.p045h0.C9182t;
import kotlin.p045h0.p046u.C4785c;
import kotlin.p045h0.p046u.p047e.C10176z;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9666b;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p221i0.C9266d;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p263z.C10545a;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10388w;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10241a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J%\u00105\u001a\u00028\u00002\u0016\u00106\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010807\"\u0004\u0018\u000108H\u0016¢\u0006\u0002\u00109J#\u0010:\u001a\u00028\u00002\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001080;H\u0002¢\u0006\u0002\u0010<J#\u0010=\u001a\u00028\u00002\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001080;H\u0016¢\u0006\u0002\u0010<J3\u0010>\u001a\u00028\u00002\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u0001080;2\f\u0010?\u001a\b\u0012\u0002\b\u0003\u0018\u00010@H\u0000¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u0001082\u0006\u0010D\u001a\u00020EH\u0002J\n\u0010F\u001a\u0004\u0018\u00010EH\u0002R(\u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b \b*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\n0\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\r0\r0\u0005X\u0004¢\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000f \b*\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00060\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010#R\u0014\u0010$\u001a\u00020\"8DX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010#R\u0012\u0010%\u001a\u00020\"X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#R\u0014\u0010'\u001a\u00020\"8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0012R\u0014\u0010*\u001a\u00020+8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0012R\u0016\u00101\u001a\u0004\u0018\u0001028VX\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u0006G"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "()V", "_annotations", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "", "kotlin.jvm.PlatformType", "_parameters", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "_typeParameters", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "annotations", "getAnnotations", "()Ljava/util/List;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "getDefaultCaller", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "isAbstract", "", "()Z", "isAnnotationConstructor", "isBound", "isFinal", "isOpen", "parameters", "getParameters", "returnType", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "call", "args", "", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "callAnnotationConstructor", "", "(Ljava/util/Map;)Ljava/lang/Object;", "callBy", "callDefaultMethod", "continuationArgument", "Lkotlin/coroutines/Continuation;", "callDefaultMethod$kotlin_reflection", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultPrimitiveValue", "type", "Ljava/lang/reflect/Type;", "extractContinuationArgument", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.e */
/* compiled from: KCallableImpl.kt */
public abstract class C9206e<R> implements C9153b<R> {

    /* renamed from: f */
    private final C10176z.C10177a<List<Annotation>> f25737f;

    /* renamed from: g */
    private final C10176z.C10177a<ArrayList<C9166k>> f25738g;

    /* renamed from: h */
    private final C10176z.C10177a<C10166v> f25739h;

    /* renamed from: i */
    private final C10176z.C10177a<List<C10171w>> f25740i;

    /* renamed from: kotlin.h0.u.e.e$a */
    /* compiled from: KCallableImpl.kt */
    static final class C9207a extends C10203k implements C9102a<List<? extends Annotation>> {

        /* renamed from: f */
        final /* synthetic */ C9206e f25741f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9207a(C9206e eVar) {
            super(0);
            this.f25741f = eVar;
        }

        public final List<Annotation> invoke() {
            return C9244g0.m29999a((C10241a) this.f25741f.mo33587o());
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, mo16641d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "R", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.e$b */
    /* compiled from: KCallableImpl.kt */
    static final class C9208b extends C10203k implements C9102a<ArrayList<C9166k>> {

        /* renamed from: f */
        final /* synthetic */ C9206e f25742f;

        /* renamed from: kotlin.h0.u.e.e$b$a */
        /* compiled from: Comparisons.kt */
        public static final class C9209a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C10545a.m35829a(((C9166k) t).getName(), ((C9166k) t2).getName());
            }
        }

        /* renamed from: kotlin.h0.u.e.e$b$b */
        /* compiled from: KCallableImpl.kt */
        static final class C9210b extends C10203k implements C9102a<C10358l0> {

            /* renamed from: f */
            final /* synthetic */ C10358l0 f25743f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9210b(C10358l0 l0Var) {
                super(0);
                this.f25743f = l0Var;
            }

            public final C10358l0 invoke() {
                return this.f25743f;
            }
        }

        /* renamed from: kotlin.h0.u.e.e$b$c */
        /* compiled from: KCallableImpl.kt */
        static final class C9211c extends C10203k implements C9102a<C10358l0> {

            /* renamed from: f */
            final /* synthetic */ C10358l0 f25744f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9211c(C10358l0 l0Var) {
                super(0);
                this.f25744f = l0Var;
            }

            public final C10358l0 invoke() {
                return this.f25744f;
            }
        }

        /* renamed from: kotlin.h0.u.e.e$b$d */
        /* compiled from: KCallableImpl.kt */
        static final class C9212d extends C10203k implements C9102a<C10386v0> {

            /* renamed from: f */
            final /* synthetic */ C10238b f25745f;

            /* renamed from: g */
            final /* synthetic */ int f25746g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9212d(C10238b bVar, int i) {
                super(0);
                this.f25745f = bVar;
                this.f25746g = i;
            }

            public final C10386v0 invoke() {
                C10386v0 v0Var = this.f25745f.mo35407f().get(this.f25746g);
                C10202j.m34174a((Object) v0Var, "descriptor.valueParameters[i]");
                return v0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9208b(C9206e eVar) {
            super(0);
            this.f25742f = eVar;
        }

        public final ArrayList<C9166k> invoke() {
            int i;
            C10238b o = this.f25742f.mo33587o();
            ArrayList<C9166k> arrayList = new ArrayList<>();
            int i2 = 0;
            if (!this.f25742f.mo33589q()) {
                C10358l0 a = C9244g0.m30004a((C10230a) o);
                if (a != null) {
                    arrayList.add(new C10135o(this.f25742f, 0, C9166k.C9167a.INSTANCE, new C9210b(a)));
                    i = 1;
                } else {
                    i = 0;
                }
                C10358l0 b0 = o.mo35405b0();
                if (b0 != null) {
                    arrayList.add(new C10135o(this.f25742f, i, C9166k.C9167a.EXTENSION_RECEIVER, new C9211c(b0)));
                    i++;
                }
            } else {
                i = 0;
            }
            List<C10386v0> f = o.mo35407f();
            C10202j.m34174a((Object) f, "descriptor.valueParameters");
            int size = f.size();
            while (i2 < size) {
                arrayList.add(new C10135o(this.f25742f, i, C9166k.C9167a.VALUE, new C9212d(o, i2)));
                i2++;
                i++;
            }
            if (this.f25742f.mo33588p() && (o instanceof C9666b) && arrayList.size() > 1) {
                C10535s.m35756a(arrayList, new C9209a());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo16641d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "R", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.e$c */
    /* compiled from: KCallableImpl.kt */
    static final class C9213c extends C10203k implements C9102a<C10166v> {

        /* renamed from: f */
        final /* synthetic */ C9206e f25747f;

        /* renamed from: kotlin.h0.u.e.e$c$a */
        /* compiled from: KCallableImpl.kt */
        static final class C9214a extends C10203k implements C9102a<Type> {

            /* renamed from: f */
            final /* synthetic */ C9213c f25748f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9214a(C9213c cVar) {
                super(0);
                this.f25748f = cVar;
            }

            public final Type invoke() {
                Type a = this.f25748f.f25747f.mo35343r();
                return a != null ? a : this.f25748f.f25747f.mo33584f().getReturnType();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9213c(C9206e eVar) {
            super(0);
            this.f25747f = eVar;
        }

        public final C10166v invoke() {
            C11824b0 returnType = this.f25747f.mo33587o().getReturnType();
            if (returnType != null) {
                C10202j.m34174a((Object) returnType, "descriptor.returnType!!");
                return new C10166v(returnType, new C9214a(this));
            }
            C10202j.m34172a();
            throw null;
        }
    }

    /* renamed from: kotlin.h0.u.e.e$d */
    /* compiled from: KCallableImpl.kt */
    static final class C9215d extends C10203k implements C9102a<List<? extends C10171w>> {

        /* renamed from: f */
        final /* synthetic */ C9206e f25749f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9215d(C9206e eVar) {
            super(0);
            this.f25749f = eVar;
        }

        public final List<C10171w> invoke() {
            List<C10375s0> typeParameters = this.f25749f.mo33587o().getTypeParameters();
            C10202j.m34174a((Object) typeParameters, "descriptor.typeParameters");
            ArrayList arrayList = new ArrayList(C10531p.m35750a(typeParameters, 10));
            for (C10375s0 wVar : typeParameters) {
                arrayList.add(new C10171w(wVar));
            }
            return arrayList;
        }
    }

    public C9206e() {
        C10176z.C10177a<List<Annotation>> b = C10176z.m34125b(new C9207a(this));
        C10202j.m34174a((Object) b, "ReflectProperties.lazySo…or.computeAnnotations() }");
        this.f25737f = b;
        C10176z.C10177a<ArrayList<C9166k>> b2 = C10176z.m34125b(new C9208b(this));
        C10202j.m34174a((Object) b2, "ReflectProperties.lazySo…ze()\n        result\n    }");
        this.f25738g = b2;
        C10176z.C10177a<C10166v> b3 = C10176z.m34125b(new C9213c(this));
        C10202j.m34174a((Object) b3, "ReflectProperties.lazySo…eturnType\n        }\n    }");
        this.f25739h = b3;
        C10176z.C10177a<List<C10171w>> b4 = C10176z.m34125b(new C9215d(this));
        C10202j.m34174a((Object) b4, "ReflectProperties.lazySo…KTypeParameterImpl)\n    }");
        this.f25740i = b4;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final Type mo35343r() {
        Type[] lowerBounds;
        C10238b o = mo33587o();
        if (!(o instanceof C10382u)) {
            o = null;
        }
        C10382u uVar = (C10382u) o;
        if (uVar == null || !uVar.isSuspend()) {
            return null;
        }
        Object h = C10539w.m35807h(mo33584f().mo33634a());
        if (!(h instanceof ParameterizedType)) {
            h = null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) h;
        if (!C10202j.m34176a((Object) parameterizedType != null ? parameterizedType.getRawType() : null, (Object) C9064d.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C10202j.m34174a((Object) actualTypeArguments, "continuationType.actualTypeArguments");
        Object i = C10519k.m35651i(actualTypeArguments);
        if (!(i instanceof WildcardType)) {
            i = null;
        }
        WildcardType wildcardType = (WildcardType) i;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) C10519k.m35647e(lowerBounds);
    }

    public R call(Object... objArr) {
        C10202j.m34178b(objArr, "args");
        try {
            return mo33584f().call(objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    public R callBy(Map<C9166k, ? extends Object> map) {
        C10202j.m34178b(map, "args");
        return mo33588p() ? m29943a(map) : mo33583a(map, (C9064d<?>) null);
    }

    /* renamed from: f */
    public abstract C9266d<?> mo33584f();

    public List<Annotation> getAnnotations() {
        List<Annotation> a = this.f25737f.mo35358a();
        C10202j.m34174a((Object) a, "_annotations()");
        return a;
    }

    public List<C9166k> getParameters() {
        ArrayList<C9166k> a = this.f25738g.mo35358a();
        C10202j.m34174a((Object) a, "_parameters()");
        return a;
    }

    public C9177p getReturnType() {
        C10166v a = this.f25739h.mo35358a();
        C10202j.m34174a((Object) a, "_returnType()");
        return a;
    }

    public List<C9178q> getTypeParameters() {
        List<C10171w> a = this.f25740i.mo35358a();
        C10202j.m34174a((Object) a, "_typeParameters()");
        return a;
    }

    public C9182t getVisibility() {
        C10237a1 visibility = mo33587o().getVisibility();
        C10202j.m34174a((Object) visibility, "descriptor.visibility");
        return C9244g0.m30000a(visibility);
    }

    /* renamed from: i */
    public abstract C9247i mo33585i();

    public boolean isAbstract() {
        return mo33587o().mo33767i() == C10388w.f28185i;
    }

    public boolean isFinal() {
        return mo33587o().mo33767i() == C10388w.f28182f;
    }

    public boolean isOpen() {
        return mo33587o().mo33767i() == C10388w.f28184h;
    }

    /* renamed from: j */
    public abstract C9266d<?> mo33586j();

    /* renamed from: o */
    public abstract C10238b mo33587o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo33588p() {
        return C10202j.m34176a((Object) getName(), (Object) "<init>") && mo33585i().mo33537a().isAnnotation();
    }

    /* renamed from: q */
    public abstract boolean mo33589q();

    /* renamed from: a */
    public final R mo33583a(Map<C9166k, ? extends Object> map, C9064d<?> dVar) {
        C10202j.m34178b(map, "args");
        List<C9166k> parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        for (C9166k next : parameters) {
            if (i != 0 && i % 32 == 0) {
                arrayList2.add(Integer.valueOf(i2));
                i2 = 0;
            }
            if (map.containsKey(next)) {
                arrayList.add(map.get(next));
            } else if (next.mo33520h()) {
                arrayList.add(m29942a(C4785c.m7907a(next.getType())));
                i2 = (1 << (i % 32)) | i2;
                z = true;
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + next);
            }
            if (next.mo33517g() == C9166k.C9167a.VALUE) {
                i++;
            }
        }
        if (dVar != null) {
            arrayList.add(dVar);
        }
        if (!z) {
            Object[] array = arrayList.toArray(new Object[0]);
            if (array != null) {
                return call(Arrays.copyOf(array, array.length));
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        arrayList2.add(Integer.valueOf(i2));
        C9266d<?> j = mo33586j();
        if (j != null) {
            arrayList.addAll(arrayList2);
            arrayList.add((Object) null);
            try {
                Object[] array2 = arrayList.toArray(new Object[0]);
                if (array2 != null) {
                    return j.call(array2);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        } else {
            throw new C10174x("This callable does not support a default call: " + mo33587o());
        }
    }

    /* renamed from: a */
    private final R m29943a(Map<C9166k, ? extends Object> map) {
        Object obj;
        List<C9166k> parameters = getParameters();
        ArrayList arrayList = new ArrayList(C10531p.m35750a(parameters, 10));
        for (C9166k kVar : parameters) {
            if (map.containsKey(kVar)) {
                obj = map.get(kVar);
                if (obj == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kVar + ')');
                }
            } else if (kVar.mo33520h()) {
                obj = null;
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kVar);
            }
            arrayList.add(obj);
        }
        C9266d<?> j = mo33586j();
        if (j != null) {
            try {
                Object[] array = arrayList.toArray(new Object[0]);
                if (array != null) {
                    return j.call(array);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        } else {
            throw new C10174x("This callable does not support a default call: " + mo33587o());
        }
    }

    /* renamed from: a */
    private final Object m29942a(Type type) {
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (C10202j.m34176a((Object) type, (Object) Boolean.TYPE)) {
            return false;
        }
        if (C10202j.m34176a((Object) type, (Object) Character.TYPE)) {
            return Character.valueOf((char) 0);
        }
        if (C10202j.m34176a((Object) type, (Object) Byte.TYPE)) {
            return Byte.valueOf((byte) 0);
        }
        if (C10202j.m34176a((Object) type, (Object) Short.TYPE)) {
            return Short.valueOf((short) 0);
        }
        if (C10202j.m34176a((Object) type, (Object) Integer.TYPE)) {
            return 0;
        }
        if (C10202j.m34176a((Object) type, (Object) Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (C10202j.m34176a((Object) type, (Object) Long.TYPE)) {
            return 0L;
        }
        if (C10202j.m34176a((Object) type, (Object) Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (C10202j.m34176a((Object) type, (Object) Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }
}
