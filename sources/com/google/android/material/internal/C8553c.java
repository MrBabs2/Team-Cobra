package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p050l.p075h.p084l.C5054g;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10578f;
import p112n.p277e.p279b.p282b.C10584l;

/* renamed from: com.google.android.material.internal.c */
/* compiled from: FlowLayout */
public class C8553c extends ViewGroup {

    /* renamed from: f */
    private int f24479f;

    /* renamed from: g */
    private int f24480g;

    /* renamed from: h */
    private boolean f24481h;

    /* renamed from: i */
    private int f24482i;

    public C8553c(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m27956a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C10584l.FlowLayout, 0, 0);
        this.f24479f = obtainStyledAttributes.getDimensionPixelSize(C10584l.FlowLayout_lineSpacing, 0);
        this.f24480g = obtainStyledAttributes.getDimensionPixelSize(C10584l.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f24480g;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f24479f;
    }

    /* access modifiers changed from: protected */
    public int getRowCount() {
        return this.f24482i;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f24482i = 0;
            return;
        }
        this.f24482i = 1;
        boolean z2 = C5071v.m9204p(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C10578f.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = C5054g.m9091b(marginLayoutParams);
                    i6 = C5054g.m9089a(marginLayoutParams);
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                if (!this.f24481h && measuredWidth > i7) {
                    i9 = this.f24479f + paddingTop;
                    this.f24482i++;
                    i8 = paddingRight;
                }
                childAt.setTag(C10578f.row_index_key, Integer.valueOf(this.f24482i - 1));
                int i11 = i8 + i5;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i5, measuredHeight);
                } else {
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                }
                i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f24480g;
                paddingTop = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i;
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i12 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= paddingRight || mo31400a()) {
                    i5 = i12;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f24479f + paddingTop;
                }
                int measuredWidth = i5 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i4 + i3 + childAt.getMeasuredWidth() + this.f24480g;
                if (i9 == getChildCount() - 1) {
                    i8 += i3;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m27955a(size, mode, i8 + getPaddingRight()), m27955a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f24480g = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f24479f = i;
    }

    public void setSingleLine(boolean z) {
        this.f24481h = z;
    }

    public C8553c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8553c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24481h = false;
        m27956a(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo31400a() {
        return this.f24481h;
    }

    @TargetApi(21)
    public C8553c(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f24481h = false;
        m27956a(context, attributeSet);
    }

    /* renamed from: a */
    private static int m27955a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    /* renamed from: a */
    public int mo31914a(View view) {
        Object tag = view.getTag(C10578f.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }
}
