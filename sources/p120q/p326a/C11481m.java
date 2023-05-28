package p120q.p326a;

import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p345j.C11439m;

/* renamed from: q.a.m */
/* compiled from: Notification */
public final class C11481m<T> {

    /* renamed from: b */
    static final C11481m<Object> f30713b = new C11481m<>((Object) null);

    /* renamed from: a */
    final Object f30714a;

    private C11481m(Object obj) {
        this.f30714a = obj;
    }

    /* renamed from: f */
    public static <T> C11481m<T> m37581f() {
        return f30713b;
    }

    /* renamed from: a */
    public Throwable mo37246a() {
        Object obj = this.f30714a;
        if (C11439m.m37482d(obj)) {
            return C11439m.m37477a(obj);
        }
        return null;
    }

    /* renamed from: b */
    public T mo37247b() {
        Object obj = this.f30714a;
        if (obj == null || C11439m.m37482d(obj)) {
            return null;
        }
        return this.f30714a;
    }

    /* renamed from: c */
    public boolean mo37248c() {
        return this.f30714a == null;
    }

    /* renamed from: d */
    public boolean mo37249d() {
        return C11439m.m37482d(this.f30714a);
    }

    /* renamed from: e */
    public boolean mo37250e() {
        Object obj = this.f30714a;
        return obj != null && !C11439m.m37482d(obj);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11481m) {
            return C10910b.m36863a(this.f30714a, ((C11481m) obj).f30714a);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f30714a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f30714a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (C11439m.m37482d(obj)) {
            return "OnErrorNotification[" + C11439m.m37477a(obj) + "]";
        }
        return "OnNextNotification[" + this.f30714a + "]";
    }

    /* renamed from: a */
    public static <T> C11481m<T> m37579a(T t) {
        C10910b.m36861a(t, "value is null");
        return new C11481m<>(t);
    }

    /* renamed from: a */
    public static <T> C11481m<T> m37580a(Throwable th) {
        C10910b.m36861a(th, "error is null");
        return new C11481m<>(C11439m.m37475a(th));
    }
}
