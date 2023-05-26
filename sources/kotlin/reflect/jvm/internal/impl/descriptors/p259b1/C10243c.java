package kotlin.reflect.jvm.internal.impl.descriptors.p259b1;

import java.util.Map;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.c */
/* compiled from: AnnotationDescriptor.kt */
public interface C10243c {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.c$a */
    /* compiled from: AnnotationDescriptor.kt */
    public static final class C10244a {
        /* renamed from: a */
        public static C9934b m34273a(C10243c cVar) {
            C10342e b = C10071a.m33893b(cVar);
            if (b == null) {
                return null;
            }
            if (C11958u.m39553a((C10359m) b)) {
                b = null;
            }
            if (b != null) {
                return C10071a.m33885a((C10359m) b);
            }
            return null;
        }
    }

    /* renamed from: a */
    Map<C9939f, C10037g<?>> mo33921a();

    /* renamed from: c */
    C9934b mo33922c();

    C11824b0 getType();

    /* renamed from: p */
    C10362n0 mo33925p();
}
