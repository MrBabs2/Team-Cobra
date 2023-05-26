package kotlin.p045h0.p046u.p047e.p222j0;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p233b0.C9508a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p233b0.C9509b;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9525l;
import kotlin.p045h0.p046u.p047e.p390m0.C12053n;
import kotlin.reflect.jvm.internal.impl.descriptors.C10365o0;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeSourceElementFactory;", "Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElementFactory;", "()V", "source", "Lkotlin/reflect/jvm/internal/impl/load/java/sources/JavaSourceElement;", "javaElement", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaElement;", "RuntimeSourceElement", "descriptors.runtime"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.j0.l */
/* compiled from: RuntimeSourceElementFactory.kt */
public final class C9318l implements C9509b {

    /* renamed from: a */
    public static final C9318l f25886a = new C9318l();

    /* renamed from: kotlin.h0.u.e.j0.l$a */
    /* compiled from: RuntimeSourceElementFactory.kt */
    public static final class C9319a implements C9508a {

        /* renamed from: b */
        private final C12053n f25887b;

        public C9319a(C12053n nVar) {
            C10202j.m34178b(nVar, "javaElement");
            this.f25887b = nVar;
        }

        /* renamed from: a */
        public C10365o0 mo33654a() {
            C10365o0 o0Var = C10365o0.f28176a;
            C10202j.m34174a((Object) o0Var, "SourceFile.NO_SOURCE_FILE");
            return o0Var;
        }

        public String toString() {
            return C9319a.class.getName() + ": " + mo33681b().toString();
        }

        /* renamed from: b */
        public C12053n m30135b() {
            return this.f25887b;
        }
    }

    private C9318l() {
    }

    /* renamed from: a */
    public C9508a mo33680a(C9525l lVar) {
        C10202j.m34178b(lVar, "javaElement");
        return new C9319a((C12053n) lVar);
    }
}
