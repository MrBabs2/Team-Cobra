package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p050l.p051a.C4799j;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.appcompat.widget.d */
/* compiled from: AppCompatBackgroundHelper */
class C0231d {

    /* renamed from: a */
    private final View f1008a;

    /* renamed from: b */
    private final C0253h f1009b;

    /* renamed from: c */
    private int f1010c = -1;

    /* renamed from: d */
    private C0274o0 f1011d;

    /* renamed from: e */
    private C0274o0 f1012e;

    /* renamed from: f */
    private C0274o0 f1013f;

    C0231d(View view) {
        this.f1008a = view;
        this.f1009b = C0253h.m1184b();
    }

    /* renamed from: d */
    private boolean m1082d() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1011d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1481a(AttributeSet attributeSet, int i) {
        C0278q0 a = C0278q0.m1271a(this.f1008a.getContext(), attributeSet, C4799j.ViewBackgroundHelper, i, 0);
        View view = this.f1008a;
        C5071v.m9157a(view, view.getContext(), C4799j.ViewBackgroundHelper, attributeSet, a.mo1714a(), i, 0);
        try {
            if (a.mo1730g(C4799j.ViewBackgroundHelper_android_background)) {
                this.f1010c = a.mo1729g(C4799j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f1009b.mo1571b(this.f1008a.getContext(), this.f1010c);
                if (b != null) {
                    mo1478a(b);
                }
            }
            if (a.mo1730g(C4799j.ViewBackgroundHelper_backgroundTint)) {
                C5071v.m9158a(this.f1008a, a.mo1713a(C4799j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo1730g(C4799j.ViewBackgroundHelper_backgroundTintMode)) {
                C5071v.m9159a(this.f1008a, C0301y.m1449a(a.mo1723d(C4799j.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo1720b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1483b(ColorStateList colorStateList) {
        if (this.f1012e == null) {
            this.f1012e = new C0274o0();
        }
        C0274o0 o0Var = this.f1012e;
        o0Var.f1166a = colorStateList;
        o0Var.f1169d = true;
        mo1476a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo1484c() {
        C0274o0 o0Var = this.f1012e;
        if (o0Var != null) {
            return o0Var.f1167b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo1482b() {
        C0274o0 o0Var = this.f1012e;
        if (o0Var != null) {
            return o0Var.f1166a;
        }
        return null;
    }

    /* renamed from: b */
    private boolean m1081b(Drawable drawable) {
        if (this.f1013f == null) {
            this.f1013f = new C0274o0();
        }
        C0274o0 o0Var = this.f1013f;
        o0Var.mo1703a();
        ColorStateList h = C5071v.m9194h(this.f1008a);
        if (h != null) {
            o0Var.f1169d = true;
            o0Var.f1166a = h;
        }
        PorterDuff.Mode i = C5071v.m9196i(this.f1008a);
        if (i != null) {
            o0Var.f1168c = true;
            o0Var.f1167b = i;
        }
        if (!o0Var.f1169d && !o0Var.f1168c) {
            return false;
        }
        C0253h.m1183a(drawable, o0Var, this.f1008a.getDrawableState());
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1477a(int i) {
        this.f1010c = i;
        C0253h hVar = this.f1009b;
        mo1478a(hVar != null ? hVar.mo1571b(this.f1008a.getContext(), i) : null);
        mo1476a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1480a(Drawable drawable) {
        this.f1010c = -1;
        mo1478a((ColorStateList) null);
        mo1476a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1479a(PorterDuff.Mode mode) {
        if (this.f1012e == null) {
            this.f1012e = new C0274o0();
        }
        C0274o0 o0Var = this.f1012e;
        o0Var.f1167b = mode;
        o0Var.f1168c = true;
        mo1476a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1476a() {
        Drawable background = this.f1008a.getBackground();
        if (background == null) {
            return;
        }
        if (!m1082d() || !m1081b(background)) {
            C0274o0 o0Var = this.f1012e;
            if (o0Var != null) {
                C0253h.m1183a(background, o0Var, this.f1008a.getDrawableState());
                return;
            }
            C0274o0 o0Var2 = this.f1011d;
            if (o0Var2 != null) {
                C0253h.m1183a(background, o0Var2, this.f1008a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1478a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1011d == null) {
                this.f1011d = new C0274o0();
            }
            C0274o0 o0Var = this.f1011d;
            o0Var.f1166a = colorStateList;
            o0Var.f1169d = true;
        } else {
            this.f1011d = null;
        }
        mo1476a();
    }
}
