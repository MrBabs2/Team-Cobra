package p050l.p108s;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: l.s.r */
/* compiled from: TransitionUtils */
class C5263r {

    /* renamed from: a */
    private static final boolean f9364a = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: b */
    private static final boolean f9365b = (Build.VERSION.SDK_INT >= 18);

    /* renamed from: c */
    private static final boolean f9366c;

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 28) {
            z = false;
        }
        f9366c = z;
    }

    /* renamed from: a */
    static View m9909a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        C5217c0.m9709a(view, matrix);
        C5217c0.m9711b(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap a = m9908a(view, matrix, rectF, viewGroup);
        if (a != null) {
            imageView.setImageBitmap(a);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m9908a(android.view.View r8, android.graphics.Matrix r9, android.graphics.RectF r10, android.view.ViewGroup r11) {
        /*
            boolean r0 = f9364a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            boolean r0 = r8.isAttachedToWindow()
            r0 = r0 ^ 1
            if (r11 != 0) goto L_0x000e
            goto L_0x0014
        L_0x000e:
            boolean r2 = r11.isAttachedToWindow()
            goto L_0x0015
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2 = 0
        L_0x0015:
            boolean r3 = f9365b
            r4 = 0
            if (r3 == 0) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            if (r2 != 0) goto L_0x001f
            return r4
        L_0x001f:
            android.view.ViewParent r1 = r8.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.indexOfChild(r8)
            android.view.ViewGroupOverlay r3 = r11.getOverlay()
            r3.add(r8)
            goto L_0x0033
        L_0x0031:
            r1 = r4
            r2 = 0
        L_0x0033:
            float r3 = r10.width()
            int r3 = java.lang.Math.round(r3)
            float r5 = r10.height()
            int r5 = java.lang.Math.round(r5)
            if (r3 <= 0) goto L_0x0099
            if (r5 <= 0) goto L_0x0099
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = 1233125376(0x49800000, float:1048576.0)
            int r7 = r3 * r5
            float r7 = (float) r7
            float r6 = r6 / r7
            float r4 = java.lang.Math.min(r4, r6)
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            float r5 = (float) r5
            float r5 = r5 * r4
            int r5 = java.lang.Math.round(r5)
            float r6 = r10.left
            float r6 = -r6
            float r10 = r10.top
            float r10 = -r10
            r9.postTranslate(r6, r10)
            r9.postScale(r4, r4)
            boolean r10 = f9366c
            if (r10 == 0) goto L_0x0088
            android.graphics.Picture r10 = new android.graphics.Picture
            r10.<init>()
            android.graphics.Canvas r3 = r10.beginRecording(r3, r5)
            r3.concat(r9)
            r8.draw(r3)
            r10.endRecording()
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r10)
            goto L_0x0099
        L_0x0088:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3, r5, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r4)
            r10.concat(r9)
            r8.draw(r10)
        L_0x0099:
            boolean r9 = f9365b
            if (r9 == 0) goto L_0x00a9
            if (r0 == 0) goto L_0x00a9
            android.view.ViewGroupOverlay r9 = r11.getOverlay()
            r9.remove(r8)
            r1.addView(r8, r2)
        L_0x00a9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p108s.C5263r.m9908a(android.view.View, android.graphics.Matrix, android.graphics.RectF, android.view.ViewGroup):android.graphics.Bitmap");
    }

    /* renamed from: a */
    static Animator m9907a(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        return animatorSet;
    }
}
