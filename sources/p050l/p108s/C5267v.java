package p050l.p108s;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: l.s.v */
/* compiled from: ViewGroupOverlayApi18 */
class C5267v implements C5268w {

    /* renamed from: a */
    private final ViewGroupOverlay f9374a;

    C5267v(ViewGroup viewGroup) {
        this.f9374a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo17992a(Drawable drawable) {
        this.f9374a.add(drawable);
    }

    /* renamed from: b */
    public void mo17993b(Drawable drawable) {
        this.f9374a.remove(drawable);
    }

    /* renamed from: a */
    public void mo18126a(View view) {
        this.f9374a.add(view);
    }

    /* renamed from: b */
    public void mo18127b(View view) {
        this.f9374a.remove(view);
    }
}
