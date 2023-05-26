package p015cm.aptoide.p016pt.view.custom;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

/* renamed from: cm.aptoide.pt.view.custom.CircleView */
public class CircleView extends View {
    private static final int END_COLOR = -16121;
    public static final Property<CircleView, Float> INNER_CIRCLE_RADIUS_PROGRESS;
    public static final Property<CircleView, Float> OUTER_CIRCLE_RADIUS_PROGRESS;
    private static final int START_COLOR = -43230;
    private ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private Paint circlePaint = new Paint();
    private float innerCircleRadiusProgress = 0.0f;
    private Paint maskPaint = new Paint();
    private int maxCircleSize;
    private float outerCircleRadiusProgress = 0.0f;
    private Bitmap tempBitmap;
    private Canvas tempCanvas;

    static {
        Class<Float> cls = Float.class;
        INNER_CIRCLE_RADIUS_PROGRESS = new Property<CircleView, Float>(cls, "innerCircleRadiusProgress") {
            public Float get(CircleView circleView) {
                return Float.valueOf(circleView.getInnerCircleRadiusProgress());
            }

            public void set(CircleView circleView, Float f) {
                circleView.setInnerCircleRadiusProgress(f.floatValue());
            }
        };
        OUTER_CIRCLE_RADIUS_PROGRESS = new Property<CircleView, Float>(cls, "outerCircleRadiusProgress") {
            public Float get(CircleView circleView) {
                return Float.valueOf(circleView.getOuterCircleRadiusProgress());
            }

            public void set(CircleView circleView, Float f) {
                circleView.setOuterCircleRadiusProgress(f.floatValue());
            }
        };
    }

    public CircleView(Context context) {
        super(context);
        init();
    }

    private void init() {
        this.circlePaint.setStyle(Paint.Style.FILL);
        this.maskPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    private void updateCircleColor() {
        this.circlePaint.setColor(((Integer) this.argbEvaluator.evaluate((float) AptoideUtils.MathU.mapValueFromRangeToRange((double) ((float) AptoideUtils.MathU.clamp((double) this.outerCircleRadiusProgress, 0.5d, 1.0d)), 0.5d, 1.0d, 0.0d, 1.0d), Integer.valueOf(START_COLOR), Integer.valueOf(END_COLOR))).intValue());
    }

    public float getInnerCircleRadiusProgress() {
        return this.innerCircleRadiusProgress;
    }

    public float getOuterCircleRadiusProgress() {
        return this.outerCircleRadiusProgress;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.tempCanvas.drawColor(16777215, PorterDuff.Mode.CLEAR);
        this.tempCanvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.outerCircleRadiusProgress * ((float) this.maxCircleSize), this.circlePaint);
        this.tempCanvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), this.innerCircleRadiusProgress * ((float) this.maxCircleSize), this.maskPaint);
        canvas.drawBitmap(this.tempBitmap, 0.0f, 0.0f, (Paint) null);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.maxCircleSize = i / 2;
        this.tempBitmap = Bitmap.createBitmap(getWidth(), getWidth(), Bitmap.Config.ARGB_8888);
        this.tempCanvas = new Canvas(this.tempBitmap);
    }

    public void setInnerCircleRadiusProgress(float f) {
        this.innerCircleRadiusProgress = f;
        postInvalidate();
    }

    public void setOuterCircleRadiusProgress(float f) {
        this.outerCircleRadiusProgress = f;
        updateCircleColor();
        postInvalidate();
    }

    public CircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public CircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
