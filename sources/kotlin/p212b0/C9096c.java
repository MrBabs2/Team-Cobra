package kotlin.p212b0;

/* renamed from: kotlin.b0.c */
/* compiled from: progressionUtil.kt */
public final class C9096c {
    /* renamed from: a */
    private static final int m29799a(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: b */
    public static final int m29801b(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - m29800a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m29800a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: a */
    private static final int m29800a(int i, int i2, int i3) {
        return m29799a(m29799a(i, i3) - m29799a(i2, i3), i3);
    }
}
