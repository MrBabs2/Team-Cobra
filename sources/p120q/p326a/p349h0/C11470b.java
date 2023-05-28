package p120q.p326a.p349h0;

import java.util.concurrent.TimeUnit;
import p120q.p326a.p329d0.p331b.C10910b;

/* renamed from: q.a.h0.b */
/* compiled from: Timed */
public final class C11470b<T> {

    /* renamed from: a */
    final T f30689a;

    /* renamed from: b */
    final long f30690b;

    /* renamed from: c */
    final TimeUnit f30691c;

    public C11470b(T t, long j, TimeUnit timeUnit) {
        this.f30689a = t;
        this.f30690b = j;
        C10910b.m36861a(timeUnit, "unit is null");
        this.f30691c = timeUnit;
    }

    /* renamed from: a */
    public long mo37226a() {
        return this.f30690b;
    }

    /* renamed from: b */
    public T mo37227b() {
        return this.f30689a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11470b)) {
            return false;
        }
        C11470b bVar = (C11470b) obj;
        if (!C10910b.m36863a((Object) this.f30689a, (Object) bVar.f30689a) || this.f30690b != bVar.f30690b || !C10910b.m36863a((Object) this.f30691c, (Object) bVar.f30691c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.f30689a;
        int hashCode = t != null ? t.hashCode() : 0;
        long j = this.f30690b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.f30691c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f30690b + ", unit=" + this.f30691c + ", value=" + this.f30689a + "]";
    }
}
