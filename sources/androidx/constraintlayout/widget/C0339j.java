package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p050l.p067f.p071b.p072k.C4916k;

/* renamed from: androidx.constraintlayout.widget.j */
/* compiled from: VirtualLayout */
public abstract class C0339j extends C0323b {

    /* renamed from: n */
    private boolean f1583n;

    /* renamed from: o */
    private boolean f1584o;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1967a(AttributeSet attributeSet) {
        super.mo1967a(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0338i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0338i.ConstraintLayout_Layout_android_visibility) {
                    this.f1583n = true;
                } else if (index == C0338i.ConstraintLayout_Layout_android_elevation) {
                    this.f1584o = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo2075a(C4916k kVar, int i, int i2) {
    }

    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f1583n || this.f1584o) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f1443g; i++) {
                View a = constraintLayout.mo1976a(this.f1442f[i]);
                if (a != null) {
                    if (this.f1583n) {
                        a.setVisibility(visibility);
                    }
                    if (this.f1584o && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        a.setTranslationZ(a.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo2029a();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo2029a();
    }
}
