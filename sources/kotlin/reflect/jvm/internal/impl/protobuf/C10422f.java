package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;
import okhttp3.internal.http2.Settings;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.f */
/* compiled from: ExtensionRegistryLite */
public class C10422f {

    /* renamed from: b */
    private static final C10422f f28236b = new C10422f(true);

    /* renamed from: a */
    private final Map<C10423a, C10427h.C10435g<?, ?>> f28237a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.f$a */
    /* compiled from: ExtensionRegistryLite */
    private static final class C10423a {

        /* renamed from: a */
        private final Object f28238a;

        /* renamed from: b */
        private final int f28239b;

        C10423a(Object obj, int i) {
            this.f28238a = obj;
            this.f28239b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C10423a)) {
                return false;
            }
            C10423a aVar = (C10423a) obj;
            if (this.f28238a == aVar.f28238a && this.f28239b == aVar.f28239b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f28238a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f28239b;
        }
    }

    C10422f() {
        this.f28237a = new HashMap();
    }

    /* renamed from: a */
    public static C10422f m35296a() {
        return f28236b;
    }

    /* renamed from: b */
    public static C10422f m35297b() {
        return new C10422f();
    }

    /* renamed from: a */
    public <ContainingType extends C10449o> C10427h.C10435g<ContainingType, ?> mo35737a(ContainingType containingtype, int i) {
        return this.f28237a.get(new C10423a(containingtype, i));
    }

    private C10422f(boolean z) {
        this.f28237a = Collections.emptyMap();
    }

    /* renamed from: a */
    public final void mo35738a(C10427h.C10435g<?, ?> gVar) {
        this.f28237a.put(new C10423a(gVar.mo35777a(), gVar.mo35780c()), gVar);
    }
}
