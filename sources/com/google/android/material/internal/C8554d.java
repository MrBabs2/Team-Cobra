package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0229c0;
import p112n.p277e.p279b.p282b.C10584l;

/* renamed from: com.google.android.material.internal.d */
/* compiled from: ForegroundLinearLayout */
public class C8554d extends C0229c0 {

    /* renamed from: u */
    private Drawable f24483u;

    /* renamed from: v */
    private final Rect f24484v;

    /* renamed from: w */
    private final Rect f24485w;

    /* renamed from: x */
    private int f24486x;

    /* renamed from: y */
    protected boolean f24487y;

    /* renamed from: z */
    boolean f24488z;

    public C8554d(Context context) {
        this(context, (AttributeSet) null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f24483u;
        if (drawable != null) {
            if (this.f24488z) {
                this.f24488z = false;
                Rect rect = this.f24484v;
                Rect rect2 = this.f24485w;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f24487y) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f24486x, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f24483u;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f24483u;
        if (drawable != null && drawable.isStateful()) {
            this.f24483u.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f24483u;
    }

    public int getForegroundGravity() {
        return this.f24486x;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f24483u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f24488z = z | this.f24488z;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f24488z = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f24483u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f24483u);
            }
            this.f24483u = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f24486x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f24486x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f24486x = i;
            if (i == 119 && this.f24483u != null) {
                this.f24483u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f24483u;
    }

    public C8554d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8554d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24484v = new Rect();
        this.f24485w = new Rect();
        this.f24486x = 119;
        this.f24487y = true;
        this.f24488z = false;
        TypedArray c = C8566j.m27997c(context, attributeSet, C10584l.ForegroundLinearLayout, i, 0, new int[0]);
        this.f24486x = c.getInt(C10584l.ForegroundLinearLayout_android_foregroundGravity, this.f24486x);
        Drawable drawable = c.getDrawable(C10584l.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f24487y = c.getBoolean(C10584l.ForegroundLinearLayout_foregroundInsidePadding, true);
        c.recycle();
    }
}
