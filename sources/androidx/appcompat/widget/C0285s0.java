package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.s0 */
/* compiled from: TooltipCompat */
public class C0285s0 {
    /* renamed from: a */
    public static void m1359a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0287t0.m1361a(view, charSequence);
        }
    }
}
