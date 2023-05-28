package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0142i;
import androidx.appcompat.view.menu.C0155n;
import androidx.appcompat.widget.C0229c0;
import androidx.appcompat.widget.C0285s0;
import androidx.core.content.p003c.C0406f;
import androidx.core.graphics.drawable.C0414a;
import androidx.core.widget.C0436i;
import androidx.recyclerview.widget.RecyclerView;
import p050l.p051a.C4790a;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10577e;
import p112n.p277e.p279b.p282b.C10578f;
import p112n.p277e.p279b.p282b.C10580h;

public class NavigationMenuItemView extends C8554d implements C0155n.C0156a {

    /* renamed from: K */
    private static final int[] f24410K = {16842912};

    /* renamed from: A */
    private int f24411A;

    /* renamed from: B */
    private boolean f24412B;

    /* renamed from: C */
    boolean f24413C;

    /* renamed from: D */
    private final CheckedTextView f24414D;

    /* renamed from: E */
    private FrameLayout f24415E;

    /* renamed from: F */
    private C0142i f24416F;

    /* renamed from: G */
    private ColorStateList f24417G;

    /* renamed from: H */
    private boolean f24418H;

    /* renamed from: I */
    private Drawable f24419I;

    /* renamed from: J */
    private final C5010a f24420J;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C8547a extends C5010a {
        C8547a() {
        }

        /* renamed from: a */
        public void mo2445a(View view, C5034c cVar) {
            super.mo2445a(view, cVar);
            cVar.mo17522b(NavigationMenuItemView.this.f24413C);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    private void m27879d() {
        if (m27881f()) {
            this.f24414D.setVisibility(8);
            FrameLayout frameLayout = this.f24415E;
            if (frameLayout != null) {
                C0229c0.C0230a aVar = (C0229c0.C0230a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f24415E.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f24414D.setVisibility(0);
        FrameLayout frameLayout2 = this.f24415E;
        if (frameLayout2 != null) {
            C0229c0.C0230a aVar2 = (C0229c0.C0230a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f24415E.setLayoutParams(aVar2);
        }
    }

    /* renamed from: e */
    private StateListDrawable m27880e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C4790a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f24410K, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: f */
    private boolean m27881f() {
        return this.f24416F.getTitle() == null && this.f24416F.getIcon() == null && this.f24416F.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f24415E == null) {
                this.f24415E = (FrameLayout) ((ViewStub) findViewById(C10578f.design_menu_item_action_area_stub)).inflate();
            }
            this.f24415E.removeAllViews();
            this.f24415E.addView(view);
        }
    }

    /* renamed from: a */
    public void mo450a(C0142i iVar, int i) {
        this.f24416F = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C5071v.m9161a((View) this, (Drawable) m27880e());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        C0285s0.m1359a(this, iVar.getTooltipText());
        m27879d();
    }

    /* renamed from: c */
    public boolean mo453c() {
        return false;
    }

    public C0142i getItemData() {
        return this.f24416F;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0142i iVar = this.f24416F;
        if (iVar != null && iVar.isCheckable() && this.f24416F.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f24410K);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f24413C != z) {
            this.f24413C = z;
            this.f24420J.mo4267a((View) this.f24414D, (int) RecyclerView.C0638l.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f24414D.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f24418H) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0414a.m2029i(drawable).mutate();
                C0414a.m2014a(drawable, this.f24417G);
            }
            int i = this.f24411A;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f24412B) {
            if (this.f24419I == null) {
                Drawable a = C0406f.m1967a(getResources(), C10577e.navigation_empty_icon, getContext().getTheme());
                this.f24419I = a;
                if (a != null) {
                    int i2 = this.f24411A;
                    a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f24419I;
        }
        C0436i.m2149a(this.f24414D, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f24414D.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f24411A = i;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f24417G = colorStateList;
        this.f24418H = colorStateList != null;
        C0142i iVar = this.f24416F;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f24414D.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f24412B = z;
    }

    public void setTextAppearance(int i) {
        C0436i.m2158d(this.f24414D, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f24414D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f24414D.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24420J = new C8547a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(C10580h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C10576d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C10578f.design_menu_item_text);
        this.f24414D = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C5071v.m9165a((View) this.f24414D, this.f24420J);
    }
}
