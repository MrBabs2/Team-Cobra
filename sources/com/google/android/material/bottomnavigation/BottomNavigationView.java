package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.widget.C0278q0;
import androidx.core.content.C0394a;
import androidx.core.graphics.drawable.C0414a;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C8566j;
import com.google.android.material.internal.C8567k;
import com.google.android.material.theme.p190a.C8648a;
import p050l.p051a.p058o.C4828g;
import p050l.p075h.p084l.C5020d0;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10575c;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p294w.C10620c;
import p112n.p277e.p279b.p282b.p295x.C10629b;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10642h;

public class BottomNavigationView extends FrameLayout {

    /* renamed from: m */
    private static final int f23915m = C10583k.Widget_Design_BottomNavigationView;

    /* renamed from: f */
    private final C0138g f23916f;

    /* renamed from: g */
    final C8453c f23917g;

    /* renamed from: h */
    private final BottomNavigationPresenter f23918h;

    /* renamed from: i */
    private ColorStateList f23919i;

    /* renamed from: j */
    private MenuInflater f23920j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C8449d f23921k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C8448c f23922l;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8445a();

        /* renamed from: h */
        Bundle f23923h;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$a */
        static class C8445a implements Parcelable.ClassLoaderCreator<SavedState> {
            C8445a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m27223a(Parcel parcel, ClassLoader classLoader) {
            this.f23923h = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f23923h);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m27223a(parcel, classLoader == null ? SavedState.class.getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    class C8446a implements C0138g.C0139a {
        C8446a() {
        }

        /* renamed from: a */
        public void mo317a(C0138g gVar) {
        }

        /* renamed from: a */
        public boolean mo320a(C0138g gVar, MenuItem menuItem) {
            if (BottomNavigationView.this.f23922l != null && menuItem.getItemId() == BottomNavigationView.this.getSelectedItemId()) {
                BottomNavigationView.this.f23922l.mo31010a(menuItem);
                return true;
            } else if (BottomNavigationView.this.f23921k == null || BottomNavigationView.this.f23921k.mo7896a(menuItem)) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    class C8447b implements C8567k.C8570c {
        C8447b() {
        }

        /* renamed from: a */
        public C5020d0 mo31009a(View view, C5020d0 d0Var, C8567k.C8571d dVar) {
            dVar.f24524d += d0Var.mo17478d();
            dVar.mo31953a(view);
            return d0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface C8448c {
        /* renamed from: a */
        void mo31010a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$d */
    public interface C8449d {
        /* renamed from: a */
        boolean mo7896a(MenuItem menuItem);
    }

    public BottomNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f23920j == null) {
            this.f23920j = new C4828g(getContext());
        }
        return this.f23920j;
    }

    public Drawable getItemBackground() {
        return this.f23917g.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f23917g.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f23917g.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f23917g.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f23919i;
    }

    public int getItemTextAppearanceActive() {
        return this.f23917g.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f23917g.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f23917g.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f23917g.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f23916f;
    }

    public int getSelectedItemId() {
        return this.f23917g.getSelectedItemId();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10642h.m36066a((View) this);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2480a());
        this.f23916f.mo639b(savedState.f23923h);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f23923h = bundle;
        this.f23916f.mo653d(bundle);
        return savedState;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C10642h.m36067a((View) this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f23917g.setItemBackground(drawable);
        this.f23919i = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f23917g.setItemBackgroundRes(i);
        this.f23919i = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f23917g.mo31036b() != z) {
            this.f23917g.setItemHorizontalTranslationEnabled(z);
            this.f23918h.mo552a(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f23917g.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f23917g.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f23919i != colorStateList) {
            this.f23919i = colorStateList;
            if (colorStateList == null) {
                this.f23917g.setItemBackground((Drawable) null);
                return;
            }
            ColorStateList a = C10629b.m35981a(colorStateList);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f23917g.setItemBackground(new RippleDrawable(a, (Drawable) null, (Drawable) null));
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(1.0E-5f);
            Drawable i = C0414a.m2029i(gradientDrawable);
            C0414a.m2014a(i, a);
            this.f23917g.setItemBackground(i);
        } else if (colorStateList == null && this.f23917g.getItemBackground() != null) {
            this.f23917g.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f23917g.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f23917g.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f23917g.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f23917g.getLabelVisibilityMode() != i) {
            this.f23917g.setLabelVisibilityMode(i);
            this.f23918h.mo552a(false);
        }
    }

    public void setOnNavigationItemReselectedListener(C8448c cVar) {
        this.f23922l = cVar;
    }

    public void setOnNavigationItemSelectedListener(C8449d dVar) {
        this.f23921k = dVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f23916f.findItem(i);
        if (findItem != null && !this.f23916f.mo625a(findItem, (C0153m) this.f23918h, 0)) {
            findItem.setChecked(true);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10574b.bottomNavigationStyle);
    }

    /* renamed from: a */
    private void m27218a() {
        C8567k.m28002a((View) this, (C8567k.C8570c) new C8447b());
    }

    /* renamed from: b */
    private C10638g m27221b(Context context) {
        C10638g gVar = new C10638g();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            gVar.mo36240a(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        gVar.mo36239a(context);
        return gVar;
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(C8648a.m28241b(context, attributeSet, i, f23915m), attributeSet, i);
        this.f23918h = new BottomNavigationPresenter();
        Context context2 = getContext();
        this.f23916f = new C8452b(context2);
        this.f23917g = new C8453c(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f23917g.setLayoutParams(layoutParams);
        this.f23918h.mo30969a(this.f23917g);
        this.f23918h.mo30968a(1);
        this.f23917g.setPresenter(this.f23918h);
        this.f23916f.mo620a((C0153m) this.f23918h);
        this.f23918h.mo547a(getContext(), this.f23916f);
        C0278q0 d = C8566j.m27998d(context2, attributeSet, C10584l.BottomNavigationView, i, C10583k.Widget_Design_BottomNavigationView, C10584l.BottomNavigationView_itemTextAppearanceInactive, C10584l.BottomNavigationView_itemTextAppearanceActive);
        if (d.mo1730g(C10584l.BottomNavigationView_itemIconTint)) {
            this.f23917g.setIconTintList(d.mo1713a(C10584l.BottomNavigationView_itemIconTint));
        } else {
            C8453c cVar = this.f23917g;
            cVar.setIconTintList(cVar.mo31033a(16842808));
        }
        setItemIconSize(d.mo1721c(C10584l.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(C10576d.design_bottom_navigation_icon_size)));
        if (d.mo1730g(C10584l.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(d.mo1729g(C10584l.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (d.mo1730g(C10584l.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(d.mo1729g(C10584l.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (d.mo1730g(C10584l.BottomNavigationView_itemTextColor)) {
            setItemTextColor(d.mo1713a(C10584l.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C5071v.m9161a((View) this, (Drawable) m27221b(context2));
        }
        if (d.mo1730g(C10584l.BottomNavigationView_elevation)) {
            C5071v.m9177b((View) this, (float) d.mo1721c(C10584l.BottomNavigationView_elevation, 0));
        }
        C0414a.m2014a(getBackground().mutate(), C10620c.m35958a(context2, d, C10584l.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(d.mo1725e(C10584l.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(d.mo1716a(C10584l.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int g = d.mo1729g(C10584l.BottomNavigationView_itemBackground, 0);
        if (g != 0) {
            this.f23917g.setItemBackgroundRes(g);
        } else {
            setItemRippleColor(C10620c.m35958a(context2, d, C10584l.BottomNavigationView_itemRippleColor));
        }
        if (d.mo1730g(C10584l.BottomNavigationView_menu)) {
            mo30975a(d.mo1729g(C10584l.BottomNavigationView_menu, 0));
        }
        d.mo1720b();
        addView(this.f23917g, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            m27219a(context2);
        }
        this.f23916f.mo619a((C0138g.C0139a) new C8446a());
        m27218a();
    }

    /* renamed from: a */
    public void mo30975a(int i) {
        this.f23918h.mo30970b(true);
        getMenuInflater().inflate(i, this.f23916f);
        this.f23918h.mo30970b(false);
        this.f23918h.mo552a(true);
    }

    /* renamed from: a */
    private void m27219a(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0394a.m1909a(context, C10575c.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C10576d.design_bottom_navigation_shadow_height)));
        addView(view);
    }
}
