package p050l.p108s;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: l.s.a0 */
/* compiled from: ViewOverlayApi18 */
class C5202a0 implements C5204b0 {

    /* renamed from: a */
    private final ViewOverlay f9219a;

    C5202a0(View view) {
        this.f9219a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo17992a(Drawable drawable) {
        this.f9219a.add(drawable);
    }

    /* renamed from: b */
    public void mo17993b(Drawable drawable) {
        this.f9219a.remove(drawable);
    }
}
