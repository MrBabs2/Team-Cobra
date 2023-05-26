package p050l.p075h.p084l;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: l.h.l.b */
/* compiled from: ActionProvider */
public abstract class C5013b {

    /* renamed from: a */
    private C5015b f8873a;

    /* renamed from: l.h.l.b$a */
    /* compiled from: ActionProvider */
    public interface C5014a {
    }

    /* renamed from: l.h.l.b$b */
    /* compiled from: ActionProvider */
    public interface C5015b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C5013b(Context context) {
    }

    /* renamed from: a */
    public View mo805a(MenuItem menuItem) {
        return mo803c();
    }

    /* renamed from: a */
    public void mo801a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public void mo17468a(C5014a aVar) {
    }

    /* renamed from: a */
    public boolean mo802a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo807b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo803c();

    /* renamed from: d */
    public boolean mo804d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo808e() {
        return false;
    }

    /* renamed from: f */
    public void mo17469f() {
        this.f8873a = null;
    }

    /* renamed from: a */
    public void mo806a(C5015b bVar) {
        if (!(this.f8873a == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f8873a = bVar;
    }
}
