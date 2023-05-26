package p050l.p075h.p083k;

/* renamed from: l.h.k.g */
/* compiled from: Pools */
public class C5007g<T> extends C5006f<T> {

    /* renamed from: c */
    private final Object f8866c = new Object();

    public C5007g(int i) {
        super(i);
    }

    /* renamed from: a */
    public T mo17456a() {
        T a;
        synchronized (this.f8866c) {
            a = super.mo17456a();
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo17457a(T t) {
        boolean a;
        synchronized (this.f8866c) {
            a = super.mo17457a(t);
        }
        return a;
    }
}
