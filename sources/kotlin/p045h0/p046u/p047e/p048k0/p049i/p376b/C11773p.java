package kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11742h;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10338x;

/* renamed from: kotlin.h0.u.e.k0.i.b.p */
/* compiled from: DeserializedPackageFragment.kt */
public abstract class C11773p extends C10338x {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11773p(C9934b bVar, C11817i iVar, C10393y yVar) {
        super(yVar, bVar);
        C10202j.m34178b(bVar, "fqName");
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(yVar, "module");
    }

    /* renamed from: a */
    public abstract void mo38384a(C11767l lVar);

    /* renamed from: a */
    public boolean mo38385a(C9939f fVar) {
        C10202j.m34178b(fVar, "name");
        C10096h m = mo33834m();
        return (m instanceof C11742h) && ((C11742h) m).mo38322d().contains(fVar);
    }

    /* renamed from: r */
    public abstract C11759i mo38386r();
}
