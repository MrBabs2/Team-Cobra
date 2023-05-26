package com.airbnb.lottie.p139v;

import android.view.Choreographer;
import com.airbnb.lottie.C5648d;

/* renamed from: com.airbnb.lottie.v.c */
/* compiled from: LottieValueAnimator */
public class C5826c extends C5824a implements Choreographer.FrameCallback {

    /* renamed from: h */
    private float f10483h = 1.0f;

    /* renamed from: i */
    private boolean f10484i = false;

    /* renamed from: j */
    private long f10485j = 0;

    /* renamed from: k */
    private float f10486k = 0.0f;

    /* renamed from: l */
    private int f10487l = 0;

    /* renamed from: m */
    private float f10488m = -2.14748365E9f;

    /* renamed from: n */
    private float f10489n = 2.14748365E9f;

    /* renamed from: o */
    private C5648d f10490o;

    /* renamed from: p */
    protected boolean f10491p = false;

    /* renamed from: s */
    private float m11342s() {
        C5648d dVar = this.f10490o;
        if (dVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / dVar.mo19400g()) / Math.abs(this.f10483h);
    }

    /* renamed from: u */
    private boolean m11343u() {
        return mo19731l() < 0.0f;
    }

    /* renamed from: w */
    private void m11344w() {
        if (this.f10490o != null) {
            float f = this.f10486k;
            if (f < this.f10488m || f > this.f10489n) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f10488m), Float.valueOf(this.f10489n), Float.valueOf(this.f10486k)}));
            }
        }
    }

    /* renamed from: a */
    public void mo19715a(C5648d dVar) {
        boolean z = this.f10490o == null;
        this.f10490o = dVar;
        if (z) {
            mo19714a((int) Math.max(this.f10488m, dVar.mo19404k()), (int) Math.min(this.f10489n, dVar.mo19398e()));
        } else {
            mo19714a((int) dVar.mo19404k(), (int) dVar.mo19398e());
        }
        mo19713a((int) this.f10486k);
        this.f10485j = System.nanoTime();
    }

    /* renamed from: b */
    public void mo19716b(int i) {
        mo19714a((int) this.f10488m, i);
    }

    /* renamed from: c */
    public void mo19717c(int i) {
        mo19714a(i, (int) this.f10489n);
    }

    public void cancel() {
        mo19700b();
        mo19734q();
    }

    public void doFrame(long j) {
        mo19733n();
        if (this.f10490o != null && isRunning()) {
            long nanoTime = System.nanoTime();
            float s = ((float) (nanoTime - this.f10485j)) / m11342s();
            float f = this.f10486k;
            if (m11343u()) {
                s = -s;
            }
            float f2 = f + s;
            this.f10486k = f2;
            boolean z = !C5828e.m11374b(f2, mo19730k(), mo19729j());
            this.f10486k = C5828e.m11365a(this.f10486k, mo19730k(), mo19729j());
            this.f10485j = nanoTime;
            mo19703e();
            if (z) {
                if (getRepeatCount() == -1 || this.f10487l < getRepeatCount()) {
                    mo19702c();
                    this.f10487l++;
                    if (getRepeatMode() == 2) {
                        this.f10484i = !this.f10484i;
                        mo19735r();
                    } else {
                        this.f10486k = m11343u() ? mo19729j() : mo19730k();
                    }
                    this.f10485j = nanoTime;
                } else {
                    this.f10486k = mo19729j();
                    mo19734q();
                    mo19697a(m11343u());
                }
            }
            m11344w();
        }
    }

    /* renamed from: f */
    public void mo19721f() {
        this.f10490o = null;
        this.f10488m = -2.14748365E9f;
        this.f10489n = 2.14748365E9f;
    }

    /* renamed from: g */
    public void mo19722g() {
        mo19734q();
        mo19697a(m11343u());
    }

    public float getAnimatedFraction() {
        float k;
        float j;
        float k2;
        if (this.f10490o == null) {
            return 0.0f;
        }
        if (m11343u()) {
            k = mo19729j() - this.f10486k;
            j = mo19729j();
            k2 = mo19730k();
        } else {
            k = this.f10486k - mo19730k();
            j = mo19729j();
            k2 = mo19730k();
        }
        return k / (j - k2);
    }

    public Object getAnimatedValue() {
        return Float.valueOf(mo19726h());
    }

    public long getDuration() {
        C5648d dVar = this.f10490o;
        if (dVar == null) {
            return 0;
        }
        return (long) dVar.mo19396c();
    }

    /* renamed from: h */
    public float mo19726h() {
        C5648d dVar = this.f10490o;
        if (dVar == null) {
            return 0.0f;
        }
        return (this.f10486k - dVar.mo19404k()) / (this.f10490o.mo19398e() - this.f10490o.mo19404k());
    }

    /* renamed from: i */
    public float mo19727i() {
        return this.f10486k;
    }

    public boolean isRunning() {
        return this.f10491p;
    }

    /* renamed from: j */
    public float mo19729j() {
        C5648d dVar = this.f10490o;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.f10489n;
        return f == 2.14748365E9f ? dVar.mo19398e() : f;
    }

    /* renamed from: k */
    public float mo19730k() {
        C5648d dVar = this.f10490o;
        if (dVar == null) {
            return 0.0f;
        }
        float f = this.f10488m;
        return f == -2.14748365E9f ? dVar.mo19404k() : f;
    }

    /* renamed from: l */
    public float mo19731l() {
        return this.f10483h;
    }

    /* renamed from: m */
    public void mo19732m() {
        this.f10491p = true;
        mo19701b(m11343u());
        mo19713a((int) (m11343u() ? mo19729j() : mo19730k()));
        this.f10485j = System.nanoTime();
        this.f10487l = 0;
        mo19733n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo19733n() {
        if (isRunning()) {
            mo19718c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo19734q() {
        mo19718c(true);
    }

    /* renamed from: r */
    public void mo19735r() {
        mo19712a(-mo19731l());
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f10484i) {
            this.f10484i = false;
            mo19735r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo19718c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f10491p = false;
        }
    }

    /* renamed from: a */
    public void mo19713a(int i) {
        float f = (float) i;
        if (this.f10486k != f) {
            this.f10486k = C5828e.m11365a(f, mo19730k(), mo19729j());
            this.f10485j = System.nanoTime();
            mo19703e();
        }
    }

    /* renamed from: a */
    public void mo19714a(int i, int i2) {
        C5648d dVar = this.f10490o;
        float k = dVar == null ? -3.4028235E38f : dVar.mo19404k();
        C5648d dVar2 = this.f10490o;
        float e = dVar2 == null ? Float.MAX_VALUE : dVar2.mo19398e();
        float f = (float) i;
        this.f10488m = C5828e.m11365a(f, k, e);
        float f2 = (float) i2;
        this.f10489n = C5828e.m11365a(f2, k, e);
        mo19713a((int) C5828e.m11365a(this.f10486k, f, f2));
    }

    /* renamed from: a */
    public void mo19712a(float f) {
        this.f10483h = f;
    }
}
