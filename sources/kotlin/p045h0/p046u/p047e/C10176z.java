package kotlin.p045h0.p046u.p047e;

import java.lang.ref.SoftReference;
import kotlin.p215c0.p216c.C9102a;

/* renamed from: kotlin.h0.u.e.z */
/* compiled from: ReflectProperties */
public class C10176z {

    /* renamed from: kotlin.h0.u.e.z$a */
    /* compiled from: ReflectProperties */
    public static class C10177a<T> extends C10179c<T> {

        /* renamed from: b */
        private final C9102a<T> f27826b;

        /* renamed from: c */
        private SoftReference<Object> f27827c;

        public C10177a(T t, C9102a<T> aVar) {
            if (aVar != null) {
                this.f27827c = null;
                this.f27826b = aVar;
                if (t != null) {
                    this.f27827c = new SoftReference<>(mo35359a(t));
                    return;
                }
                return;
            }
            m34126a(0);
            throw null;
        }

        /* renamed from: a */
        private static /* synthetic */ void m34126a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"}));
        }

        /* renamed from: a */
        public T mo35358a() {
            Object obj;
            SoftReference<Object> softReference = this.f27827c;
            if (softReference != null && (obj = softReference.get()) != null) {
                return mo35361b(obj);
            }
            T invoke = this.f27826b.invoke();
            this.f27827c = new SoftReference<>(mo35359a(invoke));
            return invoke;
        }
    }

    /* renamed from: kotlin.h0.u.e.z$b */
    /* compiled from: ReflectProperties */
    public static class C10178b<T> extends C10179c<T> {

        /* renamed from: b */
        private final C9102a<T> f27828b;

        /* renamed from: c */
        private Object f27829c;

        public C10178b(C9102a<T> aVar) {
            if (aVar != null) {
                this.f27829c = null;
                this.f27828b = aVar;
                return;
            }
            m34128a(0);
            throw null;
        }

        /* renamed from: a */
        private static /* synthetic */ void m34128a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"}));
        }

        /* renamed from: a */
        public T mo35358a() {
            Object obj = this.f27829c;
            if (obj != null) {
                return mo35361b(obj);
            }
            T invoke = this.f27828b.invoke();
            this.f27829c = mo35359a(invoke);
            return invoke;
        }
    }

    /* renamed from: kotlin.h0.u.e.z$c */
    /* compiled from: ReflectProperties */
    public static abstract class C10179c<T> {

        /* renamed from: a */
        private static final Object f27830a = new C10180a();

        /* renamed from: kotlin.h0.u.e.z$c$a */
        /* compiled from: ReflectProperties */
        static class C10180a {
            C10180a() {
            }
        }

        /* renamed from: a */
        public abstract T mo35358a();

        /* renamed from: a */
        public final T mo35360a(Object obj, Object obj2) {
            return mo35358a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public T mo35361b(Object obj) {
            if (obj == f27830a) {
                return null;
            }
            return obj;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo35359a(T t) {
            return t == null ? f27830a : t;
        }
    }

    /* renamed from: a */
    public static <T> C10178b<T> m34123a(C9102a<T> aVar) {
        if (aVar != null) {
            return new C10178b<>(aVar);
        }
        m34124a(0);
        throw null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m34124a(int i) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i == 1 || i == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <T> C10177a<T> m34125b(C9102a<T> aVar) {
        if (aVar != null) {
            return m34122a((Object) null, aVar);
        }
        m34124a(2);
        throw null;
    }

    /* renamed from: a */
    public static <T> C10177a<T> m34122a(T t, C9102a<T> aVar) {
        if (aVar != null) {
            return new C10177a<>(t, aVar);
        }
        m34124a(1);
        throw null;
    }
}
