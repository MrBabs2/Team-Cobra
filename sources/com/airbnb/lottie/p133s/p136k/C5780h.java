package com.airbnb.lottie.p133s.p136k;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.C5670j;
import com.airbnb.lottie.C5680p;
import com.airbnb.lottie.p129q.p130a.C5685c;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p129q.p131b.C5717n;
import com.airbnb.lottie.p133s.C5723b;
import com.airbnb.lottie.p133s.C5724c;
import com.airbnb.lottie.p133s.C5725d;
import com.airbnb.lottie.p133s.p134i.C5730a;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p134i.C5740k;
import com.airbnb.lottie.p133s.p135j.C5760n;
import com.airbnb.lottie.p139v.C5829f;
import com.airbnb.lottie.p140w.C5832c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.s.k.h */
/* compiled from: TextLayer */
public class C5780h extends C5768a {

    /* renamed from: A */
    private final Paint f10446A = new C5782b(this, 1);

    /* renamed from: B */
    private final Map<C5725d, List<C5685c>> f10447B = new HashMap();

    /* renamed from: C */
    private final C5717n f10448C;

    /* renamed from: D */
    private final C5656f f10449D;

    /* renamed from: E */
    private final C5648d f10450E;

    /* renamed from: F */
    private C5703a<Integer, Integer> f10451F;

    /* renamed from: G */
    private C5703a<Integer, Integer> f10452G;

    /* renamed from: H */
    private C5703a<Float, Float> f10453H;

    /* renamed from: I */
    private C5703a<Float, Float> f10454I;

    /* renamed from: w */
    private final char[] f10455w = new char[1];

    /* renamed from: x */
    private final RectF f10456x = new RectF();

    /* renamed from: y */
    private final Matrix f10457y = new Matrix();

    /* renamed from: z */
    private final Paint f10458z = new C5781a(this, 1);

