package p050l.p075h.p083k;

/* renamed from: l.h.k.f */
/* compiled from: Pools */
public class C5006f<T> implements C5005e<T> {

    /* renamed from: a */
    private final Object[] f8864a;

    /* renamed from: b */
    private int f8865b;

    public C5006f(int i) {
        if (i > 0) {
            this.f8864a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: b */
    private boolean m8893b(T t) {
        for (int i = 0; i < this.f8865b; i++) {
            if (this.f8864a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public T mo17456a() {
        int i = this.f8865b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f8864a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f8865b = i - 1;
        return t;
    }

    /* renamed from: a */
    public boolean mo17457a(T t) {
        if (!m8893b(t)) {
            int i = this.f8865b;
            Object[] objArr = this.f8864a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f8865b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
