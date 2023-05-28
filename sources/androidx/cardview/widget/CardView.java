package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p050l.p065d.C4863a;
import p050l.p065d.C4864b;
import p050l.p065d.C4866d;
import p050l.p065d.C4867e;

public class CardView extends FrameLayout {

    /* renamed from: m */
    private static final int[] f1286m = {16842801};

    /* renamed from: n */
    private static final C0312e f1287n;

    /* renamed from: f */
    private boolean f1288f;

    /* renamed from: g */
    private boolean f1289g;

    /* renamed from: h */
    int f1290h;

    /* renamed from: i */
    int f1291i;

    /* renamed from: j */
    final Rect f1292j;

    /* renamed from: k */
    final Rect f1293k;

    /* renamed from: l */
    private final C0311d f1294l;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f1287n = new C0308b();
        } else if (i >= 17) {
            f1287n = new C0306a();
        } else {
            f1287n = new C0309c();
        }
        f1287n.mo1915a();
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1287n.mo1926e(this.f1294l);
    }

    public float getCardElevation() {
        return f1287n.mo1917a(this.f1294l);
    }

    public int getContentPaddingBottom() {
        return this.f1292j.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1292j.left;
    }

    public int getContentPaddingRight() {
        return this.f1292j.right;
    }

    public int getContentPaddingTop() {
        return this.f1292j.top;
    }

    public float getMaxCardElevation() {
        return f1287n.mo1925d(this.f1294l);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1289g;
    }

    public float getRadius() {
        return f1287n.mo1921b(this.f1294l);
    }

    public boolean getUseCompatPadding() {
        return this.f1288f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f1287n instanceof C0308b)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f1287n.mo1929h(this.f1294l)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f1287n.mo1928g(this.f1294l)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f1287n.mo1920a(this.f1294l, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f1287n.mo1922b(this.f1294l, f);
    }

    public void setMaxCardElevation(float f) {
        f1287n.mo1924c(this.f1294l, f);
    }

    public void setMinimumHeight(int i) {
        this.f1291i = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f1290h = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1289g) {
            this.f1289g = z;
            f1287n.mo1930i(this.f1294l);
        }
    }

    public void setRadius(float f) {
        f1287n.mo1918a(this.f1294l, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1288f != z) {
            this.f1288f = z;
            f1287n.mo1923c(this.f1294l);
        }
    }

    /* renamed from: androidx.cardview.widget.CardView$a */
    class C0305a implements C0311d {

        /* renamed from: a */
        private Drawable f1295a;

        C0305a() {
        }

        /* renamed from: a */
        public void mo1910a(Drawable drawable) {
            this.f1295a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: b */
        public boolean mo1912b() {
            return CardView.this.getUseCompatPadding();
        }

        /* renamed from: c */
        public Drawable mo1913c() {
            return this.f1295a;
        }

        /* renamed from: d */
        public View mo1914d() {
            return CardView.this;
        }

        /* renamed from: a */
        public boolean mo1911a() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: a */
        public void mo1909a(int i, int i2, int i3, int i4) {
            CardView.this.f1293k.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1292j;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: a */
        public void mo1908a(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f1290h) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f1291i) {
                CardView.super.setMinimumHeight(i2);
            }
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4863a.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1287n.mo1920a(this.f1294l, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        this.f1292j = new Rect();
        this.f1293k = new Rect();
        this.f1294l = new C0305a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4867e.CardView, i, C4866d.CardView);
        if (obtainStyledAttributes.hasValue(C4867e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(C4867e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1286m);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C4864b.cardview_light_background);
            } else {
                i2 = getResources().getColor(C4864b.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C4867e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C4867e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C4867e.CardView_cardMaxElevation, 0.0f);
        this.f1288f = obtainStyledAttributes.getBoolean(C4867e.CardView_cardUseCompatPadding, false);
        this.f1289g = obtainStyledAttributes.getBoolean(C4867e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C4867e.CardView_contentPadding, 0);
        this.f1292j.left = obtainStyledAttributes.getDimensionPixelSize(C4867e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f1292j.top = obtainStyledAttributes.getDimensionPixelSize(C4867e.CardView_contentPaddingTop, dimensionPixelSize);
        this.f1292j.right = obtainStyledAttributes.getDimensionPixelSize(C4867e.CardView_contentPaddingRight, dimensionPixelSize);
        this.f1292j.bottom = obtainStyledAttributes.getDimensionPixelSize(C4867e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1290h = obtainStyledAttributes.getDimensionPixelSize(C4867e.CardView_android_minWidth, 0);
        this.f1291i = obtainStyledAttributes.getDimensionPixelSize(C4867e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f1287n.mo1919a(this.f1294l, context, colorStateList, dimension, dimension2, f);
    }

    /* renamed from: a */
    public void mo1885a(int i, int i2, int i3, int i4) {
        this.f1292j.set(i, i2, i3, i4);
        f1287n.mo1927f(this.f1294l);
    }
}
