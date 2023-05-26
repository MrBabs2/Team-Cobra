package com.google.android.material.bottomnavigation;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0142i;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.view.menu.C0155n;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C8564i;
import java.util.HashSet;
import p050l.p051a.C4790a;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p083k.C5005e;
import p050l.p075h.p083k.C5007g;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p050l.p091k.p092a.p093a.C5109b;
import p050l.p108s.C5203b;
import p050l.p108s.C5247m;
import p050l.p108s.C5256o;
import p050l.p108s.C5260q;
import p112n.p277e.p279b.p282b.C10576d;

/* renamed from: com.google.android.material.bottomnavigation.c */
/* compiled from: BottomNavigationMenuView */
public class C8453c extends ViewGroup implements C0155n {

    /* renamed from: E */
    private static final int[] f23943E = {16842912};

    /* renamed from: F */
    private static final int[] f23944F = {-16842910};

    /* renamed from: A */
    private int[] f23945A;

    /* renamed from: B */
    private SparseArray<BadgeDrawable> f23946B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public BottomNavigationPresenter f23947C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C0138g f23948D;

    /* renamed from: f */
    private final C5260q f23949f;

    /* renamed from: g */
    private final int f23950g;

    /* renamed from: h */
    private final int f23951h;

    /* renamed from: i */
    private final int f23952i;

    /* renamed from: j */
    private final int f23953j;

    /* renamed from: k */
    private final int f23954k;

    /* renamed from: l */
    private final View.OnClickListener f23955l;

    /* renamed from: m */
    private final C5005e<C8450a> f23956m;

    /* renamed from: n */
    private boolean f23957n;

    /* renamed from: o */
    private int f23958o;

    /* renamed from: p */
    private C8450a[] f23959p;

    /* renamed from: q */
    private int f23960q;

    /* renamed from: r */
    private int f23961r;

    /* renamed from: s */
    private ColorStateList f23962s;

    /* renamed from: t */
    private int f23963t;

    /* renamed from: u */
    private ColorStateList f23964u;

    /* renamed from: v */
    private final ColorStateList f23965v;

    /* renamed from: w */
    private int f23966w;

    /* renamed from: x */
    private int f23967x;

    /* renamed from: y */
    private Drawable f23968y;

    /* renamed from: z */
    private int f23969z;

    /* renamed from: com.google.android.material.bottomnavigation.c$a */
    /* compiled from: BottomNavigationMenuView */
    class C8454a implements View.OnClickListener {
        C8454a() {
        }

