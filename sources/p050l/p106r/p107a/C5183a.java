package p050l.p106r.p107a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import p050l.p075h.p084l.C5071v;

/* renamed from: l.r.a.a */
/* compiled from: CircleImageView */
class C5183a extends ImageView {

    /* renamed from: f */
    private Animation.AnimationListener f9170f;

    /* renamed from: g */
    int f9171g;

    /* renamed from: l.r.a.a$a */
    /* compiled from: CircleImageView */
    private class C5184a extends OvalShape {

        /* renamed from: f */
        private RadialGradient f9172f;

        /* renamed from: g */
        private Paint f9173g = new Paint();

        C5184a(int i) {
            C5183a.this.f9171g = i;
            m9628a((int) rect().width());
        }

        /* renamed from: a */
        private void m9628a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C5183a.this.f9171g, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f9172f = radialGradient;
            this.f9173g.setShader(radialGradient);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C5183a.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C5183a.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f9173g);
            canvas.drawCircle(f, height, (float) (width - C5183a.this.f9171g), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m9628a((int) f);
        }
    }

    C5183a(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f9171g = (int) (3.5f * f);
        if (m9626a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C5071v.m9177b((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C5184a(this.f9171g));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f9171g, (float) i3, (float) i2, 503316480);
            int i4 = this.f9171g;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C5071v.m9161a((View) this, (Drawable) shapeDrawable);
    }

    /* renamed from: a */
    private boolean m9626a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f9170f;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f9170f;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m9626a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f9171g * 2), getMeasuredHeight() + (this.f9171g * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* renamed from: a */
    public void mo17881a(Animation.AnimationListener animationListener) {
        this.f9170f = animationListener;
    }
}
