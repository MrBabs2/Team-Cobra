package com.airbnb.lottie.p129q.p131b;

import com.airbnb.lottie.p139v.C5828e;
import com.airbnb.lottie.p140w.C5830a;
import com.airbnb.lottie.p140w.C5832c;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.b.e */
/* compiled from: IntegerKeyframeAnimation */
public class C5708e extends C5709f<Integer> {
    public C5708e(List<C5830a<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Integer m10984a(C5830a<Integer> aVar, float f) {
        if (aVar.f10501b == null || aVar.f10502c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5832c<A> cVar = this.f10187e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo19744a(aVar.f10504e, aVar.f10505f.floatValue(), aVar.f10501b, aVar.f10502c, f, mo19511b(), mo19512c());
            if (num != null) {
                return num;
            }
        }
        return Integer.valueOf(C5828e.m11368a(((Integer) aVar.f10501b).intValue(), ((Integer) aVar.f10502c).intValue(), f));
    }
}
