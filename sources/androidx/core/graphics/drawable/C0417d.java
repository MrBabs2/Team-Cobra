package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.d */
/* compiled from: WrappedDrawableApi14 */
class C0417d extends Drawable implements Drawable.Callback, C0416c, C0415b {

    /* renamed from: l */
    static final PorterDuff.Mode f1811l = PorterDuff.Mode.SRC_IN;

    /* renamed from: f */
    private int f1812f;

    /* renamed from: g */
    private PorterDuff.Mode f1813g;

    /* renamed from: h */
    private boolean f1814h;

    /* renamed from: i */
    C0419f f1815i;

    /* renamed from: j */
    private boolean f1816j;

    /* renamed from: k */
    Drawable f1817k;

    C0417d(C0419f fVar, Resources resources) {
        this.f1815i = fVar;
        m2032a(resources);
    }

    /* renamed from: a */
    private void m2032a(Resources resources) {
        Drawable.ConstantState constantState;
        C0419f fVar = this.f1815i;
        if (fVar != null && (constantState = fVar.f1820b) != null) {
            mo2332a(constantState.newDrawable(resources));
        }
    }

    /* renamed from: c */
    private C0419f m2034c() {
        return new C0419f(this.f1815i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2333b() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f1817k.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0419f fVar = this.f1815i;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f1817k.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C0419f fVar = this.f1815i;
        if (fVar == null || !fVar.mo2367a()) {
            return null;
        }
        this.f1815i.f1819a = getChangingConfigurations();
        return this.f1815i;
    }

    public Drawable getCurrent() {
        return this.f1817k.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1817k.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1817k.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1817k.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1817k.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1817k.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1817k.getPadding(rect);
    }

    public int[] getState() {
        return this.f1817k.getState();
    }

    public Region getTransparentRegion() {
        return this.f1817k.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f1817k.isAutoMirrored();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1815i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo2333b()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f1815i
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f1821c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f1817k
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.C0417d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f1817k.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f1816j && super.mutate() == this) {
            this.f1815i = m2034c();
            Drawable drawable = this.f1817k;
            if (drawable != null) {
                drawable.mutate();
            }
            C0419f fVar = this.f1815i;
            if (fVar != null) {
                Drawable drawable2 = this.f1817k;
                fVar.f1820b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1816j = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1817k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f1817k.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1817k.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f1817k.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f1817k.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1817k.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1817k.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1817k.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m2033a(iArr) || this.f1817k.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1815i.f1821c = colorStateList;
        m2033a(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1815i.f1822d = mode;
        m2033a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1817k.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* renamed from: a */
    private boolean m2033a(int[] iArr) {
        if (!mo2333b()) {
            return false;
        }
        C0419f fVar = this.f1815i;
        ColorStateList colorStateList = fVar.f1821c;
        PorterDuff.Mode mode = fVar.f1822d;
        if (colorStateList == null || mode == null) {
            this.f1814h = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1814h && colorForState == this.f1812f && mode == this.f1813g)) {
                setColorFilter(colorForState, mode);
                this.f1812f = colorForState;
                this.f1813g = mode;
                this.f1814h = true;
                return true;
            }
        }
        return false;
    }

    C0417d(Drawable drawable) {
        this.f1815i = m2034c();
        mo2332a(drawable);
    }

    /* renamed from: a */
    public final Drawable mo2331a() {
        return this.f1817k;
    }

    /* renamed from: a */
    public final void mo2332a(Drawable drawable) {
        Drawable drawable2 = this.f1817k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1817k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0419f fVar = this.f1815i;
            if (fVar != null) {
                fVar.f1820b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
