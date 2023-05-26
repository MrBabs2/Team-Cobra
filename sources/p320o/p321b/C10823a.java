package p320o.p321b;

import javax.inject.Provider;

/* renamed from: o.b.a */
/* compiled from: DoubleCheck */
public final class C10823a<T> implements Provider<T> {

    /* renamed from: c */
    private static final Object f28900c = new Object();

    /* renamed from: a */
    private volatile Provider<T> f28901a;

    /* renamed from: b */
    private volatile Object f28902b = f28900c;

    private C10823a(Provider<T> provider) {
        this.f28901a = provider;
    }

    /* renamed from: a */
    public static Object m36715a(Object obj, Object obj2) {
        if (!(obj != f28900c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f28902b;
        if (t == f28900c) {
            synchronized (this) {
                t = this.f28902b;
                if (t == f28900c) {
                    t = this.f28901a.get();
                    m36715a(this.f28902b, t);
                    this.f28902b = t;
                    this.f28901a = null;
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> Provider<T> m36716a(P p) {
        C10825c.m36717a(p);
        if (p instanceof C10823a) {
            return p;
        }
        return new C10823a(p);
    }
}
