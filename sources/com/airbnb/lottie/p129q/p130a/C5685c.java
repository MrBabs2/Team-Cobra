package com.airbnb.lottie.p129q.p130a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p129q.p131b.C5718o;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.C5727f;
import com.airbnb.lottie.p133s.p134i.C5741l;
import com.airbnb.lottie.p133s.p135j.C5745b;
import com.airbnb.lottie.p133s.p135j.C5760n;
import com.airbnb.lottie.p133s.p136k.C5768a;
import com.airbnb.lottie.p140w.C5832c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.a.c */
/* compiled from: ContentGroup */
public class C5685c implements C5686d, C5695l, C5703a.C5704a, C5727f {

    /* renamed from: a */
    private final Matrix f10077a;

    /* renamed from: b */
    private final Path f10078b;

    /* renamed from: c */
    private final RectF f10079c;

    /* renamed from: d */
    private final String f10080d;

    /* renamed from: e */
    private final List<C5684b> f10081e;

    /* renamed from: f */
    private final C5656f f10082f;

    /* renamed from: g */
    private List<C5695l> f10083g;

    /* renamed from: h */
    private C5718o f10084h;

    public C5685c(C5656f fVar, C5768a aVar, C5760n nVar) {
        this(fVar, aVar, nVar.mo19635b(), m10892a(fVar, aVar, nVar.mo19634a()), m10891a(nVar.mo19634a()));
    }

    /* renamed from: a */
    private static List<C5684b> m10892a(C5656f fVar, C5768a aVar, List<C5745b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            C5684b a = list.get(i).mo19563a(fVar, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C5695l> mo19497b() {
        if (this.f10083g == null) {
            this.f10083g = new ArrayList();
            for (int i = 0; i < this.f10081e.size(); i++) {
                C5684b bVar = this.f10081e.get(i);
                if (bVar instanceof C5695l) {
                    this.f10083g.add((C5695l) bVar);
                }
            }
        }
        return this.f10083g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Matrix mo19498c() {
        C5718o oVar = this.f10084h;
        if (oVar != null) {
            return oVar.mo19525b();
        }
        this.f10077a.reset();
        return this.f10077a;
    }

    public String getName() {
        return this.f10080d;
    }

    public Path getPath() {
        this.f10077a.reset();
        C5718o oVar = this.f10084h;
        if (oVar != null) {
            this.f10077a.set(oVar.mo19525b());
        }
        this.f10078b.reset();
        for (int size = this.f10081e.size() - 1; size >= 0; size--) {
            C5684b bVar = this.f10081e.get(size);
            if (bVar instanceof C5695l) {
                this.f10078b.addPath(((C5695l) bVar).getPath(), this.f10077a);
            }
        }
        return this.f10078b;
    }

    C5685c(C5656f fVar, C5768a aVar, String str, List<C5684b> list, C5741l lVar) {
        this.f10077a = new Matrix();
        this.f10078b = new Path();
        this.f10079c = new RectF();
        this.f10080d = str;
        this.f10082f = fVar;
        this.f10081e = list;
        if (lVar != null) {
            C5718o a = lVar.mo19564a();
            this.f10084h = a;
            a.mo19523a(aVar);
            this.f10084h.mo19522a((C5703a.C5704a) this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            C5684b bVar = list.get(size);
            if (bVar instanceof C5691i) {
                arrayList.add((C5691i) bVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((C5691i) arrayList.get(size2)).mo19500a(list.listIterator(list.size()));
        }
    }

    /* renamed from: a */
    static C5741l m10891a(List<C5745b> list) {
        for (int i = 0; i < list.size(); i++) {
            C5745b bVar = list.get(i);
            if (bVar instanceof C5741l) {
                return (C5741l) bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo19490a() {
        this.f10082f.invalidateSelf();
    }

    /* renamed from: a */
    public void mo19495a(List<C5684b> list, List<C5684b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f10081e.size());
        arrayList.addAll(list);
        for (int size = this.f10081e.size() - 1; size >= 0; size--) {
            C5684b bVar = this.f10081e.get(size);
            bVar.mo19495a(arrayList, this.f10081e.subList(0, size));
            arrayList.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo19491a(Canvas canvas, Matrix matrix, int i) {
        this.f10077a.set(matrix);
        C5718o oVar = this.f10084h;
        if (oVar != null) {
            this.f10077a.preConcat(oVar.mo19525b());
            i = (int) ((((((float) this.f10084h.mo19527c().mo19513d().intValue()) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
        }
        for (int size = this.f10081e.size() - 1; size >= 0; size--) {
            C5684b bVar = this.f10081e.get(size);
            if (bVar instanceof C5686d) {
                ((C5686d) bVar).mo19491a(canvas, this.f10077a, i);
            }
        }
    }

    /* renamed from: a */
    public void mo19492a(RectF rectF, Matrix matrix) {
        this.f10077a.set(matrix);
        C5718o oVar = this.f10084h;
        if (oVar != null) {
            this.f10077a.preConcat(oVar.mo19525b());
        }
        this.f10079c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f10081e.size() - 1; size >= 0; size--) {
            C5684b bVar = this.f10081e.get(size);
            if (bVar instanceof C5686d) {
                ((C5686d) bVar).mo19492a(this.f10079c, this.f10077a);
                if (rectF.isEmpty()) {
                    rectF.set(this.f10079c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f10079c.left), Math.min(rectF.top, this.f10079c.top), Math.max(rectF.right, this.f10079c.right), Math.max(rectF.bottom, this.f10079c.bottom));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19493a(C5726e eVar, int i, List<C5726e> list, C5726e eVar2) {
        if (eVar.mo19553c(getName(), i)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo19549a(getName());
                if (eVar.mo19551a(getName(), i)) {
                    list.add(eVar2.mo19548a((C5727f) this));
                }
            }
            if (eVar.mo19554d(getName(), i)) {
                int b = i + eVar.mo19552b(getName(), i);
                for (int i2 = 0; i2 < this.f10081e.size(); i2++) {
                    C5684b bVar = this.f10081e.get(i2);
                    if (bVar instanceof C5727f) {
                        ((C5727f) bVar).mo19493a(eVar, b, list, eVar2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        C5718o oVar = this.f10084h;
        if (oVar != null) {
            oVar.mo19524a(t, cVar);
        }
    }
}
