package com.airbnb.lottie.p133s.p136k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.p129q.p130a.C5684b;
import com.airbnb.lottie.p129q.p130a.C5685c;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.p135j.C5760n;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.s.k.f */
/* compiled from: ShapeLayer */
public class C5778f extends C5768a {

    /* renamed from: w */
    private final C5685c f10439w;

    C5778f(C5656f fVar, C5774d dVar) {
        super(fVar, dVar);
        C5685c cVar = new C5685c(fVar, this, new C5760n("__container", dVar.mo19678l()));
        this.f10439w = cVar;
        cVar.mo19495a((List<C5684b>) Collections.emptyList(), (List<C5684b>) Collections.emptyList());
    }

    /* renamed from: a */
    public void mo19492a(RectF rectF, Matrix matrix) {
        super.mo19492a(rectF, matrix);
        this.f10439w.mo19492a(rectF, this.f10382m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19661b(Canvas canvas, Matrix matrix, int i) {
        this.f10439w.mo19491a(canvas, matrix, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19662b(C5726e eVar, int i, List<C5726e> list, C5726e eVar2) {
        this.f10439w.mo19493a(eVar, i, list, eVar2);
    }
}
