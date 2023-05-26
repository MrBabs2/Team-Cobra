package p050l.p067f.p071b;

/* renamed from: l.f.b.g */
/* compiled from: Pools */
class C4894g<T> implements C4893f<T> {

    /* renamed from: a */
    private final Object[] f8469a;

    /* renamed from: b */
    private int f8470b;

    C4894g(int i) {
        if (i > 0) {
            this.f8469a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public T mo17122a() {
        int i = this.f8470b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f8469a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f8470b = i - 1;
        return t;
    }

    /* renamed from: a */
    public boolean mo17124a(T t) {
        int i = this.f8470b;
        Object[] objArr = this.f8469a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f8470b = i + 1;
        return true;
    }

    /* renamed from: a */
    public void mo17123a(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f8470b;
            Object[] objArr = this.f8469a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f8470b = i3 + 1;
            }
        }
    }
}
