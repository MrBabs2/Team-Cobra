package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10580h;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: z */
    private static final int[] f24580z = {C10574b.snackbarButtonStyle, C10574b.snackbarTextViewStyle};

    /* renamed from: w */
    private final AccessibilityManager f24581w;

    /* renamed from: x */
    private boolean f24582x;

    /* renamed from: y */
    private BaseTransientBottomBar.C8591r<Snackbar> f24583y;

    public static final class SnackbarLayout extends BaseTransientBottomBar.C8595v {
        public SnackbarLayout(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    class C8597a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ View.OnClickListener f24584f;

        C8597a(View.OnClickListener onClickListener) {
            this.f24584f = onClickListener;
        }

        public void onClick(View view) {
            this.f24584f.onClick(view);
            Snackbar.this.mo31958a(1);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$b */
    public static class C8598b extends BaseTransientBottomBar.C8591r<Snackbar> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        public void onDismissed(Snackbar snackbar, int i) {
        }

        public void onShown(Snackbar snackbar) {
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, C8599a aVar) {
        super(viewGroup, view, aVar);
        this.f24581w = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: a */
    public static Snackbar m28076a(View view, CharSequence charSequence, int i) {
        ViewGroup a = m28074a(view);
        if (a != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(a.getContext()).inflate(m28077a(a.getContext()) ? C10580h.mtrl_layout_snackbar_include : C10580h.design_layout_snackbar_include, a, false);
            Snackbar snackbar = new Snackbar(a, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo32013a(charSequence);
            snackbar.mo31965d(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: b */
    public void mo31960b() {
        super.mo31960b();
    }

    /* renamed from: d */
    public int mo31964d() {
        int d = super.mo31964d();
        if (d == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f24581w.getRecommendedTimeoutMillis(d, (this.f24582x ? 4 : 0) | 1 | 2);
        } else if (!this.f24582x || !this.f24581w.isTouchExplorationEnabled()) {
            return d;
        } else {
            return -2;
        }
    }

    /* renamed from: k */
    public void mo31972k() {
        super.mo31972k();
    }

    /* renamed from: a */
    private static boolean m28077a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f24580z);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1 || resourceId2 == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Snackbar m28075a(View view, int i, int i2) {
        return m28076a(view, view.getResources().getText(i), i2);
    }

    /* renamed from: a */
    private static ViewGroup m28074a(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    public Snackbar mo32013a(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f24532c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: a */
    public Snackbar mo32011a(int i, View.OnClickListener onClickListener) {
        mo32014a(mo31962c().getText(i), onClickListener);
        return this;
    }

    /* renamed from: a */
    public Snackbar mo32014a(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f24532c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener((View.OnClickListener) null);
            this.f24582x = false;
        } else {
            this.f24582x = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new C8597a(onClickListener));
        }
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public Snackbar mo32012a(C8598b bVar) {
        BaseTransientBottomBar.C8591r<Snackbar> rVar = this.f24583y;
        if (rVar != null) {
            mo31959b(rVar);
        }
        if (bVar != null) {
            mo31956a(bVar);
        }
        this.f24583y = bVar;
        return this;
    }
}
