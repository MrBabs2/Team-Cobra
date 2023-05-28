package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p050l.p075h.p076e.C4949a;
import p112n.p277e.p279b.p282b.p297z.C10645k;
import p112n.p277e.p279b.p282b.p297z.C10649l;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* compiled from: BorderDrawable */
class C8526a extends Drawable {

    /* renamed from: a */
    private final C10649l f24331a = new C10649l();

    /* renamed from: b */
    private final Paint f24332b;

    /* renamed from: c */
    private final Path f24333c = new Path();

    /* renamed from: d */
    private final Rect f24334d = new Rect();

    /* renamed from: e */
    private final RectF f24335e = new RectF();

    /* renamed from: f */
    private final RectF f24336f = new RectF();

    /* renamed from: g */
    private final C8528b f24337g = new C8528b();

    /* renamed from: h */
    float f24338h;

    /* renamed from: i */
    private int f24339i;

    /* renamed from: j */
    private int f24340j;

    /* renamed from: k */
    private int f24341k;

    /* renamed from: l */
    private int f24342l;

    /* renamed from: m */
    private int f24343m;

    /* renamed from: n */
    private boolean f24344n = true;

    /* renamed from: o */
    private C10645k f24345o;

    /* renamed from: p */
    private ColorStateList f24346p;

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* compiled from: BorderDrawable */
    private class C8528b extends Drawable.ConstantState {
        private C8528b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return C8526a.this;
        }
    }

    C8526a(C10645k kVar) {
        this.f24345o = kVar;
        Paint paint = new Paint(1);
        this.f24332b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: b */
    private Shader m27775b() {
        Rect rect = this.f24334d;
        copyBounds(rect);
        float height = this.f24338h / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C4949a.m8708c(this.f24339i, this.f24343m), C4949a.m8708c(this.f24340j, this.f24343m), C4949a.m8708c(C4949a.m8709d(this.f24340j, 0), this.f24343m), C4949a.m8708c(C4949a.m8709d(this.f24342l, 0), this.f24343m), C4949a.m8708c(this.f24342l, this.f24343m), C4949a.m8708c(this.f24341k, this.f24343m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: a */
    public void mo31752a(float f) {
        if (this.f24338h != f) {
            this.f24338h = f;
            this.f24332b.setStrokeWidth(f * 1.3333f);
            this.f24344n = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f24344n) {
            this.f24332b.setShader(m27775b());
            this.f24344n = false;
        }
        float strokeWidth = this.f24332b.getStrokeWidth() / 2.0f;
        copyBounds(this.f24334d);
        this.f24335e.set(this.f24334d);
        float min = Math.min(this.f24345o.mo36294j().mo36226a(mo31751a()), this.f24335e.width() / 2.0f);
        if (this.f24345o.mo36285a(mo31751a())) {
            this.f24335e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f24335e, min, min, this.f24332b);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f24337g;
    }

    public int getOpacity() {
        return this.f24338h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f24345o.mo36285a(mo31751a())) {
            outline.setRoundRect(getBounds(), this.f24345o.mo36294j().mo36226a(mo31751a()));
            return;
        }
        copyBounds(this.f24334d);
        this.f24335e.set(this.f24334d);
        this.f24331a.mo36316a(this.f24345o, 1.0f, this.f24335e, this.f24333c);
        if (this.f24333c.isConvex()) {
            outline.setConvexPath(this.f24333c);
        }
    }

    public boolean getPadding(Rect rect) {
        if (!this.f24345o.mo36285a(mo31751a())) {
            return true;
        }
        int round = Math.round(this.f24338h);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f24346p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f24344n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f24346p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f24343m)) == this.f24343m)) {
            this.f24344n = true;
            this.f24343m = colorForState;
        }
        if (this.f24344n) {
            invalidateSelf();
        }
        return this.f24344n;
    }

    public void setAlpha(int i) {
        this.f24332b.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f24332b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31754a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f24343m = colorStateList.getColorForState(getState(), this.f24343m);
        }
        this.f24346p = colorStateList;
        this.f24344n = true;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31753a(int i, int i2, int i3, int i4) {
        this.f24339i = i;
        this.f24340j = i2;
        this.f24341k = i3;
        this.f24342l = i4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public RectF mo31751a() {
        this.f24336f.set(getBounds());
        return this.f24336f;
    }

    /* renamed from: a */
    public void mo31755a(C10645k kVar) {
        this.f24345o = kVar;
        invalidateSelf();
    }
}
