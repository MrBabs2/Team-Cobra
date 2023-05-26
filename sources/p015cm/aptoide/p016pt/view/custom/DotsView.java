package p015cm.aptoide.p016pt.view.custom;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

/* renamed from: cm.aptoide.pt.view.custom.DotsView */
public class DotsView extends View {
    private static final int COLOR_1 = -16121;
    private static final int COLOR_2 = -26624;
    private static final int COLOR_3 = -43230;
    private static final int COLOR_4 = -769226;
    private static final int DOTS_COUNT = 7;
    public static final Property<DotsView, Float> DOTS_PROGRESS = new Property<DotsView, Float>(Float.class, "dotsProgress") {
        public Float get(DotsView dotsView) {
            return Float.valueOf(dotsView.getCurrentProgress());
        }

        public void set(DotsView dotsView, Float f) {
            dotsView.setCurrentProgress(f.floatValue());
        }
    };
    private static final int OUTER_DOTS_POSITION_ANGLE = 51;
    private ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private int centerX;
    private int centerY;
    private final Paint[] circlePaints = new Paint[4];
    private float currentDotSize1 = 0.0f;
    private float currentDotSize2 = 0.0f;
    private float currentProgress = 0.0f;
    private float currentRadius1 = 0.0f;
    private float currentRadius2 = 0.0f;
    private float maxDotSize;
    private float maxInnerDotsRadius;
    private float maxOuterDotsRadius;

    public DotsView(Context context) {
        super(context);
        init();
    }

    private void drawInnerDotsFrame(Canvas canvas) {
        int i = 0;
        while (i < 7) {
            double d = (double) this.centerX;
            double d2 = (double) this.currentRadius2;
            double d3 = (double) ((i * 51) - 10);
            Double.isNaN(d3);
            double d4 = (d3 * 3.141592653589793d) / 180.0d;
            double cos = Math.cos(d4);
            Double.isNaN(d2);
            Double.isNaN(d);
            double d5 = (double) this.centerY;
            double d6 = (double) this.currentRadius2;
            double sin = Math.sin(d4);
            Double.isNaN(d6);
            Double.isNaN(d5);
            float f = this.currentDotSize2;
            Paint[] paintArr = this.circlePaints;
            i++;
            canvas.drawCircle((float) ((int) (d + (d2 * cos))), (float) ((int) (d5 + (d6 * sin))), f, paintArr[i % paintArr.length]);
        }
    }

    private void drawOuterDotsFrame(Canvas canvas) {
        for (int i = 0; i < 7; i++) {
            double d = (double) this.centerX;
            double d2 = (double) this.currentRadius1;
            double d3 = (double) (i * 51);
            Double.isNaN(d3);
            double d4 = (d3 * 3.141592653589793d) / 180.0d;
            double cos = Math.cos(d4);
            Double.isNaN(d2);
            Double.isNaN(d);
            double d5 = (double) this.centerY;
            double d6 = (double) this.currentRadius1;
            double sin = Math.sin(d4);
            Double.isNaN(d6);
            Double.isNaN(d5);
            float f = this.currentDotSize1;
            Paint[] paintArr = this.circlePaints;
            canvas.drawCircle((float) ((int) (d + (d2 * cos))), (float) ((int) (d5 + (d6 * sin))), f, paintArr[i % paintArr.length]);
        }
    }

    private void init() {
        int i = 0;
        while (true) {
            Paint[] paintArr = this.circlePaints;
            if (i < paintArr.length) {
                paintArr[i] = new Paint();
                this.circlePaints[i].setStyle(Paint.Style.FILL);
                i++;
            } else {
                return;
            }
        }
    }

    private void updateDotsAlpha() {
        int mapValueFromRangeToRange = (int) AptoideUtils.MathU.mapValueFromRangeToRange((double) ((float) AptoideUtils.MathU.clamp((double) this.currentProgress, 0.6000000238418579d, 1.0d)), 0.6000000238418579d, 1.0d, 255.0d, 0.0d);
        this.circlePaints[0].setAlpha(mapValueFromRangeToRange);
        this.circlePaints[1].setAlpha(mapValueFromRangeToRange);
        this.circlePaints[2].setAlpha(mapValueFromRangeToRange);
        this.circlePaints[3].setAlpha(mapValueFromRangeToRange);
    }

