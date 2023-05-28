package p123rx;

/* renamed from: rx.d */
/* compiled from: Notification */
public final class C12465d<T> {

    /* renamed from: d */
    private static final C12465d<Void> f32217d = new C12465d<>(C12466a.OnCompleted, (Object) null, (Throwable) null);

    /* renamed from: a */
    private final C12466a f32218a;

    /* renamed from: b */
    private final Throwable f32219b;

    /* renamed from: c */
    private final T f32220c;

    /* renamed from: rx.d$a */
    /* compiled from: Notification */
    public enum C12466a {
        OnNext,
        OnError,
        OnCompleted
    }

    private C12465d(C12466a aVar, T t, Throwable th) {
        this.f32220c = t;
        this.f32219b = th;
        this.f32218a = aVar;
    }

    /* renamed from: a */
    public static <T> C12465d<T> m40911a(T t) {
        return new C12465d<>(C12466a.OnNext, t, (Throwable) null);
    }

    /* renamed from: i */
    public static <T> C12465d<T> m40913i() {
        return f32217d;
    }

    /* renamed from: b */
    public Throwable mo40633b() {
        return this.f32219b;
    }

    /* renamed from: c */
    public T mo40634c() {
        return this.f32220c;
    }

    /* renamed from: d */
    public boolean mo40635d() {
        return mo40639g() && this.f32219b != null;
    }

    /* renamed from: e */
    public boolean mo40636e() {
        return mo40640h() && this.f32220c != null;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != C12465d.class) {
            return false;
        }
        C12465d dVar = (C12465d) obj;
        if (dVar.mo40632a() != mo40632a()) {
            return false;
        }
        T t = this.f32220c;
        T t2 = dVar.f32220c;
        if (t != t2 && (t == null || !t.equals(t2))) {
            return false;
        }
        Throwable th = this.f32219b;
        Throwable th2 = dVar.f32219b;
        if (th == th2 || (th != null && th.equals(th2))) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo40638f() {
        return mo40632a() == C12466a.OnCompleted;
    }

    /* renamed from: g */
    public boolean mo40639g() {
        return mo40632a() == C12466a.OnError;
    }

    /* renamed from: h */
    public boolean mo40640h() {
        return mo40632a() == C12466a.OnNext;
    }

    public int hashCode() {
        int hashCode = mo40632a().hashCode();
        if (mo40636e()) {
            hashCode = (hashCode * 31) + mo40634c().hashCode();
        }
        return mo40635d() ? (hashCode * 31) + mo40633b().hashCode() : hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append('[');
        sb.append(super.toString());
        sb.append(' ');
        sb.append(mo40632a());
        if (mo40636e()) {
            sb.append(' ');
            sb.append(mo40634c());
        }
        if (mo40635d()) {
            sb.append(' ');
            sb.append(mo40633b().getMessage());
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> C12465d<T> m40912a(Throwable th) {
        return new C12465d<>(C12466a.OnError, (Object) null, th);
    }

    /* renamed from: a */
    public C12466a mo40632a() {
        return this.f32218a;
    }
}
