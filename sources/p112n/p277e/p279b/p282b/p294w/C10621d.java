package p112n.p277e.p279b.p282b.p294w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.p003c.C0406f;
import p112n.p277e.p279b.p282b.C10584l;

/* renamed from: n.e.b.b.w.d */
/* compiled from: TextAppearance */
public class C10621d {

    /* renamed from: a */
    public final float f28508a;

    /* renamed from: b */
    public final ColorStateList f28509b;

    /* renamed from: c */
    public final ColorStateList f28510c;

    /* renamed from: d */
    public final ColorStateList f28511d;

    /* renamed from: e */
    public final int f28512e;

    /* renamed from: f */
    public final int f28513f;

    /* renamed from: g */
    public final String f28514g;

    /* renamed from: h */
    public final ColorStateList f28515h;

    /* renamed from: i */
    public final float f28516i;

    /* renamed from: j */
    public final float f28517j;

    /* renamed from: k */
    public final float f28518k;

    /* renamed from: l */
    private final int f28519l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f28520m = false;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Typeface f28521n;

    public C10621d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C10584l.TextAppearance);
        this.f28508a = obtainStyledAttributes.getDimension(C10584l.TextAppearance_android_textSize, 0.0f);
        this.f28509b = C10620c.m35957a(context, obtainStyledAttributes, C10584l.TextAppearance_android_textColor);
        this.f28510c = C10620c.m35957a(context, obtainStyledAttributes, C10584l.TextAppearance_android_textColorHint);
        this.f28511d = C10620c.m35957a(context, obtainStyledAttributes, C10584l.TextAppearance_android_textColorLink);
        this.f28512e = obtainStyledAttributes.getInt(C10584l.TextAppearance_android_textStyle, 0);
        this.f28513f = obtainStyledAttributes.getInt(C10584l.TextAppearance_android_typeface, 1);
        int a = C10620c.m35956a(obtainStyledAttributes, C10584l.TextAppearance_fontFamily, C10584l.TextAppearance_android_fontFamily);
        this.f28519l = obtainStyledAttributes.getResourceId(a, 0);
        this.f28514g = obtainStyledAttributes.getString(a);
        obtainStyledAttributes.getBoolean(C10584l.TextAppearance_textAllCaps, false);
        this.f28515h = C10620c.m35957a(context, obtainStyledAttributes, C10584l.TextAppearance_android_shadowColor);
        this.f28516i = obtainStyledAttributes.getFloat(C10584l.TextAppearance_android_shadowDx, 0.0f);
        this.f28517j = obtainStyledAttributes.getFloat(C10584l.TextAppearance_android_shadowDy, 0.0f);
        this.f28518k = obtainStyledAttributes.getFloat(C10584l.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private void m35964b() {
        String str;
        if (this.f28521n == null && (str = this.f28514g) != null) {
            this.f28521n = Typeface.create(str, this.f28512e);
        }
        if (this.f28521n == null) {
            int i = this.f28513f;
            if (i == 1) {
                this.f28521n = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f28521n = Typeface.SERIF;
            } else if (i != 3) {
                this.f28521n = Typeface.DEFAULT;
            } else {
                this.f28521n = Typeface.MONOSPACE;
            }
            this.f28521n = Typeface.create(this.f28521n, this.f28512e);
        }
    }

    /* renamed from: c */
    public void mo36210c(Context context, TextPaint textPaint, C10625f fVar) {
        if (C10624e.m35976a()) {
            mo36208a(textPaint, mo36205a(context));
        } else {
            mo36206a(context, textPaint, fVar);
        }
    }

    /* renamed from: n.e.b.b.w.d$b */
    /* compiled from: TextAppearance */
    class C10623b extends C10625f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f28524a;

        /* renamed from: b */
        final /* synthetic */ C10625f f28525b;

        C10623b(TextPaint textPaint, C10625f fVar) {
            this.f28524a = textPaint;
            this.f28525b = fVar;
        }

        /* renamed from: a */
        public void mo31398a(Typeface typeface, boolean z) {
            C10621d.this.mo36208a(this.f28524a, typeface);
            this.f28525b.mo31398a(typeface, z);
        }

        /* renamed from: a */
        public void mo31397a(int i) {
            this.f28525b.mo31397a(i);
        }
    }

    /* renamed from: n.e.b.b.w.d$a */
    /* compiled from: TextAppearance */
    class C10622a extends C0406f.C0407a {

        /* renamed from: a */
        final /* synthetic */ C10625f f28522a;

        C10622a(C10625f fVar) {
            this.f28522a = fVar;
        }

        /* renamed from: a */
        public void mo1795a(Typeface typeface) {
            C10621d dVar = C10621d.this;
            Typeface unused = dVar.f28521n = Typeface.create(typeface, dVar.f28512e);
            boolean unused2 = C10621d.this.f28520m = true;
            this.f28522a.mo31398a(C10621d.this.f28521n, false);
        }

        /* renamed from: a */
        public void mo1794a(int i) {
            boolean unused = C10621d.this.f28520m = true;
            this.f28522a.mo31397a(i);
        }
    }

    /* renamed from: a */
    public Typeface mo36205a(Context context) {
        if (this.f28520m) {
            return this.f28521n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a = C0406f.m1963a(context, this.f28519l);
                this.f28521n = a;
                if (a != null) {
                    this.f28521n = Typeface.create(a, this.f28512e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f28514g, e);
            }
        }
        m35964b();
        this.f28520m = true;
        return this.f28521n;
    }

    /* renamed from: b */
    public void mo36209b(Context context, TextPaint textPaint, C10625f fVar) {
        mo36210c(context, textPaint, fVar);
        ColorStateList colorStateList = this.f28509b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f28518k;
        float f2 = this.f28516i;
        float f3 = this.f28517j;
        ColorStateList colorStateList2 = this.f28515h;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: a */
    public void mo36207a(Context context, C10625f fVar) {
        if (C10624e.m35976a()) {
            mo36205a(context);
        } else {
            m35964b();
        }
        if (this.f28519l == 0) {
            this.f28520m = true;
        }
        if (this.f28520m) {
            fVar.mo31398a(this.f28521n, true);
            return;
        }
        try {
            C0406f.m1968a(context, this.f28519l, new C10622a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f28520m = true;
            fVar.mo31397a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f28514g, e);
            this.f28520m = true;
            fVar.mo31397a(-3);
        }
    }

    /* renamed from: a */
    public void mo36206a(Context context, TextPaint textPaint, C10625f fVar) {
        mo36208a(textPaint, mo36204a());
        mo36207a(context, (C10625f) new C10623b(textPaint, fVar));
    }

    /* renamed from: a */
    public Typeface mo36204a() {
        m35964b();
        return this.f28521n;
    }

    /* renamed from: a */
    public void mo36208a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.f28512e;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f28508a);
    }
}
