package kotlin.p045h0.p046u.p047e.p389l0;

/* renamed from: kotlin.h0.u.e.l0.b */
/* compiled from: HashPMap */
public final class C12023b<K, V> {

    /* renamed from: c */
    private static final C12023b<Object, Object> f31769c = new C12023b<>(C12025d.m39738a(), 0);

    /* renamed from: a */
    private final C12025d<C12021a<C12026e<K, V>>> f31770a;

    /* renamed from: b */
    private final int f31771b;

    private C12023b(C12025d<C12021a<C12026e<K, V>>> dVar, int i) {
        this.f31770a = dVar;
        this.f31771b = i;
    }

    /* renamed from: a */
    public static <K, V> C12023b<K, V> m39728a() {
        C12023b<Object, Object> bVar = f31769c;
        if (bVar != null) {
            return bVar;
        }
        m39729a(0);
        throw null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m39729a(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i != 1) {
            objArr[1] = "empty";
        } else {
            objArr[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    /* renamed from: b */
    private C12021a<C12026e<K, V>> m39730b(int i) {
        C12021a<C12026e<K, V>> a = this.f31770a.mo38655a(i);
        return a == null ? C12021a.m39721a() : a;
    }

    /* renamed from: a */
    public V mo38651a(Object obj) {
        C12021a<E> b = m39730b(obj.hashCode());
        while (b != null && b.size() > 0) {
            C12026e eVar = (C12026e) b.f31765f;
            if (eVar.f31780f.equals(obj)) {
                return eVar.f31781g;
            }
            b = b.f31766g;
        }
        return null;
    }

    /* renamed from: a */
    public C12023b<K, V> mo38652a(K k, V v) {
        C12021a b = m39730b(k.hashCode());
        int size = b.size();
        int a = m39727a(b, (Object) k);
        if (a != -1) {
            b = b.mo38645h(a);
        }
        C12021a a2 = b.mo38643a(new C12026e(k, v));
        return new C12023b<>(this.f31770a.mo38656a(k.hashCode(), a2), (this.f31771b - size) + a2.size());
    }

    /* renamed from: a */
    private static <K, V> int m39727a(C12021a<C12026e<K, V>> aVar, Object obj) {
        int i = 0;
        C12021a<E> aVar2 = aVar;
        while (aVar2 != null && aVar2.size() > 0) {
            if (((C12026e) aVar2.f31765f).f31780f.equals(obj)) {
                return i;
            }
            i++;
            aVar2 = aVar2.f31766g;
        }
        return -1;
    }
}
