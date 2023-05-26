package p112n.p277e.p279b.p282b.p297z;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: n.e.b.b.z.i */
/* compiled from: RelativeCornerSize */
public final class C10643i implements C10634c {

    /* renamed from: a */
    private final float f28607a;

    public C10643i(float f) {
        this.f28607a = f;
    }

    /* renamed from: a */
    public float mo36226a(RectF rectF) {
        return this.f28607a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C10643i) && this.f28607a == ((C10643i) obj).f28607a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f28607a)});
    }
}
