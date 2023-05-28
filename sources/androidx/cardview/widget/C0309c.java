package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.C0314g;

/* renamed from: androidx.cardview.widget.c */
/* compiled from: CardViewBaseImpl */
class C0309c implements C0312e {

    /* renamed from: a */
    final RectF f1297a = new RectF();

    /* renamed from: androidx.cardview.widget.c$a */
    /* compiled from: CardViewBaseImpl */
    class C0310a implements C0314g.C0315a {
        C0310a() {
        }

        /* renamed from: a */
        public void mo1916a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0309c.this.f1297a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C0309c.this.f1297a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0309c.this.f1297a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0309c.this.f1297a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0309c.this.f1297a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = rectF2.top;
                canvas.drawRect((rectF2.left + f3) - 1.0f, f5, (rectF2.right - f3) + 1.0f, f5 + f3, paint2);
                float f6 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f3) - 1.0f, f6 - f3, (rectF2.right - f3) + 1.0f, f6, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    C0309c() {
    }

    /* renamed from: j */
    private C0314g m1498j(C0311d dVar) {
        return (C0314g) dVar.mo1913c();
    }

    /* renamed from: a */
    public void mo1915a() {
        C0314g.f1311r = new C0310a();
    }

    /* renamed from: b */
    public float mo1921b(C0311d dVar) {
        return m1498j(dVar).mo1952b();
    }

    /* renamed from: c */
    public void mo1923c(C0311d dVar) {
    }

    /* renamed from: c */
    public void mo1924c(C0311d dVar, float f) {
        m1498j(dVar).mo1953b(f);
        mo1927f(dVar);
    }

    /* renamed from: d */
    public float mo1925d(C0311d dVar) {
        return m1498j(dVar).mo1954c();
    }

    /* renamed from: e */
    public ColorStateList mo1926e(C0311d dVar) {
        return m1498j(dVar).mo1947a();
    }

    /* renamed from: f */
    public void mo1927f(C0311d dVar) {
        Rect rect = new Rect();
        m1498j(dVar).mo1950a(rect);
        dVar.mo1908a((int) Math.ceil((double) mo1929h(dVar)), (int) Math.ceil((double) mo1928g(dVar)));
        dVar.mo1909a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: g */
    public float mo1928g(C0311d dVar) {
        return m1498j(dVar).mo1956d();
    }

    /* renamed from: h */
    public float mo1929h(C0311d dVar) {
        return m1498j(dVar).mo1958e();
    }

    /* renamed from: i */
    public void mo1930i(C0311d dVar) {
        m1498j(dVar).mo1951a(dVar.mo1911a());
        mo1927f(dVar);
    }

    /* renamed from: a */
    public void mo1919a(C0311d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0314g a = m1497a(context, colorStateList, f, f2, f3);
        a.mo1951a(dVar.mo1911a());
        dVar.mo1910a(a);
        mo1927f(dVar);
    }

    /* renamed from: b */
    public void mo1922b(C0311d dVar, float f) {
        m1498j(dVar).mo1955c(f);
    }

    /* renamed from: a */
    private C0314g m1497a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C0314g(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: a */
    public void mo1920a(C0311d dVar, ColorStateList colorStateList) {
        m1498j(dVar).mo1949a(colorStateList);
    }

    /* renamed from: a */
    public void mo1918a(C0311d dVar, float f) {
        m1498j(dVar).mo1948a(f);
        mo1927f(dVar);
    }

    /* renamed from: a */
    public float mo1917a(C0311d dVar) {
        return m1498j(dVar).mo1959f();
    }
}
