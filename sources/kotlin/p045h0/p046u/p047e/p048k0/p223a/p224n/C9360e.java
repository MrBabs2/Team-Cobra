package kotlin.p045h0.p046u.p047e.p048k0.p223a.p224n;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10091e;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10382u;

/* renamed from: kotlin.h0.u.e.k0.a.n.e */
/* compiled from: FunctionClassScope.kt */
public final class C9360e extends C10091e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9360e(C11817i iVar, C9352b bVar) {
        super(iVar, bVar);
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(bVar, "containingClass");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C10382u> mo33791c() {
        C10342e d = mo35311d();
        if (d != null) {
            int i = C9359d.f26046a[((C9352b) d).mo33756B().ordinal()];
            if (i == 1) {
                return C10527n.m35729a(C9361f.f26047I.mo33796a((C9352b) mo35311d(), false));
            }
            if (i != 2) {
                return C10529o.m35736a();
            }
            return C10527n.m35729a(C9361f.f26047I.mo33796a((C9352b) mo35311d(), true));
        }
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
    }
}
