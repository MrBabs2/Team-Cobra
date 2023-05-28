package p123rx.p401n.p402a;

import p123rx.C12464c;
import p123rx.C12474i;
import p123rx.C5328b;
import p123rx.C5375k;
import p123rx.Single;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5379n;

/* renamed from: rx.n.a.c */
/* compiled from: CompletableFlatMapSingleToCompletable */
public final class C12522c<T> implements C5328b.C5366w {

    /* renamed from: f */
    final Single<T> f32295f;

    /* renamed from: g */
    final C5379n<? super T, ? extends C5328b> f32296g;

    public C12522c(Single<T> single, C5379n<? super T, ? extends C5328b> nVar) {
        this.f32295f = single;
        this.f32296g = nVar;
    }

    /* renamed from: a */
    public void call(C12464c cVar) {
        C12523a aVar = new C12523a(cVar, this.f32296g);
        cVar.mo18613a(aVar);
        this.f32295f.mo18560a(aVar);
    }

    /* renamed from: rx.n.a.c$a */
    /* compiled from: CompletableFlatMapSingleToCompletable */
    static final class C12523a<T> extends C12474i<T> implements C12464c {

        /* renamed from: g */
        final C12464c f32297g;

        /* renamed from: h */
        final C5379n<? super T, ? extends C5328b> f32298h;

        public C12523a(C12464c cVar, C5379n<? super T, ? extends C5328b> nVar) {
            this.f32297g = cVar;
            this.f32298h = nVar;
        }

        /* renamed from: a */
        public void mo18573a(T t) {
            try {
                C5328b bVar = (C5328b) this.f32298h.call(t);
                if (bVar == null) {
                    onError(new NullPointerException("The mapper returned a null Completable"));
                } else {
                    bVar.mo18596a((C12464c) this);
                }
            } catch (Throwable th) {
                C12472a.m40945c(th);
                onError(th);
            }
        }

        public void onCompleted() {
            this.f32297g.onCompleted();
        }

        public void onError(Throwable th) {
            this.f32297g.onError(th);
        }

        /* renamed from: a */
        public void mo18613a(C5375k kVar) {
            mo40654b(kVar);
        }
    }
}
