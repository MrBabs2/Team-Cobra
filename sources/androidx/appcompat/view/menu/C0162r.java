package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0138g;

/* renamed from: androidx.appcompat.view.menu.r */
/* compiled from: SubMenuBuilder */
public class C0162r extends C0138g implements SubMenu {

    /* renamed from: B */
    private C0138g f633B;

    /* renamed from: C */
    private C0142i f634C;

    public C0162r(Context context, C0138g gVar, C0142i iVar) {
        super(context);
        this.f633B = gVar;
        this.f634C = iVar;
    }

    /* renamed from: a */
    public void mo619a(C0138g.C0139a aVar) {
        this.f633B.mo619a(aVar);
    }

    /* renamed from: b */
    public boolean mo642b(C0142i iVar) {
        return this.f633B.mo642b(iVar);
    }

    /* renamed from: d */
    public String mo652d() {
        C0142i iVar = this.f634C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo652d() + ":" + itemId;
    }

    public MenuItem getItem() {
        return this.f634C;
    }

    /* renamed from: m */
    public C0138g mo668m() {
        return this.f633B.mo668m();
    }

    /* renamed from: o */
    public boolean mo670o() {
        return this.f633B.mo670o();
    }

    /* renamed from: p */
    public boolean mo671p() {
        return this.f633B.mo671p();
    }

    /* renamed from: q */
    public boolean mo674q() {
        return this.f633B.mo674q();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f633B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.mo612a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo614a(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo613a(view);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f634C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f633B.setQwertyMode(z);
    }

    /* renamed from: t */
    public Menu mo869t() {
        return this.f633B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo626a(C0138g gVar, MenuItem menuItem) {
        return super.mo626a(gVar, menuItem) || this.f633B.mo626a(gVar, menuItem);
    }

    public SubMenu setHeaderIcon(int i) {
        super.mo651d(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.mo656e(i);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f634C.setIcon(i);
        return this;
    }

    /* renamed from: a */
    public boolean mo627a(C0142i iVar) {
        return this.f633B.mo627a(iVar);
    }
}
