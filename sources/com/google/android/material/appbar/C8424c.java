package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.c */
/* compiled from: ViewOffsetBehavior */
class C8424c<V extends View> extends CoordinatorLayout.C0343c<V> {

    /* renamed from: a */
    private C8425d f23809a;

    /* renamed from: b */
    private int f23810b = 0;

    /* renamed from: c */
    private int f23811c = 0;

    public C8424c() {
    }

    /* renamed from: a */
    public boolean mo2143a(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo30871b(coordinatorLayout, v, i);
        if (this.f23809a == null) {
            this.f23809a = new C8425d(v);
        }
        this.f23809a.mo30882d();
        this.f23809a.mo30877a();
        int i2 = this.f23810b;
        if (i2 != 0) {
            this.f23809a.mo30880b(i2);
            this.f23810b = 0;
        }
        int i3 = this.f23811c;
        if (i3 == 0) {
            return true;
        }
        this.f23809a.mo30878a(i3);
        this.f23811c = 0;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo30871b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo2093c((View) v, i);
    }

    /* renamed from: b */
    public int mo30876b() {
        C8425d dVar = this.f23809a;
        if (dVar != null) {
            return dVar.mo30881c();
        }
        return 0;
    }

    public C8424c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo30875a(int i) {
        C8425d dVar = this.f23809a;
        if (dVar != null) {
            return dVar.mo30880b(i);
        }
        this.f23810b = i;
        return false;
    }
}
