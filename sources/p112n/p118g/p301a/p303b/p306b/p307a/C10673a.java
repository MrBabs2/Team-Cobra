package p112n.p118g.p301a.p303b.p306b.p307a;

import androidx.core.widget.NestedScrollView;
import p112n.p118g.p301a.p310c.C10706f;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: n.g.a.b.b.a.a */
/* compiled from: NestedScrollViewScrollChangeEventOnSubscribe */
final class C10673a implements C5368e.C5370a<C10706f> {

    /* renamed from: f */
    final NestedScrollView f28685f;

    /* renamed from: n.g.a.b.b.a.a$a */
    /* compiled from: NestedScrollViewScrollChangeEventOnSubscribe */
    class C10674a implements NestedScrollView.C0425b {

        /* renamed from: a */
        final /* synthetic */ C12475j f28686a;

        C10674a(C12475j jVar) {
            this.f28686a = jVar;
        }

        /* renamed from: a */
        public void mo165a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            if (!this.f28686a.isUnsubscribed()) {
                this.f28686a.onNext(C10706f.m36228a(C10673a.this.f28685f, i, i2, i3, i4));
            }
        }
    }

    /* renamed from: n.g.a.b.b.a.a$b */
    /* compiled from: NestedScrollViewScrollChangeEventOnSubscribe */
    class C10675b extends C12476a {
        C10675b() {
        }

        /* access modifiers changed from: protected */
        public void onUnsubscribe() {
            C10673a.this.f28685f.setOnScrollChangeListener((NestedScrollView.C0425b) null);
        }
    }

    C10673a(NestedScrollView nestedScrollView) {
        this.f28685f = nestedScrollView;
    }

    /* renamed from: a */
    public void call(C12475j<? super C10706f> jVar) {
        C12476a.verifyMainThread();
        C10674a aVar = new C10674a(jVar);
        jVar.add(new C10675b());
        this.f28685f.setOnScrollChangeListener(aVar);
    }
}
