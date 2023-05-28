package com.airbnb.lottie.p133s.p136k;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.C5670j;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p129q.p131b.C5719p;
import com.airbnb.lottie.p139v.C5829f;
import com.airbnb.lottie.p140w.C5832c;

/* renamed from: com.airbnb.lottie.s.k.c */
/* compiled from: ImageLayer */
public class C5773c extends C5768a {

    /* renamed from: w */
    private final Paint f10401w = new Paint(3);

    /* renamed from: x */
    private final Rect f10402x = new Rect();

    /* renamed from: y */
    private final Rect f10403y = new Rect();

    /* renamed from: z */
    private C5703a<ColorFilter, ColorFilter> f10404z;

    C5773c(C5656f fVar, C5774d dVar) {
        super(fVar, dVar);
    }

    /* renamed from: e */
    private Bitmap m11203e() {
        return this.f10383n.mo19412a(this.f10384o.mo19677k());
    }

    /* renamed from: a */
    public void mo19492a(RectF rectF, Matrix matrix) {
        super.mo19492a(rectF, matrix);
        Bitmap e = m11203e();
        if (e != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float) e.getWidth()), Math.min(rectF.bottom, (float) e.getHeight()));
            this.f10382m.mapRect(rectF);
        }
    }

    /* renamed from: b */
    public void mo19661b(Canvas canvas, Matrix matrix, int i) {
        Bitmap e = m11203e();
        if (e != null && !e.isRecycled()) {
            float a = C5829f.m11376a();
            this.f10401w.setAlpha(i);
            C5703a<ColorFilter, ColorFilter> aVar = this.f10404z;
            if (aVar != null) {
                this.f10401w.setColorFilter(aVar.mo19513d());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f10402x.set(0, 0, e.getWidth(), e.getHeight());
            this.f10403y.set(0, 0, (int) (((float) e.getWidth()) * a), (int) (((float) e.getHeight()) * a));
            canvas.drawBitmap(e, this.f10402x, this.f10403y, this.f10401w);
            canvas.restore();
        }
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        super.mo19494a(t, cVar);
        if (t != C5670j.f10045x) {
            return;
        }
        if (cVar == null) {
            this.f10404z = null;
        } else {
            this.f10404z = new C5719p(cVar);
        }
    }
}
