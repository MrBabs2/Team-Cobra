package p123rx.p126m;

/* renamed from: rx.m.r */
/* compiled from: Functions */
public final class C12499r {

    /* renamed from: rx.m.r$a */
    /* compiled from: Functions */
    static class C12500a implements C12498q<R> {

        /* renamed from: a */
        final /* synthetic */ C12496o f32246a;

        C12500a(C12496o oVar) {
            this.f32246a = oVar;
        }

        public R call(Object... objArr) {
            if (objArr.length == 2) {
                return this.f32246a.call(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Func2 expecting 2 arguments.");
        }
    }

    /* renamed from: rx.m.r$b */
    /* compiled from: Functions */
    static class C12501b implements C12498q<R> {

        /* renamed from: a */
        final /* synthetic */ C12497p f32247a;

        C12501b(C12497p pVar) {
            this.f32247a = pVar;
        }

        public R call(Object... objArr) {
            if (objArr.length == 3) {
                return this.f32247a.call(objArr[0], objArr[1], objArr[2]);
            }
            throw new IllegalArgumentException("Func3 expecting 3 arguments.");
        }
    }

    /* renamed from: a */
    public static <T0, T1, R> C12498q<R> m40957a(C12496o<? super T0, ? super T1, ? extends R> oVar) {
        return new C12500a(oVar);
    }

    /* renamed from: a */
    public static <T0, T1, T2, R> C12498q<R> m40958a(C12497p<? super T0, ? super T1, ? super T2, ? extends R> pVar) {
        return new C12501b(pVar);
    }
}
