package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p050l.p051a.C4795f;
import p050l.p051a.C4799j;
import p050l.p075h.p084l.C5071v;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: f */
    private boolean f636f;

    /* renamed from: g */
    private View f637g;

    /* renamed from: h */
    private View f638h;

    /* renamed from: i */
    private View f639i;

    /* renamed from: j */
    Drawable f640j;

    /* renamed from: k */
    Drawable f641k;

    /* renamed from: l */
    Drawable f642l;

    /* renamed from: m */
    boolean f643m;

    /* renamed from: n */
    boolean f644n;

    /* renamed from: o */
    private int f645o;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private int m783a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m784b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f640j;
        if (drawable != null && drawable.isStateful()) {
            this.f640j.setState(getDrawableState());
        }
        Drawable drawable2 = this.f641k;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f641k.setState(getDrawableState());
        }
        Drawable drawable3 = this.f642l;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f642l.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f637g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f640j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f641k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f642l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f638h = findViewById(C4795f.action_bar);
        this.f639i = findViewById(C4795f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f636f || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f637g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f643m) {
            Drawable drawable2 = this.f642l;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f640j != null) {
                if (this.f638h.getVisibility() == 0) {
                    this.f640j.setBounds(this.f638h.getLeft(), this.f638h.getTop(), this.f638h.getRight(), this.f638h.getBottom());
                } else {
                    View view2 = this.f639i;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f640j.setBounds(0, 0, 0, 0);
                    } else {
                        this.f640j.setBounds(this.f639i.getLeft(), this.f639i.getTop(), this.f639i.getRight(), this.f639i.getBottom());
                    }
                }
                z3 = true;
            }
            this.f644n = z4;
            if (!z4 || (drawable = this.f641k) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f638h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.f645o) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f638h != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f637g;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m784b(this.f638h)) {
                    i3 = m783a(this.f638h);
                } else {
                    i3 = !m784b(this.f639i) ? m783a(this.f639i) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m783a(this.f637g), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f640j;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f640j);
        }
        this.f640j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f638h;
            if (view != null) {
                this.f640j.setBounds(view.getLeft(), this.f638h.getTop(), this.f638h.getRight(), this.f638h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f643m ? !(this.f640j == null && this.f641k == null) : this.f642l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f642l;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f642l);
        }
        this.f642l = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f643m && (drawable2 = this.f642l) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f643m ? this.f640j == null && this.f641k == null : this.f642l == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f641k;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f641k);
        }
        this.f641k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f644n && (drawable2 = this.f641k) != null) {
                drawable2.setBounds(this.f637g.getLeft(), this.f637g.getTop(), this.f637g.getRight(), this.f637g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f643m ? !(this.f640j == null && this.f641k == null) : this.f642l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0259j0 j0Var) {
        View view = this.f637g;
        if (view != null) {
            removeView(view);
        }
        this.f637g = j0Var;
        if (j0Var != null) {
            addView(j0Var);
            ViewGroup.LayoutParams layoutParams = j0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            j0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f636f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f640j;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f641k;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f642l;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f640j && !this.f643m) || (drawable == this.f641k && this.f644n) || ((drawable == this.f642l && this.f643m) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5071v.m9161a((View) this, (Drawable) new C0224b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4799j.ActionBar);
        this.f640j = obtainStyledAttributes.getDrawable(C4799j.ActionBar_background);
        this.f641k = obtainStyledAttributes.getDrawable(C4799j.ActionBar_backgroundStacked);
        this.f645o = obtainStyledAttributes.getDimensionPixelSize(C4799j.ActionBar_height, -1);
        boolean z = true;
        if (getId() == C4795f.split_action_bar) {
            this.f643m = true;
            this.f642l = obtainStyledAttributes.getDrawable(C4799j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f643m ? !(this.f640j == null && this.f641k == null) : this.f642l != null) {
            z = false;
        }
        setWillNotDraw(z);
    }
}
