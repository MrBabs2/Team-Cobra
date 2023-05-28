package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p050l.p066e.C4881g;
import p050l.p075h.p077f.p078a.C4966b;
import p050l.p075h.p077f.p078a.C4967c;

/* renamed from: androidx.appcompat.view.menu.c */
/* compiled from: BaseMenuWrapper */
abstract class C0128c {

    /* renamed from: a */
    final Context f464a;

    /* renamed from: b */
    private C4881g<C4966b, MenuItem> f465b;

    /* renamed from: c */
    private C4881g<C4967c, SubMenu> f466c;

    C0128c(Context context) {
        this.f464a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo560a(MenuItem menuItem) {
        if (!(menuItem instanceof C4966b)) {
            return menuItem;
        }
        C4966b bVar = (C4966b) menuItem;
        if (this.f465b == null) {
            this.f465b = new C4881g<>();
        }
        MenuItem menuItem2 = this.f465b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0144j jVar = new C0144j(this.f464a, bVar);
        this.f465b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo563b() {
        C4881g<C4966b, MenuItem> gVar = this.f465b;
        if (gVar != null) {
            gVar.clear();
        }
        C4881g<C4967c, SubMenu> gVar2 = this.f466c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo564b(int i) {
        if (this.f465b != null) {
            for (int i2 = 0; i2 < this.f465b.size(); i2++) {
                if (this.f465b.mo17022b(i2).getItemId() == i) {
                    this.f465b.mo17024c(i2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu mo561a(SubMenu subMenu) {
        if (!(subMenu instanceof C4967c)) {
            return subMenu;
        }
        C4967c cVar = (C4967c) subMenu;
        if (this.f466c == null) {
            this.f466c = new C4881g<>();
        }
        SubMenu subMenu2 = this.f466c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0163s sVar = new C0163s(this.f464a, cVar);
        this.f466c.put(cVar, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo562a(int i) {
        if (this.f465b != null) {
            int i2 = 0;
            while (i2 < this.f465b.size()) {
                if (this.f465b.mo17022b(i2).getGroupId() == i) {
                    this.f465b.mo17024c(i2);
                    i2--;
                }
                i2++;
            }
        }
    }
}
