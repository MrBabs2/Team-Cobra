package p050l.p075h.p084l;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: l.h.l.s */
/* compiled from: OneShotPreDrawListener */
public final class C5068s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final View f8929f;

    /* renamed from: g */
    private ViewTreeObserver f8930g;

    /* renamed from: h */
    private final Runnable f8931h;

    private C5068s(View view, Runnable runnable) {
        this.f8929f = view;
        this.f8930g = view.getViewTreeObserver();
        this.f8931h = runnable;
    }

    /* renamed from: a */
    public static C5068s m9132a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C5068s sVar = new C5068s(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(sVar);
            view.addOnAttachStateChangeListener(sVar);
            return sVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public boolean onPreDraw() {
        mo17613a();
        this.f8931h.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f8930g = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo17613a();
    }

    /* renamed from: a */
    public void mo17613a() {
        if (this.f8930g.isAlive()) {
            this.f8930g.removeOnPreDrawListener(this);
        } else {
            this.f8929f.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f8929f.removeOnAttachStateChangeListener(this);
    }
}
