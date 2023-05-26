package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.material.internal.C8553c;
import com.google.android.material.internal.C8566j;
import com.google.android.material.theme.p190a.C8648a;
import java.util.ArrayList;
import java.util.List;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;

public class ChipGroup extends C8553c {

    /* renamed from: s */
    private static final int f24126s = C10583k.Widget_MaterialComponents_ChipGroup;

    /* renamed from: j */
    private int f24127j;

    /* renamed from: k */
    private int f24128k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f24129l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f24130m;

    /* renamed from: n */
    private C8480d f24131n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C8478b f24132o;

    /* renamed from: p */
    private C8481e f24133p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f24134q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f24135r;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    private class C8478b implements CompoundButton.OnCheckedChangeListener {
        private C8478b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f24135r) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.f24130m) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.f24134q == -1 || ChipGroup.this.f24134q == id || !ChipGroup.this.f24129l)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.m27465b(chipGroup.f24134q, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.f24134q == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                } else {
                    ChipGroup.this.m27465b(compoundButton.getId(), true);
                    ChipGroup.this.m27462a(compoundButton.getId(), false);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C8479c extends ViewGroup.MarginLayoutParams {
        public C8479c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C8479c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C8479c(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C8480d {
        /* renamed from: a */
        void mo31434a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    private class C8481e implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public ViewGroup.OnHierarchyChangeListener f24137f;

        private C8481e() {
        }

        public void onChildViewAdded(View view, View view2) {
            int i;
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        i = View.generateViewId();
                    } else {
                        i = view2.hashCode();
                    }
                    view2.setId(i);
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f24132o);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24137f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f24137f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        m27462a(i, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f24134q;
                if (i2 != -1 && this.f24129l) {
                    m27465b(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C8479c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C8479c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C8479c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f24129l) {
            return this.f24134q;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f24129l) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f24127j;
    }

    public int getChipSpacingVertical() {
        return this.f24128k;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f24134q;
        if (i != -1) {
            m27465b(i, true);
            setCheckedId(this.f24134q);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C5034c.m8990a(accessibilityNodeInfo).mo17512a((Object) C5034c.C5036b.m9068a(getRowCount(), mo31400a() ? getChipCount() : -1, false, mo31404c() ? 1 : 2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f24127j != i) {
            this.f24127j = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f24128k != i) {
            this.f24128k = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C8480d dVar) {
        this.f24131n = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f24133p.f24137f = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f24130m = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f24129l != z) {
            this.f24129l = z;
            mo31403b();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10574b.chipGroupStyle);
    }

    /* renamed from: c */
    public boolean mo31404c() {
        return this.f24129l;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C8479c(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(C8648a.m28241b(context, attributeSet, i, f24126s), attributeSet, i);
        this.f24132o = new C8478b();
        this.f24133p = new C8481e();
        this.f24134q = -1;
        this.f24135r = false;
        TypedArray c = C8566j.m27997c(getContext(), attributeSet, C10584l.ChipGroup, i, f24126s, new int[0]);
        int dimensionPixelOffset = c.getDimensionPixelOffset(C10584l.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(c.getDimensionPixelOffset(C10584l.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(c.getDimensionPixelOffset(C10584l.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(c.getBoolean(C10584l.ChipGroup_singleLine, false));
        setSingleSelection(c.getBoolean(C10584l.ChipGroup_singleSelection, false));
        setSelectionRequired(c.getBoolean(C10584l.ChipGroup_selectionRequired, false));
        int resourceId = c.getResourceId(C10584l.ChipGroup_checkedChip, -1);
        if (resourceId != -1) {
            this.f24134q = resourceId;
        }
        c.recycle();
        super.setOnHierarchyChangeListener(this.f24133p);
        C5071v.m9195h(this, 1);
    }

    /* renamed from: b */
    public void mo31403b() {
        this.f24135r = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f24135r = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27462a(int i, boolean z) {
        this.f24134q = i;
        C8480d dVar = this.f24131n;
        if (dVar != null && this.f24129l && z) {
            dVar.mo31434a(this, i);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* renamed from: a */
    public boolean mo31400a() {
        return super.mo31400a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m27465b(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f24135r = true;
            ((Chip) findViewById).setChecked(z);
            this.f24135r = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo31402b(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
