package p123rx.p401n.p402a;

import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p410p.C12838e;

/* renamed from: rx.n.a.c1 */
/* compiled from: OperatorTakeUntil */
public final class C12527c1<T, E> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    private final C5368e<? extends E> f32310f;

    /* renamed from: rx.n.a.c1$a */
    /* compiled from: OperatorTakeUntil */
    class C12528a extends C12475j<T> {

        /* renamed from: f */
        final /* synthetic */ C12475j f32311f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12528a(C12527c1 c1Var, C12475j jVar, boolean z, C12475j jVar2) {
            super(jVar, z);
            this.f32311f = jVar2;
        }

        public void onCompleted() {
            try {
                this.f32311f.onCompleted();
            } finally {
                this.f32311f.unsubscribe();
            }
        }

        public void onError(Throwable th) {
            try {
                this.f32311f.onError(th);
            } finally {
                this.f32311f.unsubscribe();
            }
        }

        public void onNext(T t) {
            this.f32311f.onNext(t);
        }
    }

    /* renamed from: rx.n.a.c1$b */
    /* compiled from: OperatorTakeUntil */
    class C12529b extends C12475j<E> {

        /* renamed from: f */
        final /* synthetic */ C12475j f32312f;

        C12529b(C12527c1 c1Var, C12475j jVar) {
            this.f32312f = jVar;
        }

        public void onCompleted() {
            this.f32312f.onCompleted();
        }

        public void onError(Throwable th) {
            this.f32312f.onError(th);
        }

        public void onNext(E e) {
            onCompleted();
        }

        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public C12527c1(C5368e<? extends E> eVar) {
        this.f32310f = eVar;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        C12838e eVar = new C12838e(jVar, false);
        C12528a aVar = new C12528a(this, eVar, false, eVar);
        C12529b bVar = new C12529b(this, aVar);
        eVar.add(aVar);
        eVar.add(bVar);
        jVar.add(eVar);
        this.f32310f.mo18668b(bVar);
        return aVar;
    }
}
