package p050l.p075h.p084l.p085e0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: l.h.l.e0.a */
/* compiled from: AccessibilityClickableSpanCompat */
public final class C5032a extends ClickableSpan {

    /* renamed from: f */
    private final int f8893f;

    /* renamed from: g */
    private final C5034c f8894g;

    /* renamed from: h */
    private final int f8895h;

    public C5032a(int i, C5034c cVar, int i2) {
        this.f8893f = i;
        this.f8894g = cVar;
        this.f8895h = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f8893f);
        this.f8894g.mo17515a(this.f8895h, bundle);
    }
}
