package p015cm.aptoide.p016pt.app.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p015cm.aptoide.p016pt.C1086R;

/* renamed from: cm.aptoide.pt.app.view.ToolbarArcBackground */
public class ToolbarArcBackground extends View {
    private float extenderOverBoundary;
    private Paint paint;
    private RectF rectF;
    private float scale;
    private float strokeWidth;

    public ToolbarArcBackground(Context context) {
        this(context, (AttributeSet) null);
    }

    private void retrievePreferences(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1086R.styleable.ToolbarArcBackground, i, 0);
        this.paint.setColor(obtainStyledAttributes.getColor(0, -1));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeWidth(this.strokeWidth);
        RectF rectF2 = new RectF(-this.extenderOverBoundary, (((float) getHeight()) + (this.strokeWidth / 2.0f)) * this.scale, ((float) getWidth()) + this.extenderOverBoundary, ((float) getHeight()) + (this.strokeWidth / 2.0f));
        this.rectF = rectF2;
        canvas.drawArc(rectF2, 0.0f, 180.0f, false, this.paint);
    }

    public void setScale(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.scale = f;
        invalidate();
    }

    public ToolbarArcBackground(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToolbarArcBackground(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scale = 0.0f;
        this.extenderOverBoundary = 250.0f;
        this.strokeWidth = 200.0f;
        this.paint = new Paint(1);
        this.rectF = new RectF();
        retrievePreferences(attributeSet, i);
    }
}
