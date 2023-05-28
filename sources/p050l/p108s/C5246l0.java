package p050l.p108s;

import android.view.View;
import android.view.WindowId;

/* renamed from: l.s.l0 */
/* compiled from: WindowIdApi18 */
class C5246l0 implements C5254m0 {

    /* renamed from: a */
    private final WindowId f9306a;

    C5246l0(View view) {
        this.f9306a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5246l0) && ((C5246l0) obj).f9306a.equals(this.f9306a);
    }

    public int hashCode() {
        return this.f9306a.hashCode();
    }
}
