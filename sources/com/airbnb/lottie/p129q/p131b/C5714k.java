package com.airbnb.lottie.p129q.p131b;

import com.airbnb.lottie.p139v.C5828e;
import com.airbnb.lottie.p140w.C5830a;
import com.airbnb.lottie.p140w.C5832c;
import com.airbnb.lottie.p140w.C5833d;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.b.k */
/* compiled from: ScaleKeyframeAnimation */
public class C5714k extends C5709f<C5833d> {
    public C5714k(List<C5830a<C5833d>> list) {
        super(list);
    }

    /* renamed from: a */
    public C5833d m10994a(C5830a<C5833d> aVar, float f) {
        T t;
        T t2 = aVar.f10501b;
        if (t2 == null || (t = aVar.f10502c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5833d dVar = (C5833d) t2;
        C5833d dVar2 = (C5833d) t;
        C5832c<A> cVar = this.f10187e;
        if (cVar != null) {
            C5833d dVar3 = (C5833d) cVar.mo19744a(aVar.f10504e, aVar.f10505f.floatValue(), dVar, dVar2, f, mo19511b(), mo19512c());
            if (dVar3 != null) {
                return dVar3;
            }
        }
        return new C5833d(C5828e.m11375c(dVar.mo19747a(), dVar2.mo19747a(), f), C5828e.m11375c(dVar.mo19748b(), dVar2.mo19748b(), f));
    }
}