    private void updateDotsPaints() {
        float f = this.currentProgress;
        Integer valueOf = Integer.valueOf(COLOR_1);
        Integer valueOf2 = Integer.valueOf(COLOR_4);
        Integer valueOf3 = Integer.valueOf(COLOR_3);
        Integer valueOf4 = Integer.valueOf(COLOR_2);
        if (f < 0.5f) {
            float mapValueFromRangeToRange = (float) AptoideUtils.MathU.mapValueFromRangeToRange((double) f, 0.0d, 0.5d, 0.0d, 1.0d);
            this.circlePaints[0].setColor(((Integer) this.argbEvaluator.evaluate(mapValueFromRangeToRange, valueOf, valueOf4)).intValue());
            this.circlePaints[1].setColor(((Integer) this.argbEvaluator.evaluate(mapValueFromRangeToRange, valueOf4, valueOf3)).intValue());
            this.circlePaints[2].setColor(((Integer) this.argbEvaluator.evaluate(mapValueFromRangeToRange, valueOf3, valueOf2)).intValue());
            this.circlePaints[3].setColor(((Integer) this.argbEvaluator.evaluate(mapValueFromRangeToRange, valueOf2, valueOf)).intValue());
            return;
        }
        float mapValueFromRangeToRange2 = (float) AptoideUtils.MathU.mapValueFromRangeToRange((double) f, 0.5d, 1.0d, 0.0d, 1.0d);
        this.circlePaints[0].setColor(((Integer) this.argbEvaluator.evaluate(mapValueFromRangeToRange2, valueOf4, valueOf3)).intValue());
        this.circlePaints[1].setColor(((Integer) this.argbEvaluator.evaluate(mapValueFromRangeToRange2, valueOf3, valueOf2)).intValue());
        this.circlePaints[2].setColor(((Integer) this.argbEvaluator.evaluate(mapValueFromRangeToRange2, valueOf2, valueOf)).intValue());
        this.circlePaints[3].setColor(((Integer) this.argbEvaluator.evaluate(mapValueFromRangeToRange2, valueOf, valueOf4)).intValue());
    }

    private void updateInnerDotsPosition() {
        float f = this.currentProgress;
        if (f < 0.3f) {
            this.currentRadius2 = (float) AptoideUtils.MathU.mapValueFromRangeToRange((double) f, 0.0d, 0.30000001192092896d, 0.0d, (double) this.maxInnerDotsRadius);
        } else {
            this.currentRadius2 = this.maxInnerDotsRadius;
        }
        float f2 = this.currentProgress;
        if (((double) f2) < 0.2d) {
            this.currentDotSize2 = this.maxDotSize;
        } else if (((double) f2) < 0.5d) {
            double d = (double) f2;
            float f3 = this.maxDotSize;
            double d2 = (double) f3;
            Double.isNaN(d2);
            this.currentDotSize2 = (float) AptoideUtils.MathU.mapValueFromRangeToRange(d, 0.20000000298023224d, 0.5d, (double) f3, d2 * 0.3d);
        } else {
            this.currentDotSize2 = (float) AptoideUtils.MathU.mapValueFromRangeToRange((double) f2, 0.5d, 1.0d, (double) (this.maxDotSize * 0.3f), 0.0d);
        }
    }

    private void updateOuterDotsPosition() {
        float f = this.currentProgress;
        if (f < 0.3f) {
            this.currentRadius1 = (float) AptoideUtils.MathU.mapValueFromRangeToRange((double) f, 0.0d, 0.30000001192092896d, 0.0d, (double) (this.maxOuterDotsRadius * 0.8f));
        } else {
            double d = (double) f;
            float f2 = this.maxOuterDotsRadius;
            this.currentRadius1 = (float) AptoideUtils.MathU.mapValueFromRangeToRange(d, 0.30000001192092896d, 1.0d, (double) (0.8f * f2), (double) f2);
        }
        float f3 = this.currentProgress;
        if (((double) f3) < 0.7d) {
            this.currentDotSize1 = this.maxDotSize;
        } else {
            this.currentDotSize1 = (float) AptoideUtils.MathU.mapValueFromRangeToRange((double) f3, 0.699999988079071d, 1.0d, (double) this.maxDotSize, 0.0d);
        }
    }

    public float getCurrentProgress() {
        return this.currentProgress;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        drawOuterDotsFrame(canvas);
        drawInnerDotsFrame(canvas);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.centerX = i / 2;
        this.centerY = i2 / 2;
        this.maxDotSize = 4.0f;
        float f = (((float) i) / 2.3f) - (4.0f * 2.0f);
        this.maxOuterDotsRadius = f;
        this.maxInnerDotsRadius = f * 0.8f;
    }

    public void setCurrentProgress(float f) {
        this.currentProgress = f;
        updateInnerDotsPosition();
        updateOuterDotsPosition();
        updateDotsPaints();
        updateDotsAlpha();
        postInvalidate();
    }

    public DotsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public DotsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
