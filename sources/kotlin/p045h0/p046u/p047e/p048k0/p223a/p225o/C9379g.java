package kotlin.p045h0.p046u.p047e.p048k0.p223a.p225o;

import java.io.InputStream;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11687a;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11698e;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11764k;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11767l;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11768m;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11772o;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11773p;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11777r;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11779s;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11783v;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p377f0.C11709a;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p377f0.C11712c;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.p224n.C9349a;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9399c;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9719m;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10232a0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10266a;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10268b;
import kotlin.reflect.jvm.internal.impl.descriptors.p260c1.C10269c;

/* renamed from: kotlin.h0.u.e.k0.a.o.g */
/* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
public final class C9379g extends C11687a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9379g(C11817i iVar, C9719m mVar, C10393y yVar, C10232a0 a0Var, C10266a aVar, C10269c cVar, C11768m mVar2) {
        super(iVar, mVar, yVar);
        C11817i iVar2 = iVar;
        C10393y yVar2 = yVar;
        C10232a0 a0Var2 = a0Var;
        C10202j.m34178b(iVar2, "storageManager");
        C10202j.m34178b(mVar, "finder");
        C10202j.m34178b(yVar2, "moduleDescriptor");
        C10202j.m34178b(a0Var2, "notFoundClasses");
        C10202j.m34178b(aVar, "additionalClassPartsProvider");
        C10202j.m34178b(cVar, "platformDependentDeclarationFilter");
        C10202j.m34178b(mVar2, "deserializationConfiguration");
        C11772o oVar = r5;
        C11772o oVar2 = new C11772o(this);
        C11698e eVar = r8;
        C11698e eVar2 = new C11698e(yVar2, a0Var2, C11709a.f31305m);
        C11783v.C11784a aVar2 = C11783v.C11784a.f31470a;
        C11777r rVar = C11777r.f31464a;
        C10202j.m34174a((Object) rVar, "ErrorReporter.DO_NOTHING");
        C11767l lVar = r0;
        C11817i iVar3 = iVar;
        C11767l lVar2 = new C11767l(iVar3, yVar, mVar2, oVar, eVar, this, aVar2, rVar, C9399c.C9400a.f26127a, C11779s.C11780a.f31465a, C10529o.m35741b((T[]) new C10268b[]{new C9349a(iVar2, yVar), new C9369d(iVar, yVar, (C9113l) null, 4, (DefaultConstructorMarker) null)}), a0Var, C11764k.f31425a.mo38350a(), aVar, cVar, C11709a.f31305m.mo16631e());
        mo38251a(lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11773p mo33824b(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        InputStream a = mo38252b().mo33671a(bVar);
        if (a == null) {
            return null;
        }
        return C11712c.f31307q.mo38288a(bVar, mo38254d(), mo38253c(), a, false);
    }
}
