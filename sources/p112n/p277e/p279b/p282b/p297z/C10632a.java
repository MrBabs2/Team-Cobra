package p112n.p277e.p279b.p282b.p297z;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: n.e.b.b.z.a */
/* compiled from: AbsoluteCornerSize */
public final class C10632a implements C10634c {

    /* renamed from: a */
    private final float f28555a;

    public C10632a(float f) {
        this.f28555a = f;
    }

    /* renamed from: a */
    public float mo36226a(RectF rectF) {
        return this.f28555a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C10632a) && this.f28555a == ((C10632a) obj).f28555a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f28555a)});
    }
}
