package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.C0416c;

/* renamed from: androidx.appcompat.widget.o */
/* compiled from: AppCompatProgressBarHelper */
class C0273o {

    /* renamed from: c */
    private static final int[] f1163c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f1164a;

    /* renamed from: b */
    private Bitmap f1165b;

    C0273o(ProgressBar progressBar) {
        this.f1164a = progressBar;
    }

    /* renamed from: b */
    private Shape mo1709b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1702a(AttributeSet attributeSet, int i) {
        C0278q0 a = C0278q0.m1271a(this.f1164a.getContext(), attributeSet, f1163c, i, 0);
        Drawable c = a.mo1722c(0);
        if (c != null) {
            this.f1164a.setIndeterminateDrawable(mo1708a(c));
        }
        Drawable c2 = a.mo1722c(1);
        if (c2 != null) {
            this.f1164a.setProgressDrawable(m1258a(c2, false));
        }
        a.mo1720b();
    }

    /* renamed from: a */
    private Drawable m1258a(Drawable drawable, boolean z) {
        if (drawable instanceof C0416c) {
            C0416c cVar = (C0416c) drawable;
            Drawable a = cVar.mo2331a();
            if (a != null) {
                cVar.mo2332a(m1258a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m1258a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1165b == null) {
                this.f1165b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo1709b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: a */
    private Drawable mo1708a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m1258a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo1701a() {
        return this.f1165b;
    }
}
