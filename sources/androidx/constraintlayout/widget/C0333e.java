package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.e */
/* compiled from: Constraints */
public class C0333e extends ViewGroup {

    /* renamed from: f */
    C0327d f1564f;

    public C0327d getConstraintSet() {
        if (this.f1564f == null) {
            this.f1564f = new C0327d();
        }
        this.f1564f.mo2050a(this);
        return this.f1564f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public C0334a generateDefaultLayoutParams() {
        return new C0334a(-2, -2);
    }

    public C0334a generateLayoutParams(AttributeSet attributeSet) {
        return new C0334a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0317b(layoutParams);
    }

    /* renamed from: androidx.constraintlayout.widget.e$a */
    /* compiled from: Constraints */
    public static class C0334a extends ConstraintLayout.C0317b {

        /* renamed from: A0 */
        public float f1565A0;

        /* renamed from: o0 */
        public float f1566o0;

        /* renamed from: p0 */
        public boolean f1567p0;

        /* renamed from: q0 */
        public float f1568q0;

        /* renamed from: r0 */
        public float f1569r0;

        /* renamed from: s0 */
        public float f1570s0;

        /* renamed from: t0 */
        public float f1571t0;

        /* renamed from: u0 */
        public float f1572u0;

        /* renamed from: v0 */
        public float f1573v0;

        /* renamed from: w0 */
        public float f1574w0;

        /* renamed from: x0 */
        public float f1575x0;

        /* renamed from: y0 */
        public float f1576y0;

        /* renamed from: z0 */
        public float f1577z0;

        public C0334a(int i, int i2) {
            super(i, i2);
            this.f1566o0 = 1.0f;
            this.f1567p0 = false;
            this.f1568q0 = 0.0f;
            this.f1569r0 = 0.0f;
            this.f1570s0 = 0.0f;
            this.f1571t0 = 0.0f;
            this.f1572u0 = 1.0f;
            this.f1573v0 = 1.0f;
            this.f1574w0 = 0.0f;
            this.f1575x0 = 0.0f;
            this.f1576y0 = 0.0f;
            this.f1577z0 = 0.0f;
            this.f1565A0 = 0.0f;
        }

        public C0334a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1566o0 = 1.0f;
            this.f1567p0 = false;
            this.f1568q0 = 0.0f;
            this.f1569r0 = 0.0f;
            this.f1570s0 = 0.0f;
            this.f1571t0 = 0.0f;
            this.f1572u0 = 1.0f;
            this.f1573v0 = 1.0f;
            this.f1574w0 = 0.0f;
            this.f1575x0 = 0.0f;
            this.f1576y0 = 0.0f;
            this.f1577z0 = 0.0f;
            this.f1565A0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338i.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0338i.ConstraintSet_android_alpha) {
                    this.f1566o0 = obtainStyledAttributes.getFloat(index, this.f1566o0);
                } else if (index == C0338i.ConstraintSet_android_elevation) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f1568q0 = obtainStyledAttributes.getFloat(index, this.f1568q0);
                        this.f1567p0 = true;
                    }
                } else if (index == C0338i.ConstraintSet_android_rotationX) {
                    this.f1570s0 = obtainStyledAttributes.getFloat(index, this.f1570s0);
                } else if (index == C0338i.ConstraintSet_android_rotationY) {
                    this.f1571t0 = obtainStyledAttributes.getFloat(index, this.f1571t0);
                } else if (index == C0338i.ConstraintSet_android_rotation) {
                    this.f1569r0 = obtainStyledAttributes.getFloat(index, this.f1569r0);
                } else if (index == C0338i.ConstraintSet_android_scaleX) {
                    this.f1572u0 = obtainStyledAttributes.getFloat(index, this.f1572u0);
                } else if (index == C0338i.ConstraintSet_android_scaleY) {
                    this.f1573v0 = obtainStyledAttributes.getFloat(index, this.f1573v0);
                } else if (index == C0338i.ConstraintSet_android_transformPivotX) {
                    this.f1574w0 = obtainStyledAttributes.getFloat(index, this.f1574w0);
                } else if (index == C0338i.ConstraintSet_android_transformPivotY) {
                    this.f1575x0 = obtainStyledAttributes.getFloat(index, this.f1575x0);
                } else if (index == C0338i.ConstraintSet_android_translationX) {
                    this.f1576y0 = obtainStyledAttributes.getFloat(index, this.f1576y0);
                } else if (index == C0338i.ConstraintSet_android_translationY) {
                    this.f1577z0 = obtainStyledAttributes.getFloat(index, this.f1577z0);
                } else if (index == C0338i.ConstraintSet_android_translationZ && Build.VERSION.SDK_INT >= 21) {
                    this.f1565A0 = obtainStyledAttributes.getFloat(index, this.f1565A0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
