package kotlin.p045h0.p046u.p047e.p048k0.p380k;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p247g.C9949c;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11910i;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.p383j1.C11911j;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10246e;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.k.j0 */
/* compiled from: KotlinType.kt */
public abstract class C11901j0 extends C11834e1 implements C11910i, C11911j {
    public C11901j0() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public abstract C11901j0 mo34006a(C10249g gVar);

    /* renamed from: a */
    public abstract C11901j0 mo34007a(boolean z);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (C10243c a : getAnnotations()) {
            StringBuilder unused = C12127s.m40032a(sb, "[", C9949c.m33321a(C9949c.f27454b, a, (C10246e) null, 2, (Object) null), "] ");
        }
        sb.append(mo35227v0());
        if (!mo35226u0().isEmpty()) {
            Appendable unused2 = C10539w.m35771a(mo35226u0(), sb, ", ", "<", ">", 0, (CharSequence) null, (C9113l) null, 112, (Object) null);
        }
        if (mo34094w0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
