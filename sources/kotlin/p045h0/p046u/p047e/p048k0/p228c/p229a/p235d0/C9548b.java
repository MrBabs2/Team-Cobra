package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0;

import java.util.Iterator;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.c.a.d0.b */
/* compiled from: typeEnhancement.kt */
final class C9548b implements C10249g {

    /* renamed from: f */
    private final C9934b f26391f;

    public C9548b(C9934b bVar) {
        C10202j.m34178b(bVar, "fqNameToMatch");
        this.f26391f = bVar;
    }

    /* renamed from: b */
    public boolean mo33886b(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return C10249g.C10252b.m34290b(this, bVar);
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<C10243c> iterator() {
        return C10529o.m35736a().iterator();
    }

    /* renamed from: a */
    public C9547a m30883a(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        if (C10202j.m34176a((Object) bVar, (Object) this.f26391f)) {
            return C9547a.f26390a;
        }
        return null;
    }
}
