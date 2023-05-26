package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.q0 */
/* compiled from: SupertypeLoopChecker.kt */
public interface C10370q0 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.q0$a */
    /* compiled from: SupertypeLoopChecker.kt */
    public static final class C10371a implements C10370q0 {

        /* renamed from: a */
        public static final C10371a f28177a = new C10371a();

        private C10371a() {
        }

        /* renamed from: a */
        public Collection<C11824b0> mo35605a(C11953s0 s0Var, Collection<? extends C11824b0> collection, C9113l<? super C11953s0, ? extends Iterable<? extends C11824b0>> lVar, C9113l<? super C11824b0, C10483v> lVar2) {
            C10202j.m34178b(s0Var, "currentTypeConstructor");
            C10202j.m34178b(collection, "superTypes");
            C10202j.m34178b(lVar, "neighbors");
            C10202j.m34178b(lVar2, "reportLoop");
            return collection;
        }
    }

    /* renamed from: a */
    Collection<C11824b0> mo35605a(C11953s0 s0Var, Collection<? extends C11824b0> collection, C9113l<? super C11953s0, ? extends Iterable<? extends C11824b0>> lVar, C9113l<? super C11824b0, C10483v> lVar2);
}
