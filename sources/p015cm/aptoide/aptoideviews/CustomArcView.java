package p015cm.aptoide.aptoideviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.RelativeLayout;

/* renamed from: cm.aptoide.aptoideviews.CustomArcView */
public class CustomArcView extends RelativeLayout {
    private Paint paint;
    private Path path;

    public CustomArcView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Path path2 = this.path;
        if (path2 != null) {
            canvas.drawPath(path2, this.paint);
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(C1033R.attr.wizardBackgroundBottom, typedValue, true);
        Paint paint2 = new Paint(1);
        this.paint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.paint.setColor(getContext().getResources().getColor(typedValue.resourceId));
        this.path = new Path();
        float f = (float) i;
        float f2 = f * 0.8f;
        float f3 = ((float) (-i2)) * 0.8f;
        RectF rectF = new RectF(-f2, f3, f + f2, (float) i2);
        this.path.lineTo(rectF.left, f3);
        this.path.arcTo(rectF, 0.0f, 300.0f, false);
        this.path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
    }
}
