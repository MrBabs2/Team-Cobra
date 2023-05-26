package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.google.android.material.internal.b */
/* compiled from: DescendantOffsetUtils */
public class C8552b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f24477a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f24478b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m27952a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m27954b(viewGroup, view, rect);
    }

    /* renamed from: b */
    public static void m27954b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = f24477a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f24477a.set(matrix);
        } else {
            matrix.reset();
        }
        m27953a((ViewParent) viewGroup, view, matrix);
        RectF rectF = f24478b.get();
        if (rectF == null) {
            rectF = new RectF();
            f24478b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    private static void m27953a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m27953a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
