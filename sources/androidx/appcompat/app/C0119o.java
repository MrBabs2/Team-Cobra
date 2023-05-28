package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0259j0;
import androidx.appcompat.widget.C0299x;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p050l.p051a.C4790a;
import p050l.p051a.C4795f;
import p050l.p051a.C4799j;
import p050l.p051a.p058o.C4820a;
import p050l.p051a.p058o.C4821b;
import p050l.p051a.p058o.C4828g;
import p050l.p051a.p058o.C4831h;
import p050l.p075h.p084l.C5012a0;
import p050l.p075h.p084l.C5016b0;
import p050l.p075h.p084l.C5018c0;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.C5086z;

/* renamed from: androidx.appcompat.app.o */
/* compiled from: WindowDecorActionBar */
public class C0119o extends C0069a implements ActionBarOverlayLayout.C0168d {

    /* renamed from: C */
    private static final Interpolator f366C = new AccelerateInterpolator();

    /* renamed from: D */
    private static final Interpolator f367D = new DecelerateInterpolator();

    /* renamed from: A */
    final C5012a0 f368A = new C0121b();

    /* renamed from: B */
    final C5018c0 f369B = new C0122c();

    /* renamed from: a */
    Context f370a;

    /* renamed from: b */
    private Context f371b;

    /* renamed from: c */
    private Activity f372c;

    /* renamed from: d */
    ActionBarOverlayLayout f373d;

    /* renamed from: e */
    ActionBarContainer f374e;

    /* renamed from: f */
    C0299x f375f;

    /* renamed from: g */
    ActionBarContextView f376g;

    /* renamed from: h */
    View f377h;

    /* renamed from: i */
    C0259j0 f378i;

    /* renamed from: j */
    private boolean f379j;

    /* renamed from: k */
    C0123d f380k;

    /* renamed from: l */
    C4821b f381l;

    /* renamed from: m */
    C4821b.C4822a f382m;

    /* renamed from: n */
    private boolean f383n;

    /* renamed from: o */
    private ArrayList<C0069a.C0071b> f384o = new ArrayList<>();

    /* renamed from: p */
    private boolean f385p;

    /* renamed from: q */
    private int f386q = 0;

    /* renamed from: r */
    boolean f387r = true;

    /* renamed from: s */
    boolean f388s;

    /* renamed from: t */
    boolean f389t;

    /* renamed from: u */
    private boolean f390u;

    /* renamed from: v */
    private boolean f391v = true;

    /* renamed from: w */
    C4831h f392w;

    /* renamed from: x */
    private boolean f393x;

    /* renamed from: y */
    boolean f394y;

    /* renamed from: z */
    final C5012a0 f395z = new C0120a();

    /* renamed from: androidx.appcompat.app.o$a */
    /* compiled from: WindowDecorActionBar */
    class C0120a extends C5016b0 {
        C0120a() {
        }

