package kotlin.p045h0.p046u.p047e;

import java.util.ArrayList;
import java.util.List;
import kotlin.C10220m;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.C9177p;
import kotlin.p045h0.C9178q;
import kotlin.p045h0.p046u.p047e.C10176z;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "isReified", "", "()Z", "name", "", "getName", "()Ljava/lang/String;", "upperBounds", "", "Lkotlin/reflect/KType;", "getUpperBounds", "()Ljava/util/List;", "upperBounds$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "variance", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "equals", "other", "", "hashCode", "", "toString", "kotlin-reflection"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.w */
/* compiled from: KTypeParameterImpl.kt */
public final class C10171w implements C9178q {

    /* renamed from: h */
    static final /* synthetic */ C9168l[] f27820h = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C10171w.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: f */
    private final C10176z.C10177a f27821f = C10176z.m34125b(new C10172a(this));

    /* renamed from: g */
    private final C10375s0 f27822g;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo16641d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 15})
    /* renamed from: kotlin.h0.u.e.w$a */
    /* compiled from: KTypeParameterImpl.kt */
    static final class C10172a extends C10203k implements C9102a<List<? extends C10166v>> {

        /* renamed from: f */
        final /* synthetic */ C10171w f27823f;

        /* renamed from: kotlin.h0.u.e.w$a$a */
        /* compiled from: KTypeParameterImpl.kt */
        static final class C10173a extends C10203k implements C9102a {

            /* renamed from: f */
            final /* synthetic */ C10172a f27824f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10173a(C10172a aVar) {
                super(0);
                this.f27824f = aVar;
            }

            public final Void invoke() {
                throw new C10220m("An operation is not implemented: " + ("Java type is not yet supported for type parameters: " + this.f27824f.f27823f.mo35354a()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10172a(C10171w wVar) {
            super(0);
            this.f27823f = wVar;
        }

        public final List<C10166v> invoke() {
            List<C11824b0> upperBounds = this.f27823f.mo35354a().getUpperBounds();
            C10202j.m34174a((Object) upperBounds, "descriptor.upperBounds");
            ArrayList arrayList = new ArrayList(C10531p.m35750a(upperBounds, 10));
            for (C11824b0 b0Var : upperBounds) {
                C10202j.m34174a((Object) b0Var, "kotlinType");
                arrayList.add(new C10166v(b0Var, new C10173a(this)));
            }
            return arrayList;
        }
    }

    public C10171w(C10375s0 s0Var) {
        C10202j.m34178b(s0Var, "descriptor");
        this.f27822g = s0Var;
    }

    /* renamed from: a */
    public C10375s0 mo35354a() {
        return this.f27822g;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10171w) && C10202j.m34176a((Object) mo35354a(), (Object) ((C10171w) obj).mo35354a());
    }

    public List<C9177p> getUpperBounds() {
        return (List) this.f27821f.mo35360a(this, f27820h[0]);
    }

    public int hashCode() {
        return mo35354a().hashCode();
    }

    public String toString() {
        return C9197c0.f25721b.mo33564a(mo35354a());
    }
}
