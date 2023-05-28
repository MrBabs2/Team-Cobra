package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p050l.p065d.C4864b;
import p050l.p065d.C4865c;

/* renamed from: androidx.cardview.widget.g */
/* compiled from: RoundRectDrawableWithShadow */
class C0314g extends Drawable {

    /* renamed from: q */
    private static final double f1310q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static C0315a f1311r;

    /* renamed from: a */
    private final int f1312a;

    /* renamed from: b */
    private Paint f1313b;

    /* renamed from: c */
    private Paint f1314c;

    /* renamed from: d */
    private Paint f1315d;

    /* renamed from: e */
    private final RectF f1316e;

    /* renamed from: f */
    private float f1317f;

    /* renamed from: g */
    private Path f1318g;

    /* renamed from: h */
    private float f1319h;

    /* renamed from: i */
    private float f1320i;

    /* renamed from: j */
    private float f1321j;

    /* renamed from: k */
    private ColorStateList f1322k;

    /* renamed from: l */
    private boolean f1323l = true;

    /* renamed from: m */
    private final int f1324m;

    /* renamed from: n */
    private final int f1325n;

    /* renamed from: o */
    private boolean f1326o = true;

    /* renamed from: p */
    private boolean f1327p = false;

    /* renamed from: androidx.cardview.widget.g$a */
    /* compiled from: RoundRectDrawableWithShadow */
    interface C0315a {
        /* renamed from: a */
        void mo1916a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    C0314g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f1324m = resources.getColor(C4864b.cardview_shadow_start_color);
        this.f1325n = resources.getColor(C4864b.cardview_shadow_end_color);
        this.f1312a = resources.getDimensionPixelSize(C4865c.cardview_compat_inset_shadow);
        this.f1313b = new Paint(5);
        m1550b(colorStateList);
        Paint paint = new Paint(5);
        this.f1314c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1317f = (float) ((int) (f + 0.5f));
        this.f1316e = new RectF();
        Paint paint2 = new Paint(this.f1314c);
        this.f1315d = paint2;
        paint2.setAntiAlias(false);
        m1547a(f2, f3);
    }

    /* renamed from: b */
    private void m1550b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1322k = colorStateList;
        this.f1313b.setColor(colorStateList.getColorForState(getState(), this.f1322k.getDefaultColor()));
    }

    /* renamed from: d */
    private int m1552d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* renamed from: g */
    private void m1553g() {
        float f = this.f1317f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f1320i;
        rectF2.inset(-f2, -f2);
        Path path = this.f1318g;
        if (path == null) {
            this.f1318g = new Path();
        } else {
            path.reset();
        }
        this.f1318g.setFillType(Path.FillType.EVEN_ODD);
        this.f1318g.moveTo(-this.f1317f, 0.0f);
        this.f1318g.rLineTo(-this.f1320i, 0.0f);
        this.f1318g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1318g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1318g.close();
        float f3 = this.f1317f;
        float f4 = f3 / (this.f1320i + f3);
        Paint paint = this.f1314c;
        float f5 = this.f1317f + this.f1320i;
        int i = this.f1324m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f1325n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1315d;
        float f6 = this.f1317f;
        float f7 = this.f1320i;
        int i2 = this.f1324m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f1325n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1315d.setAntiAlias(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1951a(boolean z) {
        this.f1326o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1955c(float f) {
        m1547a(f, this.f1319h);
    }

    public void draw(Canvas canvas) {
        if (this.f1323l) {
            m1551b(getBounds());
            this.f1323l = false;
        }
        canvas.translate(0.0f, this.f1321j / 2.0f);
        m1548a(canvas);
        canvas.translate(0.0f, (-this.f1321j) / 2.0f);
        f1311r.mo1916a(canvas, this.f1316e, this.f1317f, this.f1313b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo1958e() {
        float f = this.f1319h;
        return (Math.max(f, this.f1317f + ((float) this.f1312a) + (f / 2.0f)) * 2.0f) + ((this.f1319h + ((float) this.f1312a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo1959f() {
        return this.f1321j;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m1549b(this.f1319h, this.f1317f, this.f1326o));
        int ceil2 = (int) Math.ceil((double) m1546a(this.f1319h, this.f1317f, this.f1326o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1322k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1323l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1322k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1313b.getColor() == colorForState) {
            return false;
        }
        this.f1313b.setColor(colorForState);
        this.f1323l = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        this.f1313b.setAlpha(i);
        this.f1314c.setAlpha(i);
        this.f1315d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1313b.setColorFilter(colorFilter);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo1954c() {
        return this.f1319h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo1956d() {
        float f = this.f1319h;
        return (Math.max(f, this.f1317f + ((float) this.f1312a) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f1319h * 1.5f) + ((float) this.f1312a)) * 2.0f);
    }

    /* renamed from: a */
    private void m1547a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float d = (float) m1552d(f);
            float d2 = (float) m1552d(f2);
            if (d > d2) {
                if (!this.f1327p) {
                    this.f1327p = true;
                }
                d = d2;
            }
            if (this.f1321j != d || this.f1319h != d2) {
                this.f1321j = d;
                this.f1319h = d2;
                this.f1320i = (float) ((int) ((d * 1.5f) + ((float) this.f1312a) + 0.5f));
                this.f1323l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: b */
    static float m1549b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = (double) (f * 1.5f);
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - f1310q) * d2));
    }

    /* renamed from: b */
    private void m1551b(Rect rect) {
        float f = this.f1319h;
        float f2 = 1.5f * f;
        this.f1316e.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m1553g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo1952b() {
        return this.f1317f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1953b(float f) {
        m1547a(this.f1321j, f);
    }

    /* renamed from: a */
    static float m1546a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = (double) f;
        double d2 = (double) f2;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (float) (d + ((1.0d - f1310q) * d2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1948a(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f1317f != f2) {
                this.f1317f = f2;
                this.f1323l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* renamed from: a */
    private void m1548a(Canvas canvas) {
        float f = this.f1317f;
        float f2 = (-f) - this.f1320i;
        float f3 = f + ((float) this.f1312a) + (this.f1321j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f1316e.width() - f4 > 0.0f;
        boolean z2 = this.f1316e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1316e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f1318g, this.f1314c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1316e.width() - f4, -this.f1317f, this.f1315d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1316e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1318g, this.f1314c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1316e.width() - f4, (-this.f1317f) + this.f1320i, this.f1315d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1316e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1318g, this.f1314c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1316e.height() - f4, -this.f1317f, this.f1315d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1316e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1318g, this.f1314c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1316e.height() - f4, -this.f1317f, this.f1315d);
        }
        canvas.restoreToCount(save4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1950a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1949a(ColorStateList colorStateList) {
        m1550b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo1947a() {
        return this.f1322k;
    }
}
