package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p050l.p051a.C4790a;

public class AppCompatRatingBar extends RatingBar {

    /* renamed from: f */
    private final C0273o f750f;

    public AppCompatRatingBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f750f.mo1701a();
        if (a != null) {
            setMeasuredDimension(View.resolveSizeAndState(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0268l0.m1250a((View) this, getContext());
        C0273o oVar = new C0273o(this);
        this.f750f = oVar;
        oVar.mo1702a(attributeSet, i);
    }
}
