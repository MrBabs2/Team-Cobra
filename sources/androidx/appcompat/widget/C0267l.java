package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0432e;
import p050l.p051a.C4799j;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.appcompat.widget.l */
/* compiled from: AppCompatImageHelper */
public class C0267l {

    /* renamed from: a */
    private final ImageView f1143a;

    /* renamed from: b */
    private C0274o0 f1144b;

    /* renamed from: c */
    private C0274o0 f1145c;

    /* renamed from: d */
    private C0274o0 f1146d;

    public C0267l(ImageView imageView) {
        this.f1143a = imageView;
    }

    /* renamed from: e */
    private boolean m1238e() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1144b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo1682a(AttributeSet attributeSet, int i) {
        int g;
        C0278q0 a = C0278q0.m1271a(this.f1143a.getContext(), attributeSet, C4799j.AppCompatImageView, i, 0);
        ImageView imageView = this.f1143a;
        C5071v.m9157a(imageView, imageView.getContext(), C4799j.AppCompatImageView, attributeSet, a.mo1714a(), i, 0);
        try {
            Drawable drawable = this.f1143a.getDrawable();
            if (!(drawable != null || (g = a.mo1729g(C4799j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C4800a.m7936c(this.f1143a.getContext(), g)) == null)) {
                this.f1143a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0301y.m1451b(drawable);
            }
            if (a.mo1730g(C4799j.AppCompatImageView_tint)) {
                C0432e.m2133a(this.f1143a, a.mo1713a(C4799j.AppCompatImageView_tint));
            }
            if (a.mo1730g(C4799j.AppCompatImageView_tintMode)) {
                C0432e.m2134a(this.f1143a, C0301y.m1449a(a.mo1723d(C4799j.AppCompatImageView_tintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo1720b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ColorStateList mo1683b() {
        C0274o0 o0Var = this.f1145c;
        if (o0Var != null) {
            return o0Var.f1166a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PorterDuff.Mode mo1684c() {
        C0274o0 o0Var = this.f1145c;
        if (o0Var != null) {
            return o0Var.f1167b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo1685d() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1143a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: a */
    public void mo1679a(int i) {
        if (i != 0) {
            Drawable c = C4800a.m7936c(this.f1143a.getContext(), i);
            if (c != null) {
                C0301y.m1451b(c);
            }
            this.f1143a.setImageDrawable(c);
        } else {
            this.f1143a.setImageDrawable((Drawable) null);
        }
        mo1678a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1680a(ColorStateList colorStateList) {
        if (this.f1145c == null) {
            this.f1145c = new C0274o0();
        }
        C0274o0 o0Var = this.f1145c;
        o0Var.f1166a = colorStateList;
        o0Var.f1169d = true;
        mo1678a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1681a(PorterDuff.Mode mode) {
        if (this.f1145c == null) {
            this.f1145c = new C0274o0();
        }
        C0274o0 o0Var = this.f1145c;
        o0Var.f1167b = mode;
        o0Var.f1168c = true;
        mo1678a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1678a() {
        Drawable drawable = this.f1143a.getDrawable();
        if (drawable != null) {
            C0301y.m1451b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m1238e() || !m1237a(drawable)) {
            C0274o0 o0Var = this.f1145c;
            if (o0Var != null) {
                C0253h.m1183a(drawable, o0Var, this.f1143a.getDrawableState());
                return;
            }
            C0274o0 o0Var2 = this.f1144b;
            if (o0Var2 != null) {
                C0253h.m1183a(drawable, o0Var2, this.f1143a.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    private boolean m1237a(Drawable drawable) {
        if (this.f1146d == null) {
            this.f1146d = new C0274o0();
        }
        C0274o0 o0Var = this.f1146d;
        o0Var.mo1703a();
        ColorStateList a = C0432e.m2132a(this.f1143a);
        if (a != null) {
            o0Var.f1169d = true;
            o0Var.f1166a = a;
        }
        PorterDuff.Mode b = C0432e.m2135b(this.f1143a);
        if (b != null) {
            o0Var.f1168c = true;
            o0Var.f1167b = b;
        }
        if (!o0Var.f1169d && !o0Var.f1168c) {
            return false;
        }
        C0253h.m1183a(drawable, o0Var, this.f1143a.getDrawableState());
        return true;
    }
}
