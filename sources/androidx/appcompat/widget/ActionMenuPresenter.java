package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0127b;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0142i;
import androidx.appcompat.view.menu.C0151l;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.view.menu.C0155n;
import androidx.appcompat.view.menu.C0158p;
import androidx.appcompat.view.menu.C0162r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0414a;
import java.util.ArrayList;
import p050l.p051a.C4790a;
import p050l.p051a.C4796g;
import p050l.p051a.p058o.C4820a;
import p050l.p075h.p084l.C5013b;

class ActionMenuPresenter extends C0127b implements C5013b.C5014a {

    /* renamed from: A */
    private int f694A;

    /* renamed from: B */
    private final SparseBooleanArray f695B = new SparseBooleanArray();

    /* renamed from: C */
    C0176e f696C;

    /* renamed from: D */
    C0171a f697D;

    /* renamed from: E */
    C0173c f698E;

    /* renamed from: F */
    private C0172b f699F;

    /* renamed from: G */
    final C0177f f700G = new C0177f();

    /* renamed from: H */
    int f701H;

    /* renamed from: o */
    C0174d f702o;

    /* renamed from: p */
    private Drawable f703p;

    /* renamed from: q */
    private boolean f704q;

    /* renamed from: r */
    private boolean f705r;

    /* renamed from: s */
    private boolean f706s;

    /* renamed from: t */
    private int f707t;

    /* renamed from: u */
    private int f708u;

    /* renamed from: v */
    private int f709v;

    /* renamed from: w */
    private boolean f710w;

    /* renamed from: x */
    private boolean f711x;

    /* renamed from: y */
    private boolean f712y;

    /* renamed from: z */
    private boolean f713z;

    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0170a();

