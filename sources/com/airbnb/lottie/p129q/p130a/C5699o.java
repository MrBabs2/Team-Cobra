package com.airbnb.lottie.p129q.p130a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.C5670j;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p129q.p131b.C5718o;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.p135j.C5757k;
import com.airbnb.lottie.p133s.p136k.C5768a;
import com.airbnb.lottie.p139v.C5828e;
import com.airbnb.lottie.p140w.C5832c;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.a.o */
/* compiled from: RepeaterContent */
public class C5699o implements C5686d, C5695l, C5691i, C5703a.C5704a, C5692j {

    /* renamed from: a */
    private final Matrix f10158a = new Matrix();

    /* renamed from: b */
    private final Path f10159b = new Path();

    /* renamed from: c */
    private final C5656f f10160c;

    /* renamed from: d */
    private final C5768a f10161d;

    /* renamed from: e */
    private final String f10162e;

    /* renamed from: f */
    private final C5703a<Float, Float> f10163f;

    /* renamed from: g */
    private final C5703a<Float, Float> f10164g;

    /* renamed from: h */
    private final C5718o f10165h;

    /* renamed from: i */
    private C5685c f10166i;

    public C5699o(C5656f fVar, C5768a aVar, C5757k kVar) {
        this.f10160c = fVar;
        this.f10161d = aVar;
        this.f10162e = kVar.mo19621b();
        C5703a<Float, Float> a = kVar.mo19620a().mo19562a();
        this.f10163f = a;
        aVar.mo19658a((C5703a<?, ?>) a);
        this.f10163f.mo19509a((C5703a.C5704a) this);
        C5703a<Float, Float> a2 = kVar.mo19622c().mo19562a();
        this.f10164g = a2;
        aVar.mo19658a((C5703a<?, ?>) a2);
        this.f10164g.mo19509a((C5703a.C5704a) this);
        C5718o a3 = kVar.mo19623d().mo19564a();
        this.f10165h = a3;
        a3.mo19523a(aVar);
        this.f10165h.mo19522a((C5703a.C5704a) this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19500a(java.util.ListIterator<com.airbnb.lottie.p129q.p130a.C5684b> r8) {
        /*
            r7 = this;
            com.airbnb.lottie.q.a.c r0 = r7.f10166i
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r8.previous()
            if (r0 == r7) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0017:
            boolean r0 = r8.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r8.previous()
            r5.add(r0)
            r8.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r5)
            com.airbnb.lottie.q.a.c r8 = new com.airbnb.lottie.q.a.c
            com.airbnb.lottie.f r2 = r7.f10160c
            com.airbnb.lottie.s.k.a r3 = r7.f10161d
            r6 = 0
            java.lang.String r4 = "Repeater"
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f10166i = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p129q.p130a.C5699o.mo19500a(java.util.ListIterator):void");
    }

    public String getName() {
        return this.f10162e;
    }

    public Path getPath() {
        Path path = this.f10166i.getPath();
        this.f10159b.reset();
        float floatValue = this.f10163f.mo19513d().floatValue();
        float floatValue2 = this.f10164g.mo19513d().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f10158a.set(this.f10165h.mo19520a(((float) i) + floatValue2));
            this.f10159b.addPath(path, this.f10158a);
        }
        return this.f10159b;
    }

    /* renamed from: a */
    public void mo19495a(List<C5684b> list, List<C5684b> list2) {
        this.f10166i.mo19495a(list, list2);
    }

    /* renamed from: a */
    public void mo19491a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f10163f.mo19513d().floatValue();
        float floatValue2 = this.f10164g.mo19513d().floatValue();
        float floatValue3 = this.f10165h.mo19528d().mo19513d().floatValue() / 100.0f;
        float floatValue4 = this.f10165h.mo19521a().mo19513d().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f10158a.set(matrix);
            float f = (float) i2;
            this.f10158a.preConcat(this.f10165h.mo19520a(f + floatValue2));
            this.f10166i.mo19491a(canvas, this.f10158a, (int) (((float) i) * C5828e.m11375c(floatValue3, floatValue4, f / floatValue)));
        }
    }

    /* renamed from: a */
    public void mo19492a(RectF rectF, Matrix matrix) {
        this.f10166i.mo19492a(rectF, matrix);
    }

    /* renamed from: a */
    public void mo19490a() {
        this.f10160c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo19493a(C5726e eVar, int i, List<C5726e> list, C5726e eVar2) {
        C5828e.m11371a(eVar, i, list, eVar2, this);
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        if (!this.f10165h.mo19524a(t, cVar)) {
            if (t == C5670j.f10034m) {
                this.f10163f.mo19510a(cVar);
            } else if (t == C5670j.f10035n) {
                this.f10164g.mo19510a(cVar);
            }
        }
    }
}
