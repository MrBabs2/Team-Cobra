package p123rx.p401n.p402a;

import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C12496o;
import p123rx.p126m.C5379n;

/* renamed from: rx.n.a.e1 */
/* compiled from: OperatorTakeWhile */
public final class C12541e1<T> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    final C12496o<? super T, ? super Integer, Boolean> f32343f;

    /* renamed from: rx.n.a.e1$a */
    /* compiled from: OperatorTakeWhile */
    class C12542a implements C12496o<T, Integer, Boolean> {

        /* renamed from: f */
        final /* synthetic */ C5379n f32344f;

        C12542a(C5379n nVar) {
            this.f32344f = nVar;
        }

        /* renamed from: a */
        public Boolean call(T t, Integer num) {
            return (Boolean) this.f32344f.call(t);
        }
    }

    /* renamed from: rx.n.a.e1$b */
    /* compiled from: OperatorTakeWhile */
    class C12543b extends C12475j<T> {

        /* renamed from: f */
        private int f32345f;

        /* renamed from: g */
        private boolean f32346g;

        /* renamed from: h */
        final /* synthetic */ C12475j f32347h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12543b(C12475j jVar, boolean z, C12475j jVar2) {
            super(jVar, z);
            this.f32347h = jVar2;
        }

        public void onCompleted() {
            if (!this.f32346g) {
                this.f32347h.onCompleted();
            }
        }

        public void onError(Throwable th) {
            if (!this.f32346g) {
                this.f32347h.onError(th);
            }
        }

        public void onNext(T t) {
            try {
                C12496o<? super T, ? super Integer, Boolean> oVar = C12541e1.this.f32343f;
                int i = this.f32345f;
                this.f32345f = i + 1;
                if (oVar.call(t, Integer.valueOf(i)).booleanValue()) {
                    this.f32347h.onNext(t);
                    return;
                }
                this.f32346g = true;
                this.f32347h.onCompleted();
                unsubscribe();
            } catch (Throwable th) {
                this.f32346g = true;
                C12472a.m40940a(th, (C5372f<?>) this.f32347h, (Object) t);
                unsubscribe();
            }
        }
    }

    public C12541e1(C5379n<? super T, Boolean> nVar) {
        this(new C12542a(nVar));
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        C12543b bVar = new C12543b(jVar, false, jVar);
        jVar.add(bVar);
        return bVar;
    }

    public C12541e1(C12496o<? super T, ? super Integer, Boolean> oVar) {
        this.f32343f = oVar;
    }
}
