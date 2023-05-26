package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c */
/* compiled from: typeParameterUtils.kt */
final class C10264c implements C10375s0 {

    /* renamed from: f */
    private final C10375s0 f27945f;

    /* renamed from: g */
    private final C10359m f27946g;

    /* renamed from: h */
    private final int f27947h;

    public C10264c(C10375s0 s0Var, C10359m mVar, int i) {
        C10202j.m34178b(s0Var, "originalDescriptor");
        C10202j.m34178b(mVar, "declarationDescriptor");
        this.f27945f = s0Var;
        this.f27946g = mVar;
        this.f27947h = i;
    }

    /* renamed from: G */
    public C11838f1 mo35439G() {
        return this.f27945f.mo35439G();
    }

    /* renamed from: a */
    public <R, D> R mo35440a(C10364o<R, D> oVar, D d) {
        return this.f27945f.mo35440a(oVar, d);
    }

    /* renamed from: b */
    public C10359m mo33762b() {
        return this.f27946g;
    }

    /* renamed from: d0 */
    public boolean mo35441d0() {
        return true;
    }

    /* renamed from: e */
    public int mo35442e() {
        return this.f27947h + this.f27945f.mo35442e();
    }

    public C10249g getAnnotations() {
        return this.f27945f.getAnnotations();
    }

    public C9939f getName() {
        return this.f27945f.getName();
    }

    public List<C11824b0> getUpperBounds() {
        return this.f27945f.getUpperBounds();
    }

    /* renamed from: h */
    public C11953s0 mo33766h() {
        return this.f27945f.mo33766h();
    }

    /* renamed from: o */
    public C11901j0 mo35445o() {
        return this.f27945f.mo35445o();
    }

    /* renamed from: p */
    public C10362n0 mo33773p() {
        return this.f27945f.mo33773p();
    }

    public String toString() {
        return this.f27945f + "[inner-copy]";
    }

    /* renamed from: z */
    public boolean mo35447z() {
        return this.f27945f.mo35447z();
    }

    /* renamed from: a */
    public C10375s0 m34309a() {
        C10375s0 a = this.f27945f.mo35404a();
        C10202j.m34174a((Object) a, "originalDescriptor.original");
        return a;
    }
}
