package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10645k;

/* renamed from: com.google.android.material.textfield.c */
/* compiled from: CutoutDrawable */
class C8624c extends C10638g {

    /* renamed from: D */
    private final Paint f24624D;

    /* renamed from: E */
    private final RectF f24625E;

    /* renamed from: F */
    private int f24626F;

    C8624c() {
        this((C10645k) null);
    }

    /* renamed from: b */
    private void m28128b(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m28127a(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        m28129c(canvas);
    }

    /* renamed from: c */
    private void m28129c(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f24626F = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
            return;
        }
        this.f24626F = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
    }

    /* renamed from: w */
    private void m28130w() {
        this.f24624D.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f24624D.setColor(-1);
        this.f24624D.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32229a(float f, float f2, float f3, float f4) {
        RectF rectF = this.f24625E;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            this.f24625E.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        m28128b(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f24625E, this.f24624D);
        m28126a(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo31544u() {
        return !this.f24625E.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo31547v() {
        mo32229a(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C8624c(C10645k kVar) {
        super(kVar == null ? new C10645k() : kVar);
        this.f24624D = new Paint(1);
        m28130w();
        this.f24625E = new RectF();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32230a(RectF rectF) {
        mo32229a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: a */
    private void m28126a(Canvas canvas) {
        if (!m28127a(getCallback())) {
            canvas.restoreToCount(this.f24626F);
        }
    }

    /* renamed from: a */
    private boolean m28127a(Drawable.Callback callback) {
        return callback instanceof View;
    }
}
