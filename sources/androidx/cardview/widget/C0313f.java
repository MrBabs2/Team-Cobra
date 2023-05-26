package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.f */
/* compiled from: RoundRectDrawable */
class C0313f extends Drawable {

    /* renamed from: a */
    private float f1299a;

    /* renamed from: b */
    private final Paint f1300b;

    /* renamed from: c */
    private final RectF f1301c;

    /* renamed from: d */
    private final Rect f1302d;

    /* renamed from: e */
    private float f1303e;

    /* renamed from: f */
    private boolean f1304f = false;

    /* renamed from: g */
    private boolean f1305g = true;

    /* renamed from: h */
    private ColorStateList f1306h;

    /* renamed from: i */
    private PorterDuffColorFilter f1307i;

    /* renamed from: j */
    private ColorStateList f1308j;

    /* renamed from: k */
    private PorterDuff.Mode f1309k = PorterDuff.Mode.SRC_IN;

    C0313f(ColorStateList colorStateList, float f) {
        this.f1299a = f;
        this.f1300b = new Paint(5);
        m1539b(colorStateList);
        this.f1301c = new RectF();
        this.f1302d = new Rect();
    }

    /* renamed from: b */
    private void m1539b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1306h = colorStateList;
        this.f1300b.setColor(colorStateList.getColorForState(getState(), this.f1306h.getDefaultColor()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1933a(float f, boolean z, boolean z2) {
        if (f != this.f1303e || this.f1304f != z || this.f1305g != z2) {
            this.f1303e = f;
            this.f1304f = z;
            this.f1305g = z2;
            m1538a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public float mo1936c() {
        return this.f1299a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1300b;
        if (this.f1307i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1307i);
            z = true;
        }
        RectF rectF = this.f1301c;
        float f = this.f1299a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1302d, this.f1299a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f1306h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1308j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f1306h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.C0313f.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1538a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1306h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1300b.getColor();
        if (z) {
            this.f1300b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1308j;
        if (colorStateList2 == null || (mode = this.f1309k) == null) {
            return z;
        }
        this.f1307i = m1537a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f1300b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1300b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1308j = colorStateList;
        this.f1307i = m1537a(colorStateList, this.f1309k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1309k = mode;
        this.f1307i = m1537a(this.f1308j, mode);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo1935b() {
        return this.f1303e;
    }

    /* renamed from: a */
    private void m1538a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1301c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1302d.set(rect);
        if (this.f1304f) {
            float b = C0314g.m1549b(this.f1303e, this.f1299a, this.f1305g);
            this.f1302d.inset((int) Math.ceil((double) C0314g.m1546a(this.f1303e, this.f1299a, this.f1305g)), (int) Math.ceil((double) b));
            this.f1301c.set(this.f1302d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1932a(float f) {
        if (f != this.f1299a) {
            this.f1299a = f;
            m1538a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo1934a(ColorStateList colorStateList) {
        m1539b(colorStateList);
        invalidateSelf();
    }

    /* renamed from: a */
    public ColorStateList mo1931a() {
        return this.f1306h;
    }

    /* renamed from: a */
    private PorterDuffColorFilter m1537a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }
}
