package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p050l.p075h.p077f.p078a.C4967c;

/* renamed from: androidx.appcompat.view.menu.s */
/* compiled from: SubMenuWrapperICS */
class C0163s extends C0157o implements SubMenu {

    /* renamed from: e */
    private final C4967c f635e;

    C0163s(Context context, C4967c cVar) {
        super(context, cVar);
        this.f635e = cVar;
    }

    public void clearHeader() {
        this.f635e.clearHeader();
    }

    public MenuItem getItem() {
        return mo560a(this.f635e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f635e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f635e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f635e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f635e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f635e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f635e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f635e.setIcon(drawable);
        return this;
    }
}
