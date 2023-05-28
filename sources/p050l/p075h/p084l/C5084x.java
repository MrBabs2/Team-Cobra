package p050l.p075h.p084l;

import android.os.Build;
import android.view.ViewGroup;
import p050l.p075h.C4947c;

/* renamed from: l.h.l.x */
/* compiled from: ViewGroupCompat */
public final class C5084x {
    /* renamed from: a */
    public static boolean m9259a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C4947c.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C5071v.m9211w(viewGroup) == null) ? false : true;
    }
}
