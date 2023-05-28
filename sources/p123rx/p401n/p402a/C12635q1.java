package p123rx.p401n.p402a;

import p123rx.C12474i;
import p123rx.Single;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.OnErrorThrowable;
import p123rx.p126m.C5379n;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.q1 */
/* compiled from: SingleOnSubscribeMap */
public final class C12635q1<T, R> implements Single.C5327j<R> {

    /* renamed from: f */
    final Single<T> f32618f;

    /* renamed from: g */
    final C5379n<? super T, ? extends R> f32619g;

    /* renamed from: rx.n.a.q1$a */
    /* compiled from: SingleOnSubscribeMap */
    static final class C12636a<T, R> extends C12474i<T> {

        /* renamed from: g */
        final C12474i<? super R> f32620g;

        /* renamed from: h */
        final C5379n<? super T, ? extends R> f32621h;

        /* renamed from: i */
        boolean f32622i;

        public C12636a(C12474i<? super R> iVar, C5379n<? super T, ? extends R> nVar) {
            this.f32620g = iVar;
            this.f32621h = nVar;
        }

        /* renamed from: a */
        public void mo18573a(T t) {
            try {
                this.f32620g.mo18573a(this.f32621h.call(t));
            } catch (Throwable th) {
                C12472a.m40945c(th);
                unsubscribe();
                onError(OnErrorThrowable.m40933a(th, t));
            }
        }

        public void onError(Throwable th) {
            if (this.f32622i) {
                C12844c.m41417b(th);
                return;
            }
            this.f32622i = true;
            this.f32620g.onError(th);
        }
    }

    public C12635q1(Single<T> single, C5379n<? super T, ? extends R> nVar) {
        this.f32618f = single;
        this.f32619g = nVar;
    }

    /* renamed from: a */
    public void call(C12474i<? super R> iVar) {
        C12636a aVar = new C12636a(iVar, this.f32619g);
        iVar.mo40654b(aVar);
        this.f32618f.mo18560a(aVar);
    }
}
