package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: androidx.coordinatorlayout.widget.b */
/* compiled from: ViewGroupUtils */
public class C0350b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f1635a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f1636b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m1763a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m1765b(viewGroup, view, rect);
    }

    /* renamed from: b */
    static void m1765b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f1635a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f1635a.set(matrix);
        } else {
            matrix.reset();
        }
        m1764a((ViewParent) viewGroup, view, matrix);
        RectF rectF = f1636b.get();
        if (rectF == null) {
            rectF = new RectF();
            f1636b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    private static void m1764a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m1764a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
