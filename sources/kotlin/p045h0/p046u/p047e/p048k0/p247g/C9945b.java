package kotlin.p045h0.p046u.p047e.p048k0.p247g;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9935c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10349h;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10375s0;

/* renamed from: kotlin.h0.u.e.k0.g.b */
/* compiled from: ClassifierNamePolicy.kt */
public interface C9945b {

    /* renamed from: kotlin.h0.u.e.k0.g.b$a */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C9946a implements C9945b {

        /* renamed from: a */
        public static final C9946a f27450a = new C9946a();

        private C9946a() {
        }

        /* renamed from: a */
        public String mo35030a(C10349h hVar, C9949c cVar) {
            C10202j.m34178b(hVar, "classifier");
            C10202j.m34178b(cVar, "renderer");
            if (hVar instanceof C10375s0) {
                C9939f name = ((C10375s0) hVar).getName();
                C10202j.m34174a((Object) name, "classifier.name");
                return cVar.mo35033a(name, false);
            }
            C9935c e = C9999c.m33680e(hVar);
            C10202j.m34174a((Object) e, "DescriptorUtils.getFqName(classifier)");
            return cVar.mo35032a(e);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.g.b$b */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C9947b implements C9945b {

        /* renamed from: a */
        public static final C9947b f27451a = new C9947b();

        private C9947b() {
        }

        /* renamed from: a */
        public String mo35030a(C10349h hVar, C9949c cVar) {
            boolean z;
            C10202j.m34178b(hVar, "classifier");
            C10202j.m34178b(cVar, "renderer");
            if (hVar instanceof C10375s0) {
                C9939f name = ((C10375s0) hVar).getName();
                C10202j.m34174a((Object) name, "classifier.name");
                return cVar.mo35033a(name, false);
            }
            ArrayList arrayList = new ArrayList();
            C10359m mVar = hVar;
            do {
                arrayList.add(mVar.getName());
                C10359m b = mVar.mo33762b();
                z = b instanceof C10342e;
                mVar = b;
            } while (z);
            return C9991q.m33625a((List<C9939f>) C10537u.m35768d(arrayList));
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.g.b$c */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C9948c implements C9945b {

        /* renamed from: a */
        public static final C9948c f27452a = new C9948c();

        private C9948c() {
        }

        /* renamed from: a */
        public String mo35030a(C10349h hVar, C9949c cVar) {
            C10202j.m34178b(hVar, "classifier");
            C10202j.m34178b(cVar, "renderer");
            return m33318a(hVar);
        }

        /* renamed from: a */
        private final String m33318a(C10349h hVar) {
            C9939f name = hVar.getName();
            C10202j.m34174a((Object) name, "descriptor.name");
            String a = C9991q.m33627a(name);
            if (hVar instanceof C10375s0) {
                return a;
            }
            C10359m b = hVar.mo33762b();
            C10202j.m34174a((Object) b, "descriptor.containingDeclaration");
            String a2 = m33319a(b);
            if (a2 == null || !(!C10202j.m34176a((Object) a2, (Object) ""))) {
                return a;
            }
            return a2 + "." + a;
        }

        /* renamed from: a */
        private final String m33319a(C10359m mVar) {
            if (mVar instanceof C10342e) {
                return m33318a((C10349h) mVar);
            }
            if (!(mVar instanceof C10240b0)) {
                return null;
            }
            C9935c g = ((C10240b0) mVar).mo35425c().mo35003g();
            C10202j.m34174a((Object) g, "descriptor.fqName.toUnsafe()");
            return C9991q.m33626a(g);
        }
    }

    /* renamed from: a */
    String mo35030a(C10349h hVar, C9949c cVar);
}
