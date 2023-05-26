package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.widget.C0280r0;
import androidx.appcompat.widget.C0299x;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p050l.p051a.p058o.C4833i;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.appcompat.app.l */
/* compiled from: ToolbarActionBar */
class C0110l extends C0069a {

    /* renamed from: a */
    C0299x f338a;

    /* renamed from: b */
    boolean f339b;

    /* renamed from: c */
    Window.Callback f340c;

    /* renamed from: d */
    private boolean f341d;

    /* renamed from: e */
    private boolean f342e;

    /* renamed from: f */
    private ArrayList<C0069a.C0071b> f343f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f344g = new C0111a();

    /* renamed from: h */
    private final Toolbar.C0218f f345h = new C0112b();

    /* renamed from: androidx.appcompat.app.l$a */
    /* compiled from: ToolbarActionBar */
    class C0111a implements Runnable {
        C0111a() {
        }

        public void run() {
            C0110l.this.mo414m();
        }
    }

    /* renamed from: androidx.appcompat.app.l$b */
    /* compiled from: ToolbarActionBar */
    class C0112b implements Toolbar.C0218f {
        C0112b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0110l.this.f340c.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.l$d */
    /* compiled from: ToolbarActionBar */
    private final class C0114d implements C0138g.C0139a {
        C0114d() {
        }

        /* renamed from: a */
        public void mo317a(C0138g gVar) {
            C0110l lVar = C0110l.this;
            if (lVar.f340c == null) {
                return;
            }
            if (lVar.f338a.mo1742a()) {
                C0110l.this.f340c.onPanelClosed(108, gVar);
            } else if (C0110l.this.f340c.onPreparePanel(0, (View) null, gVar)) {
                C0110l.this.f340c.onMenuOpened(108, gVar);
            }
        }

        /* renamed from: a */
        public boolean mo320a(C0138g gVar, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.app.l$e */
    /* compiled from: ToolbarActionBar */
    private class C0115e extends C4833i {
        public C0115e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0110l.this.f338a.getContext());
            }
            return super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0110l lVar = C0110l.this;
                if (!lVar.f339b) {
                    lVar.f338a.mo1743b();
                    C0110l.this.f339b = true;
                }
            }
            return onPreparePanel;
        }
    }

    C0110l(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f338a = new C0280r0(toolbar, false);
        C0115e eVar = new C0115e(callback);
        this.f340c = eVar;
        this.f338a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(this.f345h);
        this.f338a.setWindowTitle(charSequence);
    }

    /* renamed from: n */
    private Menu m426n() {
        if (!this.f341d) {
            this.f338a.mo1738a((C0153m.C0154a) new C0113c(), (C0138g.C0139a) new C0114d());
            this.f341d = true;
        }
        return this.f338a.mo1760i();
    }

    /* renamed from: a */
    public void mo181a(Configuration configuration) {
        super.mo181a(configuration);
    }

    /* renamed from: b */
    public void mo185b(CharSequence charSequence) {
        this.f338a.setWindowTitle(charSequence);
    }

    /* renamed from: c */
    public void mo187c(boolean z) {
    }

    /* renamed from: d */
    public void mo188d(boolean z) {
        mo412a(z ? 4 : 0, 4);
    }

    /* renamed from: e */
    public void mo189e(boolean z) {
        mo412a(z ? 2 : 0, 2);
    }

    /* renamed from: f */
    public void mo191f(boolean z) {
    }

    /* renamed from: f */
    public boolean mo192f() {
        if (!this.f338a.mo1759h()) {
            return false;
        }
        this.f338a.collapseActionView();
        return true;
    }

    /* renamed from: g */
    public int mo193g() {
        return this.f338a.mo1763l();
    }

    /* renamed from: g */
    public void mo194g(boolean z) {
    }

    /* renamed from: h */
    public Context mo195h() {
        return this.f338a.getContext();
    }

    /* renamed from: i */
    public boolean mo196i() {
        this.f338a.mo1762k().removeCallbacks(this.f344g);
        C5071v.m9162a((View) this.f338a.mo1762k(), this.f344g);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo197j() {
        this.f338a.mo1762k().removeCallbacks(this.f344g);
    }

    /* renamed from: k */
    public boolean mo198k() {
        return this.f338a.mo1755f();
    }

    /* renamed from: l */
    public Window.Callback mo413l() {
        return this.f340c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo414m() {
        Menu n = m426n();
        C0138g gVar = n instanceof C0138g ? (C0138g) n : null;
        if (gVar != null) {
            gVar.mo678s();
        }
        try {
            n.clear();
            if (!this.f340c.onCreatePanelMenu(0, n) || !this.f340c.onPreparePanel(0, (View) null, n)) {
                n.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.mo675r();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.l$c */
    /* compiled from: ToolbarActionBar */
    private final class C0113c implements C0153m.C0154a {

        /* renamed from: f */
        private boolean f348f;

        C0113c() {
        }

        /* renamed from: a */
        public boolean mo350a(C0138g gVar) {
            Window.Callback callback = C0110l.this.f340c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }

        /* renamed from: a */
        public void mo349a(C0138g gVar, boolean z) {
            if (!this.f348f) {
                this.f348f = true;
                C0110l.this.f338a.mo1756g();
                Window.Callback callback = C0110l.this.f340c;
                if (callback != null) {
                    callback.onPanelClosed(108, gVar);
                }
                this.f348f = false;
            }
        }
    }

    /* renamed from: a */
    public void mo182a(CharSequence charSequence) {
        this.f338a.setTitle(charSequence);
    }

    /* renamed from: b */
    public void mo186b(boolean z) {
        if (z != this.f342e) {
            this.f342e = z;
            int size = this.f343f.size();
            for (int i = 0; i < size; i++) {
                this.f343f.get(i).mo199a(z);
            }
        }
    }

    /* renamed from: e */
    public boolean mo190e() {
        return this.f338a.mo1754e();
    }

    /* renamed from: a */
    public void mo412a(int i, int i2) {
        this.f338a.mo1734a((i & i2) | ((i2 ^ -1) & this.f338a.mo1763l()));
    }

    /* renamed from: a */
    public boolean mo184a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo198k();
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo183a(int i, KeyEvent keyEvent) {
        Menu n = m426n();
        if (n == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        n.setQwertyMode(z);
        return n.performShortcut(i, keyEvent, 0);
    }
}
