package com.astuetz;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.astuetz.p141a.C5868a;
import com.astuetz.p141a.C5869b;
import com.astuetz.p141a.C5870c;
import com.astuetz.p141a.C5871d;
import p050l.p075h.p083k.C5004d;

public class PagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: N */
    private static final int[] f10556N = {16842806, 16842965, 16842966, 16842968};

    /* renamed from: A */
    private ColorStateList f10557A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f10558B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f10559C;

    /* renamed from: D */
    private boolean f10560D;

    /* renamed from: E */
    private boolean f10561E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f10562F;

    /* renamed from: G */
    private boolean f10563G;

    /* renamed from: H */
    private Typeface f10564H;

    /* renamed from: I */
    private int f10565I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int f10566J;

    /* renamed from: K */
    private int f10567K;

    /* renamed from: L */
    private int f10568L;

    /* renamed from: M */
    private ViewTreeObserver.OnGlobalLayoutListener f10569M;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public LinearLayout f10570f;

    /* renamed from: g */
    private LinearLayout.LayoutParams f10571g;

    /* renamed from: h */
    private final C5867f f10572h;

    /* renamed from: i */
    private final C5866e f10573i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C5865d f10574j;

    /* renamed from: k */
    public ViewPager.C0804j f10575k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ViewPager f10576l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f10577m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f10578n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f10579o;

    /* renamed from: p */
    private Paint f10580p;

    /* renamed from: q */
    private Paint f10581q;

    /* renamed from: r */
    private int f10582r;

    /* renamed from: s */
    private int f10583s;

    /* renamed from: t */
    private int f10584t;

    /* renamed from: u */
    private int f10585u;

    /* renamed from: v */
    private int f10586v;

    /* renamed from: w */
    private int f10587w;

    /* renamed from: x */
    private int f10588x;

    /* renamed from: y */
    private int f10589y;

    /* renamed from: z */
    private int f10590z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5861a();

        /* renamed from: f */
        int f10591f;

        /* renamed from: com.astuetz.PagerSlidingTabStrip$SavedState$a */
        static class C5861a implements Parcelable.Creator<SavedState> {
            C5861a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C5862a) null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C5862a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10591f);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f10591f = parcel.readInt();
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$a */
    class C5862a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ int f10592f;

        C5862a(int i) {
            this.f10592f = i;
        }

        public void onClick(View view) {
            if (PagerSlidingTabStrip.this.f10576l.getCurrentItem() != this.f10592f) {
                PagerSlidingTabStrip.this.m11440b(PagerSlidingTabStrip.this.f10570f.getChildAt(PagerSlidingTabStrip.this.f10576l.getCurrentItem()));
                PagerSlidingTabStrip.this.f10576l.setCurrentItem(this.f10592f);
            } else if (PagerSlidingTabStrip.this.f10574j != null) {
                PagerSlidingTabStrip.this.f10574j.mo19929a(this.f10592f);
            }
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$b */
    class C5863b implements ViewTreeObserver.OnGlobalLayoutListener {
        C5863b() {
        }

        @TargetApi(16)
        /* renamed from: a */
        private void m11455a() {
            PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* renamed from: b */
        private void m11456b() {
            PagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        public void onGlobalLayout() {
            View childAt = PagerSlidingTabStrip.this.f10570f.getChildAt(0);
            if (Build.VERSION.SDK_INT < 16) {
                m11456b();
            } else {
                m11455a();
            }
            if (PagerSlidingTabStrip.this.f10562F) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                int width = (pagerSlidingTabStrip.getWidth() / 2) - (childAt.getWidth() / 2);
                int unused = pagerSlidingTabStrip.f10559C = width;
                int unused2 = pagerSlidingTabStrip.f10558B = width;
            }
            PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip2.setPadding(pagerSlidingTabStrip2.f10558B, PagerSlidingTabStrip.this.getPaddingTop(), PagerSlidingTabStrip.this.f10559C, PagerSlidingTabStrip.this.getPaddingBottom());
            if (PagerSlidingTabStrip.this.f10566J == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip3 = PagerSlidingTabStrip.this;
                int unused3 = pagerSlidingTabStrip3.f10566J = (pagerSlidingTabStrip3.getWidth() / 2) - PagerSlidingTabStrip.this.f10558B;
            }
            PagerSlidingTabStrip pagerSlidingTabStrip4 = PagerSlidingTabStrip.this;
            int unused4 = pagerSlidingTabStrip4.f10578n = pagerSlidingTabStrip4.f10576l.getCurrentItem();
            float unused5 = PagerSlidingTabStrip.this.f10579o = 0.0f;
            PagerSlidingTabStrip pagerSlidingTabStrip5 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip5.m11432a(pagerSlidingTabStrip5.f10578n, 0);
            PagerSlidingTabStrip pagerSlidingTabStrip6 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip6.m11439b(pagerSlidingTabStrip6.f10578n);
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$c */
    public interface C5864c {
        /* renamed from: a */
        View mo19926a(ViewGroup viewGroup, int i);

        /* renamed from: a */
        void mo19927a(View view);

        /* renamed from: b */
        void mo19928b(View view);
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$d */
    public interface C5865d {
        /* renamed from: a */
        void mo19929a(int i);
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$e */
    private class C5866e implements ViewPager.C0804j {
        private C5866e() {
        }

        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.m11432a(pagerSlidingTabStrip.f10576l.getCurrentItem(), 0);
            }
            PagerSlidingTabStrip.this.m11434a(PagerSlidingTabStrip.this.f10570f.getChildAt(PagerSlidingTabStrip.this.f10576l.getCurrentItem()));
            if (PagerSlidingTabStrip.this.f10576l.getCurrentItem() - 1 >= 0) {
                PagerSlidingTabStrip.this.m11440b(PagerSlidingTabStrip.this.f10570f.getChildAt(PagerSlidingTabStrip.this.f10576l.getCurrentItem() - 1));
            }
            if (PagerSlidingTabStrip.this.f10576l.getCurrentItem() + 1 <= PagerSlidingTabStrip.this.f10576l.getAdapter().getCount() - 1) {
                PagerSlidingTabStrip.this.m11440b(PagerSlidingTabStrip.this.f10570f.getChildAt(PagerSlidingTabStrip.this.f10576l.getCurrentItem() + 1));
            }
            ViewPager.C0804j jVar = PagerSlidingTabStrip.this.f10575k;
            if (jVar != null) {
                jVar.onPageScrollStateChanged(i);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            int unused = PagerSlidingTabStrip.this.f10578n = i;
            float unused2 = PagerSlidingTabStrip.this.f10579o = f;
            PagerSlidingTabStrip.this.m11432a(i, PagerSlidingTabStrip.this.f10577m > 0 ? (int) (((float) PagerSlidingTabStrip.this.f10570f.getChildAt(i).getWidth()) * f) : 0);
            PagerSlidingTabStrip.this.invalidate();
            ViewPager.C0804j jVar = PagerSlidingTabStrip.this.f10575k;
            if (jVar != null) {
                jVar.onPageScrolled(i, f, i2);
            }
        }

        public void onPageSelected(int i) {
            PagerSlidingTabStrip.this.m11439b(i);
            ViewPager.C0804j jVar = PagerSlidingTabStrip.this.f10575k;
            if (jVar != null) {
                jVar.onPageSelected(i);
            }
        }

        /* synthetic */ C5866e(PagerSlidingTabStrip pagerSlidingTabStrip, C5862a aVar) {
            this();
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$f */
    private class C5867f extends DataSetObserver {

        /* renamed from: a */
        private boolean f10596a;

        private C5867f() {
            this.f10596a = false;
        }

        /* renamed from: a */
        public void mo19930a(boolean z) {
            this.f10596a = z;
        }

        public void onChanged() {
            PagerSlidingTabStrip.this.mo19878a();
        }

        /* renamed from: a */
        public boolean mo19931a() {
            return this.f10596a;
        }

        /* synthetic */ C5867f(PagerSlidingTabStrip pagerSlidingTabStrip, C5862a aVar) {
            this();
        }
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, (AttributeSet) null);
    }

    private C5004d<Float, Float> getIndicatorCoordinates() {
        int i;
        View childAt = this.f10570f.getChildAt(this.f10578n);
        float left = (float) childAt.getLeft();
        float right = (float) childAt.getRight();
        if (this.f10579o > 0.0f && (i = this.f10578n) < this.f10577m - 1) {
            View childAt2 = this.f10570f.getChildAt(i + 1);
            float f = this.f10579o;
            left = (((float) childAt2.getLeft()) * f) + ((1.0f - f) * left);
            right = (((float) childAt2.getRight()) * f) + ((1.0f - f) * right);
        }
        return new C5004d<>(Float.valueOf(left), Float.valueOf(right));
    }

    public int getDividerColor() {
        return this.f10588x;
    }

    public int getDividerPadding() {
        return this.f10587w;
    }

    public int getDividerWidth() {
        return this.f10586v;
    }

    public int getIndicatorColor() {
        return this.f10582r;
    }

    public int getIndicatorHeight() {
        return this.f10583s;
    }

    public int getScrollOffset() {
        return this.f10566J;
    }

    public boolean getShouldExpand() {
        return this.f10560D;
    }

    public int getTabBackground() {
        return this.f10568L;
    }

    public int getTabPaddingLeftRight() {
        return this.f10589y;
    }

    public ColorStateList getTextColor() {
        return this.f10557A;
    }

    public int getTextSize() {
        return this.f10590z;
    }

    public int getUnderlineColor() {
        return this.f10585u;
    }

    public int getUnderlineHeight() {
        return this.f10584t;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10576l != null && !this.f10572h.mo19931a()) {
            this.f10576l.getAdapter().registerDataSetObserver(this.f10572h);
            this.f10572h.mo19930a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f10576l != null && this.f10572h.mo19931a()) {
            this.f10576l.getAdapter().unregisterDataSetObserver(this.f10572h);
            this.f10572h.mo19930a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f10577m != 0) {
            int height = getHeight();
            int i = this.f10586v;
            if (i > 0) {
                this.f10581q.setStrokeWidth((float) i);
                this.f10581q.setColor(this.f10588x);
                for (int i2 = 0; i2 < this.f10577m - 1; i2++) {
                    View childAt = this.f10570f.getChildAt(i2);
                    canvas.drawLine((float) childAt.getRight(), (float) this.f10587w, (float) childAt.getRight(), (float) (height - this.f10587w), this.f10581q);
                }
            }
            if (this.f10584t > 0) {
                this.f10580p.setColor(this.f10585u);
                canvas.drawRect((float) this.f10558B, (float) (height - this.f10584t), (float) (this.f10570f.getWidth() + this.f10559C), (float) height, this.f10580p);
            }
            if (this.f10583s > 0) {
                this.f10580p.setColor(this.f10582r);
                C5004d<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
                canvas.drawRect(((Float) indicatorCoordinates.f8862a).floatValue() + ((float) this.f10558B), (float) (height - this.f10583s), ((Float) indicatorCoordinates.f8863b).floatValue() + ((float) this.f10558B), (float) height, this.f10580p);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (this.f10562F || this.f10558B > 0 || this.f10559C > 0) {
            if (this.f10562F) {
                i5 = getWidth();
            } else {
                i5 = (getWidth() - this.f10558B) - this.f10559C;
            }
            this.f10570f.setMinimumWidth(i5);
            setClipToPadding(false);
        }
        if (this.f10570f.getChildCount() > 0) {
            this.f10570f.getChildAt(0).getViewTreeObserver().addOnGlobalLayoutListener(this.f10569M);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.f10591f;
        this.f10578n = i;
        if (i != 0 && this.f10570f.getChildCount() > 0) {
            m11440b(this.f10570f.getChildAt(0));
            m11434a(this.f10570f.getChildAt(this.f10578n));
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10591f = this.f10578n;
        return savedState;
    }

    public void setAllCaps(boolean z) {
        this.f10563G = z;
    }

    public void setDividerColor(int i) {
        this.f10588x = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.f10588x = getResources().getColor(i);
        invalidate();
    }

    public void setDividerPadding(int i) {
        this.f10587w = i;
        invalidate();
    }

    public void setDividerWidth(int i) {
        this.f10586v = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f10582r = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.f10582r = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.f10583s = i;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.C0804j jVar) {
        this.f10575k = jVar;
    }

    public void setOnTabReselectedListener(C5865d dVar) {
        this.f10574j = dVar;
    }

    public void setScrollOffset(int i) {
        this.f10566J = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.f10560D = z;
        if (this.f10576l != null) {
            requestLayout();
        }
    }

    public void setTabBackground(int i) {
        this.f10568L = i;
    }

    public void setTabPaddingLeftRight(int i) {
        this.f10589y = i;
        m11445c();
    }

    public void setTextColor(int i) {
        setTextColor(m11430a(i));
    }

    public void setTextColorResource(int i) {
        setTextColor(getResources().getColor(i));
    }

    public void setTextColorStateListResource(int i) {
        setTextColor(getResources().getColorStateList(i));
    }

    public void setTextSize(int i) {
        this.f10590z = i;
        m11445c();
    }

    public void setUnderlineColor(int i) {
        this.f10585u = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.f10585u = getResources().getColor(i);
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.f10584t = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f10576l = viewPager;
        if (viewPager.getAdapter() != null) {
            this.f10561E = viewPager.getAdapter() instanceof C5864c;
            viewPager.setOnPageChangeListener(this.f10573i);
            viewPager.getAdapter().registerDataSetObserver(this.f10572h);
            this.f10572h.mo19930a(true);
            mo19878a();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f10557A = colorStateList;
        m11445c();
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        String str;
        ColorStateList colorStateList = null;
        this.f10572h = new C5867f(this, (C5862a) null);
        this.f10573i = new C5866e(this, (C5862a) null);
        this.f10574j = null;
        this.f10578n = 0;
        this.f10579o = 0.0f;
        this.f10583s = 2;
        this.f10584t = 0;
        this.f10586v = 0;
        this.f10587w = 0;
        this.f10589y = 12;
        this.f10590z = 14;
        this.f10557A = null;
        this.f10558B = 0;
        this.f10559C = 0;
        this.f10560D = false;
        this.f10562F = false;
        this.f10563G = true;
        this.f10564H = null;
        this.f10565I = 1;
        this.f10567K = 0;
        this.f10568L = C5868a.psts_background_tab;
        this.f10569M = new C5863b();
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10570f = linearLayout;
        linearLayout.setOrientation(0);
        addView(this.f10570f);
        Paint paint = new Paint();
        this.f10580p = paint;
        paint.setAntiAlias(true);
        this.f10580p.setStyle(Paint.Style.FILL);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f10566J = (int) TypedValue.applyDimension(1, (float) this.f10566J, displayMetrics);
        this.f10583s = (int) TypedValue.applyDimension(1, (float) this.f10583s, displayMetrics);
        this.f10584t = (int) TypedValue.applyDimension(1, (float) this.f10584t, displayMetrics);
        this.f10587w = (int) TypedValue.applyDimension(1, (float) this.f10587w, displayMetrics);
        this.f10589y = (int) TypedValue.applyDimension(1, (float) this.f10589y, displayMetrics);
        this.f10586v = (int) TypedValue.applyDimension(1, (float) this.f10586v, displayMetrics);
        this.f10590z = (int) TypedValue.applyDimension(2, (float) this.f10590z, displayMetrics);
        Paint paint2 = new Paint();
        this.f10581q = paint2;
        paint2.setAntiAlias(true);
        this.f10581q.setStrokeWidth((float) this.f10586v);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f10556N);
        int color = obtainStyledAttributes.getColor(0, getResources().getColor(17170444));
        this.f10585u = color;
        this.f10588x = color;
        this.f10582r = color;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize > 0) {
            i2 = dimensionPixelSize;
        } else {
            i2 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        }
        this.f10558B = i2;
        this.f10559C = dimensionPixelSize <= 0 ? obtainStyledAttributes.getDimensionPixelSize(3, 0) : dimensionPixelSize;
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f10565I = 0;
            str = "sans-serif-medium";
        } else {
            str = "sans-serif";
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C5871d.PagerSlidingTabStrip);
        this.f10582r = obtainStyledAttributes2.getColor(C5871d.PagerSlidingTabStrip_pstsIndicatorColor, this.f10582r);
        this.f10583s = obtainStyledAttributes2.getDimensionPixelSize(C5871d.PagerSlidingTabStrip_pstsIndicatorHeight, this.f10583s);
        this.f10585u = obtainStyledAttributes2.getColor(C5871d.PagerSlidingTabStrip_pstsUnderlineColor, this.f10585u);
        this.f10584t = obtainStyledAttributes2.getDimensionPixelSize(C5871d.PagerSlidingTabStrip_pstsUnderlineHeight, this.f10584t);
        this.f10588x = obtainStyledAttributes2.getColor(C5871d.PagerSlidingTabStrip_pstsDividerColor, this.f10588x);
        this.f10586v = obtainStyledAttributes2.getDimensionPixelSize(C5871d.PagerSlidingTabStrip_pstsDividerWidth, this.f10586v);
        this.f10587w = obtainStyledAttributes2.getDimensionPixelSize(C5871d.PagerSlidingTabStrip_pstsDividerPadding, this.f10587w);
        this.f10560D = obtainStyledAttributes2.getBoolean(C5871d.PagerSlidingTabStrip_pstsShouldExpand, this.f10560D);
        this.f10566J = obtainStyledAttributes2.getDimensionPixelSize(C5871d.PagerSlidingTabStrip_pstsScrollOffset, this.f10566J);
        this.f10562F = obtainStyledAttributes2.getBoolean(C5871d.PagerSlidingTabStrip_pstsPaddingMiddle, this.f10562F);
        this.f10589y = obtainStyledAttributes2.getDimensionPixelSize(C5871d.PagerSlidingTabStrip_pstsTabPaddingLeftRight, this.f10589y);
        this.f10568L = obtainStyledAttributes2.getResourceId(C5871d.PagerSlidingTabStrip_pstsTabBackground, this.f10568L);
        this.f10590z = obtainStyledAttributes2.getDimensionPixelSize(C5871d.PagerSlidingTabStrip_pstsTabTextSize, this.f10590z);
        this.f10557A = obtainStyledAttributes2.hasValue(C5871d.PagerSlidingTabStrip_pstsTabTextColor) ? obtainStyledAttributes2.getColorStateList(C5871d.PagerSlidingTabStrip_pstsTabTextColor) : colorStateList;
        this.f10565I = obtainStyledAttributes2.getInt(C5871d.PagerSlidingTabStrip_pstsTabTextStyle, this.f10565I);
        this.f10563G = obtainStyledAttributes2.getBoolean(C5871d.PagerSlidingTabStrip_pstsTabTextAllCaps, this.f10563G);
        int i3 = obtainStyledAttributes2.getInt(C5871d.PagerSlidingTabStrip_pstsTabTextAlpha, 150);
        String string = obtainStyledAttributes2.getString(C5871d.PagerSlidingTabStrip_pstsTabTextFontFamily);
        obtainStyledAttributes2.recycle();
        if (this.f10557A == null) {
            this.f10557A = m11431a(color, color, Color.argb(i3, Color.red(color), Color.green(color), Color.blue(color)));
        }
        this.f10564H = Typeface.create(string != null ? string : str, this.f10565I);
        m11438b();
        this.f10571g = this.f10560D ? new LinearLayout.LayoutParams(0, -1, 1.0f) : new LinearLayout.LayoutParams(-2, -1);
    }

    /* renamed from: c */
    private void m11445c() {
        for (int i = 0; i < this.f10577m; i++) {
            View childAt = this.f10570f.getChildAt(i);
            childAt.setBackgroundResource(this.f10568L);
            childAt.setPadding(this.f10589y, childAt.getPaddingTop(), this.f10589y, childAt.getPaddingBottom());
            TextView textView = (TextView) childAt.findViewById(C5869b.psts_tab_title);
            if (textView != null) {
                textView.setTextColor(this.f10557A);
                textView.setTypeface(this.f10564H, this.f10565I);
                textView.setTextSize(0, (float) this.f10590z);
                if (this.f10563G) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(getResources().getConfiguration().locale));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m11438b() {
        int i = this.f10583s;
        int i2 = this.f10584t;
        if (i < i2) {
            i = i2;
        }
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11439b(int i) {
        int i2 = 0;
        while (i2 < this.f10577m) {
            View childAt = this.f10570f.getChildAt(i2);
            if (i2 == i) {
                m11434a(childAt);
            } else {
                m11440b(childAt);
            }
            i2++;
        }
    }

    /* renamed from: a */
    public void mo19878a() {
        View view;
        this.f10570f.removeAllViews();
        this.f10577m = this.f10576l.getAdapter().getCount();
        for (int i = 0; i < this.f10577m; i++) {
            if (this.f10561E) {
                view = ((C5864c) this.f10576l.getAdapter()).mo19926a(this, i);
            } else {
                view = LayoutInflater.from(getContext()).inflate(C5870c.psts_tab, this, false);
            }
            m11433a(i, this.f10576l.getAdapter().getPageTitle(i), view);
        }
        m11445c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11440b(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(C5869b.psts_tab_title);
            if (textView != null) {
                textView.setSelected(false);
            }
            if (this.f10561E) {
                ((C5864c) this.f10576l.getAdapter()).mo19927a(view);
            }
        }
    }

    /* renamed from: a */
    private void m11433a(int i, CharSequence charSequence, View view) {
        TextView textView = (TextView) view.findViewById(C5869b.psts_tab_title);
        if (!(textView == null || charSequence == null)) {
            textView.setText(charSequence);
        }
        view.setFocusable(true);
        view.setOnClickListener(new C5862a(i));
        this.f10570f.addView(view, i, this.f10571g);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11432a(int i, int i2) {
        if (this.f10577m != 0) {
            int left = this.f10570f.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                int i3 = left - this.f10566J;
                C5004d<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
                left = (int) (((float) i3) + ((((Float) indicatorCoordinates.f8863b).floatValue() - ((Float) indicatorCoordinates.f8862a).floatValue()) / 2.0f));
            }
            if (left != this.f10567K) {
                this.f10567K = left;
                scrollTo(left, 0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11434a(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(C5869b.psts_tab_title);
            if (textView != null) {
                textView.setSelected(true);
            }
            if (this.f10561E) {
                ((C5864c) this.f10576l.getAdapter()).mo19928b(view);
            }
        }
    }

    /* renamed from: a */
    private ColorStateList m11430a(int i) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{i});
    }

    /* renamed from: a */
    private ColorStateList m11431a(int i, int i2, int i3) {
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842913}, new int[0]}, new int[]{i, i2, i3});
    }
}
