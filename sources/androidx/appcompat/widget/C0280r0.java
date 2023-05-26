package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0126a;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.widget.Toolbar;
import p050l.p051a.C4790a;
import p050l.p051a.C4794e;
import p050l.p051a.C4795f;
import p050l.p051a.C4797h;
import p050l.p051a.C4799j;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p084l.C5012a0;
import p050l.p075h.p084l.C5016b0;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.C5086z;

/* renamed from: androidx.appcompat.widget.r0 */
/* compiled from: ToolbarWidgetWrapper */
public class C0280r0 implements C0299x {

    /* renamed from: a */
    Toolbar f1183a;

    /* renamed from: b */
    private int f1184b;

    /* renamed from: c */
    private View f1185c;

    /* renamed from: d */
    private View f1186d;

    /* renamed from: e */
    private Drawable f1187e;

    /* renamed from: f */
    private Drawable f1188f;

    /* renamed from: g */
    private Drawable f1189g;

    /* renamed from: h */
    private boolean f1190h;

    /* renamed from: i */
    CharSequence f1191i;

    /* renamed from: j */
    private CharSequence f1192j;

    /* renamed from: k */
    private CharSequence f1193k;

    /* renamed from: l */
    Window.Callback f1194l;

    /* renamed from: m */
    boolean f1195m;

    /* renamed from: n */
    private ActionMenuPresenter f1196n;

    /* renamed from: o */
    private int f1197o;

    /* renamed from: p */
    private int f1198p;

    /* renamed from: q */
    private Drawable f1199q;

    /* renamed from: androidx.appcompat.widget.r0$a */
    /* compiled from: ToolbarWidgetWrapper */
    class C0281a implements View.OnClickListener {

        /* renamed from: f */
        final C0126a f1200f = new C0126a(C0280r0.this.f1183a.getContext(), 0, 16908332, 0, 0, C0280r0.this.f1191i);

        C0281a() {
        }

        public void onClick(View view) {
            C0280r0 r0Var = C0280r0.this;
            Window.Callback callback = r0Var.f1194l;
            if (callback != null && r0Var.f1195m) {
                callback.onMenuItemSelected(0, this.f1200f);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.r0$b */
    /* compiled from: ToolbarWidgetWrapper */
    class C0282b extends C5016b0 {

        /* renamed from: a */
        private boolean f1202a = false;

        /* renamed from: b */
        final /* synthetic */ int f1203b;

        C0282b(int i) {
            this.f1203b = i;
        }

        public void onAnimationCancel(View view) {
            this.f1202a = true;
        }

        public void onAnimationEnd(View view) {
            if (!this.f1202a) {
                C0280r0.this.f1183a.setVisibility(this.f1203b);
            }
        }

        public void onAnimationStart(View view) {
            C0280r0.this.f1183a.setVisibility(0);
        }
    }

    public C0280r0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C4797h.abc_action_bar_up_description, C4794e.abc_ic_ab_back_material);
    }

    /* renamed from: c */
    private void m1294c(CharSequence charSequence) {
        this.f1191i = charSequence;
        if ((this.f1184b & 8) != 0) {
            this.f1183a.setTitle(charSequence);
        }
    }

