package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0142i;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.view.menu.C0155n;
import androidx.appcompat.widget.C0229c0;

public class ActionMenuView extends C0229c0 implements C0138g.C0140b, C0155n {

    /* renamed from: A */
    C0138g.C0139a f723A;

    /* renamed from: B */
    private boolean f724B;

    /* renamed from: C */
    private int f725C;

    /* renamed from: D */
    private int f726D;

    /* renamed from: E */
    private int f727E;

    /* renamed from: F */
    C0182e f728F;

    /* renamed from: u */
    private C0138g f729u;

    /* renamed from: v */
    private Context f730v;

    /* renamed from: w */
    private int f731w;

    /* renamed from: x */
    private boolean f732x;

    /* renamed from: y */
    private ActionMenuPresenter f733y;

    /* renamed from: z */
    private C0153m.C0154a f734z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0178a {
        /* renamed from: a */
        boolean mo451a();

        /* renamed from: b */
        boolean mo452b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0179b implements C0153m.C0154a {
        C0179b() {
        }

        /* renamed from: a */
        public void mo349a(C0138g gVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo350a(C0138g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0180c extends C0229c0.C0230a {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f735c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f736d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f737e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f738f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f739g;

        /* renamed from: h */
        boolean f740h;

        public C0180c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0180c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0180c(C0180c cVar) {
            super(cVar);
            this.f735c = cVar.f735c;
        }

        public C0180c(int i, int i2) {
            super(i, i2);
            this.f735c = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0182e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    static int m864a(View view, int i, int i2, int i3, int i4) {
        C0180c cVar = (C0180c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo454d();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f735c || !z2) {
            z = false;
        }
        cVar.f738f = z;
        cVar.f736d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: c */
    private void m865c(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f726D;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z5 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z6) {
                    int i19 = this.f727E;
                    i6 = i18;
                    z4 = false;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    z4 = false;
                }
                C0180c cVar = (C0180c) childAt.getLayoutParams();
                cVar.f740h = z4;
                cVar.f737e = z4 ? 1 : 0;
                cVar.f736d = z4;
                cVar.f738f = z4;
                cVar.leftMargin = z4;
                cVar.rightMargin = z4;
                cVar.f739g = z6 && ((ActionMenuItemView) childAt).mo454d();
                int a = m864a(childAt, i11, cVar.f735c ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, a);
                if (cVar.f738f) {
                    i16++;
                }
                if (cVar.f735c) {
                    z5 = true;
                }
                i9 -= a;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (a == 1) {
                    j |= (long) (1 << i13);
                    i12 = i12;
                } else {
                    int i20 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i21 = size2;
        boolean z7 = z5 && i14 == 2;
        boolean z8 = false;
        while (true) {
            if (i16 <= 0 || i9 <= 0) {
                i5 = mode;
                i3 = i7;
                z = z8;
                i4 = i12;
            } else {
                int i22 = 0;
                int i23 = 0;
                int i24 = Integer.MAX_VALUE;
                long j2 = 0;
                while (i23 < childCount) {
                    boolean z9 = z8;
                    C0180c cVar2 = (C0180c) getChildAt(i23).getLayoutParams();
                    int i25 = i12;
                    if (cVar2.f738f) {
                        int i26 = cVar2.f736d;
                        if (i26 < i24) {
                            j2 = 1 << i23;
                            i24 = i26;
                            i22 = 1;
                        } else if (i26 == i24) {
                            i22++;
                            j2 |= 1 << i23;
                        }
                    }
                    i23++;
                    i12 = i25;
                    z8 = z9;
                }
                z = z8;
                i4 = i12;
                j |= j2;
                if (i22 > i9) {
                    i5 = mode;
                    i3 = i7;
                    break;
                }
                int i27 = i24 + 1;
                int i28 = 0;
                while (i28 < childCount) {
                    View childAt2 = getChildAt(i28);
                    C0180c cVar3 = (C0180c) childAt2.getLayoutParams();
                    int i29 = i7;
                    int i30 = mode;
                    long j3 = (long) (1 << i28);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f736d == i27) {
                            j |= j3;
                        }
                        z3 = z7;
                    } else {
                        if (!z7 || !cVar3.f739g || i9 != 1) {
                            z3 = z7;
                        } else {
                            int i31 = this.f727E;
                            z3 = z7;
                            childAt2.setPadding(i31 + i11, 0, i31, 0);
                        }
                        cVar3.f736d++;
                        cVar3.f740h = true;
                        i9--;
                    }
                    i28++;
                    mode = i30;
                    i7 = i29;
                    z7 = z3;
                }
                i12 = i4;
                z8 = true;
            }
        }
        boolean z10 = !z5 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z10 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((C0180c) getChildAt(0).getLayoutParams()).f739g) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & ((long) (1 << i32))) != 0 && !((C0180c) getChildAt(i32).getLayoutParams()).f739g) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) (((float) (i9 * i11)) / bitCount) : 0;
            z2 = z;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    C0180c cVar4 = (C0180c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f737e = i33;
                        cVar4.f740h = true;
                        if (i34 == 0 && !cVar4.f739g) {
                            cVar4.leftMargin = (-i33) / 2;
                        }
                    } else if (cVar4.f735c) {
                        cVar4.f737e = i33;
                        cVar4.f740h = true;
                        cVar4.rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            cVar4.leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            cVar4.rightMargin = i33 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                C0180c cVar5 = (C0180c) childAt4.getLayoutParams();
                if (cVar5.f740h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f736d * i11) + cVar5.f737e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i21);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0180c;
    }

    /* renamed from: d */
    public void mo1000d() {
        ActionMenuPresenter actionMenuPresenter = this.f733y;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo983d();
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public C0180c mo1003e() {
        C0180c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f735c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: f */
    public boolean mo1004f() {
        ActionMenuPresenter actionMenuPresenter = this.f733y;
        return actionMenuPresenter != null && actionMenuPresenter.mo985f();
    }

    /* renamed from: g */
    public boolean mo1005g() {
        ActionMenuPresenter actionMenuPresenter = this.f733y;
        return actionMenuPresenter != null && actionMenuPresenter.mo987h();
    }

    public Menu getMenu() {
        if (this.f729u == null) {
            Context context = getContext();
            C0138g gVar = new C0138g(context);
            this.f729u = gVar;
            gVar.mo619a((C0138g.C0139a) new C0181d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f733y = actionMenuPresenter;
            actionMenuPresenter.mo982c(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f733y;
            C0153m.C0154a aVar = this.f734z;
            if (aVar == null) {
                aVar = new C0179b();
            }
            actionMenuPresenter2.mo551a(aVar);
            this.f729u.mo621a((C0153m) this.f733y, this.f730v);
            this.f733y.mo980a(this);
        }
        return this.f729u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f733y.mo984e();
    }

    public int getPopupTheme() {
        return this.f731w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public boolean mo1013h() {
        ActionMenuPresenter actionMenuPresenter = this.f733y;
        return actionMenuPresenter != null && actionMenuPresenter.mo988i();
    }

    /* renamed from: i */
    public boolean mo1014i() {
        return this.f732x;
    }

    /* renamed from: j */
    public C0138g mo1015j() {
        return this.f729u;
    }

    /* renamed from: k */
    public boolean mo1016k() {
        ActionMenuPresenter actionMenuPresenter = this.f733y;
        return actionMenuPresenter != null && actionMenuPresenter.mo989j();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f733y;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo552a(false);
            if (this.f733y.mo988i()) {
                this.f733y.mo985f();
                this.f733y.mo989j();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1000d();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f724B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0298w0.m1423a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0180c cVar = (C0180c) childAt.getLayoutParams();
                if (cVar.f735c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1001d(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i5 = getPaddingLeft() + cVar.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    mo1001d(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0180c cVar2 = (C0180c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f735c) {
                    int i17 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0180c cVar3 = (C0180c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f735c) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0138g gVar;
        boolean z = this.f724B;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f724B = z2;
        if (z != z2) {
            this.f725C = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f724B || (gVar = this.f729u) == null || size == this.f725C)) {
            this.f725C = size;
            gVar.mo641b(true);
        }
        int childCount = getChildCount();
        if (!this.f724B || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0180c cVar = (C0180c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m865c(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f733y.mo981b(z);
    }

    public void setOnMenuItemClickListener(C0182e eVar) {
        this.f728F = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f733y.mo979a(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f732x = z;
    }

    public void setPopupTheme(int i) {
        if (this.f731w != i) {
            this.f731w = i;
            if (i == 0) {
                this.f730v = getContext();
            } else {
                this.f730v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f733y = actionMenuPresenter;
        actionMenuPresenter.mo980a(this);
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0181d implements C0138g.C0139a {
        C0181d() {
        }

        /* renamed from: a */
        public boolean mo320a(C0138g gVar, MenuItem menuItem) {
            C0182e eVar = ActionMenuView.this.f728F;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        /* renamed from: a */
        public void mo317a(C0138g gVar) {
            C0138g.C0139a aVar = ActionMenuView.this.f723A;
            if (aVar != null) {
                aVar.mo317a(gVar);
            }
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f726D = (int) (56.0f * f);
        this.f727E = (int) (f * 4.0f);
        this.f730v = context;
        this.f731w = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1001d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0178a)) {
            z = false | ((C0178a) childAt).mo451a();
        }
        return (i <= 0 || !(childAt2 instanceof C0178a)) ? z : z | ((C0178a) childAt2).mo452b();
    }

    /* access modifiers changed from: protected */
    public C0180c generateDefaultLayoutParams() {
        C0180c cVar = new C0180c(-2, -2);
        cVar.f1007b = 16;
        return cVar;
    }

    public C0180c generateLayoutParams(AttributeSet attributeSet) {
        return new C0180c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0180c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0180c cVar;
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        if (layoutParams instanceof C0180c) {
            cVar = new C0180c((C0180c) layoutParams);
        } else {
            cVar = new C0180c(layoutParams);
        }
        if (cVar.f1007b <= 0) {
            cVar.f1007b = 16;
        }
        return cVar;
    }

    /* renamed from: a */
    public boolean mo473a(C0142i iVar) {
        return this.f729u.mo624a((MenuItem) iVar, 0);
    }

    /* renamed from: a */
    public void mo472a(C0138g gVar) {
        this.f729u = gVar;
    }

    /* renamed from: a */
    public void mo998a(C0153m.C0154a aVar, C0138g.C0139a aVar2) {
        this.f734z = aVar;
        this.f723A = aVar2;
    }
}
