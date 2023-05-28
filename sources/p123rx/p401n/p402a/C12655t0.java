package p123rx.p401n.p402a;

import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5379n;
import p123rx.p128t.C12888d;
import p123rx.p401n.p403b.C12704a;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.t0 */
/* compiled from: OperatorOnErrorResumeNextViaFunction */
public final class C12655t0<T> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    final C5379n<? super Throwable, ? extends C5368e<? extends T>> f32681f;

    /* renamed from: rx.n.a.t0$a */
    /* compiled from: OperatorOnErrorResumeNextViaFunction */
    static class C12656a implements C5379n<Throwable, C5368e<? extends T>> {

        /* renamed from: f */
        final /* synthetic */ C5379n f32682f;

        C12656a(C5379n nVar) {
            this.f32682f = nVar;
        }

        /* renamed from: a */
        public C5368e<? extends T> call(Throwable th) {
            return C5368e.m10257c(this.f32682f.call(th));
        }
    }

    /* renamed from: rx.n.a.t0$b */
    /* compiled from: OperatorOnErrorResumeNextViaFunction */
    static class C12657b implements C5379n<Throwable, C5368e<? extends T>> {

        /* renamed from: f */
        final /* synthetic */ C5368e f32683f;

        C12657b(C5368e eVar) {
            this.f32683f = eVar;
        }

        /* renamed from: a */
        public C5368e<? extends T> call(Throwable th) {
            return this.f32683f;
        }
    }

    /* renamed from: rx.n.a.t0$c */
    /* compiled from: OperatorOnErrorResumeNextViaFunction */
    class C12658c extends C12475j<T> {

        /* renamed from: f */
        private boolean f32684f;

        /* renamed from: g */
        long f32685g;

        /* renamed from: h */
        final /* synthetic */ C12475j f32686h;

        /* renamed from: i */
        final /* synthetic */ C12704a f32687i;

        /* renamed from: j */
        final /* synthetic */ C12888d f32688j;

        /* renamed from: rx.n.a.t0$c$a */
        /* compiled from: OperatorOnErrorResumeNextViaFunction */
        class C12659a extends C12475j<T> {
            C12659a() {
            }

            public void onCompleted() {
                C12658c.this.f32686h.onCompleted();
            }

            public void onError(Throwable th) {
                C12658c.this.f32686h.onError(th);
            }

            public void onNext(T t) {
                C12658c.this.f32686h.onNext(t);
            }

            public void setProducer(C12473g gVar) {
                C12658c.this.f32687i.mo40845a(gVar);
            }
        }

        C12658c(C12475j jVar, C12704a aVar, C12888d dVar) {
            this.f32686h = jVar;
            this.f32687i = aVar;
            this.f32688j = dVar;
        }

        public void onCompleted() {
            if (!this.f32684f) {
                this.f32684f = true;
                this.f32686h.onCompleted();
            }
        }

        public void onError(Throwable th) {
            if (this.f32684f) {
                C12472a.m40945c(th);
                C12844c.m41417b(th);
                return;
            }
            this.f32684f = true;
            try {
                unsubscribe();
                C12659a aVar = new C12659a();
                this.f32688j.mo41109a(aVar);
                long j = this.f32685g;
                if (j != 0) {
                    this.f32687i.mo40844a(j);
                }
                ((C5368e) C12655t0.this.f32681f.call(th)).mo18668b(aVar);
            } catch (Throwable th2) {
                C12472a.m40939a(th2, (C5372f<?>) this.f32686h);
            }
        }

        public void onNext(T t) {
            if (!this.f32684f) {
                this.f32685g++;
                this.f32686h.onNext(t);
            }
        }

        public void setProducer(C12473g gVar) {
            this.f32687i.mo40845a(gVar);
        }
    }

    public C12655t0(C5379n<? super Throwable, ? extends C5368e<? extends T>> nVar) {
        this.f32681f = nVar;
    }

    /* renamed from: a */
    public static <T> C12655t0<T> m41139a(C5379n<? super Throwable, ? extends T> nVar) {
        return new C12655t0<>(new C12656a(nVar));
    }

    /* renamed from: a */
    public static <T> C12655t0<T> m41138a(C5368e<? extends T> eVar) {
        return new C12655t0<>(new C12657b(eVar));
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        C12704a aVar = new C12704a();
        C12888d dVar = new C12888d();
        C12658c cVar = new C12658c(jVar, aVar, dVar);
        dVar.mo41109a(cVar);
        jVar.add(dVar);
        jVar.setProducer(aVar);
        return cVar;
    }
}
