package p050l.p067f.p071b.p072k.p073m;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p050l.p067f.p071b.C4889d;
import p050l.p067f.p071b.p072k.C4902b;
import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.C4910f;

/* renamed from: l.f.b.k.m.o */
/* compiled from: WidgetGroup */
public class C4937o {

    /* renamed from: f */
    static int f8722f;

    /* renamed from: a */
    ArrayList<C4907e> f8723a = new ArrayList<>();

    /* renamed from: b */
    int f8724b = -1;

    /* renamed from: c */
    int f8725c = 0;

    /* renamed from: d */
    ArrayList<C4938a> f8726d = null;

    /* renamed from: e */
    private int f8727e = -1;

    /* renamed from: l.f.b.k.m.o$a */
    /* compiled from: WidgetGroup */
    class C4938a {
        public C4938a(C4937o oVar, C4907e eVar, C4889d dVar, int i) {
            new WeakReference(eVar);
            dVar.mo17113b((Object) eVar.f8564F);
            dVar.mo17113b((Object) eVar.f8565G);
            dVar.mo17113b((Object) eVar.f8566H);
            dVar.mo17113b((Object) eVar.f8567I);
            dVar.mo17113b((Object) eVar.f8568J);
        }
    }

    public C4937o(int i) {
        int i2 = f8722f;
        f8722f = i2 + 1;
        this.f8724b = i2;
        this.f8725c = i;
    }

    /* renamed from: c */
    private String m8670c() {
        int i = this.f8725c;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        return i == 2 ? "Both" : "Unknown";
    }

    /* renamed from: a */
    public int mo17341a() {
        return this.f8724b;
    }

    /* renamed from: a */
    public void mo17346a(boolean z) {
    }

    /* renamed from: b */
    public int mo17348b() {
        return this.f8725c;
    }

    public String toString() {
        String str = m8670c() + " [" + this.f8724b + "] <";
        Iterator<C4907e> it = this.f8723a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().mo17238h();
        }
        return str + " >";
    }

    /* renamed from: a */
    public boolean mo17347a(C4907e eVar) {
        if (this.f8723a.contains(eVar)) {
            return false;
        }
        this.f8723a.add(eVar);
        return true;
    }

    /* renamed from: a */
    public void mo17344a(int i, C4937o oVar) {
        Iterator<C4907e> it = this.f8723a.iterator();
        while (it.hasNext()) {
            C4907e next = it.next();
            oVar.mo17347a(next);
            if (i == 0) {
                next.f8610m0 = oVar.mo17341a();
            } else {
                next.f8612n0 = oVar.mo17341a();
            }
        }
        this.f8727e = oVar.f8724b;
    }

    /* renamed from: a */
    public int mo17342a(C4889d dVar, int i) {
        if (this.f8723a.size() == 0) {
            return 0;
        }
        return m8669a(dVar, this.f8723a, i);
    }

    /* renamed from: a */
    private int m8669a(C4889d dVar, ArrayList<C4907e> arrayList, int i) {
        int b;
        int b2;
        C4910f fVar = (C4910f) arrayList.get(0).mo17266v();
        dVar.mo17121f();
        fVar.mo17151a(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo17151a(dVar, false);
        }
        if (i == 0 && fVar.f8650y0 > 0) {
            C4902b.m8398a(fVar, dVar, arrayList, 0);
        }
        if (i == 1 && fVar.f8651z0 > 0) {
            C4902b.m8398a(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.mo17120e();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f8726d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f8726d.add(new C4938a(this, arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            b = dVar.mo17113b((Object) fVar.f8564F);
            b2 = dVar.mo17113b((Object) fVar.f8566H);
            dVar.mo17121f();
        } else {
            b = dVar.mo17113b((Object) fVar.f8565G);
            b2 = dVar.mo17113b((Object) fVar.f8567I);
            dVar.mo17121f();
        }
        return b2 - b;
    }

    /* renamed from: a */
    public void mo17343a(int i) {
        this.f8725c = i;
    }

    /* renamed from: a */
    public void mo17345a(ArrayList<C4937o> arrayList) {
        int size = this.f8723a.size();
        if (this.f8727e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C4937o oVar = arrayList.get(i);
                if (this.f8727e == oVar.f8724b) {
                    mo17344a(this.f8725c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }
}
