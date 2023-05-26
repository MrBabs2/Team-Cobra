package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0414a;
import p050l.p051a.C4799j;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.appcompat.widget.q */
/* compiled from: AppCompatSeekBarHelper */
class C0277q extends C0273o {

    /* renamed from: d */
    private final SeekBar f1172d;

    /* renamed from: e */
    private Drawable f1173e;

    /* renamed from: f */
    private ColorStateList f1174f = null;

    /* renamed from: g */
    private PorterDuff.Mode f1175g = null;

    /* renamed from: h */
    private boolean f1176h = false;

    /* renamed from: i */
    private boolean f1177i = false;

    C0277q(SeekBar seekBar) {
        super(seekBar);
        this.f1172d = seekBar;
    }

    /* renamed from: d */
    private void m1263d() {
        if (this.f1173e == null) {
            return;
        }
        if (this.f1176h || this.f1177i) {
            Drawable i = C0414a.m2029i(this.f1173e.mutate());
            this.f1173e = i;
            if (this.f1176h) {
                C0414a.m2014a(i, this.f1174f);
            }
            if (this.f1177i) {
                C0414a.m2017a(this.f1173e, this.f1175g);
            }
            if (this.f1173e.isStateful()) {
                this.f1173e.setState(this.f1172d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1702a(AttributeSet attributeSet, int i) {
        super.mo1702a(attributeSet, i);
        C0278q0 a = C0278q0.m1271a(this.f1172d.getContext(), attributeSet, C4799j.AppCompatSeekBar, i, 0);
        SeekBar seekBar = this.f1172d;
        C5071v.m9157a(seekBar, seekBar.getContext(), C4799j.AppCompatSeekBar, attributeSet, a.mo1714a(), i, 0);
        Drawable c = a.mo1722c(C4799j.AppCompatSeekBar_android_thumb);
        if (c != null) {
            this.f1172d.setThumb(c);
        }
        mo1708a(a.mo1719b(C4799j.AppCompatSeekBar_tickMark));
        if (a.mo1730g(C4799j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1175g = C0301y.m1449a(a.mo1723d(C4799j.AppCompatSeekBar_tickMarkTintMode, -1), this.f1175g);
            this.f1177i = true;
        }
        if (a.mo1730g(C4799j.AppCompatSeekBar_tickMarkTint)) {
            this.f1174f = a.mo1713a(C4799j.AppCompatSeekBar_tickMarkTint);
            this.f1176h = true;
        }
        a.mo1720b();
        m1263d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1709b() {
        Drawable drawable = this.f1173e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1172d.getDrawableState())) {
            this.f1172d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1710c() {
        Drawable drawable = this.f1173e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1708a(Drawable drawable) {
        Drawable drawable2 = this.f1173e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1173e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1172d);
            C0414a.m2020a(drawable, C5071v.m9204p(this.f1172d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1172d.getDrawableState());
            }
            m1263d();
        }
        this.f1172d.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1707a(Canvas canvas) {
        if (this.f1173e != null) {
            int max = this.f1172d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1173e.getIntrinsicWidth();
                int intrinsicHeight = this.f1173e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1173e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1172d.getWidth() - this.f1172d.getPaddingLeft()) - this.f1172d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1172d.getPaddingLeft(), (float) (this.f1172d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1173e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
