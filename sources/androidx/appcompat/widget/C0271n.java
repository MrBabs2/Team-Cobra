package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0435h;
import p050l.p051a.C4799j;

/* renamed from: androidx.appcompat.widget.n */
/* compiled from: AppCompatPopupWindow */
class C0271n extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1157b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a */
    private boolean f1158a;

    public C0271n(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m1253a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m1253a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0278q0 a = C0278q0.m1271a(context, attributeSet, C4799j.PopupWindow, i, i2);
        if (a.mo1730g(C4799j.PopupWindow_overlapAnchor)) {
            m1254a(a.mo1716a(C4799j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo1719b(C4799j.PopupWindow_android_popupBackground));
        a.mo1720b();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1157b && this.f1158a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1157b && this.f1158a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1157b && this.f1158a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    /* renamed from: a */
    private void m1254a(boolean z) {
        if (f1157b) {
            this.f1158a = z;
        } else {
            C0435h.m2143a((PopupWindow) this, z);
        }
    }
}
