package kotlin.reflect.jvm.internal.impl.descriptors.p260c1;

import java.util.Collection;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10273d;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c1.a */
/* compiled from: AdditionalClassPartsProvider.kt */
public interface C10266a {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c1.a$a */
    /* compiled from: AdditionalClassPartsProvider.kt */
    public static final class C10267a implements C10266a {

        /* renamed from: a */
        public static final C10267a f27948a = new C10267a();

        private C10267a() {
        }

        /* renamed from: a */
        public Collection<C10360m0> mo33825a(C9939f fVar, C10342e eVar) {
            C10202j.m34178b(fVar, "name");
            C10202j.m34178b(eVar, "classDescriptor");
            return C10529o.m35736a();
        }

        /* renamed from: b */
        public Collection<C11824b0> mo33828b(C10342e eVar) {
            C10202j.m34178b(eVar, "classDescriptor");
            return C10529o.m35736a();
        }

        /* renamed from: c */
        public Collection<C9939f> mo33829c(C10342e eVar) {
            C10202j.m34178b(eVar, "classDescriptor");
            return C10529o.m35736a();
        }

        /* renamed from: a */
        public Collection<C10273d> mo33826a(C10342e eVar) {
            C10202j.m34178b(eVar, "classDescriptor");
            return C10529o.m35736a();
        }
    }

    /* renamed from: a */
    Collection<C10360m0> mo33825a(C9939f fVar, C10342e eVar);

    /* renamed from: a */
    Collection<C10273d> mo33826a(C10342e eVar);

    /* renamed from: b */
    Collection<C11824b0> mo33828b(C10342e eVar);

    /* renamed from: c */
    Collection<C9939f> mo33829c(C10342e eVar);
}
