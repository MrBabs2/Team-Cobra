package p112n.p118g.p301a.p303b.p308c.p309a;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

/* renamed from: n.g.a.b.c.a.h */
/* compiled from: ToolbarItemClickOnSubscribe */
final class C10692h implements C5368e.C5370a<MenuItem> {

    /* renamed from: f */
    final Toolbar f28704f;

    /* renamed from: n.g.a.b.c.a.h$a */
    /* compiled from: ToolbarItemClickOnSubscribe */
    class C10693a implements Toolbar.C0218f {

        /* renamed from: a */
        final /* synthetic */ C12475j f28705a;

        C10693a(C10692h hVar, C12475j jVar) {
            this.f28705a = jVar;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.f28705a.isUnsubscribed()) {
                return true;
            }
            this.f28705a.onNext(menuItem);
            return true;
        }
    }

    /* renamed from: n.g.a.b.c.a.h$b */
    /* compiled from: ToolbarItemClickOnSubscribe */
    class C10694b extends C12476a {
        C10694b() {
        }

        /* access modifiers changed from: protected */
        public void onUnsubscribe() {
            C10692h.this.f28704f.setOnMenuItemClickListener((Toolbar.C0218f) null);
        }
    }

    C10692h(Toolbar toolbar) {
        this.f28704f = toolbar;
    }

    /* renamed from: a */
    public void call(C12475j<? super MenuItem> jVar) {
        C12476a.verifyMainThread();
        C10693a aVar = new C10693a(this, jVar);
        jVar.add(new C10694b());
        this.f28704f.setOnMenuItemClickListener(aVar);
    }
}
