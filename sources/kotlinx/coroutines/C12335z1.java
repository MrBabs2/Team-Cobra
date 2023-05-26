package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.z1 */
/* compiled from: EventLoop.common.kt */
public final class C12335z1 {

    /* renamed from: a */
    private static final ThreadLocal<C12322x0> f32156a = new ThreadLocal<>();

    /* renamed from: b */
    public static final C12335z1 f32157b = new C12335z1();

    private C12335z1() {
    }

    /* renamed from: a */
    public final C12322x0 mo39062a() {
        C12322x0 x0Var = f32156a.get();
        if (x0Var != null) {
            return x0Var;
        }
        C12322x0 a = C12176a1.m40205a();
        f32156a.set(a);
        return a;
    }

    /* renamed from: b */
    public final void mo39064b() {
        f32156a.set((Object) null);
    }

    /* renamed from: a */
    public final void mo39063a(C12322x0 x0Var) {
        f32156a.set(x0Var);
    }
}