        /* renamed from: f */
        public int f714f;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        class C0170a implements Parcelable.Creator<SavedState> {
            C0170a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f714f);
        }

        SavedState(Parcel parcel) {
            this.f714f = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    private class C0171a extends C0151l {
        public C0171a(Context context, C0162r rVar, View view) {
            super(context, rVar, view, false, C4790a.actionOverflowMenuStyle);
            if (!((C0142i) rVar.getItem()).mo716h()) {
                View view2 = ActionMenuPresenter.this.f702o;
                mo821a(view2 == null ? (View) ActionMenuPresenter.this.f462m : view2);
            }
            mo823a((C0153m.C0154a) ActionMenuPresenter.this.f700G);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo828d() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f697D = null;
            actionMenuPresenter.f701H = 0;
            super.mo828d();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    private class C0172b extends ActionMenuItemView.C0125b {
        C0172b() {
        }

        /* renamed from: a */
        public C0158p mo471a() {
            C0171a aVar = ActionMenuPresenter.this.f697D;
            if (aVar != null) {
                return aVar.mo826b();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    private class C0173c implements Runnable {

        /* renamed from: f */
        private C0176e f717f;

        public C0173c(C0176e eVar) {
            this.f717f = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f457h != null) {
                ActionMenuPresenter.this.f457h.mo616a();
            }
            View view = (View) ActionMenuPresenter.this.f462m;
            if (!(view == null || view.getWindowToken() == null || !this.f717f.mo830f())) {
                ActionMenuPresenter.this.f696C = this.f717f;
            }
            ActionMenuPresenter.this.f698E = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    private class C0174d extends AppCompatImageView implements ActionMenuView.C0178a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        class C0175a extends C0225b0 {
            C0175a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            /* renamed from: a */
            public C0158p mo469a() {
                C0176e eVar = ActionMenuPresenter.this.f696C;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo826b();
            }

            /* renamed from: b */
            public boolean mo470b() {
                ActionMenuPresenter.this.mo989j();
                return true;
            }

            /* renamed from: c */
            public boolean mo997c() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f698E != null) {
                    return false;
                }
                actionMenuPresenter.mo985f();
                return true;
            }
        }

        public C0174d(Context context) {
            super(context, (AttributeSet) null, C4790a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0285s0.m1359a(this, getContentDescription());
            setOnTouchListener(new C0175a(this, ActionMenuPresenter.this));
        }

        /* renamed from: a */
        public boolean mo451a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo452b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo989j();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0414a.m2013a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    private class C0176e extends C0151l {
        public C0176e(Context context, C0138g gVar, View view, boolean z) {
            super(context, gVar, view, z, C4790a.actionOverflowMenuStyle);
            mo820a(8388613);
            mo823a((C0153m.C0154a) ActionMenuPresenter.this.f700G);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo828d() {
            if (ActionMenuPresenter.this.f457h != null) {
                ActionMenuPresenter.this.f457h.close();
            }
            ActionMenuPresenter.this.f696C = null;
            super.mo828d();
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C4796g.abc_action_menu_layout, C4796g.abc_action_menu_item_layout);
    }

    /* renamed from: h */
    public boolean mo987h() {
        return this.f698E != null || mo988i();
    }

    /* renamed from: i */
    public boolean mo988i() {
        C0176e eVar = this.f696C;
        return eVar != null && eVar.mo827c();
    }

    /* renamed from: j */
    public boolean mo989j() {
        C0138g gVar;
        if (!this.f705r || mo988i() || (gVar = this.f457h) == null || this.f462m == null || this.f698E != null || gVar.mo665j().isEmpty()) {
            return false;
        }
        C0173c cVar = new C0173c(new C0176e(this.f456g, this.f457h, this.f702o, true));
        this.f698E = cVar;
        ((View) this.f462m).post(cVar);
        return true;
    }

    /* renamed from: a */
    public void mo547a(Context context, C0138g gVar) {
        super.mo547a(context, gVar);
        Resources resources = context.getResources();
        C4820a a = C4820a.m8020a(context);
        if (!this.f706s) {
            this.f705r = a.mo16776g();
        }
        if (!this.f712y) {
            this.f707t = a.mo16771b();
        }
        if (!this.f710w) {
            this.f709v = a.mo16772c();
        }
        int i = this.f707t;
        if (this.f705r) {
            if (this.f702o == null) {
                C0174d dVar = new C0174d(this.f455f);
                this.f702o = dVar;
                if (this.f704q) {
                    dVar.setImageDrawable(this.f703p);
                    this.f703p = null;
                    this.f704q = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f702o.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f702o.getMeasuredWidth();
        } else {
            this.f702o = null;
        }
        this.f708u = i;
        this.f694A = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: b */
    public void mo981b(boolean z) {
        this.f713z = z;
    }

    /* renamed from: c */
    public void mo982c(boolean z) {
        this.f705r = z;
        this.f706s = true;
    }

    /* renamed from: d */
    public boolean mo983d() {
        return mo985f() | mo986g();
    }

    /* renamed from: e */
    public Drawable mo984e() {
        C0174d dVar = this.f702o;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f704q) {
            return this.f703p;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo985f() {
        C0155n nVar;
        C0173c cVar = this.f698E;
        if (cVar == null || (nVar = this.f462m) == null) {
            C0176e eVar = this.f696C;
            if (eVar == null) {
                return false;
            }
            eVar.mo819a();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.f698E = null;
        return true;
    }

    /* renamed from: g */
    public boolean mo986g() {
        C0171a aVar = this.f697D;
        if (aVar == null) {
            return false;
        }
        aVar.mo819a();
        return true;
    }

    /* renamed from: b */
    public C0155n mo557b(ViewGroup viewGroup) {
        C0155n nVar = this.f462m;
        C0155n b = super.mo557b(viewGroup);
        if (nVar != b) {
            ((ActionMenuView) b).setPresenter(this);
        }
        return b;
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    private class C0177f implements C0153m.C0154a {
        C0177f() {
        }

        /* renamed from: a */
        public boolean mo350a(C0138g gVar) {
            if (gVar == ActionMenuPresenter.this.f457h) {
                return false;
            }
            ActionMenuPresenter.this.f701H = ((C0162r) gVar).getItem().getItemId();
            C0153m.C0154a a = ActionMenuPresenter.this.mo544a();
            if (a != null) {
                return a.mo350a(gVar);
            }
            return false;
        }

        /* renamed from: a */
        public void mo349a(C0138g gVar, boolean z) {
            if (gVar instanceof C0162r) {
                gVar.mo668m().mo623a(false);
            }
            C0153m.C0154a a = ActionMenuPresenter.this.mo544a();
            if (a != null) {
                a.mo349a(gVar, z);
            }
        }
    }

    /* renamed from: c */
    public Parcelable mo574c() {
        SavedState savedState = new SavedState();
        savedState.f714f = this.f701H;
        return savedState;
    }

    /* renamed from: b */
    public boolean mo573b() {
        int i;
        ArrayList<C0142i> arrayList;
        int i2;
        int i3;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        C0138g gVar = actionMenuPresenter.f457h;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.mo669n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.f709v;
        int i7 = actionMenuPresenter.f708u;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f462m;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0142i iVar = arrayList.get(i10);
            if (iVar.mo724k()) {
                i8++;
            } else if (iVar.mo723j()) {
                i9++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.f713z && iVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.f705r && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f695B;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f711x) {
            int i12 = actionMenuPresenter.f694A;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0142i iVar2 = arrayList.get(i13);
            if (iVar2.mo724k()) {
                View a = actionMenuPresenter.mo543a(iVar2, view, viewGroup);
                if (actionMenuPresenter.f711x) {
                    i2 -= ActionMenuView.m864a(a, i3, i2, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.mo699d(true);
                i4 = i;
            } else if (iVar2.mo723j()) {
                int groupId2 = iVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!actionMenuPresenter.f711x || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View a2 = actionMenuPresenter.mo543a(iVar2, (View) null, viewGroup);
                    if (actionMenuPresenter.f711x) {
                        int a3 = ActionMenuView.m864a(a2, i3, i2, makeMeasureSpec, 0);
                        i2 -= a3;
                        if (a3 == 0) {
                            z4 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!actionMenuPresenter.f711x ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i13) {
                        C0142i iVar3 = arrayList.get(i15);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.mo716h()) {
                                i11++;
                            }
                            iVar3.mo699d(false);
                        }
                        i15++;
                    }
                }
                if (z3) {
                    i11--;
                }
                iVar2.mo699d(z3);
            } else {
                i4 = i;
                iVar2.mo699d(false);
                i13++;
                i = i4;
                view = null;
                i5 = 0;
                actionMenuPresenter = this;
            }
            i13++;
            i = i4;
            view = null;
            i5 = 0;
            actionMenuPresenter = this;
        }
        return true;
    }

    /* renamed from: a */
    public void mo978a(Configuration configuration) {
        if (!this.f710w) {
            this.f709v = C4820a.m8020a(this.f456g).mo16772c();
        }
        C0138g gVar = this.f457h;
        if (gVar != null) {
            gVar.mo641b(true);
        }
    }

    /* renamed from: a */
    public void mo979a(Drawable drawable) {
        C0174d dVar = this.f702o;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f704q = true;
        this.f703p = drawable;
    }

    /* renamed from: a */
    public View mo543a(C0142i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo702f()) {
            actionView = super.mo543a(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo550a(C0142i iVar, C0155n.C0156a aVar) {
        aVar.mo450a(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f462m);
        if (this.f699F == null) {
            this.f699F = new C0172b();
        }
        actionMenuItemView.setPopupCallback(this.f699F);
    }

    /* renamed from: a */
    public boolean mo553a(int i, C0142i iVar) {
        return iVar.mo716h();
    }

    /* renamed from: a */
    public void mo552a(boolean z) {
        C0155n nVar;
        super.mo552a(z);
        ((View) this.f462m).requestLayout();
        C0138g gVar = this.f457h;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<C0142i> c = gVar.mo644c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                C5013b a = c.get(i).mo488a();
                if (a != null) {
                    a.mo17468a((C5013b.C5014a) this);
                }
            }
        }
        C0138g gVar2 = this.f457h;
        ArrayList<C0142i> j = gVar2 != null ? gVar2.mo665j() : null;
        if (this.f705r && j != null) {
            int size2 = j.size();
            if (size2 == 1) {
                z2 = !j.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f702o == null) {
                this.f702o = new C0174d(this.f455f);
            }
            ViewGroup viewGroup = (ViewGroup) this.f702o.getParent();
            if (viewGroup != this.f462m) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f702o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f462m;
                actionMenuView.addView(this.f702o, actionMenuView.mo1003e());
            }
        } else {
            C0174d dVar = this.f702o;
            if (dVar != null && dVar.getParent() == (nVar = this.f462m)) {
                ((ViewGroup) nVar).removeView(this.f702o);
            }
        }
        ((ActionMenuView) this.f462m).setOverflowReserved(this.f705r);
    }

    /* renamed from: a */
    public boolean mo554a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f702o) {
            return false;
        }
        return super.mo554a(viewGroup, i);
    }

    /* renamed from: a */
    public boolean mo556a(C0162r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        C0162r rVar2 = rVar;
        while (rVar2.mo869t() != this.f457h) {
            rVar2 = (C0162r) rVar2.mo869t();
        }
        View a = m822a(rVar2.getItem());
        if (a == null) {
            return false;
        }
        this.f701H = rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0171a aVar = new C0171a(this.f456g, rVar, a);
        this.f697D = aVar;
        aVar.mo824a(z);
        this.f697D.mo829e();
        super.mo556a(rVar);
        return true;
    }

    /* renamed from: a */
    private View m822a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f462m;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0155n.C0156a) && ((C0155n.C0156a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo549a(C0138g gVar, boolean z) {
        mo983d();
        super.mo549a(gVar, z);
    }

    /* renamed from: a */
    public void mo566a(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f714f) > 0 && (findItem = this.f457h.findItem(i)) != null) {
            mo556a((C0162r) findItem.getSubMenu());
        }
    }

    /* renamed from: a */
    public void mo980a(ActionMenuView actionMenuView) {
        this.f462m = actionMenuView;
        actionMenuView.mo472a(this.f457h);
    }
}
