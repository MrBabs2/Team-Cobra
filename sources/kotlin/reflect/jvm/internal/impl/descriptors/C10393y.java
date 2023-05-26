package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.y */
/* compiled from: ModuleDescriptor.kt */
public interface C10393y extends C10359m {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.y$a */
    /* compiled from: ModuleDescriptor.kt */
    public static final class C10394a {
        /* renamed from: a */
        public static <R, D> R m35082a(C10393y yVar, C10364o<R, D> oVar, D d) {
            C10202j.m34178b(oVar, "visitor");
            return oVar.mo35129a(yVar, d);
        }

        /* renamed from: a */
        public static C10359m m35083a(C10393y yVar) {
            return null;
        }
    }

    /* renamed from: a */
    Collection<C9934b> mo35553a(C9934b bVar, C9113l<? super C9939f, Boolean> lVar);

    /* renamed from: a */
    C10343e0 mo35554a(C9934b bVar);

    /* renamed from: a */
    boolean mo35560a(C10393y yVar);

    /* renamed from: l */
    C9333g mo35561l();
}
