package p123rx.p401n.p402a;

import p123rx.C12474i;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p128t.C12888d;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.p1 */
/* compiled from: SingleOnSubscribeDelaySubscriptionOther */
public final class C12622p1<T> implements Single.C5327j<T> {

    /* renamed from: f */
    final Single<? extends T> f32564f;

    /* renamed from: g */
    final C5368e<?> f32565g;

    /* renamed from: rx.n.a.p1$a */
    /* compiled from: SingleOnSubscribeDelaySubscriptionOther */
    class C12623a extends C12474i<T> {

        /* renamed from: g */
        final /* synthetic */ C12474i f32566g;

        C12623a(C12622p1 p1Var, C12474i iVar) {
            this.f32566g = iVar;
        }

        /* renamed from: a */
        public void mo18573a(T t) {
            this.f32566g.mo18573a(t);
        }

        public void onError(Throwable th) {
            this.f32566g.onError(th);
        }
    }

    /* renamed from: rx.n.a.p1$b */
    /* compiled from: SingleOnSubscribeDelaySubscriptionOther */
    class C12624b extends C12475j<Object> {

        /* renamed from: f */
        boolean f32567f;

        /* renamed from: g */
        final /* synthetic */ C12474i f32568g;

        /* renamed from: h */
        final /* synthetic */ C12888d f32569h;

        C12624b(C12474i iVar, C12888d dVar) {
            this.f32568g = iVar;
            this.f32569h = dVar;
        }

        public void onCompleted() {
            if (!this.f32567f) {
                this.f32567f = true;
                this.f32569h.mo41109a(this.f32568g);
                C12622p1.this.f32564f.mo18560a(this.f32568g);
            }
        }

        public void onError(Throwable th) {
            if (this.f32567f) {
                C12844c.m41417b(th);
                return;
            }
            this.f32567f = true;
            this.f32568g.onError(th);
        }

        public void onNext(Object obj) {
            onCompleted();
        }
    }

    public C12622p1(Single<? extends T> single, C5368e<?> eVar) {
        this.f32564f = single;
        this.f32565g = eVar;
    }

    /* renamed from: a */
    public void call(C12474i<? super T> iVar) {
        C12623a aVar = new C12623a(this, iVar);
        C12888d dVar = new C12888d();
        iVar.mo40654b(dVar);
        C12624b bVar = new C12624b(aVar, dVar);
        dVar.mo41109a(bVar);
        this.f32565g.mo18654a(bVar);
    }
}
