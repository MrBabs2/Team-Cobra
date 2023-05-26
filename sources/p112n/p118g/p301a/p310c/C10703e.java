package p112n.p118g.p301a.p310c;

import android.view.View;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;
import p123rx.p126m.C12495m;

/* renamed from: n.g.a.c.e */
/* compiled from: ViewLongClickOnSubscribe */
final class C10703e implements C5368e.C5370a<Void> {

    /* renamed from: f */
    final View f28714f;

    /* renamed from: g */
    final C12495m<Boolean> f28715g;

    /* renamed from: n.g.a.c.e$a */
    /* compiled from: ViewLongClickOnSubscribe */
    class C10704a implements View.OnLongClickListener {

        /* renamed from: f */
        final /* synthetic */ C12475j f28716f;

        C10704a(C12475j jVar) {
            this.f28716f = jVar;
        }

        public boolean onLongClick(View view) {
            if (!C10703e.this.f28715g.call().booleanValue()) {
                return false;
            }
            if (this.f28716f.isUnsubscribed()) {
                return true;
            }
            this.f28716f.onNext(null);
            return true;
        }
    }

    /* renamed from: n.g.a.c.e$b */
    /* compiled from: ViewLongClickOnSubscribe */
    class C10705b extends C12476a {
        C10705b() {
        }

        /* access modifiers changed from: protected */
        public void onUnsubscribe() {
            C10703e.this.f28714f.setOnLongClickListener((View.OnLongClickListener) null);
        }
    }

    C10703e(View view, C12495m<Boolean> mVar) {
        this.f28714f = view;
        this.f28715g = mVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super Void> jVar) {
        C12476a.verifyMainThread();
        C10704a aVar = new C10704a(jVar);
        jVar.add(new C10705b());
        this.f28714f.setOnLongClickListener(aVar);
    }
}
