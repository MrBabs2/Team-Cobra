package kotlin.reflect.jvm.internal.impl.descriptors;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n0 */
/* compiled from: SourceElement */
public interface C10362n0 {

    /* renamed from: a */
    public static final C10362n0 f28175a = new C10363a();

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n0$a */
    /* compiled from: SourceElement */
    static class C10363a implements C10362n0 {
        C10363a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m34987a(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"}));
        }

        /* renamed from: a */
        public C10365o0 mo33654a() {
            C10365o0 o0Var = C10365o0.f28176a;
            if (o0Var != null) {
                return o0Var;
            }
            m34987a(0);
            throw null;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    /* renamed from: a */
    C10365o0 mo33654a();
}