        public void onAnimationEnd(View view) {
            View view2;
            C0119o oVar = C0119o.this;
            if (oVar.f387r && (view2 = oVar.f377h) != null) {
                view2.setTranslationY(0.0f);
                C0119o.this.f374e.setTranslationY(0.0f);
            }
            C0119o.this.f374e.setVisibility(8);
            C0119o.this.f374e.setTransitioning(false);
            C0119o oVar2 = C0119o.this;
            oVar2.f392w = null;
            oVar2.mo431l();
            ActionBarOverlayLayout actionBarOverlayLayout = C0119o.this.f373d;
            if (actionBarOverlayLayout != null) {
                C5071v.m9145J(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.o$b */
    /* compiled from: WindowDecorActionBar */
    class C0121b extends C5016b0 {
        C0121b() {
        }

        public void onAnimationEnd(View view) {
            C0119o oVar = C0119o.this;
            oVar.f392w = null;
            oVar.f374e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.o$c */
    /* compiled from: WindowDecorActionBar */
    class C0122c implements C5018c0 {
        C0122c() {
        }

        /* renamed from: a */
        public void mo434a(View view) {
            ((View) C0119o.this.f374e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.o$d */
    /* compiled from: WindowDecorActionBar */
    public class C0123d extends C4821b implements C0138g.C0139a {

        /* renamed from: h */
        private final Context f399h;

        /* renamed from: i */
        private final C0138g f400i;

        /* renamed from: j */
        private C4821b.C4822a f401j;

        /* renamed from: k */
        private WeakReference<View> f402k;

        public C0123d(Context context, C4821b.C4822a aVar) {
            this.f399h = context;
            this.f401j = aVar;
            C0138g gVar = new C0138g(context);
            gVar.mo643c(1);
            this.f400i = gVar;
            gVar.mo619a((C0138g.C0139a) this);
        }

        /* renamed from: a */
        public void mo435a() {
            C0119o oVar = C0119o.this;
            if (oVar.f380k == this) {
                if (!C0119o.m461a(oVar.f388s, oVar.f389t, false)) {
                    C0119o oVar2 = C0119o.this;
                    oVar2.f381l = this;
                    oVar2.f382m = this.f401j;
                } else {
                    this.f401j.mo351a(this);
                }
                this.f401j = null;
                C0119o.this.mo427h(false);
                C0119o.this.f376g.mo897a();
                C0119o.this.f375f.mo1762k().sendAccessibilityEvent(32);
                C0119o oVar3 = C0119o.this;
                oVar3.f373d.setHideOnContentScrollEnabled(oVar3.f394y);
                C0119o.this.f380k = null;
            }
        }

        /* renamed from: b */
        public void mo442b(CharSequence charSequence) {
            C0119o.this.f376g.setTitle(charSequence);
        }

        /* renamed from: c */
        public Menu mo443c() {
            return this.f400i;
        }

        /* renamed from: d */
        public MenuInflater mo444d() {
            return new C4828g(this.f399h);
        }

        /* renamed from: e */
        public CharSequence mo445e() {
            return C0119o.this.f376g.getSubtitle();
        }

        /* renamed from: g */
        public CharSequence mo446g() {
            return C0119o.this.f376g.getTitle();
        }

        /* renamed from: i */
        public void mo447i() {
            if (C0119o.this.f380k == this) {
                this.f400i.mo678s();
                try {
                    this.f401j.mo354b(this, this.f400i);
                } finally {
                    this.f400i.mo675r();
                }
            }
        }

        /* renamed from: j */
        public boolean mo448j() {
            return C0119o.this.f376g.mo899b();
        }

        /* renamed from: k */
        public boolean mo449k() {
            this.f400i.mo678s();
            try {
                return this.f401j.mo352a((C4821b) this, (Menu) this.f400i);
            } finally {
                this.f400i.mo675r();
            }
        }

        /* renamed from: b */
        public void mo441b(int i) {
            mo442b((CharSequence) C0119o.this.f370a.getResources().getString(i));
        }

        /* renamed from: b */
        public View mo440b() {
            WeakReference<View> weakReference = this.f402k;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: a */
        public void mo437a(View view) {
            C0119o.this.f376g.setCustomView(view);
            this.f402k = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo438a(CharSequence charSequence) {
            C0119o.this.f376g.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo436a(int i) {
            mo438a((CharSequence) C0119o.this.f370a.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo439a(boolean z) {
            super.mo439a(z);
            C0119o.this.f376g.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo320a(C0138g gVar, MenuItem menuItem) {
            C4821b.C4822a aVar = this.f401j;
            if (aVar != null) {
                return aVar.mo353a((C4821b) this, menuItem);
            }
            return false;
        }

        /* renamed from: a */
        public void mo317a(C0138g gVar) {
            if (this.f401j != null) {
                mo447i();
                C0119o.this.f376g.mo901d();
            }
        }
    }

    public C0119o(Activity activity, boolean z) {
        new ArrayList();
        this.f372c = activity;
        View decorView = activity.getWindow().getDecorView();
        m462b(decorView);
        if (!z) {
            this.f377h = decorView.findViewById(16908290);
        }
    }

    /* renamed from: a */
    private C0299x m460a(View view) {
        if (view instanceof C0299x) {
            return (C0299x) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static boolean m461a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private void m462b(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C4795f.decor_content_parent);
        this.f373d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f375f = m460a(view.findViewById(C4795f.action_bar));
        this.f376g = (ActionBarContextView) view.findViewById(C4795f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C4795f.action_bar_container);
        this.f374e = actionBarContainer;
        C0299x xVar = this.f375f;
        if (xVar == null || this.f376g == null || actionBarContainer == null) {
            throw new IllegalStateException(C0119o.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f370a = xVar.getContext();
        boolean z = (this.f375f.mo1763l() & 4) != 0;
        if (z) {
            this.f379j = true;
        }
        C4820a a = C4820a.m8020a(this.f370a);
        mo191f(a.mo16770a() || z);
        m463l(a.mo16775f());
        TypedArray obtainStyledAttributes = this.f370a.obtainStyledAttributes((AttributeSet) null, C4799j.ActionBar, C4790a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C4799j.ActionBar_hideOnContentScroll, false)) {
            mo430k(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C4799j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo421a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: l */
    private void m463l(boolean z) {
        this.f385p = z;
        if (!z) {
            this.f375f.mo1739a((C0259j0) null);
            this.f374e.setTabContainer(this.f378i);
        } else {
            this.f374e.setTabContainer((C0259j0) null);
            this.f375f.mo1739a(this.f378i);
        }
        boolean z2 = true;
        boolean z3 = mo432m() == 2;
        C0259j0 j0Var = this.f378i;
        if (j0Var != null) {
            if (z3) {
                j0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f373d;
                if (actionBarOverlayLayout != null) {
                    C5071v.m9145J(actionBarOverlayLayout);
                }
            } else {
                j0Var.setVisibility(8);
            }
        }
        this.f375f.mo1747b(!this.f385p && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f373d;
        if (this.f385p || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: n */
    private void m465n() {
        if (this.f390u) {
            this.f390u = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f373d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m464m(false);
        }
    }

    /* renamed from: o */
    private boolean m466o() {
        return C5071v.m9140E(this.f374e);
    }

    /* renamed from: p */
    private void m467p() {
        if (!this.f390u) {
            this.f390u = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f373d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m464m(false);
        }
    }

    /* renamed from: b */
    public void mo424b() {
    }

    /* renamed from: c */
    public void mo425c() {
        if (!this.f389t) {
            this.f389t = true;
            m464m(true);
        }
    }

    /* renamed from: d */
    public void mo188d(boolean z) {
        mo422a(z ? 4 : 0, 4);
    }

    /* renamed from: e */
    public void mo189e(boolean z) {
        mo422a(z ? 2 : 0, 2);
    }

    /* renamed from: f */
    public void mo191f(boolean z) {
        this.f375f.mo1741a(z);
    }

    /* renamed from: g */
    public void mo194g(boolean z) {
        C4831h hVar;
        this.f393x = z;
        if (!z && (hVar = this.f392w) != null) {
            hVar.mo16821a();
        }
    }

    /* renamed from: h */
    public void mo427h(boolean z) {
        C5086z zVar;
        C5086z zVar2;
        if (z) {
            m467p();
        } else {
            m465n();
        }
        if (m466o()) {
            if (z) {
                zVar = this.f375f.mo1733a(4, 100);
                zVar2 = this.f376g.mo1413a(0, 200);
            } else {
                zVar2 = this.f375f.mo1733a(0, 200);
                zVar = this.f376g.mo1413a(8, 100);
            }
            C4831h hVar = new C4831h();
            hVar.mo16820a(zVar, zVar2);
            hVar.mo16823c();
        } else if (z) {
            this.f375f.mo1748c(4);
            this.f376g.setVisibility(0);
        } else {
            this.f375f.mo1748c(0);
            this.f376g.setVisibility(8);
        }
    }

    /* renamed from: i */
    public void mo428i(boolean z) {
        View view;
        C4831h hVar = this.f392w;
        if (hVar != null) {
            hVar.mo16821a();
        }
        if (this.f386q != 0 || (!this.f393x && !z)) {
            this.f395z.onAnimationEnd((View) null);
            return;
        }
        this.f374e.setAlpha(1.0f);
        this.f374e.setTransitioning(true);
        C4831h hVar2 = new C4831h();
        float f = (float) (-this.f374e.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f374e.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C5086z a = C5071v.m9151a(this.f374e);
        a.mo17644b(f);
        a.mo17641a(this.f369B);
        hVar2.mo16819a(a);
        if (this.f387r && (view = this.f377h) != null) {
            C5086z a2 = C5071v.m9151a(view);
            a2.mo17644b(f);
            hVar2.mo16819a(a2);
        }
        hVar2.mo16817a(f366C);
        hVar2.mo16816a(250);
        hVar2.mo16818a(this.f395z);
        this.f392w = hVar2;
        hVar2.mo16823c();
    }

    /* renamed from: j */
    public void mo429j(boolean z) {
        View view;
        View view2;
        C4831h hVar = this.f392w;
        if (hVar != null) {
            hVar.mo16821a();
        }
        this.f374e.setVisibility(0);
        if (this.f386q != 0 || (!this.f393x && !z)) {
            this.f374e.setAlpha(1.0f);
            this.f374e.setTranslationY(0.0f);
            if (this.f387r && (view = this.f377h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f368A.onAnimationEnd((View) null);
        } else {
            this.f374e.setTranslationY(0.0f);
            float f = (float) (-this.f374e.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f374e.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f374e.setTranslationY(f);
            C4831h hVar2 = new C4831h();
            C5086z a = C5071v.m9151a(this.f374e);
            a.mo17644b(0.0f);
            a.mo17641a(this.f369B);
            hVar2.mo16819a(a);
            if (this.f387r && (view2 = this.f377h) != null) {
                view2.setTranslationY(f);
                C5086z a2 = C5071v.m9151a(this.f377h);
                a2.mo17644b(0.0f);
                hVar2.mo16819a(a2);
            }
            hVar2.mo16817a(f367D);
            hVar2.mo16816a(250);
            hVar2.mo16818a(this.f368A);
            this.f392w = hVar2;
            hVar2.mo16823c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f373d;
        if (actionBarOverlayLayout != null) {
            C5071v.m9145J(actionBarOverlayLayout);
        }
    }

    /* renamed from: k */
    public void mo430k(boolean z) {
        if (!z || this.f373d.mo945i()) {
            this.f394y = z;
            this.f373d.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: m */
    public int mo432m() {
        return this.f375f.mo1761j();
    }

    public void onWindowVisibilityChanged(int i) {
        this.f386q = i;
    }

    /* renamed from: m */
    private void m464m(boolean z) {
        if (m461a(this.f388s, this.f389t, this.f390u)) {
            if (!this.f391v) {
                this.f391v = true;
                mo429j(z);
            }
        } else if (this.f391v) {
            this.f391v = false;
            mo428i(z);
        }
    }

    /* renamed from: d */
    public void mo426d() {
        C4831h hVar = this.f392w;
        if (hVar != null) {
            hVar.mo16821a();
            this.f392w = null;
        }
    }

    /* renamed from: f */
    public boolean mo192f() {
        C0299x xVar = this.f375f;
        if (xVar == null || !xVar.mo1759h()) {
            return false;
        }
        this.f375f.collapseActionView();
        return true;
    }

    /* renamed from: c */
    public void mo187c(boolean z) {
        if (!this.f379j) {
            mo188d(z);
        }
    }

    /* renamed from: g */
    public int mo193g() {
        return this.f375f.mo1763l();
    }

    /* renamed from: a */
    public void mo421a(float f) {
        C5071v.m9177b((View) this.f374e, f);
    }

    /* renamed from: a */
    public void mo181a(Configuration configuration) {
        m463l(C4820a.m8020a(this.f370a).mo16775f());
    }

    /* renamed from: a */
    public void mo182a(CharSequence charSequence) {
        this.f375f.setTitle(charSequence);
    }

    /* renamed from: a */
    public void mo422a(int i, int i2) {
        int l = this.f375f.mo1763l();
        if ((i2 & 4) != 0) {
            this.f379j = true;
        }
        this.f375f.mo1734a((i & i2) | ((i2 ^ -1) & l));
    }

    /* renamed from: a */
    public C4821b mo180a(C4821b.C4822a aVar) {
        C0123d dVar = this.f380k;
        if (dVar != null) {
            dVar.mo435a();
        }
        this.f373d.setHideOnContentScrollEnabled(false);
        this.f376g.mo900c();
        C0123d dVar2 = new C0123d(this.f376g.getContext(), aVar);
        if (!dVar2.mo449k()) {
            return null;
        }
        this.f380k = dVar2;
        dVar2.mo447i();
        this.f376g.mo898a(dVar2);
        mo427h(true);
        this.f376g.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo431l() {
        C4821b.C4822a aVar = this.f382m;
        if (aVar != null) {
            aVar.mo351a(this.f381l);
            this.f381l = null;
            this.f382m = null;
        }
    }

    public C0119o(Dialog dialog) {
        new ArrayList();
        m462b(dialog.getWindow().getDecorView());
    }

    /* renamed from: h */
    public Context mo195h() {
        if (this.f371b == null) {
            TypedValue typedValue = new TypedValue();
            this.f370a.getTheme().resolveAttribute(C4790a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f371b = new ContextThemeWrapper(this.f370a, i);
            } else {
                this.f371b = this.f370a;
            }
        }
        return this.f371b;
    }

    /* renamed from: b */
    public void mo186b(boolean z) {
        if (z != this.f383n) {
            this.f383n = z;
            int size = this.f384o.size();
            for (int i = 0; i < size; i++) {
                this.f384o.get(i).mo199a(z);
            }
        }
    }

    /* renamed from: a */
    public void mo423a(boolean z) {
        this.f387r = z;
    }

    /* renamed from: b */
    public void mo185b(CharSequence charSequence) {
        this.f375f.setWindowTitle(charSequence);
    }

    /* renamed from: a */
    public void mo420a() {
        if (this.f389t) {
            this.f389t = false;
            m464m(true);
        }
    }

    /* renamed from: a */
    public boolean mo183a(int i, KeyEvent keyEvent) {
        Menu c;
        C0123d dVar = this.f380k;
        if (dVar == null || (c = dVar.mo443c()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c.setQwertyMode(z);
        return c.performShortcut(i, keyEvent, 0);
    }
}
