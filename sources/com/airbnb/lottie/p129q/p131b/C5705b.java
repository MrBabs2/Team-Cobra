package com.airbnb.lottie.p129q.p131b;

import com.airbnb.lottie.p139v.C5825b;
import com.airbnb.lottie.p140w.C5830a;
import com.airbnb.lottie.p140w.C5832c;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.b.b */
/* compiled from: ColorKeyframeAnimation */
public class C5705b extends C5709f<Integer> {
    public C5705b(List<C5830a<Integer>> list) {
        super(list);
    }

    /* renamed from: a */
    public Integer m10978a(C5830a<Integer> aVar, float f) {
        T t = aVar.f10501b;
        if (t == null || aVar.f10502c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t).intValue();
        int intValue2 = ((Integer) aVar.f10502c).intValue();
        C5832c<A> cVar = this.f10187e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo19744a(aVar.f10504e, aVar.f10505f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo19511b(), mo19512c());
            if (num != null) {
                return num;
            }
        }
        return Integer.valueOf(C5825b.m11340a(f, intValue, intValue2));
    }
}
