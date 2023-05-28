package com.airbnb.lottie.p133s.p134i;

import android.graphics.PointF;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p129q.p131b.C5712i;
import com.airbnb.lottie.p129q.p131b.C5713j;
import com.airbnb.lottie.p140w.C5830a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.s.i.e */
/* compiled from: AnimatablePathValue */
public class C5734e implements C5742m<PointF, PointF> {

    /* renamed from: a */
    private final List<C5830a<PointF>> f10251a;

    public C5734e() {
        this.f10251a = Collections.singletonList(new C5830a(new PointF(0.0f, 0.0f)));
    }

    /* renamed from: a */
    public C5703a<PointF, PointF> mo19562a() {
        if (this.f10251a.get(0).mo19741c()) {
            return new C5713j(this.f10251a);
        }
        return new C5712i(this.f10251a);
    }

    public C5734e(List<C5830a<PointF>> list) {
        this.f10251a = list;
    }
}
