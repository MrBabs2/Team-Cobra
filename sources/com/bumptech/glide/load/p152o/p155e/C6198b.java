package com.bumptech.glide.load.p152o.p155e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.C5987q;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.p152o.p157g.C6209c;
import com.bumptech.glide.p166r.C6315j;

/* renamed from: com.bumptech.glide.load.o.e.b */
/* compiled from: DrawableResource */
public abstract class C6198b<T extends Drawable> implements C5992u<T>, C5987q {

    /* renamed from: f */
    protected final T f11323f;

    public C6198b(T t) {
        C6315j.m12978a(t);
        this.f11323f = (Drawable) t;
    }

    /* renamed from: b */
    public void mo20245b() {
        T t = this.f11323f;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C6209c) {
            ((C6209c) t).mo20510c().prepareToDraw();
        }
    }

    public final T get() {
        Drawable.ConstantState constantState = this.f11323f.getConstantState();
        if (constantState == null) {
            return this.f11323f;
        }
        return constantState.newDrawable();
    }
}
