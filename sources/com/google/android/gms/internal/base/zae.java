package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class zae extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private int f23134f;

    /* renamed from: g */
    private long f23135g;

    /* renamed from: h */
    private int f23136h;

    /* renamed from: i */
    private int f23137i;

    /* renamed from: j */
    private int f23138j;

    /* renamed from: k */
    private int f23139k;

    /* renamed from: l */
    private boolean f23140l;

    /* renamed from: m */
    private boolean f23141m;

    /* renamed from: n */
    private C8245a f23142n;

    /* renamed from: o */
    private Drawable f23143o;

    /* renamed from: p */
    private Drawable f23144p;

    /* renamed from: q */
    private boolean f23145q;

    /* renamed from: r */
    private boolean f23146r;

    /* renamed from: s */
    private boolean f23147s;

    /* renamed from: t */
    private int f23148t;

    /* renamed from: a */
    private final boolean m25825a() {
        if (!this.f23145q) {
            this.f23146r = (this.f23143o.getConstantState() == null || this.f23144p.getConstantState() == null) ? false : true;
            this.f23145q = true;
        }
        return this.f23146r;
    }

    public final void draw(Canvas canvas) {
        int i = this.f23134f;
        boolean z = false;
        boolean z2 = true;
        if (i == 1) {
            this.f23135g = SystemClock.uptimeMillis();
            this.f23134f = 2;
        } else if (i == 2 && this.f23135g >= 0) {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f23135g)) / ((float) this.f23138j);
            if (uptimeMillis < 1.0f) {
                z2 = false;
            }
            if (z2) {
                this.f23134f = 0;
            }
            this.f23139k = (int) ((((float) this.f23136h) * Math.min(uptimeMillis, 1.0f)) + 0.0f);
            z = z2;
        } else {
            z = true;
        }
        int i2 = this.f23139k;
        boolean z3 = this.f23140l;
        Drawable drawable = this.f23143o;
        Drawable drawable2 = this.f23144p;
        if (z) {
            if (!z3 || i2 == 0) {
                drawable.draw(canvas);
            }
            int i3 = this.f23137i;
            if (i2 == i3) {
                drawable2.setAlpha(i3);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z3) {
            drawable.setAlpha(this.f23137i - i2);
        }
        drawable.draw(canvas);
        if (z3) {
            drawable.setAlpha(this.f23137i);
        }
        if (i2 > 0) {
            drawable2.setAlpha(i2);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.f23137i);
        }
        invalidateSelf();
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C8245a aVar = this.f23142n;
        return changingConfigurations | aVar.f23130a | aVar.f23131b;
    }

    public final Drawable.ConstantState getConstantState() {
        if (!m25825a()) {
            return null;
        }
        this.f23142n.f23130a = getChangingConfigurations();
        return this.f23142n;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.f23143o.getIntrinsicHeight(), this.f23144p.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.f23143o.getIntrinsicWidth(), this.f23144p.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.f23147s) {
            this.f23148t = Drawable.resolveOpacity(this.f23143o.getOpacity(), this.f23144p.getOpacity());
            this.f23147s = true;
        }
        return this.f23148t;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final Drawable mutate() {
        if (!this.f23141m && super.mutate() == this) {
            if (m25825a()) {
                this.f23143o.mutate();
                this.f23144p.mutate();
                this.f23141m = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f23143o.setBounds(rect);
        this.f23144p.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.f23139k == this.f23137i) {
            this.f23139k = i;
        }
        this.f23137i = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23143o.setColorFilter(colorFilter);
        this.f23144p.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
