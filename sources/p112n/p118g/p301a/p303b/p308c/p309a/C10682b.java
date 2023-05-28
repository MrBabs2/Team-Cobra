package p112n.p118g.p301a.p303b.p308c.p309a;

import androidx.recyclerview.widget.RecyclerView;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: n.g.a.b.c.a.b */
/* compiled from: RecyclerViewScrollEventOnSubscribe */
final class C10682b implements C5368e.C5370a<C10681a> {

    /* renamed from: f */
    final RecyclerView f28694f;

    /* renamed from: n.g.a.b.c.a.b$a */
    /* compiled from: RecyclerViewScrollEventOnSubscribe */
    class C10683a extends RecyclerView.C0653t {

        /* renamed from: a */
        final /* synthetic */ C12475j f28695a;

        C10683a(C10682b bVar, C12475j jVar) {
            this.f28695a = jVar;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (!this.f28695a.isUnsubscribed()) {
                this.f28695a.onNext(C10681a.m36209a(recyclerView, i, i2));
            }
        }
    }

    /* renamed from: n.g.a.b.c.a.b$b */
    /* compiled from: RecyclerViewScrollEventOnSubscribe */
    class C10684b extends C12476a {

        /* renamed from: f */
        final /* synthetic */ RecyclerView.C0653t f28696f;

        C10684b(RecyclerView.C0653t tVar) {
            this.f28696f = tVar;
        }

        /* access modifiers changed from: protected */
        public void onUnsubscribe() {
            C10682b.this.f28694f.removeOnScrollListener(this.f28696f);
        }
    }

    public C10682b(RecyclerView recyclerView) {
        this.f28694f = recyclerView;
    }

    /* renamed from: a */
    public void call(C12475j<? super C10681a> jVar) {
        C12476a.verifyMainThread();
        C10683a aVar = new C10683a(this, jVar);
        jVar.add(new C10684b(aVar));
        this.f28694f.addOnScrollListener(aVar);
    }
}
