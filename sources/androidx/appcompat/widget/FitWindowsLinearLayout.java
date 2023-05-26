package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0222a0;

public class FitWindowsLinearLayout extends LinearLayout implements C0222a0 {

    /* renamed from: f */
    private C0222a0.C0223a f792f;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0222a0.C0223a aVar = this.f792f;
        if (aVar != null) {
            aVar.mo343a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0222a0.C0223a aVar) {
        this.f792f = aVar;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