        public void onClick(View view) {
            C0142i itemData = ((C8450a) view).getItemData();
            if (!C8453c.this.f23948D.mo625a((MenuItem) itemData, (C0153m) C8453c.this.f23947C, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public C8453c(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private boolean m27244a(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m27246c(int i) {
        return i != -1;
    }

    /* renamed from: d */
    private void m27247d() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f23948D.size(); i++) {
            hashSet.add(Integer.valueOf(this.f23948D.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f23946B.size(); i2++) {
            int keyAt = this.f23946B.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f23946B.delete(keyAt);
            }
        }
    }

    private C8450a getNewItem() {
        C8450a a = this.f23956m.mo17456a();
        return a == null ? new C8450a(getContext()) : a;
    }

    private void setBadgeIfNeeded(C8450a aVar) {
        BadgeDrawable badgeDrawable;
        int id = aVar.getId();
        if (m27246c(id) && (badgeDrawable = this.f23946B.get(id)) != null) {
            aVar.setBadge(badgeDrawable);
        }
    }

    /* renamed from: c */
    public void mo31037c() {
        C0138g gVar = this.f23948D;
        if (gVar != null && this.f23959p != null) {
            int size = gVar.size();
            if (size != this.f23959p.length) {
                mo31034a();
                return;
            }
            int i = this.f23960q;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f23948D.getItem(i2);
                if (item.isChecked()) {
                    this.f23960q = item.getItemId();
                    this.f23961r = i2;
                }
            }
            if (i != this.f23960q) {
                C5256o.m9865a(this, this.f23949f);
            }
            boolean a = m27244a(this.f23958o, this.f23948D.mo669n().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f23947C.mo30970b(true);
                this.f23959p[i3].setLabelVisibilityMode(this.f23958o);
                this.f23959p[i3].setShifting(a);
                this.f23959p[i3].mo450a((C0142i) this.f23948D.getItem(i3), 0);
                this.f23947C.mo30970b(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f23946B;
    }

    public ColorStateList getIconTintList() {
        return this.f23962s;
    }

    public Drawable getItemBackground() {
        C8450a[] aVarArr = this.f23959p;
        if (aVarArr == null || aVarArr.length <= 0) {
            return this.f23968y;
        }
        return aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f23969z;
    }

    public int getItemIconSize() {
        return this.f23963t;
    }

    public int getItemTextAppearanceActive() {
        return this.f23967x;
    }

    public int getItemTextAppearanceInactive() {
        return this.f23966w;
    }

    public ColorStateList getItemTextColor() {
        return this.f23964u;
    }

    public int getLabelVisibilityMode() {
        return this.f23958o;
    }

    public int getSelectedItemId() {
        return this.f23960q;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C5034c.m8990a(accessibilityNodeInfo).mo17512a((Object) C5034c.C5036b.m9068a(1, this.f23948D.mo669n().size(), false, 1));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C5071v.m9204p(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f23948D.mo669n().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f23954k, 1073741824);
        if (!m27244a(this.f23958o, size2) || !this.f23957n) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.f23952i);
            int i3 = size - (size2 * min);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getVisibility() != 8) {
                    int[] iArr = this.f23945A;
                    iArr[i4] = min;
                    if (i3 > 0) {
                        iArr[i4] = iArr[i4] + 1;
                        i3--;
                    }
                } else {
                    this.f23945A[i4] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f23961r);
            int i5 = this.f23953j;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f23952i, Integer.MIN_VALUE), makeMeasureSpec);
                i5 = Math.max(i5, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f23951h * i6), Math.min(i5, this.f23952i));
            int i7 = size - min2;
            int min3 = Math.min(i7 / (i6 == 0 ? 1 : i6), this.f23950g);
            int i8 = i7 - (i6 * min3);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    this.f23945A[i9] = i9 == this.f23961r ? min2 : min3;
                    if (i8 > 0) {
                        int[] iArr2 = this.f23945A;
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f23945A[i9] = 0;
                }
                i9++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f23945A[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(this.f23954k, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: package-private */
    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f23946B = sparseArray;
        C8450a[] aVarArr = this.f23959p;
        if (aVarArr != null) {
            for (C8450a aVar : aVarArr) {
                aVar.setBadge(sparseArray.get(aVar.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f23962s = colorStateList;
        C8450a[] aVarArr = this.f23959p;
        if (aVarArr != null) {
            for (C8450a iconTintList : aVarArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f23968y = drawable;
        C8450a[] aVarArr = this.f23959p;
        if (aVarArr != null) {
            for (C8450a itemBackground : aVarArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f23969z = i;
        C8450a[] aVarArr = this.f23959p;
        if (aVarArr != null) {
            for (C8450a itemBackground : aVarArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f23957n = z;
    }

    public void setItemIconSize(int i) {
        this.f23963t = i;
        C8450a[] aVarArr = this.f23959p;
        if (aVarArr != null) {
            for (C8450a iconSize : aVarArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f23967x = i;
        C8450a[] aVarArr = this.f23959p;
        if (aVarArr != null) {
            for (C8450a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f23964u;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f23966w = i;
        C8450a[] aVarArr = this.f23959p;
        if (aVarArr != null) {
            for (C8450a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f23964u;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f23964u = colorStateList;
        C8450a[] aVarArr = this.f23959p;
        if (aVarArr != null) {
            for (C8450a textColor : aVarArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f23958o = i;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f23947C = bottomNavigationPresenter;
    }

    public C8453c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23956m = new C5007g(5);
        this.f23960q = 0;
        this.f23961r = 0;
        this.f23946B = new SparseArray<>(5);
        Resources resources = getResources();
        this.f23950g = resources.getDimensionPixelSize(C10576d.design_bottom_navigation_item_max_width);
        this.f23951h = resources.getDimensionPixelSize(C10576d.design_bottom_navigation_item_min_width);
        this.f23952i = resources.getDimensionPixelSize(C10576d.design_bottom_navigation_active_item_max_width);
        this.f23953j = resources.getDimensionPixelSize(C10576d.design_bottom_navigation_active_item_min_width);
        this.f23954k = resources.getDimensionPixelSize(C10576d.design_bottom_navigation_height);
        this.f23965v = mo31033a(16842808);
        C5203b bVar = new C5203b();
        this.f23949f = bVar;
        bVar.mo18121b(0);
        this.f23949f.mo18072a(115);
        this.f23949f.mo18073a((TimeInterpolator) new C5109b());
        this.f23949f.mo18120a((C5247m) new C8564i());
        this.f23955l = new C8454a();
        this.f23945A = new int[5];
        C5071v.m9195h(this, 1);
    }

    /* renamed from: a */
    public void mo472a(C0138g gVar) {
        this.f23948D = gVar;
    }

    /* renamed from: b */
    public boolean mo31036b() {
        return this.f23957n;
    }

    /* renamed from: a */
    public ColorStateList mo31033a(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList b = C4800a.m7935b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C4790a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = b.getDefaultColor();
        return new ColorStateList(new int[][]{f23944F, f23943E, ViewGroup.EMPTY_STATE_SET}, new int[]{b.getColorForState(f23944F, defaultColor), i2, defaultColor});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31035b(int i) {
        int size = this.f23948D.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f23948D.getItem(i2);
            if (i == item.getItemId()) {
                this.f23960q = i;
                this.f23961r = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo31034a() {
        removeAllViews();
        C8450a[] aVarArr = this.f23959p;
        if (aVarArr != null) {
            for (C8450a aVar : aVarArr) {
                if (aVar != null) {
                    this.f23956m.mo17457a(aVar);
                    aVar.mo31011a();
                }
            }
        }
        if (this.f23948D.size() == 0) {
            this.f23960q = 0;
            this.f23961r = 0;
            this.f23959p = null;
            return;
        }
        m27247d();
        this.f23959p = new C8450a[this.f23948D.size()];
        boolean a = m27244a(this.f23958o, this.f23948D.mo669n().size());
        for (int i = 0; i < this.f23948D.size(); i++) {
            this.f23947C.mo30970b(true);
            this.f23948D.getItem(i).setCheckable(true);
            this.f23947C.mo30970b(false);
            C8450a newItem = getNewItem();
            this.f23959p[i] = newItem;
            newItem.setIconTintList(this.f23962s);
            newItem.setIconSize(this.f23963t);
            newItem.setTextColor(this.f23965v);
            newItem.setTextAppearanceInactive(this.f23966w);
            newItem.setTextAppearanceActive(this.f23967x);
            newItem.setTextColor(this.f23964u);
            Drawable drawable = this.f23968y;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f23969z);
            }
            newItem.setShifting(a);
            newItem.setLabelVisibilityMode(this.f23958o);
            newItem.mo450a((C0142i) this.f23948D.getItem(i), 0);
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.f23955l);
            if (this.f23960q != 0 && this.f23948D.getItem(i).getItemId() == this.f23960q) {
                this.f23961r = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f23948D.size() - 1, this.f23961r);
        this.f23961r = min;
        this.f23948D.getItem(min).setChecked(true);
    }
}
