package p112n.p277e.p279b.p282b.p291t;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: n.e.b.b.t.c */
/* compiled from: ExpandableWidgetHelper */
public final class C10614c {

    /* renamed from: a */
    private final View f28498a;

    /* renamed from: b */
    private boolean f28499b = false;

    /* renamed from: c */
    private int f28500c = 0;

    public C10614c(C10613b bVar) {
        this.f28498a = (View) bVar;
    }

    /* renamed from: d */
    private void m35936d() {
        ViewParent parent = this.f28498a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).mo2081a(this.f28498a);
        }
    }

    /* renamed from: a */
    public void mo36198a(Bundle bundle) {
        this.f28499b = bundle.getBoolean("expanded", false);
        this.f28500c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f28499b) {
            m35936d();
        }
    }

    /* renamed from: b */
    public boolean mo36199b() {
        return this.f28499b;
    }

    /* renamed from: c */
    public Bundle mo36200c() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f28499b);
        bundle.putInt("expandedComponentIdHint", this.f28500c);
        return bundle;
    }

    /* renamed from: a */
    public void mo36197a(int i) {
        this.f28500c = i;
    }

    /* renamed from: a */
    public int mo36196a() {
        return this.f28500c;
    }
}
