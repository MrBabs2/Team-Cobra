package p050l.p109t.p110a.p111a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p003c.C0397b;
import androidx.core.content.p003c.C0413g;
import androidx.core.graphics.drawable.C0414a;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p050l.p066e.C4868a;
import p050l.p075h.p076e.C4951c;

/* renamed from: l.t.a.a.i */
/* compiled from: VectorDrawableCompat */
public class C5287i extends C5286h {

    /* renamed from: o */
    static final PorterDuff.Mode f9415o = PorterDuff.Mode.SRC_IN;

    /* renamed from: g */
    private C5295h f9416g;

    /* renamed from: h */
    private PorterDuffColorFilter f9417h;

    /* renamed from: i */
    private ColorFilter f9418i;

    /* renamed from: j */
    private boolean f9419j;

    /* renamed from: k */
    private boolean f9420k;

    /* renamed from: l */
    private final float[] f9421l;

    /* renamed from: m */
    private final Matrix f9422m;

    /* renamed from: n */
    private final Rect f9423n;

    /* renamed from: l.t.a.a.i$b */
    /* compiled from: VectorDrawableCompat */
    private static class C5289b extends C5293f {
        C5289b() {
        }

        /* renamed from: a */
        public void mo18221a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0413g.m1988a(xmlPullParser, "pathData")) {
                TypedArray a = C0413g.m1982a(resources, theme, attributeSet, C5274a.f9390d);
                m9976a(a, xmlPullParser);
                a.recycle();
            }
        }

        /* renamed from: b */
        public boolean mo18222b() {
            return true;
        }

        C5289b(C5289b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        private void m9976a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f9450b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f9449a = C4951c.m8717a(string2);
            }
            this.f9451c = C0413g.m1990b(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    /* renamed from: l.t.a.a.i$e */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C5292e {
        private C5292e() {
        }

        /* renamed from: a */
        public boolean mo18224a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo18225a(int[] iArr) {
            return false;
        }
    }

    /* renamed from: l.t.a.a.i$h */
    /* compiled from: VectorDrawableCompat */
    private static class C5295h extends Drawable.ConstantState {

        /* renamed from: a */
        int f9470a;

        /* renamed from: b */
        C5294g f9471b;

        /* renamed from: c */
        ColorStateList f9472c;

        /* renamed from: d */
        PorterDuff.Mode f9473d;

        /* renamed from: e */
        boolean f9474e;

        /* renamed from: f */
        Bitmap f9475f;

        /* renamed from: g */
        ColorStateList f9476g;

        /* renamed from: h */
        PorterDuff.Mode f9477h;

        /* renamed from: i */
        int f9478i;

        /* renamed from: j */
        boolean f9479j;

        /* renamed from: k */
        boolean f9480k;

        /* renamed from: l */
        Paint f9481l;

        public C5295h(C5295h hVar) {
            this.f9472c = null;
            this.f9473d = C5287i.f9415o;
            if (hVar != null) {
                this.f9470a = hVar.f9470a;
                C5294g gVar = new C5294g(hVar.f9471b);
                this.f9471b = gVar;
                if (hVar.f9471b.f9458e != null) {
                    gVar.f9458e = new Paint(hVar.f9471b.f9458e);
                }
                if (hVar.f9471b.f9457d != null) {
                    this.f9471b.f9457d = new Paint(hVar.f9471b.f9457d);
                }
                this.f9472c = hVar.f9472c;
                this.f9473d = hVar.f9473d;
                this.f9474e = hVar.f9474e;
            }
        }

        /* renamed from: a */
        public void mo18271a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f9475f, (Rect) null, rect, mo18270a(colorFilter));
        }

        /* renamed from: b */
        public boolean mo18276b() {
            return this.f9471b.getRootAlpha() < 255;
        }

        /* renamed from: c */
        public void mo18277c(int i, int i2) {
            this.f9475f.eraseColor(0);
            this.f9471b.mo18263a(new Canvas(this.f9475f), i, i2, (ColorFilter) null);
        }

        /* renamed from: d */
        public void mo18279d() {
            this.f9476g = this.f9472c;
            this.f9477h = this.f9473d;
            this.f9478i = this.f9471b.getRootAlpha();
            this.f9479j = this.f9474e;
            this.f9480k = false;
        }

        public int getChangingConfigurations() {
            return this.f9470a;
        }

        public Drawable newDrawable() {
            return new C5287i(this);
        }

        /* renamed from: b */
        public void mo18275b(int i, int i2) {
            if (this.f9475f == null || !mo18273a(i, i2)) {
                this.f9475f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f9480k = true;
            }
        }

        public Drawable newDrawable(Resources resources) {
            return new C5287i(this);
        }

        /* renamed from: a */
        public Paint mo18270a(ColorFilter colorFilter) {
            if (!mo18276b() && colorFilter == null) {
                return null;
            }
            if (this.f9481l == null) {
                Paint paint = new Paint();
                this.f9481l = paint;
                paint.setFilterBitmap(true);
            }
            this.f9481l.setAlpha(this.f9471b.getRootAlpha());
            this.f9481l.setColorFilter(colorFilter);
            return this.f9481l;
        }

        /* renamed from: c */
        public boolean mo18278c() {
            return this.f9471b.mo18264a();
        }

        /* renamed from: a */
        public boolean mo18273a(int i, int i2) {
            return i == this.f9475f.getWidth() && i2 == this.f9475f.getHeight();
        }

        /* renamed from: a */
        public boolean mo18272a() {
            return !this.f9480k && this.f9476g == this.f9472c && this.f9477h == this.f9473d && this.f9479j == this.f9474e && this.f9478i == this.f9471b.getRootAlpha();
        }

        public C5295h() {
            this.f9472c = null;
            this.f9473d = C5287i.f9415o;
            this.f9471b = new C5294g();
        }

        /* renamed from: a */
        public boolean mo18274a(int[] iArr) {
            boolean a = this.f9471b.mo18265a(iArr);
            this.f9480k |= a;
            return a;
        }
    }

    C5287i() {
        this.f9420k = true;
        this.f9421l = new float[9];
        this.f9422m = new Matrix();
        this.f9423n = new Rect();
        this.f9416g = new C5295h();
    }

    public static C5287i createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C5287i iVar = new C5287i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo18196a(String str) {
        return this.f9416g.f9471b.f9469p.get(str);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f9414f;
        if (drawable == null) {
            return false;
        }
        C0414a.m2019a(drawable);
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f9423n);
        if (this.f9423n.width() > 0 && this.f9423n.height() > 0) {
            ColorFilter colorFilter = this.f9418i;
            if (colorFilter == null) {
                colorFilter = this.f9417h;
            }
            canvas.getMatrix(this.f9422m);
            this.f9422m.getValues(this.f9421l);
            float abs = Math.abs(this.f9421l[0]);
            float abs2 = Math.abs(this.f9421l[4]);
            float abs3 = Math.abs(this.f9421l[1]);
            float abs4 = Math.abs(this.f9421l[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(RecyclerView.C0638l.FLAG_MOVED, (int) (((float) this.f9423n.width()) * abs));
            int min2 = Math.min(RecyclerView.C0638l.FLAG_MOVED, (int) (((float) this.f9423n.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f9423n;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m9972a()) {
                    canvas.translate((float) this.f9423n.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f9423n.offsetTo(0, 0);
                this.f9416g.mo18275b(min, min2);
                if (!this.f9420k) {
                    this.f9416g.mo18277c(min, min2);
                } else if (!this.f9416g.mo18272a()) {
                    this.f9416g.mo18277c(min, min2);
                    this.f9416g.mo18279d();
                }
                this.f9416g.mo18271a(canvas, colorFilter, this.f9423n);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return C0414a.m2023c(drawable);
        }
        return this.f9416g.f9471b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f9416g.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return C0414a.m2024d(drawable);
        }
        return this.f9418i;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f9414f != null && Build.VERSION.SDK_INT >= 24) {
            return new C5296i(this.f9414f.getConstantState());
        }
        this.f9416g.f9470a = getChangingConfigurations();
        return this.f9416g;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f9416g.f9471b.f9463j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f9416g.f9471b.f9462i;
    }

    public int getOpacity() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return C0414a.m2026f(drawable);
        }
        return this.f9416g.f9474e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f9416g.f9472c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f9416g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f9414f
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            l.t.a.a.i$h r0 = r1.f9416g
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo18278c()
            if (r0 != 0) goto L_0x0028
            l.t.a.a.i$h r0 = r1.f9416g
            android.content.res.ColorStateList r0 = r0.f9472c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p109t.p110a.p111a.C5287i.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f9419j && super.mutate() == this) {
            this.f9416g = new C5295h(this.f9416g);
            this.f9419j = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C5295h hVar = this.f9416g;
        ColorStateList colorStateList = hVar.f9472c;
        if (!(colorStateList == null || (mode = hVar.f9473d) == null)) {
            this.f9417h = mo18195a(this.f9417h, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo18278c() || !hVar.mo18274a(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f9416g.f9471b.getRootAlpha() != i) {
            this.f9416g.f9471b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            C0414a.m2018a(drawable, z);
        } else {
            this.f9416g.f9474e = z;
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            C0414a.m2022b(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            C0414a.m2014a(drawable, colorStateList);
            return;
        }
        C5295h hVar = this.f9416g;
        if (hVar.f9472c != colorStateList) {
            hVar.f9472c = colorStateList;
            this.f9417h = mo18195a(this.f9417h, colorStateList, hVar.f9473d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            C0414a.m2017a(drawable, mode);
            return;
        }
        C5295h hVar = this.f9416g;
        if (hVar.f9473d != mode) {
            hVar.f9473d = mode;
            this.f9417h = mo18195a(this.f9417h, hVar.f9472c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: l.t.a.a.i$i */
    /* compiled from: VectorDrawableCompat */
    private static class C5296i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f9482a;

        public C5296i(Drawable.ConstantState constantState) {
            this.f9482a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f9482a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f9482a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C5287i iVar = new C5287i();
            iVar.f9414f = (VectorDrawable) this.f9482a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C5287i iVar = new C5287i();
            iVar.f9414f = (VectorDrawable) this.f9482a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C5287i iVar = new C5287i();
            iVar.f9414f = (VectorDrawable) this.f9482a.newDrawable(resources, theme);
            return iVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PorterDuffColorFilter mo18195a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f9418i = colorFilter;
        invalidateSelf();
    }

    /* renamed from: l.t.a.a.i$c */
    /* compiled from: VectorDrawableCompat */
    private static class C5290c extends C5293f {

        /* renamed from: e */
        private int[] f9424e;

        /* renamed from: f */
        C0397b f9425f;

        /* renamed from: g */
        float f9426g = 0.0f;

        /* renamed from: h */
        C0397b f9427h;

        /* renamed from: i */
        float f9428i = 1.0f;

        /* renamed from: j */
        float f9429j = 1.0f;

        /* renamed from: k */
        float f9430k = 0.0f;

        /* renamed from: l */
        float f9431l = 1.0f;

        /* renamed from: m */
        float f9432m = 0.0f;

        /* renamed from: n */
        Paint.Cap f9433n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f9434o = Paint.Join.MITER;

        /* renamed from: p */
        float f9435p = 4.0f;

        C5290c() {
        }

        /* renamed from: a */
        private Paint.Cap m9979a(int i, Paint.Cap cap) {
            if (i == 0) {
                return Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f9429j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f9427h.mo2298a();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f9428i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f9425f.mo2298a();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f9426g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f9431l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f9432m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f9430k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f9429j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f9427h.mo2299a(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f9428i = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f9425f.mo2299a(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f9426g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f9431l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f9432m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f9430k = f;
        }

        /* renamed from: a */
        private Paint.Join m9980a(int i, Paint.Join join) {
            if (i == 0) {
                return Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        /* renamed from: a */
        public void mo18223a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0413g.m1982a(resources, theme, attributeSet, C5274a.f9389c);
            m9981a(a, xmlPullParser, theme);
            a.recycle();
        }

        /* renamed from: a */
        private void m9981a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f9424e = null;
            if (C0413g.m1988a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f9450b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f9449a = C4951c.m8717a(string2);
                }
                Resources.Theme theme2 = theme;
                this.f9427h = C0413g.m1984a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f9429j = C0413g.m1976a(typedArray, xmlPullParser, "fillAlpha", 12, this.f9429j);
                this.f9433n = m9979a(C0413g.m1990b(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f9433n);
                this.f9434o = m9980a(C0413g.m1990b(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f9434o);
                this.f9435p = C0413g.m1976a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f9435p);
                this.f9425f = C0413g.m1984a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f9428i = C0413g.m1976a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f9428i);
                this.f9426g = C0413g.m1976a(typedArray, xmlPullParser, "strokeWidth", 4, this.f9426g);
                this.f9431l = C0413g.m1976a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f9431l);
                this.f9432m = C0413g.m1976a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f9432m);
                this.f9430k = C0413g.m1976a(typedArray, xmlPullParser, "trimPathStart", 5, this.f9430k);
                this.f9451c = C0413g.m1990b(typedArray, xmlPullParser, "fillType", 13, this.f9451c);
            }
        }

        C5290c(C5290c cVar) {
            super(cVar);
            this.f9424e = cVar.f9424e;
            this.f9425f = cVar.f9425f;
            this.f9426g = cVar.f9426g;
            this.f9428i = cVar.f9428i;
            this.f9427h = cVar.f9427h;
            this.f9451c = cVar.f9451c;
            this.f9429j = cVar.f9429j;
            this.f9430k = cVar.f9430k;
            this.f9431l = cVar.f9431l;
            this.f9432m = cVar.f9432m;
            this.f9433n = cVar.f9433n;
            this.f9434o = cVar.f9434o;
            this.f9435p = cVar.f9435p;
        }

        /* renamed from: a */
        public boolean mo18224a() {
            return this.f9427h.mo2303d() || this.f9425f.mo2303d();
        }

        /* renamed from: a */
        public boolean mo18225a(int[] iArr) {
            return this.f9425f.mo2300a(iArr) | this.f9427h.mo2300a(iArr);
        }
    }

    /* renamed from: l.t.a.a.i$d */
    /* compiled from: VectorDrawableCompat */
    private static class C5291d extends C5292e {

        /* renamed from: a */
        final Matrix f9436a = new Matrix();

        /* renamed from: b */
        final ArrayList<C5292e> f9437b = new ArrayList<>();

        /* renamed from: c */
        float f9438c = 0.0f;

        /* renamed from: d */
        private float f9439d = 0.0f;

        /* renamed from: e */
        private float f9440e = 0.0f;

        /* renamed from: f */
        private float f9441f = 1.0f;

        /* renamed from: g */
        private float f9442g = 1.0f;

        /* renamed from: h */
        private float f9443h = 0.0f;

        /* renamed from: i */
        private float f9444i = 0.0f;

        /* renamed from: j */
        final Matrix f9445j = new Matrix();

        /* renamed from: k */
        int f9446k;

        /* renamed from: l */
        private int[] f9447l;

        /* renamed from: m */
        private String f9448m = null;

        public C5291d(C5291d dVar, C4868a<String, Object> aVar) {
            super();
            C5293f fVar;
            this.f9438c = dVar.f9438c;
            this.f9439d = dVar.f9439d;
            this.f9440e = dVar.f9440e;
            this.f9441f = dVar.f9441f;
            this.f9442g = dVar.f9442g;
            this.f9443h = dVar.f9443h;
            this.f9444i = dVar.f9444i;
            this.f9447l = dVar.f9447l;
            String str = dVar.f9448m;
            this.f9448m = str;
            this.f9446k = dVar.f9446k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f9445j.set(dVar.f9445j);
            ArrayList<C5292e> arrayList = dVar.f9437b;
            for (int i = 0; i < arrayList.size(); i++) {
                C5292e eVar = arrayList.get(i);
                if (eVar instanceof C5291d) {
                    this.f9437b.add(new C5291d((C5291d) eVar, aVar));
                } else {
                    if (eVar instanceof C5290c) {
                        fVar = new C5290c((C5290c) eVar);
                    } else if (eVar instanceof C5289b) {
                        fVar = new C5289b((C5289b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f9437b.add(fVar);
                    String str2 = fVar.f9450b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: b */
        private void m9986b() {
            this.f9445j.reset();
            this.f9445j.postTranslate(-this.f9439d, -this.f9440e);
            this.f9445j.postScale(this.f9441f, this.f9442g);
            this.f9445j.postRotate(this.f9438c, 0.0f, 0.0f);
            this.f9445j.postTranslate(this.f9443h + this.f9439d, this.f9444i + this.f9440e);
        }

        /* renamed from: a */
        public void mo18242a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray a = C0413g.m1982a(resources, theme, attributeSet, C5274a.f9388b);
            m9985a(a, xmlPullParser);
            a.recycle();
        }

        public String getGroupName() {
            return this.f9448m;
        }

        public Matrix getLocalMatrix() {
            return this.f9445j;
        }

        public float getPivotX() {
            return this.f9439d;
        }

        public float getPivotY() {
            return this.f9440e;
        }

        public float getRotation() {
            return this.f9438c;
        }

        public float getScaleX() {
            return this.f9441f;
        }

        public float getScaleY() {
            return this.f9442g;
        }

        public float getTranslateX() {
            return this.f9443h;
        }

        public float getTranslateY() {
            return this.f9444i;
        }

        public void setPivotX(float f) {
            if (f != this.f9439d) {
                this.f9439d = f;
                m9986b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f9440e) {
                this.f9440e = f;
                m9986b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f9438c) {
                this.f9438c = f;
                m9986b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f9441f) {
                this.f9441f = f;
                m9986b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f9442g) {
                this.f9442g = f;
                m9986b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f9443h) {
                this.f9443h = f;
                m9986b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f9444i) {
                this.f9444i = f;
                m9986b();
            }
        }

        /* renamed from: a */
        private void m9985a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f9447l = null;
            this.f9438c = C0413g.m1976a(typedArray, xmlPullParser, "rotation", 5, this.f9438c);
            this.f9439d = typedArray.getFloat(1, this.f9439d);
            this.f9440e = typedArray.getFloat(2, this.f9440e);
            this.f9441f = C0413g.m1976a(typedArray, xmlPullParser, "scaleX", 3, this.f9441f);
            this.f9442g = C0413g.m1976a(typedArray, xmlPullParser, "scaleY", 4, this.f9442g);
            this.f9443h = C0413g.m1976a(typedArray, xmlPullParser, "translateX", 6, this.f9443h);
            this.f9444i = C0413g.m1976a(typedArray, xmlPullParser, "translateY", 7, this.f9444i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f9448m = string;
            }
            m9986b();
        }

        /* renamed from: a */
        public boolean mo18224a() {
            for (int i = 0; i < this.f9437b.size(); i++) {
                if (this.f9437b.get(i).mo18224a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo18225a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f9437b.size(); i++) {
                z |= this.f9437b.get(i).mo18225a(iArr);
            }
            return z;
        }

        public C5291d() {
            super();
        }
    }

    /* renamed from: l.t.a.a.i$f */
    /* compiled from: VectorDrawableCompat */
    private static abstract class C5293f extends C5292e {

        /* renamed from: a */
        protected C4951c.C4953b[] f9449a = null;

        /* renamed from: b */
        String f9450b;

        /* renamed from: c */
        int f9451c = 0;

        /* renamed from: d */
        int f9452d;

        public C5293f() {
            super();
        }

        /* renamed from: a */
        public void mo18259a(Path path) {
            path.reset();
            C4951c.C4953b[] bVarArr = this.f9449a;
            if (bVarArr != null) {
                C4951c.C4953b.m8725a(bVarArr, path);
            }
        }

        /* renamed from: b */
        public boolean mo18222b() {
            return false;
        }

        public C4951c.C4953b[] getPathData() {
            return this.f9449a;
        }

        public String getPathName() {
            return this.f9450b;
        }

        public void setPathData(C4951c.C4953b[] bVarArr) {
            if (!C4951c.m8715a(this.f9449a, bVarArr)) {
                this.f9449a = C4951c.m8718a(bVarArr);
            } else {
                C4951c.m8720b(this.f9449a, bVarArr);
            }
        }

        public C5293f(C5293f fVar) {
            super();
            this.f9450b = fVar.f9450b;
            this.f9452d = fVar.f9452d;
            this.f9449a = C4951c.m8718a(fVar.f9449a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036 A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p050l.p109t.p110a.p111a.C5287i m9969a(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            l.t.a.a.i r0 = new l.t.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.p003c.C0406f.m1967a(r6, r7, r8)
            r0.f9414f = r6
            l.t.a.a.i$i r6 = new l.t.a.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f9414f
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0029:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            r4 = 2
            if (r3 == r4) goto L_0x0034
            r5 = 1
            if (r3 == r5) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            if (r3 != r4) goto L_0x003b
            l.t.a.a.i r6 = createFromXmlInner(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            return r6
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0048, IOException -> 0x0043 }
        L_0x0043:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x004c
        L_0x0048:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x004c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p109t.p110a.p111a.C5287i.m9969a(android.content.res.Resources, int, android.content.res.Resources$Theme):l.t.a.a.i");
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f9414f;
        if (drawable != null) {
            C0414a.m2016a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C5295h hVar = this.f9416g;
        hVar.f9471b = new C5294g();
        TypedArray a = C0413g.m1982a(resources, theme, attributeSet, C5274a.f9387a);
        m9971a(a, xmlPullParser, theme);
        a.recycle();
        hVar.f9470a = getChangingConfigurations();
        hVar.f9480k = true;
        m9970a(resources, xmlPullParser, attributeSet, theme);
        this.f9417h = mo18195a(this.f9417h, hVar.f9472c, hVar.f9473d);
    }

    C5287i(C5295h hVar) {
        this.f9420k = true;
        this.f9421l = new float[9];
        this.f9422m = new Matrix();
        this.f9423n = new Rect();
        this.f9416g = hVar;
        this.f9417h = mo18195a(this.f9417h, hVar.f9472c, hVar.f9473d);
    }

    /* renamed from: l.t.a.a.i$g */
    /* compiled from: VectorDrawableCompat */
    private static class C5294g {

        /* renamed from: q */
        private static final Matrix f9453q = new Matrix();

        /* renamed from: a */
        private final Path f9454a;

        /* renamed from: b */
        private final Path f9455b;

        /* renamed from: c */
        private final Matrix f9456c;

        /* renamed from: d */
        Paint f9457d;

        /* renamed from: e */
        Paint f9458e;

        /* renamed from: f */
        private PathMeasure f9459f;

        /* renamed from: g */
        private int f9460g;

        /* renamed from: h */
        final C5291d f9461h;

        /* renamed from: i */
        float f9462i;

        /* renamed from: j */
        float f9463j;

        /* renamed from: k */
        float f9464k;

        /* renamed from: l */
        float f9465l;

        /* renamed from: m */
        int f9466m;

        /* renamed from: n */
        String f9467n;

        /* renamed from: o */
        Boolean f9468o;

        /* renamed from: p */
        final C4868a<String, Object> f9469p;

        public C5294g() {
            this.f9456c = new Matrix();
            this.f9462i = 0.0f;
            this.f9463j = 0.0f;
            this.f9464k = 0.0f;
            this.f9465l = 0.0f;
            this.f9466m = 255;
            this.f9467n = null;
            this.f9468o = null;
            this.f9469p = new C4868a<>();
            this.f9461h = new C5291d();
            this.f9454a = new Path();
            this.f9455b = new Path();
        }

        /* renamed from: a */
        private static float m9994a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: a */
        private void m9996a(C5291d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f9436a.set(matrix);
            dVar.f9436a.preConcat(dVar.f9445j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f9437b.size(); i3++) {
                C5292e eVar = dVar.f9437b.get(i3);
                if (eVar instanceof C5291d) {
                    m9996a((C5291d) eVar, dVar.f9436a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C5293f) {
                    m9997a(dVar, (C5293f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f9466m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f9466m = i;
        }

        /* renamed from: a */
        public void mo18263a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m9996a(this.f9461h, f9453q, canvas, i, i2, colorFilter);
        }

        public C5294g(C5294g gVar) {
            this.f9456c = new Matrix();
            this.f9462i = 0.0f;
            this.f9463j = 0.0f;
            this.f9464k = 0.0f;
            this.f9465l = 0.0f;
            this.f9466m = 255;
            this.f9467n = null;
            this.f9468o = null;
            C4868a<String, Object> aVar = new C4868a<>();
            this.f9469p = aVar;
            this.f9461h = new C5291d(gVar.f9461h, aVar);
            this.f9454a = new Path(gVar.f9454a);
            this.f9455b = new Path(gVar.f9455b);
            this.f9462i = gVar.f9462i;
            this.f9463j = gVar.f9463j;
            this.f9464k = gVar.f9464k;
            this.f9465l = gVar.f9465l;
            this.f9460g = gVar.f9460g;
            this.f9466m = gVar.f9466m;
            this.f9467n = gVar.f9467n;
            String str = gVar.f9467n;
            if (str != null) {
                this.f9469p.put(str, this);
            }
            this.f9468o = gVar.f9468o;
        }

        /* renamed from: a */
        private void m9997a(C5291d dVar, C5293f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f9464k;
            float f2 = ((float) i2) / this.f9465l;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f9436a;
            this.f9456c.set(matrix);
            this.f9456c.postScale(f, f2);
            float a = m9995a(matrix);
            if (a != 0.0f) {
                fVar.mo18259a(this.f9454a);
                Path path = this.f9454a;
                this.f9455b.reset();
                if (fVar.mo18222b()) {
                    this.f9455b.setFillType(fVar.f9451c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f9455b.addPath(path, this.f9456c);
                    canvas.clipPath(this.f9455b);
                    return;
                }
                C5290c cVar = (C5290c) fVar;
                if (!(cVar.f9430k == 0.0f && cVar.f9431l == 1.0f)) {
                    float f3 = cVar.f9430k;
                    float f4 = cVar.f9432m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f9431l + f4) % 1.0f;
                    if (this.f9459f == null) {
                        this.f9459f = new PathMeasure();
                    }
                    this.f9459f.setPath(this.f9454a, false);
                    float length = this.f9459f.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f9459f.getSegment(f7, length, path, true);
                        this.f9459f.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f9459f.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f9455b.addPath(path, this.f9456c);
                if (cVar.f9427h.mo2304e()) {
                    C0397b bVar = cVar.f9427h;
                    if (this.f9458e == null) {
                        Paint paint = new Paint(1);
                        this.f9458e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f9458e;
                    if (bVar.mo2302c()) {
                        Shader b = bVar.mo2301b();
                        b.setLocalMatrix(this.f9456c);
                        paint2.setShader(b);
                        paint2.setAlpha(Math.round(cVar.f9429j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(C5287i.m9967a(bVar.mo2298a(), cVar.f9429j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f9455b.setFillType(cVar.f9451c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f9455b, paint2);
                }
                if (cVar.f9425f.mo2304e()) {
                    C0397b bVar2 = cVar.f9425f;
                    if (this.f9457d == null) {
                        Paint paint3 = new Paint(1);
                        this.f9457d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f9457d;
                    Paint.Join join = cVar.f9434o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f9433n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f9435p);
                    if (bVar2.mo2302c()) {
                        Shader b2 = bVar2.mo2301b();
                        b2.setLocalMatrix(this.f9456c);
                        paint4.setShader(b2);
                        paint4.setAlpha(Math.round(cVar.f9428i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(C5287i.m9967a(bVar2.mo2298a(), cVar.f9428i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f9426g * min * a);
                    canvas.drawPath(this.f9455b, paint4);
                }
            }
        }

        /* renamed from: a */
        private float m9995a(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m9994a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: a */
        public boolean mo18264a() {
            if (this.f9468o == null) {
                this.f9468o = Boolean.valueOf(this.f9461h.mo18224a());
            }
            return this.f9468o.booleanValue();
        }

        /* renamed from: a */
        public boolean mo18265a(int[] iArr) {
            return this.f9461h.mo18225a(iArr);
        }
    }

    /* renamed from: a */
    static int m9967a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* renamed from: a */
    private static PorterDuff.Mode m9968a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    private void m9971a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C5295h hVar = this.f9416g;
        C5294g gVar = hVar.f9471b;
        hVar.f9473d = m9968a(C0413g.m1990b(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList a = C0413g.m1980a(typedArray, xmlPullParser, theme, "tint", 1);
        if (a != null) {
            hVar.f9472c = a;
        }
        hVar.f9474e = C0413g.m1987a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f9474e);
        gVar.f9464k = C0413g.m1976a(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f9464k);
        float a2 = C0413g.m1976a(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f9465l);
        gVar.f9465l = a2;
        if (gVar.f9464k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (a2 > 0.0f) {
            gVar.f9462i = typedArray.getDimension(3, gVar.f9462i);
            float dimension = typedArray.getDimension(2, gVar.f9463j);
            gVar.f9463j = dimension;
            if (gVar.f9462i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C0413g.m1976a(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f9467n = string;
                    gVar.f9469p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: a */
    private void m9970a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C5295h hVar = this.f9416g;
        C5294g gVar = hVar.f9471b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f9461h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C5291d dVar = (C5291d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C5290c cVar = new C5290c();
                    cVar.mo18223a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f9437b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f9469p.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    hVar.f9470a = cVar.f9452d | hVar.f9470a;
                } else if ("clip-path".equals(name)) {
                    C5289b bVar = new C5289b();
                    bVar.mo18221a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f9437b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f9469p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f9470a = bVar.f9452d | hVar.f9470a;
                } else if ("group".equals(name)) {
                    C5291d dVar2 = new C5291d();
                    dVar2.mo18242a(resources, attributeSet, theme, xmlPullParser);
                    dVar.f9437b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f9469p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f9470a = dVar2.f9446k | hVar.f9470a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18197a(boolean z) {
        this.f9420k = z;
    }

    /* renamed from: a */
    private boolean m9972a() {
        if (Build.VERSION.SDK_INT < 17 || !isAutoMirrored() || C0414a.m2025e(this) != 1) {
            return false;
        }
        return true;
    }
}
