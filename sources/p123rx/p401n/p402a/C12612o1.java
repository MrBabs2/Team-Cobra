package p123rx.p401n.p402a;

import p123rx.C12474i;
import p123rx.Single;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5379n;

/* renamed from: rx.n.a.o1 */
/* compiled from: SingleOnErrorReturn */
public final class C12612o1<T> implements Single.C5327j<T> {

    /* renamed from: f */
    final Single.C5327j<T> f32530f;

    /* renamed from: g */
    final C5379n<Throwable, ? extends T> f32531g;

    /* renamed from: rx.n.a.o1$a */
    /* compiled from: SingleOnErrorReturn */
    static final class C12613a<T> extends C12474i<T> {

        /* renamed from: g */
        final C12474i<? super T> f32532g;

        /* renamed from: h */
        final C5379n<Throwable, ? extends T> f32533h;

        public C12613a(C12474i<? super T> iVar, C5379n<Throwable, ? extends T> nVar) {
            this.f32532g = iVar;
            this.f32533h = nVar;
        }

        /* renamed from: a */
        public void mo18573a(T t) {
            this.f32532g.mo18573a(t);
        }

        public void onError(Throwable th) {
            try {
                this.f32532g.mo18573a(this.f32533h.call(th));
            } catch (Throwable th2) {
                C12472a.m40945c(th2);
                this.f32532g.onError(th2);
            }
        }
    }

    public C12612o1(Single.C5327j<T> jVar, C5379n<Throwable, ? extends T> nVar) {
        this.f32530f = jVar;
        this.f32531g = nVar;
    }

    /* renamed from: a */
    public void call(C12474i<? super T> iVar) {
        C12613a aVar = new C12613a(iVar, this.f32531g);
        iVar.mo40654b(aVar);
        this.f32530f.call(aVar);
    }
}
