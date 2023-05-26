package p123rx.p401n.p402a;

import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p128t.C12888d;
import p123rx.p128t.C12889e;
import p123rx.p410p.C12839f;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.m */
/* compiled from: OnSubscribeDelaySubscriptionOther */
public final class C12598m<T, U> implements C5368e.C5370a<T> {

    /* renamed from: f */
    final C5368e<? extends T> f32498f;

    /* renamed from: g */
    final C5368e<U> f32499g;

    /* renamed from: rx.n.a.m$a */
    /* compiled from: OnSubscribeDelaySubscriptionOther */
    class C12599a extends C12475j<U> {

        /* renamed from: f */
        boolean f32500f;

        /* renamed from: g */
        final /* synthetic */ C12475j f32501g;

        /* renamed from: h */
        final /* synthetic */ C12888d f32502h;

        C12599a(C12475j jVar, C12888d dVar) {
            this.f32501g = jVar;
            this.f32502h = dVar;
        }

        public void onCompleted() {
            if (!this.f32500f) {
                this.f32500f = true;
                this.f32502h.mo41109a(C12889e.m41502b());
                C12598m.this.f32498f.mo18668b(this.f32501g);
            }
        }

        public void onError(Throwable th) {
            if (this.f32500f) {
                C12844c.m41417b(th);
                return;
            }
            this.f32500f = true;
            this.f32501g.onError(th);
        }

        public void onNext(U u) {
            onCompleted();
        }
    }

    public C12598m(C5368e<? extends T> eVar, C5368e<U> eVar2) {
        this.f32498f = eVar;
        this.f32499g = eVar2;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        C12888d dVar = new C12888d();
        jVar.add(dVar);
        C12599a aVar = new C12599a(C12839f.m41394a(jVar), dVar);
        dVar.mo41109a(aVar);
        this.f32499g.mo18668b(aVar);
    }
}
