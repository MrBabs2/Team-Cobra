package p123rx.p401n.p402a;

import java.util.NoSuchElementException;
import p123rx.C12474i;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.l1 */
/* compiled from: SingleFromObservable */
public final class C12596l1<T> implements Single.C5327j<T> {

    /* renamed from: f */
    final C5368e.C5370a<T> f32494f;

    /* renamed from: rx.n.a.l1$a */
    /* compiled from: SingleFromObservable */
    static final class C12597a<T> extends C12475j<T> {

        /* renamed from: f */
        final C12474i<? super T> f32495f;

        /* renamed from: g */
        T f32496g;

        /* renamed from: h */
        int f32497h;

        C12597a(C12474i<? super T> iVar) {
            this.f32495f = iVar;
        }

        public void onCompleted() {
            int i = this.f32497h;
            if (i == 0) {
                this.f32495f.onError(new NoSuchElementException());
            } else if (i == 1) {
                this.f32497h = 2;
                T t = this.f32496g;
                this.f32496g = null;
                this.f32495f.mo18573a(t);
            }
        }

        public void onError(Throwable th) {
            if (this.f32497h == 2) {
                C12844c.m41417b(th);
                return;
            }
            this.f32496g = null;
            this.f32495f.onError(th);
        }

        public void onNext(T t) {
            int i = this.f32497h;
            if (i == 0) {
                this.f32497h = 1;
                this.f32496g = t;
            } else if (i == 1) {
                this.f32497h = 2;
                this.f32495f.onError(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }
    }

    public C12596l1(C5368e.C5370a<T> aVar) {
        this.f32494f = aVar;
    }

    /* renamed from: a */
    public void call(C12474i<? super T> iVar) {
        C12597a aVar = new C12597a(iVar);
        iVar.mo40654b(aVar);
        this.f32494f.call(aVar);
    }
}
