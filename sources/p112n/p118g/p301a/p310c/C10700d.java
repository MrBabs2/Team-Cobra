package p112n.p118g.p301a.p310c;

import android.view.View;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: n.g.a.c.d */
/* compiled from: ViewFocusChangeOnSubscribe */
final class C10700d implements C5368e.C5370a<Boolean> {

    /* renamed from: f */
    final View f28711f;

    /* renamed from: n.g.a.c.d$a */
    /* compiled from: ViewFocusChangeOnSubscribe */
    class C10701a implements View.OnFocusChangeListener {

        /* renamed from: f */
        final /* synthetic */ C12475j f28712f;

        C10701a(C10700d dVar, C12475j jVar) {
            this.f28712f = jVar;
        }

        public void onFocusChange(View view, boolean z) {
            if (!this.f28712f.isUnsubscribed()) {
                this.f28712f.onNext(Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: n.g.a.c.d$b */
    /* compiled from: ViewFocusChangeOnSubscribe */
    class C10702b extends C12476a {
        C10702b() {
        }

        /* access modifiers changed from: protected */
        public void onUnsubscribe() {
            C10700d.this.f28711f.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        }
    }

    C10700d(View view) {
        this.f28711f = view;
    }

    /* renamed from: a */
    public void call(C12475j<? super Boolean> jVar) {
        C12476a.verifyMainThread();
        C10701a aVar = new C10701a(this, jVar);
        jVar.add(new C10702b());
        this.f28711f.setOnFocusChangeListener(aVar);
        jVar.onNext(Boolean.valueOf(this.f28711f.hasFocus()));
    }
}
