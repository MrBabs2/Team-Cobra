package p050l.p051a.p054l.p055a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0414a;

/* renamed from: l.a.l.a.c */
/* compiled from: DrawableWrapper */
public class C4814c extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private Drawable f8207f;

    public C4814c(Drawable drawable) {
        mo16737a(drawable);
    }

    /* renamed from: a */
    public Drawable mo16736a() {
        return this.f8207f;
    }

    public void draw(Canvas canvas) {
        this.f8207f.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f8207f.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f8207f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f8207f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f8207f.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f8207f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f8207f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f8207f.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f8207f.getPadding(rect);
    }

    public int[] getState() {
        return this.f8207f.getState();
    }

    public Region getTransparentRegion() {
        return this.f8207f.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0414a.m2026f(this.f8207f);
    }

    public boolean isStateful() {
        return this.f8207f.isStateful();
    }

    public void jumpToCurrentState() {
        this.f8207f.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f8207f.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f8207f.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f8207f.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0414a.m2018a(this.f8207f, z);
    }

    public void setChangingConfigurations(int i) {
        this.f8207f.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f8207f.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f8207f.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f8207f.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0414a.m2012a(this.f8207f, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0414a.m2013a(this.f8207f, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f8207f.setState(iArr);
    }

    public void setTint(int i) {
        C0414a.m2022b(this.f8207f, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0414a.m2014a(this.f8207f, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0414a.m2017a(this.f8207f, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f8207f.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* renamed from: a */
    public void mo16737a(Drawable drawable) {
        Drawable drawable2 = this.f8207f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f8207f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
