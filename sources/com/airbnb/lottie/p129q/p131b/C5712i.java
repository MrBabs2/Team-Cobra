package com.airbnb.lottie.p129q.p131b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.p140w.C5830a;
import com.airbnb.lottie.p140w.C5832c;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.b.i */
/* compiled from: PathKeyframeAnimation */
public class C5712i extends C5709f<PointF> {

    /* renamed from: g */
    private final PointF f10194g = new PointF();

    /* renamed from: h */
    private final float[] f10195h = new float[2];

    /* renamed from: i */
    private C5711h f10196i;

    /* renamed from: j */
    private PathMeasure f10197j;

    public C5712i(List<? extends C5830a<PointF>> list) {
        super(list);
    }

    /* renamed from: a */
    public PointF m10990a(C5830a<PointF> aVar, float f) {
        C5711h hVar = (C5711h) aVar;
        Path d = hVar.mo19519d();
        if (d == null) {
            return (PointF) aVar.f10501b;
        }
        C5832c<A> cVar = this.f10187e;
        if (cVar != null) {
            PointF pointF = (PointF) cVar.mo19744a(hVar.f10504e, hVar.f10505f.floatValue(), hVar.f10501b, hVar.f10502c, mo19511b(), f, mo19512c());
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f10196i != hVar) {
            this.f10197j = new PathMeasure(d, false);
            this.f10196i = hVar;
        }
        PathMeasure pathMeasure = this.f10197j;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f10195h, (float[]) null);
        PointF pointF2 = this.f10194g;
        float[] fArr = this.f10195h;
        pointF2.set(fArr[0], fArr[1]);
        return this.f10194g;
    }
}
