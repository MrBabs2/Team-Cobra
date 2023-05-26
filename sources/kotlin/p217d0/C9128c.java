package kotlin.p217d0;

/* renamed from: kotlin.d0.c */
/* compiled from: MathJVM.kt */
class C9128c extends C9127b {
    /* renamed from: a */
    public static int m29811a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
