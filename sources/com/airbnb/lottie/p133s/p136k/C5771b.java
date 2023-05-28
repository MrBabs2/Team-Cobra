package com.airbnb.lottie.p133s.p136k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C5647c;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.C5670j;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p129q.p131b.C5719p;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p140w.C5832c;
import java.util.ArrayList;
import java.util.List;
import p050l.p066e.C4873d;

/* renamed from: com.airbnb.lottie.s.k.b */
/* compiled from: CompositionLayer */
public class C5771b extends C5768a {

    /* renamed from: w */
    private C5703a<Float, Float> f10396w;

    /* renamed from: x */
    private final List<C5768a> f10397x = new ArrayList();

    /* renamed from: y */
    private final RectF f10398y = new RectF();

    /* renamed from: z */
    private final RectF f10399z = new RectF();

    /* renamed from: com.airbnb.lottie.s.k.b$a */
    /* compiled from: CompositionLayer */
    static /* synthetic */ class C5772a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10400a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.s.k.d$b[] r0 = com.airbnb.lottie.p133s.p136k.C5774d.C5776b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10400a = r0
                com.airbnb.lottie.s.k.d$b r1 = com.airbnb.lottie.p133s.p136k.C5774d.C5776b.Add     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10400a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.s.k.d$b r1 = com.airbnb.lottie.p133s.p136k.C5774d.C5776b.Invert     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p133s.p136k.C5771b.C5772a.<clinit>():void");
        }
    }

    public C5771b(C5656f fVar, C5774d dVar, List<C5774d> list, C5648d dVar2) {
        super(fVar, dVar);
        int i;
        C5768a aVar;
        C5731b s = dVar.mo19685s();
        if (s != null) {
            C5703a<Float, Float> a = s.mo19562a();
            this.f10396w = a;
            mo19658a((C5703a<?, ?>) a);
            this.f10396w.mo19509a((C5703a.C5704a) this);
        } else {
            this.f10396w = null;
        }
        C4873d dVar3 = new C4873d(dVar2.mo19402i().size());
        int size = list.size() - 1;
        C5768a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C5774d dVar4 = list.get(size);
            C5768a a2 = C5768a.m11169a(dVar4, fVar, dVar2);
            if (a2 != null) {
                dVar3.mo16945c(a2.mo19660b().mo19668b(), a2);
                if (aVar2 != null) {
                    aVar2.mo19659a(a2);
                    aVar2 = null;
                } else {
                    this.f10397x.add(0, a2);
                    int i2 = C5772a.f10400a[dVar4.mo19672f().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = a2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < dVar3.mo16942c(); i++) {
            C5768a aVar3 = (C5768a) dVar3.mo16936a(dVar3.mo16935a(i));
            if (!(aVar3 == null || (aVar = (C5768a) dVar3.mo16936a(aVar3.mo19660b().mo19674h())) == null)) {
                aVar3.mo19663b(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo19492a(RectF rectF, Matrix matrix) {
        super.mo19492a(rectF, matrix);
        this.f10398y.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f10397x.size() - 1; size >= 0; size--) {
            this.f10397x.get(size).mo19492a(this.f10398y, this.f10382m);
            if (rectF.isEmpty()) {
                rectF.set(this.f10398y);
            } else {
                rectF.set(Math.min(rectF.left, this.f10398y.left), Math.min(rectF.top, this.f10398y.top), Math.max(rectF.right, this.f10398y.right), Math.max(rectF.bottom, this.f10398y.bottom));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19661b(Canvas canvas, Matrix matrix, int i) {
        C5647c.m10753a("CompositionLayer#draw");
        canvas.save();
        this.f10399z.set(0.0f, 0.0f, (float) this.f10384o.mo19676j(), (float) this.f10384o.mo19675i());
        matrix.mapRect(this.f10399z);
        for (int size = this.f10397x.size() - 1; size >= 0; size--) {
            if (!this.f10399z.isEmpty() ? canvas.clipRect(this.f10399z) : true) {
                this.f10397x.get(size).mo19491a(canvas, matrix, i);
            }
        }
        canvas.restore();
        C5647c.m10755c("CompositionLayer#draw");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19662b(C5726e eVar, int i, List<C5726e> list, C5726e eVar2) {
        for (int i2 = 0; i2 < this.f10397x.size(); i2++) {
            this.f10397x.get(i2).mo19493a(eVar, i, list, eVar2);
        }
    }

    /* renamed from: a */
    public void mo19657a(float f) {
        super.mo19657a(f);
        if (this.f10396w != null) {
            f = ((float) ((long) (this.f10396w.mo19513d().floatValue() * 1000.0f))) / this.f10383n.mo19436e().mo19396c();
        }
        if (this.f10384o.mo19686t() != 0.0f) {
            f /= this.f10384o.mo19686t();
        }
        float p = f - this.f10384o.mo19682p();
        for (int size = this.f10397x.size() - 1; size >= 0; size--) {
            this.f10397x.get(size).mo19657a(p);
        }
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        super.mo19494a(t, cVar);
        if (t != C5670j.f10044w) {
            return;
        }
        if (cVar == null) {
            this.f10396w = null;
            return;
        }
        C5719p pVar = new C5719p(cVar);
        this.f10396w = pVar;
        mo19658a((C5703a<?, ?>) pVar);
    }
}
