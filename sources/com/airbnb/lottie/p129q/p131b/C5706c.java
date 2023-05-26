package com.airbnb.lottie.p129q.p131b;

import com.airbnb.lottie.p139v.C5828e;
import com.airbnb.lottie.p140w.C5830a;
import com.airbnb.lottie.p140w.C5832c;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.b.c */
/* compiled from: FloatKeyframeAnimation */
public class C5706c extends C5709f<Float> {
    public C5706c(List<C5830a<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Float m10980a(C5830a<Float> aVar, float f) {
        if (aVar.f10501b == null || aVar.f10502c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5832c<A> cVar = this.f10187e;
        if (cVar != null) {
            Float f2 = (Float) cVar.mo19744a(aVar.f10504e, aVar.f10505f.floatValue(), aVar.f10501b, aVar.f10502c, f, mo19511b(), mo19512c());
            if (f2 != null) {
                return f2;
            }
        }
        return Float.valueOf(C5828e.m11375c(((Float) aVar.f10501b).floatValue(), ((Float) aVar.f10502c).floatValue(), f));
    }
}
