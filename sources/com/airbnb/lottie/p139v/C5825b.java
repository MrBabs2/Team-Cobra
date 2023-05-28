package com.airbnb.lottie.p139v;

/* renamed from: com.airbnb.lottie.v.b */
/* compiled from: GammaEvaluator */
public class C5825b {
    /* renamed from: a */
    private static float m11339a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: b */
    private static float m11341b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: a */
    public static int m11340a(float f, int i, int i2) {
        float f2 = ((float) ((i >> 24) & 255)) / 255.0f;
        float a = m11339a(((float) ((i >> 16) & 255)) / 255.0f);
        float a2 = m11339a(((float) ((i >> 8) & 255)) / 255.0f);
        float a3 = m11339a(((float) (i & 255)) / 255.0f);
        float a4 = m11339a(((float) ((i2 >> 16) & 255)) / 255.0f);
        float a5 = m11339a(((float) ((i2 >> 8) & 255)) / 255.0f);
        float a6 = a3 + (f * (m11339a(((float) (i2 & 255)) / 255.0f) - a3));
        return (Math.round(m11341b(a + ((a4 - a) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((float) ((i2 >> 24) & 255)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(m11341b(a2 + ((a5 - a2) * f)) * 255.0f) << 8) | Math.round(m11341b(a6) * 255.0f);
    }
}
