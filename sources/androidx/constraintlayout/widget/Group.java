package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends C0323b {
    public Group(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1967a(AttributeSet attributeSet) {
        super.mo1967a(attributeSet);
        this.f1446j = false;
    }

    /* renamed from: b */
    public void mo2018b(ConstraintLayout constraintLayout) {
        ConstraintLayout.C0317b bVar = (ConstraintLayout.C0317b) getLayoutParams();
        bVar.f1402m0.mo17263t(0);
        bVar.f1402m0.mo17247l(0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo2029a();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo2029a();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo2029a();
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
