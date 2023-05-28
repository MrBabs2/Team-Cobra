package p112n.p118g.p301a.p303b.p308c.p309a;

import androidx.appcompat.widget.SearchView;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: n.g.a.b.c.a.f */
/* compiled from: SearchViewQueryTextChangeEventsOnSubscribe */
final class C10688f implements C5368e.C5370a<C10691g> {

    /* renamed from: f */
    final SearchView f28698f;

    /* renamed from: n.g.a.b.c.a.f$a */
    /* compiled from: SearchViewQueryTextChangeEventsOnSubscribe */
    class C10689a implements SearchView.C0207l {

        /* renamed from: a */
        final /* synthetic */ C12475j f28699a;

        C10689a(C12475j jVar) {
            this.f28699a = jVar;
        }

        /* renamed from: a */
        public boolean mo1239a(String str) {
            if (this.f28699a.isUnsubscribed()) {
                return false;
            }
            this.f28699a.onNext(C10691g.m36217a(C10688f.this.f28698f, str, false));
            return true;
        }

        /* renamed from: b */
        public boolean mo1240b(String str) {
            if (this.f28699a.isUnsubscribed()) {
                return false;
            }
            C12475j jVar = this.f28699a;
            SearchView searchView = C10688f.this.f28698f;
            jVar.onNext(C10691g.m36217a(searchView, searchView.getQuery(), true));
            return true;
        }
    }

    /* renamed from: n.g.a.b.c.a.f$b */
    /* compiled from: SearchViewQueryTextChangeEventsOnSubscribe */
    class C10690b extends C12476a {
        C10690b() {
        }

        /* access modifiers changed from: protected */
        public void onUnsubscribe() {
            C10688f.this.f28698f.setOnQueryTextListener((SearchView.C0207l) null);
        }
    }

    C10688f(SearchView searchView) {
        this.f28698f = searchView;
    }

    /* renamed from: a */
    public void call(C12475j<? super C10691g> jVar) {
        C12476a.verifyMainThread();
        C10689a aVar = new C10689a(jVar);
        jVar.add(new C10690b());
        this.f28698f.setOnQueryTextListener(aVar);
        SearchView searchView = this.f28698f;
        jVar.onNext(C10691g.m36217a(searchView, searchView.getQuery(), false));
    }
}
