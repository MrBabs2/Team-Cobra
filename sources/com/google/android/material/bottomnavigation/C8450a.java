package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0142i;
import androidx.appcompat.view.menu.C0155n;
import androidx.appcompat.widget.C0285s0;
import androidx.core.content.C0394a;
import androidx.core.graphics.drawable.C0414a;
import androidx.core.widget.C0436i;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C8428a;
import p050l.p075h.p084l.C5069t;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10577e;
import p112n.p277e.p279b.p282b.C10578f;
import p112n.p277e.p279b.p282b.C10580h;
import p112n.p277e.p279b.p282b.C10582j;

/* renamed from: com.google.android.material.bottomnavigation.a */
/* compiled from: BottomNavigationItemView */
public class C8450a extends FrameLayout implements C0155n.C0156a {

    /* renamed from: u */
    private static final int[] f23926u = {16842912};

    /* renamed from: f */
    private final int f23927f;

    /* renamed from: g */
    private float f23928g;

    /* renamed from: h */
    private float f23929h;

    /* renamed from: i */
    private float f23930i;

    /* renamed from: j */
    private int f23931j;

    /* renamed from: k */
    private boolean f23932k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ImageView f23933l;

    /* renamed from: m */
    private final TextView f23934m;

    /* renamed from: n */
    private final TextView f23935n;

    /* renamed from: o */
    private int f23936o;

    /* renamed from: p */
    private C0142i f23937p;

    /* renamed from: q */
    private ColorStateList f23938q;

    /* renamed from: r */
    private Drawable f23939r;

    /* renamed from: s */
    private Drawable f23940s;

    /* renamed from: t */
    private BadgeDrawable f23941t;

