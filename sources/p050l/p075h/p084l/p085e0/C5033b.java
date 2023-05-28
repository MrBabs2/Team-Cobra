package p050l.p075h.p084l.p085e0;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: l.h.l.e0.b */
/* compiled from: AccessibilityEventCompat */
public final class C5033b {
    /* renamed from: a */
    public static void m8987a(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m8986a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }
}
