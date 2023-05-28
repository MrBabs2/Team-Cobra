package kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m;

import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10376t;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;

/* renamed from: kotlin.h0.u.e.k0.h.m.j */
/* compiled from: constantValues.kt */
public final class C10042j extends C10037g<C10221n<? extends C9933a, ? extends C9939f>> {

    /* renamed from: b */
    private final C9933a f27629b;

    /* renamed from: c */
    private final C9939f f27630c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10042j(C9933a aVar, C9939f fVar) {
        super(C10481t.m35502a(aVar, fVar));
        C10202j.m34178b(aVar, "enumClassId");
        C10202j.m34178b(fVar, "enumEntryName");
        this.f27629b = aVar;
        this.f27630c = fVar;
    }

    /* renamed from: a */
    public C11824b0 mo35235a(C10393y yVar) {
        C11901j0 o;
        C10202j.m34178b(yVar, "module");
        C10342e a = C10376t.m35016a(yVar, this.f27629b);
        if (a != null) {
            if (!C9999c.m33690o(a)) {
                a = null;
            }
            if (!(a == null || (o = a.mo35445o()) == null)) {
                return o;
            }
        }
        C11901j0 c = C11958u.m39559c("Containing class for error-class based enum entry " + this.f27629b + '.' + this.f27630c);
        C10202j.m34174a((Object) c, "ErrorUtils.createErrorTy…mClassId.$enumEntryName\")");
        return c;
    }

    /* renamed from: b */
    public final C9939f mo35251b() {
        return this.f27630c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27629b.mo34989f());
        sb.append('.');
        sb.append(this.f27630c);
        return sb.toString();
    }
}
