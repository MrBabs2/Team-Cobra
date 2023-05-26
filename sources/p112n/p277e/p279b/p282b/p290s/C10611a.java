package p112n.p277e.p279b.p282b.p290s;

import android.content.Context;
import android.graphics.Color;
import p050l.p075h.p076e.C4949a;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.p288q.C10609a;
import p112n.p277e.p279b.p282b.p294w.C10619b;

/* renamed from: n.e.b.b.s.a */
/* compiled from: ElevationOverlayProvider */
public class C10611a {

    /* renamed from: a */
    private final boolean f28494a;

    /* renamed from: b */
    private final int f28495b;

    /* renamed from: c */
    private final int f28496c;

    /* renamed from: d */
    private final float f28497d;

    public C10611a(Context context) {
        this.f28494a = C10619b.m35954a(context, C10574b.elevationOverlayEnabled, false);
        this.f28495b = C10609a.m35924a(context, C10574b.elevationOverlayColor, 0);
        this.f28496c = C10609a.m35924a(context, C10574b.colorSurface, 0);
        this.f28497d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public int mo36193a(int i, float f) {
        float a = mo36192a(f);
        return C4949a.m8709d(C10609a.m35923a(C4949a.m8709d(i, 255), this.f28495b, a), Color.alpha(i));
    }

    /* renamed from: b */
    public int mo36195b(int i, float f) {
        return (!this.f28494a || !m35930a(i)) ? i : mo36193a(i, f);
    }

    /* renamed from: a */
    public float mo36192a(float f) {
        float f2 = this.f28497d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: a */
    public boolean mo36194a() {
        return this.f28494a;
    }

    /* renamed from: a */
    private boolean m35930a(int i) {
        return C4949a.m8709d(i, 255) == this.f28496c;
    }
}
