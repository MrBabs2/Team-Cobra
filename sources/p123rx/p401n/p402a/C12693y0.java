package p123rx.p401n.p402a;

import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C12496o;
import p123rx.p126m.C5379n;

/* renamed from: rx.n.a.y0 */
/* compiled from: OperatorSkipWhile */
public final class C12693y0<T> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    final C12496o<? super T, Integer, Boolean> f32779f;

    /* renamed from: rx.n.a.y0$a */
    /* compiled from: OperatorSkipWhile */
    class C12694a extends C12475j<T> {

        /* renamed from: f */
        boolean f32780f = true;

        /* renamed from: g */
        int f32781g;

        /* renamed from: h */
        final /* synthetic */ C12475j f32782h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12694a(C12475j jVar, C12475j jVar2) {
            super(jVar);
            this.f32782h = jVar2;
        }

        public void onCompleted() {
            this.f32782h.onCompleted();
        }

        public void onError(Throwable th) {
            this.f32782h.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32780f) {
                this.f32782h.onNext(t);
                return;
            }
            try {
                C12496o<? super T, Integer, Boolean> oVar = C12693y0.this.f32779f;
                int i = this.f32781g;
                this.f32781g = i + 1;
                if (!oVar.call(t, Integer.valueOf(i)).booleanValue()) {
                    this.f32780f = false;
                    this.f32782h.onNext(t);
                    return;
                }
                request(1);
            } catch (Throwable th) {
                C12472a.m40940a(th, (C5372f<?>) this.f32782h, (Object) t);
            }
        }
    }

    /* renamed from: rx.n.a.y0$b */
    /* compiled from: OperatorSkipWhile */
    static class C12695b implements C12496o<T, Integer, Boolean> {

        /* renamed from: f */
        final /* synthetic */ C5379n f32784f;

        C12695b(C5379n nVar) {
            this.f32784f = nVar;
        }

        /* renamed from: a */
        public Boolean call(T t, Integer num) {
            return (Boolean) this.f32784f.call(t);
        }
    }

    public C12693y0(C12496o<? super T, Integer, Boolean> oVar) {
        this.f32779f = oVar;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        return new C12694a(jVar, jVar);
    }

    /* renamed from: a */
    public static <T> C12496o<T, Integer, Boolean> m41177a(C5379n<? super T, Boolean> nVar) {
        return new C12695b(nVar);
    }
}
