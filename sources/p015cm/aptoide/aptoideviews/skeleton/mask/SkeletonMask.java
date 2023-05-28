package p015cm.aptoide.aptoideviews.skeleton.mask;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.skeleton.SkeletonViewPreferences;
import p015cm.aptoide.aptoideviews.skeleton.mask.Shape;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J(\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/SkeletonMask;", "", "view", "Landroid/view/View;", "preferences", "Lcm/aptoide/aptoideviews/skeleton/SkeletonViewPreferences;", "(Landroid/view/View;Lcm/aptoide/aptoideviews/skeleton/SkeletonViewPreferences;)V", "borderPaint", "Landroid/graphics/Paint;", "paint", "getPreferences", "()Lcm/aptoide/aptoideviews/skeleton/SkeletonViewPreferences;", "getView", "()Landroid/view/View;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawShape", "bounds", "Landroid/graphics/RectF;", "shape", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.skeleton.mask.SkeletonMask */
/* compiled from: SkeletonMask.kt */
public final class SkeletonMask {
    private final Paint borderPaint;
    private Paint paint;
    private final SkeletonViewPreferences preferences;
    private final View view;

    public SkeletonMask(View view2, SkeletonViewPreferences skeletonViewPreferences) {
        C10202j.m34178b(view2, "view");
        C10202j.m34178b(skeletonViewPreferences, "preferences");
        this.view = view2;
        this.preferences = skeletonViewPreferences;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint2.setColor(this.preferences.getShape().getColor());
        paint2.setStyle(Paint.Style.FILL);
        boolean z = false;
        paint2.setAntiAlias(this.preferences.getBorder().getSize() > 0 || (this.preferences.getShape() instanceof Shape.Circle));
        this.paint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint3.setColor(this.preferences.getBorder().getColor());
        paint3.setStrokeWidth((float) this.preferences.getBorder().getSize());
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setAntiAlias((this.preferences.getBorder().getSize() > 0 || (this.preferences.getShape() instanceof Shape.Circle)) ? true : z);
        this.borderPaint = paint3;
        this.view.setLayerType(1, (Paint) null);
    }

    private final void drawShape(RectF rectF, Shape shape, Paint paint2, Canvas canvas) {
        if (shape instanceof Shape.Rect) {
            Shape.Rect rect = (Shape.Rect) shape;
            if (rect.getCornerRadius() > 0) {
                canvas.drawRoundRect(rectF, (float) rect.getCornerRadius(), (float) rect.getCornerRadius(), paint2);
            } else {
                canvas.drawRect(rectF, paint2);
            }
        } else if (shape instanceof Shape.Circle) {
            float f = (rectF.right - rectF.left) / 2.0f;
            float f2 = (rectF.bottom - rectF.top) / 2.0f;
            canvas.drawCircle(f, f2, Math.min(f, f2), paint2);
        }
    }

    public final void draw(Canvas canvas) {
        C10202j.m34178b(canvas, "canvas");
        RectF rectF = new RectF(((float) this.preferences.getBorder().getSize()) / 2.0f, ((float) this.preferences.getBorder().getSize()) / 2.0f, ((float) this.view.getWidth()) - (((float) this.preferences.getBorder().getSize()) / 2.0f), ((float) this.view.getHeight()) - (((float) this.preferences.getBorder().getSize()) / 2.0f));
        drawShape(rectF, this.preferences.getShape(), this.paint, canvas);
        if (this.preferences.getBorder().getSize() > 0) {
            drawShape(rectF, this.preferences.getShape(), this.borderPaint, canvas);
        }
    }

    public final SkeletonViewPreferences getPreferences() {
        return this.preferences;
    }

    public final View getView() {
        return this.view;
    }
}
