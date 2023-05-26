package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.widget.C0243f0;
import p050l.p051a.C4793d;
import p050l.p051a.C4796g;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.appcompat.view.menu.q */
/* compiled from: StandardMenuPopup */
final class C0159q extends C0150k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, C0153m, View.OnKeyListener {

    /* renamed from: A */
    private static final int f610A = C4796g.abc_popup_menu_item_layout;

    /* renamed from: g */
    private final Context f611g;

    /* renamed from: h */
    private final C0138g f612h;

    /* renamed from: i */
    private final C0137f f613i;

    /* renamed from: j */
    private final boolean f614j;

    /* renamed from: k */
    private final int f615k;

    /* renamed from: l */
    private final int f616l;

    /* renamed from: m */
    private final int f617m;

    /* renamed from: n */
    final C0243f0 f618n;

    /* renamed from: o */
    final ViewTreeObserver.OnGlobalLayoutListener f619o = new C0160a();

    /* renamed from: p */
    private final View.OnAttachStateChangeListener f620p = new C0161b();

    /* renamed from: q */
    private PopupWindow.OnDismissListener f621q;

    /* renamed from: r */
    private View f622r;

    /* renamed from: s */
    View f623s;

    /* renamed from: t */
    private C0153m.C0154a f624t;

    /* renamed from: u */
    ViewTreeObserver f625u;

    /* renamed from: v */
    private boolean f626v;

    /* renamed from: w */
    private boolean f627w;

    /* renamed from: x */
    private int f628x;

    /* renamed from: y */
    private int f629y = 0;

    /* renamed from: z */
    private boolean f630z;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    /* compiled from: StandardMenuPopup */
    class C0160a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0160a() {
        }

        public void onGlobalLayout() {
            if (C0159q.this.mo570a() && !C0159q.this.f618n.mo1513o()) {
                View view = C0159q.this.f623s;
                if (view == null || !view.isShown()) {
                    C0159q.this.dismiss();
                } else {
                    C0159q.this.f618n.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    /* compiled from: StandardMenuPopup */
    class C0161b implements View.OnAttachStateChangeListener {
        C0161b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0159q.this.f625u;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0159q.this.f625u = view.getViewTreeObserver();
                }
                C0159q qVar = C0159q.this;
                qVar.f625u.removeGlobalOnLayoutListener(qVar.f619o);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0159q(Context context, C0138g gVar, View view, int i, int i2, boolean z) {
        this.f611g = context;
        this.f612h = gVar;
        this.f614j = z;
        this.f613i = new C0137f(gVar, LayoutInflater.from(context), this.f614j, f610A);
        this.f616l = i;
        this.f617m = i2;
        Resources resources = context.getResources();
        this.f615k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C4793d.abc_config_prefDialogWidth));
        this.f622r = view;
        this.f618n = new C0243f0(this.f611g, (AttributeSet) null, this.f616l, this.f617m);
        gVar.mo621a((C0153m) this, context);
    }

    /* renamed from: g */
    private boolean m755g() {
        View view;
        if (mo570a()) {
            return true;
        }
        if (this.f626v || (view = this.f622r) == null) {
            return false;
        }
        this.f623s = view;
        this.f618n.mo1491a((PopupWindow.OnDismissListener) this);
        this.f618n.mo1490a((AdapterView.OnItemClickListener) this);
        this.f618n.mo1492a(true);
        View view2 = this.f623s;
        boolean z = this.f625u == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f625u = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f619o);
        }
        view2.addOnAttachStateChangeListener(this.f620p);
        this.f618n.mo1489a(view2);
        this.f618n.mo1500f(this.f629y);
        if (!this.f627w) {
            this.f628x = C0150k.m707a(this.f613i, (ViewGroup) null, this.f611g, this.f615k);
            this.f627w = true;
        }
        this.f618n.mo1498e(this.f628x);
        this.f618n.mo1502g(2);
        this.f618n.mo1487a(mo817f());
        this.f618n.show();
        ListView e = this.f618n.mo579e();
        e.setOnKeyListener(this);
        if (this.f630z && this.f612h.mo661h() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f611g).inflate(C4796g.abc_popup_menu_header_item_layout, e, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f612h.mo661h());
            }
            frameLayout.setEnabled(false);
            e.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f618n.mo1111a((ListAdapter) this.f613i);
        this.f618n.show();
        return true;
    }

    /* renamed from: a */
    public void mo565a(int i) {
        this.f629y = i;
    }

    /* renamed from: a */
    public void mo566a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo569a(C0138g gVar) {
    }

    /* renamed from: b */
    public void mo572b(boolean z) {
        this.f613i.mo602a(z);
    }

    /* renamed from: b */
    public boolean mo573b() {
        return false;
    }

    /* renamed from: c */
    public Parcelable mo574c() {
        return null;
    }

    /* renamed from: c */
    public void mo575c(int i) {
        this.f618n.mo1494b(i);
    }

    public void dismiss() {
        if (mo570a()) {
            this.f618n.dismiss();
        }
    }

    /* renamed from: e */
    public ListView mo579e() {
        return this.f618n.mo579e();
    }

    public void onDismiss() {
        this.f626v = true;
        this.f612h.close();
        ViewTreeObserver viewTreeObserver = this.f625u;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f625u = this.f623s.getViewTreeObserver();
            }
            this.f625u.removeGlobalOnLayoutListener(this.f619o);
            this.f625u = null;
        }
        this.f623s.removeOnAttachStateChangeListener(this.f620p);
        PopupWindow.OnDismissListener onDismissListener = this.f621q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        if (!m755g()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public boolean mo570a() {
        return !this.f626v && this.f618n.mo570a();
    }

    /* renamed from: b */
    public void mo571b(int i) {
        this.f618n.mo1486a(i);
    }

    /* renamed from: c */
    public void mo576c(boolean z) {
        this.f630z = z;
    }

    /* renamed from: a */
    public void mo552a(boolean z) {
        this.f627w = false;
        C0137f fVar = this.f613i;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo551a(C0153m.C0154a aVar) {
        this.f624t = aVar;
    }

    /* renamed from: a */
    public boolean mo556a(C0162r rVar) {
        if (rVar.hasVisibleItems()) {
            C0151l lVar = new C0151l(this.f611g, rVar, this.f623s, this.f614j, this.f616l, this.f617m);
            lVar.mo823a(this.f624t);
            lVar.mo824a(C0150k.m709b((C0138g) rVar));
            lVar.mo822a(this.f621q);
            this.f621q = null;
            this.f612h.mo623a(false);
            int b = this.f618n.mo1493b();
            int f = this.f618n.mo1499f();
            if ((Gravity.getAbsoluteGravity(this.f629y, C5071v.m9204p(this.f622r)) & 7) == 5) {
                b += this.f622r.getWidth();
            }
            if (lVar.mo825a(b, f)) {
                C0153m.C0154a aVar = this.f624t;
                if (aVar == null) {
                    return true;
                }
                aVar.mo350a(rVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo549a(C0138g gVar, boolean z) {
        if (gVar == this.f612h) {
            dismiss();
            C0153m.C0154a aVar = this.f624t;
            if (aVar != null) {
                aVar.mo349a(gVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo567a(View view) {
        this.f622r = view;
    }

    /* renamed from: a */
    public void mo568a(PopupWindow.OnDismissListener onDismissListener) {
        this.f621q = onDismissListener;
    }
}
