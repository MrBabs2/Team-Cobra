package kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m;

import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;

/* renamed from: kotlin.h0.u.e.k0.h.m.k */
/* compiled from: constantValues.kt */
public abstract class C10043k extends C10037g<C10483v> {

    /* renamed from: b */
    public static final C10044a f27631b = new C10044a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.h0.u.e.k0.h.m.k$a */
    /* compiled from: constantValues.kt */
    public static final class C10044a {
        private C10044a() {
        }

        /* renamed from: a */
        public final C10043k mo35252a(String str) {
            C10202j.m34178b(str, "message");
            return new C10045b(str);
        }

        public /* synthetic */ C10044a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.h.m.k$b */
    /* compiled from: constantValues.kt */
    public static final class C10045b extends C10043k {

        /* renamed from: c */
        private final String f27632c;

        public C10045b(String str) {
            C10202j.m34178b(str, "message");
            this.f27632c = str;
        }

        public String toString() {
            return this.f27632c;
        }

        /* renamed from: a */
        public C11901j0 m33834a(C10393y yVar) {
            C10202j.m34178b(yVar, "module");
            C11901j0 c = C11958u.m39559c(this.f27632c);
            C10202j.m34174a((Object) c, "ErrorUtils.createErrorType(message)");
            return c;
        }
    }

    public C10043k() {
        super(C10483v.f28357a);
    }

    /* renamed from: a */
    public C10483v m33831a() {
        throw new UnsupportedOperationException();
    }
}
