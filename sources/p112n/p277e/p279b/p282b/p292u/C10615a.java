package p112n.p277e.p279b.p282b.p292u;

/* renamed from: n.e.b.b.u.a */
/* compiled from: MathUtils */
public final class C10615a {
    /* renamed from: a */
    public static float m35942a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: a */
    public static float m35943a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    private static float m35945b(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    /* renamed from: a */
    public static float m35944a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m35945b(m35943a(f, f2, f3, f4), m35943a(f, f2, f5, f4), m35943a(f, f2, f5, f6), m35943a(f, f2, f3, f6));
    }
}
