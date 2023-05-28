package p050l.p075h.p084l;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: l.h.l.t */
/* compiled from: PointerIconCompat */
public final class C5069t {

    /* renamed from: a */
    private Object f8932a;

    private C5069t(Object obj) {
        this.f8932a = obj;
    }

    /* renamed from: a */
    public Object mo17617a() {
        return this.f8932a;
    }

    /* renamed from: a */
    public static C5069t m9134a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C5069t(PointerIcon.getSystemIcon(context, i));
        }
        return new C5069t((Object) null);
    }
}
