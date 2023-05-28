package com.bumptech.glide.p162p.p163l;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.p162p.p164m.C6296d;

/* renamed from: com.bumptech.glide.p.l.d */
/* compiled from: ImageViewTarget */
public abstract class C6282d<Z> extends C6288j<ImageView, Z> implements C6296d.C6297a {

    /* renamed from: l */
    private Animatable f11517l;

    public C6282d(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: b */
    private void m12906b(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f11517l = animatable;
            animatable.start();
            return;
        }
        this.f11517l = null;
    }

    /* renamed from: c */
    private void m12907c(Z z) {
        mo20713a(z);
        m12906b(z);
    }

    /* renamed from: a */
    public Drawable mo20715a() {
        return ((ImageView) this.f11525f).getDrawable();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo20713a(Z z);

    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        Animatable animatable = this.f11517l;
        if (animatable != null) {
            animatable.stop();
        }
        m12907c((Object) null);
        mo20716a(drawable);
    }

    public void onLoadFailed(Drawable drawable) {
        super.onLoadFailed(drawable);
        m12907c((Object) null);
        mo20716a(drawable);
    }

    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m12907c((Object) null);
        mo20716a(drawable);
    }

    public void onResourceReady(Z z, C6296d<? super Z> dVar) {
        if (dVar == null || !dVar.mo20728a(z, this)) {
            m12907c(z);
        } else {
            m12906b(z);
        }
    }

    public void onStart() {
        Animatable animatable = this.f11517l;
        if (animatable != null) {
            animatable.start();
        }
    }

    public void onStop() {
        Animatable animatable = this.f11517l;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: a */
    public void mo20716a(Drawable drawable) {
        ((ImageView) this.f11525f).setImageDrawable(drawable);
    }
}
