package com.bumptech.glide.p162p.p164m;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.bumptech.glide.p162p.p164m.C6296d;

/* renamed from: com.bumptech.glide.p.m.b */
/* compiled from: DrawableCrossFadeTransition */
public class C6293b implements C6296d<Drawable> {

    /* renamed from: a */
    private final int f11541a;

    /* renamed from: b */
    private final boolean f11542b;

    public C6293b(int i, boolean z) {
        this.f11541a = i;
        this.f11542b = z;
    }

    /* renamed from: a */
    public boolean mo20728a(Drawable drawable, C6296d.C6297a aVar) {
        Drawable a = aVar.mo20715a();
        if (a == null) {
            a = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{a, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f11542b);
        transitionDrawable.startTransition(this.f11541a);
        aVar.mo20716a(transitionDrawable);
        return true;
    }
}
