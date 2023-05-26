package com.airbnb.lottie.p129q.p131b;

import android.graphics.PointF;
import com.airbnb.lottie.p140w.C5830a;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.q.b.m */
/* compiled from: SplitDimensionPathKeyframeAnimation */
public class C5716m extends C5703a<PointF, PointF> {

    /* renamed from: g */
    private final PointF f10201g = new PointF();

    /* renamed from: h */
    private final C5703a<Float, Float> f10202h;

    /* renamed from: i */
    private final C5703a<Float, Float> f10203i;

    public C5716m(C5703a<Float, Float> aVar, C5703a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f10202h = aVar;
        this.f10203i = aVar2;
        mo19508a(mo19512c());
    }

    /* renamed from: a */
    public void mo19508a(float f) {
        this.f10202h.mo19508a(f);
        this.f10203i.mo19508a(f);
        this.f10201g.set(this.f10202h.mo19513d().floatValue(), this.f10203i.mo19513d().floatValue());
        for (int i = 0; i < this.f10183a.size(); i++) {
            this.f10183a.get(i).mo19490a();
        }
    }

    /* renamed from: d */
    public PointF m11001d() {
        return m10998a((C5830a<PointF>) null, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public PointF m10998a(C5830a<PointF> aVar, float f) {
        return this.f10201g;
    }
}
