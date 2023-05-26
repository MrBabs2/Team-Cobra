package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11764k;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11767l;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11768m;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11777r;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11783v;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o.C9373e;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9399c;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9420g;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9928i;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10232a0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10266a;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10269c;

/* renamed from: kotlin.h0.u.e.k0.c.b.d */
/* compiled from: DeserializationComponentsForJava.kt */
public final class C9705d {

    /* renamed from: a */
    private final C11767l f26680a;

    public C9705d(C11817i iVar, C10393y yVar, C11768m mVar, C9709f fVar, C9701c cVar, C9420g gVar, C10232a0 a0Var, C11777r rVar, C9399c cVar2, C11764k kVar) {
        C10269c cVar3;
        C10266a aVar;
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(yVar, "moduleDescriptor");
        C10202j.m34178b(mVar, "configuration");
        C10202j.m34178b(fVar, "classDataFinder");
        C10202j.m34178b(cVar, "annotationAndConstantLoader");
        C10202j.m34178b(gVar, "packageFragmentProvider");
        C10202j.m34178b(a0Var, "notFoundClasses");
        C10202j.m34178b(rVar, "errorReporter");
        C10202j.m34178b(cVar2, "lookupTracker");
        C10202j.m34178b(kVar, "contractDeserializer");
        C9333g l = yVar.mo35561l();
        C9373e eVar = (C9373e) (!(l instanceof C9373e) ? null : l);
        C11767l lVar = r1;
        C11767l lVar2 = new C11767l(iVar, yVar, mVar, fVar, cVar, gVar, C11783v.C11784a.f31470a, rVar, cVar2, C9710g.f26691a, C10529o.m35736a(), a0Var, kVar, (eVar == null || (aVar = eVar.mo33822G()) == null) ? C10266a.C10267a.f27948a : aVar, (eVar == null || (cVar3 = eVar.mo33822G()) == null) ? C10269c.C10271b.f27950a : cVar3, C9928i.f27389b.mo34938a());
        this.f26680a = lVar;
    }

    /* renamed from: a */
    public final C11767l mo34282a() {
        return this.f26680a;
    }
}
