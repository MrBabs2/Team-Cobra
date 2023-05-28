package kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p226b.p227b.C9401d;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9420g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n.C9459i;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9514a0;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9520g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y.C9653g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;

/* renamed from: kotlin.h0.u.e.k0.h.p.b */
/* compiled from: JavaDescriptorResolver.kt */
public final class C10079b {

    /* renamed from: a */
    private final C9420g f27661a;

    /* renamed from: b */
    private final C9653g f27662b;

    public C10079b(C9420g gVar, C9653g gVar2) {
        C10202j.m34178b(gVar, "packageFragmentProvider");
        C10202j.m34178b(gVar2, "javaResolverCache");
        this.f27661a = gVar;
        this.f27662b = gVar2;
    }

    /* renamed from: a */
    public final C9420g mo35279a() {
        return this.f27661a;
    }

    /* renamed from: a */
    public final C10342e mo35280a(C9520g gVar) {
        C10202j.m34178b(gVar, "javaClass");
        C9934b c = gVar.mo34036c();
        if (c != null && gVar.mo34032B() == C9514a0.SOURCE) {
            return this.f27662b.mo34207a(c);
        }
        C9520g g = gVar.mo34037g();
        C10359m mVar = null;
        if (g != null) {
            C10342e a = mo35280a(g);
            C10096h k0 = a != null ? a.mo33928k0() : null;
            C10359m b = k0 != null ? k0.mo33917b(gVar.getName(), C9401d.FROM_JAVA_LOADER) : null;
            if (b instanceof C10342e) {
                mVar = b;
            }
            return (C10342e) mVar;
        } else if (c == null) {
            return null;
        } else {
            C9420g gVar2 = this.f27661a;
            C9934b c2 = c.mo34998c();
            C10202j.m34174a((Object) c2, "fqName.parent()");
            C9459i iVar = (C9459i) C10539w.m35803f(gVar2.mo33891a(c2));
            if (iVar != null) {
                return iVar.mo33953a(gVar);
            }
            return null;
        }
    }
}
