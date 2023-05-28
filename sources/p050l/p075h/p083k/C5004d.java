package p050l.p075h.p083k;

/* renamed from: l.h.k.d */
/* compiled from: Pair */
public class C5004d<F, S> {

    /* renamed from: a */
    public final F f8862a;

    /* renamed from: b */
    public final S f8863b;

    public C5004d(F f, S s) {
        this.f8862a = f;
        this.f8863b = s;
    }

    /* renamed from: a */
    public static <A, B> C5004d<A, B> m8890a(A a, B b) {
        return new C5004d<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5004d)) {
            return false;
        }
        C5004d dVar = (C5004d) obj;
        if (!C5003c.m8889a(dVar.f8862a, this.f8862a) || !C5003c.m8889a(dVar.f8863b, this.f8863b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.f8862a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f8863b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f8862a) + " " + String.valueOf(this.f8863b) + "}";
    }
}
