package kotlin.p045h0.p046u.p047e;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9166k;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.C9177p;
import kotlin.p045h0.p046u.p047e.C10176z;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10230a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10346f0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10358l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10386v0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10241a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0013\u0010)\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\"H\u0016R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\"8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020&8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006."}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "callable", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "index", "", "kind", "Lkotlin/reflect/KParameter$Kind;", "computeDescriptor", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getCallable", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "descriptor", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor$delegate", "getIndex", "()I", "isOptional", "", "()Z", "isVararg", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "name", "", "getName", "()Ljava/lang/String;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "equals", "other", "", "hashCode", "toString", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.o */
/* compiled from: KParameterImpl.kt */
public final class C10135o implements C9166k {

    /* renamed from: k */
    static final /* synthetic */ C9168l[] f27762k;

    /* renamed from: f */
    private final C10176z.C10177a f27763f;

    /* renamed from: g */
    private final C10176z.C10177a f27764g = C10176z.m34125b(new C10136a(this));

    /* renamed from: h */
    private final C9206e<?> f27765h;

    /* renamed from: i */
    private final int f27766i;

    /* renamed from: j */
    private final C9166k.C9167a f27767j;

    /* renamed from: kotlin.h0.u.e.o$a */
    /* compiled from: KParameterImpl.kt */
    static final class C10136a extends C10203k implements C9102a<List<? extends Annotation>> {

        /* renamed from: f */
        final /* synthetic */ C10135o f27768f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10136a(C10135o oVar) {
            super(0);
            this.f27768f = oVar;
        }

        public final List<Annotation> invoke() {
            return C9244g0.m29999a((C10241a) this.f27768f.m34070d());
        }
    }

    /* renamed from: kotlin.h0.u.e.o$b */
    /* compiled from: KParameterImpl.kt */
    static final class C10137b extends C10203k implements C9102a<Type> {

        /* renamed from: f */
        final /* synthetic */ C10135o f27769f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10137b(C10135o oVar) {
            super(0);
            this.f27769f = oVar;
        }

        public final Type invoke() {
            C10346f0 a = this.f27769f.m34070d();
            if (!(a instanceof C10358l0) || !C10202j.m34176a((Object) C9244g0.m30004a((C10230a) this.f27769f.mo35335a().mo33587o()), (Object) a) || this.f27769f.mo35335a().mo33587o().mo35423g() != C10238b.C10239a.FAKE_OVERRIDE) {
                return this.f27769f.mo35335a().mo33584f().mo33634a().get(this.f27769f.mo33516e());
            }
            C10359m b = this.f27769f.mo35335a().mo33587o().mo33762b();
            if (b != null) {
                Class<?> a2 = C9244g0.m29996a((C10342e) b);
                if (a2 != null) {
                    return a2;
                }
                throw new C10174x("Cannot determine receiver Java type of inherited declaration: " + a);
            }
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
    }

    static {
        Class<C10135o> cls = C10135o.class;
        f27762k = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C10135o(C9206e<?> eVar, int i, C9166k.C9167a aVar, C9102a<? extends C10346f0> aVar2) {
        C10202j.m34178b(eVar, "callable");
        C10202j.m34178b(aVar, "kind");
        C10202j.m34178b(aVar2, "computeDescriptor");
        this.f27765h = eVar;
        this.f27766i = i;
        this.f27767j = aVar;
        this.f27763f = C10176z.m34125b(aVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C10346f0 m34070d() {
        return (C10346f0) this.f27763f.mo35360a(this, f27762k[0]);
    }

    /* renamed from: e */
    public int mo33516e() {
        return this.f27766i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10135o) {
            C10135o oVar = (C10135o) obj;
            return C10202j.m34176a((Object) this.f27765h, (Object) oVar.f27765h) && C10202j.m34176a((Object) m34070d(), (Object) oVar.m34070d());
        }
    }

    /* renamed from: g */
    public C9166k.C9167a mo33517g() {
        return this.f27767j;
    }

    public List<Annotation> getAnnotations() {
        return (List) this.f27764g.mo35360a(this, f27762k[1]);
    }

    public String getName() {
        C10346f0 d = m34070d();
        if (!(d instanceof C10386v0)) {
            d = null;
        }
        C10386v0 v0Var = (C10386v0) d;
        if (v0Var == null || v0Var.mo33762b().mo34221A()) {
            return null;
        }
        C9939f name = v0Var.getName();
        C10202j.m34174a((Object) name, "valueParameter.name");
        if (name.mo35024e()) {
            return null;
        }
        return name.mo35021a();
    }

    public C9177p getType() {
        C11824b0 type = m34070d().getType();
        C10202j.m34174a((Object) type, "descriptor.type");
        return new C10166v(type, new C10137b(this));
    }

    /* renamed from: h */
    public boolean mo33520h() {
        C10346f0 d = m34070d();
        if (!(d instanceof C10386v0)) {
            d = null;
        }
        C10386v0 v0Var = (C10386v0) d;
        if (v0Var != null) {
            return C10071a.m33891a(v0Var);
        }
        return false;
    }

    public int hashCode() {
        return (this.f27765h.hashCode() * 31) + m34070d().hashCode();
    }

    public String toString() {
        return C9197c0.f25721b.mo33562a(this);
    }

    /* renamed from: a */
    public final C9206e<?> mo35335a() {
        return this.f27765h;
    }
}
