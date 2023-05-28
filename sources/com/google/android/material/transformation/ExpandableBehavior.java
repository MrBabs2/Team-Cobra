package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.p291t.C10613b;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.C0343c<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f24697a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class C8649a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: f */
        final /* synthetic */ View f24698f;

        /* renamed from: g */
        final /* synthetic */ int f24699g;

        /* renamed from: h */
        final /* synthetic */ C10613b f24700h;

        C8649a(View view, int i, C10613b bVar) {
            this.f24698f = view;
            this.f24699g = i;
            this.f24700h = bVar;
        }

        public boolean onPreDraw() {
            this.f24698f.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f24697a == this.f24699g) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C10613b bVar = this.f24700h;
                expandableBehavior.mo32281a((View) bVar, this.f24698f, bVar.mo31675a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo32281a(View view, View view2, boolean z, boolean z2);

    /* renamed from: b */
    public boolean mo2153b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C10613b bVar = (C10613b) view2;
        if (!m28243a(bVar.mo31675a())) {
            return false;
        }
        this.f24697a = bVar.mo31675a() ? 1 : 2;
        return mo32281a((View) bVar, view, bVar.mo31675a(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C10613b mo32282e(CoordinatorLayout coordinatorLayout, View view) {
        List<View> b = coordinatorLayout.mo2087b(view);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            View view2 = b.get(i);
            if (mo2148a(coordinatorLayout, view, view2)) {
                return (C10613b) view2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo2143a(CoordinatorLayout coordinatorLayout, View view, int i) {
        C10613b e;
        if (C5071v.m9140E(view) || (e = mo32282e(coordinatorLayout, view)) == null || !m28243a(e.mo31675a())) {
            return false;
        }
        int i2 = e.mo31675a() ? 1 : 2;
        this.f24697a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new C8649a(view, i2, e));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private boolean m28243a(boolean z) {
        if (z) {
            int i = this.f24697a;
            return i == 0 || i == 2;
        } else if (this.f24697a == 1) {
            return true;
        } else {
            return false;
        }
    }
}
