package p015cm.aptoide.p016pt.util;

import p050l.p075h.p076e.C4949a;

/* renamed from: cm.aptoide.pt.util.AptoideColorUtils */
public class AptoideColorUtils {
    public static int getChangedColorLightness(float[] fArr, float f) {
        float f2 = fArr[2] * f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        fArr[2] = f2;
        return C4949a.m8701a(fArr);
    }
}
