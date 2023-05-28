package p112n.p118g.p301a.p303b.p306b.p307a;

import p050l.p106r.p107a.C5189c;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: n.g.a.b.b.a.d */
/* compiled from: SwipeRefreshLayoutRefreshOnSubscribe */
final class C10678d implements C5368e.C5370a<Void> {

    /* renamed from: f */
    final C5189c f28689f;

    /* renamed from: n.g.a.b.b.a.d$a */
    /* compiled from: SwipeRefreshLayoutRefreshOnSubscribe */
    class C10679a implements C5189c.C5199j {

        /* renamed from: a */
        final /* synthetic */ C12475j f28690a;

        C10679a(C10678d dVar, C12475j jVar) {
            this.f28690a = jVar;
        }

        /* renamed from: a */
        public void mo15497a() {
            if (!this.f28690a.isUnsubscribed()) {
                this.f28690a.onNext(null);
            }
        }
    }

    /* renamed from: n.g.a.b.b.a.d$b */
    /* compiled from: SwipeRefreshLayoutRefreshOnSubscribe */
    class C10680b extends C12476a {
        C10680b() {
        }

        /* access modifiers changed from: protected */
        public void onUnsubscribe() {
            C10678d.this.f28689f.setOnRefreshListener((C5189c.C5199j) null);
        }
    }

    C10678d(C5189c cVar) {
        this.f28689f = cVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super Void> jVar) {
        C12476a.verifyMainThread();
        C10679a aVar = new C10679a(this, jVar);
        jVar.add(new C10680b());
        this.f28689f.setOnRefreshListener(aVar);
    }
}