    /* renamed from: com.airbnb.lottie.s.k.h$a */
    /* compiled from: TextLayer */
    class C5781a extends Paint {
        C5781a(C5780h hVar, int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: com.airbnb.lottie.s.k.h$b */
    /* compiled from: TextLayer */
    class C5782b extends Paint {
        C5782b(C5780h hVar, int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    C5780h(C5656f fVar, C5774d dVar) {
        super(fVar, dVar);
        C5731b bVar;
        C5731b bVar2;
        C5730a aVar;
        C5730a aVar2;
        this.f10449D = fVar;
        this.f10450E = dVar.mo19666a();
        C5717n a = dVar.mo19683q().mo19562a();
        this.f10448C = a;
        a.mo19509a((C5703a.C5704a) this);
        mo19658a((C5703a<?, ?>) this.f10448C);
        C5740k r = dVar.mo19684r();
        if (!(r == null || (aVar2 = r.f10254a) == null)) {
            C5703a<Integer, Integer> a2 = aVar2.mo19562a();
            this.f10451F = a2;
            a2.mo19509a((C5703a.C5704a) this);
            mo19658a((C5703a<?, ?>) this.f10451F);
        }
        if (!(r == null || (aVar = r.f10255b) == null)) {
            C5703a<Integer, Integer> a3 = aVar.mo19562a();
            this.f10452G = a3;
            a3.mo19509a((C5703a.C5704a) this);
            mo19658a((C5703a<?, ?>) this.f10452G);
        }
        if (!(r == null || (bVar2 = r.f10256c) == null)) {
            C5703a<Float, Float> a4 = bVar2.mo19562a();
            this.f10453H = a4;
            a4.mo19509a((C5703a.C5704a) this);
            mo19658a((C5703a<?, ?>) this.f10453H);
        }
        if (r != null && (bVar = r.f10257d) != null) {
            C5703a<Float, Float> a5 = bVar.mo19562a();
            this.f10454I = a5;
            a5.mo19509a((C5703a.C5704a) this);
            mo19658a((C5703a<?, ?>) this.f10454I);
        }
    }

    /* renamed from: a */
    private void m11240a(C5723b bVar, Matrix matrix, C5724c cVar, Canvas canvas) {
        float f = ((float) bVar.f10228c) / 100.0f;
        float a = C5829f.m11377a(matrix);
        String str = bVar.f10226a;
        for (int i = 0; i < str.length(); i++) {
            C5725d a2 = this.f10450E.mo19395b().mo17043a(C5725d.m11035a(str.charAt(i), cVar.mo19542a(), cVar.mo19544c()));
            if (a2 != null) {
                m11242a(a2, matrix, f, bVar, canvas);
                float b = ((float) a2.mo19546b()) * f * C5829f.m11376a() * a;
                float f2 = ((float) bVar.f10230e) / 10.0f;
                C5703a<Float, Float> aVar = this.f10454I;
                if (aVar != null) {
                    f2 += aVar.mo19513d().floatValue();
                }
                canvas.translate(b + (f2 * a), 0.0f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19661b(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.f10449D.mo19465t()) {
            canvas.setMatrix(matrix);
        }
        C5723b bVar = (C5723b) this.f10448C.mo19513d();
        C5724c cVar = this.f10450E.mo19399f().get(bVar.f10227b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        C5703a<Integer, Integer> aVar = this.f10451F;
        if (aVar != null) {
            this.f10458z.setColor(aVar.mo19513d().intValue());
        } else {
            this.f10458z.setColor(bVar.f10233h);
        }
        C5703a<Integer, Integer> aVar2 = this.f10452G;
        if (aVar2 != null) {
            this.f10446A.setColor(aVar2.mo19513d().intValue());
        } else {
            this.f10446A.setColor(bVar.f10234i);
        }
        int intValue = (this.f10390u.mo19527c().mo19513d().intValue() * 255) / 100;
        this.f10458z.setAlpha(intValue);
        this.f10446A.setAlpha(intValue);
        C5703a<Float, Float> aVar3 = this.f10453H;
        if (aVar3 != null) {
            this.f10446A.setStrokeWidth(aVar3.mo19513d().floatValue());
        } else {
            float a = C5829f.m11377a(matrix);
            Paint paint = this.f10446A;
            double d = bVar.f10235j;
            double a2 = (double) C5829f.m11376a();
            Double.isNaN(a2);
            double d2 = d * a2;
            double d3 = (double) a;
            Double.isNaN(d3);
            paint.setStrokeWidth((float) (d2 * d3));
        }
        if (this.f10449D.mo19465t()) {
            m11240a(bVar, matrix, cVar, canvas);
        } else {
            m11241a(bVar, cVar, matrix, canvas);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private void m11241a(C5723b bVar, C5724c cVar, Matrix matrix, Canvas canvas) {
        float a = C5829f.m11377a(matrix);
        Typeface a2 = this.f10449D.mo19413a(cVar.mo19542a(), cVar.mo19544c());
        if (a2 != null) {
            String str = bVar.f10226a;
            C5680p p = this.f10449D.mo19456p();
            if (p == null) {
                this.f10458z.setTypeface(a2);
                Paint paint = this.f10458z;
                double d = bVar.f10228c;
                double a3 = (double) C5829f.m11376a();
                Double.isNaN(a3);
                paint.setTextSize((float) (d * a3));
                this.f10446A.setTypeface(this.f10458z.getTypeface());
                this.f10446A.setTextSize(this.f10458z.getTextSize());
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    m11238a(charAt, bVar, canvas);
                    char[] cArr = this.f10455w;
                    cArr[0] = charAt;
                    float measureText = this.f10458z.measureText(cArr, 0, 1);
                    float f = ((float) bVar.f10230e) / 10.0f;
                    C5703a<Float, Float> aVar = this.f10454I;
                    if (aVar != null) {
                        f += aVar.mo19513d().floatValue();
                    }
                    canvas.translate(measureText + (f * a), 0.0f);
                }
                return;
            }
            p.mo19489a(str);
            throw null;
        }
    }

    /* renamed from: a */
    private void m11242a(C5725d dVar, Matrix matrix, float f, C5723b bVar, Canvas canvas) {
        List<C5685c> a = m11237a(dVar);
        for (int i = 0; i < a.size(); i++) {
            Path path = a.get(i).getPath();
            path.computeBounds(this.f10456x, false);
            this.f10457y.set(matrix);
            this.f10457y.preTranslate(0.0f, ((float) (-bVar.f10232g)) * C5829f.m11376a());
            this.f10457y.preScale(f, f);
            path.transform(this.f10457y);
            if (bVar.f10236k) {
                m11239a(path, this.f10458z, canvas);
                m11239a(path, this.f10446A, canvas);
            } else {
                m11239a(path, this.f10446A, canvas);
                m11239a(path, this.f10458z, canvas);
            }
        }
    }

    /* renamed from: a */
    private void m11239a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: a */
    private void m11238a(char c, C5723b bVar, Canvas canvas) {
        char[] cArr = this.f10455w;
        cArr[0] = c;
        if (bVar.f10236k) {
            m11243a(cArr, this.f10458z, canvas);
            m11243a(this.f10455w, this.f10446A, canvas);
            return;
        }
        m11243a(cArr, this.f10446A, canvas);
        m11243a(this.f10455w, this.f10458z, canvas);
    }

    /* renamed from: a */
    private void m11243a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
            }
        }
    }

    /* renamed from: a */
    private List<C5685c> m11237a(C5725d dVar) {
        if (this.f10447B.containsKey(dVar)) {
            return this.f10447B.get(dVar);
        }
        List<C5760n> a = dVar.mo19545a();
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C5685c(this.f10449D, this, a.get(i)));
        }
        this.f10447B.put(dVar, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        C5703a<Float, Float> aVar;
        C5703a<Float, Float> aVar2;
        C5703a<Integer, Integer> aVar3;
        C5703a<Integer, Integer> aVar4;
        super.mo19494a(t, cVar);
        if (t == C5670j.f10022a && (aVar4 = this.f10451F) != null) {
            aVar4.mo19510a((C5832c<Integer>) cVar);
        } else if (t == C5670j.f10023b && (aVar3 = this.f10452G) != null) {
            aVar3.mo19510a((C5832c<Integer>) cVar);
        } else if (t == C5670j.f10032k && (aVar2 = this.f10453H) != null) {
            aVar2.mo19510a((C5832c<Float>) cVar);
        } else if (t == C5670j.f10033l && (aVar = this.f10454I) != null) {
            aVar.mo19510a((C5832c<Float>) cVar);
        }
    }
}
