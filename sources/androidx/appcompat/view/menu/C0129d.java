package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.widget.C0241e0;
import androidx.appcompat.widget.C0243f0;
import java.util.ArrayList;
import java.util.List;
import p050l.p051a.C4793d;
import p050l.p051a.C4796g;
import p050l.p075h.p084l.C5019d;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.appcompat.view.menu.d */
/* compiled from: CascadingMenuPopup */
final class C0129d extends C0150k implements C0153m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: G */
    private static final int f467G = C4796g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private boolean f468A;

    /* renamed from: B */
    private boolean f469B;

    /* renamed from: C */
    private C0153m.C0154a f470C;

    /* renamed from: D */
    ViewTreeObserver f471D;

    /* renamed from: E */
    private PopupWindow.OnDismissListener f472E;

    /* renamed from: F */
    boolean f473F;

    /* renamed from: g */
    private final Context f474g;

    /* renamed from: h */
    private final int f475h;

    /* renamed from: i */
    private final int f476i;

    /* renamed from: j */
    private final int f477j;

    /* renamed from: k */
    private final boolean f478k;

    /* renamed from: l */
    final Handler f479l;

    /* renamed from: m */
    private final List<C0138g> f480m = new ArrayList();

    /* renamed from: n */
    final List<C0134d> f481n = new ArrayList();

    /* renamed from: o */
    final ViewTreeObserver.OnGlobalLayoutListener f482o = new C0130a();

    /* renamed from: p */
    private final View.OnAttachStateChangeListener f483p = new C0131b();

    /* renamed from: q */
    private final C0241e0 f484q = new C0132c();

    /* renamed from: r */
    private int f485r = 0;

    /* renamed from: s */
    private int f486s = 0;

    /* renamed from: t */
    private View f487t;

    /* renamed from: u */
    View f488u;

    /* renamed from: v */
    private int f489v;

    /* renamed from: w */
    private boolean f490w;

    /* renamed from: x */
    private boolean f491x;

    /* renamed from: y */
    private int f492y;

    /* renamed from: z */
    private int f493z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    /* compiled from: CascadingMenuPopup */
    class C0130a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0130a() {
        }

        public void onGlobalLayout() {
            if (C0129d.this.mo570a() && C0129d.this.f481n.size() > 0 && !C0129d.this.f481n.get(0).f501a.mo1513o()) {
                View view = C0129d.this.f488u;
                if (view == null || !view.isShown()) {
                    C0129d.this.dismiss();
                    return;
                }
                for (C0134d dVar : C0129d.this.f481n) {
                    dVar.f501a.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    /* compiled from: CascadingMenuPopup */
    class C0131b implements View.OnAttachStateChangeListener {
        C0131b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0129d.this.f471D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0129d.this.f471D = view.getViewTreeObserver();
                }
                C0129d dVar = C0129d.this;
                dVar.f471D.removeGlobalOnLayoutListener(dVar.f482o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    /* compiled from: CascadingMenuPopup */
    class C0132c implements C0241e0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        /* compiled from: CascadingMenuPopup */
        class C0133a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C0134d f497f;

            /* renamed from: g */
            final /* synthetic */ MenuItem f498g;

            /* renamed from: h */
            final /* synthetic */ C0138g f499h;

            C0133a(C0134d dVar, MenuItem menuItem, C0138g gVar) {
                this.f497f = dVar;
                this.f498g = menuItem;
                this.f499h = gVar;
            }

            public void run() {
                C0134d dVar = this.f497f;
                if (dVar != null) {
                    C0129d.this.f473F = true;
                    dVar.f502b.mo623a(false);
                    C0129d.this.f473F = false;
                }
                if (this.f498g.isEnabled() && this.f498g.hasSubMenu()) {
                    this.f499h.mo624a(this.f498g, 4);
                }
            }
        }

        C0132c() {
        }

        /* renamed from: a */
        public void mo586a(C0138g gVar, MenuItem menuItem) {
            C0134d dVar = null;
            C0129d.this.f479l.removeCallbacksAndMessages((Object) null);
            int size = C0129d.this.f481n.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == C0129d.this.f481n.get(i).f502b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0129d.this.f481n.size()) {
                    dVar = C0129d.this.f481n.get(i2);
                }
                C0129d.this.f479l.postAtTime(new C0133a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: b */
        public void mo587b(C0138g gVar, MenuItem menuItem) {
            C0129d.this.f479l.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* compiled from: CascadingMenuPopup */
    private static class C0134d {

        /* renamed from: a */
        public final C0243f0 f501a;

        /* renamed from: b */
        public final C0138g f502b;

        /* renamed from: c */
        public final int f503c;

        public C0134d(C0243f0 f0Var, C0138g gVar, int i) {
            this.f501a = f0Var;
            this.f502b = gVar;
            this.f503c = i;
        }

        /* renamed from: a */
        public ListView mo589a() {
            return this.f501a.mo579e();
        }
    }

    public C0129d(Context context, View view, int i, int i2, boolean z) {
        this.f474g = context;
        this.f487t = view;
        this.f476i = i;
        this.f477j = i2;
        this.f478k = z;
        this.f468A = false;
        this.f489v = m563h();
        Resources resources = context.getResources();
        this.f475h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C4793d.abc_config_prefDialogWidth));
        this.f479l = new Handler();
    }

    /* renamed from: c */
    private int m559c(C0138g gVar) {
        int size = this.f481n.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.f481n.get(i).f502b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private int m560d(int i) {
        List<C0134d> list = this.f481n;
        ListView a = list.get(list.size() - 1).mo589a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f488u.getWindowVisibleDisplayFrame(rect);
        if (this.f489v == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: g */
    private C0243f0 m562g() {
        C0243f0 f0Var = new C0243f0(this.f474g, (AttributeSet) null, this.f476i, this.f477j);
        f0Var.mo1536a(this.f484q);
        f0Var.mo1490a((AdapterView.OnItemClickListener) this);
        f0Var.mo1491a((PopupWindow.OnDismissListener) this);
        f0Var.mo1489a(this.f487t);
        f0Var.mo1500f(this.f486s);
        f0Var.mo1492a(true);
        f0Var.mo1502g(2);
        return f0Var;
    }

    /* renamed from: h */
    private int m563h() {
        return C5071v.m9204p(this.f487t) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo566a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo569a(C0138g gVar) {
        gVar.mo621a((C0153m) this, this.f474g);
        if (mo570a()) {
            m561d(gVar);
        } else {
            this.f480m.add(gVar);
        }
    }

    /* renamed from: b */
    public void mo572b(boolean z) {
        this.f468A = z;
    }

    /* renamed from: b */
    public boolean mo573b() {
        return false;
    }

    /* renamed from: c */
    public Parcelable mo574c() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo577d() {
        return false;
    }

    public void dismiss() {
        int size = this.f481n.size();
        if (size > 0) {
            C0134d[] dVarArr = (C0134d[]) this.f481n.toArray(new C0134d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0134d dVar = dVarArr[i];
                if (dVar.f501a.mo570a()) {
                    dVar.f501a.dismiss();
                }
            }
        }
    }

    /* renamed from: e */
    public ListView mo579e() {
        if (this.f481n.isEmpty()) {
            return null;
        }
        List<C0134d> list = this.f481n;
        return list.get(list.size() - 1).mo589a();
    }

    public void onDismiss() {
        C0134d dVar;
        int size = this.f481n.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f481n.get(i);
            if (!dVar.f501a.mo570a()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f502b.mo623a(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void show() {
        if (!mo570a()) {
            for (C0138g d : this.f480m) {
                m561d(d);
            }
            this.f480m.clear();
            View view = this.f487t;
            this.f488u = view;
            if (view != null) {
                boolean z = this.f471D == null;
                ViewTreeObserver viewTreeObserver = this.f488u.getViewTreeObserver();
                this.f471D = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f482o);
                }
                this.f488u.addOnAttachStateChangeListener(this.f483p);
            }
        }
    }

    /* renamed from: b */
    public void mo571b(int i) {
        this.f490w = true;
        this.f492y = i;
    }

    /* renamed from: c */
    public void mo575c(int i) {
        this.f491x = true;
        this.f493z = i;
    }

    /* renamed from: a */
    private MenuItem m557a(C0138g gVar, C0138g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo576c(boolean z) {
        this.f469B = z;
    }

    /* renamed from: a */
    private View m558a(C0134d dVar, C0138g gVar) {
        int i;
        C0137f fVar;
        int firstVisiblePosition;
        MenuItem a = m557a(dVar.f502b, gVar);
        if (a == null) {
            return null;
        }
        ListView a2 = dVar.mo589a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0137f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0137f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a2.getChildCount()) {
            return a2.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: d */
    private void m561d(C0138g gVar) {
        View view;
        C0134d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f474g);
        C0137f fVar = new C0137f(gVar, from, this.f478k, f467G);
        if (!mo570a() && this.f468A) {
            fVar.mo602a(true);
        } else if (mo570a()) {
            fVar.mo602a(C0150k.m709b(gVar));
        }
        int a = C0150k.m707a(fVar, (ViewGroup) null, this.f474g, this.f475h);
        C0243f0 g = m562g();
        g.mo1111a((ListAdapter) fVar);
        g.mo1498e(a);
        g.mo1500f(this.f486s);
        if (this.f481n.size() > 0) {
            List<C0134d> list = this.f481n;
            dVar = list.get(list.size() - 1);
            view = m558a(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            g.mo1539c(false);
            g.mo1537a((Object) null);
            int d = m560d(a);
            boolean z = d == 1;
            this.f489v = d;
            if (Build.VERSION.SDK_INT >= 26) {
                g.mo1489a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f487t.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f486s & 7) == 5) {
                    iArr[0] = iArr[0] + this.f487t.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f486s & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                g.mo1486a(i3);
                g.mo1495b(true);
                g.mo1494b(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                g.mo1486a(i3);
                g.mo1495b(true);
                g.mo1494b(i2);
            }
            i3 = i + a;
            g.mo1486a(i3);
            g.mo1495b(true);
            g.mo1494b(i2);
        } else {
            if (this.f490w) {
                g.mo1486a(this.f492y);
            }
            if (this.f491x) {
                g.mo1494b(this.f493z);
            }
            g.mo1487a(mo817f());
        }
        this.f481n.add(new C0134d(g, gVar, this.f489v));
        g.show();
        ListView e = g.mo579e();
        e.setOnKeyListener(this);
        if (dVar == null && this.f469B && gVar.mo661h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C4796g.abc_popup_menu_header_item_layout, e, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.mo661h());
            e.addHeaderView(frameLayout, (Object) null, false);
            g.show();
        }
    }

    /* renamed from: a */
    public boolean mo570a() {
        return this.f481n.size() > 0 && this.f481n.get(0).f501a.mo570a();
    }

    /* renamed from: a */
    public void mo552a(boolean z) {
        for (C0134d a : this.f481n) {
            C0150k.m708a(a.mo589a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo551a(C0153m.C0154a aVar) {
        this.f470C = aVar;
    }

    /* renamed from: a */
    public boolean mo556a(C0162r rVar) {
        for (C0134d next : this.f481n) {
            if (rVar == next.f502b) {
                next.mo589a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        mo569a((C0138g) rVar);
        C0153m.C0154a aVar = this.f470C;
        if (aVar != null) {
            aVar.mo350a(rVar);
        }
        return true;
    }

    /* renamed from: a */
    public void mo549a(C0138g gVar, boolean z) {
        int c = m559c(gVar);
        if (c >= 0) {
            int i = c + 1;
            if (i < this.f481n.size()) {
                this.f481n.get(i).f502b.mo623a(false);
            }
            C0134d remove = this.f481n.remove(c);
            remove.f502b.mo640b((C0153m) this);
            if (this.f473F) {
                remove.f501a.mo1538b((Object) null);
                remove.f501a.mo1497d(0);
            }
            remove.f501a.dismiss();
            int size = this.f481n.size();
            if (size > 0) {
                this.f489v = this.f481n.get(size - 1).f503c;
            } else {
                this.f489v = m563h();
            }
            if (size == 0) {
                dismiss();
                C0153m.C0154a aVar = this.f470C;
                if (aVar != null) {
                    aVar.mo349a(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f471D;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f471D.removeGlobalOnLayoutListener(this.f482o);
                    }
                    this.f471D = null;
                }
                this.f488u.removeOnAttachStateChangeListener(this.f483p);
                this.f472E.onDismiss();
            } else if (z) {
                this.f481n.get(0).f502b.mo623a(false);
            }
        }
    }

    /* renamed from: a */
    public void mo565a(int i) {
        if (this.f485r != i) {
            this.f485r = i;
            this.f486s = C5019d.m8933a(i, C5071v.m9204p(this.f487t));
        }
    }

    /* renamed from: a */
    public void mo567a(View view) {
        if (this.f487t != view) {
            this.f487t = view;
            this.f486s = C5019d.m8933a(this.f485r, C5071v.m9204p(view));
        }
    }

    /* renamed from: a */
    public void mo568a(PopupWindow.OnDismissListener onDismissListener) {
        this.f472E = onDismissListener;
    }
}
