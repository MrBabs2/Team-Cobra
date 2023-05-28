package p112n.p118g.p301a.p310c;

import android.view.View;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: n.g.a.c.b */
/* compiled from: ViewClickOnSubscribe */
final class C10696b implements C5368e.C5370a<Void> {

    /* renamed from: f */
    final View f28707f;

    /* renamed from: n.g.a.c.b$a */
    /* compiled from: ViewClickOnSubscribe */
    class C10697a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C12475j f28708f;

        C10697a(C10696b bVar, C12475j jVar) {
            this.f28708f = jVar;
        }

        public void onClick(View view) {
            if (!this.f28708f.isUnsubscribed()) {
                this.f28708f.onNext(null);
            }
        }
    }

    /* renamed from: n.g.a.c.b$b */
    /* compiled from: ViewClickOnSubscribe */
    class C10698b extends C12476a {
        C10698b() {
        }

        /* access modifiers changed from: protected */
        public void onUnsubscribe() {
            C10696b.this.f28707f.setOnClickListener((View.OnClickListener) null);
        }
    }

    C10696b(View view) {
        this.f28707f = view;
    }

    /* renamed from: a */
    public void call(C12475j<? super Void> jVar) {
        C12476a.verifyMainThread();
        C10697a aVar = new C10697a(this, jVar);
        jVar.add(new C10698b());
        this.f28707f.setOnClickListener(aVar);
    }
}
