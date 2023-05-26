package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9417e;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9422h;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p232o.C9498d;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9523j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9536v;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9537w;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y.C9664l;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11827c0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11838f1;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10282b;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.n */
/* compiled from: LazyJavaTypeParameterDescriptor.kt */
public final class C9490n extends C10282b {

    /* renamed from: o */
    private final C9417e f26326o = new C9417e(this.f26327p, this.f26328q);

    /* renamed from: p */
    private final C9422h f26327p;

    /* renamed from: q */
    private final C9537w f26328q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9490n(C9422h hVar, C9537w wVar, int i, C10359m mVar) {
        super(hVar.mo33896e(), mVar, wVar.getName(), C11838f1.INVARIANT, false, i, C10362n0.f28175a, hVar.mo33892a().mo33881s());
        C10202j.m34178b(hVar, "c");
        C10202j.m34178b(wVar, "javaTypeParameter");
        C10202j.m34178b(mVar, "containingDeclaration");
        this.f26327p = hVar;
        this.f26328q = wVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo33988a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "type");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public List<C11824b0> mo33989r() {
        Collection<C9523j> upperBounds = this.f26328q.getUpperBounds();
        if (upperBounds.isEmpty()) {
            C11901j0 c = this.f26327p.mo33895d().mo35561l().mo33707c();
            C10202j.m34174a((Object) c, "c.module.builtIns.anyType");
            C11901j0 u = this.f26327p.mo33895d().mo35561l().mo33725u();
            C10202j.m34174a((Object) u, "c.module.builtIns.nullableAnyType");
            return C10527n.m35729a(C11827c0.m38946a(c, u));
        }
        ArrayList arrayList = new ArrayList(C10531p.m35750a(upperBounds, 10));
        for (C9523j a : upperBounds) {
            arrayList.add(this.f26327p.mo33898g().mo34000a((C9536v) a, C9498d.m30788a(C9664l.COMMON, false, (C10375s0) this, 1, (Object) null)));
        }
        return arrayList;
    }

    public C9417e getAnnotations() {
        return this.f26326o;
    }
}
