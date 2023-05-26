package p050l.p051a.p058o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0144j;
import androidx.appcompat.view.menu.C0157o;
import java.util.ArrayList;
import p050l.p051a.p058o.C4821b;
import p050l.p066e.C4881g;
import p050l.p075h.p077f.p078a.C4965a;
import p050l.p075h.p077f.p078a.C4966b;

/* renamed from: l.a.o.f */
/* compiled from: SupportActionModeWrapper */
public class C4826f extends ActionMode {

    /* renamed from: a */
    final Context f8226a;

    /* renamed from: b */
    final C4821b f8227b;

    public C4826f(Context context, C4821b bVar) {
        this.f8226a = context;
        this.f8227b = bVar;
    }

    public void finish() {
        this.f8227b.mo435a();
    }

    public View getCustomView() {
        return this.f8227b.mo440b();
    }

    public Menu getMenu() {
        return new C0157o(this.f8226a, (C4965a) this.f8227b.mo443c());
    }

    public MenuInflater getMenuInflater() {
        return this.f8227b.mo444d();
    }

    public CharSequence getSubtitle() {
        return this.f8227b.mo445e();
    }

    public Object getTag() {
        return this.f8227b.mo16778f();
    }

    public CharSequence getTitle() {
        return this.f8227b.mo446g();
    }

    public boolean getTitleOptionalHint() {
        return this.f8227b.mo16779h();
    }

    public void invalidate() {
        this.f8227b.mo447i();
    }

    public boolean isTitleOptional() {
        return this.f8227b.mo448j();
    }

    public void setCustomView(View view) {
        this.f8227b.mo437a(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8227b.mo438a(charSequence);
    }

    public void setTag(Object obj) {
        this.f8227b.mo16777a(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f8227b.mo442b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f8227b.mo439a(z);
    }

    public void setSubtitle(int i) {
        this.f8227b.mo436a(i);
    }

    public void setTitle(int i) {
        this.f8227b.mo441b(i);
    }

    /* renamed from: l.a.o.f$a */
    /* compiled from: SupportActionModeWrapper */
    public static class C4827a implements C4821b.C4822a {

        /* renamed from: a */
        final ActionMode.Callback f8228a;

        /* renamed from: b */
        final Context f8229b;

        /* renamed from: c */
        final ArrayList<C4826f> f8230c = new ArrayList<>();

        /* renamed from: d */
        final C4881g<Menu, Menu> f8231d = new C4881g<>();

        public C4827a(Context context, ActionMode.Callback callback) {
            this.f8229b = context;
            this.f8228a = callback;
        }

        /* renamed from: a */
        public boolean mo352a(C4821b bVar, Menu menu) {
            return this.f8228a.onCreateActionMode(mo16806b(bVar), m8072a(menu));
        }

        /* renamed from: b */
        public boolean mo354b(C4821b bVar, Menu menu) {
            return this.f8228a.onPrepareActionMode(mo16806b(bVar), m8072a(menu));
        }

        /* renamed from: a */
        public boolean mo353a(C4821b bVar, MenuItem menuItem) {
            return this.f8228a.onActionItemClicked(mo16806b(bVar), new C0144j(this.f8229b, (C4966b) menuItem));
        }

        /* renamed from: b */
        public ActionMode mo16806b(C4821b bVar) {
            int size = this.f8230c.size();
            for (int i = 0; i < size; i++) {
                C4826f fVar = this.f8230c.get(i);
                if (fVar != null && fVar.f8227b == bVar) {
                    return fVar;
                }
            }
            C4826f fVar2 = new C4826f(this.f8229b, bVar);
            this.f8230c.add(fVar2);
            return fVar2;
        }

        /* renamed from: a */
        public void mo351a(C4821b bVar) {
            this.f8228a.onDestroyActionMode(mo16806b(bVar));
        }

        /* renamed from: a */
        private Menu m8072a(Menu menu) {
            Menu menu2 = this.f8231d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0157o oVar = new C0157o(this.f8229b, (C4965a) menu);
            this.f8231d.put(menu, oVar);
            return oVar;
        }
    }
}
