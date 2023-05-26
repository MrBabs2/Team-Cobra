package p112n.p118g.p301a.p303b.p304a.p305a;

import com.google.android.material.snackbar.Snackbar;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: n.g.a.b.a.a.d */
/* compiled from: SnackbarDismissesOnSubscribe */
final class C10670d implements C5368e.C5370a<Integer> {

    /* renamed from: f */
    final Snackbar f28682f;

    /* renamed from: n.g.a.b.a.a.d$a */
    /* compiled from: SnackbarDismissesOnSubscribe */
    class C10671a extends Snackbar.C8598b {

        /* renamed from: a */
        final /* synthetic */ C12475j f28683a;

        C10671a(C10670d dVar, C12475j jVar) {
            this.f28683a = jVar;
        }

        public void onDismissed(Snackbar snackbar, int i) {
            if (!this.f28683a.isUnsubscribed()) {
                this.f28683a.onNext(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: n.g.a.b.a.a.d$b */
    /* compiled from: SnackbarDismissesOnSubscribe */
    class C10672b extends C12476a {
        C10672b() {
        }

        /* access modifiers changed from: protected */
        public void onUnsubscribe() {
            C10670d.this.f28682f.mo32012a((Snackbar.C8598b) null);
        }
    }

    C10670d(Snackbar snackbar) {
        this.f28682f = snackbar;
    }

    /* renamed from: a */
    public void call(C12475j<? super Integer> jVar) {
        C12476a.verifyMainThread();
        C10671a aVar = new C10671a(this, jVar);
        jVar.add(new C10672b());
        this.f28682f.mo32012a((Snackbar.C8598b) aVar);
    }
}
