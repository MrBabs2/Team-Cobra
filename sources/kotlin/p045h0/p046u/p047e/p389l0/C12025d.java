package kotlin.p045h0.p046u.p047e.p389l0;

/* renamed from: kotlin.h0.u.e.l0.d */
/* compiled from: IntTreePMap */
final class C12025d<V> {

    /* renamed from: b */
    private static final C12025d<Object> f31778b = new C12025d<>(C12024c.f31772f);

    /* renamed from: a */
    private final C12024c<V> f31779a;

    private C12025d(C12024c<V> cVar) {
        this.f31779a = cVar;
    }

    /* renamed from: a */
    public static <V> C12025d<V> m39738a() {
        return f31778b;
    }

    /* renamed from: a */
    private C12025d<V> m39739a(C12024c<V> cVar) {
        if (cVar == this.f31779a) {
            return this;
        }
        return new C12025d<>(cVar);
    }

    /* renamed from: a */
    public V mo38655a(int i) {
        return this.f31779a.mo38653a((long) i);
    }

    /* renamed from: a */
    public C12025d<V> mo38656a(int i, V v) {
        return m39739a(this.f31779a.mo38654a((long) i, v));
    }
}
