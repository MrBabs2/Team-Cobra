package p112n.p118g.p301a.p303b.p304a.p305a;

import com.google.android.material.appbar.AppBarLayout;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: n.g.a.b.a.a.a */
/* compiled from: AppBarLayoutOffsetChangeOnSubscribe */
final class C10665a implements C5368e.C5370a<Integer> {

    /* renamed from: f */
    final AppBarLayout f28678f;

    /* renamed from: n.g.a.b.a.a.a$a */
    /* compiled from: AppBarLayoutOffsetChangeOnSubscribe */
    class C10666a implements AppBarLayout.C8416e {

        /* renamed from: a */
        final /* synthetic */ C12475j f28679a;

        C10666a(C10665a aVar, C12475j jVar) {
            this.f28679a = jVar;
        }

        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            if (!this.f28679a.isUnsubscribed()) {
                this.f28679a.onNext(Integer.valueOf(i));
            }
        }
    }

    /* renamed from: n.g.a.b.a.a.a$b */
    /* compiled from: AppBarLayoutOffsetChangeOnSubscribe */
    class C10667b extends C12476a {

        /* renamed from: f */
        final /* synthetic */ AppBarLayout.C8416e f28680f;

        C10667b(AppBarLayout.C8416e eVar) {
            this.f28680f = eVar;
        }

        /* access modifiers changed from: protected */
        public void onUnsubscribe() {
            C10665a.this.f28678f.mo30734b(this.f28680f);
        }
    }

    C10665a(AppBarLayout appBarLayout) {
        this.f28678f = appBarLayout;
    }

    /* renamed from: a */
    public void call(C12475j<? super Integer> jVar) {
        C12476a.verifyMainThread();
        C10666a aVar = new C10666a(this, jVar);
        jVar.add(new C10667b(aVar));
        this.f28678f.mo30728a((AppBarLayout.C8416e) aVar);
    }
}
