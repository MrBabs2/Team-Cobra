package p112n.p277e.p279b.p282b.p284n;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: n.e.b.b.n.a */
/* compiled from: CanvasCompat */
public class C10596a {
    /* renamed from: a */
    public static int m35897a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
