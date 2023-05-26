package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0153m;
import p050l.p051a.C4790a;
import p050l.p051a.C4795f;
import p050l.p051a.C4796g;
import p050l.p051a.C4799j;
import p050l.p051a.p058o.C4821b;
import p050l.p075h.p084l.C5071v;

public class ActionBarContextView extends C0220a {

    /* renamed from: n */
    private CharSequence f646n;

    /* renamed from: o */
    private CharSequence f647o;

    /* renamed from: p */
    private View f648p;

    /* renamed from: q */
    private View f649q;

    /* renamed from: r */
    private LinearLayout f650r;

    /* renamed from: s */
    private TextView f651s;

    /* renamed from: t */
    private TextView f652t;

    /* renamed from: u */
    private int f653u;

    /* renamed from: v */
    private int f654v;

    /* renamed from: w */
    private boolean f655w;

    /* renamed from: x */
    private int f656x;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0164a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C4821b f657f;

        C0164a(C4821b bVar) {
            this.f657f = bVar;
        }

        public void onClick(View view) {
            this.f657f.mo435a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    private void m785e() {
        if (this.f650r == null) {
            LayoutInflater.from(getContext()).inflate(C4796g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f650r = linearLayout;
            this.f651s = (TextView) linearLayout.findViewById(C4795f.action_bar_title);
            this.f652t = (TextView) this.f650r.findViewById(C4795f.action_bar_subtitle);
            if (this.f653u != 0) {
                this.f651s.setTextAppearance(getContext(), this.f653u);
            }
            if (this.f654v != 0) {
                this.f652t.setTextAppearance(getContext(), this.f654v);
            }
        }
        this.f651s.setText(this.f646n);
        this.f652t.setText(this.f647o);
        boolean z = !TextUtils.isEmpty(this.f646n);
        boolean z2 = !TextUtils.isEmpty(this.f647o);
        int i = 0;
        this.f652t.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f650r;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f650r.getParent() == null) {
            addView(this.f650r);
        }
    }

    /* renamed from: b */
    public boolean mo899b() {
        return this.f655w;
    }

    /* renamed from: c */
    public void mo900c() {
        removeAllViews();
        this.f649q = null;
        this.f967h = null;
    }

    /* renamed from: d */
    public boolean mo901d() {
        ActionMenuPresenter actionMenuPresenter = this.f968i;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo989j();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f647o;
    }

    public CharSequence getTitle() {
        return this.f646n;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f968i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo985f();
            this.f968i.mo986g();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f646n);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = C0298w0.m1423a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f648p;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f648p.getLayoutParams();
            int i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = C0220a.m1045a(paddingRight, i5, a);
            paddingRight = C0220a.m1045a(a2 + mo1412a(this.f648p, a2, paddingTop, paddingTop2, a), i6, a);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f650r;
        if (!(linearLayout == null || this.f649q != null || linearLayout.getVisibility() == 8)) {
            i7 += mo1412a(this.f650r, i7, paddingTop, paddingTop2, a);
        }
        int i8 = i7;
        View view2 = this.f649q;
        if (view2 != null) {
            mo1412a(view2, i8, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f967h;
        if (actionMenuView != null) {
            mo1412a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f969j;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f648p;
            if (view != null) {
                int a = mo1411a(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f648p.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f967h;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1411a(this.f967h, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f650r;
            if (linearLayout != null && this.f649q == null) {
                if (this.f655w) {
                    this.f650r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f650r.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f650r.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1411a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f649q;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f649q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f969j <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.f969j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f649q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f649q = view;
        if (!(view == null || (linearLayout = this.f650r) == null)) {
            removeView(linearLayout);
            this.f650r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f647o = charSequence;
        m785e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f646n = charSequence;
        m785e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f655w) {
            requestLayout();
        }
        this.f655w = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.actionModeStyle);
    }

    /* renamed from: a */
    public void mo898a(C4821b bVar) {
        View view = this.f648p;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f656x, this, false);
            this.f648p = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f648p);
        }
        this.f648p.findViewById(C4795f.action_mode_close_button).setOnClickListener(new C0164a(bVar));
        C0138g gVar = (C0138g) bVar.mo443c();
        ActionMenuPresenter actionMenuPresenter = this.f968i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo983d();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f968i = actionMenuPresenter2;
        actionMenuPresenter2.mo982c(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.mo621a((C0153m) this.f968i, this.f966g);
        ActionMenuView actionMenuView = (ActionMenuView) this.f968i.mo557b((ViewGroup) this);
        this.f967h = actionMenuView;
        C5071v.m9161a((View) actionMenuView, (Drawable) null);
        addView(this.f967h, layoutParams);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0278q0 a = C0278q0.m1271a(context, attributeSet, C4799j.ActionMode, i, 0);
        C5071v.m9161a((View) this, a.mo1719b(C4799j.ActionMode_background));
        this.f653u = a.mo1729g(C4799j.ActionMode_titleTextStyle, 0);
        this.f654v = a.mo1729g(C4799j.ActionMode_subtitleTextStyle, 0);
        this.f969j = a.mo1727f(C4799j.ActionMode_height, 0);
        this.f656x = a.mo1729g(C4799j.ActionMode_closeItemLayout, C4796g.abc_action_mode_close_item_material);
        a.mo1720b();
    }

    /* renamed from: a */
    public void mo897a() {
        if (this.f648p == null) {
            mo900c();
        }
    }
}
