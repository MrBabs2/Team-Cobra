package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: androidx.cardview.widget.b */
/* compiled from: CardViewApi21Impl */
class C0308b implements C0312e {
    C0308b() {
    }

    /* renamed from: j */
    private C0313f m1481j(C0311d dVar) {
        return (C0313f) dVar.mo1913c();
    }

    /* renamed from: a */
    public void mo1915a() {
    }

    /* renamed from: a */
    public void mo1919a(C0311d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dVar.mo1910a(new C0313f(colorStateList, f));
        View d = dVar.mo1914d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        mo1924c(dVar, f3);
    }

    /* renamed from: b */
    public float mo1921b(C0311d dVar) {
        return m1481j(dVar).mo1936c();
    }

    /* renamed from: c */
    public void mo1924c(C0311d dVar, float f) {
        m1481j(dVar).mo1933a(f, dVar.mo1912b(), dVar.mo1911a());
        mo1927f(dVar);
    }

    /* renamed from: d */
    public float mo1925d(C0311d dVar) {
        return m1481j(dVar).mo1935b();
    }

    /* renamed from: e */
    public ColorStateList mo1926e(C0311d dVar) {
        return m1481j(dVar).mo1931a();
    }

    /* renamed from: f */
    public void mo1927f(C0311d dVar) {
        if (!dVar.mo1912b()) {
            dVar.mo1909a(0, 0, 0, 0);
            return;
        }
        float d = mo1925d(dVar);
        float b = mo1921b(dVar);
        int ceil = (int) Math.ceil((double) C0314g.m1546a(d, b, dVar.mo1911a()));
        int ceil2 = (int) Math.ceil((double) C0314g.m1549b(d, b, dVar.mo1911a()));
        dVar.mo1909a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: g */
    public float mo1928g(C0311d dVar) {
        return mo1921b(dVar) * 2.0f;
    }

    /* renamed from: h */
    public float mo1929h(C0311d dVar) {
        return mo1921b(dVar) * 2.0f;
    }

    /* renamed from: i */
    public void mo1930i(C0311d dVar) {
        mo1924c(dVar, mo1925d(dVar));
    }

    /* renamed from: b */
    public void mo1922b(C0311d dVar, float f) {
        dVar.mo1914d().setElevation(f);
    }

    /* renamed from: c */
    public void mo1923c(C0311d dVar) {
        mo1924c(dVar, mo1925d(dVar));
    }

    /* renamed from: a */
    public void mo1918a(C0311d dVar, float f) {
        m1481j(dVar).mo1932a(f);
    }

    /* renamed from: a */
    public float mo1917a(C0311d dVar) {
        return dVar.mo1914d().getElevation();
    }

    /* renamed from: a */
    public void mo1920a(C0311d dVar, ColorStateList colorStateList) {
        m1481j(dVar).mo1934a(colorStateList);
    }
}