    /* renamed from: o */
    private int m1295o() {
        if (this.f1183a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1199q = this.f1183a.getNavigationIcon();
        return 15;
    }

    /* renamed from: p */
    private void m1296p() {
        if ((this.f1184b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1193k)) {
            this.f1183a.setNavigationContentDescription(this.f1198p);
        } else {
            this.f1183a.setNavigationContentDescription(this.f1193k);
        }
    }

    /* renamed from: q */
    private void m1297q() {
        if ((this.f1184b & 4) != 0) {
            Toolbar toolbar = this.f1183a;
            Drawable drawable = this.f1189g;
            if (drawable == null) {
                drawable = this.f1199q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1183a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: r */
    private void m1298r() {
        Drawable drawable;
        int i = this.f1184b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1188f;
            if (drawable == null) {
                drawable = this.f1187e;
            }
        } else {
            drawable = this.f1187e;
        }
        this.f1183a.setLogo(drawable);
    }

    /* renamed from: a */
    public void mo1735a(Drawable drawable) {
        this.f1188f = drawable;
        m1298r();
    }

    /* renamed from: a */
    public void mo1741a(boolean z) {
    }

    /* renamed from: b */
    public void mo1746b(CharSequence charSequence) {
        this.f1192j = charSequence;
        if ((this.f1184b & 8) != 0) {
            this.f1183a.setSubtitle(charSequence);
        }
    }

    public void collapseActionView() {
        this.f1183a.mo1310c();
    }

    /* renamed from: d */
    public void mo1751d(int i) {
        if (i != this.f1198p) {
            this.f1198p = i;
            if (TextUtils.isEmpty(this.f1183a.getNavigationContentDescription())) {
                mo1753e(this.f1198p);
            }
        }
    }

    /* renamed from: e */
    public boolean mo1754e() {
        return this.f1183a.mo1315g();
    }

    /* renamed from: f */
    public boolean mo1755f() {
        return this.f1183a.mo1352k();
    }

    /* renamed from: g */
    public void mo1756g() {
        this.f1183a.mo1312d();
    }

    public Context getContext() {
        return this.f1183a.getContext();
    }

    public CharSequence getTitle() {
        return this.f1183a.getTitle();
    }

    /* renamed from: h */
    public boolean mo1759h() {
        return this.f1183a.mo1314f();
    }

    /* renamed from: i */
    public Menu mo1760i() {
        return this.f1183a.getMenu();
    }

    /* renamed from: j */
    public int mo1761j() {
        return this.f1197o;
    }

    /* renamed from: k */
    public ViewGroup mo1762k() {
        return this.f1183a;
    }

    /* renamed from: l */
    public int mo1763l() {
        return this.f1184b;
    }

    /* renamed from: m */
    public void mo1764m() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: n */
    public void mo1765n() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C4800a.m7936c(getContext(), i) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1190h = true;
        m1294c(charSequence);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f1194l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1190h) {
            m1294c(charSequence);
        }
    }

    public C0280r0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1197o = 0;
        this.f1198p = 0;
        this.f1183a = toolbar;
        this.f1191i = toolbar.getTitle();
        this.f1192j = toolbar.getSubtitle();
        this.f1190h = this.f1191i != null;
        this.f1189g = toolbar.getNavigationIcon();
        C0278q0 a = C0278q0.m1271a(toolbar.getContext(), (AttributeSet) null, C4799j.ActionBar, C4790a.actionBarStyle, 0);
        this.f1199q = a.mo1719b(C4799j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e = a.mo1726e(C4799j.ActionBar_title);
            if (!TextUtils.isEmpty(e)) {
                setTitle(e);
            }
            CharSequence e2 = a.mo1726e(C4799j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e2)) {
                mo1746b(e2);
            }
            Drawable b = a.mo1719b(C4799j.ActionBar_logo);
            if (b != null) {
                mo1735a(b);
            }
            Drawable b2 = a.mo1719b(C4799j.ActionBar_icon);
            if (b2 != null) {
                setIcon(b2);
            }
            if (this.f1189g == null && (drawable = this.f1199q) != null) {
                mo1745b(drawable);
            }
            mo1734a(a.mo1723d(C4799j.ActionBar_displayOptions, 0));
            int g = a.mo1729g(C4799j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                mo1737a(LayoutInflater.from(this.f1183a.getContext()).inflate(g, this.f1183a, false));
                mo1734a(this.f1184b | 16);
            }
            int f = a.mo1727f(C4799j.ActionBar_height, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1183a.getLayoutParams();
                layoutParams.height = f;
                this.f1183a.setLayoutParams(layoutParams);
            }
            int b3 = a.mo1718b(C4799j.ActionBar_contentInsetStart, -1);
            int b4 = a.mo1718b(C4799j.ActionBar_contentInsetEnd, -1);
            if (b3 >= 0 || b4 >= 0) {
                this.f1183a.mo1304a(Math.max(b3, 0), Math.max(b4, 0));
            }
            int g2 = a.mo1729g(C4799j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f1183a;
                toolbar2.mo1308b(toolbar2.getContext(), g2);
            }
            int g3 = a.mo1729g(C4799j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f1183a;
                toolbar3.mo1305a(toolbar3.getContext(), g3);
            }
            int g4 = a.mo1729g(C4799j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f1183a.setPopupTheme(g4);
            }
        } else {
            this.f1184b = m1295o();
        }
        a.mo1720b();
        mo1751d(i);
        this.f1193k = this.f1183a.getNavigationContentDescription();
        this.f1183a.setNavigationOnClickListener(new C0281a());
    }

