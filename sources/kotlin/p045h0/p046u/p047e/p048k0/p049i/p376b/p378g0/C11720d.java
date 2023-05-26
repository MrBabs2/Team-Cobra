package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0;

import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11718c;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11739g;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9790h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9875c;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9880h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9882j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9886k;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10238b;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10357l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10296f;

/* renamed from: kotlin.h0.u.e.k0.i.b.g0.d */
/* compiled from: DeserializedMemberDescriptor.kt */
public final class C11720d extends C10296f implements C11718c {

    /* renamed from: K */
    private C11739g.C11740a f31312K;

    /* renamed from: L */
    private final C9790h f31313L;

    /* renamed from: M */
    private final C9875c f31314M;

    /* renamed from: N */
    private final C9880h f31315N;

    /* renamed from: O */
    private final C9886k f31316O;

    /* renamed from: P */
    private final C11738f f31317P;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11720d(C10342e eVar, C10357l lVar, C10249g gVar, boolean z, C10238b.C10239a aVar, C9790h hVar, C9875c cVar, C9880h hVar2, C9886k kVar, C11738f fVar, C10362n0 n0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, lVar, gVar, z, aVar, hVar, cVar, hVar2, kVar, fVar, (i & 1024) != 0 ? null : n0Var);
    }

    /* renamed from: B */
    public C11738f mo38293B() {
        return this.f31317P;
    }

    /* renamed from: C */
    public C11739g.C11740a mo38294C() {
        return this.f31312K;
    }

    /* renamed from: I */
    public boolean mo33792I() {
        return false;
    }

    /* renamed from: N */
    public C9880h mo38295N() {
        return this.f31315N;
    }

    /* renamed from: T */
    public C9886k mo38296T() {
        return this.f31316O;
    }

    /* renamed from: U */
    public C9875c mo38297U() {
        return this.f31314M;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    /* renamed from: s0 */
    public List<C9882j> mo38299s0() {
        return C11718c.C11719a.m38555a(this);
    }

    /* renamed from: u */
    public boolean mo33778u() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11720d(C10342e eVar, C10357l lVar, C10249g gVar, boolean z, C10238b.C10239a aVar, C9790h hVar, C9875c cVar, C9880h hVar2, C9886k kVar, C11738f fVar, C10362n0 n0Var) {
        super(eVar, lVar, gVar, z, aVar, n0Var != null ? n0Var : C10362n0.f28175a);
        C9790h hVar3 = hVar;
        C9875c cVar2 = cVar;
        C9880h hVar4 = hVar2;
        C9886k kVar2 = kVar;
        C10342e eVar2 = eVar;
        C10202j.m34178b(eVar, "containingDeclaration");
        C10249g gVar2 = gVar;
        C10202j.m34178b(gVar, "annotations");
        C10202j.m34178b(aVar, "kind");
        C10202j.m34178b(hVar3, "proto");
        C10202j.m34178b(cVar2, "nameResolver");
        C10202j.m34178b(hVar4, "typeTable");
        C10202j.m34178b(kVar2, "versionRequirementTable");
        this.f31313L = hVar3;
        this.f31314M = cVar2;
        this.f31315N = hVar4;
        this.f31316O = kVar2;
        this.f31317P = fVar;
        this.f31312K = C11739g.C11740a.COMPATIBLE;
    }

    /* renamed from: y */
    public C9790h m38569y() {
        return this.f31313L;
    }

    /* renamed from: a */
    public void mo38298a(C11739g.C11740a aVar) {
        C10202j.m34178b(aVar, "<set-?>");
        this.f31312K = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11720d m38564a(C10359m mVar, C10382u uVar, C10238b.C10239a aVar, C9939f fVar, C10249g gVar, C10362n0 n0Var) {
        C10202j.m34178b(mVar, "newOwner");
        C10238b.C10239a aVar2 = aVar;
        C10202j.m34178b(aVar2, "kind");
        C10249g gVar2 = gVar;
        C10202j.m34178b(gVar2, "annotations");
        C10362n0 n0Var2 = n0Var;
        C10202j.m34178b(n0Var2, "source");
        C11720d dVar = new C11720d((C10342e) mVar, (C10357l) uVar, gVar2, this.f27991I, aVar2, m38569y(), mo38297U(), mo38295N(), mo38296T(), mo38293B(), n0Var2);
        dVar.mo38298a(mo38294C());
        return dVar;
    }
}
