package p112n.p277e.p279b.p282b.p297z;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: n.e.b.b.z.b */
/* compiled from: AdjustedCornerSize */
public final class C10633b implements C10634c {

    /* renamed from: a */
    private final C10634c f28556a;

    /* renamed from: b */
    private final float f28557b;

    public C10633b(float f, C10634c cVar) {
        while (cVar instanceof C10633b) {
            cVar = ((C10633b) cVar).f28556a;
            f += ((C10633b) cVar).f28557b;
        }
        this.f28556a = cVar;
        this.f28557b = f;
    }

    /* renamed from: a */
    public float mo36226a(RectF rectF) {
        return Math.max(0.0f, this.f28556a.mo36226a(rectF) + this.f28557b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10633b)) {
            return false;
        }
        C10633b bVar = (C10633b) obj;
        if (!this.f28556a.equals(bVar.f28556a) || this.f28557b != bVar.f28557b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28556a, Float.valueOf(this.f28557b)});
    }
}
