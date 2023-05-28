package p123rx.p401n.p402a;

import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C12496o;
import p123rx.p126m.C5379n;
import p123rx.p401n.p406e.C12792m;

/* renamed from: rx.n.a.m0 */
/* compiled from: OperatorDistinctUntilChanged */
public final class C12600m0<T, U> implements C5368e.C5371b<T, T>, C12496o<U, U, Boolean> {

    /* renamed from: f */
    final C5379n<? super T, ? extends U> f32504f;

    /* renamed from: g */
    final C12496o<? super U, ? super U, Boolean> f32505g = this;

    /* renamed from: rx.n.a.m0$a */
    /* compiled from: OperatorDistinctUntilChanged */
    class C12601a extends C12475j<T> {

        /* renamed from: f */
        U f32506f;

        /* renamed from: g */
        boolean f32507g;

        /* renamed from: h */
        final /* synthetic */ C12475j f32508h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12601a(C12475j jVar, C12475j jVar2) {
            super(jVar);
            this.f32508h = jVar2;
        }

        public void onCompleted() {
            this.f32508h.onCompleted();
        }

        public void onError(Throwable th) {
            this.f32508h.onError(th);
        }

        public void onNext(T t) {
            try {
                U call = C12600m0.this.f32504f.call(t);
                U u = this.f32506f;
                this.f32506f = call;
                if (this.f32507g) {
                    try {
                        if (!C12600m0.this.f32505g.call(u, call).booleanValue()) {
                            this.f32508h.onNext(t);
                        } else {
                            request(1);
                        }
                    } catch (Throwable th) {
                        C12472a.m40940a(th, (C5372f<?>) this.f32508h, (Object) call);
                    }
                } else {
                    this.f32507g = true;
                    this.f32508h.onNext(t);
                }
            } catch (Throwable th2) {
                C12472a.m40940a(th2, (C5372f<?>) this.f32508h, (Object) t);
            }
        }
    }

    /* renamed from: rx.n.a.m0$b */
    /* compiled from: OperatorDistinctUntilChanged */
    static final class C12602b {

        /* renamed from: a */
        static final C12600m0<?, ?> f32510a = new C12600m0<>(C12792m.m41299b());
    }

    public C12600m0(C5379n<? super T, ? extends U> nVar) {
        this.f32504f = nVar;
    }

    /* renamed from: a */
    public static <T> C12600m0<T, T> m41060a() {
        return C12602b.f32510a;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        return new C12601a(jVar, jVar);
    }

    public Boolean call(U u, U u2) {
        return Boolean.valueOf(u == u2 || (u != null && u.equals(u2)));
    }
}