    /* renamed from: com.google.android.material.bottomnavigation.a$a */
    /* compiled from: BottomNavigationItemView */
    class C8451a implements View.OnLayoutChangeListener {
        C8451a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C8450a.this.f23933l.getVisibility() == 0) {
                C8450a aVar = C8450a.this;
                aVar.m27238d(aVar.f23933l);
            }
        }
    }

    public C8450a(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private boolean m27236b() {
        return this.f23941t != null;
    }

    /* renamed from: c */
    private void m27237c(View view) {
        if (m27236b()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C8428a.m27116b(this.f23941t, view, m27229a(view));
            }
            this.f23941t = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m27238d(View view) {
        if (m27236b()) {
            C8428a.m27117c(this.f23941t, view, m27229a(view));
        }
    }

    /* renamed from: c */
    public boolean mo453c() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public BadgeDrawable getBadge() {
        return this.f23941t;
    }

    public C0142i getItemData() {
        return this.f23937p;
    }

    public int getItemPosition() {
        return this.f23936o;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0142i iVar = this.f23937p;
        if (iVar != null && iVar.isCheckable() && this.f23937p.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f23926u);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f23941t;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f23937p.getTitle();
            if (!TextUtils.isEmpty(this.f23937p.getContentDescription())) {
                title = this.f23937p.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.f23941t.mo30886b());
        }
        C5034c a = C5034c.m8990a(accessibilityNodeInfo);
        a.mo17521b((Object) C5034c.C5037c.m9069a(0, 1, getItemPosition(), 1, false, isSelected()));
        if (isSelected()) {
            a.mo17532d(false);
            a.mo17523b(C5034c.C5035a.f8900e);
        }
        a.mo17541g((CharSequence) getResources().getString(C10582j.item_view_role_description));
    }

    /* access modifiers changed from: package-private */
    public void setBadge(BadgeDrawable badgeDrawable) {
        this.f23941t = badgeDrawable;
        ImageView imageView = this.f23933l;
        if (imageView != null) {
            m27235b(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.f23935n;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f23935n;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f23934m;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f23934m;
        textView4.setPivotY((float) textView4.getBaseline());
        int i = this.f23931j;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m27233a(this.f23933l, this.f23927f, 49);
                    m27232a(this.f23935n, 1.0f, 1.0f, 0);
                } else {
                    m27233a(this.f23933l, this.f23927f, 17);
                    m27232a(this.f23935n, 0.5f, 0.5f, 4);
                }
                this.f23934m.setVisibility(4);
            } else if (i != 1) {
                if (i == 2) {
                    m27233a(this.f23933l, this.f23927f, 17);
                    this.f23935n.setVisibility(8);
                    this.f23934m.setVisibility(8);
                }
            } else if (z) {
                m27233a(this.f23933l, (int) (((float) this.f23927f) + this.f23928g), 49);
                m27232a(this.f23935n, 1.0f, 1.0f, 0);
                TextView textView5 = this.f23934m;
                float f = this.f23929h;
                m27232a(textView5, f, f, 4);
            } else {
                m27233a(this.f23933l, this.f23927f, 49);
                TextView textView6 = this.f23935n;
                float f2 = this.f23930i;
                m27232a(textView6, f2, f2, 4);
                m27232a(this.f23934m, 1.0f, 1.0f, 0);
            }
        } else if (this.f23932k) {
            if (z) {
                m27233a(this.f23933l, this.f23927f, 49);
                m27232a(this.f23935n, 1.0f, 1.0f, 0);
            } else {
                m27233a(this.f23933l, this.f23927f, 17);
                m27232a(this.f23935n, 0.5f, 0.5f, 4);
            }
            this.f23934m.setVisibility(4);
        } else if (z) {
            m27233a(this.f23933l, (int) (((float) this.f23927f) + this.f23928g), 49);
            m27232a(this.f23935n, 1.0f, 1.0f, 0);
            TextView textView7 = this.f23934m;
            float f3 = this.f23929h;
            m27232a(textView7, f3, f3, 4);
        } else {
            m27233a(this.f23933l, this.f23927f, 49);
            TextView textView8 = this.f23935n;
            float f4 = this.f23930i;
            m27232a(textView8, f4, f4, 4);
            m27232a(this.f23934m, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f23934m.setEnabled(z);
        this.f23935n.setEnabled(z);
        this.f23933l.setEnabled(z);
        if (z) {
            C5071v.m9170a((View) this, C5069t.m9134a(getContext(), 1002));
        } else {
            C5071v.m9170a((View) this, (C5069t) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.f23939r) {
            this.f23939r = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0414a.m2029i(drawable).mutate();
                this.f23940s = drawable;
                ColorStateList colorStateList = this.f23938q;
                if (colorStateList != null) {
                    C0414a.m2014a(drawable, colorStateList);
                }
            }
            this.f23933l.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23933l.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f23933l.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f23938q = colorStateList;
        if (this.f23937p != null && (drawable = this.f23940s) != null) {
            C0414a.m2014a(drawable, colorStateList);
            this.f23940s.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C0394a.m1917c(getContext(), i));
    }

    public void setItemPosition(int i) {
        this.f23936o = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f23931j != i) {
            this.f23931j = i;
            if (this.f23937p != null) {
                setChecked(this.f23937p.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f23932k != z) {
            this.f23932k = z;
            if (this.f23937p != null) {
                setChecked(this.f23937p.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        C0436i.m2158d(this.f23935n, i);
        m27231a(this.f23934m.getTextSize(), this.f23935n.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        C0436i.m2158d(this.f23934m, i);
        m27231a(this.f23934m.getTextSize(), this.f23935n.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f23934m.setTextColor(colorStateList);
            this.f23935n.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f23934m.setText(charSequence);
        this.f23935n.setText(charSequence);
        C0142i iVar = this.f23937p;
        if (iVar == null || TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0142i iVar2 = this.f23937p;
        if (iVar2 != null && !TextUtils.isEmpty(iVar2.getTooltipText())) {
            charSequence = this.f23937p.getTooltipText();
        }
        C0285s0.m1359a(this, charSequence);
    }

    public C8450a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m27235b(View view) {
        if (m27236b() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C8428a.m27115a(this.f23941t, view, m27229a(view));
        }
    }

    public C8450a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23936o = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(C10580h.design_bottom_navigation_item, this, true);
        setBackgroundResource(C10577e.design_bottom_navigation_item_background);
        this.f23927f = resources.getDimensionPixelSize(C10576d.design_bottom_navigation_margin);
        this.f23933l = (ImageView) findViewById(C10578f.icon);
        this.f23934m = (TextView) findViewById(C10578f.smallLabel);
        this.f23935n = (TextView) findViewById(C10578f.largeLabel);
        C5071v.m9195h(this.f23934m, 2);
        C5071v.m9195h(this.f23935n, 2);
        setFocusable(true);
        m27231a(this.f23934m.getTextSize(), this.f23935n.getTextSize());
        ImageView imageView = this.f23933l;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C8451a());
        }
    }

    /* renamed from: a */
    public void mo450a(C0142i iVar, int i) {
        CharSequence charSequence;
        this.f23937p = iVar;
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitle());
        setId(iVar.getItemId());
        if (!TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(iVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(iVar.getTooltipText())) {
            charSequence = iVar.getTooltipText();
        } else {
            charSequence = iVar.getTitle();
        }
        C0285s0.m1359a(this, charSequence);
        setVisibility(iVar.isVisible() ? 0 : 8);
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C5071v.m9161a((View) this, drawable);
    }

    /* renamed from: a */
    private void m27233a(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private void m27232a(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: a */
    private void m27231a(float f, float f2) {
        this.f23928g = f - f2;
        this.f23929h = (f2 * 1.0f) / f;
        this.f23930i = (f * 1.0f) / f2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31011a() {
        m27237c(this.f23933l);
    }

    /* renamed from: a */
    private FrameLayout m27229a(View view) {
        ImageView imageView = this.f23933l;
        if (view != imageView || !C8428a.f23847a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }
}
