package com.airbnb.lottie.p129q.p131b;

import android.graphics.PointF;
import com.airbnb.lottie.p140w.C5830a;
import com.airbnb.lottie.p140w.C5832c;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.b.j */
/* compiled from: PointKeyframeAnimation */
public class C5713j extends C5709f<PointF> {

    /* renamed from: g */
    private final PointF f10198g = new PointF();

    public C5713j(List<C5830a<PointF>> list) {
        super(list);
    }

    /* renamed from: a */
    public PointF m10992a(C5830a<PointF> aVar, float f) {
        T t;
        T t2 = aVar.f10501b;
        if (t2 == null || (t = aVar.f10502c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t2;
        PointF pointF2 = (PointF) t;
        C5832c<A> cVar = this.f10187e;
        if (cVar != null) {
            PointF pointF3 = (PointF) cVar.mo19744a(aVar.f10504e, aVar.f10505f.floatValue(), pointF, pointF2, f, mo19511b(), mo19512c());
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f10198g;
        float f2 = pointF.x;
        float f3 = pointF.y;
        pointF4.set(f2 + ((pointF2.x - f2) * f), f3 + (f * (pointF2.y - f3)));
        return this.f10198g;
    }
}
