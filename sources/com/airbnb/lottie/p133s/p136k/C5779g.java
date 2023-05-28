package com.airbnb.lottie.p133s.p136k;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.C5670j;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p129q.p131b.C5719p;
import com.airbnb.lottie.p140w.C5832c;

/* renamed from: com.airbnb.lottie.s.k.g */
/* compiled from: SolidLayer */
public class C5779g extends C5768a {

    /* renamed from: A */
    private final C5774d f10440A;

    /* renamed from: B */
    private C5703a<ColorFilter, ColorFilter> f10441B;

    /* renamed from: w */
    private final RectF f10442w = new RectF();

    /* renamed from: x */
    private final Paint f10443x = new Paint();

    /* renamed from: y */
    private final float[] f10444y = new float[8];

    /* renamed from: z */
    private final Path f10445z = new Path();

    C5779g(C5656f fVar, C5774d dVar) {
        super(fVar, dVar);
        this.f10440A = dVar;
        this.f10443x.setAlpha(0);
        this.f10443x.setStyle(Paint.Style.FILL);
        this.f10443x.setColor(dVar.mo19679m());
    }

    /* renamed from: a */
    public void mo19492a(RectF rectF, Matrix matrix) {
        super.mo19492a(rectF, matrix);
        this.f10442w.set(0.0f, 0.0f, (float) this.f10440A.mo19681o(), (float) this.f10440A.mo19680n());
        this.f10382m.mapRect(this.f10442w);
        rectF.set(this.f10442w);
    }

    /* renamed from: b */
    public void mo19661b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f10440A.mo19679m());
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) this.f10390u.mo19527c().mo19513d().intValue())) / 100.0f) * 255.0f);
            this.f10443x.setAlpha(intValue);
            C5703a<ColorFilter, ColorFilter> aVar = this.f10441B;
            if (aVar != null) {
                this.f10443x.setColorFilter(aVar.mo19513d());
            }
            if (intValue > 0) {
                float[] fArr = this.f10444y;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f10440A.mo19681o();
                float[] fArr2 = this.f10444y;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f10440A.mo19681o();
                this.f10444y[5] = (float) this.f10440A.mo19680n();
                float[] fArr3 = this.f10444y;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f10440A.mo19680n();
                matrix.mapPoints(this.f10444y);
                this.f10445z.reset();
                Path path = this.f10445z;
                float[] fArr4 = this.f10444y;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f10445z;
                float[] fArr5 = this.f10444y;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f10445z;
                float[] fArr6 = this.f10444y;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f10445z;
                float[] fArr7 = this.f10444y;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f10445z;
                float[] fArr8 = this.f10444y;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f10445z.close();
                canvas.drawPath(this.f10445z, this.f10443x);
            }
        }
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        super.mo19494a(t, cVar);
        if (t != C5670j.f10045x) {
            return;
        }
        if (cVar == null) {
            this.f10441B = null;
        } else {
            this.f10441B = new C5719p(cVar);
        }
    }
}