    /* renamed from: e */
    public void mo1753e(int i) {
        mo1740a((CharSequence) i == 0 ? null : getContext().getString(i));
    }

    public void setIcon(Drawable drawable) {
        this.f1187e = drawable;
        m1298r();
    }

    /* renamed from: a */
    public boolean mo1742a() {
        return this.f1183a.mo1350i();
    }

    /* renamed from: a */
    public void mo1736a(Menu menu, C0153m.C0154a aVar) {
        if (this.f1196n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1183a.getContext());
            this.f1196n = actionMenuPresenter;
            actionMenuPresenter.mo546a(C4795f.action_menu_presenter);
        }
        this.f1196n.mo551a(aVar);
        this.f1183a.mo1306a((C0138g) menu, this.f1196n);
    }

    /* renamed from: b */
    public void mo1744b(int i) {
        mo1735a(i != 0 ? C4800a.m7936c(getContext(), i) : null);
    }

    /* renamed from: c */
    public boolean mo1749c() {
        return this.f1183a.mo1309b();
    }

    /* renamed from: b */
    public void mo1743b() {
        this.f1195m = true;
    }

    /* renamed from: c */
    public void mo1748c(int i) {
        this.f1183a.setVisibility(i);
    }

    /* renamed from: d */
    public boolean mo1752d() {
        return this.f1183a.mo1349h();
    }

    /* renamed from: b */
    public void mo1747b(boolean z) {
        this.f1183a.setCollapsible(z);
    }

    /* renamed from: b */
    public void mo1745b(Drawable drawable) {
        this.f1189g = drawable;
        m1297q();
    }

    /* renamed from: a */
    public void mo1734a(int i) {
        View view;
        int i2 = this.f1184b ^ i;
        this.f1184b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1296p();
                }
                m1297q();
            }
            if ((i2 & 3) != 0) {
                m1298r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1183a.setTitle(this.f1191i);
                    this.f1183a.setSubtitle(this.f1192j);
                } else {
                    this.f1183a.setTitle((CharSequence) null);
                    this.f1183a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f1186d) != null) {
                if ((i & 16) != 0) {
                    this.f1183a.addView(view);
                } else {
                    this.f1183a.removeView(view);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1739a(C0259j0 j0Var) {
        Toolbar toolbar;
        View view = this.f1185c;
        if (view != null && view.getParent() == (toolbar = this.f1183a)) {
            toolbar.removeView(this.f1185c);
        }
        this.f1185c = j0Var;
        if (j0Var != null && this.f1197o == 2) {
            this.f1183a.addView(j0Var, 0);
            Toolbar.C0217e eVar = (Toolbar.C0217e) this.f1185c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f215a = 8388691;
            j0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo1737a(View view) {
        View view2 = this.f1186d;
        if (!(view2 == null || (this.f1184b & 16) == 0)) {
            this.f1183a.removeView(view2);
        }
        this.f1186d = view;
        if (view != null && (this.f1184b & 16) != 0) {
            this.f1183a.addView(view);
        }
    }

    /* renamed from: a */
    public C5086z mo1733a(int i, long j) {
        C5086z a = C5071v.m9151a(this.f1183a);
        a.mo17637a(i == 0 ? 1.0f : 0.0f);
        a.mo17638a(j);
        a.mo17640a((C5012a0) new C0282b(i));
        return a;
    }

    /* renamed from: a */
    public void mo1740a(CharSequence charSequence) {
        this.f1193k = charSequence;
        m1296p();
    }

    /* renamed from: a */
    public void mo1738a(C0153m.C0154a aVar, C0138g.C0139a aVar2) {
        this.f1183a.mo1307a(aVar, aVar2);
    }
}
